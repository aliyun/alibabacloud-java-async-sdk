// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOutboundTaskRequest} extends {@link RequestModel}
 *
 * <p>QueryOutboundTaskRequest</p>
 */
public class QueryOutboundTaskRequest extends Request {
    @Query
    @NameInMap("Ani")
    private String ani;

    @Query
    @NameInMap("CurrentPage")
    @Validation(maximum = 10000, minimum = 1)
    private Integer currentPage;

    @Query
    @NameInMap("DepartmentId")
    private String departmentId;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

    @Query
    @NameInMap("SkillGroup")
    @Validation()
    private Long skillGroup;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TaskId")
    @Validation()
    private Long taskId;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    @Query
    @NameInMap("TaskType")
    @Validation(maximum = 10)
    private Integer taskType;

    private QueryOutboundTaskRequest(Builder builder) {
        super(builder);
        this.ani = builder.ani;
        this.currentPage = builder.currentPage;
        this.departmentId = builder.departmentId;
        this.endDate = builder.endDate;
        this.endTime = builder.endTime;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.skillGroup = builder.skillGroup;
        this.startDate = builder.startDate;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOutboundTaskRequest create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return departmentId
     */
    public String getDepartmentId() {
        return this.departmentId;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
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

    public static final class Builder extends Request.Builder<QueryOutboundTaskRequest, Builder> {
        private String ani; 
        private Integer currentPage; 
        private String departmentId; 
        private String endDate; 
        private String endTime; 
        private String groupName; 
        private String instanceId; 
        private Integer pageSize; 
        private Long skillGroup; 
        private String startDate; 
        private String startTime; 
        private String status; 
        private Long taskId; 
        private String taskName; 
        private Integer taskType; 

        private Builder() {
            super();
        } 

        private Builder(QueryOutboundTaskRequest request) {
            super(request);
            this.ani = request.ani;
            this.currentPage = request.currentPage;
            this.departmentId = request.departmentId;
            this.endDate = request.endDate;
            this.endTime = request.endTime;
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.skillGroup = request.skillGroup;
            this.startDate = request.startDate;
            this.startTime = request.startTime;
            this.status = request.status;
            this.taskId = request.taskId;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DepartmentId.
         */
        public Builder departmentId(String departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
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
        public QueryOutboundTaskRequest build() {
            return new QueryOutboundTaskRequest(this);
        } 

    } 

}
