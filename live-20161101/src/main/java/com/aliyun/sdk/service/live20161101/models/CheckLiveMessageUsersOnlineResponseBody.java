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
 * {@link CheckLiveMessageUsersOnlineResponseBody} extends {@link TeaModel}
 *
 * <p>CheckLiveMessageUsersOnlineResponseBody</p>
 */
public class CheckLiveMessageUsersOnlineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserList")
    private java.util.List<UserList> userList;

    private CheckLiveMessageUsersOnlineResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckLiveMessageUsersOnlineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String requestId; 
        private java.util.List<UserList> userList; 

        private Builder() {
        } 

        private Builder(CheckLiveMessageUsersOnlineResponseBody model) {
            this.requestId = model.requestId;
            this.userList = model.userList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>178F572F-AECF-100B-937A-B8047B4D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of users queried.</p>
         */
        public Builder userList(java.util.List<UserList> userList) {
            this.userList = userList;
            return this;
        }

        public CheckLiveMessageUsersOnlineResponseBody build() {
            return new CheckLiveMessageUsersOnlineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckLiveMessageUsersOnlineResponseBody} extends {@link TeaModel}
     *
     * <p>CheckLiveMessageUsersOnlineResponseBody</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserList(Builder builder) {
            this.online = builder.online;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Boolean online; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.online = model.online;
                this.userId = model.userId;
            } 

            /**
             * <p>Indicates whether the user is online.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>uid1</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
