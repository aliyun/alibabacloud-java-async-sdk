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
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

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
        this.appKey = builder.appKey;
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
        this.meetingKey = builder.meetingKey;
        this.meetingResultEnabled = builder.meetingResultEnabled;
        this.meetingResultOssBucket = builder.meetingResultOssBucket;
        this.meetingResultOssPath = builder.meetingResultOssPath;
        this.realtimeActiveResultLevel = builder.realtimeActiveResultLevel;
        this.realtimeResultEnabled = builder.realtimeResultEnabled;
        this.realtimeResultLevel = builder.realtimeResultLevel;
        this.realtimeResultMeetingInfoEnabled = builder.realtimeResultMeetingInfoEnabled;
        this.realtimeResultWordsEnabled = builder.realtimeResultWordsEnabled;
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
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
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
        private String appKey; 
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
        private String meetingKey; 
        private Boolean meetingResultEnabled; 
        private String meetingResultOssBucket; 
        private String meetingResultOssPath; 
        private Integer realtimeActiveResultLevel; 
        private Boolean realtimeResultEnabled; 
        private Integer realtimeResultLevel; 
        private Boolean realtimeResultMeetingInfoEnabled; 
        private Boolean realtimeResultWordsEnabled; 
        private Integer translateActiveResultLevel; 
        private String translateLanguages; 
        private Boolean translateResultEnabled; 
        private Integer translateResultLevel; 

        private Builder() {
            super();
        } 

        private Builder(CreateMeetingTransRequest request) {
            super(request);
            this.appKey = request.appKey;
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
            this.meetingKey = request.meetingKey;
            this.meetingResultEnabled = request.meetingResultEnabled;
            this.meetingResultOssBucket = request.meetingResultOssBucket;
            this.meetingResultOssPath = request.meetingResultOssPath;
            this.realtimeActiveResultLevel = request.realtimeActiveResultLevel;
            this.realtimeResultEnabled = request.realtimeResultEnabled;
            this.realtimeResultLevel = request.realtimeResultLevel;
            this.realtimeResultMeetingInfoEnabled = request.realtimeResultMeetingInfoEnabled;
            this.realtimeResultWordsEnabled = request.realtimeResultWordsEnabled;
            this.translateActiveResultLevel = request.translateActiveResultLevel;
            this.translateLanguages = request.translateLanguages;
            this.translateResultEnabled = request.translateResultEnabled;
            this.translateResultLevel = request.translateResultLevel;
        } 

        /**
         * 管控台创建的项目AppKey。
         */
        public Builder appKey(String appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * 会议上传音频采样位数，当前支持：16。
         */
        public Builder audioBitRate(Integer audioBitRate) {
            this.putBodyParameter("AudioBitRate", audioBitRate);
            this.audioBitRate = audioBitRate;
            return this;
        }

        /**
         * 音频编码格式，PCM（无压缩的PCM文件或WAV文件）或OPUS（压缩的OPUS文件）。
         */
        public Builder audioFormat(String audioFormat) {
            this.putBodyParameter("AudioFormat", audioFormat);
            this.audioFormat = audioFormat;
            return this;
        }

        /**
         * 音频转写使用的语言模型。
         * <p>
         * cn：中文。
         * en：英文。
         * yue：粤语。
         * fspk：中英文自由说。
         * multi：动态语言切换。
         */
        public Builder audioLanguage(String audioLanguage) {
            this.putBodyParameter("AudioLanguage", audioLanguage);
            this.audioLanguage = audioLanguage;
            return this;
        }

        /**
         * 是否开启mp3格式音频同步转码，默认是false。
         */
        public Builder audioOutputEnabled(Boolean audioOutputEnabled) {
            this.putBodyParameter("AudioOutputEnabled", audioOutputEnabled);
            this.audioOutputEnabled = audioOutputEnabled;
            return this;
        }

        /**
         * 开启音频同步转码时，转码音频写入到的OSS Bucket，需要与管控台项目配置的OSS Bucket一致。
         */
        public Builder audioOutputOssBucket(String audioOutputOssBucket) {
            this.putBodyParameter("AudioOutputOssBucket", audioOutputOssBucket);
            this.audioOutputOssBucket = audioOutputOssBucket;
            return this;
        }

        /**
         * 开启音频同步转码时，转码音频写入到的OSS文件路径，需要以"tingwu/"为前缀。
         */
        public Builder audioOutputOssPath(String audioOutputOssPath) {
            this.putBodyParameter("AudioOutputOssPath", audioOutputOssPath);
            this.audioOutputOssPath = audioOutputOssPath;
            return this;
        }

        /**
         * 音频打包方式，基于听悟约定的Protobuf格式封装多路音频流时设置为multi。
         */
        public Builder audioPackage(String audioPackage) {
            this.putBodyParameter("AudioPackage", audioPackage);
            this.audioPackage = audioPackage;
            return this;
        }

        /**
         * 音频采样率，当前支持：16000。
         */
        public Builder audioSampleRate(Integer audioSampleRate) {
            this.putBodyParameter("AudioSampleRate", audioSampleRate);
            this.audioSampleRate = audioSampleRate;
            return this;
        }

        /**
         * 开启会后智能提取时，是否开启有效音频片断检测结果写入，默认是false。
         */
        public Builder audioSegmentsEnabled(Boolean audioSegmentsEnabled) {
            this.putBodyParameter("AudioSegmentsEnabled", audioSegmentsEnabled);
            this.audioSegmentsEnabled = audioSegmentsEnabled;
            return this;
        }

        /**
         * 开启会后智能提取时，是否会中识别结果写入，默认是false。
         */
        public Builder docResultEnabled(Boolean docResultEnabled) {
            this.putBodyParameter("DocResultEnabled", docResultEnabled);
            this.docResultEnabled = docResultEnabled;
            return this;
        }

        /**
         * 用户设置的会议标识，在会中查询或会后结束回调时会原样返回。
         */
        public Builder meetingKey(String meetingKey) {
            this.putBodyParameter("MeetingKey", meetingKey);
            this.meetingKey = meetingKey;
            return this;
        }

        /**
         * 是否开启会后智能提取，默认是false。
         */
        public Builder meetingResultEnabled(Boolean meetingResultEnabled) {
            this.putBodyParameter("MeetingResultEnabled", meetingResultEnabled);
            this.meetingResultEnabled = meetingResultEnabled;
            return this;
        }

        /**
         * 开启会后智能提取时，提取结果写入到的OSS Bucket，需要与管控台项目配置的OSS Bucket一致。
         */
        public Builder meetingResultOssBucket(String meetingResultOssBucket) {
            this.putBodyParameter("MeetingResultOssBucket", meetingResultOssBucket);
            this.meetingResultOssBucket = meetingResultOssBucket;
            return this;
        }

        /**
         * 开启会后智能提取时，提取结果写入到的OSS文件路径，需要以"tingwu/"为前缀。
         */
        public Builder meetingResultOssPath(String meetingResultOssPath) {
            this.putBodyParameter("MeetingResultOssPath", meetingResultOssPath);
            this.meetingResultOssPath = meetingResultOssPath;
            return this;
        }

        /**
         * 开启会中实时结果返回且音频打包方式为multi时，设置发言人识别结果返回等级，默认是1。
         * <p>
         * 0：不返回识别结果。
         * 1：识别出完整句子时返回识别结果。
         * 2：识别出中间结果及完整句子时返回识别结果。
         */
        public Builder realtimeActiveResultLevel(Integer realtimeActiveResultLevel) {
            this.putBodyParameter("RealtimeActiveResultLevel", realtimeActiveResultLevel);
            this.realtimeActiveResultLevel = realtimeActiveResultLevel;
            return this;
        }

        /**
         * 是否开启会中实时结果返回，默认是true。
         */
        public Builder realtimeResultEnabled(Boolean realtimeResultEnabled) {
            this.putBodyParameter("RealtimeResultEnabled", realtimeResultEnabled);
            this.realtimeResultEnabled = realtimeResultEnabled;
            return this;
        }

        /**
         * 开启会中实时结果返回时，设置识别结果返回等级，默认是1。
         * <p>
         * 0：不返回识别结果。
         * 1：识别出完整句子时返回识别结果。
         * 2：识别出中间结果及完整句子时返回识别结果。
         */
        public Builder realtimeResultLevel(Integer realtimeResultLevel) {
            this.putBodyParameter("RealtimeResultLevel", realtimeResultLevel);
            this.realtimeResultLevel = realtimeResultLevel;
            return this;
        }

        /**
         * 会中识别消息结果header中是否包含MeetingKey、MeetingId，默认是false。
         */
        public Builder realtimeResultMeetingInfoEnabled(Boolean realtimeResultMeetingInfoEnabled) {
            this.putBodyParameter("RealtimeResultMeetingInfoEnabled", realtimeResultMeetingInfoEnabled);
            this.realtimeResultMeetingInfoEnabled = realtimeResultMeetingInfoEnabled;
            return this;
        }

        /**
         * 会中识别消息是否包含words信息，默认是true。
         */
        public Builder realtimeResultWordsEnabled(Boolean realtimeResultWordsEnabled) {
            this.putBodyParameter("RealtimeResultWordsEnabled", realtimeResultWordsEnabled);
            this.realtimeResultWordsEnabled = realtimeResultWordsEnabled;
            return this;
        }

        /**
         * 多通道Active流识别结果翻译等级。0：不返回翻译结果。 1：识别出完整句子时返回翻译结果。 2：识别出中间结果及完整句子时返回翻译结果。默认是1。
         */
        public Builder translateActiveResultLevel(Integer translateActiveResultLevel) {
            this.putBodyParameter("TranslateActiveResultLevel", translateActiveResultLevel);
            this.translateActiveResultLevel = translateActiveResultLevel;
            return this;
        }

        /**
         * 翻译目标语言集合，多个语言间用英文逗号","分隔，当前支持cn、en。
         */
        public Builder translateLanguages(String translateLanguages) {
            this.putBodyParameter("TranslateLanguages", translateLanguages);
            this.translateLanguages = translateLanguages;
            return this;
        }

        /**
         * 是否开启会中翻译，默认是false。
         */
        public Builder translateResultEnabled(Boolean translateResultEnabled) {
            this.putBodyParameter("TranslateResultEnabled", translateResultEnabled);
            this.translateResultEnabled = translateResultEnabled;
            return this;
        }

        /**
         * 单通道识别或多通道mix流识别结果翻译等级。0：不返回翻译结果。 1：识别出完整句子时返回翻译结果。 2：识别出中间结果及完整句子时返回翻译结果。默认是1。
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
