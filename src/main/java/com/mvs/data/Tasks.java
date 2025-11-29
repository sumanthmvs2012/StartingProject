package com.mvs.data;

import java.util.concurrent.atomic.AtomicLong;

public class Tasks
{
    //private AtomicLong Id = new AtomicLong(0);

    public Tasks()
    {
    }

    public Tasks(Long id, String title, String desc) {
        Id = id;
        this.title = title;
        this.desc = desc;
    }

    public void setId(Long id)
    {
        Id = id;
    }

    private Long Id;
   private String title;
   private boolean isCompleted = false;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String desc;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public boolean isCompleted()
    {
        return isCompleted;
    }

    public void setCompleted(boolean completed)
    {
        isCompleted = completed;
    }

}
