package com.demo.apiservice.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FileUtil {
    private MinioUtil minioUtil;

    @Autowired
    public void setMinioUtil(MinioUtil minioUtil) {
        this.minioUtil = minioUtil;
    }

    /**
     * 通过数据库存在Minio中的以","号分割的文件路径获取文件预览地址
     *
     * @param mediaNames
     * @return
     */
    public List<String> handleMedia(String mediaNames) {
        String[] mediaArray = mediaNames.split(",");
        List<String> mediaUrls = new ArrayList<>();
        for (String mediaName : mediaArray) {
            if (!mediaName.equals("")) {
                if (mediaName.startsWith("https://")) {
                    mediaUrls.add(mediaName);
                } else {
                    String previewUrl = minioUtil.getPreviewFileUrl(mediaName);
                    mediaUrls.add(previewUrl);
                }
            }
        }
        return mediaUrls;
    }

    public Boolean removeFile(String mediaNames) {
        String[] mediaArray = mediaNames.split(",");
        Boolean result = true;
        for (String mediaName : mediaArray) {
            if (!mediaName.equals("")) {
                if (mediaName.startsWith("https://")) {
                    continue;
                } else {
                    result = minioUtil.removeFile(mediaName);
                    if (result == false) return false;
                }
            }
        }
        return result;
    }
}
