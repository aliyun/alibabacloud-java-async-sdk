// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileSystemWithMountTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileSystemWithMountTargetsResponseBody</p>
 */
public class ListFileSystemWithMountTargetsResponseBody extends TeaModel {
    @NameInMap("FileSystemList")
    private FileSystemList fileSystemList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListFileSystemWithMountTargetsResponseBody(Builder builder) {
        this.fileSystemList = builder.fileSystemList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileSystemWithMountTargetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileSystemList
     */
    public FileSystemList getFileSystemList() {
        return this.fileSystemList;
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
        private FileSystemList fileSystemList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of file systems.
         */
        public Builder fileSystemList(FileSystemList fileSystemList) {
            this.fileSystemList = fileSystemList;
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
         * The number of entries returned per page. Valid values: 1 to 50. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFileSystemWithMountTargetsResponseBody build() {
            return new ListFileSystemWithMountTargetsResponseBody(this);
        } 

    } 

    public static class MountTargets extends TeaModel {
        @NameInMap("AccessGroup")
        private String accessGroup;

        @NameInMap("MountTargetDomain")
        private String mountTargetDomain;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswId")
        private String vswId;

        private MountTargets(Builder builder) {
            this.accessGroup = builder.accessGroup;
            this.mountTargetDomain = builder.mountTargetDomain;
            this.networkType = builder.networkType;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.vswId = builder.vswId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountTargets create() {
            return builder().build();
        }

        /**
         * @return accessGroup
         */
        public String getAccessGroup() {
            return this.accessGroup;
        }

        /**
         * @return mountTargetDomain
         */
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswId
         */
        public String getVswId() {
            return this.vswId;
        }

        public static final class Builder {
            private String accessGroup; 
            private String mountTargetDomain; 
            private String networkType; 
            private String status; 
            private String vpcId; 
            private String vswId; 

            /**
             * Specifies whether to use the user default permission group.
             * <p>
             * 
             * Valid values:
             * 
             * *   true: ueses the default permission group. If you use the default permission group, access from all IP addresses are allowed. The default permission group and the permission rules in the default permission group cannot be deleted.
             * *   false: does not use the default permission group.
             */
            public Builder accessGroup(String accessGroup) {
                this.accessGroup = accessGroup;
                return this;
            }

            /**
             * The domain where the mount target resides.
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * The network type of the cluster. Valid values:
             * <p>
             * 
             * *   vpc: Virtual Private Cloud (VPC)
             * *   classic: the classic network
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The status of the mount target. Valid values:
             * <p>
             * 
             * *   Active: The mount target is available.
             * *   Inactive: The mount target is unavailable.
             * *   Pending: The mount target is being created or modified.
             * *   Deleting: The mount target is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            public MountTargets build() {
                return new MountTargets(this);
            } 

        } 

    }
    public static class MountTargetList extends TeaModel {
        @NameInMap("MountTargets")
        private java.util.List < MountTargets> mountTargets;

        private MountTargetList(Builder builder) {
            this.mountTargets = builder.mountTargets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountTargetList create() {
            return builder().build();
        }

        /**
         * @return mountTargets
         */
        public java.util.List < MountTargets> getMountTargets() {
            return this.mountTargets;
        }

        public static final class Builder {
            private java.util.List < MountTargets> mountTargets; 

            /**
             * MountTargets.
             */
            public Builder mountTargets(java.util.List < MountTargets> mountTargets) {
                this.mountTargets = mountTargets;
                return this;
            }

            public MountTargetList build() {
                return new MountTargetList(this);
            } 

        } 

    }
    public static class Packages extends TeaModel {
        @NameInMap("PackageId")
        private String packageId;

        private Packages(Builder builder) {
            this.packageId = builder.packageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Packages create() {
            return builder().build();
        }

        /**
         * @return packageId
         */
        public String getPackageId() {
            return this.packageId;
        }

        public static final class Builder {
            private String packageId; 

            /**
             * The ID of the storage plan.
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            public Packages build() {
                return new Packages(this);
            } 

        } 

    }
    public static class PackageList extends TeaModel {
        @NameInMap("Packages")
        private java.util.List < Packages> packages;

        private PackageList(Builder builder) {
            this.packages = builder.packages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageList create() {
            return builder().build();
        }

        /**
         * @return packages
         */
        public java.util.List < Packages> getPackages() {
            return this.packages;
        }

        public static final class Builder {
            private java.util.List < Packages> packages; 

            /**
             * Packages.
             */
            public Builder packages(java.util.List < Packages> packages) {
                this.packages = packages;
                return this;
            }

            public PackageList build() {
                return new PackageList(this);
            } 

        } 

    }
    public static class FileSystems extends TeaModel {
        @NameInMap("BandWidth")
        private Integer bandWidth;

        @NameInMap("Capacity")
        private Integer capacity;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Destription")
        private String destription;

        @NameInMap("EncryptType")
        private Integer encryptType;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("FileSystemType")
        private String fileSystemType;

        @NameInMap("MeteredSize")
        private Integer meteredSize;

        @NameInMap("MountTargetList")
        private MountTargetList mountTargetList;

        @NameInMap("PackageList")
        private PackageList packageList;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("VpcId")
        private String vpcId;

        private FileSystems(Builder builder) {
            this.bandWidth = builder.bandWidth;
            this.capacity = builder.capacity;
            this.createTime = builder.createTime;
            this.destription = builder.destription;
            this.encryptType = builder.encryptType;
            this.fileSystemId = builder.fileSystemId;
            this.fileSystemType = builder.fileSystemType;
            this.meteredSize = builder.meteredSize;
            this.mountTargetList = builder.mountTargetList;
            this.packageList = builder.packageList;
            this.protocolType = builder.protocolType;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.storageType = builder.storageType;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystems create() {
            return builder().build();
        }

        /**
         * @return bandWidth
         */
        public Integer getBandWidth() {
            return this.bandWidth;
        }

        /**
         * @return capacity
         */
        public Integer getCapacity() {
            return this.capacity;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return destription
         */
        public String getDestription() {
            return this.destription;
        }

        /**
         * @return encryptType
         */
        public Integer getEncryptType() {
            return this.encryptType;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return fileSystemType
         */
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        /**
         * @return meteredSize
         */
        public Integer getMeteredSize() {
            return this.meteredSize;
        }

        /**
         * @return mountTargetList
         */
        public MountTargetList getMountTargetList() {
            return this.mountTargetList;
        }

        /**
         * @return packageList
         */
        public PackageList getPackageList() {
            return this.packageList;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Integer bandWidth; 
            private Integer capacity; 
            private String createTime; 
            private String destription; 
            private Integer encryptType; 
            private String fileSystemId; 
            private String fileSystemType; 
            private Integer meteredSize; 
            private MountTargetList mountTargetList; 
            private PackageList packageList; 
            private String protocolType; 
            private String regionId; 
            private String status; 
            private String storageType; 
            private String vpcId; 

            /**
             * The bandwidth of the file system. Unit: MB/s.
             */
            public Builder bandWidth(Integer bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * The capacity of the file system. Unit: GiB.
             */
            public Builder capacity(Integer capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The time at which the file system is created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the file system.
             */
            public Builder destription(String destription) {
                this.destription = destription;
                return this;
            }

            /**
             * Specifies whether to encrypt the data in the file system.
             * <p>
             * 
             * You can use keys that are managed by Key Management Service (KMS) to encrypt the data that is stored in a file system. When you read and write the encrypted data, the data is automatically decrypted.
             * 
             * Valid values:
             * 
             * *   0 (default): The data in the file system is not encrypted.
             * *   1: NAS-managed keys are used to encrypt the data in the file system. This value is valid only if the FileSystemType parameter is set to standard or extreme.
             * *   2: KMS-managed keys are used to encrypt the data in the file system. This value is valid only if the FileSystemType parameter is set to extreme.
             */
            public Builder encryptType(Integer encryptType) {
                this.encryptType = encryptType;
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
             * The type of the file system. Valid values:
             * <p>
             * 
             * *   standard: general-purpose NAS. extreme: Extreme NAS.
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * The used storage of the NAS file system. Unit: byte.
             */
            public Builder meteredSize(Integer meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * The mount targets.
             */
            public Builder mountTargetList(MountTargetList mountTargetList) {
                this.mountTargetList = mountTargetList;
                return this;
            }

            /**
             * The list of storage plans.
             */
            public Builder packageList(PackageList packageList) {
                this.packageList = packageList;
                return this;
            }

            /**
             * The protocol type of the file system. Valid values:
             * <p>
             * 
             * *   NFS- SMB
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the file system. Valid values:
             * <p>
             * 
             * *   Pending: The file system is processing a task.
             * *   Running: The file system is available.
             * *   Stopped: The file system is unavailable.
             * *   Extending: The file system is being scaled out.
             * *   Stopping: The file system is being disabled.
             * *   Deleting: The file system is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The storage type of the file system.
             * <p>
             * 
             * *   Valid values when FileSystemType is set to standard: Capacity and Performance. Valid values when FileSystemType is set to extreme: standard and advance.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * The VPC ID of the node.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public FileSystems build() {
                return new FileSystems(this);
            } 

        } 

    }
    public static class FileSystemList extends TeaModel {
        @NameInMap("FileSystems")
        private java.util.List < FileSystems> fileSystems;

        private FileSystemList(Builder builder) {
            this.fileSystems = builder.fileSystems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystemList create() {
            return builder().build();
        }

        /**
         * @return fileSystems
         */
        public java.util.List < FileSystems> getFileSystems() {
            return this.fileSystems;
        }

        public static final class Builder {
            private java.util.List < FileSystems> fileSystems; 

            /**
             * FileSystems.
             */
            public Builder fileSystems(java.util.List < FileSystems> fileSystems) {
                this.fileSystems = fileSystems;
                return this;
            }

            public FileSystemList build() {
                return new FileSystemList(this);
            } 

        } 

    }
}
