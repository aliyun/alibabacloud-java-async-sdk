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
 * {@link CreateGitRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGitRepositoryResponseBody</p>
 */
public class CreateGitRepositoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GitRepo")
    private GitRepo gitRepo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateGitRepositoryResponseBody(Builder builder) {
        this.gitRepo = builder.gitRepo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGitRepositoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gitRepo
     */
    public GitRepo getGitRepo() {
        return this.gitRepo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GitRepo gitRepo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateGitRepositoryResponseBody model) {
            this.gitRepo = model.gitRepo;
            this.requestId = model.requestId;
        } 

        /**
         * GitRepo.
         */
        public Builder gitRepo(GitRepo gitRepo) {
            this.gitRepo = gitRepo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGitRepositoryResponseBody build() {
            return new CreateGitRepositoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateGitRepositoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateGitRepositoryResponseBody</p>
     */
    public static class GitRepo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FullName")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("HtmlUrl")
        private String htmlUrl;

        @com.aliyun.core.annotation.NameInMap("IsPrivate")
        private String isPrivate;

        private GitRepo(Builder builder) {
            this.description = builder.description;
            this.fullName = builder.fullName;
            this.htmlUrl = builder.htmlUrl;
            this.isPrivate = builder.isPrivate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GitRepo create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return htmlUrl
         */
        public String getHtmlUrl() {
            return this.htmlUrl;
        }

        /**
         * @return isPrivate
         */
        public String getIsPrivate() {
            return this.isPrivate;
        }

        public static final class Builder {
            private String description; 
            private String fullName; 
            private String htmlUrl; 
            private String isPrivate; 

            private Builder() {
            } 

            private Builder(GitRepo model) {
                this.description = model.description;
                this.fullName = model.fullName;
                this.htmlUrl = model.htmlUrl;
                this.isPrivate = model.isPrivate;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FullName.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * HtmlUrl.
             */
            public Builder htmlUrl(String htmlUrl) {
                this.htmlUrl = htmlUrl;
                return this;
            }

            /**
             * IsPrivate.
             */
            public Builder isPrivate(String isPrivate) {
                this.isPrivate = isPrivate;
                return this;
            }

            public GitRepo build() {
                return new GitRepo(this);
            } 

        } 

    }
}
