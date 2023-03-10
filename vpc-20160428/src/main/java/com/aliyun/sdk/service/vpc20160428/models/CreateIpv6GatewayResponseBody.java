// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpv6GatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpv6GatewayResponseBody</p>
 */
public class CreateIpv6GatewayResponseBody extends TeaModel {
    @NameInMap("Ipv6GatewayId")
    private String ipv6GatewayId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateIpv6GatewayResponseBody(Builder builder) {
        this.ipv6GatewayId = builder.ipv6GatewayId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpv6GatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv6GatewayId
     */
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder {
        private String ipv6GatewayId; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * Ipv6GatewayId.
         */
        public Builder ipv6GatewayId(String ipv6GatewayId) {
            this.ipv6GatewayId = ipv6GatewayId;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public CreateIpv6GatewayResponseBody build() {
            return new CreateIpv6GatewayResponseBody(this);
        } 

    } 

}
