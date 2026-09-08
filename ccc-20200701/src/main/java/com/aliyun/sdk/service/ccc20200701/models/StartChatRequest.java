// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link StartChatRequest} extends {@link RequestModel}
 *
 * <p>StartChatRequest</p>
 */
public class StartChatRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessChannelId")
    private String accessChannelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<UserList> userList;

    private StartChatRequest(Builder builder) {
        super(builder);
        this.accessChannelId = builder.accessChannelId;
        this.instanceId = builder.instanceId;
        this.token = builder.token;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessChannelId
     */
    public String getAccessChannelId() {
        return this.accessChannelId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return userList
     */
    public java.util.List<UserList> getUserList() {
        return this.userList;
    }

    public static final class Builder extends Request.Builder<StartChatRequest, Builder> {
        private String accessChannelId; 
        private String instanceId; 
        private String token; 
        private java.util.List<UserList> userList; 

        private Builder() {
            super();
        } 

        private Builder(StartChatRequest request) {
            super(request);
            this.accessChannelId = request.accessChannelId;
            this.instanceId = request.instanceId;
            this.token = request.token;
            this.userList = request.userList;
        } 

        /**
         * <p>The ID of the web service channel.</p>
         * 
         * <strong>example:</strong>
         * <p>cf584733-<em><strong>-</strong></em>-9699-cb77aa3b7aa6</p>
         */
        public Builder accessChannelId(String accessChannelId) {
            this.putQueryParameter("AccessChannelId", accessChannelId);
            this.accessChannelId = accessChannelId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The channel token for the web service.</p>
         * 
         * <strong>example:</strong>
         * <p>9XYGTGWtq2wFi_Bpg7aUnIoYi_vG_rO3bjEn0YtsxbHRHrYHlz1LDBLJAyZcLxieRQR4h_6AnWvTjJeNU5jg************Hwej7WgWrmA=</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>The information about chat members.</p>
         * <p>This parameter is required.</p>
         */
        public Builder userList(java.util.List<UserList> userList) {
            String userListShrink = shrink(userList, "UserList", "json");
            this.putQueryParameter("UserList", userListShrink);
            this.userList = userList;
            return this;
        }

        @Override
        public StartChatRequest build() {
            return new StartChatRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartChatRequest} extends {@link TeaModel}
     *
     * <p>StartChatRequest</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private UserList(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.nickname = builder.nickname;
            this.userId = builder.userId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String nickname; 
            private String userId; 
            private String userType; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.avatarUrl = model.avatarUrl;
                this.nickname = model.nickname;
                this.userId = model.userId;
                this.userType = model.userType;
            } 

            /**
             * <p>The URL of the member\&quot;s profile picture.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx.com/image">http://xxx.com/image</a></p>
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * <p>The nickname of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>访客-1a272a174a7d</p>
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * <p>The member ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fcd020fe-d8e4-40e5-8c77-1a272a174a7d</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The type of the member.</p>
             * <ul>
             * <li><p>AGENT: An agent.</p>
             * </li>
             * <li><p>CUSTOMER: A visitor.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CUSTOMER</p>
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
