// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainPvDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainPvDataResponseBody</p>
 */
public class DescribeDomainPvDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PvDataInterval")
    private PvDataInterval pvDataInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDomainPvDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.pvDataInterval = builder.pvDataInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainPvDataResponseBody create() {
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
     * @return pvDataInterval
     */
    public PvDataInterval getPvDataInterval() {
        return this.pvDataInterval;
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
        private PvDataInterval pvDataInterval; 
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
         * <p>2015-11-28T04:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of PVs at each interval.</p>
         */
        public Builder pvDataInterval(PvDataInterval pvDataInterval) {
            this.pvDataInterval = pvDataInterval;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BCD7D917-76F1-442F-BB75-C810DE34C761</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-11-28T03:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDomainPvDataResponseBody build() {
            return new DescribeDomainPvDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainPvDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainPvDataResponseBody</p>
     */
    public static class UsageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private UsageData(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageData create() {
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
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-11-28T03:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The number of PVs.</p>
             * 
             * <strong>example:</strong>
             * <p>9292</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UsageData build() {
                return new UsageData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainPvDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainPvDataResponseBody</p>
     */
    public static class PvDataInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UsageData")
        private java.util.List < UsageData> usageData;

        private PvDataInterval(Builder builder) {
            this.usageData = builder.usageData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PvDataInterval create() {
            return builder().build();
        }

        /**
         * @return usageData
         */
        public java.util.List < UsageData> getUsageData() {
            return this.usageData;
        }

        public static final class Builder {
            private java.util.List < UsageData> usageData; 

            /**
             * UsageData.
             */
            public Builder usageData(java.util.List < UsageData> usageData) {
                this.usageData = usageData;
                return this;
            }

            public PvDataInterval build() {
                return new PvDataInterval(this);
            } 

        } 

    }
}
