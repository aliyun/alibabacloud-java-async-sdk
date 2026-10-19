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
    @com.aliyun.core.annotation.NameInMap("InstanceEndpointType")
    private String instanceEndpointType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
    private String maintainEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
    private String maintainStartTime;

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
    @com.aliyun.core.annotation.Validation(maximum = 5)
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
        this.instanceEndpointType = builder.instanceEndpointType;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
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
     * @return instanceEndpointType
     */
    public String getInstanceEndpointType() {
        return this.instanceEndpointType;
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
     * @return maintainEndTime
     */
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    /**
     * @return maintainStartTime
     */
    public String getMaintainStartTime() {
        return this.maintainStartTime;
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
        private String instanceEndpointType; 
        private String instanceName; 
        private String instanceType; 
        private String maintainEndTime; 
        private String maintainStartTime; 
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
            this.instanceEndpointType = request.instanceEndpointType;
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.maintainEndTime = request.maintainEndTime;
            this.maintainStartTime = request.maintainStartTime;
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
         * <p>The AOF parameter settings of the new instance. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong> (default): enables AOF persistence.</li>
         * <li><strong>no</strong>: shutdown AOF persistence.<blockquote>
         * <p>This parameter applies to classic instances. Cloud-native instances do not support specifying the AOF parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
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
         * <p>The auto-renewal epoch. Unit: months. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>6</strong>, and <strong>12</strong>.</p>
         * <blockquote>
         * <p>This parameter is required when the AutoRenew parameter is set to <strong>true</strong>.</p>
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
         * <p>Specifies whether to use a voucher. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: uses a voucher.</li>
         * <li><strong>false</strong> (default): does not use a voucher.</li>
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
         * <p>You can specify the backup set ID of the source instance in this parameter. The system uses the data saved in the backup set to create the new instance. You can call the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> operation to query the BackupId. If the source instance is a cluster instance, you must enter the backup set IDs of all shards in the source instance and separate them with commas, such as &quot;10**,11**,15**&quot;.</p>
         * <blockquote>
         * <p>If your instance is a cloud-native architecture instance and a cluster instance, we recommend that you call the <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> operation to query the cluster backup set ID, such as &quot;cb-xx&quot;, and then enter it in the ClusterBackupId request parameter to clone the cluster instance. This saves you the trouble of entering the backup set ID of each shard.</p>
         * </blockquote>
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
         * <p>When you call this operation, you must specify at least one of the Capacity and InstanceClass parameters.</p>
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
         * <li><strong>PrePaid</strong>: subscription.</li>
         * <li><strong>PostPaid</strong> (default): pay-as-you-go.</li>
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
         * <p>The ID of the cluster backup set. Some new cluster architectures support cluster backup set IDs. You can call the <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> operation to obtain the ID.</p>
         * <ul>
         * <li>If the architecture supports cluster backup sets, you can enter the specified cluster backup set ID without specifying the BackupId parameter.</li>
         * <li>If the architecture does not support cluster backup sets, specify the backup set IDs of all shards in the source instance in the BackupId parameter and separate them with commas, such as &quot;2158\<em>\</em>\<em>\<em>20,2158\</em>\</em>\*\*22&quot;.</li>
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
         * <p>The endpoint format is: <Prefix>.redis.rds.aliyuncs.com.</p>
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
         * <p>The ID of the dedicated cluster. This parameter is required when you create an ApsaraDB for Redis instance in a dedicated cluster.</p>
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
         * <p>Specifies whether to perform a dry run on the instance creation request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run without creating the instance. The system checks the request parameters, request format, service limits, and available resources. If the request fails the dry run, the system returns an error. If the request passes the dry run, the system returns the DryRunOperation error code.</li>
         * <li><strong>false</strong> (default): sends the normal request and creates the instance after the request passes the check.</li>
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
         * <p>The engine version of the Redis <strong>classic instance</strong>. Valid values:</p>
         * <ul>
         * <li><strong>2.8</strong> (Not recommended. <a href="https://help.aliyun.com/document_detail/2674657.html">End-of-life is planned</a>.)</li>
         * <li><strong>4.0</strong> (Not recommended)</li>
         * <li><strong>5.0</strong></li>
         * </ul>
         * <p>The engine version of the Redis <strong>cloud-native instance</strong>. Valid values:</p>
         * <ul>
         * <li><strong>5.0</strong></li>
         * <li><strong>6.0</strong> (Recommended)</li>
         * <li><strong>7.0</strong></li>
         * </ul>
         * <blockquote>
         * <p>Default value: <strong>5.0</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>Specifies whether to use the new instance as the first child instance of a distributed instance. You can create a distributed instance in this way. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: uses the new instance as the first child instance.</li>
         * <li><strong>false</strong> (default): does not use the new instance as the first child instance.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you set this parameter to <strong>true</strong>, the new instance must be a Tair memory-optimized instance and the DPI engine version must be 5.0.</li>
         * <li>This parameter applies only to the China site.</li>
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
         * <p>The distributed instance ID. This parameter applies only to the China site.</p>
         * <p>&lt;props=&quot;china&quot;&gt; If you want to append the new ApsaraDB for Redis instance as a new child instance to a distributed instance, this parameter is active and required. For more information and console operations, see <a href="https://help.aliyun.com/document_detail/106885.html">Add a child instance to a distributed instance</a>.</p>
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
         * <p>The global IP address whitelist templates of the instance. Separate multiple templates with commas (,). Duplicate templates are not allowed.</p>
         * <blockquote>
         * <p>Notice: This parameter applies only to cloud-native instances. Classic instances do not support the whitelist template feature.</notice></p>
         * </blockquote>
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
         * <p>The instance type. For example, redis.master.small.default indicates a 1 GB Community Edition (classic architecture) instance with the standard architecture and two replicas. For more information, see <a href="https://help.aliyun.com/document_detail/26350.html">Overview of instance types</a>. </p>
         * <blockquote>
         * <p>When you call this operation, you must specify at least one of the Capacity and InstanceClass parameters.</p>
         * </blockquote>
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
         * <p>The type of the endpoint used when you create a cloud-native dual-zone deployment read/write splitting instance. If you do not explicitly specify this parameter, the default value is AzIndependentEndpoint.</p>
         * <ul>
         * <li><strong>AzIndependentEndpoint</strong>: <strong>Default value</strong>. Active zone-independent endpoints. The primary and secondary active zones provide independent endpoints. You can use different endpoints to implement nearest access for active zones.</li>
         * <li><strong>UnifiedEndpoint</strong>: Unified endpoint. A unified endpoint is provided to access nodes in both the primary and secondary active zones, but cross-zone access may occur.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: This parameter applies only to cloud-native dual-zone deployment read/write splitting instances. For other types of instances, only active zone-independent endpoints are supported. Even if you specify UnifiedEndpoint, it does not take effect.</notice></p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: The UnifiedEndpoint parameter is currently available only to whitelisted users. If a non-whitelisted user specifies this parameter, an invocation error is returned. To apply for the permissions, submit a ticket.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AzIndependentEndpoint</p>
         */
        public Builder instanceEndpointType(String instanceEndpointType) {
            this.putQueryParameter("InstanceEndpointType", instanceEndpointType);
            this.instanceEndpointType = instanceEndpointType;
            return this;
        }

        /**
         * <p>The name of the instance. The name must be 2 to 80 characters in length, and must start with a letter or a Chinese character. It cannot contain the following special characters: <code>@/:=”&lt;&gt;{[]}</code> and spaces.</p>
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
         * <p>The instance type. Valid values:</p>
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
         * <p>The end time of the maintenance window for the instance. Specify the time in the <i>HH:mm</i>Z format. The time must be in UTC. For example, if you want the maintenance window to end at 02:00 (UTC+8), set the value to <code>18:00Z</code>.</p>
         * <blockquote>
         * <p>The interval between the start time and the end time must be at least 1 hour.</p>
         * </blockquote>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value is 22:00 (UTC), which is 06:00 (UTC+8).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>07:00Z</p>
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.putQueryParameter("MaintainEndTime", maintainEndTime);
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * <p>The start time of the maintenance window for the instance. Specify the time in the <i>HH:mm</i>Z format. The time must be in UTC. For example, if you want the maintenance window to start at 01:00 (UTC+8), set the value to <code>17:00Z</code>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value is 18:00 (UTC), which is 02:00 (UTC+8).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>03:00Z</p>
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.putQueryParameter("MaintainStartTime", maintainStartTime);
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: Virtual Private Cloud (VPC). This is the default value.</li>
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
         * <li><strong>MASTER_SLAVE</strong>: high-availability (two replicas)</li>
         * <li><strong>STAND_ALONE</strong>: single replica</li>
         * <li><strong>double</strong>: two replicas</li>
         * <li><strong>single</strong>: single replica<blockquote>
         * <p>For cloud-native instances, select <strong>MASTER_SLAVE</strong> or <strong>STAND_ALONE</strong>. For classic instances, select <strong>double</strong> or <strong>single</strong>.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The globally unique ID of the parameter template.&gt;Notice: This parameter applies only to cloud-native instances.</notice></p>
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
         * <p>The password of the instance. The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, special characters, and digits. The allowed special characters include <code>!@#$%^&amp;*()_+-=</code>.</p>
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
         * <p>The subscription duration. Unit: months. Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, <strong>36</strong>, and <strong>60</strong>.</p>
         * <blockquote>
         * <p>This parameter is required and takes effect only when the ChargeType parameter is set to <strong>PrePaid</strong>.</p>
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
         * <p>The service port of the instance. Valid values: <strong>1</strong> to <strong>65535</strong>. Default value: <strong>6379</strong>.</p>
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
         * <p>The internal network IP address of the new instance.</p>
         * <blockquote>
         * <p>The internal network IP address must be within the vSwitch CIDR block to which the instance belongs.</p>
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
         * <p>The number of read-only nodes in the primary zone. This parameter applies only to cloud-native read/write splitting instances.</p>
         * <ul>
         * <li>If the instance uses the standard architecture, valid values are 1 to 9.</li>
         * <li>If the instance uses the cluster architecture, valid values are 1 to 4, which indicates the number of read-only nodes per shard.<blockquote>
         * <p>If you create a multi-zone instance, you can use this parameter and the SlaveReadOnlyCount parameter to specify the number of read-only nodes in the primary and secondary zones.</p>
         * <ul>
         * <li>If the instance uses the standard architecture, the sum of this parameter and the SlaveReadOnlyCount parameter cannot exceed 9.</li>
         * <li>If the instance uses the cluster architecture, the sum of this parameter and the SlaveReadOnlyCount parameter cannot exceed 4.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder readOnlyCount(Integer readOnlyCount) {
            this.putQueryParameter("ReadOnlyCount", readOnlyCount);
            this.readOnlyCount = readOnlyCount;
            return this;
        }

        /**
         * <p>Specifies whether to restore the account, kernel parameters, and whitelist information from the original backup set when you create an instance by using a specified backup set. For example, to restore the account information, set the value to <code>account</code>.</p>
         * <p>Default value: empty, which indicates that the account, kernel parameters, and whitelist information are not restored from the original backup set.</p>
         * <blockquote>
         * <p>This parameter applies only to cloud-native instances, and the original backup set must contain the account, kernel parameters, and whitelist information. You can call the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> operation to query whether the RecoverConfigMode parameter of the specified backup set contains the preceding information.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>whitelist,config,account</p>
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
         * <p>The number of secondary nodes in the primary zone. This parameter applies only to cloud-native cluster instances with multiple replicas. You can use this parameter to specify a custom number of secondary nodes. Valid values: 1 to 4.</p>
         * <blockquote>
         * <p>If you create a multi-zone instance, you can use this parameter and the SlaveReplicaCount parameter to specify the number of secondary nodes in the primary and secondary zones. The sum of this parameter and the SlaveReplicaCount parameter cannot exceed 4.</p>
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
         * <p>The point in time to which you want to restore the source instance. If the data flashback feature is enabled for the source instance, you can specify any point in time within the backup retention period of the source instance. The system uses the backup data of the source instance at the specified point in time to create the new instance. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
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
         * <p>The secondary zone ID. You can call the <a href="https://help.aliyun.com/document_detail/473764.html">DescribeZones</a> operation to query the most recent zone list.</p>
         * <blockquote>
         * <p>The value of this parameter cannot be the same as the value of the ZoneId parameter, and cannot be the ID of a multi-zone deployment.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
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
         * <p>The number of shards. This parameter applies only to cloud-native instances. You can use this parameter to specify a custom number of shards.</p>
         * <ul>
         * <li>1: creates a non-cluster architecture.</li>
         * <li>A value greater than 1: creates a cluster architecture.</li>
         * </ul>
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
         * <p>The number of read-only nodes in the secondary zone.</p>
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
         * <p>The number of secondary nodes in the secondary zone.</p>
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
         * <p>If you want to create a new instance based on the backup set of an instance, specify the source instance ID in this parameter first.</p>
         * <blockquote>
         * <p>Then, specify the backup set or point in time by using the BackupId, ClusterBackupId (recommended for cloud-native cluster architecture), or RestoreTime parameter. This parameter must be used in combination with one of the preceding three parameters.</p>
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
         * <p>The tag information of the instance.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token is case-sensitive and can be up to 64 ASCII characters in length.</p>
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
         * <p>The ID of the vSwitch.</p>
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
         * <p>The ID of the VPC.</p>
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
         * <p>The primary active zone ID. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query the most recent active zone list, and use this parameter to specify the active zone where you want to create the instance.</p>
         * <blockquote>
         * <p>You can also specify the SecondaryZoneId parameter to set the secondary active zone. The deployment of the primary and secondary nodes is in the specified primary and secondary active zones to implement a primary/secondary architecture. For example, you can set the ZoneId parameter to &quot;cn-hangzhou-h&quot; and the SecondaryZoneId parameter to &quot;cn-hangzhou-g&quot;.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
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
             * <p>The key of the tag.</p>
             * <blockquote>
             * <ul>
             * <li><strong>N</strong> indicates the sequence number of the tag key. You can attach up to 20 tags to a single instance. For example, Tag.1.Key indicates the key of the first tag, and Tag.2.Key indicates the key of the second tag.</li>
             * <li>If the key of the tag does not exist, the system performs automatic creation.</li>
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
             * <p>The value of the tag.</p>
             * <blockquote>
             * <p><strong>N</strong> indicates the sequence number of the tag value. For example, <strong>Tag.1.Value</strong> indicates the value of the first tag, and <strong>Tag.2.Value</strong> indicates the value of the second tag.</p>
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
