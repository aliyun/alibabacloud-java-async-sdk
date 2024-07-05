// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodDomainTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainTrafficDataResponseBody</p>
 */
public class DescribeVodDomainTrafficDataResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("TotalTraffic")
    private String totalTraffic;

    @com.aliyun.core.annotation.NameInMap("TrafficDataPerInterval")
    private TrafficDataPerInterval trafficDataPerInterval;

    private DescribeVodDomainTrafficDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.totalTraffic = builder.totalTraffic;
        this.trafficDataPerInterval = builder.trafficDataPerInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainTrafficDataResponseBody create() {
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
     * @return totalTraffic
     */
    public String getTotalTraffic() {
        return this.totalTraffic;
    }

    /**
     * @return trafficDataPerInterval
     */
    public TrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public static final class Builder {
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private String totalTraffic; 
        private TrafficDataPerInterval trafficDataPerInterval; 

        /**
         * The time interval at which data is returned, which is the time granularity. Unit: seconds.
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
         * The end of the time range.
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
         * The beginning of the time range.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The total amount of network traffic.
         */
        public Builder totalTraffic(String totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }

        /**
         * The amount of network traffic at each time interval.
         */
        public Builder trafficDataPerInterval(TrafficDataPerInterval trafficDataPerInterval) {
            this.trafficDataPerInterval = trafficDataPerInterval;
            return this;
        }

        public DescribeVodDomainTrafficDataResponseBody build() {
            return new DescribeVodDomainTrafficDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomesticValue")
        private String domesticValue;

        @com.aliyun.core.annotation.NameInMap("HttpsDomesticValue")
        private String httpsDomesticValue;

        @com.aliyun.core.annotation.NameInMap("HttpsOverseasValue")
        private String httpsOverseasValue;

        @com.aliyun.core.annotation.NameInMap("HttpsValue")
        private String httpsValue;

        @com.aliyun.core.annotation.NameInMap("OverseasValue")
        private String overseasValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
            this.domesticValue = builder.domesticValue;
            this.httpsDomesticValue = builder.httpsDomesticValue;
            this.httpsOverseasValue = builder.httpsOverseasValue;
            this.httpsValue = builder.httpsValue;
            this.overseasValue = builder.overseasValue;
            this.timeStamp = builder.timeStamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return domesticValue
         */
        public String getDomesticValue() {
            return this.domesticValue;
        }

        /**
         * @return httpsDomesticValue
         */
        public String getHttpsDomesticValue() {
            return this.httpsDomesticValue;
        }

        /**
         * @return httpsOverseasValue
         */
        public String getHttpsOverseasValue() {
            return this.httpsOverseasValue;
        }

        /**
         * @return httpsValue
         */
        public String getHttpsValue() {
            return this.httpsValue;
        }

        /**
         * @return overseasValue
         */
        public String getOverseasValue() {
            return this.overseasValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String domesticValue; 
            private String httpsDomesticValue; 
            private String httpsOverseasValue; 
            private String httpsValue; 
            private String overseasValue; 
            private String timeStamp; 
            private String value; 

            /**
             * The amount of network traffic in the Chinese mainland. Unit: bytes.
             */
            public Builder domesticValue(String domesticValue) {
                this.domesticValue = domesticValue;
                return this;
            }

            /**
             * The amount of HTTPS network traffic on points of presence (POPs) in the Chinese mainland. Unit: bytes.
             */
            public Builder httpsDomesticValue(String httpsDomesticValue) {
                this.httpsDomesticValue = httpsDomesticValue;
                return this;
            }

            /**
             * The amount of HTTPS network traffic on POPs outside the Chinese mainland. Unit: bytes.
             */
            public Builder httpsOverseasValue(String httpsOverseasValue) {
                this.httpsOverseasValue = httpsOverseasValue;
                return this;
            }

            /**
             * The total amount of HTTPS network traffic on POPs. Unit: bytes.
             */
            public Builder httpsValue(String httpsValue) {
                this.httpsValue = httpsValue;
                return this;
            }

            /**
             * The amount of network traffic outside the Chinese mainland. Unit: bytes.
             */
            public Builder overseasValue(String overseasValue) {
                this.overseasValue = overseasValue;
                return this;
            }

            /**
             * The timestamp of the data returned. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The total traffic. Unit: bytes.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    public static class TrafficDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private TrafficDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficDataPerInterval create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List < DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List < DataModule> dataModule; 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List < DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public TrafficDataPerInterval build() {
                return new TrafficDataPerInterval(this);
            } 

        } 

    }
}
