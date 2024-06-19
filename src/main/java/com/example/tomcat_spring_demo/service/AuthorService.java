package com.example.tomcat_spring_demo.service;

import com.example.tomcat_spring_demo.controller.request.AuthorRequest;
import com.example.tomcat_spring_demo.service.dto.AuthorDto;

public interface AuthorService {

    String save(AuthorRequest author);

}
