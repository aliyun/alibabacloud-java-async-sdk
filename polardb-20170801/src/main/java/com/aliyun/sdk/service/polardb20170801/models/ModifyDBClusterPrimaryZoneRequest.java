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
 * {@link ModifyDBClusterPrimaryZoneRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterPrimaryZoneRequest</p>
 */
public class ModifyDBClusterPrimaryZoneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromTimeService")
    private Boolean fromTimeService;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSwitchOverForDisaster")
    private String isSwitchOverForDisaster;

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
    @com.aliyun.core.annotation.NameInMap("PlannedStartTime")
    private String plannedStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneType")
    private String zoneType;

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
        this.zoneType = builder.zoneType;
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

    /**
     * @return zoneType
     */
    public String getZoneType() {
        return this.zoneType;
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
        private String zoneType; 

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
            this.zoneType = request.zoneType;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/173433.html">DescribeDBClusters</a> operation to query the details of all clusters in a destination region, including their cluster IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to perform the zone change immediately or at a scheduled time. Valid values:</p>
         * <ul>
         * <li><p>false (default): The zone change is performed at the scheduled time.</p>
         * </li>
         * <li><p>true: The zone change is performed immediately.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fromTimeService(Boolean fromTimeService) {
            this.putQueryParameter("FromTimeService", fromTimeService);
            this.fromTimeService = fromTimeService;
            return this;
        }

        /**
         * <p>Specifies whether to fail back to the original zone. Valid values:</p>
         * <ul>
         * <li><p>true: Fails back to the original zone.</p>
         * </li>
         * <li><p>false: Does not fail back to the original zone.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The latest time to start the scheduled task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
         * <blockquote>
         * <ul>
         * <li><p>The latest start time must be at least 30 minutes later than the earliest start time.</p>
         * </li>
         * <li><p>If you specify <code>PlannedStartTime</code> but not this parameter, the latest start time of the task is the value of <code>PlannedStartTime</code> plus 30 minutes by default. For example, if you set <code>PlannedStartTime</code> to <code>2021-01-14T09:00:00Z</code> and leave this parameter empty, the task starts no later than <code>2021-01-14T09:30:00Z</code>.</p>
         * </li>
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
         * <p>The earliest time to start the scheduled task to change the zone. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
         * <blockquote>
         * <ul>
         * <li><p>The start time must be a point in time within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, you can set the start time to a value from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</p>
         * </li>
         * <li><p>If you do not specify this parameter, the zone change task is performed immediately.</p>
         * </li>
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
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-**********</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch in the destination zone.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter is required for PolarDB for Oracle and PolarDB for PostgreSQL clusters.</p>
         * </li>
         * <li><p>For PolarDB for MySQL clusters, this parameter is required if a vSwitch is created in the destination zone. If no vSwitch is created, the default vSwitch is used and this parameter is optional.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-**************</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the new zone.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available zones.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>The type of the zone. Valid values:</p>
         * <ul>
         * <li><p><strong>Primary</strong>: The primary zone.</p>
         * </li>
         * <li><p><strong>Standby</strong>: The secondary zone.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        public Builder zoneType(String zoneType) {
            this.putQueryParameter("ZoneType", zoneType);
            this.zoneType = zoneType;
            return this;
        }

        @Override
        public ModifyDBClusterPrimaryZoneRequest build() {
            return new ModifyDBClusterPrimaryZoneRequest(this);
        } 

    } 

}
