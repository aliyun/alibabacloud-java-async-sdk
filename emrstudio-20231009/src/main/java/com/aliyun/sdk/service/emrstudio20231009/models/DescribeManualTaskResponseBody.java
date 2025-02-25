// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeManualTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeManualTaskResponseBody</p>
 */
public class DescribeManualTaskResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("ManualTaskId")
    private String manualTaskId;

    @NameInMap("ManualTaskName")
    private String manualTaskName;

    @NameInMap("ParentDirectoryId")
    private String parentDirectoryId;

    @NameInMap("ProjectId")
    private String projectId;

    @NameInMap("ResourceIds")
    private String resourceIds;

    @NameInMap("TaskParams")
    private String taskParams;

    @NameInMap("TaskType")
    private String taskType;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("requestId")
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
         * 代表创建时间的资源属性字段
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 代表资源一级ID的资源属性字段
         */
        public Builder manualTaskId(String manualTaskId) {
            this.manualTaskId = manualTaskId;
            return this;
        }

        /**
         * 代表资源名称的资源属性字段
         */
        public Builder manualTaskName(String manualTaskName) {
            this.manualTaskName = manualTaskName;
            return this;
        }

        /**
         * 目录ID
         */
        public Builder parentDirectoryId(String parentDirectoryId) {
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }

        /**
         * 项目ID
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * 资源id列表
         */
        public Builder resourceIds(String resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * 任务参数
         */
        public Builder taskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }

        /**
         * 任务类型
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * 更新时间
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Id of the request
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
