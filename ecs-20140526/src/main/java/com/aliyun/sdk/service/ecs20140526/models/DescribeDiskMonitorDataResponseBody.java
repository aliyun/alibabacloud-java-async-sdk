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
    @NameInMap("MonitorData")
    private MonitorData monitorData;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

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
    public MonitorData getMonitorData() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private MonitorData monitorData; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the monitoring data of the disk.
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
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
         * The total number of returned monitoring data entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiskMonitorDataResponseBody build() {
            return new DescribeDiskMonitorDataResponseBody(this);
        } 

    } 

    public static class DiskMonitorData extends TeaModel {
        @NameInMap("BPSRead")
        private Integer BPSRead;

        @NameInMap("BPSTotal")
        private Integer BPSTotal;

        @NameInMap("BPSWrite")
        private Integer BPSWrite;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("IOPSRead")
        private Integer IOPSRead;

        @NameInMap("IOPSTotal")
        private Integer IOPSTotal;

        @NameInMap("IOPSWrite")
        private Integer IOPSWrite;

        @NameInMap("LatencyRead")
        private Integer latencyRead;

        @NameInMap("LatencyWrite")
        private Integer latencyWrite;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private DiskMonitorData(Builder builder) {
            this.BPSRead = builder.BPSRead;
            this.BPSTotal = builder.BPSTotal;
            this.BPSWrite = builder.BPSWrite;
            this.diskId = builder.diskId;
            this.IOPSRead = builder.IOPSRead;
            this.IOPSTotal = builder.IOPSTotal;
            this.IOPSWrite = builder.IOPSWrite;
            this.latencyRead = builder.latencyRead;
            this.latencyWrite = builder.latencyWrite;
            this.timeStamp = builder.timeStamp;
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
         * @return BPSTotal
         */
        public Integer getBPSTotal() {
            return this.BPSTotal;
        }

        /**
         * @return BPSWrite
         */
        public Integer getBPSWrite() {
            return this.BPSWrite;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return IOPSRead
         */
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        /**
         * @return IOPSTotal
         */
        public Integer getIOPSTotal() {
            return this.IOPSTotal;
        }

        /**
         * @return IOPSWrite
         */
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        /**
         * @return latencyRead
         */
        public Integer getLatencyRead() {
            return this.latencyRead;
        }

        /**
         * @return latencyWrite
         */
        public Integer getLatencyWrite() {
            return this.latencyWrite;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Integer BPSRead; 
            private Integer BPSTotal; 
            private Integer BPSWrite; 
            private String diskId; 
            private Integer IOPSRead; 
            private Integer IOPSTotal; 
            private Integer IOPSWrite; 
            private Integer latencyRead; 
            private Integer latencyWrite; 
            private String timeStamp; 

            /**
             * The read bandwidth of the system disk. Unit: byte/s.
             */
            public Builder BPSRead(Integer BPSRead) {
                this.BPSRead = BPSRead;
                return this;
            }

            /**
             * The total read and write bandwidth of the system disk. Unit: byte/s.
             */
            public Builder BPSTotal(Integer BPSTotal) {
                this.BPSTotal = BPSTotal;
                return this;
            }

            /**
             * The write bandwidth of the system disk. Unit: byte/s.
             */
            public Builder BPSWrite(Integer BPSWrite) {
                this.BPSWrite = BPSWrite;
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
             * The number of read I/O operations per second on the system disk.
             */
            public Builder IOPSRead(Integer IOPSRead) {
                this.IOPSRead = IOPSRead;
                return this;
            }

            /**
             * The total number of read and write I/O operations per second on the system disk.
             */
            public Builder IOPSTotal(Integer IOPSTotal) {
                this.IOPSTotal = IOPSTotal;
                return this;
            }

            /**
             * The number of write I/O operations per second on the system disk.
             */
            public Builder IOPSWrite(Integer IOPSWrite) {
                this.IOPSWrite = IOPSWrite;
                return this;
            }

            /**
             * The read latency of the disk. Unit: microseconds.
             */
            public Builder latencyRead(Integer latencyRead) {
                this.latencyRead = latencyRead;
                return this;
            }

            /**
             * The write latency of the disk. Unit: microseconds.
             */
            public Builder latencyWrite(Integer latencyWrite) {
                this.latencyWrite = latencyWrite;
                return this;
            }

            /**
             * The timestamp of the monitoring data. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
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
