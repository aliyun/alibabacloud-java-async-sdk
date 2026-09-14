// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link RestoreBranchRequest} extends {@link RequestModel}
 *
 * <p>RestoreBranchRequest</p>
 */
public class RestoreBranchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BranchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String branchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreserveUnderName")
    private String preserveUnderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceBranchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceBranchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceBranchLsn")
    private String sourceBranchLsn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceBranchTimestamp")
    private String sourceBranchTimestamp;

    private RestoreBranchRequest(Builder builder) {
        super(builder);
        this.branchId = builder.branchId;
        this.clientToken = builder.clientToken;
        this.preserveUnderName = builder.preserveUnderName;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.sourceBranchId = builder.sourceBranchId;
        this.sourceBranchLsn = builder.sourceBranchLsn;
        this.sourceBranchTimestamp = builder.sourceBranchTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreBranchRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return preserveUnderName
     */
    public String getPreserveUnderName() {
        return this.preserveUnderName;
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
     * @return sourceBranchId
     */
    public String getSourceBranchId() {
        return this.sourceBranchId;
    }

    /**
     * @return sourceBranchLsn
     */
    public String getSourceBranchLsn() {
        return this.sourceBranchLsn;
    }

    /**
     * @return sourceBranchTimestamp
     */
    public String getSourceBranchTimestamp() {
        return this.sourceBranchTimestamp;
    }

    public static final class Builder extends Request.Builder<RestoreBranchRequest, Builder> {
        private String branchId; 
        private String clientToken; 
        private String preserveUnderName; 
        private String projectId; 
        private String regionId; 
        private String sourceBranchId; 
        private String sourceBranchLsn; 
        private String sourceBranchTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(RestoreBranchRequest request) {
            super(request);
            this.branchId = request.branchId;
            this.clientToken = request.clientToken;
            this.preserveUnderName = request.preserveUnderName;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.sourceBranchId = request.sourceBranchId;
            this.sourceBranchLsn = request.sourceBranchLsn;
            this.sourceBranchTimestamp = request.sourceBranchTimestamp;
        } 

        /**
         * <p>The branch ID that uniquely identifies a Supabase branch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>br-xxxx</p>
         */
        public Builder branchId(String branchId) {
            this.putQueryParameter("BranchId", branchId);
            this.branchId = branchId;
            return this;
        }

        /**
         * <p>The client idempotency token that ensures the idempotence of retry requests.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426614174000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The backup branch name. If specified, automatic creation of a backup branch is performed before recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-main</p>
         */
        public Builder preserveUnderName(String preserveUnderName) {
            this.putQueryParameter("PreserveUnderName", preserveUnderName);
            this.preserveUnderName = preserveUnderName;
            return this;
        }

        /**
         * <p>The Supabase project ID associated with the primary branch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>spb-xxxx</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID. This parameter is required when you create a primary branch. When you create a sub-branch, the region is inherited from the primary branch by default.</p>
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
         * <p>The ID of the source branch from which to recover.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>br-main</p>
         */
        public Builder sourceBranchId(String sourceBranchId) {
            this.putQueryParameter("SourceBranchId", sourceBranchId);
            this.sourceBranchId = sourceBranchId;
            return this;
        }

        /**
         * <p>The LSN of the source branch to recover to.</p>
         * 
         * <strong>example:</strong>
         * <p>0/3522648</p>
         */
        public Builder sourceBranchLsn(String sourceBranchLsn) {
            this.putQueryParameter("SourceBranchLsn", sourceBranchLsn);
            this.sourceBranchLsn = sourceBranchLsn;
            return this;
        }

        /**
         * <p>The point in time of the source branch to recover to. The value must be within the recoverable time window.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-08T09:11:12Z</p>
         */
        public Builder sourceBranchTimestamp(String sourceBranchTimestamp) {
            this.putQueryParameter("SourceBranchTimestamp", sourceBranchTimestamp);
            this.sourceBranchTimestamp = sourceBranchTimestamp;
            return this;
        }

        @Override
        public RestoreBranchRequest build() {
            return new RestoreBranchRequest(this);
        } 

    } 

}
