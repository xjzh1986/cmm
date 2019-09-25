package com.cn.cmm.service;

import com.cn.cmm.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("cmm-dept")
public interface IDeptService {

    @RequestMapping("/selectById")
    public Dept selectById(Dept deptReq);
}
