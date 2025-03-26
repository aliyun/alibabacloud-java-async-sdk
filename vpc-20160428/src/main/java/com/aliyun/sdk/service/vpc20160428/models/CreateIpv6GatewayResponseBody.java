// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateIpv6GatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpv6GatewayResponseBody</p>
 */
public class CreateIpv6GatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6GatewayId")
    private String ipv6GatewayId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateIpv6GatewayResponseBody model) {
            this.ipv6GatewayId = model.ipv6GatewayId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
        } 

        /**
         * <p>The ID of the IPv6 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6gw-hp3y0l3ln89j8cdvf****</p>
         */
        public Builder ipv6GatewayId(String ipv6GatewayId) {
            this.ipv6GatewayId = ipv6GatewayId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the IPv6 gateway belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
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
