// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCommentResponseBody} extends {@link TeaModel}
 *
 * <p>SendCommentResponseBody</p>
 */
public class SendCommentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private SendCommentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendCommentResponseBody create() {
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
         * 调用发送直播间弹幕的返回结果。
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public SendCommentResponseBody build() {
            return new SendCommentResponseBody(this);
        } 

    } 

    public static class CommentVO extends TeaModel {
        @NameInMap("CommentId")
        private String commentId;

        @NameInMap("Content")
        private String content;

        @NameInMap("CreateAt")
        private Long createAt;

        @NameInMap("Extension")
        private java.util.Map < String, String > extension;

        @NameInMap("SenderId")
        private String senderId;

        @NameInMap("SenderNick")
        private String senderNick;

        private CommentVO(Builder builder) {
            this.commentId = builder.commentId;
            this.content = builder.content;
            this.createAt = builder.createAt;
            this.extension = builder.extension;
            this.senderId = builder.senderId;
            this.senderNick = builder.senderNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommentVO create() {
            return builder().build();
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
            private String commentId; 
            private String content; 
            private Long createAt; 
            private java.util.Map < String, String > extension; 
            private String senderId; 
            private String senderNick; 

            /**
             * 弹幕的唯一ID。
             */
            public Builder commentId(String commentId) {
                this.commentId = commentId;
                return this;
            }

            /**
             * 弹幕的内容。
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 弹幕的创建时间，Unix时间戳，单位：毫秒。
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
             * 弹幕的发送者ID标识。
             */
            public Builder senderId(String senderId) {
                this.senderId = senderId;
                return this;
            }

            /**
             * 弹幕发送者的昵称。
             */
            public Builder senderNick(String senderNick) {
                this.senderNick = senderNick;
                return this;
            }

            public CommentVO build() {
                return new CommentVO(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("CommentVO")
        private CommentVO commentVO;

        private Result(Builder builder) {
            this.commentVO = builder.commentVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return commentVO
         */
        public CommentVO getCommentVO() {
            return this.commentVO;
        }

        public static final class Builder {
            private CommentVO commentVO; 

            /**
             * 返回的弹幕数据模型。
             */
            public Builder commentVO(CommentVO commentVO) {
                this.commentVO = commentVO;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
