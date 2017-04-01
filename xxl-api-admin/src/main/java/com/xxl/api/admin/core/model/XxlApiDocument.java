package com.xxl.api.admin.core.model;

import com.xxl.api.admin.core.consistant.RequestConfig;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by xuxueli on 17/3/31.
 */
public class XxlApiDocument {

    private int id;                     // 接口ID
    private int projectId;              // 项目ID
    private int groupId;                // 分组ID
    private String name;                // 接口名称
    private int status;                 // 状态：0-启用、1-维护、2-废弃
    private int starLevel;              // 星标等级：0-普通接口、1-一星接口
    private String requestUrl;          // Request URL：相对地址
    private String requestMethod;       // Request Method：如POST、GET
    private String requestHeaders;      // Request Headers：Map-JSON格式字符串
    private String queryParams;         // Query String Parameters：Map-JSON格式字符串
    private String successRespType;     // Response Content-type：成功接口，如JSON、XML、HTML、TEXT
    private String successRespExample;  // Response Content：成功接口
    private String failRespType;        // Response Content-type：失败接口
    private String failRespExample;     // Response Content：失败接口
    private String remark;              // 备注
    private Date addTime;               // 创建时间
    private Date updateTime;            // 更新时间

    // plugin
    private List<Map<String, String>> requestHeaderList;
    private List<RequestConfig.QueryParam> queryParamList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(int starLevel) {
        this.starLevel = starLevel;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestHeaders() {
        return requestHeaders;
    }

    public void setRequestHeaders(String requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    public String getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(String queryParams) {
        this.queryParams = queryParams;
    }

    public String getSuccessRespType() {
        return successRespType;
    }

    public void setSuccessRespType(String successRespType) {
        this.successRespType = successRespType;
    }

    public String getSuccessRespExample() {
        return successRespExample;
    }

    public void setSuccessRespExample(String successRespExample) {
        this.successRespExample = successRespExample;
    }

    public String getFailRespType() {
        return failRespType;
    }

    public void setFailRespType(String failRespType) {
        this.failRespType = failRespType;
    }

    public String getFailRespExample() {
        return failRespExample;
    }

    public void setFailRespExample(String failRespExample) {
        this.failRespExample = failRespExample;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<Map<String, String>> getRequestHeaderList() {
        return requestHeaderList;
    }

    public void setRequestHeaderList(List<Map<String, String>> requestHeaderList) {
        this.requestHeaderList = requestHeaderList;
    }

    public List<RequestConfig.QueryParam> getQueryParamList() {
        return queryParamList;
    }

    public void setQueryParamList(List<RequestConfig.QueryParam> queryParamList) {
        this.queryParamList = queryParamList;
    }
}
