// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobStartParameters} extends {@link TeaModel}
 *
 * <p>JobStartParameters</p>
 */
public class JobStartParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.NameInMap("jobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("localVariables")
    private java.util.List < LocalVariable > localVariables;

    @com.aliyun.core.annotation.NameInMap("resourceQueueName")
    private String resourceQueueName;

    @com.aliyun.core.annotation.NameInMap("restoreStrategy")
    private DeploymentRestoreStrategy restoreStrategy;

    private JobStartParameters(Builder builder) {
        this.deploymentId = builder.deploymentId;
        this.jobId = builder.jobId;
        this.localVariables = builder.localVariables;
        this.resourceQueueName = builder.resourceQueueName;
        this.restoreStrategy = builder.restoreStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobStartParameters create() {
        return builder().build();
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return localVariables
     */
    public java.util.List < LocalVariable > getLocalVariables() {
        return this.localVariables;
    }

    /**
     * @return resourceQueueName
     */
    public String getResourceQueueName() {
        return this.resourceQueueName;
    }

    /**
     * @return restoreStrategy
     */
    public DeploymentRestoreStrategy getRestoreStrategy() {
        return this.restoreStrategy;
    }

    public static final class Builder {
        private String deploymentId; 
        private String jobId; 
        private java.util.List < LocalVariable > localVariables; 
        private String resourceQueueName; 
        private DeploymentRestoreStrategy restoreStrategy; 

        /**
         * deploymentId.
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * jobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * localVariables.
         */
        public Builder localVariables(java.util.List < LocalVariable > localVariables) {
            this.localVariables = localVariables;
            return this;
        }

        /**
         * resourceQueueName.
         */
        public Builder resourceQueueName(String resourceQueueName) {
            this.resourceQueueName = resourceQueueName;
            return this;
        }

        /**
         * restoreStrategy.
         */
        public Builder restoreStrategy(DeploymentRestoreStrategy restoreStrategy) {
            this.restoreStrategy = restoreStrategy;
            return this;
        }

        public JobStartParameters build() {
            return new JobStartParameters(this);
        } 

    } 

}
