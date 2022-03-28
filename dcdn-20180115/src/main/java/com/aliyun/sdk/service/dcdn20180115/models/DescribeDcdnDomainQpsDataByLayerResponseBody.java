// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainQpsDataByLayerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainQpsDataByLayerResponseBody</p>
 */
public class DescribeDcdnDomainQpsDataByLayerResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("Layer")
    private String layer;

    @NameInMap("QpsDataInterval")
    private QpsDataInterval qpsDataInterval;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
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
         * DataInterval.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Layer.
         */
        public Builder layer(String layer) {
            this.layer = layer;
            return this;
        }

        /**
         * QpsDataInterval.
         */
        public Builder qpsDataInterval(QpsDataInterval qpsDataInterval) {
            this.qpsDataInterval = qpsDataInterval;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnDomainQpsDataByLayerResponseBody build() {
            return new DescribeDcdnDomainQpsDataByLayerResponseBody(this);
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
             * AccDomesticValue.
             */
            public Builder accDomesticValue(String accDomesticValue) {
                this.accDomesticValue = accDomesticValue;
                return this;
            }

            /**
             * AccOverseasValue.
             */
            public Builder accOverseasValue(String accOverseasValue) {
                this.accOverseasValue = accOverseasValue;
                return this;
            }

            /**
             * AccValue.
             */
            public Builder accValue(String accValue) {
                this.accValue = accValue;
                return this;
            }

            /**
             * DomesticValue.
             */
            public Builder domesticValue(String domesticValue) {
                this.domesticValue = domesticValue;
                return this;
            }

            /**
             * OverseasValue.
             */
            public Builder overseasValue(String overseasValue) {
                this.overseasValue = overseasValue;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * Value.
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
