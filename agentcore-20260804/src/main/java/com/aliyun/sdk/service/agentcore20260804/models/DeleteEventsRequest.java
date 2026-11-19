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
 * {@link DeleteEventsRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventsRequest</p>
 */
public class DeleteEventsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeleteEventsRequestBody body;

    private DeleteEventsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryStoreName = builder.memoryStoreName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventsRequest create() {
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
     * @return body
     */
    public DeleteEventsRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<DeleteEventsRequest, Builder> {
        private String workspaceId; 
        private String memoryStoreName; 
        private DeleteEventsRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEventsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryStoreName = request.memoryStoreName;
            this.body = request.body;
        } 

        /**
         * <p>The ID of the workspace.</p>
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
         * <p>The JSON request body.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(DeleteEventsRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public DeleteEventsRequest build() {
            return new DeleteEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteEventsRequest} extends {@link TeaModel}
     *
     * <p>DeleteEventsRequest</p>
     */
    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("teamId")
        private String teamId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Scope(Builder builder) {
            this.agentId = builder.agentId;
            this.sessionId = builder.sessionId;
            this.teamId = builder.teamId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scope create() {
            return builder().build();
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

        public static final class Builder {
            private String agentId; 
            private String sessionId; 
            private String teamId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Scope model) {
                this.agentId = model.agentId;
                this.sessionId = model.sessionId;
                this.teamId = model.teamId;
                this.userId = model.userId;
            } 

            /**
             * <p>The business agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-001</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The ID of the precisely located session.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>session-001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The business team ID.</p>
             * 
             * <strong>example:</strong>
             * <p>team-001</p>
             */
            public Builder teamId(String teamId) {
                this.teamId = teamId;
                return this;
            }

            /**
             * <p>The business user ID. This is not the platform tenant identity.</p>
             * 
             * <strong>example:</strong>
             * <p>user-001</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteEventsRequest} extends {@link TeaModel}
     *
     * <p>DeleteEventsRequest</p>
     */
    public static class DeleteEventsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> eventIds;

        @com.aliyun.core.annotation.NameInMap("scope")
        @com.aliyun.core.annotation.Validation(required = true)
        private Scope scope;

        private DeleteEventsRequestBody(Builder builder) {
            this.eventIds = builder.eventIds;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteEventsRequestBody create() {
            return builder().build();
        }

        /**
         * @return eventIds
         */
        public java.util.List<String> getEventIds() {
            return this.eventIds;
        }

        /**
         * @return scope
         */
        public Scope getScope() {
            return this.scope;
        }

        public static final class Builder {
            private java.util.List<String> eventIds; 
            private Scope scope; 

            private Builder() {
            } 

            private Builder(DeleteEventsRequestBody model) {
                this.eventIds = model.eventIds;
                this.scope = model.scope;
            } 

            /**
             * <p>A list of 1 to 100 unique event IDs. Only events owned by the current session are deleted.</p>
             * <p>This parameter is required.</p>
             */
            public Builder eventIds(java.util.List<String> eventIds) {
                this.eventIds = eventIds;
                return this;
            }

            /**
             * <p>The scope for precise session location.</p>
             * <p>This parameter is required.</p>
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            public DeleteEventsRequestBody build() {
                return new DeleteEventsRequestBody(this);
            } 

        } 

    }
}
