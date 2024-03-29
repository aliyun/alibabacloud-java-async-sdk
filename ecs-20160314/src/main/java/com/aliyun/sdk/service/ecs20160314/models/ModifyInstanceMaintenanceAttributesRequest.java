// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceMaintenanceAttributesRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceMaintenanceAttributesRequest</p>
 */
public class ModifyInstanceMaintenanceAttributesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ActionOnMaintenance")
    private String actionOnMaintenance;

    @Query
    @NameInMap("InstanceId")
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("LiveMigration")
    private Boolean liveMigration;

    @Query
    @NameInMap("MaintenanceWindow")
    private java.util.List < MaintenanceWindow> maintenanceWindow;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyInstanceMaintenanceAttributesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.actionOnMaintenance = builder.actionOnMaintenance;
        this.instanceId = builder.instanceId;
        this.liveMigration = builder.liveMigration;
        this.maintenanceWindow = builder.maintenanceWindow;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceMaintenanceAttributesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return actionOnMaintenance
     */
    public String getActionOnMaintenance() {
        return this.actionOnMaintenance;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return liveMigration
     */
    public Boolean getLiveMigration() {
        return this.liveMigration;
    }

    /**
     * @return maintenanceWindow
     */
    public java.util.List < MaintenanceWindow> getMaintenanceWindow() {
        return this.maintenanceWindow;
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

    public static final class Builder extends Request.Builder<ModifyInstanceMaintenanceAttributesRequest, Builder> {
        private String sourceRegionId; 
        private String actionOnMaintenance; 
        private java.util.List < String > instanceId; 
        private Boolean liveMigration; 
        private java.util.List < MaintenanceWindow> maintenanceWindow; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceMaintenanceAttributesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.actionOnMaintenance = request.actionOnMaintenance;
            this.instanceId = request.instanceId;
            this.liveMigration = request.liveMigration;
            this.maintenanceWindow = request.maintenanceWindow;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ActionOnMaintenance.
         */
        public Builder actionOnMaintenance(String actionOnMaintenance) {
            this.putQueryParameter("ActionOnMaintenance", actionOnMaintenance);
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LiveMigration.
         */
        public Builder liveMigration(Boolean liveMigration) {
            this.putQueryParameter("LiveMigration", liveMigration);
            this.liveMigration = liveMigration;
            return this;
        }

        /**
         * MaintenanceWindow.
         */
        public Builder maintenanceWindow(java.util.List < MaintenanceWindow> maintenanceWindow) {
            this.putQueryParameter("MaintenanceWindow", maintenanceWindow);
            this.maintenanceWindow = maintenanceWindow;
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
         * RegionId.
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

        @Override
        public ModifyInstanceMaintenanceAttributesRequest build() {
            return new ModifyInstanceMaintenanceAttributesRequest(this);
        } 

    } 

    public static class MaintenanceWindow extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
        private String startTime;

        private MaintenanceWindow(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaintenanceWindow create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public MaintenanceWindow build() {
                return new MaintenanceWindow(this);
            } 

        } 

    }
}
