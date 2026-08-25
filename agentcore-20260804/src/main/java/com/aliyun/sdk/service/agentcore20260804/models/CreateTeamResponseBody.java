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
 * {@link CreateTeamResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTeamResponseBody</p>
 */
public class CreateTeamResponseBody extends TeaModel {
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

    private CreateTeamResponseBody(Builder builder) {
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

    public static CreateTeamResponseBody create() {
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

        private Builder(CreateTeamResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateTeamResponseBody build() {
            return new CreateTeamResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTeamResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTeamResponseBody</p>
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
     * {@link CreateTeamResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTeamResponseBody</p>
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
     * {@link CreateTeamResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTeamResponseBody</p>
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
             * agents.
             */
            public Builder agents(java.util.List<Agents> agents) {
                this.agents = agents;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * teamId.
             */
            public Builder teamId(String teamId) {
                this.teamId = teamId;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * users.
             */
            public Builder users(java.util.List<Users> users) {
                this.users = users;
                return this;
            }

            /**
             * workspaceId.
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
