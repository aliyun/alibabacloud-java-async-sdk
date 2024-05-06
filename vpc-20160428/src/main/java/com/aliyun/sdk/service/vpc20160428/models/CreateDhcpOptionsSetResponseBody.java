// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDhcpOptionsSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDhcpOptionsSetResponseBody</p>
 */
public class CreateDhcpOptionsSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DhcpOptionsSetId")
    private String dhcpOptionsSetId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateDhcpOptionsSetResponseBody(Builder builder) {
        this.dhcpOptionsSetId = builder.dhcpOptionsSetId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDhcpOptionsSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return dhcpOptionsSetId
     */
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
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
        private String dhcpOptionsSetId; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * The ID of the DHCP options set that is created.
         */
        public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
            this.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group to which the DHCP options set belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public CreateDhcpOptionsSetResponseBody build() {
            return new CreateDhcpOptionsSetResponseBody(this);
        } 

    } 

}
