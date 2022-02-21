// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainBpsDataResponseBody</p>
 */
public class DescribeDcdnDomainBpsDataResponseBody extends TeaModel {
    @NameInMap("BpsDataPerInterval")
    private BpsDataPerInterval bpsDataPerInterval;

    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
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

        public DescribeDcdnDomainBpsDataResponseBody build() {
            return new DescribeDcdnDomainBpsDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("Bps")
        private Float bps;

        @NameInMap("DynamicHttpBps")
        private Float dynamicHttpBps;

        @NameInMap("DynamicHttpsBps")
        private Float dynamicHttpsBps;

        @NameInMap("StaticHttpBps")
        private Float staticHttpBps;

        @NameInMap("StaticHttpsBps")
        private Float staticHttpsBps;

        @NameInMap("TimeStamp")
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
             * Bps.
             */
            public Builder bps(Float bps) {
                this.bps = bps;
                return this;
            }

            /**
             * DynamicHttpBps.
             */
            public Builder dynamicHttpBps(Float dynamicHttpBps) {
                this.dynamicHttpBps = dynamicHttpBps;
                return this;
            }

            /**
             * DynamicHttpsBps.
             */
            public Builder dynamicHttpsBps(Float dynamicHttpsBps) {
                this.dynamicHttpsBps = dynamicHttpsBps;
                return this;
            }

            /**
             * StaticHttpBps.
             */
            public Builder staticHttpBps(Float staticHttpBps) {
                this.staticHttpBps = staticHttpBps;
                return this;
            }

            /**
             * StaticHttpsBps.
             */
            public Builder staticHttpsBps(Float staticHttpsBps) {
                this.staticHttpsBps = staticHttpsBps;
                return this;
            }

            /**
             * TimeStamp.
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
