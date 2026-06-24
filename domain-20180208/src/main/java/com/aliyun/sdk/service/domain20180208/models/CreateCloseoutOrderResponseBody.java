// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link CreateCloseoutOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloseoutOrderResponseBody</p>
 */
public class CreateCloseoutOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCloseoutOrderResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloseoutOrderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Module module; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCloseoutOrderResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
        } 

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCloseoutOrderResponseBody build() {
            return new CreateCloseoutOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCloseoutOrderResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCloseoutOrderResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizIds")
        private java.util.Map<String, String> bizIds;

        @com.aliyun.core.annotation.NameInMap("BuyerBlockTrade")
        private java.util.List<String> buyerBlockTrade;

        @com.aliyun.core.annotation.NameInMap("DomainBlockTrade")
        private java.util.List<String> domainBlockTrade;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainTradeRiskWarn")
        private java.util.List<String> domainTradeRiskWarn;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private java.util.Map<String, String> extend;

        @com.aliyun.core.annotation.NameInMap("IgnoredDomains")
        private java.util.List<java.util.Map<String, String>> ignoredDomains;

        @com.aliyun.core.annotation.NameInMap("NeedPay")
        private Boolean needPay;

        @com.aliyun.core.annotation.NameInMap("OrderNo")
        private String orderNo;

        @com.aliyun.core.annotation.NameInMap("OrderSumMoney")
        private Double orderSumMoney;

        @com.aliyun.core.annotation.NameInMap("OutOrderNo")
        private String outOrderNo;

        @com.aliyun.core.annotation.NameInMap("PayMoney")
        private Double payMoney;

        @com.aliyun.core.annotation.NameInMap("PayUrl")
        private String payUrl;

        @com.aliyun.core.annotation.NameInMap("RealNameTemplate")
        private java.util.List<Long> realNameTemplate;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        private Module(Builder builder) {
            this.bizIds = builder.bizIds;
            this.buyerBlockTrade = builder.buyerBlockTrade;
            this.domainBlockTrade = builder.domainBlockTrade;
            this.domainName = builder.domainName;
            this.domainTradeRiskWarn = builder.domainTradeRiskWarn;
            this.extend = builder.extend;
            this.ignoredDomains = builder.ignoredDomains;
            this.needPay = builder.needPay;
            this.orderNo = builder.orderNo;
            this.orderSumMoney = builder.orderSumMoney;
            this.outOrderNo = builder.outOrderNo;
            this.payMoney = builder.payMoney;
            this.payUrl = builder.payUrl;
            this.realNameTemplate = builder.realNameTemplate;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return bizIds
         */
        public java.util.Map<String, String> getBizIds() {
            return this.bizIds;
        }

        /**
         * @return buyerBlockTrade
         */
        public java.util.List<String> getBuyerBlockTrade() {
            return this.buyerBlockTrade;
        }

        /**
         * @return domainBlockTrade
         */
        public java.util.List<String> getDomainBlockTrade() {
            return this.domainBlockTrade;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainTradeRiskWarn
         */
        public java.util.List<String> getDomainTradeRiskWarn() {
            return this.domainTradeRiskWarn;
        }

        /**
         * @return extend
         */
        public java.util.Map<String, String> getExtend() {
            return this.extend;
        }

        /**
         * @return ignoredDomains
         */
        public java.util.List<java.util.Map<String, String>> getIgnoredDomains() {
            return this.ignoredDomains;
        }

        /**
         * @return needPay
         */
        public Boolean getNeedPay() {
            return this.needPay;
        }

        /**
         * @return orderNo
         */
        public String getOrderNo() {
            return this.orderNo;
        }

        /**
         * @return orderSumMoney
         */
        public Double getOrderSumMoney() {
            return this.orderSumMoney;
        }

        /**
         * @return outOrderNo
         */
        public String getOutOrderNo() {
            return this.outOrderNo;
        }

        /**
         * @return payMoney
         */
        public Double getPayMoney() {
            return this.payMoney;
        }

        /**
         * @return payUrl
         */
        public String getPayUrl() {
            return this.payUrl;
        }

        /**
         * @return realNameTemplate
         */
        public java.util.List<Long> getRealNameTemplate() {
            return this.realNameTemplate;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private java.util.Map<String, String> bizIds; 
            private java.util.List<String> buyerBlockTrade; 
            private java.util.List<String> domainBlockTrade; 
            private String domainName; 
            private java.util.List<String> domainTradeRiskWarn; 
            private java.util.Map<String, String> extend; 
            private java.util.List<java.util.Map<String, String>> ignoredDomains; 
            private Boolean needPay; 
            private String orderNo; 
            private Double orderSumMoney; 
            private String outOrderNo; 
            private Double payMoney; 
            private String payUrl; 
            private java.util.List<Long> realNameTemplate; 
            private String requestId; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.bizIds = model.bizIds;
                this.buyerBlockTrade = model.buyerBlockTrade;
                this.domainBlockTrade = model.domainBlockTrade;
                this.domainName = model.domainName;
                this.domainTradeRiskWarn = model.domainTradeRiskWarn;
                this.extend = model.extend;
                this.ignoredDomains = model.ignoredDomains;
                this.needPay = model.needPay;
                this.orderNo = model.orderNo;
                this.orderSumMoney = model.orderSumMoney;
                this.outOrderNo = model.outOrderNo;
                this.payMoney = model.payMoney;
                this.payUrl = model.payUrl;
                this.realNameTemplate = model.realNameTemplate;
                this.requestId = model.requestId;
            } 

            /**
             * BizIds.
             */
            public Builder bizIds(java.util.Map<String, String> bizIds) {
                this.bizIds = bizIds;
                return this;
            }

            /**
             * BuyerBlockTrade.
             */
            public Builder buyerBlockTrade(java.util.List<String> buyerBlockTrade) {
                this.buyerBlockTrade = buyerBlockTrade;
                return this;
            }

            /**
             * DomainBlockTrade.
             */
            public Builder domainBlockTrade(java.util.List<String> domainBlockTrade) {
                this.domainBlockTrade = domainBlockTrade;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainTradeRiskWarn.
             */
            public Builder domainTradeRiskWarn(java.util.List<String> domainTradeRiskWarn) {
                this.domainTradeRiskWarn = domainTradeRiskWarn;
                return this;
            }

            /**
             * Extend.
             */
            public Builder extend(java.util.Map<String, String> extend) {
                this.extend = extend;
                return this;
            }

            /**
             * IgnoredDomains.
             */
            public Builder ignoredDomains(java.util.List<java.util.Map<String, String>> ignoredDomains) {
                this.ignoredDomains = ignoredDomains;
                return this;
            }

            /**
             * NeedPay.
             */
            public Builder needPay(Boolean needPay) {
                this.needPay = needPay;
                return this;
            }

            /**
             * OrderNo.
             */
            public Builder orderNo(String orderNo) {
                this.orderNo = orderNo;
                return this;
            }

            /**
             * OrderSumMoney.
             */
            public Builder orderSumMoney(Double orderSumMoney) {
                this.orderSumMoney = orderSumMoney;
                return this;
            }

            /**
             * OutOrderNo.
             */
            public Builder outOrderNo(String outOrderNo) {
                this.outOrderNo = outOrderNo;
                return this;
            }

            /**
             * PayMoney.
             */
            public Builder payMoney(Double payMoney) {
                this.payMoney = payMoney;
                return this;
            }

            /**
             * PayUrl.
             */
            public Builder payUrl(String payUrl) {
                this.payUrl = payUrl;
                return this;
            }

            /**
             * RealNameTemplate.
             */
            public Builder realNameTemplate(java.util.List<Long> realNameTemplate) {
                this.realNameTemplate = realNameTemplate;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
