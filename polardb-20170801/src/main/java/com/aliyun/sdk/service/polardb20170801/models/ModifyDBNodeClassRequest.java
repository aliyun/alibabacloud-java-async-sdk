// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBNodeClassRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBNodeClassRequest</p>
 */
public class ModifyDBNodeClassRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DBNodeTargetClass")
    @Validation(required = true)
    private String DBNodeTargetClass;

    @Query
    @NameInMap("DBNodeType")
    private String DBNodeType;

    @Query
    @NameInMap("ModifyType")
    @Validation(required = true)
    private String modifyType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PlannedEndTime")
    private String plannedEndTime;

    @Query
    @NameInMap("PlannedStartTime")
    private String plannedStartTime;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SubCategory")
    private String subCategory;

    private ModifyDBNodeClassRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeTargetClass = builder.DBNodeTargetClass;
        this.DBNodeType = builder.DBNodeType;
        this.modifyType = builder.modifyType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.plannedEndTime = builder.plannedEndTime;
        this.plannedStartTime = builder.plannedStartTime;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return plannedStartTime
     */
    public String getPlannedStartTime() {
        return this.plannedStartTime;
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
        private String clientToken; 
        private String DBClusterId; 
        private String DBNodeTargetClass; 
        private String DBNodeType; 
        private String modifyType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String plannedEndTime; 
        private String plannedStartTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subCategory; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBNodeClassRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBClusterId = request.DBClusterId;
            this.DBNodeTargetClass = request.DBNodeTargetClass;
            this.DBNodeType = request.DBNodeType;
            this.modifyType = request.modifyType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.plannedEndTime = request.plannedEndTime;
            this.plannedStartTime = request.plannedStartTime;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subCategory = request.subCategory;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The specifications of all nodes. For more information, see [Specifications of computing nodes](~~102542~~).
         */
        public Builder DBNodeTargetClass(String DBNodeTargetClass) {
            this.putQueryParameter("DBNodeTargetClass", DBNodeTargetClass);
            this.DBNodeTargetClass = DBNodeTargetClass;
            return this;
        }

        /**
         * DBNodeType.
         */
        public Builder DBNodeType(String DBNodeType) {
            this.putQueryParameter("DBNodeType", DBNodeType);
            this.DBNodeType = DBNodeType;
            return this;
        }

        /**
         * The type of the configuration change. Valid values:
         * <p>
         * 
         * *   **Upgrade**
         * *   **Downgrade**
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
         * The latest start time to run the task. Specify the time in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.
         * <p>
         * 
         * > *   The value of this parameter must be at least 30 minutes later than the value of the PlannedStartTime parameter.
         * > *   If you specify the `PlannedStartTime` parameter but do not specify a value for the PlannedEndTime parameter, the latest start time of the task is set to a value that is calculated by `the value of the PlannedEndTime parameter + 30 minutes` by default. For example, if you set the `PlannedStartTime` parameter to `2021-01-14T09:00:00Z` and you do not specify the PlannedEndTime parameter, the latest start time of the task is set to `2021-01-14T09:30:00Z`.
         */
        public Builder plannedEndTime(String plannedEndTime) {
            this.putQueryParameter("PlannedEndTime", plannedEndTime);
            this.plannedEndTime = plannedEndTime;
            return this;
        }

        /**
         * The earliest time to upgrade the specifications within the scheduled time period. Specify the time in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.
         * <p>
         * 
         * > *   This parameter takes effect only when `ModifyType` is set to `Upgrade`.
         * > *   The earliest start time of the task can be a point in time within the next 24 hours. For example, if the current time is `2021-01-14T09:00:00Z`, you can specify a point in the time range from `2021-01-14T09:00:00Z` to `2021-01-15T09:00:00Z`.
         * > *   If this parameter is empty, the upgrade task is immediately performed.
         */
        public Builder plannedStartTime(String plannedStartTime) {
            this.putQueryParameter("PlannedStartTime", plannedStartTime);
            this.plannedStartTime = plannedStartTime;
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
         * The category of the cluster. Valid values:
         * <p>
         * 
         * *   **normal_exclusive**: dedicated
         * *   **normal_general**: genera-purpose
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
