// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskSecondLevelMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskSecondLevelMonitorResponseBody</p>
 */
public class DescribeDiskSecondLevelMonitorResponseBody extends TeaModel {
    @NameInMap("MonitorData")
    private java.util.List < MonitorData> monitorData;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDiskSecondLevelMonitorResponseBody(Builder builder) {
        this.monitorData = builder.monitorData;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskSecondLevelMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return monitorData
     */
    public java.util.List < MonitorData> getMonitorData() {
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
        private java.util.List < MonitorData> monitorData; 
        private String requestId; 
        private Long totalCount; 

        /**
         * MonitorData.
         */
        public Builder monitorData(java.util.List < MonitorData> monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiskSecondLevelMonitorResponseBody build() {
            return new DescribeDiskSecondLevelMonitorResponseBody(this);
        } 

    } 

    public static class MonitorData extends TeaModel {
        @NameInMap("BPSPercent")
        private Long BPSPercent;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("IOPSPercent")
        private Long IOPSPercent;

        @NameInMap("ReadBPS")
        private Long readBPS;

        @NameInMap("ReadIOPS")
        private Long readIOPS;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("WriteBPS")
        private Long writeBPS;

        @NameInMap("WriteIOPS")
        private Long writeIOPS;

        private MonitorData(Builder builder) {
            this.BPSPercent = builder.BPSPercent;
            this.diskId = builder.diskId;
            this.IOPSPercent = builder.IOPSPercent;
            this.readBPS = builder.readBPS;
            this.readIOPS = builder.readIOPS;
            this.timestamp = builder.timestamp;
            this.writeBPS = builder.writeBPS;
            this.writeIOPS = builder.writeIOPS;
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
         * @return readIOPS
         */
        public Long getReadIOPS() {
            return this.readIOPS;
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
         * @return writeIOPS
         */
        public Long getWriteIOPS() {
            return this.writeIOPS;
        }

        public static final class Builder {
            private Long BPSPercent; 
            private String diskId; 
            private Long IOPSPercent; 
            private Long readBPS; 
            private Long readIOPS; 
            private String timestamp; 
            private Long writeBPS; 
            private Long writeIOPS; 

            /**
             * BPSPercent.
             */
            public Builder BPSPercent(Long BPSPercent) {
                this.BPSPercent = BPSPercent;
                return this;
            }

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * IOPSPercent.
             */
            public Builder IOPSPercent(Long IOPSPercent) {
                this.IOPSPercent = IOPSPercent;
                return this;
            }

            /**
             * ReadBPS.
             */
            public Builder readBPS(Long readBPS) {
                this.readBPS = readBPS;
                return this;
            }

            /**
             * ReadIOPS.
             */
            public Builder readIOPS(Long readIOPS) {
                this.readIOPS = readIOPS;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * WriteBPS.
             */
            public Builder writeBPS(Long writeBPS) {
                this.writeBPS = writeBPS;
                return this;
            }

            /**
             * WriteIOPS.
             */
            public Builder writeIOPS(Long writeIOPS) {
                this.writeIOPS = writeIOPS;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}
