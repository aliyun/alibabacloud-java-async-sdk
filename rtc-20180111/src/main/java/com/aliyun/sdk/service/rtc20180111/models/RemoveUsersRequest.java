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
 * {@link RemoveUsersRequest} extends {@link RequestModel}
 *
 * <p>RemoveUsersRequest</p>
 */
public class RemoveUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Users")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Users> users;

    private RemoveUsersRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<RemoveUsersRequest, Builder> {
        private String appId; 
        private String channelId; 
        private java.util.List<Users> users; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUsersRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.users = request.users;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eo85****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testid</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder users(java.util.List<Users> users) {
            this.putQueryParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public RemoveUsersRequest build() {
            return new RemoveUsersRequest(this);
        } 

    } 

    /**
     * 
     * {@link RemoveUsersRequest} extends {@link TeaModel}
     *
     * <p>RemoveUsersRequest</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
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
