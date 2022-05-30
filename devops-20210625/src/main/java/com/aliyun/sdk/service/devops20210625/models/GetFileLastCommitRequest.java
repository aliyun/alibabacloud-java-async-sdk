// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileLastCommitRequest} extends {@link RequestModel}
 *
 * <p>GetFileLastCommitRequest</p>
 */
public class GetFileLastCommitRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("filepath")
    @Validation(required = true)
    private String filepath;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("sha")
    @Validation(required = true)
    private String sha;

    private GetFileLastCommitRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.filepath = builder.filepath;
        this.organizationId = builder.organizationId;
        this.sha = builder.sha;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileLastCommitRequest create() {
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
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return filepath
     */
    public String getFilepath() {
        return this.filepath;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return sha
     */
    public String getSha() {
        return this.sha;
    }

    public static final class Builder extends Request.Builder<GetFileLastCommitRequest, Builder> {
        private Long repositoryId; 
        private String accessToken; 
        private String filepath; 
        private String organizationId; 
        private String sha; 

        private Builder() {
            super();
        } 

        private Builder(GetFileLastCommitRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.filepath = request.filepath;
            this.organizationId = request.organizationId;
            this.sha = request.sha;
        } 

        /**
         * 代码库ID
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * 个人访问令牌
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * 文件路径
         */
        public Builder filepath(String filepath) {
            this.putQueryParameter("filepath", filepath);
            this.filepath = filepath;
            return this;
        }

        /**
         * 云效企业ID
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 分支名称、标签名称或Commit ID
         */
        public Builder sha(String sha) {
            this.putQueryParameter("sha", sha);
            this.sha = sha;
            return this;
        }

        @Override
        public GetFileLastCommitRequest build() {
            return new GetFileLastCommitRequest(this);
        } 

    } 

}
