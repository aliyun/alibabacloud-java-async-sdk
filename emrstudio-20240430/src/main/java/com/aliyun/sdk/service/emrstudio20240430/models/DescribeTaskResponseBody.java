// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTaskResponseBody</p>
 */
public class DescribeTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DelayTime")
    private Integer delayTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("FailRetryInterval")
    private Integer failRetryInterval;

    @com.aliyun.core.annotation.NameInMap("FailRetryTimes")
    private Integer failRetryTimes;

    @com.aliyun.core.annotation.NameInMap("Flag")
    private String flag;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private String resourceIds;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("TaskParams")
    private String taskParams;

    @com.aliyun.core.annotation.NameInMap("TaskPriority")
    private String taskPriority;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("TimeoutFlag")
    private String timeoutFlag;

    @com.aliyun.core.annotation.NameInMap("TimeoutNotifyStrategy")
    private String timeoutNotifyStrategy;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DescribeTaskResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.delayTime = builder.delayTime;
        this.description = builder.description;
        this.failRetryInterval = builder.failRetryInterval;
        this.failRetryTimes = builder.failRetryTimes;
        this.flag = builder.flag;
        this.projectId = builder.projectId;
        this.resourceIds = builder.resourceIds;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskParams = builder.taskParams;
        this.taskPriority = builder.taskPriority;
        this.taskType = builder.taskType;
        this.timeout = builder.timeout;
        this.timeoutFlag = builder.timeoutFlag;
        this.timeoutNotifyStrategy = builder.timeoutNotifyStrategy;
        this.updateTime = builder.updateTime;
        this.version = builder.version;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return delayTime
     */
    public Integer getDelayTime() {
        return this.delayTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return failRetryInterval
     */
    public Integer getFailRetryInterval() {
        return this.failRetryInterval;
    }

    /**
     * @return failRetryTimes
     */
    public Integer getFailRetryTimes() {
        return this.failRetryTimes;
    }

    /**
     * @return flag
     */
    public String getFlag() {
        return this.flag;
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskParams
     */
    public String getTaskParams() {
        return this.taskParams;
    }

    /**
     * @return taskPriority
     */
    public String getTaskPriority() {
        return this.taskPriority;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return timeoutFlag
     */
    public String getTimeoutFlag() {
        return this.timeoutFlag;
    }

    /**
     * @return timeoutNotifyStrategy
     */
    public String getTimeoutNotifyStrategy() {
        return this.timeoutNotifyStrategy;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String createTime; 
        private Integer delayTime; 
        private String description; 
        private Integer failRetryInterval; 
        private Integer failRetryTimes; 
        private String flag; 
        private String projectId; 
        private String resourceIds; 
        private String taskId; 
        private String taskName; 
        private String taskParams; 
        private String taskPriority; 
        private String taskType; 
        private Integer timeout; 
        private String timeoutFlag; 
        private String timeoutNotifyStrategy; 
        private String updateTime; 
        private String version; 
        private String requestId; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DelayTime.
         */
        public Builder delayTime(Integer delayTime) {
            this.delayTime = delayTime;
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
         * FailRetryInterval.
         */
        public Builder failRetryInterval(Integer failRetryInterval) {
            this.failRetryInterval = failRetryInterval;
            return this;
        }

        /**
         * FailRetryTimes.
         */
        public Builder failRetryTimes(Integer failRetryTimes) {
            this.failRetryTimes = failRetryTimes;
            return this;
        }

        /**
         * Flag.
         */
        public Builder flag(String flag) {
            this.flag = flag;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
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
         * TaskPriority.
         */
        public Builder taskPriority(String taskPriority) {
            this.taskPriority = taskPriority;
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
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * TimeoutFlag.
         */
        public Builder timeoutFlag(String timeoutFlag) {
            this.timeoutFlag = timeoutFlag;
            return this;
        }

        /**
         * TimeoutNotifyStrategy.
         */
        public Builder timeoutNotifyStrategy(String timeoutNotifyStrategy) {
            this.timeoutNotifyStrategy = timeoutNotifyStrategy;
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
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTaskResponseBody build() {
            return new DescribeTaskResponseBody(this);
        } 

    } 

}
