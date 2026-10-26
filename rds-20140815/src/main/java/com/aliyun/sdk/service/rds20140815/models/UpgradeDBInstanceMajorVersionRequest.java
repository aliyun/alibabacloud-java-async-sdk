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
         * <p>Specifies when to execute statistics collection for the database.
         * Valid values:</p>
         * <ul>
         * <li><strong>Before</strong>: collects statistics before the cutover. This ensures business stability. If the data volume of the instance is too large, the upgrade may take a long time.</li>
         * <li><strong>After</strong>: collects statistics after the cutover. This accelerates the instance upgrade. Accessing tables for which no statistics are generated after the upgrade may lead to inaccurate execution plans and even database breakdown during peak hours.</li>
         * </ul>
         * <blockquote>
         * <p>For scenarios where no cutover is performed, collecting statistics before the cutover means collecting statistics before the new instance enables read and write operations, and collecting statistics after the cutover means collecting statistics after the new instance enables read and write operations.</p>
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
         * <p>An internal reserved field. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>An internal reserved field. You do not need to specify this parameter</p>
         */
        public Builder customExtraInfo(String customExtraInfo) {
            this.putQueryParameter("CustomExtraInfo", customExtraInfo);
            this.customExtraInfo = customExtraInfo;
            return this;
        }

        /**
         * <p>The instance type after the upgrade. The CPU and memory configurations must be greater than or equal to those of the original instance. When <strong>UpgradeMode</strong> is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
         * <p>For example, if the original instance type is <code>pg.n2.small.2c</code> with 1 core and 2 GB of memory, you can upgrade it to <code>pg.n2.medium.2c</code> with 2 cores and 4 GB of memory.</p>
         * <blockquote>
         * <p>For more information about ApsaraDB RDS for PostgreSQL instance types, see <a href="https://help.aliyun.com/document_detail/276990.html">Primary ApsaraDB RDS for PostgreSQL instance types</a>.</p>
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
         * <p>The ID of the original instance.</p>
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
         * <p>The instance storage after the upgrade. Unit: GB. When <strong>UpgradeMode</strong> (upgrade mode) is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>ESSD PL1 cloud disk</strong>: 20 GB to 3,200 GB</li>
         * <li><strong>ESSD PL2 cloud disk</strong>: 500 GB to 3,200 GB</li>
         * <li><strong>ESSD PL3 cloud disk</strong>: 1,500 GB to 3,200 GB</li>
         * <li><strong>premium cloud disk</strong>: 40 GB to 2,000 GB</li>
         * </ul>
         * <blockquote>
         * <p>When you upgrade the major database version of an instance with premium local SSDs, storage capacity reduction is supported. For more information about the minimum storage capacity, see <a href="https://help.aliyun.com/document_detail/203309.html">Upgrade the major engine version</a>.</p>
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
         * <li><strong>cloud_ssd</strong>: standard SSD cloud disk</li>
         * <li><strong>cloud_essd</strong>: ESSD PL1 cloud disk</li>
         * <li><strong>cloud_essd2</strong>: ESSD PL2 cloud disk</li>
         * <li><strong>cloud_essd3</strong>: ESSD PL3 cloud disk</li>
         * <li><strong>general_essd</strong>: premium cloud disk</li>
         * </ul>
         * <p>The major engine version upgrade feature is based on cloud disk snapshots. The following storage types are supported after the upgrade:</p>
         * <ul>
         * <li>When the original instance uses standard SSD cloud disks, you can select standard SSD cloud disks.</li>
         * <li>When the original instance uses ESSD cloud disks, you can select ESSD PL1 cloud disks, ESSD PL2 cloud disks, ESSD PL3 cloud disks, or premium cloud disks.</li>
         * <li>When the original instance uses premium local SSDs, you can select ESSD PL1 cloud disks, ESSD PL2 cloud disks, ESSD PL3 cloud disks, or premium cloud disks.</li>
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
         * <p>The network type of the instance after the upgrade. Set the value to VPC. Only VPC-connected instances support major engine version upgrades.</p>
         * <p>If the instance is connected to the classic network, switch the network type to VPC first. For more information about how to view or switch the network type, see <a href="https://help.aliyun.com/document_detail/96761.html">Switch the network type</a>.</p>
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
         * <p>The billing method. Set the value to Postpaid, which indicates the pay-as-you-go billing method.</p>
         * <blockquote>
         * <p>If you want to change the billing method of the instance after the upgrade, see <a href="https://help.aliyun.com/document_detail/96743.html">Switch the billing method from pay-as-you-go to subscription</a>.</p>
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
         * <p>A reserved parameter. You do not need to configure this parameter.</p>
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
         * <p>You do not need to configure this parameter. It specifies the internal IP address of the target instance. By default, the system automatically allocates an IP address based on the VPCId and vSwitchId parameters.</p>
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
         * <p>The cutover configuration. Specifies whether to switch traffic to the new-version instance based on your business requirements.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs the cutover and automatic switchover. This option is generally used to execute a formal upgrade after you confirm that your business can run stably on the new version.</li>
         * <li><strong>false</strong>: does not perform the cutover and does not perform automatic switchover. This option is generally used to test the compatibility of your current business with the new version before a formal upgrade.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you choose to perform the cutover:<ul>
         * <li>Backoff is not supported after the cutover. Proceed with caution.</li>
         * <li>During the switchover procedure, the original instance becomes read-only and your business cannot write data to the instance. Make sure that you execute the cutover during off-peak hours.</li>
         * <li>If read-only instances are attached to the original instance, you cannot perform the cutover. You can only upgrade the instance without performing the cutover, and the original read-only instances are not cloned. After the upgrade is complete, you must create PostgreSQL read-only instances for the new-version instance.</li>
         * </ul>
         * </li>
         * <li>If you choose not to perform the cutover:<ul>
         * <li>Your business on the original instance is not affected during the migration.</li>
         * <li>If you upgrade the instance without performing the cutover, you must change the database endpoint in your application to the endpoint of the new instance after the migration is complete. For more information about how to view the endpoint, see <a href="https://help.aliyun.com/document_detail/96788.html">View or change the internal and public endpoints and port numbers</a>.</li>
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
         * <p>A reserved parameter. You do not need to configure this parameter.</p>
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
         * <p>The cutover time. This parameter is used together with SwitchOver and takes effect only when <strong>SwitchOver</strong> is set to <strong>true</strong>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>Immediate</strong>: The cutover takes effect immediately.</li>
         * <li><strong>MaintainTime</strong>: The cutover takes effect within the maintenance window. You can call the ModifyDBInstanceMaintainTime operation to modify the maintenance window.</li>
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
         * <p>The target major engine version after the upgrade. The value must be the same as the target version specified when you perform the pre-upgrade check.</p>
         * <blockquote>
         * <p>You can call the UpgradeDBInstanceMajorVersionPrecheck operation to perform a pre-upgrade check for a major engine version upgrade.</p>
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
         * <p>The upgrade mode. When <strong>SwitchOver</strong> is set to <strong>true</strong>, you must configure this parameter. Valid values:</p>
         * <ul>
         * <li><strong>inPlaceUpgrade</strong>: in-place upgrade. The major engine version upgrade task is executed on the original instance, and no new-version instance is created. The major engine version of the original instance is upgraded, and the original instance inherits the existing orders, instance name, tags, CloudMonitor alert rules, and backup rules.</li>
         * <li><strong>blueGreenDeployment</strong>: blue-green deployment. The major engine version upgrade retains the original instance and creates a new-version instance. You are not charged for the new instance while it is being created, but you are charged after it is created, and the billing method may change. After the upgrade is complete, both the original instance and the new instance incur fees, and the new instance does not enjoy the discounts of the original instance.</li>
         * <li><strong>zeroDownTimeUpgrade</strong>: zero-downtime upgrade. The system uses pg_upgrade to upgrade the original instance to the target version and implements incremental updates through native logical replication. Manual switchover is supported during the upgrade procedure, and you can verify the higher-version instance before the switchover. From the start of the upgrade to the manual switchover, the instance can maintain normal read and write operations. During the switchover, the read-only duration of the instance is measured in seconds.</li>
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
         * <p>A reserved parameter. You do not need to configure this parameter.</p>
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
         * <p>The VPC ID. When <strong>UpgradeMode</strong> is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
         * <p>You can call the DescribeDBInstanceAttribute operation to view the VPC ID of the original instance.</p>
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
         * <p>The vSwitch ID of the target instance. When <strong>UpgradeMode</strong> (upgrade mode) is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
         * <ul>
         * <li>When the original instance is a Basic Edition instance, configure the vSwitch ID of the target instance.</li>
         * <li>When the original instance is a high availability instance, you can configure the vSwitch IDs of the target primary and secondary instances, separated by commas (,).</li>
         * </ul>
         * <blockquote>
         * <p>The configured vSwitch of the target instance must be in the same zone as the original instance. You can call the DescribeVSwitches operation to query the vSwitch ID.</p>
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
         * <p>The ID of the destination primary zone. When <strong>UpgradeMode</strong> is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
         * <p>You can call the DescribeRegions operation to view the zone ID.</p>
         * <p>ApsaraDB RDS for PostgreSQL allows you to configure the new instance in a different zone within the same region as the original instance after the upgrade.</p>
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
         * <p>The ID of the secondary zone of the target instance. This parameter is available only when the original instance is a high availability instance. When <strong>UpgradeMode</strong> (upgrade mode) is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
         * <p>ApsaraDB RDS for PostgreSQL allows you to configure the new secondary instance in a different zone within the same region as the original instance after the upgrade.</p>
         * <p>You can call the DescribeRegions operation to view the zone ID.</p>
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
         * <p>A reserved parameter. You do not need to configure this parameter.</p>
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
