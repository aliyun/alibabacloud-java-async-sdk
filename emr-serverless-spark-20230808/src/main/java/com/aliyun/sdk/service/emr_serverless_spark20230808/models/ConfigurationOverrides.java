// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ConfigurationOverrides} extends {@link TeaModel}
 *
 * <p>ConfigurationOverrides</p>
 */
public class ConfigurationOverrides extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configurations")
    private java.util.List < Configurations> configurations;

    private ConfigurationOverrides(Builder builder) {
        this.configurations = builder.configurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigurationOverrides create() {
        return builder().build();
    }

    /**
     * @return configurations
     */
    public java.util.List < Configurations> getConfigurations() {
        return this.configurations;
    }

    public static final class Builder {
        private java.util.List < Configurations> configurations; 

        /**
         * configurations.
         */
        public Builder configurations(java.util.List < Configurations> configurations) {
            this.configurations = configurations;
            return this;
        }

        public ConfigurationOverrides build() {
            return new ConfigurationOverrides(this);
        } 

    } 

    /**
     * 
     * {@link ConfigurationOverrides} extends {@link TeaModel}
     *
     * <p>ConfigurationOverrides</p>
     */
    public static class Configurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configFileName")
        private String configFileName;

        @com.aliyun.core.annotation.NameInMap("configItemKey")
        private String configItemKey;

        @com.aliyun.core.annotation.NameInMap("configItemValue")
        private String configItemValue;

        private Configurations(Builder builder) {
            this.configFileName = builder.configFileName;
            this.configItemKey = builder.configItemKey;
            this.configItemValue = builder.configItemValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configurations create() {
            return builder().build();
        }

        /**
         * @return configFileName
         */
        public String getConfigFileName() {
            return this.configFileName;
        }

        /**
         * @return configItemKey
         */
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        /**
         * @return configItemValue
         */
        public String getConfigItemValue() {
            return this.configItemValue;
        }

        public static final class Builder {
            private String configFileName; 
            private String configItemKey; 
            private String configItemValue; 

            /**
             * configFileName.
             */
            public Builder configFileName(String configFileName) {
                this.configFileName = configFileName;
                return this;
            }

            /**
             * configItemKey.
             */
            public Builder configItemKey(String configItemKey) {
                this.configItemKey = configItemKey;
                return this;
            }

            /**
             * configItemValue.
             */
            public Builder configItemValue(String configItemValue) {
                this.configItemValue = configItemValue;
                return this;
            }

            public Configurations build() {
                return new Configurations(this);
            } 

        } 

    }
}
