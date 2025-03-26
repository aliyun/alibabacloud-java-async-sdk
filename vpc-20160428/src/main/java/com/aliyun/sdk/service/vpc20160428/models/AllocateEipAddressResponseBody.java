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
 * {@link AllocateEipAddressResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateEipAddressResponseBody</p>
 */
public class AllocateEipAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    private String allocationId;

    @com.aliyun.core.annotation.NameInMap("EipAddress")
    private String eipAddress;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private AllocateEipAddressResponseBody(Builder builder) {
        this.allocationId = builder.allocationId;
        this.eipAddress = builder.eipAddress;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateEipAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AllocateEipAddressResponseBody model) {
            this.allocationId = model.allocationId;
            this.eipAddress = model.eipAddress;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
        } 

        /**
         * <p>The EIP ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-25877c70gddh****</p>
         */
        public Builder allocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * <p>The EIP that is allocated. This parameter is returned only when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder eipAddress(String eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }

        /**
         * <p>The order ID. This parameter is returned only when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group. This parameter is returned only when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazfdgdg****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public AllocateEipAddressResponseBody build() {
            return new AllocateEipAddressResponseBody(this);
        } 

    } 

}
