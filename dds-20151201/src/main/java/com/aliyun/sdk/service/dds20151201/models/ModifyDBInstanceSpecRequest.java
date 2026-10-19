// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlignPrimaryZone")
    private Boolean alignPrimaryZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessInfo")
    private String businessInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
    private String DBInstanceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraParam")
    private String extraParam;

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
    @com.aliyun.core.annotation.NameInMap("ReadonlyReplicas")
    private String readonlyReplicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationFactor")
    private String replicationFactor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchNodeClass")
    private String searchNodeClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchNodeCount")
    @com.aliyun.core.annotation.Validation(maximum = 16, minimum = 2)
    private Long searchNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchNodeStorage")
    private Long searchNodeStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetHiddenZoneId")
    private String targetHiddenZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetSecondaryZoneId")
    private String targetSecondaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetVswitchId")
    private String targetVswitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetZoneId")
    private String targetZoneId;

    private ModifyDBInstanceSpecRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alignPrimaryZone = builder.alignPrimaryZone;
        this.autoPay = builder.autoPay;
        this.businessInfo = builder.businessInfo;
        this.couponNo = builder.couponNo;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.effectiveTime = builder.effectiveTime;
        this.extraParam = builder.extraParam;
        this.orderType = builder.orderType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.readonlyReplicas = builder.readonlyReplicas;
        this.replicationFactor = builder.replicationFactor;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.searchNodeClass = builder.searchNodeClass;
        this.searchNodeCount = builder.searchNodeCount;
        this.searchNodeStorage = builder.searchNodeStorage;
        this.targetHiddenZoneId = builder.targetHiddenZoneId;
        this.targetSecondaryZoneId = builder.targetSecondaryZoneId;
        this.targetVswitchId = builder.targetVswitchId;
        this.targetZoneId = builder.targetZoneId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return alignPrimaryZone
     */
    public Boolean getAlignPrimaryZone() {
        return this.alignPrimaryZone;
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
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
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
    public String getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return extraParam
     */
    public String getExtraParam() {
        return this.extraParam;
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
     * @return readonlyReplicas
     */
    public String getReadonlyReplicas() {
        return this.readonlyReplicas;
    }

    /**
     * @return replicationFactor
     */
    public String getReplicationFactor() {
        return this.replicationFactor;
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
     * @return searchNodeClass
     */
    public String getSearchNodeClass() {
        return this.searchNodeClass;
    }

    /**
     * @return searchNodeCount
     */
    public Long getSearchNodeCount() {
        return this.searchNodeCount;
    }

    /**
     * @return searchNodeStorage
     */
    public Long getSearchNodeStorage() {
        return this.searchNodeStorage;
    }

    /**
     * @return targetHiddenZoneId
     */
    public String getTargetHiddenZoneId() {
        return this.targetHiddenZoneId;
    }

    /**
     * @return targetSecondaryZoneId
     */
    public String getTargetSecondaryZoneId() {
        return this.targetSecondaryZoneId;
    }

    /**
     * @return targetVswitchId
     */
    public String getTargetVswitchId() {
        return this.targetVswitchId;
    }

    /**
     * @return targetZoneId
     */
    public String getTargetZoneId() {
        return this.targetZoneId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceSpecRequest, Builder> {
        private String regionId; 
        private Boolean alignPrimaryZone; 
        private Boolean autoPay; 
        private String businessInfo; 
        private String couponNo; 
        private String DBInstanceClass; 
        private String DBInstanceId; 
        private String DBInstanceStorage; 
        private String effectiveTime; 
        private String extraParam; 
        private String orderType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String readonlyReplicas; 
        private String replicationFactor; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String searchNodeClass; 
        private Long searchNodeCount; 
        private Long searchNodeStorage; 
        private String targetHiddenZoneId; 
        private String targetSecondaryZoneId; 
        private String targetVswitchId; 
        private String targetZoneId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceSpecRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alignPrimaryZone = request.alignPrimaryZone;
            this.autoPay = request.autoPay;
            this.businessInfo = request.businessInfo;
            this.couponNo = request.couponNo;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.effectiveTime = request.effectiveTime;
            this.extraParam = request.extraParam;
            this.orderType = request.orderType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.readonlyReplicas = request.readonlyReplicas;
            this.replicationFactor = request.replicationFactor;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.searchNodeClass = request.searchNodeClass;
            this.searchNodeCount = request.searchNodeCount;
            this.searchNodeStorage = request.searchNodeStorage;
            this.targetHiddenZoneId = request.targetHiddenZoneId;
            this.targetSecondaryZoneId = request.targetSecondaryZoneId;
            this.targetVswitchId = request.targetVswitchId;
            this.targetZoneId = request.targetZoneId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to automatically align the primary node to the primary zone for a multi-zone instance after operations such as configuration changes. If you choose not to align the node, one primary/secondary switchover (transient disconnection) is avoided. Default value: true (aligned).</p>
         */
        public Builder alignPrimaryZone(Boolean alignPrimaryZone) {
            this.putQueryParameter("AlignPrimaryZone", alignPrimaryZone);
            this.alignPrimaryZone = alignPrimaryZone;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables automatic payment. This is the default value. Make sure that your account has sufficient balance.
         * &lt;props=&quot;china&quot;&gt;- <strong>false</strong>: disables automatic payment. You must manually pay for the order in the console. Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose <strong>Expenses</strong> &gt; <strong>Expenses and Costs</strong>. In the left-side navigation pane, choose <strong>Orders</strong> &gt; <strong>My Orders</strong>. On the <strong>Orders</strong> tab, find the order and complete the payment.
         * &lt;props=&quot;intl&quot;&gt;- <strong>false</strong>: disables automatic payment. You must manually pay for the order in the console. Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose <strong>Expenses</strong> &gt; <strong>Expenses and Costs</strong>. In the left-side navigation pane, click <strong>Order Management</strong>. On the <strong>Orders</strong> page, find the order and complete the payment.</li>
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
         * <p>The business information.</p>
         * 
         * <strong>example:</strong>
         * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * <p>Specifies whether to use a coupon. Valid values:</p>
         * <ul>
         * <li><strong>default</strong> or <strong>null</strong>: uses a coupon. This is the default value.</li>
         * <li><strong>youhuiquan_promotion_option_id_for_blank</strong>: does not use a coupon.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * <p>The instance type. &lt;props=&quot;intl&quot;&gt;<ph>For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>. You can also call the <a href="https://help.aliyun.com/document_detail/149719.html">DescribeAvailableResource</a> operation to query instance types.</ph>
         * &lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>For standalone instances and replica set instances, this parameter specifies the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>. You can also call the <a href="https://help.aliyun.com/document_detail/149719.html">DescribeAvailableResource</a> operation to query the instance types of standalone instances and replica set instances.</li>
         * <li>For serverless instances, this parameter specifies the compute specifications of the instance. Valid values: 100 to 8000.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify at least one of the <strong>DBInstanceClass</strong> and <strong>DBInstanceStorage</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dds.sn4.xlarge.1</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp1ea17b41ab****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Instance storage space of the instance. &lt;props=&quot;intl&quot;&gt;<ph>Valid values: 10 to 3000. Unit: GB. The step size is 10 GB. The valid values are subject to the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</ph></p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>For standalone instances and replica set instances, valid values are 10 to 3000. Unit: GB. The step size is 10 GB. The valid values are subject to the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</li>
         * <li>For serverless instances, valid values are 1 to 100. Unit: GB. The step size is 1 GB.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You must specify at least one of the <strong>DBInstanceStorage</strong> and <strong>DBInstanceClass</strong> parameters.</li>
         * <li>You cannot downgrade instance storage space.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder DBInstanceStorage(String DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * <p>The time when the configuration change takes effect. Valid values:</p>
         * <ul>
         * <li><strong>Immediately</strong>: takes effect immediately. This is the default value.</li>
         * <li><strong>MaintainTime</strong>: takes effect during the maintenance window of the instance.</li>
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
         * <p>The additional parameter. Valid values:</p>
         * <ul>
         * <li><strong>async</strong>: returns the result after the configuration change order is created.</li>
         * <li><strong>sync</strong>: returns the result when the configuration change is delivered after the order is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>async</p>
         */
        public Builder extraParam(String extraParam) {
            this.putQueryParameter("ExtraParam", extraParam);
            this.extraParam = extraParam;
            return this;
        }

        /**
         * <p>The type of configuration change. Valid values:</p>
         * <ul>
         * <li><strong>UPGRADE</strong>: upgrades the configurations. This is the default value.</li>
         * <li><strong>DOWNGRADE</strong>: downgrades the configurations.</li>
         * </ul>
         * <blockquote>
         * <p>You can specify this parameter only when the instance uses the subscription billing method.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>UPGRADE</p>
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
         * <p>The number of read-only nodes. Valid values: <strong>0</strong> to <strong>5</strong>.</p>
         * <p>If the instance is connected only over the <strong>classic network</strong> and a <strong>VPC</strong>, you must enable Internet access or release the classic network before you can change the <strong>number of read-only nodes</strong>.</p>
         * <blockquote>
         * <p>You can log on to the ApsaraDB for MongoDB console and view the enabled network types on the <strong>Database Connections</strong> page.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder readonlyReplicas(String readonlyReplicas) {
            this.putQueryParameter("ReadonlyReplicas", readonlyReplicas);
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }

        /**
         * <p>The number of nodes in the instance. Default value: 3.</p>
         * <ul>
         * <li>For a replica set instance, valid values are <strong>3</strong>, <strong>5</strong>, and <strong>7</strong>.</li>
         * <li>For a standalone instance, the value is fixed to <strong>1</strong>.</li>
         * <li>For a replica set instance that uses shared storage (supported only on the Alibaba Cloud China site), the value is fixed to <strong>2</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>You do not need to specify this parameter for a serverless instance (supported only on the Alibaba Cloud China site).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder replicationFactor(String replicationFactor) {
            this.putQueryParameter("ReplicationFactor", replicationFactor);
            this.replicationFactor = replicationFactor;
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
         * <p>The specifications of the search node for the configuration change.</p>
         * 
         * <strong>example:</strong>
         * <p>mdb.shard.2x.xlarge.d</p>
         */
        public Builder searchNodeClass(String searchNodeClass) {
            this.putQueryParameter("SearchNodeClass", searchNodeClass);
            this.searchNodeClass = searchNodeClass;
            return this;
        }

        /**
         * <p>The number of search nodes for the configuration change.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder searchNodeCount(Long searchNodeCount) {
            this.putQueryParameter("SearchNodeCount", searchNodeCount);
            this.searchNodeCount = searchNodeCount;
            return this;
        }

        /**
         * <p>The storage capacity of the search node for the configuration change.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder searchNodeStorage(Long searchNodeStorage) {
            this.putQueryParameter("SearchNodeStorage", searchNodeStorage);
            this.searchNodeStorage = searchNodeStorage;
            return this;
        }

        /**
         * <p>The destination zone for the hidden node when you cloud disk instance across zones and change its configurations at the same time.</p>
         * <blockquote>
         * <p>Notice: This parameter is supported only for instances that use cloud disks.</notice>
         * Notice: The value of this parameter cannot be the same as the value of the TargetZoneId or TargetSecondaryZoneId parameter.</notice></p>
         * </blockquote>
         * <blockquote>
         * <ul>
         * <li>You must specify this parameter only when you cloud disk instance across zones and change its configurations at the same time.</li>
         * <li>This parameter is available only for multi-zone migration.</li>
         * <li>The destination zone and the current zone of the instance must be in the same region.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query zone IDs.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder targetHiddenZoneId(String targetHiddenZoneId) {
            this.putQueryParameter("TargetHiddenZoneId", targetHiddenZoneId);
            this.targetHiddenZoneId = targetHiddenZoneId;
            return this;
        }

        /**
         * <p>The destination zone for the secondary node when you cloud disk instance across zones and change its configurations at the same time.</p>
         * <blockquote>
         * <p>Notice: This parameter is supported only for instances that use cloud disks.</notice>
         * Notice: The value of this parameter cannot be the same as the value of the TargetZoneId or TargetHiddenZoneId parameter.</notice></p>
         * <ul>
         * <li>You must specify this parameter only when you cloud disk instance across zones and change its configurations at the same time.</li>
         * <li>This parameter is available only for multi-zone migration.</li>
         * <li>The destination zone and the current zone of the instance must be in the same region.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query zone IDs.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder targetSecondaryZoneId(String targetSecondaryZoneId) {
            this.putQueryParameter("TargetSecondaryZoneId", targetSecondaryZoneId);
            this.targetSecondaryZoneId = targetSecondaryZoneId;
            return this;
        }

        /**
         * <p>The ID of the destination vSwitch when you cloud disk instance across zones and change its configurations at the same time.</p>
         * <blockquote>
         * <p>Notice: This parameter is supported only for instances that use cloud disks.</notice></p>
         * <ul>
         * <li>You must specify this parameter only when you cloud disk instance across zones and change its configurations at the same time.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1buy0h9myt5i9e7****</p>
         */
        public Builder targetVswitchId(String targetVswitchId) {
            this.putQueryParameter("TargetVswitchId", targetVswitchId);
            this.targetVswitchId = targetVswitchId;
            return this;
        }

        /**
         * <p>The destination zone for instance migration when you migrate the instance across zones and change its configurations at the same time.</p>
         * <blockquote>
         * <p>Notice: This parameter is supported only for cloud disk instances.</notice>
         * Notice: The value of this parameter cannot be the same as the value of the TargetSecondaryZoneId or TargetHiddenZoneId parameter.</notice></p>
         * <ul>
         * <li>You must specify this parameter only when you migrate the instance across zones and change its configurations at the same time.</li>
         * <li>The destination zone and the current zone of the instance must be in the same region.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query zone IDs.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        public Builder targetZoneId(String targetZoneId) {
            this.putQueryParameter("TargetZoneId", targetZoneId);
            this.targetZoneId = targetZoneId;
            return this;
        }

        @Override
        public ModifyDBInstanceSpecRequest build() {
            return new ModifyDBInstanceSpecRequest(this);
        } 

    } 

}
