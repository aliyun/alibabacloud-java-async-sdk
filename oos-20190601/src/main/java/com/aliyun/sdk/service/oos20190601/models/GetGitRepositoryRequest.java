// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link GetGitRepositoryRequest} extends {@link RequestModel}
 *
 * <p>GetGitRepositoryRequest</p>
 */
public class GetGitRepositoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgId")
    private String orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String repoFullName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoId")
    private Long repoId;

    private GetGitRepositoryRequest(Builder builder) {
        super(builder);
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

    public static GetGitRepositoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getRepoId() {
        return this.repoId;
    }

    public static final class Builder extends Request.Builder<GetGitRepositoryRequest, Builder> {
        private String orgId; 
        private String owner; 
        private String platform; 
        private String regionId; 
        private String repoFullName; 
        private Long repoId; 

        private Builder() {
            super();
        } 

        private Builder(GetGitRepositoryRequest request) {
            super(request);
            this.orgId = request.orgId;
            this.owner = request.owner;
            this.platform = request.platform;
            this.regionId = request.regionId;
            this.repoFullName = request.repoFullName;
            this.repoId = request.repoId;
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
         * Owner.
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>github</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba/fastjson</p>
         */
        public Builder repoFullName(String repoFullName) {
            this.putQueryParameter("RepoFullName", repoFullName);
            this.repoFullName = repoFullName;
            return this;
        }

        /**
         * RepoId.
         */
        public Builder repoId(Long repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        @Override
        public GetGitRepositoryRequest build() {
            return new GetGitRepositoryRequest(this);
        } 

    } 

}
