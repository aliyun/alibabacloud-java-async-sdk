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
         * AllocationId.
         */
        public Builder allocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * EipAddress.
         */
        public Builder eipAddress(String eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
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

        public AllocateEipAddressProResponseBody build() {
            return new AllocateEipAddressProResponseBody(this);
        } 

    } 

}
