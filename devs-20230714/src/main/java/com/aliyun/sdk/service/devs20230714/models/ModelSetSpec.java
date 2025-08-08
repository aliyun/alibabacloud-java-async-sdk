// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ModelSetSpec} extends {@link TeaModel}
 *
 * <p>ModelSetSpec</p>
 */
public class ModelSetSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiInvokeType")
    private String apiInvokeType;

    @com.aliyun.core.annotation.NameInMap("authConfig")
    private Authorization authConfig;

    @com.aliyun.core.annotation.NameInMap("baseUrl")
    private String baseUrl;

    @com.aliyun.core.annotation.NameInMap("features")
    private Features features;

    @com.aliyun.core.annotation.NameInMap("modelType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("models")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ModelSetModelProfile> models;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    private ModelSetSpec(Builder builder) {
        this.apiInvokeType = builder.apiInvokeType;
        this.authConfig = builder.authConfig;
        this.baseUrl = builder.baseUrl;
        this.features = builder.features;
        this.modelType = builder.modelType;
        this.models = builder.models;
        this.provider = builder.provider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelSetSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiInvokeType
     */
    public String getApiInvokeType() {
        return this.apiInvokeType;
    }

    /**
     * @return authConfig
     */
    public Authorization getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return baseUrl
     */
    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * @return features
     */
    public Features getFeatures() {
        return this.features;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return models
     */
    public java.util.List<ModelSetModelProfile> getModels() {
        return this.models;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    public static final class Builder {
        private String apiInvokeType; 
        private Authorization authConfig; 
        private String baseUrl; 
        private Features features; 
        private String modelType; 
        private java.util.List<ModelSetModelProfile> models; 
        private String provider; 

        private Builder() {
        } 

        private Builder(ModelSetSpec model) {
            this.apiInvokeType = model.apiInvokeType;
            this.authConfig = model.authConfig;
            this.baseUrl = model.baseUrl;
            this.features = model.features;
            this.modelType = model.modelType;
            this.models = model.models;
            this.provider = model.provider;
        } 

        /**
         * apiInvokeType.
         */
        public Builder apiInvokeType(String apiInvokeType) {
            this.apiInvokeType = apiInvokeType;
            return this;
        }

        /**
         * authConfig.
         */
        public Builder authConfig(Authorization authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * baseUrl.
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * features.
         */
        public Builder features(Features features) {
            this.features = features;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm</p>
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder models(java.util.List<ModelSetModelProfile> models) {
            this.models = models;
            return this;
        }

        /**
         * provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        public ModelSetSpec build() {
            return new ModelSetSpec(this);
        } 

    } 

    /**
     * 
     * {@link ModelSetSpec} extends {@link TeaModel}
     *
     * <p>ModelSetSpec</p>
     */
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentThought")
        private Boolean agentThought;

        @com.aliyun.core.annotation.NameInMap("toolCall")
        private Boolean toolCall;

        @com.aliyun.core.annotation.NameInMap("vision")
        private Boolean vision;

        private Features(Builder builder) {
            this.agentThought = builder.agentThought;
            this.toolCall = builder.toolCall;
            this.vision = builder.vision;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return agentThought
         */
        public Boolean getAgentThought() {
            return this.agentThought;
        }

        /**
         * @return toolCall
         */
        public Boolean getToolCall() {
            return this.toolCall;
        }

        /**
         * @return vision
         */
        public Boolean getVision() {
            return this.vision;
        }

        public static final class Builder {
            private Boolean agentThought; 
            private Boolean toolCall; 
            private Boolean vision; 

            private Builder() {
            } 

            private Builder(Features model) {
                this.agentThought = model.agentThought;
                this.toolCall = model.toolCall;
                this.vision = model.vision;
            } 

            /**
             * agentThought.
             */
            public Builder agentThought(Boolean agentThought) {
                this.agentThought = agentThought;
                return this;
            }

            /**
             * toolCall.
             */
            public Builder toolCall(Boolean toolCall) {
                this.toolCall = toolCall;
                return this;
            }

            /**
             * vision.
             */
            public Builder vision(Boolean vision) {
                this.vision = vision;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
}
