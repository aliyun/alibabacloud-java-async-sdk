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
         * The token used to start the next query. If the value of this parameter is empty, all results are returned.
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
         * The names of users corresponding to the AD directory. If the AD directory corresponds only to the `Administrator` and `Guest` users, the returned `Users` value is empty.
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
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("EndUser")
        private String endUser;

        private Users(Builder builder) {
            this.displayName = builder.displayName;
            this.endUser = builder.endUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return endUser
         */
        public String getEndUser() {
            return this.endUser;
        }

        public static final class Builder {
            private String displayName; 
            private String endUser; 

            /**
             * The display name.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The name of the user.
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
