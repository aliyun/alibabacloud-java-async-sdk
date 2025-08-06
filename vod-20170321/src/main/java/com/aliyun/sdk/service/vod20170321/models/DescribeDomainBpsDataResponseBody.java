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
 * {@link DescribeDomainBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainBpsDataResponseBody</p>
 */
public class DescribeDomainBpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BpsDataPerInterval")
    private BpsDataPerInterval bpsDataPerInterval;

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

    @com.aliyun.core.annotation.NameInMap("SupplyBpsDatas")
    private SupplyBpsDatas supplyBpsDatas;

    private DescribeDomainBpsDataResponseBody(Builder builder) {
        this.bpsDataPerInterval = builder.bpsDataPerInterval;
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.supplyBpsDatas = builder.supplyBpsDatas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainBpsDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bpsDataPerInterval
     */
    public BpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
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
     * @return supplyBpsDatas
     */
    public SupplyBpsDatas getSupplyBpsDatas() {
        return this.supplyBpsDatas;
    }

    public static final class Builder {
        private BpsDataPerInterval bpsDataPerInterval; 
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private SupplyBpsDatas supplyBpsDatas; 

        private Builder() {
        } 

        private Builder(DescribeDomainBpsDataResponseBody model) {
            this.bpsDataPerInterval = model.bpsDataPerInterval;
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.supplyBpsDatas = model.supplyBpsDatas;
        } 

        /**
         * BpsDataPerInterval.
         */
        public Builder bpsDataPerInterval(BpsDataPerInterval bpsDataPerInterval) {
            this.bpsDataPerInterval = bpsDataPerInterval;
            return this;
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

        /**
         * SupplyBpsDatas.
         */
        public Builder supplyBpsDatas(SupplyBpsDatas supplyBpsDatas) {
            this.supplyBpsDatas = supplyBpsDatas;
            return this;
        }

        public DescribeDomainBpsDataResponseBody build() {
            return new DescribeDomainBpsDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainBpsDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomesticL2Value")
        private String domesticL2Value;

        @com.aliyun.core.annotation.NameInMap("DomesticValue")
        private String domesticValue;

        @com.aliyun.core.annotation.NameInMap("DynamicDomesticValue")
        private String dynamicDomesticValue;

        @com.aliyun.core.annotation.NameInMap("DynamicOverseasValue")
        private String dynamicOverseasValue;

        @com.aliyun.core.annotation.NameInMap("DynamicValue")
        private Long dynamicValue;

        @com.aliyun.core.annotation.NameInMap("L2Value")
        private String l2Value;

        @com.aliyun.core.annotation.NameInMap("OverseasL2Value")
        private String overseasL2Value;

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
            this.domesticL2Value = builder.domesticL2Value;
            this.domesticValue = builder.domesticValue;
            this.dynamicDomesticValue = builder.dynamicDomesticValue;
            this.dynamicOverseasValue = builder.dynamicOverseasValue;
            this.dynamicValue = builder.dynamicValue;
            this.l2Value = builder.l2Value;
            this.overseasL2Value = builder.overseasL2Value;
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
         * @return domesticL2Value
         */
        public String getDomesticL2Value() {
            return this.domesticL2Value;
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
        public Long getDynamicValue() {
            return this.dynamicValue;
        }

        /**
         * @return l2Value
         */
        public String getL2Value() {
            return this.l2Value;
        }

        /**
         * @return overseasL2Value
         */
        public String getOverseasL2Value() {
            return this.overseasL2Value;
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
            private String domesticL2Value; 
            private String domesticValue; 
            private String dynamicDomesticValue; 
            private String dynamicOverseasValue; 
            private Long dynamicValue; 
            private String l2Value; 
            private String overseasL2Value; 
            private String overseasValue; 
            private String staticDomesticValue; 
            private String staticOverseasValue; 
            private String staticValue; 
            private String timeStamp; 
            private String value; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.domesticL2Value = model.domesticL2Value;
                this.domesticValue = model.domesticValue;
                this.dynamicDomesticValue = model.dynamicDomesticValue;
                this.dynamicOverseasValue = model.dynamicOverseasValue;
                this.dynamicValue = model.dynamicValue;
                this.l2Value = model.l2Value;
                this.overseasL2Value = model.overseasL2Value;
                this.overseasValue = model.overseasValue;
                this.staticDomesticValue = model.staticDomesticValue;
                this.staticOverseasValue = model.staticOverseasValue;
                this.staticValue = model.staticValue;
                this.timeStamp = model.timeStamp;
                this.value = model.value;
            } 

            /**
             * DomesticL2Value.
             */
            public Builder domesticL2Value(String domesticL2Value) {
                this.domesticL2Value = domesticL2Value;
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
            public Builder dynamicValue(Long dynamicValue) {
                this.dynamicValue = dynamicValue;
                return this;
            }

            /**
             * L2Value.
             */
            public Builder l2Value(String l2Value) {
                this.l2Value = l2Value;
                return this;
            }

            /**
             * OverseasL2Value.
             */
            public Builder overseasL2Value(String overseasL2Value) {
                this.overseasL2Value = overseasL2Value;
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
     * {@link DescribeDomainBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainBpsDataResponseBody</p>
     */
    public static class BpsDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private BpsDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BpsDataPerInterval create() {
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

            private Builder(BpsDataPerInterval model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public BpsDataPerInterval build() {
                return new BpsDataPerInterval(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainBpsDataResponseBody</p>
     */
    public static class SupplyBpsDatasDataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SupplyBpsDatasDataModule(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupplyBpsDatasDataModule create() {
            return builder().build();
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
            private String timeStamp; 
            private String value; 

            private Builder() {
            } 

            private Builder(SupplyBpsDatasDataModule model) {
                this.timeStamp = model.timeStamp;
                this.value = model.value;
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

            public SupplyBpsDatasDataModule build() {
                return new SupplyBpsDatasDataModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainBpsDataResponseBody</p>
     */
    public static class SupplyBpsDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<SupplyBpsDatasDataModule> dataModule;

        private SupplyBpsDatas(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupplyBpsDatas create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List<SupplyBpsDatasDataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List<SupplyBpsDatasDataModule> dataModule; 

            private Builder() {
            } 

            private Builder(SupplyBpsDatas model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<SupplyBpsDatasDataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public SupplyBpsDatas build() {
                return new SupplyBpsDatas(this);
            } 

        } 

    }
}
