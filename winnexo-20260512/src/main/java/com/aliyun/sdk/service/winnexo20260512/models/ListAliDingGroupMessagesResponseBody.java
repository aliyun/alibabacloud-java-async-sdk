// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListAliDingGroupMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAliDingGroupMessagesResponseBody</p>
 */
public class ListAliDingGroupMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextTime")
    private String nextTime;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListAliDingGroupMessagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.hasMore = builder.hasMore;
        this.items = builder.items;
        this.message = builder.message;
        this.nextTime = builder.nextTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAliDingGroupMessagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextTime
     */
    public String getNextTime() {
        return this.nextTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Boolean hasMore; 
        private java.util.List<Items> items; 
        private String message; 
        private String nextTime; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAliDingGroupMessagesResponseBody model) {
            this.code = model.code;
            this.hasMore = model.hasMore;
            this.items = model.items;
            this.message = model.message;
            this.nextTime = model.nextTime;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The file information.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The time when the next plan is scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T09:01:00+08:00</p>
         */
        public Builder nextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-id</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAliDingGroupMessagesResponseBody build() {
            return new ListAliDingGroupMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAliDingGroupMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAliDingGroupMessagesResponseBody</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attachmentId")
        private String attachmentId;

        @com.aliyun.core.annotation.NameInMap("attachmentType")
        private String attachmentType;

        @com.aliyun.core.annotation.NameInMap("durationMs")
        private Long durationMs;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("height")
        private Long height;

        @com.aliyun.core.annotation.NameInMap("mimeType")
        private String mimeType;

        @com.aliyun.core.annotation.NameInMap("width")
        private Long width;

        private Attachments(Builder builder) {
            this.attachmentId = builder.attachmentId;
            this.attachmentType = builder.attachmentType;
            this.durationMs = builder.durationMs;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.height = builder.height;
            this.mimeType = builder.mimeType;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return attachmentId
         */
        public String getAttachmentId() {
            return this.attachmentId;
        }

        /**
         * @return attachmentType
         */
        public String getAttachmentType() {
            return this.attachmentType;
        }

        /**
         * @return durationMs
         */
        public Long getDurationMs() {
            return this.durationMs;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return height
         */
        public Long getHeight() {
            return this.height;
        }

        /**
         * @return mimeType
         */
        public String getMimeType() {
            return this.mimeType;
        }

        /**
         * @return width
         */
        public Long getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String attachmentId; 
            private String attachmentType; 
            private Long durationMs; 
            private String fileName; 
            private Long fileSize; 
            private Long height; 
            private String mimeType; 
            private Long width; 

            private Builder() {
            } 

            private Builder(Attachments model) {
                this.attachmentId = model.attachmentId;
                this.attachmentType = model.attachmentType;
                this.durationMs = model.durationMs;
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.height = model.height;
                this.mimeType = model.mimeType;
                this.width = model.width;
            } 

            /**
             * <p>The attachment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>attachment-example</p>
             */
            public Builder attachmentId(String attachmentId) {
                this.attachmentId = attachmentId;
                return this;
            }

            /**
             * <p>The attachment type.</p>
             * 
             * <strong>example:</strong>
             * <p>FILE</p>
             */
            public Builder attachmentType(String attachmentType) {
                this.attachmentType = attachmentType;
                return this;
            }

            /**
             * <p>The execution duration of the asynchronous task.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder durationMs(Long durationMs) {
                this.durationMs = durationMs;
                return this;
            }

            /**
             * <p>The new file name. This parameter is optional. If you do not specify this parameter or set it to an empty string, the original file name is retained.</p>
             * 
             * <strong>example:</strong>
             * <p>Plan.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file size, in <strong>bytes</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>102400</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The thumbnail height, in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The media type. The file name extension is in uppercase, such as XLS, DOC, DOCX, PDF, or XLSX.</p>
             * 
             * <strong>example:</strong>
             * <p>application/pdf</p>
             */
            public Builder mimeType(String mimeType) {
                this.mimeType = mimeType;
                return this;
            }

            /**
             * <p>The image width, in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder width(Long width) {
                this.width = width;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAliDingGroupMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAliDingGroupMessagesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attachments")
        private java.util.List<Attachments> attachments;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("messageType")
        private String messageType;

        @com.aliyun.core.annotation.NameInMap("senderId")
        private String senderId;

        @com.aliyun.core.annotation.NameInMap("senderName")
        private String senderName;

        private Items(Builder builder) {
            this.attachments = builder.attachments;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.messageId = builder.messageId;
            this.messageType = builder.messageType;
            this.senderId = builder.senderId;
            this.senderName = builder.senderName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return attachments
         */
        public java.util.List<Attachments> getAttachments() {
            return this.attachments;
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
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return messageType
         */
        public String getMessageType() {
            return this.messageType;
        }

        /**
         * @return senderId
         */
        public String getSenderId() {
            return this.senderId;
        }

        /**
         * @return senderName
         */
        public String getSenderName() {
            return this.senderName;
        }

        public static final class Builder {
            private java.util.List<Attachments> attachments; 
            private String content; 
            private String createTime; 
            private String messageId; 
            private String messageType; 
            private String senderId; 
            private String senderName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.attachments = model.attachments;
                this.content = model.content;
                this.createTime = model.createTime;
                this.messageId = model.messageId;
                this.messageType = model.messageType;
                this.senderId = model.senderId;
                this.senderName = model.senderName;
            } 

            /**
             * <p>The comment attachments.</p>
             */
            public Builder attachments(java.util.List<Attachments> attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * <p>The returned content.</p>
             * 
             * <strong>example:</strong>
             * <p>See the attachment</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The creation time in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-08 09:01:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>msg-example</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The message type. Valid values:</p>
             * <ul>
             * <li><strong>MARKDOWN</strong>: Markdown message.</li>
             * <li><strong>ACTIONCARD</strong>: card message.</li>
             * </ul>
             * <blockquote>
             * <p>Markdown messages do not support message buttons.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>FILE</p>
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * <p>The DingTalk ID of the business-side customer service representative.</p>
             * 
             * <strong>example:</strong>
             * <p>user-example</p>
             */
            public Builder senderId(String senderId) {
                this.senderId = senderId;
                return this;
            }

            /**
             * <p>The name of the message sender.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder senderName(String senderName) {
                this.senderName = senderName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
