package com.igenox.docker.poc.rest;

import com.igenox.docker.poc.domain.Container;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by alexandru.ionita on 4/16/15.
 */
@Controller
@RequestMapping("/container")
public class Docker
{

    @RequestMapping(method = RequestMethod.GET)
    HttpEntity<Container> getThisContainer()
    {
        Container c = new Container();
        c.setId(1L);
        c.setName("First container");
        return new ResponseEntity<Container>(c, HttpStatus.FOUND);
    }
}
