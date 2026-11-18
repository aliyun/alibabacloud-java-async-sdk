// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeVodDomainSrcTrafficDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.srcTrafficDataPerInterval = model.srcTrafficDataPerInterval;
            this.startTime = model.startTime;
            this.totalTraffic = model.totalTraffic;
        } 

        /**
         * <p>The time interval between each record, which is the time granularity of the data. Unit: seconds.</p>
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
         * <p>The end time of the data. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format and in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-23T15:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SrcTrafficDataPerInterval.
         */
        public Builder srcTrafficDataPerInterval(SrcTrafficDataPerInterval srcTrafficDataPerInterval) {
            this.srcTrafficDataPerInterval = srcTrafficDataPerInterval;
            return this;
        }

        /**
         * <p>The start time of the data. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format and in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-29T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The total traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>5906662826</p>
         */
        public Builder totalTraffic(String totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }

        public DescribeVodDomainSrcTrafficDataResponseBody build() {
            return new DescribeVodDomainSrcTrafficDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainSrcTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainSrcTrafficDataResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.httpsValue = model.httpsValue;
                this.timeStamp = model.timeStamp;
                this.value = model.value;
            } 

            /**
             * HttpsValue.
             */
            public Builder httpsValue(String httpsValue) {
                this.httpsValue = httpsValue;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * Value.
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
     * {@link DescribeVodDomainSrcTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainSrcTrafficDataResponseBody</p>
     */
    public static class SrcTrafficDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

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
        public java.util.List<DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List<DataModule> dataModule; 

            private Builder() {
            } 

            private Builder(SrcTrafficDataPerInterval model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public SrcTrafficDataPerInterval build() {
                return new SrcTrafficDataPerInterval(this);
            } 

        } 

    }
}
