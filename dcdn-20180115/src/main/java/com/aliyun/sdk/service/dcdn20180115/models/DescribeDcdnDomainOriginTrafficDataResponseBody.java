// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainOriginTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainOriginTrafficDataResponseBody</p>
 */
public class DescribeDcdnDomainOriginTrafficDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("OriginTrafficDataPerInterval")
    private OriginTrafficDataPerInterval originTrafficDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The time interval between the data entries returned. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The amount of back-to-origin traffic returned at each time interval. Unit: bytes.</p>
         */
        public Builder originTrafficDataPerInterval(OriginTrafficDataPerInterval originTrafficDataPerInterval) {
            this.originTrafficDataPerInterval = originTrafficDataPerInterval;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A666D44F-19D6-490E-97CF-1A64AB962C57</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnDomainOriginTrafficDataResponseBody build() {
            return new DescribeDcdnDomainOriginTrafficDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainOriginTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainOriginTrafficDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DynamicHttpOriginTraffic")
        private Float dynamicHttpOriginTraffic;

        @com.aliyun.core.annotation.NameInMap("DynamicHttpsOriginTraffic")
        private Float dynamicHttpsOriginTraffic;

        @com.aliyun.core.annotation.NameInMap("OriginTraffic")
        private Float originTraffic;

        @com.aliyun.core.annotation.NameInMap("StaticHttpOriginTraffic")
        private Float staticHttpOriginTraffic;

        @com.aliyun.core.annotation.NameInMap("StaticHttpsOriginTraffic")
        private Float staticHttpsOriginTraffic;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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
             * <p>The amount of back-to-origin traffic that was consumed to deliver dynamic content over HTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder dynamicHttpOriginTraffic(Float dynamicHttpOriginTraffic) {
                this.dynamicHttpOriginTraffic = dynamicHttpOriginTraffic;
                return this;
            }

            /**
             * <p>The amount of back-to-origin traffic that was consumed to deliver dynamic content over HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder dynamicHttpsOriginTraffic(Float dynamicHttpsOriginTraffic) {
                this.dynamicHttpsOriginTraffic = dynamicHttpsOriginTraffic;
                return this;
            }

            /**
             * <p>The amount of back-to-origin traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder originTraffic(Float originTraffic) {
                this.originTraffic = originTraffic;
                return this;
            }

            /**
             * <p>The amount of back-to-origin traffic that was consumed to deliver static content over HTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder staticHttpOriginTraffic(Float staticHttpOriginTraffic) {
                this.staticHttpOriginTraffic = staticHttpOriginTraffic;
                return this;
            }

            /**
             * <p>The amount of back-to-origin traffic that was consumed to deliver static content over HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder staticHttpsOriginTraffic(Float staticHttpsOriginTraffic) {
                this.staticHttpsOriginTraffic = staticHttpsOriginTraffic;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-10T21:00:00Z</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainOriginTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainOriginTrafficDataResponseBody</p>
     */
    public static class OriginTrafficDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
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
