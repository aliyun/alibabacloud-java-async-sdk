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
 * {@link GetAgentConversationEventsRequest} extends {@link RequestModel}
 *
 * <p>GetAgentConversationEventsRequest</p>
 */
public class GetAgentConversationEventsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("conversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("after")
    private Long after;

    private GetAgentConversationEventsRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.after = builder.after;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentConversationEventsRequest create() {
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
     * @return after
     */
    public Long getAfter() {
        return this.after;
    }

    public static final class Builder extends Request.Builder<GetAgentConversationEventsRequest, Builder> {
        private String conversationId; 
        private Long after; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentConversationEventsRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.after = request.after;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0198c8a91f4d7f01a3c21e97</p>
         */
        public Builder conversationId(String conversationId) {
            this.putPathParameter("conversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * after.
         */
        public Builder after(Long after) {
            this.putQueryParameter("after", after);
            this.after = after;
            return this;
        }

        @Override
        public GetAgentConversationEventsRequest build() {
            return new GetAgentConversationEventsRequest(this);
        } 

    } 

}
