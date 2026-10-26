// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link SendAgentConversationMessageRequest} extends {@link RequestModel}
 *
 * <p>SendAgentConversationMessageRequest</p>
 */
public class SendAgentConversationMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("conversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attachments")
    private java.util.List<Attachments> attachments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientContext")
    private String clientContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("images")
    private java.util.List<Images> images;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("message")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 50000)
    private String message;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messageType")
    private String messageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ticketRequestId")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String ticketRequestId;

    private SendAgentConversationMessageRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.attachments = builder.attachments;
        this.clientContext = builder.clientContext;
        this.images = builder.images;
        this.message = builder.message;
        this.messageType = builder.messageType;
        this.ticketRequestId = builder.ticketRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendAgentConversationMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return attachments
     */
    public java.util.List<Attachments> getAttachments() {
        return this.attachments;
    }

    /**
     * @return clientContext
     */
    public String getClientContext() {
        return this.clientContext;
    }

    /**
     * @return images
     */
    public java.util.List<Images> getImages() {
        return this.images;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @return ticketRequestId
     */
    public String getTicketRequestId() {
        return this.ticketRequestId;
    }

    public static final class Builder extends Request.Builder<SendAgentConversationMessageRequest, Builder> {
        private String conversationId; 
        private java.util.List<Attachments> attachments; 
        private String clientContext; 
        private java.util.List<Images> images; 
        private String message; 
        private String messageType; 
        private String ticketRequestId; 

        private Builder() {
            super();
        } 

        private Builder(SendAgentConversationMessageRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.attachments = request.attachments;
            this.clientContext = request.clientContext;
            this.images = request.images;
            this.message = request.message;
            this.messageType = request.messageType;
            this.ticketRequestId = request.ticketRequestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0198c8a91f4d7f01a3c21e97</p>
         */
        public Builder conversationId(String conversationId) {
            this.putPathParameter("conversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * attachments.
         */
        public Builder attachments(java.util.List<Attachments> attachments) {
            this.putBodyParameter("attachments", attachments);
            this.attachments = attachments;
            return this;
        }

        /**
         * clientContext.
         */
        public Builder clientContext(String clientContext) {
            this.putBodyParameter("clientContext", clientContext);
            this.clientContext = clientContext;
            return this;
        }

        /**
         * images.
         */
        public Builder images(java.util.List<Images> images) {
            this.putBodyParameter("images", images);
            this.images = images;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>实例 rmq-cn-example 的消息为什么持续堆积？</p>
         */
        public Builder message(String message) {
            this.putBodyParameter("message", message);
            this.message = message;
            return this;
        }

        /**
         * messageType.
         */
        public Builder messageType(String messageType) {
            this.putBodyParameter("messageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * ticketRequestId.
         */
        public Builder ticketRequestId(String ticketRequestId) {
            this.putBodyParameter("ticketRequestId", ticketRequestId);
            this.ticketRequestId = ticketRequestId;
            return this;
        }

        @Override
        public SendAgentConversationMessageRequest build() {
            return new SendAgentConversationMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link SendAgentConversationMessageRequest} extends {@link TeaModel}
     *
     * <p>SendAgentConversationMessageRequest</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("keptLines")
        private Long keptLines;

        @com.aliyun.core.annotation.NameInMap("kind")
        @com.aliyun.core.annotation.Validation(required = true)
        private String kind;

        @com.aliyun.core.annotation.NameInMap("sandboxPath")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sandboxPath;

        @com.aliyun.core.annotation.NameInMap("sizeBytes")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long sizeBytes;

        @com.aliyun.core.annotation.NameInMap("timeRangeEnd")
        private String timeRangeEnd;

        @com.aliyun.core.annotation.NameInMap("timeRangeStart")
        private String timeRangeStart;

        @com.aliyun.core.annotation.NameInMap("totalLines")
        private Long totalLines;

        private Attachments(Builder builder) {
            this.fileName = builder.fileName;
            this.keptLines = builder.keptLines;
            this.kind = builder.kind;
            this.sandboxPath = builder.sandboxPath;
            this.sizeBytes = builder.sizeBytes;
            this.timeRangeEnd = builder.timeRangeEnd;
            this.timeRangeStart = builder.timeRangeStart;
            this.totalLines = builder.totalLines;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return keptLines
         */
        public Long getKeptLines() {
            return this.keptLines;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return sandboxPath
         */
        public String getSandboxPath() {
            return this.sandboxPath;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        /**
         * @return timeRangeEnd
         */
        public String getTimeRangeEnd() {
            return this.timeRangeEnd;
        }

        /**
         * @return timeRangeStart
         */
        public String getTimeRangeStart() {
            return this.timeRangeStart;
        }

        /**
         * @return totalLines
         */
        public Long getTotalLines() {
            return this.totalLines;
        }

        public static final class Builder {
            private String fileName; 
            private Long keptLines; 
            private String kind; 
            private String sandboxPath; 
            private Long sizeBytes; 
            private String timeRangeEnd; 
            private String timeRangeStart; 
            private Long totalLines; 

            private Builder() {
            } 

            private Builder(Attachments model) {
                this.fileName = model.fileName;
                this.keptLines = model.keptLines;
                this.kind = model.kind;
                this.sandboxPath = model.sandboxPath;
                this.sizeBytes = model.sizeBytes;
                this.timeRangeEnd = model.timeRangeEnd;
                this.timeRangeStart = model.timeRangeStart;
                this.totalLines = model.totalLines;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>client.log</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * keptLines.
             */
            public Builder keptLines(Long keptLines) {
                this.keptLines = keptLines;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>client_log</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>client-logs/0198c8a91f4d7f01a3c21e99/client.log</p>
             */
            public Builder sandboxPath(String sandboxPath) {
                this.sandboxPath = sandboxPath;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>114</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            /**
             * timeRangeEnd.
             */
            public Builder timeRangeEnd(String timeRangeEnd) {
                this.timeRangeEnd = timeRangeEnd;
                return this;
            }

            /**
             * timeRangeStart.
             */
            public Builder timeRangeStart(String timeRangeStart) {
                this.timeRangeStart = timeRangeStart;
                return this;
            }

            /**
             * totalLines.
             */
            public Builder totalLines(Long totalLines) {
                this.totalLines = totalLines;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendAgentConversationMessageRequest} extends {@link TeaModel}
     *
     * <p>SendAgentConversationMessageRequest</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataBase64")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 2800000, minLength = 1)
        private String dataBase64;

        @com.aliyun.core.annotation.NameInMap("mediaType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mediaType;

        private Images(Builder builder) {
            this.dataBase64 = builder.dataBase64;
            this.mediaType = builder.mediaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return dataBase64
         */
        public String getDataBase64() {
            return this.dataBase64;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        public static final class Builder {
            private String dataBase64; 
            private String mediaType; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.dataBase64 = model.dataBase64;
                this.mediaType = model.mediaType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAAC0lEQVR4nGNgAAIAAAUAAXpeqz8AAAAASUVORK5CYII=</p>
             */
            public Builder dataBase64(String dataBase64) {
                this.dataBase64 = dataBase64;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>image/png</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
