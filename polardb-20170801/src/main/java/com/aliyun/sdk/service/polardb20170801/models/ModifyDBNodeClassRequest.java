// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyDBNodeClassRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBNodeClassRequest</p>
 */
public class ModifyDBNodeClassRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudProvider")
    private String cloudProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeTargetClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBNodeTargetClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeType")
    private String DBNodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlannedEndTime")
    private String plannedEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlannedFlashingOffTime")
    private String plannedFlashingOffTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlannedStartTime")
    private String plannedStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubCategory")
    private String subCategory;

    private ModifyDBNodeClassRequest(Builder builder) {
        super(builder);
        this.autoUseCoupon = builder.autoUseCoupon;
        this.clientToken = builder.clientToken;
        this.cloudProvider = builder.cloudProvider;
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeTargetClass = builder.DBNodeTargetClass;
        this.DBNodeType = builder.DBNodeType;
        this.modifyType = builder.modifyType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.plannedEndTime = builder.plannedEndTime;
        this.plannedFlashingOffTime = builder.plannedFlashingOffTime;
        this.plannedStartTime = builder.plannedStartTime;
        this.promotionCode = builder.promotionCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subCategory = builder.subCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBNodeClassRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cloudProvider
     */
    public String getCloudProvider() {
        return this.cloudProvider;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBNodeTargetClass
     */
    public String getDBNodeTargetClass() {
        return this.DBNodeTargetClass;
    }

    /**
     * @return DBNodeType
     */
    public String getDBNodeType() {
        return this.DBNodeType;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
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
     * @return plannedEndTime
     */
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    /**
     * @return plannedFlashingOffTime
     */
    public String getPlannedFlashingOffTime() {
        return this.plannedFlashingOffTime;
    }

    /**
     * @return plannedStartTime
     */
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    /**
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
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
     * @return subCategory
     */
    public String getSubCategory() {
        return this.subCategory;
    }

    public static final class Builder extends Request.Builder<ModifyDBNodeClassRequest, Builder> {
        private Boolean autoUseCoupon; 
        private String clientToken; 
        private String cloudProvider; 
        private String DBClusterId; 
        private String DBNodeTargetClass; 
        private String DBNodeType; 
        private String modifyType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String plannedEndTime; 
        private String plannedFlashingOffTime; 
        private String plannedStartTime; 
        private String promotionCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subCategory; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBNodeClassRequest request) {
            super(request);
            this.autoUseCoupon = request.autoUseCoupon;
            this.clientToken = request.clientToken;
            this.cloudProvider = request.cloudProvider;
            this.DBClusterId = request.DBClusterId;
            this.DBNodeTargetClass = request.DBNodeTargetClass;
            this.DBNodeType = request.DBNodeType;
            this.modifyType = request.modifyType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.plannedEndTime = request.plannedEndTime;
            this.plannedFlashingOffTime = request.plannedFlashingOffTime;
            this.plannedStartTime = request.plannedStartTime;
            this.promotionCode = request.promotionCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subCategory = request.subCategory;
        } 

        /**
         * <p>Specifies whether to automatically use coupons. Valid values:</p>
         * <ul>
         * <li>true (default): Uses coupons.</li>
         * <li>false: Does not use coupons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value. Make sure that the value is unique among different requests. The token is case-sensitive and can contain a maximum of 64 ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The cloud service provider of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ENS</p>
         */
        public Builder cloudProvider(String cloudProvider) {
            this.putQueryParameter("CloudProvider", cloudProvider);
            this.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The target specifications for all nodes. For more information, see <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        public Builder DBNodeTargetClass(String DBNodeTargetClass) {
            this.putQueryParameter("DBNodeTargetClass", DBNodeTargetClass);
            this.DBNodeTargetClass = DBNodeTargetClass;
            return this;
        }

        /**
         * <p>The node type. Set this parameter to DLNode only when you change the node specifications of an AI node.</p>
         * 
         * <strong>example:</strong>
         * <p>DLNode</p>
         */
        public Builder DBNodeType(String DBNodeType) {
            this.putQueryParameter("DBNodeType", DBNodeType);
            this.DBNodeType = DBNodeType;
            return this;
        }

        /**
         * <p>The type of the specification change. Valid values: </p>
         * <ul>
         * <li><strong>Upgrade</strong>: upgrades the specifications.</li>
         * <li><strong>Downgrade</strong>: downgrades the specifications.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Upgrade</p>
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
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
         * <p>The latest start time of the scheduled specification change task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
         * <blockquote>
         * <ul>
         * <li>The latest time must be at least 30 minutes later than the start time.</li>
         * <li>If <code>PlannedStartTime</code> is set but this parameter is not specified, the latest time defaults to <code>start time + 30 minutes</code>. For example, if <code>PlannedStartTime</code> is set to <code>2021-01-14T09:00:00Z</code> and this parameter is left empty, the task starts no later than <code>2021-01-14T09:30:00Z</code>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-01-14T09:30:00Z</p>
         */
        public Builder plannedEndTime(String plannedEndTime) {
            this.putQueryParameter("PlannedEndTime", plannedEndTime);
            this.plannedEndTime = plannedEndTime;
            return this;
        }

        /**
         * <p>The planned transient disconnection time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-14T09:30:00Z</p>
         */
        public Builder plannedFlashingOffTime(String plannedFlashingOffTime) {
            this.putQueryParameter("PlannedFlashingOffTime", plannedFlashingOffTime);
            this.plannedFlashingOffTime = plannedFlashingOffTime;
            return this;
        }

        /**
         * <p>The earliest start time of the scheduled specification change task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect when <code>ModifyType</code> is set to <code>Upgrade</code> or <code>Downgrade</code>.</li>
         * <li>The start time must be within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, the valid range for the start time is from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</li>
         * <li>If this parameter is left empty, the specification change task is immediately executed.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-01-14T09:00:00Z</p>
         */
        public Builder plannedStartTime(String plannedStartTime) {
            this.putQueryParameter("PlannedStartTime", plannedStartTime);
            this.plannedStartTime = plannedStartTime;
            return this;
        }

        /**
         * <p>The coupon code. If this parameter is not specified, the default coupon is used.</p>
         * 
         * <strong>example:</strong>
         * <p>727xxxxxx934</p>
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
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
         * <p>The cluster sub-series. Valid values:</p>
         * <ul>
         * <li><p><strong>normal_exclusive</strong>: Dedicated</p>
         * </li>
         * <li><p><strong>normal_general</strong>: General-purpose</p>
         * </li>
         * </ul>
         * <p>This parameter is required when you change specifications between Dedicated and General-purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>normal_general</p>
         */
        public Builder subCategory(String subCategory) {
            this.putQueryParameter("SubCategory", subCategory);
            this.subCategory = subCategory;
            return this;
        }

        @Override
        public ModifyDBNodeClassRequest build() {
            return new ModifyDBNodeClassRequest(this);
        } 

    } 

}
