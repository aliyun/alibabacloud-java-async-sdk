// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link ListModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelsResponseBody</p>
 */
public class ListModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("models")
    private java.util.List<Models> models;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListModelsResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxResults = builder.maxResults;
        this.models = builder.models;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return models
     */
    public java.util.List<Models> getModels() {
        return this.models;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private Long httpStatusCode; 
        private Long maxResults; 
        private java.util.List<Models> models; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListModelsResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.maxResults = model.maxResults;
            this.models = model.models;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * models.
         */
        public Builder models(java.util.List<Models> models) {
            this.models = models;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListModelsResponseBody build() {
            return new ListModelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelsResponseBody</p>
     */
    public static class InferenceMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("requestModality")
        private java.util.List<String> requestModality;

        @com.aliyun.core.annotation.NameInMap("responseModality")
        private java.util.List<String> responseModality;

        private InferenceMetadata(Builder builder) {
            this.requestModality = builder.requestModality;
            this.responseModality = builder.responseModality;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InferenceMetadata create() {
            return builder().build();
        }

        /**
         * @return requestModality
         */
        public java.util.List<String> getRequestModality() {
            return this.requestModality;
        }

        /**
         * @return responseModality
         */
        public java.util.List<String> getResponseModality() {
            return this.responseModality;
        }

        public static final class Builder {
            private java.util.List<String> requestModality; 
            private java.util.List<String> responseModality; 

            private Builder() {
            } 

            private Builder(InferenceMetadata model) {
                this.requestModality = model.requestModality;
                this.responseModality = model.responseModality;
            } 

            /**
             * requestModality.
             */
            public Builder requestModality(java.util.List<String> requestModality) {
                this.requestModality = requestModality;
                return this;
            }

            /**
             * responseModality.
             */
            public Builder responseModality(java.util.List<String> responseModality) {
                this.responseModality = responseModality;
                return this;
            }

            public InferenceMetadata build() {
                return new InferenceMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelsResponseBody</p>
     */
    public static class ModelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contextWindow")
        private Long contextWindow;

        @com.aliyun.core.annotation.NameInMap("maxInputTokens")
        private Long maxInputTokens;

        @com.aliyun.core.annotation.NameInMap("maxOutputTokens")
        private Long maxOutputTokens;

        @com.aliyun.core.annotation.NameInMap("maxReasoningTokens")
        private Long maxReasoningTokens;

        @com.aliyun.core.annotation.NameInMap("reasoningMaxInputTokens")
        private Long reasoningMaxInputTokens;

        @com.aliyun.core.annotation.NameInMap("reasoningMaxOutputTokens")
        private Long reasoningMaxOutputTokens;

        private ModelInfo(Builder builder) {
            this.contextWindow = builder.contextWindow;
            this.maxInputTokens = builder.maxInputTokens;
            this.maxOutputTokens = builder.maxOutputTokens;
            this.maxReasoningTokens = builder.maxReasoningTokens;
            this.reasoningMaxInputTokens = builder.reasoningMaxInputTokens;
            this.reasoningMaxOutputTokens = builder.reasoningMaxOutputTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelInfo create() {
            return builder().build();
        }

        /**
         * @return contextWindow
         */
        public Long getContextWindow() {
            return this.contextWindow;
        }

        /**
         * @return maxInputTokens
         */
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        /**
         * @return maxOutputTokens
         */
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        /**
         * @return maxReasoningTokens
         */
        public Long getMaxReasoningTokens() {
            return this.maxReasoningTokens;
        }

        /**
         * @return reasoningMaxInputTokens
         */
        public Long getReasoningMaxInputTokens() {
            return this.reasoningMaxInputTokens;
        }

        /**
         * @return reasoningMaxOutputTokens
         */
        public Long getReasoningMaxOutputTokens() {
            return this.reasoningMaxOutputTokens;
        }

        public static final class Builder {
            private Long contextWindow; 
            private Long maxInputTokens; 
            private Long maxOutputTokens; 
            private Long maxReasoningTokens; 
            private Long reasoningMaxInputTokens; 
            private Long reasoningMaxOutputTokens; 

            private Builder() {
            } 

            private Builder(ModelInfo model) {
                this.contextWindow = model.contextWindow;
                this.maxInputTokens = model.maxInputTokens;
                this.maxOutputTokens = model.maxOutputTokens;
                this.maxReasoningTokens = model.maxReasoningTokens;
                this.reasoningMaxInputTokens = model.reasoningMaxInputTokens;
                this.reasoningMaxOutputTokens = model.reasoningMaxOutputTokens;
            } 

            /**
             * contextWindow.
             */
            public Builder contextWindow(Long contextWindow) {
                this.contextWindow = contextWindow;
                return this;
            }

            /**
             * maxInputTokens.
             */
            public Builder maxInputTokens(Long maxInputTokens) {
                this.maxInputTokens = maxInputTokens;
                return this;
            }

            /**
             * maxOutputTokens.
             */
            public Builder maxOutputTokens(Long maxOutputTokens) {
                this.maxOutputTokens = maxOutputTokens;
                return this;
            }

            /**
             * maxReasoningTokens.
             */
            public Builder maxReasoningTokens(Long maxReasoningTokens) {
                this.maxReasoningTokens = maxReasoningTokens;
                return this;
            }

            /**
             * reasoningMaxInputTokens.
             */
            public Builder reasoningMaxInputTokens(Long reasoningMaxInputTokens) {
                this.reasoningMaxInputTokens = reasoningMaxInputTokens;
                return this;
            }

            /**
             * reasoningMaxOutputTokens.
             */
            public Builder reasoningMaxOutputTokens(Long reasoningMaxOutputTokens) {
                this.reasoningMaxOutputTokens = reasoningMaxOutputTokens;
                return this;
            }

            public ModelInfo build() {
                return new ModelInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelsResponseBody</p>
     */
    public static class Prices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("priceName")
        private String priceName;

        @com.aliyun.core.annotation.NameInMap("priceUnit")
        private String priceUnit;

        private Prices(Builder builder) {
            this.price = builder.price;
            this.priceName = builder.priceName;
            this.priceUnit = builder.priceUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Prices create() {
            return builder().build();
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return priceName
         */
        public String getPriceName() {
            return this.priceName;
        }

        /**
         * @return priceUnit
         */
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public static final class Builder {
            private String price; 
            private String priceName; 
            private String priceUnit; 

            private Builder() {
            } 

            private Builder(Prices model) {
                this.price = model.price;
                this.priceName = model.priceName;
                this.priceUnit = model.priceUnit;
            } 

            /**
             * price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * priceName.
             */
            public Builder priceName(String priceName) {
                this.priceName = priceName;
                return this;
            }

            /**
             * priceUnit.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            public Prices build() {
                return new Prices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelsResponseBody</p>
     */
    public static class ModelsPrices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("prices")
        private java.util.List<Prices> prices;

        @com.aliyun.core.annotation.NameInMap("rangeName")
        private String rangeName;

        private ModelsPrices(Builder builder) {
            this.prices = builder.prices;
            this.rangeName = builder.rangeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelsPrices create() {
            return builder().build();
        }

        /**
         * @return prices
         */
        public java.util.List<Prices> getPrices() {
            return this.prices;
        }

        /**
         * @return rangeName
         */
        public String getRangeName() {
            return this.rangeName;
        }

        public static final class Builder {
            private java.util.List<Prices> prices; 
            private String rangeName; 

            private Builder() {
            } 

            private Builder(ModelsPrices model) {
                this.prices = model.prices;
                this.rangeName = model.rangeName;
            } 

            /**
             * prices.
             */
            public Builder prices(java.util.List<Prices> prices) {
                this.prices = prices;
                return this;
            }

            /**
             * rangeName.
             */
            public Builder rangeName(String rangeName) {
                this.rangeName = rangeName;
                return this;
            }

            public ModelsPrices build() {
                return new ModelsPrices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelsResponseBody</p>
     */
    public static class Models extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("capabilities")
        private java.util.List<String> capabilities;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("features")
        private java.util.List<String> features;

        @com.aliyun.core.annotation.NameInMap("inferenceMetadata")
        private InferenceMetadata inferenceMetadata;

        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("modelInfo")
        private ModelInfo modelInfo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("prices")
        private java.util.List<ModelsPrices> prices;

        @com.aliyun.core.annotation.NameInMap("provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("publishedTime")
        private Long publishedTime;

        private Models(Builder builder) {
            this.capabilities = builder.capabilities;
            this.description = builder.description;
            this.features = builder.features;
            this.inferenceMetadata = builder.inferenceMetadata;
            this.model = builder.model;
            this.modelInfo = builder.modelInfo;
            this.name = builder.name;
            this.prices = builder.prices;
            this.provider = builder.provider;
            this.publishedTime = builder.publishedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return capabilities
         */
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return features
         */
        public java.util.List<String> getFeatures() {
            return this.features;
        }

        /**
         * @return inferenceMetadata
         */
        public InferenceMetadata getInferenceMetadata() {
            return this.inferenceMetadata;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return modelInfo
         */
        public ModelInfo getModelInfo() {
            return this.modelInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return prices
         */
        public java.util.List<ModelsPrices> getPrices() {
            return this.prices;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return publishedTime
         */
        public Long getPublishedTime() {
            return this.publishedTime;
        }

        public static final class Builder {
            private java.util.List<String> capabilities; 
            private String description; 
            private java.util.List<String> features; 
            private InferenceMetadata inferenceMetadata; 
            private String model; 
            private ModelInfo modelInfo; 
            private String name; 
            private java.util.List<ModelsPrices> prices; 
            private String provider; 
            private Long publishedTime; 

            private Builder() {
            } 

            private Builder(Models model) {
                this.capabilities = model.capabilities;
                this.description = model.description;
                this.features = model.features;
                this.inferenceMetadata = model.inferenceMetadata;
                this.model = model.model;
                this.modelInfo = model.modelInfo;
                this.name = model.name;
                this.prices = model.prices;
                this.provider = model.provider;
                this.publishedTime = model.publishedTime;
            } 

            /**
             * capabilities.
             */
            public Builder capabilities(java.util.List<String> capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * features.
             */
            public Builder features(java.util.List<String> features) {
                this.features = features;
                return this;
            }

            /**
             * inferenceMetadata.
             */
            public Builder inferenceMetadata(InferenceMetadata inferenceMetadata) {
                this.inferenceMetadata = inferenceMetadata;
                return this;
            }

            /**
             * model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * modelInfo.
             */
            public Builder modelInfo(ModelInfo modelInfo) {
                this.modelInfo = modelInfo;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * prices.
             */
            public Builder prices(java.util.List<ModelsPrices> prices) {
                this.prices = prices;
                return this;
            }

            /**
             * provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * publishedTime.
             */
            public Builder publishedTime(Long publishedTime) {
                this.publishedTime = publishedTime;
                return this;
            }

            public Models build() {
                return new Models(this);
            } 

        } 

    }
}
