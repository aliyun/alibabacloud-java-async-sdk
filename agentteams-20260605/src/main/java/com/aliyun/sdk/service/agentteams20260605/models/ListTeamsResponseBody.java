// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
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
    public static class TeamMembers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private TeamMembers(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TeamMembers create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(TeamMembers model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public TeamMembers build() {
                return new TeamMembers(this);
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
        @com.aliyun.core.annotation.NameInMap("AdminName")
        private String adminName;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LeaderName")
        private String leaderName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TeamMembers")
        private java.util.List<TeamMembers> teamMembers;

        @com.aliyun.core.annotation.NameInMap("WorkerNames")
        private java.util.List<String> workerNames;

        private Items(Builder builder) {
            this.adminName = builder.adminName;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.leaderName = builder.leaderName;
            this.name = builder.name;
            this.status = builder.status;
            this.teamMembers = builder.teamMembers;
            this.workerNames = builder.workerNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return adminName
         */
        public String getAdminName() {
            return this.adminName;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return leaderName
         */
        public String getLeaderName() {
            return this.leaderName;
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
         * @return teamMembers
         */
        public java.util.List<TeamMembers> getTeamMembers() {
            return this.teamMembers;
        }

        /**
         * @return workerNames
         */
        public java.util.List<String> getWorkerNames() {
            return this.workerNames;
        }

        public static final class Builder {
            private String adminName; 
            private String createdAt; 
            private String description; 
            private String instanceId; 
            private String leaderName; 
            private String name; 
            private String status; 
            private java.util.List<TeamMembers> teamMembers; 
            private java.util.List<String> workerNames; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.adminName = model.adminName;
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.leaderName = model.leaderName;
                this.name = model.name;
                this.status = model.status;
                this.teamMembers = model.teamMembers;
                this.workerNames = model.workerNames;
            } 

            /**
             * AdminName.
             */
            public Builder adminName(String adminName) {
                this.adminName = adminName;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LeaderName.
             */
            public Builder leaderName(String leaderName) {
                this.leaderName = leaderName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TeamMembers.
             */
            public Builder teamMembers(java.util.List<TeamMembers> teamMembers) {
                this.teamMembers = teamMembers;
                return this;
            }

            /**
             * WorkerNames.
             */
            public Builder workerNames(java.util.List<String> workerNames) {
                this.workerNames = workerNames;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
