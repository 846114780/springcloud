package com.itmk.controller;

import com.itmk.entity.EduSubject;
import com.itmk.feign.FeignProviderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("feign")
public class FeignHandler {

    @Resource
    private FeignProviderClient feignProviderClient;

    @GetMapping("getEduSubjectList")
    public List<EduSubject> getEduSubjectList(){
        return feignProviderClient.getEduSubjectList();
    }

    @GetMapping("getEduSubject/{id}")
    public EduSubject getEduSubject(@PathVariable("id") long id){
        return feignProviderClient.getEduSubject(id);
    }

    @GetMapping("index")
    public String index(){
        return feignProviderClient.index();
    }


}
