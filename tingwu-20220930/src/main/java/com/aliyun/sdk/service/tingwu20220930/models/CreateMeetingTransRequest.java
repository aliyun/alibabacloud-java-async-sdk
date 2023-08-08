// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20220930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMeetingTransRequest} extends {@link RequestModel}
 *
 * <p>CreateMeetingTransRequest</p>
 */
public class CreateMeetingTransRequest extends Request {
    @Body
    @NameInMap("AbilityParams")
    private java.util.Map < String, ? > abilityParams;

    @Body
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Body
    @NameInMap("AsrParams")
    private java.util.Map < String, ? > asrParams;

    @Body
    @NameInMap("AudioBitRate")
    @Validation(required = true)
    private Integer audioBitRate;

    @Body
    @NameInMap("AudioFormat")
    @Validation(required = true)
    private String audioFormat;

    @Body
    @NameInMap("AudioLanguage")
    @Validation(required = true)
    private String audioLanguage;

    @Body
    @NameInMap("AudioOutputEnabled")
    private Boolean audioOutputEnabled;

    @Body
    @NameInMap("AudioOutputOssBucket")
    private String audioOutputOssBucket;

    @Body
    @NameInMap("AudioOutputOssPath")
    private String audioOutputOssPath;

    @Body
    @NameInMap("AudioPackage")
    private String audioPackage;

    @Body
    @NameInMap("AudioSampleRate")
    @Validation(required = true)
    private Integer audioSampleRate;

    @Body
    @NameInMap("AudioSegmentsEnabled")
    private Boolean audioSegmentsEnabled;

    @Body
    @NameInMap("DocResultEnabled")
    private Boolean docResultEnabled;

    @Body
    @NameInMap("LabParams")
    private java.util.Map < String, ? > labParams;

    @Body
    @NameInMap("MeetingKey")
    private String meetingKey;

    @Body
    @NameInMap("MeetingResultEnabled")
    private Boolean meetingResultEnabled;

    @Body
    @NameInMap("MeetingResultOssBucket")
    private String meetingResultOssBucket;

    @Body
    @NameInMap("MeetingResultOssPath")
    private String meetingResultOssPath;

    @Body
    @NameInMap("RealtimeActiveResultLevel")
    private Integer realtimeActiveResultLevel;

    @Body
    @NameInMap("RealtimeResultEnabled")
    private Boolean realtimeResultEnabled;

    @Body
    @NameInMap("RealtimeResultLevel")
    private Integer realtimeResultLevel;

    @Body
    @NameInMap("RealtimeResultMeetingInfoEnabled")
    private Boolean realtimeResultMeetingInfoEnabled;

    @Body
    @NameInMap("RealtimeResultWordsEnabled")
    private Boolean realtimeResultWordsEnabled;

    @Body
    @NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @Body
    @NameInMap("TranslateActiveResultLevel")
    private Integer translateActiveResultLevel;

    @Body
    @NameInMap("TranslateLanguages")
    private String translateLanguages;

    @Body
    @NameInMap("TranslateResultEnabled")
    private Boolean translateResultEnabled;

    @Body
    @NameInMap("TranslateResultLevel")
    private Integer translateResultLevel;

    private CreateMeetingTransRequest(Builder builder) {
        super(builder);
        this.abilityParams = builder.abilityParams;
        this.appKey = builder.appKey;
        this.asrParams = builder.asrParams;
        this.audioBitRate = builder.audioBitRate;
        this.audioFormat = builder.audioFormat;
        this.audioLanguage = builder.audioLanguage;
        this.audioOutputEnabled = builder.audioOutputEnabled;
        this.audioOutputOssBucket = builder.audioOutputOssBucket;
        this.audioOutputOssPath = builder.audioOutputOssPath;
        this.audioPackage = builder.audioPackage;
        this.audioSampleRate = builder.audioSampleRate;
        this.audioSegmentsEnabled = builder.audioSegmentsEnabled;
        this.docResultEnabled = builder.docResultEnabled;
        this.labParams = builder.labParams;
        this.meetingKey = builder.meetingKey;
        this.meetingResultEnabled = builder.meetingResultEnabled;
        this.meetingResultOssBucket = builder.meetingResultOssBucket;
        this.meetingResultOssPath = builder.meetingResultOssPath;
        this.realtimeActiveResultLevel = builder.realtimeActiveResultLevel;
        this.realtimeResultEnabled = builder.realtimeResultEnabled;
        this.realtimeResultLevel = builder.realtimeResultLevel;
        this.realtimeResultMeetingInfoEnabled = builder.realtimeResultMeetingInfoEnabled;
        this.realtimeResultWordsEnabled = builder.realtimeResultWordsEnabled;
        this.tags = builder.tags;
        this.translateActiveResultLevel = builder.translateActiveResultLevel;
        this.translateLanguages = builder.translateLanguages;
        this.translateResultEnabled = builder.translateResultEnabled;
        this.translateResultLevel = builder.translateResultLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMeetingTransRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return abilityParams
     */
    public java.util.Map < String, ? > getAbilityParams() {
        return this.abilityParams;
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return asrParams
     */
    public java.util.Map < String, ? > getAsrParams() {
        return this.asrParams;
    }

    /**
     * @return audioBitRate
     */
    public Integer getAudioBitRate() {
        return this.audioBitRate;
    }

    /**
     * @return audioFormat
     */
    public String getAudioFormat() {
        return this.audioFormat;
    }

    /**
     * @return audioLanguage
     */
    public String getAudioLanguage() {
        return this.audioLanguage;
    }

    /**
     * @return audioOutputEnabled
     */
    public Boolean getAudioOutputEnabled() {
        return this.audioOutputEnabled;
    }

    /**
     * @return audioOutputOssBucket
     */
    public String getAudioOutputOssBucket() {
        return this.audioOutputOssBucket;
    }

    /**
     * @return audioOutputOssPath
     */
    public String getAudioOutputOssPath() {
        return this.audioOutputOssPath;
    }

    /**
     * @return audioPackage
     */
    public String getAudioPackage() {
        return this.audioPackage;
    }

    /**
     * @return audioSampleRate
     */
    public Integer getAudioSampleRate() {
        return this.audioSampleRate;
    }

    /**
     * @return audioSegmentsEnabled
     */
    public Boolean getAudioSegmentsEnabled() {
        return this.audioSegmentsEnabled;
    }

    /**
     * @return docResultEnabled
     */
    public Boolean getDocResultEnabled() {
        return this.docResultEnabled;
    }

    /**
     * @return labParams
     */
    public java.util.Map < String, ? > getLabParams() {
        return this.labParams;
    }

    /**
     * @return meetingKey
     */
    public String getMeetingKey() {
        return this.meetingKey;
    }

    /**
     * @return meetingResultEnabled
     */
    public Boolean getMeetingResultEnabled() {
        return this.meetingResultEnabled;
    }

    /**
     * @return meetingResultOssBucket
     */
    public String getMeetingResultOssBucket() {
        return this.meetingResultOssBucket;
    }

    /**
     * @return meetingResultOssPath
     */
    public String getMeetingResultOssPath() {
        return this.meetingResultOssPath;
    }

    /**
     * @return realtimeActiveResultLevel
     */
    public Integer getRealtimeActiveResultLevel() {
        return this.realtimeActiveResultLevel;
    }

    /**
     * @return realtimeResultEnabled
     */
    public Boolean getRealtimeResultEnabled() {
        return this.realtimeResultEnabled;
    }

    /**
     * @return realtimeResultLevel
     */
    public Integer getRealtimeResultLevel() {
        return this.realtimeResultLevel;
    }

    /**
     * @return realtimeResultMeetingInfoEnabled
     */
    public Boolean getRealtimeResultMeetingInfoEnabled() {
        return this.realtimeResultMeetingInfoEnabled;
    }

    /**
     * @return realtimeResultWordsEnabled
     */
    public Boolean getRealtimeResultWordsEnabled() {
        return this.realtimeResultWordsEnabled;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    /**
     * @return translateActiveResultLevel
     */
    public Integer getTranslateActiveResultLevel() {
        return this.translateActiveResultLevel;
    }

    /**
     * @return translateLanguages
     */
    public String getTranslateLanguages() {
        return this.translateLanguages;
    }

    /**
     * @return translateResultEnabled
     */
    public Boolean getTranslateResultEnabled() {
        return this.translateResultEnabled;
    }

    /**
     * @return translateResultLevel
     */
    public Integer getTranslateResultLevel() {
        return this.translateResultLevel;
    }

    public static final class Builder extends Request.Builder<CreateMeetingTransRequest, Builder> {
        private java.util.Map < String, ? > abilityParams; 
        private String appKey; 
        private java.util.Map < String, ? > asrParams; 
        private Integer audioBitRate; 
        private String audioFormat; 
        private String audioLanguage; 
        private Boolean audioOutputEnabled; 
        private String audioOutputOssBucket; 
        private String audioOutputOssPath; 
        private String audioPackage; 
        private Integer audioSampleRate; 
        private Boolean audioSegmentsEnabled; 
        private Boolean docResultEnabled; 
        private java.util.Map < String, ? > labParams; 
        private String meetingKey; 
        private Boolean meetingResultEnabled; 
        private String meetingResultOssBucket; 
        private String meetingResultOssPath; 
        private Integer realtimeActiveResultLevel; 
        private Boolean realtimeResultEnabled; 
        private Integer realtimeResultLevel; 
        private Boolean realtimeResultMeetingInfoEnabled; 
        private Boolean realtimeResultWordsEnabled; 
        private java.util.Map < String, ? > tags; 
        private Integer translateActiveResultLevel; 
        private String translateLanguages; 
        private Boolean translateResultEnabled; 
        private Integer translateResultLevel; 

        private Builder() {
            super();
        } 

        private Builder(CreateMeetingTransRequest request) {
            super(request);
            this.abilityParams = request.abilityParams;
            this.appKey = request.appKey;
            this.asrParams = request.asrParams;
            this.audioBitRate = request.audioBitRate;
            this.audioFormat = request.audioFormat;
            this.audioLanguage = request.audioLanguage;
            this.audioOutputEnabled = request.audioOutputEnabled;
            this.audioOutputOssBucket = request.audioOutputOssBucket;
            this.audioOutputOssPath = request.audioOutputOssPath;
            this.audioPackage = request.audioPackage;
            this.audioSampleRate = request.audioSampleRate;
            this.audioSegmentsEnabled = request.audioSegmentsEnabled;
            this.docResultEnabled = request.docResultEnabled;
            this.labParams = request.labParams;
            this.meetingKey = request.meetingKey;
            this.meetingResultEnabled = request.meetingResultEnabled;
            this.meetingResultOssBucket = request.meetingResultOssBucket;
            this.meetingResultOssPath = request.meetingResultOssPath;
            this.realtimeActiveResultLevel = request.realtimeActiveResultLevel;
            this.realtimeResultEnabled = request.realtimeResultEnabled;
            this.realtimeResultLevel = request.realtimeResultLevel;
            this.realtimeResultMeetingInfoEnabled = request.realtimeResultMeetingInfoEnabled;
            this.realtimeResultWordsEnabled = request.realtimeResultWordsEnabled;
            this.tags = request.tags;
            this.translateActiveResultLevel = request.translateActiveResultLevel;
            this.translateLanguages = request.translateLanguages;
            this.translateResultEnabled = request.translateResultEnabled;
            this.translateResultLevel = request.translateResultLevel;
        } 

        /**
         * AbilityParams.
         */
        public Builder abilityParams(java.util.Map < String, ? > abilityParams) {
            this.putBodyParameter("AbilityParams", abilityParams);
            this.abilityParams = abilityParams;
            return this;
        }

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * AsrParams.
         */
        public Builder asrParams(java.util.Map < String, ? > asrParams) {
            this.putBodyParameter("AsrParams", asrParams);
            this.asrParams = asrParams;
            return this;
        }

        /**
         * AudioBitRate.
         */
        public Builder audioBitRate(Integer audioBitRate) {
            this.putBodyParameter("AudioBitRate", audioBitRate);
            this.audioBitRate = audioBitRate;
            return this;
        }

        /**
         * AudioFormat.
         */
        public Builder audioFormat(String audioFormat) {
            this.putBodyParameter("AudioFormat", audioFormat);
            this.audioFormat = audioFormat;
            return this;
        }

        /**
         * AudioLanguage.
         */
        public Builder audioLanguage(String audioLanguage) {
            this.putBodyParameter("AudioLanguage", audioLanguage);
            this.audioLanguage = audioLanguage;
            return this;
        }

        /**
         * AudioOutputEnabled.
         */
        public Builder audioOutputEnabled(Boolean audioOutputEnabled) {
            this.putBodyParameter("AudioOutputEnabled", audioOutputEnabled);
            this.audioOutputEnabled = audioOutputEnabled;
            return this;
        }

        /**
         * AudioOutputOssBucket.
         */
        public Builder audioOutputOssBucket(String audioOutputOssBucket) {
            this.putBodyParameter("AudioOutputOssBucket", audioOutputOssBucket);
            this.audioOutputOssBucket = audioOutputOssBucket;
            return this;
        }

        /**
         * AudioOutputOssPath.
         */
        public Builder audioOutputOssPath(String audioOutputOssPath) {
            this.putBodyParameter("AudioOutputOssPath", audioOutputOssPath);
            this.audioOutputOssPath = audioOutputOssPath;
            return this;
        }

        /**
         * AudioPackage.
         */
        public Builder audioPackage(String audioPackage) {
            this.putBodyParameter("AudioPackage", audioPackage);
            this.audioPackage = audioPackage;
            return this;
        }

        /**
         * AudioSampleRate.
         */
        public Builder audioSampleRate(Integer audioSampleRate) {
            this.putBodyParameter("AudioSampleRate", audioSampleRate);
            this.audioSampleRate = audioSampleRate;
            return this;
        }

        /**
         * AudioSegmentsEnabled.
         */
        public Builder audioSegmentsEnabled(Boolean audioSegmentsEnabled) {
            this.putBodyParameter("AudioSegmentsEnabled", audioSegmentsEnabled);
            this.audioSegmentsEnabled = audioSegmentsEnabled;
            return this;
        }

        /**
         * DocResultEnabled.
         */
        public Builder docResultEnabled(Boolean docResultEnabled) {
            this.putBodyParameter("DocResultEnabled", docResultEnabled);
            this.docResultEnabled = docResultEnabled;
            return this;
        }

        /**
         * LabParams.
         */
        public Builder labParams(java.util.Map < String, ? > labParams) {
            this.putBodyParameter("LabParams", labParams);
            this.labParams = labParams;
            return this;
        }

        /**
         * MeetingKey.
         */
        public Builder meetingKey(String meetingKey) {
            this.putBodyParameter("MeetingKey", meetingKey);
            this.meetingKey = meetingKey;
            return this;
        }

        /**
         * MeetingResultEnabled.
         */
        public Builder meetingResultEnabled(Boolean meetingResultEnabled) {
            this.putBodyParameter("MeetingResultEnabled", meetingResultEnabled);
            this.meetingResultEnabled = meetingResultEnabled;
            return this;
        }

        /**
         * MeetingResultOssBucket.
         */
        public Builder meetingResultOssBucket(String meetingResultOssBucket) {
            this.putBodyParameter("MeetingResultOssBucket", meetingResultOssBucket);
            this.meetingResultOssBucket = meetingResultOssBucket;
            return this;
        }

        /**
         * MeetingResultOssPath.
         */
        public Builder meetingResultOssPath(String meetingResultOssPath) {
            this.putBodyParameter("MeetingResultOssPath", meetingResultOssPath);
            this.meetingResultOssPath = meetingResultOssPath;
            return this;
        }

        /**
         * RealtimeActiveResultLevel.
         */
        public Builder realtimeActiveResultLevel(Integer realtimeActiveResultLevel) {
            this.putBodyParameter("RealtimeActiveResultLevel", realtimeActiveResultLevel);
            this.realtimeActiveResultLevel = realtimeActiveResultLevel;
            return this;
        }

        /**
         * RealtimeResultEnabled.
         */
        public Builder realtimeResultEnabled(Boolean realtimeResultEnabled) {
            this.putBodyParameter("RealtimeResultEnabled", realtimeResultEnabled);
            this.realtimeResultEnabled = realtimeResultEnabled;
            return this;
        }

        /**
         * RealtimeResultLevel.
         */
        public Builder realtimeResultLevel(Integer realtimeResultLevel) {
            this.putBodyParameter("RealtimeResultLevel", realtimeResultLevel);
            this.realtimeResultLevel = realtimeResultLevel;
            return this;
        }

        /**
         * RealtimeResultMeetingInfoEnabled.
         */
        public Builder realtimeResultMeetingInfoEnabled(Boolean realtimeResultMeetingInfoEnabled) {
            this.putBodyParameter("RealtimeResultMeetingInfoEnabled", realtimeResultMeetingInfoEnabled);
            this.realtimeResultMeetingInfoEnabled = realtimeResultMeetingInfoEnabled;
            return this;
        }

        /**
         * RealtimeResultWordsEnabled.
         */
        public Builder realtimeResultWordsEnabled(Boolean realtimeResultWordsEnabled) {
            this.putBodyParameter("RealtimeResultWordsEnabled", realtimeResultWordsEnabled);
            this.realtimeResultWordsEnabled = realtimeResultWordsEnabled;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * TranslateActiveResultLevel.
         */
        public Builder translateActiveResultLevel(Integer translateActiveResultLevel) {
            this.putBodyParameter("TranslateActiveResultLevel", translateActiveResultLevel);
            this.translateActiveResultLevel = translateActiveResultLevel;
            return this;
        }

        /**
         * TranslateLanguages.
         */
        public Builder translateLanguages(String translateLanguages) {
            this.putBodyParameter("TranslateLanguages", translateLanguages);
            this.translateLanguages = translateLanguages;
            return this;
        }

        /**
         * TranslateResultEnabled.
         */
        public Builder translateResultEnabled(Boolean translateResultEnabled) {
            this.putBodyParameter("TranslateResultEnabled", translateResultEnabled);
            this.translateResultEnabled = translateResultEnabled;
            return this;
        }

        /**
         * TranslateResultLevel.
         */
        public Builder translateResultLevel(Integer translateResultLevel) {
            this.putBodyParameter("TranslateResultLevel", translateResultLevel);
            this.translateResultLevel = translateResultLevel;
            return this;
        }

        @Override
        public CreateMeetingTransRequest build() {
            return new CreateMeetingTransRequest(this);
        } 

    } 

}
