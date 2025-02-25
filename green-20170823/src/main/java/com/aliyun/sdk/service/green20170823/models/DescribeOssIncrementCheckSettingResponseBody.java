// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssIncrementCheckSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssIncrementCheckSettingResponseBody</p>
 */
public class DescribeOssIncrementCheckSettingResponseBody extends TeaModel {
    @NameInMap("AudioAntispamFreezeConfig")
    private AudioAntispamFreezeConfig audioAntispamFreezeConfig;

    @NameInMap("AudioAutoFreezeOpened")
    private Boolean audioAutoFreezeOpened;

    @NameInMap("AudioMaxSize")
    private Integer audioMaxSize;

    @NameInMap("AudioScanLimit")
    private Long audioScanLimit;

    @NameInMap("AudioSceneList")
    private java.util.List < String > audioSceneList;

    @NameInMap("AutoFreezeType")
    private String autoFreezeType;

    @NameInMap("BizType")
    private String bizType;

    @NameInMap("BizTypeTemplate")
    private BizTypeTemplate bizTypeTemplate;

    @NameInMap("BucketConfigList")
    private java.util.List < BucketConfigList> bucketConfigList;

    @NameInMap("CallbackId")
    private String callbackId;

    @NameInMap("CallbackName")
    private String callbackName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("ImageAdFreezeConfig")
    private ImageAdFreezeConfig imageAdFreezeConfig;

    @NameInMap("ImageAutoFreeze")
    private ImageAutoFreeze imageAutoFreeze;

    @NameInMap("ImageAutoFreezeOpened")
    private Boolean imageAutoFreezeOpened;

    @NameInMap("ImageEnableLimit")
    private Boolean imageEnableLimit;

    @NameInMap("ImageLiveFreezeConfig")
    private ImageLiveFreezeConfig imageLiveFreezeConfig;

    @NameInMap("ImagePornFreezeConfig")
    private ImagePornFreezeConfig imagePornFreezeConfig;

    @NameInMap("ImageScanLimit")
    private Long imageScanLimit;

    @NameInMap("ImageSceneList")
    private java.util.List < String > imageSceneList;

    @NameInMap("ImageTerrorismFreezeConfig")
    private ImageTerrorismFreezeConfig imageTerrorismFreezeConfig;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScanImageNoFileType")
    private Boolean scanImageNoFileType;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("VideoAdFreezeConfig")
    private VideoAdFreezeConfig videoAdFreezeConfig;

    @NameInMap("VideoAutoFreezeOpened")
    private Boolean videoAutoFreezeOpened;

    @NameInMap("VideoAutoFreezeSceneList")
    private java.util.List < String > videoAutoFreezeSceneList;

    @NameInMap("VideoFrameInterval")
    private Integer videoFrameInterval;

    @NameInMap("VideoLiveFreezeConfig")
    private VideoLiveFreezeConfig videoLiveFreezeConfig;

    @NameInMap("VideoMaxFrames")
    private Integer videoMaxFrames;

    @NameInMap("VideoMaxSize")
    private Integer videoMaxSize;

    @NameInMap("VideoPornFreezeConfig")
    private VideoPornFreezeConfig videoPornFreezeConfig;

    @NameInMap("VideoScanLimit")
    private Long videoScanLimit;

    @NameInMap("VideoSceneList")
    private java.util.List < String > videoSceneList;

    @NameInMap("VideoTerrorismFreezeConfig")
    private VideoTerrorismFreezeConfig videoTerrorismFreezeConfig;

    @NameInMap("VideoVoiceAntispamFreezeConfig")
    private VideoVoiceAntispamFreezeConfig videoVoiceAntispamFreezeConfig;

    private DescribeOssIncrementCheckSettingResponseBody(Builder builder) {
        this.audioAntispamFreezeConfig = builder.audioAntispamFreezeConfig;
        this.audioAutoFreezeOpened = builder.audioAutoFreezeOpened;
        this.audioMaxSize = builder.audioMaxSize;
        this.audioScanLimit = builder.audioScanLimit;
        this.audioSceneList = builder.audioSceneList;
        this.autoFreezeType = builder.autoFreezeType;
        this.bizType = builder.bizType;
        this.bizTypeTemplate = builder.bizTypeTemplate;
        this.bucketConfigList = builder.bucketConfigList;
        this.callbackId = builder.callbackId;
        this.callbackName = builder.callbackName;
        this.endTime = builder.endTime;
        this.imageAdFreezeConfig = builder.imageAdFreezeConfig;
        this.imageAutoFreeze = builder.imageAutoFreeze;
        this.imageAutoFreezeOpened = builder.imageAutoFreezeOpened;
        this.imageEnableLimit = builder.imageEnableLimit;
        this.imageLiveFreezeConfig = builder.imageLiveFreezeConfig;
        this.imagePornFreezeConfig = builder.imagePornFreezeConfig;
        this.imageScanLimit = builder.imageScanLimit;
        this.imageSceneList = builder.imageSceneList;
        this.imageTerrorismFreezeConfig = builder.imageTerrorismFreezeConfig;
        this.requestId = builder.requestId;
        this.scanImageNoFileType = builder.scanImageNoFileType;
        this.startTime = builder.startTime;
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

    public static DescribeOssIncrementCheckSettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return audioAntispamFreezeConfig
     */
    public AudioAntispamFreezeConfig getAudioAntispamFreezeConfig() {
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
    public java.util.List < String > getAudioSceneList() {
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
     * @return bizTypeTemplate
     */
    public BizTypeTemplate getBizTypeTemplate() {
        return this.bizTypeTemplate;
    }

    /**
     * @return bucketConfigList
     */
    public java.util.List < BucketConfigList> getBucketConfigList() {
        return this.bucketConfigList;
    }

    /**
     * @return callbackId
     */
    public String getCallbackId() {
        return this.callbackId;
    }

    /**
     * @return callbackName
     */
    public String getCallbackName() {
        return this.callbackName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return imageAdFreezeConfig
     */
    public ImageAdFreezeConfig getImageAdFreezeConfig() {
        return this.imageAdFreezeConfig;
    }

    /**
     * @return imageAutoFreeze
     */
    public ImageAutoFreeze getImageAutoFreeze() {
        return this.imageAutoFreeze;
    }

    /**
     * @return imageAutoFreezeOpened
     */
    public Boolean getImageAutoFreezeOpened() {
        return this.imageAutoFreezeOpened;
    }

    /**
     * @return imageEnableLimit
     */
    public Boolean getImageEnableLimit() {
        return this.imageEnableLimit;
    }

    /**
     * @return imageLiveFreezeConfig
     */
    public ImageLiveFreezeConfig getImageLiveFreezeConfig() {
        return this.imageLiveFreezeConfig;
    }

    /**
     * @return imagePornFreezeConfig
     */
    public ImagePornFreezeConfig getImagePornFreezeConfig() {
        return this.imagePornFreezeConfig;
    }

    /**
     * @return imageScanLimit
     */
    public Long getImageScanLimit() {
        return this.imageScanLimit;
    }

    /**
     * @return imageSceneList
     */
    public java.util.List < String > getImageSceneList() {
        return this.imageSceneList;
    }

    /**
     * @return imageTerrorismFreezeConfig
     */
    public ImageTerrorismFreezeConfig getImageTerrorismFreezeConfig() {
        return this.imageTerrorismFreezeConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scanImageNoFileType
     */
    public Boolean getScanImageNoFileType() {
        return this.scanImageNoFileType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return videoAdFreezeConfig
     */
    public VideoAdFreezeConfig getVideoAdFreezeConfig() {
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
    public java.util.List < String > getVideoAutoFreezeSceneList() {
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
    public VideoLiveFreezeConfig getVideoLiveFreezeConfig() {
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
    public VideoPornFreezeConfig getVideoPornFreezeConfig() {
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
    public java.util.List < String > getVideoSceneList() {
        return this.videoSceneList;
    }

    /**
     * @return videoTerrorismFreezeConfig
     */
    public VideoTerrorismFreezeConfig getVideoTerrorismFreezeConfig() {
        return this.videoTerrorismFreezeConfig;
    }

    /**
     * @return videoVoiceAntispamFreezeConfig
     */
    public VideoVoiceAntispamFreezeConfig getVideoVoiceAntispamFreezeConfig() {
        return this.videoVoiceAntispamFreezeConfig;
    }

    public static final class Builder {
        private AudioAntispamFreezeConfig audioAntispamFreezeConfig; 
        private Boolean audioAutoFreezeOpened; 
        private Integer audioMaxSize; 
        private Long audioScanLimit; 
        private java.util.List < String > audioSceneList; 
        private String autoFreezeType; 
        private String bizType; 
        private BizTypeTemplate bizTypeTemplate; 
        private java.util.List < BucketConfigList> bucketConfigList; 
        private String callbackId; 
        private String callbackName; 
        private String endTime; 
        private ImageAdFreezeConfig imageAdFreezeConfig; 
        private ImageAutoFreeze imageAutoFreeze; 
        private Boolean imageAutoFreezeOpened; 
        private Boolean imageEnableLimit; 
        private ImageLiveFreezeConfig imageLiveFreezeConfig; 
        private ImagePornFreezeConfig imagePornFreezeConfig; 
        private Long imageScanLimit; 
        private java.util.List < String > imageSceneList; 
        private ImageTerrorismFreezeConfig imageTerrorismFreezeConfig; 
        private String requestId; 
        private Boolean scanImageNoFileType; 
        private String startTime; 
        private VideoAdFreezeConfig videoAdFreezeConfig; 
        private Boolean videoAutoFreezeOpened; 
        private java.util.List < String > videoAutoFreezeSceneList; 
        private Integer videoFrameInterval; 
        private VideoLiveFreezeConfig videoLiveFreezeConfig; 
        private Integer videoMaxFrames; 
        private Integer videoMaxSize; 
        private VideoPornFreezeConfig videoPornFreezeConfig; 
        private Long videoScanLimit; 
        private java.util.List < String > videoSceneList; 
        private VideoTerrorismFreezeConfig videoTerrorismFreezeConfig; 
        private VideoVoiceAntispamFreezeConfig videoVoiceAntispamFreezeConfig; 

        /**
         * AudioAntispamFreezeConfig.
         */
        public Builder audioAntispamFreezeConfig(AudioAntispamFreezeConfig audioAntispamFreezeConfig) {
            this.audioAntispamFreezeConfig = audioAntispamFreezeConfig;
            return this;
        }

        /**
         * AudioAutoFreezeOpened.
         */
        public Builder audioAutoFreezeOpened(Boolean audioAutoFreezeOpened) {
            this.audioAutoFreezeOpened = audioAutoFreezeOpened;
            return this;
        }

        /**
         * AudioMaxSize.
         */
        public Builder audioMaxSize(Integer audioMaxSize) {
            this.audioMaxSize = audioMaxSize;
            return this;
        }

        /**
         * AudioScanLimit.
         */
        public Builder audioScanLimit(Long audioScanLimit) {
            this.audioScanLimit = audioScanLimit;
            return this;
        }

        /**
         * AudioSceneList.
         */
        public Builder audioSceneList(java.util.List < String > audioSceneList) {
            this.audioSceneList = audioSceneList;
            return this;
        }

        /**
         * AutoFreezeType.
         */
        public Builder autoFreezeType(String autoFreezeType) {
            this.autoFreezeType = autoFreezeType;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.bizType = bizType;
            return this;
        }

        /**
         * BizTypeTemplate.
         */
        public Builder bizTypeTemplate(BizTypeTemplate bizTypeTemplate) {
            this.bizTypeTemplate = bizTypeTemplate;
            return this;
        }

        /**
         * BucketConfigList.
         */
        public Builder bucketConfigList(java.util.List < BucketConfigList> bucketConfigList) {
            this.bucketConfigList = bucketConfigList;
            return this;
        }

        /**
         * CallbackId.
         */
        public Builder callbackId(String callbackId) {
            this.callbackId = callbackId;
            return this;
        }

        /**
         * CallbackName.
         */
        public Builder callbackName(String callbackName) {
            this.callbackName = callbackName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * ImageAdFreezeConfig.
         */
        public Builder imageAdFreezeConfig(ImageAdFreezeConfig imageAdFreezeConfig) {
            this.imageAdFreezeConfig = imageAdFreezeConfig;
            return this;
        }

        /**
         * ImageAutoFreeze.
         */
        public Builder imageAutoFreeze(ImageAutoFreeze imageAutoFreeze) {
            this.imageAutoFreeze = imageAutoFreeze;
            return this;
        }

        /**
         * ImageAutoFreezeOpened.
         */
        public Builder imageAutoFreezeOpened(Boolean imageAutoFreezeOpened) {
            this.imageAutoFreezeOpened = imageAutoFreezeOpened;
            return this;
        }

        /**
         * ImageEnableLimit.
         */
        public Builder imageEnableLimit(Boolean imageEnableLimit) {
            this.imageEnableLimit = imageEnableLimit;
            return this;
        }

        /**
         * ImageLiveFreezeConfig.
         */
        public Builder imageLiveFreezeConfig(ImageLiveFreezeConfig imageLiveFreezeConfig) {
            this.imageLiveFreezeConfig = imageLiveFreezeConfig;
            return this;
        }

        /**
         * ImagePornFreezeConfig.
         */
        public Builder imagePornFreezeConfig(ImagePornFreezeConfig imagePornFreezeConfig) {
            this.imagePornFreezeConfig = imagePornFreezeConfig;
            return this;
        }

        /**
         * ImageScanLimit.
         */
        public Builder imageScanLimit(Long imageScanLimit) {
            this.imageScanLimit = imageScanLimit;
            return this;
        }

        /**
         * ImageSceneList.
         */
        public Builder imageSceneList(java.util.List < String > imageSceneList) {
            this.imageSceneList = imageSceneList;
            return this;
        }

        /**
         * ImageTerrorismFreezeConfig.
         */
        public Builder imageTerrorismFreezeConfig(ImageTerrorismFreezeConfig imageTerrorismFreezeConfig) {
            this.imageTerrorismFreezeConfig = imageTerrorismFreezeConfig;
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
         * ScanImageNoFileType.
         */
        public Builder scanImageNoFileType(Boolean scanImageNoFileType) {
            this.scanImageNoFileType = scanImageNoFileType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * VideoAdFreezeConfig.
         */
        public Builder videoAdFreezeConfig(VideoAdFreezeConfig videoAdFreezeConfig) {
            this.videoAdFreezeConfig = videoAdFreezeConfig;
            return this;
        }

        /**
         * VideoAutoFreezeOpened.
         */
        public Builder videoAutoFreezeOpened(Boolean videoAutoFreezeOpened) {
            this.videoAutoFreezeOpened = videoAutoFreezeOpened;
            return this;
        }

        /**
         * VideoAutoFreezeSceneList.
         */
        public Builder videoAutoFreezeSceneList(java.util.List < String > videoAutoFreezeSceneList) {
            this.videoAutoFreezeSceneList = videoAutoFreezeSceneList;
            return this;
        }

        /**
         * VideoFrameInterval.
         */
        public Builder videoFrameInterval(Integer videoFrameInterval) {
            this.videoFrameInterval = videoFrameInterval;
            return this;
        }

        /**
         * VideoLiveFreezeConfig.
         */
        public Builder videoLiveFreezeConfig(VideoLiveFreezeConfig videoLiveFreezeConfig) {
            this.videoLiveFreezeConfig = videoLiveFreezeConfig;
            return this;
        }

        /**
         * VideoMaxFrames.
         */
        public Builder videoMaxFrames(Integer videoMaxFrames) {
            this.videoMaxFrames = videoMaxFrames;
            return this;
        }

        /**
         * VideoMaxSize.
         */
        public Builder videoMaxSize(Integer videoMaxSize) {
            this.videoMaxSize = videoMaxSize;
            return this;
        }

        /**
         * VideoPornFreezeConfig.
         */
        public Builder videoPornFreezeConfig(VideoPornFreezeConfig videoPornFreezeConfig) {
            this.videoPornFreezeConfig = videoPornFreezeConfig;
            return this;
        }

        /**
         * VideoScanLimit.
         */
        public Builder videoScanLimit(Long videoScanLimit) {
            this.videoScanLimit = videoScanLimit;
            return this;
        }

        /**
         * VideoSceneList.
         */
        public Builder videoSceneList(java.util.List < String > videoSceneList) {
            this.videoSceneList = videoSceneList;
            return this;
        }

        /**
         * VideoTerrorismFreezeConfig.
         */
        public Builder videoTerrorismFreezeConfig(VideoTerrorismFreezeConfig videoTerrorismFreezeConfig) {
            this.videoTerrorismFreezeConfig = videoTerrorismFreezeConfig;
            return this;
        }

        /**
         * VideoVoiceAntispamFreezeConfig.
         */
        public Builder videoVoiceAntispamFreezeConfig(VideoVoiceAntispamFreezeConfig videoVoiceAntispamFreezeConfig) {
            this.videoVoiceAntispamFreezeConfig = videoVoiceAntispamFreezeConfig;
            return this;
        }

        public DescribeOssIncrementCheckSettingResponseBody build() {
            return new DescribeOssIncrementCheckSettingResponseBody(this);
        } 

    } 

    public static class AudioAntispamFreezeConfig extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private AudioAntispamFreezeConfig(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioAntispamFreezeConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AudioAntispamFreezeConfig build() {
                return new AudioAntispamFreezeConfig(this);
            } 

        } 

    }
    public static class Ad extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private Ad(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ad create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public Ad build() {
                return new Ad(this);
            } 

        } 

    }
    public static class Live extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private Live(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Live create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public Live build() {
                return new Live(this);
            } 

        } 

    }
    public static class Porn extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private Porn(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Porn create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public Porn build() {
                return new Porn(this);
            } 

        } 

    }
    public static class Terrorism extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private Terrorism(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Terrorism create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public Terrorism build() {
                return new Terrorism(this);
            } 

        } 

    }
    public static class ImageConfig extends TeaModel {
        @NameInMap("Ad")
        private Ad ad;

        @NameInMap("Live")
        private Live live;

        @NameInMap("Porn")
        private Porn porn;

        @NameInMap("Terrorism")
        private Terrorism terrorism;

        private ImageConfig(Builder builder) {
            this.ad = builder.ad;
            this.live = builder.live;
            this.porn = builder.porn;
            this.terrorism = builder.terrorism;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageConfig create() {
            return builder().build();
        }

        /**
         * @return ad
         */
        public Ad getAd() {
            return this.ad;
        }

        /**
         * @return live
         */
        public Live getLive() {
            return this.live;
        }

        /**
         * @return porn
         */
        public Porn getPorn() {
            return this.porn;
        }

        /**
         * @return terrorism
         */
        public Terrorism getTerrorism() {
            return this.terrorism;
        }

        public static final class Builder {
            private Ad ad; 
            private Live live; 
            private Porn porn; 
            private Terrorism terrorism; 

            /**
             * Ad.
             */
            public Builder ad(Ad ad) {
                this.ad = ad;
                return this;
            }

            /**
             * Live.
             */
            public Builder live(Live live) {
                this.live = live;
                return this;
            }

            /**
             * Porn.
             */
            public Builder porn(Porn porn) {
                this.porn = porn;
                return this;
            }

            /**
             * Terrorism.
             */
            public Builder terrorism(Terrorism terrorism) {
                this.terrorism = terrorism;
                return this;
            }

            public ImageConfig build() {
                return new ImageConfig(this);
            } 

        } 

    }
    public static class VideoConfigAd extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private VideoConfigAd(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoConfigAd create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public VideoConfigAd build() {
                return new VideoConfigAd(this);
            } 

        } 

    }
    public static class VideoConfigLive extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private VideoConfigLive(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoConfigLive create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public VideoConfigLive build() {
                return new VideoConfigLive(this);
            } 

        } 

    }
    public static class VideoConfigPorn extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private VideoConfigPorn(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoConfigPorn create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public VideoConfigPorn build() {
                return new VideoConfigPorn(this);
            } 

        } 

    }
    public static class VideoConfigTerrorism extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private VideoConfigTerrorism(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoConfigTerrorism create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public VideoConfigTerrorism build() {
                return new VideoConfigTerrorism(this);
            } 

        } 

    }
    public static class VideoConfig extends TeaModel {
        @NameInMap("Ad")
        private VideoConfigAd ad;

        @NameInMap("Live")
        private VideoConfigLive live;

        @NameInMap("Porn")
        private VideoConfigPorn porn;

        @NameInMap("Terrorism")
        private VideoConfigTerrorism terrorism;

        private VideoConfig(Builder builder) {
            this.ad = builder.ad;
            this.live = builder.live;
            this.porn = builder.porn;
            this.terrorism = builder.terrorism;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoConfig create() {
            return builder().build();
        }

        /**
         * @return ad
         */
        public VideoConfigAd getAd() {
            return this.ad;
        }

        /**
         * @return live
         */
        public VideoConfigLive getLive() {
            return this.live;
        }

        /**
         * @return porn
         */
        public VideoConfigPorn getPorn() {
            return this.porn;
        }

        /**
         * @return terrorism
         */
        public VideoConfigTerrorism getTerrorism() {
            return this.terrorism;
        }

        public static final class Builder {
            private VideoConfigAd ad; 
            private VideoConfigLive live; 
            private VideoConfigPorn porn; 
            private VideoConfigTerrorism terrorism; 

            /**
             * Ad.
             */
            public Builder ad(VideoConfigAd ad) {
                this.ad = ad;
                return this;
            }

            /**
             * Live.
             */
            public Builder live(VideoConfigLive live) {
                this.live = live;
                return this;
            }

            /**
             * Porn.
             */
            public Builder porn(VideoConfigPorn porn) {
                this.porn = porn;
                return this;
            }

            /**
             * Terrorism.
             */
            public Builder terrorism(VideoConfigTerrorism terrorism) {
                this.terrorism = terrorism;
                return this;
            }

            public VideoConfig build() {
                return new VideoConfig(this);
            } 

        } 

    }
    public static class Antispam extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        private Antispam(Builder builder) {
            this.categories = builder.categories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Antispam create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        public static final class Builder {
            private java.util.List < String > categories; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            public Antispam build() {
                return new Antispam(this);
            } 

        } 

    }
    public static class VoiceConfig extends TeaModel {
        @NameInMap("Antispam")
        private Antispam antispam;

        private VoiceConfig(Builder builder) {
            this.antispam = builder.antispam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceConfig create() {
            return builder().build();
        }

        /**
         * @return antispam
         */
        public Antispam getAntispam() {
            return this.antispam;
        }

        public static final class Builder {
            private Antispam antispam; 

            /**
             * Antispam.
             */
            public Builder antispam(Antispam antispam) {
                this.antispam = antispam;
                return this;
            }

            public VoiceConfig build() {
                return new VoiceConfig(this);
            } 

        } 

    }
    public static class BizTypeTemplate extends TeaModel {
        @NameInMap("BizType")
        private String bizType;

        @NameInMap("Description")
        private String description;

        @NameInMap("ImageConfig")
        private ImageConfig imageConfig;

        @NameInMap("IncludeChannel")
        private Integer includeChannel;

        @NameInMap("Name")
        private String name;

        @NameInMap("VideoConfig")
        private VideoConfig videoConfig;

        @NameInMap("VoiceConfig")
        private VoiceConfig voiceConfig;

        private BizTypeTemplate(Builder builder) {
            this.bizType = builder.bizType;
            this.description = builder.description;
            this.imageConfig = builder.imageConfig;
            this.includeChannel = builder.includeChannel;
            this.name = builder.name;
            this.videoConfig = builder.videoConfig;
            this.voiceConfig = builder.voiceConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizTypeTemplate create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return imageConfig
         */
        public ImageConfig getImageConfig() {
            return this.imageConfig;
        }

        /**
         * @return includeChannel
         */
        public Integer getIncludeChannel() {
            return this.includeChannel;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return videoConfig
         */
        public VideoConfig getVideoConfig() {
            return this.videoConfig;
        }

        /**
         * @return voiceConfig
         */
        public VoiceConfig getVoiceConfig() {
            return this.voiceConfig;
        }

        public static final class Builder {
            private String bizType; 
            private String description; 
            private ImageConfig imageConfig; 
            private Integer includeChannel; 
            private String name; 
            private VideoConfig videoConfig; 
            private VoiceConfig voiceConfig; 

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ImageConfig.
             */
            public Builder imageConfig(ImageConfig imageConfig) {
                this.imageConfig = imageConfig;
                return this;
            }

            /**
             * IncludeChannel.
             */
            public Builder includeChannel(Integer includeChannel) {
                this.includeChannel = includeChannel;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * VideoConfig.
             */
            public Builder videoConfig(VideoConfig videoConfig) {
                this.videoConfig = videoConfig;
                return this;
            }

            /**
             * VoiceConfig.
             */
            public Builder voiceConfig(VoiceConfig voiceConfig) {
                this.voiceConfig = voiceConfig;
                return this;
            }

            public BizTypeTemplate build() {
                return new BizTypeTemplate(this);
            } 

        } 

    }
    public static class BucketConfigList extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Prefixes")
        private java.util.List < String > prefixes;

        @NameInMap("Selected")
        private Boolean selected;

        @NameInMap("Type")
        private String type;

        private BucketConfigList(Builder builder) {
            this.bucket = builder.bucket;
            this.prefixes = builder.prefixes;
            this.selected = builder.selected;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BucketConfigList create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return prefixes
         */
        public java.util.List < String > getPrefixes() {
            return this.prefixes;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bucket; 
            private java.util.List < String > prefixes; 
            private Boolean selected; 
            private String type; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Prefixes.
             */
            public Builder prefixes(java.util.List < String > prefixes) {
                this.prefixes = prefixes;
                return this;
            }

            /**
             * Selected.
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BucketConfigList build() {
                return new BucketConfigList(this);
            } 

        } 

    }
    public static class ImageAdFreezeConfig extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private ImageAdFreezeConfig(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageAdFreezeConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ImageAdFreezeConfig build() {
                return new ImageAdFreezeConfig(this);
            } 

        } 

    }
    public static class ImageAutoFreeze extends TeaModel {
        @NameInMap("Ad")
        private String ad;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("Live")
        private String live;

        @NameInMap("Porn")
        private String porn;

        @NameInMap("Terrorism")
        private String terrorism;

        private ImageAutoFreeze(Builder builder) {
            this.ad = builder.ad;
            this.enabled = builder.enabled;
            this.live = builder.live;
            this.porn = builder.porn;
            this.terrorism = builder.terrorism;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageAutoFreeze create() {
            return builder().build();
        }

        /**
         * @return ad
         */
        public String getAd() {
            return this.ad;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return live
         */
        public String getLive() {
            return this.live;
        }

        /**
         * @return porn
         */
        public String getPorn() {
            return this.porn;
        }

        /**
         * @return terrorism
         */
        public String getTerrorism() {
            return this.terrorism;
        }

        public static final class Builder {
            private String ad; 
            private Boolean enabled; 
            private String live; 
            private String porn; 
            private String terrorism; 

            /**
             * Ad.
             */
            public Builder ad(String ad) {
                this.ad = ad;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Live.
             */
            public Builder live(String live) {
                this.live = live;
                return this;
            }

            /**
             * Porn.
             */
            public Builder porn(String porn) {
                this.porn = porn;
                return this;
            }

            /**
             * Terrorism.
             */
            public Builder terrorism(String terrorism) {
                this.terrorism = terrorism;
                return this;
            }

            public ImageAutoFreeze build() {
                return new ImageAutoFreeze(this);
            } 

        } 

    }
    public static class ImageLiveFreezeConfig extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private ImageLiveFreezeConfig(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageLiveFreezeConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ImageLiveFreezeConfig build() {
                return new ImageLiveFreezeConfig(this);
            } 

        } 

    }
    public static class ImagePornFreezeConfig extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private ImagePornFreezeConfig(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImagePornFreezeConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ImagePornFreezeConfig build() {
                return new ImagePornFreezeConfig(this);
            } 

        } 

    }
    public static class ImageTerrorismFreezeConfig extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private ImageTerrorismFreezeConfig(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageTerrorismFreezeConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ImageTerrorismFreezeConfig build() {
                return new ImageTerrorismFreezeConfig(this);
            } 

        } 

    }
    public static class VideoAdFreezeConfig extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private VideoAdFreezeConfig(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoAdFreezeConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public VideoAdFreezeConfig build() {
                return new VideoAdFreezeConfig(this);
            } 

        } 

    }
    public static class VideoLiveFreezeConfig extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private VideoLiveFreezeConfig(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoLiveFreezeConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public VideoLiveFreezeConfig build() {
                return new VideoLiveFreezeConfig(this);
            } 

        } 

    }
    public static class VideoPornFreezeConfig extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private VideoPornFreezeConfig(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoPornFreezeConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public VideoPornFreezeConfig build() {
                return new VideoPornFreezeConfig(this);
            } 

        } 

    }
    public static class VideoTerrorismFreezeConfig extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private VideoTerrorismFreezeConfig(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoTerrorismFreezeConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public VideoTerrorismFreezeConfig build() {
                return new VideoTerrorismFreezeConfig(this);
            } 

        } 

    }
    public static class VideoVoiceAntispamFreezeConfig extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private VideoVoiceAntispamFreezeConfig(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoVoiceAntispamFreezeConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public VideoVoiceAntispamFreezeConfig build() {
                return new VideoVoiceAntispamFreezeConfig(this);
            } 

        } 

    }
}
