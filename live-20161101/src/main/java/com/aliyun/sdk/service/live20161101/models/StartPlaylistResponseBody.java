// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPlaylistResponseBody} extends {@link TeaModel}
 *
 * <p>StartPlaylistResponseBody</p>
 */
public class StartPlaylistResponseBody extends TeaModel {
    @NameInMap("ProgramId")
    private String programId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StreamInfo")
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

        /**
         * ProgramId.
         */
        public Builder programId(String programId) {
            this.programId = programId;
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
         * StreamInfo.
         */
        public Builder streamInfo(StreamInfo streamInfo) {
            this.streamInfo = streamInfo;
            return this;
        }

        public StartPlaylistResponseBody build() {
            return new StartPlaylistResponseBody(this);
        } 

    } 

    public static class Stream extends TeaModel {
        @NameInMap("PullFlvUrl")
        private String pullFlvUrl;

        @NameInMap("PullM3U8Url")
        private String pullM3U8Url;

        @NameInMap("PullRtmpUrl")
        private String pullRtmpUrl;

        @NameInMap("Quality")
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

            /**
             * PullFlvUrl.
             */
            public Builder pullFlvUrl(String pullFlvUrl) {
                this.pullFlvUrl = pullFlvUrl;
                return this;
            }

            /**
             * PullM3U8Url.
             */
            public Builder pullM3U8Url(String pullM3U8Url) {
                this.pullM3U8Url = pullM3U8Url;
                return this;
            }

            /**
             * PullRtmpUrl.
             */
            public Builder pullRtmpUrl(String pullRtmpUrl) {
                this.pullRtmpUrl = pullRtmpUrl;
                return this;
            }

            /**
             * Quality.
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
    public static class Streams extends TeaModel {
        @NameInMap("Stream")
        private java.util.List < Stream> stream;

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
        public java.util.List < Stream> getStream() {
            return this.stream;
        }

        public static final class Builder {
            private java.util.List < Stream> stream; 

            /**
             * Stream.
             */
            public Builder stream(java.util.List < Stream> stream) {
                this.stream = stream;
                return this;
            }

            public Streams build() {
                return new Streams(this);
            } 

        } 

    }
    public static class StreamInfo extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("Streams")
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

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * StreamName.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * Streams.
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
