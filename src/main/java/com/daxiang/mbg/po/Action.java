package com.daxiang.mbg.po;

import com.daxiang.model.action.LocalVar;
import com.daxiang.model.action.Param;
import com.daxiang.model.action.Step;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Action implements Serializable {

    /**
     * 基础action(代码形式的)
     */
    public static final Integer TYPE_BASE = 1;
    /**
     * 用户在网页前端封装的action
     */
    public static final Integer TYPE_ENCAPSULATION = 2;
    /**
     * 测试用例action
     */
    public static final Integer TYPE_TESTCASE = 3;
    /**
     * 有返回值
     */
    public static final Integer HAS_RETURN_VALUE = 1;
    /**
     * 无返回值
     */
    public static final Integer NO_RETURN_VALUE = 0;

    /**
     * 是否需要在代码模板里传client/driver
     */
    public static final Integer NEED_DRIVER = 1;

    /**
     * 主键id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * action名
     *
     * @mbg.generated
     */
    @NotBlank(message = "action名不能为空")
    private String name;

    /**
     * 描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 类型：1.基础action（代码形式的） 2.用户在网页前端封装的action 3.测试用例
     *
     * @mbg.generated
     */
    @NotNull(message = "ActionType不能为空")
    private Integer type;

    /**
     * 基础action专用：类名
     *
     * @mbg.generated
     */
    private String className;

    /**
     * 基础action专用：是否需要传入driver
     *
     * @mbg.generated
     */
    private Integer needDriver;

    /**
     * 是否有返回值
     *
     * @mbg.generated
     */
    @NotNull(message = "是否有返回值不能为空")
    private Integer hasReturnValue;

    /**
     * 返回值
     *
     * @mbg.generated
     */
    private String returnValue;

    /**
     * 返回值描述
     *
     * @mbg.generated
     */
    private String returnValueDesc;

    /**
     * 创建人id
     *
     * @mbg.generated
     */
    private Integer creatorUid;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 更新人id
     *
     * @mbg.generated
     */
    private Integer updatorUid;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 1.android 2.ios
     *
     * @mbg.generated
     */
    @NotNull(message = "平台不能为空")
    private Integer platform;

    /**
     * 所属的page id
     *
     * @mbg.generated
     */
    private Integer pageId;

    /**
     * 所属的项目id
     *
     * @mbg.generated
     */
    @NotNull(message = "项目id不能为空")
    private Integer projectId;

    /**
     * 所属的测试集
     *
     * @mbg.generated
     */
    private Integer testSuiteId;

    /**
     * 方法参数
     *
     * @mbg.generated
     */
    @Valid
    private List<Param> params;

    /**
     * 局部变量
     *
     * @mbg.generated
     */
    @Valid
    private List<LocalVar> localVars;

    /**
     * 步骤
     *
     * @mbg.generated
     */
    @Valid
    @NotEmpty(message = "步骤不能为空")
    private List<Step> steps;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getNeedDriver() {
        return needDriver;
    }

    public void setNeedDriver(Integer needDriver) {
        this.needDriver = needDriver;
    }

    public Integer getHasReturnValue() {
        return hasReturnValue;
    }

    public void setHasReturnValue(Integer hasReturnValue) {
        this.hasReturnValue = hasReturnValue;
    }

    public String getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }

    public String getReturnValueDesc() {
        return returnValueDesc;
    }

    public void setReturnValueDesc(String returnValueDesc) {
        this.returnValueDesc = returnValueDesc;
    }

    public Integer getCreatorUid() {
        return creatorUid;
    }

    public void setCreatorUid(Integer creatorUid) {
        this.creatorUid = creatorUid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdatorUid() {
        return updatorUid;
    }

    public void setUpdatorUid(Integer updatorUid) {
        this.updatorUid = updatorUid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getTestSuiteId() {
        return testSuiteId;
    }

    public void setTestSuiteId(Integer testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    public java.util.List<Param> getParams() {
        return params;
    }

    public void setParams(java.util.List<Param> params) {
        this.params = params;
    }

    public java.util.List<LocalVar> getLocalVars() {
        return localVars;
    }

    public void setLocalVars(java.util.List<LocalVar> localVars) {
        this.localVars = localVars;
    }

    public java.util.List<Step> getSteps() {
        return steps;
    }

    public void setSteps(java.util.List<Step> steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", type=").append(type);
        sb.append(", className=").append(className);
        sb.append(", needDriver=").append(needDriver);
        sb.append(", hasReturnValue=").append(hasReturnValue);
        sb.append(", returnValue=").append(returnValue);
        sb.append(", returnValueDesc=").append(returnValueDesc);
        sb.append(", creatorUid=").append(creatorUid);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatorUid=").append(updatorUid);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", platform=").append(platform);
        sb.append(", pageId=").append(pageId);
        sb.append(", projectId=").append(projectId);
        sb.append(", testSuiteId=").append(testSuiteId);
        sb.append(", params=").append(params);
        sb.append(", localVars=").append(localVars);
        sb.append(", steps=").append(steps);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}