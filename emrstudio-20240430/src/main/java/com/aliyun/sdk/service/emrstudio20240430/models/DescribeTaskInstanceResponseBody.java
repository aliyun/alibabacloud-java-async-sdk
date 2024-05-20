// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTaskInstanceResponseBody</p>
 */
public class DescribeTaskInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.NameInMap("EmrClusterId")
    private String emrClusterId;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("ExternalAppId")
    private String externalAppId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("RetryTimes")
    private Integer retryTimes;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubmitTime")
    private String submitTime;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskInstanceId")
    private String taskInstanceId;

    @com.aliyun.core.annotation.NameInMap("TaskInstanceName")
    private String taskInstanceName;

    @com.aliyun.core.annotation.NameInMap("TaskParams")
    private String taskParams;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("TaskVersion")
    private String taskVersion;

    @com.aliyun.core.annotation.NameInMap("WorkflowInstanceId")
    private String workflowInstanceId;

    @com.aliyun.core.annotation.NameInMap("requestId")
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
         * DryRun.
         */
        public Builder dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EmrClusterId.
         */
        public Builder emrClusterId(String emrClusterId) {
            this.emrClusterId = emrClusterId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * ExternalAppId.
         */
        public Builder externalAppId(String externalAppId) {
            this.externalAppId = externalAppId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * RetryTimes.
         */
        public Builder retryTimes(Integer retryTimes) {
            this.retryTimes = retryTimes;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SubmitTime.
         */
        public Builder submitTime(String submitTime) {
            this.submitTime = submitTime;
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
         * TaskInstanceId.
         */
        public Builder taskInstanceId(String taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }

        /**
         * TaskInstanceName.
         */
        public Builder taskInstanceName(String taskInstanceName) {
            this.taskInstanceName = taskInstanceName;
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
         * TaskVersion.
         */
        public Builder taskVersion(String taskVersion) {
            this.taskVersion = taskVersion;
            return this;
        }

        /**
         * WorkflowInstanceId.
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
