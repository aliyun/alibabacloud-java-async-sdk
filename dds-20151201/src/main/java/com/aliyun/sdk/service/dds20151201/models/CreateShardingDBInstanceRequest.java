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
         * * The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
         * * These special characters include ! # $ % ^ & \* ( ) \_ + - =
         * * The password must be 8 to 32 characters in length.
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
         * >  If you set the **ChargeType** parameter to **PrePaid**, you must configure this optional parameter.
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
         * *   **PostPaid: pay-as-you-go.**
         * *   **PrePaid**: subscription
         * 
         * >  If you specify this parameter to **PrePaid**, you must also specify the **Period** parameter.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The details of the Configserver nodes.
         */
        public Builder configServer(java.util.List < ConfigServer> configServer) {
            this.putQueryParameter("ConfigServer", configServer);
            this.configServer = configServer;
            return this;
        }

        /**
         * The name of the instance. Valid values:
         * <p>
         * 
         * * The name must start with a letter.
         * * The name can contain digits, letters, underscores (\_), and hyphens (-).
         * * The name must be 2 to 256 characters in length.
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * The engine of the instance. Set the value to **MongoDB**.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The engine version of the instance. Valid values:
         * <p>
         * 
         * * **5.0**
         * * **4.4**
         * * **4.2**
         * * **4.0**
         * * **3.4**
         * 
         * > * For more information about the limits on database versions and storage engines, see [MongoDB versions and storage engines](~~61906~~).
         * > * If you call this operation to clone an instance, set the value to the engine of the source instance.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * HiddenZoneId.
         */
        public Builder hiddenZoneId(String hiddenZoneId) {
            this.putQueryParameter("HiddenZoneId", hiddenZoneId);
            this.hiddenZoneId = hiddenZoneId;
            return this;
        }

        /**
         * The details of mongos nodes.
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
         * >  If you set the ChargeType property to PrePaid, you must configure this property.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The access protocol type of the instance. Valid values:
         * <p>
         * 
         * *   **mongodb**: the MongoDB protocol
         * *   **dynamodb**: the DynamoDB protocol
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
         * The details of shard nodes.
         */
        public Builder replicaSet(java.util.List < ReplicaSet> replicaSet) {
            this.putQueryParameter("ReplicaSet", replicaSet);
            this.replicaSet = replicaSet;
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
         * The point in time to clone the instance, which must be within seven days. Specify the time in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         * <p>
         * 
         * >  This parameter is required only when you call this operation to clone an instance. If you specify this parameter, you must also specify the **SrcDBInstanceId** parameter.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * SecondaryZoneId.
         */
        public Builder secondaryZoneId(String secondaryZoneId) {
            this.putQueryParameter("SecondaryZoneId", secondaryZoneId);
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }

        /**
         * The IP addresses in an IP address whitelist. Separate multiple IP addresses with commas (,). Each IP address in the IP address whitelist must be unique. The following types of predicted values are supported:
         * <p>
         * 
         * * 0.0.0.0/0
         * * IP addresses, such as 10.23.12.24.
         * * Classless Inter-Domain Routing (CIDR) blocks, such as 10.23.12.0/24. In this case, /24 indicates that the prefix of each IP address is 24-bit long. You can replace 24 with a value within the range of 1 to 32.
         * 
         * > * A maximum of 1,000 IP addresses and CIDR blocks can be configured for each instance.
         * > * If you enter 0.0.0.0/0, all IP addresses can access the instance. This may introduce security risks to the instance.
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
         * >  The ID of the source instance. This parameter is required only when you call this operation to clone an instance. If you specify this parameter, you must also specify the **RestoreTime** parameter.
         */
        public Builder srcDBInstanceId(String srcDBInstanceId) {
            this.putQueryParameter("SrcDBInstanceId", srcDBInstanceId);
            this.srcDBInstanceId = srcDBInstanceId;
            return this;
        }

        /**
         * The storage engine of the instance. Default value: WiredTiger. Valid values:
         * <p>
         * 
         * * **WiredTiger**
         * * **RocksDB**
         * * **TerarkDB**
         * 
         * > * If you call this operation to clone an instance, set the value to the engine of the source instance.
         * > * For more information about the limits on database versions and storage engines, see [MongoDB versions and storage engines](~~61906~~).
         */
        public Builder storageEngine(String storageEngine) {
            this.putQueryParameter("StorageEngine", storageEngine);
            this.storageEngine = storageEngine;
            return this;
        }

        /**
         * The type of storage. Valid values:
         * <p>
         * 
         * - **cloud_essd1**: ESSD PL1 cloud disk.
         * - **cloud_essd2**: ESSD PL2 cloud disk.
         * - **cloud_essd3**: ESSD PL3 cloud disk.
         * - **local_ssd**: SSD local disk.
         * 
         * > - Instances of version 4.4 and above only support cloud disk. Default type is **cloud_essd1**.
         * > - Instances of version 4.2 and below only support local disk. Default type is **local_ssd**.
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
             * *   **mdb.shard.2x.xlarge.d**: 4 cores, 8 GB (dedicated). Only instances that run MongoDB 4.4 and 5.0 support this instance type.
             * *   **dds.cs.mid** :1 core, 2 GB (general-purpose). Only instances that run MongoDB 3.4, 4.0, and 4.2 support this instance type.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * The storage capacity of the Configserver node. Unit: GB.
             * <p>
             * 
             * Set the value to **20**.
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
             * > * **N** specifies the serial number of the mongos node for which the instance type is specified. For example, **Mongos.2.Class** specifies the instance type of the second mongos node.
             * > * Valid values for **N**: **2** to **32**.
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
             * > * **N** specifies the serial number of the shard node for which the instance type is specified. For example, **ReplicaSet.2.Class** specifies the instance type of the second shard node.
             * > * Valid values for **N**: **2** to **32**.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * The number of read-only nodes in shard node N.
             * <p>
             * 
             * Valid values: **0** to **5**. The value must be an integer. Default value: **0**.
             * 
             * >  **N** specifies the serial number of the shard node for which you want to set the number of read-only nodes. **ReplicaSet.2.ReadonlyReplicas** specifies the number of read-only nodes in the second shard node.
             */
            public Builder readonlyReplicas(Integer readonlyReplicas) {
                this.readonlyReplicas = readonlyReplicas;
                return this;
            }

            /**
             * The storage capacity of the shard node. Unit: GB.
             * <p>
             * 
             * Valid values: **10** to **2000**.
             * 
             * > * The value must be a multiple of 10.
             * > * The values that can be specified for this parameter are subject to the instance types. For more information, see [Instance types](~~311414~~).
             * > * **N** specifies the serial number of the shard node for which the storage capacity is specified. For example, **ReplicaSet.2.Storage** specifies the storage capacity of the second shard node.
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
