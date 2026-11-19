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
 * {@link DeleteMemorySessionRequest} extends {@link RequestModel}
 *
 * <p>DeleteMemorySessionRequest</p>
 */
public class DeleteMemorySessionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("teamId")
    private String teamId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private DeleteMemorySessionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryStoreName = builder.memoryStoreName;
        this.sessionId = builder.sessionId;
        this.agentId = builder.agentId;
        this.teamId = builder.teamId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMemorySessionRequest create() {
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
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return teamId
     */
    public String getTeamId() {
        return this.teamId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteMemorySessionRequest, Builder> {
        private String workspaceId; 
        private String memoryStoreName; 
        private String sessionId; 
        private String agentId; 
        private String teamId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMemorySessionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryStoreName = request.memoryStoreName;
            this.sessionId = request.sessionId;
            this.agentId = request.agentId;
            this.teamId = request.teamId;
            this.userId = request.userId;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the memory store.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-memory</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putPathParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * <p>sessionId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>agentId</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>teamId</p>
         * 
         * <strong>example:</strong>
         * <p>team-001</p>
         */
        public Builder teamId(String teamId) {
            this.putQueryParameter("teamId", teamId);
            this.teamId = teamId;
            return this;
        }

        /**
         * <p>userId</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteMemorySessionRequest build() {
            return new DeleteMemorySessionRequest(this);
        } 

    } 

}
