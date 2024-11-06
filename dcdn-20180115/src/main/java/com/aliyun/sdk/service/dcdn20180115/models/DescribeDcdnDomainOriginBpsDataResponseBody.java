// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainOriginBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainOriginBpsDataResponseBody</p>
 */
public class DescribeDcdnDomainOriginBpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("OriginBpsDataPerInterval")
    private OriginBpsDataPerInterval originBpsDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>2019-12-11T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The origin bandwidth data returned at each time interval. Unit: bit/s.</p>
         */
        public Builder originBpsDataPerInterval(OriginBpsDataPerInterval originBpsDataPerInterval) {
            this.originBpsDataPerInterval = originBpsDataPerInterval;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7CBCD6AD-B016-42E5-AE0B-B3731DE8F755</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-10T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnDomainOriginBpsDataResponseBody build() {
            return new DescribeDcdnDomainOriginBpsDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainOriginBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainOriginBpsDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DynamicHttpOriginBps")
        private Float dynamicHttpOriginBps;

        @com.aliyun.core.annotation.NameInMap("DynamicHttpsOriginBps")
        private Float dynamicHttpsOriginBps;

        @com.aliyun.core.annotation.NameInMap("OriginBps")
        private Float originBps;

        @com.aliyun.core.annotation.NameInMap("StaticHttpOriginBps")
        private Float staticHttpOriginBps;

        @com.aliyun.core.annotation.NameInMap("StaticHttpsOriginBps")
        private Float staticHttpsOriginBps;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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
             * <p>The bandwidth that was consumed for fetching dynamic content from the origin over HTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dynamicHttpOriginBps(Float dynamicHttpOriginBps) {
                this.dynamicHttpOriginBps = dynamicHttpOriginBps;
                return this;
            }

            /**
             * <p>The bandwidth that was consumed for fetching dynamic content from the origin over HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dynamicHttpsOriginBps(Float dynamicHttpsOriginBps) {
                this.dynamicHttpsOriginBps = dynamicHttpsOriginBps;
                return this;
            }

            /**
             * <p>The bandwidth that was consumed for fetching content from the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder originBps(Float originBps) {
                this.originBps = originBps;
                return this;
            }

            /**
             * <p>The bandwidth that was consumed for fetching static content from the origin over HTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder staticHttpOriginBps(Float staticHttpOriginBps) {
                this.staticHttpOriginBps = staticHttpOriginBps;
                return this;
            }

            /**
             * <p>The bandwidth that was consumed for fetching static content from the origin over HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder staticHttpsOriginBps(Float staticHttpsOriginBps) {
                this.staticHttpsOriginBps = staticHttpsOriginBps;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-10T00:00:00Z</p>
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
     * {@link DescribeDcdnDomainOriginBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainOriginBpsDataResponseBody</p>
     */
    public static class OriginBpsDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
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
