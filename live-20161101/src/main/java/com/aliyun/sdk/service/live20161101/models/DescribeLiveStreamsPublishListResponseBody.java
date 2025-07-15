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
 * {@link DescribeLiveStreamsPublishListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamsPublishListResponseBody</p>
 */
public class DescribeLiveStreamsPublishListResponseBody extends TeaModel {
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

    private DescribeLiveStreamsPublishListResponseBody(Builder builder) {
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

    public static DescribeLiveStreamsPublishListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveStreamsPublishListResponseBody model) {
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.publishInfo = model.publishInfo;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The information about the stream ingest records.</p>
         */
        public Builder publishInfo(PublishInfo publishInfo) {
            this.publishInfo = publishInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40A4F36D-A7CC-473A-88E7-154F92242566</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveStreamsPublishListResponseBody build() {
            return new DescribeLiveStreamsPublishListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamsPublishListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamsPublishListResponseBody</p>
     */
    public static class LiveStreamPublishInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliInnerErrorFlags")
        private String aliInnerErrorFlags;

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
            this.aliInnerErrorFlags = builder.aliInnerErrorFlags;
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
         * @return aliInnerErrorFlags
         */
        public String getAliInnerErrorFlags() {
            return this.aliInnerErrorFlags;
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
            private String aliInnerErrorFlags; 
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

            private Builder() {
            } 

            private Builder(LiveStreamPublishInfo model) {
                this.aliInnerErrorFlags = model.aliInnerErrorFlags;
                this.appName = model.appName;
                this.clientAddr = model.clientAddr;
                this.domainName = model.domainName;
                this.edgeNodeAddr = model.edgeNodeAddr;
                this.publishDomain = model.publishDomain;
                this.publishTime = model.publishTime;
                this.publishType = model.publishType;
                this.publishUrl = model.publishUrl;
                this.stopTime = model.stopTime;
                this.streamName = model.streamName;
                this.streamUrl = model.streamUrl;
                this.transcodeId = model.transcodeId;
                this.transcoded = model.transcoded;
            } 

            /**
             * <p>Internal error</p>
             * 
             * <strong>example:</strong>
             * <p>3000001</p>
             */
            public Builder aliInnerErrorFlags(String aliInnerErrorFlags) {
                this.aliInnerErrorFlags = aliInnerErrorFlags;
                return this;
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
             * <p>The IP address of the client that ingested the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>10.175.XX.XX</p>
             */
            public Builder clientAddr(String clientAddr) {
                this.clientAddr = clientAddr;
                return this;
            }

            /**
             * <p>The ingest domain or main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The IP address of the CDN point of presence (POP) to which the stream was ingested.</p>
             * 
             * <strong>example:</strong>
             * <p>10.175.XX.XX</p>
             */
            public Builder edgeNodeAddr(String edgeNodeAddr) {
                this.edgeNodeAddr = edgeNodeAddr;
                return this;
            }

            /**
             * <p>The ingest domain.</p>
             * 
             * <strong>example:</strong>
             * <p>demo.aliyundoc.com</p>
             */
            public Builder publishDomain(String publishDomain) {
                this.publishDomain = publishDomain;
                return this;
            }

            /**
             * <p>The time when the stream ingest was started. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-02T03:05:53Z</p>
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * <p>The type of the stream ingest. Valid values:</p>
             * <ul>
             * <li><strong>edge</strong>: edge ingest</li>
             * <li><strong>center</strong>: live center ingest</li>
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
             * <p>The complete ingest URL.</p>
             */
            public Builder publishUrl(String publishUrl) {
                this.publishUrl = publishUrl;
                return this;
            }

            /**
             * <p>The time when the stream ingest was stopped. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-02T03:11:19Z</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
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
             * <p>The streaming URL.</p>
             */
            public Builder streamUrl(String streamUrl) {
                this.streamUrl = streamUrl;
                return this;
            }

            /**
             * <p>The ID of the transcoding template.</p>
             * <blockquote>
             * <p> This parameter is not returned if the value of the Transcoded parameter is no.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ld</p>
             */
            public Builder transcodeId(String transcodeId) {
                this.transcodeId = transcodeId;
                return this;
            }

            /**
             * <p>Indicates whether the stream was a transcoded stream.</p>
             * 
             * <strong>example:</strong>
             * <p>yes</p>
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
     * {@link DescribeLiveStreamsPublishListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamsPublishListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PublishInfo model) {
                this.liveStreamPublishInfo = model.liveStreamPublishInfo;
            } 

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
