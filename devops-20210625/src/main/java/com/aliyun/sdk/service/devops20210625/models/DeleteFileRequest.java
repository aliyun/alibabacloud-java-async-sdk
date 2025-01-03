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
 * {@link DeleteFileRequest} extends {@link RequestModel}
 *
 * <p>DeleteFileRequest</p>
 */
public class DeleteFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long repositoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("branchName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String branchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("commitMessage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commitMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private DeleteFileRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.branchName = builder.branchName;
        this.commitMessage = builder.commitMessage;
        this.filePath = builder.filePath;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFileRequest create() {
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
     * @return branchName
     */
    public String getBranchName() {
        return this.branchName;
    }

    /**
     * @return commitMessage
     */
    public String getCommitMessage() {
        return this.commitMessage;
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

    public static final class Builder extends Request.Builder<DeleteFileRequest, Builder> {
        private Long repositoryId; 
        private String accessToken; 
        private String branchName; 
        private String commitMessage; 
        private String filePath; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFileRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.branchName = request.branchName;
            this.commitMessage = request.commitMessage;
            this.filePath = request.filePath;
            this.organizationId = request.organizationId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2709413</p>
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
         * <p>master</p>
         */
        public Builder branchName(String branchName) {
            this.putQueryParameter("branchName", branchName);
            this.branchName = branchName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder commitMessage(String commitMessage) {
            this.putQueryParameter("commitMessage", commitMessage);
            this.commitMessage = commitMessage;
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

        @Override
        public DeleteFileRequest build() {
            return new DeleteFileRequest(this);
        } 

    } 

}
