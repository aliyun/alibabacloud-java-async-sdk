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
 * {@link CreateAppChatRequest} extends {@link RequestModel}
 *
 * <p>CreateAppChatRequest</p>
 */
public class CreateAppChatRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BotId")
    private String botId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChatId")
    private String chatId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Messages")
    private String messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private String siteId;

    private CreateAppChatRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.botId = builder.botId;
        this.chatId = builder.chatId;
        this.conversationId = builder.conversationId;
        this.messages = builder.messages;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return botId
     */
    public String getBotId() {
        return this.botId;
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
    public String getMessages() {
        return this.messages;
    }

    /**
     * @return siteId
     */
    public String getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<CreateAppChatRequest, Builder> {
        private String regionId; 
        private String botId; 
        private String chatId; 
        private String conversationId; 
        private String messages; 
        private String siteId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppChatRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.botId = request.botId;
            this.chatId = request.chatId;
            this.conversationId = request.conversationId;
            this.messages = request.messages;
            this.siteId = request.siteId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The bot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Zero2</p>
         */
        public Builder botId(String botId) {
            this.putBodyParameter("BotId", botId);
            this.botId = botId;
            return this;
        }

        /**
         * <p>The chat ID passed in to resume a conversation after execution is interrupted.</p>
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
         * <p>The conversation ID. This parameter is required from the second round onward in multi-turn conversation scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>593fe1a2-d0b4-4fde-a2b0-78ad6a438d41</p>
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The list of conversation messages in JSON array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[\r\n  {\r\n    \&quot;role\&quot;: \&quot;user\&quot;,\r\n    \&quot;content\&quot;: \&quot;Prove that there are only five platonic solids, namely the tetrahedron, octahedron, icosahedron, cube, and dodecahedron.\&quot;\r\n  }\r\n]</p>
         */
        public Builder messages(String messages) {
            this.putBodyParameter("Messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>857240041851344</p>
         */
        public Builder siteId(String siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public CreateAppChatRequest build() {
            return new CreateAppChatRequest(this);
        } 

    } 

}
