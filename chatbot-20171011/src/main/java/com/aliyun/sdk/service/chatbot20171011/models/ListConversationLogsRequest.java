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
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("SessionId")
    private String sessionId;

    private ListConversationLogsRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<ListConversationLogsRequest, Builder> {
        private String agentKey; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(ListConversationLogsRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.sessionId = request.sessionId;
        } 

        /**
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
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
