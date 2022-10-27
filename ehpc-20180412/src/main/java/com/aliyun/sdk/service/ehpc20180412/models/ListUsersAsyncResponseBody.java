// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersAsyncResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersAsyncResponseBody</p>
 */
public class ListUsersAsyncResponseBody extends TeaModel {
    @NameInMap("AsyncId")
    private String asyncId;

    @NameInMap("AsyncStatus")
    private String asyncStatus;

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

    private ListUsersAsyncResponseBody(Builder builder) {
        this.asyncId = builder.asyncId;
        this.asyncStatus = builder.asyncStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersAsyncResponseBody create() {
        return builder().build();
    }

    /**
     * @return asyncId
     */
    public String getAsyncId() {
        return this.asyncId;
    }

    /**
     * @return asyncStatus
     */
    public String getAsyncStatus() {
        return this.asyncStatus;
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
        private String asyncId; 
        private String asyncStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Users users; 

        /**
         * AsyncId.
         */
        public Builder asyncId(String asyncId) {
            this.asyncId = asyncId;
            return this;
        }

        /**
         * AsyncStatus.
         */
        public Builder asyncStatus(String asyncStatus) {
            this.asyncStatus = asyncStatus;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(Users users) {
            this.users = users;
            return this;
        }

        public ListUsersAsyncResponseBody build() {
            return new ListUsersAsyncResponseBody(this);
        } 

    } 

    public static class UserInfo extends TeaModel {
        @NameInMap("AddTime")
        private String addTime;

        @NameInMap("Group")
        private String group;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Name")
        private String name;

        @NameInMap("UserId")
        private String userId;

        private UserInfo(Builder builder) {
            this.addTime = builder.addTime;
            this.group = builder.group;
            this.groupId = builder.groupId;
            this.name = builder.name;
            this.userId = builder.userId;
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
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String addTime; 
            private String group; 
            private String groupId; 
            private String name; 
            private String userId; 

            /**
             * AddTime.
             */
            public Builder addTime(String addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
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
