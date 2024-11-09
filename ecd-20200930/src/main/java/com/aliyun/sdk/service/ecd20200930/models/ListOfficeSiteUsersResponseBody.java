// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The usernames of AD users.<br>If the only Administrator and Guest users exist in the enterprise AD, an empty User array is returned.</p>
         */
        public Builder users(java.util.List < Users> users) {
            this.users = users;
            return this;
        }

        public ListOfficeSiteUsersResponseBody build() {
            return new ListOfficeSiteUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOfficeSiteUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListOfficeSiteUsersResponseBody</p>
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
             * AssignedDesktopNumber.
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
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The name of the AD user.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder endUser(String endUser) {
                this.endUser = endUser;
                return this;
            }

            /**
             * Phone.
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
