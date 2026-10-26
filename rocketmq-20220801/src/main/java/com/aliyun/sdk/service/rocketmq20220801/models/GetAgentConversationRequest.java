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
 * {@link GetAgentConversationRequest} extends {@link RequestModel}
 *
 * <p>GetAgentConversationRequest</p>
 */
public class GetAgentConversationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("conversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    private GetAgentConversationRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentConversationRequest create() {
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

    public static final class Builder extends Request.Builder<GetAgentConversationRequest, Builder> {
        private String conversationId; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentConversationRequest request) {
            super(request);
            this.conversationId = request.conversationId;
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

        @Override
        public GetAgentConversationRequest build() {
            return new GetAgentConversationRequest(this);
        } 

    } 

}
