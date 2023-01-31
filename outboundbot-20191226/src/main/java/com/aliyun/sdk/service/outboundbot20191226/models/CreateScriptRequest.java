// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScriptRequest} extends {@link RequestModel}
 *
 * <p>CreateScriptRequest</p>
 */
public class CreateScriptRequest extends Request {
    @Query
    @NameInMap("AsrConfig")
    private String asrConfig;

    @Query
    @NameInMap("ChatbotId")
    private String chatbotId;

    @Query
    @NameInMap("EmotionEnable")
    private Boolean emotionEnable;

    @Query
    @NameInMap("Industry")
    @Validation(required = true)
    private String industry;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("LongWaitEnable")
    private Boolean longWaitEnable;

    @Query
    @NameInMap("MiniPlaybackEnable")
    private Boolean miniPlaybackEnable;

    @Query
    @NameInMap("NewBargeInEnable")
    private Boolean newBargeInEnable;

    @Query
    @NameInMap("Scene")
    @Validation(required = true)
    private String scene;

    @Query
    @NameInMap("ScriptContent")
    private java.util.List < String > scriptContent;

    @Query
    @NameInMap("ScriptDescription")
    private String scriptDescription;

    @Query
    @NameInMap("ScriptName")
    @Validation(required = true)
    private String scriptName;

    @Query
    @NameInMap("ScriptWaveform")
    private java.util.List < String > scriptWaveform;

    @Query
    @NameInMap("TtsConfig")
    private String ttsConfig;

    private CreateScriptRequest(Builder builder) {
        super(builder);
        this.asrConfig = builder.asrConfig;
        this.chatbotId = builder.chatbotId;
        this.emotionEnable = builder.emotionEnable;
        this.industry = builder.industry;
        this.instanceId = builder.instanceId;
        this.longWaitEnable = builder.longWaitEnable;
        this.miniPlaybackEnable = builder.miniPlaybackEnable;
        this.newBargeInEnable = builder.newBargeInEnable;
        this.scene = builder.scene;
        this.scriptContent = builder.scriptContent;
        this.scriptDescription = builder.scriptDescription;
        this.scriptName = builder.scriptName;
        this.scriptWaveform = builder.scriptWaveform;
        this.ttsConfig = builder.ttsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScriptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return scriptContent
     */
    public java.util.List < String > getScriptContent() {
        return this.scriptContent;
    }

    /**
     * @return scriptDescription
     */
    public String getScriptDescription() {
        return this.scriptDescription;
    }

    /**
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    /**
     * @return scriptWaveform
     */
    public java.util.List < String > getScriptWaveform() {
        return this.scriptWaveform;
    }

    /**
     * @return ttsConfig
     */
    public String getTtsConfig() {
        return this.ttsConfig;
    }

    public static final class Builder extends Request.Builder<CreateScriptRequest, Builder> {
        private String asrConfig; 
        private String chatbotId; 
        private Boolean emotionEnable; 
        private String industry; 
        private String instanceId; 
        private Boolean longWaitEnable; 
        private Boolean miniPlaybackEnable; 
        private Boolean newBargeInEnable; 
        private String scene; 
        private java.util.List < String > scriptContent; 
        private String scriptDescription; 
        private String scriptName; 
        private java.util.List < String > scriptWaveform; 
        private String ttsConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateScriptRequest request) {
            super(request);
            this.asrConfig = request.asrConfig;
            this.chatbotId = request.chatbotId;
            this.emotionEnable = request.emotionEnable;
            this.industry = request.industry;
            this.instanceId = request.instanceId;
            this.longWaitEnable = request.longWaitEnable;
            this.miniPlaybackEnable = request.miniPlaybackEnable;
            this.newBargeInEnable = request.newBargeInEnable;
            this.scene = request.scene;
            this.scriptContent = request.scriptContent;
            this.scriptDescription = request.scriptDescription;
            this.scriptName = request.scriptName;
            this.scriptWaveform = request.scriptWaveform;
            this.ttsConfig = request.ttsConfig;
        } 

        /**
         * AsrConfig.
         */
        public Builder asrConfig(String asrConfig) {
            this.putQueryParameter("AsrConfig", asrConfig);
            this.asrConfig = asrConfig;
            return this;
        }

        /**
         * ChatbotId.
         */
        public Builder chatbotId(String chatbotId) {
            this.putQueryParameter("ChatbotId", chatbotId);
            this.chatbotId = chatbotId;
            return this;
        }

        /**
         * EmotionEnable.
         */
        public Builder emotionEnable(Boolean emotionEnable) {
            this.putQueryParameter("EmotionEnable", emotionEnable);
            this.emotionEnable = emotionEnable;
            return this;
        }

        /**
         * Industry.
         */
        public Builder industry(String industry) {
            this.putQueryParameter("Industry", industry);
            this.industry = industry;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LongWaitEnable.
         */
        public Builder longWaitEnable(Boolean longWaitEnable) {
            this.putQueryParameter("LongWaitEnable", longWaitEnable);
            this.longWaitEnable = longWaitEnable;
            return this;
        }

        /**
         * MiniPlaybackEnable.
         */
        public Builder miniPlaybackEnable(Boolean miniPlaybackEnable) {
            this.putQueryParameter("MiniPlaybackEnable", miniPlaybackEnable);
            this.miniPlaybackEnable = miniPlaybackEnable;
            return this;
        }

        /**
         * NewBargeInEnable.
         */
        public Builder newBargeInEnable(Boolean newBargeInEnable) {
            this.putQueryParameter("NewBargeInEnable", newBargeInEnable);
            this.newBargeInEnable = newBargeInEnable;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * ScriptContent.
         */
        public Builder scriptContent(java.util.List < String > scriptContent) {
            this.putQueryParameter("ScriptContent", scriptContent);
            this.scriptContent = scriptContent;
            return this;
        }

        /**
         * ScriptDescription.
         */
        public Builder scriptDescription(String scriptDescription) {
            this.putQueryParameter("ScriptDescription", scriptDescription);
            this.scriptDescription = scriptDescription;
            return this;
        }

        /**
         * ScriptName.
         */
        public Builder scriptName(String scriptName) {
            this.putQueryParameter("ScriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * ScriptWaveform.
         */
        public Builder scriptWaveform(java.util.List < String > scriptWaveform) {
            this.putQueryParameter("ScriptWaveform", scriptWaveform);
            this.scriptWaveform = scriptWaveform;
            return this;
        }

        /**
         * TtsConfig.
         */
        public Builder ttsConfig(String ttsConfig) {
            this.putQueryParameter("TtsConfig", ttsConfig);
            this.ttsConfig = ttsConfig;
            return this;
        }

        @Override
        public CreateScriptRequest build() {
            return new CreateScriptRequest(this);
        } 

    } 

}
