// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetInstanceTwoFactorResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceTwoFactorResponseBody</p>
 */
public class GetInstanceTwoFactorResponseBody extends TeaModel {
    @NameInMap("Config")
    private Config config;

    @NameInMap("RequestId")
    private String requestId;


    private GetInstanceTwoFactorResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceTwoFactorResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Config config; 
        private String requestId; 

        /**
         * <p>Config.</p>
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceTwoFactorResponseBody build() {
            return new GetInstanceTwoFactorResponseBody(this);
        } 

    } 

    public static class DingTalkConfig extends TeaModel {
        @NameInMap("AgentId")
        private String agentId;

        @NameInMap("AppKey")
        private String appKey;

        @NameInMap("HasAppSecret")
        private Boolean hasAppSecret;


        private DingTalkConfig(Builder builder) {
            this.agentId = builder.agentId;
            this.appKey = builder.appKey;
            this.hasAppSecret = builder.hasAppSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingTalkConfig create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return hasAppSecret
         */
        public Boolean getHasAppSecret() {
            return this.hasAppSecret;
        }

        public static final class Builder {
            private String agentId; 
            private String appKey; 
            private Boolean hasAppSecret; 

            /**
             * <p>AgentId.</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>AppKey.</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>HasAppSecret.</p>
             */
            public Builder hasAppSecret(Boolean hasAppSecret) {
                this.hasAppSecret = hasAppSecret;
                return this;
            }

            public DingTalkConfig build() {
                return new DingTalkConfig(this);
            } 

        } 

    }
    public static class Config extends TeaModel {
        @NameInMap("DingTalkConfig")
        private DingTalkConfig dingTalkConfig;

        @NameInMap("EnableTwoFactor")
        private Boolean enableTwoFactor;

        @NameInMap("MessageLanguage")
        private String messageLanguage;

        @NameInMap("SkipTwoFactorTime")
        private Long skipTwoFactorTime;

        @NameInMap("TwoFactorMethods")
        private java.util.List < String > twoFactorMethods;


        private Config(Builder builder) {
            this.dingTalkConfig = builder.dingTalkConfig;
            this.enableTwoFactor = builder.enableTwoFactor;
            this.messageLanguage = builder.messageLanguage;
            this.skipTwoFactorTime = builder.skipTwoFactorTime;
            this.twoFactorMethods = builder.twoFactorMethods;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return dingTalkConfig
         */
        public DingTalkConfig getDingTalkConfig() {
            return this.dingTalkConfig;
        }

        /**
         * @return enableTwoFactor
         */
        public Boolean getEnableTwoFactor() {
            return this.enableTwoFactor;
        }

        /**
         * @return messageLanguage
         */
        public String getMessageLanguage() {
            return this.messageLanguage;
        }

        /**
         * @return skipTwoFactorTime
         */
        public Long getSkipTwoFactorTime() {
            return this.skipTwoFactorTime;
        }

        /**
         * @return twoFactorMethods
         */
        public java.util.List < String > getTwoFactorMethods() {
            return this.twoFactorMethods;
        }

        public static final class Builder {
            private DingTalkConfig dingTalkConfig; 
            private Boolean enableTwoFactor; 
            private String messageLanguage; 
            private Long skipTwoFactorTime; 
            private java.util.List < String > twoFactorMethods; 

            /**
             * <p>DingTalkConfig.</p>
             */
            public Builder dingTalkConfig(DingTalkConfig dingTalkConfig) {
                this.dingTalkConfig = dingTalkConfig;
                return this;
            }

            /**
             * <p>EnableTwoFactor.</p>
             */
            public Builder enableTwoFactor(Boolean enableTwoFactor) {
                this.enableTwoFactor = enableTwoFactor;
                return this;
            }

            /**
             * <p>MessageLanguage.</p>
             */
            public Builder messageLanguage(String messageLanguage) {
                this.messageLanguage = messageLanguage;
                return this;
            }

            /**
             * <p>SkipTwoFactorTime.</p>
             */
            public Builder skipTwoFactorTime(Long skipTwoFactorTime) {
                this.skipTwoFactorTime = skipTwoFactorTime;
                return this;
            }

            /**
             * <p>TwoFactorMethods.</p>
             */
            public Builder twoFactorMethods(java.util.List < String > twoFactorMethods) {
                this.twoFactorMethods = twoFactorMethods;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
