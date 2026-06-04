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
 * {@link UpdateAppChatMessageRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppChatMessageRequest</p>
 */
public class UpdateAppChatMessageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddedMetaData")
    private String addedMetaData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    private UpdateAppChatMessageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addedMetaData = builder.addedMetaData;
        this.content = builder.content;
        this.conversationId = builder.conversationId;
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppChatMessageRequest create() {
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
     * @return addedMetaData
     */
    public String getAddedMetaData() {
        return this.addedMetaData;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    public static final class Builder extends Request.Builder<UpdateAppChatMessageRequest, Builder> {
        private String regionId; 
        private String addedMetaData; 
        private String content; 
        private String conversationId; 
        private String messageId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppChatMessageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addedMetaData = request.addedMetaData;
            this.content = request.content;
            this.conversationId = request.conversationId;
            this.messageId = request.messageId;
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
         * AddedMetaData.
         */
        public Builder addedMetaData(String addedMetaData) {
            this.putQueryParameter("AddedMetaData", addedMetaData);
            this.addedMetaData = addedMetaData;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
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
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        @Override
        public UpdateAppChatMessageRequest build() {
            return new UpdateAppChatMessageRequest(this);
        } 

    } 

}
