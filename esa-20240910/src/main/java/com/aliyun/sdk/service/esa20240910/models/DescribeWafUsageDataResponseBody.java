// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeWafUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWafUsageDataResponseBody</p>
 */
public class DescribeWafUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("UsageData")
    private java.util.List<UsageData> usageData;

    private DescribeWafUsageDataResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.usageData = builder.usageData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWafUsageDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return usageData
     */
    public java.util.List<UsageData> getUsageData() {
        return this.usageData;
    }

    public static final class Builder {
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private java.util.List<UsageData> usageData; 

        private Builder() {
        } 

        private Builder(DescribeWafUsageDataResponseBody model) {
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.usageData = model.usageData;
        } 

        /**
         * <p>The end of the time range for the returned data. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC+0.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-10T23:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C370DAF1-C838-4288-A1A0-9A87633D2***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-10T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder usageData(java.util.List<UsageData> usageData) {
            this.usageData = usageData;
            return this;
        }

        public DescribeWafUsageDataResponseBody build() {
            return new DescribeWafUsageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWafUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWafUsageDataResponseBody</p>
     */
    public static class UsageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessCount")
        private Long accessCount;

        @com.aliyun.core.annotation.NameInMap("BlockCount")
        private Long blockCount;

        @com.aliyun.core.annotation.NameInMap("ObserveCount")
        private Long observeCount;

        @com.aliyun.core.annotation.NameInMap("RecordName")
        private String recordName;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private UsageData(Builder builder) {
            this.accessCount = builder.accessCount;
            this.blockCount = builder.blockCount;
            this.observeCount = builder.observeCount;
            this.recordName = builder.recordName;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageData create() {
            return builder().build();
        }

        /**
         * @return accessCount
         */
        public Long getAccessCount() {
            return this.accessCount;
        }

        /**
         * @return blockCount
         */
        public Long getBlockCount() {
            return this.blockCount;
        }

        /**
         * @return observeCount
         */
        public Long getObserveCount() {
            return this.observeCount;
        }

        /**
         * @return recordName
         */
        public String getRecordName() {
            return this.recordName;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long accessCount; 
            private Long blockCount; 
            private Long observeCount; 
            private String recordName; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(UsageData model) {
                this.accessCount = model.accessCount;
                this.blockCount = model.blockCount;
                this.observeCount = model.observeCount;
                this.recordName = model.recordName;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The number of requests with normal access.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder accessCount(Long accessCount) {
                this.accessCount = accessCount;
                return this;
            }

            /**
             * <p>The number of blocked requests.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder blockCount(Long blockCount) {
                this.blockCount = blockCount;
                return this;
            }

            /**
             * <p>The number of observed requests.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder observeCount(Long observeCount) {
                this.observeCount = observeCount;
                return this;
            }

            /**
             * <p>The domain record name.</p>
             * 
             * <strong>example:</strong>
             * <p>test.example.com</p>
             */
            public Builder recordName(String recordName) {
                this.recordName = recordName;
                return this;
            }

            /**
             * <p>The beginning of the time interval.</p>
             * <p>The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC+0.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-10T00:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public UsageData build() {
                return new UsageData(this);
            } 

        } 

    }
}
