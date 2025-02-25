// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HttpApiDeployConfig} extends {@link TeaModel}
 *
 * <p>HttpApiDeployConfig</p>
 */
public class HttpApiDeployConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoDeploy")
    private Boolean autoDeploy;

    @com.aliyun.core.annotation.NameInMap("backendScene")
    private String backendScene;

    @com.aliyun.core.annotation.NameInMap("customDomainIds")
    private java.util.List<String> customDomainIds;

    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.NameInMap("policyConfigs")
    private java.util.List<PolicyConfigs> policyConfigs;

    @com.aliyun.core.annotation.NameInMap("serviceConfigs")
    private java.util.List<ServiceConfigs> serviceConfigs;

    private HttpApiDeployConfig(Builder builder) {
        this.autoDeploy = builder.autoDeploy;
        this.backendScene = builder.backendScene;
        this.customDomainIds = builder.customDomainIds;
        this.environmentId = builder.environmentId;
        this.policyConfigs = builder.policyConfigs;
        this.serviceConfigs = builder.serviceConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiDeployConfig create() {
        return builder().build();
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
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return policyConfigs
     */
    public java.util.List<PolicyConfigs> getPolicyConfigs() {
        return this.policyConfigs;
    }

    /**
     * @return serviceConfigs
     */
    public java.util.List<ServiceConfigs> getServiceConfigs() {
        return this.serviceConfigs;
    }

    public static final class Builder {
        private Boolean autoDeploy; 
        private String backendScene; 
        private java.util.List<String> customDomainIds; 
        private String environmentId; 
        private java.util.List<PolicyConfigs> policyConfigs; 
        private java.util.List<ServiceConfigs> serviceConfigs; 

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
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        /**
         * policyConfigs.
         */
        public Builder policyConfigs(java.util.List<PolicyConfigs> policyConfigs) {
            this.policyConfigs = policyConfigs;
            return this;
        }

        /**
         * serviceConfigs.
         */
        public Builder serviceConfigs(java.util.List<ServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }

        public HttpApiDeployConfig build() {
            return new HttpApiDeployConfig(this);
        } 

    } 

    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class AiFallbackConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("serviceIds")
        private java.util.List<String> serviceIds;

        private AiFallbackConfig(Builder builder) {
            this.serviceIds = builder.serviceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiFallbackConfig create() {
            return builder().build();
        }

        /**
         * @return serviceIds
         */
        public java.util.List<String> getServiceIds() {
            return this.serviceIds;
        }

        public static final class Builder {
            private java.util.List<String> serviceIds; 

            /**
             * serviceIds.
             */
            public Builder serviceIds(java.util.List<String> serviceIds) {
                this.serviceIds = serviceIds;
                return this;
            }

            public AiFallbackConfig build() {
                return new AiFallbackConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class PolicyConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aiFallbackConfig")
        private AiFallbackConfig aiFallbackConfig;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private PolicyConfigs(Builder builder) {
            this.aiFallbackConfig = builder.aiFallbackConfig;
            this.enable = builder.enable;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyConfigs create() {
            return builder().build();
        }

        /**
         * @return aiFallbackConfig
         */
        public AiFallbackConfig getAiFallbackConfig() {
            return this.aiFallbackConfig;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private AiFallbackConfig aiFallbackConfig; 
            private Boolean enable; 
            private String type; 

            /**
             * aiFallbackConfig.
             */
            public Builder aiFallbackConfig(AiFallbackConfig aiFallbackConfig) {
                this.aiFallbackConfig = aiFallbackConfig;
                return this;
            }

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PolicyConfigs build() {
                return new PolicyConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class ServiceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("modelNamePattern")
        private String modelNamePattern;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Long weight;

        private ServiceConfigs(Builder builder) {
            this.modelName = builder.modelName;
            this.modelNamePattern = builder.modelNamePattern;
            this.serviceId = builder.serviceId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceConfigs create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelNamePattern
         */
        public String getModelNamePattern() {
            return this.modelNamePattern;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String modelName; 
            private String modelNamePattern; 
            private String serviceId; 
            private Long weight; 

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * modelNamePattern.
             */
            public Builder modelNamePattern(String modelNamePattern) {
                this.modelNamePattern = modelNamePattern;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            public ServiceConfigs build() {
                return new ServiceConfigs(this);
            } 

        } 

    }
}
