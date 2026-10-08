// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CheckDomainResponseBody model) {
            this.avail = model.avail;
            this.domainName = model.domainName;
            this.dynamicCheck = model.dynamicCheck;
            this.premium = model.premium;
            this.price = model.price;
            this.reason = model.reason;
            this.requestId = model.requestId;
            this.staticPriceInfo = model.staticPriceInfo;
        } 

        /**
         * <p>Indicates whether the domain name can be registered. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Registrable.  </li>
         * <li><strong>3</strong>: Pre-registration.  </li>
         * <li><strong>4</strong>: Deletion reservation available.  </li>
         * <li><strong>0</strong>: Not registrable.  </li>
         * <li><strong>-1</strong>: Abnormal.  </li>
         * <li><strong>-2</strong>: Registration paused.  </li>
         * <li><strong>-3</strong>: Blacklisted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder avail(String avail) {
            this.avail = avail;
            return this;
        }

        /**
         * <p>The queried domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test**.xin</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Indicates whether dynamic pricing is enabled. Valid values:  </p>
         * <ul>
         * <li><strong>true</strong>: Yes.  </li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dynamicCheck(Boolean dynamicCheck) {
            this.dynamicCheck = dynamicCheck;
            return this;
        }

        /**
         * <p>Indicates whether the domain name is a premium term. Valid values:  </p>
         * <ul>
         * <li><strong>true</strong>: Yes.  </li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder premium(String premium) {
            this.premium = premium;
            return this;
        }

        /**
         * <p>Registration price for premium domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>1286</p>
         */
        public Builder price(Long price) {
            this.price = price;
            return this;
        }

        /**
         * <p>The reason for non-registrability returned by the domain name registry.  </p>
         * <blockquote>
         * <p>The reason may vary depending on the domain name registry.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>In use</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>Unique request access token.</p>
         * 
         * <strong>example:</strong>
         * <p>BA7A4FD4-EB9A-4A20-BB0C-9AEB15634DC1</p>
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

    /**
     * 
     * {@link CheckDomainResponseBody} extends {@link TeaModel}
     *
     * <p>CheckDomainResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PriceInfo model) {
                this.action = model.action;
                this.money = model.money;
                this.period = model.period;
            } 

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
    /**
     * 
     * {@link CheckDomainResponseBody} extends {@link TeaModel}
     *
     * <p>CheckDomainResponseBody</p>
     */
    public static class StaticPriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PriceInfo")
        private java.util.List<PriceInfo> priceInfo;

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
        public java.util.List<PriceInfo> getPriceInfo() {
            return this.priceInfo;
        }

        public static final class Builder {
            private java.util.List<PriceInfo> priceInfo; 

            private Builder() {
            } 

            private Builder(StaticPriceInfo model) {
                this.priceInfo = model.priceInfo;
            } 

            /**
             * PriceInfo.
             */
            public Builder priceInfo(java.util.List<PriceInfo> priceInfo) {
                this.priceInfo = priceInfo;
                return this;
            }

            public StaticPriceInfo build() {
                return new StaticPriceInfo(this);
            } 

        } 

    }
}
