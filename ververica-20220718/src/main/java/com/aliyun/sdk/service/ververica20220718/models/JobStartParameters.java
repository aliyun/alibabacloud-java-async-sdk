// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobStartParameters} extends {@link TeaModel}
 *
 * <p>JobStartParameters</p>
 */
public class JobStartParameters extends TeaModel {
    @NameInMap("deploymentId")
    private String deploymentId;

    @NameInMap("restoreStrategy")
    private DeploymentRestoreStrategy restoreStrategy;

    private JobStartParameters(Builder builder) {
        this.deploymentId = builder.deploymentId;
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
     * @return restoreStrategy
     */
    public DeploymentRestoreStrategy getRestoreStrategy() {
        return this.restoreStrategy;
    }

    public static final class Builder {
        private String deploymentId; 
        private DeploymentRestoreStrategy restoreStrategy; 

        /**
         * deploymentId.
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
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
