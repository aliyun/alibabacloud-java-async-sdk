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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeChannelAllUsersResponseBody model) {
            this.channelExist = model.channelExist;
            this.requestId = model.requestId;
            this.users = model.users;
        } 

        /**
         * <p>Indicates whether the channel exists. Valid values:  </p>
         * <ul>
         * <li><strong>true</strong>: The channel exists.  </li>
         * <li><strong>false</strong>: The channel does not exist.</li>
         * </ul>
         */
        public Builder channelExist(Boolean channelExist) {
            this.channelExist = channelExist;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of online users in the channel.</p>
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

            private Builder() {
            } 

            private Builder(Users model) {
                this.userId = model.userId;
            } 

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1811****</p>
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
