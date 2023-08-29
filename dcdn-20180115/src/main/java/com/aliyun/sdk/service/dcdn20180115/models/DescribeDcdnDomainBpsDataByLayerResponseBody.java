// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainBpsDataByLayerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainBpsDataByLayerResponseBody</p>
 */
public class DescribeDcdnDomainBpsDataByLayerResponseBody extends TeaModel {
    @NameInMap("BpsDataInterval")
    private BpsDataInterval bpsDataInterval;

    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnDomainBpsDataByLayerResponseBody(Builder builder) {
        this.bpsDataInterval = builder.bpsDataInterval;
        this.dataInterval = builder.dataInterval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainBpsDataByLayerResponseBody create() {
        return builder().build();
    }

    /**
     * @return bpsDataInterval
     */
    public BpsDataInterval getBpsDataInterval() {
        return this.bpsDataInterval;
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BpsDataInterval bpsDataInterval; 
        private String dataInterval; 
        private String requestId; 

        /**
         * The bandwidth returned at each time interval.
         */
        public Builder bpsDataInterval(BpsDataInterval bpsDataInterval) {
            this.bpsDataInterval = bpsDataInterval;
            return this;
        }

        /**
         * The time interval between the data entries returned. Unit: seconds.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnDomainBpsDataByLayerResponseBody build() {
            return new DescribeDcdnDomainBpsDataByLayerResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("DynamicTrafficValue")
        private String dynamicTrafficValue;

        @NameInMap("DynamicValue")
        private String dynamicValue;

        @NameInMap("StaticTrafficValue")
        private String staticTrafficValue;

        @NameInMap("StaticValue")
        private String staticValue;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("TrafficValue")
        private String trafficValue;

        @NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
            this.dynamicTrafficValue = builder.dynamicTrafficValue;
            this.dynamicValue = builder.dynamicValue;
            this.staticTrafficValue = builder.staticTrafficValue;
            this.staticValue = builder.staticValue;
            this.timeStamp = builder.timeStamp;
            this.trafficValue = builder.trafficValue;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return dynamicTrafficValue
         */
        public String getDynamicTrafficValue() {
            return this.dynamicTrafficValue;
        }

        /**
         * @return dynamicValue
         */
        public String getDynamicValue() {
            return this.dynamicValue;
        }

        /**
         * @return staticTrafficValue
         */
        public String getStaticTrafficValue() {
            return this.staticTrafficValue;
        }

        /**
         * @return staticValue
         */
        public String getStaticValue() {
            return this.staticValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return trafficValue
         */
        public String getTrafficValue() {
            return this.trafficValue;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String dynamicTrafficValue; 
            private String dynamicValue; 
            private String staticTrafficValue; 
            private String staticValue; 
            private String timeStamp; 
            private String trafficValue; 
            private String value; 

            /**
             * The traffic that is used to deliver dynamic content. Unit: bytes.
             */
            public Builder dynamicTrafficValue(String dynamicTrafficValue) {
                this.dynamicTrafficValue = dynamicTrafficValue;
                return this;
            }

            /**
             * The bandwidth that is used to deliver dynamic content. Unit: bit/s.
             */
            public Builder dynamicValue(String dynamicValue) {
                this.dynamicValue = dynamicValue;
                return this;
            }

            /**
             * The traffic that is used to deliver static content. Unit: bytes.
             */
            public Builder staticTrafficValue(String staticTrafficValue) {
                this.staticTrafficValue = staticTrafficValue;
                return this;
            }

            /**
             * The bandwidth that is used to deliver static content. Unit: bit/s.
             */
            public Builder staticValue(String staticValue) {
                this.staticValue = staticValue;
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
             * The total traffic. Unit: bytes.
             */
            public Builder trafficValue(String trafficValue) {
                this.trafficValue = trafficValue;
                return this;
            }

            /**
             * The total bandwidth. Unit: bit/s.
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
    public static class BpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private BpsDataInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BpsDataInterval create() {
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

            public BpsDataInterval build() {
                return new BpsDataInterval(this);
            } 

        } 

    }
}
