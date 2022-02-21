// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

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
    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("PrivatePoolOptionsId")
    private String privatePoolOptionsId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateElasticityAssuranceResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.privatePoolOptionsId = builder.privatePoolOptionsId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateElasticityAssuranceResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return privatePoolOptionsId
     */
    public String getPrivatePoolOptionsId() {
        return this.privatePoolOptionsId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String orderId; 
        private String privatePoolOptionsId; 
        private String requestId; 

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * PrivatePoolOptionsId.
         */
        public Builder privatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateElasticityAssuranceResponseBody build() {
            return new CreateElasticityAssuranceResponseBody(this);
        } 

    } 

}
