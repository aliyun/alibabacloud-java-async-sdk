// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodDomainUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainUsageDataResponseBody</p>
 */
public class DescribeVodDomainUsageDataResponseBody extends TeaModel {
    @NameInMap("Area")
    private String area;

    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("Type")
    private String type;

    @NameInMap("UsageDataPerInterval")
    private UsageDataPerInterval usageDataPerInterval;

    private DescribeVodDomainUsageDataResponseBody(Builder builder) {
        this.area = builder.area;
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.type = builder.type;
        this.usageDataPerInterval = builder.usageDataPerInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainUsageDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return usageDataPerInterval
     */
    public UsageDataPerInterval getUsageDataPerInterval() {
        return this.usageDataPerInterval;
    }

    public static final class Builder {
        private String area; 
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private String type; 
        private UsageDataPerInterval usageDataPerInterval; 

        /**
         * The billable region where the data was collected.
         */
        public Builder area(String area) {
            this.area = area;
            return this;
        }

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
         * The beginning of the time range during which data was queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The type of content returned. Valid values:
         * <p>
         * 
         * *   **static**: static content
         * *   **dynamic**: dynamic content
         * *   **all**: all content
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * The traffic or bandwidth data returned at each interval.
         */
        public Builder usageDataPerInterval(UsageDataPerInterval usageDataPerInterval) {
            this.usageDataPerInterval = usageDataPerInterval;
            return this;
        }

        public DescribeVodDomainUsageDataResponseBody build() {
            return new DescribeVodDomainUsageDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
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
             * The timestamp of the returned data. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The traffic or bandwidth data. Unit: bit/s.
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
    public static class UsageDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private UsageDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageDataPerInterval create() {
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

            public UsageDataPerInterval build() {
                return new UsageDataPerInterval(this);
            } 

        } 

    }
}
