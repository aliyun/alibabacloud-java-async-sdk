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
        private String dashboardPassword; 
        private String databasePassword; 
        private String instanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResetInstancePasswordRequest request) {
            super(request);
            this.dashboardPassword = request.dashboardPassword;
            this.databasePassword = request.databasePassword;
            this.instanceName = request.instanceName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the RDS Supabase instance.</p>
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
         * <p>The Supabase Dashboard password.</p>
         * <p>The password must be 8 to 32 characters in length and must contain at least three of the following types: uppercase letters, lowercase letters, digits, and underscores (_).</p>
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
         * <p>The region ID.</p>
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
         * <p>The operation that you want to perform. Set the value to <strong>ResetInstancePassword</strong>.</p>
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
