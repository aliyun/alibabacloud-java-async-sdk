// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>Indicates whether the queried entries are truncated. Valid values:</p>
         * <ul>
         * <li>true: The queried entries are truncated.</li>
         * <li>false: The queried entries are not truncated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The groups to which the user is added.</p>
         */
        public Builder joinedGroups(java.util.List < JoinedGroups> joinedGroups) {
            this.joinedGroups = joinedGroups;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is returned for the next page.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of <code>IsTruncated</code> is <code>true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E9BBB45F-7877-5DE9-96A5-20E6CFA48929</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListJoinedGroupsForUserResponseBody build() {
            return new ListJoinedGroupsForUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJoinedGroupsForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListJoinedGroupsForUserResponseBody</p>
     */
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
             * <p>The description of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a group.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>g-00jqzghi2n3o5hkh****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>TestGroup</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The time when the user was added to the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-01T06:58:18Z</p>
             */
            public Builder joinTime(String joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * <p>The type of the group. Valid values:</p>
             * <ul>
             * <li>Manual: The group is manually created.</li>
             * <li>Synchronized: The user is synchronized from an external identity provider (IdP).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder provisionType(String provisionType) {
                this.provisionType = provisionType;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>u-00q8wbq42wiltcrk****</p>
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
