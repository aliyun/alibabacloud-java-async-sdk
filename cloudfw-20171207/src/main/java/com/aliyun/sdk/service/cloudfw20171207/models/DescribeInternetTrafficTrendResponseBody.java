// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInternetTrafficTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInternetTrafficTrendResponseBody</p>
 */
public class DescribeInternetTrafficTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvgInBps")
    private Long avgInBps;

    @com.aliyun.core.annotation.NameInMap("AvgOutBps")
    private Long avgOutBps;

    @com.aliyun.core.annotation.NameInMap("AvgSession")
    private Long avgSession;

    @com.aliyun.core.annotation.NameInMap("AvgTotalBps")
    private Long avgTotalBps;

    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("MaxBandwidthTime")
    private Long maxBandwidthTime;

    @com.aliyun.core.annotation.NameInMap("MaxDayExceedBytes")
    private Long maxDayExceedBytes;

    @com.aliyun.core.annotation.NameInMap("MaxInBps")
    private Long maxInBps;

    @com.aliyun.core.annotation.NameInMap("MaxOutBps")
    private Long maxOutBps;

    @com.aliyun.core.annotation.NameInMap("MaxSession")
    private Long maxSession;

    @com.aliyun.core.annotation.NameInMap("MaxTotalBps")
    private Long maxTotalBps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalBytes")
    private Long totalBytes;

    @com.aliyun.core.annotation.NameInMap("TotalExceedBytes")
    private Long totalExceedBytes;

    @com.aliyun.core.annotation.NameInMap("TotalInBytes")
    private Long totalInBytes;

    @com.aliyun.core.annotation.NameInMap("TotalOutBytes")
    private Long totalOutBytes;

    @com.aliyun.core.annotation.NameInMap("TotalSession")
    private Long totalSession;

    private DescribeInternetTrafficTrendResponseBody(Builder builder) {
        this.avgInBps = builder.avgInBps;
        this.avgOutBps = builder.avgOutBps;
        this.avgSession = builder.avgSession;
        this.avgTotalBps = builder.avgTotalBps;
        this.dataList = builder.dataList;
        this.maxBandwidthTime = builder.maxBandwidthTime;
        this.maxDayExceedBytes = builder.maxDayExceedBytes;
        this.maxInBps = builder.maxInBps;
        this.maxOutBps = builder.maxOutBps;
        this.maxSession = builder.maxSession;
        this.maxTotalBps = builder.maxTotalBps;
        this.requestId = builder.requestId;
        this.totalBytes = builder.totalBytes;
        this.totalExceedBytes = builder.totalExceedBytes;
        this.totalInBytes = builder.totalInBytes;
        this.totalOutBytes = builder.totalOutBytes;
        this.totalSession = builder.totalSession;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetTrafficTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return avgInBps
     */
    public Long getAvgInBps() {
        return this.avgInBps;
    }

    /**
     * @return avgOutBps
     */
    public Long getAvgOutBps() {
        return this.avgOutBps;
    }

    /**
     * @return avgSession
     */
    public Long getAvgSession() {
        return this.avgSession;
    }

    /**
     * @return avgTotalBps
     */
    public Long getAvgTotalBps() {
        return this.avgTotalBps;
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return maxBandwidthTime
     */
    public Long getMaxBandwidthTime() {
        return this.maxBandwidthTime;
    }

    /**
     * @return maxDayExceedBytes
     */
    public Long getMaxDayExceedBytes() {
        return this.maxDayExceedBytes;
    }

    /**
     * @return maxInBps
     */
    public Long getMaxInBps() {
        return this.maxInBps;
    }

    /**
     * @return maxOutBps
     */
    public Long getMaxOutBps() {
        return this.maxOutBps;
    }

    /**
     * @return maxSession
     */
    public Long getMaxSession() {
        return this.maxSession;
    }

    /**
     * @return maxTotalBps
     */
    public Long getMaxTotalBps() {
        return this.maxTotalBps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalBytes
     */
    public Long getTotalBytes() {
        return this.totalBytes;
    }

    /**
     * @return totalExceedBytes
     */
    public Long getTotalExceedBytes() {
        return this.totalExceedBytes;
    }

    /**
     * @return totalInBytes
     */
    public Long getTotalInBytes() {
        return this.totalInBytes;
    }

    /**
     * @return totalOutBytes
     */
    public Long getTotalOutBytes() {
        return this.totalOutBytes;
    }

    /**
     * @return totalSession
     */
    public Long getTotalSession() {
        return this.totalSession;
    }

    public static final class Builder {
        private Long avgInBps; 
        private Long avgOutBps; 
        private Long avgSession; 
        private Long avgTotalBps; 
        private java.util.List < DataList> dataList; 
        private Long maxBandwidthTime; 
        private Long maxDayExceedBytes; 
        private Long maxInBps; 
        private Long maxOutBps; 
        private Long maxSession; 
        private Long maxTotalBps; 
        private String requestId; 
        private Long totalBytes; 
        private Long totalExceedBytes; 
        private Long totalInBytes; 
        private Long totalOutBytes; 
        private Long totalSession; 

        /**
         * The average inbound network throughput, which indicates the average number of bits that are sent inbound per second. Unit: bit/s.
         */
        public Builder avgInBps(Long avgInBps) {
            this.avgInBps = avgInBps;
            return this;
        }

        /**
         * The average outbound network throughput, which indicates the average number of bits that are sent outbound per second. Unit: bit/s.
         */
        public Builder avgOutBps(Long avgOutBps) {
            this.avgOutBps = avgOutBps;
            return this;
        }

        /**
         * The average number of requests.
         */
        public Builder avgSession(Long avgSession) {
            this.avgSession = avgSession;
            return this;
        }

        /**
         * The total average inbound and outbound network throughput, which indicates the average number of bits that are sent inbound and outbound per second. Unit: bit/s.
         */
        public Builder avgTotalBps(Long avgTotalBps) {
            this.avgTotalBps = avgTotalBps;
            return this;
        }

        /**
         * The statistics on traffic.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * The timestamp generated when the bandwidth reaches the peak value. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder maxBandwidthTime(Long maxBandwidthTime) {
            this.maxBandwidthTime = maxBandwidthTime;
            return this;
        }

        /**
         * The maximum volume of excess traffic allowed per day.
         */
        public Builder maxDayExceedBytes(Long maxDayExceedBytes) {
            this.maxDayExceedBytes = maxDayExceedBytes;
            return this;
        }

        /**
         * The maximum inbound network throughput, which indicates the maximum number of bits that are sent inbound per second. Unit: bit/s.
         */
        public Builder maxInBps(Long maxInBps) {
            this.maxInBps = maxInBps;
            return this;
        }

        /**
         * The maximum outbound network throughput, which indicates the maximum number of bits that are sent outbound per second. Unit: bit/s.
         */
        public Builder maxOutBps(Long maxOutBps) {
            this.maxOutBps = maxOutBps;
            return this;
        }

        /**
         * The number of requests during the peak hour of the network throughout.
         */
        public Builder maxSession(Long maxSession) {
            this.maxSession = maxSession;
            return this;
        }

        /**
         * The total maximum inbound and outbound network throughput, which indicates the maximum number of bits that are sent inbound and outbound per second. Unit: bit/s.
         */
        public Builder maxTotalBps(Long maxTotalBps) {
            this.maxTotalBps = maxTotalBps;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total inbound and outbound network throughput, which indicates the total number of bytes that are sent inbound and outbound. Unit: bytes.
         */
        public Builder totalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }

        /**
         * The total volume of excess traffic.
         */
        public Builder totalExceedBytes(Long totalExceedBytes) {
            this.totalExceedBytes = totalExceedBytes;
            return this;
        }

        /**
         * The inbound network throughput, which indicates the total number of bytes that are sent inbound. Unit: bytes.
         */
        public Builder totalInBytes(Long totalInBytes) {
            this.totalInBytes = totalInBytes;
            return this;
        }

        /**
         * The outbound network throughput, which indicates the total number of bytes that are sent outbound. Unit: bytes.
         */
        public Builder totalOutBytes(Long totalOutBytes) {
            this.totalOutBytes = totalOutBytes;
            return this;
        }

        /**
         * The total number of requests.
         */
        public Builder totalSession(Long totalSession) {
            this.totalSession = totalSession;
            return this;
        }

        public DescribeInternetTrafficTrendResponseBody build() {
            return new DescribeInternetTrafficTrendResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InBps")
        private Long inBps;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("InPps")
        private Long inPps;

        @com.aliyun.core.annotation.NameInMap("NewConn")
        private Long newConn;

        @com.aliyun.core.annotation.NameInMap("OutBps")
        private Long outBps;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private Long outBytes;

        @com.aliyun.core.annotation.NameInMap("OutPps")
        private Long outPps;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Integer time;

        @com.aliyun.core.annotation.NameInMap("TotalBps")
        private Long totalBps;

        private DataList(Builder builder) {
            this.inBps = builder.inBps;
            this.inBytes = builder.inBytes;
            this.inPps = builder.inPps;
            this.newConn = builder.newConn;
            this.outBps = builder.outBps;
            this.outBytes = builder.outBytes;
            this.outPps = builder.outPps;
            this.sessionCount = builder.sessionCount;
            this.time = builder.time;
            this.totalBps = builder.totalBps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return inBps
         */
        public Long getInBps() {
            return this.inBps;
        }

        /**
         * @return inBytes
         */
        public Long getInBytes() {
            return this.inBytes;
        }

        /**
         * @return inPps
         */
        public Long getInPps() {
            return this.inPps;
        }

        /**
         * @return newConn
         */
        public Long getNewConn() {
            return this.newConn;
        }

        /**
         * @return outBps
         */
        public Long getOutBps() {
            return this.outBps;
        }

        /**
         * @return outBytes
         */
        public Long getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return outPps
         */
        public Long getOutPps() {
            return this.outPps;
        }

        /**
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return totalBps
         */
        public Long getTotalBps() {
            return this.totalBps;
        }

        public static final class Builder {
            private Long inBps; 
            private Long inBytes; 
            private Long inPps; 
            private Long newConn; 
            private Long outBps; 
            private Long outBytes; 
            private Long outPps; 
            private Long sessionCount; 
            private Integer time; 
            private Long totalBps; 

            /**
             * The inbound network throughput, which indicates the number of bits that are sent inbound per second. Unit: bit/s.
             */
            public Builder inBps(Long inBps) {
                this.inBps = inBps;
                return this;
            }

            /**
             * The inbound network throughput, which indicates the total number of bytes that are sent inbound. Unit: bytes.
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * The inbound network throughput, which indicates the number of packets that are sent inbound per second. Unit: packets per second (pps).
             */
            public Builder inPps(Long inPps) {
                this.inPps = inPps;
                return this;
            }

            /**
             * The number of new connections.
             */
            public Builder newConn(Long newConn) {
                this.newConn = newConn;
                return this;
            }

            /**
             * The outbound network throughput, which indicates the number of bits that are sent outbound per second. Unit: bit/s.
             */
            public Builder outBps(Long outBps) {
                this.outBps = outBps;
                return this;
            }

            /**
             * The outbound network throughput, which indicates the total number of bytes that are sent outbound. Unit: bytes.
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * The outbound network throughput, which indicates the number of packets that are sent outbound per second. Unit: pps.
             */
            public Builder outPps(Long outPps) {
                this.outPps = outPps;
                return this;
            }

            /**
             * The number of requests.
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * The time when traffic is generated. The value is a UNIX timestamp. Unit: seconds.
             * <p>
             * 
             * If processing is not complete at this point in time, -1 is returned for all other fields.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * The total outbound and inbound network throughput, which indicates the total number of bits that are sent inbound and outbound per second. Unit: bit/s.
             */
            public Builder totalBps(Long totalBps) {
                this.totalBps = totalBps;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
