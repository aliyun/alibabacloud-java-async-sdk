// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateElasticityAssuranceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateElasticityAssuranceResponseBody</p>
 */
public class CreateElasticityAssuranceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("PrivatePoolOptionsId")
    private String privatePoolOptionsId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The elasticity assurance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        public Builder privatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
