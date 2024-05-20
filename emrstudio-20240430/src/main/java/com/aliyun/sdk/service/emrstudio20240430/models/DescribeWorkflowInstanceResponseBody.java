// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWorkflowInstanceResponseBody</p>
 */
public class DescribeWorkflowInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertGroupId")
    private String alertGroupId;

    @com.aliyun.core.annotation.NameInMap("alertStrategy")
    private String alertStrategy;

    @com.aliyun.core.annotation.NameInMap("emrClusterId")
    private String emrClusterId;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("failureStrategy")
    private String failureStrategy;

    @com.aliyun.core.annotation.NameInMap("isComplementData")
    private Boolean isComplementData;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("restartTime")
    private String restartTime;

    @com.aliyun.core.annotation.NameInMap("runTimes")
    private Integer runTimes;

    @com.aliyun.core.annotation.NameInMap("scheduleTime")
    private String scheduleTime;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("workflowId")
    private String workflowId;

    @com.aliyun.core.annotation.NameInMap("workflowInstanceId")
    private String workflowInstanceId;

    @com.aliyun.core.annotation.NameInMap("workflowInstancePriority")
    private String workflowInstancePriority;

    @com.aliyun.core.annotation.NameInMap("workflowVersion")
    private Integer workflowVersion;

    private DescribeWorkflowInstanceResponseBody(Builder builder) {
        this.alertGroupId = builder.alertGroupId;
        this.alertStrategy = builder.alertStrategy;
        this.emrClusterId = builder.emrClusterId;
        this.endTime = builder.endTime;
        this.failureStrategy = builder.failureStrategy;
        this.isComplementData = builder.isComplementData;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.restartTime = builder.restartTime;
        this.runTimes = builder.runTimes;
        this.scheduleTime = builder.scheduleTime;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.timeout = builder.timeout;
        this.workflowId = builder.workflowId;
        this.workflowInstanceId = builder.workflowInstanceId;
        this.workflowInstancePriority = builder.workflowInstancePriority;
        this.workflowVersion = builder.workflowVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkflowInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertGroupId
     */
    public String getAlertGroupId() {
        return this.alertGroupId;
    }

    /**
     * @return alertStrategy
     */
    public String getAlertStrategy() {
        return this.alertStrategy;
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
     * @return failureStrategy
     */
    public String getFailureStrategy() {
        return this.failureStrategy;
    }

    /**
     * @return isComplementData
     */
    public Boolean getIsComplementData() {
        return this.isComplementData;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return restartTime
     */
    public String getRestartTime() {
        return this.restartTime;
    }

    /**
     * @return runTimes
     */
    public Integer getRunTimes() {
        return this.runTimes;
    }

    /**
     * @return scheduleTime
     */
    public String getScheduleTime() {
        return this.scheduleTime;
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
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * @return workflowInstanceId
     */
    public String getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    /**
     * @return workflowInstancePriority
     */
    public String getWorkflowInstancePriority() {
        return this.workflowInstancePriority;
    }

    /**
     * @return workflowVersion
     */
    public Integer getWorkflowVersion() {
        return this.workflowVersion;
    }

    public static final class Builder {
        private String alertGroupId; 
        private String alertStrategy; 
        private String emrClusterId; 
        private String endTime; 
        private String failureStrategy; 
        private Boolean isComplementData; 
        private String name; 
        private String requestId; 
        private String resourceGroupId; 
        private String restartTime; 
        private Integer runTimes; 
        private String scheduleTime; 
        private String startTime; 
        private String status; 
        private Integer timeout; 
        private String workflowId; 
        private String workflowInstanceId; 
        private String workflowInstancePriority; 
        private Integer workflowVersion; 

        /**
         * alertGroupId.
         */
        public Builder alertGroupId(String alertGroupId) {
            this.alertGroupId = alertGroupId;
            return this;
        }

        /**
         * alertStrategy.
         */
        public Builder alertStrategy(String alertStrategy) {
            this.alertStrategy = alertStrategy;
            return this;
        }

        /**
         * emrClusterId.
         */
        public Builder emrClusterId(String emrClusterId) {
            this.emrClusterId = emrClusterId;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * failureStrategy.
         */
        public Builder failureStrategy(String failureStrategy) {
            this.failureStrategy = failureStrategy;
            return this;
        }

        /**
         * isComplementData.
         */
        public Builder isComplementData(Boolean isComplementData) {
            this.isComplementData = isComplementData;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * restartTime.
         */
        public Builder restartTime(String restartTime) {
            this.restartTime = restartTime;
            return this;
        }

        /**
         * runTimes.
         */
        public Builder runTimes(Integer runTimes) {
            this.runTimes = runTimes;
            return this;
        }

        /**
         * scheduleTime.
         */
        public Builder scheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * workflowId.
         */
        public Builder workflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }

        /**
         * workflowInstanceId.
         */
        public Builder workflowInstanceId(String workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }

        /**
         * workflowInstancePriority.
         */
        public Builder workflowInstancePriority(String workflowInstancePriority) {
            this.workflowInstancePriority = workflowInstancePriority;
            return this;
        }

        /**
         * workflowVersion.
         */
        public Builder workflowVersion(Integer workflowVersion) {
            this.workflowVersion = workflowVersion;
            return this;
        }

        public DescribeWorkflowInstanceResponseBody build() {
            return new DescribeWorkflowInstanceResponseBody(this);
        } 

    } 

}
