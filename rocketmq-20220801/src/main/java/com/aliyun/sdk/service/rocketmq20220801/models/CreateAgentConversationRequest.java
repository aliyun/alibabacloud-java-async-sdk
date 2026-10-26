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
 * {@link CreateAgentConversationRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentConversationRequest</p>
 */
public class CreateAgentConversationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("initialMessage")
    private InitialMessage initialMessage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private CreateAgentConversationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.initialMessage = builder.initialMessage;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentConversationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return initialMessage
     */
    public InitialMessage getInitialMessage() {
        return this.initialMessage;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateAgentConversationRequest, Builder> {
        private String clientToken; 
        private InitialMessage initialMessage; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentConversationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.initialMessage = request.initialMessage;
            this.title = request.title;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>conversation-request-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * initialMessage.
         */
        public Builder initialMessage(InitialMessage initialMessage) {
            this.putBodyParameter("initialMessage", initialMessage);
            this.initialMessage = initialMessage;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateAgentConversationRequest build() {
            return new CreateAgentConversationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentConversationRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentConversationRequest</p>
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
    /**
     * 
     * {@link CreateAgentConversationRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentConversationRequest</p>
     */
    public static class InitialMessage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clientContext")
        private String clientContext;

        @com.aliyun.core.annotation.NameInMap("images")
        private java.util.List<Images> images;

        @com.aliyun.core.annotation.NameInMap("message")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 50000)
        private String message;

        @com.aliyun.core.annotation.NameInMap("messageType")
        private String messageType;

        @com.aliyun.core.annotation.NameInMap("ticketRequestId")
        @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
        private String ticketRequestId;

        private InitialMessage(Builder builder) {
            this.clientContext = builder.clientContext;
            this.images = builder.images;
            this.message = builder.message;
            this.messageType = builder.messageType;
            this.ticketRequestId = builder.ticketRequestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitialMessage create() {
            return builder().build();
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

        public static final class Builder {
            private String clientContext; 
            private java.util.List<Images> images; 
            private String message; 
            private String messageType; 
            private String ticketRequestId; 

            private Builder() {
            } 

            private Builder(InitialMessage model) {
                this.clientContext = model.clientContext;
                this.images = model.images;
                this.message = model.message;
                this.messageType = model.messageType;
                this.ticketRequestId = model.ticketRequestId;
            } 

            /**
             * clientContext.
             */
            public Builder clientContext(String clientContext) {
                this.clientContext = clientContext;
                return this;
            }

            /**
             * images.
             */
            public Builder images(java.util.List<Images> images) {
                this.images = images;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>请排查实例消息堆积原因</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * messageType.
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * ticketRequestId.
             */
            public Builder ticketRequestId(String ticketRequestId) {
                this.ticketRequestId = ticketRequestId;
                return this;
            }

            public InitialMessage build() {
                return new InitialMessage(this);
            } 

        } 

    }
}
