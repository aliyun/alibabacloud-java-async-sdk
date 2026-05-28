// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link AddModelApplicationRequest} extends {@link RequestModel}
 *
 * <p>AddModelApplicationRequest</p>
 */
public class AddModelApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationCps")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long applicationCps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallConnectedTriggerModel")
    private Boolean callConnectedTriggerModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DyvmsSceneName")
    private String dyvmsSceneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelVersion")
    private String modelVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MuteActive")
    private Boolean muteActive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MuteDuration")
    private Long muteDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MuteHangupNum")
    private Long muteHangupNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationId")
    private Long qualificationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationName")
    private String qualificationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordingFile")
    private String recordingFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeechContent")
    private String speechContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeechId")
    private Long speechId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWord")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWordType")
    private Long startWordType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private TtsConfig ttsConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsageDesc")
    private String usageDesc;

    private AddModelApplicationRequest(Builder builder) {
        super(builder);
        this.applicationCps = builder.applicationCps;
        this.applicationName = builder.applicationName;
        this.callConnectedTriggerModel = builder.callConnectedTriggerModel;
        this.dyvmsSceneName = builder.dyvmsSceneName;
        this.modelCode = builder.modelCode;
        this.modelVersion = builder.modelVersion;
        this.muteActive = builder.muteActive;
        this.muteDuration = builder.muteDuration;
        this.muteHangupNum = builder.muteHangupNum;
        this.ownerId = builder.ownerId;
        this.prompt = builder.prompt;
        this.qualificationId = builder.qualificationId;
        this.qualificationName = builder.qualificationName;
        this.recordingFile = builder.recordingFile;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.source = builder.source;
        this.speechContent = builder.speechContent;
        this.speechId = builder.speechId;
        this.startWord = builder.startWord;
        this.startWordType = builder.startWordType;
        this.ttsConfig = builder.ttsConfig;
        this.usageDesc = builder.usageDesc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddModelApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationCps
     */
    public Long getApplicationCps() {
        return this.applicationCps;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return callConnectedTriggerModel
     */
    public Boolean getCallConnectedTriggerModel() {
        return this.callConnectedTriggerModel;
    }

    /**
     * @return dyvmsSceneName
     */
    public String getDyvmsSceneName() {
        return this.dyvmsSceneName;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return modelVersion
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * @return muteActive
     */
    public Boolean getMuteActive() {
        return this.muteActive;
    }

    /**
     * @return muteDuration
     */
    public Long getMuteDuration() {
        return this.muteDuration;
    }

    /**
     * @return muteHangupNum
     */
    public Long getMuteHangupNum() {
        return this.muteHangupNum;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return qualificationId
     */
    public Long getQualificationId() {
        return this.qualificationId;
    }

    /**
     * @return qualificationName
     */
    public String getQualificationName() {
        return this.qualificationName;
    }

    /**
     * @return recordingFile
     */
    public String getRecordingFile() {
        return this.recordingFile;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return speechContent
     */
    public String getSpeechContent() {
        return this.speechContent;
    }

    /**
     * @return speechId
     */
    public Long getSpeechId() {
        return this.speechId;
    }

    /**
     * @return startWord
     */
    public String getStartWord() {
        return this.startWord;
    }

    /**
     * @return startWordType
     */
    public Long getStartWordType() {
        return this.startWordType;
    }

    /**
     * @return ttsConfig
     */
    public TtsConfig getTtsConfig() {
        return this.ttsConfig;
    }

    /**
     * @return usageDesc
     */
    public String getUsageDesc() {
        return this.usageDesc;
    }

    public static final class Builder extends Request.Builder<AddModelApplicationRequest, Builder> {
        private Long applicationCps; 
        private String applicationName; 
        private Boolean callConnectedTriggerModel; 
        private String dyvmsSceneName; 
        private String modelCode; 
        private String modelVersion; 
        private Boolean muteActive; 
        private Long muteDuration; 
        private Long muteHangupNum; 
        private Long ownerId; 
        private String prompt; 
        private Long qualificationId; 
        private String qualificationName; 
        private String recordingFile; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String source; 
        private String speechContent; 
        private Long speechId; 
        private String startWord; 
        private Long startWordType; 
        private TtsConfig ttsConfig; 
        private String usageDesc; 

        private Builder() {
            super();
        } 

        private Builder(AddModelApplicationRequest request) {
            super(request);
            this.applicationCps = request.applicationCps;
            this.applicationName = request.applicationName;
            this.callConnectedTriggerModel = request.callConnectedTriggerModel;
            this.dyvmsSceneName = request.dyvmsSceneName;
            this.modelCode = request.modelCode;
            this.modelVersion = request.modelVersion;
            this.muteActive = request.muteActive;
            this.muteDuration = request.muteDuration;
            this.muteHangupNum = request.muteHangupNum;
            this.ownerId = request.ownerId;
            this.prompt = request.prompt;
            this.qualificationId = request.qualificationId;
            this.qualificationName = request.qualificationName;
            this.recordingFile = request.recordingFile;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.source = request.source;
            this.speechContent = request.speechContent;
            this.speechId = request.speechId;
            this.startWord = request.startWord;
            this.startWordType = request.startWordType;
            this.ttsConfig = request.ttsConfig;
            this.usageDesc = request.usageDesc;
        } 

        /**
         * <p>应用并发请求数</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder applicationCps(Long applicationCps) {
            this.putQueryParameter("ApplicationCps", applicationCps);
            this.applicationCps = applicationCps;
            return this;
        }

        /**
         * <p>模型应用名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * CallConnectedTriggerModel.
         */
        public Builder callConnectedTriggerModel(Boolean callConnectedTriggerModel) {
            this.putQueryParameter("CallConnectedTriggerModel", callConnectedTriggerModel);
            this.callConnectedTriggerModel = callConnectedTriggerModel;
            return this;
        }

        /**
         * <p>场景名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder dyvmsSceneName(String dyvmsSceneName) {
            this.putQueryParameter("DyvmsSceneName", dyvmsSceneName);
            this.dyvmsSceneName = dyvmsSceneName;
            return this;
        }

        /**
         * <p>模型编码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder modelCode(String modelCode) {
            this.putQueryParameter("ModelCode", modelCode);
            this.modelCode = modelCode;
            return this;
        }

        /**
         * <p>模型版本</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder modelVersion(String modelVersion) {
            this.putQueryParameter("ModelVersion", modelVersion);
            this.modelVersion = modelVersion;
            return this;
        }

        /**
         * <p>第一个静音是否唤起模型</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder muteActive(Boolean muteActive) {
            this.putQueryParameter("MuteActive", muteActive);
            this.muteActive = muteActive;
            return this;
        }

        /**
         * <p>静音时长</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        public Builder muteDuration(Long muteDuration) {
            this.putQueryParameter("MuteDuration", muteDuration);
            this.muteDuration = muteDuration;
            return this;
        }

        /**
         * <p>连续多少个静音事件主动挂机</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder muteHangupNum(Long muteHangupNum) {
            this.putQueryParameter("MuteHangupNum", muteHangupNum);
            this.muteHangupNum = muteHangupNum;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>提示词</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>资质ID</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        public Builder qualificationId(Long qualificationId) {
            this.putQueryParameter("QualificationId", qualificationId);
            this.qualificationId = qualificationId;
            return this;
        }

        /**
         * <p>资质名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder qualificationName(String qualificationName) {
            this.putQueryParameter("QualificationName", qualificationName);
            this.qualificationName = qualificationName;
            return this;
        }

        /**
         * RecordingFile.
         */
        public Builder recordingFile(String recordingFile) {
            this.putQueryParameter("RecordingFile", recordingFile);
            this.recordingFile = recordingFile;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>来源</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>话术内容</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder speechContent(String speechContent) {
            this.putQueryParameter("SpeechContent", speechContent);
            this.speechContent = speechContent;
            return this;
        }

        /**
         * <p>话束id</p>
         * 
         * <strong>example:</strong>
         * <p>88</p>
         */
        public Builder speechId(Long speechId) {
            this.putQueryParameter("SpeechId", speechId);
            this.speechId = speechId;
            return this;
        }

        /**
         * <p>开场白</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder startWord(String startWord) {
            this.putQueryParameter("StartWord", startWord);
            this.startWord = startWord;
            return this;
        }

        /**
         * StartWordType.
         */
        public Builder startWordType(Long startWordType) {
            this.putQueryParameter("StartWordType", startWordType);
            this.startWordType = startWordType;
            return this;
        }

        /**
         * <p>tts配置，包括音色、音量、音速等。</p>
         * <p>This parameter is required.</p>
         */
        public Builder ttsConfig(TtsConfig ttsConfig) {
            String ttsConfigShrink = shrink(ttsConfig, "TtsConfig", "json");
            this.putQueryParameter("TtsConfig", ttsConfigShrink);
            this.ttsConfig = ttsConfig;
            return this;
        }

        /**
         * <p>用途</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder usageDesc(String usageDesc) {
            this.putQueryParameter("UsageDesc", usageDesc);
            this.usageDesc = usageDesc;
            return this;
        }

        @Override
        public AddModelApplicationRequest build() {
            return new AddModelApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddModelApplicationRequest} extends {@link TeaModel}
     *
     * <p>AddModelApplicationRequest</p>
     */
    public static class TtsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundEnabled")
        private Boolean backgroundEnabled;

        @com.aliyun.core.annotation.NameInMap("BackgroundSound")
        private Long backgroundSound;

        @com.aliyun.core.annotation.NameInMap("BackgroundVolume")
        private Long backgroundVolume;

        @com.aliyun.core.annotation.NameInMap("CustomerAccountId")
        private Long customerAccountId;

        @com.aliyun.core.annotation.NameInMap("MixingEnabled")
        private Boolean mixingEnabled;

        @com.aliyun.core.annotation.NameInMap("MixingTemplate")
        private Long mixingTemplate;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("TtsSpeed")
        private Long ttsSpeed;

        @com.aliyun.core.annotation.NameInMap("TtsStyle")
        private String ttsStyle;

        @com.aliyun.core.annotation.NameInMap("TtsVolume")
        private Long ttsVolume;

        @com.aliyun.core.annotation.NameInMap("VoiceCode")
        private String voiceCode;

        @com.aliyun.core.annotation.NameInMap("VoiceType")
        private String voiceType;

        private TtsConfig(Builder builder) {
            this.backgroundEnabled = builder.backgroundEnabled;
            this.backgroundSound = builder.backgroundSound;
            this.backgroundVolume = builder.backgroundVolume;
            this.customerAccountId = builder.customerAccountId;
            this.mixingEnabled = builder.mixingEnabled;
            this.mixingTemplate = builder.mixingTemplate;
            this.resourceId = builder.resourceId;
            this.ttsSpeed = builder.ttsSpeed;
            this.ttsStyle = builder.ttsStyle;
            this.ttsVolume = builder.ttsVolume;
            this.voiceCode = builder.voiceCode;
            this.voiceType = builder.voiceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TtsConfig create() {
            return builder().build();
        }

        /**
         * @return backgroundEnabled
         */
        public Boolean getBackgroundEnabled() {
            return this.backgroundEnabled;
        }

        /**
         * @return backgroundSound
         */
        public Long getBackgroundSound() {
            return this.backgroundSound;
        }

        /**
         * @return backgroundVolume
         */
        public Long getBackgroundVolume() {
            return this.backgroundVolume;
        }

        /**
         * @return customerAccountId
         */
        public Long getCustomerAccountId() {
            return this.customerAccountId;
        }

        /**
         * @return mixingEnabled
         */
        public Boolean getMixingEnabled() {
            return this.mixingEnabled;
        }

        /**
         * @return mixingTemplate
         */
        public Long getMixingTemplate() {
            return this.mixingTemplate;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return ttsSpeed
         */
        public Long getTtsSpeed() {
            return this.ttsSpeed;
        }

        /**
         * @return ttsStyle
         */
        public String getTtsStyle() {
            return this.ttsStyle;
        }

        /**
         * @return ttsVolume
         */
        public Long getTtsVolume() {
            return this.ttsVolume;
        }

        /**
         * @return voiceCode
         */
        public String getVoiceCode() {
            return this.voiceCode;
        }

        /**
         * @return voiceType
         */
        public String getVoiceType() {
            return this.voiceType;
        }

        public static final class Builder {
            private Boolean backgroundEnabled; 
            private Long backgroundSound; 
            private Long backgroundVolume; 
            private Long customerAccountId; 
            private Boolean mixingEnabled; 
            private Long mixingTemplate; 
            private String resourceId; 
            private Long ttsSpeed; 
            private String ttsStyle; 
            private Long ttsVolume; 
            private String voiceCode; 
            private String voiceType; 

            private Builder() {
            } 

            private Builder(TtsConfig model) {
                this.backgroundEnabled = model.backgroundEnabled;
                this.backgroundSound = model.backgroundSound;
                this.backgroundVolume = model.backgroundVolume;
                this.customerAccountId = model.customerAccountId;
                this.mixingEnabled = model.mixingEnabled;
                this.mixingTemplate = model.mixingTemplate;
                this.resourceId = model.resourceId;
                this.ttsSpeed = model.ttsSpeed;
                this.ttsStyle = model.ttsStyle;
                this.ttsVolume = model.ttsVolume;
                this.voiceCode = model.voiceCode;
                this.voiceType = model.voiceType;
            } 

            /**
             * BackgroundEnabled.
             */
            public Builder backgroundEnabled(Boolean backgroundEnabled) {
                this.backgroundEnabled = backgroundEnabled;
                return this;
            }

            /**
             * BackgroundSound.
             */
            public Builder backgroundSound(Long backgroundSound) {
                this.backgroundSound = backgroundSound;
                return this;
            }

            /**
             * BackgroundVolume.
             */
            public Builder backgroundVolume(Long backgroundVolume) {
                this.backgroundVolume = backgroundVolume;
                return this;
            }

            /**
             * CustomerAccountId.
             */
            public Builder customerAccountId(Long customerAccountId) {
                this.customerAccountId = customerAccountId;
                return this;
            }

            /**
             * MixingEnabled.
             */
            public Builder mixingEnabled(Boolean mixingEnabled) {
                this.mixingEnabled = mixingEnabled;
                return this;
            }

            /**
             * MixingTemplate.
             */
            public Builder mixingTemplate(Long mixingTemplate) {
                this.mixingTemplate = mixingTemplate;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>TTS 变量播放时的声音速度。取值范围：-200~200，默认值为 0。</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder ttsSpeed(Long ttsSpeed) {
                this.ttsSpeed = ttsSpeed;
                return this;
            }

            /**
             * <p>声音风格</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder ttsStyle(String ttsStyle) {
                this.ttsStyle = ttsStyle;
                return this;
            }

            /**
             * <p>TTS 变量播放的音量。取值范围：0~100，默认值为 0。</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder ttsVolume(Long ttsVolume) {
                this.ttsVolume = ttsVolume;
                return this;
            }

            /**
             * <p>音色code</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder voiceCode(String voiceCode) {
                this.voiceCode = voiceCode;
                return this;
            }

            /**
             * <p>声音类型</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder voiceType(String voiceType) {
                this.voiceType = voiceType;
                return this;
            }

            public TtsConfig build() {
                return new TtsConfig(this);
            } 

        } 

    }
}
