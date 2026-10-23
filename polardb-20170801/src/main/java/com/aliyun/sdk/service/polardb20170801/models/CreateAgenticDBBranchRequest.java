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
 * {@link CreateAgenticDBBranchRequest} extends {@link RequestModel}
 *
 * <p>CreateAgenticDBBranchRequest</p>
 */
public class CreateAgenticDBBranchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BranchName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String branchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentBranchId")
    private String parentBranchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentTimestamp")
    private String parentTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private CreateAgenticDBBranchRequest(Builder builder) {
        super(builder);
        this.branchName = builder.branchName;
        this.DBClusterId = builder.DBClusterId;
        this.description = builder.description;
        this.parentBranchId = builder.parentBranchId;
        this.parentTimestamp = builder.parentTimestamp;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgenticDBBranchRequest create() {
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
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return parentBranchId
     */
    public String getParentBranchId() {
        return this.parentBranchId;
    }

    /**
     * @return parentTimestamp
     */
    public String getParentTimestamp() {
        return this.parentTimestamp;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateAgenticDBBranchRequest, Builder> {
        private String branchName; 
        private String DBClusterId; 
        private String description; 
        private String parentBranchId; 
        private String parentTimestamp; 
        private String projectId; 
        private String regionId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgenticDBBranchRequest request) {
            super(request);
            this.branchName = request.branchName;
            this.DBClusterId = request.DBClusterId;
            this.description = request.description;
            this.parentBranchId = request.parentBranchId;
            this.parentTimestamp = request.parentTimestamp;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The name of the branch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>feature-analytics</p>
         */
        public Builder branchName(String branchName) {
            this.putQueryParameter("BranchName", branchName);
            this.branchName = branchName;
            return this;
        }

        /**
         * <p>The AgenticDB cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pagc-bp1abcdef1234567</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Feature branch for analytics</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the parent branch. By default, the branch is derived from the main branch.</p>
         * 
         * <strong>example:</strong>
         * <p>br-1a2b3c4d5e6f</p>
         */
        public Builder parentBranchId(String parentBranchId) {
            this.putQueryParameter("ParentBranchId", parentBranchId);
            this.parentBranchId = parentBranchId;
            return this;
        }

        /**
         * <p>Creates the branch based on the data of the parent branch at the specified point in time. If you do not specify this parameter, the latest data is used. The value must be in RFC 3339 format with a time zone and support up to nine fractional digits for seconds. Empty strings and future times are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-15T07:32:00.123456Z</p>
         */
        public Builder parentTimestamp(String parentTimestamp) {
            this.putQueryParameter("ParentTimestamp", parentTimestamp);
            this.parentTimestamp = parentTimestamp;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>proj-a1b2c3d4e5f6</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
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
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t-4b83e0da66674951</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateAgenticDBBranchRequest build() {
            return new CreateAgenticDBBranchRequest(this);
        } 

    } 

}
