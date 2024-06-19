// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTairInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateTairInstanceRequest</p>
 */
public class CreateTairInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private String autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private String autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessInfo")
    private String businessInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterBackupId")
    private String clusterBackupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalInstanceId")
    private String globalInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalSecurityGroupIds")
    private String globalSecurityGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamGroupId")
    private String paramGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1024)
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadOnlyCount")
    @com.aliyun.core.annotation.Validation(maximum = 5, minimum = 1)
    private Integer readOnlyCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecoverConfigMode")
    private String recoverConfigMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    @com.aliyun.core.annotation.Validation(maximum = 4096, minimum = 1)
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private String restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
    private String secondaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardCount")
    @com.aliyun.core.annotation.Validation(maximum = 64, minimum = 1)
    private Integer shardCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardType")
    private String shardType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveReadOnlyCount")
    private Integer slaveReadOnlyCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcDBInstanceId")
    private String srcDBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Storage")
    private Integer storage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateTairInstanceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.backupId = builder.backupId;
        this.businessInfo = builder.businessInfo;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.clusterBackupId = builder.clusterBackupId;
        this.couponNo = builder.couponNo;
        this.dryRun = builder.dryRun;
        this.engineVersion = builder.engineVersion;
        this.globalInstanceId = builder.globalInstanceId;
        this.globalSecurityGroupIds = builder.globalSecurityGroupIds;
        this.instanceClass = builder.instanceClass;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.paramGroupId = builder.paramGroupId;
        this.password = builder.password;
        this.period = builder.period;
        this.port = builder.port;
        this.privateIpAddress = builder.privateIpAddress;
        this.readOnlyCount = builder.readOnlyCount;
        this.recoverConfigMode = builder.recoverConfigMode;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.secondaryZoneId = builder.secondaryZoneId;
        this.securityToken = builder.securityToken;
        this.shardCount = builder.shardCount;
        this.shardType = builder.shardType;
        this.slaveReadOnlyCount = builder.slaveReadOnlyCount;
        this.srcDBInstanceId = builder.srcDBInstanceId;
        this.storage = builder.storage;
        this.storageType = builder.storageType;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTairInstanceRequest create() {
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
     * @return autoRenewPeriod
     */
    public String getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return autoUseCoupon
     */
    public String getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return businessInfo
     */
    public String getBusinessInfo() {
        return this.businessInfo;
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
     * @return clusterBackupId
     */
    public String getClusterBackupId() {
        return this.clusterBackupId;
    }

    /**
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return globalInstanceId
     */
    public String getGlobalInstanceId() {
        return this.globalInstanceId;
    }

    /**
     * @return globalSecurityGroupIds
     */
    public String getGlobalSecurityGroupIds() {
        return this.globalSecurityGroupIds;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
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
     * @return paramGroupId
     */
    public String getParamGroupId() {
        return this.paramGroupId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return readOnlyCount
     */
    public Integer getReadOnlyCount() {
        return this.readOnlyCount;
    }

    /**
     * @return recoverConfigMode
     */
    public String getRecoverConfigMode() {
        return this.recoverConfigMode;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return shardCount
     */
    public Integer getShardCount() {
        return this.shardCount;
    }

    /**
     * @return shardType
     */
    public String getShardType() {
        return this.shardType;
    }

    /**
     * @return slaveReadOnlyCount
     */
    public Integer getSlaveReadOnlyCount() {
        return this.slaveReadOnlyCount;
    }

    /**
     * @return srcDBInstanceId
     */
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    /**
     * @return storage
     */
    public Integer getStorage() {
        return this.storage;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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

    public static final class Builder extends Request.Builder<CreateTairInstanceRequest, Builder> {
        private Boolean autoPay; 
        private String autoRenew; 
        private String autoRenewPeriod; 
        private String autoUseCoupon; 
        private String backupId; 
        private String businessInfo; 
        private String chargeType; 
        private String clientToken; 
        private String clusterBackupId; 
        private String couponNo; 
        private Boolean dryRun; 
        private String engineVersion; 
        private String globalInstanceId; 
        private String globalSecurityGroupIds; 
        private String instanceClass; 
        private String instanceName; 
        private String instanceType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String paramGroupId; 
        private String password; 
        private Integer period; 
        private Integer port; 
        private String privateIpAddress; 
        private Integer readOnlyCount; 
        private String recoverConfigMode; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String secondaryZoneId; 
        private String securityToken; 
        private Integer shardCount; 
        private String shardType; 
        private Integer slaveReadOnlyCount; 
        private String srcDBInstanceId; 
        private Integer storage; 
        private String storageType; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTairInstanceRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.autoUseCoupon = request.autoUseCoupon;
            this.backupId = request.backupId;
            this.businessInfo = request.businessInfo;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.clusterBackupId = request.clusterBackupId;
            this.couponNo = request.couponNo;
            this.dryRun = request.dryRun;
            this.engineVersion = request.engineVersion;
            this.globalInstanceId = request.globalInstanceId;
            this.globalSecurityGroupIds = request.globalSecurityGroupIds;
            this.instanceClass = request.instanceClass;
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.paramGroupId = request.paramGroupId;
            this.password = request.password;
            this.period = request.period;
            this.port = request.port;
            this.privateIpAddress = request.privateIpAddress;
            this.readOnlyCount = request.readOnlyCount;
            this.recoverConfigMode = request.recoverConfigMode;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.secondaryZoneId = request.secondaryZoneId;
            this.securityToken = request.securityToken;
            this.shardCount = request.shardCount;
            this.shardType = request.shardType;
            this.slaveReadOnlyCount = request.slaveReadOnlyCount;
            this.srcDBInstanceId = request.srcDBInstanceId;
            this.storage = request.storage;
            this.storageType = request.storageType;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * Specifies whether to enable automatic payment. Set the value to **true**.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**: enables auto-renewal.
         * *   **false**: disables auto-renewal.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The subscription duration that is supported by auto-renewal. Unit: months. Valid values: **1**, **2**, **3**, **6**, and **12**.
         * <p>
         * 
         * > This parameter is required only if the **AutoRenew** parameter is set to **true**.
         */
        public Builder autoRenewPeriod(String autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * Specifies whether to use a coupon. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**: uses a coupon.
         * *   **false**: does not use a coupon.
         */
        public Builder autoUseCoupon(String autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * The ID of the backup set of the source instance. The system uses the data stored in the backup set to create an instance. You can call the [DescribeBackups](~~61081~~) operation to query the backup set ID.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * The ID of the promotion event or the business information.
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * The billing method of the instance. Default value: PrePaid. Valid values:
         * <p>
         * 
         * *   **PrePaid**: subscription
         * *   **PostPaid**: pay-as-you-go
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the token is unique among different requests. The token is case-sensitive. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * This parameter is supported for specific new cluster instances. You can query the backup set ID by calling the [DescribeClusterBackupList](~~2679158~~) operation.
         * <p>
         * 
         * *   If this parameter is supported, you can specify the backup set ID. In this case, you do not need to specify the **BackupId** parameter.
         * *   If this parameter is not supported, set the BackupId parameter to the IDs of backup sets in all shards of the source instance, separated by commas (,). Example: "2158\*\*\*\*20,2158\*\*\*\*22".
         */
        public Builder clusterBackupId(String clusterBackupId) {
            this.putQueryParameter("ClusterBackupId", clusterBackupId);
            this.clusterBackupId = clusterBackupId;
            return this;
        }

        /**
         * The coupon code.
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**: performs a dry run and does not create the instance. The system prechecks the request parameters, request format, service limits, and available resources. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false**: performs a dry run and sends the request. If the request passes the dry run, the instance is created.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The engine version. Default value: **1.0**. The parameter value varies with the Tair instance type.
         * <p>
         * 
         * *   For Tair DRAM-based instances (tair_rdb) that are compatible with Redis 5.0 or 6.0, set this parameter to 5.0 or 6.0.
         * *   For Tair persistent memory-optimized instances (tair_scm) that are compatible with Redis 6.0, set this parameter to 1.0.
         * *   For Tair ESSD-based instances (tair_essd) that are compatible with Redis 4.0 or 6.0, set this parameter to 1.0 or 2.0.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * Specifies whether to use the created instance as a child instance of a distributed instance.
         * <p>
         * 
         * *   If you want the created instance to be used as the first child instance, enter **true**.
         * *   If you want the created instance to be used as the second or third child instance, enter the ID of the distributed instance, such as gr-bp14rkqrhac\*\*\*\*.
         * *   If you do not want the created instance to be used as a distributed instance, leave the parameter empty.
         * 
         * >  If you want the created instance to be used as a distributed instance, the created instance must be a Tair DRAM-based instance.
         */
        public Builder globalInstanceId(String globalInstanceId) {
            this.putQueryParameter("GlobalInstanceId", globalInstanceId);
            this.globalInstanceId = globalInstanceId;
            return this;
        }

        /**
         * The global IP whitelist template of the instance. Separate multiple IP whitelist templates with commas (,) and make sure that each IP whitelist template is unique.
         */
        public Builder globalSecurityGroupIds(String globalSecurityGroupIds) {
            this.putQueryParameter("GlobalSecurityGroupIds", globalSecurityGroupIds);
            this.globalSecurityGroupIds = globalSecurityGroupIds;
            return this;
        }

        /**
         * The instance type. For more information, see the following topics:
         * <p>
         * 
         * *   [DRAM-based instances](~~443844~~)
         * *   [Persistent memory-optimized instances](~~443845~~)
         * *   [ESSD-based instances](~~443846~~)
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * The name of the instance. The name must meet the following requirements:
         * <p>
         * 
         * *   The name is 2 to 80 characters in length.
         * *   The name starts with a letter and does not contain spaces or special characters. Special characters include `@ / : = " < > { [ ] }`
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The storage type of the instance. Valid values:
         * <p>
         * 
         * *   **tair_rdb**: ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based instance
         * *   **tair_scm**: ApsaraDB for Redis Enhanced Edition (Tair) persistent memory-optimized instance
         * *   **tair_essd**: ApsaraDB for Redis Enhanced Edition (Tair) ESSD-based instance
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
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
         * The ID of the parameter template. The instance is created based on the parameters in the parameter template. The ID must be unique.
         */
        public Builder paramGroupId(String paramGroupId) {
            this.putQueryParameter("ParamGroupId", paramGroupId);
            this.paramGroupId = paramGroupId;
            return this;
        }

        /**
         * The password that is used to connect to the instance. The password must meet the following requirements:
         * <p>
         * 
         * *   The password is 8 to 32 characters in length.
         * *   The password contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `! @ # $ % ^ & * ( ) _ + - =`
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The subscription duration. Valid values: **1**, 2, 3, 4, 5, 6, 7, 8, **9**, **12**, **24**,**36**, and **60**. Unit: months.
         * <p>
         * 
         * > This parameter is required only if you set the **ChargeType** parameter to **PrePaid**.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The port number of the instance. Valid values: **1024** to **65535**. Default value: **6379**.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The private IP address of the instance.
         * <p>
         * 
         * > The IP address must be within the CIDR block of the vSwitch to which you want the instance to connect. You can call the [DescribeVSwitches](~~35748~~) operation of the VPC API to query the CIDR block information.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The number of read replicas in the primary zone. This parameter applies only to read/write splitting instances that use cloud disks. You can use this parameter to customize the number of read replicas. Valid values: 1 to 9.
         * <p>
         * 
         * >  The sum of the values of this parameter and SlaveReadOnlyCount cannot be greater than 9.
         */
        public Builder readOnlyCount(Integer readOnlyCount) {
            this.putQueryParameter("ReadOnlyCount", readOnlyCount);
            this.readOnlyCount = readOnlyCount;
            return this;
        }

        /**
         * RecoverConfigMode.
         */
        public Builder recoverConfigMode(String recoverConfigMode) {
            this.putQueryParameter("RecoverConfigMode", recoverConfigMode);
            this.recoverConfigMode = recoverConfigMode;
            return this;
        }

        /**
         * The ID of the region where you want to create the instance. You can call the [DescribeRegions](~~61012~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which you want to assign the instance.
         * <p>
         * 
         * > 
         * 
         * *   You can query resource group IDs by using the ApsaraDB for Redis console or by calling the [ListResourceGroups](~~158855~~) operation. For more information, see [View basic information of a resource group](~~151181~~).
         * 
         * *   Before you modify the resource group to which an instance belongs, you can call the [ListResources](~~158866~~) operation to view the current resource group of the instance.
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
         * If data flashback is enabled for the source instance, you can use this parameter to specify a point in time within the backup retention period of the source instance. The system uses the backup data of the source instance at the point in time to create an instance. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * The ID of the secondary zone. You can call the [DescribeRegions](~~61012~~) operation to query the ID of the secondary zone.
         * <p>
         * 
         * > You cannot specify multiple zone IDs or set this parameter to a value that is the same as that of the ZoneId parameter.
         */
        public Builder secondaryZoneId(String secondaryZoneId) {
            this.putQueryParameter("SecondaryZoneId", secondaryZoneId);
            this.secondaryZoneId = secondaryZoneId;
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
         * The number of data nodes in the instance. Valid values:
         * <p>
         * 
         * *   **1** (default): You can create a [standard instance](~~52228~~) that contains only a single data node.
         * *   **2** to **32**: You can create a [cluster instance](~~52228~~) that contains the specified number of data nodes.
         * 
         * >  When the **InstanceType** parameter is set to **tair_rdb** or **tair_scm**, this parameter can be set to **2** to **32**. Only DRAM-based and persistent memory-optimized instances support the cluster architecture.
         */
        public Builder shardCount(Integer shardCount) {
            this.putQueryParameter("ShardCount", shardCount);
            this.shardCount = shardCount;
            return this;
        }

        /**
         * The data shard type of the instance. Default value: MASTER_SLAVE. Valid values:
         * <p>
         * 
         * *   **MASTER_SLAVE**: runs in a master-replica architecture that provides high availability.
         * *   **STAND_ALONE**: runs in a standalone architecture. If the only node fails, the system creates a new instance and switches the workloads to the new instance. This may cause data loss. You can set this parameter to this value only if the instance uses the **single-zone** deployment type. If you set this parameter to this value, you cannot create cluster or read/write splitting instances.
         */
        public Builder shardType(String shardType) {
            this.putQueryParameter("ShardType", shardType);
            this.shardType = shardType;
            return this;
        }

        /**
         * The number of read replicas in the secondary zone when you create a multi-zone read/write splitting instance. The sum of the values of this parameter and ReadOnlyCount cannot be greater than 9.
         * <p>
         * 
         * > When you create a multi-zone read/write splitting instance, you must specify both SlaveReadOnlyCount and SecondaryZoneId.
         */
        public Builder slaveReadOnlyCount(Integer slaveReadOnlyCount) {
            this.putQueryParameter("SlaveReadOnlyCount", slaveReadOnlyCount);
            this.slaveReadOnlyCount = slaveReadOnlyCount;
            return this;
        }

        /**
         * If you want to create an instance based on the backup set of an existing instance, set this parameter to the ID of the source instance.
         * <p>
         * 
         * >  Then, you can use the **BackupId**, **ClusterBackupId**, or **RestoreTime** parameter to specify the backup set that you want to use or the point in time. This parameter must be used in combination with one of the preceding three parameters.
         */
        public Builder srcDBInstanceId(String srcDBInstanceId) {
            this.putQueryParameter("SrcDBInstanceId", srcDBInstanceId);
            this.srcDBInstanceId = srcDBInstanceId;
            return this;
        }

        /**
         * The storage space of cloud disks. Valid values vary based on the instance specifications. For more information, see [ESSD-based instances](~~443846~~).
         * <p>
         * 
         * > This parameter is available and required only if the **InstanceType** parameter is set to **tair_essd**.
         */
        public Builder storage(Integer storage) {
            this.putQueryParameter("Storage", storage);
            this.storage = storage;
            return this;
        }

        /**
         * The storage type of the instance. Set the value to **essd_pl1**.
         * <p>
         * 
         * > This parameter is available only if the **InstanceType** parameter is set to **tair_essd**.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * The tags to add to the instance.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the vSwitch that belongs to the VPC. You can call the [DescribeVpcs](~~35739~~) operation to query the ID of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC). You can call the [DescribeVpcs](~~35739~~) operation to query the ID of the VPC.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The primary zone ID of the instance. You can call the [DescribeRegions](~~61012~~) operation to query the IDs of available zones.
         * <p>
         * 
         * >  You can also set the SecondaryZoneId parameter to specify the secondary zone. The primary and secondary nodes will then be deployed in the specified primary and secondary zones to implement the master-replica zone-disaster recovery architecture. For example, you can set the ZoneId parameter to cn-hangzhou-h and the SecondaryZoneId parameter to cn-hangzhou-g.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateTairInstanceRequest build() {
            return new CreateTairInstanceRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag. A tag is a key-value pair.
             * <p>
             * 
             * > A maximum of five key-value pairs can be specified at a time.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             * <p>
             * 
             * > **N** specifies the serial number of the tag. For example, **Tag.1.Value** specifies the value of the first tag, and **Tag.2.Value** specifies the value of the second tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
