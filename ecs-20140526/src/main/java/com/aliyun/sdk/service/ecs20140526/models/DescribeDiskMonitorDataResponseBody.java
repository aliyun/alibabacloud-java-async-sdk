// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskMonitorDataResponseBody</p>
 */
public class DescribeDiskMonitorDataResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("MonitorData")
    private MonitorData monitorData;

    private DescribeDiskMonitorDataResponseBody(Builder builder) {
        this.totalCount = builder.totalCount;
        this.requestId = builder.requestId;
        this.monitorData = builder.monitorData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskMonitorDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return monitorData
     */
    public MonitorData getMonitorData() {
        return this.monitorData;
    }

    public static final class Builder {
        private Integer totalCount; 
        private String requestId; 
        private MonitorData monitorData; 

        /**
         * The number of entries returned for the disk usage information.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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
         * The collection of monitoring data of the cloud disk.
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        public DescribeDiskMonitorDataResponseBody build() {
            return new DescribeDiskMonitorDataResponseBody(this);
        } 

    } 

    public static class DiskMonitorData extends TeaModel {
        @NameInMap("BPSRead")
        private Integer BPSRead;

        @NameInMap("IOPSRead")
        private Integer IOPSRead;

        @NameInMap("LatencyRead")
        private Integer latencyRead;

        @NameInMap("BPSTotal")
        private Integer BPSTotal;

        @NameInMap("IOPSTotal")
        private Integer IOPSTotal;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("LatencyWrite")
        private Integer latencyWrite;

        @NameInMap("IOPSWrite")
        private Integer IOPSWrite;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("BPSWrite")
        private Integer BPSWrite;

        private DiskMonitorData(Builder builder) {
            this.BPSRead = builder.BPSRead;
            this.IOPSRead = builder.IOPSRead;
            this.latencyRead = builder.latencyRead;
            this.BPSTotal = builder.BPSTotal;
            this.IOPSTotal = builder.IOPSTotal;
            this.timeStamp = builder.timeStamp;
            this.latencyWrite = builder.latencyWrite;
            this.IOPSWrite = builder.IOPSWrite;
            this.diskId = builder.diskId;
            this.BPSWrite = builder.BPSWrite;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskMonitorData create() {
            return builder().build();
        }

        /**
         * @return BPSRead
         */
        public Integer getBPSRead() {
            return this.BPSRead;
        }

        /**
         * @return IOPSRead
         */
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        /**
         * @return latencyRead
         */
        public Integer getLatencyRead() {
            return this.latencyRead;
        }

        /**
         * @return BPSTotal
         */
        public Integer getBPSTotal() {
            return this.BPSTotal;
        }

        /**
         * @return IOPSTotal
         */
        public Integer getIOPSTotal() {
            return this.IOPSTotal;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return latencyWrite
         */
        public Integer getLatencyWrite() {
            return this.latencyWrite;
        }

        /**
         * @return IOPSWrite
         */
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return BPSWrite
         */
        public Integer getBPSWrite() {
            return this.BPSWrite;
        }

        public static final class Builder {
            private Integer BPSRead; 
            private Integer IOPSRead; 
            private Integer latencyRead; 
            private Integer BPSTotal; 
            private Integer IOPSTotal; 
            private String timeStamp; 
            private Integer latencyWrite; 
            private Integer IOPSWrite; 
            private String diskId; 
            private Integer BPSWrite; 

            /**
             * The read bandwidth of the system disk. Unit: Byte/s.
             */
            public Builder BPSRead(Integer BPSRead) {
                this.BPSRead = BPSRead;
                return this;
            }

            /**
             * System disk I/O read operations. Unit: Times/s.
             */
            public Builder IOPSRead(Integer IOPSRead) {
                this.IOPSRead = IOPSRead;
                return this;
            }

            /**
             * Disk read latency. Unit: μs (microseconds).
             */
            public Builder latencyRead(Integer latencyRead) {
                this.latencyRead = latencyRead;
                return this;
            }

            /**
             * The total read/write bandwidth of the system disk. Unit: Byte/s.
             */
            public Builder BPSTotal(Integer BPSTotal) {
                this.BPSTotal = BPSTotal;
                return this;
            }

            /**
             * The total number of I/O read/write operations on the system disk. Unit: Times/s.
             */
            public Builder IOPSTotal(Integer IOPSTotal) {
                this.IOPSTotal = IOPSTotal;
                return this;
            }

            /**
             * The timestamp used to query monitoring information. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * Disk write latency. Unit: μs (microseconds).
             */
            public Builder latencyWrite(Integer latencyWrite) {
                this.latencyWrite = latencyWrite;
                return this;
            }

            /**
             * System disk I/O write operations. Unit: Times/s.
             */
            public Builder IOPSWrite(Integer IOPSWrite) {
                this.IOPSWrite = IOPSWrite;
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
             * The write bandwidth of the system disk. Unit: Byte/s.
             */
            public Builder BPSWrite(Integer BPSWrite) {
                this.BPSWrite = BPSWrite;
                return this;
            }

            public DiskMonitorData build() {
                return new DiskMonitorData(this);
            } 

        } 

    }
    public static class MonitorData extends TeaModel {
        @NameInMap("DiskMonitorData")
        private java.util.List < DiskMonitorData> diskMonitorData;

        private MonitorData(Builder builder) {
            this.diskMonitorData = builder.diskMonitorData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorData create() {
            return builder().build();
        }

        /**
         * @return diskMonitorData
         */
        public java.util.List < DiskMonitorData> getDiskMonitorData() {
            return this.diskMonitorData;
        }

        public static final class Builder {
            private java.util.List < DiskMonitorData> diskMonitorData; 

            /**
             * DiskMonitorData.
             */
            public Builder diskMonitorData(java.util.List < DiskMonitorData> diskMonitorData) {
                this.diskMonitorData = diskMonitorData;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}
