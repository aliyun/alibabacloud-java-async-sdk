// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeVsDomainPvDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsDomainPvDataResponseBody</p>
 */
public class DescribeVsDomainPvDataResponseBody extends TeaModel {
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

    private DescribeVsDomainPvDataResponseBody(Builder builder) {
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

    public static DescribeVsDomainPvDataResponseBody create() {
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

        private Builder() {
        } 

        private Builder(DescribeVsDomainPvDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.pvDataInterval = model.pvDataInterval;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

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
         * PvDataInterval.
         */
        public Builder pvDataInterval(PvDataInterval pvDataInterval) {
            this.pvDataInterval = pvDataInterval;
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

        public DescribeVsDomainPvDataResponseBody build() {
            return new DescribeVsDomainPvDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVsDomainPvDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsDomainPvDataResponseBody</p>
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

            private Builder() {
            } 

            private Builder(UsageData model) {
                this.timeStamp = model.timeStamp;
                this.value = model.value;
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

            public UsageData build() {
                return new UsageData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVsDomainPvDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsDomainPvDataResponseBody</p>
     */
    public static class PvDataInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UsageData")
        private java.util.List<UsageData> usageData;

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
        public java.util.List<UsageData> getUsageData() {
            return this.usageData;
        }

        public static final class Builder {
            private java.util.List<UsageData> usageData; 

            private Builder() {
            } 

            private Builder(PvDataInterval model) {
                this.usageData = model.usageData;
            } 

            /**
             * UsageData.
             */
            public Builder usageData(java.util.List<UsageData> usageData) {
                this.usageData = usageData;
                return this;
            }

            public PvDataInterval build() {
                return new PvDataInterval(this);
            } 

        } 

    }
}
