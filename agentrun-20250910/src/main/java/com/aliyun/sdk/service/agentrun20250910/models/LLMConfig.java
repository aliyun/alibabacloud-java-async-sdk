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
 * {@link LLMConfig} extends {@link TeaModel}
 *
 * <p>LLMConfig</p>
 */
public class LLMConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("modelServiceName")
    private String modelServiceName;

    private LLMConfig(Builder builder) {
        this.config = builder.config;
        this.modelServiceName = builder.modelServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LLMConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    public static final class Builder {
        private Config config; 
        private String modelServiceName; 

        private Builder() {
        } 

        private Builder(LLMConfig model) {
            this.config = model.config;
            this.modelServiceName = model.modelServiceName;
        } 

        /**
         * config.
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * modelServiceName.
         */
        public Builder modelServiceName(String modelServiceName) {
            this.modelServiceName = modelServiceName;
            return this;
        }

        public LLMConfig build() {
            return new LLMConfig(this);
        } 

    } 

    /**
     * 
     * {@link LLMConfig} extends {@link TeaModel}
     *
     * <p>LLMConfig</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        private Config(Builder builder) {
            this.model = builder.model;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        public static final class Builder {
            private String model; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.model = model.model;
            } 

            /**
             * model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
