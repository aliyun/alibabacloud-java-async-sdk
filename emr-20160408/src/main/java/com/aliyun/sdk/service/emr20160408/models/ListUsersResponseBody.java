// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersResponseBody</p>
 */
public class ListUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserList")
    private UserList userList;

    private ListUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userList
     */
    public UserList getUserList() {
        return this.userList;
    }

    public static final class Builder {
        private String requestId; 
        private UserList userList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserList.
         */
        public Builder userList(UserList userList) {
            this.userList = userList;
            return this;
        }

        public ListUsersResponseBody build() {
            return new ListUsersResponseBody(this);
        } 

    } 

    public static class User extends TeaModel {
        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("K8sStatus")
        private String k8sStatus;

        @NameInMap("KerberosStatus")
        private String kerberosStatus;

        @NameInMap("KnoxStatus")
        private String knoxStatus;

        @NameInMap("LinuxStatus")
        private String linuxStatus;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserName")
        private String userName;

        private User(Builder builder) {
            this.groupName = builder.groupName;
            this.k8sStatus = builder.k8sStatus;
            this.kerberosStatus = builder.kerberosStatus;
            this.knoxStatus = builder.knoxStatus;
            this.linuxStatus = builder.linuxStatus;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return k8sStatus
         */
        public String getK8sStatus() {
            return this.k8sStatus;
        }

        /**
         * @return kerberosStatus
         */
        public String getKerberosStatus() {
            return this.kerberosStatus;
        }

        /**
         * @return knoxStatus
         */
        public String getKnoxStatus() {
            return this.knoxStatus;
        }

        /**
         * @return linuxStatus
         */
        public String getLinuxStatus() {
            return this.linuxStatus;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String groupName; 
            private String k8sStatus; 
            private String kerberosStatus; 
            private String knoxStatus; 
            private String linuxStatus; 
            private String userId; 
            private String userName; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * K8sStatus.
             */
            public Builder k8sStatus(String k8sStatus) {
                this.k8sStatus = k8sStatus;
                return this;
            }

            /**
             * KerberosStatus.
             */
            public Builder kerberosStatus(String kerberosStatus) {
                this.kerberosStatus = kerberosStatus;
                return this;
            }

            /**
             * KnoxStatus.
             */
            public Builder knoxStatus(String knoxStatus) {
                this.knoxStatus = knoxStatus;
                return this;
            }

            /**
             * LinuxStatus.
             */
            public Builder linuxStatus(String linuxStatus) {
                this.linuxStatus = linuxStatus;
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
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    public static class UserList extends TeaModel {
        @NameInMap("User")
        private java.util.List < User> user;

        private UserList(Builder builder) {
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
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

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
