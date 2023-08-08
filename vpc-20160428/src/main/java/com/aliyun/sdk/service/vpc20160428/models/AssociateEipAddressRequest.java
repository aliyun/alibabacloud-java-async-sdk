// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateEipAddressRequest} extends {@link RequestModel}
 *
 * <p>AssociateEipAddressRequest</p>
 */
public class AssociateEipAddressRequest extends Request {
    @Query
    @NameInMap("AllocationId")
    @Validation(required = true)
    private String allocationId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceRegionId")
    private String instanceRegionId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("VpcId")
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
         * The ID of the EIP that you want to associate with an instance.
         */
        public Builder allocationId(String allocationId) {
            this.putQueryParameter("AllocationId", allocationId);
            this.allocationId = allocationId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, the system sets **ClientToken** to the value of **RequestId**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the instance with which you want to associate the EIP.
         * <p>
         * 
         * You can enter the ID of a NAT gateway, CLB instance, ECS instance, secondary ENI, HAVIP, or IP address.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the instance with which you want to associate the EIP.
         * <p>
         * 
         * >  This parameter is required only when the EIP is associated with a shared-bandwidth Global Accelerator (GA) instance.
         */
        public Builder instanceRegionId(String instanceRegionId) {
            this.putQueryParameter("InstanceRegionId", instanceRegionId);
            this.instanceRegionId = instanceRegionId;
            return this;
        }

        /**
         * The type of instance with which you want to associate the EIP. Valid values:
         * <p>
         * 
         * *   **Nat**: a NAT gateway
         * *   **SlbInstance**: a CLB instance
         * *   **EcsInstance** (default): an ECS instance in a VPC
         * *   **NetworkInterface**: a secondary ENI
         * *   **HaVip**: an HAVIP
         * *   **IpAddress**: an IP address
         * 
         * >  If you do not set this parameter, the type of the instance with which you want to associate the EIP is **EcsInstance**. If the type of the instance with which you want to associate the EIP is not **EcsInstance**, this parameter is required.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The association mode. Valid values:
         * <p>
         * 
         * *   **NAT** (default): NAT mode
         * *   **MULTI_BINDED**: multi-EIP-to-ENI mode
         * *   **BINDED**: cut-through mode
         * 
         * >  This parameter is required only when **InstanceType** is set to **NetworkInterface**.
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
         * An IP address in the CIDR block of the vSwitch.
         * <p>
         * 
         * If you do not set this parameter, the system allocates a private IP address based on the VPC ID and vSwitch ID.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The ID of the region to which the EIP belongs.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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
         * The ID of the VPC that has IPv4 gateways enabled and that is deployed in the same region as the EIP.
         * <p>
         * 
         * When you associate an EIP with an IP address, the system can enable the IP address to access the Internet based on VPC route configurations.
         * 
         * >  This parameter is required if **InstanceType** is set to **IpAddress**. In this case, the EIP is associated with an IP address.
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
