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
 * {@link ModifyNodeSpecBatchRequest} extends {@link RequestModel}
 *
 * <p>ModifyNodeSpecBatchRequest</p>
 */
public class ModifyNodeSpecBatchRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodesInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodesInfo;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

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

    private ModifyNodeSpecBatchRequest(Builder builder) {
        super(builder);
        this.alignPrimaryZone = builder.alignPrimaryZone;
        this.autoPay = builder.autoPay;
        this.businessInfo = builder.businessInfo;
        this.clientToken = builder.clientToken;
        this.couponNo = builder.couponNo;
        this.DBInstanceId = builder.DBInstanceId;
        this.effectiveTime = builder.effectiveTime;
        this.nodesInfo = builder.nodesInfo;
        this.orderType = builder.orderType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetHiddenZoneId = builder.targetHiddenZoneId;
        this.targetSecondaryZoneId = builder.targetSecondaryZoneId;
        this.targetVswitchId = builder.targetVswitchId;
        this.targetZoneId = builder.targetZoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNodeSpecBatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return nodesInfo
     */
    public String getNodesInfo() {
        return this.nodesInfo;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ModifyNodeSpecBatchRequest, Builder> {
        private Boolean alignPrimaryZone; 
        private Boolean autoPay; 
        private String businessInfo; 
        private String clientToken; 
        private String couponNo; 
        private String DBInstanceId; 
        private String effectiveTime; 
        private String nodesInfo; 
        private String orderType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String targetHiddenZoneId; 
        private String targetSecondaryZoneId; 
        private String targetVswitchId; 
        private String targetZoneId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNodeSpecBatchRequest request) {
            super(request);
            this.alignPrimaryZone = request.alignPrimaryZone;
            this.autoPay = request.autoPay;
            this.businessInfo = request.businessInfo;
            this.clientToken = request.clientToken;
            this.couponNo = request.couponNo;
            this.DBInstanceId = request.DBInstanceId;
            this.effectiveTime = request.effectiveTime;
            this.nodesInfo = request.nodesInfo;
            this.orderType = request.orderType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.targetHiddenZoneId = request.targetHiddenZoneId;
            this.targetSecondaryZoneId = request.targetSecondaryZoneId;
            this.targetVswitchId = request.targetVswitchId;
            this.targetZoneId = request.targetZoneId;
        } 

        /**
         * <p>Specifies whether to automatically align the primary node to the primary zone after operations such as configuration changes for a multi-zone instance. If you choose not to align the node, one primary/secondary switchover (transient connection) is prevented. Default value: true.</p>
         */
        public Builder alignPrimaryZone(Boolean alignPrimaryZone) {
            this.putQueryParameter("AlignPrimaryZone", alignPrimaryZone);
            this.alignPrimaryZone = alignPrimaryZone;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables automatic payment. Make sure that your account has sufficient balance.
         * &lt;props=&quot;china&quot;&gt;- <strong>false</strong>: disables automatic payment. You can log on to the ApsaraDB for MongoDB console, choose <strong>Expenses</strong> &gt; <strong>Expenses and Costs</strong> in the upper-right corner, choose <strong>Orders</strong> &gt; <strong>My Orders</strong> in the left-side navigation pane, and then find the target order on the <strong>Orders</strong> tab to complete the payment.
         * &lt;props=&quot;intl&quot;&gt;- <strong>false</strong>: disables automatic payment. You can log on to the ApsaraDB for MongoDB console, choose <strong>Expenses</strong> &gt; <strong>Expenses and Costs</strong> in the upper-right corner, click <strong>Order Management</strong> in the left-side navigation pane, and then find the target order on the <strong>Orders</strong> page to complete the payment.</li>
         * </ul>
         * <p>Default value: <strong>true</strong>.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can use the client to generate the token, but you must ensure that it is unique among different requests. The token can contain a maximum of 64 ASCII characters and cannot contain non-ASCII characters.</p>
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
         * <p>The instance ID of the instance whose configurations you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp1337621e8f****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The effective period of the configuration change. Valid values:</p>
         * <ul>
         * <li><strong>Immediately</strong>: The configuration change takes effect immediately.</li>
         * <li><strong>MaintainTime</strong>: The configuration change takes effect during the maintenance window of the instance.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can invoke the <a href="https://help.aliyun.com/document_detail/62008.html">ModifyDBInstanceMaintainTime</a> operation to modify the maintenance window of the instance.</li>
         * <li>You can invoke the <a href="https://help.aliyun.com/document_detail/62010.html">DescribeDBInstanceAttribute</a> operation to view the maintenance window of the instance.</li>
         * </ul>
         * </blockquote>
         * <p>Default value: <strong>Immediately</strong>.</p>
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
         * <p>The specifications of the Mongos or shard nodes to be modified. For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Shards&quot;:[{&quot;DBInstanceClass&quot;:&quot;dds.shard.mid&quot;,&quot;DBInstanceName&quot;:&quot;d-bp14ae4572fd****&quot;,&quot;Storage&quot;:20},{&quot;DBInstanceClass&quot;:&quot;dds.shard.mid&quot;,&quot;DBInstanceName&quot;:&quot;d-bp19f4f92dc5****&quot;,&quot;Storage&quot;:30}]}</p>
         */
        public Builder nodesInfo(String nodesInfo) {
            this.putQueryParameter("NodesInfo", nodesInfo);
            this.nodesInfo = nodesInfo;
            return this;
        }

        /**
         * <p>The type of the configuration change. Valid values:</p>
         * <ul>
         * <li><strong>UPGRADE</strong>: upgrades the configurations.</li>
         * <li><strong>DOWNGRADE</strong>: downgrades the configurations.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only when the billing method of the instance is subscription.</p>
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query available regions.</p>
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
         * <p>The destination zone of the hidden node when you migrate the instance across zones and change its configurations at the same time.</p>
         * <blockquote>
         * <p>Notice: This parameter is supported only for cloud disk instances.</notice>
         * Notice: The value of this parameter cannot be the same as the value of the TargetZoneId or TargetSecondaryZoneId parameter.</notice></p>
         * </blockquote>
         * <blockquote>
         * <ul>
         * <li>You must specify this parameter only when you migrate the instance across zones and change its configurations at the same time.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        public Builder targetHiddenZoneId(String targetHiddenZoneId) {
            this.putQueryParameter("TargetHiddenZoneId", targetHiddenZoneId);
            this.targetHiddenZoneId = targetHiddenZoneId;
            return this;
        }

        /**
         * <p>The destination zone of the secondary node when you migrate the instance across zones and change its configurations at the same time.</p>
         * <blockquote>
         * <p>Notice: This parameter is supported only for cloud disk instances.</notice>
         * Notice: The value of this parameter cannot be the same as the value of the TargetZoneId or TargetHiddenZoneId parameter.</notice></p>
         * <ul>
         * <li>You must specify this parameter only when you migrate the instance across zones and change its configurations at the same time.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        public Builder targetSecondaryZoneId(String targetSecondaryZoneId) {
            this.putQueryParameter("TargetSecondaryZoneId", targetSecondaryZoneId);
            this.targetSecondaryZoneId = targetSecondaryZoneId;
            return this;
        }

        /**
         * <p>The ID of the destination vSwitch when you migrate the instance across zones and change its configurations at the same time.</p>
         * <blockquote>
         * <p>Notice: This parameter is supported only for cloud disk instances.</notice></p>
         * <ul>
         * <li>You must specify this parameter only when you migrate the instance across zones and change its configurations at the same time.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxxxxx</p>
         */
        public Builder targetVswitchId(String targetVswitchId) {
            this.putQueryParameter("TargetVswitchId", targetVswitchId);
            this.targetVswitchId = targetVswitchId;
            return this;
        }

        /**
         * <p>The destination zone of the primary node when you migrate the instance across zones and change its configurations at the same time.</p>
         * <blockquote>
         * <p>Notice: This parameter is supported only for cloud disk instances.</notice>
         * Notice: The value of this parameter cannot be the same as the value of the TargetSecondaryZoneId or TargetHiddenZoneId parameter.</notice></p>
         * <ul>
         * <li>You must specify this parameter only when you migrate the instance across zones and change its configurations at the same time.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder targetZoneId(String targetZoneId) {
            this.putQueryParameter("TargetZoneId", targetZoneId);
            this.targetZoneId = targetZoneId;
            return this;
        }

        @Override
        public ModifyNodeSpecBatchRequest build() {
            return new ModifyNodeSpecBatchRequest(this);
        } 

    } 

}
