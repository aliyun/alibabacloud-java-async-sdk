// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommentListReportResponseBody} extends {@link TeaModel}
 *
 * <p>CommentListReportResponseBody</p>
 */
public class CommentListReportResponseBody extends TeaModel {
    @NameInMap("comments")
    private java.util.List < Comments> comments;

    @NameInMap("hasMore")
    private Boolean hasMore;

    @NameInMap("nextCursor")
    private Long nextCursor;

    @NameInMap("requestId")
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

    /**
     * @return comments
     */
    public java.util.List < Comments> getComments() {
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
        private java.util.List < Comments> comments; 
        private Boolean hasMore; 
        private Long nextCursor; 
        private String requestId; 

        /**
         * comments.
         */
        public Builder comments(java.util.List < Comments> comments) {
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
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CommentListReportResponseBody build() {
            return new CommentListReportResponseBody(this);
        } 

    } 

    public static class Comments extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Userid")
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
