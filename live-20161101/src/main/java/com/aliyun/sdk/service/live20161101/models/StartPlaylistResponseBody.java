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
 * {@link StartPlaylistResponseBody} extends {@link TeaModel}
 *
 * <p>StartPlaylistResponseBody</p>
 */
public class StartPlaylistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProgramId")
    private String programId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamInfo")
    private StreamInfo streamInfo;

    private StartPlaylistResponseBody(Builder builder) {
        this.programId = builder.programId;
        this.requestId = builder.requestId;
        this.streamInfo = builder.streamInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPlaylistResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return programId
     */
    public String getProgramId() {
        return this.programId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamInfo
     */
    public StreamInfo getStreamInfo() {
        return this.streamInfo;
    }

    public static final class Builder {
        private String programId; 
        private String requestId; 
        private StreamInfo streamInfo; 

        private Builder() {
        } 

        private Builder(StartPlaylistResponseBody model) {
            this.programId = model.programId;
            this.requestId = model.requestId;
            this.streamInfo = model.streamInfo;
        } 

        /**
         * <p>The ID of the episode list. You can use the ID as a request parameter in the API operation that is used to stop playing the episode list.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder programId(String programId) {
            this.programId = programId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0d-f228-4a64-af62-20e91b96****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the live stream.</p>
         */
        public Builder streamInfo(StreamInfo streamInfo) {
            this.streamInfo = streamInfo;
            return this;
        }

        public StartPlaylistResponseBody build() {
            return new StartPlaylistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link StartPlaylistResponseBody} extends {@link TeaModel}
     *
     * <p>StartPlaylistResponseBody</p>
     */
    public static class Stream extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PullFlvUrl")
        private String pullFlvUrl;

        @com.aliyun.core.annotation.NameInMap("PullM3U8Url")
        private String pullM3U8Url;

        @com.aliyun.core.annotation.NameInMap("PullRtmpUrl")
        private String pullRtmpUrl;

        @com.aliyun.core.annotation.NameInMap("Quality")
        private String quality;

        private Stream(Builder builder) {
            this.pullFlvUrl = builder.pullFlvUrl;
            this.pullM3U8Url = builder.pullM3U8Url;
            this.pullRtmpUrl = builder.pullRtmpUrl;
            this.quality = builder.quality;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stream create() {
            return builder().build();
        }

        /**
         * @return pullFlvUrl
         */
        public String getPullFlvUrl() {
            return this.pullFlvUrl;
        }

        /**
         * @return pullM3U8Url
         */
        public String getPullM3U8Url() {
            return this.pullM3U8Url;
        }

        /**
         * @return pullRtmpUrl
         */
        public String getPullRtmpUrl() {
            return this.pullRtmpUrl;
        }

        /**
         * @return quality
         */
        public String getQuality() {
            return this.quality;
        }

        public static final class Builder {
            private String pullFlvUrl; 
            private String pullM3U8Url; 
            private String pullRtmpUrl; 
            private String quality; 

            private Builder() {
            } 

            private Builder(Stream model) {
                this.pullFlvUrl = model.pullFlvUrl;
                this.pullM3U8Url = model.pullM3U8Url;
                this.pullRtmpUrl = model.pullRtmpUrl;
                this.quality = model.quality;
            } 

            /**
             * <p>The streaming URL in the Flash Video (FLV) format.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://aliyundoc.com/caster/liveStream****.flv?auth_key=1612772224-0-0-3632be7cd9907169e8b09e91099c">http://aliyundoc.com/caster/liveStream****.flv?auth_key=1612772224-0-0-3632be7cd9907169e8b09e91099c</a>****</p>
             */
            public Builder pullFlvUrl(String pullFlvUrl) {
                this.pullFlvUrl = pullFlvUrl;
                return this;
            }

            /**
             * <p>The streaming URL in the Real-Time Messaging Protocol (RTMP) format.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp:///aliyundoc.com/caster/liveStream****?auth_key=1612772224-0-0-4404ca59c0246226d49d01f734b1****</p>
             */
            public Builder pullM3U8Url(String pullM3U8Url) {
                this.pullM3U8Url = pullM3U8Url;
                return this;
            }

            /**
             * <p>The streaming URL in the M3U8 format.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://aliyundoc.com/caster/liveStream****.m3u8?auth_key=1612772224-0-0-919a023a127156fe82e3562c3b3b">http://aliyundoc.com/caster/liveStream****.m3u8?auth_key=1612772224-0-0-919a023a127156fe82e3562c3b3b</a>****</p>
             */
            public Builder pullRtmpUrl(String pullRtmpUrl) {
                this.pullRtmpUrl = pullRtmpUrl;
                return this;
            }

            /**
             * <p>The video quality of the live stream. Valid values: <strong>original</strong>: original quality</p>
             * 
             * <strong>example:</strong>
             * <p>original</p>
             */
            public Builder quality(String quality) {
                this.quality = quality;
                return this;
            }

            public Stream build() {
                return new Stream(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartPlaylistResponseBody} extends {@link TeaModel}
     *
     * <p>StartPlaylistResponseBody</p>
     */
    public static class Streams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Stream")
        private java.util.List<Stream> stream;

        private Streams(Builder builder) {
            this.stream = builder.stream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Streams create() {
            return builder().build();
        }

        /**
         * @return stream
         */
        public java.util.List<Stream> getStream() {
            return this.stream;
        }

        public static final class Builder {
            private java.util.List<Stream> stream; 

            private Builder() {
            } 

            private Builder(Streams model) {
                this.stream = model.stream;
            } 

            /**
             * Stream.
             */
            public Builder stream(java.util.List<Stream> stream) {
                this.stream = stream;
                return this;
            }

            public Streams build() {
                return new Streams(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartPlaylistResponseBody} extends {@link TeaModel}
     *
     * <p>StartPlaylistResponseBody</p>
     */
    public static class StreamInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("Streams")
        private Streams streams;

        private StreamInfo(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.streamName = builder.streamName;
            this.streams = builder.streams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamInfo create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return streams
         */
        public Streams getStreams() {
            return this.streams;
        }

        public static final class Builder {
            private String appName; 
            private String domainName; 
            private String streamName; 
            private Streams streams; 

            private Builder() {
            } 

            private Builder(StreamInfo model) {
                this.appName = model.appName;
                this.domainName = model.domainName;
                this.streamName = model.streamName;
                this.streams = model.streams;
            } 

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>liveStream****</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The streaming URLs.</p>
             */
            public Builder streams(Streams streams) {
                this.streams = streams;
                return this;
            }

            public StreamInfo build() {
                return new StreamInfo(this);
            } 

        } 

    }
}
