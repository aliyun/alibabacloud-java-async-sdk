// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link JobStatus} extends {@link TeaModel}
 *
 * <p>JobStatus</p>
 */
public class JobStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentJobStatus")
    private String currentJobStatus;

    @com.aliyun.core.annotation.NameInMap("failure")
    private JobFailure failure;

    @com.aliyun.core.annotation.NameInMap("healthScore")
    private Integer healthScore;

    @com.aliyun.core.annotation.NameInMap("riskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.NameInMap("running")
    private JobStatusRunning running;

    private JobStatus(Builder builder) {
        this.currentJobStatus = builder.currentJobStatus;
        this.failure = builder.failure;
        this.healthScore = builder.healthScore;
        this.riskLevel = builder.riskLevel;
        this.running = builder.running;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobStatus create() {
        return builder().build();
    }

    /**
     * @return currentJobStatus
     */
    public String getCurrentJobStatus() {
        return this.currentJobStatus;
    }

    /**
     * @return failure
     */
    public JobFailure getFailure() {
        return this.failure;
    }

    /**
     * @return healthScore
     */
    public Integer getHealthScore() {
        return this.healthScore;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return running
     */
    public JobStatusRunning getRunning() {
        return this.running;
    }

    public static final class Builder {
        private String currentJobStatus; 
        private JobFailure failure; 
        private Integer healthScore; 
        private String riskLevel; 
        private JobStatusRunning running; 

        /**
         * currentJobStatus.
         */
        public Builder currentJobStatus(String currentJobStatus) {
            this.currentJobStatus = currentJobStatus;
            return this;
        }

        /**
         * failure.
         */
        public Builder failure(JobFailure failure) {
            this.failure = failure;
            return this;
        }

        /**
         * healthScore.
         */
        public Builder healthScore(Integer healthScore) {
            this.healthScore = healthScore;
            return this;
        }

        /**
         * riskLevel.
         */
        public Builder riskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * running.
         */
        public Builder running(JobStatusRunning running) {
            this.running = running;
            return this;
        }

        public JobStatus build() {
            return new JobStatus(this);
        } 

    } 

}
