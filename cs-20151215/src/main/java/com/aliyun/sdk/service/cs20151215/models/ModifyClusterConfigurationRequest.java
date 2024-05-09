// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterConfigurationRequest</p>
 */
public class ModifyClusterConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customize_config")
    private java.util.List < CustomizeConfig> customizeConfig;

    private ModifyClusterConfigurationRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.customizeConfig = builder.customizeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return customizeConfig
     */
    public java.util.List < CustomizeConfig> getCustomizeConfig() {
        return this.customizeConfig;
    }

    public static final class Builder extends Request.Builder<ModifyClusterConfigurationRequest, Builder> {
        private String clusterId; 
        private java.util.List < CustomizeConfig> customizeConfig; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterConfigurationRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.customizeConfig = request.customizeConfig;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The custom configuration.
         */
        public Builder customizeConfig(java.util.List < CustomizeConfig> customizeConfig) {
            this.putBodyParameter("customize_config", customizeConfig);
            this.customizeConfig = customizeConfig;
            return this;
        }

        @Override
        public ModifyClusterConfigurationRequest build() {
            return new ModifyClusterConfigurationRequest(this);
        } 

    } 

    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Configs(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The name of the configuration item.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the configuration item.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
    public static class CustomizeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configs")
        private java.util.List < Configs> configs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private CustomizeConfig(Builder builder) {
            this.configs = builder.configs;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizeConfig create() {
            return builder().build();
        }

        /**
         * @return configs
         */
        public java.util.List < Configs> getConfigs() {
            return this.configs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < Configs> configs; 
            private String name; 

            /**
             * The custom configuration.
             */
            public Builder configs(java.util.List < Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * The name of the component.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CustomizeConfig build() {
                return new CustomizeConfig(this);
            } 

        } 

    }
}
