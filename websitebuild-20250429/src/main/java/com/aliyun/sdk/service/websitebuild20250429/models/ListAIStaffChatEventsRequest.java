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
 * {@link ListAIStaffChatEventsRequest} extends {@link RequestModel}
 *
 * <p>ListAIStaffChatEventsRequest</p>
 */
public class ListAIStaffChatEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChatId")
    private String chatId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LastEventId")
    private Integer lastEventId;

    private ListAIStaffChatEventsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.chatId = builder.chatId;
        this.conversationId = builder.conversationId;
        this.lastEventId = builder.lastEventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIStaffChatEventsRequest create() {
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
     * @return lastEventId
     */
    public Integer getLastEventId() {
        return this.lastEventId;
    }

    public static final class Builder extends Request.Builder<ListAIStaffChatEventsRequest, Builder> {
        private String bizId; 
        private String chatId; 
        private String conversationId; 
        private Integer lastEventId; 

        private Builder() {
            super();
        } 

        private Builder(ListAIStaffChatEventsRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.chatId = request.chatId;
            this.conversationId = request.conversationId;
            this.lastEventId = request.lastEventId;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
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
         * LastEventId.
         */
        public Builder lastEventId(Integer lastEventId) {
            this.putBodyParameter("LastEventId", lastEventId);
            this.lastEventId = lastEventId;
            return this;
        }

        @Override
        public ListAIStaffChatEventsRequest build() {
            return new ListAIStaffChatEventsRequest(this);
        } 

    } 

}
