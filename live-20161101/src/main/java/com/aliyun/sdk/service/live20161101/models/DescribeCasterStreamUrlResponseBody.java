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
 * {@link DescribeCasterStreamUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterStreamUrlResponseBody</p>
 */
public class DescribeCasterStreamUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.NameInMap("CasterStreams")
    private CasterStreams casterStreams;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCasterStreamUrlResponseBody model) {
            this.casterId = model.casterId;
            this.casterStreams = model.casterStreams;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The ID of the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The information about the streams of the production studio.</p>
         */
        public Builder casterStreams(CasterStreams casterStreams) {
            this.casterStreams = casterStreams;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of streams that were returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeCasterStreamUrlResponseBody build() {
            return new DescribeCasterStreamUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCasterStreamUrlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterStreamUrlResponseBody</p>
     */
    public static class StreamInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutputStreamUrl")
        private String outputStreamUrl;

        @com.aliyun.core.annotation.NameInMap("TranscodeConfig")
        private String transcodeConfig;

        @com.aliyun.core.annotation.NameInMap("VideoFormat")
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

            private Builder() {
            } 

            private Builder(StreamInfo model) {
                this.outputStreamUrl = model.outputStreamUrl;
                this.transcodeConfig = model.transcodeConfig;
                this.videoFormat = model.videoFormat;
            } 

            /**
             * <p>The streaming URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://out/caster/example.net">http://out/caster/example.net</a></p>
             */
            public Builder outputStreamUrl(String outputStreamUrl) {
                this.outputStreamUrl = outputStreamUrl;
                return this;
            }

            /**
             * <p>The resolution to which the scene transcodes the stream for playback. Valid values:</p>
             * <ul>
             * <li><strong>lsd</strong>: standard definition.</li>
             * <li><strong>lld</strong>: low definition.</li>
             * <li><strong>lud</strong>: ultra high definition.</li>
             * <li><strong>lhd</strong>: high definition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lld</p>
             */
            public Builder transcodeConfig(String transcodeConfig) {
                this.transcodeConfig = transcodeConfig;
                return this;
            }

            /**
             * <p>The format to which the scene transcodes the stream for playback. Valid values:</p>
             * <ul>
             * <li><strong>flv</strong>.</li>
             * <li><strong>rtmp</strong>.</li>
             * <li><strong>m3u8</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>flv</p>
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
    /**
     * 
     * {@link DescribeCasterStreamUrlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterStreamUrlResponseBody</p>
     */
    public static class StreamInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StreamInfo")
        private java.util.List<StreamInfo> streamInfo;

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
        public java.util.List<StreamInfo> getStreamInfo() {
            return this.streamInfo;
        }

        public static final class Builder {
            private java.util.List<StreamInfo> streamInfo; 

            private Builder() {
            } 

            private Builder(StreamInfos model) {
                this.streamInfo = model.streamInfo;
            } 

            /**
             * StreamInfo.
             */
            public Builder streamInfo(java.util.List<StreamInfo> streamInfo) {
                this.streamInfo = streamInfo;
                return this;
            }

            public StreamInfos build() {
                return new StreamInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterStreamUrlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterStreamUrlResponseBody</p>
     */
    public static class CasterStream extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutputType")
        private Integer outputType;

        @com.aliyun.core.annotation.NameInMap("RtmpUrl")
        private String rtmpUrl;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("StreamInfos")
        private StreamInfos streamInfos;

        @com.aliyun.core.annotation.NameInMap("StreamUrl")
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

            private Builder() {
            } 

            private Builder(CasterStream model) {
                this.outputType = model.outputType;
                this.rtmpUrl = model.rtmpUrl;
                this.sceneId = model.sceneId;
                this.streamInfos = model.streamInfos;
                this.streamUrl = model.streamUrl;
            } 

            /**
             * <p>Indicates whether the output stream is in preview mode or program mode.</p>
             * <ul>
             * <li><strong>0</strong>: indicates that the output videos of the scene are in preview mode.</li>
             * <li><strong>1</strong>: indicates that the output videos of the scene are in program mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder outputType(Integer outputType) {
                this.outputType = outputType;
                return this;
            }

            /**
             * <p>The Real Time Messaging Protocol (RTMP) URL.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://live/caster/example.edu</p>
             */
            public Builder rtmpUrl(String rtmpUrl) {
                this.rtmpUrl = rtmpUrl;
                return this;
            }

            /**
             * <p>The ID of the scene.</p>
             * 
             * <strong>example:</strong>
             * <p>23ca74e0-aca3-4e7a-8561-9d96f525****</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The information about the stream.</p>
             */
            public Builder streamInfos(StreamInfos streamInfos) {
                this.streamInfos = streamInfos;
                return this;
            }

            /**
             * <p>The streaming URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://live/caster/example.org">http://live/caster/example.org</a></p>
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
    /**
     * 
     * {@link DescribeCasterStreamUrlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterStreamUrlResponseBody</p>
     */
    public static class CasterStreams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CasterStream")
        private java.util.List<CasterStream> casterStream;

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
        public java.util.List<CasterStream> getCasterStream() {
            return this.casterStream;
        }

        public static final class Builder {
            private java.util.List<CasterStream> casterStream; 

            private Builder() {
            } 

            private Builder(CasterStreams model) {
                this.casterStream = model.casterStream;
            } 

            /**
             * CasterStream.
             */
            public Builder casterStream(java.util.List<CasterStream> casterStream) {
                this.casterStream = casterStream;
                return this;
            }

            public CasterStreams build() {
                return new CasterStreams(this);
            } 

        } 

    }
}
