// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRealTimeSrcTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRealTimeSrcTrafficDataResponseBody</p>
 */
public class DescribeDomainRealTimeSrcTrafficDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RealTimeSrcTrafficDataPerInterval")
    private RealTimeSrcTrafficDataPerInterval realTimeSrcTrafficDataPerInterval;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDomainRealTimeSrcTrafficDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.realTimeSrcTrafficDataPerInterval = builder.realTimeSrcTrafficDataPerInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRealTimeSrcTrafficDataResponseBody create() {
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
     * @return realTimeSrcTrafficDataPerInterval
     */
    public RealTimeSrcTrafficDataPerInterval getRealTimeSrcTrafficDataPerInterval() {
        return this.realTimeSrcTrafficDataPerInterval;
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
        private RealTimeSrcTrafficDataPerInterval realTimeSrcTrafficDataPerInterval; 
        private String requestId; 
        private String startTime; 

        /**
         * The time interval between the data entries returned. Unit: seconds.
         * <p>
         * 
         * Depending on the maximum time range per query, the value is 60 (1 minute), 300 (5 minutes), or 3600 (1 hour). For more information, see the "Time granularity" section in Usage notes.
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
         * The end of the time range for which the data was queried.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The amount of back-to-origin traffic returned at each interval.
         */
        public Builder realTimeSrcTrafficDataPerInterval(RealTimeSrcTrafficDataPerInterval realTimeSrcTrafficDataPerInterval) {
            this.realTimeSrcTrafficDataPerInterval = realTimeSrcTrafficDataPerInterval;
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
         * The start of the time range for which the data was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDomainRealTimeSrcTrafficDataResponseBody build() {
            return new DescribeDomainRealTimeSrcTrafficDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
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

            /**
             * The timestamp of the data returned.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The amount of traffic.
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
    public static class RealTimeSrcTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private RealTimeSrcTrafficDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealTimeSrcTrafficDataPerInterval create() {
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

            public RealTimeSrcTrafficDataPerInterval build() {
                return new RealTimeSrcTrafficDataPerInterval(this);
            } 

        } 

    }
}
