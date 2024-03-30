// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchNetworkRequest} extends {@link RequestModel}
 *
 * <p>SwitchNetworkRequest</p>
 */
public class SwitchNetworkRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ClassicExpiredDays")
    private String classicExpiredDays;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RetainClassic")
    private String retainClassic;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("TargetNetworkType")
    private String targetNetworkType;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private SwitchNetworkRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.classicExpiredDays = builder.classicExpiredDays;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retainClassic = builder.retainClassic;
        this.securityToken = builder.securityToken;
        this.targetNetworkType = builder.targetNetworkType;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchNetworkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return classicExpiredDays
     */
    public String getClassicExpiredDays() {
        return this.classicExpiredDays;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return retainClassic
     */
    public String getRetainClassic() {
        return this.retainClassic;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return targetNetworkType
     */
    public String getTargetNetworkType() {
        return this.targetNetworkType;
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

    public static final class Builder extends Request.Builder<SwitchNetworkRequest, Builder> {
        private String regionId; 
        private String classicExpiredDays; 
        private String instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String retainClassic; 
        private String securityToken; 
        private String targetNetworkType; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(SwitchNetworkRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.classicExpiredDays = request.classicExpiredDays;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.retainClassic = request.retainClassic;
            this.securityToken = request.securityToken;
            this.targetNetworkType = request.targetNetworkType;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The retention period of the classic network endpoint. Valid values: **14**, **30**, **60**, and **120**. Unit: days.
         * <p>
         * 
         * > 
         * 
         * *   This parameter is available and required only when the **RetainClassic** parameter is set to **True**.
         * 
         * *   After you complete the switchover operation, you can also call the [ModifyInstanceNetExpireTime](~~61010~~) operation to modify the retention period of the classic network endpoint.
         */
        public Builder classicExpiredDays(String classicExpiredDays) {
            this.putQueryParameter("ClassicExpiredDays", classicExpiredDays);
            this.classicExpiredDays = classicExpiredDays;
            return this;
        }

        /**
         * The ID of the instance. You can call the [DescribeInstances](~~60933~~) operation to query the ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * Specifies whether to retain the original classic network endpoint after you switch the instance from classic network to VPC. Default value: False. Valid values:
         * <p>
         * 
         * *   **True**: retains the classic network endpoint.
         * *   **False**: does not retain the classic network endpoint.
         * 
         * > This parameter is available only when the network type of the instance is classic network.
         */
        public Builder retainClassic(String retainClassic) {
            this.putQueryParameter("RetainClassic", retainClassic);
            this.retainClassic = retainClassic;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The network type to which you want to switch. Set the value to **VPC**.
         */
        public Builder targetNetworkType(String targetNetworkType) {
            this.putQueryParameter("TargetNetworkType", targetNetworkType);
            this.targetNetworkType = targetNetworkType;
            return this;
        }

        /**
         * The ID of the vSwitch that belongs to the VPC to which you want to switch. You can call the [DescribeVpcs](~~35739~~) operation to query the VPC ID.
         * <p>
         * 
         * > The vSwitch and the ApsaraDB for Redis instance must be deployed in the same zone.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the VPC to which you want to switch. You can call the [DescribeVpcs](~~35739~~) operation to query the VPC ID.
         * <p>
         * 
         * > 
         * 
         * *   The VPC and the ApsaraDB for Redis instance must be deployed in the same region.
         * 
         * *   After you set this parameter, you must also set the **VSwitchId** parameter.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public SwitchNetworkRequest build() {
            return new SwitchNetworkRequest(this);
        } 

    } 

}
