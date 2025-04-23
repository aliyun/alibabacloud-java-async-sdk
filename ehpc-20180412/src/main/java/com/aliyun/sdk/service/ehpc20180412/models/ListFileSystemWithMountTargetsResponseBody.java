// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListFileSystemWithMountTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileSystemWithMountTargetsResponseBody</p>
 */
public class ListFileSystemWithMountTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileSystemList")
    private FileSystemList fileSystemList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListFileSystemWithMountTargetsResponseBody model) {
            this.fileSystemList = model.fileSystemList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The queried file systems.</p>
         */
        public Builder fileSystemList(FileSystemList fileSystemList) {
            this.fileSystemList = fileSystemList;
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
         * <p>The number of entries returned per page. Valid values: 1 to 50. Default value: 10.</p>
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
         * <p>25638B77-2F19-5DC5-B578-7790CE92052B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFileSystemWithMountTargetsResponseBody build() {
            return new ListFileSystemWithMountTargetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFileSystemWithMountTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileSystemWithMountTargetsResponseBody</p>
     */
    public static class MountTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessGroup")
        private String accessGroup;

        @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
        private String mountTargetDomain;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswId")
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

            private Builder() {
            } 

            private Builder(MountTargets model) {
                this.accessGroup = model.accessGroup;
                this.mountTargetDomain = model.mountTargetDomain;
                this.networkType = model.networkType;
                this.status = model.status;
                this.vpcId = model.vpcId;
                this.vswId = model.vswId;
            } 

            /**
             * <p>Indicates whether the permission group is the default permission group of the user.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: The permission group is the default permission group. In this case, all IP addresses are allowed to access the permission group, and the user cannot delete the permission group and permission rules in the permission group.</li>
             * <li>false: The permission group is not the default permission group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT_VPC_GROUP_NAME</p>
             */
            public Builder accessGroup(String accessGroup) {
                this.accessGroup = accessGroup;
                return this;
            }

            /**
             * <p>The domain in which the mount target resides.</p>
             * 
             * <strong>example:</strong>
             * <p>088b****-lj2.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * <p>The network type. Valid values:</p>
             * <ul>
             * <li>vpc</li>
             * <li>classic</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The status of the mount target. Valid values:</p>
             * <ul>
             * <li>Active: The mount target is available.</li>
             * <li>Inactive: The mount target is unavailable.</li>
             * <li>Pending: The mount target is being created or modified.</li>
             * <li>Deleting: The mount target is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbvb34rtyh6xb3zrehs1****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-8vb34rtyh6xb3zrehs1****</p>
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
    /**
     * 
     * {@link ListFileSystemWithMountTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileSystemWithMountTargetsResponseBody</p>
     */
    public static class MountTargetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountTargets")
        private java.util.List<MountTargets> mountTargets;

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
        public java.util.List<MountTargets> getMountTargets() {
            return this.mountTargets;
        }

        public static final class Builder {
            private java.util.List<MountTargets> mountTargets; 

            private Builder() {
            } 

            private Builder(MountTargetList model) {
                this.mountTargets = model.mountTargets;
            } 

            /**
             * MountTargets.
             */
            public Builder mountTargets(java.util.List<MountTargets> mountTargets) {
                this.mountTargets = mountTargets;
                return this;
            }

            public MountTargetList build() {
                return new MountTargetList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFileSystemWithMountTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileSystemWithMountTargetsResponseBody</p>
     */
    public static class Packages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PackageId")
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

            private Builder() {
            } 

            private Builder(Packages model) {
                this.packageId = model.packageId;
            } 

            /**
             * <p>The ID of the storage plan.</p>
             * 
             * <strong>example:</strong>
             * <p>naspackage-0be9c4b624-37****</p>
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
    /**
     * 
     * {@link ListFileSystemWithMountTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileSystemWithMountTargetsResponseBody</p>
     */
    public static class PackageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Packages")
        private java.util.List<Packages> packages;

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
        public java.util.List<Packages> getPackages() {
            return this.packages;
        }

        public static final class Builder {
            private java.util.List<Packages> packages; 

            private Builder() {
            } 

            private Builder(PackageList model) {
                this.packages = model.packages;
            } 

            /**
             * Packages.
             */
            public Builder packages(java.util.List<Packages> packages) {
                this.packages = packages;
                return this;
            }

            public PackageList build() {
                return new PackageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFileSystemWithMountTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileSystemWithMountTargetsResponseBody</p>
     */
    public static class FileSystems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandWidth")
        private Integer bandWidth;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Integer capacity;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Destription")
        private String destription;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private Integer encryptType;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("FileSystemType")
        private String fileSystemType;

        @com.aliyun.core.annotation.NameInMap("MeteredSize")
        private Integer meteredSize;

        @com.aliyun.core.annotation.NameInMap("MountTargetList")
        private MountTargetList mountTargetList;

        @com.aliyun.core.annotation.NameInMap("PackageList")
        private PackageList packageList;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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

            private Builder() {
            } 

            private Builder(FileSystems model) {
                this.bandWidth = model.bandWidth;
                this.capacity = model.capacity;
                this.createTime = model.createTime;
                this.destription = model.destription;
                this.encryptType = model.encryptType;
                this.fileSystemId = model.fileSystemId;
                this.fileSystemType = model.fileSystemType;
                this.meteredSize = model.meteredSize;
                this.mountTargetList = model.mountTargetList;
                this.packageList = model.packageList;
                this.protocolType = model.protocolType;
                this.regionId = model.regionId;
                this.status = model.status;
                this.storageType = model.storageType;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The bandwidth of the file system. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder bandWidth(Integer bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * <p>The capacity of the file system. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>5120</p>
             */
            public Builder capacity(Integer capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The time when the file system was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-26 16:36:27</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>FilesDescription</p>
             */
            public Builder destription(String destription) {
                this.destription = destription;
                return this;
            }

            /**
             * <p>Indicates whether data in the file system is encrypted.</p>
             * <p>You can use keys that are managed by Key Management Service (KMS) to encrypt the data in a file system. When you read and write the encrypted data, the data is automatically decrypted.</p>
             * <p>Default value: 0. Valid values:</p>
             * <ul>
             * <li>0: The data in the file system is not encrypted.</li>
             * <li>1: The data in the file system is encrypted by using a NAS-managed key. This parameter is valid if FileSystemType is set to standard or extreme.</li>
             * <li>2: The data in the file system is encrypted by using a KMS-managed key. This parameter is valid only if FileSystemType is set to extreme.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder encryptType(Integer encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>088b****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The type of the file system. Valid value:</p>
             * <ul>
             * <li>standard: general-purpose network-attached storage (NAS) file systems.</li>
             * <li>extreme: extreme NAS file systems.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * <p>The used capacity of the NAS file system. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1216816455</p>
             */
            public Builder meteredSize(Integer meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * <p>The list of mount targets.</p>
             */
            public Builder mountTargetList(MountTargetList mountTargetList) {
                this.mountTargetList = mountTargetList;
                return this;
            }

            /**
             * <p>The list of storage plans.</p>
             */
            public Builder packageList(PackageList packageList) {
                this.packageList = packageList;
                return this;
            }

            /**
             * <p>The protocol type of the file system. Valid values:</p>
             * <ul>
             * <li>NFS- SMB</li>
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
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the file system. Valid values:</p>
             * <ul>
             * <li>Pending: The file system is being created or modified.</li>
             * <li>Running: The file system is available.</li>
             * <li>Stopped: The file system is unavailable.</li>
             * <li>Extending: The file system is being scaled up.</li>
             * <li>Stopping: The file system is being disabled.</li>
             * <li>Deleting: The file system is being deleted.</li>
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
             * <p>The storage type of the file system.</p>
             * <ul>
             * <li>Valid values if FileSystemType is set to standard: Capacity and Performance.</li>
             * <li>Valid values if FileSystemType is set to extreme: standard and advance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Performance</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp132kgui8n0targbn1cm</p>
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
    /**
     * 
     * {@link ListFileSystemWithMountTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileSystemWithMountTargetsResponseBody</p>
     */
    public static class FileSystemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystems")
        private java.util.List<FileSystems> fileSystems;

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
        public java.util.List<FileSystems> getFileSystems() {
            return this.fileSystems;
        }

        public static final class Builder {
            private java.util.List<FileSystems> fileSystems; 

            private Builder() {
            } 

            private Builder(FileSystemList model) {
                this.fileSystems = model.fileSystems;
            } 

            /**
             * FileSystems.
             */
            public Builder fileSystems(java.util.List<FileSystems> fileSystems) {
                this.fileSystems = fileSystems;
                return this;
            }

            public FileSystemList build() {
                return new FileSystemList(this);
            } 

        } 

    }
}
