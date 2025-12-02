// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ModifyMaterializedViewRequest} extends {@link RequestModel}
 *
 * <p>ModifyMaterializedViewRequest</p>
 */
public class ModifyMaterializedViewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableDelayAlert")
    private Boolean enableDelayAlert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableFailureAlert")
    private Boolean enableFailureAlert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LatencyTolerance")
    private Integer latencyTolerance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryWrite")
    private Boolean queryWrite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ViewName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String viewName;

    private ModifyMaterializedViewRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.dbName = builder.dbName;
        this.enableDelayAlert = builder.enableDelayAlert;
        this.enableFailureAlert = builder.enableFailureAlert;
        this.groupName = builder.groupName;
        this.latencyTolerance = builder.latencyTolerance;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.queryWrite = builder.queryWrite;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.viewName = builder.viewName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMaterializedViewRequest create() {
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
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return enableDelayAlert
     */
    public Boolean getEnableDelayAlert() {
        return this.enableDelayAlert;
    }

    /**
     * @return enableFailureAlert
     */
    public Boolean getEnableFailureAlert() {
        return this.enableFailureAlert;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return latencyTolerance
     */
    public Integer getLatencyTolerance() {
        return this.latencyTolerance;
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
     * @return queryWrite
     */
    public Boolean getQueryWrite() {
        return this.queryWrite;
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

    /**
     * @return viewName
     */
    public String getViewName() {
        return this.viewName;
    }

    public static final class Builder extends Request.Builder<ModifyMaterializedViewRequest, Builder> {
        private String DBClusterId; 
        private String dbName; 
        private Boolean enableDelayAlert; 
        private Boolean enableFailureAlert; 
        private String groupName; 
        private Integer latencyTolerance; 
        private String ownerAccount; 
        private Long ownerId; 
        private Boolean queryWrite; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String viewName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMaterializedViewRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.dbName = request.dbName;
            this.enableDelayAlert = request.enableDelayAlert;
            this.enableFailureAlert = request.enableFailureAlert;
            this.groupName = request.groupName;
            this.latencyTolerance = request.latencyTolerance;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.queryWrite = request.queryWrite;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.viewName = request.viewName;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-******</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the database where the materialized view resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myDB</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>Enable the refresh delay alert. Valid values:</p>
         * <ul>
         * <li>true: Enables alert.</li>
         * <li>false: Disables alert.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableDelayAlert(Boolean enableDelayAlert) {
            this.putQueryParameter("EnableDelayAlert", enableDelayAlert);
            this.enableDelayAlert = enableDelayAlert;
            return this;
        }

        /**
         * <p>Specifies whether to send alerts when the refresh task fails. Valid values:</p>
         * <ul>
         * <li>true: Send alerts.</li>
         * <li>false: Alerts disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableFailureAlert(Boolean enableFailureAlert) {
            this.putQueryParameter("EnableFailureAlert", enableFailureAlert);
            this.enableFailureAlert = enableFailureAlert;
            return this;
        }

        /**
         * <p>The name of the resource group to which the materialized view is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>res_1</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>Refresh delay tolerance (in minutes).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder latencyTolerance(Integer latencyTolerance) {
            this.putQueryParameter("LatencyTolerance", latencyTolerance);
            this.latencyTolerance = latencyTolerance;
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
         * <p>Specifies whether to enable query rewrite. Valid values:</p>
         * <ul>
         * <li>true: Enables query rewrite.</li>
         * <li>false: Disables query rewrite.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder queryWrite(Boolean queryWrite) {
            this.putQueryParameter("QueryWrite", queryWrite);
            this.queryWrite = queryWrite;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
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

        /**
         * <p>The name of the materialized view.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mv_1</p>
         */
        public Builder viewName(String viewName) {
            this.putQueryParameter("ViewName", viewName);
            this.viewName = viewName;
            return this;
        }

        @Override
        public ModifyMaterializedViewRequest build() {
            return new ModifyMaterializedViewRequest(this);
        } 

    } 

}
