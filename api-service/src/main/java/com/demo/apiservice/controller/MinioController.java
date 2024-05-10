package com.demo.apiservice.controller;

import com.demo.apiservice.utils.MinioUtil;
import com.demo.apiservice.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Tag(name = "Minio接口", description = "操作文件接口")
@CrossOrigin
@RestController
@RequestMapping("/api/minio")
public class MinioController {


    private MinioUtil minioUtil;
    /**
     * 默认桶名
     */
    @Value("${minio.bucketName}")
    private String bucketName;

    @Autowired
    public void setMinioUtil(MinioUtil minioUtil) {
        this.minioUtil = minioUtil;
    }

    /**
     * 创建桶
     *
     * @param bucketName
     * @return Boolean
     */
    @Operation(summary = "创建桶", description = "Minio根据传入名称创建桶")
    @GetMapping("/createBucket/{bucketName}")
    public R<Boolean> createBucket(@PathVariable String bucketName) {
        if (minioUtil.existBucket(bucketName)) return R.error("已存在");
        return minioUtil.makeBucket(bucketName) ? R.success(true) : R.error("创建失败");
    }

    /**
     * 删除桶
     *
     * @param bucketName
     * @return Boolean
     */
    @Operation(summary = "删除桶", description = "Minio根据传入名称删除桶")
    @GetMapping("/removeBucketByName/{bucketName}")
    public R<Boolean> removeBucketByName(@PathVariable String bucketName) {
        if (!minioUtil.existBucket(bucketName)) return R.error("未查到该桶");
        return minioUtil.removeBucket(bucketName) ? R.success(true) : R.error("删除失败");
    }

    /**
     * 单文件上传
     *
     * @param file
     * @return String 文件路径
     */
    @Operation(summary = "单文件上传", description = "Minio根据文件路径上传一个文件")
    @PostMapping("/uploadSingleFile")
    public R<String> uploadSingleFile(@RequestParam("file") MultipartFile file) {
        return (bucketName.equals("") || minioUtil.existBucket(bucketName)) ? R.success(minioUtil.upload(file, bucketName)) : R.error("该桶不存在");
    }

    /**
     * 批量文件上传
     *
     * @param files
     * @return Map 文件文件路径集合
     */
    @Operation(summary = "多文件上传", description = "Minio根据文件路径集合上传多个文件")
    @PostMapping("/uploadClusterFile")
    public R<List<String>> uploadClusterFile(@RequestParam("files") MultipartFile[] files) {
        return (bucketName.equals("") || minioUtil.existBucket(bucketName)) ? R.success(minioUtil.filePathsUpload(files, bucketName)) : R.error("该桶不存在");
    }

    /**
     * 单文件下载（因为存在多级目录，通过文件路径）
     *
     * @param filePath
     * @param response
     * @param request
     * @return Boolean
     */
    @Operation(summary = "单文件下载", description = "Minio根据文件路径单文件下载(因为存在多级目录，通过文件路径)")
    @PostMapping("/downloadSingleFileByFilePath")
    public void downloadSingleFileByFilePath(@RequestParam String filePath, HttpServletResponse response, HttpServletRequest request) {
        minioUtil.download(response, request, filePath);
    }

    /**
     * 批量文件下载（因为存在多级目录，通过文件路径）
     *
     * @param filePaths
     * @param response  可为空
     * @param response
     * @param request
     */
    @Operation(summary = "批量文件下载", description = "Minio根据文件路径集合批量文件下载(因为存在多级目录，通过文件路径)")
    @PostMapping("/downloadClusterFileByFilePaths")
    public void downloadClusterFileByFilePaths(@RequestParam List<String> filePaths, @RequestParam String zipName, HttpServletResponse response, HttpServletRequest request) {
        minioUtil.download(response, request, filePaths, zipName);
    }

    /**
     * 单文件删除（多级目录，使用文件路径）
     *
     * @param filePath
     * @return Boolean
     */
    @Operation(summary = "单文件删除", description = "Minio根据文件路径单文件删除(因为存在多级目录，通过文件路径)")
    @DeleteMapping("/removeSingleFileByFilePath")
    public R<Boolean> removeSingleFileByFilePath(@RequestParam String filePath) {
        System.out.println(filePath);
        return minioUtil.removeFile(filePath) ? R.success(true) : R.error("删除失败");
    }

    /**
     * 文件批量删除（多级目录，使用文件路径）
     *
     * @param filePaths
     * @return Map
     */
    @Operation(summary = "文件批量删除", description = "Minio根据文件路径集合文件批量删除(因为存在多级目录，通过文件路径)")
    @DeleteMapping("/removeClusterFileByFilePaths")
    public R<Map<String, String>> removeClusterFileByFilePaths(@RequestParam List<String> filePaths) {
        return R.success(minioUtil.removeFile(filePaths));
    }

    @Operation(summary = "文件预览地址", description = "Minio根据文件名获取浏览器访问地址")
    @GetMapping("getPreviewFileUrl/{fileName}")
    public R<String> getPreviewFileUrl(@PathVariable String fileName) {
        return R.success(minioUtil.getPreviewFileUrl(fileName));
    }
}

