// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterServerlessConfRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterServerlessConfRequest</p>
 */
public class ModifyDBClusterServerlessConfRequest extends Request {
    @Query
    @NameInMap("AllowShutDown")
    private String allowShutDown;

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
    @NameInMap("ScaleApRoNumMax")
    private String scaleApRoNumMax;

    @Query
    @NameInMap("ScaleApRoNumMin")
    private String scaleApRoNumMin;

    @Query
    @NameInMap("ScaleMax")
    private String scaleMax;

    @Query
    @NameInMap("ScaleMin")
    private String scaleMin;

    @Query
    @NameInMap("ScaleRoNumMax")
    private String scaleRoNumMax;

    @Query
    @NameInMap("ScaleRoNumMin")
    private String scaleRoNumMin;

    @Query
    @NameInMap("SecondsUntilAutoPause")
    private String secondsUntilAutoPause;

    private ModifyDBClusterServerlessConfRequest(Builder builder) {
        super(builder);
        this.allowShutDown = builder.allowShutDown;
        this.DBClusterId = builder.DBClusterId;
        this.fromTimeService = builder.fromTimeService;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.plannedEndTime = builder.plannedEndTime;
        this.plannedStartTime = builder.plannedStartTime;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scaleApRoNumMax = builder.scaleApRoNumMax;
        this.scaleApRoNumMin = builder.scaleApRoNumMin;
        this.scaleMax = builder.scaleMax;
        this.scaleMin = builder.scaleMin;
        this.scaleRoNumMax = builder.scaleRoNumMax;
        this.scaleRoNumMin = builder.scaleRoNumMin;
        this.secondsUntilAutoPause = builder.secondsUntilAutoPause;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterServerlessConfRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowShutDown
     */
    public String getAllowShutDown() {
        return this.allowShutDown;
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
     * @return scaleApRoNumMax
     */
    public String getScaleApRoNumMax() {
        return this.scaleApRoNumMax;
    }

    /**
     * @return scaleApRoNumMin
     */
    public String getScaleApRoNumMin() {
        return this.scaleApRoNumMin;
    }

    /**
     * @return scaleMax
     */
    public String getScaleMax() {
        return this.scaleMax;
    }

    /**
     * @return scaleMin
     */
    public String getScaleMin() {
        return this.scaleMin;
    }

    /**
     * @return scaleRoNumMax
     */
    public String getScaleRoNumMax() {
        return this.scaleRoNumMax;
    }

    /**
     * @return scaleRoNumMin
     */
    public String getScaleRoNumMin() {
        return this.scaleRoNumMin;
    }

    /**
     * @return secondsUntilAutoPause
     */
    public String getSecondsUntilAutoPause() {
        return this.secondsUntilAutoPause;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterServerlessConfRequest, Builder> {
        private String allowShutDown; 
        private String DBClusterId; 
        private Boolean fromTimeService; 
        private String ownerAccount; 
        private Long ownerId; 
        private String plannedEndTime; 
        private String plannedStartTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scaleApRoNumMax; 
        private String scaleApRoNumMin; 
        private String scaleMax; 
        private String scaleMin; 
        private String scaleRoNumMax; 
        private String scaleRoNumMin; 
        private String secondsUntilAutoPause; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterServerlessConfRequest request) {
            super(request);
            this.allowShutDown = request.allowShutDown;
            this.DBClusterId = request.DBClusterId;
            this.fromTimeService = request.fromTimeService;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.plannedEndTime = request.plannedEndTime;
            this.plannedStartTime = request.plannedStartTime;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scaleApRoNumMax = request.scaleApRoNumMax;
            this.scaleApRoNumMin = request.scaleApRoNumMin;
            this.scaleMax = request.scaleMax;
            this.scaleMin = request.scaleMin;
            this.scaleRoNumMax = request.scaleRoNumMax;
            this.scaleRoNumMin = request.scaleRoNumMin;
            this.secondsUntilAutoPause = request.secondsUntilAutoPause;
        } 

        /**
         * Specifies whether to enable No-activity Suspension. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder allowShutDown(String allowShutDown) {
            this.putQueryParameter("AllowShutDown", allowShutDown);
            this.allowShutDown = allowShutDown;
            return this;
        }

        /**
         * The ID of the serverless cluster.
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
         * PlannedEndTime.
         */
        public Builder plannedEndTime(String plannedEndTime) {
            this.putQueryParameter("PlannedEndTime", plannedEndTime);
            this.plannedEndTime = plannedEndTime;
            return this;
        }

        /**
         * PlannedStartTime.
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
         * ScaleApRoNumMax.
         */
        public Builder scaleApRoNumMax(String scaleApRoNumMax) {
            this.putQueryParameter("ScaleApRoNumMax", scaleApRoNumMax);
            this.scaleApRoNumMax = scaleApRoNumMax;
            return this;
        }

        /**
         * ScaleApRoNumMin.
         */
        public Builder scaleApRoNumMin(String scaleApRoNumMin) {
            this.putQueryParameter("ScaleApRoNumMin", scaleApRoNumMin);
            this.scaleApRoNumMin = scaleApRoNumMin;
            return this;
        }

        /**
         * The maximum number of PCUs per node for scaling. Valid values: 1 PCU to 32 PCUs.
         */
        public Builder scaleMax(String scaleMax) {
            this.putQueryParameter("ScaleMax", scaleMax);
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * The minimum number of PCUs per node for scaling. Valid values: 1 PCU to 31 PCUs.
         */
        public Builder scaleMin(String scaleMin) {
            this.putQueryParameter("ScaleMin", scaleMin);
            this.scaleMin = scaleMin;
            return this;
        }

        /**
         * The maximum number of read-only nodes for scaling. Valid values: 0 to 15.
         */
        public Builder scaleRoNumMax(String scaleRoNumMax) {
            this.putQueryParameter("ScaleRoNumMax", scaleRoNumMax);
            this.scaleRoNumMax = scaleRoNumMax;
            return this;
        }

        /**
         * The minimum number of read-only nodes for scaling. Valid values: 0 to 15.
         */
        public Builder scaleRoNumMin(String scaleRoNumMin) {
            this.putQueryParameter("ScaleRoNumMin", scaleRoNumMin);
            this.scaleRoNumMin = scaleRoNumMin;
            return this;
        }

        /**
         * The detection period for No-activity Suspension. Valid values: 5 to 1440. Unit: minutes. The detection duration must be a multiple of 5 minutes.
         */
        public Builder secondsUntilAutoPause(String secondsUntilAutoPause) {
            this.putQueryParameter("SecondsUntilAutoPause", secondsUntilAutoPause);
            this.secondsUntilAutoPause = secondsUntilAutoPause;
            return this;
        }

        @Override
        public ModifyDBClusterServerlessConfRequest build() {
            return new ModifyDBClusterServerlessConfRequest(this);
        } 

    } 

}
