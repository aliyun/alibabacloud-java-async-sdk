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
 * {@link CreateCommitWithMultipleFilesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCommitWithMultipleFilesResponseBody</p>
 */
public class CreateCommitWithMultipleFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private CreateCommitWithMultipleFilesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommitWithMultipleFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateCommitWithMultipleFilesResponseBody build() {
            return new CreateCommitWithMultipleFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCommitWithMultipleFilesResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCommitWithMultipleFilesResponseBody</p>
     */
    public static class Author extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aliyunPk")
        private String aliyunPk;

        @com.aliyun.core.annotation.NameInMap("avatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("websiteUrl")
        private String websiteUrl;

        private Author(Builder builder) {
            this.aliyunPk = builder.aliyunPk;
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.id = builder.id;
            this.name = builder.name;
            this.state = builder.state;
            this.username = builder.username;
            this.websiteUrl = builder.websiteUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Author create() {
            return builder().build();
        }

        /**
         * @return aliyunPk
         */
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return websiteUrl
         */
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public static final class Builder {
            private String aliyunPk; 
            private String avatarUrl; 
            private String email; 
            private Long id; 
            private String name; 
            private String state; 
            private String username; 
            private String websiteUrl; 

            /**
             * aliyunPk.
             */
            public Builder aliyunPk(String aliyunPk) {
                this.aliyunPk = aliyunPk;
                return this;
            }

            /**
             * avatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * websiteUrl.
             */
            public Builder websiteUrl(String websiteUrl) {
                this.websiteUrl = websiteUrl;
                return this;
            }

            public Author build() {
                return new Author(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCommitWithMultipleFilesResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCommitWithMultipleFilesResponseBody</p>
     */
    public static class Committer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aliyunPk")
        private String aliyunPk;

        @com.aliyun.core.annotation.NameInMap("avatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("websiteUrl")
        private String websiteUrl;

        private Committer(Builder builder) {
            this.aliyunPk = builder.aliyunPk;
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.id = builder.id;
            this.name = builder.name;
            this.state = builder.state;
            this.username = builder.username;
            this.websiteUrl = builder.websiteUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Committer create() {
            return builder().build();
        }

        /**
         * @return aliyunPk
         */
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return websiteUrl
         */
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public static final class Builder {
            private String aliyunPk; 
            private String avatarUrl; 
            private String email; 
            private Long id; 
            private String name; 
            private String state; 
            private String username; 
            private String websiteUrl; 

            /**
             * aliyunPk.
             */
            public Builder aliyunPk(String aliyunPk) {
                this.aliyunPk = aliyunPk;
                return this;
            }

            /**
             * avatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * websiteUrl.
             */
            public Builder websiteUrl(String websiteUrl) {
                this.websiteUrl = websiteUrl;
                return this;
            }

            public Committer build() {
                return new Committer(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCommitWithMultipleFilesResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCommitWithMultipleFilesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("author")
        private Author author;

        @com.aliyun.core.annotation.NameInMap("authorEmail")
        private String authorEmail;

        @com.aliyun.core.annotation.NameInMap("authorName")
        private String authorName;

        @com.aliyun.core.annotation.NameInMap("authoredDate")
        private String authoredDate;

        @com.aliyun.core.annotation.NameInMap("committedDate")
        private String committedDate;

        @com.aliyun.core.annotation.NameInMap("committer")
        private Committer committer;

        @com.aliyun.core.annotation.NameInMap("committerEmail")
        private String committerEmail;

        @com.aliyun.core.annotation.NameInMap("committerName")
        private String committerName;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("parentIds")
        private java.util.List<String> parentIds;

        @com.aliyun.core.annotation.NameInMap("shortId")
        private String shortId;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Result(Builder builder) {
            this.author = builder.author;
            this.authorEmail = builder.authorEmail;
            this.authorName = builder.authorName;
            this.authoredDate = builder.authoredDate;
            this.committedDate = builder.committedDate;
            this.committer = builder.committer;
            this.committerEmail = builder.committerEmail;
            this.committerName = builder.committerName;
            this.createdAt = builder.createdAt;
            this.id = builder.id;
            this.message = builder.message;
            this.parentIds = builder.parentIds;
            this.shortId = builder.shortId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return author
         */
        public Author getAuthor() {
            return this.author;
        }

        /**
         * @return authorEmail
         */
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        /**
         * @return authorName
         */
        public String getAuthorName() {
            return this.authorName;
        }

        /**
         * @return authoredDate
         */
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        /**
         * @return committedDate
         */
        public String getCommittedDate() {
            return this.committedDate;
        }

        /**
         * @return committer
         */
        public Committer getCommitter() {
            return this.committer;
        }

        /**
         * @return committerEmail
         */
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        /**
         * @return committerName
         */
        public String getCommitterName() {
            return this.committerName;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return parentIds
         */
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        /**
         * @return shortId
         */
        public String getShortId() {
            return this.shortId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Author author; 
            private String authorEmail; 
            private String authorName; 
            private String authoredDate; 
            private String committedDate; 
            private Committer committer; 
            private String committerEmail; 
            private String committerName; 
            private String createdAt; 
            private String id; 
            private String message; 
            private java.util.List<String> parentIds; 
            private String shortId; 
            private String title; 

            /**
             * author.
             */
            public Builder author(Author author) {
                this.author = author;
                return this;
            }

            /**
             * authorEmail.
             */
            public Builder authorEmail(String authorEmail) {
                this.authorEmail = authorEmail;
                return this;
            }

            /**
             * authorName.
             */
            public Builder authorName(String authorName) {
                this.authorName = authorName;
                return this;
            }

            /**
             * authoredDate.
             */
            public Builder authoredDate(String authoredDate) {
                this.authoredDate = authoredDate;
                return this;
            }

            /**
             * committedDate.
             */
            public Builder committedDate(String committedDate) {
                this.committedDate = committedDate;
                return this;
            }

            /**
             * committer.
             */
            public Builder committer(Committer committer) {
                this.committer = committer;
                return this;
            }

            /**
             * committerEmail.
             */
            public Builder committerEmail(String committerEmail) {
                this.committerEmail = committerEmail;
                return this;
            }

            /**
             * committerName.
             */
            public Builder committerName(String committerName) {
                this.committerName = committerName;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * parentIds.
             */
            public Builder parentIds(java.util.List<String> parentIds) {
                this.parentIds = parentIds;
                return this;
            }

            /**
             * shortId.
             */
            public Builder shortId(String shortId) {
                this.shortId = shortId;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
