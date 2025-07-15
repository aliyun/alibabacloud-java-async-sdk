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
 * {@link DescribeLiveStreamMonitorListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamMonitorListResponseBody</p>
 */
public class DescribeLiveStreamMonitorListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveStreamMonitorList")
    private java.util.List<LiveStreamMonitorList> liveStreamMonitorList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeLiveStreamMonitorListResponseBody(Builder builder) {
        this.liveStreamMonitorList = builder.liveStreamMonitorList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamMonitorListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveStreamMonitorList
     */
    public java.util.List<LiveStreamMonitorList> getLiveStreamMonitorList() {
        return this.liveStreamMonitorList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<LiveStreamMonitorList> liveStreamMonitorList; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamMonitorListResponseBody model) {
            this.liveStreamMonitorList = model.liveStreamMonitorList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The list of monitoring sessions.</p>
         */
        public Builder liveStreamMonitorList(java.util.List<LiveStreamMonitorList> liveStreamMonitorList) {
            this.liveStreamMonitorList = liveStreamMonitorList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2234baba-a586-46ea-8bd4-c8f7891abcdef</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of monitoring sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeLiveStreamMonitorListResponseBody build() {
            return new DescribeLiveStreamMonitorListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamMonitorListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamMonitorListResponseBody</p>
     */
    public static class LayoutConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FillMode")
        private String fillMode;

        @com.aliyun.core.annotation.NameInMap("PositionNormalized")
        private java.util.List<Float> positionNormalized;

        @com.aliyun.core.annotation.NameInMap("PositionRefer")
        private String positionRefer;

        @com.aliyun.core.annotation.NameInMap("SizeNormalized")
        private java.util.List<Float> sizeNormalized;

        private LayoutConfig(Builder builder) {
            this.fillMode = builder.fillMode;
            this.positionNormalized = builder.positionNormalized;
            this.positionRefer = builder.positionRefer;
            this.sizeNormalized = builder.sizeNormalized;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayoutConfig create() {
            return builder().build();
        }

        /**
         * @return fillMode
         */
        public String getFillMode() {
            return this.fillMode;
        }

        /**
         * @return positionNormalized
         */
        public java.util.List<Float> getPositionNormalized() {
            return this.positionNormalized;
        }

        /**
         * @return positionRefer
         */
        public String getPositionRefer() {
            return this.positionRefer;
        }

        /**
         * @return sizeNormalized
         */
        public java.util.List<Float> getSizeNormalized() {
            return this.sizeNormalized;
        }

        public static final class Builder {
            private String fillMode; 
            private java.util.List<Float> positionNormalized; 
            private String positionRefer; 
            private java.util.List<Float> sizeNormalized; 

            private Builder() {
            } 

            private Builder(LayoutConfig model) {
                this.fillMode = model.fillMode;
                this.positionNormalized = model.positionNormalized;
                this.positionRefer = model.positionRefer;
                this.sizeNormalized = model.sizeNormalized;
            } 

            /**
             * <p>The fill type. Set this value to none.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder fillMode(String fillMode) {
                this.fillMode = fillMode;
                return this;
            }

            /**
             * <p>The position of the layer, in the format of [unk][x,y][unk]. The values of x and y need to be normalized.</p>
             */
            public Builder positionNormalized(java.util.List<Float> positionNormalized) {
                this.positionNormalized = positionNormalized;
                return this;
            }

            /**
             * <p>The reference position of the element. Valid values:</p>
             * <ul>
             * <li>topLeft</li>
             * <li>topRight</li>
             * <li>bottomLeft</li>
             * <li>bottomRight</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>topLeft</p>
             */
            public Builder positionRefer(String positionRefer) {
                this.positionRefer = positionRefer;
                return this;
            }

            /**
             * <p>The size of the layer. Unit: bytes.</p>
             */
            public Builder sizeNormalized(java.util.List<Float> sizeNormalized) {
                this.sizeNormalized = sizeNormalized;
                return this;
            }

            public LayoutConfig build() {
                return new LayoutConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamMonitorListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamMonitorListResponseBody</p>
     */
    public static class PlayConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VolumeRate")
        private Float volumeRate;

        private PlayConfig(Builder builder) {
            this.volumeRate = builder.volumeRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayConfig create() {
            return builder().build();
        }

        /**
         * @return volumeRate
         */
        public Float getVolumeRate() {
            return this.volumeRate;
        }

        public static final class Builder {
            private Float volumeRate; 

            private Builder() {
            } 

            private Builder(PlayConfig model) {
                this.volumeRate = model.volumeRate;
            } 

            /**
             * <p>The volume. Valid values: 0 to 1. The value is rounded to two decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>0.50</p>
             */
            public Builder volumeRate(Float volumeRate) {
                this.volumeRate = volumeRate;
                return this;
            }

            public PlayConfig build() {
                return new PlayConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamMonitorListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamMonitorListResponseBody</p>
     */
    public static class InputList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("InputUrl")
        private String inputUrl;

        @com.aliyun.core.annotation.NameInMap("LayoutConfig")
        private LayoutConfig layoutConfig;

        @com.aliyun.core.annotation.NameInMap("LayoutId")
        private Integer layoutId;

        @com.aliyun.core.annotation.NameInMap("PlayConfig")
        private PlayConfig playConfig;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        private InputList(Builder builder) {
            this.index = builder.index;
            this.inputUrl = builder.inputUrl;
            this.layoutConfig = builder.layoutConfig;
            this.layoutId = builder.layoutId;
            this.playConfig = builder.playConfig;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputList create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return inputUrl
         */
        public String getInputUrl() {
            return this.inputUrl;
        }

        /**
         * @return layoutConfig
         */
        public LayoutConfig getLayoutConfig() {
            return this.layoutConfig;
        }

        /**
         * @return layoutId
         */
        public Integer getLayoutId() {
            return this.layoutId;
        }

        /**
         * @return playConfig
         */
        public PlayConfig getPlayConfig() {
            return this.playConfig;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private Integer index; 
            private String inputUrl; 
            private LayoutConfig layoutConfig; 
            private Integer layoutId; 
            private PlayConfig playConfig; 
            private String streamName; 

            private Builder() {
            } 

            private Builder(InputList model) {
                this.index = model.index;
                this.inputUrl = model.inputUrl;
                this.layoutConfig = model.layoutConfig;
                this.layoutId = model.layoutId;
                this.playConfig = model.playConfig;
                this.streamName = model.streamName;
            } 

            /**
             * <p>The index.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The URL of the input stream.</p>
             * 
             * <strong>example:</strong>
             * <p>demo.aliyundoc.com</p>
             */
            public Builder inputUrl(String inputUrl) {
                this.inputUrl = inputUrl;
                return this;
            }

            /**
             * <p>The layout information.</p>
             */
            public Builder layoutConfig(LayoutConfig layoutConfig) {
                this.layoutConfig = layoutConfig;
                return this;
            }

            /**
             * <p>The layout ID, which must start from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder layoutId(Integer layoutId) {
                this.layoutId = layoutId;
                return this;
            }

            /**
             * <p>The playback configurations.</p>
             */
            public Builder playConfig(PlayConfig playConfig) {
                this.playConfig = playConfig;
                return this;
            }

            /**
             * <p>The display name of the monitored stream.</p>
             * 
             * <strong>example:</strong>
             * <p>monitorStream****</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public InputList build() {
                return new InputList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamMonitorListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamMonitorListResponseBody</p>
     */
    public static class OutputUrls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlvUrl")
        private String flvUrl;

        @com.aliyun.core.annotation.NameInMap("RtmpUrl")
        private String rtmpUrl;

        private OutputUrls(Builder builder) {
            this.flvUrl = builder.flvUrl;
            this.rtmpUrl = builder.rtmpUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputUrls create() {
            return builder().build();
        }

        /**
         * @return flvUrl
         */
        public String getFlvUrl() {
            return this.flvUrl;
        }

        /**
         * @return rtmpUrl
         */
        public String getRtmpUrl() {
            return this.rtmpUrl;
        }

        public static final class Builder {
            private String flvUrl; 
            private String rtmpUrl; 

            private Builder() {
            } 

            private Builder(OutputUrls model) {
                this.flvUrl = model.flvUrl;
                this.rtmpUrl = model.rtmpUrl;
            } 

            /**
             * <p>The output URL in the Flash Video (FLV) format.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://demo.aliyundoc.com/monitor/445409ec-7eaa-461d-8f29-4bec2eb9****.flv">http://demo.aliyundoc.com/monitor/445409ec-7eaa-461d-8f29-4bec2eb9****.flv</a></p>
             */
            public Builder flvUrl(String flvUrl) {
                this.flvUrl = flvUrl;
                return this;
            }

            /**
             * <p>The output URL in the Real-Time Messaging Protocol (RTMP) format.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://demo.aliyundoc.com/monitor/445409ec-7eaa-461d-8f29-4bec2eb9****</p>
             */
            public Builder rtmpUrl(String rtmpUrl) {
                this.rtmpUrl = rtmpUrl;
                return this;
            }

            public OutputUrls build() {
                return new OutputUrls(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamMonitorListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamMonitorListResponseBody</p>
     */
    public static class LiveStreamMonitorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioFrom")
        private Integer audioFrom;

        @com.aliyun.core.annotation.NameInMap("CallbackUrl")
        private String callbackUrl;

        @com.aliyun.core.annotation.NameInMap("DingTalkWebHookUrl")
        private String dingTalkWebHookUrl;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("InputList")
        private java.util.List<InputList> inputList;

        @com.aliyun.core.annotation.NameInMap("MonitorConfig")
        private String monitorConfig;

        @com.aliyun.core.annotation.NameInMap("MonitorId")
        private String monitorId;

        @com.aliyun.core.annotation.NameInMap("MonitorName")
        private String monitorName;

        @com.aliyun.core.annotation.NameInMap("OutputTemplate")
        private String outputTemplate;

        @com.aliyun.core.annotation.NameInMap("OutputUrls")
        private OutputUrls outputUrls;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private String stopTime;

        private LiveStreamMonitorList(Builder builder) {
            this.audioFrom = builder.audioFrom;
            this.callbackUrl = builder.callbackUrl;
            this.dingTalkWebHookUrl = builder.dingTalkWebHookUrl;
            this.domain = builder.domain;
            this.inputList = builder.inputList;
            this.monitorConfig = builder.monitorConfig;
            this.monitorId = builder.monitorId;
            this.monitorName = builder.monitorName;
            this.outputTemplate = builder.outputTemplate;
            this.outputUrls = builder.outputUrls;
            this.region = builder.region;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.stopTime = builder.stopTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamMonitorList create() {
            return builder().build();
        }

        /**
         * @return audioFrom
         */
        public Integer getAudioFrom() {
            return this.audioFrom;
        }

        /**
         * @return callbackUrl
         */
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        /**
         * @return dingTalkWebHookUrl
         */
        public String getDingTalkWebHookUrl() {
            return this.dingTalkWebHookUrl;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return inputList
         */
        public java.util.List<InputList> getInputList() {
            return this.inputList;
        }

        /**
         * @return monitorConfig
         */
        public String getMonitorConfig() {
            return this.monitorConfig;
        }

        /**
         * @return monitorId
         */
        public String getMonitorId() {
            return this.monitorId;
        }

        /**
         * @return monitorName
         */
        public String getMonitorName() {
            return this.monitorName;
        }

        /**
         * @return outputTemplate
         */
        public String getOutputTemplate() {
            return this.outputTemplate;
        }

        /**
         * @return outputUrls
         */
        public OutputUrls getOutputUrls() {
            return this.outputUrls;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return stopTime
         */
        public String getStopTime() {
            return this.stopTime;
        }

        public static final class Builder {
            private Integer audioFrom; 
            private String callbackUrl; 
            private String dingTalkWebHookUrl; 
            private String domain; 
            private java.util.List<InputList> inputList; 
            private String monitorConfig; 
            private String monitorId; 
            private String monitorName; 
            private String outputTemplate; 
            private OutputUrls outputUrls; 
            private String region; 
            private String startTime; 
            private Integer status; 
            private String stopTime; 

            private Builder() {
            } 

            private Builder(LiveStreamMonitorList model) {
                this.audioFrom = model.audioFrom;
                this.callbackUrl = model.callbackUrl;
                this.dingTalkWebHookUrl = model.dingTalkWebHookUrl;
                this.domain = model.domain;
                this.inputList = model.inputList;
                this.monitorConfig = model.monitorConfig;
                this.monitorId = model.monitorId;
                this.monitorName = model.monitorName;
                this.outputTemplate = model.outputTemplate;
                this.outputUrls = model.outputUrls;
                this.region = model.region;
                this.startTime = model.startTime;
                this.status = model.status;
                this.stopTime = model.stopTime;
            } 

            /**
             * <p>The audio source in the layout.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder audioFrom(Integer audioFrom) {
                this.audioFrom = audioFrom;
                return this;
            }

            /**
             * <p>The callback URL that sends monitoring alerts.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://guide.aliyundoc.com/notify">http://guide.aliyundoc.com/notify</a></p>
             */
            public Builder callbackUrl(String callbackUrl) {
                this.callbackUrl = callbackUrl;
                return this;
            }

            /**
             * <p>The URL of the DingTalk chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa">https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa</a>****</p>
             */
            public Builder dingTalkWebHookUrl(String dingTalkWebHookUrl) {
                this.dingTalkWebHookUrl = dingTalkWebHookUrl;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo.aliyundoc.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The list of monitored input streams.</p>
             */
            public Builder inputList(java.util.List<InputList> inputList) {
                this.inputList = inputList;
                return this;
            }

            /**
             * <p>The monitoring alert thresholds. The following fields are included:</p>
             * <ul>
             * <li>fpsLowThres: the video frame rate alert threshold. The value is a floating-point number.</li>
             * <li>brHighThres: the audio/video bitrate alert threshold. The value is a floating-point number.</li>
             * <li>eofDurationThresSec: the interruption duration alert threshold. The value is a floating-point number.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;fpsLowThres&quot;: 0.6,&quot;brLowThres&quot;: 1.1,&quot;eofDurationThresSec&quot;: 10}&quot;</p>
             */
            public Builder monitorConfig(String monitorConfig) {
                this.monitorConfig = monitorConfig;
                return this;
            }

            /**
             * <p>The ID of the monitoring session.</p>
             * 
             * <strong>example:</strong>
             * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
             */
            public Builder monitorId(String monitorId) {
                this.monitorId = monitorId;
                return this;
            }

            /**
             * <p>The name of the monitoring session.</p>
             * 
             * <strong>example:</strong>
             * <p>liveMonito****</p>
             */
            public Builder monitorName(String monitorName) {
                this.monitorName = monitorName;
                return this;
            }

            /**
             * <p>The output resolution template. Valid values:</p>
             * <ul>
             * <li><strong>lp_ld</strong>: low definition</li>
             * <li><strong>lp_sd</strong>: standard definition</li>
             * <li><strong>lp_hd</strong>: high definition</li>
             * <li><strong>lp_ud</strong>: ultra-high definition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lp_ud</p>
             */
            public Builder outputTemplate(String outputTemplate) {
                this.outputTemplate = outputTemplate;
                return this;
            }

            /**
             * <p>The output URLs.</p>
             */
            public Builder outputUrls(OutputUrls outputUrls) {
                this.outputUrls = outputUrls;
                return this;
            }

            /**
             * <p>The ID of the region. Valid values:</p>
             * <ul>
             * <li>cn-shanghai: China (Shanghai)</li>
             * <li>cn-beijing: China (Beijing)</li>
             * <li>ap-southeast-1: Singapore</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The start time of live monitoring. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-11T12:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the monitoring session. Valid values:</p>
             * <ul>
             * <li>1: Monitoring</li>
             * <li>0: Unmonitored</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The end time of live monitoring. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-11T12:00:00Z</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            public LiveStreamMonitorList build() {
                return new LiveStreamMonitorList(this);
            } 

        } 

    }
}
