// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOutboundTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateOutboundTaskRequest</p>
 */
public class CreateOutboundTaskRequest extends Request {
    @Query
    @NameInMap("Ani")
    @Validation(required = true)
    private String ani;

    @Query
    @NameInMap("CallInfos")
    private String callInfos;

    @Query
    @NameInMap("DepartmentId")
    @Validation()
    private Long departmentId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("ExtAttrs")
    private String extAttrs;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Model")
    @Validation(maximum = 10)
    private Integer model;

    @Query
    @NameInMap("RetryInterval")
    @Validation(maximum = 2880)
    private Integer retryInterval;

    @Query
    @NameInMap("RetryTime")
    @Validation(maximum = 3)
    private Integer retryTime;

    @Query
    @NameInMap("SkillGroup")
    @Validation(required = true)
    private Long skillGroup;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true, maximum = 10)
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

        private Builder(CreateOutboundTaskRequest response) {
            super(response);
            this.ani = response.ani;
            this.callInfos = response.callInfos;
            this.departmentId = response.departmentId;
            this.description = response.description;
            this.endDate = response.endDate;
            this.endTime = response.endTime;
            this.extAttrs = response.extAttrs;
            this.groupName = response.groupName;
            this.instanceId = response.instanceId;
            this.model = response.model;
            this.retryInterval = response.retryInterval;
            this.retryTime = response.retryTime;
            this.skillGroup = response.skillGroup;
            this.startDate = response.startDate;
            this.startTime = response.startTime;
            this.taskName = response.taskName;
            this.taskType = response.taskType;
        } 

        /**
         * Ani.
         */
        public Builder ani(String ani) {
            this.putQueryParameter("Ani", ani);
            this.ani = ani;
            return this;
        }

        /**
         * CallInfos.
         */
        public Builder callInfos(String callInfos) {
            this.putQueryParameter("CallInfos", callInfos);
            this.callInfos = callInfos;
            return this;
        }

        /**
         * DepartmentId.
         */
        public Builder departmentId(Long departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExtAttrs.
         */
        public Builder extAttrs(String extAttrs) {
            this.putQueryParameter("ExtAttrs", extAttrs);
            this.extAttrs = extAttrs;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Integer model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * RetryInterval.
         */
        public Builder retryInterval(Integer retryInterval) {
            this.putQueryParameter("RetryInterval", retryInterval);
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * RetryTime.
         */
        public Builder retryTime(Integer retryTime) {
            this.putQueryParameter("RetryTime", retryTime);
            this.retryTime = retryTime;
            return this;
        }

        /**
         * SkillGroup.
         */
        public Builder skillGroup(Long skillGroup) {
            this.putQueryParameter("SkillGroup", skillGroup);
            this.skillGroup = skillGroup;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskType.
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
