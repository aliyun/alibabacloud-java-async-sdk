// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBClusterVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBClusterVersionRequest</p>
 */
public class UpgradeDBClusterVersionRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("FromTimeService")
    private Boolean fromTimeService;

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
    @NameInMap("TargetDBRevisionVersionCode")
    private String targetDBRevisionVersionCode;

    @Query
    @NameInMap("UpgradeLabel")
    private String upgradeLabel;

    @Query
    @NameInMap("UpgradePolicy")
    private String upgradePolicy;

    @Query
    @NameInMap("UpgradeType")
    private String upgradeType;

    private UpgradeDBClusterVersionRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.fromTimeService = builder.fromTimeService;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.plannedEndTime = builder.plannedEndTime;
        this.plannedStartTime = builder.plannedStartTime;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetDBRevisionVersionCode = builder.targetDBRevisionVersionCode;
        this.upgradeLabel = builder.upgradeLabel;
        this.upgradePolicy = builder.upgradePolicy;
        this.upgradeType = builder.upgradeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBClusterVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return fromTimeService
     */
    public Boolean getFromTimeService() {
        return this.fromTimeService;
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
     * @return targetDBRevisionVersionCode
     */
    public String getTargetDBRevisionVersionCode() {
        return this.targetDBRevisionVersionCode;
    }

    /**
     * @return upgradeLabel
     */
    public String getUpgradeLabel() {
        return this.upgradeLabel;
    }

    /**
     * @return upgradePolicy
     */
    public String getUpgradePolicy() {
        return this.upgradePolicy;
    }

    /**
     * @return upgradeType
     */
    public String getUpgradeType() {
        return this.upgradeType;
    }

    public static final class Builder extends Request.Builder<UpgradeDBClusterVersionRequest, Builder> {
        private String DBClusterId; 
        private Boolean fromTimeService; 
        private String ownerAccount; 
        private Long ownerId; 
        private String plannedEndTime; 
        private String plannedStartTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String targetDBRevisionVersionCode; 
        private String upgradeLabel; 
        private String upgradePolicy; 
        private String upgradeType; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBClusterVersionRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.fromTimeService = request.fromTimeService;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.plannedEndTime = request.plannedEndTime;
            this.plannedStartTime = request.plannedStartTime;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.targetDBRevisionVersionCode = request.targetDBRevisionVersionCode;
            this.upgradeLabel = request.upgradeLabel;
            this.upgradePolicy = request.upgradePolicy;
            this.upgradeType = request.upgradeType;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * FromTimeService.
         */
        public Builder fromTimeService(Boolean fromTimeService) {
            this.putQueryParameter("FromTimeService", fromTimeService);
            this.fromTimeService = fromTimeService;
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
         * The latest start time to run the task that updates the kernel version of the cluster. Specify the time in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.
         * <p>
         * 
         * > 
         * 
         * *   The value of this parameter must be at least 30 minutes later than the value of PlannedStartTime.
         * 
         * *   If you specify `PlannedStartTime` but do not specify PlannedEndTime, the latest start time of the task is `PlannedEndTime + 30 minutes`. For example, if you set `PlannedStartTime` to `2021-01-14T09:00:00Z` and do not specify PlannedEndTime, the latest start time of the task is set to `2021-01-14T09:30:00Z`.
         */
        public Builder plannedEndTime(String plannedEndTime) {
            this.putQueryParameter("PlannedEndTime", plannedEndTime);
            this.plannedEndTime = plannedEndTime;
            return this;
        }

        /**
         * The earliest start time to run the task that updates the kernel version of the cluster. Specify the time in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.
         * <p>
         * 
         * > 
         * 
         * *   The earliest start time of the task can be a point in time within the next 24 hours. For example, if the current time is `2021-01-14T09:00:00Z`, you can specify a point in time between `2021-01-14T09:00:00Z` and `2021-01-15T09:00:00Z`.
         * 
         * *   If you do not specify this parameter, the kernel update task runs immediately after you submit the request.
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
         * 目标版本的VersionCode，参数取值可从[DescribeDBClusterVersion](~~2319145~~)接口获取。
         */
        public Builder targetDBRevisionVersionCode(String targetDBRevisionVersionCode) {
            this.putQueryParameter("TargetDBRevisionVersionCode", targetDBRevisionVersionCode);
            this.targetDBRevisionVersionCode = targetDBRevisionVersionCode;
            return this;
        }

        /**
         * UpgradeLabel.
         */
        public Builder upgradeLabel(String upgradeLabel) {
            this.putQueryParameter("UpgradeLabel", upgradeLabel);
            this.upgradeLabel = upgradeLabel;
            return this;
        }

        /**
         * UpgradePolicy.
         */
        public Builder upgradePolicy(String upgradePolicy) {
            this.putQueryParameter("UpgradePolicy", upgradePolicy);
            this.upgradePolicy = upgradePolicy;
            return this;
        }

        /**
         * UpgradeType.
         */
        public Builder upgradeType(String upgradeType) {
            this.putQueryParameter("UpgradeType", upgradeType);
            this.upgradeType = upgradeType;
            return this;
        }

        @Override
        public UpgradeDBClusterVersionRequest build() {
            return new UpgradeDBClusterVersionRequest(this);
        } 

    } 

}
