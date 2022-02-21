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
         * FileSystemList.
         */
        public Builder fileSystemList(FileSystemList fileSystemList) {
            this.fileSystemList = fileSystemList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
             * AccessGroup.
             */
            public Builder accessGroup(String accessGroup) {
                this.accessGroup = accessGroup;
                return this;
            }

            /**
             * MountTargetDomain.
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswId.
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
             * PackageId.
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

            /**
             * BandWidth.
             */
            public Builder bandWidth(Integer bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * Capacity.
             */
            public Builder capacity(Integer capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Destription.
             */
            public Builder destription(String destription) {
                this.destription = destription;
                return this;
            }

            /**
             * EncryptType.
             */
            public Builder encryptType(Integer encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * FileSystemType.
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * MeteredSize.
             */
            public Builder meteredSize(Integer meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * MountTargetList.
             */
            public Builder mountTargetList(MountTargetList mountTargetList) {
                this.mountTargetList = mountTargetList;
                return this;
            }

            /**
             * PackageList.
             */
            public Builder packageList(PackageList packageList) {
                this.packageList = packageList;
                return this;
            }

            /**
             * ProtocolType.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StorageType.
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
