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
 * {@link ModifyDBClusterAndNodesParametersRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterAndNodesParametersRequest</p>
 */
public class ModifyDBClusterAndNodesParametersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClearBinlog")
    private Boolean clearBinlog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeIds")
    private String DBNodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromTimeService")
    private Boolean fromTimeService;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterGroupId")
    private String parameterGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private String parameters;

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
    @com.aliyun.core.annotation.NameInMap("StandbyClusterIdListNeedToSync")
    private String standbyClusterIdListNeedToSync;

    private ModifyDBClusterAndNodesParametersRequest(Builder builder) {
        super(builder);
        this.clearBinlog = builder.clearBinlog;
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeIds = builder.DBNodeIds;
        this.fromTimeService = builder.fromTimeService;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.parameterGroupId = builder.parameterGroupId;
        this.parameters = builder.parameters;
        this.plannedEndTime = builder.plannedEndTime;
        this.plannedStartTime = builder.plannedStartTime;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.standbyClusterIdListNeedToSync = builder.standbyClusterIdListNeedToSync;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterAndNodesParametersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clearBinlog
     */
    public Boolean getClearBinlog() {
        return this.clearBinlog;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBNodeIds
     */
    public String getDBNodeIds() {
        return this.DBNodeIds;
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
     * @return parameterGroupId
     */
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
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
     * @return standbyClusterIdListNeedToSync
     */
    public String getStandbyClusterIdListNeedToSync() {
        return this.standbyClusterIdListNeedToSync;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterAndNodesParametersRequest, Builder> {
        private Boolean clearBinlog; 
        private String DBClusterId; 
        private String DBNodeIds; 
        private Boolean fromTimeService; 
        private String ownerAccount; 
        private Long ownerId; 
        private String parameterGroupId; 
        private String parameters; 
        private String plannedEndTime; 
        private String plannedStartTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String standbyClusterIdListNeedToSync; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterAndNodesParametersRequest request) {
            super(request);
            this.clearBinlog = request.clearBinlog;
            this.DBClusterId = request.DBClusterId;
            this.DBNodeIds = request.DBNodeIds;
            this.fromTimeService = request.fromTimeService;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.parameterGroupId = request.parameterGroupId;
            this.parameters = request.parameters;
            this.plannedEndTime = request.plannedEndTime;
            this.plannedStartTime = request.plannedStartTime;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.standbyClusterIdListNeedToSync = request.standbyClusterIdListNeedToSync;
        } 

        /**
         * <p>Specifies whether to clear binlog. This parameter is valid only when binlog is disabled.</p>
         */
        public Builder clearBinlog(Boolean clearBinlog) {
            this.putQueryParameter("ClearBinlog", clearBinlog);
            this.clearBinlog = clearBinlog;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**********</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The IDs of the nodes. By setting this parameter, you can modify the parameters of the cluster and specified nodes. Separate multiple node IDs with commas (,).</p>
         * <blockquote>
         * <p>If this parameter is not specified, only the cluster parameters are modified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-<strong><strong><strong><strong><strong>,pi-</strong></strong></strong></strong></strong></p>
         */
        public Builder DBNodeIds(String DBNodeIds) {
            this.putQueryParameter("DBNodeIds", DBNodeIds);
            this.DBNodeIds = DBNodeIds;
            return this;
        }

        /**
         * <p>Specifies whether to immediately or scheduledly modify parameters and restart the cluster. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong> (default): scheduled execution</p>
         * </li>
         * <li><p><strong>true</strong>: immediate execution</p>
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
         * <p>The ID of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>pcpg-**********</p>
         */
        public Builder parameterGroupId(String parameterGroupId) {
            this.putQueryParameter("ParameterGroupId", parameterGroupId);
            this.parameterGroupId = parameterGroupId;
            return this;
        }

        /**
         * <p>The JSON string that consists of parameters and their values.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;wait_timeout&quot;:&quot;86&quot;,&quot;innodb_old_blocks_time&quot;:&quot;10&quot;}</p>
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The latest time to start the scheduled task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
         * <blockquote>
         * <ul>
         * <li><p>The latest start time must be 30 minutes or more later than the earliest start time.</p>
         * </li>
         * <li><p>If you specify <code>PlannedStartTime</code> but not this parameter, the latest start time of the task is <code>the earliest start time + 30 minutes</code> by default. For example, if you set <code>PlannedStartTime</code> to <code>2021-01-14T09:00:00Z</code> and leave this parameter empty, the task will start no later than <code>2021-01-14T09:30:00Z</code>.</p>
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
         * <p>The earliest time to start the scheduled task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
         * <blockquote>
         * <ul>
         * <li><p>The start time can be any time within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, you can specify a time that ranges from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</p>
         * </li>
         * <li><p>If you leave this parameter empty, the task is immediately executed.</p>
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
         * <p>The list of GDN standby clusters to which you want to synchronize the parameter settings.</p>
         * 
         * <strong>example:</strong>
         * <p>gdn-<strong><strong><strong><strong><strong>,gdn-</strong></strong></strong></strong></strong></p>
         */
        public Builder standbyClusterIdListNeedToSync(String standbyClusterIdListNeedToSync) {
            this.putQueryParameter("StandbyClusterIdListNeedToSync", standbyClusterIdListNeedToSync);
            this.standbyClusterIdListNeedToSync = standbyClusterIdListNeedToSync;
            return this;
        }

        @Override
        public ModifyDBClusterAndNodesParametersRequest build() {
            return new ModifyDBClusterAndNodesParametersRequest(this);
        } 

    } 

}
