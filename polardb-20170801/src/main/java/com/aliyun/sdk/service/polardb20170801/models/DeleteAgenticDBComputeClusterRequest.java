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
 * {@link DeleteAgenticDBComputeClusterRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgenticDBComputeClusterRequest</p>
 */
public class DeleteAgenticDBComputeClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BranchId")
    private String branchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeClusterId")
    private String computeClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private DeleteAgenticDBComputeClusterRequest(Builder builder) {
        super(builder);
        this.branchId = builder.branchId;
        this.computeClusterId = builder.computeClusterId;
        this.DBClusterId = builder.DBClusterId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgenticDBComputeClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branchId
     */
    public String getBranchId() {
        return this.branchId;
    }

    /**
     * @return computeClusterId
     */
    public String getComputeClusterId() {
        return this.computeClusterId;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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

    public static final class Builder extends Request.Builder<DeleteAgenticDBComputeClusterRequest, Builder> {
        private String branchId; 
        private String computeClusterId; 
        private String DBClusterId; 
        private String projectId; 
        private String regionId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgenticDBComputeClusterRequest request) {
            super(request);
            this.branchId = request.branchId;
            this.computeClusterId = request.computeClusterId;
            this.DBClusterId = request.DBClusterId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The branch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>br-69f762b1a44f49c487d64b9e71</p>
         */
        public Builder branchId(String branchId) {
            this.putQueryParameter("BranchId", branchId);
            this.branchId = branchId;
            return this;
        }

        /**
         * <p>The branch compute cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-g0lsayq8c5qe</p>
         */
        public Builder computeClusterId(String computeClusterId) {
            this.putQueryParameter("ComputeClusterId", computeClusterId);
            this.computeClusterId = computeClusterId;
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
         * <p>The project ID to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>proj-7140b4c74b3a44978c825bac77</p>
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
         * 
         * <strong>example:</strong>
         * <p>t-51121616fa9e43e98cc90e4afa</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DeleteAgenticDBComputeClusterRequest build() {
            return new DeleteAgenticDBComputeClusterRequest(this);
        } 

    } 

}
