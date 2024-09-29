// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeManualTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeManualTaskResponseBody</p>
 */
public class DescribeManualTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ManualTaskId")
    private String manualTaskId;

    @com.aliyun.core.annotation.NameInMap("ManualTaskName")
    private String manualTaskName;

    @com.aliyun.core.annotation.NameInMap("ParentDirectoryId")
    private String parentDirectoryId;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private String resourceIds;

    @com.aliyun.core.annotation.NameInMap("TaskParams")
    private String taskParams;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DescribeManualTaskResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.manualTaskId = builder.manualTaskId;
        this.manualTaskName = builder.manualTaskName;
        this.parentDirectoryId = builder.parentDirectoryId;
        this.projectId = builder.projectId;
        this.resourceIds = builder.resourceIds;
        this.taskParams = builder.taskParams;
        this.taskType = builder.taskType;
        this.updateTime = builder.updateTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeManualTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return manualTaskId
     */
    public String getManualTaskId() {
        return this.manualTaskId;
    }

    /**
     * @return manualTaskName
     */
    public String getManualTaskName() {
        return this.manualTaskName;
    }

    /**
     * @return parentDirectoryId
     */
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return resourceIds
     */
    public String getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return taskParams
     */
    public String getTaskParams() {
        return this.taskParams;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private String manualTaskId; 
        private String manualTaskName; 
        private String parentDirectoryId; 
        private String projectId; 
        private String resourceIds; 
        private String taskParams; 
        private String taskType; 
        private String updateTime; 
        private String requestId; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * ManualTaskId.
         */
        public Builder manualTaskId(String manualTaskId) {
            this.manualTaskId = manualTaskId;
            return this;
        }

        /**
         * ManualTaskName.
         */
        public Builder manualTaskName(String manualTaskName) {
            this.manualTaskName = manualTaskName;
            return this;
        }

        /**
         * ParentDirectoryId.
         */
        public Builder parentDirectoryId(String parentDirectoryId) {
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(String resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * TaskParams.
         */
        public Builder taskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeManualTaskResponseBody build() {
            return new DescribeManualTaskResponseBody(this);
        } 

    } 

}
