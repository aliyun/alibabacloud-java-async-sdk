// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeDomainFlowDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainFlowDataResponseBody</p>
 */
public class DescribeDomainFlowDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("FlowDataPerInterval")
    private FlowDataPerInterval flowDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDomainFlowDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.flowDataPerInterval = builder.flowDataPerInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainFlowDataResponseBody create() {
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
     * @return flowDataPerInterval
     */
    public FlowDataPerInterval getFlowDataPerInterval() {
        return this.flowDataPerInterval;
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
        private FlowDataPerInterval flowDataPerInterval; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeDomainFlowDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.flowDataPerInterval = model.flowDataPerInterval;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

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
         * FlowDataPerInterval.
         */
        public Builder flowDataPerInterval(FlowDataPerInterval flowDataPerInterval) {
            this.flowDataPerInterval = flowDataPerInterval;
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

        public DescribeDomainFlowDataResponseBody build() {
            return new DescribeDomainFlowDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainFlowDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainFlowDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomesticValue")
        private String domesticValue;

        @com.aliyun.core.annotation.NameInMap("DynamicDomesticValue")
        private String dynamicDomesticValue;

        @com.aliyun.core.annotation.NameInMap("DynamicOverseasValue")
        private String dynamicOverseasValue;

        @com.aliyun.core.annotation.NameInMap("DynamicValue")
        private String dynamicValue;

        @com.aliyun.core.annotation.NameInMap("OverseasValue")
        private String overseasValue;

        @com.aliyun.core.annotation.NameInMap("StaticDomesticValue")
        private String staticDomesticValue;

        @com.aliyun.core.annotation.NameInMap("StaticOverseasValue")
        private String staticOverseasValue;

        @com.aliyun.core.annotation.NameInMap("StaticValue")
        private String staticValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
            this.domesticValue = builder.domesticValue;
            this.dynamicDomesticValue = builder.dynamicDomesticValue;
            this.dynamicOverseasValue = builder.dynamicOverseasValue;
            this.dynamicValue = builder.dynamicValue;
            this.overseasValue = builder.overseasValue;
            this.staticDomesticValue = builder.staticDomesticValue;
            this.staticOverseasValue = builder.staticOverseasValue;
            this.staticValue = builder.staticValue;
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
         * @return dynamicDomesticValue
         */
        public String getDynamicDomesticValue() {
            return this.dynamicDomesticValue;
        }

        /**
         * @return dynamicOverseasValue
         */
        public String getDynamicOverseasValue() {
            return this.dynamicOverseasValue;
        }

        /**
         * @return dynamicValue
         */
        public String getDynamicValue() {
            return this.dynamicValue;
        }

        /**
         * @return overseasValue
         */
        public String getOverseasValue() {
            return this.overseasValue;
        }

        /**
         * @return staticDomesticValue
         */
        public String getStaticDomesticValue() {
            return this.staticDomesticValue;
        }

        /**
         * @return staticOverseasValue
         */
        public String getStaticOverseasValue() {
            return this.staticOverseasValue;
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String domesticValue; 
            private String dynamicDomesticValue; 
            private String dynamicOverseasValue; 
            private String dynamicValue; 
            private String overseasValue; 
            private String staticDomesticValue; 
            private String staticOverseasValue; 
            private String staticValue; 
            private String timeStamp; 
            private String value; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.domesticValue = model.domesticValue;
                this.dynamicDomesticValue = model.dynamicDomesticValue;
                this.dynamicOverseasValue = model.dynamicOverseasValue;
                this.dynamicValue = model.dynamicValue;
                this.overseasValue = model.overseasValue;
                this.staticDomesticValue = model.staticDomesticValue;
                this.staticOverseasValue = model.staticOverseasValue;
                this.staticValue = model.staticValue;
                this.timeStamp = model.timeStamp;
                this.value = model.value;
            } 

            /**
             * DomesticValue.
             */
            public Builder domesticValue(String domesticValue) {
                this.domesticValue = domesticValue;
                return this;
            }

            /**
             * DynamicDomesticValue.
             */
            public Builder dynamicDomesticValue(String dynamicDomesticValue) {
                this.dynamicDomesticValue = dynamicDomesticValue;
                return this;
            }

            /**
             * DynamicOverseasValue.
             */
            public Builder dynamicOverseasValue(String dynamicOverseasValue) {
                this.dynamicOverseasValue = dynamicOverseasValue;
                return this;
            }

            /**
             * DynamicValue.
             */
            public Builder dynamicValue(String dynamicValue) {
                this.dynamicValue = dynamicValue;
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
             * StaticDomesticValue.
             */
            public Builder staticDomesticValue(String staticDomesticValue) {
                this.staticDomesticValue = staticDomesticValue;
                return this;
            }

            /**
             * StaticOverseasValue.
             */
            public Builder staticOverseasValue(String staticOverseasValue) {
                this.staticOverseasValue = staticOverseasValue;
                return this;
            }

            /**
             * StaticValue.
             */
            public Builder staticValue(String staticValue) {
                this.staticValue = staticValue;
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
    /**
     * 
     * {@link DescribeDomainFlowDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainFlowDataResponseBody</p>
     */
    public static class FlowDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private FlowDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowDataPerInterval create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List<DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List<DataModule> dataModule; 

            private Builder() {
            } 

            private Builder(FlowDataPerInterval model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public FlowDataPerInterval build() {
                return new FlowDataPerInterval(this);
            } 

        } 

    }
}
