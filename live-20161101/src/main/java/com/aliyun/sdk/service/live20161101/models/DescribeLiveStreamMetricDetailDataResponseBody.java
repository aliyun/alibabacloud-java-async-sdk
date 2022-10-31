// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamMetricDetailDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamMetricDetailDataResponseBody</p>
 */
public class DescribeLiveStreamMetricDetailDataResponseBody extends TeaModel {
    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("NextPageToken")
    private String nextPageToken;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("StreamDetailData")
    private StreamDetailData streamDetailData;

    private DescribeLiveStreamMetricDetailDataResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.streamDetailData = builder.streamDetailData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamMetricDetailDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return streamDetailData
     */
    public StreamDetailData getStreamDetailData() {
        return this.streamDetailData;
    }

    public static final class Builder {
        private String domainName; 
        private String endTime; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String requestId; 
        private String startTime; 
        private StreamDetailData streamDetailData; 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * StreamDetailData.
         */
        public Builder streamDetailData(StreamDetailData streamDetailData) {
            this.streamDetailData = streamDetailData;
            return this;
        }

        public DescribeLiveStreamMetricDetailDataResponseBody build() {
            return new DescribeLiveStreamMetricDetailDataResponseBody(this);
        } 

    } 

    public static class StreamData extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("Bps")
        private Float bps;

        @NameInMap("Count")
        private Long count;

        @NameInMap("FlvBps")
        private Float flvBps;

        @NameInMap("FlvCount")
        private Long flvCount;

        @NameInMap("FlvTraffic")
        private Long flvTraffic;

        @NameInMap("HlsBps")
        private Float hlsBps;

        @NameInMap("HlsCount")
        private Long hlsCount;

        @NameInMap("HlsTraffic")
        private Long hlsTraffic;

        @NameInMap("P2pBps")
        private Float p2pBps;

        @NameInMap("P2pCount")
        private Long p2pCount;

        @NameInMap("P2pTraffic")
        private Long p2pTraffic;

        @NameInMap("RtmpBps")
        private Float rtmpBps;

        @NameInMap("RtmpCount")
        private Long rtmpCount;

        @NameInMap("RtmpTraffic")
        private Long rtmpTraffic;

        @NameInMap("RtsBps")
        private Float rtsBps;

        @NameInMap("RtsCount")
        private Long rtsCount;

        @NameInMap("RtsTraffic")
        private Long rtsTraffic;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("Traffic")
        private Long traffic;

        private StreamData(Builder builder) {
            this.appName = builder.appName;
            this.bps = builder.bps;
            this.count = builder.count;
            this.flvBps = builder.flvBps;
            this.flvCount = builder.flvCount;
            this.flvTraffic = builder.flvTraffic;
            this.hlsBps = builder.hlsBps;
            this.hlsCount = builder.hlsCount;
            this.hlsTraffic = builder.hlsTraffic;
            this.p2pBps = builder.p2pBps;
            this.p2pCount = builder.p2pCount;
            this.p2pTraffic = builder.p2pTraffic;
            this.rtmpBps = builder.rtmpBps;
            this.rtmpCount = builder.rtmpCount;
            this.rtmpTraffic = builder.rtmpTraffic;
            this.rtsBps = builder.rtsBps;
            this.rtsCount = builder.rtsCount;
            this.rtsTraffic = builder.rtsTraffic;
            this.streamName = builder.streamName;
            this.timeStamp = builder.timeStamp;
            this.traffic = builder.traffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamData create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return bps
         */
        public Float getBps() {
            return this.bps;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return flvBps
         */
        public Float getFlvBps() {
            return this.flvBps;
        }

        /**
         * @return flvCount
         */
        public Long getFlvCount() {
            return this.flvCount;
        }

        /**
         * @return flvTraffic
         */
        public Long getFlvTraffic() {
            return this.flvTraffic;
        }

        /**
         * @return hlsBps
         */
        public Float getHlsBps() {
            return this.hlsBps;
        }

        /**
         * @return hlsCount
         */
        public Long getHlsCount() {
            return this.hlsCount;
        }

        /**
         * @return hlsTraffic
         */
        public Long getHlsTraffic() {
            return this.hlsTraffic;
        }

        /**
         * @return p2pBps
         */
        public Float getP2pBps() {
            return this.p2pBps;
        }

        /**
         * @return p2pCount
         */
        public Long getP2pCount() {
            return this.p2pCount;
        }

        /**
         * @return p2pTraffic
         */
        public Long getP2pTraffic() {
            return this.p2pTraffic;
        }

        /**
         * @return rtmpBps
         */
        public Float getRtmpBps() {
            return this.rtmpBps;
        }

        /**
         * @return rtmpCount
         */
        public Long getRtmpCount() {
            return this.rtmpCount;
        }

        /**
         * @return rtmpTraffic
         */
        public Long getRtmpTraffic() {
            return this.rtmpTraffic;
        }

        /**
         * @return rtsBps
         */
        public Float getRtsBps() {
            return this.rtsBps;
        }

        /**
         * @return rtsCount
         */
        public Long getRtsCount() {
            return this.rtsCount;
        }

        /**
         * @return rtsTraffic
         */
        public Long getRtsTraffic() {
            return this.rtsTraffic;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return traffic
         */
        public Long getTraffic() {
            return this.traffic;
        }

        public static final class Builder {
            private String appName; 
            private Float bps; 
            private Long count; 
            private Float flvBps; 
            private Long flvCount; 
            private Long flvTraffic; 
            private Float hlsBps; 
            private Long hlsCount; 
            private Long hlsTraffic; 
            private Float p2pBps; 
            private Long p2pCount; 
            private Long p2pTraffic; 
            private Float rtmpBps; 
            private Long rtmpCount; 
            private Long rtmpTraffic; 
            private Float rtsBps; 
            private Long rtsCount; 
            private Long rtsTraffic; 
            private String streamName; 
            private String timeStamp; 
            private Long traffic; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Bps.
             */
            public Builder bps(Float bps) {
                this.bps = bps;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * FlvBps.
             */
            public Builder flvBps(Float flvBps) {
                this.flvBps = flvBps;
                return this;
            }

            /**
             * FlvCount.
             */
            public Builder flvCount(Long flvCount) {
                this.flvCount = flvCount;
                return this;
            }

            /**
             * FlvTraffic.
             */
            public Builder flvTraffic(Long flvTraffic) {
                this.flvTraffic = flvTraffic;
                return this;
            }

            /**
             * HlsBps.
             */
            public Builder hlsBps(Float hlsBps) {
                this.hlsBps = hlsBps;
                return this;
            }

            /**
             * HlsCount.
             */
            public Builder hlsCount(Long hlsCount) {
                this.hlsCount = hlsCount;
                return this;
            }

            /**
             * HlsTraffic.
             */
            public Builder hlsTraffic(Long hlsTraffic) {
                this.hlsTraffic = hlsTraffic;
                return this;
            }

            /**
             * P2pBps.
             */
            public Builder p2pBps(Float p2pBps) {
                this.p2pBps = p2pBps;
                return this;
            }

            /**
             * P2pCount.
             */
            public Builder p2pCount(Long p2pCount) {
                this.p2pCount = p2pCount;
                return this;
            }

            /**
             * P2pTraffic.
             */
            public Builder p2pTraffic(Long p2pTraffic) {
                this.p2pTraffic = p2pTraffic;
                return this;
            }

            /**
             * RtmpBps.
             */
            public Builder rtmpBps(Float rtmpBps) {
                this.rtmpBps = rtmpBps;
                return this;
            }

            /**
             * RtmpCount.
             */
            public Builder rtmpCount(Long rtmpCount) {
                this.rtmpCount = rtmpCount;
                return this;
            }

            /**
             * RtmpTraffic.
             */
            public Builder rtmpTraffic(Long rtmpTraffic) {
                this.rtmpTraffic = rtmpTraffic;
                return this;
            }

            /**
             * RtsBps.
             */
            public Builder rtsBps(Float rtsBps) {
                this.rtsBps = rtsBps;
                return this;
            }

            /**
             * RtsCount.
             */
            public Builder rtsCount(Long rtsCount) {
                this.rtsCount = rtsCount;
                return this;
            }

            /**
             * RtsTraffic.
             */
            public Builder rtsTraffic(Long rtsTraffic) {
                this.rtsTraffic = rtsTraffic;
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
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * Traffic.
             */
            public Builder traffic(Long traffic) {
                this.traffic = traffic;
                return this;
            }

            public StreamData build() {
                return new StreamData(this);
            } 

        } 

    }
    public static class StreamDetailData extends TeaModel {
        @NameInMap("StreamData")
        private java.util.List < StreamData> streamData;

        private StreamDetailData(Builder builder) {
            this.streamData = builder.streamData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamDetailData create() {
            return builder().build();
        }

        /**
         * @return streamData
         */
        public java.util.List < StreamData> getStreamData() {
            return this.streamData;
        }

        public static final class Builder {
            private java.util.List < StreamData> streamData; 

            /**
             * StreamData.
             */
            public Builder streamData(java.util.List < StreamData> streamData) {
                this.streamData = streamData;
                return this;
            }

            public StreamDetailData build() {
                return new StreamDetailData(this);
            } 

        } 

    }
}
