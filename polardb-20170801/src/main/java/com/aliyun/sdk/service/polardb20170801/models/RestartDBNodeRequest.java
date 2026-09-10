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
 * {@link RestartDBNodeRequest} extends {@link RequestModel}
 *
 * <p>RestartDBNodeRequest</p>
 */
public class RestartDBNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBNodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromTimeService")
    private String fromTimeService;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private RestartDBNodeRequest(Builder builder) {
        super(builder);
        this.DBNodeId = builder.DBNodeId;
        this.fromTimeService = builder.fromTimeService;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.plannedEndTime = builder.plannedEndTime;
        this.plannedStartTime = builder.plannedStartTime;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartDBNodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBNodeId
     */
    public String getDBNodeId() {
        return this.DBNodeId;
    }

    /**
     * @return fromTimeService
     */
    public String getFromTimeService() {
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

    public static final class Builder extends Request.Builder<RestartDBNodeRequest, Builder> {
        private String DBNodeId; 
        private String fromTimeService; 
        private String ownerAccount; 
        private Long ownerId; 
        private String plannedEndTime; 
        private String plannedStartTime; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(RestartDBNodeRequest request) {
            super(request);
            this.DBNodeId = request.DBNodeId;
            this.fromTimeService = request.fromTimeService;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.plannedEndTime = request.plannedEndTime;
            this.plannedStartTime = request.plannedStartTime;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the cluster node.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/185342.html">DescribeDBClusters</a> operation to query the details of all clusters under your account, including node IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-*************</p>
         */
        public Builder DBNodeId(String DBNodeId) {
            this.putQueryParameter("DBNodeId", DBNodeId);
            this.DBNodeId = DBNodeId;
            return this;
        }

        /**
         * <p>Specifies whether to restart the node immediately or at a scheduled time. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong> (default): The node is restarted at a scheduled time.</p>
         * </li>
         * <li><p><strong>true</strong>: The node is restarted immediately.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fromTimeService(String fromTimeService) {
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
         * <p>The latest time to start the scheduled task. The time must be in the <code>YYYY-MM-DDThh:mm:ssZ</code> format and in UTC.</p>
         * <blockquote>
         * <ul>
         * <li><p>The latest time must be at least 30 minutes later than the earliest time.</p>
         * </li>
         * <li><p>If PlannedStartTime is specified but this parameter is not, the latest start time of the task is PlannedStartTime plus 30 minutes by default. For example, if PlannedStartTime is set to <code>2021-01-14T09:00:00Z</code> and this parameter is empty, the task starts no later than <code>2021-01-14T09:30:00Z</code>.</p>
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
         * <p>The earliest time to start the scheduled node restart. The task is executed within a specified time window. The time must be in the <code>YYYY-MM-DDThh:mm:ssZ</code> format and in UTC.</p>
         * <blockquote>
         * <ul>
         * <li><p>The start time can be set to any point in time within the next 72 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, the start time can be set to a value in the range from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-17T09:00:00Z</code>.</p>
         * </li>
         * <li><p>If this parameter is empty, the node is restarted immediately.</p>
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
         * <p>The region ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the available regions.</p>
         * </blockquote>
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

        @Override
        public RestartDBNodeRequest build() {
            return new RestartDBNodeRequest(this);
        } 

    } 

}
