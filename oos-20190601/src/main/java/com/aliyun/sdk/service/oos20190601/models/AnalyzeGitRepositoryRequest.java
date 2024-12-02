// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AnalyzeGitRepositoryRequest} extends {@link RequestModel}
 *
 * <p>AnalyzeGitRepositoryRequest</p>
 */
public class AnalyzeGitRepositoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Branch")
    private String branch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgId")
    private String orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoFullName")
    private String repoFullName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoId")
    private String repoId;

    private AnalyzeGitRepositoryRequest(Builder builder) {
        super(builder);
        this.branch = builder.branch;
        this.clientToken = builder.clientToken;
        this.orgId = builder.orgId;
        this.owner = builder.owner;
        this.platform = builder.platform;
        this.regionId = builder.regionId;
        this.repoFullName = builder.repoFullName;
        this.repoId = builder.repoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalyzeGitRepositoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branch
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repoFullName
     */
    public String getRepoFullName() {
        return this.repoFullName;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    public static final class Builder extends Request.Builder<AnalyzeGitRepositoryRequest, Builder> {
        private String branch; 
        private String clientToken; 
        private String orgId; 
        private String owner; 
        private String platform; 
        private String regionId; 
        private String repoFullName; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(AnalyzeGitRepositoryRequest request) {
            super(request);
            this.branch = request.branch;
            this.clientToken = request.clientToken;
            this.orgId = request.orgId;
            this.owner = request.owner;
            this.platform = request.platform;
            this.regionId = request.regionId;
            this.repoFullName = request.repoFullName;
            this.repoId = request.repoId;
        } 

        /**
         * Branch.
         */
        public Builder branch(String branch) {
            this.putQueryParameter("Branch", branch);
            this.branch = branch;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RepoFullName.
         */
        public Builder repoFullName(String repoFullName) {
            this.putQueryParameter("RepoFullName", repoFullName);
            this.repoFullName = repoFullName;
            return this;
        }

        /**
         * RepoId.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        @Override
        public AnalyzeGitRepositoryRequest build() {
            return new AnalyzeGitRepositoryRequest(this);
        } 

    } 

}
