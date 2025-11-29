package com.mvs.service;
import com.mvs.data.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
//import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

public interface ServiceInterface
{
    public Tasks createTask(Tasks task);

    public Tasks getTaskbyId(Long id);

    public List<Tasks> getAllTasks();

    public Tasks UpdateTask(Long id);

    public boolean deleteTask(Long id);

}
