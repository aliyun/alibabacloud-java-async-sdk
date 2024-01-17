// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAsyncTasksRequest} extends {@link RequestModel}
 *
 * <p>ListAsyncTasksRequest</p>
 */
public class ListAsyncTasksRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @Body
    @NameInMap("CreateTimeStart")
    private String createTimeStart;

    @Body
    @NameInMap("Current")
    private Integer current;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("TaskCode")
    private String taskCode;

    @Body
    @NameInMap("TaskName")
    private String taskName;

    @Body
    @NameInMap("TaskStatus")
    private Integer taskStatus;

    @Body
    @NameInMap("TaskStatusList")
    private java.util.List < Integer > taskStatusList;

    @Body
    @NameInMap("TaskType")
    private String taskType;

    @Body
    @NameInMap("TaskTypeList")
    private java.util.List < String > taskTypeList;

    private ListAsyncTasksRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.current = builder.current;
        this.size = builder.size;
        this.taskCode = builder.taskCode;
        this.taskName = builder.taskName;
        this.taskStatus = builder.taskStatus;
        this.taskStatusList = builder.taskStatusList;
        this.taskType = builder.taskType;
        this.taskTypeList = builder.taskTypeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAsyncTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return taskCode
     */
    public String getTaskCode() {
        return this.taskCode;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return taskStatusList
     */
    public java.util.List < Integer > getTaskStatusList() {
        return this.taskStatusList;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return taskTypeList
     */
    public java.util.List < String > getTaskTypeList() {
        return this.taskTypeList;
    }

    public static final class Builder extends Request.Builder<ListAsyncTasksRequest, Builder> {
        private String agentKey; 
        private String createTimeEnd; 
        private String createTimeStart; 
        private Integer current; 
        private Integer size; 
        private String taskCode; 
        private String taskName; 
        private Integer taskStatus; 
        private java.util.List < Integer > taskStatusList; 
        private String taskType; 
        private java.util.List < String > taskTypeList; 

        private Builder() {
            super();
        } 

        private Builder(ListAsyncTasksRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.current = request.current;
            this.size = request.size;
            this.taskCode = request.taskCode;
            this.taskName = request.taskName;
            this.taskStatus = request.taskStatus;
            this.taskStatusList = request.taskStatusList;
            this.taskType = request.taskType;
            this.taskTypeList = request.taskTypeList;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * CreateTimeEnd.
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putBodyParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * CreateTimeStart.
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putBodyParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * TaskCode.
         */
        public Builder taskCode(String taskCode) {
            this.putBodyParameter("TaskCode", taskCode);
            this.taskCode = taskCode;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(Integer taskStatus) {
            this.putBodyParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * TaskStatusList.
         */
        public Builder taskStatusList(java.util.List < Integer > taskStatusList) {
            String taskStatusListShrink = shrink(taskStatusList, "TaskStatusList", "json");
            this.putBodyParameter("TaskStatusList", taskStatusListShrink);
            this.taskStatusList = taskStatusList;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * TaskTypeList.
         */
        public Builder taskTypeList(java.util.List < String > taskTypeList) {
            String taskTypeListShrink = shrink(taskTypeList, "TaskTypeList", "json");
            this.putBodyParameter("TaskTypeList", taskTypeListShrink);
            this.taskTypeList = taskTypeList;
            return this;
        }

        @Override
        public ListAsyncTasksRequest build() {
            return new ListAsyncTasksRequest(this);
        } 

    } 

}
