// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskStatus} extends {@link TeaModel}
 *
 * <p>TaskStatus</p>
 */
public class TaskStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("executionDetails")
    private java.util.List < String > executionDetails;

    @com.aliyun.core.annotation.NameInMap("invocations")
    private java.util.List < TaskInvocation > invocations;

    @com.aliyun.core.annotation.NameInMap("latestExecError")
    private TaskExecError latestExecError;

    @com.aliyun.core.annotation.NameInMap("phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("statusGeneration")
    private Long statusGeneration;

    private TaskStatus(Builder builder) {
        this.executionDetails = builder.executionDetails;
        this.invocations = builder.invocations;
        this.latestExecError = builder.latestExecError;
        this.phase = builder.phase;
        this.statusGeneration = builder.statusGeneration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskStatus create() {
        return builder().build();
    }

    /**
     * @return executionDetails
     */
    public java.util.List < String > getExecutionDetails() {
        return this.executionDetails;
    }

    /**
     * @return invocations
     */
    public java.util.List < TaskInvocation > getInvocations() {
        return this.invocations;
    }

    /**
     * @return latestExecError
     */
    public TaskExecError getLatestExecError() {
        return this.latestExecError;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return statusGeneration
     */
    public Long getStatusGeneration() {
        return this.statusGeneration;
    }

    public static final class Builder {
        private java.util.List < String > executionDetails; 
        private java.util.List < TaskInvocation > invocations; 
        private TaskExecError latestExecError; 
        private String phase; 
        private Long statusGeneration; 

        /**
         * executionDetails.
         */
        public Builder executionDetails(java.util.List < String > executionDetails) {
            this.executionDetails = executionDetails;
            return this;
        }

        /**
         * invocations.
         */
        public Builder invocations(java.util.List < TaskInvocation > invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * latestExecError.
         */
        public Builder latestExecError(TaskExecError latestExecError) {
            this.latestExecError = latestExecError;
            return this;
        }

        /**
         * phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * statusGeneration.
         */
        public Builder statusGeneration(Long statusGeneration) {
            this.statusGeneration = statusGeneration;
            return this;
        }

        public TaskStatus build() {
            return new TaskStatus(this);
        } 

    } 

}
