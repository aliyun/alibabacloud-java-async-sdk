// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcEndpointResponseBody</p>
 */
public class CreateVpcEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpcEndpointId")
    private String vpcEndpointId;

    private CreateVpcEndpointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vpcEndpointId = builder.vpcEndpointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcEndpointId
     */
    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    public static final class Builder {
        private String requestId; 
        private String vpcEndpointId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VpcEndpointId.
         */
        public Builder vpcEndpointId(String vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }

        public CreateVpcEndpointResponseBody build() {
            return new CreateVpcEndpointResponseBody(this);
        } 

    } 

}
