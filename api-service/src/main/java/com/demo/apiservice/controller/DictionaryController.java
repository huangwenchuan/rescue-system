package com.demo.apiservice.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.demo.apiservice.pojo.entity.Dictionary;
import com.demo.apiservice.service.DictionaryService;
import com.demo.apiservice.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "静态数据接口", description = "微信小程序使用的静态数据")
@CrossOrigin
@RestController
@RequestMapping("/api/dictionary")
public class DictionaryController {
    private DictionaryService dictionaryService;

    @Autowired
    public void setDictionaryService(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @Operation(summary = "静态数据分页查询", description = "静态数据分页查询")
    @PostMapping("/page/{pageNo}/{pageSize}")
    public R<IPage<Dictionary>> getDictionaryPage(@RequestBody Dictionary dictionary, @PathVariable("pageNo") int pageNo, @PathVariable("pageSize") int pageSize) {
        IPage<Dictionary> dictionaryList = dictionaryService.getDictionaryPage(dictionary, pageNo, pageSize);
        return R.success(dictionaryList);
    }

    @Operation(summary = "(新增/编辑)静态数据", description = "新增静态数据、编辑静态数据")
    @PostMapping("/save")
    public R<Boolean> saveDictionary(@RequestBody Dictionary dictionary) {
        dictionary.setLastModifierUserId(dictionary.getCreatorUserId());
        boolean result = dictionaryService.saveOrUpdate(dictionary);
        return result ? R.success(result) : R.error("保存失败请重试!");
    }

    @Operation(summary = "删除静态数据", description = "根据静态数据Id逻辑删除静态数据")
    @DeleteMapping("/remove/{id}")
    public R<Boolean> removeDictionary(@PathVariable("id") Long id) {
        //Dictionary dictionary = dictionaryService.getById(id);
        //dictionary.setIsRemove(1);
        //dictionary.setDeletionTime(new Date());
        //boolean result = dictionaryService.updateById(dictionary) && dictionaryService.removeById(dictionary);
        boolean result = dictionaryService.removeById(id);
        return result ? R.success(result) : R.error("删除失败请重试!");
    }
}
