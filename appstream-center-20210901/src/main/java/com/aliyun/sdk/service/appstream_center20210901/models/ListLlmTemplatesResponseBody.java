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
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
             * Max.
             */
            public Builder max(Float max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
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
             * RequestModality.
             */
            public Builder requestModality(java.util.List<String> requestModality) {
                this.requestModality = requestModality;
                return this;
            }

            /**
             * ResponseModality.
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
             * Price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * PriceName.
             */
            public Builder priceName(String priceName) {
                this.priceName = priceName;
                return this;
            }

            /**
             * PriceUnit.
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
             * Prices.
             */
            public Builder prices(java.util.List<Prices> prices) {
                this.prices = prices;
                return this;
            }

            /**
             * RangeName.
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
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * CreditMultiplier.
             */
            public Builder creditMultiplier(CreditMultiplier creditMultiplier) {
                this.creditMultiplier = creditMultiplier;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Features.
             */
            public Builder features(java.util.List<String> features) {
                this.features = features;
                return this;
            }

            /**
             * InferenceMetadata.
             */
            public Builder inferenceMetadata(InferenceMetadata inferenceMetadata) {
                this.inferenceMetadata = inferenceMetadata;
                return this;
            }

            /**
             * IsDefaultModel.
             */
            public Builder isDefaultModel(Boolean isDefaultModel) {
                this.isDefaultModel = isDefaultModel;
                return this;
            }

            /**
             * LlmCode.
             */
            public Builder llmCode(String llmCode) {
                this.llmCode = llmCode;
                return this;
            }

            /**
             * LlmTemplateId.
             */
            public Builder llmTemplateId(String llmTemplateId) {
                this.llmTemplateId = llmTemplateId;
                return this;
            }

            /**
             * ModelInfo.
             */
            public Builder modelInfo(java.util.Map<String, ?> modelInfo) {
                this.modelInfo = modelInfo;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Prices.
             */
            public Builder prices(java.util.List<DataPrices> prices) {
                this.prices = prices;
                return this;
            }

            /**
             * ProviderTemplateId.
             */
            public Builder providerTemplateId(String providerTemplateId) {
                this.providerTemplateId = providerTemplateId;
                return this;
            }

            /**
             * PublishedTime.
             */
            public Builder publishedTime(String publishedTime) {
                this.publishedTime = publishedTime;
                return this;
            }

            /**
             * RefScope.
             */
            public Builder refScope(String refScope) {
                this.refScope = refScope;
                return this;
            }

            /**
             * RoutePolicyCount.
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
