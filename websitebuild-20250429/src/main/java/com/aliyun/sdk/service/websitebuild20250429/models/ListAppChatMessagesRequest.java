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
         * <p>The chat ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20833ba4-d189-4c50-9a44-a6bcbda2c93b</p>
         */
        public Builder chatId(String chatId) {
            this.putQueryParameter("ChatId", chatId);
            this.chatId = chatId;
            return this;
        }

        /**
         * <p>The conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>593fe1a2-d0b4-4fde-a2b0-78ad6a438d41</p>
         */
        public Builder conversationId(String conversationId) {
            this.putQueryParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The maximum number of results per query. Valid values: 10 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to start the next query. This parameter is empty if there is no next query.</p>
         * 
         * <strong>example:</strong>
         * <p>FFh3Xqm+JgZ/U9Jyb7wdVr9LWk80Tghn5UZjbcWEVEderBcbVF+Y6PS0i8PpCL4PQZ3e0C9oEH0Asd4tJEuGtkl2WuKdiWZpEwadNydQdJPFM=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The section ID.</p>
         * 
         * <strong>example:</strong>
         * <p>169</p>
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
