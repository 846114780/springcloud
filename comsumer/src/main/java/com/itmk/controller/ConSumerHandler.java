package com.itmk.controller;

import com.itmk.entity.EduSubject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("consumer")
public class ConSumerHandler {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("getEduSubjectList")
    public List<EduSubject> getEduSubjectList(){

        List list = restTemplate.getForObject("http://localhost:8010/edu-subject/getEduSubjectList", List.class);

        return list;
    }
    @GetMapping("getEduSubject/{id}")
    public EduSubject getEduSubject(@PathVariable long id){
        EduSubject eduSubject = restTemplate.getForObject("http://localhost:8010/edu-subject/getEduSubject/{id}", EduSubject.class, id);
        return eduSubject;

    }
}
