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
 * {@link CheckLiveMessageUsersInGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CheckLiveMessageUsersInGroupResponseBody</p>
 */
public class CheckLiveMessageUsersInGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

    private CheckLiveMessageUsersInGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckLiveMessageUsersInGroupResponseBody create() {
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
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Users> users; 

        private Builder() {
        } 

        private Builder(CheckLiveMessageUsersInGroupResponseBody model) {
            this.requestId = model.requestId;
            this.users = model.users;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F1F68D81-1543-1FE4-B56E-82200DD2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of users queried.</p>
         */
        public Builder users(java.util.List<Users> users) {
            this.users = users;
            return this;
        }

        public CheckLiveMessageUsersInGroupResponseBody build() {
            return new CheckLiveMessageUsersInGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckLiveMessageUsersInGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CheckLiveMessageUsersInGroupResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Users(Builder builder) {
            this.online = builder.online;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
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

            private Builder(Users model) {
                this.online = model.online;
                this.userId = model.userId;
            } 

            /**
             * <p>Indicates whether the user is in the group.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
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

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
