// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateEipAddressProResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateEipAddressProResponseBody</p>
 */
public class AllocateEipAddressProResponseBody extends TeaModel {
    @NameInMap("AllocationId")
    private String allocationId;

    @NameInMap("EipAddress")
    private String eipAddress;

    @NameInMap("OrderId")
    private Long orderId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private AllocateEipAddressProResponseBody(Builder builder) {
        this.allocationId = builder.allocationId;
        this.eipAddress = builder.eipAddress;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateEipAddressProResponseBody create() {
        return builder().build();
    }

    /**
     * @return allocationId
     */
    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * @return eipAddress
     */
    public String getEipAddress() {
        return this.eipAddress;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
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
        private String allocationId; 
        private String eipAddress; 
        private Long orderId; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * The ID of the specified EIP.
         */
        public Builder allocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * The IP address of the requested EIP.
         */
        public Builder eipAddress(String eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }

        /**
         * The order number. This parameter is returned only when **InstanceChargeType** is set to **PrePaid**.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
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

        public AllocateEipAddressProResponseBody build() {
            return new AllocateEipAddressProResponseBody(this);
        } 

    } 

}
