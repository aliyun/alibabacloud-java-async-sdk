// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBInstanceMajorVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBInstanceMajorVersionRequest</p>
 */
public class UpgradeDBInstanceMajorVersionRequest extends Request {
    @Query
    @NameInMap("CollectStatMode")
    private String collectStatMode;

    @Query
    @NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @Query
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @Query
    @NameInMap("DBInstanceStorage")
    private Integer DBInstanceStorage;

    @Query
    @NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

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
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SwitchOver")
    private String switchOver;

    @Query
    @NameInMap("SwitchTime")
    private String switchTime;

    @Query
    @NameInMap("SwitchTimeMode")
    private String switchTimeMode;

    @Query
    @NameInMap("TargetMajorVersion")
    private String targetMajorVersion;

    @Query
    @NameInMap("UsedTime")
    private String usedTime;

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

    private UpgradeDBInstanceMajorVersionRequest(Builder builder) {
        super(builder);
        this.collectStatMode = builder.collectStatMode;
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
     * @return collectStatMode
     */
    public String getCollectStatMode() {
        return this.collectStatMode;
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
        private String collectStatMode; 
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
            this.collectStatMode = request.collectStatMode;
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
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
            this.zoneIdSlave1 = request.zoneIdSlave1;
            this.zoneIdSlave2 = request.zoneIdSlave2;
        } 

        /**
         * The time at which the system collects the statistics of the new instance. Valid values:
         * <p>
         * 
         * *   Before: ApsaraDB RDS collects the statistics of the new instance before the switchover to ensure service stability. If the original instance contains a large amount of data, the upgrade may require a long period of time.
         * *   After: ApsaraDB RDS collects the statistics of the new instance after the switchover to accelerate the upgrade. If you access tables for which no statistics are generated, the execution plans that you specify may be inaccurate. In addition, your database service may be unavailable during peak hours.
         * 
         * > If you set SwitchOver to false, the value Before of this parameter specifies that ApsaraDB RDS collects the statistics of the new instance before the new instance starts to process read and write requests, and the value After of this parameter specifies that ApsaraDB RDS collects the statistics of the new instance after the new instance starts to process read and write requests.
         */
        public Builder collectStatMode(String collectStatMode) {
            this.putQueryParameter("CollectStatMode", collectStatMode);
            this.collectStatMode = collectStatMode;
            return this;
        }

        /**
         * The instance type of the new instance. The CPU and memory specifications of the new instance must be higher than or equal to the CPU and memory specifications of the original instance.
         * <p>
         * 
         * For example, if the instance type of the original instance is `pg.n2.small.2c`, which provides 1 core and 2 GB of memory, the instance type of the new instance can be `pg.n2.medium.2c`, which provides 2 cores and 4 GB of memory.
         * 
         * > For more information about instance types in ApsaraDB RDS for PostgreSQL, see [Primary ApsaraDB RDS for PostgreSQL instance types](~~276990~~).
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * The ID of the original instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The storage capacity of the new instance.
         * <p>
         * 
         * Unit: GB
         * 
         * Valid values:
         * 
         * *   Valid values if you use enhanced SSDs (ESSDs) of performance level 1 (PL1): 20 to 3200
         * *   Valid values if you use ESSDs of PL2: 500 to 3200
         * *   Valid values if you use ESSDs of PL3: 1500 to 3200
         * 
         * > If the original instance uses local disks, you can reduce the storage capacity of the instance when you upgrade the major engine version of the instance. For more information about the minimum available storage capacity, see [Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance](~~203309~~).
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * The storage type of the new instance.
         * <p>
         * 
         * Valid values:
         * 
         * *   cloud_ssd: standard SSDs
         * *   cloud_essd: ESSD of PL1
         * *   cloud_essd2: ESSD of PL2
         * *   cloud_essd3: ESSD of PL3
         * 
         * The major engine version upgrade feature is based on cloud disk snapshots. You can select a storage type based on the following conditions:
         * 
         * *   If the original instance uses standard SSDs, you can set this parameter to cloud_ssd.
         * *   If the original instance uses ESSDs, you can set this parameter to cloud_essd, cloud_essd2, or cloud_essd3.
         * *   If the original instance uses local disks, you can set this parameter to cloud_essd, cloud_essd2, or cloud_essd3.
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * The network type of the new instance. Set the value to VPC. The major engine version upgrade feature is supported only for instances that reside in VPCs.
         * <p>
         * 
         * If the original instance resides in the classic network, you must migrate the instance to a VPC before you call this operation. For more information about how to view or change the network type of an instance, see [Change the network type of an ApsaraDB RDS for PostgreSQL instance](~~96761~~).
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * The billing method of the new instance. Set the value to Postpaid.
         * <p>
         * 
         * > For more information about how to change the billing method of an instance after the upgrade, see [Change the billing method of an instance from pay-as-you-go to subscription](~~96743~~).
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * A reserved parameter. You do not need to specify this parameter.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The internal IP address of the new instance. You do not need to specify this parameter. The system automatically assigns an internal IP address based on the values of the VPCId and vSwitchId parameters.
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
         * Specifies whether the system automatically switches your workloads over to the new instance after data is migrated to the new instance.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * *   false Before you perform an upgrade, we recommend that you set this parameter to false to test whether the new major engine version is compatible with your workloads.
         * 
         * > 
         * 
         * *   If you set this parameter to true, you must take note of the following information:
         * 
         *     *   After the switchover is complete, you cannot roll your workloads back to the original instance. Proceed with caution.
         *     *   During the switchover, the original instance processes only read requests. We recommend that you perform the switchover during off-peak hours.
         *     *   If read-only instances are attached to the original instance, you can set this parameter only to false. In this case, the read-only instances that are attached to the original instance cannot be cloned. After the upgrade is complete, you must create read-only instances for the new instance.
         * 
         * *   If you set this parameter to false, you must take note of the following information:
         * 
         *     *   The data migration does not interrupt your workloads on the original instance.
         *     *   After data is migrated to the new instance, you must update the endpoint configuration on your application. This update requires you to replace the endpoint of the original instance with the endpoint of the new instance. For more information about how to view the endpoint of an instance, see [View and change the internal and public endpoints and port numbers of an ApsaraDB RDS for PostgreSQL instance](~~96788~~).
         */
        public Builder switchOver(String switchOver) {
            this.putQueryParameter("SwitchOver", switchOver);
            this.switchOver = switchOver;
            return this;
        }

        /**
         * A reserved parameter. You do not need to specify this parameter.
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * The time at which the system switches your workloads over to the new instance. This parameter is used together with SwitchOver and takes effect only when you set SwitchOver to true.
         * <p>
         * 
         * Valid values:
         * 
         * *   Immediate: After data is migrated to the new instance, the system immediately switches your workloads over to the new instance.
         * *   MaintainTime: After data is migrated to the new instance, the system switches your workloads over to the new instance during the maintenance window that you specify. You can call the [ModifyDBInstanceMaintainTime](~~26249~~) operation to change the maintenance window of an instance.
         */
        public Builder switchTimeMode(String switchTimeMode) {
            this.putQueryParameter("SwitchTimeMode", switchTimeMode);
            this.switchTimeMode = switchTimeMode;
            return this;
        }

        /**
         * The major engine version of the new instance. The value of this parameter must be the major engine version on which an upgrade check is performed.
         * <p>
         * 
         * > You can call the [UpgradeDBInstanceMajorVersionPrecheck](~~330050~~) operation to perform an upgrade check.
         */
        public Builder targetMajorVersion(String targetMajorVersion) {
            this.putQueryParameter("TargetMajorVersion", targetMajorVersion);
            this.targetMajorVersion = targetMajorVersion;
            return this;
        }

        /**
         * A reserved parameter. You do not need to specify this parameter.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * The ID of the VPC in which the original instance resides. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the VPC ID of the instance.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * *   If the original instance runs RDS Basic Edition, you must enter the vSwitch ID of the new instance.
         * <p>
         * *   If the original instance runs RDS High-availability Edition, you must enter the vSwitch ID of the new instance and the vSwitch ID of the secondary instance of the new instance. Make sure that you separate the vSwitch IDs with commas (,).
         * 
         * > The vSwitches that you specify must reside in the same zone as the original instance. You can call the [DescribeVSwitches](~~35748~~) operation to query the ID of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The zone ID of the new instance. You can call the [DescribeRegions](~~26243~~) operation to query the zone ID.
         * <p>
         * 
         * You can select a zone that belongs to the region in which the original instance resides. The zone can be different from the zone of the original instance.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The zone ID of the secondary instance for the new instance. You can specify this parameter only when the original instance runs RDS High-availability Edition.
         * <p>
         * 
         * You can select a zone that belongs to the region in which the original instance resides. The zone can be different from the zone of the original instance.
         * 
         * You can call the [DescribeRegions](~~26243~~) operation to query the zone ID.
         */
        public Builder zoneIdSlave1(String zoneIdSlave1) {
            this.putQueryParameter("ZoneIdSlave1", zoneIdSlave1);
            this.zoneIdSlave1 = zoneIdSlave1;
            return this;
        }

        /**
         * A reserved parameter. You do not need to specify this parameter.
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
