// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link DescribeDcdnDomainRegionDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainRegionDataResponseBody</p>
 */
public class DescribeDcdnDomainRegionDataResponseBody extends TeaModel {
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

    private DescribeDcdnDomainRegionDataResponseBody(Builder builder) {
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

    public static DescribeDcdnDomainRegionDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDcdnDomainRegionDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.value = model.value;
        } 

        /**
         * <p>The time interval between the data entries returned. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
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
         * <p>2015-12-07T12:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2E5AD83F-BD7B-462E-8319-2E30E305519A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-05T12:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The proportions of requests that were initiated from each region.</p>
         */
        public Builder value(Value value) {
            this.value = value;
            return this;
        }

        public DescribeDcdnDomainRegionDataResponseBody build() {
            return new DescribeDcdnDomainRegionDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainRegionDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainRegionDataResponseBody</p>
     */
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
            private String totalBytes; 
            private String totalQuery; 

            private Builder() {
            } 

            private Builder(RegionProportionData model) {
                this.avgObjectSize = model.avgObjectSize;
                this.avgResponseRate = model.avgResponseRate;
                this.avgResponseTime = model.avgResponseTime;
                this.bps = model.bps;
                this.bytesProportion = model.bytesProportion;
                this.proportion = model.proportion;
                this.qps = model.qps;
                this.region = model.region;
                this.regionEname = model.regionEname;
                this.totalBytes = model.totalBytes;
                this.totalQuery = model.totalQuery;
            } 

            /**
             * <p>The average response size. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgObjectSize(String avgObjectSize) {
                this.avgObjectSize = avgObjectSize;
                return this;
            }

            /**
             * <p>The average response speed. Unit: byte/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgResponseRate(String avgResponseRate) {
                this.avgResponseRate = avgResponseRate;
                return this;
            }

            /**
             * <p>The average response time. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgResponseTime(String avgResponseTime) {
                this.avgResponseTime = avgResponseTime;
                return this;
            }

            /**
             * <p>The bandwidth.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bps(String bps) {
                this.bps = bps;
                return this;
            }

            /**
             * <p>The proportion of network traffic. For example, a value of 90 indicates that 90% of network traffic was coming from the specified ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>0.003544181046236794</p>
             */
            public Builder bytesProportion(String bytesProportion) {
                this.bytesProportion = bytesProportion;
                return this;
            }

            /**
             * <p>The proportion of requests from the specified region based on the total number of requests in percentile. For example, a value of 90 indicates that 90% of the requests were coming from the specified region.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder proportion(String proportion) {
                this.proportion = proportion;
                return this;
            }

            /**
             * <p>The number of queries per second (QPS).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder qps(String qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The information of the regions.</p>
             * 
             * <strong>example:</strong>
             * <p>Chongqing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>chongqing</p>
             */
            public Builder regionEname(String regionEname) {
                this.regionEname = regionEname;
                return this;
            }

            /**
             * <p>The total amount of network traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalBytes(String totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            /**
             * <p>The total number of requests that are destined for your website.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainRegionDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainRegionDataResponseBody</p>
     */
    public static class Value extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionProportionData")
        private java.util.List<RegionProportionData> regionProportionData;

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
        public java.util.List<RegionProportionData> getRegionProportionData() {
            return this.regionProportionData;
        }

        public static final class Builder {
            private java.util.List<RegionProportionData> regionProportionData; 

            private Builder() {
            } 

            private Builder(Value model) {
                this.regionProportionData = model.regionProportionData;
            } 

            /**
             * RegionProportionData.
             */
            public Builder regionProportionData(java.util.List<RegionProportionData> regionProportionData) {
                this.regionProportionData = regionProportionData;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
}
