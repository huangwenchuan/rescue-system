package com.demo.apiservice.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.apiservice.pojo.bo.InfoBO;
import com.demo.apiservice.pojo.dto.InfoDto;
import com.demo.apiservice.pojo.entity.Info;

import java.text.ParseException;

/**
 * @author Administrator
 * @description 针对表【animal(动物详情表
 * 用来发布送养动物信息)】的数据库操作Service
 * @createDate 2024-03-15 09:56:21
 */
public interface InfoService extends IService<Info> {
    boolean saveInfo(InfoDto infoDto) throws ParseException;

    IPage<InfoBO> getInfoPage(InfoDto queryDto, int pageNo, int pageSize);
}
