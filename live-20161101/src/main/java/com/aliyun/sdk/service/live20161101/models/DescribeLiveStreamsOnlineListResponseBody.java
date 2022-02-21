// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamsOnlineListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamsOnlineListResponseBody</p>
 */
public class DescribeLiveStreamsOnlineListResponseBody extends TeaModel {
    @NameInMap("OnlineInfo")
    private OnlineInfo onlineInfo;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalNum")
    private Integer totalNum;

    @NameInMap("TotalPage")
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

        /**
         * OnlineInfo.
         */
        public Builder onlineInfo(OnlineInfo onlineInfo) {
            this.onlineInfo = onlineInfo;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveStreamsOnlineListResponseBody build() {
            return new DescribeLiveStreamsOnlineListResponseBody(this);
        } 

    } 

    public static class LiveStreamOnlineInfo extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("AudioCodecId")
        private Integer audioCodecId;

        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("FrameRate")
        private Integer frameRate;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("PublishDomain")
        private String publishDomain;

        @NameInMap("PublishTime")
        private String publishTime;

        @NameInMap("PublishType")
        private String publishType;

        @NameInMap("PublishUrl")
        private String publishUrl;

        @NameInMap("ServerIp")
        private String serverIp;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("Transcoded")
        private String transcoded;

        @NameInMap("VideoCodecId")
        private Integer videoCodecId;

        @NameInMap("Width")
        private Integer width;

        private LiveStreamOnlineInfo(Builder builder) {
            this.appName = builder.appName;
            this.audioCodecId = builder.audioCodecId;
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
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String appName; 
            private Integer audioCodecId; 
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
            private Integer width; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AudioCodecId.
             */
            public Builder audioCodecId(Integer audioCodecId) {
                this.audioCodecId = audioCodecId;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
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
             * FrameRate.
             */
            public Builder frameRate(Integer frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * PublishDomain.
             */
            public Builder publishDomain(String publishDomain) {
                this.publishDomain = publishDomain;
                return this;
            }

            /**
             * PublishTime.
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * PublishType.
             */
            public Builder publishType(String publishType) {
                this.publishType = publishType;
                return this;
            }

            /**
             * PublishUrl.
             */
            public Builder publishUrl(String publishUrl) {
                this.publishUrl = publishUrl;
                return this;
            }

            /**
             * ServerIp.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
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
             * Transcoded.
             */
            public Builder transcoded(String transcoded) {
                this.transcoded = transcoded;
                return this;
            }

            /**
             * VideoCodecId.
             */
            public Builder videoCodecId(Integer videoCodecId) {
                this.videoCodecId = videoCodecId;
                return this;
            }

            /**
             * Width.
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
    public static class OnlineInfo extends TeaModel {
        @NameInMap("LiveStreamOnlineInfo")
        private java.util.List < LiveStreamOnlineInfo> liveStreamOnlineInfo;

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
        public java.util.List < LiveStreamOnlineInfo> getLiveStreamOnlineInfo() {
            return this.liveStreamOnlineInfo;
        }

        public static final class Builder {
            private java.util.List < LiveStreamOnlineInfo> liveStreamOnlineInfo; 

            /**
             * LiveStreamOnlineInfo.
             */
            public Builder liveStreamOnlineInfo(java.util.List < LiveStreamOnlineInfo> liveStreamOnlineInfo) {
                this.liveStreamOnlineInfo = liveStreamOnlineInfo;
                return this;
            }

            public OnlineInfo build() {
                return new OnlineInfo(this);
            } 

        } 

    }
}
