// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CloneDBInstanceRequest</p>
 */
public class CloneDBInstanceRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("BackupId")
    private String backupId;

    @Query
    @NameInMap("BackupType")
    private String backupType;

    @Query
    @NameInMap("BpeEnabled")
    private String bpeEnabled;

    @Query
    @NameInMap("BurstingEnabled")
    private Boolean burstingEnabled;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true, maxLength = 65535, minLength = 1)
    private String DBInstanceId;

    @Query
    @NameInMap("DBInstanceStorage")
    private Integer DBInstanceStorage;

    @Query
    @NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

    @Query
    @NameInMap("DbNames")
    private String dbNames;

    @Query
    @NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @Query
    @NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @Query
    @NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RestoreTable")
    private String restoreTable;

    @Query
    @NameInMap("RestoreTime")
    private String restoreTime;

    @Query
    @NameInMap("ServerlessConfig")
    private ServerlessConfig serverlessConfig;

    @Query
    @NameInMap("TableMeta")
    private String tableMeta;

    @Query
    @NameInMap("UsedTime")
    private Integer usedTime;

    @Query
    @NameInMap("VPCId")
    private String VPCId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("ZoneIdSlave1")
    private String zoneIdSlave1;

    @Query
    @NameInMap("ZoneIdSlave2")
    private String zoneIdSlave2;

    private CloneDBInstanceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.backupId = builder.backupId;
        this.backupType = builder.backupType;
        this.bpeEnabled = builder.bpeEnabled;
        this.burstingEnabled = builder.burstingEnabled;
        this.category = builder.category;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.DBInstanceStorageType = builder.DBInstanceStorageType;
        this.dbNames = builder.dbNames;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.deletionProtection = builder.deletionProtection;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.payType = builder.payType;
        this.period = builder.period;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTable = builder.restoreTable;
        this.restoreTime = builder.restoreTime;
        this.serverlessConfig = builder.serverlessConfig;
        this.tableMeta = builder.tableMeta;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
        this.zoneIdSlave1 = builder.zoneIdSlave1;
        this.zoneIdSlave2 = builder.zoneIdSlave2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneDBInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return backupType
     */
    public String getBackupType() {
        return this.backupType;
    }

    /**
     * @return bpeEnabled
     */
    public String getBpeEnabled() {
        return this.bpeEnabled;
    }

    /**
     * @return burstingEnabled
     */
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceStorage
     */
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * @return DBInstanceStorageType
     */
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    /**
     * @return dbNames
     */
    public String getDbNames() {
        return this.dbNames;
    }

    /**
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return restoreTable
     */
    public String getRestoreTable() {
        return this.restoreTable;
    }

    /**
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return serverlessConfig
     */
    public ServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    /**
     * @return tableMeta
     */
    public String getTableMeta() {
        return this.tableMeta;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
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

    /**
     * @return zoneIdSlave1
     */
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    /**
     * @return zoneIdSlave2
     */
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

    public static final class Builder extends Request.Builder<CloneDBInstanceRequest, Builder> {
        private Boolean autoPay; 
        private String backupId; 
        private String backupType; 
        private String bpeEnabled; 
        private Boolean burstingEnabled; 
        private String category; 
        private String DBInstanceClass; 
        private String DBInstanceId; 
        private Integer DBInstanceStorage; 
        private String DBInstanceStorageType; 
        private String dbNames; 
        private String dedicatedHostGroupId; 
        private Boolean deletionProtection; 
        private String instanceNetworkType; 
        private String payType; 
        private String period; 
        private String privateIpAddress; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String restoreTable; 
        private String restoreTime; 
        private ServerlessConfig serverlessConfig; 
        private String tableMeta; 
        private Integer usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 
        private String zoneIdSlave1; 
        private String zoneIdSlave2; 

        private Builder() {
            super();
        } 

        private Builder(CloneDBInstanceRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.backupId = request.backupId;
            this.backupType = request.backupType;
            this.bpeEnabled = request.bpeEnabled;
            this.burstingEnabled = request.burstingEnabled;
            this.category = request.category;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.DBInstanceStorageType = request.DBInstanceStorageType;
            this.dbNames = request.dbNames;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.deletionProtection = request.deletionProtection;
            this.instanceNetworkType = request.instanceNetworkType;
            this.payType = request.payType;
            this.period = request.period;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTable = request.restoreTable;
            this.restoreTime = request.restoreTime;
            this.serverlessConfig = request.serverlessConfig;
            this.tableMeta = request.tableMeta;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
            this.zoneIdSlave1 = request.zoneIdSlave1;
            this.zoneIdSlave2 = request.zoneIdSlave2;
        } 

        /**
         * Specifies whether to enable automatic payment. Default value: true. Valid values:
         * <p>
         * 
         * *   **true**: enables automatic payment. Make sure that you have sufficient balance within your account.
         * *   **false**: disables automatic payment. In this case, you must manually pay for the instance. You can perform the following operations to pay for the instance: Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, click **Expenses**. On the page that appears, select **Orders** from the left-side navigation pane. On the Orders page, find the order and complete the payment.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The ID of the backup set.
         * <p>
         * 
         * You can call the [DescribeBackups](~~26273~~) operation to query the backup sets.
         * 
         * > You must specify at least one of the **BackupId** and **RestoreTime** parameters.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * The type of backup that is used to restore the data of the original instance. Valid values:
         * <p>
         * 
         * *   **FullBackup**
         * *   **IncrementalBackup**
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * This parameter is not publicly available.
         */
        public Builder bpeEnabled(String bpeEnabled) {
            this.putQueryParameter("BpeEnabled", bpeEnabled);
            this.bpeEnabled = bpeEnabled;
            return this;
        }

        /**
         * This parameter is not publicly available.
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * The RDS edition of the instance. Valid values:
         * <p>
         * 
         * *   **Basic**: RDS Basic Edition.
         * *   **HighAvailability**: RDS High-availability Edition.
         * *   **AlwaysOn**: RDS Cluster Edition for SQL Server.
         * *   **cluster**: RDS Cluster Edition for MySQL.
         * *   **Finance**: RDS Enterprise Edition. This edition is available only on the China site (aliyun.com).
         * *   **serverless_basic**: RDS Serverless Basic Edition.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The instance type of the new instance. For information, see [Primary ApsaraDB RDS instance types](~~26312~~).
         * <p>
         * 
         * > By default, the new instance uses the same instance type as the original primary instance.
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The storage capacity of the new instance. Unit: GB. You can increase the storage capacity in increments of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~).
         * <p>
         * 
         * > By default, the new instance has the same storage capacity as the original primary instance.
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * The storage type of the new instance. Valid values:
         * <p>
         * 
         * *   **local_ssd**: local SSD
         * *   **cloud_ssd**: standard SSD
         * *   **cloud_essd**: enhanced SSD (ESSD) of performance level 1 (PL1)
         * *   **cloud_essd2**: ESSD of PL2
         * *   **cloud_essd3**: ESSD of PL3
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * The name of the database. If you specify more than one database, the value is in the following format: `Original database name 1,Original database name 2`.
         */
        public Builder dbNames(String dbNames) {
            this.putQueryParameter("DbNames", dbNames);
            this.dbNames = dbNames;
            return this;
        }

        /**
         * The ID of the dedicated cluster.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * Specifies whether to enable the release protection feature for the new instance. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * Default value: **false**.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * The network type of the new instance. Valid values:
         * <p>
         * 
         * *   **VPC**
         * *   **Classic**
         * 
         * > By default, the new instance has the same network type as the original primary instance.
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * The billing method of the read-only instance. Valid values:
         * <p>
         * 
         * *   **Postpaid**: pay-as-you-go
         * *   **Prepaid**: subscription
         * *   **Serverless**: serverless. This value is supported only for instances that run MySQL. For more information, see [Overview](~~411291~~).
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The unit that is used to calculate the billing cycle of the new instance. Valid values:
         * <p>
         * 
         * *   **Year**
         * *   **Month**
         * 
         * > If you set the PayType parameter to **Prepaid**, you must also specify this parameter.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The internal IP address of the new instance, which must be within the CIDR block supported by the specified vSwitch. The system automatically assigns an internal IP address based on the values of the **VPCId** and **VSwitchId** parameters.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The region ID of the new instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * Specifies whether to restore only the databases and tables that you specify. The value **1** specifies to restore only the specified databases and tables. If you do not want to restore only the specified databases or tables, you do not need to specify this parameter.
         */
        public Builder restoreTable(String restoreTable) {
            this.putQueryParameter("RestoreTable", restoreTable);
            this.restoreTable = restoreTable;
            return this;
        }

        /**
         * The point in time to which you want to restore data. The point in time must fall within the specified backup retention period. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         * <p>
         * 
         * > You must specify at least one of the **BackupId** and **RestoreTime** parameters.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * The configuration of the serverless instance. You must specify this parameter only when you restore data to a new serverless instance.
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * The information about the database and table that you want to restore. The value is in the following format: `[{"type":"db","name":"Name of Database 1","newname":"New name of Database 1","tables":[{"type":"table","name":"Name of Table 1 in Database 1","newname":"New name of Table 1"},{"type":"table","name":"Name of Table 2 in Database 1","newname":"New name of Table 2"}]},{"type":"db","name":"Name of Database 2","newname":"New name of Database 2","tables":[{"type":"table","name":"Name of Table 1 in Database 2","newname":"New name of Table 1"},{"type":"table","name":"Name of Table 2 in Database 2","newname":"New name of Table 2"}]}]`
         */
        public Builder tableMeta(String tableMeta) {
            this.putQueryParameter("TableMeta", tableMeta);
            this.tableMeta = tableMeta;
            return this;
        }

        /**
         * The subscription duration of the new instance. Valid values:
         * <p>
         * 
         * *   If you set the **Period** parameter to **Year**, the value of the UsedTime parameter ranges from **1 to 3**.
         * *   If you set the **Period** parameter to **Month**, the value of the UsedTime parameter ranges from **1 to 9**.
         * 
         * > If you set the PayType parameter to **Prepaid**, you must also specify this parameter.
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC).
         * <p>
         * 
         * > Make sure that the VPC belongs to the required region.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * The ID of the vSwitch. The vSwitch must belong to the zone that is specified by the **ZoneId** parameter.
         * <p>
         * 
         * > 
         * 
         * *   If you set the **InstanceNetworkType** parameter to **VPC**, you must also specify this parameter.
         * 
         * *   If you specify the **ZoneSlaveId1** parameter, you must specify the IDs of two vSwitches for this parameter and separate the IDs with a comma (,).
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The zone ID of the primary instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent zone list.
         * <p>
         * 
         * > By default, the new instance resides in the same region as the original instance.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The zone ID of the secondary instance. If you set the ZoneIdSlave1 parameter and the **ZoneId** parameter to the same value, the single-zone deployment method is used. If you set the ZoneIdSlave1 parameter and the **ZoneId** parameter to different values, the multi-zone deployment method is used.
         */
        public Builder zoneIdSlave1(String zoneIdSlave1) {
            this.putQueryParameter("ZoneIdSlave1", zoneIdSlave1);
            this.zoneIdSlave1 = zoneIdSlave1;
            return this;
        }

        /**
         * The zone ID of the logger instance. If you set the ZoneIdSlave2 parameter to the same value as the **ZoneId** parameter, the single-zone deployment method is used. If you set the ZoneIdSlave2 parameter to a different value from the **ZoneId** parameter, the multi-zone deployment method is used.
         */
        public Builder zoneIdSlave2(String zoneIdSlave2) {
            this.putQueryParameter("ZoneIdSlave2", zoneIdSlave2);
            this.zoneIdSlave2 = zoneIdSlave2;
            return this;
        }

        @Override
        public CloneDBInstanceRequest build() {
            return new CloneDBInstanceRequest(this);
        } 

    } 

    public static class ServerlessConfig extends TeaModel {
        @NameInMap("AutoPause")
        private Boolean autoPause;

        @NameInMap("MaxCapacity")
        private Double maxCapacity;

        @NameInMap("MinCapacity")
        private Double minCapacity;

        @NameInMap("SwitchForce")
        private Boolean switchForce;

        private ServerlessConfig(Builder builder) {
            this.autoPause = builder.autoPause;
            this.maxCapacity = builder.maxCapacity;
            this.minCapacity = builder.minCapacity;
            this.switchForce = builder.switchForce;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerlessConfig create() {
            return builder().build();
        }

        /**
         * @return autoPause
         */
        public Boolean getAutoPause() {
            return this.autoPause;
        }

        /**
         * @return maxCapacity
         */
        public Double getMaxCapacity() {
            return this.maxCapacity;
        }

        /**
         * @return minCapacity
         */
        public Double getMinCapacity() {
            return this.minCapacity;
        }

        /**
         * @return switchForce
         */
        public Boolean getSwitchForce() {
            return this.switchForce;
        }

        public static final class Builder {
            private Boolean autoPause; 
            private Double maxCapacity; 
            private Double minCapacity; 
            private Boolean switchForce; 

            /**
             * Specifies whether to enable the automatic start and stop feature for the serverless instance. After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection is established to the instance, the instance is automatically resumed. Valid values:
             * <p>
             * 
             * *   true: enables the feature.
             * *   false (default): disables the feature.
             */
            public Builder autoPause(Boolean autoPause) {
                this.autoPause = autoPause;
                return this;
            }

            /**
             * The maximum number of RDS Capacity Units (RCUs).
             */
            public Builder maxCapacity(Double maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * The minimum number of RCUs.
             */
            public Builder minCapacity(Double minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            /**
             * Specifies whether to enable the forced scaling feature for the serverless instance. In most cases, ApsaraDB RDS automatically scales in or out the RCUs of a serverless instance based on business requirements in real time. In rare cases, the scaling does not take effect in real time. You can enable the forced scaling feature to forcefully scales in or out the RCUs of the instance. Valid values:
             * <p>
             * 
             * *   true: enables the feature.
             * *   false (default): disables the feature.
             */
            public Builder switchForce(Boolean switchForce) {
                this.switchForce = switchForce;
                return this;
            }

            public ServerlessConfig build() {
                return new ServerlessConfig(this);
            } 

        } 

    }
}
