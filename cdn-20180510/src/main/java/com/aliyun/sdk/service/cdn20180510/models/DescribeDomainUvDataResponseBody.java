// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeDomainUvDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainUvDataResponseBody</p>
 */
public class DescribeDomainUvDataResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("UvDataInterval")
    private UvDataInterval uvDataInterval;

    private DescribeDomainUvDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.uvDataInterval = builder.uvDataInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainUvDataResponseBody create() {
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return uvDataInterval
     */
    public UvDataInterval getUvDataInterval() {
        return this.uvDataInterval;
    }

    public static final class Builder {
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private UvDataInterval uvDataInterval; 

        /**
         * <p>The time interval. Unit: seconds.</p>
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
         * <p>The end of the time range that was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-29T04:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E9D3257A-1B7C-414C-90C1-8D07AC47BCAC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range that was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-29T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The number of UVs at each interval.</p>
         */
        public Builder uvDataInterval(UvDataInterval uvDataInterval) {
            this.uvDataInterval = uvDataInterval;
            return this;
        }

        public DescribeDomainUvDataResponseBody build() {
            return new DescribeDomainUvDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainUvDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainUvDataResponseBody</p>
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
             * <p>2019-11-29T00:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The number of UVs.</p>
             * 
             * <strong>example:</strong>
             * <p>318</p>
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
     * {@link DescribeDomainUvDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainUvDataResponseBody</p>
     */
    public static class UvDataInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UsageData")
        private java.util.List<UsageData> usageData;

        private UvDataInterval(Builder builder) {
            this.usageData = builder.usageData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UvDataInterval create() {
            return builder().build();
        }

        /**
         * @return usageData
         */
        public java.util.List<UsageData> getUsageData() {
            return this.usageData;
        }

        public static final class Builder {
            private java.util.List<UsageData> usageData; 

            /**
             * UsageData.
             */
            public Builder usageData(java.util.List<UsageData> usageData) {
                this.usageData = usageData;
                return this;
            }

            public UvDataInterval build() {
                return new UvDataInterval(this);
            } 

        } 

    }
}
