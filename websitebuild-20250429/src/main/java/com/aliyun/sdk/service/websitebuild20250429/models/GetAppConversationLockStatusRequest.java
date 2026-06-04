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
 * {@link GetAppConversationLockStatusRequest} extends {@link RequestModel}
 *
 * <p>GetAppConversationLockStatusRequest</p>
 */
public class GetAppConversationLockStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    private GetAppConversationLockStatusRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppConversationLockStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetAppConversationLockStatusRequest, Builder> {
        private String conversationId; 

        private Builder() {
            super();
        } 

        private Builder(GetAppConversationLockStatusRequest request) {
            super(request);
            this.conversationId = request.conversationId;
        } 

        /**
         * ConversationId.
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        @Override
        public GetAppConversationLockStatusRequest build() {
            return new GetAppConversationLockStatusRequest(this);
        } 

    } 

}
