// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceVpcAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceVpcAttributeRequest</p>
 */
public class ModifyInstanceVpcAttributeRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("SecurityGroupId")
    private java.util.List < String > securityGroupId;

    private ModifyInstanceVpcAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.vpcId = builder.vpcId;
        this.ownerId = builder.ownerId;
        this.instanceId = builder.instanceId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vSwitchId = builder.vSwitchId;
        this.privateIpAddress = builder.privateIpAddress;
        this.securityGroupId = builder.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceVpcAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return securityGroupId
     */
    public java.util.List < String > getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceVpcAttributeRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private String resourceOwnerAccount; 
        private String vpcId; 
        private Long ownerId; 
        private String instanceId; 
        private Long resourceOwnerId; 
        private String vSwitchId; 
        private String privateIpAddress; 
        private java.util.List < String > securityGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceVpcAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.vpcId = request.vpcId;
            this.ownerId = request.ownerId;
            this.instanceId = request.instanceId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vSwitchId = request.vSwitchId;
            this.privateIpAddress = request.privateIpAddress;
            this.securityGroupId = request.securityGroupId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
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
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The target VPC ID.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the vSwitch.
         * <p>
         * 
         * -If the input ID is the current vSwitch of the instance, the instance does not change the vSwitch.
         * -If the input ID is a new vSwitch and the parameter "VpcId" is empty, the new and old vswitches must belong to the same zone and VPC.
         * -If the "VpcId" parameter is not empty, the vswitch ID specified by this parameter must belong to VpcId and belong to the same zone as the original vswitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The new private ip address.
         * <p>
         * 
         * > "PrivateIpAddress" depends on "VSwitchId". The specified ip address must be in the subnet cidr block of the vswitch.
         * 
         * Default value: if this value is not specified, the vswitch subnet cidr block is randomly allocated.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The ID of the security group to which the instance belongs after the VPC is modified. This parameter must be specified only when the "VpcId" parameter is specified.
         * <p>
         * -The security group type must be the same.
         * -The list of security groups to which the instance is modified. It can be one or more. The value range of N in the parameter depends on the limit that the instance can join the security group. For more information, see [limits](~~ 25412 ~~).
         * -The security group of the VPC ECS instance must belong to the VPC where the "VpcId" belongs.
         */
        public Builder securityGroupId(java.util.List < String > securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        @Override
        public ModifyInstanceVpcAttributeRequest build() {
            return new ModifyInstanceVpcAttributeRequest(this);
        } 

    } 

}
