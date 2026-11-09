// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListModelProviderLlmCodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelProviderLlmCodesResponseBody</p>
 */
public class ListModelProviderLlmCodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListModelProviderLlmCodesResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelProviderLlmCodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Data data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListModelProviderLlmCodesResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The paginated data object that contains a list of LLM information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records after filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListModelProviderLlmCodesResponseBody build() {
            return new ListModelProviderLlmCodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelProviderLlmCodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelProviderLlmCodesResponseBody</p>
     */
    public static class CreditMultiplier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private Float max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Float min;

        private CreditMultiplier(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreditMultiplier create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Float getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Float getMin() {
            return this.min;
        }

        public static final class Builder {
            private Float max; 
            private Float min; 

            private Builder() {
            } 

            private Builder(CreditMultiplier model) {
                this.max = model.max;
                this.min = model.min;
            } 

            /**
             * <p>The upper limit of the multiplier. An empty value indicates no upper limit. For example, if the minimum value is 1 and the maximum value is empty, it is displayed as starting from 1x.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder max(Float max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The lower limit of the multiplier. If this value is equal to the maximum value, the multiplier is fixed. For example, if both the minimum and maximum values are 2, it is displayed as 2x.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder min(Float min) {
                this.min = min;
                return this;
            }

            public CreditMultiplier build() {
                return new CreditMultiplier(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelProviderLlmCodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelProviderLlmCodesResponseBody</p>
     */
    public static class InferenceMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestModality")
        private java.util.List<String> requestModality;

        @com.aliyun.core.annotation.NameInMap("ResponseModality")
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
             * <p>The list of request modalities, such as Text, Image, and Audio.</p>
             */
            public Builder requestModality(java.util.List<String> requestModality) {
                this.requestModality = requestModality;
                return this;
            }

            /**
             * <p>The list of response modalities, such as Text, Image, and Audio.</p>
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
     * {@link ListModelProviderLlmCodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelProviderLlmCodesResponseBody</p>
     */
    public static class Prices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("PriceName")
        private String priceName;

        @com.aliyun.core.annotation.NameInMap("PriceUnit")
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
             * <p>The price in string format, such as 0.2.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * <p>The name of the price item, such as input, output, or image generation.</p>
             * 
             * <strong>example:</strong>
             * <p>Input</p>
             */
            public Builder priceName(String priceName) {
                this.priceName = priceName;
                return this;
            }

            /**
             * <p>The price unit, such as per image or per 1,000 tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>Per image</p>
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
     * {@link ListModelProviderLlmCodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelProviderLlmCodesResponseBody</p>
     */
    public static class LlmInfoListPrices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Prices")
        private java.util.List<Prices> prices;

        @com.aliyun.core.annotation.NameInMap("RangeName")
        private String rangeName;

        private LlmInfoListPrices(Builder builder) {
            this.prices = builder.prices;
            this.rangeName = builder.rangeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LlmInfoListPrices create() {
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

            private Builder(LlmInfoListPrices model) {
                this.prices = model.prices;
                this.rangeName = model.rangeName;
            } 

            /**
             * <p>The list of prices within the range.</p>
             */
            public Builder prices(java.util.List<Prices> prices) {
                this.prices = prices;
                return this;
            }

            /**
             * <p>The name of the range, such as Default or 0-1M tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder rangeName(String rangeName) {
                this.rangeName = rangeName;
                return this;
            }

            public LlmInfoListPrices build() {
                return new LlmInfoListPrices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelProviderLlmCodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelProviderLlmCodesResponseBody</p>
     */
    public static class LlmInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreditMultiplier")
        private CreditMultiplier creditMultiplier;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.List<String> features;

        @com.aliyun.core.annotation.NameInMap("InferenceMetadata")
        private InferenceMetadata inferenceMetadata;

        @com.aliyun.core.annotation.NameInMap("LlmCode")
        private String llmCode;

        @com.aliyun.core.annotation.NameInMap("ModelBrand")
        private String modelBrand;

        @com.aliyun.core.annotation.NameInMap("ModelInfo")
        private java.util.Map<String, ?> modelInfo;

        @com.aliyun.core.annotation.NameInMap("ModelSeries")
        private String modelSeries;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Prices")
        private java.util.List<LlmInfoListPrices> prices;

        @com.aliyun.core.annotation.NameInMap("PublishedTime")
        private String publishedTime;

        @com.aliyun.core.annotation.NameInMap("Recommended")
        private Boolean recommended;

        @com.aliyun.core.annotation.NameInMap("RiskType")
        private String riskType;

        private LlmInfoList(Builder builder) {
            this.creditMultiplier = builder.creditMultiplier;
            this.description = builder.description;
            this.features = builder.features;
            this.inferenceMetadata = builder.inferenceMetadata;
            this.llmCode = builder.llmCode;
            this.modelBrand = builder.modelBrand;
            this.modelInfo = builder.modelInfo;
            this.modelSeries = builder.modelSeries;
            this.name = builder.name;
            this.prices = builder.prices;
            this.publishedTime = builder.publishedTime;
            this.recommended = builder.recommended;
            this.riskType = builder.riskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LlmInfoList create() {
            return builder().build();
        }

        /**
         * @return creditMultiplier
         */
        public CreditMultiplier getCreditMultiplier() {
            return this.creditMultiplier;
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
         * @return llmCode
         */
        public String getLlmCode() {
            return this.llmCode;
        }

        /**
         * @return modelBrand
         */
        public String getModelBrand() {
            return this.modelBrand;
        }

        /**
         * @return modelInfo
         */
        public java.util.Map<String, ?> getModelInfo() {
            return this.modelInfo;
        }

        /**
         * @return modelSeries
         */
        public String getModelSeries() {
            return this.modelSeries;
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
        public java.util.List<LlmInfoListPrices> getPrices() {
            return this.prices;
        }

        /**
         * @return publishedTime
         */
        public String getPublishedTime() {
            return this.publishedTime;
        }

        /**
         * @return recommended
         */
        public Boolean getRecommended() {
            return this.recommended;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        public static final class Builder {
            private CreditMultiplier creditMultiplier; 
            private String description; 
            private java.util.List<String> features; 
            private InferenceMetadata inferenceMetadata; 
            private String llmCode; 
            private String modelBrand; 
            private java.util.Map<String, ?> modelInfo; 
            private String modelSeries; 
            private String name; 
            private java.util.List<LlmInfoListPrices> prices; 
            private String publishedTime; 
            private Boolean recommended; 
            private String riskType; 

            private Builder() {
            } 

            private Builder(LlmInfoList model) {
                this.creditMultiplier = model.creditMultiplier;
                this.description = model.description;
                this.features = model.features;
                this.inferenceMetadata = model.inferenceMetadata;
                this.llmCode = model.llmCode;
                this.modelBrand = model.modelBrand;
                this.modelInfo = model.modelInfo;
                this.modelSeries = model.modelSeries;
                this.name = model.name;
                this.prices = model.prices;
                this.publishedTime = model.publishedTime;
                this.recommended = model.recommended;
                this.riskType = model.riskType;
            } 

            /**
             * <p>The credit consumption multiplier. An empty value indicates that the model does not participate in credit billing.</p>
             */
            public Builder creditMultiplier(CreditMultiplier creditMultiplier) {
                this.creditMultiplier = creditMultiplier;
                return this;
            }

            /**
             * <p>The model description.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen image generation model that supports text-to-image generation and image editing</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of model features, such as function-calling, web-search, and structured-outputs.</p>
             */
            public Builder features(java.util.List<String> features) {
                this.features = features;
                return this;
            }

            /**
             * <p>The inference metadata, including request and response modalities.</p>
             */
            public Builder inferenceMetadata(InferenceMetadata inferenceMetadata) {
                this.inferenceMetadata = inferenceMetadata;
                return this;
            }

            /**
             * <p>The LLM code, such as qwen-image-2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-image-2.0</p>
             */
            public Builder llmCode(String llmCode) {
                this.llmCode = llmCode;
                return this;
            }

            /**
             * <p>The model brand, such as Qwen, Wanx, or DeepSeek. This parameter is returned only for models annotated in the platform-side model pool.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen</p>
             */
            public Builder modelBrand(String modelBrand) {
                this.modelBrand = modelBrand;
                return this;
            }

            /**
             * <p>The model information, such as context window size and maximum input/output tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;contextWindow&quot;:1000000,&quot;maxInputTokens&quot;:991808,&quot;maxReasoningTokens&quot;:262144,&quot;reasoningMaxInputTokens&quot;:983616,&quot;maxOutputTokens&quot;:131072,&quot;reasoningMaxOutputTokens&quot;:131072}</p>
             */
            public Builder modelInfo(java.util.Map<String, ?> modelInfo) {
                this.modelInfo = modelInfo;
                return this;
            }

            /**
             * <p>The model series, such as Qwen-Max or DeepSeek. This parameter is returned only for the wuying-credit provider.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen-Max</p>
             */
            public Builder modelSeries(String modelSeries) {
                this.modelSeries = modelSeries;
                return this;
            }

            /**
             * <p>The model name, such as Qwen-Image-2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen-Image-2.0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of price information.</p>
             */
            public Builder prices(java.util.List<LlmInfoListPrices> prices) {
                this.prices = prices;
                return this;
            }

            /**
             * <p>The time when the model was published, in ISO 8601 format, such as 2026-03-04T06:25:17.000+00:00.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-04T06:25:17.000+00:00</p>
             */
            public Builder publishedTime(String publishedTime) {
                this.publishedTime = publishedTime;
                return this;
            }

            /**
             * <p>Indicates whether the model is recommended. This is a tri-state value: true indicates that the model is recommended for display, false indicates that the model is explicitly not recommended, and null indicates that the status is not applicable, such as for non-Bailian models or unannotated models.</p>
             */
            public Builder recommended(Boolean recommended) {
                this.recommended = recommended;
                return this;
            }

            /**
             * <p>The model risk type. This parameter is returned only when includeRiskInfo is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            public LlmInfoList build() {
                return new LlmInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelProviderLlmCodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelProviderLlmCodesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LlmInfoList")
        private java.util.List<LlmInfoList> llmInfoList;

        private Data(Builder builder) {
            this.llmInfoList = builder.llmInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return llmInfoList
         */
        public java.util.List<LlmInfoList> getLlmInfoList() {
            return this.llmInfoList;
        }

        public static final class Builder {
            private java.util.List<LlmInfoList> llmInfoList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.llmInfoList = model.llmInfoList;
            } 

            /**
             * <p>The LLM information list.</p>
             */
            public Builder llmInfoList(java.util.List<LlmInfoList> llmInfoList) {
                this.llmInfoList = llmInfoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
