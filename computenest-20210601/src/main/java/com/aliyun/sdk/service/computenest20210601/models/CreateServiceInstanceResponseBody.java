// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceInstanceResponseBody</p>
 */
public class CreateServiceInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MarketInstanceId")
    private String marketInstanceId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateServiceInstanceResponseBody(Builder builder) {
        this.marketInstanceId = builder.marketInstanceId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.serviceInstanceId = builder.serviceInstanceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return marketInstanceId
     */
    public String getMarketInstanceId() {
        return this.marketInstanceId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String marketInstanceId; 
        private String orderId; 
        private String requestId; 
        private String serviceInstanceId; 
        private String status; 

        /**
         * MarketInstanceId.
         */
        public Builder marketInstanceId(String marketInstanceId) {
            this.marketInstanceId = marketInstanceId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
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
         * ServiceInstanceId.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateServiceInstanceResponseBody build() {
            return new CreateServiceInstanceResponseBody(this);
        } 

    } 

}
