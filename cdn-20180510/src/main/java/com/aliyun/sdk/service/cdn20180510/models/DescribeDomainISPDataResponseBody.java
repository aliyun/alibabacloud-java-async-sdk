// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainISPDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainISPDataResponseBody</p>
 */
public class DescribeDomainISPDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("Value")
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
         * The time interval. Unit: seconds.
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
         * The end of the time range during which data was queried.
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
         * The beginning of the time range that was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The access statistics by ISP.
         */
        public Builder value(Value value) {
            this.value = value;
            return this;
        }

        public DescribeDomainISPDataResponseBody build() {
            return new DescribeDomainISPDataResponseBody(this);
        } 

    } 

    public static class ISPProportionData extends TeaModel {
        @NameInMap("AvgObjectSize")
        private String avgObjectSize;

        @NameInMap("AvgResponseRate")
        private String avgResponseRate;

        @NameInMap("AvgResponseTime")
        private String avgResponseTime;

        @NameInMap("Bps")
        private String bps;

        @NameInMap("BytesProportion")
        private String bytesProportion;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("IspEname")
        private String ispEname;

        @NameInMap("Proportion")
        private String proportion;

        @NameInMap("Qps")
        private String qps;

        @NameInMap("ReqErrRate")
        private String reqErrRate;

        @NameInMap("TotalBytes")
        private String totalBytes;

        @NameInMap("TotalQuery")
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
             * The average response size. Unit: bytes.
             */
            public Builder avgObjectSize(String avgObjectSize) {
                this.avgObjectSize = avgObjectSize;
                return this;
            }

            /**
             * The average response speed. Unit: byte/ms.
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
             * The proportion of network traffic.
             */
            public Builder bytesProportion(String bytesProportion) {
                this.bytesProportion = bytesProportion;
                return this;
            }

            /**
             * The information about the ISP.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * The name of the ISP.
             */
            public Builder ispEname(String ispEname) {
                this.ispEname = ispEname;
                return this;
            }

            /**
             * The proportion of the HTTP status code.
             */
            public Builder proportion(String proportion) {
                this.proportion = proportion;
                return this;
            }

            /**
             * The QPS.
             */
            public Builder qps(String qps) {
                this.qps = qps;
                return this;
            }

            /**
             * The request error rate.
             */
            public Builder reqErrRate(String reqErrRate) {
                this.reqErrRate = reqErrRate;
                return this;
            }

            /**
             * The total volume of traffic.
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

            public ISPProportionData build() {
                return new ISPProportionData(this);
            } 

        } 

    }
    public static class Value extends TeaModel {
        @NameInMap("ISPProportionData")
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
