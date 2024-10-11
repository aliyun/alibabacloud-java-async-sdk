// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVodDomainSrcBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainSrcBpsDataResponseBody</p>
 */
public class DescribeVodDomainSrcBpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SrcBpsDataPerInterval")
    private SrcBpsDataPerInterval srcBpsDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeVodDomainSrcBpsDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.srcBpsDataPerInterval = builder.srcBpsDataPerInterval;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainSrcBpsDataResponseBody create() {
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
     * @return srcBpsDataPerInterval
     */
    public SrcBpsDataPerInterval getSrcBpsDataPerInterval() {
        return this.srcBpsDataPerInterval;
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
        private String requestId; 
        private SrcBpsDataPerInterval srcBpsDataPerInterval; 
        private String startTime; 

        /**
         * <p>The time interval at which data is returned, which is the time granularity. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The accelerated domain name whose ICP filing status you want to update.</p>
         * 
         * <strong>example:</strong>
         * <p>sample.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-23T02:02:57Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A13-BEF6-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The origin bandwidth data at each time interval.</p>
         */
        public Builder srcBpsDataPerInterval(SrcBpsDataPerInterval srcBpsDataPerInterval) {
            this.srcBpsDataPerInterval = srcBpsDataPerInterval;
            return this;
        }

        /**
         * <p>The beginning of the time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeVodDomainSrcBpsDataResponseBody build() {
            return new DescribeVodDomainSrcBpsDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainSrcBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainSrcBpsDataResponseBody</p>
     */
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
             * <p>The bandwidth consumed for fetching resources from the origin over HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder httpsValue(String httpsValue) {
                this.httpsValue = httpsValue;
                return this;
            }

            /**
             * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-23T02:02:57Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The total origin bandwidth data. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeVodDomainSrcBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainSrcBpsDataResponseBody</p>
     */
    public static class SrcBpsDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private SrcBpsDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SrcBpsDataPerInterval create() {
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

            public SrcBpsDataPerInterval build() {
                return new SrcBpsDataPerInterval(this);
            } 

        } 

    }
}
