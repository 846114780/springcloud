package com.itmk.feign.impl;

import com.itmk.entity.EduSubject;
import com.itmk.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public List<EduSubject> getEduSubjectList() {
        return null;
    }

    @Override
    public EduSubject getEduSubject(long id) {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
