// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCommitWithMultipleFilesRequest} extends {@link RequestModel}
 *
 * <p>CreateCommitWithMultipleFilesRequest</p>
 */
public class CreateCommitWithMultipleFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("actions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Actions> actions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("branch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String branch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("commitMessage")
    private String commitMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("repositoryIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repositoryIdentity;

    private CreateCommitWithMultipleFilesRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.actions = builder.actions;
        this.branch = builder.branch;
        this.commitMessage = builder.commitMessage;
        this.organizationId = builder.organizationId;
        this.repositoryIdentity = builder.repositoryIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommitWithMultipleFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return actions
     */
    public java.util.List < Actions> getActions() {
        return this.actions;
    }

    /**
     * @return branch
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * @return commitMessage
     */
    public String getCommitMessage() {
        return this.commitMessage;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return repositoryIdentity
     */
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    public static final class Builder extends Request.Builder<CreateCommitWithMultipleFilesRequest, Builder> {
        private String accessToken; 
        private java.util.List < Actions> actions; 
        private String branch; 
        private String commitMessage; 
        private String organizationId; 
        private String repositoryIdentity; 

        private Builder() {
            super();
        } 

        private Builder(CreateCommitWithMultipleFilesRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.actions = request.actions;
            this.branch = request.branch;
            this.commitMessage = request.commitMessage;
            this.organizationId = request.organizationId;
            this.repositoryIdentity = request.repositoryIdentity;
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
         * actions.
         */
        public Builder actions(java.util.List < Actions> actions) {
            this.putBodyParameter("actions", actions);
            this.actions = actions;
            return this;
        }

        /**
         * branch.
         */
        public Builder branch(String branch) {
            this.putBodyParameter("branch", branch);
            this.branch = branch;
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
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * repositoryIdentity.
         */
        public Builder repositoryIdentity(String repositoryIdentity) {
            this.putQueryParameter("repositoryIdentity", repositoryIdentity);
            this.repositoryIdentity = repositoryIdentity;
            return this;
        }

        @Override
        public CreateCommitWithMultipleFilesRequest build() {
            return new CreateCommitWithMultipleFilesRequest(this);
        } 

    } 

    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("filePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("previousPath")
        private String previousPath;

        private Actions(Builder builder) {
            this.action = builder.action;
            this.content = builder.content;
            this.filePath = builder.filePath;
            this.previousPath = builder.previousPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return previousPath
         */
        public String getPreviousPath() {
            return this.previousPath;
        }

        public static final class Builder {
            private String action; 
            private String content; 
            private String filePath; 
            private String previousPath; 

            /**
             * action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * filePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * previousPath.
             */
            public Builder previousPath(String previousPath) {
                this.previousPath = previousPath;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
}
