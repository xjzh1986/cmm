package com.cn.cmm.service;

import com.cn.cmm.constants.SysConstant;
import com.cn.cmm.entity.BaseResult;
import com.cn.cmm.entity.Dept;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/9/25.
 */
@Component
public class IDeptHystrix implements IDeptService {
    @RequestMapping("/selectById")
    public BaseResult selectById(Dept deptReq){
        BaseResult result = new BaseResult(SysConstant.EOORO_505);
        return result;
    }

    @RequestMapping("/insert")
    public BaseResult insert(Dept deptReq){
        BaseResult result = new BaseResult(SysConstant.EOORO_505);
        return result;
    }
}
