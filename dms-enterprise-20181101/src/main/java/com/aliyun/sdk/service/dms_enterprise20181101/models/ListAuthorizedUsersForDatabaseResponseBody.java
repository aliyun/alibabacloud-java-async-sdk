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
 * {@link ListAuthorizedUsersForDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizedUsersForDatabaseResponseBody</p>
 */
public class ListAuthorizedUsersForDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

    private ListAuthorizedUsersForDatabaseResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedUsersForDatabaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListAuthorizedUsersForDatabaseResponseBody model) {
            this.requestId = model.requestId;
            this.users = model.users;
        } 

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

        public ListAuthorizedUsersForDatabaseResponseBody build() {
            return new ListAuthorizedUsersForDatabaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizedUsersForDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedUsersForDatabaseResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserNickName")
        private String userNickName;

        private Users(Builder builder) {
            this.uid = builder.uid;
            this.userId = builder.userId;
            this.userNickName = builder.userNickName;
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

        public static final class Builder {
            private String uid; 
            private String userId; 
            private String userNickName; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.uid = model.uid;
                this.userId = model.userId;
                this.userNickName = model.userNickName;
            } 

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

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
