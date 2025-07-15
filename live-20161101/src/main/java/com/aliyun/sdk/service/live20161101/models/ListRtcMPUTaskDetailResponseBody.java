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
 * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListRtcMPUTaskDetailResponseBody</p>
 */
public class ListRtcMPUTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MPUTasks")
    private java.util.List<MPUTasks> MPUTasks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRtcMPUTaskDetailResponseBody(Builder builder) {
        this.MPUTasks = builder.MPUTasks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRtcMPUTaskDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return MPUTasks
     */
    public java.util.List<MPUTasks> getMPUTasks() {
        return this.MPUTasks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MPUTasks> MPUTasks; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListRtcMPUTaskDetailResponseBody model) {
            this.MPUTasks = model.MPUTasks;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The parameters that you configured when you called the StartLiveMPUTask operation to create the tasks.</p>
         */
        public Builder MPUTasks(java.util.List<MPUTasks> MPUTasks) {
            this.MPUTasks = MPUTasks;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRtcMPUTaskDetailResponseBody build() {
            return new ListRtcMPUTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUTaskDetailResponseBody</p>
     */
    public static class MultiStreamURL extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsAliCdn")
        private Boolean isAliCdn;

        @com.aliyun.core.annotation.NameInMap("URL")
        private String URL;

        private MultiStreamURL(Builder builder) {
            this.isAliCdn = builder.isAliCdn;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiStreamURL create() {
            return builder().build();
        }

        /**
         * @return isAliCdn
         */
        public Boolean getIsAliCdn() {
            return this.isAliCdn;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private Boolean isAliCdn; 
            private String URL; 

            private Builder() {
            } 

            private Builder(MultiStreamURL model) {
                this.isAliCdn = model.isAliCdn;
                this.URL = model.URL;
            } 

            /**
             * <p>Indicates whether stream relay is performed by using Alibaba Cloud CDN. Valid values:</p>
             * <ul>
             * <li>false: Stream relay is performed by using a CDN service that is not Alibaba Cloud CDN.</li>
             * <li>true: Stream relay is performed by using Alibaba Cloud CDN.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isAliCdn(Boolean isAliCdn) {
                this.isAliCdn = isAliCdn;
                return this;
            }

            /**
             * <p>The ingest URL.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://example.com/live/stream****</p>
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public MultiStreamURL build() {
                return new MultiStreamURL(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUTaskDetailResponseBody</p>
     */
    public static class LayoutVolume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FollowIdr")
        private String followIdr;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private String interval;

        private LayoutVolume(Builder builder) {
            this.followIdr = builder.followIdr;
            this.interval = builder.interval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayoutVolume create() {
            return builder().build();
        }

        /**
         * @return followIdr
         */
        public String getFollowIdr() {
            return this.followIdr;
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        public static final class Builder {
            private String followIdr; 
            private String interval; 

            private Builder() {
            } 

            private Builder(LayoutVolume model) {
                this.followIdr = model.followIdr;
                this.interval = model.interval;
            } 

            /**
             * <p>Indicates whether to add SEI messages to Instantaneous Decoder Refresh (IDR) frames. Valid values:</p>
             * <ul>
             * <li>0: does not add SEI messages.</li>
             * <li>1: adds SEI messages.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder followIdr(String followIdr) {
                this.followIdr = followIdr;
                return this;
            }

            /**
             * <p>The interval at which the SEI messages are added. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            public LayoutVolume build() {
                return new LayoutVolume(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUTaskDetailResponseBody</p>
     */
    public static class PassThrough extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FollowIdr")
        private String followIdr;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private String interval;

        @com.aliyun.core.annotation.NameInMap("PayloadContent")
        private String payloadContent;

        @com.aliyun.core.annotation.NameInMap("PayloadContentKey")
        private String payloadContentKey;

        private PassThrough(Builder builder) {
            this.followIdr = builder.followIdr;
            this.interval = builder.interval;
            this.payloadContent = builder.payloadContent;
            this.payloadContentKey = builder.payloadContentKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassThrough create() {
            return builder().build();
        }

        /**
         * @return followIdr
         */
        public String getFollowIdr() {
            return this.followIdr;
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        /**
         * @return payloadContent
         */
        public String getPayloadContent() {
            return this.payloadContent;
        }

        /**
         * @return payloadContentKey
         */
        public String getPayloadContentKey() {
            return this.payloadContentKey;
        }

        public static final class Builder {
            private String followIdr; 
            private String interval; 
            private String payloadContent; 
            private String payloadContentKey; 

            private Builder() {
            } 

            private Builder(PassThrough model) {
                this.followIdr = model.followIdr;
                this.interval = model.interval;
                this.payloadContent = model.payloadContent;
                this.payloadContentKey = model.payloadContentKey;
            } 

            /**
             * <p>Indicates whether to add SEI messages to Instantaneous Decoder Refresh (IDR) frames. Valid values:</p>
             * <ul>
             * <li>0: does not add SEI messages.</li>
             * <li>1: adds SEI messages.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder followIdr(String followIdr) {
                this.followIdr = followIdr;
                return this;
            }

            /**
             * <p>The interval at which the SEI messages are added. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The payload content of the custom SEI.</p>
             * 
             * <strong>example:</strong>
             * <p>yourPayloadContent</p>
             */
            public Builder payloadContent(String payloadContent) {
                this.payloadContent = payloadContent;
                return this;
            }

            /**
             * <p>The key of the payload content. Default value: udd.</p>
             * 
             * <strong>example:</strong>
             * <p>yourPayloadContentKey</p>
             */
            public Builder payloadContentKey(String payloadContentKey) {
                this.payloadContentKey = payloadContentKey;
                return this;
            }

            public PassThrough build() {
                return new PassThrough(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUTaskDetailResponseBody</p>
     */
    public static class SeiParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LayoutVolume")
        private LayoutVolume layoutVolume;

        @com.aliyun.core.annotation.NameInMap("PassThrough")
        private PassThrough passThrough;

        @com.aliyun.core.annotation.NameInMap("PayloadType")
        private String payloadType;

        private SeiParams(Builder builder) {
            this.layoutVolume = builder.layoutVolume;
            this.passThrough = builder.passThrough;
            this.payloadType = builder.payloadType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SeiParams create() {
            return builder().build();
        }

        /**
         * @return layoutVolume
         */
        public LayoutVolume getLayoutVolume() {
            return this.layoutVolume;
        }

        /**
         * @return passThrough
         */
        public PassThrough getPassThrough() {
            return this.passThrough;
        }

        /**
         * @return payloadType
         */
        public String getPayloadType() {
            return this.payloadType;
        }

        public static final class Builder {
            private LayoutVolume layoutVolume; 
            private PassThrough passThrough; 
            private String payloadType; 

            private Builder() {
            } 

            private Builder(SeiParams model) {
                this.layoutVolume = model.layoutVolume;
                this.passThrough = model.passThrough;
                this.payloadType = model.payloadType;
            } 

            /**
             * <p>The layout and volume SEI. If the return value is an empty string, the default layout and volume SEI is used.</p>
             */
            public Builder layoutVolume(LayoutVolume layoutVolume) {
                this.layoutVolume = layoutVolume;
                return this;
            }

            /**
             * <p>The custom SEI.</p>
             */
            public Builder passThrough(PassThrough passThrough) {
                this.passThrough = passThrough;
                return this;
            }

            /**
             * <p>The custom payload type. Valid values: 100 to 254. Default value: 5.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder payloadType(String payloadType) {
                this.payloadType = payloadType;
                return this;
            }

            public SeiParams build() {
                return new SeiParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUTaskDetailResponseBody</p>
     */
    public static class SingleSubParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        private String streamType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private SingleSubParams(Builder builder) {
            this.sourceType = builder.sourceType;
            this.streamType = builder.streamType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SingleSubParams create() {
            return builder().build();
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return streamType
         */
        public String getStreamType() {
            return this.streamType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String sourceType; 
            private String streamType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(SingleSubParams model) {
                this.sourceType = model.sourceType;
                this.streamType = model.streamType;
                this.userId = model.userId;
            } 

            /**
             * <p>The source of the video. This parameter is valid only if you set StreamType to 2. Valid values:</p>
             * <ul>
             * <li>camera (default): captures the video by using a camera.</li>
             * <li>shareScreen: captures the content displayed on a screen.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>camera</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The type of the stream that is relayed. Valid values:</p>
             * <ul>
             * <li>0 (default): the original stream.</li>
             * <li>1: the audio-only stream.</li>
             * <li>2: the video-only stream.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder streamType(String streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * <p>The ID of the user whose stream is relayed. In single-stream relay mode, you can relay only one stream in a request.</p>
             * 
             * <strong>example:</strong>
             * <p>yourSubUserId</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public SingleSubParams build() {
                return new SingleSubParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUTaskDetailResponseBody</p>
     */
    public static class Background extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RenderMode")
        private String renderMode;

        @com.aliyun.core.annotation.NameInMap("URL")
        private String URL;

        private Background(Builder builder) {
            this.renderMode = builder.renderMode;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Background create() {
            return builder().build();
        }

        /**
         * @return renderMode
         */
        public String getRenderMode() {
            return this.renderMode;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String renderMode; 
            private String URL; 

            private Builder() {
            } 

            private Builder(Background model) {
                this.renderMode = model.renderMode;
                this.URL = model.URL;
            } 

            /**
             * <p>The display mode. Valid values:</p>
             * <ul>
             * <li>0: proportionally scales the video or background image to fit the pane. Black bars are added to fill the extra space.</li>
             * <li>1 (default): crops the video or background image to fit the pane.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder renderMode(String renderMode) {
                this.renderMode = renderMode;
                return this;
            }

            /**
             * <p>The URL of the global background image.</p>
             * 
             * <strong>example:</strong>
             * <p>yourImageUrl</p>
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public Background build() {
                return new Background(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUTaskDetailResponseBody</p>
     */
    public static class EncodeParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioBitrate")
        private String audioBitrate;

        @com.aliyun.core.annotation.NameInMap("AudioChannels")
        private String audioChannels;

        @com.aliyun.core.annotation.NameInMap("AudioOnly")
        private String audioOnly;

        @com.aliyun.core.annotation.NameInMap("AudioSampleRate")
        private String audioSampleRate;

        @com.aliyun.core.annotation.NameInMap("EnhancedParam")
        private String enhancedParam;

        @com.aliyun.core.annotation.NameInMap("VideoBitrate")
        private String videoBitrate;

        @com.aliyun.core.annotation.NameInMap("VideoCodec")
        private String videoCodec;

        @com.aliyun.core.annotation.NameInMap("VideoFramerate")
        private String videoFramerate;

        @com.aliyun.core.annotation.NameInMap("VideoGop")
        private String videoGop;

        @com.aliyun.core.annotation.NameInMap("VideoHeight")
        private String videoHeight;

        @com.aliyun.core.annotation.NameInMap("VideoWidth")
        private String videoWidth;

        private EncodeParams(Builder builder) {
            this.audioBitrate = builder.audioBitrate;
            this.audioChannels = builder.audioChannels;
            this.audioOnly = builder.audioOnly;
            this.audioSampleRate = builder.audioSampleRate;
            this.enhancedParam = builder.enhancedParam;
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

        public static EncodeParams create() {
            return builder().build();
        }

        /**
         * @return audioBitrate
         */
        public String getAudioBitrate() {
            return this.audioBitrate;
        }

        /**
         * @return audioChannels
         */
        public String getAudioChannels() {
            return this.audioChannels;
        }

        /**
         * @return audioOnly
         */
        public String getAudioOnly() {
            return this.audioOnly;
        }

        /**
         * @return audioSampleRate
         */
        public String getAudioSampleRate() {
            return this.audioSampleRate;
        }

        /**
         * @return enhancedParam
         */
        public String getEnhancedParam() {
            return this.enhancedParam;
        }

        /**
         * @return videoBitrate
         */
        public String getVideoBitrate() {
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
        public String getVideoFramerate() {
            return this.videoFramerate;
        }

        /**
         * @return videoGop
         */
        public String getVideoGop() {
            return this.videoGop;
        }

        /**
         * @return videoHeight
         */
        public String getVideoHeight() {
            return this.videoHeight;
        }

        /**
         * @return videoWidth
         */
        public String getVideoWidth() {
            return this.videoWidth;
        }

        public static final class Builder {
            private String audioBitrate; 
            private String audioChannels; 
            private String audioOnly; 
            private String audioSampleRate; 
            private String enhancedParam; 
            private String videoBitrate; 
            private String videoCodec; 
            private String videoFramerate; 
            private String videoGop; 
            private String videoHeight; 
            private String videoWidth; 

            private Builder() {
            } 

            private Builder(EncodeParams model) {
                this.audioBitrate = model.audioBitrate;
                this.audioChannels = model.audioChannels;
                this.audioOnly = model.audioOnly;
                this.audioSampleRate = model.audioSampleRate;
                this.enhancedParam = model.enhancedParam;
                this.videoBitrate = model.videoBitrate;
                this.videoCodec = model.videoCodec;
                this.videoFramerate = model.videoFramerate;
                this.videoGop = model.videoGop;
                this.videoHeight = model.videoHeight;
                this.videoWidth = model.videoWidth;
            } 

            /**
             * <p>The bitrate of the audio. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder audioBitrate(String audioBitrate) {
                this.audioBitrate = audioBitrate;
                return this;
            }

            /**
             * <p>The number of audio channels. Valid values: 1 and 2.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder audioChannels(String audioChannels) {
                this.audioChannels = audioChannels;
                return this;
            }

            /**
             * <p>Indicates whether the output stream is an audio-only stream. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder audioOnly(String audioOnly) {
                this.audioOnly = audioOnly;
                return this;
            }

            /**
             * <p>The audio sampling rate. Unit: Hz.</p>
             * 
             * <strong>example:</strong>
             * <p>44100</p>
             */
            public Builder audioSampleRate(String audioSampleRate) {
                this.audioSampleRate = audioSampleRate;
                return this;
            }

            /**
             * <p>The parameter for advanced video encoding. The value is a JSON string. Optional fields:</p>
             * <ul>
             * <li>profile: the encoding level. If the video encoding format is set to H.264, the valid values of this field are baseline, main, and high.</li>
             * <li>preset: adjusts the trade-off between encoding speed and video quality. Valid values: ultrafast, superfast, veryfast, faster, fast, medium, slow, slower, veryslow, and placebo. Each value specifies a level of trade-off between encoding speed and video quality. For example, the ultrafast preset has the fastest encoding speed but the lowest video quality, while the placebo preset sacrifices the encoding speed for the best video quality.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;profile&quot;: &quot;high&quot;, &quot;preset&quot;: &quot;veryfast&quot;}</p>
             */
            public Builder enhancedParam(String enhancedParam) {
                this.enhancedParam = enhancedParam;
                return this;
            }

            /**
             * <p>The bitrate of the video. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>3500</p>
             */
            public Builder videoBitrate(String videoBitrate) {
                this.videoBitrate = videoBitrate;
                return this;
            }

            /**
             * <p>The video encoding format. Default value: H.264.</p>
             * 
             * <strong>example:</strong>
             * <p>H.264</p>
             */
            public Builder videoCodec(String videoCodec) {
                this.videoCodec = videoCodec;
                return this;
            }

            /**
             * <p>The frame rate of the video. Unit: frames per second (FPS).</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder videoFramerate(String videoFramerate) {
                this.videoFramerate = videoFramerate;
                return this;
            }

            /**
             * <p>The group of pictures (GOP) size of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder videoGop(String videoGop) {
                this.videoGop = videoGop;
                return this;
            }

            /**
             * <p>The height of the video. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder videoHeight(String videoHeight) {
                this.videoHeight = videoHeight;
                return this;
            }

            /**
             * <p>The width of the video. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder videoWidth(String videoWidth) {
                this.videoWidth = videoWidth;
                return this;
            }

            public EncodeParams build() {
                return new EncodeParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUTaskDetailResponseBody</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserInfo(Builder builder) {
            this.channelId = builder.channelId;
            this.sourceType = builder.sourceType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String channelId; 
            private String sourceType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.channelId = model.channelId;
                this.sourceType = model.sourceType;
                this.userId = model.userId;
            } 

            /**
             * <p>The ID of the channel where the user is.</p>
             * 
             * <strong>example:</strong>
             * <p>yourChannelId</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The source of the video. This parameter is valid only if you set StreamType to 2. Valid values:</p>
             * <ul>
             * <li>camera (default): captures the video by using a camera.</li>
             * <li>shareScreen: captures the content displayed on a screen.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>camera</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>yourSubUserId</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUTaskDetailResponseBody</p>
     */
    public static class UserPanes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundImageUrl")
        private String backgroundImageUrl;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("RenderMode")
        private String renderMode;

        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private UserInfo userInfo;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        @com.aliyun.core.annotation.NameInMap("X")
        private String x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private String y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private String zOrder;

        private UserPanes(Builder builder) {
            this.backgroundImageUrl = builder.backgroundImageUrl;
            this.height = builder.height;
            this.renderMode = builder.renderMode;
            this.userInfo = builder.userInfo;
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
         * @return backgroundImageUrl
         */
        public String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return renderMode
         */
        public String getRenderMode() {
            return this.renderMode;
        }

        /**
         * @return userInfo
         */
        public UserInfo getUserInfo() {
            return this.userInfo;
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
        public String getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private String backgroundImageUrl; 
            private String height; 
            private String renderMode; 
            private UserInfo userInfo; 
            private String width; 
            private String x; 
            private String y; 
            private String zOrder; 

            private Builder() {
            } 

            private Builder(UserPanes model) {
                this.backgroundImageUrl = model.backgroundImageUrl;
                this.height = model.height;
                this.renderMode = model.renderMode;
                this.userInfo = model.userInfo;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * <p>The URL of the background image of the pane. This image is displayed if the user turns off the camera or is not present in the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>yourImageUrl</p>
             */
            public Builder backgroundImageUrl(String backgroundImageUrl) {
                this.backgroundImageUrl = backgroundImageUrl;
                return this;
            }

            /**
             * <p>The height of the pane. The value is normalized.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2632</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The display mode. Valid values:</p>
             * <ul>
             * <li>0: proportionally scales the video or background image to fit the pane. Black bars are added to fill the extra space.</li>
             * <li>1 (default): crops the video or background image to fit the pane.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder renderMode(String renderMode) {
                this.renderMode = renderMode;
                return this;
            }

            /**
             * <p>The information about the user whose stream is played in the pane.</p>
             */
            public Builder userInfo(UserInfo userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            /**
             * <p>The width of the pane. The value is normalized.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3564</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The x-coordinate of the pane. The value is normalized.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-coordinate of the pane. The value is normalized.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3789</p>
             */
            public Builder y(String y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The layer of the pane. A value of 0 indicates that the pane is placed at the bottom layer. A larger value indicates a higher layer.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder zOrder(String zOrder) {
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
     * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUTaskDetailResponseBody</p>
     */
    public static class Layout extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserPanes")
        private java.util.List<UserPanes> userPanes;

        private Layout(Builder builder) {
            this.userPanes = builder.userPanes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layout create() {
            return builder().build();
        }

        /**
         * @return userPanes
         */
        public java.util.List<UserPanes> getUserPanes() {
            return this.userPanes;
        }

        public static final class Builder {
            private java.util.List<UserPanes> userPanes; 

            private Builder() {
            } 

            private Builder(Layout model) {
                this.userPanes = model.userPanes;
            } 

            /**
             * <p>The information about the panes.</p>
             */
            public Builder userPanes(java.util.List<UserPanes> userPanes) {
                this.userPanes = userPanes;
                return this;
            }

            public Layout build() {
                return new Layout(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUTaskDetailResponseBody</p>
     */
    public static class UserInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        private String streamType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserInfos(Builder builder) {
            this.channelId = builder.channelId;
            this.sourceType = builder.sourceType;
            this.streamType = builder.streamType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfos create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return streamType
         */
        public String getStreamType() {
            return this.streamType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String channelId; 
            private String sourceType; 
            private String streamType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserInfos model) {
                this.channelId = model.channelId;
                this.sourceType = model.sourceType;
                this.streamType = model.streamType;
                this.userId = model.userId;
            } 

            /**
             * <p>The ID of the channel where the user is.</p>
             * 
             * <strong>example:</strong>
             * <p>yourChannelId</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The source of the video. This parameter is valid only if you set StreamType to 2. Valid values:</p>
             * <ul>
             * <li>camera (default): captures the video by using a camera.</li>
             * <li>shareScreen: captures the content displayed on a screen.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>camera</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The type of the stream that is relayed. Valid values:</p>
             * <ul>
             * <li>0 (default): the original stream.</li>
             * <li>1: the audio-only stream.</li>
             * <li>2: the video-only stream.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder streamType(String streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>yourSubUserId</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserInfos build() {
                return new UserInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUTaskDetailResponseBody</p>
     */
    public static class TranscodeParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Background")
        private Background background;

        @com.aliyun.core.annotation.NameInMap("EncodeParams")
        private EncodeParams encodeParams;

        @com.aliyun.core.annotation.NameInMap("Layout")
        private Layout layout;

        @com.aliyun.core.annotation.NameInMap("UserInfos")
        private java.util.List<UserInfos> userInfos;

        private TranscodeParams(Builder builder) {
            this.background = builder.background;
            this.encodeParams = builder.encodeParams;
            this.layout = builder.layout;
            this.userInfos = builder.userInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeParams create() {
            return builder().build();
        }

        /**
         * @return background
         */
        public Background getBackground() {
            return this.background;
        }

        /**
         * @return encodeParams
         */
        public EncodeParams getEncodeParams() {
            return this.encodeParams;
        }

        /**
         * @return layout
         */
        public Layout getLayout() {
            return this.layout;
        }

        /**
         * @return userInfos
         */
        public java.util.List<UserInfos> getUserInfos() {
            return this.userInfos;
        }

        public static final class Builder {
            private Background background; 
            private EncodeParams encodeParams; 
            private Layout layout; 
            private java.util.List<UserInfos> userInfos; 

            private Builder() {
            } 

            private Builder(TranscodeParams model) {
                this.background = model.background;
                this.encodeParams = model.encodeParams;
                this.layout = model.layout;
                this.userInfos = model.userInfos;
            } 

            /**
             * <p>The global background image.</p>
             */
            public Builder background(Background background) {
                this.background = background;
                return this;
            }

            /**
             * <p>The encoding parameters of the output stream.</p>
             */
            public Builder encodeParams(EncodeParams encodeParams) {
                this.encodeParams = encodeParams;
                return this;
            }

            /**
             * <p>The video layout information.</p>
             * <blockquote>
             * <p> The video layout information includes the x-coordinate, y-coordinate, width, height, and layer of the pane. For audio-only transcoding, no video layout information is returned.</p>
             * </blockquote>
             */
            public Builder layout(Layout layout) {
                this.layout = layout;
                return this;
            }

            /**
             * <p>The information about the user whose stream is mixed. If an empty value is returned, streams from all users are mixed.</p>
             */
            public Builder userInfos(java.util.List<UserInfos> userInfos) {
                this.userInfos = userInfos;
                return this;
            }

            public TranscodeParams build() {
                return new TranscodeParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRtcMPUTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListRtcMPUTaskDetailResponseBody</p>
     */
    public static class MPUTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("MaxIdleTime")
        private String maxIdleTime;

        @com.aliyun.core.annotation.NameInMap("MixMode")
        private String mixMode;

        @com.aliyun.core.annotation.NameInMap("MultiStreamURL")
        private java.util.List<MultiStreamURL> multiStreamURL;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SeiParams")
        private SeiParams seiParams;

        @com.aliyun.core.annotation.NameInMap("SingleSubParams")
        private SingleSubParams singleSubParams;

        @com.aliyun.core.annotation.NameInMap("StreamURL")
        private String streamURL;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TranscodeParams")
        private TranscodeParams transcodeParams;

        private MPUTasks(Builder builder) {
            this.appId = builder.appId;
            this.channelId = builder.channelId;
            this.maxIdleTime = builder.maxIdleTime;
            this.mixMode = builder.mixMode;
            this.multiStreamURL = builder.multiStreamURL;
            this.region = builder.region;
            this.seiParams = builder.seiParams;
            this.singleSubParams = builder.singleSubParams;
            this.streamURL = builder.streamURL;
            this.taskId = builder.taskId;
            this.transcodeParams = builder.transcodeParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MPUTasks create() {
            return builder().build();
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
         * @return maxIdleTime
         */
        public String getMaxIdleTime() {
            return this.maxIdleTime;
        }

        /**
         * @return mixMode
         */
        public String getMixMode() {
            return this.mixMode;
        }

        /**
         * @return multiStreamURL
         */
        public java.util.List<MultiStreamURL> getMultiStreamURL() {
            return this.multiStreamURL;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return seiParams
         */
        public SeiParams getSeiParams() {
            return this.seiParams;
        }

        /**
         * @return singleSubParams
         */
        public SingleSubParams getSingleSubParams() {
            return this.singleSubParams;
        }

        /**
         * @return streamURL
         */
        public String getStreamURL() {
            return this.streamURL;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return transcodeParams
         */
        public TranscodeParams getTranscodeParams() {
            return this.transcodeParams;
        }

        public static final class Builder {
            private String appId; 
            private String channelId; 
            private String maxIdleTime; 
            private String mixMode; 
            private java.util.List<MultiStreamURL> multiStreamURL; 
            private String region; 
            private SeiParams seiParams; 
            private SingleSubParams singleSubParams; 
            private String streamURL; 
            private String taskId; 
            private TranscodeParams transcodeParams; 

            private Builder() {
            } 

            private Builder(MPUTasks model) {
                this.appId = model.appId;
                this.channelId = model.channelId;
                this.maxIdleTime = model.maxIdleTime;
                this.mixMode = model.mixMode;
                this.multiStreamURL = model.multiStreamURL;
                this.region = model.region;
                this.seiParams = model.seiParams;
                this.singleSubParams = model.singleSubParams;
                this.streamURL = model.streamURL;
                this.taskId = model.taskId;
                this.transcodeParams = model.transcodeParams;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>yourAppId</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The ID of the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>yourChannelId</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The timeout period of an idle connection. Unit: seconds.</p>
             * <blockquote>
             * <p> If the task is idle for a period of time longer than the duration specified by the MaxIdleTime parameter, the task is automatically stopped. If the parameter is not specified, the task is stopped after the channel is closed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxIdleTime(String maxIdleTime) {
                this.maxIdleTime = maxIdleTime;
                return this;
            }

            /**
             * <p>The stream mixing mode. Valid values:</p>
             * <ul>
             * <li>0: relays the original single stream without mixing streams. If the value of this parameter is 0, the TranscodeParams parameter is empty.</li>
             * <li>1 (default): mixes multiple streams into a single stream and relays the mixed stream.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mixMode(String mixMode) {
                this.mixMode = mixMode;
                return this;
            }

            /**
             * <p>The multiple ingest URLs relayed.</p>
             */
            public Builder multiStreamURL(java.util.List<MultiStreamURL> multiStreamURL) {
                this.multiStreamURL = multiStreamURL;
                return this;
            }

            /**
             * <p>The region in which the streams are mixed. Valid values:</p>
             * <ul>
             * <li><strong>CN-shanghai</strong></li>
             * <li><strong>AP-Singapore (default)</strong></li>
             * <li><strong>EMAA-Saudi</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CN-Shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The supplemental enhancement information (SEI) parameters.</p>
             */
            public Builder seiParams(SeiParams seiParams) {
                this.seiParams = seiParams;
                return this;
            }

            /**
             * <p>The parameters of the single-stream relay task.</p>
             */
            public Builder singleSubParams(SingleSubParams singleSubParams) {
                this.singleSubParams = singleSubParams;
                return this;
            }

            /**
             * <p>The ingest URL.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://example.com/live/stream****</p>
             */
            public Builder streamURL(String streamURL) {
                this.streamURL = streamURL;
                return this;
            }

            /**
             * <p>The ID of the stream relay task.</p>
             * 
             * <strong>example:</strong>
             * <p>yourTaskId</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The mixed-stream relay parameters.</p>
             */
            public Builder transcodeParams(TranscodeParams transcodeParams) {
                this.transcodeParams = transcodeParams;
                return this;
            }

            public MPUTasks build() {
                return new MPUTasks(this);
            } 

        } 

    }
}
