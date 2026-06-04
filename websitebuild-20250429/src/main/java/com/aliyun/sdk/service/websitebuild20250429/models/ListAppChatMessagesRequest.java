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
 * {@link ListAppChatMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListAppChatMessagesRequest</p>
 */
public class ListAppChatMessagesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SectionId")
    private String sectionId;

    private ListAppChatMessagesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chatId = builder.chatId;
        this.conversationId = builder.conversationId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.sectionId = builder.sectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppChatMessagesRequest create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return sectionId
     */
    public String getSectionId() {
        return this.sectionId;
    }

    public static final class Builder extends Request.Builder<ListAppChatMessagesRequest, Builder> {
        private String regionId; 
        private String chatId; 
        private String conversationId; 
        private Integer maxResults; 
        private String nextToken; 
        private String sectionId; 

        private Builder() {
            super();
        } 

        private Builder(ListAppChatMessagesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chatId = request.chatId;
            this.conversationId = request.conversationId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.sectionId = request.sectionId;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * SectionId.
         */
        public Builder sectionId(String sectionId) {
            this.putQueryParameter("SectionId", sectionId);
            this.sectionId = sectionId;
            return this;
        }

        @Override
        public ListAppChatMessagesRequest build() {
            return new ListAppChatMessagesRequest(this);
        } 

    } 

}
