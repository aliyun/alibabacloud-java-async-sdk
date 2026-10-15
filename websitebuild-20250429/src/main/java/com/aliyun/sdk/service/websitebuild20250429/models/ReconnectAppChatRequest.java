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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChatId")
    private String chatId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LastEventId")
    private Integer lastEventId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LatestMessageCreateTime")
    private String latestMessageCreateTime;

    private ReconnectAppChatRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chatId = builder.chatId;
        this.conversationId = builder.conversationId;
        this.lastEventId = builder.lastEventId;
        this.latestMessageCreateTime = builder.latestMessageCreateTime;
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

    /**
     * @return latestMessageCreateTime
     */
    public String getLatestMessageCreateTime() {
        return this.latestMessageCreateTime;
    }

    public static final class Builder extends Request.Builder<ReconnectAppChatRequest, Builder> {
        private String regionId; 
        private String chatId; 
        private String conversationId; 
        private Integer lastEventId; 
        private String latestMessageCreateTime; 

        private Builder() {
            super();
        } 

        private Builder(ReconnectAppChatRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chatId = request.chatId;
            this.conversationId = request.conversationId;
            this.lastEventId = request.lastEventId;
            this.latestMessageCreateTime = request.latestMessageCreateTime;
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
         * <p>The chat record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20833ba4-d189-4c50-9a44-a6bcbda2c93b</p>
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
         * <p>The last event ID.</p>
         */
        public Builder lastEventId(Integer lastEventId) {
            this.putBodyParameter("LastEventId", lastEventId);
            this.lastEventId = lastEventId;
            return this;
        }

        /**
         * <p>The creation time of the latest message.</p>
         */
        public Builder latestMessageCreateTime(String latestMessageCreateTime) {
            this.putBodyParameter("LatestMessageCreateTime", latestMessageCreateTime);
            this.latestMessageCreateTime = latestMessageCreateTime;
            return this;
        }

        @Override
        public ReconnectAppChatRequest build() {
            return new ReconnectAppChatRequest(this);
        } 

    } 

}
