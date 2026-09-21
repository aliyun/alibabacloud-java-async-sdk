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
 * {@link ListLlmTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLlmTemplatesResponseBody</p>
 */
public class ListLlmTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListLlmTemplatesResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLlmTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListLlmTemplatesResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of returned data objects.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number of the current query results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of query results per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLlmTemplatesResponseBody build() {
            return new ListLlmTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLlmTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLlmTemplatesResponseBody</p>
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
             * <p>The maximum multiplier. An empty value indicates no upper limit. For example, Min=1 with an empty Max is displayed as 1x and above.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder max(Float max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The minimum multiplier. When equal to Max, it is a fixed multiplier. For example, Min=Max=2 is displayed as 2x.</p>
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
     * {@link ListLlmTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLlmTemplatesResponseBody</p>
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
     * {@link ListLlmTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLlmTemplatesResponseBody</p>
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
             * <p>20</p>
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * <p>The price name, such as Input, Output, or Image Generation.</p>
             * 
             * <strong>example:</strong>
             * <p>Input</p>
             */
            public Builder priceName(String priceName) {
                this.priceName = priceName;
                return this;
            }

            /**
             * <p>The price unit, such as per image or per thousand tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>per million tokens</p>
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
     * {@link ListLlmTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLlmTemplatesResponseBody</p>
     */
    public static class DataPrices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Prices")
        private java.util.List<Prices> prices;

        @com.aliyun.core.annotation.NameInMap("RangeName")
        private String rangeName;

        private DataPrices(Builder builder) {
            this.prices = builder.prices;
            this.rangeName = builder.rangeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataPrices create() {
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

            private Builder(DataPrices model) {
                this.prices = model.prices;
                this.rangeName = model.rangeName;
            } 

            /**
             * <p>The list of prices within this range.</p>
             */
            public Builder prices(java.util.List<Prices> prices) {
                this.prices = prices;
                return this;
            }

            /**
             * <p>The range name, such as Default or 0-1M tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder rangeName(String rangeName) {
                this.rangeName = rangeName;
                return this;
            }

            public DataPrices build() {
                return new DataPrices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLlmTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLlmTemplatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("CreditMultiplier")
        private CreditMultiplier creditMultiplier;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.List<String> features;

        @com.aliyun.core.annotation.NameInMap("InferenceMetadata")
        private InferenceMetadata inferenceMetadata;

        @com.aliyun.core.annotation.NameInMap("IsDefaultModel")
        private Boolean isDefaultModel;

        @com.aliyun.core.annotation.NameInMap("LlmCode")
        private String llmCode;

        @com.aliyun.core.annotation.NameInMap("LlmTemplateId")
        private String llmTemplateId;

        @com.aliyun.core.annotation.NameInMap("ModelInfo")
        private java.util.Map<String, ?> modelInfo;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Prices")
        private java.util.List<DataPrices> prices;

        @com.aliyun.core.annotation.NameInMap("ProviderTemplateId")
        private String providerTemplateId;

        @com.aliyun.core.annotation.NameInMap("PublishedTime")
        private String publishedTime;

        @com.aliyun.core.annotation.NameInMap("RefScope")
        private String refScope;

        @com.aliyun.core.annotation.NameInMap("RoutePolicyCount")
        private Integer routePolicyCount;

        private Data(Builder builder) {
            this.config = builder.config;
            this.creditMultiplier = builder.creditMultiplier;
            this.description = builder.description;
            this.features = builder.features;
            this.inferenceMetadata = builder.inferenceMetadata;
            this.isDefaultModel = builder.isDefaultModel;
            this.llmCode = builder.llmCode;
            this.llmTemplateId = builder.llmTemplateId;
            this.modelInfo = builder.modelInfo;
            this.name = builder.name;
            this.prices = builder.prices;
            this.providerTemplateId = builder.providerTemplateId;
            this.publishedTime = builder.publishedTime;
            this.refScope = builder.refScope;
            this.routePolicyCount = builder.routePolicyCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
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
         * @return isDefaultModel
         */
        public Boolean getIsDefaultModel() {
            return this.isDefaultModel;
        }

        /**
         * @return llmCode
         */
        public String getLlmCode() {
            return this.llmCode;
        }

        /**
         * @return llmTemplateId
         */
        public String getLlmTemplateId() {
            return this.llmTemplateId;
        }

        /**
         * @return modelInfo
         */
        public java.util.Map<String, ?> getModelInfo() {
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
        public java.util.List<DataPrices> getPrices() {
            return this.prices;
        }

        /**
         * @return providerTemplateId
         */
        public String getProviderTemplateId() {
            return this.providerTemplateId;
        }

        /**
         * @return publishedTime
         */
        public String getPublishedTime() {
            return this.publishedTime;
        }

        /**
         * @return refScope
         */
        public String getRefScope() {
            return this.refScope;
        }

        /**
         * @return routePolicyCount
         */
        public Integer getRoutePolicyCount() {
            return this.routePolicyCount;
        }

        public static final class Builder {
            private String config; 
            private CreditMultiplier creditMultiplier; 
            private String description; 
            private java.util.List<String> features; 
            private InferenceMetadata inferenceMetadata; 
            private Boolean isDefaultModel; 
            private String llmCode; 
            private String llmTemplateId; 
            private java.util.Map<String, ?> modelInfo; 
            private String name; 
            private java.util.List<DataPrices> prices; 
            private String providerTemplateId; 
            private String publishedTime; 
            private String refScope; 
            private Integer routePolicyCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.config = model.config;
                this.creditMultiplier = model.creditMultiplier;
                this.description = model.description;
                this.features = model.features;
                this.inferenceMetadata = model.inferenceMetadata;
                this.isDefaultModel = model.isDefaultModel;
                this.llmCode = model.llmCode;
                this.llmTemplateId = model.llmTemplateId;
                this.modelInfo = model.modelInfo;
                this.name = model.name;
                this.prices = model.prices;
                this.providerTemplateId = model.providerTemplateId;
                this.publishedTime = model.publishedTime;
                this.refScope = model.refScope;
                this.routePolicyCount = model.routePolicyCount;
            } 

            /**
             * <p>The model configuration JSON object.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;id&quot;: &quot;qwen3.6-plus&quot;,
             *     &quot;cost&quot;: {
             *         &quot;input&quot;: 0,
             *         &quot;output&quot;: 0,
             *         &quot;cacheRead&quot;: 0,
             *         &quot;cacheWrite&quot;: 0
             *     },
             *     &quot;name&quot;: &quot;Qwen3.6-Plus&quot;,
             *     &quot;input&quot;: [&quot;image&quot;, &quot;text&quot;],
             *     &quot;compat&quot;: {
             *         &quot;supportsUsageInStreaming&quot;: true
             *     },
             *     &quot;maxTokens&quot;: 65536,
             *     &quot;reasoning&quot;: false,
             *     &quot;contextWindow&quot;: 1000000
             * }</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The credit consumption multiplier (rate). An empty value indicates that the model does not participate in credit-based billing.</p>
             */
            public Builder creditMultiplier(CreditMultiplier creditMultiplier) {
                this.creditMultiplier = creditMultiplier;
                return this;
            }

            /**
             * <p>The template description.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen Plus series models</p>
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
             * <p>Indicates whether this is the default model under the associated model group.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefaultModel(Boolean isDefaultModel) {
                this.isDefaultModel = isDefaultModel;
                return this;
            }

            /**
             * <p>The model code.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.6-plus</p>
             */
            public Builder llmCode(String llmCode) {
                this.llmCode = llmCode;
                return this;
            }

            /**
             * <p>The model template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>llmt-xxxx</p>
             */
            public Builder llmTemplateId(String llmTemplateId) {
                this.llmTemplateId = llmTemplateId;
                return this;
            }

            /**
             * <p>The model information, such as context window size and maximum input/output tokens.</p>
             */
            public Builder modelInfo(java.util.Map<String, ?> modelInfo) {
                this.modelInfo = modelInfo;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen3.6-Plus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of pricing information.</p>
             */
            public Builder prices(java.util.List<DataPrices> prices) {
                this.prices = prices;
                return this;
            }

            /**
             * <p>The ID of the model provider template.</p>
             * 
             * <strong>example:</strong>
             * <p>mpt-xxxx</p>
             */
            public Builder providerTemplateId(String providerTemplateId) {
                this.providerTemplateId = providerTemplateId;
                return this;
            }

            /**
             * <p>The publish time in ISO 8601 format, such as 2026-03-04T06:25:17.000+00:00.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-04T06:25:17.000+00:00</p>
             */
            public Builder publishedTime(String publishedTime) {
                this.publishedTime = publishedTime;
                return this;
            }

            /**
             * <p>The authorization scope of the model group. Valid values: ALL_USER (all users), USER_MIXED (specified users and user groups), and RESOURCE_MIXED (specified resources). Returned only when SmartModel is true.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL_USER</p>
             */
            public Builder refScope(String refScope) {
                this.refScope = refScope;
                return this;
            }

            /**
             * <p>The number of routing policies configured under this model tier. Returned only when SmartModel is true. Returns 0 for tiers with no configured policies.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder routePolicyCount(Integer routePolicyCount) {
                this.routePolicyCount = routePolicyCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
