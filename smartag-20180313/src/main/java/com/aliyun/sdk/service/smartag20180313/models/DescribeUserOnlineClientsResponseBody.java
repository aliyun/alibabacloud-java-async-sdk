// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeUserOnlineClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserOnlineClientsResponseBody</p>
 */
public class DescribeUserOnlineClientsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
    private Users users;

    private DescribeUserOnlineClientsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserOnlineClientsResponseBody create() {
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
    public Users getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String requestId; 
        private Users users; 

        private Builder() {
        } 

        private Builder(DescribeUserOnlineClientsResponseBody model) {
            this.requestId = model.requestId;
            this.users = model.users;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7108A98F-C47D-45F7-A4D8-C2E3022735DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the client.</p>
         */
        public Builder users(Users users) {
            this.users = users;
            return this;
        }

        public DescribeUserOnlineClientsResponseBody build() {
            return new DescribeUserOnlineClientsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserOnlineClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserOnlineClientsResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("OnlineTime")
        private String onlineTime;

        private User(Builder builder) {
            this.clientIp = builder.clientIp;
            this.onlineTime = builder.onlineTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return onlineTime
         */
        public String getOnlineTime() {
            return this.onlineTime;
        }

        public static final class Builder {
            private String clientIp; 
            private String onlineTime; 

            private Builder() {
            } 

            private Builder(User model) {
                this.clientIp = model.clientIp;
                this.onlineTime = model.onlineTime;
            } 

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>10.<strong>.</strong>.**</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The time when the client was connected to Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>1559125519</p>
             */
            public Builder onlineTime(String onlineTime) {
                this.onlineTime = onlineTime;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserOnlineClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserOnlineClientsResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("User")
        private java.util.List<User> user;

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
        public java.util.List<User> getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List<User> user; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.user = model.user;
            } 

            /**
             * User.
             */
            public Builder user(java.util.List<User> user) {
                this.user = user;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
