// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOfficeSiteUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOfficeSiteUsersResponseBody</p>
 */
public class ListOfficeSiteUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List < Users> users;

    private ListOfficeSiteUsersResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOfficeSiteUsersResponseBody create() {
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
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The usernames of AD users.\
         * <p>
         * If the only Administrator and Guest users exist in the enterprise AD, an empty User array is returned.
         */
        public Builder users(java.util.List < Users> users) {
            this.users = users;
            return this;
        }

        public ListOfficeSiteUsersResponseBody build() {
            return new ListOfficeSiteUsersResponseBody(this);
        } 

    } 

    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("EndUser")
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
             * The display name of the user.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The name of the AD user.
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
