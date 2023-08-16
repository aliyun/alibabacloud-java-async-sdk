// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFixedPriceSelectedOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFixedPriceSelectedOrderResponseBody</p>
 */
public class CreateFixedPriceSelectedOrderResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Module")
    private Module module;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateFixedPriceSelectedOrderResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFixedPriceSelectedOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private Integer httpStatusCode; 
        private Module module; 
        private String requestId; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateFixedPriceSelectedOrderResponseBody build() {
            return new CreateFixedPriceSelectedOrderResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("OrderNo")
        private String orderNo;

        @NameInMap("Price")
        private Long price;

        private Module(Builder builder) {
            this.domain = builder.domain;
            this.orderNo = builder.orderNo;
            this.price = builder.price;
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
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        public static final class Builder {
            private String domain; 
            private String orderNo; 
            private Long price; 

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
             * Price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
