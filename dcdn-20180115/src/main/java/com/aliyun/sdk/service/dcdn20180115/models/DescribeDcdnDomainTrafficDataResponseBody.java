// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainTrafficDataResponseBody</p>
 */
public class DescribeDcdnDomainTrafficDataResponseBody extends TeaModel {
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

    @NameInMap("TrafficDataPerInterval")
    private TrafficDataPerInterval trafficDataPerInterval;

    private DescribeDcdnDomainTrafficDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.trafficDataPerInterval = builder.trafficDataPerInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainTrafficDataResponseBody create() {
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
     * @return trafficDataPerInterval
     */
    public TrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public static final class Builder {
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private TrafficDataPerInterval trafficDataPerInterval; 

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

        /**
         * The network traffic returned at each time interval. Unit: bytes.
         */
        public Builder trafficDataPerInterval(TrafficDataPerInterval trafficDataPerInterval) {
            this.trafficDataPerInterval = trafficDataPerInterval;
            return this;
        }

        public DescribeDcdnDomainTrafficDataResponseBody build() {
            return new DescribeDcdnDomainTrafficDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("DynamicHttpTraffic")
        private Float dynamicHttpTraffic;

        @NameInMap("DynamicHttpsTraffic")
        private Float dynamicHttpsTraffic;

        @NameInMap("StaticHttpTraffic")
        private Float staticHttpTraffic;

        @NameInMap("StaticHttpsTraffic")
        private Float staticHttpsTraffic;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("Traffic")
        private Float traffic;

        private DataModule(Builder builder) {
            this.dynamicHttpTraffic = builder.dynamicHttpTraffic;
            this.dynamicHttpsTraffic = builder.dynamicHttpsTraffic;
            this.staticHttpTraffic = builder.staticHttpTraffic;
            this.staticHttpsTraffic = builder.staticHttpsTraffic;
            this.timeStamp = builder.timeStamp;
            this.traffic = builder.traffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return dynamicHttpTraffic
         */
        public Float getDynamicHttpTraffic() {
            return this.dynamicHttpTraffic;
        }

        /**
         * @return dynamicHttpsTraffic
         */
        public Float getDynamicHttpsTraffic() {
            return this.dynamicHttpsTraffic;
        }

        /**
         * @return staticHttpTraffic
         */
        public Float getStaticHttpTraffic() {
            return this.staticHttpTraffic;
        }

        /**
         * @return staticHttpsTraffic
         */
        public Float getStaticHttpsTraffic() {
            return this.staticHttpsTraffic;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return traffic
         */
        public Float getTraffic() {
            return this.traffic;
        }

        public static final class Builder {
            private Float dynamicHttpTraffic; 
            private Float dynamicHttpsTraffic; 
            private Float staticHttpTraffic; 
            private Float staticHttpsTraffic; 
            private String timeStamp; 
            private Float traffic; 

            /**
             * The network traffic that was consumed to deliver dynamic content over HTTP.
             */
            public Builder dynamicHttpTraffic(Float dynamicHttpTraffic) {
                this.dynamicHttpTraffic = dynamicHttpTraffic;
                return this;
            }

            /**
             * The network traffic that was consumed to deliver dynamic content over HTTPS.
             */
            public Builder dynamicHttpsTraffic(Float dynamicHttpsTraffic) {
                this.dynamicHttpsTraffic = dynamicHttpsTraffic;
                return this;
            }

            /**
             * The network traffic that was consumed to deliver static content over HTTP.
             */
            public Builder staticHttpTraffic(Float staticHttpTraffic) {
                this.staticHttpTraffic = staticHttpTraffic;
                return this;
            }

            /**
             * The network traffic that was consumed to deliver static content over HTTPS.
             */
            public Builder staticHttpsTraffic(Float staticHttpsTraffic) {
                this.staticHttpsTraffic = staticHttpsTraffic;
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
             * The total amount of network traffic.
             */
            public Builder traffic(Float traffic) {
                this.traffic = traffic;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    public static class TrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private TrafficDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficDataPerInterval create() {
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

            public TrafficDataPerInterval build() {
                return new TrafficDataPerInterval(this);
            } 

        } 

    }
}
