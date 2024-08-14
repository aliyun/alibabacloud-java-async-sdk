// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskMonitorDataListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskMonitorDataListResponseBody</p>
 */
public class DescribeDiskMonitorDataListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MonitorData")
    private java.util.List < MonitorData> monitorData;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDiskMonitorDataListResponseBody(Builder builder) {
        this.monitorData = builder.monitorData;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskMonitorDataListResponseBody create() {
        return builder().build();
    }

    /**
     * @return monitorData
     */
    public java.util.List < MonitorData> getMonitorData() {
        return this.monitorData;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < MonitorData> monitorData; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The near real-time monitoring data of the disks.
         */
        public Builder monitorData(java.util.List < MonitorData> monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiskMonitorDataListResponseBody build() {
            return new DescribeDiskMonitorDataListResponseBody(this);
        } 

    } 

    public static class MonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BurstIOCount")
        private Long burstIOCount;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private MonitorData(Builder builder) {
            this.burstIOCount = builder.burstIOCount;
            this.diskId = builder.diskId;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorData create() {
            return builder().build();
        }

        /**
         * @return burstIOCount
         */
        public Long getBurstIOCount() {
            return this.burstIOCount;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long burstIOCount; 
            private String diskId; 
            private String timestamp; 

            /**
             * The number of burst I/O operations.
             */
            public Builder burstIOCount(Long burstIOCount) {
                this.burstIOCount = burstIOCount;
                return this;
            }

            /**
             * The ID of the disk.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The beginning of the time range during which the performance of the disk bursts. The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}
