// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeDiskMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskMonitorDataResponseBody</p>
 */
public class DescribeDiskMonitorDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MonitorData")
    private java.util.List<MonitorData> monitorData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDiskMonitorDataResponseBody(Builder builder) {
        this.monitorData = builder.monitorData;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskMonitorDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return monitorData
     */
    public java.util.List<MonitorData> getMonitorData() {
        return this.monitorData;
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
        private java.util.List<MonitorData> monitorData; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The near real-time monitoring data of the disk.</p>
         */
        public Builder monitorData(java.util.List<MonitorData> monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiskMonitorDataResponseBody build() {
            return new DescribeDiskMonitorDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiskMonitorDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiskMonitorDataResponseBody</p>
     */
    public static class MonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BPSPercent")
        private Long BPSPercent;

        @com.aliyun.core.annotation.NameInMap("BurstIOCount")
        private Long burstIOCount;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("IOPSPercent")
        private Long IOPSPercent;

        @com.aliyun.core.annotation.NameInMap("ReadBPS")
        private Long readBPS;

        @com.aliyun.core.annotation.NameInMap("ReadBlockSize")
        private Long readBlockSize;

        @com.aliyun.core.annotation.NameInMap("ReadIOPS")
        private Long readIOPS;

        @com.aliyun.core.annotation.NameInMap("ReadLatency")
        private Long readLatency;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("WriteBPS")
        private Long writeBPS;

        @com.aliyun.core.annotation.NameInMap("WriteBlockSize")
        private Long writeBlockSize;

        @com.aliyun.core.annotation.NameInMap("WriteIOPS")
        private Long writeIOPS;

        @com.aliyun.core.annotation.NameInMap("WriteLatency")
        private Long writeLatency;

        private MonitorData(Builder builder) {
            this.BPSPercent = builder.BPSPercent;
            this.burstIOCount = builder.burstIOCount;
            this.diskId = builder.diskId;
            this.IOPSPercent = builder.IOPSPercent;
            this.readBPS = builder.readBPS;
            this.readBlockSize = builder.readBlockSize;
            this.readIOPS = builder.readIOPS;
            this.readLatency = builder.readLatency;
            this.timestamp = builder.timestamp;
            this.writeBPS = builder.writeBPS;
            this.writeBlockSize = builder.writeBlockSize;
            this.writeIOPS = builder.writeIOPS;
            this.writeLatency = builder.writeLatency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorData create() {
            return builder().build();
        }

        /**
         * @return BPSPercent
         */
        public Long getBPSPercent() {
            return this.BPSPercent;
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
         * @return IOPSPercent
         */
        public Long getIOPSPercent() {
            return this.IOPSPercent;
        }

        /**
         * @return readBPS
         */
        public Long getReadBPS() {
            return this.readBPS;
        }

        /**
         * @return readBlockSize
         */
        public Long getReadBlockSize() {
            return this.readBlockSize;
        }

        /**
         * @return readIOPS
         */
        public Long getReadIOPS() {
            return this.readIOPS;
        }

        /**
         * @return readLatency
         */
        public Long getReadLatency() {
            return this.readLatency;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return writeBPS
         */
        public Long getWriteBPS() {
            return this.writeBPS;
        }

        /**
         * @return writeBlockSize
         */
        public Long getWriteBlockSize() {
            return this.writeBlockSize;
        }

        /**
         * @return writeIOPS
         */
        public Long getWriteIOPS() {
            return this.writeIOPS;
        }

        /**
         * @return writeLatency
         */
        public Long getWriteLatency() {
            return this.writeLatency;
        }

        public static final class Builder {
            private Long BPSPercent; 
            private Long burstIOCount; 
            private String diskId; 
            private Long IOPSPercent; 
            private Long readBPS; 
            private Long readBlockSize; 
            private Long readIOPS; 
            private Long readLatency; 
            private String timestamp; 
            private Long writeBPS; 
            private Long writeBlockSize; 
            private Long writeIOPS; 
            private Long writeLatency; 

            /**
             * <p>The percentage of BPS.</p>
             * 
             * <strong>example:</strong>
             * <p>80(%)</p>
             */
            public Builder BPSPercent(Long BPSPercent) {
                this.BPSPercent = BPSPercent;
                return this;
            }

            /**
             * <p>The number of burst I/O operations.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder burstIOCount(Long burstIOCount) {
                this.burstIOCount = burstIOCount;
                return this;
            }

            /**
             * <p>The ID of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp1bq5g3dxxo1x4o****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The percentage of IOPS.</p>
             * 
             * <strong>example:</strong>
             * <p>80(%)</p>
             */
            public Builder IOPSPercent(Long IOPSPercent) {
                this.IOPSPercent = IOPSPercent;
                return this;
            }

            /**
             * <p>The read bandwidth of the disk. Unit: MByte/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder readBPS(Long readBPS) {
                this.readBPS = readBPS;
                return this;
            }

            /**
             * <p>Read IO block size. Unit: Bytes</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder readBlockSize(Long readBlockSize) {
                this.readBlockSize = readBlockSize;
                return this;
            }

            /**
             * <p>The maximum number of read IOPS.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder readIOPS(Long readIOPS) {
                this.readIOPS = readIOPS;
                return this;
            }

            /**
             * <p>Read IO latency. Unit:  microsecond</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder readLatency(Long readLatency) {
                this.readLatency = readLatency;
                return this;
            }

            /**
             * <p>The timestamp that is used to query the near real-time monitoring data of the disk. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-06-01T08:00:00Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The write bandwidth of the disk. Unit: MByte/s.</p>
             * 
             * <strong>example:</strong>
             * <p>204</p>
             */
            public Builder writeBPS(Long writeBPS) {
                this.writeBPS = writeBPS;
                return this;
            }

            /**
             * <p>Write IO block size. Unit: Bytes</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder writeBlockSize(Long writeBlockSize) {
                this.writeBlockSize = writeBlockSize;
                return this;
            }

            /**
             * <p>The maximum number of write IOPS.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder writeIOPS(Long writeIOPS) {
                this.writeIOPS = writeIOPS;
                return this;
            }

            /**
             * <p>Write IO latency. Unit: microsecond</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder writeLatency(Long writeLatency) {
                this.writeLatency = writeLatency;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}
