// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainISPDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainISPDataResponseBody</p>
 */
public class DescribeDomainISPDataResponseBody extends TeaModel {
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

    private DescribeDomainISPDataResponseBody(Builder builder) {
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

    public static DescribeDomainISPDataResponseBody create() {
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
         * <p>The time interval. Unit: seconds.</p>
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
         * <p>2019-11-30T05:40:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DE81639B-DAC1-4C76-AB72-F34B836837D5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range that was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-29T05:33:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The access statistics by ISP.</p>
         */
        public Builder value(Value value) {
            this.value = value;
            return this;
        }

        public DescribeDomainISPDataResponseBody build() {
            return new DescribeDomainISPDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainISPDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainISPDataResponseBody</p>
     */
    public static class ISPProportionData extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("ISP")
        private String ISP;

        @com.aliyun.core.annotation.NameInMap("IspEname")
        private String ispEname;

        @com.aliyun.core.annotation.NameInMap("Proportion")
        private String proportion;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private String qps;

        @com.aliyun.core.annotation.NameInMap("ReqErrRate")
        private String reqErrRate;

        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private String totalBytes;

        @com.aliyun.core.annotation.NameInMap("TotalQuery")
        private String totalQuery;

        private ISPProportionData(Builder builder) {
            this.avgObjectSize = builder.avgObjectSize;
            this.avgResponseRate = builder.avgResponseRate;
            this.avgResponseTime = builder.avgResponseTime;
            this.bps = builder.bps;
            this.bytesProportion = builder.bytesProportion;
            this.ISP = builder.ISP;
            this.ispEname = builder.ispEname;
            this.proportion = builder.proportion;
            this.qps = builder.qps;
            this.reqErrRate = builder.reqErrRate;
            this.totalBytes = builder.totalBytes;
            this.totalQuery = builder.totalQuery;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ISPProportionData create() {
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
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return ispEname
         */
        public String getIspEname() {
            return this.ispEname;
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
            private String ISP; 
            private String ispEname; 
            private String proportion; 
            private String qps; 
            private String reqErrRate; 
            private String totalBytes; 
            private String totalQuery; 

            /**
             * <p>The average response size. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>7081884.7</p>
             */
            public Builder avgObjectSize(String avgObjectSize) {
                this.avgObjectSize = avgObjectSize;
                return this;
            }

            /**
             * <p>The average response speed. Unit: byte/ms.</p>
             * 
             * <strong>example:</strong>
             * <p>88.92594866772144</p>
             */
            public Builder avgResponseRate(String avgResponseRate) {
                this.avgResponseRate = avgResponseRate;
                return this;
            }

            /**
             * <p>The average response time. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>79638.0</p>
             */
            public Builder avgResponseTime(String avgResponseTime) {
                this.avgResponseTime = avgResponseTime;
                return this;
            }

            /**
             * <p>The bandwidth.</p>
             * 
             * <strong>example:</strong>
             * <p>1311.4601296296296</p>
             */
            public Builder bps(String bps) {
                this.bps = bps;
                return this;
            }

            /**
             * <p>The proportion of network traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>0.012220518530445479</p>
             */
            public Builder bytesProportion(String bytesProportion) {
                this.bytesProportion = bytesProportion;
                return this;
            }

            /**
             * <p>The information about the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * <p>The name of the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba</p>
             */
            public Builder ispEname(String ispEname) {
                this.ispEname = ispEname;
                return this;
            }

            /**
             * <p>The proportion of the HTTP status code.</p>
             * 
             * <strong>example:</strong>
             * <p>0.004509176173513099</p>
             */
            public Builder proportion(String proportion) {
                this.proportion = proportion;
                return this;
            }

            /**
             * <p>The QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>2.3148148148148147E-5</p>
             */
            public Builder qps(String qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The request error rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder reqErrRate(String reqErrRate) {
                this.reqErrRate = reqErrRate;
                return this;
            }

            /**
             * <p>The total volume of traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>7081884</p>
             */
            public Builder totalBytes(String totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalQuery(String totalQuery) {
                this.totalQuery = totalQuery;
                return this;
            }

            public ISPProportionData build() {
                return new ISPProportionData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainISPDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainISPDataResponseBody</p>
     */
    public static class Value extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ISPProportionData")
        private java.util.List < ISPProportionData> ISPProportionData;

        private Value(Builder builder) {
            this.ISPProportionData = builder.ISPProportionData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return ISPProportionData
         */
        public java.util.List < ISPProportionData> getISPProportionData() {
            return this.ISPProportionData;
        }

        public static final class Builder {
            private java.util.List < ISPProportionData> ISPProportionData; 

            /**
             * ISPProportionData.
             */
            public Builder ISPProportionData(java.util.List < ISPProportionData> ISPProportionData) {
                this.ISPProportionData = ISPProportionData;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
}
