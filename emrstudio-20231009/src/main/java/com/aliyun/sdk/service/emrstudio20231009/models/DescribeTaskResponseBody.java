// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTaskResponseBody</p>
 */
public class DescribeTaskResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DelayTime")
    private Integer delayTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("FailRetryInterval")
    private Integer failRetryInterval;

    @NameInMap("FailRetryTimes")
    private Integer failRetryTimes;

    @NameInMap("Flag")
    private String flag;

    @NameInMap("ProjectId")
    private String projectId;

    @NameInMap("ResourceIds")
    private String resourceIds;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskName")
    private String taskName;

    @NameInMap("TaskParams")
    private String taskParams;

    @NameInMap("TaskPriority")
    private String taskPriority;

    @NameInMap("TaskType")
    private String taskType;

    @NameInMap("Timeout")
    private Integer timeout;

    @NameInMap("TimeoutFlag")
    private String timeoutFlag;

    @NameInMap("TimeoutNotifyStrategy")
    private String timeoutNotifyStrategy;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("Version")
    private String version;

    @NameInMap("requestId")
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
         * 代表创建时间的资源属性字段
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 延时执行时间
         */
        public Builder delayTime(Integer delayTime) {
            this.delayTime = delayTime;
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
         * 失败重试间隔
         */
        public Builder failRetryInterval(Integer failRetryInterval) {
            this.failRetryInterval = failRetryInterval;
            return this;
        }

        /**
         * 失败重试次数
         */
        public Builder failRetryTimes(Integer failRetryTimes) {
            this.failRetryTimes = failRetryTimes;
            return this;
        }

        /**
         * 运行标志
         */
        public Builder flag(String flag) {
            this.flag = flag;
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
         * 资源ID列表
         */
        public Builder resourceIds(String resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * 代表资源一级ID的资源属性字段
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * 代表资源名称的资源属性字段
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
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
         * 任务优先级
         */
        public Builder taskPriority(String taskPriority) {
            this.taskPriority = taskPriority;
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
         * 超时时长
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * 超时告警标志
         */
        public Builder timeoutFlag(String timeoutFlag) {
            this.timeoutFlag = timeoutFlag;
            return this;
        }

        /**
         * 超时告警标志
         */
        public Builder timeoutNotifyStrategy(String timeoutNotifyStrategy) {
            this.timeoutNotifyStrategy = timeoutNotifyStrategy;
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
         * 版本
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
