// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeRatePlanPriceGapResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRatePlanPriceGapResponseBody</p>
 */
public class DescribeRatePlanPriceGapResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PriceModel")
    private PriceModel priceModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRatePlanPriceGapResponseBody(Builder builder) {
        this.priceModel = builder.priceModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRatePlanPriceGapResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return priceModel
     */
    public PriceModel getPriceModel() {
        return this.priceModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PriceModel priceModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRatePlanPriceGapResponseBody model) {
            this.priceModel = model.priceModel;
            this.requestId = model.requestId;
        } 

        /**
         * PriceModel.
         */
        public Builder priceModel(PriceModel priceModel) {
            this.priceModel = priceModel;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>40423A7F-A83D-1E24-B80E-86DD25790759</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRatePlanPriceGapResponseBody build() {
            return new DescribeRatePlanPriceGapResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRatePlanPriceGapResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRatePlanPriceGapResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleDescId")
        private Long ruleDescId;

        private RuleList(Builder builder) {
            this.name = builder.name;
            this.ruleDescId = builder.ruleDescId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
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
            private String name; 
            private Long ruleDescId; 

            private Builder() {
            } 

            private Builder(RuleList model) {
                this.name = model.name;
                this.ruleDescId = model.ruleDescId;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RuleDescId.
             */
            public Builder ruleDescId(Long ruleDescId) {
                this.ruleDescId = ruleDescId;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRatePlanPriceGapResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRatePlanPriceGapResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List<RuleList> ruleList;

        private Rule(Builder builder) {
            this.ruleList = builder.ruleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return ruleList
         */
        public java.util.List<RuleList> getRuleList() {
            return this.ruleList;
        }

        public static final class Builder {
            private java.util.List<RuleList> ruleList; 

            private Builder() {
            } 

            private Builder(Rule model) {
                this.ruleList = model.ruleList;
            } 

            /**
             * RuleList.
             */
            public Builder ruleList(java.util.List<RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRatePlanPriceGapResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRatePlanPriceGapResponseBody</p>
     */
    public static class PriceModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Float price;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private Rule rule;

        @com.aliyun.core.annotation.NameInMap("TargetPlanCode")
        private String targetPlanCode;

        @com.aliyun.core.annotation.NameInMap("TotalPrice")
        private Float totalPrice;

        private PriceModel(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.instanceId = builder.instanceId;
            this.price = builder.price;
            this.rule = builder.rule;
            this.targetPlanCode = builder.targetPlanCode;
            this.totalPrice = builder.totalPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceModel create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return discountPrice
         */
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return price
         */
        public Float getPrice() {
            return this.price;
        }

        /**
         * @return rule
         */
        public Rule getRule() {
            return this.rule;
        }

        /**
         * @return targetPlanCode
         */
        public String getTargetPlanCode() {
            return this.targetPlanCode;
        }

        /**
         * @return totalPrice
         */
        public Float getTotalPrice() {
            return this.totalPrice;
        }

        public static final class Builder {
            private String currency; 
            private Float discountPrice; 
            private String instanceId; 
            private Float price; 
            private Rule rule; 
            private String targetPlanCode; 
            private Float totalPrice; 

            private Builder() {
            } 

            private Builder(PriceModel model) {
                this.currency = model.currency;
                this.discountPrice = model.discountPrice;
                this.instanceId = model.instanceId;
                this.price = model.price;
                this.rule = model.rule;
                this.targetPlanCode = model.targetPlanCode;
                this.totalPrice = model.totalPrice;
            } 

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Float price) {
                this.price = price;
                return this;
            }

            /**
             * Rule.
             */
            public Builder rule(Rule rule) {
                this.rule = rule;
                return this;
            }

            /**
             * TargetPlanCode.
             */
            public Builder targetPlanCode(String targetPlanCode) {
                this.targetPlanCode = targetPlanCode;
                return this;
            }

            /**
             * TotalPrice.
             */
            public Builder totalPrice(Float totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            public PriceModel build() {
                return new PriceModel(this);
            } 

        } 

    }
}
