// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainBpsDataResponseBody</p>
 */
public class DescribeDcdnDomainBpsDataResponseBody extends TeaModel {
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

    private DescribeDcdnDomainBpsDataResponseBody(Builder builder) {
        this.bpsDataPerInterval = builder.bpsDataPerInterval;
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainBpsDataResponseBody create() {
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
        private String requestId; 
        private String startTime; 

        /**
         * The bandwidth data returned at each interval.
         */
        public Builder bpsDataPerInterval(BpsDataPerInterval bpsDataPerInterval) {
            this.bpsDataPerInterval = bpsDataPerInterval;
            return this;
        }

        /**
         * The time interval between the data entries returned.
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

        public DescribeDcdnDomainBpsDataResponseBody build() {
            return new DescribeDcdnDomainBpsDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bps")
        private Float bps;

        @com.aliyun.core.annotation.NameInMap("DynamicHttpBps")
        private Float dynamicHttpBps;

        @com.aliyun.core.annotation.NameInMap("DynamicHttpsBps")
        private Float dynamicHttpsBps;

        @com.aliyun.core.annotation.NameInMap("StaticHttpBps")
        private Float staticHttpBps;

        @com.aliyun.core.annotation.NameInMap("StaticHttpsBps")
        private Float staticHttpsBps;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.bps = builder.bps;
            this.dynamicHttpBps = builder.dynamicHttpBps;
            this.dynamicHttpsBps = builder.dynamicHttpsBps;
            this.staticHttpBps = builder.staticHttpBps;
            this.staticHttpsBps = builder.staticHttpsBps;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return bps
         */
        public Float getBps() {
            return this.bps;
        }

        /**
         * @return dynamicHttpBps
         */
        public Float getDynamicHttpBps() {
            return this.dynamicHttpBps;
        }

        /**
         * @return dynamicHttpsBps
         */
        public Float getDynamicHttpsBps() {
            return this.dynamicHttpsBps;
        }

        /**
         * @return staticHttpBps
         */
        public Float getStaticHttpBps() {
            return this.staticHttpBps;
        }

        /**
         * @return staticHttpsBps
         */
        public Float getStaticHttpsBps() {
            return this.staticHttpsBps;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Float bps; 
            private Float dynamicHttpBps; 
            private Float dynamicHttpsBps; 
            private Float staticHttpBps; 
            private Float staticHttpsBps; 
            private String timeStamp; 

            /**
             * The bandwidth value. Unit: bit/s.
             */
            public Builder bps(Float bps) {
                this.bps = bps;
                return this;
            }

            /**
             * The bandwidth that was consumed to deliver dynamic content over HTTP. Unit: bit/s.
             */
            public Builder dynamicHttpBps(Float dynamicHttpBps) {
                this.dynamicHttpBps = dynamicHttpBps;
                return this;
            }

            /**
             * The bandwidth that was consumed to deliver dynamic content over HTTPS. Unit: bit/s.
             */
            public Builder dynamicHttpsBps(Float dynamicHttpsBps) {
                this.dynamicHttpsBps = dynamicHttpsBps;
                return this;
            }

            /**
             * The bandwidth that was consumed to deliver static content over HTTP. Unit: bit/s.
             */
            public Builder staticHttpBps(Float staticHttpBps) {
                this.staticHttpBps = staticHttpBps;
                return this;
            }

            /**
             * The bandwidth that was consumed to deliver static content over HTTPS. Unit: bit/s.
             */
            public Builder staticHttpsBps(Float staticHttpsBps) {
                this.staticHttpsBps = staticHttpsBps;
                return this;
            }

            /**
             * The timestamp of the data returned.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    public static class BpsDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
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
