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
    @com.aliyun.core.annotation.NameInMap("AllocateStrategy")
    private String allocateStrategy;

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
        this.allocateStrategy = builder.allocateStrategy;
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
     * @return allocateStrategy
     */
    public String getAllocateStrategy() {
        return this.allocateStrategy;
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
        private String allocateStrategy; 
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
            this.allocateStrategy = request.allocateStrategy;
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
         * AllocateStrategy.
         */
        public Builder allocateStrategy(String allocateStrategy) {
            this.putQueryParameter("AllocateStrategy", allocateStrategy);
            this.allocateStrategy = allocateStrategy;
            return this;
        }

        /**
         * <p>Specifies whether to perform a <a href="https://help.aliyun.com/document_detail/127458.html">major engine version upgrade</a> for the ApsaraDB RDS for SQL Server instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs the upgrade.</li>
         * <li><strong>false</strong> (default): does not perform the upgrade.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>When you perform a major engine version upgrade, you must also specify other required parameters, including DBInstanceId, EngineVersion, DBInstanceClass, Category, ZoneId, and VSwitchId.</li>
         * <li>If you want to upgrade the instance to the High-availability Edition or Cluster Edition, you must also specify the ZoneIdSlave1 parameter.</li>
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
         * <li><strong>true</strong> (default): uses vouchers.</li>
         * <li><strong>false</strong>: does not use vouchers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2340501.html">I/O performance burst feature for Premium ESSDs</a>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature.</li>
         * <li><strong>false</strong>: disables the feature.</li>
         * </ul>
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
         * <p>The <a href="https://help.aliyun.com/document_detail/53509.html">instance edition</a>. Valid values:</p>
         * <blockquote>
         * <p>This parameter is required when <strong>EngineVersion</strong> is set to a SQL Server version number.</p>
         * </blockquote>
         * <details>
         * <summary>Regular ApsaraDB RDS instances</summary>
         * 
         * <ul>
         * <li><strong>Basic</strong>: Basic Edition</li>
         * <li><strong>HighAvailability</strong>: High-availability Edition</li>
         * <li><strong>AlwaysOn</strong>: SQL Server Cluster Edition</li>
         * <li><strong>Cluster</strong>: MySQL Cluster Edition</li>
         * <li>&lt;props=&quot;china&quot;&gt;<strong>Finance</strong>: Enterprise Edition</li>
         * </ul>
         * </details>
         * 
         * <details>
         * <summary>Serverless ApsaraDB RDS instances (not supported for MariaDB)</summary>
         * 
         * <ul>
         * <li><strong>serverless_basic</strong>: Serverless Basic Edition (MySQL and PostgreSQL only)</li>
         * <li><strong>serverless_standard</strong>: Serverless High-availability Edition (MySQL and PostgreSQL only)</li>
         * <li><strong>serverless_ha</strong>: Serverless High-availability Edition (SQL Server only)</li>
         * </ul>
         * </details>
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
         * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2701832.html">data archiving feature for Premium ESSDs</a>. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the feature.</p>
         * </li>
         * <li><p><strong>false</strong>: disables the feature.</p>
         * </li>
         * </ul>
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
         * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2861985.html">storage compression feature</a> for ApsaraDB RDS for MySQL. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables the feature.</li>
         * <li><strong>off</strong>: disables the feature.</li>
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
         * <p>The <a href="https://help.aliyun.com/document_detail/26312.html">target instance type</a>. You can call the <a href="https://help.aliyun.com/document_detail/610393.html">DescribeAvailableClasses</a> operation to query the available instance types for specification changes.</p>
         * <blockquote>
         * <ul>
         * <li>You must specify at least one of this parameter and <strong>DBInstanceStorage</strong>.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/610394.html">DescribeDBInstanceAttribute</a> operation to view the current instance type.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mysql.n8.large.2c</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/26312.html">target storage capacity</a>. Unit: GB. You can call the <a href="https://help.aliyun.com/document_detail/610393.html">DescribeAvailableClasses</a> operation to query the available storage capacity range for the target instance type.</p>
         * <blockquote>
         * <ul>
         * <li>You must specify at least one of this parameter and <strong>DBInstanceClass</strong>.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/610394.html">DescribeDBInstanceAttribute</a> operation to view the current storage capacity of the instance.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * <p>The instance storage type. Valid values:</p>
         * <ul>
         * <li><strong>local_ssd</strong>: premium local SSD</li>
         * <li><strong>cloud_ssd</strong>: standard SSD (not recommended. Sales have stopped in some regions)</li>
         * <li><strong>cloud_essd</strong>: PL1 ESSD</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
         * <li><strong>general_essd</strong>: Premium ESSD</li>
         * </ul>
         * <p>If you want to change the instance storage type, take note of the following items:
         * &lt;props=&quot;china&quot;&gt;* If you change the instance storage type from ESSD to Premium ESSD, other parameters such as the instance type and storage capacity must remain the same as the original values and cannot be modified.</p>
         * <p>&lt;props=&quot;china&quot;&gt;* For ApsaraDB RDS for MySQL or MariaDB instances whose instance storage type is standard SSD, you can set this parameter to <code>cloud_essd</code> to <a href="https://help.aliyun.com/document_detail/314678.html">upgrade the instance storage type to ESSD</a>. To perform the upgrade, you must specify both <strong>DBInstanceClass</strong> and <strong>DBInstanceStorage</strong>, and their values must be the same as the current values of the instance.</p>
         * <p>&lt;props=&quot;china&quot;&gt;* For ApsaraDB RDS for PostgreSQL instances, you can upgrade standard SSDs to <a href="https://help.aliyun.com/document_detail/96750.html">ESSDs of any PL</a>, but <strong>you cannot downgrade ESSDs to standard SSDs</strong>.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;For ApsaraDB RDS for PostgreSQL instances, you can upgrade standard SSDs to <a href="https://help.aliyun.com/document_detail/96750.html">ESSDs of any PL</a>, but <strong>you cannot downgrade ESSDs to standard SSDs</strong>.</p>
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
         * <p>The dedicated cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-7a9****</p>
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * <p>The type of the specification change. Valid values:</p>
         * <ul>
         * <li><strong>Up</strong> (default): upgrade for subscription instances, and upgrade or downgrade for pay-as-you-go instances.</li>
         * <li><strong>Down</strong>: downgrade for subscription instances.</li>
         * <li><strong>TempUpgrade</strong>: elastic specification change for subscription ApsaraDB RDS for SQL Server instances. This value is required for elastic specification changes.</li>
         * <li><strong>Serverless</strong>: configuration for adjusting the elastic settings of serverless instances.</li>
         * </ul>
         * <blockquote>
         * <p>If you only change the <strong>DBInstanceStorageType</strong> parameter, such as changing standard SSDs to ESSDs, leave this parameter empty.</p>
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
         * <p>The effective time of the new configurations. Valid values:</p>
         * <blockquote>
         * <p><strong>Changing some configurations may affect the instance</strong>. Read the <a href="https://help.aliyun.com/document_detail/96061.html">Impact section in the feature documentation</a> carefully before you configure this parameter. We recommend that you do this during off-peak hours.</p>
         * </blockquote>
         * <ul>
         * <li><strong>Immediate</strong> (default): takes effect immediately.</li>
         * <li><strong>MaintainTime</strong>: takes effect within the <a href="https://help.aliyun.com/document_detail/610402.html">maintenance window</a>.</li>
         * <li><strong>ScheduleTime</strong>: takes effect at a specified time. The specified time must be at least 12 hours later than the current time, and the actual switchover time follows the formula: EffectiveTime = ScheduleTime + SwitchTime.</li>
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
         * <p>The database engine version. Valid values:</p>
         * <details>
         * <summary>Regular ApsaraDB RDS instances</summary>
         * 
         * <ul>
         * <li>MySQL: 5.5, 5.6, 5.7, and 8.0</li>
         * <li>SQL Server: 2008r2, 08r2_ent_ha, 2012, 2012_ent_ha, 2012_std_ha, 2012_web, 2014_std_ha, 2016_ent_ha, 2016_std_ha, 2016_web, 2017_std_ha, 2017_ent, 2019_std_ha, 2019_ent, 2022_web, 2022_std_ha, 2022_ent, 2025_std, and 2025_ent</li>
         * <li>PostgreSQL: 10.0, 11.0, 12.0, 13.0, 14.0, and 15.0</li>
         * <li>MariaDB: 10.3</li>
         * </ul>
         * </details>
         * 
         * <details>
         * <summary>Serverless ApsaraDB RDS instances (not supported for MariaDB)</summary>
         * 
         * <ul>
         * <li>MySQL: 5.7 and 8.0</li>
         * <li>SQL Server: 2016_std_sl, 2017_std_sl, and 2019_std_sl</li>
         * <li>PostgreSQL: 14.0, 15.0, and 16.0</li>
         * </ul>
         * </details>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2527067.html">Buffer Pool Extension (BPE) feature for Premium ESSDs</a>. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enables the feature.</li>
         * <li><strong>0</strong>: disables the feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
            this.putQueryParameter("IoAccelerationEnabled", ioAccelerationEnabled);
            this.ioAccelerationEnabled = ioAccelerationEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2858761.html">16KB atomic write feature</a> for ApsaraDB RDS for MySQL. Valid values:</p>
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
         * <p>The current billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * <li><strong>Serverless</strong> (not supported for ApsaraDB RDS for MariaDB instances): serverless.</li>
         * </ul>
         * <blockquote>
         * <p>To change the billing method to serverless, <strong>you must configure</strong> the auto-start and auto-stop (AutoPause), scaling range (MaxCapacity and MinCapacity), and elastic policy (SwitchForce) in subsequent parameters. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of serverless ApsaraDB RDS for MySQL instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of serverless ApsaraDB RDS for SQL Server instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of serverless ApsaraDB RDS for PostgreSQL instances</a>.</p>
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
         * <p>72329885****</p>
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/276980.html">target instance type of the read-only instance</a> when you change an ApsaraDB RDS for MySQL High-availability Edition instance with premium local SSDs to a cloud disk instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mysqlro.n2.large.1c</p>
         */
        public Builder readOnlyDBInstanceClass(String readOnlyDBInstanceClass) {
            this.putQueryParameter("ReadOnlyDBInstanceClass", readOnlyDBInstanceClass);
            this.readOnlyDBInstanceClass = readOnlyDBInstanceClass;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy****</p>
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
         * <p>The configurations for changing the serverless instance.</p>
         */
        public Builder serverlessConfiguration(ServerlessConfiguration serverlessConfiguration) {
            String serverlessConfigurationShrink = shrink(serverlessConfiguration, "ServerlessConfiguration", "json");
            this.putQueryParameter("ServerlessConfiguration", serverlessConfigurationShrink);
            this.serverlessConfiguration = serverlessConfiguration;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not need to be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder sourceBiz(String sourceBiz) {
            this.putQueryParameter("SourceBiz", sourceBiz);
            this.sourceBiz = sourceBiz;
            return this;
        }

        /**
         * <p>The time when the specification change is performed. <strong>We recommend that you perform the specification change during off-peak hours</strong>.</p>
         * <p>Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
         * <blockquote>
         * <ul>
         * <li>The specified time <strong>must be later than the current time</strong> (the time when the call is initiated). Otherwise, the specification change task will fail. After the task fails, you must wait for the order to be automatically canceled before you can initiate the call again.</li>
         * <li>If you only increase the storage capacity or change the ESSD storage type, the specification change is performed immediately after submission because it does not affect your business. You do not need to configure this parameter.</li>
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
         * <p>The <a href="https://help.aliyun.com/document_detail/126002.html">minor engine version</a> of the ApsaraDB RDS for PostgreSQL instance. When you change the instance type and an error indicates that the minor engine version is not supported, you must specify the minor engine version <strong>to upgrade the minor engine version during the instance type change</strong>.</p>
         * <p>Format: <code>rds_postgres_&lt;Major version&gt;00_&lt;Minor version&gt;</code>. For example, for version 12 and minor version 20200830: <code>rds_postgres_1200_20200830</code>.</p>
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
         * <p>The duration of the <a href="https://help.aliyun.com/document_detail/95665.html">elastic upgrade</a> for the ApsaraDB RDS for SQL Server instance. Unit: days.</p>
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
         * <p>The vSwitch ID. The zone where the vSwitch resides must correspond to the zone ID specified in <strong>ZoneId</strong>.</p>
         * <ul>
         * <li>The network type (<strong>InstanceNetworkType</strong>) must be <strong>VPC</strong>.</li>
         * <li>If you specify ZoneSlaveId1 (the secondary zone ID), you must specify two vSwitch IDs and separate them with a comma (,).<blockquote>
         * <p>You only need to specify the vSwitch when you upgrade the major engine version of an ApsaraDB RDS for SQL Server instance (AllowMajorVersionUpgrade) or when you switch the vSwitch.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1oxflciovg9l7******</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
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
         * <p>The zone ID of the secondary node. If this value is the same as the value of <strong>ZoneId</strong>, it is a single-zone deployment. If this value is different from the value of <strong>ZoneId</strong>, it is a multi-zone deployment.</p>
         * <blockquote>
         * <p>You only need to specify the secondary zone when you upgrade the major engine version of an ApsaraDB RDS for SQL Server instance (AllowMajorVersionUpgrade), or you need to configure this parameter when switching the secondary zone.</p>
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
             * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2838448.html">smart pause and start</a> feature for the serverless ApsaraDB RDS for MySQL or PostgreSQL instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables the feature.</li>
             * <li><strong>false</strong> (default): disables the feature.</li>
             * </ul>
             * <blockquote>
             * <p>If no connections are established within 10 minutes, the instance enters the paused state. When a connection is established, the instance is automatically woken up.</p>
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
             * <p>The <strong>maximum</strong> number of ApsaraDB RDS capacity units (RCUs) for the automatic scaling of the serverless instance. Valid values:</p>
             * <ul>
             * <li>MySQL: <strong>1 to 32</strong></li>
             * <li>SQL Server: <strong>2 to 16</strong> (integers only)</li>
             * <li>PostgreSQL: <strong>1 to 14</strong></li>
             * </ul>
             * <blockquote>
             * <p>The value must be greater than or equal to the value of <strong>MinCapacity</strong>.</p>
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
             * <p>The <strong>minimum</strong> number of RCUs for the automatic scaling of the serverless instance. Valid values:</p>
             * <ul>
             * <li>MySQL: <strong>0.5 to 32</strong></li>
             * <li>SQL Server: <strong>2 to 16</strong> (integers only)</li>
             * <li>PostgreSQL: <strong>0.5 to 14</strong></li>
             * </ul>
             * <blockquote>
             * <p>The value must be less than or equal to the value of MaxCapacity.</p>
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
             * <p>Specifies whether to enable forced elastic scaling for the serverless ApsaraDB RDS for MySQL or PostgreSQL instance. Elastic scaling of RCUs usually takes effect immediately. However, in some special cases (such as during the execution of large transactions), the scaling cannot be completed immediately. In this case, you can enable this parameter to force the scaling. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables forced elastic scaling.</li>
             * <li><strong>false</strong> (default): disables forced elastic scaling.</li>
             * </ul>
             * <blockquote>
             * <p>After this parameter is enabled, <strong>the instance will be unavailable for 30 to 120 seconds during forced scaling</strong>. Use this parameter with caution based on your actual situation.</p>
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
