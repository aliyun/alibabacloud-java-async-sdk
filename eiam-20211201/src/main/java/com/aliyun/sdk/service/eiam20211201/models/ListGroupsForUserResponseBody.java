// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupsForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupsForUserResponseBody</p>
 */
public class ListGroupsForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List < Groups> groups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListGroupsForUserResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsForUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return groups
     */
    public java.util.List < Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Groups> groups; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The queried account groups.
         */
        public Builder groups(java.util.List < Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned. The maximum number of entries returned at a time depends on the value of PageSize.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGroupsForUserResponseBody build() {
            return new ListGroupsForUserResponseBody(this);
        } 

    } 

    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupMemberRelationSourceId")
        private String groupMemberRelationSourceId;

        @com.aliyun.core.annotation.NameInMap("GroupMemberRelationSourceType")
        private String groupMemberRelationSourceType;

        private Groups(Builder builder) {
            this.groupId = builder.groupId;
            this.groupMemberRelationSourceId = builder.groupMemberRelationSourceId;
            this.groupMemberRelationSourceType = builder.groupMemberRelationSourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupMemberRelationSourceId
         */
        public String getGroupMemberRelationSourceId() {
            return this.groupMemberRelationSourceId;
        }

        /**
         * @return groupMemberRelationSourceType
         */
        public String getGroupMemberRelationSourceType() {
            return this.groupMemberRelationSourceType;
        }

        public static final class Builder {
            private String groupId; 
            private String groupMemberRelationSourceId; 
            private String groupMemberRelationSourceType; 

            /**
             * The group ID.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupMemberRelationSourceId.
             */
            public Builder groupMemberRelationSourceId(String groupMemberRelationSourceId) {
                this.groupMemberRelationSourceId = groupMemberRelationSourceId;
                return this;
            }

            /**
             * GroupMemberRelationSourceType.
             */
            public Builder groupMemberRelationSourceType(String groupMemberRelationSourceType) {
                this.groupMemberRelationSourceType = groupMemberRelationSourceType;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
