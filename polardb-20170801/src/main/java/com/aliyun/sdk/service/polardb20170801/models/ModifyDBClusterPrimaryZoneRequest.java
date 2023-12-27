// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterPrimaryZoneRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterPrimaryZoneRequest</p>
 */
public class ModifyDBClusterPrimaryZoneRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("FromTimeService")
    private Boolean fromTimeService;

    @Query
    @NameInMap("IsSwitchOverForDisaster")
    private String isSwitchOverForDisaster;

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
    @NameInMap("VPCId")
    private String VPCId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private ModifyDBClusterPrimaryZoneRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.fromTimeService = builder.fromTimeService;
        this.isSwitchOverForDisaster = builder.isSwitchOverForDisaster;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.plannedEndTime = builder.plannedEndTime;
        this.plannedStartTime = builder.plannedStartTime;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterPrimaryZoneRequest create() {
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
     * @return isSwitchOverForDisaster
     */
    public String getIsSwitchOverForDisaster() {
        return this.isSwitchOverForDisaster;
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
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterPrimaryZoneRequest, Builder> {
        private String DBClusterId; 
        private Boolean fromTimeService; 
        private String isSwitchOverForDisaster; 
        private String ownerAccount; 
        private Long ownerId; 
        private String plannedEndTime; 
        private String plannedStartTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterPrimaryZoneRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.fromTimeService = request.fromTimeService;
            this.isSwitchOverForDisaster = request.isSwitchOverForDisaster;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.plannedEndTime = request.plannedEndTime;
            this.plannedStartTime = request.plannedStartTime;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * The ID of the cluster.
         * <p>
         * 
         * > You can call the [DescribeDBClusters](~~173433~~) operation to query information about all clusters that are deployed in a specified region, such as the cluster ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Specifies an immediate or scheduled task to switch the primary zone. Valid values:
         * <p>
         * 
         * *   false: scheduled task
         * *   true: immediate task
         */
        public Builder fromTimeService(Boolean fromTimeService) {
            this.putQueryParameter("FromTimeService", fromTimeService);
            this.fromTimeService = fromTimeService;
            return this;
        }

        /**
         * Specifies whether to switch back over to the original primary zone. Valid values: true: Switch over back to the original primary zone. false: Do not switch back over to the original primary zone. If this parameter is set to false, the primary zone of the cluster is changed to the specified destination zone.
         */
        public Builder isSwitchOverForDisaster(String isSwitchOverForDisaster) {
            this.putQueryParameter("IsSwitchOverForDisaster", isSwitchOverForDisaster);
            this.isSwitchOverForDisaster = isSwitchOverForDisaster;
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
         * The latest start time to switch the primary zone within the scheduled time period. Specify the time in the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.
         * <p>
         * 
         * > 
         * 
         * *   The latest start time must be at least 30 minutes later than the earliest start time.
         * 
         * *   If you specify the `PlannedStartTime` parameter but do not specify the PlannedEndTime parameter, the latest start time of the task is set to a value that is calculated by `the value of the PlannedEndTime parameter + 30 minutes` by default. For example, if you set the `PlannedStartTime` parameter to `2021-01-14T09:00:00Z` and you do not specify the PlannedEndTime parameter, the latest start time of the task is set to `2021-01-14T09:30:00Z`.
         */
        public Builder plannedEndTime(String plannedEndTime) {
            this.putQueryParameter("PlannedEndTime", plannedEndTime);
            this.plannedEndTime = plannedEndTime;
            return this;
        }

        /**
         * The earliest start time to switch the primary zone within the scheduled time period. Specify the time in the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.
         * <p>
         * 
         * > 
         * 
         * *   The earliest start time of the task can be a point in time within the next 24 hours. For example, if the current time is `2021-01-14T09:00:00Z`, you can specify a point in time that ranges from `2021-01-14T09:00:00Z` to `2021-01-15T09:00:00Z`.
         * 
         * *   If you left this parameter empty, the primary zone is immediately switched.
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
         * The virtual private cloud (VPC) ID of the destination primary zone.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * The ID of vSwitch in the destination primary zone.
         * <p>
         * 
         * > 
         * 
         * *   For a PolarDB for Oracle or PolarDB for PostgreSQL cluster, this parameter is required.
         * 
         * *   For a PolarDB for MySQL cluster: - This parameter is optional if no vSwitches have been created in the destination zone. The default vSwitch is used. - This parameter is required if a vSwitch has been created in the destination zone.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the destination primary zone.
         * <p>
         * 
         * > You can call the [DescribeRegions](~~98041~~) operation to query available zones.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ModifyDBClusterPrimaryZoneRequest build() {
            return new ModifyDBClusterPrimaryZoneRequest(this);
        } 

    } 

}
