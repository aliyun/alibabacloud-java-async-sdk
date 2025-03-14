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
 * {@link ListSearchCommitResponseBody} extends {@link TeaModel}
 *
 * <p>ListSearchCommitResponseBody</p>
 */
public class ListSearchCommitResponseBody extends TeaModel {
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

    private ListSearchCommitResponseBody(Builder builder) {
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

    public static ListSearchCommitResponseBody create() {
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

        public ListSearchCommitResponseBody build() {
            return new ListSearchCommitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSearchCommitResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchCommitResponseBody</p>
     */
    public static class HighlightTextMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commitId")
        private String commitId;

        @com.aliyun.core.annotation.NameInMap("commitMessage")
        private String commitMessage;

        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private HighlightTextMap(Builder builder) {
            this.commitId = builder.commitId;
            this.commitMessage = builder.commitMessage;
            this.organizationId = builder.organizationId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighlightTextMap create() {
            return builder().build();
        }

        /**
         * @return commitId
         */
        public String getCommitId() {
            return this.commitId;
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
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String commitId; 
            private String commitMessage; 
            private String organizationId; 
            private String title; 

            /**
             * commitId.
             */
            public Builder commitId(String commitId) {
                this.commitId = commitId;
                return this;
            }

            /**
             * commitMessage.
             */
            public Builder commitMessage(String commitMessage) {
                this.commitMessage = commitMessage;
                return this;
            }

            /**
             * organizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public HighlightTextMap build() {
                return new HighlightTextMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSearchCommitResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchCommitResponseBody</p>
     */
    public static class Author extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Author(Builder builder) {
            this.email = builder.email;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Author create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String email; 
            private String name; 

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Author build() {
                return new Author(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSearchCommitResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchCommitResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("author")
        private Author author;

        @com.aliyun.core.annotation.NameInMap("authorTime")
        private String authorTime;

        @com.aliyun.core.annotation.NameInMap("commitId")
        private String commitId;

        @com.aliyun.core.annotation.NameInMap("commitMessage")
        private String commitMessage;

        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("repoPath")
        private String repoPath;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Source(Builder builder) {
            this.author = builder.author;
            this.authorTime = builder.authorTime;
            this.commitId = builder.commitId;
            this.commitMessage = builder.commitMessage;
            this.organizationId = builder.organizationId;
            this.repoPath = builder.repoPath;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return author
         */
        public Author getAuthor() {
            return this.author;
        }

        /**
         * @return authorTime
         */
        public String getAuthorTime() {
            return this.authorTime;
        }

        /**
         * @return commitId
         */
        public String getCommitId() {
            return this.commitId;
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
         * @return repoPath
         */
        public String getRepoPath() {
            return this.repoPath;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Author author; 
            private String authorTime; 
            private String commitId; 
            private String commitMessage; 
            private String organizationId; 
            private String repoPath; 
            private String title; 

            /**
             * author.
             */
            public Builder author(Author author) {
                this.author = author;
                return this;
            }

            /**
             * authorTime.
             */
            public Builder authorTime(String authorTime) {
                this.authorTime = authorTime;
                return this;
            }

            /**
             * commitId.
             */
            public Builder commitId(String commitId) {
                this.commitId = commitId;
                return this;
            }

            /**
             * commitMessage.
             */
            public Builder commitMessage(String commitMessage) {
                this.commitMessage = commitMessage;
                return this;
            }

            /**
             * organizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * repoPath.
             */
            public Builder repoPath(String repoPath) {
                this.repoPath = repoPath;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSearchCommitResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchCommitResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("docId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("highlightTextMap")
        private HighlightTextMap highlightTextMap;

        @com.aliyun.core.annotation.NameInMap("source")
        private Source source;

        private Result(Builder builder) {
            this.docId = builder.docId;
            this.highlightTextMap = builder.highlightTextMap;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return highlightTextMap
         */
        public HighlightTextMap getHighlightTextMap() {
            return this.highlightTextMap;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        public static final class Builder {
            private String docId; 
            private HighlightTextMap highlightTextMap; 
            private Source source; 

            /**
             * docId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * highlightTextMap.
             */
            public Builder highlightTextMap(HighlightTextMap highlightTextMap) {
                this.highlightTextMap = highlightTextMap;
                return this;
            }

            /**
             * source.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
