// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
    @com.aliyun.core.annotation.NameInMap("ConnectionStringPrefix")
    private String connectionStringPrefix;

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
    @com.aliyun.core.annotation.NameInMap("ReplicaCount")
    private Integer replicaCount;

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
    @com.aliyun.core.annotation.NameInMap("SlaveReplicaCount")
    private Integer slaveReplicaCount;

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
    private java.util.List<Tag> tag;

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
        this.connectionStringPrefix = builder.connectionStringPrefix;
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
        this.replicaCount = builder.replicaCount;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.secondaryZoneId = builder.secondaryZoneId;
        this.securityToken = builder.securityToken;
        this.shardCount = builder.shardCount;
        this.shardType = builder.shardType;
        this.slaveReadOnlyCount = builder.slaveReadOnlyCount;
        this.slaveReplicaCount = builder.slaveReplicaCount;
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
     * @return connectionStringPrefix
     */
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
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
     * @return replicaCount
     */
    public Integer getReplicaCount() {
        return this.replicaCount;
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
     * @return slaveReplicaCount
     */
    public Integer getSlaveReplicaCount() {
        return this.slaveReplicaCount;
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
    public java.util.List<Tag> getTag() {
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
        private String connectionStringPrefix; 
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
        private Integer replicaCount; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String secondaryZoneId; 
        private String securityToken; 
        private Integer shardCount; 
        private String shardType; 
        private Integer slaveReadOnlyCount; 
        private Integer slaveReplicaCount; 
        private String srcDBInstanceId; 
        private Integer storage; 
        private String storageType; 
        private java.util.List<Tag> tag; 
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
            this.connectionStringPrefix = request.connectionStringPrefix;
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
            this.replicaCount = request.replicaCount;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.secondaryZoneId = request.secondaryZoneId;
            this.securityToken = request.securityToken;
            this.shardCount = request.shardCount;
            this.shardType = request.shardType;
            this.slaveReadOnlyCount = request.slaveReadOnlyCount;
            this.slaveReplicaCount = request.slaveReplicaCount;
            this.srcDBInstanceId = request.srcDBInstanceId;
            this.storage = request.storage;
            this.storageType = request.storageType;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether to enable automatic payment. Set the value to <strong>true</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables auto-renewal.</li>
         * <li><strong>false</strong> (default): disables auto-renewal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The subscription duration that is supported by auto-renewal. Unit: month. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>6</strong>, and <strong>12</strong>.</p>
         * <blockquote>
         * <p> This parameter is required if the <strong>AutoRenew</strong> parameter is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder autoRenewPeriod(String autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>Specifies whether to use a coupon. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: uses a coupon.</li>
         * <li><strong>false</strong> (default): does not use a coupon.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoUseCoupon(String autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>You can set the BackupId parameter to the backup set ID of the source instance. The system uses the data stored in the backup set to create an instance. You can call the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> operation to query the backup set ID. If the source instance is a cluster instance, set the BackupId parameter to the backup set IDs of all shards of the source instance, separated by commas (,). Example: &quot;10**,11**,15**&quot;.</p>
         * <blockquote>
         * <p> If your instance is a cloud-native cluster instance, we recommend that you use <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> to query the backup set ID of the cluster instance, such as cb-xx. Then, set the ClusterBackupId request parameter to the backup set ID to clone the cluster instance. This eliminates the need to specify the backup set ID of each shard.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>11111111</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The ID of the promotional event or the business information.</p>
         * 
         * <strong>example:</strong>
         * <p>000000000</p>
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong> (default): subscription</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests and is case-sensitive. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is supported for specific new cluster instances. You can query the backup set ID by calling the <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> operation.</p>
         * <ul>
         * <li>If this parameter is supported, you can specify the backup set ID. In this case, you do not need to specify the <strong>BackupId</strong> parameter.</li>
         * <li>If this parameter is not supported, set the BackupId parameter to the IDs of backup sets in all shards of the source instance, separated by commas (,). Example: &quot;2158****20,2158****22&quot;.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cb-hyxdof5x9kqb****</p>
         */
        public Builder clusterBackupId(String clusterBackupId) {
            this.putQueryParameter("ClusterBackupId", clusterBackupId);
            this.clusterBackupId = clusterBackupId;
            return this;
        }

        /**
         * <p>The prefix of the endpoint. The prefix must be 8 to 40 characters in length and can contain lowercase letters and digits. It must start with a lowercase letter.</p>
         * <blockquote>
         * <p> The endpoint must be in the &lt;prefix&gt;.redis.rds.aliyuncs.com format.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run and does not create the instance. The system prechecks the request parameters, request format, service limits, and available resources. If the request fails the dry run, an error code is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (false): performs a dry run and performs the actual request. If the request passes the dry run, the instance is directly created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The database engine version. Default value: <strong>1.0</strong>. The parameter value varies based on the Tair instance series.</p>
         * <ul>
         * <li>To create a Tair DRAM-based instance (Tair_rdb) that is compatible with Redis 5.0, 6.0, or 7.0, set this parameter to <strong>5.0</strong>, <strong>6.0</strong>, or <strong>7.0</strong>.</li>
         * <li>To create a Tair persistent memory-optimized instance (tair_scm) that is compatible with Redis 6.0, set this parameter to <strong>1.0</strong>.</li>
         * <li>To create a Tair ESSD-based instance (tair_essd) that is compatible with Redis 6.0, set this parameter to <strong>1.0</strong>. To create a Tair SSD-based instance that is compatible with Redis 6.0, set this parameter to <strong>2.0</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>Specifies whether to use the created instance as a child instance of a distributed instance.</p>
         * <ul>
         * <li>If you want the created instance to be used as the first child instance, enter <strong>true</strong>.</li>
         * <li>If you want the created instance to be used as the second or third child instance, enter the ID of the distributed instance, such as gr-bp14rkqrhac****.</li>
         * <li>If you do not want the created instance to be used as a distributed instance, leave the parameter empty.</li>
         * </ul>
         * <blockquote>
         * <p> If you want the created instance to be used as a distributed instance, the created instance must be a Tair DRAM-based instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gr-bp14rkqrhac****</p>
         */
        public Builder globalInstanceId(String globalInstanceId) {
            this.putQueryParameter("GlobalInstanceId", globalInstanceId);
            this.globalInstanceId = globalInstanceId;
            return this;
        }

        /**
         * <p>The global IP whitelist templates of the instance. Separate multiple IP whitelist templates with commas (,). Each IP whitelist template must be unique.</p>
         * 
         * <strong>example:</strong>
         * <p>g-zsldxfiwjmti0kcm****</p>
         */
        public Builder globalSecurityGroupIds(String globalSecurityGroupIds) {
            this.putQueryParameter("GlobalSecurityGroupIds", globalSecurityGroupIds);
            this.globalSecurityGroupIds = globalSecurityGroupIds;
            return this;
        }

        /**
         * <p>The instance series. For more information, see the following topics:</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/2527112.html">DRAM-based instances</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/2527110.html">Persistent memory-optimized instances</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/2527111.html">ESSD/SSD-based instances</a></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tair.scm.standard.4m.32d</p>
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * <p>The name of the instance. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 2 to 80 characters in length.</li>
         * <li>The name must start with a letter and cannot contain spaces or special characters. Special characters include <code>@ / : = &quot; &lt; &gt; { [ ] }</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>apitest</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The instance series. Valid values:</p>
         * <ul>
         * <li><strong>tair_rdb</strong>: Tair DRAM-based instance</li>
         * <li><strong>tair_scm</strong>: Tair persistent memory-optimized instance</li>
         * <li><strong>tair_essd</strong>: Tair ESSD/SSD-based instance</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tair_scm</p>
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
         * <p>The ID of the parameter template. The instance is created based on the parameters in the parameter template. The ID must be unique.</p>
         * 
         * <strong>example:</strong>
         * <p>g-50npzjcqb1ua6q6j****</p>
         */
        public Builder paramGroupId(String paramGroupId) {
            this.putQueryParameter("ParamGroupId", paramGroupId);
            this.paramGroupId = paramGroupId;
            return this;
        }

        /**
         * <p>The password that is used to connect to the instance. The password must meet the following requirements:</p>
         * <ul>
         * <li>The password must be 8 to 32 characters in length.</li>
         * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include <code>! @ # $ % ^ &amp; * ( ) _ + - =</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pass!123456</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The subscription duration. Valid values: <strong>1</strong>, 2, 3, 4, 5, 6, 7, 8, <strong>9</strong>, <strong>12</strong>, <strong>24</strong>,<strong>36</strong>, and <strong>60</strong>. Unit: month.</p>
         * <blockquote>
         * <p> This parameter is required only if the <strong>ChargeType</strong> parameter is set to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The service port number of the instance. Valid values: 1024 to 65535. Default value: 6379.</p>
         * 
         * <strong>example:</strong>
         * <p>6379</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The internal IP address of the instance.</p>
         * <blockquote>
         * <p> The IP address must be within the CIDR block of the vSwitch to which you want the instance to connect. You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation of VPC to query the CIDR block information.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The number of read replicas in the primary zone. This parameter applies only to cloud-native read/write splitting instances. Valid values: 1 to 9.</p>
         * <blockquote>
         * <p> The sum of the values of this parameter and the SlaveReadOnlyCount parameter cannot exceed 9.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder readOnlyCount(Integer readOnlyCount) {
            this.putQueryParameter("ReadOnlyCount", readOnlyCount);
            this.readOnlyCount = readOnlyCount;
            return this;
        }

        /**
         * <p>Specifies whether to restore the account, kernel parameter, and whitelist information from the original backup set when you create an instance from the specified backup set. For example, if you want to restore the account information, set the parameter to <code>{&quot;account&quot;:true}</code>.</p>
         * <p>This parameter is empty by default, which indicates that the account, kernel parameter, and whitelist information is not restored from the original backup set.</p>
         * <blockquote>
         * <p> This parameter applies only to cloud-native cluster instances. The account, kernel parameter, and whitelist information must be stored in the original backup set. You can call the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> operation to check whether the RecoverConfigMode configurations in the specified backup set contain the preceding information.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;whitelist&quot;:true,&quot;config&quot;:true,&quot;account&quot;:true}</p>
         */
        public Builder recoverConfigMode(String recoverConfigMode) {
            this.putQueryParameter("RecoverConfigMode", recoverConfigMode);
            this.recoverConfigMode = recoverConfigMode;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of replica nodes in the primary zone. This parameter applies only to cloud-native multi-replica cluster instances. Valid values: 1 to 4.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The sum of the values of this parameter and the SlaveReplicaCount parameter cannot exceed 4.</p>
         * </li>
         * <li><p>You can specify only one of the ReplicaCount and ReadOnlyCount parameters.</p>
         * </li>
         * <li><p>Master-replica instances do not support multiple replicas.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder replicaCount(Integer replicaCount) {
            this.putQueryParameter("ReplicaCount", replicaCount);
            this.replicaCount = replicaCount;
            return this;
        }

        /**
         * <p>The ID of the resource group that you want to manage.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can query resource group IDs in the console or by calling the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information about a resource group</a>.</p>
         * </li>
         * <li><p>Before you modify the resource group to which an instance belongs, you can call the <a href="https://help.aliyun.com/document_detail/158866.html">ListResources</a> operation to view the current resource group of the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyiu4ekp****</p>
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
         * <p>If data flashback is enabled for the source instance, you can use this parameter to specify a point in time within the backup retention period of the source instance. The system uses the backup data of the source instance at the point in time to create an instance. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-06T07:25:57Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>The ID of the secondary zone. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query the ID of the secondary zone.</p>
         * <blockquote>
         * <p> You cannot specify multiple zone IDs or set this parameter to a value that is the same as that of the ZoneId parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
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
         * <p>The number of data nodes in the instance. Valid values:</p>
         * <ul>
         * <li><strong>1</strong> (default): You can create a <a href="https://help.aliyun.com/document_detail/52228.html">standard instance</a> that contains only one data node.</li>
         * <li><strong>2</strong> to <strong>32</strong>: You can create a <a href="https://help.aliyun.com/document_detail/52228.html">cluster instance</a> that contains the specified number of data nodes.</li>
         * </ul>
         * <blockquote>
         * <p> When the <strong>InstanceType</strong> parameter is set to <strong>tair_rdb</strong> or <strong>tair_scm</strong>, this parameter can be set to a value in the range of <strong>2</strong> to <strong>32</strong>. Only DRAM-based and persistent memory-optimized instances support the cluster architecture.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder shardCount(Integer shardCount) {
            this.putQueryParameter("ShardCount", shardCount);
            this.shardCount = shardCount;
            return this;
        }

        /**
         * <p>The shard type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>MASTER_SLAVE</strong> (default): runs in a master-replica architecture that provides high availability.</li>
         * <li><strong>STAND_ALONE</strong>: runs in a standalone architecture. If the only node fails, the system creates a new instance and switches the workloads to the new instance. This may cause data loss. You can set the ShardType parameter to this value only if the instance uses the <strong>single-zone</strong> deployment mode. If you set the ShardType parameter to this value, you cannot create cluster or read/write splitting instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MASTER_SLAVE</p>
         */
        public Builder shardType(String shardType) {
            this.putQueryParameter("ShardType", shardType);
            this.shardType = shardType;
            return this;
        }

        /**
         * <p>The number of read replicas in the secondary zone when you create a multi-zone read/write splitting instance. The sum of the values of this parameter and the ReadOnlyCount parameter cannot exceed 9.</p>
         * <blockquote>
         * <p>When you create a multi-zone read/write splitting instance, you must specify both SlaveReadOnlyCount and SecondaryZoneId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder slaveReadOnlyCount(Integer slaveReadOnlyCount) {
            this.putQueryParameter("SlaveReadOnlyCount", slaveReadOnlyCount);
            this.slaveReadOnlyCount = slaveReadOnlyCount;
            return this;
        }

        /**
         * <p>The number of replica nodes in the secondary zone when you create a cloud-native multi-replica cluster instance deployed across multiple zones. The sum of the values of this parameter and the ReplicaCount parameter cannot exceed 4.</p>
         * <blockquote>
         * <p> When you create a cloud-native multi-replica cluster instance deployed across multiple zones, you must specify both SlaveReplicaCount and SecondaryZoneId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder slaveReplicaCount(Integer slaveReplicaCount) {
            this.putQueryParameter("SlaveReplicaCount", slaveReplicaCount);
            this.slaveReplicaCount = slaveReplicaCount;
            return this;
        }

        /**
         * <p>If you want to create an instance based on the backup set of an existing instance, set this parameter to the ID of the source instance.</p>
         * <blockquote>
         * <p> After you specify the SrcDBInstanceId parameter, use the <strong>BackupId</strong>, <strong>ClusterBackupId</strong> (recommended for cloud-native cluster instances), or <strong>RestoreTime</strong> parameter to specify the backup set or the specific point in time that you want to use to create an instance. The SrcDBInstanceId parameter must be used in combination with one of the preceding three parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder srcDBInstanceId(String srcDBInstanceId) {
            this.putQueryParameter("SrcDBInstanceId", srcDBInstanceId);
            this.srcDBInstanceId = srcDBInstanceId;
            return this;
        }

        /**
         * <p>The storage capacity of the ESSD/SSD-based instance. The valid values vary based on the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/2527111.html">ESSD/SSD-based instances</a>.</p>
         * <blockquote>
         * <p> This parameter is required only when you set the <strong>InstanceType</strong> parameter to <strong>tair_essd</strong> to create an ESSD-based instance. If you create a Tair <strong>SSD</strong>-based instance, the Storage parameter is automatically specified based on predefined specifications. You do not need to specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder storage(Integer storage) {
            this.putQueryParameter("Storage", storage);
            this.storage = storage;
            return this;
        }

        /**
         * <p>The storage type. Valid values: <strong>essd_pl1</strong>, <strong>essd_pl2</strong>, and <strong>essd_pl3</strong>.</p>
         * <blockquote>
         * <p> This parameter is required only when you set the <strong>InstanceType</strong> parameter to <strong>tair_essd</strong> to create an ESSD-based instance.</p>
         * </blockquote>
         * <p>Enumerated values:</p>
         * <ul>
         * <li>essd_pl0</li>
         * <li>essd_pl1</li>
         * <li>essd_pl2</li>
         * <li>essd_pl3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>essd_pl1</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>Details of the tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the vSwitch that belongs to the VPC. You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query vSwitch IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1e7clcw529l773d****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC. You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query VPC IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1nme44gek34slfc****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the primary zone. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query the most recent zone list.</p>
         * <blockquote>
         * <p> You can also set the SecondaryZoneId parameter to specify the secondary zone. The primary and secondary nodes will then be deployed in the specified primary and secondary zones to implement the master-replica zone-disaster recovery architecture. For example, you can set the ZoneId parameter to cn-hangzhou-h and the SecondaryZoneId parameter to cn-hangzhou-g.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
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

    /**
     * 
     * {@link CreateTairInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateTairInstanceRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. A tag is a key-value pair.</p>
             * <blockquote>
             * <p> A maximum of five key-value pairs can be specified at a time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>key1_test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * <blockquote>
             * <p> <strong>N</strong> specifies the value of the nth tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag, and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>value1_test</p>
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
