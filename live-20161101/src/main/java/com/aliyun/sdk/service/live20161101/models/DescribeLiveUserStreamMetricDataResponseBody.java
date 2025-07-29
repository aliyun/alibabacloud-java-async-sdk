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
 * {@link DescribeLiveUserStreamMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveUserStreamMetricDataResponseBody</p>
 */
public class DescribeLiveUserStreamMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("StreamDetailData")
    private java.util.List<StreamDetailData> streamDetailData;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeLiveUserStreamMetricDataResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.streamDetailData = builder.streamDetailData;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveUserStreamMetricDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public java.util.List<StreamDetailData> getStreamDetailData() {
        return this.streamDetailData;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String domainName; 
        private String endTime; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private String startTime; 
        private java.util.List<StreamDetailData> streamDetailData; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeLiveUserStreamMetricDataResponseBody model) {
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.streamDetailData = model.streamDetailData;
            this.totalCount = model.totalCount;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>YYYY-MM-DDThh:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
        public Builder streamDetailData(java.util.List<StreamDetailData> streamDetailData) {
            this.streamDetailData = streamDetailData;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLiveUserStreamMetricDataResponseBody build() {
            return new DescribeLiveUserStreamMetricDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveUserStreamMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUserStreamMetricDataResponseBody</p>
     */
    public static class StreamDetailData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Bps")
        private Float bps;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("FlvBps")
        private Float flvBps;

        @com.aliyun.core.annotation.NameInMap("FlvCount")
        private Long flvCount;

        @com.aliyun.core.annotation.NameInMap("FlvTraffic")
        private Double flvTraffic;

        @com.aliyun.core.annotation.NameInMap("HlsBps")
        private Float hlsBps;

        @com.aliyun.core.annotation.NameInMap("HlsCount")
        private Long hlsCount;

        @com.aliyun.core.annotation.NameInMap("HlsTraffic")
        private Double hlsTraffic;

        @com.aliyun.core.annotation.NameInMap("NewConns")
        private Long newConns;

        @com.aliyun.core.annotation.NameInMap("P2pBps")
        private Float p2pBps;

        @com.aliyun.core.annotation.NameInMap("P2pCount")
        private Long p2pCount;

        @com.aliyun.core.annotation.NameInMap("P2pTraffic")
        private Double p2pTraffic;

        @com.aliyun.core.annotation.NameInMap("RtmpBps")
        private Float rtmpBps;

        @com.aliyun.core.annotation.NameInMap("RtmpCount")
        private Long rtmpCount;

        @com.aliyun.core.annotation.NameInMap("RtmpTraffic")
        private Double rtmpTraffic;

        @com.aliyun.core.annotation.NameInMap("RtsBps")
        private Double rtsBps;

        @com.aliyun.core.annotation.NameInMap("RtsCount")
        private Long rtsCount;

        @com.aliyun.core.annotation.NameInMap("RtsTraffic")
        private Double rtsTraffic;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Traffic")
        private Double traffic;

        private StreamDetailData(Builder builder) {
            this.appName = builder.appName;
            this.bps = builder.bps;
            this.count = builder.count;
            this.flvBps = builder.flvBps;
            this.flvCount = builder.flvCount;
            this.flvTraffic = builder.flvTraffic;
            this.hlsBps = builder.hlsBps;
            this.hlsCount = builder.hlsCount;
            this.hlsTraffic = builder.hlsTraffic;
            this.newConns = builder.newConns;
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

        public static StreamDetailData create() {
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
        public Double getFlvTraffic() {
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
        public Double getHlsTraffic() {
            return this.hlsTraffic;
        }

        /**
         * @return newConns
         */
        public Long getNewConns() {
            return this.newConns;
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
        public Double getP2pTraffic() {
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
        public Double getRtmpTraffic() {
            return this.rtmpTraffic;
        }

        /**
         * @return rtsBps
         */
        public Double getRtsBps() {
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
        public Double getRtsTraffic() {
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
        public Double getTraffic() {
            return this.traffic;
        }

        public static final class Builder {
            private String appName; 
            private Float bps; 
            private Long count; 
            private Float flvBps; 
            private Long flvCount; 
            private Double flvTraffic; 
            private Float hlsBps; 
            private Long hlsCount; 
            private Double hlsTraffic; 
            private Long newConns; 
            private Float p2pBps; 
            private Long p2pCount; 
            private Double p2pTraffic; 
            private Float rtmpBps; 
            private Long rtmpCount; 
            private Double rtmpTraffic; 
            private Double rtsBps; 
            private Long rtsCount; 
            private Double rtsTraffic; 
            private String streamName; 
            private String timeStamp; 
            private Double traffic; 

            private Builder() {
            } 

            private Builder(StreamDetailData model) {
                this.appName = model.appName;
                this.bps = model.bps;
                this.count = model.count;
                this.flvBps = model.flvBps;
                this.flvCount = model.flvCount;
                this.flvTraffic = model.flvTraffic;
                this.hlsBps = model.hlsBps;
                this.hlsCount = model.hlsCount;
                this.hlsTraffic = model.hlsTraffic;
                this.newConns = model.newConns;
                this.p2pBps = model.p2pBps;
                this.p2pCount = model.p2pCount;
                this.p2pTraffic = model.p2pTraffic;
                this.rtmpBps = model.rtmpBps;
                this.rtmpCount = model.rtmpCount;
                this.rtmpTraffic = model.rtmpTraffic;
                this.rtsBps = model.rtsBps;
                this.rtsCount = model.rtsCount;
                this.rtsTraffic = model.rtsTraffic;
                this.streamName = model.streamName;
                this.timeStamp = model.timeStamp;
                this.traffic = model.traffic;
            } 

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
            public Builder flvTraffic(Double flvTraffic) {
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
            public Builder hlsTraffic(Double hlsTraffic) {
                this.hlsTraffic = hlsTraffic;
                return this;
            }

            /**
             * NewConns.
             */
            public Builder newConns(Long newConns) {
                this.newConns = newConns;
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
            public Builder p2pTraffic(Double p2pTraffic) {
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
            public Builder rtmpTraffic(Double rtmpTraffic) {
                this.rtmpTraffic = rtmpTraffic;
                return this;
            }

            /**
             * RtsBps.
             */
            public Builder rtsBps(Double rtsBps) {
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
            public Builder rtsTraffic(Double rtsTraffic) {
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
            public Builder traffic(Double traffic) {
                this.traffic = traffic;
                return this;
            }

            public StreamDetailData build() {
                return new StreamDetailData(this);
            } 

        } 

    }
}
