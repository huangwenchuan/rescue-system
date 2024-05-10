package com.demo.apiservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.apiservice.pojo.dto.InfoDto;
import com.demo.apiservice.pojo.entity.Info;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 * @description 针对表【animal(动物详情表
 * 用来发布送养动物信息)】的数据库操作Mapper
 * @createDate 2024-03-15 09:56:21
 * @Entity com.demo.apiservice.pojo.entity.Animal
 */
@Mapper
public interface InfoMapper extends BaseMapper<Info> {
    IPage<Info> selectAnimalPage(Page<Info> page, InfoDto dto);
}