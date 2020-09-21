package com.itmk.feign;


import com.itmk.entity.EduSubject;
import com.itmk.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("edu-subject/getEduSubjectList")
    public List<EduSubject> getEduSubjectList();


    @GetMapping("edu-subject/getEduSubject/{id}")
    public EduSubject getEduSubject(@PathVariable("id") long id);

    @GetMapping("edu-subject/index")
    public String index();
}
