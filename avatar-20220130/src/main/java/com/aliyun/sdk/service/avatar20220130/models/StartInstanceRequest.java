// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartInstanceRequest</p>
 */
public class StartInstanceRequest extends Request {
    @Query
    @NameInMap("App")
    private App app;

    @Query
    @NameInMap("Channel")
    private Channel channel;

    @Query
    @NameInMap("CommandRequest")
    private CommandRequest commandRequest;

    @Query
    @NameInMap("TenantId")
    private Long tenantId;

    @Query
    @NameInMap("User")
    private User user;

    private StartInstanceRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.channel = builder.channel;
        this.commandRequest = builder.commandRequest;
        this.tenantId = builder.tenantId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public App getApp() {
        return this.app;
    }

    /**
     * @return channel
     */
    public Channel getChannel() {
        return this.channel;
    }

    /**
     * @return commandRequest
     */
    public CommandRequest getCommandRequest() {
        return this.commandRequest;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return user
     */
    public User getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<StartInstanceRequest, Builder> {
        private App app; 
        private Channel channel; 
        private CommandRequest commandRequest; 
        private Long tenantId; 
        private User user; 

        private Builder() {
            super();
        } 

        private Builder(StartInstanceRequest request) {
            super(request);
            this.app = request.app;
            this.channel = request.channel;
            this.commandRequest = request.commandRequest;
            this.tenantId = request.tenantId;
            this.user = request.user;
        } 

        /**
         * App.
         */
        public Builder app(App app) {
            String appShrink = shrink(app, "App", "json");
            this.putQueryParameter("App", appShrink);
            this.app = app;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(Channel channel) {
            String channelShrink = shrink(channel, "Channel", "json");
            this.putQueryParameter("Channel", channelShrink);
            this.channel = channel;
            return this;
        }

        /**
         * CommandRequest.
         */
        public Builder commandRequest(CommandRequest commandRequest) {
            String commandRequestShrink = shrink(commandRequest, "CommandRequest", "json");
            this.putQueryParameter("CommandRequest", commandRequestShrink);
            this.commandRequest = commandRequest;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * User.
         */
        public Builder user(User user) {
            String userShrink = shrink(user, "User", "json");
            this.putQueryParameter("User", userShrink);
            this.user = user;
            return this;
        }

        @Override
        public StartInstanceRequest build() {
            return new StartInstanceRequest(this);
        } 

    } 

    public static class App extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        private App(Builder builder) {
            this.appId = builder.appId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static App create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        public static final class Builder {
            private String appId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            public App build() {
                return new App(this);
            } 

        } 

    }
    public static class Channel extends TeaModel {
        @NameInMap("ReqConfig")
        private java.util.Map < String, ? > reqConfig;

        @NameInMap("Type")
        private String type;

        private Channel(Builder builder) {
            this.reqConfig = builder.reqConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channel create() {
            return builder().build();
        }

        /**
         * @return reqConfig
         */
        public java.util.Map < String, ? > getReqConfig() {
            return this.reqConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.Map < String, ? > reqConfig; 
            private String type; 

            /**
             * ReqConfig.
             */
            public Builder reqConfig(java.util.Map < String, ? > reqConfig) {
                this.reqConfig = reqConfig;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Channel build() {
                return new Channel(this);
            } 

        } 

    }
    public static class CommandRequest extends TeaModel {
        @NameInMap("AlphaSwitch")
        private Boolean alphaSwitch;

        private CommandRequest(Builder builder) {
            this.alphaSwitch = builder.alphaSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommandRequest create() {
            return builder().build();
        }

        /**
         * @return alphaSwitch
         */
        public Boolean getAlphaSwitch() {
            return this.alphaSwitch;
        }

        public static final class Builder {
            private Boolean alphaSwitch; 

            /**
             * AlphaSwitch.
             */
            public Builder alphaSwitch(Boolean alphaSwitch) {
                this.alphaSwitch = alphaSwitch;
                return this;
            }

            public CommandRequest build() {
                return new CommandRequest(this);
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
}
