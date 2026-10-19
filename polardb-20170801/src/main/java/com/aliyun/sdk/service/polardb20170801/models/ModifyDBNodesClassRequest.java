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
 * {@link ModifyDBNodesClassRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBNodesClassRequest</p>
 */
public class ModifyDBNodesClassRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("DBNode")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DBNode> DBNode;

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

    private ModifyDBNodesClassRequest(Builder builder) {
        super(builder);
        this.autoUseCoupon = builder.autoUseCoupon;
        this.clientToken = builder.clientToken;
        this.cloudProvider = builder.cloudProvider;
        this.DBClusterId = builder.DBClusterId;
        this.DBNode = builder.DBNode;
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

    public static ModifyDBNodesClassRequest create() {
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
     * @return DBNode
     */
    public java.util.List<DBNode> getDBNode() {
        return this.DBNode;
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

    public static final class Builder extends Request.Builder<ModifyDBNodesClassRequest, Builder> {
        private Boolean autoUseCoupon; 
        private String clientToken; 
        private String cloudProvider; 
        private String DBClusterId; 
        private java.util.List<DBNode> DBNode; 
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

        private Builder(ModifyDBNodesClassRequest request) {
            super(request);
            this.autoUseCoupon = request.autoUseCoupon;
            this.clientToken = request.clientToken;
            this.cloudProvider = request.cloudProvider;
            this.DBClusterId = request.DBClusterId;
            this.DBNode = request.DBNode;
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
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value. Make sure that the value is unique among different requests. The token is case-sensitive and cannot exceed 64 ASCII characters in length.</p>
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
         * <p>The cloud service provider to which the instance belongs.</p>
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
         * <p>The list of cluster nodes.</p>
         * <p>This parameter is required.</p>
         */
        public Builder DBNode(java.util.List<DBNode> DBNode) {
            this.putQueryParameter("DBNode", DBNode);
            this.DBNode = DBNode;
            return this;
        }

        /**
         * <p>The type of the specification change. Valid values:</p>
         * <ul>
         * <li><p><strong>Upgrade</strong>: Upgrades the specifications.</p>
         * </li>
         * <li><p><strong>Downgrade</strong>: Downgrades the specifications.</p>
         * </li>
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
         * <p>The latest time to start the scheduled task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
         * <blockquote>
         * <ul>
         * <li>The latest time must be at least 30 minutes later than the start time.</li>
         * <li>If <code>PlannedStartTime</code> is set but this parameter is not specified, the latest time to execute the task defaults to <code>start time + 30 minutes</code>. For example, if <code>PlannedStartTime</code> is set to <code>2021-01-14T09:00:00Z</code> and this parameter is left empty, the task starts no later than <code>2021-01-14T09:30:00Z</code>.</li>
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
         * <p>The time is in the ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
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
         * <p>The earliest time to start the scheduled (executed within the target time period) specification upgrade task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only when <code>ModifyType</code> is set to <code>Upgrade</code>.</li>
         * <li>The start time can be any time point within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, the start time can range from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</li>
         * <li>If this parameter is left empty, the specification upgrade task is immediately executed by default.</li>
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
        public ModifyDBNodesClassRequest build() {
            return new ModifyDBNodesClassRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDBNodesClassRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBNodesClassRequest</p>
     */
    public static class DBNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("TargetClass")
        private String targetClass;

        private DBNode(Builder builder) {
            this.DBNodeId = builder.DBNodeId;
            this.targetClass = builder.targetClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNode create() {
            return builder().build();
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return targetClass
         */
        public String getTargetClass() {
            return this.targetClass;
        }

        public static final class Builder {
            private String DBNodeId; 
            private String targetClass; 

            private Builder() {
            } 

            private Builder(DBNode model) {
                this.DBNodeId = model.DBNodeId;
                this.targetClass = model.targetClass;
            } 

            /**
             * <p>The cluster node ID.</p>
             * <blockquote>
             * <p>If this parameter is specified, DBNode.N.TargetClass is required. N is an integer that starts from 1. Maximum value: 16 minus the current number of nodes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>pi-*************</p>
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * <p>The specifications of the node to be changed. For more information about node specifications, see <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a>. </p>
             * <blockquote>
             * <p>If this parameter is specified, DBNode.N.DBNodeId is required. N is an integer that starts from 1. Maximum value: 16 minus the current number of nodes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>polar.mysql.x4.medium</p>
             */
            public Builder targetClass(String targetClass) {
                this.targetClass = targetClass;
                return this;
            }

            public DBNode build() {
                return new DBNode(this);
            } 

        } 

    }
}
