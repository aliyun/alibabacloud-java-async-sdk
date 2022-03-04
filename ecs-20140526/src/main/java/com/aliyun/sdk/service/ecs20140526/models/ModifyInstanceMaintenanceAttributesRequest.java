// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("MaintenanceWindow")
    private java.util.List < MaintenanceWindow> maintenanceWindow;

    @Query
    @NameInMap("InstanceId")
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("NotifyOnMaintenance")
    private Boolean notifyOnMaintenance;

    @Query
    @NameInMap("ActionOnMaintenance")
    private String actionOnMaintenance;

    private ModifyInstanceMaintenanceAttributesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.maintenanceWindow = builder.maintenanceWindow;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.notifyOnMaintenance = builder.notifyOnMaintenance;
        this.actionOnMaintenance = builder.actionOnMaintenance;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return maintenanceWindow
     */
    public java.util.List < MaintenanceWindow> getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return notifyOnMaintenance
     */
    public Boolean getNotifyOnMaintenance() {
        return this.notifyOnMaintenance;
    }

    /**
     * @return actionOnMaintenance
     */
    public String getActionOnMaintenance() {
        return this.actionOnMaintenance;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceMaintenanceAttributesRequest, Builder> {
        private String sourceRegionId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private java.util.List < MaintenanceWindow> maintenanceWindow; 
        private java.util.List < String > instanceId; 
        private String regionId; 
        private Boolean notifyOnMaintenance; 
        private String actionOnMaintenance; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceMaintenanceAttributesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ownerAccount = request.ownerAccount;
            this.maintenanceWindow = request.maintenanceWindow;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.notifyOnMaintenance = request.notifyOnMaintenance;
            this.actionOnMaintenance = request.actionOnMaintenance;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * The ID of the instance. Valid values of N: 1 to 100
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to send event notifications before instance downtime. Valid values:
         * <p>
         * 
         * -true: sends an event notification.
         * -false: no event notification is sent.
         * 
         * Default value: false
         */
        public Builder notifyOnMaintenance(Boolean notifyOnMaintenance) {
            this.putQueryParameter("NotifyOnMaintenance", notifyOnMaintenance);
            this.notifyOnMaintenance = notifyOnMaintenance;
            return this;
        }

        /**
         * The maintenance action. Valid values:
         * <p>
         * 
         * -Stop: the stopped state (that is, the downtime).
         * -AutoRecover: automatic recovery.
         * -AutoRedeploy: data disks are damaged due to downtime migration.
         */
        public Builder actionOnMaintenance(String actionOnMaintenance) {
            this.putQueryParameter("ActionOnMaintenance", actionOnMaintenance);
            this.actionOnMaintenance = actionOnMaintenance;
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
             * 维护时间窗口结束时间。必须为整小时，不允许设置分、秒。开始时间和结束时间必须同时设置，并且结束时间与开始时间需要间隔1~23个整小时。采用UTC +8时区，格式为`HH:mm:ss`。N的取值为1，只支持设置1个时间窗口。
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 维护时间窗口开始时间。必须为整小时，不允许设置分、秒。开始时间和结束时间必须同时设置，并且结束时间与开始时间需要间隔1~23个整小时。采用UTC +8时区，格式为`HH:mm:ss`。N的取值为1，只支持设置1个时间窗口。
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
