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
 * {@link UpdateAgentConversationShareScopeRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgentConversationShareScopeRequest</p>
 */
public class UpdateAgentConversationShareScopeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("conversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shareScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareScope;

    private UpdateAgentConversationShareScopeRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.shareScope = builder.shareScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentConversationShareScopeRequest create() {
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
     * @return shareScope
     */
    public String getShareScope() {
        return this.shareScope;
    }

    public static final class Builder extends Request.Builder<UpdateAgentConversationShareScopeRequest, Builder> {
        private String conversationId; 
        private String shareScope; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentConversationShareScopeRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.shareScope = request.shareScope;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant_viewer</p>
         */
        public Builder shareScope(String shareScope) {
            this.putBodyParameter("shareScope", shareScope);
            this.shareScope = shareScope;
            return this;
        }

        @Override
        public UpdateAgentConversationShareScopeRequest build() {
            return new UpdateAgentConversationShareScopeRequest(this);
        } 

    } 

}
