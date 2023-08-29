// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainOriginTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainOriginTrafficDataResponseBody</p>
 */
public class DescribeDcdnDomainOriginTrafficDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("OriginTrafficDataPerInterval")
    private OriginTrafficDataPerInterval originTrafficDataPerInterval;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnDomainOriginTrafficDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.originTrafficDataPerInterval = builder.originTrafficDataPerInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainOriginTrafficDataResponseBody create() {
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
     * @return originTrafficDataPerInterval
     */
    public OriginTrafficDataPerInterval getOriginTrafficDataPerInterval() {
        return this.originTrafficDataPerInterval;
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
        private OriginTrafficDataPerInterval originTrafficDataPerInterval; 
        private String requestId; 
        private String startTime; 

        /**
         * The time interval between the data entries returned. Unit: seconds.
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
         * The amount of back-to-origin traffic returned at each time interval. Unit: bytes.
         */
        public Builder originTrafficDataPerInterval(OriginTrafficDataPerInterval originTrafficDataPerInterval) {
            this.originTrafficDataPerInterval = originTrafficDataPerInterval;
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
         * The beginning of the time range during which data was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnDomainOriginTrafficDataResponseBody build() {
            return new DescribeDcdnDomainOriginTrafficDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("DynamicHttpOriginTraffic")
        private Float dynamicHttpOriginTraffic;

        @NameInMap("DynamicHttpsOriginTraffic")
        private Float dynamicHttpsOriginTraffic;

        @NameInMap("OriginTraffic")
        private Float originTraffic;

        @NameInMap("StaticHttpOriginTraffic")
        private Float staticHttpOriginTraffic;

        @NameInMap("StaticHttpsOriginTraffic")
        private Float staticHttpsOriginTraffic;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.dynamicHttpOriginTraffic = builder.dynamicHttpOriginTraffic;
            this.dynamicHttpsOriginTraffic = builder.dynamicHttpsOriginTraffic;
            this.originTraffic = builder.originTraffic;
            this.staticHttpOriginTraffic = builder.staticHttpOriginTraffic;
            this.staticHttpsOriginTraffic = builder.staticHttpsOriginTraffic;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return dynamicHttpOriginTraffic
         */
        public Float getDynamicHttpOriginTraffic() {
            return this.dynamicHttpOriginTraffic;
        }

        /**
         * @return dynamicHttpsOriginTraffic
         */
        public Float getDynamicHttpsOriginTraffic() {
            return this.dynamicHttpsOriginTraffic;
        }

        /**
         * @return originTraffic
         */
        public Float getOriginTraffic() {
            return this.originTraffic;
        }

        /**
         * @return staticHttpOriginTraffic
         */
        public Float getStaticHttpOriginTraffic() {
            return this.staticHttpOriginTraffic;
        }

        /**
         * @return staticHttpsOriginTraffic
         */
        public Float getStaticHttpsOriginTraffic() {
            return this.staticHttpsOriginTraffic;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Float dynamicHttpOriginTraffic; 
            private Float dynamicHttpsOriginTraffic; 
            private Float originTraffic; 
            private Float staticHttpOriginTraffic; 
            private Float staticHttpsOriginTraffic; 
            private String timeStamp; 

            /**
             * The amount of back-to-origin traffic that was consumed to deliver dynamic content over HTTP.
             */
            public Builder dynamicHttpOriginTraffic(Float dynamicHttpOriginTraffic) {
                this.dynamicHttpOriginTraffic = dynamicHttpOriginTraffic;
                return this;
            }

            /**
             * The amount of back-to-origin traffic that was consumed to deliver dynamic content over HTTPS.
             */
            public Builder dynamicHttpsOriginTraffic(Float dynamicHttpsOriginTraffic) {
                this.dynamicHttpsOriginTraffic = dynamicHttpsOriginTraffic;
                return this;
            }

            /**
             * The amount of back-to-origin traffic.
             */
            public Builder originTraffic(Float originTraffic) {
                this.originTraffic = originTraffic;
                return this;
            }

            /**
             * The amount of back-to-origin traffic that was consumed to deliver static content over HTTP.
             */
            public Builder staticHttpOriginTraffic(Float staticHttpOriginTraffic) {
                this.staticHttpOriginTraffic = staticHttpOriginTraffic;
                return this;
            }

            /**
             * The amount of back-to-origin traffic that was consumed to deliver static content over HTTPS.
             */
            public Builder staticHttpsOriginTraffic(Float staticHttpsOriginTraffic) {
                this.staticHttpsOriginTraffic = staticHttpsOriginTraffic;
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
    public static class OriginTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private OriginTrafficDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginTrafficDataPerInterval create() {
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

            public OriginTrafficDataPerInterval build() {
                return new OriginTrafficDataPerInterval(this);
            } 

        } 

    }
}
