// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AIAgentTemplateConfig} extends {@link TeaModel}
 *
 * <p>AIAgentTemplateConfig</p>
 */
public class AIAgentTemplateConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvatarChat3D")
    private AvatarChat3D avatarChat3D;

    @com.aliyun.core.annotation.NameInMap("VisionChat")
    private VisionChat visionChat;

    @com.aliyun.core.annotation.NameInMap("VoiceChat")
    private VoiceChat voiceChat;

    private AIAgentTemplateConfig(Builder builder) {
        this.avatarChat3D = builder.avatarChat3D;
        this.visionChat = builder.visionChat;
        this.voiceChat = builder.voiceChat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIAgentTemplateConfig create() {
        return builder().build();
    }

    /**
     * @return avatarChat3D
     */
    public AvatarChat3D getAvatarChat3D() {
        return this.avatarChat3D;
    }

    /**
     * @return visionChat
     */
    public VisionChat getVisionChat() {
        return this.visionChat;
    }

    /**
     * @return voiceChat
     */
    public VoiceChat getVoiceChat() {
        return this.voiceChat;
    }

    public static final class Builder {
        private AvatarChat3D avatarChat3D; 
        private VisionChat visionChat; 
        private VoiceChat voiceChat; 

        /**
         * AvatarChat3D.
         */
        public Builder avatarChat3D(AvatarChat3D avatarChat3D) {
            this.avatarChat3D = avatarChat3D;
            return this;
        }

        /**
         * VisionChat.
         */
        public Builder visionChat(VisionChat visionChat) {
            this.visionChat = visionChat;
            return this;
        }

        /**
         * VoiceChat.
         */
        public Builder voiceChat(VoiceChat voiceChat) {
            this.voiceChat = voiceChat;
            return this;
        }

        public AIAgentTemplateConfig build() {
            return new AIAgentTemplateConfig(this);
        } 

    } 

    /**
     * 
     * {@link AIAgentTemplateConfig} extends {@link TeaModel}
     *
     * <p>AIAgentTemplateConfig</p>
     */
    public static class AvatarChat3D extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrMaxSilence")
        private Integer asrMaxSilence;

        @com.aliyun.core.annotation.NameInMap("AvatarId")
        private String avatarId;

        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("GracefulShutdown")
        private Boolean gracefulShutdown;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Long volume;

        private AvatarChat3D(Builder builder) {
            this.asrMaxSilence = builder.asrMaxSilence;
            this.avatarId = builder.avatarId;
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.gracefulShutdown = builder.gracefulShutdown;
            this.greeting = builder.greeting;
            this.voiceId = builder.voiceId;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvatarChat3D create() {
            return builder().build();
        }

        /**
         * @return asrMaxSilence
         */
        public Integer getAsrMaxSilence() {
            return this.asrMaxSilence;
        }

        /**
         * @return avatarId
         */
        public String getAvatarId() {
            return this.avatarId;
        }

        /**
         * @return enableVoiceInterrupt
         */
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        /**
         * @return gracefulShutdown
         */
        public Boolean getGracefulShutdown() {
            return this.gracefulShutdown;
        }

        /**
         * @return greeting
         */
        public String getGreeting() {
            return this.greeting;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        /**
         * @return volume
         */
        public Long getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private Integer asrMaxSilence; 
            private String avatarId; 
            private Boolean enableVoiceInterrupt; 
            private Boolean gracefulShutdown; 
            private String greeting; 
            private String voiceId; 
            private Long volume; 

            /**
             * AsrMaxSilence.
             */
            public Builder asrMaxSilence(Integer asrMaxSilence) {
                this.asrMaxSilence = asrMaxSilence;
                return this;
            }

            /**
             * AvatarId.
             */
            public Builder avatarId(String avatarId) {
                this.avatarId = avatarId;
                return this;
            }

            /**
             * EnableVoiceInterrupt.
             */
            public Builder enableVoiceInterrupt(Boolean enableVoiceInterrupt) {
                this.enableVoiceInterrupt = enableVoiceInterrupt;
                return this;
            }

            /**
             * GracefulShutdown.
             */
            public Builder gracefulShutdown(Boolean gracefulShutdown) {
                this.gracefulShutdown = gracefulShutdown;
                return this;
            }

            /**
             * Greeting.
             */
            public Builder greeting(String greeting) {
                this.greeting = greeting;
                return this;
            }

            /**
             * VoiceId.
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Long volume) {
                this.volume = volume;
                return this;
            }

            public AvatarChat3D build() {
                return new AvatarChat3D(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentTemplateConfig} extends {@link TeaModel}
     *
     * <p>AIAgentTemplateConfig</p>
     */
    public static class VisionChat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrMaxSilence")
        private Integer asrMaxSilence;

        @com.aliyun.core.annotation.NameInMap("EnableIntelligentSegment")
        private Boolean enableIntelligentSegment;

        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("GracefulShutdown")
        private Boolean gracefulShutdown;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Long volume;

        private VisionChat(Builder builder) {
            this.asrMaxSilence = builder.asrMaxSilence;
            this.enableIntelligentSegment = builder.enableIntelligentSegment;
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.gracefulShutdown = builder.gracefulShutdown;
            this.greeting = builder.greeting;
            this.voiceId = builder.voiceId;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisionChat create() {
            return builder().build();
        }

        /**
         * @return asrMaxSilence
         */
        public Integer getAsrMaxSilence() {
            return this.asrMaxSilence;
        }

        /**
         * @return enableIntelligentSegment
         */
        public Boolean getEnableIntelligentSegment() {
            return this.enableIntelligentSegment;
        }

        /**
         * @return enableVoiceInterrupt
         */
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        /**
         * @return gracefulShutdown
         */
        public Boolean getGracefulShutdown() {
            return this.gracefulShutdown;
        }

        /**
         * @return greeting
         */
        public String getGreeting() {
            return this.greeting;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        /**
         * @return volume
         */
        public Long getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private Integer asrMaxSilence; 
            private Boolean enableIntelligentSegment; 
            private Boolean enableVoiceInterrupt; 
            private Boolean gracefulShutdown; 
            private String greeting; 
            private String voiceId; 
            private Long volume; 

            /**
             * AsrMaxSilence.
             */
            public Builder asrMaxSilence(Integer asrMaxSilence) {
                this.asrMaxSilence = asrMaxSilence;
                return this;
            }

            /**
             * EnableIntelligentSegment.
             */
            public Builder enableIntelligentSegment(Boolean enableIntelligentSegment) {
                this.enableIntelligentSegment = enableIntelligentSegment;
                return this;
            }

            /**
             * EnableVoiceInterrupt.
             */
            public Builder enableVoiceInterrupt(Boolean enableVoiceInterrupt) {
                this.enableVoiceInterrupt = enableVoiceInterrupt;
                return this;
            }

            /**
             * GracefulShutdown.
             */
            public Builder gracefulShutdown(Boolean gracefulShutdown) {
                this.gracefulShutdown = gracefulShutdown;
                return this;
            }

            /**
             * Greeting.
             */
            public Builder greeting(String greeting) {
                this.greeting = greeting;
                return this;
            }

            /**
             * VoiceId.
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Long volume) {
                this.volume = volume;
                return this;
            }

            public VisionChat build() {
                return new VisionChat(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentTemplateConfig} extends {@link TeaModel}
     *
     * <p>AIAgentTemplateConfig</p>
     */
    public static class VoiceChat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrMaxSilence")
        private Integer asrMaxSilence;

        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("GracefulShutdown")
        private Boolean gracefulShutdown;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Long volume;

        private VoiceChat(Builder builder) {
            this.asrMaxSilence = builder.asrMaxSilence;
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.gracefulShutdown = builder.gracefulShutdown;
            this.greeting = builder.greeting;
            this.voiceId = builder.voiceId;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceChat create() {
            return builder().build();
        }

        /**
         * @return asrMaxSilence
         */
        public Integer getAsrMaxSilence() {
            return this.asrMaxSilence;
        }

        /**
         * @return enableVoiceInterrupt
         */
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        /**
         * @return gracefulShutdown
         */
        public Boolean getGracefulShutdown() {
            return this.gracefulShutdown;
        }

        /**
         * @return greeting
         */
        public String getGreeting() {
            return this.greeting;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        /**
         * @return volume
         */
        public Long getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private Integer asrMaxSilence; 
            private Boolean enableVoiceInterrupt; 
            private Boolean gracefulShutdown; 
            private String greeting; 
            private String voiceId; 
            private Long volume; 

            /**
             * AsrMaxSilence.
             */
            public Builder asrMaxSilence(Integer asrMaxSilence) {
                this.asrMaxSilence = asrMaxSilence;
                return this;
            }

            /**
             * EnableVoiceInterrupt.
             */
            public Builder enableVoiceInterrupt(Boolean enableVoiceInterrupt) {
                this.enableVoiceInterrupt = enableVoiceInterrupt;
                return this;
            }

            /**
             * GracefulShutdown.
             */
            public Builder gracefulShutdown(Boolean gracefulShutdown) {
                this.gracefulShutdown = gracefulShutdown;
                return this;
            }

            /**
             * Greeting.
             */
            public Builder greeting(String greeting) {
                this.greeting = greeting;
                return this;
            }

            /**
             * VoiceId.
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Long volume) {
                this.volume = volume;
                return this;
            }

            public VoiceChat build() {
                return new VoiceChat(this);
            } 

        } 

    }
}
