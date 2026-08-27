// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link StopChatRequest} extends {@link RequestModel}
 *
 * <p>StopChatRequest</p>
 */
public class StopChatRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentVersion")
    private String agentVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private StopChatRequest(Builder builder) {
        super(builder);
        this.agentVersion = builder.agentVersion;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<StopChatRequest, Builder> {
        private String agentVersion; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(StopChatRequest request) {
            super(request);
            this.agentVersion = request.agentVersion;
            this.sessionId = request.sessionId;
        } 

        /**
         * AgentVersion.
         */
        public Builder agentVersion(String agentVersion) {
            this.putQueryParameter("AgentVersion", agentVersion);
            this.agentVersion = agentVersion;
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
        public StopChatRequest build() {
            return new StopChatRequest(this);
        } 

    } 

}
