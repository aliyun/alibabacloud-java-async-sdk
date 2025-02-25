// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeAvailabilityZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailabilityZonesRequest</p>
 */
public class DescribeAvailabilityZonesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeSecondaryZoneId")
    private String excludeSecondaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeZoneId")
    private String excludeZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MongoType")
    private String mongoType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationFactor")
    private String replicationFactor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSupport")
    private String storageSupport;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
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
        this.replicationFactor = builder.replicationFactor;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return replicationFactor
     */
    public String getReplicationFactor() {
        return this.replicationFactor;
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
        private String replicationFactor; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
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
            this.replicationFactor = request.replicationFactor;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.storageSupport = request.storageSupport;
            this.storageType = request.storageType;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The language of the values of the returned <strong>RegionName</strong> and <strong>ZoneName</strong> parameters. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The instance type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dds.mongo.standard</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The architecture of the instance. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: replica set instance</li>
         * <li><strong>sharding</strong>: sharded cluster instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * <p>The database engine version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The secondary zone ID that is excluded from the query results. You can configure the ExcludeZoneId and ExcludeSecondaryZoneId parameters to specify the IDs of multiple zones that are excluded from the query results.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        public Builder excludeSecondaryZoneId(String excludeSecondaryZoneId) {
            this.putQueryParameter("ExcludeSecondaryZoneId", excludeSecondaryZoneId);
            this.excludeSecondaryZoneId = excludeSecondaryZoneId;
            return this;
        }

        /**
         * <p>The zone ID that is excluded from the query results.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-g</p>
         */
        public Builder excludeZoneId(String excludeZoneId) {
            this.putQueryParameter("ExcludeZoneId", excludeZoneId);
            this.excludeZoneId = excludeZoneId;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong> (default): subscription</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The edition of the instance. High-Available Edition and Preview Edition (dbfs) are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>dbfs</p>
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
         * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the latest available regions.</p>
         * <p>This parameter is required.</p>
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
         * <p>The number of nodes. This parameter is available only for replica set instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder replicationFactor(String replicationFactor) {
            this.putQueryParameter("ReplicationFactor", replicationFactor);
            this.replicationFactor = replicationFactor;
            return this;
        }

        /**
         * <p>The ID of the resource group. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmx2m4rqu7pry</p>
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
         * <p>The storage type of the instance. </p>
         * <ul>
         * <li><strong>cloud</strong>: The system displays only zones in which cloud disk-based instances can be deployed. </li>
         * <li><strong>local</strong>: The system displays only zones in which local disk-based instances can be deployed. </li>
         * <li><strong>default</strong> or null: The system displays only zones in which cloud disk-based and local disk-based instances can be deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        public Builder storageSupport(String storageSupport) {
            this.putQueryParameter("StorageSupport", storageSupport);
            this.storageSupport = storageSupport;
            return this;
        }

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>cloud_essd1</strong>: PL1 enhanced SSD (ESSD)</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
         * <li><strong>local_ssd</strong>: Local SSD</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Instances that run MongoDB 4.4 or later support only cloud disks. <strong>cloud_essd1</strong> is selected if you leave this parameter empty.</li>
         * <li>Instances that run MongoDB 4.2 and earlier support only local disks. <strong>local_ssd</strong> is selected if you leave this parameter empty.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>local_ssd</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query available zones.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
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
