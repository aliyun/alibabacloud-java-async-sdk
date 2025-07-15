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
 * {@link DescribeLiveStreamsOnlineListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamsOnlineListResponseBody</p>
 */
public class DescribeLiveStreamsOnlineListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OnlineInfo")
    private OnlineInfo onlineInfo;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeLiveStreamsOnlineListResponseBody(Builder builder) {
        this.onlineInfo = builder.onlineInfo;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamsOnlineListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return onlineInfo
     */
    public OnlineInfo getOnlineInfo() {
        return this.onlineInfo;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private OnlineInfo onlineInfo; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNum; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamsOnlineListResponseBody model) {
            this.onlineInfo = model.onlineInfo;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The information about the live streams that are being ingested.</p>
         */
        public Builder onlineInfo(OnlineInfo onlineInfo) {
            this.onlineInfo = onlineInfo;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0df228-4a64- af62-20e91b9676b3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of streams that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveStreamsOnlineListResponseBody build() {
            return new DescribeLiveStreamsOnlineListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamsOnlineListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamsOnlineListResponseBody</p>
     */
    public static class LiveStreamOnlineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AudioCodecId")
        private Integer audioCodecId;

        @com.aliyun.core.annotation.NameInMap("AudioDataRate")
        private Integer audioDataRate;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("FrameRate")
        private Integer frameRate;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("PublishDomain")
        private String publishDomain;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("PublishType")
        private String publishType;

        @com.aliyun.core.annotation.NameInMap("PublishUrl")
        private String publishUrl;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("Transcoded")
        private String transcoded;

        @com.aliyun.core.annotation.NameInMap("VideoCodecId")
        private Integer videoCodecId;

        @com.aliyun.core.annotation.NameInMap("VideoDataRate")
        private Integer videoDataRate;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private LiveStreamOnlineInfo(Builder builder) {
            this.appName = builder.appName;
            this.audioCodecId = builder.audioCodecId;
            this.audioDataRate = builder.audioDataRate;
            this.clientIp = builder.clientIp;
            this.domainName = builder.domainName;
            this.frameRate = builder.frameRate;
            this.height = builder.height;
            this.publishDomain = builder.publishDomain;
            this.publishTime = builder.publishTime;
            this.publishType = builder.publishType;
            this.publishUrl = builder.publishUrl;
            this.serverIp = builder.serverIp;
            this.streamName = builder.streamName;
            this.transcoded = builder.transcoded;
            this.videoCodecId = builder.videoCodecId;
            this.videoDataRate = builder.videoDataRate;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamOnlineInfo create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return audioCodecId
         */
        public Integer getAudioCodecId() {
            return this.audioCodecId;
        }

        /**
         * @return audioDataRate
         */
        public Integer getAudioDataRate() {
            return this.audioDataRate;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return frameRate
         */
        public Integer getFrameRate() {
            return this.frameRate;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return publishDomain
         */
        public String getPublishDomain() {
            return this.publishDomain;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return publishType
         */
        public String getPublishType() {
            return this.publishType;
        }

        /**
         * @return publishUrl
         */
        public String getPublishUrl() {
            return this.publishUrl;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return transcoded
         */
        public String getTranscoded() {
            return this.transcoded;
        }

        /**
         * @return videoCodecId
         */
        public Integer getVideoCodecId() {
            return this.videoCodecId;
        }

        /**
         * @return videoDataRate
         */
        public Integer getVideoDataRate() {
            return this.videoDataRate;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String appName; 
            private Integer audioCodecId; 
            private Integer audioDataRate; 
            private String clientIp; 
            private String domainName; 
            private Integer frameRate; 
            private Integer height; 
            private String publishDomain; 
            private String publishTime; 
            private String publishType; 
            private String publishUrl; 
            private String serverIp; 
            private String streamName; 
            private String transcoded; 
            private Integer videoCodecId; 
            private Integer videoDataRate; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(LiveStreamOnlineInfo model) {
                this.appName = model.appName;
                this.audioCodecId = model.audioCodecId;
                this.audioDataRate = model.audioDataRate;
                this.clientIp = model.clientIp;
                this.domainName = model.domainName;
                this.frameRate = model.frameRate;
                this.height = model.height;
                this.publishDomain = model.publishDomain;
                this.publishTime = model.publishTime;
                this.publishType = model.publishType;
                this.publishUrl = model.publishUrl;
                this.serverIp = model.serverIp;
                this.streamName = model.streamName;
                this.transcoded = model.transcoded;
                this.videoCodecId = model.videoCodecId;
                this.videoDataRate = model.videoDataRate;
                this.width = model.width;
            } 

            /**
             * <p>The name of the application to which the live stream belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the audio codec.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder audioCodecId(Integer audioCodecId) {
                this.audioCodecId = audioCodecId;
                return this;
            }

            /**
             * <p>The audio bitrate of the live stream. Unit: Kbit/s.</p>
             * <blockquote>
             * <p> This parameter can be returned after you submit a ticket for whitelist configuration. For more information about how to submit a ticket, see Contact us.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder audioDataRate(Integer audioDataRate) {
                this.audioDataRate = audioDataRate;
                return this;
            }

            /**
             * <p>The IP address of the client for stream ingest.</p>
             * 
             * <strong>example:</strong>
             * <p>106.11.XX.XX</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
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
             * <p>The frame rate. Unit: FPS.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder frameRate(Integer frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            /**
             * <p>The height of the video resolution. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The ingest domain. If live center ingest was used, the streaming domain is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>demo.aliyundoc.com</p>
             */
            public Builder publishDomain(String publishDomain) {
                this.publishDomain = publishDomain;
                return this;
            }

            /**
             * <p>The start time of stream ingest. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-09T02:37:59Z</p>
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * <p>The ingest type. Valid values:</p>
             * <ul>
             * <li><strong>edge</strong>: edge ingest.</li>
             * <li><strong>center</strong>: live center ingest.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>edge</p>
             */
            public Builder publishType(String publishType) {
                this.publishType = publishType;
                return this;
            }

            /**
             * <p>The complete URL that was used to ingest the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://demo.aliyundoc.com/live/test****</p>
             */
            public Builder publishUrl(String publishUrl) {
                this.publishUrl = publishUrl;
                return this;
            }

            /**
             * <p>The IP address of the ingest node.</p>
             * 
             * <strong>example:</strong>
             * <p>120.221.XX.XX</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
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
             * <p>Indicates whether the stream was transcoded. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder transcoded(String transcoded) {
                this.transcoded = transcoded;
                return this;
            }

            /**
             * <p>The ID of the video codec.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder videoCodecId(Integer videoCodecId) {
                this.videoCodecId = videoCodecId;
                return this;
            }

            /**
             * <p>The video bitrate of the live stream. Unit: Kbit/s.</p>
             * <blockquote>
             * <p> This parameter can be returned after you submit a ticket for whitelist configuration. For more information about how to submit a ticket, see Contact us.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder videoDataRate(Integer videoDataRate) {
                this.videoDataRate = videoDataRate;
                return this;
            }

            /**
             * <p>The width of the video resolution. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public LiveStreamOnlineInfo build() {
                return new LiveStreamOnlineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamsOnlineListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamsOnlineListResponseBody</p>
     */
    public static class OnlineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveStreamOnlineInfo")
        private java.util.List<LiveStreamOnlineInfo> liveStreamOnlineInfo;

        private OnlineInfo(Builder builder) {
            this.liveStreamOnlineInfo = builder.liveStreamOnlineInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnlineInfo create() {
            return builder().build();
        }

        /**
         * @return liveStreamOnlineInfo
         */
        public java.util.List<LiveStreamOnlineInfo> getLiveStreamOnlineInfo() {
            return this.liveStreamOnlineInfo;
        }

        public static final class Builder {
            private java.util.List<LiveStreamOnlineInfo> liveStreamOnlineInfo; 

            private Builder() {
            } 

            private Builder(OnlineInfo model) {
                this.liveStreamOnlineInfo = model.liveStreamOnlineInfo;
            } 

            /**
             * LiveStreamOnlineInfo.
             */
            public Builder liveStreamOnlineInfo(java.util.List<LiveStreamOnlineInfo> liveStreamOnlineInfo) {
                this.liveStreamOnlineInfo = liveStreamOnlineInfo;
                return this;
            }

            public OnlineInfo build() {
                return new OnlineInfo(this);
            } 

        } 

    }
}
