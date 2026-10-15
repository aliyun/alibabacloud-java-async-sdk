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
 * {@link AuthorizeAppProxyOpsRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeAppProxyOpsRequest</p>
 */
public class AuthorizeAppProxyOpsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    private AuthorizeAppProxyOpsRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeAppProxyOpsRequest create() {
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

    public static final class Builder extends Request.Builder<AuthorizeAppProxyOpsRequest, Builder> {
        private String conversationId; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeAppProxyOpsRequest request) {
            super(request);
            this.conversationId = request.conversationId;
        } 

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>593fe1a2-d0b4-4fde-a2b0-78ad6a438d41</p>
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        @Override
        public AuthorizeAppProxyOpsRequest build() {
            return new AuthorizeAppProxyOpsRequest(this);
        } 

    } 

}
