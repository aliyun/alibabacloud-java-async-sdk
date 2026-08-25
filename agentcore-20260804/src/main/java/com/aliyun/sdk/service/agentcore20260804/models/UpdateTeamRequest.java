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
 * {@link UpdateTeamRequest} extends {@link RequestModel}
 *
 * <p>UpdateTeamRequest</p>
 */
public class UpdateTeamRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("teamId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String teamId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateTeamRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateTeamRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.teamId = builder.teamId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTeamRequest create() {
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
     * @return teamId
     */
    public String getTeamId() {
        return this.teamId;
    }

    /**
     * @return body
     */
    public UpdateTeamRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateTeamRequest, Builder> {
        private String workspaceId; 
        private String teamId; 
        private UpdateTeamRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTeamRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.teamId = request.teamId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tm-123456</p>
         */
        public Builder teamId(String teamId) {
            this.putPathParameter("teamId", teamId);
            this.teamId = teamId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateTeamRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateTeamRequest build() {
            return new UpdateTeamRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTeamRequest} extends {@link TeaModel}
     *
     * <p>UpdateTeamRequest</p>
     */
    public static class Agents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("teamRole")
        private String teamRole;

        private Agents(Builder builder) {
            this.agentId = builder.agentId;
            this.teamRole = builder.teamRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agents create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return teamRole
         */
        public String getTeamRole() {
            return this.teamRole;
        }

        public static final class Builder {
            private String agentId; 
            private String teamRole; 

            private Builder() {
            } 

            private Builder(Agents model) {
                this.agentId = model.agentId;
                this.teamRole = model.teamRole;
            } 

            /**
             * agentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * teamRole.
             */
            public Builder teamRole(String teamRole) {
                this.teamRole = teamRole;
                return this;
            }

            public Agents build() {
                return new Agents(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTeamRequest} extends {@link TeaModel}
     *
     * <p>UpdateTeamRequest</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("teamRole")
        private String teamRole;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Users(Builder builder) {
            this.teamRole = builder.teamRole;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return teamRole
         */
        public String getTeamRole() {
            return this.teamRole;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String teamRole; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.teamRole = model.teamRole;
                this.userId = model.userId;
            } 

            /**
             * teamRole.
             */
            public Builder teamRole(String teamRole) {
                this.teamRole = teamRole;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTeamRequest} extends {@link TeaModel}
     *
     * <p>UpdateTeamRequest</p>
     */
    public static class UpdateTeamRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agents")
        private java.util.List<Agents> agents;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("users")
        private java.util.List<Users> users;

        private UpdateTeamRequestBody(Builder builder) {
            this.agents = builder.agents;
            this.description = builder.description;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateTeamRequestBody create() {
            return builder().build();
        }

        /**
         * @return agents
         */
        public java.util.List<Agents> getAgents() {
            return this.agents;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return users
         */
        public java.util.List<Users> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private java.util.List<Agents> agents; 
            private String description; 
            private java.util.List<Users> users; 

            private Builder() {
            } 

            private Builder(UpdateTeamRequestBody model) {
                this.agents = model.agents;
                this.description = model.description;
                this.users = model.users;
            } 

            /**
             * agents.
             */
            public Builder agents(java.util.List<Agents> agents) {
                this.agents = agents;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * users.
             */
            public Builder users(java.util.List<Users> users) {
                this.users = users;
                return this;
            }

            public UpdateTeamRequestBody build() {
                return new UpdateTeamRequestBody(this);
            } 

        } 

    }
}
