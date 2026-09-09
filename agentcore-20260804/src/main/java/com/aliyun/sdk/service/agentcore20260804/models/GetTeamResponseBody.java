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
 * {@link GetTeamResponseBody} extends {@link TeaModel}
 *
 * <p>GetTeamResponseBody</p>
 */
public class GetTeamResponseBody extends TeaModel {
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

    private GetTeamResponseBody(Builder builder) {
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

    public static GetTeamResponseBody create() {
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

        private Builder(GetTeamResponseBody model) {
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
         * <p>The team details.</p>
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
         * <p>The response message. An error description is returned if the request failed.</p>
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

        public GetTeamResponseBody build() {
            return new GetTeamResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTeamResponseBody} extends {@link TeaModel}
     *
     * <p>GetTeamResponseBody</p>
     */
    public static class Agents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("createMode")
        private String createMode;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("deployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("effectiveSpecVersion")
        private Long effectiveSpecVersion;

        @com.aliyun.core.annotation.NameInMap("latestSpecVersion")
        private Long latestSpecVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("runtime")
        private String runtime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("teamRole")
        private String teamRole;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Agents(Builder builder) {
            this.agentId = builder.agentId;
            this.createMode = builder.createMode;
            this.createdAt = builder.createdAt;
            this.deployType = builder.deployType;
            this.description = builder.description;
            this.effectiveSpecVersion = builder.effectiveSpecVersion;
            this.latestSpecVersion = builder.latestSpecVersion;
            this.name = builder.name;
            this.runtime = builder.runtime;
            this.status = builder.status;
            this.teamRole = builder.teamRole;
            this.updatedAt = builder.updatedAt;
            this.workspaceId = builder.workspaceId;
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
         * @return createMode
         */
        public String getCreateMode() {
            return this.createMode;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectiveSpecVersion
         */
        public Long getEffectiveSpecVersion() {
            return this.effectiveSpecVersion;
        }

        /**
         * @return latestSpecVersion
         */
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return teamRole
         */
        public String getTeamRole() {
            return this.teamRole;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String agentId; 
            private String createMode; 
            private String createdAt; 
            private String deployType; 
            private String description; 
            private Long effectiveSpecVersion; 
            private Long latestSpecVersion; 
            private String name; 
            private String runtime; 
            private String status; 
            private String teamRole; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Agents model) {
                this.agentId = model.agentId;
                this.createMode = model.createMode;
                this.createdAt = model.createdAt;
                this.deployType = model.deployType;
                this.description = model.description;
                this.effectiveSpecVersion = model.effectiveSpecVersion;
                this.latestSpecVersion = model.latestSpecVersion;
                this.name = model.name;
                this.runtime = model.runtime;
                this.status = model.status;
                this.teamRole = model.teamRole;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
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
             * <p>The creation mode of the agent. CUSTOM indicates custom creation. TEMPLATE indicates creation from a template.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
                return this;
            }

            /**
             * <p>The creation time in UTC, formatted in RFC 3339.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The deployment mode of the agent. MANAGED indicates platform-managed deployment. SELF_HOSTED indicates self-hosted deployment.</p>
             * 
             * <strong>example:</strong>
             * <p>MANAGED</p>
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * <p>The agent description.</p>
             * 
             * <strong>example:</strong>
             * <p>An agent that handles after-sales inquiries</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The currently effective specification version number of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder effectiveSpecVersion(Long effectiveSpecVersion) {
                this.effectiveSpecVersion = effectiveSpecVersion;
                return this;
            }

            /**
             * <p>The latest specification version number of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder latestSpecVersion(Long latestSpecVersion) {
                this.latestSpecVersion = latestSpecVersion;
                return this;
            }

            /**
             * <p>The agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The runtime type of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>qwenpaw</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The agent status. Valid values: Creating, Running, Failed, Updating, Deleting, and Deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The role of the agent in the team. Valid values: LEADER and WORKER.</p>
             * 
             * <strong>example:</strong>
             * <p>WORKER</p>
             */
            public Builder teamRole(String teamRole) {
                this.teamRole = teamRole;
                return this;
            }

            /**
             * <p>The last modification time in UTC, formatted in RFC 3339.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
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

            public Agents build() {
                return new Agents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTeamResponseBody} extends {@link TeaModel}
     *
     * <p>GetTeamResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authMethod")
        private String authMethod;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("initialPassword")
        private String initialPassword;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("teamRole")
        private String teamRole;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Users(Builder builder) {
            this.authMethod = builder.authMethod;
            this.createdAt = builder.createdAt;
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.initialPassword = builder.initialPassword;
            this.name = builder.name;
            this.note = builder.note;
            this.status = builder.status;
            this.teamRole = builder.teamRole;
            this.updatedAt = builder.updatedAt;
            this.userId = builder.userId;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return authMethod
         */
        public String getAuthMethod() {
            return this.authMethod;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return initialPassword
         */
        public String getInitialPassword() {
            return this.initialPassword;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return teamRole
         */
        public String getTeamRole() {
            return this.teamRole;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String authMethod; 
            private String createdAt; 
            private String displayName; 
            private String email; 
            private String initialPassword; 
            private String name; 
            private String note; 
            private String status; 
            private String teamRole; 
            private String updatedAt; 
            private String userId; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.authMethod = model.authMethod;
                this.createdAt = model.createdAt;
                this.displayName = model.displayName;
                this.email = model.email;
                this.initialPassword = model.initialPassword;
                this.name = model.name;
                this.note = model.note;
                this.status = model.status;
                this.teamRole = model.teamRole;
                this.updatedAt = model.updatedAt;
                this.userId = model.userId;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The authentication method of the user. password indicates local password authentication within the workspace. dingtalk and feishu indicate that the user is synchronized and authenticated by the corresponding external identity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder authMethod(String authMethod) {
                this.authMethod = authMethod;
                return this;
            }

            /**
             * <p>The creation time in UTC, formatted in RFC 3339.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The display name of the user. The name must be 1 to 32 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>John Doe</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The email address of the user. The address can be up to 256 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:user-01@example.com">user-01@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The initial password of the user. If a password was specified during creation, that password is returned. If no password was specified, a random password generated by the server is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Example@2026</p>
             */
            public Builder initialPassword(String initialPassword) {
                this.initialPassword = initialPassword;
                return this;
            }

            /**
             * <p>The username. The name must be unique within the workspace and can contain only lowercase letters, digits, and hyphens (-). It must start and end with a lowercase letter or digit. The name must be 1 to 32 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>user-01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The note for the user. The note can be up to 1024 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>Agent operations group member</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * <p>The user status. Valid values: Creating, Active, Updating, Deleting, Failed, and DeleteFailed.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The role of the user in the team. Valid values: ADMIN and MEMBER. Each team must have exactly one ADMIN.</p>
             * 
             * <strong>example:</strong>
             * <p>ADMIN</p>
             */
            public Builder teamRole(String teamRole) {
                this.teamRole = teamRole;
                return this;
            }

            /**
             * <p>The last modification time in UTC, formatted in RFC 3339.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
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

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTeamResponseBody} extends {@link TeaModel}
     *
     * <p>GetTeamResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

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
            this.regionId = builder.regionId;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private String regionId; 
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
                this.regionId = model.regionId;
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
             * <p>The creation time in UTC, formatted in RFC 3339.</p>
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
             * <p>A team responsible for intelligent customer service</p>
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
             * <p>The region ID where the resource resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The team status. Valid values: Creating, Active, Updating, Deleting, Failed, and Deleted.</p>
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
             * <p>The last modification time in UTC, formatted in RFC 3339.</p>
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
