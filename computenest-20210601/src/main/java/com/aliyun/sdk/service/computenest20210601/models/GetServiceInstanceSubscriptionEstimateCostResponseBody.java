// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetServiceInstanceSubscriptionEstimateCostResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceInstanceSubscriptionEstimateCostResponseBody</p>
 */
public class GetServiceInstanceSubscriptionEstimateCostResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourcePrices")
    private java.util.List<ResourcePrices> resourcePrices;

    private GetServiceInstanceSubscriptionEstimateCostResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourcePrices = builder.resourcePrices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceInstanceSubscriptionEstimateCostResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourcePrices
     */
    public java.util.List<ResourcePrices> getResourcePrices() {
        return this.resourcePrices;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResourcePrices> resourcePrices; 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>464C8CB6-A548-5206-B83C-D32A8E43EC21</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of resource price information.</p>
         */
        public Builder resourcePrices(java.util.List<ResourcePrices> resourcePrices) {
            this.resourcePrices = resourcePrices;
            return this;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBody build() {
            return new GetServiceInstanceSubscriptionEstimateCostResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceInstanceSubscriptionEstimateCostResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceInstanceSubscriptionEstimateCostResponseBody</p>
     */
    public static class DetailInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private Float discountAmount;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private Float originalAmount;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private Float tradeAmount;

        private DetailInfos(Builder builder) {
            this.discountAmount = builder.discountAmount;
            this.originalAmount = builder.originalAmount;
            this.resource = builder.resource;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailInfos create() {
            return builder().build();
        }

        /**
         * @return discountAmount
         */
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return originalAmount
         */
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return tradeAmount
         */
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private Float discountAmount; 
            private Float originalAmount; 
            private String resource; 
            private Float tradeAmount; 

            /**
             * <p>Discount amount.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * <p>Original price.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * <p>Pricing module identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>Discounted price.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder tradeAmount(Float tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public DetailInfos build() {
                return new DetailInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceInstanceSubscriptionEstimateCostResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceInstanceSubscriptionEstimateCostResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleDescId")
        private Long ruleDescId;

        private Rules(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.ruleDescId = builder.ruleDescId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleDescId
         */
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private Long ruleDescId; 

            /**
             * <p>Promotion description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Promotion name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Promotion ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1021199213</p>
             */
            public Builder ruleDescId(Long ruleDescId) {
                this.ruleDescId = ruleDescId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceInstanceSubscriptionEstimateCostResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceInstanceSubscriptionEstimateCostResponseBody</p>
     */
    public static class ResourcePrices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DetailInfos")
        private java.util.List<DetailInfos> detailInfos;

        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private Float discountAmount;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private Float originalAmount;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("ResourceArn")
        private String resourceArn;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private Float tradeAmount;

        private ResourcePrices(Builder builder) {
            this.currency = builder.currency;
            this.detailInfos = builder.detailInfos;
            this.discountAmount = builder.discountAmount;
            this.originalAmount = builder.originalAmount;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.resourceArn = builder.resourceArn;
            this.rules = builder.rules;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePrices create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return detailInfos
         */
        public java.util.List<DetailInfos> getDetailInfos() {
            return this.detailInfos;
        }

        /**
         * @return discountAmount
         */
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return originalAmount
         */
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return resourceArn
         */
        public String getResourceArn() {
            return this.resourceArn;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return tradeAmount
         */
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private String currency; 
            private java.util.List<DetailInfos> detailInfos; 
            private Float discountAmount; 
            private Float originalAmount; 
            private Integer period; 
            private String periodUnit; 
            private String resourceArn; 
            private java.util.List<Rules> rules; 
            private Float tradeAmount; 

            /**
             * <p>Currency. Valid values:</p>
             * <ul>
             * <li>CNY: Chinese Yuan.</li>
             * <li>USD: US Dollar.</li>
             * <li>JPY: Japanese Yen.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The price details of the pricing module.</p>
             */
            public Builder detailInfos(java.util.List<DetailInfos> detailInfos) {
                this.detailInfos = detailInfos;
                return this;
            }

            /**
             * <p>Discount.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * <p>Original price.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * <p>Renewal duration. The unit is specified by PeriodUnit.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The time unit for the renewal duration, which is the unit of the Period parameter. Valid values: Month, Year. Default value: Month.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>Resource ARN (Aliyun Resource Name).</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ecs:cn-hongkong:1488317743351199:instance/i-j6c6f3lbky38o8rpeqw2</p>
             */
            public Builder resourceArn(String resourceArn) {
                this.resourceArn = resourceArn;
                return this;
            }

            /**
             * <p>Promotion details.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>Discounted price.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder tradeAmount(Float tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public ResourcePrices build() {
                return new ResourcePrices(this);
            } 

        } 

    }
}
