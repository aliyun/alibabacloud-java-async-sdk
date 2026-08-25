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
 * {@link ListTeamsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTeamsResponseBody</p>
 */
public class ListTeamsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListTeamsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTeamsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListTeamsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTeamsResponseBody build() {
            return new ListTeamsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTeamsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTeamsResponseBody</p>
     */
    public static class Agents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("agentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("teamRole")
        private String teamRole;

        private Agents(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
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
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return teamRole
         */
        public String getTeamRole() {
            return this.teamRole;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String teamRole; 

            private Builder() {
            } 

            private Builder(Agents model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
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
             * agentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
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
     * {@link ListTeamsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTeamsResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("teamRole")
        private String teamRole;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private Users(Builder builder) {
            this.teamRole = builder.teamRole;
            this.userId = builder.userId;
            this.userName = builder.userName;
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

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String teamRole; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.teamRole = model.teamRole;
                this.userId = model.userId;
                this.userName = model.userName;
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

            /**
             * userName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTeamsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTeamsResponseBody</p>
     */
    public static class Items extends TeaModel {
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

        private Items(Builder builder) {
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

        public static Items create() {
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

            private Builder(Items model) {
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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
