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
 * {@link GetGatewayQuotaRuleSubjectUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayQuotaRuleSubjectUsageResponseBody</p>
 */
public class GetGatewayQuotaRuleSubjectUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGatewayQuotaRuleSubjectUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayQuotaRuleSubjectUsageResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGatewayQuotaRuleSubjectUsageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;usedAmount&quot;:500}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBody build() {
            return new GetGatewayQuotaRuleSubjectUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayQuotaRuleSubjectUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayQuotaRuleSubjectUsageResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cachedAmount")
        private Long cachedAmount;

        @com.aliyun.core.annotation.NameInMap("cachedAmountDecimal")
        private Double cachedAmountDecimal;

        @com.aliyun.core.annotation.NameInMap("consumer")
        private String consumer;

        @com.aliyun.core.annotation.NameInMap("inputAmount")
        private Long inputAmount;

        @com.aliyun.core.annotation.NameInMap("inputAmountDecimal")
        private Double inputAmountDecimal;

        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("outputAmount")
        private Long outputAmount;

        @com.aliyun.core.annotation.NameInMap("outputAmountDecimal")
        private Double outputAmountDecimal;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("usedAmount")
        private Long usedAmount;

        @com.aliyun.core.annotation.NameInMap("usedAmountDecimal")
        private Double usedAmountDecimal;

        private Items(Builder builder) {
            this.cachedAmount = builder.cachedAmount;
            this.cachedAmountDecimal = builder.cachedAmountDecimal;
            this.consumer = builder.consumer;
            this.inputAmount = builder.inputAmount;
            this.inputAmountDecimal = builder.inputAmountDecimal;
            this.model = builder.model;
            this.outputAmount = builder.outputAmount;
            this.outputAmountDecimal = builder.outputAmountDecimal;
            this.requestId = builder.requestId;
            this.startTime = builder.startTime;
            this.usedAmount = builder.usedAmount;
            this.usedAmountDecimal = builder.usedAmountDecimal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return cachedAmount
         */
        public Long getCachedAmount() {
            return this.cachedAmount;
        }

        /**
         * @return cachedAmountDecimal
         */
        public Double getCachedAmountDecimal() {
            return this.cachedAmountDecimal;
        }

        /**
         * @return consumer
         */
        public String getConsumer() {
            return this.consumer;
        }

        /**
         * @return inputAmount
         */
        public Long getInputAmount() {
            return this.inputAmount;
        }

        /**
         * @return inputAmountDecimal
         */
        public Double getInputAmountDecimal() {
            return this.inputAmountDecimal;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return outputAmount
         */
        public Long getOutputAmount() {
            return this.outputAmount;
        }

        /**
         * @return outputAmountDecimal
         */
        public Double getOutputAmountDecimal() {
            return this.outputAmountDecimal;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return usedAmount
         */
        public Long getUsedAmount() {
            return this.usedAmount;
        }

        /**
         * @return usedAmountDecimal
         */
        public Double getUsedAmountDecimal() {
            return this.usedAmountDecimal;
        }

        public static final class Builder {
            private Long cachedAmount; 
            private Double cachedAmountDecimal; 
            private String consumer; 
            private Long inputAmount; 
            private Double inputAmountDecimal; 
            private String model; 
            private Long outputAmount; 
            private Double outputAmountDecimal; 
            private String requestId; 
            private String startTime; 
            private Long usedAmount; 
            private Double usedAmountDecimal; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.cachedAmount = model.cachedAmount;
                this.cachedAmountDecimal = model.cachedAmountDecimal;
                this.consumer = model.consumer;
                this.inputAmount = model.inputAmount;
                this.inputAmountDecimal = model.inputAmountDecimal;
                this.model = model.model;
                this.outputAmount = model.outputAmount;
                this.outputAmountDecimal = model.outputAmountDecimal;
                this.requestId = model.requestId;
                this.startTime = model.startTime;
                this.usedAmount = model.usedAmount;
                this.usedAmountDecimal = model.usedAmountDecimal;
            } 

            /**
             * <p>The cached token consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cachedAmount(Long cachedAmount) {
                this.cachedAmount = cachedAmount;
                return this;
            }

            /**
             * <p>The exact value of cached consumption. Supports decimals in credit scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>10.5</p>
             */
            public Builder cachedAmountDecimal(Double cachedAmountDecimal) {
                this.cachedAmountDecimal = cachedAmountDecimal;
                return this;
            }

            /**
             * <p>The consumer name.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer-a</p>
             */
            public Builder consumer(String consumer) {
                this.consumer = consumer;
                return this;
            }

            /**
             * <p>The input token consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder inputAmount(Long inputAmount) {
                this.inputAmount = inputAmount;
                return this;
            }

            /**
             * <p>The exact value of input consumption. Supports decimals in credit scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>120.5</p>
             */
            public Builder inputAmountDecimal(Double inputAmountDecimal) {
                this.inputAmountDecimal = inputAmountDecimal;
                return this;
            }

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The output token consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder outputAmount(Long outputAmount) {
                this.outputAmount = outputAmount;
                return this;
            }

            /**
             * <p>The exact value of output consumption. Supports decimals in credit scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>80.5</p>
             */
            public Builder outputAmountDecimal(Double outputAmountDecimal) {
                this.outputAmountDecimal = outputAmountDecimal;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>req-123456</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The consumption (request) time in the format of YYYY-MM-DD.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-05</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The total consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>210</p>
             */
            public Builder usedAmount(Long usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            /**
             * <p>The exact value of total consumption. Supports decimals in credit scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>210.5</p>
             */
            public Builder usedAmountDecimal(Double usedAmountDecimal) {
                this.usedAmountDecimal = usedAmountDecimal;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayQuotaRuleSubjectUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayQuotaRuleSubjectUsageResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Integer totalSize;

        private Details(Builder builder) {
            this.items = builder.items;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
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
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.items = model.items;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The list of usage details.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;model&quot;:&quot;qwen-plus&quot;,\&quot;usedAmount\&quot;:210}]</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
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
             * <p>The current page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayQuotaRuleSubjectUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayQuotaRuleSubjectUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cachedAmount")
        private Long cachedAmount;

        @com.aliyun.core.annotation.NameInMap("cachedAmountDecimal")
        private Double cachedAmountDecimal;

        @com.aliyun.core.annotation.NameInMap("details")
        private Details details;

        @com.aliyun.core.annotation.NameInMap("inputAmount")
        private Long inputAmount;

        @com.aliyun.core.annotation.NameInMap("inputAmountDecimal")
        private Double inputAmountDecimal;

        @com.aliyun.core.annotation.NameInMap("outputAmount")
        private Long outputAmount;

        @com.aliyun.core.annotation.NameInMap("outputAmountDecimal")
        private Double outputAmountDecimal;

        @com.aliyun.core.annotation.NameInMap("overLimit")
        private Boolean overLimit;

        @com.aliyun.core.annotation.NameInMap("quotaDimension")
        private String quotaDimension;

        @com.aliyun.core.annotation.NameInMap("subjectType")
        private String subjectType;

        @com.aliyun.core.annotation.NameInMap("totalQuota")
        private Long totalQuota;

        @com.aliyun.core.annotation.NameInMap("usedAmount")
        private Long usedAmount;

        @com.aliyun.core.annotation.NameInMap("usedAmountDecimal")
        private Double usedAmountDecimal;

        private Data(Builder builder) {
            this.cachedAmount = builder.cachedAmount;
            this.cachedAmountDecimal = builder.cachedAmountDecimal;
            this.details = builder.details;
            this.inputAmount = builder.inputAmount;
            this.inputAmountDecimal = builder.inputAmountDecimal;
            this.outputAmount = builder.outputAmount;
            this.outputAmountDecimal = builder.outputAmountDecimal;
            this.overLimit = builder.overLimit;
            this.quotaDimension = builder.quotaDimension;
            this.subjectType = builder.subjectType;
            this.totalQuota = builder.totalQuota;
            this.usedAmount = builder.usedAmount;
            this.usedAmountDecimal = builder.usedAmountDecimal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cachedAmount
         */
        public Long getCachedAmount() {
            return this.cachedAmount;
        }

        /**
         * @return cachedAmountDecimal
         */
        public Double getCachedAmountDecimal() {
            return this.cachedAmountDecimal;
        }

        /**
         * @return details
         */
        public Details getDetails() {
            return this.details;
        }

        /**
         * @return inputAmount
         */
        public Long getInputAmount() {
            return this.inputAmount;
        }

        /**
         * @return inputAmountDecimal
         */
        public Double getInputAmountDecimal() {
            return this.inputAmountDecimal;
        }

        /**
         * @return outputAmount
         */
        public Long getOutputAmount() {
            return this.outputAmount;
        }

        /**
         * @return outputAmountDecimal
         */
        public Double getOutputAmountDecimal() {
            return this.outputAmountDecimal;
        }

        /**
         * @return overLimit
         */
        public Boolean getOverLimit() {
            return this.overLimit;
        }

        /**
         * @return quotaDimension
         */
        public String getQuotaDimension() {
            return this.quotaDimension;
        }

        /**
         * @return subjectType
         */
        public String getSubjectType() {
            return this.subjectType;
        }

        /**
         * @return totalQuota
         */
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        /**
         * @return usedAmount
         */
        public Long getUsedAmount() {
            return this.usedAmount;
        }

        /**
         * @return usedAmountDecimal
         */
        public Double getUsedAmountDecimal() {
            return this.usedAmountDecimal;
        }

        public static final class Builder {
            private Long cachedAmount; 
            private Double cachedAmountDecimal; 
            private Details details; 
            private Long inputAmount; 
            private Double inputAmountDecimal; 
            private Long outputAmount; 
            private Double outputAmountDecimal; 
            private Boolean overLimit; 
            private String quotaDimension; 
            private String subjectType; 
            private Long totalQuota; 
            private Long usedAmount; 
            private Double usedAmountDecimal; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cachedAmount = model.cachedAmount;
                this.cachedAmountDecimal = model.cachedAmountDecimal;
                this.details = model.details;
                this.inputAmount = model.inputAmount;
                this.inputAmountDecimal = model.inputAmountDecimal;
                this.outputAmount = model.outputAmount;
                this.outputAmountDecimal = model.outputAmountDecimal;
                this.overLimit = model.overLimit;
                this.quotaDimension = model.quotaDimension;
                this.subjectType = model.subjectType;
                this.totalQuota = model.totalQuota;
                this.usedAmount = model.usedAmount;
                this.usedAmountDecimal = model.usedAmountDecimal;
            } 

            /**
             * <p>The total cached token consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder cachedAmount(Long cachedAmount) {
                this.cachedAmount = cachedAmount;
                return this;
            }

            /**
             * <p>The exact value of total cached consumption. Supports decimals in credit scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>20.5</p>
             */
            public Builder cachedAmountDecimal(Double cachedAmountDecimal) {
                this.cachedAmountDecimal = cachedAmountDecimal;
                return this;
            }

            /**
             * <p>The paginated consumption details.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;totalSize&quot;:100}</p>
             */
            public Builder details(Details details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The total input token consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder inputAmount(Long inputAmount) {
                this.inputAmount = inputAmount;
                return this;
            }

            /**
             * <p>The exact value of total input consumption. Supports decimals in credit scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>300.5</p>
             */
            public Builder inputAmountDecimal(Double inputAmountDecimal) {
                this.inputAmountDecimal = inputAmountDecimal;
                return this;
            }

            /**
             * <p>The total output token consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder outputAmount(Long outputAmount) {
                this.outputAmount = outputAmount;
                return this;
            }

            /**
             * <p>The exact value of total output consumption. Supports decimals in credit scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>180.5</p>
             */
            public Builder outputAmountDecimal(Double outputAmountDecimal) {
                this.outputAmountDecimal = outputAmountDecimal;
                return this;
            }

            /**
             * <p>Indicates whether the quota limit is exceeded.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder overLimit(Boolean overLimit) {
                this.overLimit = overLimit;
                return this;
            }

            /**
             * <p>The quota dimension. Valid values: token and credit.</p>
             * 
             * <strong>example:</strong>
             * <p>token</p>
             */
            public Builder quotaDimension(String quotaDimension) {
                this.quotaDimension = quotaDimension;
                return this;
            }

            /**
             * <p>The subject type. Valid values: consumer and consumer_group.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer_group</p>
             */
            public Builder subjectType(String subjectType) {
                this.subjectType = subjectType;
                return this;
            }

            /**
             * <p>The total quota of the subject.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder totalQuota(Long totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * <p>The total used amount of the subject.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder usedAmount(Long usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            /**
             * <p>The exact value of the total used amount of the subject. Supports decimals in credit scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>500.5</p>
             */
            public Builder usedAmountDecimal(Double usedAmountDecimal) {
                this.usedAmountDecimal = usedAmountDecimal;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
