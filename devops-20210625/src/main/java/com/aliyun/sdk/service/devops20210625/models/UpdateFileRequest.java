// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFileRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileRequest</p>
 */
public class UpdateFileRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private String repositoryId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("branchName")
    @Validation(required = true)
    private String branchName;

    @Body
    @NameInMap("commitMessage")
    @Validation(required = true)
    private String commitMessage;

    @Body
    @NameInMap("content")
    @Validation(required = true)
    private String content;

    @Body
    @NameInMap("encoding")
    private String encoding;

    @Body
    @NameInMap("newPath")
    @Validation(required = true)
    private String newPath;

    @Body
    @NameInMap("oldPath")
    @Validation(required = true)
    private String oldPath;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private UpdateFileRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.branchName = builder.branchName;
        this.commitMessage = builder.commitMessage;
        this.content = builder.content;
        this.encoding = builder.encoding;
        this.newPath = builder.newPath;
        this.oldPath = builder.oldPath;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public String getRepositoryId() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return encoding
     */
    public String getEncoding() {
        return this.encoding;
    }

    /**
     * @return newPath
     */
    public String getNewPath() {
        return this.newPath;
    }

    /**
     * @return oldPath
     */
    public String getOldPath() {
        return this.oldPath;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<UpdateFileRequest, Builder> {
        private String repositoryId; 
        private String accessToken; 
        private String branchName; 
        private String commitMessage; 
        private String content; 
        private String encoding; 
        private String newPath; 
        private String oldPath; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFileRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.branchName = request.branchName;
            this.commitMessage = request.commitMessage;
            this.content = request.content;
            this.encoding = request.encoding;
            this.newPath = request.newPath;
            this.oldPath = request.oldPath;
            this.organizationId = request.organizationId;
        } 

        /**
         * repositoryId.
         */
        public Builder repositoryId(String repositoryId) {
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
         * branchName.
         */
        public Builder branchName(String branchName) {
            this.putBodyParameter("branchName", branchName);
            this.branchName = branchName;
            return this;
        }

        /**
         * commitMessage.
         */
        public Builder commitMessage(String commitMessage) {
            this.putBodyParameter("commitMessage", commitMessage);
            this.commitMessage = commitMessage;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * encoding.
         */
        public Builder encoding(String encoding) {
            this.putBodyParameter("encoding", encoding);
            this.encoding = encoding;
            return this;
        }

        /**
         * newPath.
         */
        public Builder newPath(String newPath) {
            this.putBodyParameter("newPath", newPath);
            this.newPath = newPath;
            return this;
        }

        /**
         * oldPath.
         */
        public Builder oldPath(String oldPath) {
            this.putBodyParameter("oldPath", oldPath);
            this.oldPath = oldPath;
            return this;
        }

        /**
         * A short description of struct
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public UpdateFileRequest build() {
            return new UpdateFileRequest(this);
        } 

    } 

}
