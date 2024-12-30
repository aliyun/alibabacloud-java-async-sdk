// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListAuthorizedUsersForInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizedUsersForInstanceResponseBody</p>
 */
public class ListAuthorizedUsersForInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

    private ListAuthorizedUsersForInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedUsersForInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Users> users; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(java.util.List<Users> users) {
            this.users = users;
            return this;
        }

        public ListAuthorizedUsersForInstanceResponseBody build() {
            return new ListAuthorizedUsersForInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizedUsersForInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedUsersForInstanceResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserNickName")
        private String userNickName;

        @com.aliyun.core.annotation.NameInMap("UserRealName")
        private String userRealName;

        private Users(Builder builder) {
            this.uid = builder.uid;
            this.userId = builder.userId;
            this.userNickName = builder.userNickName;
            this.userRealName = builder.userRealName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userNickName
         */
        public String getUserNickName() {
            return this.userNickName;
        }

        /**
         * @return userRealName
         */
        public String getUserRealName() {
            return this.userRealName;
        }

        public static final class Builder {
            private String uid; 
            private String userId; 
            private String userNickName; 
            private String userRealName; 

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserNickName.
             */
            public Builder userNickName(String userNickName) {
                this.userNickName = userNickName;
                return this;
            }

            /**
             * UserRealName.
             */
            public Builder userRealName(String userRealName) {
                this.userRealName = userRealName;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
