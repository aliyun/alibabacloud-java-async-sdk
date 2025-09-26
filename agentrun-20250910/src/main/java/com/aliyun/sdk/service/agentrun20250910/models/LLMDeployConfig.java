// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link LLMDeployConfig} extends {@link TeaModel}
 *
 * <p>LLMDeployConfig</p>
 */
public class LLMDeployConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoDeploy")
    private Boolean autoDeploy;

    @com.aliyun.core.annotation.NameInMap("backendScene")
    private String backendScene;

    @com.aliyun.core.annotation.NameInMap("customDomainIds")
    private java.util.List<String> customDomainIds;

    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.NameInMap("policyConfigs")
    private java.util.List<PolicyConfig> policyConfigs;

    @com.aliyun.core.annotation.NameInMap("serviceConfigs")
    private java.util.List<TargetServiceConfig> serviceConfigs;

    private LLMDeployConfig(Builder builder) {
        this.autoDeploy = builder.autoDeploy;
        this.backendScene = builder.backendScene;
        this.customDomainIds = builder.customDomainIds;
        this.gatewayType = builder.gatewayType;
        this.policyConfigs = builder.policyConfigs;
        this.serviceConfigs = builder.serviceConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LLMDeployConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoDeploy
     */
    public Boolean getAutoDeploy() {
        return this.autoDeploy;
    }

    /**
     * @return backendScene
     */
    public String getBackendScene() {
        return this.backendScene;
    }

    /**
     * @return customDomainIds
     */
    public java.util.List<String> getCustomDomainIds() {
        return this.customDomainIds;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return policyConfigs
     */
    public java.util.List<PolicyConfig> getPolicyConfigs() {
        return this.policyConfigs;
    }

    /**
     * @return serviceConfigs
     */
    public java.util.List<TargetServiceConfig> getServiceConfigs() {
        return this.serviceConfigs;
    }

    public static final class Builder {
        private Boolean autoDeploy; 
        private String backendScene; 
        private java.util.List<String> customDomainIds; 
        private String gatewayType; 
        private java.util.List<PolicyConfig> policyConfigs; 
        private java.util.List<TargetServiceConfig> serviceConfigs; 

        private Builder() {
        } 

        private Builder(LLMDeployConfig model) {
            this.autoDeploy = model.autoDeploy;
            this.backendScene = model.backendScene;
            this.customDomainIds = model.customDomainIds;
            this.gatewayType = model.gatewayType;
            this.policyConfigs = model.policyConfigs;
            this.serviceConfigs = model.serviceConfigs;
        } 

        /**
         * autoDeploy.
         */
        public Builder autoDeploy(Boolean autoDeploy) {
            this.autoDeploy = autoDeploy;
            return this;
        }

        /**
         * backendScene.
         */
        public Builder backendScene(String backendScene) {
            this.backendScene = backendScene;
            return this;
        }

        /**
         * customDomainIds.
         */
        public Builder customDomainIds(java.util.List<String> customDomainIds) {
            this.customDomainIds = customDomainIds;
            return this;
        }

        /**
         * gatewayType.
         */
        public Builder gatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * policyConfigs.
         */
        public Builder policyConfigs(java.util.List<PolicyConfig> policyConfigs) {
            this.policyConfigs = policyConfigs;
            return this;
        }

        /**
         * serviceConfigs.
         */
        public Builder serviceConfigs(java.util.List<TargetServiceConfig> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }

        public LLMDeployConfig build() {
            return new LLMDeployConfig(this);
        } 

    } 

}
