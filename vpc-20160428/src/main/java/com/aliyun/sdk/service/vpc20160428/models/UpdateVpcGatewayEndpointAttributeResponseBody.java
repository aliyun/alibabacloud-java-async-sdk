// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateVpcGatewayEndpointAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateVpcGatewayEndpointAttributeResponseBody</p>
 */
public class UpdateVpcGatewayEndpointAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateVpcGatewayEndpointAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVpcGatewayEndpointAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E9654534-5A38-5545-813F-0403D49042FB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateVpcGatewayEndpointAttributeResponseBody build() {
            return new UpdateVpcGatewayEndpointAttributeResponseBody(this);
        } 

    } 

}
