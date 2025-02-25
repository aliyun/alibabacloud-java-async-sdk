// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link CreateLoadBalancerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLoadBalancerResponseBody</p>
 */
public class CreateLoadBalancerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateLoadBalancerResponseBody(Builder builder) {
        this.address = builder.address;
        this.addressIPVersion = builder.addressIPVersion;
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerName = builder.loadBalancerName;
        this.networkType = builder.networkType;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerResponseBody create() {
        return builder().build();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return addressIPVersion
     */
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String address; 
        private String addressIPVersion; 
        private String loadBalancerId; 
        private String loadBalancerName; 
        private String networkType; 
        private Long orderId; 
        private String requestId; 
        private String resourceGroupId; 
        private String vSwitchId; 
        private String vpcId; 

        /**
         * <p>The IP address that is allocated to the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>42.XX.XX.6</p>
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * <p>The IP version that is used by the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * <p>The CLB instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-hddhfjg****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The CLB instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1o94dp5i6ea****</p>
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * <p>The network type of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>vpc</strong></li>
         * <li><strong>classic</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>classic</p>
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The order ID of the subscription CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>20212961978****</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the CLB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rto****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the CLB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-255ecr****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the CLB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-25dvzy9****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public CreateLoadBalancerResponseBody build() {
            return new CreateLoadBalancerResponseBody(this);
        } 

    } 

}
