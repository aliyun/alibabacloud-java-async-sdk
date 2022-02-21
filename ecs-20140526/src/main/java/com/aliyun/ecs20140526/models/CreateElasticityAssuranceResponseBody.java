// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateElasticityAssuranceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateElasticityAssuranceResponseBody</p>
 */
public class CreateElasticityAssuranceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PrivatePoolOptionsId")
    private String privatePoolOptionsId;

    @NameInMap("OrderId")
    private String orderId;

    private CreateElasticityAssuranceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.privatePoolOptionsId = builder.privatePoolOptionsId;
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateElasticityAssuranceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return privatePoolOptionsId
     */
    public String getPrivatePoolOptionsId() {
        return this.privatePoolOptionsId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    public static final class Builder {
        private String requestId; 
        private String privatePoolOptionsId; 
        private String orderId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the elastic protection service.
         */
        public Builder privatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }

        /**
         * The ID of the generated order.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public CreateElasticityAssuranceResponseBody build() {
            return new CreateElasticityAssuranceResponseBody(this);
        } 

    } 

}
