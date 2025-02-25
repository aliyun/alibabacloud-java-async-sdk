// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainQpsDataByLayerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainQpsDataByLayerResponseBody</p>
 */
public class DescribeDcdnDomainQpsDataByLayerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Layer")
    private String layer;

    @com.aliyun.core.annotation.NameInMap("QpsDataInterval")
    private QpsDataInterval qpsDataInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnDomainQpsDataByLayerResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.layer = builder.layer;
        this.qpsDataInterval = builder.qpsDataInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainQpsDataByLayerResponseBody create() {
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
     * @return layer
     */
    public String getLayer() {
        return this.layer;
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
        private String layer; 
        private QpsDataInterval qpsDataInterval; 
        private String requestId; 
        private String startTime; 

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
         * <p>The layer at which the data was collected.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder layer(String layer) {
            this.layer = layer;
            return this;
        }

        /**
         * <p>The QPS returned at each time interval.</p>
         */
        public Builder qpsDataInterval(QpsDataInterval qpsDataInterval) {
            this.qpsDataInterval = qpsDataInterval;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
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

        public DescribeDcdnDomainQpsDataByLayerResponseBody build() {
            return new DescribeDcdnDomainQpsDataByLayerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainQpsDataByLayerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainQpsDataByLayerResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccDomesticValue")
        private String accDomesticValue;

        @com.aliyun.core.annotation.NameInMap("AccOverseasValue")
        private String accOverseasValue;

        @com.aliyun.core.annotation.NameInMap("AccValue")
        private String accValue;

        @com.aliyun.core.annotation.NameInMap("DomesticValue")
        private String domesticValue;

        @com.aliyun.core.annotation.NameInMap("OverseasValue")
        private String overseasValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
            this.accDomesticValue = builder.accDomesticValue;
            this.accOverseasValue = builder.accOverseasValue;
            this.accValue = builder.accValue;
            this.domesticValue = builder.domesticValue;
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
            private String overseasValue; 
            private String timeStamp; 
            private String value; 

            /**
             * <p>The number of requests in the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder accDomesticValue(String accDomesticValue) {
                this.accDomesticValue = accDomesticValue;
                return this;
            }

            /**
             * <p>The number of requests outside the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>44</p>
             */
            public Builder accOverseasValue(String accOverseasValue) {
                this.accOverseasValue = accOverseasValue;
                return this;
            }

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder accValue(String accValue) {
                this.accValue = accValue;
                return this;
            }

            /**
             * <p>The number of queries per second in the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>0.12</p>
             */
            public Builder domesticValue(String domesticValue) {
                this.domesticValue = domesticValue;
                return this;
            }

            /**
             * <p>The number of queries per second outside the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>0.44</p>
             */
            public Builder overseasValue(String overseasValue) {
                this.overseasValue = overseasValue;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-10T21:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The total number of queries per second.</p>
             * 
             * <strong>example:</strong>
             * <p>0.56</p>
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
     * {@link DescribeDcdnDomainQpsDataByLayerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainQpsDataByLayerResponseBody</p>
     */
    public static class QpsDataInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
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
