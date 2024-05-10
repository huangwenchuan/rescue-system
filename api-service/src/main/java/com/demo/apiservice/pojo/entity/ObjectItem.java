package com.demo.apiservice.pojo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ObjectItem {

    private String objectName;

    private String size;

    @Override
    public String toString() {
        return "ObjectItem{" +
                "名称='" + objectName + '\'' +
                ", 大小='" + size + '\'' +
                '}';
    }
}

