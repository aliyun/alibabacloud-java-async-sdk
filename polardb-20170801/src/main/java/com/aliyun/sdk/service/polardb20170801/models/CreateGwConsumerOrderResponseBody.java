// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateGwConsumerOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGwConsumerOrderResponseBody</p>
 */
public class CreateGwConsumerOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreditToken")
    private String creditToken;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateGwConsumerOrderResponseBody(Builder builder) {
        this.creditToken = builder.creditToken;
        this.expireTime = builder.expireTime;
        this.gatewayId = builder.gatewayId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGwConsumerOrderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creditToken
     */
    public String getCreditToken() {
        return this.creditToken;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
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

    public static final class Builder {
        private String creditToken; 
        private String expireTime; 
        private String gatewayId; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateGwConsumerOrderResponseBody model) {
            this.creditToken = model.creditToken;
            this.expireTime = model.expireTime;
            this.gatewayId = model.gatewayId;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * CreditToken.
         */
        public Builder creditToken(String creditToken) {
            this.creditToken = creditToken;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGwConsumerOrderResponseBody build() {
            return new CreateGwConsumerOrderResponseBody(this);
        } 

    } 

}
