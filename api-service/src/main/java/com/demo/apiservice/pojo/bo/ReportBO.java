package com.demo.apiservice.pojo.bo;

import com.demo.apiservice.pojo.dto.UserDto;
import com.demo.apiservice.pojo.entity.Report;

public class ReportBO {
    private Report report;
    /**
     * 举报人
     */
    private UserDto reporter;
    /**
     * 被举报人
     */
    private UserDto reported;

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public UserDto getReporter() {
        return reporter;
    }

    public void setReporter(UserDto reporter) {
        this.reporter = reporter;
    }

    public UserDto getReported() {
        return reported;
    }

    public void setReported(UserDto reported) {
        this.reported = reported;
    }
}
