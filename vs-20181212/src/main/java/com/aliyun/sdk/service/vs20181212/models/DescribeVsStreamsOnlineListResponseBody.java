// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsStreamsOnlineListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsStreamsOnlineListResponseBody</p>
 */
public class DescribeVsStreamsOnlineListResponseBody extends TeaModel {
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

    private DescribeVsStreamsOnlineListResponseBody(Builder builder) {
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

    public static DescribeVsStreamsOnlineListResponseBody create() {
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

        public DescribeVsStreamsOnlineListResponseBody build() {
            return new DescribeVsStreamsOnlineListResponseBody(this);
        } 

    } 

    public static class LiveStreamOnlineInfo extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("PublishDomain")
        private String publishDomain;

        @NameInMap("PublishTime")
        private String publishTime;

        @NameInMap("PublishType")
        private String publishType;

        @NameInMap("PublishUrl")
        private String publishUrl;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("TranscodeId")
        private String transcodeId;

        @NameInMap("Transcoded")
        private String transcoded;

        private LiveStreamOnlineInfo(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.publishDomain = builder.publishDomain;
            this.publishTime = builder.publishTime;
            this.publishType = builder.publishType;
            this.publishUrl = builder.publishUrl;
            this.streamName = builder.streamName;
            this.transcodeId = builder.transcodeId;
            this.transcoded = builder.transcoded;
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
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
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
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
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
            private String domainName; 
            private String publishDomain; 
            private String publishTime; 
            private String publishType; 
            private String publishUrl; 
            private String streamName; 
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
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
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
             * StreamName.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
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
