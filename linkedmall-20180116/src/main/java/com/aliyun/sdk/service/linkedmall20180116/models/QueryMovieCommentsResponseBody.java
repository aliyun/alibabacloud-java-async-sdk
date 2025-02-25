// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryMovieCommentsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMovieCommentsResponseBody</p>
 */
public class QueryMovieCommentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CommentList")
    private CommentList commentList;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryMovieCommentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.commentList = builder.commentList;
        this.count = builder.count;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMovieCommentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return commentList
     */
    public CommentList getCommentList() {
        return this.commentList;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private CommentList commentList; 
        private Long count; 
        private String logsId; 
        private String message; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CommentList.
         */
        public Builder commentList(CommentList commentList) {
            this.commentList = commentList;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryMovieCommentsResponseBody build() {
            return new QueryMovieCommentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMovieCommentsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMovieCommentsResponseBody</p>
     */
    public static class Comment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommentTime")
        private String commentTime;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FavorCount")
        private Long favorCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MovieId")
        private Long movieId;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private Long remark;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        private Comment(Builder builder) {
            this.commentTime = builder.commentTime;
            this.content = builder.content;
            this.favorCount = builder.favorCount;
            this.id = builder.id;
            this.movieId = builder.movieId;
            this.nickName = builder.nickName;
            this.remark = builder.remark;
            this.subject = builder.subject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Comment create() {
            return builder().build();
        }

        /**
         * @return commentTime
         */
        public String getCommentTime() {
            return this.commentTime;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return favorCount
         */
        public Long getFavorCount() {
            return this.favorCount;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return movieId
         */
        public Long getMovieId() {
            return this.movieId;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return remark
         */
        public Long getRemark() {
            return this.remark;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private String commentTime; 
            private String content; 
            private Long favorCount; 
            private Long id; 
            private Long movieId; 
            private String nickName; 
            private Long remark; 
            private String subject; 

            /**
             * CommentTime.
             */
            public Builder commentTime(String commentTime) {
                this.commentTime = commentTime;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * FavorCount.
             */
            public Builder favorCount(Long favorCount) {
                this.favorCount = favorCount;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * MovieId.
             */
            public Builder movieId(Long movieId) {
                this.movieId = movieId;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(Long remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public Comment build() {
                return new Comment(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMovieCommentsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMovieCommentsResponseBody</p>
     */
    public static class CommentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private java.util.List<Comment> comment;

        private CommentList(Builder builder) {
            this.comment = builder.comment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommentList create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public java.util.List<Comment> getComment() {
            return this.comment;
        }

        public static final class Builder {
            private java.util.List<Comment> comment; 

            /**
             * Comment.
             */
            public Builder comment(java.util.List<Comment> comment) {
                this.comment = comment;
                return this;
            }

            public CommentList build() {
                return new CommentList(this);
            } 

        } 

    }
}
