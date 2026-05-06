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
 * {@link DescribeRatePlanPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRatePlanPriceResponseBody</p>
 */
public class DescribeRatePlanPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PriceModel")
    private PriceModel priceModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRatePlanPriceResponseBody(Builder builder) {
        this.priceModel = builder.priceModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRatePlanPriceResponseBody create() {
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

        private Builder(DescribeRatePlanPriceResponseBody model) {
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
         * <p>50423A7F-A83D-1E24-B80E-86DD25790759</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRatePlanPriceResponseBody build() {
            return new DescribeRatePlanPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRatePlanPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRatePlanPriceResponseBody</p>
     */
    public static class PlanPriceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerateType")
        private String accelerateType;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Coverages")
        private String coverages;

        @com.aliyun.core.annotation.NameInMap("CrossborderTraffic")
        private String crossborderTraffic;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DcdnPlan")
        private String dcdnPlan;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("EdgeCompute")
        private String edgeCompute;

        @com.aliyun.core.annotation.NameInMap("EdgeDdos4Layer")
        private String edgeDdos4Layer;

        @com.aliyun.core.annotation.NameInMap("EdgeDdos4LayerIntl")
        private String edgeDdos4LayerIntl;

        @com.aliyun.core.annotation.NameInMap("EdgeDdos7Layer")
        private String edgeDdos7Layer;

        @com.aliyun.core.annotation.NameInMap("EdgeDdosInstanceCn")
        private String edgeDdosInstanceCn;

        @com.aliyun.core.annotation.NameInMap("EdgeDdosInstanceIntl")
        private String edgeDdosInstanceIntl;

        @com.aliyun.core.annotation.NameInMap("EdgeLb4Layer")
        private String edgeLb4Layer;

        @com.aliyun.core.annotation.NameInMap("EdgeLb4LayerIntl")
        private String edgeLb4LayerIntl;

        @com.aliyun.core.annotation.NameInMap("EdgeLb7Layer")
        private String edgeLb7Layer;

        @com.aliyun.core.annotation.NameInMap("EdgeWaf")
        private String edgeWaf;

        @com.aliyun.core.annotation.NameInMap("EdgeWafInstance")
        private String edgeWafInstance;

        @com.aliyun.core.annotation.NameInMap("Layer4Traffic")
        private String layer4Traffic;

        @com.aliyun.core.annotation.NameInMap("Layer4TrafficIntl")
        private String layer4TrafficIntl;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("PlanStatus")
        private String planStatus;

        @com.aliyun.core.annotation.NameInMap("PlanTraffic")
        private String planTraffic;

        @com.aliyun.core.annotation.NameInMap("PlanType")
        private String planType;

        @com.aliyun.core.annotation.NameInMap("Position")
        private Integer position;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Float price;

        @com.aliyun.core.annotation.NameInMap("TotalPrice")
        private Float totalPrice;

        private PlanPriceList(Builder builder) {
            this.accelerateType = builder.accelerateType;
            this.chargeType = builder.chargeType;
            this.coverages = builder.coverages;
            this.crossborderTraffic = builder.crossborderTraffic;
            this.currency = builder.currency;
            this.dcdnPlan = builder.dcdnPlan;
            this.discountPrice = builder.discountPrice;
            this.edgeCompute = builder.edgeCompute;
            this.edgeDdos4Layer = builder.edgeDdos4Layer;
            this.edgeDdos4LayerIntl = builder.edgeDdos4LayerIntl;
            this.edgeDdos7Layer = builder.edgeDdos7Layer;
            this.edgeDdosInstanceCn = builder.edgeDdosInstanceCn;
            this.edgeDdosInstanceIntl = builder.edgeDdosInstanceIntl;
            this.edgeLb4Layer = builder.edgeLb4Layer;
            this.edgeLb4LayerIntl = builder.edgeLb4LayerIntl;
            this.edgeLb7Layer = builder.edgeLb7Layer;
            this.edgeWaf = builder.edgeWaf;
            this.edgeWafInstance = builder.edgeWafInstance;
            this.layer4Traffic = builder.layer4Traffic;
            this.layer4TrafficIntl = builder.layer4TrafficIntl;
            this.planName = builder.planName;
            this.planStatus = builder.planStatus;
            this.planTraffic = builder.planTraffic;
            this.planType = builder.planType;
            this.position = builder.position;
            this.price = builder.price;
            this.totalPrice = builder.totalPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanPriceList create() {
            return builder().build();
        }

        /**
         * @return accelerateType
         */
        public String getAccelerateType() {
            return this.accelerateType;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return coverages
         */
        public String getCoverages() {
            return this.coverages;
        }

        /**
         * @return crossborderTraffic
         */
        public String getCrossborderTraffic() {
            return this.crossborderTraffic;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return dcdnPlan
         */
        public String getDcdnPlan() {
            return this.dcdnPlan;
        }

        /**
         * @return discountPrice
         */
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return edgeCompute
         */
        public String getEdgeCompute() {
            return this.edgeCompute;
        }

        /**
         * @return edgeDdos4Layer
         */
        public String getEdgeDdos4Layer() {
            return this.edgeDdos4Layer;
        }

        /**
         * @return edgeDdos4LayerIntl
         */
        public String getEdgeDdos4LayerIntl() {
            return this.edgeDdos4LayerIntl;
        }

        /**
         * @return edgeDdos7Layer
         */
        public String getEdgeDdos7Layer() {
            return this.edgeDdos7Layer;
        }

        /**
         * @return edgeDdosInstanceCn
         */
        public String getEdgeDdosInstanceCn() {
            return this.edgeDdosInstanceCn;
        }

        /**
         * @return edgeDdosInstanceIntl
         */
        public String getEdgeDdosInstanceIntl() {
            return this.edgeDdosInstanceIntl;
        }

        /**
         * @return edgeLb4Layer
         */
        public String getEdgeLb4Layer() {
            return this.edgeLb4Layer;
        }

        /**
         * @return edgeLb4LayerIntl
         */
        public String getEdgeLb4LayerIntl() {
            return this.edgeLb4LayerIntl;
        }

        /**
         * @return edgeLb7Layer
         */
        public String getEdgeLb7Layer() {
            return this.edgeLb7Layer;
        }

        /**
         * @return edgeWaf
         */
        public String getEdgeWaf() {
            return this.edgeWaf;
        }

        /**
         * @return edgeWafInstance
         */
        public String getEdgeWafInstance() {
            return this.edgeWafInstance;
        }

        /**
         * @return layer4Traffic
         */
        public String getLayer4Traffic() {
            return this.layer4Traffic;
        }

        /**
         * @return layer4TrafficIntl
         */
        public String getLayer4TrafficIntl() {
            return this.layer4TrafficIntl;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        /**
         * @return planStatus
         */
        public String getPlanStatus() {
            return this.planStatus;
        }

        /**
         * @return planTraffic
         */
        public String getPlanTraffic() {
            return this.planTraffic;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
        }

        /**
         * @return position
         */
        public Integer getPosition() {
            return this.position;
        }

        /**
         * @return price
         */
        public Float getPrice() {
            return this.price;
        }

        /**
         * @return totalPrice
         */
        public Float getTotalPrice() {
            return this.totalPrice;
        }

        public static final class Builder {
            private String accelerateType; 
            private String chargeType; 
            private String coverages; 
            private String crossborderTraffic; 
            private String currency; 
            private String dcdnPlan; 
            private Float discountPrice; 
            private String edgeCompute; 
            private String edgeDdos4Layer; 
            private String edgeDdos4LayerIntl; 
            private String edgeDdos7Layer; 
            private String edgeDdosInstanceCn; 
            private String edgeDdosInstanceIntl; 
            private String edgeLb4Layer; 
            private String edgeLb4LayerIntl; 
            private String edgeLb7Layer; 
            private String edgeWaf; 
            private String edgeWafInstance; 
            private String layer4Traffic; 
            private String layer4TrafficIntl; 
            private String planName; 
            private String planStatus; 
            private String planTraffic; 
            private String planType; 
            private Integer position; 
            private Float price; 
            private Float totalPrice; 

            private Builder() {
            } 

            private Builder(PlanPriceList model) {
                this.accelerateType = model.accelerateType;
                this.chargeType = model.chargeType;
                this.coverages = model.coverages;
                this.crossborderTraffic = model.crossborderTraffic;
                this.currency = model.currency;
                this.dcdnPlan = model.dcdnPlan;
                this.discountPrice = model.discountPrice;
                this.edgeCompute = model.edgeCompute;
                this.edgeDdos4Layer = model.edgeDdos4Layer;
                this.edgeDdos4LayerIntl = model.edgeDdos4LayerIntl;
                this.edgeDdos7Layer = model.edgeDdos7Layer;
                this.edgeDdosInstanceCn = model.edgeDdosInstanceCn;
                this.edgeDdosInstanceIntl = model.edgeDdosInstanceIntl;
                this.edgeLb4Layer = model.edgeLb4Layer;
                this.edgeLb4LayerIntl = model.edgeLb4LayerIntl;
                this.edgeLb7Layer = model.edgeLb7Layer;
                this.edgeWaf = model.edgeWaf;
                this.edgeWafInstance = model.edgeWafInstance;
                this.layer4Traffic = model.layer4Traffic;
                this.layer4TrafficIntl = model.layer4TrafficIntl;
                this.planName = model.planName;
                this.planStatus = model.planStatus;
                this.planTraffic = model.planTraffic;
                this.planType = model.planType;
                this.position = model.position;
                this.price = model.price;
                this.totalPrice = model.totalPrice;
            } 

            /**
             * AccelerateType.
             */
            public Builder accelerateType(String accelerateType) {
                this.accelerateType = accelerateType;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Coverages.
             */
            public Builder coverages(String coverages) {
                this.coverages = coverages;
                return this;
            }

            /**
             * CrossborderTraffic.
             */
            public Builder crossborderTraffic(String crossborderTraffic) {
                this.crossborderTraffic = crossborderTraffic;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * DcdnPlan.
             */
            public Builder dcdnPlan(String dcdnPlan) {
                this.dcdnPlan = dcdnPlan;
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
             * EdgeCompute.
             */
            public Builder edgeCompute(String edgeCompute) {
                this.edgeCompute = edgeCompute;
                return this;
            }

            /**
             * EdgeDdos4Layer.
             */
            public Builder edgeDdos4Layer(String edgeDdos4Layer) {
                this.edgeDdos4Layer = edgeDdos4Layer;
                return this;
            }

            /**
             * EdgeDdos4LayerIntl.
             */
            public Builder edgeDdos4LayerIntl(String edgeDdos4LayerIntl) {
                this.edgeDdos4LayerIntl = edgeDdos4LayerIntl;
                return this;
            }

            /**
             * EdgeDdos7Layer.
             */
            public Builder edgeDdos7Layer(String edgeDdos7Layer) {
                this.edgeDdos7Layer = edgeDdos7Layer;
                return this;
            }

            /**
             * EdgeDdosInstanceCn.
             */
            public Builder edgeDdosInstanceCn(String edgeDdosInstanceCn) {
                this.edgeDdosInstanceCn = edgeDdosInstanceCn;
                return this;
            }

            /**
             * EdgeDdosInstanceIntl.
             */
            public Builder edgeDdosInstanceIntl(String edgeDdosInstanceIntl) {
                this.edgeDdosInstanceIntl = edgeDdosInstanceIntl;
                return this;
            }

            /**
             * EdgeLb4Layer.
             */
            public Builder edgeLb4Layer(String edgeLb4Layer) {
                this.edgeLb4Layer = edgeLb4Layer;
                return this;
            }

            /**
             * EdgeLb4LayerIntl.
             */
            public Builder edgeLb4LayerIntl(String edgeLb4LayerIntl) {
                this.edgeLb4LayerIntl = edgeLb4LayerIntl;
                return this;
            }

            /**
             * EdgeLb7Layer.
             */
            public Builder edgeLb7Layer(String edgeLb7Layer) {
                this.edgeLb7Layer = edgeLb7Layer;
                return this;
            }

            /**
             * EdgeWaf.
             */
            public Builder edgeWaf(String edgeWaf) {
                this.edgeWaf = edgeWaf;
                return this;
            }

            /**
             * EdgeWafInstance.
             */
            public Builder edgeWafInstance(String edgeWafInstance) {
                this.edgeWafInstance = edgeWafInstance;
                return this;
            }

            /**
             * Layer4Traffic.
             */
            public Builder layer4Traffic(String layer4Traffic) {
                this.layer4Traffic = layer4Traffic;
                return this;
            }

            /**
             * Layer4TrafficIntl.
             */
            public Builder layer4TrafficIntl(String layer4TrafficIntl) {
                this.layer4TrafficIntl = layer4TrafficIntl;
                return this;
            }

            /**
             * PlanName.
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * PlanStatus.
             */
            public Builder planStatus(String planStatus) {
                this.planStatus = planStatus;
                return this;
            }

            /**
             * PlanTraffic.
             */
            public Builder planTraffic(String planTraffic) {
                this.planTraffic = planTraffic;
                return this;
            }

            /**
             * PlanType.
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(Integer position) {
                this.position = position;
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
             * TotalPrice.
             */
            public Builder totalPrice(Float totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            public PlanPriceList build() {
                return new PlanPriceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRatePlanPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRatePlanPriceResponseBody</p>
     */
    public static class RatePlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PlanPriceList")
        private java.util.List<PlanPriceList> planPriceList;

        private RatePlan(Builder builder) {
            this.planPriceList = builder.planPriceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RatePlan create() {
            return builder().build();
        }

        /**
         * @return planPriceList
         */
        public java.util.List<PlanPriceList> getPlanPriceList() {
            return this.planPriceList;
        }

        public static final class Builder {
            private java.util.List<PlanPriceList> planPriceList; 

            private Builder() {
            } 

            private Builder(RatePlan model) {
                this.planPriceList = model.planPriceList;
            } 

            /**
             * PlanPriceList.
             */
            public Builder planPriceList(java.util.List<PlanPriceList> planPriceList) {
                this.planPriceList = planPriceList;
                return this;
            }

            public RatePlan build() {
                return new RatePlan(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRatePlanPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRatePlanPriceResponseBody</p>
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
     * {@link DescribeRatePlanPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRatePlanPriceResponseBody</p>
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
     * {@link DescribeRatePlanPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRatePlanPriceResponseBody</p>
     */
    public static class PriceModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RatePlan")
        private RatePlan ratePlan;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private Rule rule;

        private PriceModel(Builder builder) {
            this.ratePlan = builder.ratePlan;
            this.rule = builder.rule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceModel create() {
            return builder().build();
        }

        /**
         * @return ratePlan
         */
        public RatePlan getRatePlan() {
            return this.ratePlan;
        }

        /**
         * @return rule
         */
        public Rule getRule() {
            return this.rule;
        }

        public static final class Builder {
            private RatePlan ratePlan; 
            private Rule rule; 

            private Builder() {
            } 

            private Builder(PriceModel model) {
                this.ratePlan = model.ratePlan;
                this.rule = model.rule;
            } 

            /**
             * RatePlan.
             */
            public Builder ratePlan(RatePlan ratePlan) {
                this.ratePlan = ratePlan;
                return this;
            }

            /**
             * Rule.
             */
            public Builder rule(Rule rule) {
                this.rule = rule;
                return this;
            }

            public PriceModel build() {
                return new PriceModel(this);
            } 

        } 

    }
}
