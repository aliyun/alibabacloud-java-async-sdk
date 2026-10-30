// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link DeleteCopilotSessionRequest} extends {@link RequestModel}
 *
 * <p>DeleteCopilotSessionRequest</p>
 */
public class DeleteCopilotSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private DeleteCopilotSessionRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCopilotSessionRequest create() {
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
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<DeleteCopilotSessionRequest, Builder> {
        private String agentId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCopilotSessionRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.sessionId = request.sessionId;
        } 

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c356bc310e4345c3a602a2912322ad21</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public DeleteCopilotSessionRequest build() {
            return new DeleteCopilotSessionRequest(this);
        } 

    } 

}
