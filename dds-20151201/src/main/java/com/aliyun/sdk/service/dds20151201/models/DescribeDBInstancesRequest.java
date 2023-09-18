// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstancesRequest</p>
 */
public class DescribeDBInstancesRequest extends Request {
    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("ConnectionDomain")
    private String connectionDomain;

    @Query
    @NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @Query
    @NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @Query
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @Query
    @NameInMap("DBInstanceStatus")
    private String DBInstanceStatus;

    @Query
    @NameInMap("DBInstanceType")
    private String DBInstanceType;

    @Query
    @NameInMap("DBNodeType")
    private String DBNodeType;

    @Query
    @NameInMap("Engine")
    private String engine;

    @Query
    @NameInMap("EngineVersion")
    private String engineVersion;

    @Query
    @NameInMap("ExpireTime")
    private String expireTime;

    @Query
    @NameInMap("Expired")
    private String expired;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ReplicationFactor")
    private String replicationFactor;

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
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeDBInstancesRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.connectionDomain = builder.connectionDomain;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStatus = builder.DBInstanceStatus;
        this.DBInstanceType = builder.DBInstanceType;
        this.DBNodeType = builder.DBNodeType;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.expireTime = builder.expireTime;
        this.expired = builder.expired;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.replicationFactor = builder.replicationFactor;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return connectionDomain
     */
    public String getConnectionDomain() {
        return this.connectionDomain;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceStatus
     */
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    /**
     * @return DBInstanceType
     */
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    /**
     * @return DBNodeType
     */
    public String getDBNodeType() {
        return this.DBNodeType;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expired
     */
    public String getExpired() {
        return this.expired;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeDBInstancesRequest, Builder> {
        private String chargeType; 
        private String connectionDomain; 
        private String DBInstanceClass; 
        private String DBInstanceDescription; 
        private String DBInstanceId; 
        private String DBInstanceStatus; 
        private String DBInstanceType; 
        private String DBNodeType; 
        private String engine; 
        private String engineVersion; 
        private String expireTime; 
        private String expired; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String replicationFactor; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstancesRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.connectionDomain = request.connectionDomain;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStatus = request.DBInstanceStatus;
            this.DBInstanceType = request.DBInstanceType;
            this.DBNodeType = request.DBNodeType;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.expireTime = request.expireTime;
            this.expired = request.expired;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.replicationFactor = request.replicationFactor;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   **PrePaid**: subscription
         * *   **PostPaid**: pay-as-you-go
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The endpoint of the node. You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to query the endpoint of the node.
         */
        public Builder connectionDomain(String connectionDomain) {
            this.putQueryParameter("ConnectionDomain", connectionDomain);
            this.connectionDomain = connectionDomain;
            return this;
        }

        /**
         * The instance type. For more information about valid values, see [Instance types](~~57141~~).
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * The name of the instance. The name must meet the following requirements:
         * <p>
         * 
         * *   The name must start with a letter.
         * *   It can contain digits, letters, underscores (\_), and hyphens (-).
         * *   It must be 2 to 256 characters in length.
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The state of the instance. For more information about valid values, see [Instance states](~~63870~~).
         */
        public Builder DBInstanceStatus(String DBInstanceStatus) {
            this.putQueryParameter("DBInstanceStatus", DBInstanceStatus);
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }

        /**
         * The architecture of the instance. Valid values:
         * <p>
         * 
         * *   **sharding**: sharded cluster instance
         * *   **replicate**: replica set or standalone instance
         */
        public Builder DBInstanceType(String DBInstanceType) {
            this.putQueryParameter("DBInstanceType", DBInstanceType);
            this.DBInstanceType = DBInstanceType;
            return this;
        }

        /**
         * The type of the node in the instance. This parameter is used to filter standard or test instance.
         * <p>
         * 
         * 1.  Valid value for a standalone or DBFS instance.
         * 2.  Valid value for a standard instance that comes in the replica set or sharded cluster architecture: standard
         * 3.  Valid value when all instances are displayed: default
         */
        public Builder DBNodeType(String DBNodeType) {
            this.putQueryParameter("DBNodeType", DBNodeType);
            this.DBNodeType = DBNodeType;
            return this;
        }

        /**
         * The database engine of the instance. Set the value to **MongoDB**.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The database engine version of the instance. Valid values:
         * <p>
         * 
         * *   **5.0**
         * *   **4.4**
         * *   **4.2**
         * *   **4.0**
         * *   **3.4**
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * The time when the instance expires.
         */
        public Builder expireTime(String expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * Specifies whether the instance has expired. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder expired(String expired) {
            this.putQueryParameter("Expired", expired);
            this.expired = expired;
            return this;
        }

        /**
         * The network type of the instance. Valid values:
         * <p>
         * 
         * *   **Classic**
         * *   **VPC**
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
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
         * The number of the page to return. The value of this parameter must be an integer that is greater than 0. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values:
         * <p>
         * 
         * *   **30** (default)
         * *   **50**
         * *   **100**
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of nodes in the replica set instance. Valid values:
         * <p>
         * 
         * *   **3**
         * *   **5**
         * *   **7**
         */
        public Builder replicationFactor(String replicationFactor) {
            this.putQueryParameter("ReplicationFactor", replicationFactor);
            this.replicationFactor = replicationFactor;
            return this;
        }

        /**
         * The ID of the resource group.
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
         * The tags of the instance.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The vSwitch ID of the instance.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The VPC ID of the instance.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The zone ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent zone list.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeDBInstancesRequest build() {
            return new DescribeDBInstancesRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key of the instance. Valid values of N: **1** to **20**.
             * <p>
             * 
             * *   The key cannot start with `aliyun`, `acs:`, `http://`, or `https://`.
             * *   It can be up to 64 characters in length.
             * *   It cannot be an empty string.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the instance. Valid values of N: **1** to **20**.
             * <p>
             * 
             * *   The value cannot start with `aliyun`, `acs:`, `http://`, or `https://`.
             * *   The value can be up to 128 characters in length.
             * *   It can be an empty string.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
