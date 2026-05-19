// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link CreateAIStaffChatRequest} extends {@link RequestModel}
 *
 * <p>CreateAIStaffChatRequest</p>
 */
public class CreateAIStaffChatRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChatId")
    private String chatId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Messages")
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetaData")
    private java.util.Map<String, String> metaData;

    private CreateAIStaffChatRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.chatId = builder.chatId;
        this.conversationId = builder.conversationId;
        this.messages = builder.messages;
        this.metaData = builder.metaData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIStaffChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return chatId
     */
    public String getChatId() {
        return this.chatId;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return metaData
     */
    public java.util.Map<String, String> getMetaData() {
        return this.metaData;
    }

    public static final class Builder extends Request.Builder<CreateAIStaffChatRequest, Builder> {
        private String bizId; 
        private String chatId; 
        private String conversationId; 
        private java.util.List<Messages> messages; 
        private java.util.Map<String, String> metaData; 

        private Builder() {
            super();
        } 

        private Builder(CreateAIStaffChatRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.chatId = request.chatId;
            this.conversationId = request.conversationId;
            this.messages = request.messages;
            this.metaData = request.metaData;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ChatId.
         */
        public Builder chatId(String chatId) {
            this.putBodyParameter("ChatId", chatId);
            this.chatId = chatId;
            return this;
        }

        /**
         * ConversationId.
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * Messages.
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("Messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * MetaData.
         */
        public Builder metaData(java.util.Map<String, String> metaData) {
            this.putBodyParameter("MetaData", metaData);
            this.metaData = metaData;
            return this;
        }

        @Override
        public CreateAIStaffChatRequest build() {
            return new CreateAIStaffChatRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAIStaffChatRequest} extends {@link TeaModel}
     *
     * <p>CreateAIStaffChatRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("MetaData")
        private java.util.Map<String, String> metaData;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.metaData = builder.metaData;
            this.role = builder.role;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return metaData
         */
        public java.util.Map<String, String> getMetaData() {
            return this.metaData;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private String contentType; 
            private java.util.Map<String, String> metaData; 
            private String role; 
            private String type; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.contentType = model.contentType;
                this.metaData = model.metaData;
                this.role = model.role;
                this.type = model.type;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * MetaData.
             */
            public Builder metaData(java.util.Map<String, String> metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
