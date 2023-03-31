// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateShardingDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateShardingDBInstanceRequest</p>
 */
public class CreateShardingDBInstanceRequest extends Request {
    @Query
    @NameInMap("AccountPassword")
    private String accountPassword;

    @Query
    @NameInMap("AutoRenew")
    private String autoRenew;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ConfigServer")
    @Validation(required = true)
    private java.util.List < ConfigServer> configServer;

    @Query
    @NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("EngineVersion")
    @Validation(required = true)
    private String engineVersion;

    @Query
    @NameInMap("GlobalSecurityGroupIds")
    private String globalSecurityGroupIds;

    @Query
    @NameInMap("HiddenZoneId")
    private String hiddenZoneId;

    @Query
    @NameInMap("Mongos")
    @Validation(required = true)
    private java.util.List < Mongos> mongos;

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
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("ProtocolType")
    private String protocolType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplicaSet")
    @Validation(required = true)
    private java.util.List < ReplicaSet> replicaSet;

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
    @NameInMap("RestoreTime")
    private String restoreTime;

    @Query
    @NameInMap("SecondaryZoneId")
    private String secondaryZoneId;

    @Query
    @NameInMap("SecurityIPList")
    private String securityIPList;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SrcDBInstanceId")
    private String srcDBInstanceId;

    @Query
    @NameInMap("StorageEngine")
    private String storageEngine;

    @Query
    @NameInMap("StorageType")
    private String storageType;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateShardingDBInstanceRequest(Builder builder) {
        super(builder);
        this.accountPassword = builder.accountPassword;
        this.autoRenew = builder.autoRenew;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.configServer = builder.configServer;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.globalSecurityGroupIds = builder.globalSecurityGroupIds;
        this.hiddenZoneId = builder.hiddenZoneId;
        this.mongos = builder.mongos;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.protocolType = builder.protocolType;
        this.regionId = builder.regionId;
        this.replicaSet = builder.replicaSet;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.secondaryZoneId = builder.secondaryZoneId;
        this.securityIPList = builder.securityIPList;
        this.securityToken = builder.securityToken;
        this.srcDBInstanceId = builder.srcDBInstanceId;
        this.storageEngine = builder.storageEngine;
        this.storageType = builder.storageType;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateShardingDBInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configServer
     */
    public java.util.List < ConfigServer> getConfigServer() {
        return this.configServer;
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
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
     * @return globalSecurityGroupIds
     */
    public String getGlobalSecurityGroupIds() {
        return this.globalSecurityGroupIds;
    }

    /**
     * @return hiddenZoneId
     */
    public String getHiddenZoneId() {
        return this.hiddenZoneId;
    }

    /**
     * @return mongos
     */
    public java.util.List < Mongos> getMongos() {
        return this.mongos;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicaSet
     */
    public java.util.List < ReplicaSet> getReplicaSet() {
        return this.replicaSet;
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
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return secondaryZoneId
     */
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return srcDBInstanceId
     */
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    /**
     * @return storageEngine
     */
    public String getStorageEngine() {
        return this.storageEngine;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
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

    public static final class Builder extends Request.Builder<CreateShardingDBInstanceRequest, Builder> {
        private String accountPassword; 
        private String autoRenew; 
        private String chargeType; 
        private String clientToken; 
        private java.util.List < ConfigServer> configServer; 
        private String DBInstanceDescription; 
        private String engine; 
        private String engineVersion; 
        private String globalSecurityGroupIds; 
        private String hiddenZoneId; 
        private java.util.List < Mongos> mongos; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String protocolType; 
        private String regionId; 
        private java.util.List < ReplicaSet> replicaSet; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String secondaryZoneId; 
        private String securityIPList; 
        private String securityToken; 
        private String srcDBInstanceId; 
        private String storageEngine; 
        private String storageType; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateShardingDBInstanceRequest request) {
            super(request);
            this.accountPassword = request.accountPassword;
            this.autoRenew = request.autoRenew;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.configServer = request.configServer;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.globalSecurityGroupIds = request.globalSecurityGroupIds;
            this.hiddenZoneId = request.hiddenZoneId;
            this.mongos = request.mongos;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.protocolType = request.protocolType;
            this.regionId = request.regionId;
            this.replicaSet = request.replicaSet;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.secondaryZoneId = request.secondaryZoneId;
            this.securityIPList = request.securityIPList;
            this.securityToken = request.securityToken;
            this.srcDBInstanceId = request.srcDBInstanceId;
            this.storageEngine = request.storageEngine;
            this.storageType = request.storageType;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * The password of the root account. The password must meet the following requirements:
         * <p>
         * 
         * *   The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
         * *   Special characters include ! # $ % ^ & \* ( ) \_ + - =
         * *   The password must be 8 to 32 characters in length.
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * > If you set the **ChargeType** parameter to **PrePaid**, this parameter is available and optional.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   **PostPaid:** pay-as-you-go.
         * *   **PrePaid:** subscription
         * 
         * > If you set this parameter to **PrePaid**, you must also specify the **Period** parameter.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Details of the Configserver nodes.
         */
        public Builder configServer(java.util.List < ConfigServer> configServer) {
            this.putQueryParameter("ConfigServer", configServer);
            this.configServer = configServer;
            return this;
        }

        /**
         * The name of the instance. The name must meet the following requirements:
         * <p>
         * 
         * *   The name must start with a letter.
         * *   The name can contain digits, letters, underscores (\_), and hyphens (-).
         * *   It must be 2 to 256 characters in length.
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
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
         * The version of the database engine. Valid values:
         * <p>
         * 
         * *   **6.0**
         * *   **5.0**
         * *   **4.4**
         * *   **4.2**
         * *   **4.0**
         * 
         * > 
         * *   For more information about the limits on database versions and storage engines, see [MongoDB versions and storage engines](~~61906~~).
         * *   If you call this operation to clone an instance, set the value to the engine of the source instance.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * GlobalSecurityGroupIds.
         */
        public Builder globalSecurityGroupIds(String globalSecurityGroupIds) {
            this.putQueryParameter("GlobalSecurityGroupIds", globalSecurityGroupIds);
            this.globalSecurityGroupIds = globalSecurityGroupIds;
            return this;
        }

        /**
         * The secondary zone 2 for multi-zone deployment. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou-g**: Hangzhou Zone G
         * *   **cn-hangzhou-h**: Hangzhou Zone H
         * *   **cn-hangzhou-i**: Hangzhou Zone I
         * *   **cn-hongkong-b**: Hongkong Zone B.
         * *   **cn-hongkong-c**: Hongkong Zone C
         * *   **cn-hongkong-d**: Hongkong Zone D
         * *   **cn-wulanchabu-a**: Ulanqab Zone A
         * *   **cn-wulanchabu-b**: Ulanqab Zone B
         * *   **cn-wulanchabu-c**: Ulanqab Zone C
         * *   **ap-southeast-1a**: Singapore Zone A
         * *   **ap-southeast-1b**: Singapore Zone B
         * *   **ap-southeast-1c**: Singapore Zone C
         * *   **ap-southeast-5a**: Jakarta Zone A
         * *   **ap-southeast-5b**: Jakarta Zone B
         * *   **ap-southeast-5c**: Jakarta Zone C
         * *   **eu-central-1a**: Frankfurt Zone A
         * *   **eu-central-1b**: Frankfurt Zone B
         * *   **eu-central-1c**: Frankfurt Zone C
         * 
         * > 
         * 
         * *   If the **EngineVersion** parameter is set to **4.4** or **5.0**, this parameter is available and required.
         * 
         * *   The value of this parameter cannot be the same as the value of the **ZoneId** or **SecondaryZoneId** parameter.
         * 
         * *   For more information about the multi-zone deployment policy of a sharded cluster instance, see [Create a multi-zone sharded cluster instance](~~117865~~).
         */
        public Builder hiddenZoneId(String hiddenZoneId) {
            this.putQueryParameter("HiddenZoneId", hiddenZoneId);
            this.hiddenZoneId = hiddenZoneId;
            return this;
        }

        /**
         * Details of the mongos nodes.
         */
        public Builder mongos(java.util.List < Mongos> mongos) {
            this.putQueryParameter("Mongos", mongos);
            this.mongos = mongos;
            return this;
        }

        /**
         * The network type of the instance. Valid values:
         * <p>
         * 
         * **VPC**
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
         * The subscription period of the instance. Unit: months.
         * <p>
         * 
         * Valid values: **1** to **9**, **12**, **24**, **36**, and **60**.
         * 
         * > If you set the **ChargeType** parameter to **PrePaid**, this parameter is available and required.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The access protocol of the instance. Valid values:
         * <p>
         * 
         * *   **mongodb**
         * *   **dynamodb**
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
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
         * The description of the shard node.
         */
        public Builder replicaSet(java.util.List < ReplicaSet> replicaSet) {
            this.putQueryParameter("ReplicaSet", replicaSet);
            this.replicaSet = replicaSet;
            return this;
        }

        /**
         * The ID of the resource group. For more information, see [View the basic information of a resource group](~~151181~~).
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
         * The point in time to clone the instance, which must be within seven days. Specify the time in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         * <p>
         * 
         * > This parameter is required only when you call this operation to clone an instance. If you specify this parameter, you must also specify the **SrcDBInstanceId** parameter.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * The secondary zone 1 for multi-zone deployment. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou-g**: Hangzhou Zone G
         * *   **cn-hangzhou-h**: Hangzhou Zone H
         * *   **cn-hangzhou-i**: Hangzhou Zone I
         * *   **cn-hongkong-b**: Hongkong Zone B.
         * *   **cn-hongkong-c**: Hongkong Zone C
         * *   **cn-hongkong-d**: Hongkong Zone D
         * *   **cn-wulanchabu-a**: Ulanqab Zone A
         * *   **cn-wulanchabu-b**: Ulanqab Zone B
         * *   **cn-wulanchabu-c**: Ulanqab Zone C
         * *   **ap-southeast-1a**: Singapore Zone A
         * *   **ap-southeast-1b**: Singapore Zone B
         * *   **ap-southeast-1c**: Singapore Zone C
         * *   **ap-southeast-5a**: Jakarta Zone A
         * *   **ap-southeast-5b**: Jakarta Zone B
         * *   **ap-southeast-5c**: Jakarta Zone C
         * *   **eu-central-1a**: Frankfurt Zone A
         * *   **eu-central-1b**: Frankfurt Zone B
         * *   **eu-central-1c**: Frankfurt Zone C
         * 
         * > 
         * 
         * *   If the **EngineVersion** parameter is set to **4.4** or **5.0**, this parameter is available and required.
         * 
         * *   The value of this parameter cannot be the same as the value of the **ZoneId** or **HiddenZoneId** parameter.
         * *   For more information about the multi-zone deployment policy of a sharded cluster instance, see [Create a multi-zone sharded cluster instance](~~117865~~).
         */
        public Builder secondaryZoneId(String secondaryZoneId) {
            this.putQueryParameter("SecondaryZoneId", secondaryZoneId);
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }

        /**
         * The IP addresses in an IP address whitelist. Separate multiple IP addresses with commas (,). Each IP address in the IP address whitelist must be unique. The following types of IP addresses are supported:
         * <p>
         * *   0.0.0.0/0
         * *   IP addresses, such as 10.23.12.24.
         * *   Classless Inter-Domain Routing (CIDR) blocks, such as 10.23.12.0/24. In this case, /24 indicates that the prefix of each IP address is 24-bit long. You can replace 24 with a value within the range of 1 to 32.
         * > 
         * *   A maximum of 1,000 IP addresses and CIDR blocks can be configured for each instance.
         * *   If you enter 0.0.0.0/0, all IP addresses can access the instance. This may introduce security risks to the instance.
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
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
         * The ID of the source instance.
         * <p>
         * 
         * > This parameter can only be specified when this operation is called to clone instances. If you specify this parameter, you must also specify the **RestoreTime** parameter.
         */
        public Builder srcDBInstanceId(String srcDBInstanceId) {
            this.putQueryParameter("SrcDBInstanceId", srcDBInstanceId);
            this.srcDBInstanceId = srcDBInstanceId;
            return this;
        }

        /**
         * The storage engine used by the instance. Set the value to **WiredTiger**.
         * <p>
         * 
         * > *   If you call this operation to clone an instance, set the value to the engine of the source instance.
         * *   For more information about the limits on database versions and storage engines, see [MongoDB versions and storage engines](~~61906~~).
         */
        public Builder storageEngine(String storageEngine) {
            this.putQueryParameter("StorageEngine", storageEngine);
            this.storageEngine = storageEngine;
            return this;
        }

        /**
         * The storage type of the instance. Valid values:
         * <p>
         * 
         * *   **cloud_essd1** :ESSD PL1
         * *   **cloud_essd2**: ESSD PL2
         * *   **cloud_essd3**: ESSD PL3
         * *   **local_ssd**: local SSD
         * 
         * > *   Instances of MongoDB 4.4 and later only support cloud disks. **cloud_essd1** is used if you leave this parameter empty.
         * *   Instances of MongoDB 4.2 and earlier support only local disks. **local_ssd** is used if you leave this parameter empty.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
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
        public CreateShardingDBInstanceRequest build() {
            return new CreateShardingDBInstanceRequest(this);
        } 

    } 

    public static class ConfigServer extends TeaModel {
        @NameInMap("Class")
        @Validation(required = true)
        private String _class;

        @NameInMap("Storage")
        @Validation(required = true)
        private Integer storage;

        private ConfigServer(Builder builder) {
            this._class = builder._class;
            this.storage = builder.storage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigServer create() {
            return builder().build();
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return storage
         */
        public Integer getStorage() {
            return this.storage;
        }

        public static final class Builder {
            private String _class; 
            private Integer storage; 

            /**
             * The instance type of the Configserver node. Valid value:
             * <p>
             * 
             * *   **mdb.shard.2x.xlarge.d**: 4 cores, 8 GB (dedicated). Only instances that run MongoDB 4.4 and later support this instance type.
             * *   **dds.cs.mid** :1 core, 2 GB (general-purpose). Only instances that run MongoDB 4.2 and earlier support this instance type.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * The storage capacity of the Configserver node. Unit: GB.
             * <p>
             * 
             * > The values that can be specified for this parameter vary based on the instance types. For more information, see [Sharded cluster instance types](~~311414~~).
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            public ConfigServer build() {
                return new ConfigServer(this);
            } 

        } 

    }
    public static class Mongos extends TeaModel {
        @NameInMap("Class")
        @Validation(required = true)
        private String _class;

        private Mongos(Builder builder) {
            this._class = builder._class;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mongos create() {
            return builder().build();
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        public static final class Builder {
            private String _class; 

            /**
             * The instance type of the mongos node. For more information, see [Instance types](~~311414~~).
             * <p>
             * 
             * > *   **N** specifies the serial number of the mongos node for which the instance type is specified. For example, **Mongos.2.Class** specifies the instance type of the second mongos node.
             * *   Valid values for **N**: **2** to **32**.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            public Mongos build() {
                return new Mongos(this);
            } 

        } 

    }
    public static class ReplicaSet extends TeaModel {
        @NameInMap("Class")
        @Validation(required = true)
        private String _class;

        @NameInMap("ReadonlyReplicas")
        @Validation(maximum = 5)
        private Integer readonlyReplicas;

        @NameInMap("Storage")
        @Validation(required = true)
        private Integer storage;

        private ReplicaSet(Builder builder) {
            this._class = builder._class;
            this.readonlyReplicas = builder.readonlyReplicas;
            this.storage = builder.storage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicaSet create() {
            return builder().build();
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return readonlyReplicas
         */
        public Integer getReadonlyReplicas() {
            return this.readonlyReplicas;
        }

        /**
         * @return storage
         */
        public Integer getStorage() {
            return this.storage;
        }

        public static final class Builder {
            private String _class; 
            private Integer readonlyReplicas; 
            private Integer storage; 

            /**
             * The instance type of the shard node. For more information, see [Instance types](~~311414~~).
             * <p>
             * 
             * > *   **N** specifies the serial number of the shard node for which the instance type is specified. For example, **ReplicaSet.2.Class** specifies the instance type of the second shard node.
             * *   Valid values for **N**: **2** to **32**.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * The number of read-only nodes in shard node N.
             * <p>
             * 
             * Valid values: **0** to **5**. Default value: **0**.
             * 
             * > **N** specifies the serial number of the shard node for which you want to set the number of read-only nodes. For example, **ReplicaSet.2.ReadonlyReplicas** specifies the number of read-only nodes in the second shard node.
             */
            public Builder readonlyReplicas(Integer readonlyReplicas) {
                this.readonlyReplicas = readonlyReplicas;
                return this;
            }

            /**
             * The storage capacity of the shard node. Unit: GB.
             * <p>
             * 
             * > *   The values that can be specified for this parameter vary based on the instance types. For more information, see [Instance types](~~311414~~).
             * *   **N** specifies the serial number of the shard node for which the storage capacity is specified. For example, **ReplicaSet.2.Storage** specifies the storage capacity of the second shard node.
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            public ReplicaSet build() {
                return new ReplicaSet(this);
            } 

        } 

    }
}
