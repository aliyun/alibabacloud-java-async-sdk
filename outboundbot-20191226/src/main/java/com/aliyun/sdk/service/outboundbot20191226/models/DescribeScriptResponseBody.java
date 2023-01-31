// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScriptResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScriptResponseBody</p>
 */
public class DescribeScriptResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("NlsConfig")
    private String nlsConfig;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Script")
    private Script script;

    @NameInMap("Success")
    private Boolean success;

    private DescribeScriptResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.nlsConfig = builder.nlsConfig;
        this.requestId = builder.requestId;
        this.script = builder.script;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScriptResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nlsConfig
     */
    public String getNlsConfig() {
        return this.nlsConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return script
     */
    public Script getScript() {
        return this.script;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String nlsConfig; 
        private String requestId; 
        private Script script; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * NlsConfig.
         */
        public Builder nlsConfig(String nlsConfig) {
            this.nlsConfig = nlsConfig;
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
         * Script.
         */
        public Builder script(Script script) {
            this.script = script;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeScriptResponseBody build() {
            return new DescribeScriptResponseBody(this);
        } 

    } 

    public static class Script extends TeaModel {
        @NameInMap("AsrConfig")
        private String asrConfig;

        @NameInMap("ChatbotId")
        private String chatbotId;

        @NameInMap("DebugStatus")
        private String debugStatus;

        @NameInMap("EmotionEnable")
        private Boolean emotionEnable;

        @NameInMap("Industry")
        private String industry;

        @NameInMap("IsDebugDrafted")
        private Boolean isDebugDrafted;

        @NameInMap("IsDrafted")
        private Boolean isDrafted;

        @NameInMap("LongWaitEnable")
        private Boolean longWaitEnable;

        @NameInMap("MiniPlaybackEnable")
        private Boolean miniPlaybackEnable;

        @NameInMap("NewBargeInEnable")
        private Boolean newBargeInEnable;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("ScriptDescription")
        private String scriptDescription;

        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("ScriptName")
        private String scriptName;

        @NameInMap("Status")
        private String status;

        @NameInMap("TtsConfig")
        private String ttsConfig;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Script(Builder builder) {
            this.asrConfig = builder.asrConfig;
            this.chatbotId = builder.chatbotId;
            this.debugStatus = builder.debugStatus;
            this.emotionEnable = builder.emotionEnable;
            this.industry = builder.industry;
            this.isDebugDrafted = builder.isDebugDrafted;
            this.isDrafted = builder.isDrafted;
            this.longWaitEnable = builder.longWaitEnable;
            this.miniPlaybackEnable = builder.miniPlaybackEnable;
            this.newBargeInEnable = builder.newBargeInEnable;
            this.scene = builder.scene;
            this.scriptDescription = builder.scriptDescription;
            this.scriptId = builder.scriptId;
            this.scriptName = builder.scriptName;
            this.status = builder.status;
            this.ttsConfig = builder.ttsConfig;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Script create() {
            return builder().build();
        }

        /**
         * @return asrConfig
         */
        public String getAsrConfig() {
            return this.asrConfig;
        }

        /**
         * @return chatbotId
         */
        public String getChatbotId() {
            return this.chatbotId;
        }

        /**
         * @return debugStatus
         */
        public String getDebugStatus() {
            return this.debugStatus;
        }

        /**
         * @return emotionEnable
         */
        public Boolean getEmotionEnable() {
            return this.emotionEnable;
        }

        /**
         * @return industry
         */
        public String getIndustry() {
            return this.industry;
        }

        /**
         * @return isDebugDrafted
         */
        public Boolean getIsDebugDrafted() {
            return this.isDebugDrafted;
        }

        /**
         * @return isDrafted
         */
        public Boolean getIsDrafted() {
            return this.isDrafted;
        }

        /**
         * @return longWaitEnable
         */
        public Boolean getLongWaitEnable() {
            return this.longWaitEnable;
        }

        /**
         * @return miniPlaybackEnable
         */
        public Boolean getMiniPlaybackEnable() {
            return this.miniPlaybackEnable;
        }

        /**
         * @return newBargeInEnable
         */
        public Boolean getNewBargeInEnable() {
            return this.newBargeInEnable;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return scriptDescription
         */
        public String getScriptDescription() {
            return this.scriptDescription;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return ttsConfig
         */
        public String getTtsConfig() {
            return this.ttsConfig;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String asrConfig; 
            private String chatbotId; 
            private String debugStatus; 
            private Boolean emotionEnable; 
            private String industry; 
            private Boolean isDebugDrafted; 
            private Boolean isDrafted; 
            private Boolean longWaitEnable; 
            private Boolean miniPlaybackEnable; 
            private Boolean newBargeInEnable; 
            private String scene; 
            private String scriptDescription; 
            private String scriptId; 
            private String scriptName; 
            private String status; 
            private String ttsConfig; 
            private Long updateTime; 

            /**
             * AsrConfig.
             */
            public Builder asrConfig(String asrConfig) {
                this.asrConfig = asrConfig;
                return this;
            }

            /**
             * ChatbotId.
             */
            public Builder chatbotId(String chatbotId) {
                this.chatbotId = chatbotId;
                return this;
            }

            /**
             * DebugStatus.
             */
            public Builder debugStatus(String debugStatus) {
                this.debugStatus = debugStatus;
                return this;
            }

            /**
             * EmotionEnable.
             */
            public Builder emotionEnable(Boolean emotionEnable) {
                this.emotionEnable = emotionEnable;
                return this;
            }

            /**
             * Industry.
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * IsDebugDrafted.
             */
            public Builder isDebugDrafted(Boolean isDebugDrafted) {
                this.isDebugDrafted = isDebugDrafted;
                return this;
            }

            /**
             * IsDrafted.
             */
            public Builder isDrafted(Boolean isDrafted) {
                this.isDrafted = isDrafted;
                return this;
            }

            /**
             * LongWaitEnable.
             */
            public Builder longWaitEnable(Boolean longWaitEnable) {
                this.longWaitEnable = longWaitEnable;
                return this;
            }

            /**
             * MiniPlaybackEnable.
             */
            public Builder miniPlaybackEnable(Boolean miniPlaybackEnable) {
                this.miniPlaybackEnable = miniPlaybackEnable;
                return this;
            }

            /**
             * NewBargeInEnable.
             */
            public Builder newBargeInEnable(Boolean newBargeInEnable) {
                this.newBargeInEnable = newBargeInEnable;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * ScriptDescription.
             */
            public Builder scriptDescription(String scriptDescription) {
                this.scriptDescription = scriptDescription;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * ScriptName.
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TtsConfig.
             */
            public Builder ttsConfig(String ttsConfig) {
                this.ttsConfig = ttsConfig;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Script build() {
                return new Script(this);
            } 

        } 

    }
}
