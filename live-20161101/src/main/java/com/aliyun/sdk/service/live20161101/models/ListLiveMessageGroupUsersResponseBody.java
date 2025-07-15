// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ListLiveMessageGroupUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveMessageGroupUsersResponseBody</p>
 */
public class ListLiveMessageGroupUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("Hasmore")
    private Boolean hasmore;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private Long nextPageToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserList")
    private java.util.List<UserList> userList;

    private ListLiveMessageGroupUsersResponseBody(Builder builder) {
        this.groupId = builder.groupId;
        this.hasmore = builder.hasmore;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveMessageGroupUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return hasmore
     */
    public Boolean getHasmore() {
        return this.hasmore;
    }

    /**
     * @return nextPageToken
     */
    public Long getNextPageToken() {
        return this.nextPageToken;
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
    public java.util.List<UserList> getUserList() {
        return this.userList;
    }

    public static final class Builder {
        private String groupId; 
        private Boolean hasmore; 
        private Long nextPageToken; 
        private String requestId; 
        private java.util.List<UserList> userList; 

        private Builder() {
        } 

        private Builder(ListLiveMessageGroupUsersResponseBody model) {
            this.groupId = model.groupId;
            this.hasmore = model.hasmore;
            this.nextPageToken = model.nextPageToken;
            this.requestId = model.requestId;
            this.userList = model.userList;
        } 

        /**
         * <p>The ID of the group queried.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Indicates whether the current page is followed by another page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasmore(Boolean hasmore) {
            this.hasmore = hasmore;
            return this;
        }

        /**
         * <p>The starting page number for the next query. A value of 0 indicates that no further pages can be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder nextPageToken(Long nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1D75BEA-1329-116F-B29C-76F3F200****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details about the users.</p>
         */
        public Builder userList(java.util.List<UserList> userList) {
            this.userList = userList;
            return this;
        }

        public ListLiveMessageGroupUsersResponseBody build() {
            return new ListLiveMessageGroupUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLiveMessageGroupUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveMessageGroupUsersResponseBody</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private String userInfo;

        private UserList(Builder builder) {
            this.userId = builder.userId;
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userInfo
         */
        public String getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private String userId; 
            private String userInfo; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.userId = model.userId;
                this.userInfo = model.userInfo;
            } 

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>uid1</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The additional information about the user.</p>
             * 
             * <strong>example:</strong>
             * <p>info1</p>
             */
            public Builder userInfo(String userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
