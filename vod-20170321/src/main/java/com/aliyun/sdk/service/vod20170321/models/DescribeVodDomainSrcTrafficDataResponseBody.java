// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodDomainSrcTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainSrcTrafficDataResponseBody</p>
 */
public class DescribeVodDomainSrcTrafficDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SrcTrafficDataPerInterval")
    private SrcTrafficDataPerInterval srcTrafficDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("TotalTraffic")
    private String totalTraffic;

    private DescribeVodDomainSrcTrafficDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.srcTrafficDataPerInterval = builder.srcTrafficDataPerInterval;
        this.startTime = builder.startTime;
        this.totalTraffic = builder.totalTraffic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainSrcTrafficDataResponseBody create() {
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
     * @return srcTrafficDataPerInterval
     */
    public SrcTrafficDataPerInterval getSrcTrafficDataPerInterval() {
        return this.srcTrafficDataPerInterval;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalTraffic
     */
    public String getTotalTraffic() {
        return this.totalTraffic;
    }

    public static final class Builder {
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private SrcTrafficDataPerInterval srcTrafficDataPerInterval; 
        private String startTime; 
        private String totalTraffic; 

        /**
         * The time interval between the entries returned. Unit: seconds.
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
         * The end of the time range during which data was queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
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
         * Details about the origin traffic returned at each time interval. Unit: bytes.
         */
        public Builder srcTrafficDataPerInterval(SrcTrafficDataPerInterval srcTrafficDataPerInterval) {
            this.srcTrafficDataPerInterval = srcTrafficDataPerInterval;
            return this;
        }

        /**
         * The start of the time range during which data was queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The total traffic. Unit: bytes.
         */
        public Builder totalTraffic(String totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }

        public DescribeVodDomainSrcTrafficDataResponseBody build() {
            return new DescribeVodDomainSrcTrafficDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HttpsValue")
        private String httpsValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
            this.httpsValue = builder.httpsValue;
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
         * @return httpsValue
         */
        public String getHttpsValue() {
            return this.httpsValue;
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
            private String httpsValue; 
            private String timeStamp; 
            private String value; 

            /**
             * The amount of traffic generated by origin HTTPS requests.
             */
            public Builder httpsValue(String httpsValue) {
                this.httpsValue = httpsValue;
                return this;
            }

            /**
             * The timestamp of the returned data. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The traffic value at each time interval.
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
    public static class SrcTrafficDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private SrcTrafficDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SrcTrafficDataPerInterval create() {
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

            public SrcTrafficDataPerInterval build() {
                return new SrcTrafficDataPerInterval(this);
            } 

        } 

    }
}
