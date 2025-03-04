// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ListDirectoryUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListDirectoryUsersResponseBody</p>
 */
public class ListDirectoryUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

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
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<Users> users; 

        /**
         * <p>The token used to start the next query. If the value of this parameter is empty, all results are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The names of users corresponding to the AD directory. If the AD directory contains only Administrator and Guest, an empty Users array is returned.</p>
         */
        public Builder users(java.util.List<Users> users) {
            this.users = users;
            return this;
        }

        public ListDirectoryUsersResponseBody build() {
            return new ListDirectoryUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDirectoryUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDirectoryUsersResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssignedDesktopNumber")
        private Integer assignedDesktopNumber;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EndUser")
        private String endUser;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        private Users(Builder builder) {
            this.assignedDesktopNumber = builder.assignedDesktopNumber;
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.endUser = builder.endUser;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return assignedDesktopNumber
         */
        public Integer getAssignedDesktopNumber() {
            return this.assignedDesktopNumber;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return endUser
         */
        public String getEndUser() {
            return this.endUser;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private Integer assignedDesktopNumber; 
            private String displayName; 
            private String email; 
            private String endUser; 
            private String phone; 

            /**
             * <p>The number of assigned cloud computers.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder assignedDesktopNumber(Integer assignedDesktopNumber) {
                this.assignedDesktopNumber = assignedDesktopNumber;
                return this;
            }

            /**
             * <p>The display name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The email address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:user@example.com">user@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder endUser(String endUser) {
                this.endUser = endUser;
                return this;
            }

            /**
             * <p>The mobile number.</p>
             * 
             * <strong>example:</strong>
             * <p>130********</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
