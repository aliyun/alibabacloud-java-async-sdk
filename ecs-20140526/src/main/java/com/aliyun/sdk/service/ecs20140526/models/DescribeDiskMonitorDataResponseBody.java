// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    private MonitorData monitorData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDiskMonitorDataResponseBody model) {
            this.monitorData = model.monitorData;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The monitoring data of the disk.</p>
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of monitoring data entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
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
    public static class DiskMonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BPSRead")
        private Integer BPSRead;

        @com.aliyun.core.annotation.NameInMap("BPSTotal")
        private Integer BPSTotal;

        @com.aliyun.core.annotation.NameInMap("BPSWrite")
        private Integer BPSWrite;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("IOPSRead")
        private Integer IOPSRead;

        @com.aliyun.core.annotation.NameInMap("IOPSTotal")
        private Integer IOPSTotal;

        @com.aliyun.core.annotation.NameInMap("IOPSWrite")
        private Integer IOPSWrite;

        @com.aliyun.core.annotation.NameInMap("LatencyRead")
        private Integer latencyRead;

        @com.aliyun.core.annotation.NameInMap("LatencyWrite")
        private Integer latencyWrite;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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

            private Builder() {
            } 

            private Builder(DiskMonitorData model) {
                this.BPSRead = model.BPSRead;
                this.BPSTotal = model.BPSTotal;
                this.BPSWrite = model.BPSWrite;
                this.diskId = model.diskId;
                this.IOPSRead = model.IOPSRead;
                this.IOPSTotal = model.IOPSTotal;
                this.IOPSWrite = model.IOPSWrite;
                this.latencyRead = model.latencyRead;
                this.latencyWrite = model.latencyWrite;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The read bandwidth of the disk. Unit: byte/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder BPSRead(Integer BPSRead) {
                this.BPSRead = BPSRead;
                return this;
            }

            /**
             * <p>The total read and write bandwidth of the disk. Unit: byte/s.</p>
             * 
             * <strong>example:</strong>
             * <p>204</p>
             */
            public Builder BPSTotal(Integer BPSTotal) {
                this.BPSTotal = BPSTotal;
                return this;
            }

            /**
             * <p>The write bandwidth of the disk. Unit: byte/s.</p>
             * 
             * <strong>example:</strong>
             * <p>204</p>
             */
            public Builder BPSWrite(Integer BPSWrite) {
                this.BPSWrite = BPSWrite;
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
             * <p>The number of read I/O operations per second on the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder IOPSRead(Integer IOPSRead) {
                this.IOPSRead = IOPSRead;
                return this;
            }

            /**
             * <p>The total number of read and write I/O operations per second on the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder IOPSTotal(Integer IOPSTotal) {
                this.IOPSTotal = IOPSTotal;
                return this;
            }

            /**
             * <p>The number of write I/O operations per second on the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder IOPSWrite(Integer IOPSWrite) {
                this.IOPSWrite = IOPSWrite;
                return this;
            }

            /**
             * <p>The read latency of the disk. Unit: microseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder latencyRead(Integer latencyRead) {
                this.latencyRead = latencyRead;
                return this;
            }

            /**
             * <p>The write latency of the disk. Unit: microseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder latencyWrite(Integer latencyWrite) {
                this.latencyWrite = latencyWrite;
                return this;
            }

            /**
             * <p>The timestamp of the monitoring data. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-07-23T12:07:00Z</p>
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
    /**
     * 
     * {@link DescribeDiskMonitorDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiskMonitorDataResponseBody</p>
     */
    public static class MonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskMonitorData")
        private java.util.List<DiskMonitorData> diskMonitorData;

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
        public java.util.List<DiskMonitorData> getDiskMonitorData() {
            return this.diskMonitorData;
        }

        public static final class Builder {
            private java.util.List<DiskMonitorData> diskMonitorData; 

            private Builder() {
            } 

            private Builder(MonitorData model) {
                this.diskMonitorData = model.diskMonitorData;
            } 

            /**
             * DiskMonitorData.
             */
            public Builder diskMonitorData(java.util.List<DiskMonitorData> diskMonitorData) {
                this.diskMonitorData = diskMonitorData;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}
