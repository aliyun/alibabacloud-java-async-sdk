// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainHitRateDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainHitRateDataResponseBody</p>
 */
public class DescribeDcdnDomainHitRateDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("HitRatePerInterval")
    private HitRatePerInterval hitRatePerInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnDomainHitRateDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.hitRatePerInterval = builder.hitRatePerInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainHitRateDataResponseBody create() {
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
     * @return hitRatePerInterval
     */
    public HitRatePerInterval getHitRatePerInterval() {
        return this.hitRatePerInterval;
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
        private HitRatePerInterval hitRatePerInterval; 
        private String requestId; 
        private String startTime; 

        /**
         * <p>The time interval between the data entries returned. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
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
         * <p>2018-03-02T15:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The byte hit ratio at each time interval. The byte hit ratio is measured in percentage.</p>
         */
        public Builder hitRatePerInterval(HitRatePerInterval hitRatePerInterval) {
            this.hitRatePerInterval = hitRatePerInterval;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4D07ABFE-4737-4834-B1B9-A661308C47B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-02T12:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnDomainHitRateDataResponseBody build() {
            return new DescribeDcdnDomainHitRateDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainHitRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainHitRateDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ByteHitRate")
        private Float byteHitRate;

        @com.aliyun.core.annotation.NameInMap("ReqHitRate")
        private Float reqHitRate;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.byteHitRate = builder.byteHitRate;
            this.reqHitRate = builder.reqHitRate;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return byteHitRate
         */
        public Float getByteHitRate() {
            return this.byteHitRate;
        }

        /**
         * @return reqHitRate
         */
        public Float getReqHitRate() {
            return this.reqHitRate;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Float byteHitRate; 
            private Float reqHitRate; 
            private String timeStamp; 

            /**
             * <p>The byte hit ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder byteHitRate(Float byteHitRate) {
                this.byteHitRate = byteHitRate;
                return this;
            }

            /**
             * <p>The request hit ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder reqHitRate(Float reqHitRate) {
                this.reqHitRate = reqHitRate;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-03-02T13:00:00Z</p>
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
     * {@link DescribeDcdnDomainHitRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainHitRateDataResponseBody</p>
     */
    public static class HitRatePerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private HitRatePerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitRatePerInterval create() {
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

            public HitRatePerInterval build() {
                return new HitRatePerInterval(this);
            } 

        } 

    }
}
