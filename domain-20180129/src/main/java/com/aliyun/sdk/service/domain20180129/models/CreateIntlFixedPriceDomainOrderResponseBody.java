// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateIntlFixedPriceDomainOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIntlFixedPriceDomainOrderResponseBody</p>
 */
public class CreateIntlFixedPriceDomainOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIntlFixedPriceDomainOrderResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntlFixedPriceDomainOrderResponseBody create() {
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

        public CreateIntlFixedPriceDomainOrderResponseBody build() {
            return new CreateIntlFixedPriceDomainOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateIntlFixedPriceDomainOrderResponseBody} extends {@link TeaModel}
     *
     * <p>CreateIntlFixedPriceDomainOrderResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("OrderNo")
        private String orderNo;

        @com.aliyun.core.annotation.NameInMap("PayPrice")
        private Long payPrice;

        @com.aliyun.core.annotation.NameInMap("PayUrl")
        private String payUrl;

        private Module(Builder builder) {
            this.domain = builder.domain;
            this.orderNo = builder.orderNo;
            this.payPrice = builder.payPrice;
            this.payUrl = builder.payUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return orderNo
         */
        public String getOrderNo() {
            return this.orderNo;
        }

        /**
         * @return payPrice
         */
        public Long getPayPrice() {
            return this.payPrice;
        }

        /**
         * @return payUrl
         */
        public String getPayUrl() {
            return this.payUrl;
        }

        public static final class Builder {
            private String domain; 
            private String orderNo; 
            private Long payPrice; 
            private String payUrl; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
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
             * PayPrice.
             */
            public Builder payPrice(Long payPrice) {
                this.payPrice = payPrice;
                return this;
            }

            /**
             * PayUrl.
             */
            public Builder payUrl(String payUrl) {
                this.payUrl = payUrl;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
