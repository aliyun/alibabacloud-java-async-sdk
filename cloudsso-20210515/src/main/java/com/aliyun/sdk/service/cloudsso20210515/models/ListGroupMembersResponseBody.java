// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupMembersResponseBody</p>
 */
public class ListGroupMembersResponseBody extends TeaModel {
    @NameInMap("GroupMembers")
    private java.util.List < GroupMembers> groupMembers;

    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCounts")
    private Integer totalCounts;

    private ListGroupMembersResponseBody(Builder builder) {
        this.groupMembers = builder.groupMembers;
        this.isTruncated = builder.isTruncated;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCounts = builder.totalCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupMembersResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupMembers
     */
    public java.util.List < GroupMembers> getGroupMembers() {
        return this.groupMembers;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return totalCounts
     */
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static final class Builder {
        private java.util.List < GroupMembers> groupMembers; 
        private Boolean isTruncated; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCounts; 

        /**
         * The users in the group.
         */
        public Builder groupMembers(java.util.List < GroupMembers> groupMembers) {
            this.groupMembers = groupMembers;
            return this;
        }

        /**
         * Indicates whether the queried entries are truncated. Valid values:
         * <p>
         * 
         * *   true: The queried entries are truncated.
         * *   false: The queried entries are not truncated.
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is returned for the next page.
         * <p>
         * 
         * >  This parameter is returned only when the value of `IsTruncated` is `true`.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListGroupMembersResponseBody build() {
            return new ListGroupMembersResponseBody(this);
        } 

    } 

    public static class GroupMembers extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Email")
        private String email;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("JoinTime")
        private String joinTime;

        @NameInMap("ProvisionType")
        private String provisionType;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserName")
        private String userName;

        private GroupMembers(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.groupId = builder.groupId;
            this.joinTime = builder.joinTime;
            this.provisionType = builder.provisionType;
            this.status = builder.status;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupMembers create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return joinTime
         */
        public String getJoinTime() {
            return this.joinTime;
        }

        /**
         * @return provisionType
         */
        public String getProvisionType() {
            return this.provisionType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String description; 
            private String displayName; 
            private String email; 
            private String groupId; 
            private String joinTime; 
            private String provisionType; 
            private String status; 
            private String userId; 
            private String userName; 

            /**
             * The description of the user.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The display name of the user.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The email address of the user.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The ID of the group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The time when the user was added to the user group.
             */
            public Builder joinTime(String joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * The type of the user. Valid values:
             * <p>
             * 
             * *   Manual: The user is manually created.
             * *   Synchronized: The user is synchronized from an external identity provider (IdP).
             */
            public Builder provisionType(String provisionType) {
                this.provisionType = provisionType;
                return this;
            }

            /**
             * The status of the user. Valid values:
             * <p>
             * 
             * *   Enabled: The logon of the user is enabled.
             * *   Disabled: The logon of the user is disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The name of the user.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public GroupMembers build() {
                return new GroupMembers(this);
            } 

        } 

    }
}
