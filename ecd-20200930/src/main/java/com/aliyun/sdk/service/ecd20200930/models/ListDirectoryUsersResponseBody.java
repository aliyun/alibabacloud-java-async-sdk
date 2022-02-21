// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDirectoryUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListDirectoryUsersResponseBody</p>
 */
public class ListDirectoryUsersResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Users")
    private java.util.List < Users> users;

    private ListDirectoryUsersResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDirectoryUsersResponseBody create() {
        return builder().build();
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
     * @return users
     */
    public java.util.List < Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < Users> users; 

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
         * Users.
         */
        public Builder users(java.util.List < Users> users) {
            this.users = users;
            return this;
        }

        public ListDirectoryUsersResponseBody build() {
            return new ListDirectoryUsersResponseBody(this);
        } 

    } 

    public static class Users extends TeaModel {
        @NameInMap("EndUser")
        private String endUser;

        private Users(Builder builder) {
            this.endUser = builder.endUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return endUser
         */
        public String getEndUser() {
            return this.endUser;
        }

        public static final class Builder {
            private String endUser; 

            /**
             * EndUser.
             */
            public Builder endUser(String endUser) {
                this.endUser = endUser;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
