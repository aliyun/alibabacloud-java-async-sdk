// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnDomainOriginBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScdnDomainOriginBpsDataResponseBody</p>
 */
public class DescribeScdnDomainOriginBpsDataResponseBody extends TeaModel {
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

    private DescribeScdnDomainOriginBpsDataResponseBody(Builder builder) {
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

    public static DescribeScdnDomainOriginBpsDataResponseBody create() {
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

        public DescribeScdnDomainOriginBpsDataResponseBody build() {
            return new DescribeScdnDomainOriginBpsDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("HttpOriginBpsValue")
        private String httpOriginBpsValue;

        @NameInMap("HttpsOriginBpsValue")
        private String httpsOriginBpsValue;

        @NameInMap("OriginBpsValue")
        private String originBpsValue;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.httpOriginBpsValue = builder.httpOriginBpsValue;
            this.httpsOriginBpsValue = builder.httpsOriginBpsValue;
            this.originBpsValue = builder.originBpsValue;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return httpOriginBpsValue
         */
        public String getHttpOriginBpsValue() {
            return this.httpOriginBpsValue;
        }

        /**
         * @return httpsOriginBpsValue
         */
        public String getHttpsOriginBpsValue() {
            return this.httpsOriginBpsValue;
        }

        /**
         * @return originBpsValue
         */
        public String getOriginBpsValue() {
            return this.originBpsValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String httpOriginBpsValue; 
            private String httpsOriginBpsValue; 
            private String originBpsValue; 
            private String timeStamp; 

            /**
             * HttpOriginBpsValue.
             */
            public Builder httpOriginBpsValue(String httpOriginBpsValue) {
                this.httpOriginBpsValue = httpOriginBpsValue;
                return this;
            }

            /**
             * HttpsOriginBpsValue.
             */
            public Builder httpsOriginBpsValue(String httpsOriginBpsValue) {
                this.httpsOriginBpsValue = httpsOriginBpsValue;
                return this;
            }

            /**
             * OriginBpsValue.
             */
            public Builder originBpsValue(String originBpsValue) {
                this.originBpsValue = originBpsValue;
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
