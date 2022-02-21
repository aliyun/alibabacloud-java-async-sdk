// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainBpsDataResponseBody</p>
 */
public class DescribeDomainBpsDataResponseBody extends TeaModel {
    @NameInMap("BpsDataPerInterval")
    private BpsDataPerInterval bpsDataPerInterval;

    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("IspNameEn")
    private String ispNameEn;

    @NameInMap("LocationNameEn")
    private String locationNameEn;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDomainBpsDataResponseBody(Builder builder) {
        this.bpsDataPerInterval = builder.bpsDataPerInterval;
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.ispNameEn = builder.ispNameEn;
        this.locationNameEn = builder.locationNameEn;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainBpsDataResponseBody create() {
        return builder().build();
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
     * @return ispNameEn
     */
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    /**
     * @return locationNameEn
     */
    public String getLocationNameEn() {
        return this.locationNameEn;
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
        private BpsDataPerInterval bpsDataPerInterval; 
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String ispNameEn; 
        private String locationNameEn; 
        private String requestId; 
        private String startTime; 

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
         * IspNameEn.
         */
        public Builder ispNameEn(String ispNameEn) {
            this.ispNameEn = ispNameEn;
            return this;
        }

        /**
         * LocationNameEn.
         */
        public Builder locationNameEn(String locationNameEn) {
            this.locationNameEn = locationNameEn;
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

        public DescribeDomainBpsDataResponseBody build() {
            return new DescribeDomainBpsDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("DomesticValue")
        private String domesticValue;

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
             * DomesticValue.
             */
            public Builder domesticValue(String domesticValue) {
                this.domesticValue = domesticValue;
                return this;
            }

            /**
             * HttpsDomesticValue.
             */
            public Builder httpsDomesticValue(String httpsDomesticValue) {
                this.httpsDomesticValue = httpsDomesticValue;
                return this;
            }

            /**
             * HttpsOverseasValue.
             */
            public Builder httpsOverseasValue(String httpsOverseasValue) {
                this.httpsOverseasValue = httpsOverseasValue;
                return this;
            }

            /**
             * HttpsValue.
             */
            public Builder httpsValue(String httpsValue) {
                this.httpsValue = httpsValue;
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
    public static class BpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

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

            public BpsDataPerInterval build() {
                return new BpsDataPerInterval(this);
            } 

        } 

    }
}
