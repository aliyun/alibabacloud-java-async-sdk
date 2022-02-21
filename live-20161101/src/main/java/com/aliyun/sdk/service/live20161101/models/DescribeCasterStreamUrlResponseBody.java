// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterStreamUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterStreamUrlResponseBody</p>
 */
public class DescribeCasterStreamUrlResponseBody extends TeaModel {
    @NameInMap("CasterId")
    private String casterId;

    @NameInMap("CasterStreams")
    private CasterStreams casterStreams;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private DescribeCasterStreamUrlResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.casterStreams = builder.casterStreams;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterStreamUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return casterStreams
     */
    public CasterStreams getCasterStreams() {
        return this.casterStreams;
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
        private String casterId; 
        private CasterStreams casterStreams; 
        private String requestId; 
        private Integer total; 

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * CasterStreams.
         */
        public Builder casterStreams(CasterStreams casterStreams) {
            this.casterStreams = casterStreams;
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

        public DescribeCasterStreamUrlResponseBody build() {
            return new DescribeCasterStreamUrlResponseBody(this);
        } 

    } 

    public static class StreamInfo extends TeaModel {
        @NameInMap("OutputStreamUrl")
        private String outputStreamUrl;

        @NameInMap("TranscodeConfig")
        private String transcodeConfig;

        @NameInMap("VideoFormat")
        private String videoFormat;

        private StreamInfo(Builder builder) {
            this.outputStreamUrl = builder.outputStreamUrl;
            this.transcodeConfig = builder.transcodeConfig;
            this.videoFormat = builder.videoFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamInfo create() {
            return builder().build();
        }

        /**
         * @return outputStreamUrl
         */
        public String getOutputStreamUrl() {
            return this.outputStreamUrl;
        }

        /**
         * @return transcodeConfig
         */
        public String getTranscodeConfig() {
            return this.transcodeConfig;
        }

        /**
         * @return videoFormat
         */
        public String getVideoFormat() {
            return this.videoFormat;
        }

        public static final class Builder {
            private String outputStreamUrl; 
            private String transcodeConfig; 
            private String videoFormat; 

            /**
             * OutputStreamUrl.
             */
            public Builder outputStreamUrl(String outputStreamUrl) {
                this.outputStreamUrl = outputStreamUrl;
                return this;
            }

            /**
             * TranscodeConfig.
             */
            public Builder transcodeConfig(String transcodeConfig) {
                this.transcodeConfig = transcodeConfig;
                return this;
            }

            /**
             * VideoFormat.
             */
            public Builder videoFormat(String videoFormat) {
                this.videoFormat = videoFormat;
                return this;
            }

            public StreamInfo build() {
                return new StreamInfo(this);
            } 

        } 

    }
    public static class StreamInfos extends TeaModel {
        @NameInMap("StreamInfo")
        private java.util.List < StreamInfo> streamInfo;

        private StreamInfos(Builder builder) {
            this.streamInfo = builder.streamInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamInfos create() {
            return builder().build();
        }

        /**
         * @return streamInfo
         */
        public java.util.List < StreamInfo> getStreamInfo() {
            return this.streamInfo;
        }

        public static final class Builder {
            private java.util.List < StreamInfo> streamInfo; 

            /**
             * StreamInfo.
             */
            public Builder streamInfo(java.util.List < StreamInfo> streamInfo) {
                this.streamInfo = streamInfo;
                return this;
            }

            public StreamInfos build() {
                return new StreamInfos(this);
            } 

        } 

    }
    public static class CasterStream extends TeaModel {
        @NameInMap("OutputType")
        private Integer outputType;

        @NameInMap("RtmpUrl")
        private String rtmpUrl;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("StreamInfos")
        private StreamInfos streamInfos;

        @NameInMap("StreamUrl")
        private String streamUrl;

        private CasterStream(Builder builder) {
            this.outputType = builder.outputType;
            this.rtmpUrl = builder.rtmpUrl;
            this.sceneId = builder.sceneId;
            this.streamInfos = builder.streamInfos;
            this.streamUrl = builder.streamUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CasterStream create() {
            return builder().build();
        }

        /**
         * @return outputType
         */
        public Integer getOutputType() {
            return this.outputType;
        }

        /**
         * @return rtmpUrl
         */
        public String getRtmpUrl() {
            return this.rtmpUrl;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return streamInfos
         */
        public StreamInfos getStreamInfos() {
            return this.streamInfos;
        }

        /**
         * @return streamUrl
         */
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public static final class Builder {
            private Integer outputType; 
            private String rtmpUrl; 
            private String sceneId; 
            private StreamInfos streamInfos; 
            private String streamUrl; 

            /**
             * OutputType.
             */
            public Builder outputType(Integer outputType) {
                this.outputType = outputType;
                return this;
            }

            /**
             * RtmpUrl.
             */
            public Builder rtmpUrl(String rtmpUrl) {
                this.rtmpUrl = rtmpUrl;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * StreamInfos.
             */
            public Builder streamInfos(StreamInfos streamInfos) {
                this.streamInfos = streamInfos;
                return this;
            }

            /**
             * StreamUrl.
             */
            public Builder streamUrl(String streamUrl) {
                this.streamUrl = streamUrl;
                return this;
            }

            public CasterStream build() {
                return new CasterStream(this);
            } 

        } 

    }
    public static class CasterStreams extends TeaModel {
        @NameInMap("CasterStream")
        private java.util.List < CasterStream> casterStream;

        private CasterStreams(Builder builder) {
            this.casterStream = builder.casterStream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CasterStreams create() {
            return builder().build();
        }

        /**
         * @return casterStream
         */
        public java.util.List < CasterStream> getCasterStream() {
            return this.casterStream;
        }

        public static final class Builder {
            private java.util.List < CasterStream> casterStream; 

            /**
             * CasterStream.
             */
            public Builder casterStream(java.util.List < CasterStream> casterStream) {
                this.casterStream = casterStream;
                return this;
            }

            public CasterStreams build() {
                return new CasterStreams(this);
            } 

        } 

    }
}
