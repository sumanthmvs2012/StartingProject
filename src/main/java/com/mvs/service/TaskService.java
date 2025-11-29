package com.mvs.service;

import com.mvs.data.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService implements ServiceInterface
{
    private AtomicLong idGenerator = new AtomicLong(0);
    private HashMap<Long, Tasks> db = new HashMap<>();

    @Override
    public Tasks createTask(Tasks task) {
        long id = idGenerator.incrementAndGet();
        task.setId(id);
        db.put(id, task);
        return task;
    }

    @Override
    public Tasks getTaskbyId(Long id)
    {
        return db.get(id);
    }

    @Override
    public List<Tasks> getAllTasks()
    {
        return new ArrayList<>(db.values());
    }

    @Override
    public Tasks UpdateTask(Long id)
    {
       Tasks origin = db.get(id);

        if(id == null)
        {
            return null;
        }
        else
        {
            origin.setTitle(origin.getTitle());
            origin.setDesc(origin.getDesc());
            origin.setCompleted(true);

            return origin;
        }
    }


    @Override
    public boolean deleteTask(Long id)
    {
        Tasks tid = db.get(id);

        if(db.containsKey(id))
        {
            db.remove(id);
            return  true;
        }
        else
        {
            return  false;
        }
    }

}
