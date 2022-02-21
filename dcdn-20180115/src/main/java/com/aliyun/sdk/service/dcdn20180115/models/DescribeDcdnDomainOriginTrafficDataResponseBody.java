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
         * OriginTrafficDataPerInterval.
         */
        public Builder originTrafficDataPerInterval(OriginTrafficDataPerInterval originTrafficDataPerInterval) {
            this.originTrafficDataPerInterval = originTrafficDataPerInterval;
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
             * DynamicHttpOriginTraffic.
             */
            public Builder dynamicHttpOriginTraffic(Float dynamicHttpOriginTraffic) {
                this.dynamicHttpOriginTraffic = dynamicHttpOriginTraffic;
                return this;
            }

            /**
             * DynamicHttpsOriginTraffic.
             */
            public Builder dynamicHttpsOriginTraffic(Float dynamicHttpsOriginTraffic) {
                this.dynamicHttpsOriginTraffic = dynamicHttpsOriginTraffic;
                return this;
            }

            /**
             * OriginTraffic.
             */
            public Builder originTraffic(Float originTraffic) {
                this.originTraffic = originTraffic;
                return this;
            }

            /**
             * StaticHttpOriginTraffic.
             */
            public Builder staticHttpOriginTraffic(Float staticHttpOriginTraffic) {
                this.staticHttpOriginTraffic = staticHttpOriginTraffic;
                return this;
            }

            /**
             * StaticHttpsOriginTraffic.
             */
            public Builder staticHttpsOriginTraffic(Float staticHttpsOriginTraffic) {
                this.staticHttpsOriginTraffic = staticHttpsOriginTraffic;
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
