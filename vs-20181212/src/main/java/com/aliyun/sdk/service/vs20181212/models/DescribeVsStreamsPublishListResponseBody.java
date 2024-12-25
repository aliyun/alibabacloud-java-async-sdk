// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeVsStreamsPublishListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsStreamsPublishListResponseBody</p>
 */
public class DescribeVsStreamsPublishListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PublishInfo")
    private PublishInfo publishInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeVsStreamsPublishListResponseBody(Builder builder) {
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.publishInfo = builder.publishInfo;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsStreamsPublishListResponseBody create() {
        return builder().build();
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
     * @return publishInfo
     */
    public PublishInfo getPublishInfo() {
        return this.publishInfo;
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
        private Integer pageNum; 
        private Integer pageSize; 
        private PublishInfo publishInfo; 
        private String requestId; 
        private Integer totalNum; 
        private Integer totalPage; 

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
         * PublishInfo.
         */
        public Builder publishInfo(PublishInfo publishInfo) {
            this.publishInfo = publishInfo;
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

        public DescribeVsStreamsPublishListResponseBody build() {
            return new DescribeVsStreamsPublishListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVsStreamsPublishListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsStreamsPublishListResponseBody</p>
     */
    public static class LiveStreamPublishInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ClientAddr")
        private String clientAddr;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("EdgeNodeAddr")
        private String edgeNodeAddr;

        @com.aliyun.core.annotation.NameInMap("PublishDomain")
        private String publishDomain;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("PublishType")
        private String publishType;

        @com.aliyun.core.annotation.NameInMap("PublishUrl")
        private String publishUrl;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private String stopTime;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("StreamUrl")
        private String streamUrl;

        @com.aliyun.core.annotation.NameInMap("TranscodeId")
        private String transcodeId;

        @com.aliyun.core.annotation.NameInMap("Transcoded")
        private String transcoded;

        private LiveStreamPublishInfo(Builder builder) {
            this.appName = builder.appName;
            this.clientAddr = builder.clientAddr;
            this.domainName = builder.domainName;
            this.edgeNodeAddr = builder.edgeNodeAddr;
            this.publishDomain = builder.publishDomain;
            this.publishTime = builder.publishTime;
            this.publishType = builder.publishType;
            this.publishUrl = builder.publishUrl;
            this.stopTime = builder.stopTime;
            this.streamName = builder.streamName;
            this.streamUrl = builder.streamUrl;
            this.transcodeId = builder.transcodeId;
            this.transcoded = builder.transcoded;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamPublishInfo create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return clientAddr
         */
        public String getClientAddr() {
            return this.clientAddr;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return edgeNodeAddr
         */
        public String getEdgeNodeAddr() {
            return this.edgeNodeAddr;
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
         * @return stopTime
         */
        public String getStopTime() {
            return this.stopTime;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return streamUrl
         */
        public String getStreamUrl() {
            return this.streamUrl;
        }

        /**
         * @return transcodeId
         */
        public String getTranscodeId() {
            return this.transcodeId;
        }

        /**
         * @return transcoded
         */
        public String getTranscoded() {
            return this.transcoded;
        }

        public static final class Builder {
            private String appName; 
            private String clientAddr; 
            private String domainName; 
            private String edgeNodeAddr; 
            private String publishDomain; 
            private String publishTime; 
            private String publishType; 
            private String publishUrl; 
            private String stopTime; 
            private String streamName; 
            private String streamUrl; 
            private String transcodeId; 
            private String transcoded; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * ClientAddr.
             */
            public Builder clientAddr(String clientAddr) {
                this.clientAddr = clientAddr;
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
             * EdgeNodeAddr.
             */
            public Builder edgeNodeAddr(String edgeNodeAddr) {
                this.edgeNodeAddr = edgeNodeAddr;
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
             * StopTime.
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
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
             * StreamUrl.
             */
            public Builder streamUrl(String streamUrl) {
                this.streamUrl = streamUrl;
                return this;
            }

            /**
             * TranscodeId.
             */
            public Builder transcodeId(String transcodeId) {
                this.transcodeId = transcodeId;
                return this;
            }

            /**
             * Transcoded.
             */
            public Builder transcoded(String transcoded) {
                this.transcoded = transcoded;
                return this;
            }

            public LiveStreamPublishInfo build() {
                return new LiveStreamPublishInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVsStreamsPublishListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsStreamsPublishListResponseBody</p>
     */
    public static class PublishInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveStreamPublishInfo")
        private java.util.List<LiveStreamPublishInfo> liveStreamPublishInfo;

        private PublishInfo(Builder builder) {
            this.liveStreamPublishInfo = builder.liveStreamPublishInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishInfo create() {
            return builder().build();
        }

        /**
         * @return liveStreamPublishInfo
         */
        public java.util.List<LiveStreamPublishInfo> getLiveStreamPublishInfo() {
            return this.liveStreamPublishInfo;
        }

        public static final class Builder {
            private java.util.List<LiveStreamPublishInfo> liveStreamPublishInfo; 

            /**
             * LiveStreamPublishInfo.
             */
            public Builder liveStreamPublishInfo(java.util.List<LiveStreamPublishInfo> liveStreamPublishInfo) {
                this.liveStreamPublishInfo = liveStreamPublishInfo;
                return this;
            }

            public PublishInfo build() {
                return new PublishInfo(this);
            } 

        } 

    }
}
