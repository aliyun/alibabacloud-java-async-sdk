// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNatGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNatGatewayResponseBody</p>
 */
public class CreateNatGatewayResponseBody extends TeaModel {
    @NameInMap("NatGatewayId")
    private String natGatewayId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateNatGatewayResponseBody(Builder builder) {
        this.natGatewayId = builder.natGatewayId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String natGatewayId; 
        private String requestId; 

        /**
         * The ID of the NAT gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNatGatewayResponseBody build() {
            return new CreateNatGatewayResponseBody(this);
        } 

    } 

}
