// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainBpsDataByLayerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainBpsDataByLayerResponseBody</p>
 */
public class DescribeDcdnDomainBpsDataByLayerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BpsDataInterval")
    private BpsDataInterval bpsDataInterval;

    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The bandwidth returned at each time interval.</p>
         */
        public Builder bpsDataInterval(BpsDataInterval bpsDataInterval) {
            this.bpsDataInterval = bpsDataInterval;
            return this;
        }

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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnDomainBpsDataByLayerResponseBody build() {
            return new DescribeDcdnDomainBpsDataByLayerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainBpsDataByLayerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainBpsDataByLayerResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DynamicTrafficValue")
        private String dynamicTrafficValue;

        @com.aliyun.core.annotation.NameInMap("DynamicValue")
        private String dynamicValue;

        @com.aliyun.core.annotation.NameInMap("StaticTrafficValue")
        private String staticTrafficValue;

        @com.aliyun.core.annotation.NameInMap("StaticValue")
        private String staticValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("TrafficValue")
        private String trafficValue;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The traffic that is used to deliver dynamic content. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder dynamicTrafficValue(String dynamicTrafficValue) {
                this.dynamicTrafficValue = dynamicTrafficValue;
                return this;
            }

            /**
             * <p>The bandwidth that is used to deliver dynamic content. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0.34</p>
             */
            public Builder dynamicValue(String dynamicValue) {
                this.dynamicValue = dynamicValue;
                return this;
            }

            /**
             * <p>The traffic that is used to deliver static content. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>131</p>
             */
            public Builder staticTrafficValue(String staticTrafficValue) {
                this.staticTrafficValue = staticTrafficValue;
                return this;
            }

            /**
             * <p>The bandwidth that is used to deliver static content. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0.22</p>
             */
            public Builder staticValue(String staticValue) {
                this.staticValue = staticValue;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-10T21:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The total traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>331</p>
             */
            public Builder trafficValue(String trafficValue) {
                this.trafficValue = trafficValue;
                return this;
            }

            /**
             * <p>The total bandwidth. Unit: bit/s.</p>
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
     * {@link DescribeDcdnDomainBpsDataByLayerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainBpsDataByLayerResponseBody</p>
     */
    public static class BpsDataInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
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
