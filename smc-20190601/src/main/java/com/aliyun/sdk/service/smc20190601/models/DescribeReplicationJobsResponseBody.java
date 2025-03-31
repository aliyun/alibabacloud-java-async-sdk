// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

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
 * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReplicationJobsResponseBody</p>
 */
public class DescribeReplicationJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ReplicationJobs")
    private ReplicationJobs replicationJobs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeReplicationJobsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.replicationJobs = builder.replicationJobs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReplicationJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return replicationJobs
     */
    public ReplicationJobs getReplicationJobs() {
        return this.replicationJobs;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private ReplicationJobs replicationJobs; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeReplicationJobsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.replicationJobs = model.replicationJobs;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The details of migration jobs.</p>
         */
        public Builder replicationJobs(ReplicationJobs replicationJobs) {
            this.replicationJobs = replicationJobs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6E1187E8-843A-4850-B97E-2F17F00D48F7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of migration jobs returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeReplicationJobsResponseBody build() {
            return new DescribeReplicationJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class Part extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Block")
        private Boolean block;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        private Part(Builder builder) {
            this.block = builder.block;
            this.device = builder.device;
            this.sizeBytes = builder.sizeBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Part create() {
            return builder().build();
        }

        /**
         * @return block
         */
        public Boolean getBlock() {
            return this.block;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public static final class Builder {
            private Boolean block; 
            private String device; 
            private Long sizeBytes; 

            private Builder() {
            } 

            private Builder(Part model) {
                this.block = model.block;
                this.device = model.device;
                this.sizeBytes = model.sizeBytes;
            } 

            /**
             * <p>Indicates whether block replication is enabled for the data disk partition.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * <p>The device ID of the data disk partition.</p>
             * 
             * <strong>example:</strong>
             * <p>0_1</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The size of the data disk partition. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>21474836480</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            public Part build() {
                return new Part(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class Parts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Part")
        private java.util.List<Part> part;

        private Parts(Builder builder) {
            this.part = builder.part;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parts create() {
            return builder().build();
        }

        /**
         * @return part
         */
        public java.util.List<Part> getPart() {
            return this.part;
        }

        public static final class Builder {
            private java.util.List<Part> part; 

            private Builder() {
            } 

            private Builder(Parts model) {
                this.part = model.part;
            } 

            /**
             * Part.
             */
            public Builder part(java.util.List<Part> part) {
                this.part = part;
                return this;
            }

            public Parts build() {
                return new Parts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Parts")
        private Parts parts;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private DataDisk(Builder builder) {
            this.index = builder.index;
            this.parts = builder.parts;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return parts
         */
        public Parts getParts() {
            return this.parts;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private Integer index; 
            private Parts parts; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.index = model.index;
                this.parts = model.parts;
                this.size = model.size;
            } 

            /**
             * <p>The index number of the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The data disk partitions.</p>
             */
            public Builder parts(Parts parts) {
                this.parts = parts;
                return this;
            }

            /**
             * <p>The size of the data disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class DataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDisk")
        private java.util.List<DataDisk> dataDisk;

        private DataDisks(Builder builder) {
            this.dataDisk = builder.dataDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisks create() {
            return builder().build();
        }

        /**
         * @return dataDisk
         */
        public java.util.List<DataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public static final class Builder {
            private java.util.List<DataDisk> dataDisk; 

            private Builder() {
            } 

            private Builder(DataDisks model) {
                this.dataDisk = model.dataDisk;
            } 

            /**
             * DataDisk.
             */
            public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class PartsPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Block")
        private Boolean block;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        private PartsPart(Builder builder) {
            this.block = builder.block;
            this.path = builder.path;
            this.sizeBytes = builder.sizeBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartsPart create() {
            return builder().build();
        }

        /**
         * @return block
         */
        public Boolean getBlock() {
            return this.block;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public static final class Builder {
            private Boolean block; 
            private String path; 
            private Long sizeBytes; 

            private Builder() {
            } 

            private Builder(PartsPart model) {
                this.block = model.block;
                this.path = model.path;
                this.sizeBytes = model.sizeBytes;
            } 

            /**
             * <p>Whether block replication is enabled for the data disk partition. Valid values:</p>
             * <ul>
             * <li>true: Block replication is enabled for the data disk partition.</li>
             * <li>false: Block replication is disabled for the data disk partition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * <p>The path of the data disk partition.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/data</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The size of the data disk partition. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>21474836480</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            public PartsPart build() {
                return new PartsPart(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class DataParts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Part")
        private java.util.List<PartsPart> part;

        private DataParts(Builder builder) {
            this.part = builder.part;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataParts create() {
            return builder().build();
        }

        /**
         * @return part
         */
        public java.util.List<PartsPart> getPart() {
            return this.part;
        }

        public static final class Builder {
            private java.util.List<PartsPart> part; 

            private Builder() {
            } 

            private Builder(DataParts model) {
                this.part = model.part;
            } 

            /**
             * Part.
             */
            public Builder part(java.util.List<PartsPart> part) {
                this.part = part;
                return this;
            }

            public DataParts build() {
                return new DataParts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("LVM")
        private Boolean LVM;

        @com.aliyun.core.annotation.NameInMap("Parts")
        private DataParts parts;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private Data(Builder builder) {
            this.diskId = builder.diskId;
            this.LVM = builder.LVM;
            this.parts = builder.parts;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return LVM
         */
        public Boolean getLVM() {
            return this.LVM;
        }

        /**
         * @return parts
         */
        public DataParts getParts() {
            return this.parts;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String diskId; 
            private Boolean LVM; 
            private DataParts parts; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.diskId = model.diskId;
                this.LVM = model.LVM;
                this.parts = model.parts;
                this.size = model.size;
            } 

            /**
             * <p>The ID of the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-2zeh4twm100qskw7z41z</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>Specifies whether to use LVM. Valid values:</p>
             * <ul>
             * <li>true: Use LVM.</li>
             * <li>false: Not use LVM.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder LVM(Boolean LVM) {
                this.LVM = LVM;
                return this;
            }

            /**
             * <p>The information about the data disk partition.</p>
             */
            public Builder parts(DataParts parts) {
                this.parts = parts;
                return this;
            }

            /**
             * <p>The size of a data disk on the destination ECS instance. Unit: GiB. Valid values: 20 to 32768.</p>
             * <blockquote>
             * <p> The size of a destination data disk must be larger than the size of data in the corresponding source data disk. For example, if the size of the source disk is 500 GiB but the actual used space is 100 GiB, you must set this parameter to a value greater than 100 GiB.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>22548578304</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class DisksData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        private DisksData(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisksData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<Data> data; 

            private Builder() {
            } 

            private Builder(DisksData model) {
                this.data = model.data;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            public DisksData build() {
                return new DisksData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class SystemPartsPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Block")
        private Boolean block;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        private SystemPartsPart(Builder builder) {
            this.block = builder.block;
            this.path = builder.path;
            this.sizeBytes = builder.sizeBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemPartsPart create() {
            return builder().build();
        }

        /**
         * @return block
         */
        public Boolean getBlock() {
            return this.block;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public static final class Builder {
            private Boolean block; 
            private String path; 
            private Long sizeBytes; 

            private Builder() {
            } 

            private Builder(SystemPartsPart model) {
                this.block = model.block;
                this.path = model.path;
                this.sizeBytes = model.sizeBytes;
            } 

            /**
             * <p>Specifies whether block replication is enabled for the system disk partition. Valid values:</p>
             * <ul>
             * <li>true: Block replication is enabled for the system disk partition.</li>
             * <li>false: Block replication is disabled for the system disk partition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * <p>The path of the system disk partition.</p>
             * 
             * <strong>example:</strong>
             * <p>/boot</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The size of the system disk partition. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>21474836480</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            public SystemPartsPart build() {
                return new SystemPartsPart(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class SystemParts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Part")
        private java.util.List<SystemPartsPart> part;

        private SystemParts(Builder builder) {
            this.part = builder.part;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemParts create() {
            return builder().build();
        }

        /**
         * @return part
         */
        public java.util.List<SystemPartsPart> getPart() {
            return this.part;
        }

        public static final class Builder {
            private java.util.List<SystemPartsPart> part; 

            private Builder() {
            } 

            private Builder(SystemParts model) {
                this.part = model.part;
            } 

            /**
             * Part.
             */
            public Builder part(java.util.List<SystemPartsPart> part) {
                this.part = part;
                return this;
            }

            public SystemParts build() {
                return new SystemParts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class System extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("LVM")
        private Boolean LVM;

        @com.aliyun.core.annotation.NameInMap("Parts")
        private SystemParts parts;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private System(Builder builder) {
            this.diskId = builder.diskId;
            this.LVM = builder.LVM;
            this.parts = builder.parts;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static System create() {
            return builder().build();
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return LVM
         */
        public Boolean getLVM() {
            return this.LVM;
        }

        /**
         * @return parts
         */
        public SystemParts getParts() {
            return this.parts;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String diskId; 
            private Boolean LVM; 
            private SystemParts parts; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(System model) {
                this.diskId = model.diskId;
                this.LVM = model.LVM;
                this.parts = model.parts;
                this.size = model.size;
            } 

            /**
             * <p>The ID of the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-2zeh4twm100qskw7z41z</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>Specifies whether to use LVM. Valid values:</p>
             * <ul>
             * <li>true: Use LVM.</li>
             * <li>false: Not use LVM.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder LVM(Boolean LVM) {
                this.LVM = LVM;
                return this;
            }

            /**
             * <p>The information about the system disk partition.</p>
             */
            public Builder parts(SystemParts parts) {
                this.parts = parts;
                return this;
            }

            /**
             * <p>The size of the source system disk. Unit: GiB. Valid values: 20 to 32768.</p>
             * <blockquote>
             * <p> The parameter value must be greater than the actual used space of the data disk on the source server. For example, if the size of the source disk is 500 GiB but the actual used space is 100 GiB, you must set this parameter to a value greater than 100 GiB.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public System build() {
                return new System(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class Disks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private DisksData data;

        @com.aliyun.core.annotation.NameInMap("System")
        private System system;

        private Disks(Builder builder) {
            this.data = builder.data;
            this.system = builder.system;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public DisksData getData() {
            return this.data;
        }

        /**
         * @return system
         */
        public System getSystem() {
            return this.system;
        }

        public static final class Builder {
            private DisksData data; 
            private System system; 

            private Builder() {
            } 

            private Builder(Disks model) {
                this.data = model.data;
                this.system = model.system;
            } 

            /**
             * <p>The information about the data disk.</p>
             */
            public Builder data(DisksData data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The information about the system disk.</p>
             */
            public Builder system(System system) {
                this.system = system;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class ReplicationJobRun extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ReplicationJobRun(Builder builder) {
            this.endTime = builder.endTime;
            this.imageId = builder.imageId;
            this.startTime = builder.startTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicationJobRun create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
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

        public static final class Builder {
            private String endTime; 
            private String imageId; 
            private String startTime; 
            private String type; 

            private Builder() {
            } 

            private Builder(ReplicationJobRun model) {
                this.endTime = model.endTime;
                this.imageId = model.imageId;
                this.startTime = model.startTime;
                this.type = model.type;
            } 

            /**
             * <p>The time when the migration job ended. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> The time displayed in the SMC console is in the format of UTC+8.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2019-10-04T13:35:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the destination image.</p>
             * 
             * <strong>example:</strong>
             * <p>m-o6w3gy99qf89rkga****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The time when the migration job was started. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> The time displayed in the SMC console is in the format of UTC+8.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2019-10-01T13:35:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The method used to run the migration job. Valid values:</p>
             * <ul>
             * <li>Manual: The migration job was manually started.</li>
             * <li>Schedule: The migration job was started at a scheduled time or at a specific interval.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Schedule</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ReplicationJobRun build() {
                return new ReplicationJobRun(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class ReplicationJobRuns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReplicationJobRun")
        private java.util.List<ReplicationJobRun> replicationJobRun;

        private ReplicationJobRuns(Builder builder) {
            this.replicationJobRun = builder.replicationJobRun;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicationJobRuns create() {
            return builder().build();
        }

        /**
         * @return replicationJobRun
         */
        public java.util.List<ReplicationJobRun> getReplicationJobRun() {
            return this.replicationJobRun;
        }

        public static final class Builder {
            private java.util.List<ReplicationJobRun> replicationJobRun; 

            private Builder() {
            } 

            private Builder(ReplicationJobRuns model) {
                this.replicationJobRun = model.replicationJobRun;
            } 

            /**
             * ReplicationJobRun.
             */
            public Builder replicationJobRun(java.util.List<ReplicationJobRun> replicationJobRun) {
                this.replicationJobRun = replicationJobRun;
                return this;
            }

            public ReplicationJobRuns build() {
                return new ReplicationJobRuns(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class SystemDiskPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Block")
        private Boolean block;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        private SystemDiskPart(Builder builder) {
            this.block = builder.block;
            this.device = builder.device;
            this.sizeBytes = builder.sizeBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDiskPart create() {
            return builder().build();
        }

        /**
         * @return block
         */
        public Boolean getBlock() {
            return this.block;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public static final class Builder {
            private Boolean block; 
            private String device; 
            private Long sizeBytes; 

            private Builder() {
            } 

            private Builder(SystemDiskPart model) {
                this.block = model.block;
                this.device = model.device;
                this.sizeBytes = model.sizeBytes;
            } 

            /**
             * <p>Indicates whether block replication is enabled for the system disk partition.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * <p>The device ID of the system disk partition.</p>
             * 
             * <strong>example:</strong>
             * <p>0_1</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The size of the system disk partition. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>254803968</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            public SystemDiskPart build() {
                return new SystemDiskPart(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class SystemDiskParts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SystemDiskPart")
        private java.util.List<SystemDiskPart> systemDiskPart;

        private SystemDiskParts(Builder builder) {
            this.systemDiskPart = builder.systemDiskPart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDiskParts create() {
            return builder().build();
        }

        /**
         * @return systemDiskPart
         */
        public java.util.List<SystemDiskPart> getSystemDiskPart() {
            return this.systemDiskPart;
        }

        public static final class Builder {
            private java.util.List<SystemDiskPart> systemDiskPart; 

            private Builder() {
            } 

            private Builder(SystemDiskParts model) {
                this.systemDiskPart = model.systemDiskPart;
            } 

            /**
             * SystemDiskPart.
             */
            public Builder systemDiskPart(java.util.List<SystemDiskPart> systemDiskPart) {
                this.systemDiskPart = systemDiskPart;
                return this;
            }

            public SystemDiskParts build() {
                return new SystemDiskParts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag N that is added to the SMC resource. Valid values of N: 1 to 20.</p>
             * <p>The tag key can be an empty string. It can be up to 64 characters in length and cannot contain http:// or https://.<a href="http://https://%E3%80%82"></a></p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N that is added to the SMC resource. Valid values of N: 1 to 20.</p>
             * <p>The tag value can be an empty string. It can be up to 64 characters in length and cannot contain http:// or https://.<a href="http://https://%E3%80%82"></a></p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class ReplicationJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("ContainerNamespace")
        private String containerNamespace;

        @com.aliyun.core.annotation.NameInMap("ContainerRepository")
        private String containerRepository;

        @com.aliyun.core.annotation.NameInMap("ContainerTag")
        private String containerTag;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DataDisks")
        private DataDisks dataDisks;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private Disks disks;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Frequency")
        private Integer frequency;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceRamRole")
        private String instanceRamRole;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private Integer jobType;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @com.aliyun.core.annotation.NameInMap("LicenseType")
        private String licenseType;

        @com.aliyun.core.annotation.NameInMap("MaxNumberOfImageToKeep")
        private Integer maxNumberOfImageToKeep;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetMode")
        private Integer netMode;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Float progress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReplicationJobRuns")
        private ReplicationJobRuns replicationJobRuns;

        @com.aliyun.core.annotation.NameInMap("ReplicationParameters")
        private String replicationParameters;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RunOnce")
        private Boolean runOnce;

        @com.aliyun.core.annotation.NameInMap("ScheduledStartTime")
        private String scheduledStartTime;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusInfo")
        private String statusInfo;

        @com.aliyun.core.annotation.NameInMap("SystemDiskParts")
        private SystemDiskParts systemDiskParts;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TransitionInstanceId")
        private String transitionInstanceId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ValidTime")
        private String validTime;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private ReplicationJob(Builder builder) {
            this.businessStatus = builder.businessStatus;
            this.containerNamespace = builder.containerNamespace;
            this.containerRepository = builder.containerRepository;
            this.containerTag = builder.containerTag;
            this.creationTime = builder.creationTime;
            this.dataDisks = builder.dataDisks;
            this.description = builder.description;
            this.disks = builder.disks;
            this.endTime = builder.endTime;
            this.errorCode = builder.errorCode;
            this.frequency = builder.frequency;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.instanceId = builder.instanceId;
            this.instanceRamRole = builder.instanceRamRole;
            this.instanceType = builder.instanceType;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.launchTemplateId = builder.launchTemplateId;
            this.launchTemplateVersion = builder.launchTemplateVersion;
            this.licenseType = builder.licenseType;
            this.maxNumberOfImageToKeep = builder.maxNumberOfImageToKeep;
            this.name = builder.name;
            this.netMode = builder.netMode;
            this.progress = builder.progress;
            this.regionId = builder.regionId;
            this.replicationJobRuns = builder.replicationJobRuns;
            this.replicationParameters = builder.replicationParameters;
            this.resourceGroupId = builder.resourceGroupId;
            this.runOnce = builder.runOnce;
            this.scheduledStartTime = builder.scheduledStartTime;
            this.sourceId = builder.sourceId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusInfo = builder.statusInfo;
            this.systemDiskParts = builder.systemDiskParts;
            this.systemDiskSize = builder.systemDiskSize;
            this.tags = builder.tags;
            this.targetType = builder.targetType;
            this.transitionInstanceId = builder.transitionInstanceId;
            this.vSwitchId = builder.vSwitchId;
            this.validTime = builder.validTime;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicationJob create() {
            return builder().build();
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return containerNamespace
         */
        public String getContainerNamespace() {
            return this.containerNamespace;
        }

        /**
         * @return containerRepository
         */
        public String getContainerRepository() {
            return this.containerRepository;
        }

        /**
         * @return containerTag
         */
        public String getContainerTag() {
            return this.containerTag;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dataDisks
         */
        public DataDisks getDataDisks() {
            return this.dataDisks;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return disks
         */
        public Disks getDisks() {
            return this.disks;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return frequency
         */
        public Integer getFrequency() {
            return this.frequency;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceRamRole
         */
        public String getInstanceRamRole() {
            return this.instanceRamRole;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobType
         */
        public Integer getJobType() {
            return this.jobType;
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return launchTemplateVersion
         */
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        /**
         * @return licenseType
         */
        public String getLicenseType() {
            return this.licenseType;
        }

        /**
         * @return maxNumberOfImageToKeep
         */
        public Integer getMaxNumberOfImageToKeep() {
            return this.maxNumberOfImageToKeep;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return netMode
         */
        public Integer getNetMode() {
            return this.netMode;
        }

        /**
         * @return progress
         */
        public Float getProgress() {
            return this.progress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return replicationJobRuns
         */
        public ReplicationJobRuns getReplicationJobRuns() {
            return this.replicationJobRuns;
        }

        /**
         * @return replicationParameters
         */
        public String getReplicationParameters() {
            return this.replicationParameters;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return runOnce
         */
        public Boolean getRunOnce() {
            return this.runOnce;
        }

        /**
         * @return scheduledStartTime
         */
        public String getScheduledStartTime() {
            return this.scheduledStartTime;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusInfo
         */
        public String getStatusInfo() {
            return this.statusInfo;
        }

        /**
         * @return systemDiskParts
         */
        public SystemDiskParts getSystemDiskParts() {
            return this.systemDiskParts;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return transitionInstanceId
         */
        public String getTransitionInstanceId() {
            return this.transitionInstanceId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return validTime
         */
        public String getValidTime() {
            return this.validTime;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String businessStatus; 
            private String containerNamespace; 
            private String containerRepository; 
            private String containerTag; 
            private String creationTime; 
            private DataDisks dataDisks; 
            private String description; 
            private Disks disks; 
            private String endTime; 
            private String errorCode; 
            private Integer frequency; 
            private String imageId; 
            private String imageName; 
            private String instanceId; 
            private String instanceRamRole; 
            private String instanceType; 
            private String jobId; 
            private Integer jobType; 
            private String launchTemplateId; 
            private String launchTemplateVersion; 
            private String licenseType; 
            private Integer maxNumberOfImageToKeep; 
            private String name; 
            private Integer netMode; 
            private Float progress; 
            private String regionId; 
            private ReplicationJobRuns replicationJobRuns; 
            private String replicationParameters; 
            private String resourceGroupId; 
            private Boolean runOnce; 
            private String scheduledStartTime; 
            private String sourceId; 
            private String startTime; 
            private String status; 
            private String statusInfo; 
            private SystemDiskParts systemDiskParts; 
            private Integer systemDiskSize; 
            private Tags tags; 
            private String targetType; 
            private String transitionInstanceId; 
            private String vSwitchId; 
            private String validTime; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(ReplicationJob model) {
                this.businessStatus = model.businessStatus;
                this.containerNamespace = model.containerNamespace;
                this.containerRepository = model.containerRepository;
                this.containerTag = model.containerTag;
                this.creationTime = model.creationTime;
                this.dataDisks = model.dataDisks;
                this.description = model.description;
                this.disks = model.disks;
                this.endTime = model.endTime;
                this.errorCode = model.errorCode;
                this.frequency = model.frequency;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.instanceId = model.instanceId;
                this.instanceRamRole = model.instanceRamRole;
                this.instanceType = model.instanceType;
                this.jobId = model.jobId;
                this.jobType = model.jobType;
                this.launchTemplateId = model.launchTemplateId;
                this.launchTemplateVersion = model.launchTemplateVersion;
                this.licenseType = model.licenseType;
                this.maxNumberOfImageToKeep = model.maxNumberOfImageToKeep;
                this.name = model.name;
                this.netMode = model.netMode;
                this.progress = model.progress;
                this.regionId = model.regionId;
                this.replicationJobRuns = model.replicationJobRuns;
                this.replicationParameters = model.replicationParameters;
                this.resourceGroupId = model.resourceGroupId;
                this.runOnce = model.runOnce;
                this.scheduledStartTime = model.scheduledStartTime;
                this.sourceId = model.sourceId;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusInfo = model.statusInfo;
                this.systemDiskParts = model.systemDiskParts;
                this.systemDiskSize = model.systemDiskSize;
                this.tags = model.tags;
                this.targetType = model.targetType;
                this.transitionInstanceId = model.transitionInstanceId;
                this.vSwitchId = model.vSwitchId;
                this.validTime = model.validTime;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The business status of the migration job. Valid values:</p>
             * <ul>
             * <li>Preparing: The migration is being prepared.</li>
             * <li>Syncing: Data is being synchronized.</li>
             * <li>Processing: The migration is in progress.</li>
             * <li>Cleaning: Intermediate resources are being released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Preparing</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The namespace of the destination Docker container image.</p>
             * 
             * <strong>example:</strong>
             * <p>testNamespace</p>
             */
            public Builder containerNamespace(String containerNamespace) {
                this.containerNamespace = containerNamespace;
                return this;
            }

            /**
             * <p>The repository that stores the destination Docker container image.</p>
             * 
             * <strong>example:</strong>
             * <p>testRepository</p>
             */
            public Builder containerRepository(String containerRepository) {
                this.containerRepository = containerRepository;
                return this;
            }

            /**
             * <p>The tag of the destination Docker container image.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS:v1</p>
             */
            public Builder containerTag(String containerTag) {
                this.containerTag = containerTag;
                return this;
            }

            /**
             * <p>The time when the migration job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-07-24T13:00:52Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The data disks on the destination ECS instance.</p>
             */
            public Builder dataDisks(DataDisks dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * <p>The description of the migration job.</p>
             * 
             * <strong>example:</strong>
             * <p>This is my migration task.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The information about the disk.</p>
             */
            public Builder disks(Disks disks) {
                this.disks = disks;
                return this;
            }

            /**
             * <p>The time when the migration job was complete. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> The time displayed in the SMC console is in the format of UTC+8.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2019-06-04T16:00:52Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The error code returned if an error occurred in the migration job.</p>
             * 
             * <strong>example:</strong>
             * <p>InternalError</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The interval at which the incremental migration job runs. Unit: hour. Valid values: 1 to 168.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder frequency(Integer frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * <p>The ID of the destination image.</p>
             * 
             * <strong>example:</strong>
             * <p>m-o6w3gy99qf89rkga****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the destination image.</p>
             * 
             * <strong>example:</strong>
             * <p>testAliCloudImageName</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The ID of the destination ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1ff25rzvnul6kr****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the Resource Access Management (RAM) role that is assigned to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>SMCAdmin</p>
             */
            public Builder instanceRamRole(String instanceRamRole) {
                this.instanceRamRole = instanceRamRole;
                return this;
            }

            /**
             * <p>The instance type of the intermediate instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.sn1ne.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The ID of the migration job.</p>
             * 
             * <strong>example:</strong>
             * <p>j-bp19vlwm0tyigbmj****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The type of the migration job. Valid values:</p>
             * <ul>
             * <li>0: server migration.</li>
             * <li>1: operating system migration.</li>
             * <li>2: cross-zone migration.</li>
             * <li>3: agentless migration for a VMware VM.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder jobType(Integer jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The ID of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>lt-launchtemplateid</p>
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * <p>The versions of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * <p>The type of license for the migration job. Valid values:</p>
             * <ul>
             * <li>An empty value indicates no license.</li>
             * <li>A value of BYOL indicates Bring Your Own License (BYOL).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BYOL</p>
             */
            public Builder licenseType(String licenseType) {
                this.licenseType = licenseType;
                return this;
            }

            /**
             * <p>The maximum number of images retained for the incremental migration job. Valid values: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder maxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
                this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
                return this;
            }

            /**
             * <p>The name of the migration job.</p>
             * 
             * <strong>example:</strong>
             * <p>testMigrationTaskName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of network used for the migration.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder netMode(Integer netMode) {
                this.netMode = netMode;
                return this;
            }

            /**
             * <p>The progress of the migration job.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud region to which the source server is migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The execution records of the migration job.</p>
             */
            public Builder replicationJobRuns(ReplicationJobRuns replicationJobRuns) {
                this.replicationJobRuns = replicationJobRuns;
                return this;
            }

            /**
             * <p>The string of key-value pairs configured for the replication driver.</p>
             * 
             * <strong>example:</strong>
             * <p>BandWidthLimit:0</p>
             */
            public Builder replicationParameters(String replicationParameters) {
                this.replicationParameters = replicationParameters;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmw3ty5y7****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether incremental migration is disabled for the source server. Valid values:</p>
             * <ul>
             * <li>true: Incremental migration is disabled. A migration job runs only once after the job is created.</li>
             * <li>false: Incremental migration is enabled. For an incremental migration job, SMC synchronizes incremental data to Alibaba Cloud at the interval specified by the <code>Frequency</code> parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder runOnce(Boolean runOnce) {
                this.runOnce = runOnce;
                return this;
            }

            /**
             * <p>The time when the migration job is scheduled to run. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. The time must meet the following requirements:</p>
             * <ul>
             * <li>The value must be within 30 days after the current time.</li>
             * <li>If you do not specify this parameter, you must manually start the migration job after the migration job is created. You can call the <a href="https://help.aliyun.com/document_detail/121823.html">StartReplicationJob</a> operation to start the migration job.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2019-06-04T13:35:00Z</p>
             */
            public Builder scheduledStartTime(String scheduledStartTime) {
                this.scheduledStartTime = scheduledStartTime;
                return this;
            }

            /**
             * <p>The ID of the source server.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp1e2fsl57knvuug****</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The time when the migration job was started. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> The time displayed in the SMC console is in the format of UTC+8.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2019-06-04T14:40:52Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the migration job. Valid values:</p>
             * <ul>
             * <li>Ready: The migration job is not started.</li>
             * <li>Running: The migration job is running.</li>
             * <li>Stopped: The migration job is paused.</li>
             * <li>InError: An error occurs in the migration job.</li>
             * <li>Finished: The migration job is complete.</li>
             * <li>Waiting: The migration job is waiting to run.</li>
             * <li>Expired: The migration job has expired.</li>
             * <li>Deleting: The migration job is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status information about the migration job.</p>
             * 
             * <strong>example:</strong>
             * <p>statusinfo</p>
             */
            public Builder statusInfo(String statusInfo) {
                this.statusInfo = statusInfo;
                return this;
            }

            /**
             * <p>The system disk partitions.</p>
             */
            public Builder systemDiskParts(SystemDiskParts systemDiskParts) {
                this.systemDiskParts = systemDiskParts;
                return this;
            }

            /**
             * <p>The size of the system disk of the destination ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The information about tags that are attached to the SMC resource.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The type of destination to which the source server is migrated. Valid values:</p>
             * <ul>
             * <li>Image: After the migration job is complete, SMC generates an ECS image for the source server.</li>
             * <li>ContainerImage: After the migration job is complete, SMC generates a Docker container image for the source server.</li>
             * <li>TargetInstance: After the migration job is complete, SMC migrates the source server to the destination instance. If you set this parameter to TargetInstance, you must set the InstanceId parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Image</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The ID of the intermediate instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1ff25rzvnul6kr****</p>
             */
            public Builder transitionInstanceId(String transitionInstanceId) {
                this.transitionInstanceId = transitionInstanceId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch in the specified VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1ddbrxdlrcbim46****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The time when the migration job expired. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> The time displayed in the SMC console is in the format of UTC+8.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2019-06-08T14:40:52Z</p>
             */
            public Builder validTime(String validTime) {
                this.validTime = validTime;
                return this;
            }

            /**
             * <p>The ID of a virtual private cloud (VPC) for which you have configured an Express Connect circuit or a VPN gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1vwnn14rqpyiczj****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ReplicationJob build() {
                return new ReplicationJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsResponseBody</p>
     */
    public static class ReplicationJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReplicationJob")
        private java.util.List<ReplicationJob> replicationJob;

        private ReplicationJobs(Builder builder) {
            this.replicationJob = builder.replicationJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicationJobs create() {
            return builder().build();
        }

        /**
         * @return replicationJob
         */
        public java.util.List<ReplicationJob> getReplicationJob() {
            return this.replicationJob;
        }

        public static final class Builder {
            private java.util.List<ReplicationJob> replicationJob; 

            private Builder() {
            } 

            private Builder(ReplicationJobs model) {
                this.replicationJob = model.replicationJob;
            } 

            /**
             * ReplicationJob.
             */
            public Builder replicationJob(java.util.List<ReplicationJob> replicationJob) {
                this.replicationJob = replicationJob;
                return this;
            }

            public ReplicationJobs build() {
                return new ReplicationJobs(this);
            } 

        } 

    }
}
