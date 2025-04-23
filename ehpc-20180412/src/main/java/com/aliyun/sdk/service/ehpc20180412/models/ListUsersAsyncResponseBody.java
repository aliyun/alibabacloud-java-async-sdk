// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListUsersAsyncResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersAsyncResponseBody</p>
 */
public class ListUsersAsyncResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AsyncId")
    private String asyncId;

    @com.aliyun.core.annotation.NameInMap("AsyncStatus")
    private String asyncStatus;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Users")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListUsersAsyncResponseBody model) {
            this.asyncId = model.asyncId;
            this.asyncStatus = model.asyncStatus;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.users = model.users;
        } 

        /**
         * <p>The ID of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-sh03egi3mls****</p>
         */
        public Builder asyncId(String asyncId) {
            this.asyncId = asyncId;
            return this;
        }

        /**
         * <p>The status of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder asyncStatus(String asyncStatus) {
            this.asyncStatus = asyncStatus;
            return this;
        }

        /**
         * <p>The number of the page returned. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A05F620-ED46-4A57-95F1-C67D6D3C5DD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of users.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of users.</p>
         */
        public Builder users(Users users) {
            this.users = users;
            return this;
        }

        public ListUsersAsyncResponseBody build() {
            return new ListUsersAsyncResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUsersAsyncResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersAsyncResponseBody</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddTime")
        private String addTime;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UserId")
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

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.addTime = model.addTime;
                this.group = model.group;
                this.groupId = model.groupId;
                this.name = model.name;
                this.userId = model.userId;
            } 

            /**
             * <p>The time when the user was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-28T09:05:26.000Z</p>
             */
            public Builder addTime(String addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * <p>The user groups.</p>
             * 
             * <strong>example:</strong>
             * <p>wheel</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The username of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>testuser</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
    /**
     * 
     * {@link ListUsersAsyncResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersAsyncResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private java.util.List<UserInfo> userInfo;

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
        public java.util.List<UserInfo> getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private java.util.List<UserInfo> userInfo; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.userInfo = model.userInfo;
            } 

            /**
             * UserInfo.
             */
            public Builder userInfo(java.util.List<UserInfo> userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
