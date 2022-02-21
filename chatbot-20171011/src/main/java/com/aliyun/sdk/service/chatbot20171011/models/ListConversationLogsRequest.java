// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConversationLogsRequest} extends {@link RequestModel}
 *
 * <p>ListConversationLogsRequest</p>
 */
public class ListConversationLogsRequest extends Request {
    @Query
    @NameInMap("SessionId")
    private String sessionId;

    private ListConversationLogsRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConversationLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<ListConversationLogsRequest, Builder> {
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(ListConversationLogsRequest response) {
            super(response);
            this.sessionId = response.sessionId;
        } 

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public ListConversationLogsRequest build() {
            return new ListConversationLogsRequest(this);
        } 

    } 

}
