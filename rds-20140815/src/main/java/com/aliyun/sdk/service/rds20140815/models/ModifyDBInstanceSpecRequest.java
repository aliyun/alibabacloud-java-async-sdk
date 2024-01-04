// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceSpecRequest</p>
 */
public class ModifyDBInstanceSpecRequest extends Request {
    @Query
    @NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @Query
    @NameInMap("BurstingEnabled")
    private Boolean burstingEnabled;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("ColdDataEnabled")
    private Boolean coldDataEnabled;

    @Query
    @NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DBInstanceStorage")
    @Validation(maximum = 32000, minimum = 5)
    private Integer DBInstanceStorage;

    @Query
    @NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

    @Query
    @NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @Query
    @NameInMap("Direction")
    private String direction;

    @Query
    @NameInMap("EffectiveTime")
    private String effectiveTime;

    @Query
    @NameInMap("EngineVersion")
    private String engineVersion;

    @Query
    @NameInMap("IoAccelerationEnabled")
    private String ioAccelerationEnabled;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PayType")
    private String payType;

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
    @NameInMap("ServerlessConfiguration")
    private ServerlessConfiguration serverlessConfiguration;

    @Query
    @NameInMap("SourceBiz")
    private String sourceBiz;

    @Query
    @NameInMap("SwitchTime")
    private String switchTime;

    @Query
    @NameInMap("TargetMinorVersion")
    private String targetMinorVersion;

    @Query
    @NameInMap("UsedTime")
    private Long usedTime;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private ModifyDBInstanceSpecRequest(Builder builder) {
        super(builder);
        this.autoUseCoupon = builder.autoUseCoupon;
        this.burstingEnabled = builder.burstingEnabled;
        this.category = builder.category;
        this.coldDataEnabled = builder.coldDataEnabled;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.DBInstanceStorageType = builder.DBInstanceStorageType;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.direction = builder.direction;
        this.effectiveTime = builder.effectiveTime;
        this.engineVersion = builder.engineVersion;
        this.ioAccelerationEnabled = builder.ioAccelerationEnabled;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serverlessConfiguration = builder.serverlessConfiguration;
        this.sourceBiz = builder.sourceBiz;
        this.switchTime = builder.switchTime;
        this.targetMinorVersion = builder.targetMinorVersion;
        this.usedTime = builder.usedTime;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
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
     * @return coldDataEnabled
     */
    public Boolean getColdDataEnabled() {
        return this.coldDataEnabled;
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
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return ioAccelerationEnabled
     */
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
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
     * @return serverlessConfiguration
     */
    public ServerlessConfiguration getServerlessConfiguration() {
        return this.serverlessConfiguration;
    }

    /**
     * @return sourceBiz
     */
    public String getSourceBiz() {
        return this.sourceBiz;
    }

    /**
     * @return switchTime
     */
    public String getSwitchTime() {
        return this.switchTime;
    }

    /**
     * @return targetMinorVersion
     */
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    /**
     * @return usedTime
     */
    public Long getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceSpecRequest, Builder> {
        private Boolean autoUseCoupon; 
        private Boolean burstingEnabled; 
        private String category; 
        private Boolean coldDataEnabled; 
        private String DBInstanceClass; 
        private String DBInstanceId; 
        private Integer DBInstanceStorage; 
        private String DBInstanceStorageType; 
        private String dedicatedHostGroupId; 
        private String direction; 
        private String effectiveTime; 
        private String engineVersion; 
        private String ioAccelerationEnabled; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private ServerlessConfiguration serverlessConfiguration; 
        private String sourceBiz; 
        private String switchTime; 
        private String targetMinorVersion; 
        private Long usedTime; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceSpecRequest request) {
            super(request);
            this.autoUseCoupon = request.autoUseCoupon;
            this.burstingEnabled = request.burstingEnabled;
            this.category = request.category;
            this.coldDataEnabled = request.coldDataEnabled;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.DBInstanceStorageType = request.DBInstanceStorageType;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.direction = request.direction;
            this.effectiveTime = request.effectiveTime;
            this.engineVersion = request.engineVersion;
            this.ioAccelerationEnabled = request.ioAccelerationEnabled;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.serverlessConfiguration = request.serverlessConfiguration;
            this.sourceBiz = request.sourceBiz;
            this.switchTime = request.switchTime;
            this.targetMinorVersion = request.targetMinorVersion;
            this.usedTime = request.usedTime;
            this.zoneId = request.zoneId;
        } 

        /**
         * Specifies whether to use vouchers to offset fees. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * An invalid parameter. You do not need to specify this parameter.
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
         * *   Regular RDS instance
         * 
         *     *   **Basic**: RDS Basic Edition
         *     *   **HighAvailability**: RDS High-availability Edition
         *     *   **AlwaysOn**: RDS Cluster Edition for ApsaraDB RDS for SQL Server
         *     *   **Cluster**: RDS Cluster Edition for ApsaraDB RDS for MySQL.
         * 
         * *   Serverless instance
         * 
         *     *   **serverless_basic**: RDS Basic Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.
         *     *   **serverless_standard**: RDS High-availability Edition for ApsaraDB RDS for MySQL.
         *     *   **serverless_ha**: RDS High-availability Edition for ApsaraDB RDS for SQL Server.
         * 
         * > If you set the **EngineVersion** parameter to an SQL Server version number, you must also specify this parameter.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * ColdDataEnabled.
         */
        public Builder coldDataEnabled(Boolean coldDataEnabled) {
            this.putQueryParameter("ColdDataEnabled", coldDataEnabled);
            this.coldDataEnabled = coldDataEnabled;
            return this;
        }

        /**
         * The new instance type of the instance. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can also call the DescribeAvailableClasses operation to query the instance types that are supported by an instance.
         * <p>
         * 
         * > *   You must specify at least one of DBInstanceClass and **DBInstanceStorage**.
         * > *   You can call the DescribeDBInstanceAttribute operation to query the current instance type of the instance.
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * The instance ID. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The new storage capacity of the instance. Unit: GB. You can increase the storage capacity in increments of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can also call the DescribeAvailableClasses operation to query the storage capacity range that is that is supported by the new instance type.
         * <p>
         * 
         * > *   You must specify at least one of the DBInstanceStorage and **DBInstanceClass**.
         * > *   You can call the DescribeDBInstanceAttribute to query the current storage capacity of the instance.
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * The storage type of the instance. Valid values:
         * <p>
         * 
         * *   **local_ssd**: local SSD.
         * *   **cloud_ssd**: standard SSD. This storage type is not recommended and is unavailable in some Alibaba Cloud regions.
         * *   **cloud_essd**: enhanced SSD (ESSD) of performance level 1 (PL1).
         * *   **cloud_essd2**: ESSDs of PL2.
         * *   **cloud_essd3**: ESSD of PL3.
         * 
         * To change the storage type, take note of the following items:
         * 
         * If the instance runs PostgreSQL, you can upgrade the storage type of the instance from standard SSD to ESSD. However, you cannot downgrade the storage type of the instance from ESSD to standard SSD. ESSDs provide the following PLs: PL1, PL2, and PL3. You can upgrade or downgrade the storage type between ESSD of PL1, ESSD of PL2, and ESSD of PL3. For more information, see [Configuration items](~~96750~~).
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
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
         * The type of change that you want to perform on the instance. Valid values:
         * <p>
         * 
         * *   **Up** (default): upgrades a subscription instance, or upgrades or downgrades a pay-as-you-go instance.
         * *   **Down**: downgrades a subscription instance.
         * *   **TempUpgrade**: performs auto scaling on a subscription instance that runs SQL Server. This value is required for auto scaling.
         * *   **Serverless**: modifies the auto scaling settings of a serverless instance. This value is required if you want to modify the auto scaling settings of a serverless instance.
         * 
         * >  If you specify only **DBInstanceStorageType**, you can leave Direction empty. For example, if you want to change only the storage type of the instance from standard SSD to ESSD, you do not need to specify Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The time when you want the change to take effect. Valid values:
         * <p>
         * 
         * *   **Immediate**: This is the default value.
         * *   **MaintainTime**: The effective time is within the maintenance window. For more information, see ModifyDBInstanceMaintainTime.
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * The database engine version of the instance.
         * <p>
         * 
         * *   Regular instance
         * 
         *     *   Valid values if you set Engine to MySQL: **5.5**, **5.6**, **5.7**, and **8.0**
         *     *   Valid values if you set Engine to SQLServer: **2008r2**, **08r2\_ent_ha**, **2012**, **2012\_ent_ha**, **2012\_std_ha**, **2012\_web**, **2014\_std_ha**, **2016\_ent_ha**, **2016\_std_ha**, **2016\_web**, **2017\_std_ha**, **2017\_ent**, **2019\_std_ha**, and **2019\_ent**
         *     *   Valid values if you set Engine to PostgreSQL: **10.0**, **11.0**, **12.0**, **13.0**, **14.0**, and **15.0**
         *     *   Valid value if you set Engine to MariaDB: **10.3**
         * 
         * *   Serverless instance
         * 
         *     *   Valid values if you set Engine to MySQL: **5.7** and **8.0**
         *     *   Valid values if you set Engine to SQLServer: **2016\_std_sl**, **2017\_std_sl**, and **2019\_std_sl**
         *     *   Valid value if you set Engine to PostgreSQL: **14.0**
         * 
         * > ApsaraDB RDS for MariaDB does not support serverless instances.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * IoAccelerationEnabled.
         */
        public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
            this.putQueryParameter("IoAccelerationEnabled", ioAccelerationEnabled);
            this.ioAccelerationEnabled = ioAccelerationEnabled;
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
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   **Postpaid**: pay-as-you-go.
         * *   **Prepaid**: subscription.
         * *   **Serverless**: serverless. This value is not supported for instances that run MariaDB. If you set the value to Serverless, you must specify the scaling range of computing resources, configure the automatic start and stop feature, and configure auto scaling policies for your serverless instance. For more information, see [Overview of serverless ApsaraDB RDS for MySQL instances](~~411291~~), [Overview of serverless ApsaraDB RDS for SQL Server instances](~~604344~~), and [Overview of serverless ApsaraDB RDS for PostgreSQL instances](~~607742~~).
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
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
         * The serverless instance on which you want to perform the specification change.
         */
        public Builder serverlessConfiguration(ServerlessConfiguration serverlessConfiguration) {
            String serverlessConfigurationShrink = shrink(serverlessConfiguration, "ServerlessConfiguration", "json");
            this.putQueryParameter("ServerlessConfiguration", serverlessConfigurationShrink);
            this.serverlessConfiguration = serverlessConfiguration;
            return this;
        }

        /**
         * A deprecated parameter. You do not need to specify this parameter.
         */
        public Builder sourceBiz(String sourceBiz) {
            this.putQueryParameter("SourceBiz", sourceBiz);
            this.sourceBiz = sourceBiz;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * The number of the minor version.
         * <p>
         * 
         * This parameter is required only for instances that run PostgreSQL. If the minor engine version does not support changing the instance type, you must specify the minor engine version to update the minor engine version when you change the instance type.
         * 
         * Format: `rds_postgres_<Major engine version>00_<Minor engine version>`. Example: `rds_postgres_1200_20200830`.
         * 
         * >  For more information about minor engine versions, see [Release notes for AliPG](~~126002~~).
         */
        public Builder targetMinorVersion(String targetMinorVersion) {
            this.putQueryParameter("TargetMinorVersion", targetMinorVersion);
            this.targetMinorVersion = targetMinorVersion;
            return this;
        }

        /**
         * The ID of the order.
         */
        public Builder usedTime(Long usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * The RDS edition of the instance. Valid values:
         * <p>
         * 
         * *   **Basic**: RDS Basic Edition.
         * *   **HighAvailability**: RDS High-availability Edition.
         * *   **AlwaysOn**: RDS Cluster Edition for SQL Server.
         * *   **Finance**: RDS Enterprise Edition. This edition is available only on the China site (aliyun.com).
         * 
         * > If you set **EngineVersion** to an SQL Server version number, you must also specify this parameter.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ModifyDBInstanceSpecRequest build() {
            return new ModifyDBInstanceSpecRequest(this);
        } 

    } 

    public static class ServerlessConfiguration extends TeaModel {
        @NameInMap("AutoPause")
        private Boolean autoPause;

        @NameInMap("MaxCapacity")
        private Double maxCapacity;

        @NameInMap("MinCapacity")
        private Double minCapacity;

        @NameInMap("SwitchForce")
        private Boolean switchForce;

        private ServerlessConfiguration(Builder builder) {
            this.autoPause = builder.autoPause;
            this.maxCapacity = builder.maxCapacity;
            this.minCapacity = builder.minCapacity;
            this.switchForce = builder.switchForce;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerlessConfiguration create() {
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
             * Specifies whether to enable the automatic start and stop feature for the serverless instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             * 
             * >  This parameter is required only for serverless instances that run MySQL and PostgreSQL. After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection to the instance is established, the instance is resumed.
             */
            public Builder autoPause(Boolean autoPause) {
                this.autoPause = autoPause;
                return this;
            }

            /**
             * The maximum number of RDS Capacity Units (RCUs). Valid values:
             * <p>
             * 
             * *   Serverless ApsaraDB RDS for MySQL instances: **1 to 8**
             * *   Serverless ApsaraDB RDS for SQL Server instances: **2 to 8**
             * *   Serverless ApsaraDB RDS for PostgreSQL instances: **1 to 12**
             * 
             * >  The value of this parameter must be greater than or equal to the value of **MinCapacity** and can be specified only to an **integer**.
             */
            public Builder maxCapacity(Double maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * The minimum number of RCUs. Valid values:
             * <p>
             * 
             * *   Serverless ApsaraDB RDS for MySQL instances: **0.5 to 8**.
             * *   Serverless ApsaraDB RDS for SQL Server instances: **2 to 8**. Only integers are supported.
             * *   Serverless ApsaraDB RDS for PostgreSQL instances: **0.5 to 12**.
             * 
             * >  The value of this parameter must be less than or equal to the value of **MaxCapacity**.
             */
            public Builder minCapacity(Double minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            /**
             * Specifies whether to enable the forced scaling feature for the serverless instance.
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             * 
             * > *   This parameter is required only for serverless instances that run MySQL and PostgreSQL. If you set this parameter to true, a transient connection that lasts approximately 1 minute occurs during forced scaling. Process with caution.
             * > *   The RCU scaling for a serverless instance immediately takes effect. In some cases, such as the execution of large transactions, the scaling does not immediately take effect. In this case, you can enable this feature to forcefully scale the RCUs of the instance.
             */
            public Builder switchForce(Boolean switchForce) {
                this.switchForce = switchForce;
                return this;
            }

            public ServerlessConfiguration build() {
                return new ServerlessConfiguration(this);
            } 

        } 

    }
}
