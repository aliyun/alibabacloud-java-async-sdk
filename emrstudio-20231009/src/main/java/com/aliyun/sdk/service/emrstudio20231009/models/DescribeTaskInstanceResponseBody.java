// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTaskInstanceResponseBody</p>
 */
public class DescribeTaskInstanceResponseBody extends TeaModel {
    @NameInMap("DryRun")
    private String dryRun;

    @NameInMap("EmrClusterId")
    private String emrClusterId;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("ExternalAppId")
    private String externalAppId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("RetryTimes")
    private Integer retryTimes;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("Status")
    private String status;

    @NameInMap("SubmitTime")
    private String submitTime;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskInstanceId")
    private String taskInstanceId;

    @NameInMap("TaskInstanceName")
    private String taskInstanceName;

    @NameInMap("TaskParams")
    private String taskParams;

    @NameInMap("TaskType")
    private String taskType;

    @NameInMap("TaskVersion")
    private String taskVersion;

    @NameInMap("WorkflowInstanceId")
    private String workflowInstanceId;

    @NameInMap("requestId")
    private String requestId;

    private DescribeTaskInstanceResponseBody(Builder builder) {
        this.dryRun = builder.dryRun;
        this.emrClusterId = builder.emrClusterId;
        this.endTime = builder.endTime;
        this.externalAppId = builder.externalAppId;
        this.resourceGroupId = builder.resourceGroupId;
        this.retryTimes = builder.retryTimes;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.submitTime = builder.submitTime;
        this.taskId = builder.taskId;
        this.taskInstanceId = builder.taskInstanceId;
        this.taskInstanceName = builder.taskInstanceName;
        this.taskParams = builder.taskParams;
        this.taskType = builder.taskType;
        this.taskVersion = builder.taskVersion;
        this.workflowInstanceId = builder.workflowInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return emrClusterId
     */
    public String getEmrClusterId() {
        return this.emrClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return externalAppId
     */
    public String getExternalAppId() {
        return this.externalAppId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return this.retryTimes;
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
     * @return submitTime
     */
    public String getSubmitTime() {
        return this.submitTime;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskInstanceId
     */
    public String getTaskInstanceId() {
        return this.taskInstanceId;
    }

    /**
     * @return taskInstanceName
     */
    public String getTaskInstanceName() {
        return this.taskInstanceName;
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
     * @return taskVersion
     */
    public String getTaskVersion() {
        return this.taskVersion;
    }

    /**
     * @return workflowInstanceId
     */
    public String getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dryRun; 
        private String emrClusterId; 
        private String endTime; 
        private String externalAppId; 
        private String resourceGroupId; 
        private Integer retryTimes; 
        private String startTime; 
        private String status; 
        private String submitTime; 
        private String taskId; 
        private String taskInstanceId; 
        private String taskInstanceName; 
        private String taskParams; 
        private String taskType; 
        private String taskVersion; 
        private String workflowInstanceId; 
        private String requestId; 

        /**
         * 空跑标识
         */
        public Builder dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EMR集群ID
         */
        public Builder emrClusterId(String emrClusterId) {
            this.emrClusterId = emrClusterId;
            return this;
        }

        /**
         * 结束时间
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * 外部应用ID
         */
        public Builder externalAppId(String externalAppId) {
            this.externalAppId = externalAppId;
            return this;
        }

        /**
         * 资源组ID
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 重试次数
         */
        public Builder retryTimes(Integer retryTimes) {
            this.retryTimes = retryTimes;
            return this;
        }

        /**
         * 开始时间
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * 状态
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 提交时间
         */
        public Builder submitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }

        /**
         * 任务ID
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * 任务实例ID
         */
        public Builder taskInstanceId(String taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }

        /**
         * 任务实例名称
         */
        public Builder taskInstanceName(String taskInstanceName) {
            this.taskInstanceName = taskInstanceName;
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
         * 任务版本
         */
        public Builder taskVersion(String taskVersion) {
            this.taskVersion = taskVersion;
            return this;
        }

        /**
         * 工作流实例ID
         */
        public Builder workflowInstanceId(String workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTaskInstanceResponseBody build() {
            return new DescribeTaskInstanceResponseBody(this);
        } 

    } 

}
