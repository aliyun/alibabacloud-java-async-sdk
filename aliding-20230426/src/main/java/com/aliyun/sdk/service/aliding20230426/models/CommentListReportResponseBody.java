// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link CommentListReportResponseBody} extends {@link TeaModel}
 *
 * <p>CommentListReportResponseBody</p>
 */
public class CommentListReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("comments")
    private java.util.List<Comments> comments;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("nextCursor")
    private Long nextCursor;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CommentListReportResponseBody(Builder builder) {
        this.comments = builder.comments;
        this.hasMore = builder.hasMore;
        this.nextCursor = builder.nextCursor;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommentListReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comments
     */
    public java.util.List<Comments> getComments() {
        return this.comments;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return nextCursor
     */
    public Long getNextCursor() {
        return this.nextCursor;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Comments> comments; 
        private Boolean hasMore; 
        private Long nextCursor; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CommentListReportResponseBody model) {
            this.comments = model.comments;
            this.hasMore = model.hasMore;
            this.nextCursor = model.nextCursor;
            this.requestId = model.requestId;
        } 

        /**
         * comments.
         */
        public Builder comments(java.util.List<Comments> comments) {
            this.comments = comments;
            return this;
        }

        /**
         * hasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * nextCursor.
         */
        public Builder nextCursor(Long nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CommentListReportResponseBody build() {
            return new CommentListReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CommentListReportResponseBody} extends {@link TeaModel}
     *
     * <p>CommentListReportResponseBody</p>
     */
    public static class Comments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Userid")
        private String userid;

        private Comments(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.userid = builder.userid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Comments create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return userid
         */
        public String getUserid() {
            return this.userid;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private String userid; 

            private Builder() {
            } 

            private Builder(Comments model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.userid = model.userid;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Userid.
             */
            public Builder userid(String userid) {
                this.userid = userid;
                return this;
            }

            public Comments build() {
                return new Comments(this);
            } 

        } 

    }
}
