// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * DeadDate.
             */
            public Builder deadDate(Long deadDate) {
                this.deadDate = deadDate;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Premium.
             */
            public Builder premium(Boolean premium) {
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
             * RegDate.
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
