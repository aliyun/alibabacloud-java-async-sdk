// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WorkflowInstance} extends {@link TeaModel}
 *
 * <p>WorkflowInstance</p>
 */
public class WorkflowInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchProgress")
    private Integer batchProgress;

    @com.aliyun.core.annotation.NameInMap("DlfWorkflowId")
    private String dlfWorkflowId;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("ExternalInstanceId")
    private String externalInstanceId;

    @com.aliyun.core.annotation.NameInMap("RuntimeLogs")
    private java.util.List < LogInfo > runtimeLogs;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private WorkflowInstance(Builder builder) {
        this.batchProgress = builder.batchProgress;
        this.dlfWorkflowId = builder.dlfWorkflowId;
        this.endTime = builder.endTime;
        this.externalInstanceId = builder.externalInstanceId;
        this.runtimeLogs = builder.runtimeLogs;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WorkflowInstance create() {
        return builder().build();
    }

    /**
     * @return batchProgress
     */
    public Integer getBatchProgress() {
        return this.batchProgress;
    }

    /**
     * @return dlfWorkflowId
     */
    public String getDlfWorkflowId() {
        return this.dlfWorkflowId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return externalInstanceId
     */
    public String getExternalInstanceId() {
        return this.externalInstanceId;
    }

    /**
     * @return runtimeLogs
     */
    public java.util.List < LogInfo > getRuntimeLogs() {
        return this.runtimeLogs;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer batchProgress; 
        private String dlfWorkflowId; 
        private Long endTime; 
        private String externalInstanceId; 
        private java.util.List < LogInfo > runtimeLogs; 
        private Long startTime; 
        private String status; 

        /**
         * BatchProgress.
         */
        public Builder batchProgress(Integer batchProgress) {
            this.batchProgress = batchProgress;
            return this;
        }

        /**
         * DlfWorkflowId.
         */
        public Builder dlfWorkflowId(String dlfWorkflowId) {
            this.dlfWorkflowId = dlfWorkflowId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * ExternalInstanceId.
         */
        public Builder externalInstanceId(String externalInstanceId) {
            this.externalInstanceId = externalInstanceId;
            return this;
        }

        /**
         * RuntimeLogs.
         */
        public Builder runtimeLogs(java.util.List < LogInfo > runtimeLogs) {
            this.runtimeLogs = runtimeLogs;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
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

        public WorkflowInstance build() {
            return new WorkflowInstance(this);
        } 

    } 

}
