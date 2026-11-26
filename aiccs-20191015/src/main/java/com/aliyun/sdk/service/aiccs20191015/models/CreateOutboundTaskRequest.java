// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateOutboundTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateOutboundTaskRequest</p>
 */
public class CreateOutboundTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ani")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ani;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallInfos")
    private String callInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepartmentId")
    @com.aliyun.core.annotation.Validation()
    private Long departmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtAttrs")
    private String extAttrs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    @com.aliyun.core.annotation.Validation(maximum = 10)
    private Integer model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryInterval")
    @com.aliyun.core.annotation.Validation(maximum = 2880)
    private Integer retryInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryTime")
    @com.aliyun.core.annotation.Validation(maximum = 3)
    private Integer retryTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long skillGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10)
    private Integer taskType;

    private CreateOutboundTaskRequest(Builder builder) {
        super(builder);
        this.ani = builder.ani;
        this.callInfos = builder.callInfos;
        this.departmentId = builder.departmentId;
        this.description = builder.description;
        this.endDate = builder.endDate;
        this.endTime = builder.endTime;
        this.extAttrs = builder.extAttrs;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
        this.model = builder.model;
        this.retryInterval = builder.retryInterval;
        this.retryTime = builder.retryTime;
        this.skillGroup = builder.skillGroup;
        this.startDate = builder.startDate;
        this.startTime = builder.startTime;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOutboundTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ani
     */
    public String getAni() {
        return this.ani;
    }

    /**
     * @return callInfos
     */
    public String getCallInfos() {
        return this.callInfos;
    }

    /**
     * @return departmentId
     */
    public Long getDepartmentId() {
        return this.departmentId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return extAttrs
     */
    public String getExtAttrs() {
        return this.extAttrs;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return model
     */
    public Integer getModel() {
        return this.model;
    }

    /**
     * @return retryInterval
     */
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * @return retryTime
     */
    public Integer getRetryTime() {
        return this.retryTime;
    }

    /**
     * @return skillGroup
     */
    public Long getSkillGroup() {
        return this.skillGroup;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public Integer getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateOutboundTaskRequest, Builder> {
        private String ani; 
        private String callInfos; 
        private Long departmentId; 
        private String description; 
        private String endDate; 
        private String endTime; 
        private String extAttrs; 
        private String groupName; 
        private String instanceId; 
        private Integer model; 
        private Integer retryInterval; 
        private Integer retryTime; 
        private Long skillGroup; 
        private String startDate; 
        private String startTime; 
        private String taskName; 
        private Integer taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateOutboundTaskRequest request) {
            super(request);
            this.ani = request.ani;
            this.callInfos = request.callInfos;
            this.departmentId = request.departmentId;
            this.description = request.description;
            this.endDate = request.endDate;
            this.endTime = request.endTime;
            this.extAttrs = request.extAttrs;
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
            this.model = request.model;
            this.retryInterval = request.retryInterval;
            this.retryTime = request.retryTime;
            this.skillGroup = request.skillGroup;
            this.startDate = request.startDate;
            this.startTime = request.startTime;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The calling number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>130****1111</p>
         */
        public Builder ani(String ani) {
            this.putQueryParameter("Ani", ani);
            this.ani = ani;
            return this;
        }

        /**
         * <p>The call information.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;dnis&quot;:&quot;1&quot;,&quot;memberId&quot;:1133,&quot;memberName&quot;:&quot;Test member&quot;,&quot;priority&quot;:10}]</p>
         */
        public Builder callInfos(String callInfos) {
            this.putQueryParameter("CallInfos", callInfos);
            this.callInfos = callInfos;
            return this;
        }

        /**
         * <p>The department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder departmentId(Long departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
            return this;
        }

        /**
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test task description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The end date of the task execution. The maximum time span between the start time and the end time is 7 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-09</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The end time of the task execution.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The extended attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;remark&quot;:&quot;Outbound call test&quot;}</p>
         */
        public Builder extAttrs(String extAttrs) {
            this.putQueryParameter("ExtAttrs", extAttrs);
            this.extAttrs = extAttrs;
            return this;
        }

        /**
         * <p>The name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>Test skill group</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>Instance ID of the AICCS instance. You can obtain instance ID from the Artificial Intelligence Cloud Call Service console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The model.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder model(Integer model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The retry interval for unanswered calls. Unit: minutes.</p>
         * <blockquote>
         * <p>The default value is empty. If the number of retries is greater than 0, this parameter is required. The minimum time granularity is minutes, and the maximum value can be set to 48 hours.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder retryInterval(Integer retryInterval) {
            this.putQueryParameter("RetryInterval", retryInterval);
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * <p>The number of retries for unanswered calls. Default value: <strong>0</strong>. Maximum value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder retryTime(Integer retryTime) {
            this.putQueryParameter("RetryTime", retryTime);
            this.retryTime = retryTime;
            return this;
        }

        /**
         * <p>The ID of the skill group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder skillGroup(Long skillGroup) {
            this.putQueryParameter("SkillGroup", skillGroup);
            this.skillGroup = skillGroup;
            return this;
        }

        /**
         * <p>The start date of the task execution. The maximum time span between the start time and the end time is 7 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-08</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The start time of the task execution.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>09:09:09</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The task name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test task</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: PREVIEW (preview)</li>
         * <li><strong>2</strong>: FORECAST (forecast)</li>
         * <li><strong>3</strong>: ROBOT (robot)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskType(Integer taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateOutboundTaskRequest build() {
            return new CreateOutboundTaskRequest(this);
        } 

    } 

}
