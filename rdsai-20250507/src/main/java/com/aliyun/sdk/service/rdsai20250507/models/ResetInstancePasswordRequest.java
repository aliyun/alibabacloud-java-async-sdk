// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ResetInstancePasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetInstancePasswordRequest</p>
 */
public class ResetInstancePasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BranchName")
    private String branchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DashboardPassword")
    private String dashboardPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasePassword")
    private String databasePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ResetInstancePasswordRequest(Builder builder) {
        super(builder);
        this.branchName = builder.branchName;
        this.dashboardPassword = builder.dashboardPassword;
        this.databasePassword = builder.databasePassword;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetInstancePasswordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branchName
     */
    public String getBranchName() {
        return this.branchName;
    }

    /**
     * @return dashboardPassword
     */
    public String getDashboardPassword() {
        return this.dashboardPassword;
    }

    /**
     * @return databasePassword
     */
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ResetInstancePasswordRequest, Builder> {
        private String branchName; 
        private String dashboardPassword; 
        private String databasePassword; 
        private String instanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResetInstancePasswordRequest request) {
            super(request);
            this.branchName = request.branchName;
            this.dashboardPassword = request.dashboardPassword;
            this.databasePassword = request.databasePassword;
            this.instanceName = request.instanceName;
            this.regionId = request.regionId;
        } 

        /**
         * BranchName.
         */
        public Builder branchName(String branchName) {
            this.putQueryParameter("BranchName", branchName);
            this.branchName = branchName;
            return this;
        }

        /**
         * <p>The Supabase Dashboard password.</p>
         * <p>The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>test_Password</p>
         */
        public Builder dashboardPassword(String dashboardPassword) {
            this.putQueryParameter("DashboardPassword", dashboardPassword);
            this.dashboardPassword = dashboardPassword;
            return this;
        }

        /**
         * <p>The RDS database access password.</p>
         * <p>The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and underscores (_).</p>
         * <blockquote>
         * <p>Notice: This password change also updates the access passwords of the following accounts on the associated PostgreSQL instance. These accounts are required by Supabase: postgres, supabase_admin, supabase_auth_admin, supabase_functions_admin, supabase_storage_admin, authenticator, pgbouncer.
         * </notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_Password</p>
         */
        public Builder databasePassword(String databasePassword) {
            this.putQueryParameter("DatabasePassword", databasePassword);
            this.databasePassword = databasePassword;
            return this;
        }

        /**
         * <p>The instance ID of the AI application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
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

        @Override
        public ResetInstancePasswordRequest build() {
            return new ResetInstancePasswordRequest(this);
        } 

    } 

}
