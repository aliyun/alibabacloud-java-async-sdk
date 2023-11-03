// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailabilityZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailabilityZonesRequest</p>
 */
public class DescribeAvailabilityZonesRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @Query
    @NameInMap("DbType")
    private String dbType;

    @Query
    @NameInMap("EngineVersion")
    private String engineVersion;

    @Query
    @NameInMap("ExcludeSecondaryZoneId")
    private String excludeSecondaryZoneId;

    @Query
    @NameInMap("ExcludeZoneId")
    private String excludeZoneId;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("MongoType")
    private String mongoType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StorageSupport")
    private String storageSupport;

    @Query
    @NameInMap("StorageType")
    private String storageType;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeAvailabilityZonesRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.dbType = builder.dbType;
        this.engineVersion = builder.engineVersion;
        this.excludeSecondaryZoneId = builder.excludeSecondaryZoneId;
        this.excludeZoneId = builder.excludeZoneId;
        this.instanceChargeType = builder.instanceChargeType;
        this.mongoType = builder.mongoType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.storageSupport = builder.storageSupport;
        this.storageType = builder.storageType;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailabilityZonesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return excludeSecondaryZoneId
     */
    public String getExcludeSecondaryZoneId() {
        return this.excludeSecondaryZoneId;
    }

    /**
     * @return excludeZoneId
     */
    public String getExcludeZoneId() {
        return this.excludeZoneId;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return mongoType
     */
    public String getMongoType() {
        return this.mongoType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return storageSupport
     */
    public String getStorageSupport() {
        return this.storageSupport;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeAvailabilityZonesRequest, Builder> {
        private String acceptLanguage; 
        private String DBInstanceClass; 
        private String dbType; 
        private String engineVersion; 
        private String excludeSecondaryZoneId; 
        private String excludeZoneId; 
        private String instanceChargeType; 
        private String mongoType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private String storageSupport; 
        private String storageType; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailabilityZonesRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.DBInstanceClass = request.DBInstanceClass;
            this.dbType = request.dbType;
            this.engineVersion = request.engineVersion;
            this.excludeSecondaryZoneId = request.excludeSecondaryZoneId;
            this.excludeZoneId = request.excludeZoneId;
            this.instanceChargeType = request.instanceChargeType;
            this.mongoType = request.mongoType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.storageSupport = request.storageSupport;
            this.storageType = request.storageType;
            this.zoneId = request.zoneId;
        } 

        /**
         * Specifies the language of the returned values of the **RegionName** and **ZoneName** parameters. Default value: zh. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese.
         * *   **en**: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * DBInstanceClass.
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * The database engine type of the instance. Valid values:
         * <p>
         * 
         * *   **normal**: replica set instance
         * *   **sharding**: sharded cluster instance
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * EngineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * ExcludeSecondaryZoneId.
         */
        public Builder excludeSecondaryZoneId(String excludeSecondaryZoneId) {
            this.putQueryParameter("ExcludeSecondaryZoneId", excludeSecondaryZoneId);
            this.excludeSecondaryZoneId = excludeSecondaryZoneId;
            return this;
        }

        /**
         * ExcludeZoneId.
         */
        public Builder excludeZoneId(String excludeZoneId) {
            this.putQueryParameter("ExcludeZoneId", excludeZoneId);
            this.excludeZoneId = excludeZoneId;
            return this;
        }

        /**
         * The billing method of the instance. Default value: PrePaid. Valid values:
         * <p>
         * 
         * *   **PrePaid**: subscription
         * *   **PostPaid**: pay-as-you-go
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The edition of the ApsaraDB for MongoDB instance. The instance can be of a high-availability edition or beta edition.
         */
        public Builder mongoType(String mongoType) {
            this.putQueryParameter("MongoType", mongoType);
            this.mongoType = mongoType;
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
         * The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the latest available regions.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group. For more information, see [View basic information of a resource group](~~151181~~).
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The zones to be displayed. The values include the zones in which you can create an instance that uses cloud disks, the zones in which you can create an instance that uses local disks, and the zones in which you can create an instance that uses cloud disks and local disks.
         */
        public Builder storageSupport(String storageSupport) {
            this.putQueryParameter("StorageSupport", storageSupport);
            this.storageSupport = storageSupport;
            return this;
        }

        /**
         * The storage type of the instance. Valid values:
         * <p>
         * 
         * *   **cloud_essd1**: PL1.enhanced SSD (ESSD)
         * *   **cloud_essd2**: PL2 ESSD.
         * *   **cloud_essd3**: PL3 ESSD.
         * *   **local_ssd**: local SSD.
         * 
         * > 
         * 
         * *   Instances of MongoDB 4.4 and later only support cloud disks. **cloud_essd1** is selected if you leave this parameter empty.
         * 
         * *   Instances of MongoDB 4.2 and earlier support only local disks. **local_ssd** is selected if you leave this parameter empty.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * The zone ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query available zones.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeAvailabilityZonesRequest build() {
            return new DescribeAvailabilityZonesRequest(this);
        } 

    } 

}
