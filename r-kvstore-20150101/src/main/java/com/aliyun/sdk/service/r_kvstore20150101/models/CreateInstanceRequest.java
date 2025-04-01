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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Appendonly")
    private String appendonly;

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
    @com.aliyun.core.annotation.NameInMap("Capacity")
    private Long capacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

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
    @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalInstance")
    private Boolean globalInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalInstanceId")
    private String globalInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalSecurityGroupIds")
    private String globalSecurityGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    private String instanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

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
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(maxLength = 5, minLength = 1)
    private String port;

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
    @com.aliyun.core.annotation.Validation(maximum = 128, minimum = 1)
    private Integer shardCount;

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
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.appendonly = builder.appendonly;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.backupId = builder.backupId;
        this.businessInfo = builder.businessInfo;
        this.capacity = builder.capacity;
        this.chargeType = builder.chargeType;
        this.clusterBackupId = builder.clusterBackupId;
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.couponNo = builder.couponNo;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.dryRun = builder.dryRun;
        this.engineVersion = builder.engineVersion;
        this.globalInstance = builder.globalInstance;
        this.globalInstanceId = builder.globalInstanceId;
        this.globalSecurityGroupIds = builder.globalSecurityGroupIds;
        this.instanceClass = builder.instanceClass;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.networkType = builder.networkType;
        this.nodeType = builder.nodeType;
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
        this.slaveReadOnlyCount = builder.slaveReadOnlyCount;
        this.slaveReplicaCount = builder.slaveReplicaCount;
        this.srcDBInstanceId = builder.srcDBInstanceId;
        this.tag = builder.tag;
        this.token = builder.token;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appendonly
     */
    public String getAppendonly() {
        return this.appendonly;
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
     * @return capacity
     */
    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
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
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
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
     * @return globalInstance
     */
    public Boolean getGlobalInstance() {
        return this.globalInstance;
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
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
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

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String appendonly; 
        private String autoRenew; 
        private String autoRenewPeriod; 
        private String autoUseCoupon; 
        private String backupId; 
        private String businessInfo; 
        private Long capacity; 
        private String chargeType; 
        private String clusterBackupId; 
        private String connectionStringPrefix; 
        private String couponNo; 
        private String dedicatedHostGroupId; 
        private Boolean dryRun; 
        private String engineVersion; 
        private Boolean globalInstance; 
        private String globalInstanceId; 
        private String globalSecurityGroupIds; 
        private String instanceClass; 
        private String instanceName; 
        private String instanceType; 
        private String networkType; 
        private String nodeType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String paramGroupId; 
        private String password; 
        private String period; 
        private String port; 
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
        private Integer slaveReadOnlyCount; 
        private Integer slaveReplicaCount; 
        private String srcDBInstanceId; 
        private java.util.List<Tag> tag; 
        private String token; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.appendonly = request.appendonly;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.autoUseCoupon = request.autoUseCoupon;
            this.backupId = request.backupId;
            this.businessInfo = request.businessInfo;
            this.capacity = request.capacity;
            this.chargeType = request.chargeType;
            this.clusterBackupId = request.clusterBackupId;
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.couponNo = request.couponNo;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.dryRun = request.dryRun;
            this.engineVersion = request.engineVersion;
            this.globalInstance = request.globalInstance;
            this.globalInstanceId = request.globalInstanceId;
            this.globalSecurityGroupIds = request.globalSecurityGroupIds;
            this.instanceClass = request.instanceClass;
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.networkType = request.networkType;
            this.nodeType = request.nodeType;
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
            this.slaveReadOnlyCount = request.slaveReadOnlyCount;
            this.slaveReplicaCount = request.slaveReplicaCount;
            this.srcDBInstanceId = request.srcDBInstanceId;
            this.tag = request.tag;
            this.token = request.token;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether to enable append-only file (AOF) persistence for the instance. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong> (default): enables AOF persistence.</li>
         * <li><strong>no</strong>: disables AOF persistence.</li>
         * </ul>
         * <p>**</p>
         * <p><strong>Description</strong> This parameter is applicable to classic instances, and is unavailable for cloud-native instances.</p>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        public Builder appendonly(String appendonly) {
            this.putQueryParameter("Appendonly", appendonly);
            this.appendonly = appendonly;
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
         * <p>false</p>
         */
        public Builder autoUseCoupon(String autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>If your instance is a cloud-native cluster instance, we recommend that you use <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> to query the backup set ID of the cluster instance, such as cb-xx. Then, set the ClusterBackupId request parameter to the backup set ID to clone the cluster instance. This eliminates the need to specify the backup set ID of each shard.</p>
         * <p>You can set the BackupId parameter to the backup set ID of the source instance. The system uses the data stored in the backup set to create an instance. You can call the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> operation to query backup set IDs. If the source instance is a cluster instance, set the BackupId parameter to the backup set IDs of all shards of the source instance, separated by commas (,). Example: &quot;10**,11**,15**&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The ID of the promotional event or business information.</p>
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
         * <p>The storage capacity of the instance. Unit: MB.</p>
         * <blockquote>
         * <p>You must specify at least one of the <strong>Capacity</strong> and <strong>InstanceClass</strong> parameters when you call this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        public Builder capacity(Long capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription</li>
         * <li><strong>PostPaid</strong> (default): pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>This parameter is supported for specific new cluster instances. You can query the backup set ID by using the <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> operation.</p>
         * <ul>
         * <li>If this parameter is supported, you can specify the backup set ID. In this case, you do not need to specify the <strong>BackupId</strong> parameter.</li>
         * <li>If this parameter is not supported, set the BackupId parameter to the IDs of backup sets for all shards of the source instance, separated by commas (,). Example: &quot;2158****20,2158****22&quot;.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cb-hyxdof5x9kqbtust</p>
         */
        public Builder clusterBackupId(String clusterBackupId) {
            this.putQueryParameter("ClusterBackupId", clusterBackupId);
            this.clusterBackupId = clusterBackupId;
            return this;
        }

        /**
         * <p>The operation that you want to perform. Set the value to <strong>AllocateInstancePublicConnection</strong>.</p>
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
         * <p>The coupon code. Default value: <code>default</code>.</p>
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
         * <p>The ID of the dedicated cluster. This parameter is required if you create an instance in a dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-uv4fnk6r7zff****</p>
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run and does not create the instance. The system prechecks the request parameters, request format, service limits, and available resources. If the request fails the dry run, an error code is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong>: performs a dry run and sends the request. If the request passes the dry run, the instance is created.</li>
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
         * <p>The engine version. Valid values for <strong>classic instances</strong>:</p>
         * <ul>
         * <li><strong>2.8</strong> (not recommended due to <a href="https://help.aliyun.com/document_detail/2674657.html">scheduled EOFS</a>)</li>
         * <li><strong>4.0</strong> (not recommended)</li>
         * <li><strong>5.0</strong></li>
         * </ul>
         * <p>Valid values for <strong>cloud-native instances</strong>:</p>
         * <ul>
         * <li><strong>5.0</strong></li>
         * <li><strong>6.0</strong> (recommended)</li>
         * <li><strong>7.0</strong></li>
         * </ul>
         * <blockquote>
         * <p> The default value is <strong>5.0</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>Specifies whether to use the new instance as the first child instance of a distributed instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: uses the new instance as the first child instance.</li>
         * <li><strong>false</strong> (default): does not use the new instance as the first child instance.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you want to create a Tair DRAM-based instance that runs Redis 5.0, you must set this parameter to <strong>true</strong>.</li>
         * <li>This parameter is available only on the China site (aliyun.com).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder globalInstance(Boolean globalInstance) {
            this.putQueryParameter("GlobalInstance", globalInstance);
            this.globalInstance = globalInstance;
            return this;
        }

        /**
         * <p>The ID of the distributed instance. This parameter is available only on the China site (aliyun.com).</p>
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
         * <p>The global IP whitelist template for the instance. Multiple IP whitelist templates should be separated by English commas (,) and cannot be duplicated.</p>
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
         * <p>The instance type. For example, redis.master.small.default indicates a Community Edition standard master-replica instance that has 1 GB of memory. For more information, see <a href="https://help.aliyun.com/document_detail/26350.html">Overview</a>.</p>
         * <p>**</p>
         * <p><strong>Description</strong> You must specify at least one of the <strong>Capacity</strong> and <strong>InstanceClass</strong> parameters when you call the CreateInstance operation.</p>
         * 
         * <strong>example:</strong>
         * <p>redis.master.small.default</p>
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * <p>The name of the instance. The name must be 2 to 80 characters in length and must start with a letter. It cannot contain spaces or specific special characters. These special characters include <code>@ / : = &quot; &lt; &gt; { [ ] }</code></p>
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
         * <p>The database engine of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Redis</strong> (default)</li>
         * <li><strong>Memcache</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Redis</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>MASTER_SLAVE</strong>: high availability (master-replica)</li>
         * <li><strong>STAND_ALONE</strong>: standalone</li>
         * <li><strong>double</strong>: master-replica</li>
         * <li><strong>single</strong>: standalone</li>
         * </ul>
         * <blockquote>
         * <p> To create a cloud-native instance, set this parameter to <strong>MASTER_SLAVE</strong> or <strong>STAND_ALONE</strong>. To create a classic instance, set this parameter to <strong>double</strong> or <strong>single</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>STAND_ALONE</p>
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
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
         * <p>The parameter template ID, which must be globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>rpg-test**</p>
         */
        public Builder paramGroupId(String paramGroupId) {
            this.putQueryParameter("ParamGroupId", paramGroupId);
            this.paramGroupId = paramGroupId;
            return this;
        }

        /**
         * <p>The password that is used to connect to the instance. The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and specific special characters. These special characters include <code>! @ # $ % ^ &amp; * ( ) _ + - =</code></p>
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
         * <p>The subscription duration. Valid values: <strong>1</strong>, 2, 3, 4, 5, 6, 7, 8, <strong>9</strong>, <strong>12</strong>, <strong>24</strong>,<strong>36</strong>, and <strong>60</strong>. Unit: months.</p>
         * <blockquote>
         * <p>This parameter is available and required only if the <strong>ChargeType</strong> parameter is set to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The port number that is used to connect to the instance. Valid values: <strong>1024</strong> to <strong>65535</strong>. Default value: <strong>6379</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>6379</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The private IP address of the instance.</p>
         * <blockquote>
         * <p>The private IP address must be available within the CIDR block of the vSwitch to which to connect the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.***</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The number of read replicas in the primary zone. This parameter applies only to read/write splitting instances that use cloud disks. You can use this parameter to customize the number of read replicas. Valid values: 1 to 9.</p>
         * <blockquote>
         * <p> The sum of the values of this parameter and SlaveReadOnlyCount cannot be greater than 9.</p>
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
         * <p>When creating an instance using a specified backup set, whether to restore account, kernel parameter (whitelist), and whitelist (config) information from the original backup set. For example, if you need to restore account information, the value should be <code>{&quot;account&quot;:true}</code>.
         * By default, it is empty, indicating that no account, kernel parameter, or whitelist information will be restored from the original backup set. </p>
         * <blockquote>
         * <p>This parameter applies only to cloud-native instances and requires that the original backup set has saved the account, kernel parameter, and whitelist information. You can use the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> API to check if the RecoverConfigMode parameter in the specified backup set contains the above information.</p>
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
         * <p>The ID of the region where you want to create the instance. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The number of slave replicas in the primary availability zone. This parameter is applicable only for creating cloud-native cluster edition multi-replica instances, allowing you to customize the number of slave replicas. The value range is 1 to 4.</p>
         * <blockquote>
         * <blockquote>
         * <ul>
         * <li>The sum of this parameter and SlaveReplicaCount cannot exceed 4. </li>
         * <li>Only one of this parameter and ReadOnlyCount can be passed; there are no instances that simultaneously include both replicas and read-only nodes. </li>
         * <li>Primary-secondary instances do not support multiple replicas.</li>
         * </ul>
         * </blockquote>
         * </blockquote>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-resourcegroupid1</p>
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
         * <p>2019-06-19T16:00:00Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>The secondary zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/473764.html">DescribeZones</a> operation to query the most recent zone list.</p>
         * <blockquote>
         * <p>If you specify this parameter, the master node and replica node of the instance can be deployed in different zones and disaster recovery is implemented across zones. The instance can withstand failures in data centers.</p>
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
         * <p>系统自动生成的安全 Token，无需传入</p>
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The number of shards. This parameter is applicable only to cloud-native cluster instances. You can use this parameter to customize the number of shards.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder shardCount(Integer shardCount) {
            this.putQueryParameter("ShardCount", shardCount);
            this.shardCount = shardCount;
            return this;
        }

        /**
         * <p>The number of read replicas in the secondary zone. This parameter is used to create a read/write splitting instance that is deployed across multiple zones. The sum of the values of this parameter and ReadOnlyCount cannot be greater than 9.</p>
         * <blockquote>
         * <p>When you create a multi-zone read/write splitting instance, you must specify both SlaveReadOnlyCount and SecondaryZoneId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder slaveReadOnlyCount(Integer slaveReadOnlyCount) {
            this.putQueryParameter("SlaveReadOnlyCount", slaveReadOnlyCount);
            this.slaveReadOnlyCount = slaveReadOnlyCount;
            return this;
        }

        /**
         * <p>Used for specifying the number of slave replicas in the secondary availability zone when creating a multi-AZ cloud-native cluster edition with multiple replicas. The sum of this parameter and ReplicaCount cannot exceed 4. <notice>When creating a multi-AZ cloud-native cluster edition with multiple replicas, both SlaveReplicaCount and SecondaryZoneId parameters must be specified.</notice></p>
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
         * <p>The tags of the instance.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the token is unique among different requests. The token is case-sensitive. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which you want the instance to connect.</p>
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
         * <p>The ID of the virtual private cloud (VPC).</p>
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
         * <p>The primary zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query the most recent zone list.</p>
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
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
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
             * <p>The keys of the tags that are added to the instance.</p>
             * <blockquote>
             * <ul>
             * <li><strong>N</strong> specifies the serial number of the tag. Up to 20 tags can be added to a single instance. For example, Tag.1.Key specifies the key of the first tag and Tag.2.Key specifies the key of the second tag.</li>
             * <li>If the key of the tag does not exist, the tag is automatically created.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testkey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The values of the tags that are added to the instance.</p>
             * <blockquote>
             * <p><strong>N</strong> specifies the serial number of the tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testvalue</p>
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
