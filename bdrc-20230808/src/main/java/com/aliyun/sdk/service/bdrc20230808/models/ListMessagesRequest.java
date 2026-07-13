// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link ListMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListMessagesRequest</p>
 */
public class ListMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageLevel")
    private String messageLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageTimeEarlierThan")
    private Long messageTimeEarlierThan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageTimeLaterThan")
    private Long messageTimeLaterThan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    private String messageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListMessagesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.messageLevel = builder.messageLevel;
        this.messageTimeEarlierThan = builder.messageTimeEarlierThan;
        this.messageTimeLaterThan = builder.messageTimeLaterThan;
        this.messageType = builder.messageType;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return messageLevel
     */
    public String getMessageLevel() {
        return this.messageLevel;
    }

    /**
     * @return messageTimeEarlierThan
     */
    public Long getMessageTimeEarlierThan() {
        return this.messageTimeEarlierThan;
    }

    /**
     * @return messageTimeLaterThan
     */
    public Long getMessageTimeLaterThan() {
        return this.messageTimeLaterThan;
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListMessagesRequest, Builder> {
        private Integer maxResults; 
        private String messageLevel; 
        private Long messageTimeEarlierThan; 
        private Long messageTimeLaterThan; 
        private String messageType; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListMessagesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.messageLevel = request.messageLevel;
            this.messageTimeEarlierThan = request.messageTimeEarlierThan;
            this.messageTimeLaterThan = request.messageTimeLaterThan;
            this.messageType = request.messageType;
            this.nextToken = request.nextToken;
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
         * MessageLevel.
         */
        public Builder messageLevel(String messageLevel) {
            this.putQueryParameter("MessageLevel", messageLevel);
            this.messageLevel = messageLevel;
            return this;
        }

        /**
         * MessageTimeEarlierThan.
         */
        public Builder messageTimeEarlierThan(Long messageTimeEarlierThan) {
            this.putQueryParameter("MessageTimeEarlierThan", messageTimeEarlierThan);
            this.messageTimeEarlierThan = messageTimeEarlierThan;
            return this;
        }

        /**
         * MessageTimeLaterThan.
         */
        public Builder messageTimeLaterThan(Long messageTimeLaterThan) {
            this.putQueryParameter("MessageTimeLaterThan", messageTimeLaterThan);
            this.messageTimeLaterThan = messageTimeLaterThan;
            return this;
        }

        /**
         * MessageType.
         */
        public Builder messageType(String messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
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

        @Override
        public ListMessagesRequest build() {
            return new ListMessagesRequest(this);
        } 

    } 

}
