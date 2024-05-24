// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartJobRequestBody} extends {@link TeaModel}
 *
 * <p>StartJobRequestBody</p>
 */
public class StartJobRequestBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.NameInMap("resourceSettingSpec")
    private BriefResourceSetting resourceSettingSpec;

    @com.aliyun.core.annotation.NameInMap("restoreStrategy")
    private DeploymentRestoreStrategy restoreStrategy;

    private StartJobRequestBody(Builder builder) {
        this.deploymentId = builder.deploymentId;
        this.resourceSettingSpec = builder.resourceSettingSpec;
        this.restoreStrategy = builder.restoreStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartJobRequestBody create() {
        return builder().build();
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return resourceSettingSpec
     */
    public BriefResourceSetting getResourceSettingSpec() {
        return this.resourceSettingSpec;
    }

    /**
     * @return restoreStrategy
     */
    public DeploymentRestoreStrategy getRestoreStrategy() {
        return this.restoreStrategy;
    }

    public static final class Builder {
        private String deploymentId; 
        private BriefResourceSetting resourceSettingSpec; 
        private DeploymentRestoreStrategy restoreStrategy; 

        /**
         * deploymentId.
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * resourceSettingSpec.
         */
        public Builder resourceSettingSpec(BriefResourceSetting resourceSettingSpec) {
            this.resourceSettingSpec = resourceSettingSpec;
            return this;
        }

        /**
         * restoreStrategy.
         */
        public Builder restoreStrategy(DeploymentRestoreStrategy restoreStrategy) {
            this.restoreStrategy = restoreStrategy;
            return this;
        }

        public StartJobRequestBody build() {
            return new StartJobRequestBody(this);
        } 

    } 

}
