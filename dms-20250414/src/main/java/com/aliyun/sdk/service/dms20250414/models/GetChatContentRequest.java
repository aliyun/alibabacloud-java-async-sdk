// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetChatContentRequest} extends {@link RequestModel}
 *
 * <p>GetChatContentRequest</p>
 */
public class GetChatContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Checkpoint")
    private String checkpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private GetChatContentRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.checkpoint = builder.checkpoint;
        this.DMSUnit = builder.DMSUnit;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatContentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return checkpoint
     */
    public String getCheckpoint() {
        return this.checkpoint;
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<GetChatContentRequest, Builder> {
        private String agentId; 
        private String checkpoint; 
        private String DMSUnit; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(GetChatContentRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.checkpoint = request.checkpoint;
            this.DMSUnit = request.DMSUnit;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>The agent ID. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The backend will return output starting from this checkpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder checkpoint(String checkpoint) {
            this.putQueryParameter("Checkpoint", checkpoint);
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * <p>The current DMS unit. Chinese mainland users of Alibaba Cloud should use cn-hangzhou by default.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * <p>The session ID. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sess_12345</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public GetChatContentRequest build() {
            return new GetChatContentRequest(this);
        } 

    } 

}
