// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepositoryCommitRequest} extends {@link RequestModel}
 *
 * <p>GetRepositoryCommitRequest</p>
 */
public class GetRepositoryCommitRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Path
    @NameInMap("sha")
    @Validation(required = true)
    private String sha;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("showSignature")
    private Boolean showSignature;

    private GetRepositoryCommitRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.sha = builder.sha;
        this.accessToken = builder.accessToken;
        this.organizationId = builder.organizationId;
        this.showSignature = builder.showSignature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepositoryCommitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return sha
     */
    public String getSha() {
        return this.sha;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return showSignature
     */
    public Boolean getShowSignature() {
        return this.showSignature;
    }

    public static final class Builder extends Request.Builder<GetRepositoryCommitRequest, Builder> {
        private Long repositoryId; 
        private String sha; 
        private String accessToken; 
        private String organizationId; 
        private Boolean showSignature; 

        private Builder() {
            super();
        } 

        private Builder(GetRepositoryCommitRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.sha = request.sha;
            this.accessToken = request.accessToken;
            this.organizationId = request.organizationId;
            this.showSignature = request.showSignature;
        } 

        /**
         * The ID of a project
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * The commit hash or name of a repository branch or tag
         */
        public Builder sha(String sha) {
            this.putPathParameter("sha", sha);
            this.sha = sha;
            return this;
        }

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 展示签名
         */
        public Builder showSignature(Boolean showSignature) {
            this.putQueryParameter("showSignature", showSignature);
            this.showSignature = showSignature;
            return this;
        }

        @Override
        public GetRepositoryCommitRequest build() {
            return new GetRepositoryCommitRequest(this);
        } 

    } 

}
