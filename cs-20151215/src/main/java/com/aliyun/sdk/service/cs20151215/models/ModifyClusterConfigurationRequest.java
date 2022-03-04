// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterConfigurationRequest</p>
 */
public class ModifyClusterConfigurationRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("customize_config")
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
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Custom configuration.
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
        @NameInMap("key")
        private String key;

        @NameInMap("value")
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
        @NameInMap("name")
        private String name;

        @NameInMap("configs")
        private java.util.List < Configs> configs;

        private CustomizeConfig(Builder builder) {
            this.name = builder.name;
            this.configs = builder.configs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizeConfig create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return configs
         */
        public java.util.List < Configs> getConfigs() {
            return this.configs;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < Configs> configs; 

            /**
             * The name of the component.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The custom configuration information.
             */
            public Builder configs(java.util.List < Configs> configs) {
                this.configs = configs;
                return this;
            }

            public CustomizeConfig build() {
                return new CustomizeConfig(this);
            } 

        } 

    }
}
