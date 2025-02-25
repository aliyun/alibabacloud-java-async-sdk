// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainTrafficDataResponseBody</p>
 */
public class DescribeDomainTrafficDataResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("TrafficDataPerInterval")
    private TrafficDataPerInterval trafficDataPerInterval;

    private DescribeDomainTrafficDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.trafficDataPerInterval = builder.trafficDataPerInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainTrafficDataResponseBody create() {
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
        private TrafficDataPerInterval trafficDataPerInterval; 

        /**
         * <p>The time interval between the data entries returned. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
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
         * <p>2015-12-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
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
         * <p>The start of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The amount of network traffic at each time interval. Unit: bytes.</p>
         */
        public Builder trafficDataPerInterval(TrafficDataPerInterval trafficDataPerInterval) {
            this.trafficDataPerInterval = trafficDataPerInterval;
            return this;
        }

        public DescribeDomainTrafficDataResponseBody build() {
            return new DescribeDomainTrafficDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainTrafficDataResponseBody</p>
     */
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
             * <p>The amount of network traffic in the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder domesticValue(String domesticValue) {
                this.domesticValue = domesticValue;
                return this;
            }

            /**
             * <p>The amount of HTTPS traffic on points of presence (POPs) in the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder httpsDomesticValue(String httpsDomesticValue) {
                this.httpsDomesticValue = httpsDomesticValue;
                return this;
            }

            /**
             * <p>The amount of HTTPS traffic on POPs outside the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder httpsOverseasValue(String httpsOverseasValue) {
                this.httpsOverseasValue = httpsOverseasValue;
                return this;
            }

            /**
             * <p>The total amount of HTTPS traffic on POPs.</p>
             * 
             * <strong>example:</strong>
             * <p>423304182</p>
             */
            public Builder httpsValue(String httpsValue) {
                this.httpsValue = httpsValue;
                return this;
            }

            /**
             * <p>The amount of network traffic outside the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder overseasValue(String overseasValue) {
                this.overseasValue = overseasValue;
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
             * <p>The total volume of traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>423304182</p>
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
    /**
     * 
     * {@link DescribeDomainTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainTrafficDataResponseBody</p>
     */
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
