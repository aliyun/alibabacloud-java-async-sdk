// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetMessagesRequest} extends {@link RequestModel}
 *
 * <p>GetMessagesRequest</p>
 */
public class GetMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstId")
    private String firstId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    private GetMessagesRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.conversationId = builder.conversationId;
        this.firstId = builder.firstId;
        this.limit = builder.limit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return firstId
     */
    public String getFirstId() {
        return this.firstId;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    public static final class Builder extends Request.Builder<GetMessagesRequest, Builder> {
        private String apiId; 
        private String conversationId; 
        private String firstId; 
        private Long limit; 

        private Builder() {
            super();
        } 

        private Builder(GetMessagesRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.conversationId = request.conversationId;
            this.firstId = request.firstId;
            this.limit = request.limit;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
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
         * FirstId.
         */
        public Builder firstId(String firstId) {
            this.putQueryParameter("FirstId", firstId);
            this.firstId = firstId;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        @Override
        public GetMessagesRequest build() {
            return new GetMessagesRequest(this);
        } 

    } 

}
