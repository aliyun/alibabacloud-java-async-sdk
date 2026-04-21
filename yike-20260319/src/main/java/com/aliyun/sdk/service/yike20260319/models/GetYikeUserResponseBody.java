// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link GetYikeUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetYikeUserResponseBody</p>
 */
public class GetYikeUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserInfo")
    private UserInfo userInfo;

    private GetYikeUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYikeUserResponseBody create() {
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
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder {
        private String requestId; 
        private UserInfo userInfo; 

        private Builder() {
        } 

        private Builder(GetYikeUserResponseBody model) {
            this.requestId = model.requestId;
            this.userInfo = model.userInfo;
        } 

        /**
         * <p>RequestId</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserInfo.
         */
        public Builder userInfo(UserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }

        public GetYikeUserResponseBody build() {
            return new GetYikeUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetYikeUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeUserResponseBody</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("YikeUserId")
        private String yikeUserId;

        private UserInfo(Builder builder) {
            this.nickname = builder.nickname;
            this.userName = builder.userName;
            this.workspaceId = builder.workspaceId;
            this.yikeUserId = builder.yikeUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return yikeUserId
         */
        public String getYikeUserId() {
            return this.yikeUserId;
        }

        public static final class Builder {
            private String nickname; 
            private String userName; 
            private String workspaceId; 
            private String yikeUserId; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.nickname = model.nickname;
                this.userName = model.userName;
                this.workspaceId = model.workspaceId;
                this.yikeUserId = model.yikeUserId;
            } 

            /**
             * Nickname.
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * YikeUserId.
             */
            public Builder yikeUserId(String yikeUserId) {
                this.yikeUserId = yikeUserId;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
