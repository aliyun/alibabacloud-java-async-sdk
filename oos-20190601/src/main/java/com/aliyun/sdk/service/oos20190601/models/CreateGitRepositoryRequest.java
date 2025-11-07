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
 * {@link CreateGitRepositoryRequest} extends {@link RequestModel}
 *
 * <p>CreateGitRepositoryRequest</p>
 */
public class CreateGitRepositoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsPrivate")
    private Boolean isPrivate;

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
    @com.aliyun.core.annotation.NameInMap("SourceRepoBranch")
    private String sourceRepoBranch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRepoName")
    private String sourceRepoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRepoOwner")
    private String sourceRepoOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetRepoName")
    private String targetRepoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetRepoOwner")
    private String targetRepoOwner;

    private CreateGitRepositoryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.isPrivate = builder.isPrivate;
        this.orgId = builder.orgId;
        this.owner = builder.owner;
        this.platform = builder.platform;
        this.regionId = builder.regionId;
        this.sourceRepoBranch = builder.sourceRepoBranch;
        this.sourceRepoName = builder.sourceRepoName;
        this.sourceRepoOwner = builder.sourceRepoOwner;
        this.targetRepoName = builder.targetRepoName;
        this.targetRepoOwner = builder.targetRepoOwner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGitRepositoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return isPrivate
     */
    public Boolean getIsPrivate() {
        return this.isPrivate;
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
     * @return sourceRepoBranch
     */
    public String getSourceRepoBranch() {
        return this.sourceRepoBranch;
    }

    /**
     * @return sourceRepoName
     */
    public String getSourceRepoName() {
        return this.sourceRepoName;
    }

    /**
     * @return sourceRepoOwner
     */
    public String getSourceRepoOwner() {
        return this.sourceRepoOwner;
    }

    /**
     * @return targetRepoName
     */
    public String getTargetRepoName() {
        return this.targetRepoName;
    }

    /**
     * @return targetRepoOwner
     */
    public String getTargetRepoOwner() {
        return this.targetRepoOwner;
    }

    public static final class Builder extends Request.Builder<CreateGitRepositoryRequest, Builder> {
        private String clientToken; 
        private Boolean isPrivate; 
        private String orgId; 
        private String owner; 
        private String platform; 
        private String regionId; 
        private String sourceRepoBranch; 
        private String sourceRepoName; 
        private String sourceRepoOwner; 
        private String targetRepoName; 
        private String targetRepoOwner; 

        private Builder() {
            super();
        } 

        private Builder(CreateGitRepositoryRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.isPrivate = request.isPrivate;
            this.orgId = request.orgId;
            this.owner = request.owner;
            this.platform = request.platform;
            this.regionId = request.regionId;
            this.sourceRepoBranch = request.sourceRepoBranch;
            this.sourceRepoName = request.sourceRepoName;
            this.sourceRepoOwner = request.sourceRepoOwner;
            this.targetRepoName = request.targetRepoName;
            this.targetRepoOwner = request.targetRepoOwner;
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
         * IsPrivate.
         */
        public Builder isPrivate(Boolean isPrivate) {
            this.putQueryParameter("IsPrivate", isPrivate);
            this.isPrivate = isPrivate;
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
         * 
         * <strong>example:</strong>
         * <p>JJGGu</p>
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
         * <p>gitee</p>
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
         * SourceRepoBranch.
         */
        public Builder sourceRepoBranch(String sourceRepoBranch) {
            this.putQueryParameter("SourceRepoBranch", sourceRepoBranch);
            this.sourceRepoBranch = sourceRepoBranch;
            return this;
        }

        /**
         * SourceRepoName.
         */
        public Builder sourceRepoName(String sourceRepoName) {
            this.putQueryParameter("SourceRepoName", sourceRepoName);
            this.sourceRepoName = sourceRepoName;
            return this;
        }

        /**
         * SourceRepoOwner.
         */
        public Builder sourceRepoOwner(String sourceRepoOwner) {
            this.putQueryParameter("SourceRepoOwner", sourceRepoOwner);
            this.sourceRepoOwner = sourceRepoOwner;
            return this;
        }

        /**
         * TargetRepoName.
         */
        public Builder targetRepoName(String targetRepoName) {
            this.putQueryParameter("TargetRepoName", targetRepoName);
            this.targetRepoName = targetRepoName;
            return this;
        }

        /**
         * TargetRepoOwner.
         */
        public Builder targetRepoOwner(String targetRepoOwner) {
            this.putQueryParameter("TargetRepoOwner", targetRepoOwner);
            this.targetRepoOwner = targetRepoOwner;
            return this;
        }

        @Override
        public CreateGitRepositoryRequest build() {
            return new CreateGitRepositoryRequest(this);
        } 

    } 

}
