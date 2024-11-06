// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainWebsocketBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainWebsocketBpsDataResponseBody</p>
 */
public class DescribeDcdnDomainWebsocketBpsDataResponseBody extends TeaModel {
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

    private DescribeDcdnDomainWebsocketBpsDataResponseBody(Builder builder) {
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

    public static DescribeDcdnDomainWebsocketBpsDataResponseBody create() {
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
         * <p>The bandwidth data returned at each interval.</p>
         */
        public Builder bpsDataPerInterval(BpsDataPerInterval bpsDataPerInterval) {
            this.bpsDataPerInterval = bpsDataPerInterval;
            return this;
        }

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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnDomainWebsocketBpsDataResponseBody build() {
            return new DescribeDcdnDomainWebsocketBpsDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainWebsocketBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainWebsocketBpsDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("WebsocketBps")
        private Float websocketBps;

        private DataModule(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.websocketBps = builder.websocketBps;
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
         * @return websocketBps
         */
        public Float getWebsocketBps() {
            return this.websocketBps;
        }

        public static final class Builder {
            private String timeStamp; 
            private Float websocketBps; 

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-10T20:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The bandwidth value. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>11288111</p>
             */
            public Builder websocketBps(Float websocketBps) {
                this.websocketBps = websocketBps;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnDomainWebsocketBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainWebsocketBpsDataResponseBody</p>
     */
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
