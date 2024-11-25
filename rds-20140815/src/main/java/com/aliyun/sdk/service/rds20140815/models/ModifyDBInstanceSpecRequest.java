// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDBInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceSpecRequest</p>
 */
public class ModifyDBInstanceSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowMajorVersionUpgrade")
    private Boolean allowMajorVersionUpgrade;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
    private Boolean burstingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColdDataEnabled")
    private Boolean coldDataEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
    @com.aliyun.core.annotation.Validation(maximum = 64000, minimum = 5)
    private Integer DBInstanceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoAccelerationEnabled")
    private String ioAccelerationEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadOnlyDBInstanceClass")
    private String readOnlyDBInstanceClass;

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
    @com.aliyun.core.annotation.NameInMap("ServerlessConfiguration")
    private ServerlessConfiguration serverlessConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceBiz")
    private String sourceBiz;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTime")
    private String switchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetMinorVersion")
    private String targetMinorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private Long usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneIdSlave1")
    private String zoneIdSlave1;

    private ModifyDBInstanceSpecRequest(Builder builder) {
        super(builder);
        this.allowMajorVersionUpgrade = builder.allowMajorVersionUpgrade;
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
        this.promotionCode = builder.promotionCode;
        this.readOnlyDBInstanceClass = builder.readOnlyDBInstanceClass;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serverlessConfiguration = builder.serverlessConfiguration;
        this.sourceBiz = builder.sourceBiz;
        this.switchTime = builder.switchTime;
        this.targetMinorVersion = builder.targetMinorVersion;
        this.usedTime = builder.usedTime;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
        this.zoneIdSlave1 = builder.zoneIdSlave1;
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
     * @return allowMajorVersionUpgrade
     */
    public Boolean getAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
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
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
    }

    /**
     * @return readOnlyDBInstanceClass
     */
    public String getReadOnlyDBInstanceClass() {
        return this.readOnlyDBInstanceClass;
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

    public static final class Builder extends Request.Builder<ModifyDBInstanceSpecRequest, Builder> {
        private Boolean allowMajorVersionUpgrade; 
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
        private String promotionCode; 
        private String readOnlyDBInstanceClass; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private ServerlessConfiguration serverlessConfiguration; 
        private String sourceBiz; 
        private String switchTime; 
        private String targetMinorVersion; 
        private Long usedTime; 
        private String vSwitchId; 
        private String zoneId; 
        private String zoneIdSlave1; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceSpecRequest request) {
            super(request);
            this.allowMajorVersionUpgrade = request.allowMajorVersionUpgrade;
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
            this.promotionCode = request.promotionCode;
            this.readOnlyDBInstanceClass = request.readOnlyDBInstanceClass;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.serverlessConfiguration = request.serverlessConfiguration;
            this.sourceBiz = request.sourceBiz;
            this.switchTime = request.switchTime;
            this.targetMinorVersion = request.targetMinorVersion;
            this.usedTime = request.usedTime;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
            this.zoneIdSlave1 = request.zoneIdSlave1;
        } 

        /**
         * <p>Specifies whether to upgrade the major engine version of the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p>When you upgrade the major engine version of an ApsaraDB RDS for SQL Server instance, set this parameter to true. When you upgrade the major engine version, you must also specify required parameters such as DBInstanceId, EngineVersion, DBInstanceClass, and Category, and optional parameters such as ZoneId, ZoneIdSlave1, and VSwitchId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
            this.putQueryParameter("AllowMajorVersionUpgrade", allowMajorVersionUpgrade);
            this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
            return this;
        }

        /**
         * <p>Specifies whether to use vouchers to offset fees. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>An invalid parameter. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * <p>The RDS edition of the instance. Valid values:</p>
         * <ul>
         * <li><p>Regular instance</p>
         * <ul>
         * <li><strong>Basic</strong>: RDS Basic Edition.</li>
         * <li><strong>HighAvailability</strong>: RDS High-availability Edition.</li>
         * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for ApsaraDB RDS for SQL Server.</li>
         * <li><strong>Cluster</strong>: RDS Cluster Edition for ApsaraDB RDS for MySQL.</li>
         * </ul>
         * </li>
         * <li><p>Serverless instance</p>
         * <ul>
         * <li><strong>serverless_basic</strong>: RDS Basic Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.</li>
         * <li><strong>serverless_standard</strong>: RDS High-availability Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.</li>
         * <li><strong>serverless_ha</strong>: RDS High-availability Edition for ApsaraDB RDS for SQL Server.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you set the <strong>EngineVersion</strong> parameter to an SQL Server version number, you must also specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HighAvailability</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder coldDataEnabled(Boolean coldDataEnabled) {
            this.putQueryParameter("ColdDataEnabled", coldDataEnabled);
            this.coldDataEnabled = coldDataEnabled;
            return this;
        }

        /**
         * <p>The new instance type of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>. You can also call the DescribeAvailableClasses operation to query the instance types that are supported by an instance.</p>
         * <blockquote>
         * <ul>
         * <li>You must specify at least one of DBInstanceClass and <strong>DBInstanceStorage</strong>.</li>
         * <li>You can call the DescribeDBInstanceAttribute operation to query the current instance type of the instance.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rds.mys2.small</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5*******</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The new storage capacity of the instance. Unit: GB. You can increase the storage capacity in increments of 5 GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>. You can also call the DescribeAvailableClasses operation to query the storage capacity range that is supported by the new instance type.</p>
         * <blockquote>
         * <ul>
         * <li>You must specify at least one of the DBInstanceStorage and <strong>DBInstanceClass</strong> parameters.</li>
         * <li>You can call the DescribeDBInstanceAttribute to query the current storage capacity of the instance.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>local_ssd</strong>: local SSD.</li>
         * <li><strong>cloud_ssd</strong>: standard SSD. This storage type is not recommended and is unavailable in some Alibaba Cloud regions.</li>
         * <li><strong>cloud_essd</strong>: enhanced SSD (ESSD) of performance level 1 (PL1).</li>
         * <li><strong>cloud_essd2</strong>: ESSDs of PL2.</li>
         * <li><strong>cloud_essd3</strong>: ESSD of PL3.</li>
         * </ul>
         * <p>To change the storage type, take note of the following items:</p>
         * <p>If the instance runs PostgreSQL, you can upgrade the storage type of the instance from standard SSD to ESSD. However, you cannot downgrade the storage type of the instance from ESSD to standard SSD. ESSDs provide the following PLs: PL1, PL2, and PL3. You can upgrade or downgrade the storage type between ESSD of PL1, ESSD of PL2, and ESSD of PL3. For more information, see <a href="https://help.aliyun.com/document_detail/96750.html">Configuration items</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>local_ssd</p>
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * <p>The ID of the dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-7a9********</p>
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * <p>The type of change that you want to perform on the instance. Valid values:</p>
         * <ul>
         * <li><strong>Up</strong> (default): upgrades a subscription instance, or upgrades or downgrades a pay-as-you-go instance.</li>
         * <li><strong>Down</strong>: downgrades a subscription instance.</li>
         * <li><strong>TempUpgrade</strong>: performs auto scaling on a subscription instance that runs SQL Server. This value is required for auto scaling.</li>
         * <li><strong>Serverless</strong>: modifies the auto scaling settings of a serverless instance.</li>
         * </ul>
         * <blockquote>
         * <p> If you specify only <strong>DBInstanceStorageType</strong>, you can leave Direction empty. For example, if you want to change only the storage type of the instance from standard SSD to Enterprise SSD (ESSD), you do not need to specify Direction.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Up</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The effective time. Valid values:</p>
         * <ul>
         * <li><strong>Immediate</strong> (default): The effective time immediately takes effect.</li>
         * <li><strong>MaintainTime</strong>: The effective time is within the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
         * <li><strong>ScheduleTime</strong>: The effective time takes effect at the point in time that you specify. The value of ScheduleTime must be a specific point in time that is 12 hours later than the current time. In this case, The value of EffectiveTime is calculated by using the following formula: EffectiveTime = ScheduleTime + SwitchTime.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MaintainTime</p>
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * <p>The database engine version of the instance.</p>
         * <ul>
         * <li><p>Regular instance</p>
         * <ul>
         * <li>Valid values if you set the Engine parameter to MySQL: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong></li>
         * <li>Valid values if you set the Engine parameter to SQLServer: <strong>2008r2</strong>, <strong>08r2_ent_ha</strong>, <strong>2012</strong>, <strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2014_std_ha</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_std_ha</strong>, <strong>2017_ent</strong>, <strong>2019_std_ha</strong>, and <strong>2019_ent</strong></li>
         * <li>Valid values if you set the Engine parameter to PostgreSQL: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, and <strong>15.0</strong></li>
         * <li>Valid value if you set the Engine parameter to MariaDB: <strong>10.3</strong></li>
         * </ul>
         * </li>
         * <li><p>Serverless instance</p>
         * <ul>
         * <li>Valid values if you set the Engine parameter to MySQL: <strong>5.7</strong> and <strong>8.0</strong></li>
         * <li>Valid values if you set the Engine parameter to SQLServer: <strong>2016_std_sl</strong>, <strong>2017_std_sl</strong>, and <strong>2019_std_sl</strong></li>
         * <li>Valid values if you set the Engine parameter to PostgreSQL: <strong>14.0</strong>, <strong>15.0</strong>, <strong>16.0</strong></li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>ApsaraDB RDS for MariaDB does not support serverless instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
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
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * <li><strong>Serverless</strong>: serverless. This value is not supported for instances that run MariaDB. If you set the value to Serverless, you must specify the scaling range of computing resources, configure the automatic start and stop feature, and configure auto scaling policies for your serverless instance. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of serverless ApsaraDB RDS for MySQL instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of serverless ApsaraDB RDS for SQL Server instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of serverless ApsaraDB RDS for PostgreSQL instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * PromotionCode.
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>Target specifications for read-only instances when changing a MySQL high-availability local disk instance to a cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>mysqlro.n2.large.c</p>
         */
        public Builder readOnlyDBInstanceClass(String readOnlyDBInstanceClass) {
            this.putQueryParameter("ReadOnlyDBInstanceClass", readOnlyDBInstanceClass);
            this.readOnlyDBInstanceClass = readOnlyDBInstanceClass;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy**********</p>
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
         * <p>The specifications that you want to change for a serverless instance.</p>
         */
        public Builder serverlessConfiguration(ServerlessConfiguration serverlessConfiguration) {
            String serverlessConfigurationShrink = shrink(serverlessConfiguration, "ServerlessConfiguration", "json");
            this.putQueryParameter("ServerlessConfiguration", serverlessConfigurationShrink);
            this.serverlessConfiguration = serverlessConfiguration;
            return this;
        }

        /**
         * <p>A deprecated parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Specifies whether to enable the automatic suspension feature.</p>
         */
        public Builder sourceBiz(String sourceBiz) {
            this.putQueryParameter("SourceBiz", sourceBiz);
            this.sourceBiz = sourceBiz;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-10T13:15:12Z</p>
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * <p>The number of the minor version.</p>
         * <p>This parameter is required only for instances that run PostgreSQL. If the minor engine version does not support changing the instance type, you must specify the minor engine version to update the minor engine version when you change the instance type.</p>
         * <p>Format: <code>rds_postgres_&lt;Major engine version&gt;00_&lt;Minor engine version&gt;</code>. Example: <code>rds_postgres_1200_20200830</code>.</p>
         * <blockquote>
         * <p> For more information about minor engine versions, see <a href="https://help.aliyun.com/document_detail/126002.html">Release notes for AliPG</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rds_postgres_1200_20200830</p>
         */
        public Builder targetMinorVersion(String targetMinorVersion) {
            this.putQueryParameter("TargetMinorVersion", targetMinorVersion);
            this.targetMinorVersion = targetMinorVersion;
            return this;
        }

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder usedTime(Long usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The vSwitch ID. The vSwitch must belong to the zone that is specified by <strong>ZoneId</strong>.</p>
         * <ul>
         * <li>If you set <strong>InstanceNetworkType</strong> to <strong>VPC</strong>, you must also specify this parameter.</li>
         * <li>If you specify ZoneSlaveId1, you must specify the IDs of two vSwitches for this parameter and separate the IDs with a comma (,).</li>
         * </ul>
         * <blockquote>
         * <p>When you upgrade the major engine version, if you want to specify a vSwitch or change the vSwitch for the RDS instance, you must also specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1oxflciovg9l7163lr7</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The RDS edition of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong>: RDS Basic Edition.</li>
         * <li><strong>HighAvailability</strong>: RDS High-availability Edition.</li>
         * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for SQL Server.</li>
         * <li><strong>Finance</strong>: RDS Enterprise Edition. This edition is available only on the China site (aliyun.com).</li>
         * </ul>
         * <blockquote>
         * <p>If you set <strong>EngineVersion</strong> to an SQL Server version number, you must also specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>The zone ID of the secondary instance. If you set this parameter to the same value as the <strong>ZoneId</strong> parameter, the single-zone deployment method is used. If you set this parameter to a different value from the <strong>ZoneId</strong> parameter, the multi-zone deployment method is used.</p>
         * <blockquote>
         * <p>If you must specify a secondary zone or change the secondary zone to upgrade the major engine version of an ApsaraDB RDS for SQL Server instance, you must also specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-c</p>
         */
        public Builder zoneIdSlave1(String zoneIdSlave1) {
            this.putQueryParameter("ZoneIdSlave1", zoneIdSlave1);
            this.zoneIdSlave1 = zoneIdSlave1;
            return this;
        }

        @Override
        public ModifyDBInstanceSpecRequest build() {
            return new ModifyDBInstanceSpecRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDBInstanceSpecRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBInstanceSpecRequest</p>
     */
    public static class ServerlessConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPause")
        private Boolean autoPause;

        @com.aliyun.core.annotation.NameInMap("MaxCapacity")
        private Double maxCapacity;

        @com.aliyun.core.annotation.NameInMap("MinCapacity")
        private Double minCapacity;

        @com.aliyun.core.annotation.NameInMap("SwitchForce")
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
             * <p>Specifies whether to enable the automatic start and stop feature for the serverless instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is required only for serverless instances that run MySQL and PostgreSQL. After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection to the instance is established, the instance is automatically resumed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoPause(Boolean autoPause) {
                this.autoPause = autoPause;
                return this;
            }

            /**
             * <p>The maximum number of RDS Capacity Units (RCUs). Valid values:</p>
             * <ul>
             * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>1 to 32</strong></li>
             * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 8</strong></li>
             * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>1 to 14</strong></li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>The value of this parameter must be greater than or equal to the value of <strong>MinCapacity</strong> and can be specified only to an <strong>integer</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder maxCapacity(Double maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * <p>The minimum number of RCUs. Valid values:</p>
             * <ul>
             * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>0.5 to 32</strong>.</li>
             * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 8</strong>. Only integers are supported.</li>
             * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>0.5 to 14</strong>.</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>The value of this parameter must be less than or equal to the value of MaxCapacity.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder minCapacity(Double minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            /**
             * <p>Specifies whether to enable the forced scaling feature for the serverless instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This parameter is required only for serverless instances that run MySQL and PostgreSQL. If you set this parameter to true, a service interruption that lasts 30 to 120 seconds occurs during forced scaling. Process with caution.</li>
             * <li>The RCU scaling for a serverless instance immediately takes effect. In some cases, such as the execution of large transactions, the scaling does not immediately take effect. In this case, you can enable this feature to forcefully scale the RCUs of the instance.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
