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
 * {@link ModelSelection} extends {@link TeaModel}
 *
 * <p>ModelSelection</p>
 */
public class ModelSelection extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("convenienceAliasEnabled")
    private Boolean convenienceAliasEnabled;

    @com.aliyun.core.annotation.NameInMap("endpoints")
    private java.util.List<String> endpoints;

    @com.aliyun.core.annotation.NameInMap("fallbackChains")
    private java.util.List<FallbackChains> fallbackChains;

    @com.aliyun.core.annotation.NameInMap("modelGroupIds")
    private java.util.List<String> modelGroupIds;

    @com.aliyun.core.annotation.NameInMap("models")
    private java.util.List<Models> models;

    private ModelSelection(Builder builder) {
        this.convenienceAliasEnabled = builder.convenienceAliasEnabled;
        this.endpoints = builder.endpoints;
        this.fallbackChains = builder.fallbackChains;
        this.modelGroupIds = builder.modelGroupIds;
        this.models = builder.models;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelSelection create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return convenienceAliasEnabled
     */
    public Boolean getConvenienceAliasEnabled() {
        return this.convenienceAliasEnabled;
    }

    /**
     * @return endpoints
     */
    public java.util.List<String> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return fallbackChains
     */
    public java.util.List<FallbackChains> getFallbackChains() {
        return this.fallbackChains;
    }

    /**
     * @return modelGroupIds
     */
    public java.util.List<String> getModelGroupIds() {
        return this.modelGroupIds;
    }

    /**
     * @return models
     */
    public java.util.List<Models> getModels() {
        return this.models;
    }

    public static final class Builder {
        private Boolean convenienceAliasEnabled; 
        private java.util.List<String> endpoints; 
        private java.util.List<FallbackChains> fallbackChains; 
        private java.util.List<String> modelGroupIds; 
        private java.util.List<Models> models; 

        private Builder() {
        } 

        private Builder(ModelSelection model) {
            this.convenienceAliasEnabled = model.convenienceAliasEnabled;
            this.endpoints = model.endpoints;
            this.fallbackChains = model.fallbackChains;
            this.modelGroupIds = model.modelGroupIds;
            this.models = model.models;
        } 

        /**
         * <p>Specifies whether to enable convenience aliases. When enabled, all selected model names must be unique.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder convenienceAliasEnabled(Boolean convenienceAliasEnabled) {
            this.convenienceAliasEnabled = convenienceAliasEnabled;
            return this;
        }

        /**
         * <p>The collection of explicitly selected built-in endpoint (route) names. This parameter is required and cannot be empty.</p>
         */
        public Builder endpoints(java.util.List<String> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>The ordered fallback chains configured by endpoint and initial model.</p>
         */
        public Builder fallbackChains(java.util.List<FallbackChains> fallbackChains) {
            this.fallbackChains = fallbackChains;
            return this;
        }

        /**
         * <p>The selected model group IDs within the instance. Group identity is retained, the union of current members and single-selected models is calculated, and empty groups can be saved as drafts.</p>
         */
        public Builder modelGroupIds(java.util.List<String> modelGroupIds) {
            this.modelGroupIds = modelGroupIds;
            return this;
        }

        /**
         * <p>The selected model collection.</p>
         */
        public Builder models(java.util.List<Models> models) {
            this.models = models;
            return this;
        }

        public ModelSelection build() {
            return new ModelSelection(this);
        } 

    } 

    /**
     * 
     * {@link ModelSelection} extends {@link TeaModel}
     *
     * <p>ModelSelection</p>
     */
    public static class FallbackChains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("fallbackModelCardIds")
        private java.util.List<String> fallbackModelCardIds;

        @com.aliyun.core.annotation.NameInMap("sourceModelCardId")
        private String sourceModelCardId;

        private FallbackChains(Builder builder) {
            this.endpoint = builder.endpoint;
            this.fallbackModelCardIds = builder.fallbackModelCardIds;
            this.sourceModelCardId = builder.sourceModelCardId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FallbackChains create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return fallbackModelCardIds
         */
        public java.util.List<String> getFallbackModelCardIds() {
            return this.fallbackModelCardIds;
        }

        /**
         * @return sourceModelCardId
         */
        public String getSourceModelCardId() {
            return this.sourceModelCardId;
        }

        public static final class Builder {
            private String endpoint; 
            private java.util.List<String> fallbackModelCardIds; 
            private String sourceModelCardId; 

            private Builder() {
            } 

            private Builder(FallbackChains model) {
                this.endpoint = model.endpoint;
                this.fallbackModelCardIds = model.fallbackModelCardIds;
                this.sourceModelCardId = model.sourceModelCardId;
            } 

            /**
             * <p>The endpoint name to which the chain belongs. It must be one of the currently selected endpoints.</p>
             * 
             * <strong>example:</strong>
             * <p>create-chat-completion</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The ordered collection of fallback model card IDs.</p>
             */
            public Builder fallbackModelCardIds(java.util.List<String> fallbackModelCardIds) {
                this.fallbackModelCardIds = fallbackModelCardIds;
                return this;
            }

            /**
             * <p>The source model card ID.</p>
             * 
             * <strong>example:</strong>
             * <p>msc-d00000000000000000000</p>
             */
            public Builder sourceModelCardId(String sourceModelCardId) {
                this.sourceModelCardId = sourceModelCardId;
                return this;
            }

            public FallbackChains build() {
                return new FallbackChains(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelSelection} extends {@link TeaModel}
     *
     * <p>ModelSelection</p>
     */
    public static class Models extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelCardId")
        private String modelCardId;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        private Models(Builder builder) {
            this.modelCardId = builder.modelCardId;
            this.serviceId = builder.serviceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return modelCardId
         */
        public String getModelCardId() {
            return this.modelCardId;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        public static final class Builder {
            private String modelCardId; 
            private String serviceId; 

            private Builder() {
            } 

            private Builder(Models model) {
                this.modelCardId = model.modelCardId;
                this.serviceId = model.serviceId;
            } 

            /**
             * <p>The model card ID.</p>
             * 
             * <strong>example:</strong>
             * <p>msc-d00000000000000000000</p>
             */
            public Builder modelCardId(String modelCardId) {
                this.modelCardId = modelCardId;
                return this;
            }

            /**
             * <p>The explicit execution target AI service ID for the model. This parameter is optional and takes precedence over the provider default.</p>
             * 
             * <strong>example:</strong>
             * <p>svc-d00000000000000000000</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            public Models build() {
                return new Models(this);
            } 

        } 

    }
}
