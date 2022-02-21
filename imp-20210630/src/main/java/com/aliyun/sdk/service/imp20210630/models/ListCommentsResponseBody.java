// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCommentsResponseBody</p>
 */
public class ListCommentsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListCommentsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommentsResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 调用查询弹幕消息列表的返回结果。
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListCommentsResponseBody build() {
            return new ListCommentsResponseBody(this);
        } 

    } 

    public static class CommentVOList extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CommentId")
        private String commentId;

        @NameInMap("Content")
        private String content;

        @NameInMap("CreateAt")
        private Long createAt;

        @NameInMap("Extension")
        private java.util.Map < String, String > extension;

        @NameInMap("RoomId")
        private String roomId;

        @NameInMap("SenderId")
        private String senderId;

        @NameInMap("SenderNick")
        private String senderNick;

        private CommentVOList(Builder builder) {
            this.appId = builder.appId;
            this.commentId = builder.commentId;
            this.content = builder.content;
            this.createAt = builder.createAt;
            this.extension = builder.extension;
            this.roomId = builder.roomId;
            this.senderId = builder.senderId;
            this.senderNick = builder.senderNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommentVOList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return commentId
         */
        public String getCommentId() {
            return this.commentId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createAt
         */
        public Long getCreateAt() {
            return this.createAt;
        }

        /**
         * @return extension
         */
        public java.util.Map < String, String > getExtension() {
            return this.extension;
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        /**
         * @return senderId
         */
        public String getSenderId() {
            return this.senderId;
        }

        /**
         * @return senderNick
         */
        public String getSenderNick() {
            return this.senderNick;
        }

        public static final class Builder {
            private String appId; 
            private String commentId; 
            private String content; 
            private Long createAt; 
            private java.util.Map < String, String > extension; 
            private String roomId; 
            private String senderId; 
            private String senderNick; 

            /**
             * 应用ID。
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * 弹幕消息的唯一ID标识。
             */
            public Builder commentId(String commentId) {
                this.commentId = commentId;
                return this;
            }

            /**
             * 弹幕消息的内容。
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 弹幕消息的创建时间，Unix时间戳，单位：毫秒。
             */
            public Builder createAt(Long createAt) {
                this.createAt = createAt;
                return this;
            }

            /**
             * 扩展字段。
             */
            public Builder extension(java.util.Map < String, String > extension) {
                this.extension = extension;
                return this;
            }

            /**
             * 房间ID。
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * 弹幕消息的发送者ID标识。
             */
            public Builder senderId(String senderId) {
                this.senderId = senderId;
                return this;
            }

            /**
             * 弹幕消息发送者的昵称。
             */
            public Builder senderNick(String senderNick) {
                this.senderNick = senderNick;
                return this;
            }

            public CommentVOList build() {
                return new CommentVOList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("CommentVOList")
        private java.util.List < CommentVOList> commentVOList;

        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("PageTotal")
        private Integer pageTotal;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Result(Builder builder) {
            this.commentVOList = builder.commentVOList;
            this.hasMore = builder.hasMore;
            this.pageTotal = builder.pageTotal;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return commentVOList
         */
        public java.util.List < CommentVOList> getCommentVOList() {
            return this.commentVOList;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return pageTotal
         */
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < CommentVOList> commentVOList; 
            private Boolean hasMore; 
            private Integer pageTotal; 
            private Integer totalCount; 

            /**
             * 弹幕消息列表。
             */
            public Builder commentVOList(java.util.List < CommentVOList> commentVOList) {
                this.commentVOList = commentVOList;
                return this;
            }

            /**
             * 是否还有下一页数据。true表示还有，false表示没有。
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * 分页查询弹幕消息列表的总页数。
             */
            public Builder pageTotal(Integer pageTotal) {
                this.pageTotal = pageTotal;
                return this;
            }

            /**
             * 弹幕消息的总数。
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
