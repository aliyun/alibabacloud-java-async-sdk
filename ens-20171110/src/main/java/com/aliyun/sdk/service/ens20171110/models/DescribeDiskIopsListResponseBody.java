// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeDiskIopsListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskIopsListResponseBody</p>
 */
public class DescribeDiskIopsListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiskIopsList")
    private java.util.List<DiskIopsList> diskIopsList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDiskIopsListResponseBody(Builder builder) {
        this.diskIopsList = builder.diskIopsList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskIopsListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskIopsList
     */
    public java.util.List<DiskIopsList> getDiskIopsList() {
        return this.diskIopsList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DiskIopsList> diskIopsList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDiskIopsListResponseBody model) {
            this.diskIopsList = model.diskIopsList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IOPS monitoring data of the cloud disk.</p>
         */
        public Builder diskIopsList(java.util.List<DiskIopsList> diskIopsList) {
            this.diskIopsList = diskIopsList;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A7814CAB-DB4E-140A-9D6F-7C8210C1DAC3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiskIopsListResponseBody build() {
            return new DescribeDiskIopsListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiskIopsListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiskIopsListResponseBody</p>
     */
    public static class DiskIopsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizTime")
        private String bizTime;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("ReadBytes")
        private Long readBytes;

        @com.aliyun.core.annotation.NameInMap("ReadLatency")
        private Long readLatency;

        @com.aliyun.core.annotation.NameInMap("ReadOps")
        private Long readOps;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("WriteBytes")
        private Long writeBytes;

        @com.aliyun.core.annotation.NameInMap("WriteLatency")
        private Long writeLatency;

        @com.aliyun.core.annotation.NameInMap("WriteOps")
        private Long writeOps;

        private DiskIopsList(Builder builder) {
            this.bizTime = builder.bizTime;
            this.diskId = builder.diskId;
            this.readBytes = builder.readBytes;
            this.readLatency = builder.readLatency;
            this.readOps = builder.readOps;
            this.regionId = builder.regionId;
            this.writeBytes = builder.writeBytes;
            this.writeLatency = builder.writeLatency;
            this.writeOps = builder.writeOps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskIopsList create() {
            return builder().build();
        }

        /**
         * @return bizTime
         */
        public String getBizTime() {
            return this.bizTime;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return readBytes
         */
        public Long getReadBytes() {
            return this.readBytes;
        }

        /**
         * @return readLatency
         */
        public Long getReadLatency() {
            return this.readLatency;
        }

        /**
         * @return readOps
         */
        public Long getReadOps() {
            return this.readOps;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return writeBytes
         */
        public Long getWriteBytes() {
            return this.writeBytes;
        }

        /**
         * @return writeLatency
         */
        public Long getWriteLatency() {
            return this.writeLatency;
        }

        /**
         * @return writeOps
         */
        public Long getWriteOps() {
            return this.writeOps;
        }

        public static final class Builder {
            private String bizTime; 
            private String diskId; 
            private Long readBytes; 
            private Long readLatency; 
            private Long readOps; 
            private String regionId; 
            private Long writeBytes; 
            private Long writeLatency; 
            private Long writeOps; 

            private Builder() {
            } 

            private Builder(DiskIopsList model) {
                this.bizTime = model.bizTime;
                this.diskId = model.diskId;
                this.readBytes = model.readBytes;
                this.readLatency = model.readLatency;
                this.readOps = model.readOps;
                this.regionId = model.regionId;
                this.writeBytes = model.writeBytes;
                this.writeLatency = model.writeLatency;
                this.writeOps = model.writeOps;
            } 

            /**
             * <p>The business time . The time is displayed in the yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-14 00:00:00</p>
             */
            public Builder bizTime(String bizTime) {
                this.bizTime = bizTime;
                return this;
            }

            /**
             * <p>The ID of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-5tzm9wnhzlhjzcbtxo465****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The read throughput. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10054</p>
             */
            public Builder readBytes(Long readBytes) {
                this.readBytes = readBytes;
                return this;
            }

            /**
             * <p>The read latency. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>15646532</p>
             */
            public Builder readLatency(Long readLatency) {
                this.readLatency = readLatency;
                return this;
            }

            /**
             * <p>The read IOPS.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder readOps(Long readOps) {
                this.readOps = readOps;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-3</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The write throughput. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder writeBytes(Long writeBytes) {
                this.writeBytes = writeBytes;
                return this;
            }

            /**
             * <p>The write latency. Unit: microseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder writeLatency(Long writeLatency) {
                this.writeLatency = writeLatency;
                return this;
            }

            /**
             * <p>The write IOPS.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder writeOps(Long writeOps) {
                this.writeOps = writeOps;
                return this;
            }

            public DiskIopsList build() {
                return new DiskIopsList(this);
            } 

        } 

    }
}
