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
 * {@link ModifyInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceSpecRequest</p>
 */
public class ModifyInstanceSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessInfo")
    private String businessInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceTrans")
    private Boolean forceTrans;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceUpgrade")
    private Boolean forceUpgrade;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    private String instanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MajorVersion")
    private String majorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadOnlyCount")
    @com.aliyun.core.annotation.Validation(maximum = 9)
    private Integer readOnlyCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicaCount")
    private Integer replicaCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardCount")
    @com.aliyun.core.annotation.Validation(maximum = 4092, minimum = 1)
    private Integer shardCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveReadOnlyCount")
    @com.aliyun.core.annotation.Validation(maximum = 9)
    private Integer slaveReadOnlyCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveReplicaCount")
    private Integer slaveReplicaCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceBiz")
    private String sourceBiz;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Storage")
    private Integer storage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private ModifyInstanceSpecRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.businessInfo = builder.businessInfo;
        this.clientToken = builder.clientToken;
        this.couponNo = builder.couponNo;
        this.effectiveTime = builder.effectiveTime;
        this.forceTrans = builder.forceTrans;
        this.forceUpgrade = builder.forceUpgrade;
        this.instanceClass = builder.instanceClass;
        this.instanceId = builder.instanceId;
        this.majorVersion = builder.majorVersion;
        this.nodeType = builder.nodeType;
        this.orderType = builder.orderType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.readOnlyCount = builder.readOnlyCount;
        this.regionId = builder.regionId;
        this.replicaCount = builder.replicaCount;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.shardCount = builder.shardCount;
        this.slaveReadOnlyCount = builder.slaveReadOnlyCount;
        this.slaveReplicaCount = builder.slaveReplicaCount;
        this.sourceBiz = builder.sourceBiz;
        this.storage = builder.storage;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceSpecRequest create() {
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
     * @return businessInfo
     */
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return forceTrans
     */
    public Boolean getForceTrans() {
        return this.forceTrans;
    }

    /**
     * @return forceUpgrade
     */
    public Boolean getForceUpgrade() {
        return this.forceUpgrade;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return majorVersion
     */
    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
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
     * @return readOnlyCount
     */
    public Integer getReadOnlyCount() {
        return this.readOnlyCount;
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
     * @return sourceBiz
     */
    public String getSourceBiz() {
        return this.sourceBiz;
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

    public static final class Builder extends Request.Builder<ModifyInstanceSpecRequest, Builder> {
        private Boolean autoPay; 
        private String businessInfo; 
        private String clientToken; 
        private String couponNo; 
        private String effectiveTime; 
        private Boolean forceTrans; 
        private Boolean forceUpgrade; 
        private String instanceClass; 
        private String instanceId; 
        private String majorVersion; 
        private String nodeType; 
        private String orderType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer readOnlyCount; 
        private String regionId; 
        private Integer replicaCount; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private Integer shardCount; 
        private Integer slaveReadOnlyCount; 
        private Integer slaveReplicaCount; 
        private String sourceBiz; 
        private Integer storage; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceSpecRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.businessInfo = request.businessInfo;
            this.clientToken = request.clientToken;
            this.couponNo = request.couponNo;
            this.effectiveTime = request.effectiveTime;
            this.forceTrans = request.forceTrans;
            this.forceUpgrade = request.forceUpgrade;
            this.instanceClass = request.instanceClass;
            this.instanceId = request.instanceId;
            this.majorVersion = request.majorVersion;
            this.nodeType = request.nodeType;
            this.orderType = request.orderType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.readOnlyCount = request.readOnlyCount;
            this.regionId = request.regionId;
            this.replicaCount = request.replicaCount;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.shardCount = request.shardCount;
            this.slaveReadOnlyCount = request.slaveReadOnlyCount;
            this.slaveReplicaCount = request.slaveReplicaCount;
            this.sourceBiz = request.sourceBiz;
            this.storage = request.storage;
            this.storageType = request.storageType;
        } 

        /**
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): enables automatic payment.</li>
         * <li><strong>false</strong>: disables automatic payment. If you set this parameter to <strong>false</strong>, the instance must be manually renewed before it expires. For more information, see <a href="https://help.aliyun.com/document_detail/26352.html">Renew an instance</a>.</li>
         * </ul>
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
         * <p>The ID of the promotional event or the business information.</p>
         * 
         * <strong>example:</strong>
         * <p>000000001</p>
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>The coupon code. Default value: <code>youhuiquan_promotion_option_id_for_blank</code>.</p>
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
         * <p>The time when you want the configurations to be changed. Valid values:</p>
         * <ul>
         * <li><strong>Immediately</strong> (default): immediately changes the configurations.</li>
         * <li><strong>MaintainTime</strong>: changes the configurations within the maintenance window. You can call the <a href="https://help.aliyun.com/document_detail/473775.html">ModifyInstanceMaintainTime</a> operation to change the maintenance window.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Immediately</p>
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * <p>Specifies whether to enable forced transmission during a configuration change. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): Before the configuration change, the system checks the minor version of the instance. If the minor version of the instance is outdated, an error is reported. You must update the minor version of the instance and try again.</li>
         * <li><strong>true</strong>: The system skips the version check and directly performs the configuration change.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceTrans(Boolean forceTrans) {
            this.putQueryParameter("ForceTrans", forceTrans);
            this.forceTrans = forceTrans;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly change the configurations. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: The system does not forcefully change the configurations.</li>
         * <li><strong>true</strong> (default): The system forcefully changes the configurations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forceUpgrade(Boolean forceUpgrade) {
            this.putQueryParameter("ForceUpgrade", forceUpgrade);
            this.forceUpgrade = forceUpgrade;
            return this;
        }

        /**
         * <p>The new instance type. You can call the <a href="https://help.aliyun.com/document_detail/473765.html">DescribeAvailableResource</a> operation to query the instance types available for configuration change within the zone to which the instance belongs.</p>
         * <blockquote>
         * <p> For more information about the instance types, see <a href="https://help.aliyun.com/document_detail/26350.html">Overview</a>.</p>
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
         * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/473778.html">DescribeInstances</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The major version of the classic instance that you want to upgrade. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, and <strong>5.0</strong>.</p>
         * <blockquote>
         * <p> The <strong>InstanceClass</strong> parameter is required when you upgrade the instance version. This parameter indicates that you can upgrade the instance version only when you update the instance specifications. If you only need to upgrade the instance version, call the <a href="https://help.aliyun.com/document_detail/473776.html">ModifyInstanceMajorVersion</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        public Builder majorVersion(String majorVersion) {
            this.putQueryParameter("MajorVersion", majorVersion);
            this.majorVersion = majorVersion;
            return this;
        }

        /**
         * <p>The type of the node. Valid values:</p>
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
         * <p>MASTER_SLAVE</p>
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * <p>The change type. This parameter is required when you change the configurations of a subscription instance. Valid values:</p>
         * <ul>
         * <li><strong>UPGRADE</strong> (default): upgrades the configurations of the subscription instance.</li>
         * <li><strong>DOWNGRADE</strong>: downgrades the configurations of the subscription instance.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>To downgrade a subscription instance, you must set this parameter to <strong>DOWNGRADE</strong>.</p>
         * </li>
         * <li><p>If the price of an instance increases after its configurations are changed, the instance is upgraded. If the price decreases, the instance is downgraded. For example, the price of an 8 GB read/write splitting instance with five read replicas is higher than that of a 16 GB cluster instance. If you want to change a 16 GB cluster instance to an 8 GB read/write splitting instance with five read replicas, you must upgrade the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DOWNGRADE</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
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
         * <p>The number of read replicas in the primary zone. Valid values: 0 to 5. This parameter applies only to the following scenarios:</p>
         * <ul>
         * <li>If the instance is a cloud-native standard instance, you can set this parameter to a value greater than 0 to enable the read/write splitting architecture.</li>
         * <li>If the instance is a cloud-native read/write splitting instance, you can use this parameter to customize the number of read replicas. You can also set this parameter to 0 to disable the read/write splitting architecture and switch the instance to the standard architecture.</li>
         * </ul>
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The number of replica nodes in the primary zone. This parameter is applicable only to cloud-native multi-replica cluster instances. Valid values: 1 to 4.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The sum of the values of this parameter and the SlaveReplicaCount parameter cannot be greater than 4.</p>
         * </li>
         * <li><p>You can specify either ReplicaCount or ReadOnlyCount.</p>
         * </li>
         * <li><p>A master-replica instance cannot contain multiple replica nodes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder replicaCount(Integer replicaCount) {
            this.putQueryParameter("ReplicaCount", replicaCount);
            this.replicaCount = replicaCount;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The number of shards. This parameter is applicable only to cloud-native cluster instances.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you want to change a cloud-native cluster instance to a standard instance, you must explicitly set the ShardCount parameter to 1 and specify the specifications of the master-replica instance.</p>
         * </li>
         * <li><p>To change a cloud-native standard instance to a cluster instance, you must explicitly set the ShardCount parameter to a value greater than 1 and specify the specifications of the cluster instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder shardCount(Integer shardCount) {
            this.putQueryParameter("ShardCount", shardCount);
            this.shardCount = shardCount;
            return this;
        }

        /**
         * <p>The number of read replicas in the secondary zone when you create a read/write splitting instance that is deployed across multiple zones. Valid values: 1 to 9. The sum of the values of this parameter and the ReadOnlyCount parameter cannot be greater than 9.</p>
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
         * <p>The number of replica nodes in the secondary zone when you create a cloud-native multi-replica cluster instance that is deployed across multiple zones. The sum of the values of this parameter and the ReplicaCount parameter cannot be greater than 4.</p>
         * <blockquote>
         * <p> When you create a cloud-native multi-replica cluster instance that is deployed across multiple zones, you must specify both SlaveReplicaCount and SecondaryZoneId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder slaveReplicaCount(Integer slaveReplicaCount) {
            this.putQueryParameter("SlaveReplicaCount", slaveReplicaCount);
            this.slaveReplicaCount = slaveReplicaCount;
            return this;
        }

        /**
         * <p>The source of the operation. This parameter is used only for internal maintenance. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>SDK</p>
         */
        public Builder sourceBiz(String sourceBiz) {
            this.putQueryParameter("SourceBiz", sourceBiz);
            this.sourceBiz = sourceBiz;
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
         * 
         * <strong>example:</strong>
         * <p>essd_pl1</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public ModifyInstanceSpecRequest build() {
            return new ModifyInstanceSpecRequest(this);
        } 

    } 

}
