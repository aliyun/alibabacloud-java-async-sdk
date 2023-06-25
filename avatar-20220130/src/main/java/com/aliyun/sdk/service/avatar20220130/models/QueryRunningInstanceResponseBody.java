// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRunningInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRunningInstanceResponseBody</p>
 */
public class QueryRunningInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryRunningInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRunningInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryRunningInstanceResponseBody build() {
            return new QueryRunningInstanceResponseBody(this);
        } 

    } 

    public static class Channel extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("Gslb")
        private java.util.List < String > gslb;

        @NameInMap("Nonce")
        private String nonce;

        @NameInMap("Token")
        private String token;

        @NameInMap("Type")
        private String type;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserInfoInChannel")
        private String userInfoInChannel;

        private Channel(Builder builder) {
            this.appId = builder.appId;
            this.channelId = builder.channelId;
            this.expiredTime = builder.expiredTime;
            this.gslb = builder.gslb;
            this.nonce = builder.nonce;
            this.token = builder.token;
            this.type = builder.type;
            this.userId = builder.userId;
            this.userInfoInChannel = builder.userInfoInChannel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channel create() {
            return builder().build();
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
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return gslb
         */
        public java.util.List < String > getGslb() {
            return this.gslb;
        }

        /**
         * @return nonce
         */
        public String getNonce() {
            return this.nonce;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userInfoInChannel
         */
        public String getUserInfoInChannel() {
            return this.userInfoInChannel;
        }

        public static final class Builder {
            private String appId; 
            private String channelId; 
            private String expiredTime; 
            private java.util.List < String > gslb; 
            private String nonce; 
            private String token; 
            private String type; 
            private String userId; 
            private String userInfoInChannel; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * Gslb.
             */
            public Builder gslb(java.util.List < String > gslb) {
                this.gslb = gslb;
                return this;
            }

            /**
             * Nonce.
             */
            public Builder nonce(String nonce) {
                this.nonce = nonce;
                return this;
            }

            /**
             * Token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserInfoInChannel.
             */
            public Builder userInfoInChannel(String userInfoInChannel) {
                this.userInfoInChannel = userInfoInChannel;
                return this;
            }

            public Channel build() {
                return new Channel(this);
            } 

        } 

    }
    public static class User extends TeaModel {
        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserName")
        private String userName;

        private User(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userId; 
            private String userName; 

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Channel")
        private Channel channel;

        @NameInMap("SessionId")
        private String sessionId;

        @NameInMap("User")
        private User user;

        private Data(Builder builder) {
            this.channel = builder.channel;
            this.sessionId = builder.sessionId;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public Channel getChannel() {
            return this.channel;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return user
         */
        public User getUser() {
            return this.user;
        }

        public static final class Builder {
            private Channel channel; 
            private String sessionId; 
            private User user; 

            /**
             * Channel.
             */
            public Builder channel(Channel channel) {
                this.channel = channel;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * User.
             */
            public Builder user(User user) {
                this.user = user;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
