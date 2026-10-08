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
 * {@link UpgradeDBInstanceMajorVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBInstanceMajorVersionRequest</p>
 */
public class UpgradeDBInstanceMajorVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowDDL")
    private Boolean allowDDL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CollectStatMode")
    private String collectStatMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomExtraInfo")
    private String customExtraInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
    private Integer DBInstanceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchOver")
    private String switchOver;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTime")
    private String switchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTimeMode")
    private String switchTimeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetMajorVersion")
    private String targetMajorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeMode")
    private String upgradeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private String usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneIdSlave1")
    private String zoneIdSlave1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneIdSlave2")
    private String zoneIdSlave2;

    private UpgradeDBInstanceMajorVersionRequest(Builder builder) {
        super(builder);
        this.allowDDL = builder.allowDDL;
        this.collectStatMode = builder.collectStatMode;
        this.customExtraInfo = builder.customExtraInfo;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.DBInstanceStorageType = builder.DBInstanceStorageType;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.payType = builder.payType;
        this.period = builder.period;
        this.privateIpAddress = builder.privateIpAddress;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.switchOver = builder.switchOver;
        this.switchTime = builder.switchTime;
        this.switchTimeMode = builder.switchTimeMode;
        this.targetMajorVersion = builder.targetMajorVersion;
        this.upgradeMode = builder.upgradeMode;
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

    public static UpgradeDBInstanceMajorVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowDDL
     */
    public Boolean getAllowDDL() {
        return this.allowDDL;
    }

    /**
     * @return collectStatMode
     */
    public String getCollectStatMode() {
        return this.collectStatMode;
    }

    /**
     * @return customExtraInfo
     */
    public String getCustomExtraInfo() {
        return this.customExtraInfo;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return switchOver
     */
    public String getSwitchOver() {
        return this.switchOver;
    }

    /**
     * @return switchTime
     */
    public String getSwitchTime() {
        return this.switchTime;
    }

    /**
     * @return switchTimeMode
     */
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

    /**
     * @return targetMajorVersion
     */
    public String getTargetMajorVersion() {
        return this.targetMajorVersion;
    }

    /**
     * @return upgradeMode
     */
    public String getUpgradeMode() {
        return this.upgradeMode;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
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

    public static final class Builder extends Request.Builder<UpgradeDBInstanceMajorVersionRequest, Builder> {
        private Boolean allowDDL; 
        private String collectStatMode; 
        private String customExtraInfo; 
        private String DBInstanceClass; 
        private String DBInstanceId; 
        private Integer DBInstanceStorage; 
        private String DBInstanceStorageType; 
        private String instanceNetworkType; 
        private String payType; 
        private String period; 
        private String privateIpAddress; 
        private Long resourceOwnerId; 
        private String switchOver; 
        private String switchTime; 
        private String switchTimeMode; 
        private String targetMajorVersion; 
        private String upgradeMode; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 
        private String zoneIdSlave1; 
        private String zoneIdSlave2; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBInstanceMajorVersionRequest request) {
            super(request);
            this.allowDDL = request.allowDDL;
            this.collectStatMode = request.collectStatMode;
            this.customExtraInfo = request.customExtraInfo;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.DBInstanceStorageType = request.DBInstanceStorageType;
            this.instanceNetworkType = request.instanceNetworkType;
            this.payType = request.payType;
            this.period = request.period;
            this.privateIpAddress = request.privateIpAddress;
            this.resourceOwnerId = request.resourceOwnerId;
            this.switchOver = request.switchOver;
            this.switchTime = request.switchTime;
            this.switchTimeMode = request.switchTimeMode;
            this.targetMajorVersion = request.targetMajorVersion;
            this.upgradeMode = request.upgradeMode;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
            this.zoneIdSlave1 = request.zoneIdSlave1;
            this.zoneIdSlave2 = request.zoneIdSlave2;
        } 

        /**
         * AllowDDL.
         */
        public Builder allowDDL(Boolean allowDDL) {
            this.putQueryParameter("AllowDDL", allowDDL);
            this.allowDDL = allowDDL;
            return this;
        }

        /**
         * <p>Specifies when to execute statistics information collection on the database.</p>
         * <ul>
         * <li><strong>Before</strong>: Execute collection before the switchover. This ensures business stability. If the instance has a large data volume, the upgrade may take a long time.</li>
         * <li><strong>After</strong>: Execute collection after the switchover. The upgrade is faster. Accessing tables without generated statistics information after the upgrade may cause inaccurate execution plans. During peak hours, this may cause the database to break down.</li>
         * </ul>
         * <blockquote>
         * <p>For non-switchover scenarios, &quot;before switchover&quot; means statistics information is collected before the new instance is opened for read/write, and &quot;after switchover&quot; means statistics information is collected after the new instance is opened for read/write.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>After</p>
         */
        public Builder collectStatMode(String collectStatMode) {
            this.putQueryParameter("CollectStatMode", collectStatMode);
            this.collectStatMode = collectStatMode;
            return this;
        }

        /**
         * CustomExtraInfo.
         */
        public Builder customExtraInfo(String customExtraInfo) {
            this.putQueryParameter("CustomExtraInfo", customExtraInfo);
            this.customExtraInfo = customExtraInfo;
            return this;
        }

        /**
         * <p>The instance type after the upgrade. The CPU and memory configurations must be greater than or equal to those of the original instance type. If <strong>UpgradeMode</strong> is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, <strong>you do not need to configure</strong> this parameter.</p>
         * <p>For example, if the original instance type is <code>pg.n2.small.2c</code> with 1 CPU core and 2 GB of memory, you can upgrade it to <code>pg.n2.medium.2c</code> with 2 CPU cores and 4 GB of memory.</p>
         * <blockquote>
         * <p>For the instance type codes of ApsaraDB RDS for PostgreSQL, refer to <a href="https://help.aliyun.com/document_detail/276990.html">Primary ApsaraDB RDS for PostgreSQL instance types</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pg.n2.medium.2c</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The instance ID of the original instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp1gm3yh0ht1****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The instance storage capacity after the upgrade. Unit: GB. If <strong>UpgradeMode</strong> (upgrade pattern) is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, <strong>you do not need to configure</strong> this parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>PL1 ESSD cloud disk</strong>: 20 GB to 3200 GB</li>
         * <li><strong>PL2 ESSD cloud disk</strong>: 500 GB to 3200 GB</li>
         * <li><strong>PL3 ESSD cloud disk</strong>: 1500 GB to 3200 GB</li>
         * <li><strong>Premium performance disk</strong>: 40 GB to 2000 GB</li>
         * </ul>
         * <blockquote>
         * <p>When upgrading the major engine version of an instance with Premium Local SSDs, storage capacity reduction is supported. For the minimum storage capacity, refer to <a href="https://help.aliyun.com/document_detail/203309.html">Upgrade the major engine version of a database</a>.</p>
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
         * <p>The storage type of the instance after the upgrade.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>cloud_ssd</strong>: standard SSD</li>
         * <li><strong>cloud_essd</strong>: PL1 ESSD</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
         * <li><strong>general_essd</strong>: premium performance disk</li>
         * </ul>
         * <p>The major engine version upgrade feature is based on cloud disk snapshots. The supported storage types after the upgrade are as follows:</p>
         * <ul>
         * <li>If the original instance uses a standard SSD, you can select standard SSD.</li>
         * <li>If the original instance uses an ESSD cloud disk, you can select PL1 ESSD, PL2 ESSD, PL3 ESSD, or premium performance disk.</li>
         * <li>If the original instance uses Premium Local SSDs, you can select PL1 ESSD, PL2 ESSD, PL3 ESSD, or premium performance disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * <p>The network type of the instance after the upgrade. Set this parameter to VPC. Only VPC-connected instances support major engine version upgrades.</p>
         * <p>If the network type is classic network, switch to VPC first. For information about how to view or switch the network type, refer to <a href="https://help.aliyun.com/document_detail/96761.html">Switch the network type</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * <p>The billing method of the instance. Set this parameter to Postpaid for pay-as-you-go billing.</p>
         * <blockquote>
         * <p>If you want to change the billing method after the upgrade, refer to <a href="https://help.aliyun.com/document_detail/96743.html">Switch from pay-as-you-go to subscription</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>Reserved parameter. You do not need to configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>You do not need to configure this parameter. It specifies the internal IP address of the target instance. The system automatically assigns an IP address based on VPCId and vSwitchId by default.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
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
         * <p>The switchover configuration. Specifies whether to switch traffic to the new version instance based on your business requirements.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Switchover is performed and automatic switchover is enabled. This option is typically used to execute the formal upgrade after confirming that your business can run stably on the new version.</li>
         * <li><strong>false</strong>: Switchover is not performed and automatic switchover is not enabled. This option is typically used to test the compatibility of your application with the new version before the formal upgrade.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you select switchover:<ul>
         * <li>Switchover cannot be rolled back after execution. Proceed with caution.</li>
         * <li>During the switchover procedure, the original instance becomes read-only and writes are not allowed. Execute the switchover during off-peak hours.</li>
         * <li>If read-only instances are created for the original instance, you cannot select switchover. You can only upgrade the instance without switchover, and the original read-only instances are not cloned. After the upgrade, create new PostgreSQL read-only instances for the new version instance.</li>
         * </ul>
         * </li>
         * <li>If you do not select switchover:<ul>
         * <li>The business on the original instance is not affected during migration.</li>
         * <li>To upgrade the instance without switchover, change the database connection address in your application to the database connection address of the new instance after migration is complete. For information about how to view the connection address, refer to <a href="https://help.aliyun.com/document_detail/96788.html">View or modify the internal and public endpoints and port numbers</a>.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder switchOver(String switchOver) {
            this.putQueryParameter("SwitchOver", switchOver);
            this.switchOver = switchOver;
            return this;
        }

        /**
         * <p>Reserved parameter. You do not need to configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-10T13:15:12Z</p>
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * <p>This parameter is used together with SwitchOver and takes effect only when <strong>SwitchOver</strong> is set to <strong>true</strong>. Specifies the switchover time.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>Immediate</strong>: The switchover takes effect immediately.</li>
         * <li><strong>MaintainTime</strong>: The switchover takes effect during the maintenance window. You can call the ModifyDBInstanceMaintainTime operation to modify the maintenance window.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Immediate</p>
         */
        public Builder switchTimeMode(String switchTimeMode) {
            this.putQueryParameter("SwitchTimeMode", switchTimeMode);
            this.switchTimeMode = switchTimeMode;
            return this;
        }

        /**
         * <p>The target major engine version of the instance after the upgrade. This value must be the same as the target version specified during the pre-upgrade check.</p>
         * <blockquote>
         * <p>You can call the UpgradeDBInstanceMajorVersionPrecheck operation to perform a pre-upgrade check for the major engine version upgrade.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>13.0</p>
         */
        public Builder targetMajorVersion(String targetMajorVersion) {
            this.putQueryParameter("TargetMajorVersion", targetMajorVersion);
            this.targetMajorVersion = targetMajorVersion;
            return this;
        }

        /**
         * <p>The upgrade pattern. Configure this parameter when <strong>SwitchOver</strong> is set to <strong>true</strong>. Valid values:</p>
         * <ul>
         * <li><strong>inPlaceUpgrade</strong>: In-place upgrade. The major engine version upgrade task is executed on the original instance without creating a new version instance. After the upgrade, the original instance inherits the existing order, instance name, tags, CloudMonitor alert rules, and backup rules.</li>
         * <li><strong>blueGreenDeployment</strong>: Blue-green deployment. The major engine version upgrade retains the original instance and creates a new version instance. The new instance is free of charge during creation. After the new instance is created, fees are incurred and the billing method may change. After the upgrade, both the original and new instances incur fees, and the new instance does not inherit the discounts of the original instance.</li>
         * <li><strong>zeroDownTimeUpgrade</strong>: Zero-downtime upgrade. The system uses pg_upgrade to upgrade the original instance to the target version and uses native logical replication for incremental updates. Active switchover is supported during the upgrade procedure, and you can validate the higher version instance before the switchover. From the start of the upgrade until the active switchover, the instance maintains normal read/write operations. During the switchover, the read-only duration is at the second level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>inPlaceUpgrade</p>
         */
        public Builder upgradeMode(String upgradeMode) {
            this.putQueryParameter("UpgradeMode", upgradeMode);
            this.upgradeMode = upgradeMode;
            return this;
        }

        /**
         * <p>Reserved parameter. You do not need to configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The VPC ID. If <strong>UpgradeMode</strong> is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, <strong>you do not need to configure</strong> this parameter.</p>
         * <p>You can call the DescribeDBInstanceAttribute operation to query the VPC ID of the original instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1opxu1zkhn00gzv****</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID of the target instance. If <strong>UpgradeMode</strong> (upgrade pattern) is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, <strong>you do not need to configure</strong> this parameter.</p>
         * <ul>
         * <li>If the original instance is a Basic Edition instance, specify the vSwitch ID of the target instance.</li>
         * <li>If the original instance is a high-availability series instance, you can specify the vSwitch IDs of the target primary and secondary instances, separated by commas (,).</li>
         * </ul>
         * <blockquote>
         * <p>The target vSwitch must be in the same zone as the original instance. You can call the DescribeVSwitches operation to query vSwitches.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp10aqj6o4lclxdrm****,vsw-bp10aqj6o4lclxdrm****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The primary zone ID of the target instance. If <strong>UpgradeMode</strong> is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, <strong>you do not need to configure</strong> this parameter.</p>
         * <p>You can call the DescribeRegions operation to query zone IDs.</p>
         * <p>ApsaraDB RDS for PostgreSQL allows you to deploy the new instance in a different zone within the same region as the original instance after the upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>This parameter can be configured only when the original instance is a high-availability series instance. Specifies the secondary zone ID of the target instance. If <strong>UpgradeMode</strong> (upgrade pattern) is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, <strong>you do not need to configure</strong> this parameter.</p>
         * <p>ApsaraDB RDS for PostgreSQL allows you to deploy the new secondary instance in a different zone within the same region as the original instance after the upgrade.</p>
         * <p>You can call the DescribeRegions operation to query zone IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        public Builder zoneIdSlave1(String zoneIdSlave1) {
            this.putQueryParameter("ZoneIdSlave1", zoneIdSlave1);
            this.zoneIdSlave1 = zoneIdSlave1;
            return this;
        }

        /**
         * <p>Reserved parameter. You do not need to configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        public Builder zoneIdSlave2(String zoneIdSlave2) {
            this.putQueryParameter("ZoneIdSlave2", zoneIdSlave2);
            this.zoneIdSlave2 = zoneIdSlave2;
            return this;
        }

        @Override
        public UpgradeDBInstanceMajorVersionRequest build() {
            return new UpgradeDBInstanceMajorVersionRequest(this);
        } 

    } 

}
