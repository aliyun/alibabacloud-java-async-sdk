// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReadOnlyDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateReadOnlyDBInstanceRequest</p>
 */
public class CreateReadOnlyDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BpeEnabled")
    private String bpeEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
    private Boolean burstingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer DBInstanceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GdnInstanceName")
    private String gdnInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstructionSetArch")
    private String instructionSetArch;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

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
    @com.aliyun.core.annotation.NameInMap("TargetDedicatedHostIdForMaster")
    private String targetDedicatedHostIdForMaster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TddlBizType")
    private String tddlBizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TddlRegionConfig")
    private String tddlRegionConfig;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateReadOnlyDBInstanceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bpeEnabled = builder.bpeEnabled;
        this.burstingEnabled = builder.burstingEnabled;
        this.category = builder.category;
        this.clientToken = builder.clientToken;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.DBInstanceStorageType = builder.DBInstanceStorageType;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.deletionProtection = builder.deletionProtection;
        this.engineVersion = builder.engineVersion;
        this.gdnInstanceName = builder.gdnInstanceName;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.instructionSetArch = builder.instructionSetArch;
        this.ioAccelerationEnabled = builder.ioAccelerationEnabled;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.port = builder.port;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetDedicatedHostIdForMaster = builder.targetDedicatedHostIdForMaster;
        this.tddlBizType = builder.tddlBizType;
        this.tddlRegionConfig = builder.tddlRegionConfig;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReadOnlyDBInstanceRequest create() {
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
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
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
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return gdnInstanceName
     */
    public String getGdnInstanceName() {
        return this.gdnInstanceName;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return instructionSetArch
     */
    public String getInstructionSetArch() {
        return this.instructionSetArch;
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
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
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
     * @return targetDedicatedHostIdForMaster
     */
    public String getTargetDedicatedHostIdForMaster() {
        return this.targetDedicatedHostIdForMaster;
    }

    /**
     * @return tddlBizType
     */
    public String getTddlBizType() {
        return this.tddlBizType;
    }

    /**
     * @return tddlRegionConfig
     */
    public String getTddlRegionConfig() {
        return this.tddlRegionConfig;
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

    public static final class Builder extends Request.Builder<CreateReadOnlyDBInstanceRequest, Builder> {
        private Boolean autoPay; 
        private String autoRenew; 
        private String bpeEnabled; 
        private Boolean burstingEnabled; 
        private String category; 
        private String clientToken; 
        private String DBInstanceClass; 
        private String DBInstanceDescription; 
        private String DBInstanceId; 
        private Integer DBInstanceStorage; 
        private String DBInstanceStorageType; 
        private String dedicatedHostGroupId; 
        private Boolean deletionProtection; 
        private String engineVersion; 
        private String gdnInstanceName; 
        private String instanceNetworkType; 
        private String instructionSetArch; 
        private String ioAccelerationEnabled; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String period; 
        private String port; 
        private String privateIpAddress; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String targetDedicatedHostIdForMaster; 
        private String tddlBizType; 
        private String tddlRegionConfig; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateReadOnlyDBInstanceRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bpeEnabled = request.bpeEnabled;
            this.burstingEnabled = request.burstingEnabled;
            this.category = request.category;
            this.clientToken = request.clientToken;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.DBInstanceStorageType = request.DBInstanceStorageType;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.deletionProtection = request.deletionProtection;
            this.engineVersion = request.engineVersion;
            this.gdnInstanceName = request.gdnInstanceName;
            this.instanceNetworkType = request.instanceNetworkType;
            this.instructionSetArch = request.instructionSetArch;
            this.ioAccelerationEnabled = request.ioAccelerationEnabled;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.port = request.port;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.targetDedicatedHostIdForMaster = request.targetDedicatedHostIdForMaster;
            this.tddlBizType = request.tddlBizType;
            this.tddlRegionConfig = request.tddlRegionConfig;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * Specifies whether to enable the automatic payment feature. Valid values:
         * <p>
         * 
         * 1.  **true**: enables the feature. Make sure that your account balance is sufficient.
         * 2.  **false**: disables the feature. An unpaid order is generated.
         * 
         * >  Default value: true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to enable the auto-renewal feature for the read-only instance. If you set the PayType parameter to Prepaid, you must also specify this parameter. Valid values:
         * <p>
         * 
         * *   **true**: enables the feature.
         * *   **false**: disables the feature.
         * 
         * > * If you set the Period parameter to Month, the auto-renewal cycle is one month.
         * > * If you set the Period parameter to Year, the auto-renewal cycle is one year.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * A reserved parameter. You do not need to specify this parameter.
         */
        public Builder bpeEnabled(String bpeEnabled) {
            this.putQueryParameter("BpeEnabled", bpeEnabled);
            this.bpeEnabled = bpeEnabled;
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
         * *   **Basic**: RDS Basic Edition
         * *   **HighAvailability** (default): RDS High-availability Edition
         * *   **AlwaysOn**: RDS Cluster Edition
         * 
         * >  The read-only instances of the primary instance that run PostgreSQL and use cloud disks run RDS Basic Edition. Therefore, set this parameter to **Basic**.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The instance type of the read-only instance. For more information, see [Read-only instance types](~~145759~~). We recommend that you specify an instance type whose specifications are higher than or equal to the specifications of the instance type of the primary instance. If the specifications of the read-only instance are lower than the specifications of the primary instance, the read-only instance may encounter issues such as high latency and heavy load.
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * The description of the read-only instance. The description must be 2 to 256 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). The value must start with a letter
         * <p>
         * 
         * > The value cannot start with [http:// or https://.](http://https://。)
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * The primary instance ID. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The storage capacity of the read-only instance. The storage capacity of the read-only instance must be greater than or equal to that of the primary instance. For more information, see the **Storage capacity** column in [Read-only instance types](~~145759~~). This value must be a multiple of 5. Unit: GB.
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
         * *   **local_ssd**: local SSDs
         * *   **cloud_ssd**: standard SSDs
         * *   **cloud_essd**: enhanced SSDs (ESSDs) of performance level 1 (PL1)
         * *   **cloud_essd2**: ESSDs of PL2
         * *   **cloud_essd3**: ESSDs of PL3
         * 
         * > *   If the primary instance runs MySQL with local disks, you must set this parameter to **local_ssd**. If the primary instance runs MySQL with cloud disks, you must set this parameter to cloud_ssd, cloud_essd, cloud_essd2, or cloud_essd3.
         * > *   If the primary instance runs SQL Server, you must set this parameter to cloud_ssd, cloud_essd, cloud_essd2, or cloud_essd3.
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * The ID of the dedicated cluster to which the read-only instance belongs. This parameter is valid when you create the read-only instance in a dedicated cluster.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * Specifies whether to enable the release protection feature for the read-only instance. Valid values:
         * <p>
         * 
         * *   **true**: enables the feature.
         * *   **false** (default): disables the feature.
         * 
         * >  You can enable the release protection feature for the read-only instance only when you set the **Billing Method** parameter to **Pay-As-You-Go**.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * The version of the database engine. The read-only instance and the primary instance must run the same major engine version.
         * <p>
         * 
         * *   If the read-only instance runs MySQL, set this parameter to **5.6**, **5.7**, or **8.0**.
         * *   If the read-only instance runs MySQL, set this parameter to **2017\_ent, 2019\_ent, or 2022\_ent**.
         * *   If the read-only instance runs PostgreSQL, set this parameter to **10.0, 11.0, 12.0, 13.0, 14.0, or 15.0**.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder gdnInstanceName(String gdnInstanceName) {
            this.putQueryParameter("GdnInstanceName", gdnInstanceName);
            this.gdnInstanceName = gdnInstanceName;
            return this;
        }

        /**
         * The network type of the read-only instance. Valid values:
         * <p>
         * 
         * *   **VPC**
         * *   **Classic**
         * 
         * Default value: VPC. If you set this parameter to VPC, you must also specify the **VPCId** and **VSwitchId** parameters.
         * 
         * > The network type of the read-only instance can be different from the network type of the primary instance.
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder instructionSetArch(String instructionSetArch) {
            this.putQueryParameter("InstructionSetArch", instructionSetArch);
            this.instructionSetArch = instructionSetArch;
            return this;
        }

        /**
         * A reserved parameter.
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
         * The billing method of the read-only instance. Valid values:
         * <p>
         * 
         * *   **Postpaid**: pay-as-you-go
         * *   **Prepaid**: subscription
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The renewal cycle of the read-only instance. Valid values:
         * <p>
         * 
         * *   **Year**
         * *   **Month**
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The port that can be initialized when you create a read-only ApsaraDB RDS for MySQL instance.
         * <p>
         * 
         * Valid values: 1000 to 65534.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The private IP address of the read-only instance. The private IP address must be within the CIDR block that is supported by the specified vSwitch. The system assigns a private IP address to the read-only instance based on the values of the **VPCId** and **VSwitchId** parameters.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The region ID. The read-only instance and the primary instance must reside in the same region. You can call the DescribeRegions operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The ID of the host on which the primary instance resides. This parameter is valid when you create the read-only instance in a dedicated cluster.
         */
        public Builder targetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
            this.putQueryParameter("TargetDedicatedHostIdForMaster", targetDedicatedHostIdForMaster);
            this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder tddlBizType(String tddlBizType) {
            this.putQueryParameter("TddlBizType", tddlBizType);
            this.tddlBizType = tddlBizType;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder tddlRegionConfig(String tddlRegionConfig) {
            this.putQueryParameter("TddlRegionConfig", tddlRegionConfig);
            this.tddlRegionConfig = tddlRegionConfig;
            return this;
        }

        /**
         * The subscription duration of the read-only instance. Valid values:
         * <p>
         * 
         * *   If you set the **Period** parameter to **Year**, the value of the **UsedTime** parameter ranges from **1** to **5**.
         * *   If you set the **Period** parameter to **Month**, the value of the **UsedTime** parameter ranges from **1** to **9**.
         * 
         * > If you set the **PayType** parameter to **Prepaid**, you must specify the UsedTime parameter.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * The virtual private cloud (VPC) ID of the read-only instance. If you leave the **InstanceNetworkType** parameter empty or set it to **VPC**, you must also specify this parameter.
         * <p>
         * 
         * > * If the primary instance uses local disks, the read-only instance and the primary instance can belong to the same VPC or different VPCs.
         * > * If the primary instance uses cloud disks, the read-only instance and the primary instance must belong to the same VPC.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * The vSwitch ID of the read-only instance. If you leave the **InstanceNetworkType** parameter empty or set it to **VPC**, you must specify the VSwitchId parameter.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The zone ID. You can call the DescribeRegions operation to query the zone ID.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateReadOnlyDBInstanceRequest build() {
            return new CreateReadOnlyDBInstanceRequest(this);
        } 

    } 

}
