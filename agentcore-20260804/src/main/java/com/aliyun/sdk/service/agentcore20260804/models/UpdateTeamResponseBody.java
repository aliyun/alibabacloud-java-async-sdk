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
 * {@link UpdateTeamResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTeamResponseBody</p>
 */
public class UpdateTeamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private UpdateTeamResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTeamResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdateTeamResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The updated team information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message. An error description is returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-123456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateTeamResponseBody build() {
            return new UpdateTeamResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTeamResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateTeamResponseBody</p>
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
             * <p>The agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-123456</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The role of the agent in the team. Valid values: LEADER, WORKER. Each team must have exactly one LEADER.</p>
             * 
             * <strong>example:</strong>
             * <p>WORKER</p>
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
     * {@link UpdateTeamResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateTeamResponseBody</p>
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
             * <p>The role of the user in the team. Valid values: ADMIN, MEMBER. Each team must have exactly one ADMIN.</p>
             * 
             * <strong>example:</strong>
             * <p>ADMIN</p>
             */
            public Builder teamRole(String teamRole) {
                this.teamRole = teamRole;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>usr-123456</p>
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
     * {@link UpdateTeamResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateTeamResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agents")
        private java.util.List<Agents> agents;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("teamId")
        private String teamId;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("users")
        private java.util.List<Users> users;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.agents = builder.agents;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.name = builder.name;
            this.status = builder.status;
            this.teamId = builder.teamId;
            this.updatedAt = builder.updatedAt;
            this.users = builder.users;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agents
         */
        public java.util.List<Agents> getAgents() {
            return this.agents;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return teamId
         */
        public String getTeamId() {
            return this.teamId;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return users
         */
        public java.util.List<Users> getUsers() {
            return this.users;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private java.util.List<Agents> agents; 
            private String createdAt; 
            private String description; 
            private String name; 
            private String status; 
            private String teamId; 
            private String updatedAt; 
            private java.util.List<Users> users; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agents = model.agents;
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.name = model.name;
                this.status = model.status;
                this.teamId = model.teamId;
                this.updatedAt = model.updatedAt;
                this.users = model.users;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The list of agent members in the team.</p>
             */
            public Builder agents(java.util.List<Agents> agents) {
                this.agents = agents;
                return this;
            }

            /**
             * <p>The creation time in UTC, in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The team description.</p>
             * 
             * <strong>example:</strong>
             * <p>Team responsible for intelligent customer service</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The team name. The name can contain only lowercase letters, digits, and hyphens (-). It must start and end with a lowercase letter or digit. The name must be 1 to 128 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>team-01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The team status. Valid values: Creating, Active, Updating, Deleting, Failed, Deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The team ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tm-123456</p>
             */
            public Builder teamId(String teamId) {
                this.teamId = teamId;
                return this;
            }

            /**
             * <p>The time of the last modification in UTC, in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The list of user members in the team.</p>
             */
            public Builder users(java.util.List<Users> users) {
                this.users = users;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-123456</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
