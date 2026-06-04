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
 * {@link ReconnectAppChatRequest} extends {@link RequestModel}
 *
 * <p>ReconnectAppChatRequest</p>
 */
public class ReconnectAppChatRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatId")
    private String chatId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastEventId")
    private Integer lastEventId;

    private ReconnectAppChatRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chatId = builder.chatId;
        this.conversationId = builder.conversationId;
        this.lastEventId = builder.lastEventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReconnectAppChatRequest create() {
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
     * @return lastEventId
     */
    public Integer getLastEventId() {
        return this.lastEventId;
    }

    public static final class Builder extends Request.Builder<ReconnectAppChatRequest, Builder> {
        private String regionId; 
        private String chatId; 
        private String conversationId; 
        private Integer lastEventId; 

        private Builder() {
            super();
        } 

        private Builder(ReconnectAppChatRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chatId = request.chatId;
            this.conversationId = request.conversationId;
            this.lastEventId = request.lastEventId;
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
         * ChatId.
         */
        public Builder chatId(String chatId) {
            this.putQueryParameter("ChatId", chatId);
            this.chatId = chatId;
            return this;
        }

        /**
         * ConversationId.
         */
        public Builder conversationId(String conversationId) {
            this.putQueryParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * LastEventId.
         */
        public Builder lastEventId(Integer lastEventId) {
            this.putQueryParameter("LastEventId", lastEventId);
            this.lastEventId = lastEventId;
            return this;
        }

        @Override
        public ReconnectAppChatRequest build() {
            return new ReconnectAppChatRequest(this);
        } 

    } 

}
