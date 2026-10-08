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
 * {@link CheckIntlFixPriceDomainStatusResponseBody} extends {@link TeaModel}
 *
 * <p>CheckIntlFixPriceDomainStatusResponseBody</p>
 */
public class CheckIntlFixPriceDomainStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckIntlFixPriceDomainStatusResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckIntlFixPriceDomainStatusResponseBody create() {
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

        private Builder(CheckIntlFixPriceDomainStatusResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned object.</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40F46D3D-F4F3-4CCB-AC30-2DD20E32E528</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckIntlFixPriceDomainStatusResponseBody build() {
            return new CheckIntlFixPriceDomainStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckIntlFixPriceDomainStatusResponseBody} extends {@link TeaModel}
     *
     * <p>CheckIntlFixPriceDomainStatusResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DeadDate")
        private Long deadDate;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Premium")
        private Boolean premium;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("RegDate")
        private Long regDate;

        private Module(Builder builder) {
            this.currency = builder.currency;
            this.deadDate = builder.deadDate;
            this.domain = builder.domain;
            this.endTime = builder.endTime;
            this.premium = builder.premium;
            this.price = builder.price;
            this.regDate = builder.regDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return deadDate
         */
        public Long getDeadDate() {
            return this.deadDate;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return premium
         */
        public Boolean getPremium() {
            return this.premium;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return regDate
         */
        public Long getRegDate() {
            return this.regDate;
        }

        public static final class Builder {
            private String currency; 
            private Long deadDate; 
            private String domain; 
            private Long endTime; 
            private Boolean premium; 
            private Long price; 
            private Long regDate; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.currency = model.currency;
                this.deadDate = model.deadDate;
                this.domain = model.domain;
                this.endTime = model.endTime;
                this.premium = model.premium;
                this.price = model.price;
                this.regDate = model.regDate;
            } 

            /**
             * <p>The currency. Valid values:</p>
             * <ul>
             * <li><p>RMB: Chinese Yuan.</p>
             * </li>
             * <li><p>USD: US Dollar.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USD</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The expiration date of the domain name. After this date, the domain name requires renewal.</p>
             * 
             * <strong>example:</strong>
             * <p>1567353497</p>
             */
            public Builder deadDate(Long deadDate) {
                this.deadDate = deadDate;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The sale deadline of the domain name. After this time, the domain name is no longer available for sale.</p>
             * 
             * <strong>example:</strong>
             * <p>1567353497</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether the domain name is a premium domain name. Valid values:</p>
             * <ul>
             * <li><p>true: The domain name is a premium domain name.</p>
             * </li>
             * <li><p>false: The domain name is not a premium domain name.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder premium(Boolean premium) {
                this.premium = premium;
                return this;
            }

            /**
             * <p>The price.</p>
             * 
             * <strong>example:</strong>
             * <p>20.00</p>
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * <p>The registration date of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>1566353497</p>
             */
            public Builder regDate(Long regDate) {
                this.regDate = regDate;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
