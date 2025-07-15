// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link StartRtcCloudRecordingRequest} extends {@link RequestModel}
 *
 * <p>StartRtcCloudRecordingRequest</p>
 */
public class StartRtcCloudRecordingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MixLayoutParams")
    private MixLayoutParams mixLayoutParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MixTranscodeParams")
    private MixTranscodeParams mixTranscodeParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyUrl")
    private String notifyUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private RecordParams recordParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private StorageParams storageParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribeParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private SubscribeParams subscribeParams;

    private StartRtcCloudRecordingRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.mixLayoutParams = builder.mixLayoutParams;
        this.mixTranscodeParams = builder.mixTranscodeParams;
        this.notifyUrl = builder.notifyUrl;
        this.recordParams = builder.recordParams;
        this.storageParams = builder.storageParams;
        this.subscribeParams = builder.subscribeParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartRtcCloudRecordingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return mixLayoutParams
     */
    public MixLayoutParams getMixLayoutParams() {
        return this.mixLayoutParams;
    }

    /**
     * @return mixTranscodeParams
     */
    public MixTranscodeParams getMixTranscodeParams() {
        return this.mixTranscodeParams;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return recordParams
     */
    public RecordParams getRecordParams() {
        return this.recordParams;
    }

    /**
     * @return storageParams
     */
    public StorageParams getStorageParams() {
        return this.storageParams;
    }

    /**
     * @return subscribeParams
     */
    public SubscribeParams getSubscribeParams() {
        return this.subscribeParams;
    }

    public static final class Builder extends Request.Builder<StartRtcCloudRecordingRequest, Builder> {
        private String appId; 
        private String channelId; 
        private MixLayoutParams mixLayoutParams; 
        private MixTranscodeParams mixTranscodeParams; 
        private String notifyUrl; 
        private RecordParams recordParams; 
        private StorageParams storageParams; 
        private SubscribeParams subscribeParams; 

        private Builder() {
            super();
        } 

        private Builder(StartRtcCloudRecordingRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.mixLayoutParams = request.mixLayoutParams;
            this.mixTranscodeParams = request.mixTranscodeParams;
            this.notifyUrl = request.notifyUrl;
            this.recordParams = request.recordParams;
            this.storageParams = request.storageParams;
            this.subscribeParams = request.subscribeParams;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>********-7074-<strong><strong>-9ef5-85c19a4</strong></strong>*</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>room1024</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * MixLayoutParams.
         */
        public Builder mixLayoutParams(MixLayoutParams mixLayoutParams) {
            String mixLayoutParamsShrink = shrink(mixLayoutParams, "MixLayoutParams", "json");
            this.putQueryParameter("MixLayoutParams", mixLayoutParamsShrink);
            this.mixLayoutParams = mixLayoutParams;
            return this;
        }

        /**
         * MixTranscodeParams.
         */
        public Builder mixTranscodeParams(MixTranscodeParams mixTranscodeParams) {
            String mixTranscodeParamsShrink = shrink(mixTranscodeParams, "MixTranscodeParams", "json");
            this.putQueryParameter("MixTranscodeParams", mixTranscodeParamsShrink);
            this.mixTranscodeParams = mixTranscodeParams;
            return this;
        }

        /**
         * NotifyUrl.
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putQueryParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder recordParams(RecordParams recordParams) {
            String recordParamsShrink = shrink(recordParams, "RecordParams", "json");
            this.putQueryParameter("RecordParams", recordParamsShrink);
            this.recordParams = recordParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder storageParams(StorageParams storageParams) {
            String storageParamsShrink = shrink(storageParams, "StorageParams", "json");
            this.putQueryParameter("StorageParams", storageParamsShrink);
            this.storageParams = storageParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder subscribeParams(SubscribeParams subscribeParams) {
            String subscribeParamsShrink = shrink(subscribeParams, "SubscribeParams", "json");
            this.putQueryParameter("SubscribeParams", subscribeParamsShrink);
            this.subscribeParams = subscribeParams;
            return this;
        }

        @Override
        public StartRtcCloudRecordingRequest build() {
            return new StartRtcCloudRecordingRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudRecordingRequest</p>
     */
    public static class MixBackground extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RenderMode")
        private Integer renderMode;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(maxLength = 2048)
        private String url;

        private MixBackground(Builder builder) {
            this.renderMode = builder.renderMode;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MixBackground create() {
            return builder().build();
        }

        /**
         * @return renderMode
         */
        public Integer getRenderMode() {
            return this.renderMode;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Integer renderMode; 
            private String url; 

            private Builder() {
            } 

            private Builder(MixBackground model) {
                this.renderMode = model.renderMode;
                this.url = model.url;
            } 

            /**
             * RenderMode.
             */
            public Builder renderMode(Integer renderMode) {
                this.renderMode = renderMode;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public MixBackground build() {
                return new MixBackground(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudRecordingRequest</p>
     */
    public static class SubBackground extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RenderMode")
        private Integer renderMode;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(maxLength = 2048)
        private String url;

        private SubBackground(Builder builder) {
            this.renderMode = builder.renderMode;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubBackground create() {
            return builder().build();
        }

        /**
         * @return renderMode
         */
        public Integer getRenderMode() {
            return this.renderMode;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Integer renderMode; 
            private String url; 

            private Builder() {
            } 

            private Builder(SubBackground model) {
                this.renderMode = model.renderMode;
                this.url = model.url;
            } 

            /**
             * RenderMode.
             */
            public Builder renderMode(Integer renderMode) {
                this.renderMode = renderMode;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public SubBackground build() {
                return new SubBackground(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudRecordingRequest</p>
     */
    public static class UserPanes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private Integer sourceType;

        @com.aliyun.core.annotation.NameInMap("SubBackground")
        private SubBackground subBackground;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        @com.aliyun.core.annotation.NameInMap("X")
        private String x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private String y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private UserPanes(Builder builder) {
            this.height = builder.height;
            this.sourceType = builder.sourceType;
            this.subBackground = builder.subBackground;
            this.userId = builder.userId;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPanes create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return sourceType
         */
        public Integer getSourceType() {
            return this.sourceType;
        }

        /**
         * @return subBackground
         */
        public SubBackground getSubBackground() {
            return this.subBackground;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public String getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public String getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private String height; 
            private Integer sourceType; 
            private SubBackground subBackground; 
            private String userId; 
            private String width; 
            private String x; 
            private String y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(UserPanes model) {
                this.height = model.height;
                this.sourceType = model.sourceType;
                this.subBackground = model.subBackground;
                this.userId = model.userId;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(Integer sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * SubBackground.
             */
            public Builder subBackground(SubBackground subBackground) {
                this.subBackground = subBackground;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(String y) {
                this.y = y;
                return this;
            }

            /**
             * ZOrder.
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public UserPanes build() {
                return new UserPanes(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudRecordingRequest</p>
     */
    public static class MixLayoutParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MixBackground")
        private MixBackground mixBackground;

        @com.aliyun.core.annotation.NameInMap("UserPanes")
        private java.util.List<UserPanes> userPanes;

        private MixLayoutParams(Builder builder) {
            this.mixBackground = builder.mixBackground;
            this.userPanes = builder.userPanes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MixLayoutParams create() {
            return builder().build();
        }

        /**
         * @return mixBackground
         */
        public MixBackground getMixBackground() {
            return this.mixBackground;
        }

        /**
         * @return userPanes
         */
        public java.util.List<UserPanes> getUserPanes() {
            return this.userPanes;
        }

        public static final class Builder {
            private MixBackground mixBackground; 
            private java.util.List<UserPanes> userPanes; 

            private Builder() {
            } 

            private Builder(MixLayoutParams model) {
                this.mixBackground = model.mixBackground;
                this.userPanes = model.userPanes;
            } 

            /**
             * MixBackground.
             */
            public Builder mixBackground(MixBackground mixBackground) {
                this.mixBackground = mixBackground;
                return this;
            }

            /**
             * UserPanes.
             */
            public Builder userPanes(java.util.List<UserPanes> userPanes) {
                this.userPanes = userPanes;
                return this;
            }

            public MixLayoutParams build() {
                return new MixLayoutParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudRecordingRequest</p>
     */
    public static class MixTranscodeParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioBitrate")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 500, minimum = 8)
        private Long audioBitrate;

        @com.aliyun.core.annotation.NameInMap("AudioChannels")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer audioChannels;

        @com.aliyun.core.annotation.NameInMap("AudioSampleRate")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long audioSampleRate;

        @com.aliyun.core.annotation.NameInMap("FrameFillType")
        private Integer frameFillType;

        @com.aliyun.core.annotation.NameInMap("VideoBitrate")
        @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
        private Integer videoBitrate;

        @com.aliyun.core.annotation.NameInMap("VideoCodec")
        private String videoCodec;

        @com.aliyun.core.annotation.NameInMap("VideoFramerate")
        @com.aliyun.core.annotation.Validation(maximum = 60, minimum = 1)
        private Integer videoFramerate;

        @com.aliyun.core.annotation.NameInMap("VideoGop")
        @com.aliyun.core.annotation.Validation(maximum = 60, minimum = 1)
        private Integer videoGop;

        @com.aliyun.core.annotation.NameInMap("VideoHeight")
        @com.aliyun.core.annotation.Validation(maximum = 1920)
        private Integer videoHeight;

        @com.aliyun.core.annotation.NameInMap("VideoWidth")
        @com.aliyun.core.annotation.Validation(maximum = 1920)
        private Integer videoWidth;

        private MixTranscodeParams(Builder builder) {
            this.audioBitrate = builder.audioBitrate;
            this.audioChannels = builder.audioChannels;
            this.audioSampleRate = builder.audioSampleRate;
            this.frameFillType = builder.frameFillType;
            this.videoBitrate = builder.videoBitrate;
            this.videoCodec = builder.videoCodec;
            this.videoFramerate = builder.videoFramerate;
            this.videoGop = builder.videoGop;
            this.videoHeight = builder.videoHeight;
            this.videoWidth = builder.videoWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MixTranscodeParams create() {
            return builder().build();
        }

        /**
         * @return audioBitrate
         */
        public Long getAudioBitrate() {
            return this.audioBitrate;
        }

        /**
         * @return audioChannels
         */
        public Integer getAudioChannels() {
            return this.audioChannels;
        }

        /**
         * @return audioSampleRate
         */
        public Long getAudioSampleRate() {
            return this.audioSampleRate;
        }

        /**
         * @return frameFillType
         */
        public Integer getFrameFillType() {
            return this.frameFillType;
        }

        /**
         * @return videoBitrate
         */
        public Integer getVideoBitrate() {
            return this.videoBitrate;
        }

        /**
         * @return videoCodec
         */
        public String getVideoCodec() {
            return this.videoCodec;
        }

        /**
         * @return videoFramerate
         */
        public Integer getVideoFramerate() {
            return this.videoFramerate;
        }

        /**
         * @return videoGop
         */
        public Integer getVideoGop() {
            return this.videoGop;
        }

        /**
         * @return videoHeight
         */
        public Integer getVideoHeight() {
            return this.videoHeight;
        }

        /**
         * @return videoWidth
         */
        public Integer getVideoWidth() {
            return this.videoWidth;
        }

        public static final class Builder {
            private Long audioBitrate; 
            private Integer audioChannels; 
            private Long audioSampleRate; 
            private Integer frameFillType; 
            private Integer videoBitrate; 
            private String videoCodec; 
            private Integer videoFramerate; 
            private Integer videoGop; 
            private Integer videoHeight; 
            private Integer videoWidth; 

            private Builder() {
            } 

            private Builder(MixTranscodeParams model) {
                this.audioBitrate = model.audioBitrate;
                this.audioChannels = model.audioChannels;
                this.audioSampleRate = model.audioSampleRate;
                this.frameFillType = model.frameFillType;
                this.videoBitrate = model.videoBitrate;
                this.videoCodec = model.videoCodec;
                this.videoFramerate = model.videoFramerate;
                this.videoGop = model.videoGop;
                this.videoHeight = model.videoHeight;
                this.videoWidth = model.videoWidth;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder audioBitrate(Long audioBitrate) {
                this.audioBitrate = audioBitrate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder audioChannels(Integer audioChannels) {
                this.audioChannels = audioChannels;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>32000</p>
             */
            public Builder audioSampleRate(Long audioSampleRate) {
                this.audioSampleRate = audioSampleRate;
                return this;
            }

            /**
             * FrameFillType.
             */
            public Builder frameFillType(Integer frameFillType) {
                this.frameFillType = frameFillType;
                return this;
            }

            /**
             * VideoBitrate.
             */
            public Builder videoBitrate(Integer videoBitrate) {
                this.videoBitrate = videoBitrate;
                return this;
            }

            /**
             * VideoCodec.
             */
            public Builder videoCodec(String videoCodec) {
                this.videoCodec = videoCodec;
                return this;
            }

            /**
             * VideoFramerate.
             */
            public Builder videoFramerate(Integer videoFramerate) {
                this.videoFramerate = videoFramerate;
                return this;
            }

            /**
             * VideoGop.
             */
            public Builder videoGop(Integer videoGop) {
                this.videoGop = videoGop;
                return this;
            }

            /**
             * VideoHeight.
             */
            public Builder videoHeight(Integer videoHeight) {
                this.videoHeight = videoHeight;
                return this;
            }

            /**
             * VideoWidth.
             */
            public Builder videoWidth(Integer videoWidth) {
                this.videoWidth = videoWidth;
                return this;
            }

            public MixTranscodeParams build() {
                return new MixTranscodeParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudRecordingRequest</p>
     */
    public static class RecordParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxFileDuration")
        @com.aliyun.core.annotation.Validation(maximum = 7200, minimum = 180)
        private Long maxFileDuration;

        @com.aliyun.core.annotation.NameInMap("RecordMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer recordMode;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        private Integer streamType;

        private RecordParams(Builder builder) {
            this.maxFileDuration = builder.maxFileDuration;
            this.recordMode = builder.recordMode;
            this.streamType = builder.streamType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordParams create() {
            return builder().build();
        }

        /**
         * @return maxFileDuration
         */
        public Long getMaxFileDuration() {
            return this.maxFileDuration;
        }

        /**
         * @return recordMode
         */
        public Integer getRecordMode() {
            return this.recordMode;
        }

        /**
         * @return streamType
         */
        public Integer getStreamType() {
            return this.streamType;
        }

        public static final class Builder {
            private Long maxFileDuration; 
            private Integer recordMode; 
            private Integer streamType; 

            private Builder() {
            } 

            private Builder(RecordParams model) {
                this.maxFileDuration = model.maxFileDuration;
                this.recordMode = model.recordMode;
                this.streamType = model.streamType;
            } 

            /**
             * MaxFileDuration.
             */
            public Builder maxFileDuration(Long maxFileDuration) {
                this.maxFileDuration = maxFileDuration;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder recordMode(Integer recordMode) {
                this.recordMode = recordMode;
                return this;
            }

            /**
             * StreamType.
             */
            public Builder streamType(Integer streamType) {
                this.streamType = streamType;
                return this;
            }

            public RecordParams build() {
                return new RecordParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudRecordingRequest</p>
     */
    public static class FileInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileNamePattern")
        private String fileNamePattern;

        @com.aliyun.core.annotation.NameInMap("Format")
        @com.aliyun.core.annotation.Validation(required = true)
        private String format;

        @com.aliyun.core.annotation.NameInMap("SliceNamePattern")
        private String sliceNamePattern;

        private FileInfo(Builder builder) {
            this.fileNamePattern = builder.fileNamePattern;
            this.format = builder.format;
            this.sliceNamePattern = builder.sliceNamePattern;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileInfo create() {
            return builder().build();
        }

        /**
         * @return fileNamePattern
         */
        public String getFileNamePattern() {
            return this.fileNamePattern;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return sliceNamePattern
         */
        public String getSliceNamePattern() {
            return this.sliceNamePattern;
        }

        public static final class Builder {
            private String fileNamePattern; 
            private String format; 
            private String sliceNamePattern; 

            private Builder() {
            } 

            private Builder(FileInfo model) {
                this.fileNamePattern = model.fileNamePattern;
                this.format = model.format;
                this.sliceNamePattern = model.sliceNamePattern;
            } 

            /**
             * FileNamePattern.
             */
            public Builder fileNamePattern(String fileNamePattern) {
                this.fileNamePattern = fileNamePattern;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HLS</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * SliceNamePattern.
             */
            public Builder sliceNamePattern(String sliceNamePattern) {
                this.sliceNamePattern = sliceNamePattern;
                return this;
            }

            public FileInfo build() {
                return new FileInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudRecordingRequest</p>
     */
    public static class OSSParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OSSBucket")
        @com.aliyun.core.annotation.Validation(required = true)
        private String OSSBucket;

        @com.aliyun.core.annotation.NameInMap("OSSEndpoint")
        @com.aliyun.core.annotation.Validation(required = true)
        private String OSSEndpoint;

        private OSSParams(Builder builder) {
            this.OSSBucket = builder.OSSBucket;
            this.OSSEndpoint = builder.OSSEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OSSParams create() {
            return builder().build();
        }

        /**
         * @return OSSBucket
         */
        public String getOSSBucket() {
            return this.OSSBucket;
        }

        /**
         * @return OSSEndpoint
         */
        public String getOSSEndpoint() {
            return this.OSSEndpoint;
        }

        public static final class Builder {
            private String OSSBucket; 
            private String OSSEndpoint; 

            private Builder() {
            } 

            private Builder(OSSParams model) {
                this.OSSBucket = model.OSSBucket;
                this.OSSEndpoint = model.OSSEndpoint;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mytest-bucket</p>
             */
            public Builder OSSBucket(String OSSBucket) {
                this.OSSBucket = OSSBucket;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder OSSEndpoint(String OSSEndpoint) {
                this.OSSEndpoint = OSSEndpoint;
                return this;
            }

            public OSSParams build() {
                return new OSSParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudRecordingRequest</p>
     */
    public static class StorageParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileInfo")
        private java.util.List<FileInfo> fileInfo;

        @com.aliyun.core.annotation.NameInMap("OSSParams")
        private OSSParams OSSParams;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer storageType;

        private StorageParams(Builder builder) {
            this.fileInfo = builder.fileInfo;
            this.OSSParams = builder.OSSParams;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageParams create() {
            return builder().build();
        }

        /**
         * @return fileInfo
         */
        public java.util.List<FileInfo> getFileInfo() {
            return this.fileInfo;
        }

        /**
         * @return OSSParams
         */
        public OSSParams getOSSParams() {
            return this.OSSParams;
        }

        /**
         * @return storageType
         */
        public Integer getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private java.util.List<FileInfo> fileInfo; 
            private OSSParams OSSParams; 
            private Integer storageType; 

            private Builder() {
            } 

            private Builder(StorageParams model) {
                this.fileInfo = model.fileInfo;
                this.OSSParams = model.OSSParams;
                this.storageType = model.storageType;
            } 

            /**
             * FileInfo.
             */
            public Builder fileInfo(java.util.List<FileInfo> fileInfo) {
                this.fileInfo = fileInfo;
                return this;
            }

            /**
             * OSSParams.
             */
            public Builder OSSParams(OSSParams OSSParams) {
                this.OSSParams = OSSParams;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder storageType(Integer storageType) {
                this.storageType = storageType;
                return this;
            }

            public StorageParams build() {
                return new StorageParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudRecordingRequest</p>
     */
    public static class SubscribeUserIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceType")
        private Integer sourceType;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        private Integer streamType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private SubscribeUserIdList(Builder builder) {
            this.sourceType = builder.sourceType;
            this.streamType = builder.streamType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscribeUserIdList create() {
            return builder().build();
        }

        /**
         * @return sourceType
         */
        public Integer getSourceType() {
            return this.sourceType;
        }

        /**
         * @return streamType
         */
        public Integer getStreamType() {
            return this.streamType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Integer sourceType; 
            private Integer streamType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(SubscribeUserIdList model) {
                this.sourceType = model.sourceType;
                this.streamType = model.streamType;
                this.userId = model.userId;
            } 

            /**
             * SourceType.
             */
            public Builder sourceType(Integer sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * StreamType.
             */
            public Builder streamType(Integer streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>userA</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public SubscribeUserIdList build() {
                return new SubscribeUserIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudRecordingRequest</p>
     */
    public static class SubscribeParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubscribeUserIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<SubscribeUserIdList> subscribeUserIdList;

        private SubscribeParams(Builder builder) {
            this.subscribeUserIdList = builder.subscribeUserIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscribeParams create() {
            return builder().build();
        }

        /**
         * @return subscribeUserIdList
         */
        public java.util.List<SubscribeUserIdList> getSubscribeUserIdList() {
            return this.subscribeUserIdList;
        }

        public static final class Builder {
            private java.util.List<SubscribeUserIdList> subscribeUserIdList; 

            private Builder() {
            } 

            private Builder(SubscribeParams model) {
                this.subscribeUserIdList = model.subscribeUserIdList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder subscribeUserIdList(java.util.List<SubscribeUserIdList> subscribeUserIdList) {
                this.subscribeUserIdList = subscribeUserIdList;
                return this;
            }

            public SubscribeParams build() {
                return new SubscribeParams(this);
            } 

        } 

    }
}
