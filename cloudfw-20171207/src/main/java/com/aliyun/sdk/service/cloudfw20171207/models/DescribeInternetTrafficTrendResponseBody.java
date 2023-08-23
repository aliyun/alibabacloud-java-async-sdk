// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInternetTrafficTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInternetTrafficTrendResponseBody</p>
 */
public class DescribeInternetTrafficTrendResponseBody extends TeaModel {
    @NameInMap("AvgInBps")
    private Long avgInBps;

    @NameInMap("AvgOutBps")
    private Long avgOutBps;

    @NameInMap("AvgSession")
    private Long avgSession;

    @NameInMap("AvgTotalBps")
    private Long avgTotalBps;

    @NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @NameInMap("MaxBandwidthTime")
    private Long maxBandwidthTime;

    @NameInMap("MaxInBps")
    private Long maxInBps;

    @NameInMap("MaxOutBps")
    private Long maxOutBps;

    @NameInMap("MaxSession")
    private Long maxSession;

    @NameInMap("MaxTotalBps")
    private Long maxTotalBps;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalBytes")
    private Long totalBytes;

    @NameInMap("TotalInBytes")
    private Long totalInBytes;

    @NameInMap("TotalOutBytes")
    private Long totalOutBytes;

    @NameInMap("TotalSession")
    private Long totalSession;

    private DescribeInternetTrafficTrendResponseBody(Builder builder) {
        this.avgInBps = builder.avgInBps;
        this.avgOutBps = builder.avgOutBps;
        this.avgSession = builder.avgSession;
        this.avgTotalBps = builder.avgTotalBps;
        this.dataList = builder.dataList;
        this.maxBandwidthTime = builder.maxBandwidthTime;
        this.maxInBps = builder.maxInBps;
        this.maxOutBps = builder.maxOutBps;
        this.maxSession = builder.maxSession;
        this.maxTotalBps = builder.maxTotalBps;
        this.requestId = builder.requestId;
        this.totalBytes = builder.totalBytes;
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
        private Long maxInBps; 
        private Long maxOutBps; 
        private Long maxSession; 
        private Long maxTotalBps; 
        private String requestId; 
        private Long totalBytes; 
        private Long totalInBytes; 
        private Long totalOutBytes; 
        private Long totalSession; 

        /**
         * AvgInBps.
         */
        public Builder avgInBps(Long avgInBps) {
            this.avgInBps = avgInBps;
            return this;
        }

        /**
         * AvgOutBps.
         */
        public Builder avgOutBps(Long avgOutBps) {
            this.avgOutBps = avgOutBps;
            return this;
        }

        /**
         * AvgSession.
         */
        public Builder avgSession(Long avgSession) {
            this.avgSession = avgSession;
            return this;
        }

        /**
         * AvgTotalBps.
         */
        public Builder avgTotalBps(Long avgTotalBps) {
            this.avgTotalBps = avgTotalBps;
            return this;
        }

        /**
         * DataList.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * MaxBandwidthTime.
         */
        public Builder maxBandwidthTime(Long maxBandwidthTime) {
            this.maxBandwidthTime = maxBandwidthTime;
            return this;
        }

        /**
         * MaxInBps.
         */
        public Builder maxInBps(Long maxInBps) {
            this.maxInBps = maxInBps;
            return this;
        }

        /**
         * MaxOutBps.
         */
        public Builder maxOutBps(Long maxOutBps) {
            this.maxOutBps = maxOutBps;
            return this;
        }

        /**
         * MaxSession.
         */
        public Builder maxSession(Long maxSession) {
            this.maxSession = maxSession;
            return this;
        }

        /**
         * MaxTotalBps.
         */
        public Builder maxTotalBps(Long maxTotalBps) {
            this.maxTotalBps = maxTotalBps;
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
         * TotalBytes.
         */
        public Builder totalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }

        /**
         * TotalInBytes.
         */
        public Builder totalInBytes(Long totalInBytes) {
            this.totalInBytes = totalInBytes;
            return this;
        }

        /**
         * TotalOutBytes.
         */
        public Builder totalOutBytes(Long totalOutBytes) {
            this.totalOutBytes = totalOutBytes;
            return this;
        }

        /**
         * TotalSession.
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
        @NameInMap("InBps")
        private Long inBps;

        @NameInMap("InBytes")
        private Long inBytes;

        @NameInMap("InPps")
        private Long inPps;

        @NameInMap("NewConn")
        private Long newConn;

        @NameInMap("OutBps")
        private Long outBps;

        @NameInMap("OutBytes")
        private Long outBytes;

        @NameInMap("OutPps")
        private Long outPps;

        @NameInMap("SessionCount")
        private Long sessionCount;

        @NameInMap("Time")
        private Integer time;

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

            /**
             * InBps.
             */
            public Builder inBps(Long inBps) {
                this.inBps = inBps;
                return this;
            }

            /**
             * InBytes.
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * InPps.
             */
            public Builder inPps(Long inPps) {
                this.inPps = inPps;
                return this;
            }

            /**
             * NewConn.
             */
            public Builder newConn(Long newConn) {
                this.newConn = newConn;
                return this;
            }

            /**
             * OutBps.
             */
            public Builder outBps(Long outBps) {
                this.outBps = outBps;
                return this;
            }

            /**
             * OutBytes.
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * OutPps.
             */
            public Builder outPps(Long outPps) {
                this.outPps = outPps;
                return this;
            }

            /**
             * SessionCount.
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
