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
    @NameInMap("BizId")
    private String bizId;

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
    @NameInMap("TextRequest")
    private TextRequest textRequest;

    @Query
    @NameInMap("User")
    private User user;

    private StartInstanceRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.bizId = builder.bizId;
        this.channel = builder.channel;
        this.commandRequest = builder.commandRequest;
        this.tenantId = builder.tenantId;
        this.textRequest = builder.textRequest;
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
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
     * @return textRequest
     */
    public TextRequest getTextRequest() {
        return this.textRequest;
    }

    /**
     * @return user
     */
    public User getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<StartInstanceRequest, Builder> {
        private App app; 
        private String bizId; 
        private Channel channel; 
        private CommandRequest commandRequest; 
        private Long tenantId; 
        private TextRequest textRequest; 
        private User user; 

        private Builder() {
            super();
        } 

        private Builder(StartInstanceRequest request) {
            super(request);
            this.app = request.app;
            this.bizId = request.bizId;
            this.channel = request.channel;
            this.commandRequest = request.commandRequest;
            this.tenantId = request.tenantId;
            this.textRequest = request.textRequest;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
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
         * TextRequest.
         */
        public Builder textRequest(TextRequest textRequest) {
            String textRequestShrink = shrink(textRequest, "TextRequest", "json");
            this.putQueryParameter("TextRequest", textRequestShrink);
            this.textRequest = textRequest;
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

        @NameInMap("BackGroundImageUrl")
        private String backGroundImageUrl;

        @NameInMap("Locate")
        private Integer locate;

        private CommandRequest(Builder builder) {
            this.alphaSwitch = builder.alphaSwitch;
            this.backGroundImageUrl = builder.backGroundImageUrl;
            this.locate = builder.locate;
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

        /**
         * @return backGroundImageUrl
         */
        public String getBackGroundImageUrl() {
            return this.backGroundImageUrl;
        }

        /**
         * @return locate
         */
        public Integer getLocate() {
            return this.locate;
        }

        public static final class Builder {
            private Boolean alphaSwitch; 
            private String backGroundImageUrl; 
            private Integer locate; 

            /**
             * AlphaSwitch.
             */
            public Builder alphaSwitch(Boolean alphaSwitch) {
                this.alphaSwitch = alphaSwitch;
                return this;
            }

            /**
             * BackGroundImageUrl.
             */
            public Builder backGroundImageUrl(String backGroundImageUrl) {
                this.backGroundImageUrl = backGroundImageUrl;
                return this;
            }

            /**
             * Locate.
             */
            public Builder locate(Integer locate) {
                this.locate = locate;
                return this;
            }

            public CommandRequest build() {
                return new CommandRequest(this);
            } 

        } 

    }
    public static class TextRequest extends TeaModel {
        @NameInMap("PitchRate")
        private Integer pitchRate;

        @NameInMap("SpeechRate")
        private Integer speechRate;

        @NameInMap("Voice")
        private String voice;

        @NameInMap("Volume")
        private Integer volume;

        private TextRequest(Builder builder) {
            this.pitchRate = builder.pitchRate;
            this.speechRate = builder.speechRate;
            this.voice = builder.voice;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextRequest create() {
            return builder().build();
        }

        /**
         * @return pitchRate
         */
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        /**
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private Integer pitchRate; 
            private Integer speechRate; 
            private String voice; 
            private Integer volume; 

            /**
             * PitchRate.
             */
            public Builder pitchRate(Integer pitchRate) {
                this.pitchRate = pitchRate;
                return this;
            }

            /**
             * SpeechRate.
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public TextRequest build() {
                return new TextRequest(this);
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
