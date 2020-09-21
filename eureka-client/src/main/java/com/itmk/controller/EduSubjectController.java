package com.itmk.controller;


import com.itmk.entity.EduSubject;
import com.itmk.service.EduSubjectService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 课程科目 前端控制器
 * </p>
 *
 * @author wangxu
 * @since 2020-09-21
 */
@RestController
@RequestMapping("/edu-subject")
public class EduSubjectController {

    @Resource
    private EduSubjectService eduSubjectService;

    @Value("${server.port}")
    private String port;

    @GetMapping("index")
    public String index(){
        return "当前端口"+this.port;

    }

    @GetMapping("getEduSubjectList")
    public List<EduSubject> getEduSubjectList(){

        List<EduSubject> list = eduSubjectService.list(null);
        return list;
    }

    @GetMapping("getEduSubject/{id}")
    public EduSubject getEduSubject(@PathVariable long id){
        EduSubject subject = eduSubjectService.getById(id);
        return subject;

    }

}

