// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @com.aliyun.core.annotation.NameInMap("CompressionMode")
    private String compressionMode;

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
    @com.aliyun.core.annotation.NameInMap("OptimizedWrites")
    private String optimizedWrites;

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
        this.compressionMode = builder.compressionMode;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.DBInstanceStorageType = builder.DBInstanceStorageType;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.direction = builder.direction;
        this.effectiveTime = builder.effectiveTime;
        this.engineVersion = builder.engineVersion;
        this.ioAccelerationEnabled = builder.ioAccelerationEnabled;
        this.optimizedWrites = builder.optimizedWrites;
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
     * @return compressionMode
     */
    public String getCompressionMode() {
        return this.compressionMode;
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
     * @return optimizedWrites
     */
    public String getOptimizedWrites() {
        return this.optimizedWrites;
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
        private String compressionMode; 
        private String DBInstanceClass; 
        private String DBInstanceId; 
        private Integer DBInstanceStorage; 
        private String DBInstanceStorageType; 
        private String dedicatedHostGroupId; 
        private String direction; 
        private String effectiveTime; 
        private String engineVersion; 
        private String ioAccelerationEnabled; 
        private String optimizedWrites; 
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
            this.compressionMode = request.compressionMode;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.DBInstanceStorageType = request.DBInstanceStorageType;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.direction = request.direction;
            this.effectiveTime = request.effectiveTime;
            this.engineVersion = request.engineVersion;
            this.ioAccelerationEnabled = request.ioAccelerationEnabled;
            this.optimizedWrites = request.optimizedWrites;
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
         * <p>Specifies whether to upgrade the major engine version of an ApsaraDB RDS for SQL Server instance. For more information, see <a href="https://help.aliyun.com/document_detail/127458.html">Upgrade the major engine version</a>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>When you upgrade the major engine version, you must also specify the required parameters such as DBInstanceId, EngineVersion, DBInstanceClass, Category, ZoneId, and VSwitchId.</li>
         * <li>If you want to upgrade the instance edition to RDS High-availability Edition or RDS Cluster Edition, you must specify ZoneIdSlave1.</li>
         * </ul>
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
         * <p>An invalid parameter. You do not need to specify this parameter.</p>
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
         * <blockquote>
         * <p> If you set <strong>EngineVersion</strong> to an SQL Server version number, you must also specify this parameter.</p>
         * </blockquote>
         * <p><strong>Regular RDS instances</strong></p>
         * <ul>
         * <li><strong>Basic</strong>: RDS Basic Edition.</li>
         * <li><strong>HighAvailability</strong>: RDS High-availability Edition.</li>
         * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for ApsaraDB RDS for SQL Server.</li>
         * <li><strong>Cluster</strong>: RDS Cluster Edition for ApsaraDB RDS for MySQL.</li>
         * </ul>
         * <p><strong>Serverless instances. ApsaraDB RDS for MariaDB does not support serverless instances.</strong></p>
         * <ul>
         * <li><strong>serverless_basic</strong>: RDS Basic Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.</li>
         * <li><strong>serverless_standard</strong>: RDS High-availability Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.</li>
         * <li><strong>serverless_ha</strong>: RDS High-availability Edition for serverless instances. This edition is available only for instances that run SQL Server.</li>
         * </ul>
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
         * <p>Specifies whether to enable the storage compression feature for the ApsaraDB RDS for MySQL instance. For more information, see <a href="https://help.aliyun.com/document_detail/2861985.html">Use the storage compression feature</a>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder compressionMode(String compressionMode) {
            this.putQueryParameter("CompressionMode", compressionMode);
            this.compressionMode = compressionMode;
            return this;
        }

        /**
         * <p>The instance type of the new instance. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Specifications</a>. You can call the <a href="https://help.aliyun.com/document_detail/610393.html">DescribeAvailableClasses</a> operation to query the instance types.</p>
         * <blockquote>
         * <ul>
         * <li>You must specify at least one of DBInstanceClass and <strong>DBInstanceStorage</strong>.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/610394.html">DescribeDBInstanceAttribute</a> operation to query the current instance type of the instance.</li>
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
         * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> operation to query the instance IDs.</p>
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
         * <p>The storage capacity of the new instance. Unit: GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Storage types</a>. You can call the <a href="https://help.aliyun.com/document_detail/610393.html">DescribeAvailableClasses</a> operation to query the storage capacity range that is supported by the new instance type.</p>
         * <blockquote>
         * <ul>
         * <li>You must specify at least one of DBInstanceStorage and <strong>DBInstanceClass</strong>.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/610394.html">DescribeDBInstanceAttribute</a> operation to query the current storage capacity of the instance.</li>
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
         * <p>The storage type of the new instance. Valid values:</p>
         * <ul>
         * <li><strong>local_ssd</strong>: local SSD.</li>
         * <li><strong>cloud_ssd</strong>: SSD cloud disks. This storage medium is not recommended and is unavailable in specific Alibaba Cloud regions.</li>
         * <li><strong>cloud_essd</strong>: performance level 1 (PL1) Enterprise SSD (ESSD).</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
         * </ul>
         * <p>To change the storage type, take note of the following items:</p>
         * <p>If the instance runs PostgreSQL, you can upgrade the storage type of the instance from standard SSDs to ESSDs. However, you cannot downgrade the storage type of the instance from ESSDs to standard SSDs. ESSDs provide the following PLs: ESSDs of PL1, ESSDs of PL2, and ESSDs of PL3. You can upgrade or downgrade the storage type between ESSD of PL1, ESSD of PL2, and ESSD of PL3. For more information, see <a href="https://help.aliyun.com/document_detail/96750.html">Configuration items</a>.</p>
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
         * <p>The time when the new specifications take effect. Valid values:</p>
         * <blockquote>
         * <p> <strong>Specific changes may affect the instance</strong>. Read the <a href="https://help.aliyun.com/document_detail/96061.html">Impact</a> section before you specify this parameter. We recommend that you specify this parameter during off-peak hours.</p>
         * </blockquote>
         * <ul>
         * <li><strong>Immediate</strong> (default): The changes immediately take effect.</li>
         * <li><strong>MaintainTime</strong>: The changes take effect during the <a href="https://help.aliyun.com/document_detail/610402.html">maintenance window</a> of the instance.</li>
         * <li><strong>ScheduleTime</strong>: The changes take effect at the point in time that you specify. This time must be at least 12 hours later than the current time. The actual effective time is calculated based on the following formula: EffectiveTime = ScheduleTime + SwitchTime.</li>
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
         * <p>The database engine version of the instance. Valid values:</p>
         * <p><strong>Regular RDS instances</strong></p>
         * <ul>
         * <li>Valid values when Engine is set to MySQL: 5.5, 5.6, 5.7, and 8.0.</li>
         * <li>Valid values when Engine is set to SQLServer: 2008r2, 08r2_ent_ha, 2012, 2012_ent_ha, 2012_std_ha, 2012_web, 2014_std_ha, 2016_ent_ha, 2016_std_ha, 2016_web, 2017_std_ha, 2017_ent, 2019_std_ha, and 2019_ent.</li>
         * <li>Valid values when Engine is set to PostgreSQL: 10.0, 11.0, 12.0, 13.0, 14.0, and 15.0.</li>
         * <li>Valid value when Engine is set to MariaDB: 10.3.</li>
         * </ul>
         * <p><strong>Serverless instances. ApsaraDB RDS for MariaDB does not support serverless instances.</strong></p>
         * <ul>
         * <li>Valid values when Engine is set to MySQL: 5.7 and 8.0.</li>
         * <li>Valid values when Engine is set to SQL Server: 2016_std_sl, 2017_std_sl, and 2019_std_sl.</li>
         * <li>Valid values when Engine is set to PostgreSQL: 14.0, 15.0, and 16.0.</li>
         * </ul>
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
         * <p>Specifies whether to enable the write optimization feature for the ApsaraDB RDS for MySQL instance. For more information, see <a href="https://help.aliyun.com/document_detail/2858761.html">Use the write optimization feature</a>. Valid values:</p>
         * <ul>
         * <li><strong>optimized</strong>: enables the feature.</li>
         * <li><strong>none</strong>: disables the feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>optimized</p>
         */
        public Builder optimizedWrites(String optimizedWrites) {
            this.putQueryParameter("OptimizedWrites", optimizedWrites);
            this.optimizedWrites = optimizedWrites;
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
         * <li><strong>Serverless</strong>: serverless. This value is not supported for ApsaraDB RDS for MariaDB instances.</li>
         * </ul>
         * <blockquote>
         * <p> If you want to set this parameter to Serverless, **you must specify **AutoPause, MaxCapacity, MinCapacity, and SwitchForce. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of serverless ApsaraDB RDS for MySQL instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of serverless ApsaraDB RDS for SQL Server instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of serverless ApsaraDB RDS for PostgreSQL instances</a>.</p>
         * </blockquote>
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
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>723298850895</p>
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>The specification of the read-only instance when you change the storage type of the ApsaraDB RDS for MySQL instance that runs RDS High-availability Edition from cloud disk to local disk.</p>
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
         * <p>The time at which you want to change the specifications. <strong>We recommend that you perform the specification changes during off-peak hours.</strong></p>
         * <p>Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <ul>
         * <li>The time at which you want to change the specifications <strong>must be later than the current time</strong>. Otherwise, the specification change task fails. If the specification change task fails, you must wait for the order to be automatically canceled, and then call this operation again.</li>
         * <li>If you want to increase the storage capacity or change the ESSD storage type between different PLs, the specification change immediately takes effect and does not affect your workloads. You do not need to specify this parameter.</li>
         * </ul>
         * </blockquote>
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
         * <p>The minor engine version number of the ApsaraDB RDS for PostgreSQL instance. For more information, see <a href="https://help.aliyun.com/document_detail/126002.html">Update the minor engine version</a>. If the minor engine version does not support changing the instance type, you must specify the minor engine version to <strong>update the minor engine version when you change the instance type</strong>.</p>
         * <p>Format: <code>rds_postgres_&lt;Major engine version&gt;00_&lt;Minor engine version&gt;</code>. For example, if the instance runs PostgreSQL 12, set this parameter to <code>rds_postgres_1200_20200830</code>.</p>
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
         * <p>The validity period of the specification changes on an ApsaraDB RDS for SQL Server instance. At the end of the validity period, the specifications of the instance are restored to the specifications that are used before an <a href="https://help.aliyun.com/document_detail/95665.html">elastic upgrade</a> is performed. Unit: days.</p>
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
         * <p> If you want to upgrade the major engine version of an ApsaraDB RDS for SQL Server instance by specifying AllowMajorVersionUpgrade or change the vSwitch, you must specify this parameter.</p>
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
         * <p>The zone ID of the secondary instance. If you set this parameter to the same value as <strong>ZoneId</strong>, the single-zone deployment method is used. If you set this parameter to a different value from <strong>ZoneId</strong>, the multi-zone deployment method is used.</p>
         * <blockquote>
         * <p> If you want to upgrade the major engine version of an ApsaraDB RDS for SQL Server instance by specifying AllowMajorVersionUpgrade or change the secondary zone, you must specify this parameter.</p>
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

            private Builder() {
            } 

            private Builder(ServerlessConfiguration model) {
                this.autoPause = model.autoPause;
                this.maxCapacity = model.maxCapacity;
                this.minCapacity = model.minCapacity;
                this.switchForce = model.switchForce;
            } 

            /**
             * <p>Specifies whether to enable the automatic start and stop feature for the serverless instance that runs MySQL or PostgreSQL. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <p> After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection to the instance is established, the instance is automatically resumed.</p>
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
             * <p>The <strong>maximum</strong> number of RDS Capacity Units (RCUs). Valid values:</p>
             * <ul>
             * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>1 to 32</strong></li>
             * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 16</strong>. Only integers are supported.</li>
             * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>1 to 14</strong></li>
             * </ul>
             * <blockquote>
             * <p> The value of this parameter must be greater than or equal to the value of <strong>MinCapacity</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder maxCapacity(Double maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * <p>The minimum number of RCUs. Valid values:****</p>
             * <ul>
             * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>0.5 to 32</strong>.</li>
             * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 8</strong>. Only integers are supported.</li>
             * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>0.5 to 14</strong>.</li>
             * </ul>
             * <blockquote>
             * <p> The value of this parameter must be less than or equal to the value of MaxCapacity.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder minCapacity(Double minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            /**
             * <p>Specifies whether to enable the forceful scaling feature for the serverless instance that runs MySQL or PostgreSQL. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If you set this parameter to true, <strong>a service interruption that lasts 30 to 120 seconds occurs during forced scaling</strong>. Process with caution.</p>
             * </li>
             * <li><p>The RCU scaling for a serverless instance immediately takes effect. In some cases, such as the execution of large transactions, the scaling does not immediately take effect. In this case, you can enable this feature to forcefully scale the RCUs of the instance.</p>
             * </li>
             * </ul>
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
