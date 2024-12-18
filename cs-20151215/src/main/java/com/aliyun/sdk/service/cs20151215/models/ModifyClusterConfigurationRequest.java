// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
    private java.util.List<CustomizeConfig> customizeConfig;

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
    public java.util.List<CustomizeConfig> getCustomizeConfig() {
        return this.customizeConfig;
    }

    public static final class Builder extends Request.Builder<ModifyClusterConfigurationRequest, Builder> {
        private String clusterId; 
        private java.util.List<CustomizeConfig> customizeConfig; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterConfigurationRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.customizeConfig = request.customizeConfig;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc0f87de0b8fb403f86e10e204f83****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The custom configurations.</p>
         */
        public Builder customizeConfig(java.util.List<CustomizeConfig> customizeConfig) {
            this.putBodyParameter("customize_config", customizeConfig);
            this.customizeConfig = customizeConfig;
            return this;
        }

        @Override
        public ModifyClusterConfigurationRequest build() {
            return new ModifyClusterConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyClusterConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterConfigurationRequest</p>
     */
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
             * <p>The name of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxRequestsInflight</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link ModifyClusterConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterConfigurationRequest</p>
     */
    public static class CustomizeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configs")
        private java.util.List<Configs> configs;

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
        public java.util.List<Configs> getConfigs() {
            return this.configs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<Configs> configs; 
            private String name; 

            /**
             * <p>The custom configurations.</p>
             */
            public Builder configs(java.util.List<Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * <p>The name of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>kube-apiserver</p>
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
