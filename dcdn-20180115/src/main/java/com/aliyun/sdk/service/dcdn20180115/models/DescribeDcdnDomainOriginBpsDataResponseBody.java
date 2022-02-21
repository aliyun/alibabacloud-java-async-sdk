// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainOriginBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainOriginBpsDataResponseBody</p>
 */
public class DescribeDcdnDomainOriginBpsDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("OriginBpsDataPerInterval")
    private OriginBpsDataPerInterval originBpsDataPerInterval;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnDomainOriginBpsDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.originBpsDataPerInterval = builder.originBpsDataPerInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainOriginBpsDataResponseBody create() {
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
     * @return originBpsDataPerInterval
     */
    public OriginBpsDataPerInterval getOriginBpsDataPerInterval() {
        return this.originBpsDataPerInterval;
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
        private OriginBpsDataPerInterval originBpsDataPerInterval; 
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
         * OriginBpsDataPerInterval.
         */
        public Builder originBpsDataPerInterval(OriginBpsDataPerInterval originBpsDataPerInterval) {
            this.originBpsDataPerInterval = originBpsDataPerInterval;
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

        public DescribeDcdnDomainOriginBpsDataResponseBody build() {
            return new DescribeDcdnDomainOriginBpsDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("DynamicHttpOriginBps")
        private Float dynamicHttpOriginBps;

        @NameInMap("DynamicHttpsOriginBps")
        private Float dynamicHttpsOriginBps;

        @NameInMap("OriginBps")
        private Float originBps;

        @NameInMap("StaticHttpOriginBps")
        private Float staticHttpOriginBps;

        @NameInMap("StaticHttpsOriginBps")
        private Float staticHttpsOriginBps;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.dynamicHttpOriginBps = builder.dynamicHttpOriginBps;
            this.dynamicHttpsOriginBps = builder.dynamicHttpsOriginBps;
            this.originBps = builder.originBps;
            this.staticHttpOriginBps = builder.staticHttpOriginBps;
            this.staticHttpsOriginBps = builder.staticHttpsOriginBps;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return dynamicHttpOriginBps
         */
        public Float getDynamicHttpOriginBps() {
            return this.dynamicHttpOriginBps;
        }

        /**
         * @return dynamicHttpsOriginBps
         */
        public Float getDynamicHttpsOriginBps() {
            return this.dynamicHttpsOriginBps;
        }

        /**
         * @return originBps
         */
        public Float getOriginBps() {
            return this.originBps;
        }

        /**
         * @return staticHttpOriginBps
         */
        public Float getStaticHttpOriginBps() {
            return this.staticHttpOriginBps;
        }

        /**
         * @return staticHttpsOriginBps
         */
        public Float getStaticHttpsOriginBps() {
            return this.staticHttpsOriginBps;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Float dynamicHttpOriginBps; 
            private Float dynamicHttpsOriginBps; 
            private Float originBps; 
            private Float staticHttpOriginBps; 
            private Float staticHttpsOriginBps; 
            private String timeStamp; 

            /**
             * DynamicHttpOriginBps.
             */
            public Builder dynamicHttpOriginBps(Float dynamicHttpOriginBps) {
                this.dynamicHttpOriginBps = dynamicHttpOriginBps;
                return this;
            }

            /**
             * DynamicHttpsOriginBps.
             */
            public Builder dynamicHttpsOriginBps(Float dynamicHttpsOriginBps) {
                this.dynamicHttpsOriginBps = dynamicHttpsOriginBps;
                return this;
            }

            /**
             * OriginBps.
             */
            public Builder originBps(Float originBps) {
                this.originBps = originBps;
                return this;
            }

            /**
             * StaticHttpOriginBps.
             */
            public Builder staticHttpOriginBps(Float staticHttpOriginBps) {
                this.staticHttpOriginBps = staticHttpOriginBps;
                return this;
            }

            /**
             * StaticHttpsOriginBps.
             */
            public Builder staticHttpsOriginBps(Float staticHttpsOriginBps) {
                this.staticHttpsOriginBps = staticHttpsOriginBps;
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
    public static class OriginBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private OriginBpsDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginBpsDataPerInterval create() {
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

            public OriginBpsDataPerInterval build() {
                return new OriginBpsDataPerInterval(this);
            } 

        } 

    }
}
