// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link ListAgentConversationsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentConversationsRequest</p>
 */
public class ListAgentConversationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("purpose")
    private String purpose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("q")
    private String q;

    private ListAgentConversationsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.purpose = builder.purpose;
        this.q = builder.q;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentConversationsRequest create() {
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return purpose
     */
    public String getPurpose() {
        return this.purpose;
    }

    /**
     * @return q
     */
    public String getQ() {
        return this.q;
    }

    public static final class Builder extends Request.Builder<ListAgentConversationsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String purpose; 
        private String q; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentConversationsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.purpose = request.purpose;
            this.q = request.q;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * purpose.
         */
        public Builder purpose(String purpose) {
            this.putQueryParameter("purpose", purpose);
            this.purpose = purpose;
            return this;
        }

        /**
         * q.
         */
        public Builder q(String q) {
            this.putQueryParameter("q", q);
            this.q = q;
            return this;
        }

        @Override
        public ListAgentConversationsRequest build() {
            return new ListAgentConversationsRequest(this);
        } 

    } 

}
