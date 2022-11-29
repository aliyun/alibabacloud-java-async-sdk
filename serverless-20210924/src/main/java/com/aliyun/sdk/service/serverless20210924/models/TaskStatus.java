// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskStatus} extends {@link TeaModel}
 *
 * <p>TaskStatus</p>
 */
public class TaskStatus extends TeaModel {
    @NameInMap("executionDetails")
    private java.util.List < String > executionDetails;

    @NameInMap("phase")
    private String phase;

    @NameInMap("statusGeneration")
    private Long statusGeneration;

    private TaskStatus(Builder builder) {
        this.executionDetails = builder.executionDetails;
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
        private String phase; 
        private Long statusGeneration; 

        /**
         * execution details.
         */
        public Builder executionDetails(java.util.List < String > executionDetails) {
            this.executionDetails = executionDetails;
            return this;
        }

        /**
         * current execution phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * auto increased number.
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
