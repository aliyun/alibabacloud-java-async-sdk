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
 * {@link ListChatMessageContentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListChatMessageContentsResponseBody</p>
 */
public class ListChatMessageContentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListChatMessageContentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.hasMore = builder.hasMore;
        this.items = builder.items;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sourceId = builder.sourceId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatMessageContentsResponseBody create() {
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
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Boolean hasMore; 
        private java.util.List<Items> items; 
        private String message; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private String sourceId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListChatMessageContentsResponseBody model) {
            this.code = model.code;
            this.hasMore = model.hasMore;
            this.items = model.items;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.sourceId = model.sourceId;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Specifies whether there is a next page.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The list of MCP cards.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>The current zone list is illegal.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The maximum number of data records returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>trace-chat-1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the original project.</p>
         * 
         * <strong>example:</strong>
         * <p>source-chat-1</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListChatMessageContentsResponseBody build() {
            return new ListChatMessageContentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChatMessageContentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListChatMessageContentsResponseBody</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attachmentId")
        private String attachmentId;

        @com.aliyun.core.annotation.NameInMap("charCount")
        private Long charCount;

        @com.aliyun.core.annotation.NameInMap("chunkCount")
        private Integer chunkCount;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("emptyReason")
        private String emptyReason;

        @com.aliyun.core.annotation.NameInMap("failureCode")
        private String failureCode;

        @com.aliyun.core.annotation.NameInMap("failureReason")
        private String failureReason;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("found")
        private Boolean found;

        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("modality")
        private String modality;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("truncated")
        private Boolean truncated;

        private Attachments(Builder builder) {
            this.attachmentId = builder.attachmentId;
            this.charCount = builder.charCount;
            this.chunkCount = builder.chunkCount;
            this.content = builder.content;
            this.emptyReason = builder.emptyReason;
            this.failureCode = builder.failureCode;
            this.failureReason = builder.failureReason;
            this.fileName = builder.fileName;
            this.found = builder.found;
            this.messageId = builder.messageId;
            this.modality = builder.modality;
            this.status = builder.status;
            this.truncated = builder.truncated;
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
         * @return charCount
         */
        public Long getCharCount() {
            return this.charCount;
        }

        /**
         * @return chunkCount
         */
        public Integer getChunkCount() {
            return this.chunkCount;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return emptyReason
         */
        public String getEmptyReason() {
            return this.emptyReason;
        }

        /**
         * @return failureCode
         */
        public String getFailureCode() {
            return this.failureCode;
        }

        /**
         * @return failureReason
         */
        public String getFailureReason() {
            return this.failureReason;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return found
         */
        public Boolean getFound() {
            return this.found;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return modality
         */
        public String getModality() {
            return this.modality;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return truncated
         */
        public Boolean getTruncated() {
            return this.truncated;
        }

        public static final class Builder {
            private String attachmentId; 
            private Long charCount; 
            private Integer chunkCount; 
            private String content; 
            private String emptyReason; 
            private String failureCode; 
            private String failureReason; 
            private String fileName; 
            private Boolean found; 
            private String messageId; 
            private String modality; 
            private String status; 
            private Boolean truncated; 

            private Builder() {
            } 

            private Builder(Attachments model) {
                this.attachmentId = model.attachmentId;
                this.charCount = model.charCount;
                this.chunkCount = model.chunkCount;
                this.content = model.content;
                this.emptyReason = model.emptyReason;
                this.failureCode = model.failureCode;
                this.failureReason = model.failureReason;
                this.fileName = model.fileName;
                this.found = model.found;
                this.messageId = model.messageId;
                this.modality = model.modality;
                this.status = model.status;
                this.truncated = model.truncated;
            } 

            /**
             * <p>The ID of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>file-1</p>
             */
            public Builder attachmentId(String attachmentId) {
                this.attachmentId = attachmentId;
                return this;
            }

            /**
             * <p>The total number of characters in the content.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder charCount(Long charCount) {
                this.charCount = charCount;
                return this;
            }

            /**
             * <p>The number of chunks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chunkCount(Integer chunkCount) {
                this.chunkCount = chunkCount;
                return this;
            }

            /**
             * <p>The content of the user message.</p>
             * 
             * <strong>example:</strong>
             * <p>Attachment content</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The reason why the content is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder emptyReason(String emptyReason) {
                this.emptyReason = emptyReason;
                return this;
            }

            /**
             * <p>The failure code of the batch. Valid values:</p>
             * <ul>
             * <li>ARREARAGE: The account has an overdue payment.</li>
             * <li>NO_TARGET: No valid inspection instance is available.</li>
             * <li>TIMEOUT: The batch execution timed out.</li>
             * <li>SYSTEM_ERROR: A system error occurred.</li>
             * <li>ALL_INSTANCE_FAILED: All instance inspections failed.</li>
             * </ul>
             * <p>This parameter is empty if the batch does not fail.</p>
             * 
             * <strong>example:</strong>
             * <p>ARREARAGE</p>
             */
            public Builder failureCode(String failureCode) {
                this.failureCode = failureCode;
                return this;
            }

            /**
             * <p>The failure summary of the asynchronous task. This parameter is not returned if no failure information is available. You can use the taskId and requestId to troubleshoot the issue.</p>
             * 
             * <strong>example:</strong>
             * <p>Scheduling failed</p>
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
                return this;
            }

            /**
             * <p>The new file name. This parameter is optional. If you do not specify this parameter or specify an empty string, the original file name is retained.</p>
             * 
             * <strong>example:</strong>
             * <p>Weekly_Report.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>Specifies whether the standard package instance is found.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder found(Boolean found) {
                this.found = found;
                return this;
            }

            /**
             * <p>The ID of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>msg-1</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The type of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>doc</p>
             */
            public Builder modality(String modality) {
                this.modality = modality;
                return this;
            }

            /**
             * <p>The status of the data source. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Online.</li>
             * <li><strong>0</strong>: Offline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PARSED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Specifies whether the scan result is truncated.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder truncated(Boolean truncated) {
                this.truncated = truncated;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListChatMessageContentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListChatMessageContentsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attachments")
        private java.util.List<Attachments> attachments;

        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("messageType")
        private String messageType;

        @com.aliyun.core.annotation.NameInMap("recordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("senderId")
        private String senderId;

        @com.aliyun.core.annotation.NameInMap("senderName")
        private String senderName;

        @com.aliyun.core.annotation.NameInMap("sentAt")
        private String sentAt;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private Items(Builder builder) {
            this.attachments = builder.attachments;
            this.messageId = builder.messageId;
            this.messageType = builder.messageType;
            this.recordId = builder.recordId;
            this.senderId = builder.senderId;
            this.senderName = builder.senderName;
            this.sentAt = builder.sentAt;
            this.text = builder.text;
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
         * @return recordId
         */
        public Long getRecordId() {
            return this.recordId;
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

        /**
         * @return sentAt
         */
        public String getSentAt() {
            return this.sentAt;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private java.util.List<Attachments> attachments; 
            private String messageId; 
            private String messageType; 
            private Long recordId; 
            private String senderId; 
            private String senderName; 
            private String sentAt; 
            private String text; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.attachments = model.attachments;
                this.messageId = model.messageId;
                this.messageType = model.messageType;
                this.recordId = model.recordId;
                this.senderId = model.senderId;
                this.senderName = model.senderName;
                this.sentAt = model.sentAt;
                this.text = model.text;
            } 

            /**
             * <p>The content type. Valid values:</p>
             * <ul>
             * <li>0: Text.</li>
             * <li>1: Image material.</li>
             * <li>2: Handwritten text.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder attachments(java.util.List<Attachments> attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * <p>The ID of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>msg-1</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The message type. Valid values:</p>
             * <ul>
             * <li><strong>MARKDOWN</strong>: Markdown message.</li>
             * <li><strong>ACTIONCARD</strong>: Card message.</li>
             * </ul>
             * <blockquote>
             * <p>Message buttons cannot be used in Markdown messages.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * <p>The ID of the service record.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder recordId(Long recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>The DingTalk ID of the customer service representative.</p>
             * 
             * <strong>example:</strong>
             * <p>sender-1</p>
             */
            public Builder senderId(String senderId) {
                this.senderId = senderId;
                return this;
            }

            /**
             * <p>The name of the message sender.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder senderName(String senderName) {
                this.senderName = senderName;
                return this;
            }

            /**
             * <p>The time when the message was sent.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-09T10:00:00+08:00</p>
             */
            public Builder sentAt(String sentAt) {
                this.sentAt = sentAt;
                return this;
            }

            /**
             * <p>The batch text to be translated.</p>
             * 
             * <strong>example:</strong>
             * <p>Please check the attachment</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
