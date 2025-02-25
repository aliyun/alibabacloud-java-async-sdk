// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnvironmentSpec} extends {@link TeaModel}
 *
 * <p>EnvironmentSpec</p>
 */
public class EnvironmentSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("infraStackConfig")
    private InfraStackSpec infraStackConfig;

    @com.aliyun.core.annotation.NameInMap("isAutoDeploy")
    private Boolean isAutoDeploy;

    @com.aliyun.core.annotation.NameInMap("repositoryConfig")
    private RepositoryConfig repositoryConfig;

    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("serviceOverlay")
    private ServiceOverlay serviceOverlay;

    @com.aliyun.core.annotation.NameInMap("templateConfig")
    private TemplateConfig templateConfig;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private EnvironmentSpec(Builder builder) {
        this.alias = builder.alias;
        this.infraStackConfig = builder.infraStackConfig;
        this.isAutoDeploy = builder.isAutoDeploy;
        this.repositoryConfig = builder.repositoryConfig;
        this.roleArn = builder.roleArn;
        this.serviceOverlay = builder.serviceOverlay;
        this.templateConfig = builder.templateConfig;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentSpec create() {
        return builder().build();
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return infraStackConfig
     */
    public InfraStackSpec getInfraStackConfig() {
        return this.infraStackConfig;
    }

    /**
     * @return isAutoDeploy
     */
    public Boolean getIsAutoDeploy() {
        return this.isAutoDeploy;
    }

    /**
     * @return repositoryConfig
     */
    public RepositoryConfig getRepositoryConfig() {
        return this.repositoryConfig;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return serviceOverlay
     */
    public ServiceOverlay getServiceOverlay() {
        return this.serviceOverlay;
    }

    /**
     * @return templateConfig
     */
    public TemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String alias; 
        private InfraStackSpec infraStackConfig; 
        private Boolean isAutoDeploy; 
        private RepositoryConfig repositoryConfig; 
        private String roleArn; 
        private ServiceOverlay serviceOverlay; 
        private TemplateConfig templateConfig; 
        private String type; 

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * infraStackConfig.
         */
        public Builder infraStackConfig(InfraStackSpec infraStackConfig) {
            this.infraStackConfig = infraStackConfig;
            return this;
        }

        /**
         * isAutoDeploy.
         */
        public Builder isAutoDeploy(Boolean isAutoDeploy) {
            this.isAutoDeploy = isAutoDeploy;
            return this;
        }

        /**
         * repositoryConfig.
         */
        public Builder repositoryConfig(RepositoryConfig repositoryConfig) {
            this.repositoryConfig = repositoryConfig;
            return this;
        }

        /**
         * roleArn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * serviceOverlay.
         */
        public Builder serviceOverlay(ServiceOverlay serviceOverlay) {
            this.serviceOverlay = serviceOverlay;
            return this;
        }

        /**
         * templateConfig.
         */
        public Builder templateConfig(TemplateConfig templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public EnvironmentSpec build() {
            return new EnvironmentSpec(this);
        } 

    } 

    public static class ServiceOverlay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("components")
        private java.util.Map < String, ? > components;

        @com.aliyun.core.annotation.NameInMap("resources")
        private java.util.Map < String, ? > resources;

        private ServiceOverlay(Builder builder) {
            this.components = builder.components;
            this.resources = builder.resources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceOverlay create() {
            return builder().build();
        }

        /**
         * @return components
         */
        public java.util.Map < String, ? > getComponents() {
            return this.components;
        }

        /**
         * @return resources
         */
        public java.util.Map < String, ? > getResources() {
            return this.resources;
        }

        public static final class Builder {
            private java.util.Map < String, ? > components; 
            private java.util.Map < String, ? > resources; 

            /**
             * components.
             */
            public Builder components(java.util.Map < String, ? > components) {
                this.components = components;
                return this;
            }

            /**
             * resources.
             */
            public Builder resources(java.util.Map < String, ? > resources) {
                this.resources = resources;
                return this;
            }

            public ServiceOverlay build() {
                return new ServiceOverlay(this);
            } 

        } 

    }
}
