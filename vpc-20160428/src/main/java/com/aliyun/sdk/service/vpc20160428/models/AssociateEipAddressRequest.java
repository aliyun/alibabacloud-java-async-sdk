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
 * {@link AssociateEipAddressRequest} extends {@link RequestModel}
 *
 * <p>AssociateEipAddressRequest</p>
 */
public class AssociateEipAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String allocationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceRegionId")
    private String instanceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private AssociateEipAddressRequest(Builder builder) {
        super(builder);
        this.allocationId = builder.allocationId;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.instanceRegionId = builder.instanceRegionId;
        this.instanceType = builder.instanceType;
        this.mode = builder.mode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateEipAddressRequest create() {
        return builder().build();
    }

@Override
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceRegionId
     */
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<AssociateEipAddressRequest, Builder> {
        private String allocationId; 
        private String clientToken; 
        private String instanceId; 
        private String instanceRegionId; 
        private String instanceType; 
        private String mode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String privateIpAddress; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateEipAddressRequest request) {
            super(request);
            this.allocationId = request.allocationId;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.instanceRegionId = request.instanceRegionId;
            this.instanceType = request.instanceType;
            this.mode = request.mode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The ID of the EIP to be associated with the cloud resource instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-2zeerraiwb7ujsxdc****</p>
         */
        public Builder allocationId(String allocationId) {
            this.putQueryParameter("AllocationId", allocationId);
            this.allocationId = allocationId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The instance ID of the instance to be associated with the EIP.</p>
         * <p>You can enter the instance ID of a NAT gateway, a Classic Load Balancer (CLB) instance, an Elastic Compute Service (ECS) instance, a secondary elastic network interface controller (NIC) instance, a high-availability virtual IP address instance, or an IP address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zebb08phyczzawe****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the instance to be associated with the EIP.</p>
         * <blockquote>
         * <p>This parameter is required only after the EIP is added to a shared-bandwidth Global Accelerator (GA) instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder instanceRegionId(String instanceRegionId) {
            this.putQueryParameter("InstanceRegionId", instanceRegionId);
            this.instanceRegionId = instanceRegionId;
            return this;
        }

        /**
         * <p>The type of the instance to be associated with the EIP. Valid values:</p>
         * <ul>
         * <li><p><strong>Nat</strong>: NAT gateway.</p>
         * </li>
         * <li><p><strong>SlbInstance</strong>: Classic Load Balancer (CLB).</p>
         * </li>
         * <li><p><strong>EcsInstance</strong> (default): Elastic Compute Service (ECS).</p>
         * </li>
         * <li><p><strong>NetworkInterface</strong>: secondary elastic network interface controller (NIC).</p>
         * </li>
         * <li><p><strong>HaVip</strong>: high-availability virtual IP address. </p>
         * </li>
         * <li><p><strong>IpAddress</strong>: IP address.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default instance type is <strong>EcsInstance</strong>. If the instance type is not <strong>EcsInstance</strong>, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>EcsInstance</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The association mode. Valid values:</p>
         * <ul>
         * <li><p><strong>NAT</strong> (default): NAT mode (standard mode).</p>
         * </li>
         * <li><p><strong>MULTI_BINDED</strong>: multi-EIP-to-ENI mode.</p>
         * </li>
         * <li><p><strong>BINDED</strong>: EIP-to-ENI mode.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required only when <strong>InstanceType</strong> is set to <strong>NetworkInterface</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NAT</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>An IP address in the vSwitch CIDR block.</p>
         * <p>If you do not specify this parameter, the system automatically assigns a private IP address based on the VPC ID and vSwitch ID.</p>
         * <blockquote>
         * <p>If <strong>InstanceType</strong> is set to <strong>NetworkInterface</strong>, this parameter is required. Enter the private IP address to be associated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The region ID of the EIP to be associated with the cloud resource instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the VPC that has the IPv4 gateway feature enabled and is in the same region as the EIP.</p>
         * <p>When the EIP is associated with an IP address, the system can use the route configuration of the VPC to enable public network access for the associated IP address.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>InstanceType</strong> is set to <strong>IpAddress</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-257gqcdfvx6n****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public AssociateEipAddressRequest build() {
            return new AssociateEipAddressRequest(this);
        } 

    } 

}
