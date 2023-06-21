// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersForGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersForGroupResponseBody</p>
 */
public class ListUsersForGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("Users")
    private java.util.List < Users> users;

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
    public java.util.List < Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List < Users> users; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned. The maximum number of entries that can be returned per page is specified by PageSize.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The information about accounts.
         */
        public Builder users(java.util.List < Users> users) {
            this.users = users;
            return this;
        }

        public ListUsersForGroupResponseBody build() {
            return new ListUsersForGroupResponseBody(this);
        } 

    } 

    public static class Users extends TeaModel {
        @NameInMap("UserId")
        private String userId;

        private Users(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String userId; 

            /**
             * The account ID.
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
