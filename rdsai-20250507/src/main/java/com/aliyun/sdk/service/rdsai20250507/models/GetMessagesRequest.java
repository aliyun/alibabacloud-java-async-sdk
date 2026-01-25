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
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventMode")
    private String eventMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstId")
    private String firstId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    private GetMessagesRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.eventMode = builder.eventMode;
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
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return eventMode
     */
    public String getEventMode() {
        return this.eventMode;
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
        private String conversationId; 
        private String eventMode; 
        private String firstId; 
        private Long limit; 

        private Builder() {
            super();
        } 

        private Builder(GetMessagesRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.eventMode = request.eventMode;
            this.firstId = request.firstId;
            this.limit = request.limit;
        } 

        /**
         * <p>The operation that you want to perform. Set the value to <strong>GetMessages</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>941c6f59-acf5-4e11-9adc-31e52e1f****</p>
         */
        public Builder conversationId(String conversationId) {
            this.putQueryParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * EventMode.
         */
        public Builder eventMode(String eventMode) {
            this.putQueryParameter("EventMode", eventMode);
            this.eventMode = eventMode;
            return this;
        }

        /**
         * <p>The ID of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>038866af-a050-4bc5-bfad-b7bfc838****</p>
         */
        public Builder firstId(String firstId) {
            this.putQueryParameter("FirstId", firstId);
            this.firstId = firstId;
            return this;
        }

        /**
         * <p>The ID of the first message.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
