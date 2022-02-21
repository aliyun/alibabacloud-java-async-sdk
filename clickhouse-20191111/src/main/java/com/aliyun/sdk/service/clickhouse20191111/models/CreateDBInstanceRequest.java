// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceRequest</p>
 */
public class CreateDBInstanceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBClusterCategory")
    @Validation(required = true)
    private String DBClusterCategory;

    @Query
    @NameInMap("DBClusterClass")
    @Validation(required = true)
    private String DBClusterClass;

    @Query
    @NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @Query
    @NameInMap("DBClusterNetworkType")
    @Validation(required = true)
    private String DBClusterNetworkType;

    @Query
    @NameInMap("DBClusterVersion")
    @Validation(required = true)
    private String DBClusterVersion;

    @Query
    @NameInMap("DBNodeGroupCount")
    @Validation(required = true)
    private String DBNodeGroupCount;

    @Query
    @NameInMap("DBNodeStorage")
    @Validation(required = true)
    private String DBNodeStorage;

    @Query
    @NameInMap("DbNodeStorageType")
    @Validation(required = true)
    private String dbNodeStorageType;

    @Query
    @NameInMap("EncryptionKey")
    private String encryptionKey;

    @Query
    @NameInMap("EncryptionType")
    private String encryptionType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("UsedTime")
    private String usedTime;

    @Query
    @NameInMap("VPCId")
    @Validation(required = true)
    private String VPCId;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateDBInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBClusterCategory = builder.DBClusterCategory;
        this.DBClusterClass = builder.DBClusterClass;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBClusterNetworkType = builder.DBClusterNetworkType;
        this.DBClusterVersion = builder.DBClusterVersion;
        this.DBNodeGroupCount = builder.DBNodeGroupCount;
        this.DBNodeStorage = builder.DBNodeStorage;
        this.dbNodeStorageType = builder.dbNodeStorageType;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionType = builder.encryptionType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBClusterCategory
     */
    public String getDBClusterCategory() {
        return this.DBClusterCategory;
    }

    /**
     * @return DBClusterClass
     */
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return DBClusterNetworkType
     */
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    /**
     * @return DBClusterVersion
     */
    public String getDBClusterVersion() {
        return this.DBClusterVersion;
    }

    /**
     * @return DBNodeGroupCount
     */
    public String getDBNodeGroupCount() {
        return this.DBNodeGroupCount;
    }

    /**
     * @return DBNodeStorage
     */
    public String getDBNodeStorage() {
        return this.DBNodeStorage;
    }

    /**
     * @return dbNodeStorageType
     */
    public String getDbNodeStorageType() {
        return this.dbNodeStorageType;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return encryptionType
     */
    public String getEncryptionType() {
        return this.encryptionType;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
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
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
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

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDBInstanceRequest, Builder> {
        private String clientToken; 
        private String DBClusterCategory; 
        private String DBClusterClass; 
        private String DBClusterDescription; 
        private String DBClusterNetworkType; 
        private String DBClusterVersion; 
        private String DBNodeGroupCount; 
        private String DBNodeStorage; 
        private String dbNodeStorageType; 
        private String encryptionKey; 
        private String encryptionType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.DBClusterCategory = response.DBClusterCategory;
            this.DBClusterClass = response.DBClusterClass;
            this.DBClusterDescription = response.DBClusterDescription;
            this.DBClusterNetworkType = response.DBClusterNetworkType;
            this.DBClusterVersion = response.DBClusterVersion;
            this.DBNodeGroupCount = response.DBNodeGroupCount;
            this.DBNodeStorage = response.DBNodeStorage;
            this.dbNodeStorageType = response.dbNodeStorageType;
            this.encryptionKey = response.encryptionKey;
            this.encryptionType = response.encryptionType;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.payType = response.payType;
            this.period = response.period;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.usedTime = response.usedTime;
            this.VPCId = response.VPCId;
            this.vSwitchId = response.vSwitchId;
            this.zoneId = response.zoneId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DBClusterCategory.
         */
        public Builder DBClusterCategory(String DBClusterCategory) {
            this.putQueryParameter("DBClusterCategory", DBClusterCategory);
            this.DBClusterCategory = DBClusterCategory;
            return this;
        }

        /**
         * DBClusterClass.
         */
        public Builder DBClusterClass(String DBClusterClass) {
            this.putQueryParameter("DBClusterClass", DBClusterClass);
            this.DBClusterClass = DBClusterClass;
            return this;
        }

        /**
         * DBClusterDescription.
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.putQueryParameter("DBClusterDescription", DBClusterDescription);
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * DBClusterNetworkType.
         */
        public Builder DBClusterNetworkType(String DBClusterNetworkType) {
            this.putQueryParameter("DBClusterNetworkType", DBClusterNetworkType);
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }

        /**
         * DBClusterVersion.
         */
        public Builder DBClusterVersion(String DBClusterVersion) {
            this.putQueryParameter("DBClusterVersion", DBClusterVersion);
            this.DBClusterVersion = DBClusterVersion;
            return this;
        }

        /**
         * DBNodeGroupCount.
         */
        public Builder DBNodeGroupCount(String DBNodeGroupCount) {
            this.putQueryParameter("DBNodeGroupCount", DBNodeGroupCount);
            this.DBNodeGroupCount = DBNodeGroupCount;
            return this;
        }

        /**
         * DBNodeStorage.
         */
        public Builder DBNodeStorage(String DBNodeStorage) {
            this.putQueryParameter("DBNodeStorage", DBNodeStorage);
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }

        /**
         * DbNodeStorageType.
         */
        public Builder dbNodeStorageType(String dbNodeStorageType) {
            this.putQueryParameter("DbNodeStorageType", dbNodeStorageType);
            this.dbNodeStorageType = dbNodeStorageType;
            return this;
        }

        /**
         * EncryptionKey.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * EncryptionType.
         */
        public Builder encryptionType(String encryptionType) {
            this.putQueryParameter("EncryptionType", encryptionType);
            this.encryptionType = encryptionType;
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
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * RegionId.
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
         * UsedTime.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
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

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDBInstanceRequest build() {
            return new CreateDBInstanceRequest(this);
        } 

    } 

}
