// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
    private Users users;

    private ListUsersForGroupResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersForGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
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
    public Users getUsers() {
        return this.users;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private String marker; 
        private String requestId; 
        private Users users; 

        /**
         * <p>Indicates whether the response is truncated. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * <blockquote>
         * <p> This parameter is returned only when <code>IsTruncated</code> is <code>true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>789FF581-B3C8-43A8-9115-54304B46D05C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the RAM users.</p>
         */
        public Builder users(Users users) {
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
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("JoinDate")
        private String joinDate;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
        private String userPrincipalName;

        private User(Builder builder) {
            this.displayName = builder.displayName;
            this.joinDate = builder.joinDate;
            this.userId = builder.userId;
            this.userPrincipalName = builder.userPrincipalName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return joinDate
         */
        public String getJoinDate() {
            return this.joinDate;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userPrincipalName
         */
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public static final class Builder {
            private String displayName; 
            private String joinDate; 
            private String userId; 
            private String userPrincipalName; 

            /**
             * <p>The display name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The time when the RAM user was added to the RAM user group. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-20T06:57:00Z</p>
             */
            public Builder joinDate(String joinDate) {
                this.joinDate = joinDate;
                return this;
            }

            /**
             * <p>The ID of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>20732900249392****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The logon name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
             */
            public Builder userPrincipalName(String userPrincipalName) {
                this.userPrincipalName = userPrincipalName;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUsersForGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersForGroupResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("User")
        private java.util.List < User> user;

        private Users(Builder builder) {
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return user
         */
        public java.util.List < User> getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List < User> user; 

            /**
             * User.
             */
            public Builder user(java.util.List < User> user) {
                this.user = user;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
