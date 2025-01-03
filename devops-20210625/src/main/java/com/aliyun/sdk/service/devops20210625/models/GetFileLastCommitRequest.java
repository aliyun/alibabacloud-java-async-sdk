// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link GetFileLastCommitRequest} extends {@link RequestModel}
 *
 * <p>GetFileLastCommitRequest</p>
 */
public class GetFileLastCommitRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long repositoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sha")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sha;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("showSignature")
    private Boolean showSignature;

    private GetFileLastCommitRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.filePath = builder.filePath;
        this.organizationId = builder.organizationId;
        this.sha = builder.sha;
        this.showSignature = builder.showSignature;
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
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
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

    /**
     * @return showSignature
     */
    public Boolean getShowSignature() {
        return this.showSignature;
    }

    public static final class Builder extends Request.Builder<GetFileLastCommitRequest, Builder> {
        private Long repositoryId; 
        private String accessToken; 
        private String filePath; 
        private String organizationId; 
        private String sha; 
        private Boolean showSignature; 

        private Builder() {
            super();
        } 

        private Builder(GetFileLastCommitRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.filePath = request.filePath;
            this.organizationId = request.organizationId;
            this.sha = request.sha;
            this.showSignature = request.showSignature;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2825387</p>
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>src/main/test.java</p>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("filePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957</p>
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        public Builder sha(String sha) {
            this.putQueryParameter("sha", sha);
            this.sha = sha;
            return this;
        }

        /**
         * showSignature.
         */
        public Builder showSignature(Boolean showSignature) {
            this.putQueryParameter("showSignature", showSignature);
            this.showSignature = showSignature;
            return this;
        }

        @Override
        public GetFileLastCommitRequest build() {
            return new GetFileLastCommitRequest(this);
        } 

    } 

}
