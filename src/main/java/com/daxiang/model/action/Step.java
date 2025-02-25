package com.daxiang.model.action;

import com.daxiang.mbg.po.Action;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by jiangyitao.
 * action步骤
 */
@Data
public class Step {
    /**
     * 调用的action id
     */
    @NotNull(message = "步骤Action不能为空")
    private Integer actionId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Action action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date startTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date endTime;

    @NotBlank(message = "步骤名不能为空")
    private String name;
    /**
     * 步骤赋值
     */
    private String evaluation;
    @NotNull(message = "步骤号不能为空")
    private Integer number;
    /**
     * 调用action传入的值
     */
    private List<ParamValue> paramValues;
}
