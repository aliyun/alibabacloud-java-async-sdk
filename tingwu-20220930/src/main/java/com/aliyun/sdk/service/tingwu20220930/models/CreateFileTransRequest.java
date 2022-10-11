// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20220930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileTransRequest} extends {@link RequestModel}
 *
 * <p>CreateFileTransRequest</p>
 */
public class CreateFileTransRequest extends Request {
    @Body
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Body
    @NameInMap("AudioLanguage")
    @Validation(required = true)
    private String audioLanguage;

    @Body
    @NameInMap("AudioOssBucket")
    @Validation(required = true)
    private String audioOssBucket;

    @Body
    @NameInMap("AudioOssPath")
    @Validation(required = true)
    private String audioOssPath;

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
    @NameInMap("AudioRoleNum")
    private String audioRoleNum;

    @Body
    @NameInMap("AudioSegmentsEnabled")
    private Boolean audioSegmentsEnabled;

    @Body
    @NameInMap("TransKey")
    private String transKey;

    @Body
    @NameInMap("TransResultOssBucket")
    @Validation(required = true)
    private String transResultOssBucket;

    @Body
    @NameInMap("TransResultOssPath")
    @Validation(required = true)
    private String transResultOssPath;

    private CreateFileTransRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.audioLanguage = builder.audioLanguage;
        this.audioOssBucket = builder.audioOssBucket;
        this.audioOssPath = builder.audioOssPath;
        this.audioOutputEnabled = builder.audioOutputEnabled;
        this.audioOutputOssBucket = builder.audioOutputOssBucket;
        this.audioOutputOssPath = builder.audioOutputOssPath;
        this.audioRoleNum = builder.audioRoleNum;
        this.audioSegmentsEnabled = builder.audioSegmentsEnabled;
        this.transKey = builder.transKey;
        this.transResultOssBucket = builder.transResultOssBucket;
        this.transResultOssPath = builder.transResultOssPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileTransRequest create() {
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
     * @return audioLanguage
     */
    public String getAudioLanguage() {
        return this.audioLanguage;
    }

    /**
     * @return audioOssBucket
     */
    public String getAudioOssBucket() {
        return this.audioOssBucket;
    }

    /**
     * @return audioOssPath
     */
    public String getAudioOssPath() {
        return this.audioOssPath;
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
     * @return audioRoleNum
     */
    public String getAudioRoleNum() {
        return this.audioRoleNum;
    }

    /**
     * @return audioSegmentsEnabled
     */
    public Boolean getAudioSegmentsEnabled() {
        return this.audioSegmentsEnabled;
    }

    /**
     * @return transKey
     */
    public String getTransKey() {
        return this.transKey;
    }

    /**
     * @return transResultOssBucket
     */
    public String getTransResultOssBucket() {
        return this.transResultOssBucket;
    }

    /**
     * @return transResultOssPath
     */
    public String getTransResultOssPath() {
        return this.transResultOssPath;
    }

    public static final class Builder extends Request.Builder<CreateFileTransRequest, Builder> {
        private String appKey; 
        private String audioLanguage; 
        private String audioOssBucket; 
        private String audioOssPath; 
        private Boolean audioOutputEnabled; 
        private String audioOutputOssBucket; 
        private String audioOutputOssPath; 
        private String audioRoleNum; 
        private Boolean audioSegmentsEnabled; 
        private String transKey; 
        private String transResultOssBucket; 
        private String transResultOssPath; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileTransRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.audioLanguage = request.audioLanguage;
            this.audioOssBucket = request.audioOssBucket;
            this.audioOssPath = request.audioOssPath;
            this.audioOutputEnabled = request.audioOutputEnabled;
            this.audioOutputOssBucket = request.audioOutputOssBucket;
            this.audioOutputOssPath = request.audioOutputOssPath;
            this.audioRoleNum = request.audioRoleNum;
            this.audioSegmentsEnabled = request.audioSegmentsEnabled;
            this.transKey = request.transKey;
            this.transResultOssBucket = request.transResultOssBucket;
            this.transResultOssPath = request.transResultOssPath;
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
         * 音频转写使用的语言模型。
         * <p>
         * cn：中文。
         * en：英文。
         * yue：粤语。
         */
        public Builder audioLanguage(String audioLanguage) {
            this.putBodyParameter("AudioLanguage", audioLanguage);
            this.audioLanguage = audioLanguage;
            return this;
        }

        /**
         * 需要转写音频所在的OSS Bucket。
         */
        public Builder audioOssBucket(String audioOssBucket) {
            this.putBodyParameter("AudioOssBucket", audioOssBucket);
            this.audioOssBucket = audioOssBucket;
            return this;
        }

        /**
         * 需要转写音频所在的OSS文件路径。
         */
        public Builder audioOssPath(String audioOssPath) {
            this.putBodyParameter("AudioOssPath", audioOssPath);
            this.audioOssPath = audioOssPath;
            return this;
        }

        /**
         * 是否开启mp3格式音频转码，默认是False。
         */
        public Builder audioOutputEnabled(Boolean audioOutputEnabled) {
            this.putBodyParameter("AudioOutputEnabled", audioOutputEnabled);
            this.audioOutputEnabled = audioOutputEnabled;
            return this;
        }

        /**
         * 开启音频转码时，转码音频写入到的OSS Bucket。
         */
        public Builder audioOutputOssBucket(String audioOutputOssBucket) {
            this.putBodyParameter("AudioOutputOssBucket", audioOutputOssBucket);
            this.audioOutputOssBucket = audioOutputOssBucket;
            return this;
        }

        /**
         * 开启音频转码时，转码音频写入到的OSS文件路径。
         */
        public Builder audioOutputOssPath(String audioOutputOssPath) {
            this.putBodyParameter("AudioOutputOssPath", audioOutputOssPath);
            this.audioOutputOssPath = audioOutputOssPath;
            return this;
        }

        /**
         * 是否开启说话人角色区分。
         * <p>
         * 不设置：不使用说话人角色区分。
         * 0：说话人角色区分结果为不定人数。
         * 2：说话人角色区分结果为2人。
         */
        public Builder audioRoleNum(String audioRoleNum) {
            this.putBodyParameter("AudioRoleNum", audioRoleNum);
            this.audioRoleNum = audioRoleNum;
            return this;
        }

        /**
         * 是否开启有效音频片断检测结果写入，默认是False。
         */
        public Builder audioSegmentsEnabled(Boolean audioSegmentsEnabled) {
            this.putBodyParameter("AudioSegmentsEnabled", audioSegmentsEnabled);
            this.audioSegmentsEnabled = audioSegmentsEnabled;
            return this;
        }

        /**
         * 用户设置的任务标识，在任务查询或任务结束回调时会原样返回。
         */
        public Builder transKey(String transKey) {
            this.putBodyParameter("TransKey", transKey);
            this.transKey = transKey;
            return this;
        }

        /**
         * 识别及智能提取结果写入到的OSS Bucket。
         */
        public Builder transResultOssBucket(String transResultOssBucket) {
            this.putBodyParameter("TransResultOssBucket", transResultOssBucket);
            this.transResultOssBucket = transResultOssBucket;
            return this;
        }

        /**
         * 识别及智能提取结果写入到的OSS文件路径。
         * <p>
         * 示例：目录/文件名
         */
        public Builder transResultOssPath(String transResultOssPath) {
            this.putBodyParameter("TransResultOssPath", transResultOssPath);
            this.transResultOssPath = transResultOssPath;
            return this;
        }

        @Override
        public CreateFileTransRequest build() {
            return new CreateFileTransRequest(this);
        } 

    } 

}
