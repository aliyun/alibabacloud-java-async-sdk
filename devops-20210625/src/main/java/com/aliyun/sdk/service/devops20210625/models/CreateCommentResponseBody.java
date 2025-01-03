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
 * {@link CreateCommentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCommentResponseBody</p>
 */
public class CreateCommentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private CreateCommentResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommentResponseBody create() {
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
        private String errorMessage; 
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

        public CreateCommentResponseBody build() {
            return new CreateCommentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCommentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCommentResponseBody</p>
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

        private Author(Builder builder) {
            this.aliyunPk = builder.aliyunPk;
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.id = builder.id;
            this.name = builder.name;
            this.state = builder.state;
            this.username = builder.username;
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

        public static final class Builder {
            private String aliyunPk; 
            private String avatarUrl; 
            private String email; 
            private Long id; 
            private String name; 
            private String state; 
            private String username; 

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

            public Author build() {
                return new Author(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCommentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCommentResponseBody</p>
     */
    public static class RelatedPatchSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commitId")
        private String commitId;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("patchSetBizId")
        private String patchSetBizId;

        @com.aliyun.core.annotation.NameInMap("patchSetName")
        private String patchSetName;

        @com.aliyun.core.annotation.NameInMap("patchSetNo")
        private String patchSetNo;

        @com.aliyun.core.annotation.NameInMap("relatedMergeItemType")
        private String relatedMergeItemType;

        @com.aliyun.core.annotation.NameInMap("shortId")
        private String shortId;

        private RelatedPatchSet(Builder builder) {
            this.commitId = builder.commitId;
            this.createdAt = builder.createdAt;
            this.patchSetBizId = builder.patchSetBizId;
            this.patchSetName = builder.patchSetName;
            this.patchSetNo = builder.patchSetNo;
            this.relatedMergeItemType = builder.relatedMergeItemType;
            this.shortId = builder.shortId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedPatchSet create() {
            return builder().build();
        }

        /**
         * @return commitId
         */
        public String getCommitId() {
            return this.commitId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return patchSetBizId
         */
        public String getPatchSetBizId() {
            return this.patchSetBizId;
        }

        /**
         * @return patchSetName
         */
        public String getPatchSetName() {
            return this.patchSetName;
        }

        /**
         * @return patchSetNo
         */
        public String getPatchSetNo() {
            return this.patchSetNo;
        }

        /**
         * @return relatedMergeItemType
         */
        public String getRelatedMergeItemType() {
            return this.relatedMergeItemType;
        }

        /**
         * @return shortId
         */
        public String getShortId() {
            return this.shortId;
        }

        public static final class Builder {
            private String commitId; 
            private String createdAt; 
            private String patchSetBizId; 
            private String patchSetName; 
            private String patchSetNo; 
            private String relatedMergeItemType; 
            private String shortId; 

            /**
             * commitId.
             */
            public Builder commitId(String commitId) {
                this.commitId = commitId;
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
             * patchSetBizId.
             */
            public Builder patchSetBizId(String patchSetBizId) {
                this.patchSetBizId = patchSetBizId;
                return this;
            }

            /**
             * patchSetName.
             */
            public Builder patchSetName(String patchSetName) {
                this.patchSetName = patchSetName;
                return this;
            }

            /**
             * patchSetNo.
             */
            public Builder patchSetNo(String patchSetNo) {
                this.patchSetNo = patchSetNo;
                return this;
            }

            /**
             * relatedMergeItemType.
             */
            public Builder relatedMergeItemType(String relatedMergeItemType) {
                this.relatedMergeItemType = relatedMergeItemType;
                return this;
            }

            /**
             * shortId.
             */
            public Builder shortId(String shortId) {
                this.shortId = shortId;
                return this;
            }

            public RelatedPatchSet build() {
                return new RelatedPatchSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCommentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCommentResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("author")
        private Author author;

        @com.aliyun.core.annotation.NameInMap("commentBizId")
        private String commentBizId;

        @com.aliyun.core.annotation.NameInMap("commentTime")
        private String commentTime;

        @com.aliyun.core.annotation.NameInMap("commentType")
        private String commentType;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("filePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("lastEditTime")
        private String lastEditTime;

        @com.aliyun.core.annotation.NameInMap("lineNumber")
        private String lineNumber;

        @com.aliyun.core.annotation.NameInMap("parentCommentBizId")
        private String parentCommentBizId;

        @com.aliyun.core.annotation.NameInMap("relatedPatchSet")
        private RelatedPatchSet relatedPatchSet;

        @com.aliyun.core.annotation.NameInMap("resolved")
        private Boolean resolved;

        @com.aliyun.core.annotation.NameInMap("rootCommentBizId")
        private String rootCommentBizId;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        private Result(Builder builder) {
            this.author = builder.author;
            this.commentBizId = builder.commentBizId;
            this.commentTime = builder.commentTime;
            this.commentType = builder.commentType;
            this.content = builder.content;
            this.deleted = builder.deleted;
            this.filePath = builder.filePath;
            this.lastEditTime = builder.lastEditTime;
            this.lineNumber = builder.lineNumber;
            this.parentCommentBizId = builder.parentCommentBizId;
            this.relatedPatchSet = builder.relatedPatchSet;
            this.resolved = builder.resolved;
            this.rootCommentBizId = builder.rootCommentBizId;
            this.state = builder.state;
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
         * @return commentBizId
         */
        public String getCommentBizId() {
            return this.commentBizId;
        }

        /**
         * @return commentTime
         */
        public String getCommentTime() {
            return this.commentTime;
        }

        /**
         * @return commentType
         */
        public String getCommentType() {
            return this.commentType;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return lastEditTime
         */
        public String getLastEditTime() {
            return this.lastEditTime;
        }

        /**
         * @return lineNumber
         */
        public String getLineNumber() {
            return this.lineNumber;
        }

        /**
         * @return parentCommentBizId
         */
        public String getParentCommentBizId() {
            return this.parentCommentBizId;
        }

        /**
         * @return relatedPatchSet
         */
        public RelatedPatchSet getRelatedPatchSet() {
            return this.relatedPatchSet;
        }

        /**
         * @return resolved
         */
        public Boolean getResolved() {
            return this.resolved;
        }

        /**
         * @return rootCommentBizId
         */
        public String getRootCommentBizId() {
            return this.rootCommentBizId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private Author author; 
            private String commentBizId; 
            private String commentTime; 
            private String commentType; 
            private String content; 
            private Boolean deleted; 
            private String filePath; 
            private String lastEditTime; 
            private String lineNumber; 
            private String parentCommentBizId; 
            private RelatedPatchSet relatedPatchSet; 
            private Boolean resolved; 
            private String rootCommentBizId; 
            private String state; 

            /**
             * author.
             */
            public Builder author(Author author) {
                this.author = author;
                return this;
            }

            /**
             * commentBizId.
             */
            public Builder commentBizId(String commentBizId) {
                this.commentBizId = commentBizId;
                return this;
            }

            /**
             * commentTime.
             */
            public Builder commentTime(String commentTime) {
                this.commentTime = commentTime;
                return this;
            }

            /**
             * commentType.
             */
            public Builder commentType(String commentType) {
                this.commentType = commentType;
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
             * deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
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
             * lastEditTime.
             */
            public Builder lastEditTime(String lastEditTime) {
                this.lastEditTime = lastEditTime;
                return this;
            }

            /**
             * lineNumber.
             */
            public Builder lineNumber(String lineNumber) {
                this.lineNumber = lineNumber;
                return this;
            }

            /**
             * parentCommentBizId.
             */
            public Builder parentCommentBizId(String parentCommentBizId) {
                this.parentCommentBizId = parentCommentBizId;
                return this;
            }

            /**
             * relatedPatchSet.
             */
            public Builder relatedPatchSet(RelatedPatchSet relatedPatchSet) {
                this.relatedPatchSet = relatedPatchSet;
                return this;
            }

            /**
             * resolved.
             */
            public Builder resolved(Boolean resolved) {
                this.resolved = resolved;
                return this;
            }

            /**
             * rootCommentBizId.
             */
            public Builder rootCommentBizId(String rootCommentBizId) {
                this.rootCommentBizId = rootCommentBizId;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
