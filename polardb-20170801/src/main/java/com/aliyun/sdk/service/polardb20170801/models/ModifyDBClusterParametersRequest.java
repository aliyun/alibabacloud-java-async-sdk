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
 * {@link ModifyDBClusterParametersRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterParametersRequest</p>
 */
public class ModifyDBClusterParametersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClearBinlog")
    private Boolean clearBinlog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

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

    private ModifyDBClusterParametersRequest(Builder builder) {
        super(builder);
        this.clearBinlog = builder.clearBinlog;
        this.DBClusterId = builder.DBClusterId;
        this.fromTimeService = builder.fromTimeService;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.parameterGroupId = builder.parameterGroupId;
        this.parameters = builder.parameters;
        this.plannedEndTime = builder.plannedEndTime;
        this.plannedStartTime = builder.plannedStartTime;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterParametersRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyDBClusterParametersRequest, Builder> {
        private Boolean clearBinlog; 
        private String DBClusterId; 
        private Boolean fromTimeService; 
        private String ownerAccount; 
        private Long ownerId; 
        private String parameterGroupId; 
        private String parameters; 
        private String plannedEndTime; 
        private String plannedStartTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterParametersRequest request) {
            super(request);
            this.clearBinlog = request.clearBinlog;
            this.DBClusterId = request.DBClusterId;
            this.fromTimeService = request.fromTimeService;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.parameterGroupId = request.parameterGroupId;
            this.parameters = request.parameters;
            this.plannedEndTime = request.plannedEndTime;
            this.plannedStartTime = request.plannedStartTime;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>Specifies whether to clear binlogs. This parameter takes effect only when binlog is disabled.</p>
         */
        public Builder clearBinlog(Boolean clearBinlog) {
            this.putQueryParameter("ClearBinlog", clearBinlog);
            this.clearBinlog = clearBinlog;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query information about all clusters in the specified region, including cluster IDs.</p>
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
         * <p>Specifies whether to immediately or schedule the parameter modification and cluster restart. Valid values:  </p>
         * <ul>
         * <li><p>false (default): Scheduled execution.</p>
         * </li>
         * <li><p>true: Immediate execution.</p>
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
         * <p>The parameter template ID.</p>
         * <blockquote>
         * <ul>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/207178.html">DescribeParameterGroups</a> operation to query the parameter template ID.</li>
         * <li>You must specify either this parameter or the <code>Parameters</code> parameter.</li>
         * <li>Only PolarDB for MySQL supports this parameter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pcpg-**************</p>
         */
        public Builder parameterGroupId(String parameterGroupId) {
            this.putQueryParameter("ParameterGroupId", parameterGroupId);
            this.parameterGroupId = parameterGroupId;
            return this;
        }

        /**
         * <p>A JSON string that consists of parameters and their values. Parameter values are of the STRING type. Example: <code>{&quot;wait_timeout&quot;:&quot;86&quot;,&quot;innodb_old_blocks_time&quot;:&quot;10&quot;}</code>.</p>
         * <blockquote>
         * <ul>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/98122.html">DescribeDBClusterParameters</a> operation to query the parameters of a PolarDB cluster.</li>
         * <li>If the cluster runs PolarDB for PostgreSQL or PolarDB for PostgreSQL (Compatible with Oracle), this parameter is required.</li>
         * <li>If the cluster runs PolarDB for MySQL, you must specify either this parameter or the <code>ParameterGroupId</code> parameter.</li>
         * </ul>
         * </blockquote>
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
         * <p>The latest time to start running the scheduled task. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
         * <blockquote>
         * <ul>
         * <li>The latest time must be at least 30 minutes later than the start time.</li>
         * <li>If you specify <code>PlannedStartTime</code> but do not specify this parameter, the latest time defaults to <code>start time + 30 minutes</code>. For example, if <code>PlannedStartTime</code> is set to <code>2021-01-14T09:00:00Z</code> and this parameter is left empty, the task starts no later than <code>2021-01-14T09:30:00Z</code>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-04-28T14:30:00Z</p>
         */
        public Builder plannedEndTime(String plannedEndTime) {
            this.putQueryParameter("PlannedEndTime", plannedEndTime);
            this.plannedEndTime = plannedEndTime;
            return this;
        }

        /**
         * <p>The earliest time to start running the scheduled task within the specified time range. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
         * <blockquote>
         * <ul>
         * <li>The start time must be within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, the start time can range from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</li>
         * <li>If this parameter is left empty, the task is immediately executed.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-04-28T14:00:00Z</p>
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

        @Override
        public ModifyDBClusterParametersRequest build() {
            return new ModifyDBClusterParametersRequest(this);
        } 

    } 

}
