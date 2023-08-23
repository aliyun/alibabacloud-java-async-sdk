// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainQpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainQpsDataResponseBody</p>
 */
public class DescribeDomainQpsDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("QpsDataInterval")
    private QpsDataInterval qpsDataInterval;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDomainQpsDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.qpsDataInterval = builder.qpsDataInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainQpsDataResponseBody create() {
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
     * @return qpsDataInterval
     */
    public QpsDataInterval getQpsDataInterval() {
        return this.qpsDataInterval;
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

    public static final class Builder {
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private QpsDataInterval qpsDataInterval; 
        private String requestId; 
        private String startTime; 

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
         * The end of the time range during which data was queried.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The list of QPS records at each interval.
         */
        public Builder qpsDataInterval(QpsDataInterval qpsDataInterval) {
            this.qpsDataInterval = qpsDataInterval;
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
         * The start of the time range during which data was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDomainQpsDataResponseBody build() {
            return new DescribeDomainQpsDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("AccDomesticValue")
        private String accDomesticValue;

        @NameInMap("AccOverseasValue")
        private String accOverseasValue;

        @NameInMap("AccValue")
        private String accValue;

        @NameInMap("DomesticValue")
        private String domesticValue;

        @NameInMap("HttpsAccDomesticValue")
        private String httpsAccDomesticValue;

        @NameInMap("HttpsAccOverseasValue")
        private String httpsAccOverseasValue;

        @NameInMap("HttpsAccValue")
        private String httpsAccValue;

        @NameInMap("HttpsDomesticValue")
        private String httpsDomesticValue;

        @NameInMap("HttpsOverseasValue")
        private String httpsOverseasValue;

        @NameInMap("HttpsValue")
        private String httpsValue;

        @NameInMap("OverseasValue")
        private String overseasValue;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
            this.accDomesticValue = builder.accDomesticValue;
            this.accOverseasValue = builder.accOverseasValue;
            this.accValue = builder.accValue;
            this.domesticValue = builder.domesticValue;
            this.httpsAccDomesticValue = builder.httpsAccDomesticValue;
            this.httpsAccOverseasValue = builder.httpsAccOverseasValue;
            this.httpsAccValue = builder.httpsAccValue;
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
         * @return accDomesticValue
         */
        public String getAccDomesticValue() {
            return this.accDomesticValue;
        }

        /**
         * @return accOverseasValue
         */
        public String getAccOverseasValue() {
            return this.accOverseasValue;
        }

        /**
         * @return accValue
         */
        public String getAccValue() {
            return this.accValue;
        }

        /**
         * @return domesticValue
         */
        public String getDomesticValue() {
            return this.domesticValue;
        }

        /**
         * @return httpsAccDomesticValue
         */
        public String getHttpsAccDomesticValue() {
            return this.httpsAccDomesticValue;
        }

        /**
         * @return httpsAccOverseasValue
         */
        public String getHttpsAccOverseasValue() {
            return this.httpsAccOverseasValue;
        }

        /**
         * @return httpsAccValue
         */
        public String getHttpsAccValue() {
            return this.httpsAccValue;
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
            private String accDomesticValue; 
            private String accOverseasValue; 
            private String accValue; 
            private String domesticValue; 
            private String httpsAccDomesticValue; 
            private String httpsAccOverseasValue; 
            private String httpsAccValue; 
            private String httpsDomesticValue; 
            private String httpsOverseasValue; 
            private String httpsValue; 
            private String overseasValue; 
            private String timeStamp; 
            private String value; 

            /**
             * The number of requests in the Chinese mainland.
             */
            public Builder accDomesticValue(String accDomesticValue) {
                this.accDomesticValue = accDomesticValue;
                return this;
            }

            /**
             * The number of requests outside the Chinese mainland.
             */
            public Builder accOverseasValue(String accOverseasValue) {
                this.accOverseasValue = accOverseasValue;
                return this;
            }

            /**
             * The total number of requests.
             */
            public Builder accValue(String accValue) {
                this.accValue = accValue;
                return this;
            }

            /**
             * The number of queries per second in the Chinese mainland.
             */
            public Builder domesticValue(String domesticValue) {
                this.domesticValue = domesticValue;
                return this;
            }

            /**
             * The number of HTTPS requests sent to POPs in the Chinese mainland.
             */
            public Builder httpsAccDomesticValue(String httpsAccDomesticValue) {
                this.httpsAccDomesticValue = httpsAccDomesticValue;
                return this;
            }

            /**
             * The number of HTTPS requests sent to POPs outside the Chinese mainland.
             */
            public Builder httpsAccOverseasValue(String httpsAccOverseasValue) {
                this.httpsAccOverseasValue = httpsAccOverseasValue;
                return this;
            }

            /**
             * The number of HTTPS requests sent to POPs.
             */
            public Builder httpsAccValue(String httpsAccValue) {
                this.httpsAccValue = httpsAccValue;
                return this;
            }

            /**
             * The number of queries per second that is calculated based on the HTTPS requests sent to POPs in the Chinese mainland.
             */
            public Builder httpsDomesticValue(String httpsDomesticValue) {
                this.httpsDomesticValue = httpsDomesticValue;
                return this;
            }

            /**
             * The number of queries per second that is calculated based on the HTTPS requests sent to POPs outside the Chinese mainland.
             */
            public Builder httpsOverseasValue(String httpsOverseasValue) {
                this.httpsOverseasValue = httpsOverseasValue;
                return this;
            }

            /**
             * The number of queries per second that is calculated based on the HTTPS requests sent to points of presence (POPs).
             */
            public Builder httpsValue(String httpsValue) {
                this.httpsValue = httpsValue;
                return this;
            }

            /**
             * The number of queries per second outside the Chinese mainland.
             */
            public Builder overseasValue(String overseasValue) {
                this.overseasValue = overseasValue;
                return this;
            }

            /**
             * The timestamp of the data returned.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The total QPS.
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
    public static class QpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private QpsDataInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QpsDataInterval create() {
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

            public QpsDataInterval build() {
                return new QpsDataInterval(this);
            } 

        } 

    }
}
