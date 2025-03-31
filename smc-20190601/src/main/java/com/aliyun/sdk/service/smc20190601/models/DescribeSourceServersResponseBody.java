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
 * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSourceServersResponseBody</p>
 */
public class DescribeSourceServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceServers")
    private SourceServers sourceServers;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSourceServersResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sourceServers = builder.sourceServers;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSourceServersResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceServers
     */
    public SourceServers getSourceServers() {
        return this.sourceServers;
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
        private String requestId; 
        private SourceServers sourceServers; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSourceServersResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.sourceServers = model.sourceServers;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>410E6073-66D0-45D3-AB3E-4DC3F5E4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the migration source.</p>
         */
        public Builder sourceServers(SourceServers sourceServers) {
            this.sourceServers = sourceServers;
            return this;
        }

        /**
         * <p>The total number of migration sources returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSourceServersResponseBody build() {
            return new DescribeSourceServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
     */
    public static class Part extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanBlock")
        private Boolean canBlock;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("Need")
        private Boolean need;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        private Part(Builder builder) {
            this.canBlock = builder.canBlock;
            this.device = builder.device;
            this.need = builder.need;
            this.path = builder.path;
            this.sizeBytes = builder.sizeBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Part create() {
            return builder().build();
        }

        /**
         * @return canBlock
         */
        public Boolean getCanBlock() {
            return this.canBlock;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return need
         */
        public Boolean getNeed() {
            return this.need;
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
            private Boolean canBlock; 
            private String device; 
            private Boolean need; 
            private String path; 
            private Long sizeBytes; 

            private Builder() {
            } 

            private Builder(Part model) {
                this.canBlock = model.canBlock;
                this.device = model.device;
                this.need = model.need;
                this.path = model.path;
                this.sizeBytes = model.sizeBytes;
            } 

            /**
             * <p>Indicates whether block replication is enabled for the data disk partition.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canBlock(Boolean canBlock) {
                this.canBlock = canBlock;
                return this;
            }

            /**
             * <p>The device ID of the data disk partition.</p>
             * 
             * <strong>example:</strong>
             * <p>1_0</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>Indicates whether the data disk partition must be selected.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder need(Boolean need) {
                this.need = need;
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

            public Part build() {
                return new Part(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
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
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Parts")
        private Parts parts;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private DataDisk(Builder builder) {
            this.index = builder.index;
            this.parts = builder.parts;
            this.path = builder.path;
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
         * @return path
         */
        public String getPath() {
            return this.path;
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
            private String path; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.index = model.index;
                this.parts = model.parts;
                this.path = model.path;
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
             * <p>The information about the data disk partition.</p>
             */
            public Builder parts(Parts parts) {
                this.parts = parts;
                return this;
            }

            /**
             * <p>The path of data disk N.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/data</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The size of data disk N. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
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
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
     */
    public static class PartsPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanBlock")
        private Boolean canBlock;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PartsPart(Builder builder) {
            this.canBlock = builder.canBlock;
            this.path = builder.path;
            this.sizeBytes = builder.sizeBytes;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartsPart create() {
            return builder().build();
        }

        /**
         * @return canBlock
         */
        public Boolean getCanBlock() {
            return this.canBlock;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean canBlock; 
            private String path; 
            private Long sizeBytes; 
            private String type; 

            private Builder() {
            } 

            private Builder(PartsPart model) {
                this.canBlock = model.canBlock;
                this.path = model.path;
                this.sizeBytes = model.sizeBytes;
                this.type = model.type;
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
            public Builder canBlock(Boolean canBlock) {
                this.canBlock = canBlock;
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

            /**
             * <p>The type of the data disk partition. Valid values:</p>
             * <ul>
             * <li>Normal: normal partition.</li>
             * <li>System: system partition.</li>
             * <li>Boot: boot partition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PartsPart build() {
                return new PartsPart(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
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
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Offset")
        private Long offset;

        @com.aliyun.core.annotation.NameInMap("Parts")
        private DataParts parts;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private Data(Builder builder) {
            this.offset = builder.offset;
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
         * @return offset
         */
        public Long getOffset() {
            return this.offset;
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
            private Long offset; 
            private DataParts parts; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.offset = model.offset;
                this.parts = model.parts;
                this.size = model.size;
            } 

            /**
             * <p>The start offset of the first partition of the data disk. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder offset(Long offset) {
                this.offset = offset;
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
             * <p>The data disk size of the migration source. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
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
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
     */
    public static class SystemPartsPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanBlock")
        private Boolean canBlock;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SystemPartsPart(Builder builder) {
            this.canBlock = builder.canBlock;
            this.path = builder.path;
            this.sizeBytes = builder.sizeBytes;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemPartsPart create() {
            return builder().build();
        }

        /**
         * @return canBlock
         */
        public Boolean getCanBlock() {
            return this.canBlock;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean canBlock; 
            private String path; 
            private Long sizeBytes; 
            private String type; 

            private Builder() {
            } 

            private Builder(SystemPartsPart model) {
                this.canBlock = model.canBlock;
                this.path = model.path;
                this.sizeBytes = model.sizeBytes;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether block replication is enabled for the system disk partition. Valid values:</p>
             * <ul>
             * <li>true: Block replication is enabled for the system disk partition.</li>
             * <li>false: Block replication is disabled for the system disk partition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canBlock(Boolean canBlock) {
                this.canBlock = canBlock;
                return this;
            }

            /**
             * <p>The path of the system disk partition.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/data</p>
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

            /**
             * <p>The type of the system disk partition. Valid values:</p>
             * <ul>
             * <li>Normal: normal partition.</li>
             * <li>System: system partition.</li>
             * <li>Boot: boot partition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SystemPartsPart build() {
                return new SystemPartsPart(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
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
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
     */
    public static class System extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Offset")
        private Long offset;

        @com.aliyun.core.annotation.NameInMap("Parts")
        private SystemParts parts;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private System(Builder builder) {
            this.offset = builder.offset;
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
         * @return offset
         */
        public Long getOffset() {
            return this.offset;
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
            private Long offset; 
            private SystemParts parts; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(System model) {
                this.offset = model.offset;
                this.parts = model.parts;
                this.size = model.size;
            } 

            /**
             * <p>The start offset of the first partition of the system disk. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder offset(Long offset) {
                this.offset = offset;
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
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
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
             * <p>The list of data disk information.</p>
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
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
     */
    public static class SystemDiskPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanBlock")
        private Boolean canBlock;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("Need")
        private Boolean need;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        private SystemDiskPart(Builder builder) {
            this.canBlock = builder.canBlock;
            this.device = builder.device;
            this.need = builder.need;
            this.path = builder.path;
            this.sizeBytes = builder.sizeBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDiskPart create() {
            return builder().build();
        }

        /**
         * @return canBlock
         */
        public Boolean getCanBlock() {
            return this.canBlock;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return need
         */
        public Boolean getNeed() {
            return this.need;
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
            private Boolean canBlock; 
            private String device; 
            private Boolean need; 
            private String path; 
            private Long sizeBytes; 

            private Builder() {
            } 

            private Builder(SystemDiskPart model) {
                this.canBlock = model.canBlock;
                this.device = model.device;
                this.need = model.need;
                this.path = model.path;
                this.sizeBytes = model.sizeBytes;
            } 

            /**
             * <p>Indicates whether block replication is enabled for the system disk partition.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canBlock(Boolean canBlock) {
                this.canBlock = canBlock;
                return this;
            }

            /**
             * <p>The device ID of the system disk partition.</p>
             * 
             * <strong>example:</strong>
             * <p>0_0</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>Indicates whether the system disk partition must be selected.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder need(Boolean need) {
                this.need = need;
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
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
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
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
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
             * <p>The key of tag N that is attached to the SMC resource. Valid values of N: 1 to 20.</p>
             * <p>You cannot specify an empty string as a tag key. The tag key can be up to 64 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N that is attached to the SMC resource. Valid values of N: 1 to 20.</p>
             * <p>The tag key can be an empty string. The tag value can be up to 64 characters in length and cannot contain http:// or https://.</p>
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
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
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
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
     */
    public static class SourceServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DataDisks")
        private DataDisks dataDisks;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private Disks disks;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("HeartbeatRate")
        private Integer heartbeatRate;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("KernelLevel")
        private Integer kernelLevel;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ReplicationDriver")
        private String replicationDriver;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("StatusInfo")
        private String statusInfo;

        @com.aliyun.core.annotation.NameInMap("SystemDiskParts")
        private SystemDiskParts systemDiskParts;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("SystemInfo")
        private String systemInfo;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("WorkgroupId")
        private String workgroupId;

        private SourceServer(Builder builder) {
            this.agentVersion = builder.agentVersion;
            this.architecture = builder.architecture;
            this.creationTime = builder.creationTime;
            this.dataDisks = builder.dataDisks;
            this.description = builder.description;
            this.disks = builder.disks;
            this.errorCode = builder.errorCode;
            this.heartbeatRate = builder.heartbeatRate;
            this.jobId = builder.jobId;
            this.kernelLevel = builder.kernelLevel;
            this.name = builder.name;
            this.platform = builder.platform;
            this.replicationDriver = builder.replicationDriver;
            this.resourceGroupId = builder.resourceGroupId;
            this.sourceId = builder.sourceId;
            this.state = builder.state;
            this.statusInfo = builder.statusInfo;
            this.systemDiskParts = builder.systemDiskParts;
            this.systemDiskSize = builder.systemDiskSize;
            this.systemInfo = builder.systemInfo;
            this.tags = builder.tags;
            this.workgroupId = builder.workgroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceServer create() {
            return builder().build();
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
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
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return heartbeatRate
         */
        public Integer getHeartbeatRate() {
            return this.heartbeatRate;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return kernelLevel
         */
        public Integer getKernelLevel() {
            return this.kernelLevel;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return replicationDriver
         */
        public String getReplicationDriver() {
            return this.replicationDriver;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
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
         * @return systemInfo
         */
        public String getSystemInfo() {
            return this.systemInfo;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return workgroupId
         */
        public String getWorkgroupId() {
            return this.workgroupId;
        }

        public static final class Builder {
            private String agentVersion; 
            private String architecture; 
            private String creationTime; 
            private DataDisks dataDisks; 
            private String description; 
            private Disks disks; 
            private String errorCode; 
            private Integer heartbeatRate; 
            private String jobId; 
            private Integer kernelLevel; 
            private String name; 
            private String platform; 
            private String replicationDriver; 
            private String resourceGroupId; 
            private String sourceId; 
            private String state; 
            private String statusInfo; 
            private SystemDiskParts systemDiskParts; 
            private Integer systemDiskSize; 
            private String systemInfo; 
            private Tags tags; 
            private String workgroupId; 

            private Builder() {
            } 

            private Builder(SourceServer model) {
                this.agentVersion = model.agentVersion;
                this.architecture = model.architecture;
                this.creationTime = model.creationTime;
                this.dataDisks = model.dataDisks;
                this.description = model.description;
                this.disks = model.disks;
                this.errorCode = model.errorCode;
                this.heartbeatRate = model.heartbeatRate;
                this.jobId = model.jobId;
                this.kernelLevel = model.kernelLevel;
                this.name = model.name;
                this.platform = model.platform;
                this.replicationDriver = model.replicationDriver;
                this.resourceGroupId = model.resourceGroupId;
                this.sourceId = model.sourceId;
                this.state = model.state;
                this.statusInfo = model.statusInfo;
                this.systemDiskParts = model.systemDiskParts;
                this.systemDiskSize = model.systemDiskSize;
                this.systemInfo = model.systemInfo;
                this.tags = model.tags;
                this.workgroupId = model.workgroupId;
            } 

            /**
             * <p>The version number of the SMC client.</p>
             * 
             * <strong>example:</strong>
             * <p>1.5.2.3</p>
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>The system architecture of the migration source.</p>
             * 
             * <strong>example:</strong>
             * <p>x86_64</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>The time when the migration source was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-27T02:58:09Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The data disks on the migration source.</p>
             */
            public Builder dataDisks(DataDisks dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * <p>The description of the migration source.</p>
             * 
             * <strong>example:</strong>
             * <p>Server Source Imported By GotoAliyun.</p>
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
             * <p>The error code of the migration source.</p>
             * 
             * <strong>example:</strong>
             * <p>SourceServer.Offline</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The interval at which heartbeats are sent from the SMC client. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder heartbeatRate(Integer heartbeatRate) {
                this.heartbeatRate = heartbeatRate;
                return this;
            }

            /**
             * <p>The ID of the last migration job.</p>
             * 
             * <strong>example:</strong>
             * <p>j-bp19vlwm0tyigbmj****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The kernel level of the migration source.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder kernelLevel(Integer kernelLevel) {
                this.kernelLevel = kernelLevel;
                return this;
            }

            /**
             * <p>The name of the migration source.</p>
             * 
             * <strong>example:</strong>
             * <p>SourceServerName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The operating system of the migration source.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenSUSE</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The replication driver used for migration. Default value: SMT.</p>
             * 
             * <strong>example:</strong>
             * <p>SMT</p>
             */
            public Builder replicationDriver(String replicationDriver) {
                this.replicationDriver = replicationDriver;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmw3ty5y7****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the migration source.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp1e2fsl57knvuug****</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The state of the migration source.</p>
             * 
             * <strong>example:</strong>
             * <p>InUse</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The status information of the migration source. This parameter is returned if the migration source is in the Unavailable state. The value of this parameter consists of key-value pairs in the JSON format. Sample keys:</p>
             * <pre><code>error_code: The error code.
             * error_msg: the error message.
             * </code></pre>
             * 
             * <strong>example:</strong>
             * <p>{&quot;error_code&quot;: &quot;S1&quot;, &quot;error_msg&quot;: &quot;Rsync not found. Please install rsync.&quot;}</p>
             */
            public Builder statusInfo(String statusInfo) {
                this.statusInfo = statusInfo;
                return this;
            }

            /**
             * <p>The information about the system disk partition.</p>
             */
            public Builder systemDiskParts(SystemDiskParts systemDiskParts) {
                this.systemDiskParts = systemDiskParts;
                return this;
            }

            /**
             * <p>The system disk size of the migration source. Unit: GiB</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The system information of the migration source. The parameter must be specified as key-value pairs in the JSON format. The key-value pairs are extensible and have fixed keys. Maximum value: 1 KB. Example:</p>
             * <pre><code>agent_mode: the running mode.
             * agent_type: the type of the run.
             * client_type: the type of the client.
             * hostname : the hostname.
             * ipv4:IPv4 address
             * ipv6: IPv6 address
             * cores: the number of CPU cores.
             * cpu_usage: the CPU utilization.
             * memory: the memory size.
             * memory_usage: the memory usage.
             * </code></pre>
             * 
             * <strong>example:</strong>
             * <p>{&quot;agent_mode&quot;:&quot;daemon&quot;,&quot;agent_type&quot;:&quot;aliyun&quot;,&quot;client_type&quot;:&quot;&quot;,&quot;cores&quot;:&quot;2&quot;,&quot;cpu_usage&quot;:&quot;0.00&quot;,&quot;hostname&quot;:&quot;ixxxxxxxxxx&quot;,&quot;ipv4&quot;:&quot;10.0.0.1&quot;,&quot;memory&quot;:&quot;8.00&quot;,&quot;memory_usage&quot;:&quot;3.61&quot;}</p>
             */
            public Builder systemInfo(String systemInfo) {
                this.systemInfo = systemInfo;
                return this;
            }

            /**
             * <p>The tag details.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The workgroup ID.</p>
             * 
             * <strong>example:</strong>
             * <p>w-bp1ja22kdqphehlj****</p>
             */
            public Builder workgroupId(String workgroupId) {
                this.workgroupId = workgroupId;
                return this;
            }

            public SourceServer build() {
                return new SourceServer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersResponseBody</p>
     */
    public static class SourceServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceServer")
        private java.util.List<SourceServer> sourceServer;

        private SourceServers(Builder builder) {
            this.sourceServer = builder.sourceServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceServers create() {
            return builder().build();
        }

        /**
         * @return sourceServer
         */
        public java.util.List<SourceServer> getSourceServer() {
            return this.sourceServer;
        }

        public static final class Builder {
            private java.util.List<SourceServer> sourceServer; 

            private Builder() {
            } 

            private Builder(SourceServers model) {
                this.sourceServer = model.sourceServer;
            } 

            /**
             * SourceServer.
             */
            public Builder sourceServer(java.util.List<SourceServer> sourceServer) {
                this.sourceServer = sourceServer;
                return this;
            }

            public SourceServers build() {
                return new SourceServers(this);
            } 

        } 

    }
}
