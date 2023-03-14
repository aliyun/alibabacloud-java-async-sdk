// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserGroupsResponseBody</p>
 */
public class ListUserGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("UserGroups")
    private java.util.List < UserGroups> userGroups;

    private ListUserGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.userGroups = builder.userGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserGroupsResponseBody create() {
        return builder().build();
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return userGroups
     */
    public java.util.List < UserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < UserGroups> userGroups; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of user groups returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The user groups returned.
         */
        public Builder userGroups(java.util.List < UserGroups> userGroups) {
            this.userGroups = userGroups;
            return this;
        }

        public ListUserGroupsResponseBody build() {
            return new ListUserGroupsResponseBody(this);
        } 

    } 

    public static class UserGroups extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("MemberCount")
        private Integer memberCount;

        @NameInMap("UserGroupId")
        private String userGroupId;

        @NameInMap("UserGroupName")
        private String userGroupName;

        private UserGroups(Builder builder) {
            this.comment = builder.comment;
            this.memberCount = builder.memberCount;
            this.userGroupId = builder.userGroupId;
            this.userGroupName = builder.userGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroups create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return memberCount
         */
        public Integer getMemberCount() {
            return this.memberCount;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        /**
         * @return userGroupName
         */
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public static final class Builder {
            private String comment; 
            private Integer memberCount; 
            private String userGroupId; 
            private String userGroupName; 

            /**
             * The description of the user group.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The number of users in the user group.
             */
            public Builder memberCount(Integer memberCount) {
                this.memberCount = memberCount;
                return this;
            }

            /**
             * The ID of the user group.
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * The name of the user group.
             */
            public Builder userGroupName(String userGroupName) {
                this.userGroupName = userGroupName;
                return this;
            }

            public UserGroups build() {
                return new UserGroups(this);
            } 

        } 

    }
}
