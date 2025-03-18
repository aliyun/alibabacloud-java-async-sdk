// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link ListAsyncTasksRequest} extends {@link RequestModel}
 *
 * <p>ListAsyncTasksRequest</p>
 */
public class ListAsyncTasksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateTimeStart")
    private String createTimeStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskCode")
    private String taskCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private Integer taskStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskStatusList")
    private java.util.List<Integer> taskStatusList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskTypeList")
    private java.util.List<String> taskTypeList;

    private ListAsyncTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
    public java.util.List<Integer> getTaskStatusList() {
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
    public java.util.List<String> getTaskTypeList() {
        return this.taskTypeList;
    }

    public static final class Builder extends Request.Builder<ListAsyncTasksRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String createTimeEnd; 
        private String createTimeStart; 
        private Integer current; 
        private Integer size; 
        private String taskCode; 
        private String taskName; 
        private Integer taskStatus; 
        private java.util.List<Integer> taskStatusList; 
        private String taskType; 
        private java.util.List<String> taskTypeList; 

        private Builder() {
            super();
        } 

        private Builder(ListAsyncTasksRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cd327c3d5d5e44159cc716e23bfa530e_p_beebot_public</p>
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
        public Builder taskStatusList(java.util.List<Integer> taskStatusList) {
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
        public Builder taskTypeList(java.util.List<String> taskTypeList) {
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
