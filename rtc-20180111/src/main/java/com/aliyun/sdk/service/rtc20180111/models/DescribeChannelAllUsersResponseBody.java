// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeChannelAllUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelAllUsersResponseBody</p>
 */
public class DescribeChannelAllUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChannelExist")
    private Boolean channelExist;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

    private DescribeChannelAllUsersResponseBody(Builder builder) {
        this.channelExist = builder.channelExist;
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelAllUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return channelExist
     */
    public Boolean getChannelExist() {
        return this.channelExist;
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
        private Boolean channelExist; 
        private String requestId; 
        private java.util.List<Users> users; 

        /**
         * ChannelExist.
         */
        public Builder channelExist(Boolean channelExist) {
            this.channelExist = channelExist;
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
         * Users.
         */
        public Builder users(java.util.List<Users> users) {
            this.users = users;
            return this;
        }

        public DescribeChannelAllUsersResponseBody build() {
            return new DescribeChannelAllUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChannelAllUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelAllUsersResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Users(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String userId; 

            /**
             * UserId.
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
