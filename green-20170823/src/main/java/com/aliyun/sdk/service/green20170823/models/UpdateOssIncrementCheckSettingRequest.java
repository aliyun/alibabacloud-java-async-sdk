// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOssIncrementCheckSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateOssIncrementCheckSettingRequest</p>
 */
public class UpdateOssIncrementCheckSettingRequest extends Request {
    @Query
    @NameInMap("AudioAntispamFreezeConfig")
    private String audioAntispamFreezeConfig;

    @Query
    @NameInMap("AudioAutoFreezeOpened")
    private Boolean audioAutoFreezeOpened;

    @Query
    @NameInMap("AudioMaxSize")
    private Integer audioMaxSize;

    @Query
    @NameInMap("AudioScanLimit")
    private Long audioScanLimit;

    @Query
    @NameInMap("AudioSceneList")
    private String audioSceneList;

    @Query
    @NameInMap("AutoFreezeType")
    private String autoFreezeType;

    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("BucketConfigList")
    private String bucketConfigList;

    @Query
    @NameInMap("CallbackId")
    private String callbackId;

    @Query
    @NameInMap("ImageAdFreezeConfig")
    private String imageAdFreezeConfig;

    @Query
    @NameInMap("ImageAutoFreeze")
    private String imageAutoFreeze;

    @Query
    @NameInMap("ImageAutoFreezeOpened")
    private Boolean imageAutoFreezeOpened;

    @Query
    @NameInMap("ImageLiveFreezeConfig")
    private String imageLiveFreezeConfig;

    @Query
    @NameInMap("ImagePornFreezeConfig")
    private String imagePornFreezeConfig;

    @Query
    @NameInMap("ImageScanLimit")
    private String imageScanLimit;

    @Query
    @NameInMap("ImageSceneList")
    private String imageSceneList;

    @Query
    @NameInMap("ImageTerrorismFreezeConfig")
    private String imageTerrorismFreezeConfig;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ScanImageNoFileType")
    private Boolean scanImageNoFileType;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("VideoAdFreezeConfig")
    private String videoAdFreezeConfig;

    @Query
    @NameInMap("VideoAutoFreezeOpened")
    private Boolean videoAutoFreezeOpened;

    @Query
    @NameInMap("VideoAutoFreezeSceneList")
    private String videoAutoFreezeSceneList;

    @Query
    @NameInMap("VideoFrameInterval")
    private Integer videoFrameInterval;

    @Query
    @NameInMap("VideoLiveFreezeConfig")
    private String videoLiveFreezeConfig;

    @Query
    @NameInMap("VideoMaxFrames")
    private Integer videoMaxFrames;

    @Query
    @NameInMap("VideoMaxSize")
    private Integer videoMaxSize;

    @Query
    @NameInMap("VideoPornFreezeConfig")
    private String videoPornFreezeConfig;

    @Query
    @NameInMap("VideoScanLimit")
    private Long videoScanLimit;

    @Query
    @NameInMap("VideoSceneList")
    private String videoSceneList;

    @Query
    @NameInMap("VideoTerrorismFreezeConfig")
    private String videoTerrorismFreezeConfig;

    @Query
    @NameInMap("VideoVoiceAntispamFreezeConfig")
    private String videoVoiceAntispamFreezeConfig;

    private UpdateOssIncrementCheckSettingRequest(Builder builder) {
        super(builder);
        this.audioAntispamFreezeConfig = builder.audioAntispamFreezeConfig;
        this.audioAutoFreezeOpened = builder.audioAutoFreezeOpened;
        this.audioMaxSize = builder.audioMaxSize;
        this.audioScanLimit = builder.audioScanLimit;
        this.audioSceneList = builder.audioSceneList;
        this.autoFreezeType = builder.autoFreezeType;
        this.bizType = builder.bizType;
        this.bucketConfigList = builder.bucketConfigList;
        this.callbackId = builder.callbackId;
        this.imageAdFreezeConfig = builder.imageAdFreezeConfig;
        this.imageAutoFreeze = builder.imageAutoFreeze;
        this.imageAutoFreezeOpened = builder.imageAutoFreezeOpened;
        this.imageLiveFreezeConfig = builder.imageLiveFreezeConfig;
        this.imagePornFreezeConfig = builder.imagePornFreezeConfig;
        this.imageScanLimit = builder.imageScanLimit;
        this.imageSceneList = builder.imageSceneList;
        this.imageTerrorismFreezeConfig = builder.imageTerrorismFreezeConfig;
        this.lang = builder.lang;
        this.scanImageNoFileType = builder.scanImageNoFileType;
        this.sourceIp = builder.sourceIp;
        this.videoAdFreezeConfig = builder.videoAdFreezeConfig;
        this.videoAutoFreezeOpened = builder.videoAutoFreezeOpened;
        this.videoAutoFreezeSceneList = builder.videoAutoFreezeSceneList;
        this.videoFrameInterval = builder.videoFrameInterval;
        this.videoLiveFreezeConfig = builder.videoLiveFreezeConfig;
        this.videoMaxFrames = builder.videoMaxFrames;
        this.videoMaxSize = builder.videoMaxSize;
        this.videoPornFreezeConfig = builder.videoPornFreezeConfig;
        this.videoScanLimit = builder.videoScanLimit;
        this.videoSceneList = builder.videoSceneList;
        this.videoTerrorismFreezeConfig = builder.videoTerrorismFreezeConfig;
        this.videoVoiceAntispamFreezeConfig = builder.videoVoiceAntispamFreezeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOssIncrementCheckSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioAntispamFreezeConfig
     */
    public String getAudioAntispamFreezeConfig() {
        return this.audioAntispamFreezeConfig;
    }

    /**
     * @return audioAutoFreezeOpened
     */
    public Boolean getAudioAutoFreezeOpened() {
        return this.audioAutoFreezeOpened;
    }

    /**
     * @return audioMaxSize
     */
    public Integer getAudioMaxSize() {
        return this.audioMaxSize;
    }

    /**
     * @return audioScanLimit
     */
    public Long getAudioScanLimit() {
        return this.audioScanLimit;
    }

    /**
     * @return audioSceneList
     */
    public String getAudioSceneList() {
        return this.audioSceneList;
    }

    /**
     * @return autoFreezeType
     */
    public String getAutoFreezeType() {
        return this.autoFreezeType;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return bucketConfigList
     */
    public String getBucketConfigList() {
        return this.bucketConfigList;
    }

    /**
     * @return callbackId
     */
    public String getCallbackId() {
        return this.callbackId;
    }

    /**
     * @return imageAdFreezeConfig
     */
    public String getImageAdFreezeConfig() {
        return this.imageAdFreezeConfig;
    }

    /**
     * @return imageAutoFreeze
     */
    public String getImageAutoFreeze() {
        return this.imageAutoFreeze;
    }

    /**
     * @return imageAutoFreezeOpened
     */
    public Boolean getImageAutoFreezeOpened() {
        return this.imageAutoFreezeOpened;
    }

    /**
     * @return imageLiveFreezeConfig
     */
    public String getImageLiveFreezeConfig() {
        return this.imageLiveFreezeConfig;
    }

    /**
     * @return imagePornFreezeConfig
     */
    public String getImagePornFreezeConfig() {
        return this.imagePornFreezeConfig;
    }

    /**
     * @return imageScanLimit
     */
    public String getImageScanLimit() {
        return this.imageScanLimit;
    }

    /**
     * @return imageSceneList
     */
    public String getImageSceneList() {
        return this.imageSceneList;
    }

    /**
     * @return imageTerrorismFreezeConfig
     */
    public String getImageTerrorismFreezeConfig() {
        return this.imageTerrorismFreezeConfig;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return scanImageNoFileType
     */
    public Boolean getScanImageNoFileType() {
        return this.scanImageNoFileType;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return videoAdFreezeConfig
     */
    public String getVideoAdFreezeConfig() {
        return this.videoAdFreezeConfig;
    }

    /**
     * @return videoAutoFreezeOpened
     */
    public Boolean getVideoAutoFreezeOpened() {
        return this.videoAutoFreezeOpened;
    }

    /**
     * @return videoAutoFreezeSceneList
     */
    public String getVideoAutoFreezeSceneList() {
        return this.videoAutoFreezeSceneList;
    }

    /**
     * @return videoFrameInterval
     */
    public Integer getVideoFrameInterval() {
        return this.videoFrameInterval;
    }

    /**
     * @return videoLiveFreezeConfig
     */
    public String getVideoLiveFreezeConfig() {
        return this.videoLiveFreezeConfig;
    }

    /**
     * @return videoMaxFrames
     */
    public Integer getVideoMaxFrames() {
        return this.videoMaxFrames;
    }

    /**
     * @return videoMaxSize
     */
    public Integer getVideoMaxSize() {
        return this.videoMaxSize;
    }

    /**
     * @return videoPornFreezeConfig
     */
    public String getVideoPornFreezeConfig() {
        return this.videoPornFreezeConfig;
    }

    /**
     * @return videoScanLimit
     */
    public Long getVideoScanLimit() {
        return this.videoScanLimit;
    }

    /**
     * @return videoSceneList
     */
    public String getVideoSceneList() {
        return this.videoSceneList;
    }

    /**
     * @return videoTerrorismFreezeConfig
     */
    public String getVideoTerrorismFreezeConfig() {
        return this.videoTerrorismFreezeConfig;
    }

    /**
     * @return videoVoiceAntispamFreezeConfig
     */
    public String getVideoVoiceAntispamFreezeConfig() {
        return this.videoVoiceAntispamFreezeConfig;
    }

    public static final class Builder extends Request.Builder<UpdateOssIncrementCheckSettingRequest, Builder> {
        private String audioAntispamFreezeConfig; 
        private Boolean audioAutoFreezeOpened; 
        private Integer audioMaxSize; 
        private Long audioScanLimit; 
        private String audioSceneList; 
        private String autoFreezeType; 
        private String bizType; 
        private String bucketConfigList; 
        private String callbackId; 
        private String imageAdFreezeConfig; 
        private String imageAutoFreeze; 
        private Boolean imageAutoFreezeOpened; 
        private String imageLiveFreezeConfig; 
        private String imagePornFreezeConfig; 
        private String imageScanLimit; 
        private String imageSceneList; 
        private String imageTerrorismFreezeConfig; 
        private String lang; 
        private Boolean scanImageNoFileType; 
        private String sourceIp; 
        private String videoAdFreezeConfig; 
        private Boolean videoAutoFreezeOpened; 
        private String videoAutoFreezeSceneList; 
        private Integer videoFrameInterval; 
        private String videoLiveFreezeConfig; 
        private Integer videoMaxFrames; 
        private Integer videoMaxSize; 
        private String videoPornFreezeConfig; 
        private Long videoScanLimit; 
        private String videoSceneList; 
        private String videoTerrorismFreezeConfig; 
        private String videoVoiceAntispamFreezeConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOssIncrementCheckSettingRequest request) {
            super(request);
            this.audioAntispamFreezeConfig = request.audioAntispamFreezeConfig;
            this.audioAutoFreezeOpened = request.audioAutoFreezeOpened;
            this.audioMaxSize = request.audioMaxSize;
            this.audioScanLimit = request.audioScanLimit;
            this.audioSceneList = request.audioSceneList;
            this.autoFreezeType = request.autoFreezeType;
            this.bizType = request.bizType;
            this.bucketConfigList = request.bucketConfigList;
            this.callbackId = request.callbackId;
            this.imageAdFreezeConfig = request.imageAdFreezeConfig;
            this.imageAutoFreeze = request.imageAutoFreeze;
            this.imageAutoFreezeOpened = request.imageAutoFreezeOpened;
            this.imageLiveFreezeConfig = request.imageLiveFreezeConfig;
            this.imagePornFreezeConfig = request.imagePornFreezeConfig;
            this.imageScanLimit = request.imageScanLimit;
            this.imageSceneList = request.imageSceneList;
            this.imageTerrorismFreezeConfig = request.imageTerrorismFreezeConfig;
            this.lang = request.lang;
            this.scanImageNoFileType = request.scanImageNoFileType;
            this.sourceIp = request.sourceIp;
            this.videoAdFreezeConfig = request.videoAdFreezeConfig;
            this.videoAutoFreezeOpened = request.videoAutoFreezeOpened;
            this.videoAutoFreezeSceneList = request.videoAutoFreezeSceneList;
            this.videoFrameInterval = request.videoFrameInterval;
            this.videoLiveFreezeConfig = request.videoLiveFreezeConfig;
            this.videoMaxFrames = request.videoMaxFrames;
            this.videoMaxSize = request.videoMaxSize;
            this.videoPornFreezeConfig = request.videoPornFreezeConfig;
            this.videoScanLimit = request.videoScanLimit;
            this.videoSceneList = request.videoSceneList;
            this.videoTerrorismFreezeConfig = request.videoTerrorismFreezeConfig;
            this.videoVoiceAntispamFreezeConfig = request.videoVoiceAntispamFreezeConfig;
        } 

        /**
         * AudioAntispamFreezeConfig.
         */
        public Builder audioAntispamFreezeConfig(String audioAntispamFreezeConfig) {
            this.putQueryParameter("AudioAntispamFreezeConfig", audioAntispamFreezeConfig);
            this.audioAntispamFreezeConfig = audioAntispamFreezeConfig;
            return this;
        }

        /**
         * AudioAutoFreezeOpened.
         */
        public Builder audioAutoFreezeOpened(Boolean audioAutoFreezeOpened) {
            this.putQueryParameter("AudioAutoFreezeOpened", audioAutoFreezeOpened);
            this.audioAutoFreezeOpened = audioAutoFreezeOpened;
            return this;
        }

        /**
         * AudioMaxSize.
         */
        public Builder audioMaxSize(Integer audioMaxSize) {
            this.putQueryParameter("AudioMaxSize", audioMaxSize);
            this.audioMaxSize = audioMaxSize;
            return this;
        }

        /**
         * AudioScanLimit.
         */
        public Builder audioScanLimit(Long audioScanLimit) {
            this.putQueryParameter("AudioScanLimit", audioScanLimit);
            this.audioScanLimit = audioScanLimit;
            return this;
        }

        /**
         * AudioSceneList.
         */
        public Builder audioSceneList(String audioSceneList) {
            this.putQueryParameter("AudioSceneList", audioSceneList);
            this.audioSceneList = audioSceneList;
            return this;
        }

        /**
         * AutoFreezeType.
         */
        public Builder autoFreezeType(String autoFreezeType) {
            this.putQueryParameter("AutoFreezeType", autoFreezeType);
            this.autoFreezeType = autoFreezeType;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * BucketConfigList.
         */
        public Builder bucketConfigList(String bucketConfigList) {
            this.putQueryParameter("BucketConfigList", bucketConfigList);
            this.bucketConfigList = bucketConfigList;
            return this;
        }

        /**
         * CallbackId.
         */
        public Builder callbackId(String callbackId) {
            this.putQueryParameter("CallbackId", callbackId);
            this.callbackId = callbackId;
            return this;
        }

        /**
         * ImageAdFreezeConfig.
         */
        public Builder imageAdFreezeConfig(String imageAdFreezeConfig) {
            this.putQueryParameter("ImageAdFreezeConfig", imageAdFreezeConfig);
            this.imageAdFreezeConfig = imageAdFreezeConfig;
            return this;
        }

        /**
         * ImageAutoFreeze.
         */
        public Builder imageAutoFreeze(String imageAutoFreeze) {
            this.putQueryParameter("ImageAutoFreeze", imageAutoFreeze);
            this.imageAutoFreeze = imageAutoFreeze;
            return this;
        }

        /**
         * ImageAutoFreezeOpened.
         */
        public Builder imageAutoFreezeOpened(Boolean imageAutoFreezeOpened) {
            this.putQueryParameter("ImageAutoFreezeOpened", imageAutoFreezeOpened);
            this.imageAutoFreezeOpened = imageAutoFreezeOpened;
            return this;
        }

        /**
         * ImageLiveFreezeConfig.
         */
        public Builder imageLiveFreezeConfig(String imageLiveFreezeConfig) {
            this.putQueryParameter("ImageLiveFreezeConfig", imageLiveFreezeConfig);
            this.imageLiveFreezeConfig = imageLiveFreezeConfig;
            return this;
        }

        /**
         * ImagePornFreezeConfig.
         */
        public Builder imagePornFreezeConfig(String imagePornFreezeConfig) {
            this.putQueryParameter("ImagePornFreezeConfig", imagePornFreezeConfig);
            this.imagePornFreezeConfig = imagePornFreezeConfig;
            return this;
        }

        /**
         * ImageScanLimit.
         */
        public Builder imageScanLimit(String imageScanLimit) {
            this.putQueryParameter("ImageScanLimit", imageScanLimit);
            this.imageScanLimit = imageScanLimit;
            return this;
        }

        /**
         * ImageSceneList.
         */
        public Builder imageSceneList(String imageSceneList) {
            this.putQueryParameter("ImageSceneList", imageSceneList);
            this.imageSceneList = imageSceneList;
            return this;
        }

        /**
         * ImageTerrorismFreezeConfig.
         */
        public Builder imageTerrorismFreezeConfig(String imageTerrorismFreezeConfig) {
            this.putQueryParameter("ImageTerrorismFreezeConfig", imageTerrorismFreezeConfig);
            this.imageTerrorismFreezeConfig = imageTerrorismFreezeConfig;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ScanImageNoFileType.
         */
        public Builder scanImageNoFileType(Boolean scanImageNoFileType) {
            this.putQueryParameter("ScanImageNoFileType", scanImageNoFileType);
            this.scanImageNoFileType = scanImageNoFileType;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * VideoAdFreezeConfig.
         */
        public Builder videoAdFreezeConfig(String videoAdFreezeConfig) {
            this.putQueryParameter("VideoAdFreezeConfig", videoAdFreezeConfig);
            this.videoAdFreezeConfig = videoAdFreezeConfig;
            return this;
        }

        /**
         * VideoAutoFreezeOpened.
         */
        public Builder videoAutoFreezeOpened(Boolean videoAutoFreezeOpened) {
            this.putQueryParameter("VideoAutoFreezeOpened", videoAutoFreezeOpened);
            this.videoAutoFreezeOpened = videoAutoFreezeOpened;
            return this;
        }

        /**
         * VideoAutoFreezeSceneList.
         */
        public Builder videoAutoFreezeSceneList(String videoAutoFreezeSceneList) {
            this.putQueryParameter("VideoAutoFreezeSceneList", videoAutoFreezeSceneList);
            this.videoAutoFreezeSceneList = videoAutoFreezeSceneList;
            return this;
        }

        /**
         * VideoFrameInterval.
         */
        public Builder videoFrameInterval(Integer videoFrameInterval) {
            this.putQueryParameter("VideoFrameInterval", videoFrameInterval);
            this.videoFrameInterval = videoFrameInterval;
            return this;
        }

        /**
         * VideoLiveFreezeConfig.
         */
        public Builder videoLiveFreezeConfig(String videoLiveFreezeConfig) {
            this.putQueryParameter("VideoLiveFreezeConfig", videoLiveFreezeConfig);
            this.videoLiveFreezeConfig = videoLiveFreezeConfig;
            return this;
        }

        /**
         * VideoMaxFrames.
         */
        public Builder videoMaxFrames(Integer videoMaxFrames) {
            this.putQueryParameter("VideoMaxFrames", videoMaxFrames);
            this.videoMaxFrames = videoMaxFrames;
            return this;
        }

        /**
         * VideoMaxSize.
         */
        public Builder videoMaxSize(Integer videoMaxSize) {
            this.putQueryParameter("VideoMaxSize", videoMaxSize);
            this.videoMaxSize = videoMaxSize;
            return this;
        }

        /**
         * VideoPornFreezeConfig.
         */
        public Builder videoPornFreezeConfig(String videoPornFreezeConfig) {
            this.putQueryParameter("VideoPornFreezeConfig", videoPornFreezeConfig);
            this.videoPornFreezeConfig = videoPornFreezeConfig;
            return this;
        }

        /**
         * VideoScanLimit.
         */
        public Builder videoScanLimit(Long videoScanLimit) {
            this.putQueryParameter("VideoScanLimit", videoScanLimit);
            this.videoScanLimit = videoScanLimit;
            return this;
        }

        /**
         * VideoSceneList.
         */
        public Builder videoSceneList(String videoSceneList) {
            this.putQueryParameter("VideoSceneList", videoSceneList);
            this.videoSceneList = videoSceneList;
            return this;
        }

        /**
         * VideoTerrorismFreezeConfig.
         */
        public Builder videoTerrorismFreezeConfig(String videoTerrorismFreezeConfig) {
            this.putQueryParameter("VideoTerrorismFreezeConfig", videoTerrorismFreezeConfig);
            this.videoTerrorismFreezeConfig = videoTerrorismFreezeConfig;
            return this;
        }

        /**
         * VideoVoiceAntispamFreezeConfig.
         */
        public Builder videoVoiceAntispamFreezeConfig(String videoVoiceAntispamFreezeConfig) {
            this.putQueryParameter("VideoVoiceAntispamFreezeConfig", videoVoiceAntispamFreezeConfig);
            this.videoVoiceAntispamFreezeConfig = videoVoiceAntispamFreezeConfig;
            return this;
        }

        @Override
        public UpdateOssIncrementCheckSettingRequest build() {
            return new UpdateOssIncrementCheckSettingRequest(this);
        } 

    } 

}
