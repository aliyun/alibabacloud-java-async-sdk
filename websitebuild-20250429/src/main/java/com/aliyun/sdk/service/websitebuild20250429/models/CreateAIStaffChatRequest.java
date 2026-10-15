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
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250801154628000001</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The chat ID. Pass in this parameter to resume a conversation after an interruption.</p>
         * 
         * <strong>example:</strong>
         * <p>3b465fe1-6f06-4899-af9f-d43d9338df25</p>
         */
        public Builder chatId(String chatId) {
            this.putBodyParameter("ChatId", chatId);
            this.chatId = chatId;
            return this;
        }

        /**
         * <p>The conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5b7105a2-2999-430b-ba23-ba09149d5434</p>
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The list of conversation messages.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("Messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * <p>The additional information for the conversation.</p>
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
             * <p>The message content.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;CodeRevision\&quot;: \&quot;1750040991876284109\&quot;}</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The content type.</p>
             * 
             * <strong>example:</strong>
             * <p>application/octet-stream</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The business extension metadata in Map format. The value must be a JSON string.</p>
             */
            public Builder metaData(java.util.Map<String, String> metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * <p>The conversation role.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx_dn</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The file type.</p>
             * 
             * <strong>example:</strong>
             * <p>risk</p>
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
