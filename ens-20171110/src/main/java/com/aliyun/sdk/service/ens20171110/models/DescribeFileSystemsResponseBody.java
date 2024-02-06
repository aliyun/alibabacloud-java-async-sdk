// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileSystemsResponseBody</p>
 */
public class DescribeFileSystemsResponseBody extends TeaModel {
    @NameInMap("FileSystems")
    private java.util.List < FileSystems> fileSystems;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return fileSystems
     */
    public java.util.List < FileSystems> getFileSystems() {
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
        private java.util.List < FileSystems> fileSystems; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the file systems.
         */
        public Builder fileSystems(java.util.List < FileSystems> fileSystems) {
            this.fileSystems = fileSystems;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFileSystemsResponseBody build() {
            return new DescribeFileSystemsResponseBody(this);
        } 

    } 

    public static class MountTargets extends TeaModel {
        @NameInMap("MountTargetDomain")
        private String mountTargetDomain;

        @NameInMap("MountTargetName")
        private String mountTargetName;

        @NameInMap("NetWorkId")
        private String netWorkId;

        @NameInMap("Status")
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

            /**
             * The path of the mount target.
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * The name of the mount target.
             */
            public Builder mountTargetName(String mountTargetName) {
                this.mountTargetName = mountTargetName;
                return this;
            }

            /**
             * The ID of the network.
             */
            public Builder netWorkId(String netWorkId) {
                this.netWorkId = netWorkId;
                return this;
            }

            /**
             * The status of the mount target. Valid values:
             * <p>
             * 
             * *   active: The mount target is available.
             * *   inactive: The mount target is unavailable.
             * *   pending: The task is running.
             * *   deleting: The mount target is being deleted.
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
    public static class FileSystems extends TeaModel {
        @NameInMap("Capacity")
        private Long capacity;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("FileSystemName")
        private String fileSystemName;

        @NameInMap("MeteredSize")
        private Long meteredSize;

        @NameInMap("MountTargets")
        private java.util.List < MountTargets> mountTargets;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageType")
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
        public java.util.List < MountTargets> getMountTargets() {
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
            private java.util.List < MountTargets> mountTargets; 
            private String payType; 
            private String protocolType; 
            private String status; 
            private String storageType; 

            /**
             * The capacity of the file system. Unit: MiB.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The time when the file system was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The ID of the file system.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * The name of the file system.
             */
            public Builder fileSystemName(String fileSystemName) {
                this.fileSystemName = fileSystemName;
                return this;
            }

            /**
             * The storage usage of the file system. The value of this parameter is the maximum storage usage of the file system over the last hour. Unit: bytes.
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * The information about mount targets.
             */
            public Builder mountTargets(java.util.List < MountTargets> mountTargets) {
                this.mountTargets = mountTargets;
                return this;
            }

            /**
             * The billing method. PostPaid is returned. PostPaid indicates the pay-as-you-go billing method.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The protocol type of the file system. Valid values:
             * <p>
             * 
             * *   NFS: Network File System (NFS)
             * *   SMB: Server Message Block (SMB)
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The status of the file system. Valid values:
             * <p>
             * 
             * *   pending: The file system is being created or modified.
             * *   running: The file system is available. Before you create a mount target for the file system, make sure that the file system is in the running state.
             * *   stopped: The file system is unavailable.
             * *   extending: The file system is being scaled out.
             * *   stopping: The file system is being disabled.
             * *   deleting: The file system is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The storage type. Valid values:
             * <p>
             * 
             * *   capacity: Capacity NAS file systems
             * *   performance: Performance NAS file systems
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
