// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Users")
    private Users users;

    private ListUsersResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return users
     */
    public Users getUsers() {
        return this.users;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Users users; 

        /**
         * The number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The list of users.
         */
        public Builder users(Users users) {
            this.users = users;
            return this;
        }

        public ListUsersResponseBody build() {
            return new ListUsersResponseBody(this);
        } 

    } 

    public static class UserInfo extends TeaModel {
        @NameInMap("AddTime")
        private String addTime;

        @NameInMap("Group")
        private String group;

        @NameInMap("Name")
        private String name;

        private UserInfo(Builder builder) {
            this.addTime = builder.addTime;
            this.group = builder.group;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return addTime
         */
        public String getAddTime() {
            return this.addTime;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String addTime; 
            private String group; 
            private String name; 

            /**
             * The time when the user was created.
             */
            public Builder addTime(String addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * The name of the permission group. Valid values:
             * <p>
             * 
             * *   users: an ordinary permission group. It is applicable to ordinary users that need only to submit and debug jobs.
             * *   wheel: a sudo permission group. It is applicable to the administrator who needs to manage the cluster. In addition to submitting and debugging jobs, users who have sudo permissions can run sudo commands to install software and restart nodes.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The username.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
    public static class Users extends TeaModel {
        @NameInMap("UserInfo")
        private java.util.List < UserInfo> userInfo;

        private Users(Builder builder) {
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return userInfo
         */
        public java.util.List < UserInfo> getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private java.util.List < UserInfo> userInfo; 

            /**
             * UserInfo.
             */
            public Builder userInfo(java.util.List < UserInfo> userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
