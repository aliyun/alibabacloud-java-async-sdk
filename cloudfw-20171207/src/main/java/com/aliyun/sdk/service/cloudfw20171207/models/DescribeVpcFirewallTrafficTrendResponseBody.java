// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeVpcFirewallTrafficTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallTrafficTrendResponseBody</p>
 */
public class DescribeVpcFirewallTrafficTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvgInBps")
    private Long avgInBps;

    @com.aliyun.core.annotation.NameInMap("AvgOutBps")
    private Long avgOutBps;

    @com.aliyun.core.annotation.NameInMap("AvgSession")
    private Long avgSession;

    @com.aliyun.core.annotation.NameInMap("AvgTotalBps")
    private Long avgTotalBps;

    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("MaxBandwidthTime")
    private Long maxBandwidthTime;

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

    @com.aliyun.core.annotation.NameInMap("TotalInBytes")
    private Long totalInBytes;

    @com.aliyun.core.annotation.NameInMap("TotalOutBytes")
    private Long totalOutBytes;

    @com.aliyun.core.annotation.NameInMap("TotalSession")
    private Long totalSession;

    private DescribeVpcFirewallTrafficTrendResponseBody(Builder builder) {
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

    public static DescribeVpcFirewallTrafficTrendResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<DataList> getDataList() {
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
        private java.util.List<DataList> dataList; 
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

        private Builder() {
        } 

        private Builder(DescribeVpcFirewallTrafficTrendResponseBody model) {
            this.avgInBps = model.avgInBps;
            this.avgOutBps = model.avgOutBps;
            this.avgSession = model.avgSession;
            this.avgTotalBps = model.avgTotalBps;
            this.dataList = model.dataList;
            this.maxBandwidthTime = model.maxBandwidthTime;
            this.maxInBps = model.maxInBps;
            this.maxOutBps = model.maxOutBps;
            this.maxSession = model.maxSession;
            this.maxTotalBps = model.maxTotalBps;
            this.requestId = model.requestId;
            this.totalBytes = model.totalBytes;
            this.totalInBytes = model.totalInBytes;
            this.totalOutBytes = model.totalOutBytes;
            this.totalSession = model.totalSession;
        } 

        /**
         * <p>The average inbound network throughput. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1264110</p>
         */
        public Builder avgInBps(Long avgInBps) {
            this.avgInBps = avgInBps;
            return this;
        }

        /**
         * <p>The average outbound network throughput. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>68915</p>
         */
        public Builder avgOutBps(Long avgOutBps) {
            this.avgOutBps = avgOutBps;
            return this;
        }

        /**
         * <p>The average number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>1995</p>
         */
        public Builder avgSession(Long avgSession) {
            this.avgSession = avgSession;
            return this;
        }

        /**
         * <p>The average total network throughput in both the outbound and inbound directions. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>34291</p>
         */
        public Builder avgTotalBps(Long avgTotalBps) {
            this.avgTotalBps = avgTotalBps;
            return this;
        }

        /**
         * <p>The data list.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The timestamp when the peak bandwidth occurred. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1768008060</p>
         */
        public Builder maxBandwidthTime(Long maxBandwidthTime) {
            this.maxBandwidthTime = maxBandwidthTime;
            return this;
        }

        /**
         * <p>The peak inbound network throughput. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1436</p>
         */
        public Builder maxInBps(Long maxInBps) {
            this.maxInBps = maxInBps;
            return this;
        }

        /**
         * <p>The peak outbound network throughput. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2128</p>
         */
        public Builder maxOutBps(Long maxOutBps) {
            this.maxOutBps = maxOutBps;
            return this;
        }

        /**
         * <p>The peak number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>2003</p>
         */
        public Builder maxSession(Long maxSession) {
            this.maxSession = maxSession;
            return this;
        }

        /**
         * <p>The peak total network throughput in both the outbound and inbound directions. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>61947852</p>
         */
        public Builder maxTotalBps(Long maxTotalBps) {
            this.maxTotalBps = maxTotalBps;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>45F8B9E6-8583-56B3-A127-1B421C9E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>141688156232</p>
         */
        public Builder totalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }

        /**
         * <p>The total inbound network throughput. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2659635037</p>
         */
        public Builder totalInBytes(Long totalInBytes) {
            this.totalInBytes = totalInBytes;
            return this;
        }

        /**
         * <p>The total outbound network throughput. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>399762701</p>
         */
        public Builder totalOutBytes(Long totalOutBytes) {
            this.totalOutBytes = totalOutBytes;
            return this;
        }

        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>1078757</p>
         */
        public Builder totalSession(Long totalSession) {
            this.totalSession = totalSession;
            return this;
        }

        public DescribeVpcFirewallTrafficTrendResponseBody build() {
            return new DescribeVpcFirewallTrafficTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallTrafficTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallTrafficTrendResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DataList model) {
                this.inBps = model.inBps;
                this.inBytes = model.inBytes;
                this.inPps = model.inPps;
                this.newConn = model.newConn;
                this.outBps = model.outBps;
                this.outBytes = model.outBytes;
                this.outPps = model.outPps;
                this.sessionCount = model.sessionCount;
                this.time = model.time;
            } 

            /**
             * <p>The inbound bandwidth. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>187</p>
             */
            public Builder inBps(Long inBps) {
                this.inBps = inBps;
                return this;
            }

            /**
             * <p>The inbound traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * <p>The inbound packet forwarding rate. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder inPps(Long inPps) {
                this.inPps = inPps;
                return this;
            }

            /**
             * <p>The number of new connections.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder newConn(Long newConn) {
                this.newConn = newConn;
                return this;
            }

            /**
             * <p>The outbound traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder outBps(Long outBps) {
                this.outBps = outBps;
                return this;
            }

            /**
             * <p>The total outbound network throughput. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>230</p>
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * <p>The outbound packet forwarding rate. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder outPps(Long outPps) {
                this.outPps = outPps;
                return this;
            }

            /**
             * <p>The number of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * <p>The time when the traffic occurred. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1758470400</p>
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
