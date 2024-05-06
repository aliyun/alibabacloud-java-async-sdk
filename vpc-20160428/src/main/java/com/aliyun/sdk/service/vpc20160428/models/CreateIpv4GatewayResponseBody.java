// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpv4GatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpv4GatewayResponseBody</p>
 */
public class CreateIpv4GatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv4GatewayId")
    private String ipv4GatewayId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateIpv4GatewayResponseBody(Builder builder) {
        this.ipv4GatewayId = builder.ipv4GatewayId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpv4GatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv4GatewayId
     */
    public String getIpv4GatewayId() {
        return this.ipv4GatewayId;
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
        private String ipv4GatewayId; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * The ID of the IPv4 gateway.
         */
        public Builder ipv4GatewayId(String ipv4GatewayId) {
            this.ipv4GatewayId = ipv4GatewayId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public CreateIpv4GatewayResponseBody build() {
            return new CreateIpv4GatewayResponseBody(this);
        } 

    } 

}
