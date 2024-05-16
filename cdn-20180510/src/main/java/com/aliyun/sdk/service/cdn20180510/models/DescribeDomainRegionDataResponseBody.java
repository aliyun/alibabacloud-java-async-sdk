// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRegionDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRegionDataResponseBody</p>
 */
public class DescribeDomainRegionDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Value value;

    private DescribeDomainRegionDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRegionDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
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
     * @return value
     */
    public Value getValue() {
        return this.value;
    }

    public static final class Builder {
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private Value value; 

        /**
         * The time interval between the data entries returned. Unit: seconds.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * The accelerated domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range for which the data was queried.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The beginning of the time range for which the data was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The proportions of requests initiated from each region.
         */
        public Builder value(Value value) {
            this.value = value;
            return this;
        }

        public DescribeDomainRegionDataResponseBody build() {
            return new DescribeDomainRegionDataResponseBody(this);
        } 

    } 

    public static class RegionProportionData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgObjectSize")
        private String avgObjectSize;

        @com.aliyun.core.annotation.NameInMap("AvgResponseRate")
        private String avgResponseRate;

        @com.aliyun.core.annotation.NameInMap("AvgResponseTime")
        private String avgResponseTime;

        @com.aliyun.core.annotation.NameInMap("Bps")
        private String bps;

        @com.aliyun.core.annotation.NameInMap("BytesProportion")
        private String bytesProportion;

        @com.aliyun.core.annotation.NameInMap("Proportion")
        private String proportion;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private String qps;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RegionEname")
        private String regionEname;

        @com.aliyun.core.annotation.NameInMap("ReqErrRate")
        private String reqErrRate;

        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private String totalBytes;

        @com.aliyun.core.annotation.NameInMap("TotalQuery")
        private String totalQuery;

        private RegionProportionData(Builder builder) {
            this.avgObjectSize = builder.avgObjectSize;
            this.avgResponseRate = builder.avgResponseRate;
            this.avgResponseTime = builder.avgResponseTime;
            this.bps = builder.bps;
            this.bytesProportion = builder.bytesProportion;
            this.proportion = builder.proportion;
            this.qps = builder.qps;
            this.region = builder.region;
            this.regionEname = builder.regionEname;
            this.reqErrRate = builder.reqErrRate;
            this.totalBytes = builder.totalBytes;
            this.totalQuery = builder.totalQuery;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionProportionData create() {
            return builder().build();
        }

        /**
         * @return avgObjectSize
         */
        public String getAvgObjectSize() {
            return this.avgObjectSize;
        }

        /**
         * @return avgResponseRate
         */
        public String getAvgResponseRate() {
            return this.avgResponseRate;
        }

        /**
         * @return avgResponseTime
         */
        public String getAvgResponseTime() {
            return this.avgResponseTime;
        }

        /**
         * @return bps
         */
        public String getBps() {
            return this.bps;
        }

        /**
         * @return bytesProportion
         */
        public String getBytesProportion() {
            return this.bytesProportion;
        }

        /**
         * @return proportion
         */
        public String getProportion() {
            return this.proportion;
        }

        /**
         * @return qps
         */
        public String getQps() {
            return this.qps;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionEname
         */
        public String getRegionEname() {
            return this.regionEname;
        }

        /**
         * @return reqErrRate
         */
        public String getReqErrRate() {
            return this.reqErrRate;
        }

        /**
         * @return totalBytes
         */
        public String getTotalBytes() {
            return this.totalBytes;
        }

        /**
         * @return totalQuery
         */
        public String getTotalQuery() {
            return this.totalQuery;
        }

        public static final class Builder {
            private String avgObjectSize; 
            private String avgResponseRate; 
            private String avgResponseTime; 
            private String bps; 
            private String bytesProportion; 
            private String proportion; 
            private String qps; 
            private String region; 
            private String regionEname; 
            private String reqErrRate; 
            private String totalBytes; 
            private String totalQuery; 

            /**
             * The average response size. Unit: bytes.
             */
            public Builder avgObjectSize(String avgObjectSize) {
                this.avgObjectSize = avgObjectSize;
                return this;
            }

            /**
             * The average response speed. Unit: bit/s.
             */
            public Builder avgResponseRate(String avgResponseRate) {
                this.avgResponseRate = avgResponseRate;
                return this;
            }

            /**
             * The average response time. Unit: milliseconds.
             */
            public Builder avgResponseTime(String avgResponseTime) {
                this.avgResponseTime = avgResponseTime;
                return this;
            }

            /**
             * The bandwidth.
             */
            public Builder bps(String bps) {
                this.bps = bps;
                return this;
            }

            /**
             * The proportion of traffic from the region. For example, a value of 90 indicates that 90% of the traffic is from the region.
             */
            public Builder bytesProportion(String bytesProportion) {
                this.bytesProportion = bytesProportion;
                return this;
            }

            /**
             * The proportion of visits from the region. For example, a value of 90 indicates that 90% of the visits are from the region.
             */
            public Builder proportion(String proportion) {
                this.proportion = proportion;
                return this;
            }

            /**
             * The number of queries per second.
             */
            public Builder qps(String qps) {
                this.qps = qps;
                return this;
            }

            /**
             * The information about the region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The name of the region.
             */
            public Builder regionEname(String regionEname) {
                this.regionEname = regionEname;
                return this;
            }

            /**
             * The request error rate. A value of 90 indicates that 90% of the requests encountered errors.
             */
            public Builder reqErrRate(String reqErrRate) {
                this.reqErrRate = reqErrRate;
                return this;
            }

            /**
             * The total traffic. Unit: bytes.
             */
            public Builder totalBytes(String totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            /**
             * The total number of requests.
             */
            public Builder totalQuery(String totalQuery) {
                this.totalQuery = totalQuery;
                return this;
            }

            public RegionProportionData build() {
                return new RegionProportionData(this);
            } 

        } 

    }
    public static class Value extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionProportionData")
        private java.util.List < RegionProportionData> regionProportionData;

        private Value(Builder builder) {
            this.regionProportionData = builder.regionProportionData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return regionProportionData
         */
        public java.util.List < RegionProportionData> getRegionProportionData() {
            return this.regionProportionData;
        }

        public static final class Builder {
            private java.util.List < RegionProportionData> regionProportionData; 

            /**
             * RegionProportionData.
             */
            public Builder regionProportionData(java.util.List < RegionProportionData> regionProportionData) {
                this.regionProportionData = regionProportionData;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
}
