// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListUsersForGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersForGroupResponseBody</p>
 */
public class ListUsersForGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

    private ListUsersForGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersForGroupResponseBody create() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List<Users> users; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned. The maximum number of entries that can be returned per page is specified by PageSize.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information about accounts.</p>
         */
        public Builder users(java.util.List<Users> users) {
            this.users = users;
            return this;
        }

        public ListUsersForGroupResponseBody build() {
            return new ListUsersForGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUsersForGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersForGroupResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupMemberRelationSourceId")
        private String groupMemberRelationSourceId;

        @com.aliyun.core.annotation.NameInMap("GroupMemberRelationSourceType")
        private String groupMemberRelationSourceType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Users(Builder builder) {
            this.groupMemberRelationSourceId = builder.groupMemberRelationSourceId;
            this.groupMemberRelationSourceType = builder.groupMemberRelationSourceType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
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

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String groupMemberRelationSourceId; 
            private String groupMemberRelationSourceType; 
            private String userId; 

            /**
             * <p>Account membership source id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder groupMemberRelationSourceId(String groupMemberRelationSourceId) {
                this.groupMemberRelationSourceId = groupMemberRelationSourceId;
                return this;
            }

            /**
             * <p>Account membership source type</p>
             * 
             * <strong>example:</strong>
             * <p>build_in</p>
             */
            public Builder groupMemberRelationSourceType(String groupMemberRelationSourceType) {
                this.groupMemberRelationSourceType = groupMemberRelationSourceType;
                return this;
            }

            /**
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
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
}
