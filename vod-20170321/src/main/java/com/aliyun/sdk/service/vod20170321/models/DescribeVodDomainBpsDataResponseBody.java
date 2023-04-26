// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodDomainBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainBpsDataResponseBody</p>
 */
public class DescribeVodDomainBpsDataResponseBody extends TeaModel {
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

    private DescribeVodDomainBpsDataResponseBody(Builder builder) {
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

    public static DescribeVodDomainBpsDataResponseBody create() {
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
         * The name of the ISP. By default, the data of all ISPs is returned.
         */
        public Builder bpsDataPerInterval(BpsDataPerInterval bpsDataPerInterval) {
            this.bpsDataPerInterval = bpsDataPerInterval;
            return this;
        }

        /**
         * The HTTPS bandwidth on L1 nodes in mainland China. Unit: bit/s. When the bandwidth data is queried by ISP, no value is returned.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * The time interval between the returned entries. Unit: seconds.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The bandwidth. Unit: bit/s.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The beginning of the time range in which data was queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder ispNameEn(String ispNameEn) {
            this.ispNameEn = ispNameEn;
            return this;
        }

        /**
         * The query interval. Unit: seconds. Valid values: **300**, **3600**, and **86400**.
         * <p>
         * 
         * *   If the time range to query is less than 3 days, valid values are **300**, **3600**, and **86400**. The default value is 300.
         * *   If the time range to query is from 3 to less than 31 days, valid values are **3600** and **86400**. The default value is 3600.
         * *   If the time range to query is from 31 to 90 days, the valid value is **86400**.
         */
        public Builder locationNameEn(String locationNameEn) {
            this.locationNameEn = locationNameEn;
            return this;
        }

        /**
         * The name of the region. By default, the data in all regions is returned.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The domain name to be queried. If you do not specify this parameter, the merged data of all your domain names for CDN is returned. You can specify multiple domain names. Separate them with commas (,).
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeVodDomainBpsDataResponseBody build() {
            return new DescribeVodDomainBpsDataResponseBody(this);
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
             * The ID of the request.
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
             * Queries the bandwidth for one or more specified domain names for CDN.
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
