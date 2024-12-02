// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListGitRepositoryContentsRequest} extends {@link RequestModel}
 *
 * <p>ListGitRepositoryContentsRequest</p>
 */
public class ListGitRepositoryContentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Branch")
    private String branch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgId")
    private String orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

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
    private Long repoId;

    private ListGitRepositoryContentsRequest(Builder builder) {
        super(builder);
        this.branch = builder.branch;
        this.clientToken = builder.clientToken;
        this.contentType = builder.contentType;
        this.orgId = builder.orgId;
        this.owner = builder.owner;
        this.path = builder.path;
        this.platform = builder.platform;
        this.regionId = builder.regionId;
        this.repoFullName = builder.repoFullName;
        this.repoId = builder.repoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGitRepositoryContentsRequest create() {
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
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
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
     * @return path
     */
    public String getPath() {
        return this.path;
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

    public static final class Builder extends Request.Builder<ListGitRepositoryContentsRequest, Builder> {
        private String branch; 
        private String clientToken; 
        private String contentType; 
        private String orgId; 
        private String owner; 
        private String path; 
        private String platform; 
        private String regionId; 
        private String repoFullName; 
        private Long repoId; 

        private Builder() {
            super();
        } 

        private Builder(ListGitRepositoryContentsRequest request) {
            super(request);
            this.branch = request.branch;
            this.clientToken = request.clientToken;
            this.contentType = request.contentType;
            this.orgId = request.orgId;
            this.owner = request.owner;
            this.path = request.path;
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
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
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
         * Path.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
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
        public Builder repoId(Long repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        @Override
        public ListGitRepositoryContentsRequest build() {
            return new ListGitRepositoryContentsRequest(this);
        } 

    } 

}
