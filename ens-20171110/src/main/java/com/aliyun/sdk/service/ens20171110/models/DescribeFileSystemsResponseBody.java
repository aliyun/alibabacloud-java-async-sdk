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
 * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileSystemsResponseBody</p>
 */
public class DescribeFileSystemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileSystems")
    private java.util.List<FileSystems> fileSystems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeFileSystemsResponseBody(Builder builder) {
        this.fileSystems = builder.fileSystems;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileSystemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystems
     */
    public java.util.List<FileSystems> getFileSystems() {
        return this.fileSystems;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<FileSystems> fileSystems; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeFileSystemsResponseBody model) {
            this.fileSystems = model.fileSystems;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the file systems.</p>
         */
        public Builder fileSystems(java.util.List<FileSystems> fileSystems) {
            this.fileSystems = fileSystems;
            return this;
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>762DD527-358B-1E48-8005-CCE3ED4EB9E0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFileSystemsResponseBody build() {
            return new DescribeFileSystemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class MountTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
        private String mountTargetDomain;

        @com.aliyun.core.annotation.NameInMap("MountTargetName")
        private String mountTargetName;

        @com.aliyun.core.annotation.NameInMap("NetWorkId")
        private String netWorkId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private MountTargets(Builder builder) {
            this.mountTargetDomain = builder.mountTargetDomain;
            this.mountTargetName = builder.mountTargetName;
            this.netWorkId = builder.netWorkId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountTargets create() {
            return builder().build();
        }

        /**
         * @return mountTargetDomain
         */
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        /**
         * @return mountTargetName
         */
        public String getMountTargetName() {
            return this.mountTargetName;
        }

        /**
         * @return netWorkId
         */
        public String getNetWorkId() {
            return this.netWorkId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String mountTargetDomain; 
            private String mountTargetName; 
            private String netWorkId; 
            private String status; 

            private Builder() {
            } 

            private Builder(MountTargets model) {
                this.mountTargetDomain = model.mountTargetDomain;
                this.mountTargetName = model.mountTargetName;
                this.netWorkId = model.netWorkId;
                this.status = model.status;
            } 

            /**
             * <p>The path of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p><em>.</em>.<em>.</em>:/${FileSystemName}/{MountTargetName}</p>
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * <p>The name of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>target1</p>
             */
            public Builder mountTargetName(String mountTargetName) {
                this.mountTargetName = mountTargetName;
                return this;
            }

            /**
             * <p>The ID of the network.</p>
             * 
             * <strong>example:</strong>
             * <p>n-****</p>
             */
            public Builder netWorkId(String netWorkId) {
                this.netWorkId = netWorkId;
                return this;
            }

            /**
             * <p>The status of the mount target. Valid values:</p>
             * <ul>
             * <li>active: The mount target is available.</li>
             * <li>inactive: The mount target is unavailable.</li>
             * <li>pending: The task is running.</li>
             * <li>deleting: The mount target is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public MountTargets build() {
                return new MountTargets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class FileSystems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("FileSystemName")
        private String fileSystemName;

        @com.aliyun.core.annotation.NameInMap("MeteredSize")
        private Long meteredSize;

        @com.aliyun.core.annotation.NameInMap("MountTargets")
        private java.util.List<MountTargets> mountTargets;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private FileSystems(Builder builder) {
            this.capacity = builder.capacity;
            this.creationTime = builder.creationTime;
            this.ensRegionId = builder.ensRegionId;
            this.fileSystemId = builder.fileSystemId;
            this.fileSystemName = builder.fileSystemName;
            this.meteredSize = builder.meteredSize;
            this.mountTargets = builder.mountTargets;
            this.payType = builder.payType;
            this.protocolType = builder.protocolType;
            this.status = builder.status;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystems create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return fileSystemName
         */
        public String getFileSystemName() {
            return this.fileSystemName;
        }

        /**
         * @return meteredSize
         */
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        /**
         * @return mountTargets
         */
        public java.util.List<MountTargets> getMountTargets() {
            return this.mountTargets;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private Long capacity; 
            private String creationTime; 
            private String ensRegionId; 
            private String fileSystemId; 
            private String fileSystemName; 
            private Long meteredSize; 
            private java.util.List<MountTargets> mountTargets; 
            private String payType; 
            private String protocolType; 
            private String status; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(FileSystems model) {
                this.capacity = model.capacity;
                this.creationTime = model.creationTime;
                this.ensRegionId = model.ensRegionId;
                this.fileSystemId = model.fileSystemId;
                this.fileSystemName = model.fileSystemName;
                this.meteredSize = model.meteredSize;
                this.mountTargets = model.mountTargets;
                this.payType = model.payType;
                this.protocolType = model.protocolType;
                this.status = model.status;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The capacity of the file system. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The time when the file system was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-31 12:00:00</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-cmcc</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>c50f8*****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The name of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>FileSystem1</p>
             */
            public Builder fileSystemName(String fileSystemName) {
                this.fileSystemName = fileSystemName;
                return this;
            }

            /**
             * <p>The storage usage of the file system. The value of this parameter is the maximum storage usage of the file system over the last hour. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>102400</p>
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * <p>The information about mount targets.</p>
             */
            public Builder mountTargets(java.util.List<MountTargets> mountTargets) {
                this.mountTargets = mountTargets;
                return this;
            }

            /**
             * <p>The billing method. PostPaid is returned. PostPaid indicates the pay-as-you-go billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The protocol type of the file system. Valid values:</p>
             * <ul>
             * <li>NFS: Network File System (NFS)</li>
             * <li>SMB: Server Message Block (SMB)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NFS</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The status of the file system. Valid values:</p>
             * <ul>
             * <li>pending: The file system is being created or modified.</li>
             * <li>running: The file system is available. Before you create a mount target for the file system, make sure that the file system is in the running state.</li>
             * <li>stopped: The file system is unavailable.</li>
             * <li>extending: The file system is being scaled out.</li>
             * <li>stopping: The file system is being disabled.</li>
             * <li>deleting: The file system is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The storage type. Valid values:</p>
             * <ul>
             * <li>capacity: Capacity NAS file systems</li>
             * <li>performance: Performance NAS file systems</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>capacity</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public FileSystems build() {
                return new FileSystems(this);
            } 

        } 

    }
}
