// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJoinedGroupsForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListJoinedGroupsForUserResponseBody</p>
 */
public class ListJoinedGroupsForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("JoinedGroups")
    private java.util.List < JoinedGroups> joinedGroups;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCounts")
    private Integer totalCounts;

    private ListJoinedGroupsForUserResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.joinedGroups = builder.joinedGroups;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCounts = builder.totalCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJoinedGroupsForUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return joinedGroups
     */
    public java.util.List < JoinedGroups> getJoinedGroups() {
        return this.joinedGroups;
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
        private Boolean isTruncated; 
        private java.util.List < JoinedGroups> joinedGroups; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCounts; 

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
         * The groups to which the user is added.
         */
        public Builder joinedGroups(java.util.List < JoinedGroups> joinedGroups) {
            this.joinedGroups = joinedGroups;
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

        public ListJoinedGroupsForUserResponseBody build() {
            return new ListJoinedGroupsForUserResponseBody(this);
        } 

    } 

    public static class JoinedGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("JoinTime")
        private String joinTime;

        @com.aliyun.core.annotation.NameInMap("ProvisionType")
        private String provisionType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private JoinedGroups(Builder builder) {
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.joinTime = builder.joinTime;
            this.provisionType = builder.provisionType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JoinedGroups create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String description; 
            private String groupId; 
            private String groupName; 
            private String joinTime; 
            private String provisionType; 
            private String userId; 

            /**
             * The description of the group.
             */
            public Builder description(String description) {
                this.description = description;
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
             * The name of the group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
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
             * The type of the group. Valid values:
             * <p>
             * 
             * *   Manual: The group is manually created.
             * *   Synchronized: The user is synchronized from an external identity provider (IdP).
             */
            public Builder provisionType(String provisionType) {
                this.provisionType = provisionType;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public JoinedGroups build() {
                return new JoinedGroups(this);
            } 

        } 

    }
}
