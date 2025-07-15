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
 * {@link DescribeLiveStreamMetricDetailDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamMetricDetailDataResponseBody</p>
 */
public class DescribeLiveStreamMetricDetailDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("StreamDetailData")
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

        private Builder() {
        } 

        private Builder(DescribeLiveStreamMetricDetailDataResponseBody model) {
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.nextPageToken = model.nextPageToken;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.streamDetailData = model.streamDetailData;
        } 

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The token that determines the start point of the next query. This parameter is returned if more data results are available.</p>
         * 
         * <strong>example:</strong>
         * <p>UjsM9x3aVcJi9a0-ArwJUTTC67C***37C0=</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The number of rows returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B955107D-E658-4E77-B913-E0AC3D31693E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The data array returned.</p>
         */
        public Builder streamDetailData(StreamDetailData streamDetailData) {
            this.streamDetailData = streamDetailData;
            return this;
        }

        public DescribeLiveStreamMetricDetailDataResponseBody build() {
            return new DescribeLiveStreamMetricDetailDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamMetricDetailDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamMetricDetailDataResponseBody</p>
     */
    public static class StreamData extends TeaModel {
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
        private Long flvTraffic;

        @com.aliyun.core.annotation.NameInMap("HlsBps")
        private Float hlsBps;

        @com.aliyun.core.annotation.NameInMap("HlsCount")
        private Long hlsCount;

        @com.aliyun.core.annotation.NameInMap("HlsTraffic")
        private Long hlsTraffic;

        @com.aliyun.core.annotation.NameInMap("NewConns")
        private String newConns;

        @com.aliyun.core.annotation.NameInMap("P2pBps")
        private Float p2pBps;

        @com.aliyun.core.annotation.NameInMap("P2pCount")
        private Long p2pCount;

        @com.aliyun.core.annotation.NameInMap("P2pTraffic")
        private Long p2pTraffic;

        @com.aliyun.core.annotation.NameInMap("RtmpBps")
        private Float rtmpBps;

        @com.aliyun.core.annotation.NameInMap("RtmpCount")
        private Long rtmpCount;

        @com.aliyun.core.annotation.NameInMap("RtmpTraffic")
        private Long rtmpTraffic;

        @com.aliyun.core.annotation.NameInMap("RtsBps")
        private Float rtsBps;

        @com.aliyun.core.annotation.NameInMap("RtsCount")
        private Long rtsCount;

        @com.aliyun.core.annotation.NameInMap("RtsTraffic")
        private Long rtsTraffic;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Traffic")
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
         * @return newConns
         */
        public String getNewConns() {
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
            private String newConns; 
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

            private Builder() {
            } 

            private Builder(StreamData model) {
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
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The total bandwidth consumed by the stream per minute. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>423304182.66</p>
             */
            public Builder bps(Float bps) {
                this.bps = bps;
                return this;
            }

            /**
             * <p>The total number of online viewers for the stream per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>423304182</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The bandwidth over the Flash Video (FLV) protocol. Unit: bit/s.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>454</p>
             */
            public Builder flvBps(Float flvBps) {
                this.flvBps = flvBps;
                return this;
            }

            /**
             * <p>The number of online viewers over the FLV protocol.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder flvCount(Long flvCount) {
                this.flvCount = flvCount;
                return this;
            }

            /**
             * <p>The amount of traffic over the FLV protocol. Unit: bytes.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1254</p>
             */
            public Builder flvTraffic(Long flvTraffic) {
                this.flvTraffic = flvTraffic;
                return this;
            }

            /**
             * <p>The bandwidth over the HTTP Live Streaming (HLS) protocol. Unit: bit/s.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4456</p>
             */
            public Builder hlsBps(Float hlsBps) {
                this.hlsBps = hlsBps;
                return this;
            }

            /**
             * <p>The number of online viewers over the HLS protocol.</p>
             * <blockquote>
             * <p> Currently, this parameter is not supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder hlsCount(Long hlsCount) {
                this.hlsCount = hlsCount;
                return this;
            }

            /**
             * <p>The amount of traffic over the HLS protocol. Unit: bytes.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>568</p>
             */
            public Builder hlsTraffic(Long hlsTraffic) {
                this.hlsTraffic = hlsTraffic;
                return this;
            }

            /**
             * <p>Number of new connections established per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>450</p>
             */
            public Builder newConns(String newConns) {
                this.newConns = newConns;
                return this;
            }

            /**
             * <p>The bandwidth over the P2P protocol. Unit: bit/s.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>6845</p>
             */
            public Builder p2pBps(Float p2pBps) {
                this.p2pBps = p2pBps;
                return this;
            }

            /**
             * <p>The number of online viewers over the P2P protocol.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>78</p>
             */
            public Builder p2pCount(Long p2pCount) {
                this.p2pCount = p2pCount;
                return this;
            }

            /**
             * <p>The amount of traffic over the peer-to-peer (P2P) protocol. Unit: bytes.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4102</p>
             */
            public Builder p2pTraffic(Long p2pTraffic) {
                this.p2pTraffic = p2pTraffic;
                return this;
            }

            /**
             * <p>The bandwidth over the Real-Time Messaging Protocol (RTMP) protocol. Unit: bit/s.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3323</p>
             */
            public Builder rtmpBps(Float rtmpBps) {
                this.rtmpBps = rtmpBps;
                return this;
            }

            /**
             * <p>The number of online viewers over the RTMP protocol.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>63</p>
             */
            public Builder rtmpCount(Long rtmpCount) {
                this.rtmpCount = rtmpCount;
                return this;
            }

            /**
             * <p>The amount of traffic over the RTMP protocol. Unit: bytes.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5568</p>
             */
            public Builder rtmpTraffic(Long rtmpTraffic) {
                this.rtmpTraffic = rtmpTraffic;
                return this;
            }

            /**
             * <p>The bandwidth over the RTS protocol. Unit: bit/s.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2361</p>
             */
            public Builder rtsBps(Float rtsBps) {
                this.rtsBps = rtsBps;
                return this;
            }

            /**
             * <p>The number of online viewers over the Real-Time Streaming (RTS) protocol.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>89</p>
             */
            public Builder rtsCount(Long rtsCount) {
                this.rtsCount = rtsCount;
                return this;
            }

            /**
             * <p>The amount of traffic over the RTS protocol. Unit: bytes.</p>
             * <blockquote>
             * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2322</p>
             */
            public Builder rtsTraffic(Long rtsTraffic) {
                this.rtsTraffic = rtsTraffic;
                return this;
            }

            /**
             * <p>The name of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>test.flv</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-10T20:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The total amount of traffic consumed by the stream per minute. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>423304182</p>
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
    /**
     * 
     * {@link DescribeLiveStreamMetricDetailDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamMetricDetailDataResponseBody</p>
     */
    public static class StreamDetailData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StreamData")
        private java.util.List<StreamData> streamData;

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
        public java.util.List<StreamData> getStreamData() {
            return this.streamData;
        }

        public static final class Builder {
            private java.util.List<StreamData> streamData; 

            private Builder() {
            } 

            private Builder(StreamDetailData model) {
                this.streamData = model.streamData;
            } 

            /**
             * StreamData.
             */
            public Builder streamData(java.util.List<StreamData> streamData) {
                this.streamData = streamData;
                return this;
            }

            public StreamDetailData build() {
                return new StreamDetailData(this);
            } 

        } 

    }
}
