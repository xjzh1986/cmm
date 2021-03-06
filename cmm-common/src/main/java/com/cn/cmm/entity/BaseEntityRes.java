package com.cn.cmm.entity;

import java.io.Serializable;

/**
 *
 */
public class BaseEntityRes implements Serializable {
    private String code;
    private String msg;
    private Object data;

    public BaseEntityRes(String code,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseEntityRes(String code,Object data){
        this.code = code;
        this.data = data;
    }
    public BaseEntityRes(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
