package com.igenox.docker.poc.domain;

/**
 * Created by alexandru.ionita on 4/16/15.
 */
public class Container
{
    private Long id;
    private String name;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
