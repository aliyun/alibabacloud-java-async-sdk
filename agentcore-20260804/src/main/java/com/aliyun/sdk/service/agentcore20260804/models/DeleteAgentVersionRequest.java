// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link DeleteAgentVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgentVersionRequest</p>
 */
public class DeleteAgentVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private DeleteAgentVersionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentId = builder.agentId;
        this.agentVersion = builder.agentVersion;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgentVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<DeleteAgentVersionRequest, Builder> {
        private String workspaceId; 
        private String agentId; 
        private String agentVersion; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgentVersionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentId = request.agentId;
            this.agentVersion = request.agentVersion;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The ID of the AgentCore workspace where the agent resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0123456789abcdef01234</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The ID of the managed or custom agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-0123456789abcdef0123456789abcdef</p>
         */
        public Builder agentId(String agentId) {
            this.putPathParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The system-generated version number, such as v1. This is the agentVersion returned by CreateAgentVersion or ListAgentVersions, not the versionName.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder agentVersion(String agentVersion) {
            this.putPathParameter("agentVersion", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * <p>The client-generated idempotency token. This is a reserved parameter, and the backend does not currently provide persistent idempotency guarantees.</p>
         * 
         * <strong>example:</strong>
         * <p>c2d8a6f0-3b1e-4a7d-9f25-6e4b0c1a8d37</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public DeleteAgentVersionRequest build() {
            return new DeleteAgentVersionRequest(this);
        } 

    } 

}
