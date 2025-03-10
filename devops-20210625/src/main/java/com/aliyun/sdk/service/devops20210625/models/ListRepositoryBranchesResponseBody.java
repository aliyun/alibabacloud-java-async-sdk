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
 * {@link ListRepositoryBranchesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepositoryBranchesResponseBody</p>
 */
public class ListRepositoryBranchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListRepositoryBranchesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepositoryBranchesResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 
        private Long total; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
        public Builder result(java.util.List<Result> result) {
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

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListRepositoryBranchesResponseBody build() {
            return new ListRepositoryBranchesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRepositoryBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepositoryBranchesResponseBody</p>
     */
    public static class Commit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorEmail")
        private String authorEmail;

        @com.aliyun.core.annotation.NameInMap("authorName")
        private String authorName;

        @com.aliyun.core.annotation.NameInMap("authoredDate")
        private String authoredDate;

        @com.aliyun.core.annotation.NameInMap("committedDate")
        private String committedDate;

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

        private Commit(Builder builder) {
            this.authorEmail = builder.authorEmail;
            this.authorName = builder.authorName;
            this.authoredDate = builder.authoredDate;
            this.committedDate = builder.committedDate;
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

        public static Commit create() {
            return builder().build();
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
            private String authorEmail; 
            private String authorName; 
            private String authoredDate; 
            private String committedDate; 
            private String committerEmail; 
            private String committerName; 
            private String createdAt; 
            private String id; 
            private String message; 
            private java.util.List<String> parentIds; 
            private String shortId; 
            private String title; 

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

            public Commit build() {
                return new Commit(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRepositoryBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepositoryBranchesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commit")
        private Commit commit;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("protected")
        private String _protected;

        private Result(Builder builder) {
            this.commit = builder.commit;
            this.name = builder.name;
            this._protected = builder._protected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return commit
         */
        public Commit getCommit() {
            return this.commit;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return _protected
         */
        public String get_protected() {
            return this._protected;
        }

        public static final class Builder {
            private Commit commit; 
            private String name; 
            private String _protected; 

            /**
             * commit.
             */
            public Builder commit(Commit commit) {
                this.commit = commit;
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
             * protected.
             */
            public Builder _protected(String _protected) {
                this._protected = _protected;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
