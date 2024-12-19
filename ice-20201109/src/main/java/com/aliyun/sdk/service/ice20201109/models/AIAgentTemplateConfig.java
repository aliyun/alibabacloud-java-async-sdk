// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
    public static class LlmHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private LlmHistory(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LlmHistory create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public LlmHistory build() {
                return new LlmHistory(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("BailianAppParams")
        private String bailianAppParams;

        @com.aliyun.core.annotation.NameInMap("EnableIntelligentSegment")
        private Boolean enableIntelligentSegment;

        @com.aliyun.core.annotation.NameInMap("EnablePushToTalk")
        private Boolean enablePushToTalk;

        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("GracefulShutdown")
        private Boolean gracefulShutdown;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("LlmHistory")
        private java.util.List<LlmHistory> llmHistory;

        @com.aliyun.core.annotation.NameInMap("LlmHistoryLimit")
        private Integer llmHistoryLimit;

        @com.aliyun.core.annotation.NameInMap("MaxIdleTime")
        private Integer maxIdleTime;

        @com.aliyun.core.annotation.NameInMap("UseVoiceprint")
        private Boolean useVoiceprint;

        @com.aliyun.core.annotation.NameInMap("UserOfflineTimeout")
        private Integer userOfflineTimeout;

        @com.aliyun.core.annotation.NameInMap("UserOnlineTimeout")
        private Integer userOnlineTimeout;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("VoiceprintId")
        private String voiceprintId;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Long volume;

        @com.aliyun.core.annotation.NameInMap("WakeUpQuery")
        private String wakeUpQuery;

        @com.aliyun.core.annotation.NameInMap("WorkflowOverrideParams")
        private String workflowOverrideParams;

        private AvatarChat3D(Builder builder) {
            this.asrMaxSilence = builder.asrMaxSilence;
            this.avatarId = builder.avatarId;
            this.bailianAppParams = builder.bailianAppParams;
            this.enableIntelligentSegment = builder.enableIntelligentSegment;
            this.enablePushToTalk = builder.enablePushToTalk;
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.gracefulShutdown = builder.gracefulShutdown;
            this.greeting = builder.greeting;
            this.llmHistory = builder.llmHistory;
            this.llmHistoryLimit = builder.llmHistoryLimit;
            this.maxIdleTime = builder.maxIdleTime;
            this.useVoiceprint = builder.useVoiceprint;
            this.userOfflineTimeout = builder.userOfflineTimeout;
            this.userOnlineTimeout = builder.userOnlineTimeout;
            this.voiceId = builder.voiceId;
            this.voiceprintId = builder.voiceprintId;
            this.volume = builder.volume;
            this.wakeUpQuery = builder.wakeUpQuery;
            this.workflowOverrideParams = builder.workflowOverrideParams;
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
         * @return bailianAppParams
         */
        public String getBailianAppParams() {
            return this.bailianAppParams;
        }

        /**
         * @return enableIntelligentSegment
         */
        public Boolean getEnableIntelligentSegment() {
            return this.enableIntelligentSegment;
        }

        /**
         * @return enablePushToTalk
         */
        public Boolean getEnablePushToTalk() {
            return this.enablePushToTalk;
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
         * @return llmHistory
         */
        public java.util.List<LlmHistory> getLlmHistory() {
            return this.llmHistory;
        }

        /**
         * @return llmHistoryLimit
         */
        public Integer getLlmHistoryLimit() {
            return this.llmHistoryLimit;
        }

        /**
         * @return maxIdleTime
         */
        public Integer getMaxIdleTime() {
            return this.maxIdleTime;
        }

        /**
         * @return useVoiceprint
         */
        public Boolean getUseVoiceprint() {
            return this.useVoiceprint;
        }

        /**
         * @return userOfflineTimeout
         */
        public Integer getUserOfflineTimeout() {
            return this.userOfflineTimeout;
        }

        /**
         * @return userOnlineTimeout
         */
        public Integer getUserOnlineTimeout() {
            return this.userOnlineTimeout;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        /**
         * @return voiceprintId
         */
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

        /**
         * @return volume
         */
        public Long getVolume() {
            return this.volume;
        }

        /**
         * @return wakeUpQuery
         */
        public String getWakeUpQuery() {
            return this.wakeUpQuery;
        }

        /**
         * @return workflowOverrideParams
         */
        public String getWorkflowOverrideParams() {
            return this.workflowOverrideParams;
        }

        public static final class Builder {
            private Integer asrMaxSilence; 
            private String avatarId; 
            private String bailianAppParams; 
            private Boolean enableIntelligentSegment; 
            private Boolean enablePushToTalk; 
            private Boolean enableVoiceInterrupt; 
            private Boolean gracefulShutdown; 
            private String greeting; 
            private java.util.List<LlmHistory> llmHistory; 
            private Integer llmHistoryLimit; 
            private Integer maxIdleTime; 
            private Boolean useVoiceprint; 
            private Integer userOfflineTimeout; 
            private Integer userOnlineTimeout; 
            private String voiceId; 
            private String voiceprintId; 
            private Long volume; 
            private String wakeUpQuery; 
            private String workflowOverrideParams; 

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
             * BailianAppParams.
             */
            public Builder bailianAppParams(String bailianAppParams) {
                this.bailianAppParams = bailianAppParams;
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
             * EnablePushToTalk.
             */
            public Builder enablePushToTalk(Boolean enablePushToTalk) {
                this.enablePushToTalk = enablePushToTalk;
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
             * LlmHistory.
             */
            public Builder llmHistory(java.util.List<LlmHistory> llmHistory) {
                this.llmHistory = llmHistory;
                return this;
            }

            /**
             * LlmHistoryLimit.
             */
            public Builder llmHistoryLimit(Integer llmHistoryLimit) {
                this.llmHistoryLimit = llmHistoryLimit;
                return this;
            }

            /**
             * MaxIdleTime.
             */
            public Builder maxIdleTime(Integer maxIdleTime) {
                this.maxIdleTime = maxIdleTime;
                return this;
            }

            /**
             * UseVoiceprint.
             */
            public Builder useVoiceprint(Boolean useVoiceprint) {
                this.useVoiceprint = useVoiceprint;
                return this;
            }

            /**
             * UserOfflineTimeout.
             */
            public Builder userOfflineTimeout(Integer userOfflineTimeout) {
                this.userOfflineTimeout = userOfflineTimeout;
                return this;
            }

            /**
             * UserOnlineTimeout.
             */
            public Builder userOnlineTimeout(Integer userOnlineTimeout) {
                this.userOnlineTimeout = userOnlineTimeout;
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
             * VoiceprintId.
             */
            public Builder voiceprintId(String voiceprintId) {
                this.voiceprintId = voiceprintId;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Long volume) {
                this.volume = volume;
                return this;
            }

            /**
             * WakeUpQuery.
             */
            public Builder wakeUpQuery(String wakeUpQuery) {
                this.wakeUpQuery = wakeUpQuery;
                return this;
            }

            /**
             * WorkflowOverrideParams.
             */
            public Builder workflowOverrideParams(String workflowOverrideParams) {
                this.workflowOverrideParams = workflowOverrideParams;
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
    public static class VisionChatLlmHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private VisionChatLlmHistory(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisionChatLlmHistory create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public VisionChatLlmHistory build() {
                return new VisionChatLlmHistory(this);
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

        @com.aliyun.core.annotation.NameInMap("BailianAppParams")
        private String bailianAppParams;

        @com.aliyun.core.annotation.NameInMap("EnableIntelligentSegment")
        private Boolean enableIntelligentSegment;

        @com.aliyun.core.annotation.NameInMap("EnablePushToTalk")
        private Boolean enablePushToTalk;

        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("GracefulShutdown")
        private Boolean gracefulShutdown;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("LlmHistory")
        private java.util.List<VisionChatLlmHistory> llmHistory;

        @com.aliyun.core.annotation.NameInMap("LlmHistoryLimit")
        private Integer llmHistoryLimit;

        @com.aliyun.core.annotation.NameInMap("MaxIdleTime")
        private Integer maxIdleTime;

        @com.aliyun.core.annotation.NameInMap("UseVoiceprint")
        private Boolean useVoiceprint;

        @com.aliyun.core.annotation.NameInMap("UserOfflineTimeout")
        private Integer userOfflineTimeout;

        @com.aliyun.core.annotation.NameInMap("UserOnlineTimeout")
        private Integer userOnlineTimeout;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("VoiceprintId")
        private String voiceprintId;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Long volume;

        @com.aliyun.core.annotation.NameInMap("WakeUpQuery")
        private String wakeUpQuery;

        @com.aliyun.core.annotation.NameInMap("WorkflowOverrideParams")
        private String workflowOverrideParams;

        private VisionChat(Builder builder) {
            this.asrMaxSilence = builder.asrMaxSilence;
            this.bailianAppParams = builder.bailianAppParams;
            this.enableIntelligentSegment = builder.enableIntelligentSegment;
            this.enablePushToTalk = builder.enablePushToTalk;
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.gracefulShutdown = builder.gracefulShutdown;
            this.greeting = builder.greeting;
            this.llmHistory = builder.llmHistory;
            this.llmHistoryLimit = builder.llmHistoryLimit;
            this.maxIdleTime = builder.maxIdleTime;
            this.useVoiceprint = builder.useVoiceprint;
            this.userOfflineTimeout = builder.userOfflineTimeout;
            this.userOnlineTimeout = builder.userOnlineTimeout;
            this.voiceId = builder.voiceId;
            this.voiceprintId = builder.voiceprintId;
            this.volume = builder.volume;
            this.wakeUpQuery = builder.wakeUpQuery;
            this.workflowOverrideParams = builder.workflowOverrideParams;
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
         * @return bailianAppParams
         */
        public String getBailianAppParams() {
            return this.bailianAppParams;
        }

        /**
         * @return enableIntelligentSegment
         */
        public Boolean getEnableIntelligentSegment() {
            return this.enableIntelligentSegment;
        }

        /**
         * @return enablePushToTalk
         */
        public Boolean getEnablePushToTalk() {
            return this.enablePushToTalk;
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
         * @return llmHistory
         */
        public java.util.List<VisionChatLlmHistory> getLlmHistory() {
            return this.llmHistory;
        }

        /**
         * @return llmHistoryLimit
         */
        public Integer getLlmHistoryLimit() {
            return this.llmHistoryLimit;
        }

        /**
         * @return maxIdleTime
         */
        public Integer getMaxIdleTime() {
            return this.maxIdleTime;
        }

        /**
         * @return useVoiceprint
         */
        public Boolean getUseVoiceprint() {
            return this.useVoiceprint;
        }

        /**
         * @return userOfflineTimeout
         */
        public Integer getUserOfflineTimeout() {
            return this.userOfflineTimeout;
        }

        /**
         * @return userOnlineTimeout
         */
        public Integer getUserOnlineTimeout() {
            return this.userOnlineTimeout;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        /**
         * @return voiceprintId
         */
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

        /**
         * @return volume
         */
        public Long getVolume() {
            return this.volume;
        }

        /**
         * @return wakeUpQuery
         */
        public String getWakeUpQuery() {
            return this.wakeUpQuery;
        }

        /**
         * @return workflowOverrideParams
         */
        public String getWorkflowOverrideParams() {
            return this.workflowOverrideParams;
        }

        public static final class Builder {
            private Integer asrMaxSilence; 
            private String bailianAppParams; 
            private Boolean enableIntelligentSegment; 
            private Boolean enablePushToTalk; 
            private Boolean enableVoiceInterrupt; 
            private Boolean gracefulShutdown; 
            private String greeting; 
            private java.util.List<VisionChatLlmHistory> llmHistory; 
            private Integer llmHistoryLimit; 
            private Integer maxIdleTime; 
            private Boolean useVoiceprint; 
            private Integer userOfflineTimeout; 
            private Integer userOnlineTimeout; 
            private String voiceId; 
            private String voiceprintId; 
            private Long volume; 
            private String wakeUpQuery; 
            private String workflowOverrideParams; 

            /**
             * AsrMaxSilence.
             */
            public Builder asrMaxSilence(Integer asrMaxSilence) {
                this.asrMaxSilence = asrMaxSilence;
                return this;
            }

            /**
             * BailianAppParams.
             */
            public Builder bailianAppParams(String bailianAppParams) {
                this.bailianAppParams = bailianAppParams;
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
             * EnablePushToTalk.
             */
            public Builder enablePushToTalk(Boolean enablePushToTalk) {
                this.enablePushToTalk = enablePushToTalk;
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
             * LlmHistory.
             */
            public Builder llmHistory(java.util.List<VisionChatLlmHistory> llmHistory) {
                this.llmHistory = llmHistory;
                return this;
            }

            /**
             * LlmHistoryLimit.
             */
            public Builder llmHistoryLimit(Integer llmHistoryLimit) {
                this.llmHistoryLimit = llmHistoryLimit;
                return this;
            }

            /**
             * MaxIdleTime.
             */
            public Builder maxIdleTime(Integer maxIdleTime) {
                this.maxIdleTime = maxIdleTime;
                return this;
            }

            /**
             * UseVoiceprint.
             */
            public Builder useVoiceprint(Boolean useVoiceprint) {
                this.useVoiceprint = useVoiceprint;
                return this;
            }

            /**
             * UserOfflineTimeout.
             */
            public Builder userOfflineTimeout(Integer userOfflineTimeout) {
                this.userOfflineTimeout = userOfflineTimeout;
                return this;
            }

            /**
             * UserOnlineTimeout.
             */
            public Builder userOnlineTimeout(Integer userOnlineTimeout) {
                this.userOnlineTimeout = userOnlineTimeout;
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
             * VoiceprintId.
             */
            public Builder voiceprintId(String voiceprintId) {
                this.voiceprintId = voiceprintId;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Long volume) {
                this.volume = volume;
                return this;
            }

            /**
             * WakeUpQuery.
             */
            public Builder wakeUpQuery(String wakeUpQuery) {
                this.wakeUpQuery = wakeUpQuery;
                return this;
            }

            /**
             * WorkflowOverrideParams.
             */
            public Builder workflowOverrideParams(String workflowOverrideParams) {
                this.workflowOverrideParams = workflowOverrideParams;
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
    public static class VoiceChatLlmHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private VoiceChatLlmHistory(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceChatLlmHistory create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public VoiceChatLlmHistory build() {
                return new VoiceChatLlmHistory(this);
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

        @com.aliyun.core.annotation.NameInMap("AvatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("AvatarUrlType")
        private String avatarUrlType;

        @com.aliyun.core.annotation.NameInMap("BailianAppParams")
        private String bailianAppParams;

        @com.aliyun.core.annotation.NameInMap("EnableIntelligentSegment")
        private Boolean enableIntelligentSegment;

        @com.aliyun.core.annotation.NameInMap("EnablePushToTalk")
        private Boolean enablePushToTalk;

        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("GracefulShutdown")
        private Boolean gracefulShutdown;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("LlmHistory")
        private java.util.List<VoiceChatLlmHistory> llmHistory;

        @com.aliyun.core.annotation.NameInMap("LlmHistoryLimit")
        private Integer llmHistoryLimit;

        @com.aliyun.core.annotation.NameInMap("MaxIdleTime")
        private Integer maxIdleTime;

        @com.aliyun.core.annotation.NameInMap("UseVoiceprint")
        private Boolean useVoiceprint;

        @com.aliyun.core.annotation.NameInMap("UserOfflineTimeout")
        private Integer userOfflineTimeout;

        @com.aliyun.core.annotation.NameInMap("UserOnlineTimeout")
        private Integer userOnlineTimeout;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("VoiceprintId")
        private String voiceprintId;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Long volume;

        @com.aliyun.core.annotation.NameInMap("WakeUpQuery")
        private String wakeUpQuery;

        @com.aliyun.core.annotation.NameInMap("WorkflowOverrideParams")
        private String workflowOverrideParams;

        private VoiceChat(Builder builder) {
            this.asrMaxSilence = builder.asrMaxSilence;
            this.avatarUrl = builder.avatarUrl;
            this.avatarUrlType = builder.avatarUrlType;
            this.bailianAppParams = builder.bailianAppParams;
            this.enableIntelligentSegment = builder.enableIntelligentSegment;
            this.enablePushToTalk = builder.enablePushToTalk;
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.gracefulShutdown = builder.gracefulShutdown;
            this.greeting = builder.greeting;
            this.llmHistory = builder.llmHistory;
            this.llmHistoryLimit = builder.llmHistoryLimit;
            this.maxIdleTime = builder.maxIdleTime;
            this.useVoiceprint = builder.useVoiceprint;
            this.userOfflineTimeout = builder.userOfflineTimeout;
            this.userOnlineTimeout = builder.userOnlineTimeout;
            this.voiceId = builder.voiceId;
            this.voiceprintId = builder.voiceprintId;
            this.volume = builder.volume;
            this.wakeUpQuery = builder.wakeUpQuery;
            this.workflowOverrideParams = builder.workflowOverrideParams;
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
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return avatarUrlType
         */
        public String getAvatarUrlType() {
            return this.avatarUrlType;
        }

        /**
         * @return bailianAppParams
         */
        public String getBailianAppParams() {
            return this.bailianAppParams;
        }

        /**
         * @return enableIntelligentSegment
         */
        public Boolean getEnableIntelligentSegment() {
            return this.enableIntelligentSegment;
        }

        /**
         * @return enablePushToTalk
         */
        public Boolean getEnablePushToTalk() {
            return this.enablePushToTalk;
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
         * @return llmHistory
         */
        public java.util.List<VoiceChatLlmHistory> getLlmHistory() {
            return this.llmHistory;
        }

        /**
         * @return llmHistoryLimit
         */
        public Integer getLlmHistoryLimit() {
            return this.llmHistoryLimit;
        }

        /**
         * @return maxIdleTime
         */
        public Integer getMaxIdleTime() {
            return this.maxIdleTime;
        }

        /**
         * @return useVoiceprint
         */
        public Boolean getUseVoiceprint() {
            return this.useVoiceprint;
        }

        /**
         * @return userOfflineTimeout
         */
        public Integer getUserOfflineTimeout() {
            return this.userOfflineTimeout;
        }

        /**
         * @return userOnlineTimeout
         */
        public Integer getUserOnlineTimeout() {
            return this.userOnlineTimeout;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        /**
         * @return voiceprintId
         */
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

        /**
         * @return volume
         */
        public Long getVolume() {
            return this.volume;
        }

        /**
         * @return wakeUpQuery
         */
        public String getWakeUpQuery() {
            return this.wakeUpQuery;
        }

        /**
         * @return workflowOverrideParams
         */
        public String getWorkflowOverrideParams() {
            return this.workflowOverrideParams;
        }

        public static final class Builder {
            private Integer asrMaxSilence; 
            private String avatarUrl; 
            private String avatarUrlType; 
            private String bailianAppParams; 
            private Boolean enableIntelligentSegment; 
            private Boolean enablePushToTalk; 
            private Boolean enableVoiceInterrupt; 
            private Boolean gracefulShutdown; 
            private String greeting; 
            private java.util.List<VoiceChatLlmHistory> llmHistory; 
            private Integer llmHistoryLimit; 
            private Integer maxIdleTime; 
            private Boolean useVoiceprint; 
            private Integer userOfflineTimeout; 
            private Integer userOnlineTimeout; 
            private String voiceId; 
            private String voiceprintId; 
            private Long volume; 
            private String wakeUpQuery; 
            private String workflowOverrideParams; 

            /**
             * AsrMaxSilence.
             */
            public Builder asrMaxSilence(Integer asrMaxSilence) {
                this.asrMaxSilence = asrMaxSilence;
                return this;
            }

            /**
             * AvatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * AvatarUrlType.
             */
            public Builder avatarUrlType(String avatarUrlType) {
                this.avatarUrlType = avatarUrlType;
                return this;
            }

            /**
             * BailianAppParams.
             */
            public Builder bailianAppParams(String bailianAppParams) {
                this.bailianAppParams = bailianAppParams;
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
             * EnablePushToTalk.
             */
            public Builder enablePushToTalk(Boolean enablePushToTalk) {
                this.enablePushToTalk = enablePushToTalk;
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
             * LlmHistory.
             */
            public Builder llmHistory(java.util.List<VoiceChatLlmHistory> llmHistory) {
                this.llmHistory = llmHistory;
                return this;
            }

            /**
             * LlmHistoryLimit.
             */
            public Builder llmHistoryLimit(Integer llmHistoryLimit) {
                this.llmHistoryLimit = llmHistoryLimit;
                return this;
            }

            /**
             * MaxIdleTime.
             */
            public Builder maxIdleTime(Integer maxIdleTime) {
                this.maxIdleTime = maxIdleTime;
                return this;
            }

            /**
             * UseVoiceprint.
             */
            public Builder useVoiceprint(Boolean useVoiceprint) {
                this.useVoiceprint = useVoiceprint;
                return this;
            }

            /**
             * UserOfflineTimeout.
             */
            public Builder userOfflineTimeout(Integer userOfflineTimeout) {
                this.userOfflineTimeout = userOfflineTimeout;
                return this;
            }

            /**
             * UserOnlineTimeout.
             */
            public Builder userOnlineTimeout(Integer userOnlineTimeout) {
                this.userOnlineTimeout = userOnlineTimeout;
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
             * VoiceprintId.
             */
            public Builder voiceprintId(String voiceprintId) {
                this.voiceprintId = voiceprintId;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Long volume) {
                this.volume = volume;
                return this;
            }

            /**
             * WakeUpQuery.
             */
            public Builder wakeUpQuery(String wakeUpQuery) {
                this.wakeUpQuery = wakeUpQuery;
                return this;
            }

            /**
             * WorkflowOverrideParams.
             */
            public Builder workflowOverrideParams(String workflowOverrideParams) {
                this.workflowOverrideParams = workflowOverrideParams;
                return this;
            }

            public VoiceChat build() {
                return new VoiceChat(this);
            } 

        } 

    }
}
