// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamMonitorListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamMonitorListResponseBody</p>
 */
public class DescribeLiveStreamMonitorListResponseBody extends TeaModel {
    @NameInMap("LiveStreamMonitorList")
    private java.util.List < LiveStreamMonitorList> liveStreamMonitorList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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

    /**
     * @return liveStreamMonitorList
     */
    public java.util.List < LiveStreamMonitorList> getLiveStreamMonitorList() {
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
        private java.util.List < LiveStreamMonitorList> liveStreamMonitorList; 
        private String requestId; 
        private Integer total; 

        /**
         * LiveStreamMonitorList.
         */
        public Builder liveStreamMonitorList(java.util.List < LiveStreamMonitorList> liveStreamMonitorList) {
            this.liveStreamMonitorList = liveStreamMonitorList;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeLiveStreamMonitorListResponseBody build() {
            return new DescribeLiveStreamMonitorListResponseBody(this);
        } 

    } 

    public static class LayoutConfig extends TeaModel {
        @NameInMap("FillMode")
        private String fillMode;

        @NameInMap("PositionNormalized")
        private java.util.List < Float > positionNormalized;

        @NameInMap("PositionRefer")
        private String positionRefer;

        @NameInMap("SizeNormalized")
        private java.util.List < Float > sizeNormalized;

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
        public java.util.List < Float > getPositionNormalized() {
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
        public java.util.List < Float > getSizeNormalized() {
            return this.sizeNormalized;
        }

        public static final class Builder {
            private String fillMode; 
            private java.util.List < Float > positionNormalized; 
            private String positionRefer; 
            private java.util.List < Float > sizeNormalized; 

            /**
             * FillMode.
             */
            public Builder fillMode(String fillMode) {
                this.fillMode = fillMode;
                return this;
            }

            /**
             * PositionNormalized.
             */
            public Builder positionNormalized(java.util.List < Float > positionNormalized) {
                this.positionNormalized = positionNormalized;
                return this;
            }

            /**
             * PositionRefer.
             */
            public Builder positionRefer(String positionRefer) {
                this.positionRefer = positionRefer;
                return this;
            }

            /**
             * SizeNormalized.
             */
            public Builder sizeNormalized(java.util.List < Float > sizeNormalized) {
                this.sizeNormalized = sizeNormalized;
                return this;
            }

            public LayoutConfig build() {
                return new LayoutConfig(this);
            } 

        } 

    }
    public static class PlayConfig extends TeaModel {
        @NameInMap("VolumeRate")
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

            /**
             * VolumeRate.
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
    public static class InputList extends TeaModel {
        @NameInMap("Index")
        private Integer index;

        @NameInMap("InputUrl")
        private String inputUrl;

        @NameInMap("LayoutConfig")
        private LayoutConfig layoutConfig;

        @NameInMap("LayoutId")
        private Integer layoutId;

        @NameInMap("PlayConfig")
        private PlayConfig playConfig;

        @NameInMap("StreamName")
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

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * InputUrl.
             */
            public Builder inputUrl(String inputUrl) {
                this.inputUrl = inputUrl;
                return this;
            }

            /**
             * LayoutConfig.
             */
            public Builder layoutConfig(LayoutConfig layoutConfig) {
                this.layoutConfig = layoutConfig;
                return this;
            }

            /**
             * LayoutId.
             */
            public Builder layoutId(Integer layoutId) {
                this.layoutId = layoutId;
                return this;
            }

            /**
             * PlayConfig.
             */
            public Builder playConfig(PlayConfig playConfig) {
                this.playConfig = playConfig;
                return this;
            }

            /**
             * StreamName.
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
    public static class OutputUrls extends TeaModel {
        @NameInMap("FlvUrl")
        private String flvUrl;

        @NameInMap("RtmpUrl")
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

            /**
             * FlvUrl.
             */
            public Builder flvUrl(String flvUrl) {
                this.flvUrl = flvUrl;
                return this;
            }

            /**
             * RtmpUrl.
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
    public static class LiveStreamMonitorList extends TeaModel {
        @NameInMap("AudioFrom")
        private Integer audioFrom;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("InputList")
        private java.util.List < InputList> inputList;

        @NameInMap("MonitorId")
        private String monitorId;

        @NameInMap("MonitorName")
        private String monitorName;

        @NameInMap("OutputTemplate")
        private String outputTemplate;

        @NameInMap("OutputUrls")
        private OutputUrls outputUrls;

        @NameInMap("Region")
        private String region;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StopTime")
        private String stopTime;

        private LiveStreamMonitorList(Builder builder) {
            this.audioFrom = builder.audioFrom;
            this.domain = builder.domain;
            this.inputList = builder.inputList;
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
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return inputList
         */
        public java.util.List < InputList> getInputList() {
            return this.inputList;
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
            private String domain; 
            private java.util.List < InputList> inputList; 
            private String monitorId; 
            private String monitorName; 
            private String outputTemplate; 
            private OutputUrls outputUrls; 
            private String region; 
            private String startTime; 
            private Integer status; 
            private String stopTime; 

            /**
             * AudioFrom.
             */
            public Builder audioFrom(Integer audioFrom) {
                this.audioFrom = audioFrom;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * InputList.
             */
            public Builder inputList(java.util.List < InputList> inputList) {
                this.inputList = inputList;
                return this;
            }

            /**
             * MonitorId.
             */
            public Builder monitorId(String monitorId) {
                this.monitorId = monitorId;
                return this;
            }

            /**
             * MonitorName.
             */
            public Builder monitorName(String monitorName) {
                this.monitorName = monitorName;
                return this;
            }

            /**
             * OutputTemplate.
             */
            public Builder outputTemplate(String outputTemplate) {
                this.outputTemplate = outputTemplate;
                return this;
            }

            /**
             * OutputUrls.
             */
            public Builder outputUrls(OutputUrls outputUrls) {
                this.outputUrls = outputUrls;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * StopTime.
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
