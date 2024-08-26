// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDomainResponseBody</p>
 */
public class CheckDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Avail")
    private String avail;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("DynamicCheck")
    private Boolean dynamicCheck;

    @com.aliyun.core.annotation.NameInMap("Premium")
    private String premium;

    @com.aliyun.core.annotation.NameInMap("Price")
    private Long price;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StaticPriceInfo")
    private StaticPriceInfo staticPriceInfo;

    private CheckDomainResponseBody(Builder builder) {
        this.avail = builder.avail;
        this.domainName = builder.domainName;
        this.dynamicCheck = builder.dynamicCheck;
        this.premium = builder.premium;
        this.price = builder.price;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.staticPriceInfo = builder.staticPriceInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return avail
     */
    public String getAvail() {
        return this.avail;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return dynamicCheck
     */
    public Boolean getDynamicCheck() {
        return this.dynamicCheck;
    }

    /**
     * @return premium
     */
    public String getPremium() {
        return this.premium;
    }

    /**
     * @return price
     */
    public Long getPrice() {
        return this.price;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return staticPriceInfo
     */
    public StaticPriceInfo getStaticPriceInfo() {
        return this.staticPriceInfo;
    }

    public static final class Builder {
        private String avail; 
        private String domainName; 
        private Boolean dynamicCheck; 
        private String premium; 
        private Long price; 
        private String reason; 
        private String requestId; 
        private StaticPriceInfo staticPriceInfo; 

        /**
         * Avail.
         */
        public Builder avail(String avail) {
            this.avail = avail;
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
         * DynamicCheck.
         */
        public Builder dynamicCheck(Boolean dynamicCheck) {
            this.dynamicCheck = dynamicCheck;
            return this;
        }

        /**
         * Premium.
         */
        public Builder premium(String premium) {
            this.premium = premium;
            return this;
        }

        /**
         * Price.
         */
        public Builder price(Long price) {
            this.price = price;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
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
         * StaticPriceInfo.
         */
        public Builder staticPriceInfo(StaticPriceInfo staticPriceInfo) {
            this.staticPriceInfo = staticPriceInfo;
            return this;
        }

        public CheckDomainResponseBody build() {
            return new CheckDomainResponseBody(this);
        } 

    } 

    public static class PriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("money")
        private Double money;

        @com.aliyun.core.annotation.NameInMap("period")
        private Long period;

        private PriceInfo(Builder builder) {
            this.action = builder.action;
            this.money = builder.money;
            this.period = builder.period;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return money
         */
        public Double getMoney() {
            return this.money;
        }

        /**
         * @return period
         */
        public Long getPeriod() {
            return this.period;
        }

        public static final class Builder {
            private String action; 
            private Double money; 
            private Long period; 

            /**
             * action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * money.
             */
            public Builder money(Double money) {
                this.money = money;
                return this;
            }

            /**
             * period.
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
    public static class StaticPriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PriceInfo")
        private java.util.List < PriceInfo> priceInfo;

        private StaticPriceInfo(Builder builder) {
            this.priceInfo = builder.priceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StaticPriceInfo create() {
            return builder().build();
        }

        /**
         * @return priceInfo
         */
        public java.util.List < PriceInfo> getPriceInfo() {
            return this.priceInfo;
        }

        public static final class Builder {
            private java.util.List < PriceInfo> priceInfo; 

            /**
             * PriceInfo.
             */
            public Builder priceInfo(java.util.List < PriceInfo> priceInfo) {
                this.priceInfo = priceInfo;
                return this;
            }

            public StaticPriceInfo build() {
                return new StaticPriceInfo(this);
            } 

        } 

    }
}
