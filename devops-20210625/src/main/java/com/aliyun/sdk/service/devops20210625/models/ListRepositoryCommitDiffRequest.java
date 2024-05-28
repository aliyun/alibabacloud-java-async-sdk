// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepositoryCommitDiffRequest} extends {@link RequestModel}
 *
 * <p>ListRepositoryCommitDiffRequest</p>
 */
public class ListRepositoryCommitDiffRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long repositoryId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sha")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sha;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contextLine")
    private Integer contextLine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private ListRepositoryCommitDiffRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.sha = builder.sha;
        this.accessToken = builder.accessToken;
        this.contextLine = builder.contextLine;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepositoryCommitDiffRequest create() {
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
     * @return contextLine
     */
    public Integer getContextLine() {
        return this.contextLine;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<ListRepositoryCommitDiffRequest, Builder> {
        private Long repositoryId; 
        private String sha; 
        private String accessToken; 
        private Integer contextLine; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(ListRepositoryCommitDiffRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.sha = request.sha;
            this.accessToken = request.accessToken;
            this.contextLine = request.contextLine;
            this.organizationId = request.organizationId;
        } 

        /**
         * repositoryId.
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * sha.
         */
        public Builder sha(String sha) {
            this.putPathParameter("sha", sha);
            this.sha = sha;
            return this;
        }

        /**
         * accessToken
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * contextLine.
         */
        public Builder contextLine(Integer contextLine) {
            this.putQueryParameter("contextLine", contextLine);
            this.contextLine = contextLine;
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

        @Override
        public ListRepositoryCommitDiffRequest build() {
            return new ListRepositoryCommitDiffRequest(this);
        } 

    } 

}
