// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceNetworkTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceNetworkTypeRequest</p>
 */
public class ModifyDBInstanceNetworkTypeRequest extends Request {
    @Query
    @NameInMap("ClassicExpiredDays")
    private String classicExpiredDays;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("InstanceNetworkType")
    @Validation(required = true)
    private String instanceNetworkType;

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
    @NameInMap("ReadWriteSplittingClassicExpiredDays")
    private Integer readWriteSplittingClassicExpiredDays;

    @Query
    @NameInMap("ReadWriteSplittingPrivateIpAddress")
    private String readWriteSplittingPrivateIpAddress;

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
    @NameInMap("VPCId")
    private String VPCId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    private ModifyDBInstanceNetworkTypeRequest(Builder builder) {
        super(builder);
        this.classicExpiredDays = builder.classicExpiredDays;
        this.DBInstanceId = builder.DBInstanceId;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.privateIpAddress = builder.privateIpAddress;
        this.readWriteSplittingClassicExpiredDays = builder.readWriteSplittingClassicExpiredDays;
        this.readWriteSplittingPrivateIpAddress = builder.readWriteSplittingPrivateIpAddress;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retainClassic = builder.retainClassic;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceNetworkTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classicExpiredDays
     */
    public String getClassicExpiredDays() {
        return this.classicExpiredDays;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
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
     * @return readWriteSplittingClassicExpiredDays
     */
    public Integer getReadWriteSplittingClassicExpiredDays() {
        return this.readWriteSplittingClassicExpiredDays;
    }

    /**
     * @return readWriteSplittingPrivateIpAddress
     */
    public String getReadWriteSplittingPrivateIpAddress() {
        return this.readWriteSplittingPrivateIpAddress;
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
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceNetworkTypeRequest, Builder> {
        private String classicExpiredDays; 
        private String DBInstanceId; 
        private String instanceNetworkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String privateIpAddress; 
        private Integer readWriteSplittingClassicExpiredDays; 
        private String readWriteSplittingPrivateIpAddress; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String retainClassic; 
        private String VPCId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceNetworkTypeRequest request) {
            super(request);
            this.classicExpiredDays = request.classicExpiredDays;
            this.DBInstanceId = request.DBInstanceId;
            this.instanceNetworkType = request.instanceNetworkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.privateIpAddress = request.privateIpAddress;
            this.readWriteSplittingClassicExpiredDays = request.readWriteSplittingClassicExpiredDays;
            this.readWriteSplittingPrivateIpAddress = request.readWriteSplittingPrivateIpAddress;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.retainClassic = request.retainClassic;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * ClassicExpiredDays.
         */
        public Builder classicExpiredDays(String classicExpiredDays) {
            this.putQueryParameter("ClassicExpiredDays", classicExpiredDays);
            this.classicExpiredDays = classicExpiredDays;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * InstanceNetworkType.
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
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
         * PrivateIpAddress.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * ReadWriteSplittingClassicExpiredDays.
         */
        public Builder readWriteSplittingClassicExpiredDays(Integer readWriteSplittingClassicExpiredDays) {
            this.putQueryParameter("ReadWriteSplittingClassicExpiredDays", readWriteSplittingClassicExpiredDays);
            this.readWriteSplittingClassicExpiredDays = readWriteSplittingClassicExpiredDays;
            return this;
        }

        /**
         * ReadWriteSplittingPrivateIpAddress.
         */
        public Builder readWriteSplittingPrivateIpAddress(String readWriteSplittingPrivateIpAddress) {
            this.putQueryParameter("ReadWriteSplittingPrivateIpAddress", readWriteSplittingPrivateIpAddress);
            this.readWriteSplittingPrivateIpAddress = readWriteSplittingPrivateIpAddress;
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
         * RetainClassic.
         */
        public Builder retainClassic(String retainClassic) {
            this.putQueryParameter("RetainClassic", retainClassic);
            this.retainClassic = retainClassic;
            return this;
        }

        /**
         * VPCId.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public ModifyDBInstanceNetworkTypeRequest build() {
            return new ModifyDBInstanceNetworkTypeRequest(this);
        } 

    } 

}
