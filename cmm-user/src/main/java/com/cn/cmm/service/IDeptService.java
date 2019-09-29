package com.cn.cmm.service;

import com.cn.cmm.entity.BaseResult;
import com.cn.cmm.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "cmm-dept",fallback = IDeptHystrix.class)
public interface IDeptService {

    @RequestMapping("/selectById")
    public BaseResult selectById(Dept deptReq);

    @RequestMapping("/insert")
    public BaseResult insert(Dept deptReq);
}
