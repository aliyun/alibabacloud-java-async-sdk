// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCpfsFileSystemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCpfsFileSystemsResponseBody</p>
 */
public class ListCpfsFileSystemsResponseBody extends TeaModel {
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

    private ListCpfsFileSystemsResponseBody(Builder builder) {
        this.fileSystemList = builder.fileSystemList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCpfsFileSystemsResponseBody create() {
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
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on the current page.
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
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCpfsFileSystemsResponseBody build() {
            return new ListCpfsFileSystemsResponseBody(this);
        } 

    } 

    public static class MountTargets extends TeaModel {
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
            private String mountTargetDomain; 
            private String networkType; 
            private String status; 
            private String vpcId; 
            private String vswId; 

            /**
             * The domain where the mount target resides.
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * The network type.
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
             * *   Pending: The mount target is being mounted.
             * *   Deleting: The mount target is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The vSwitch ID of the instance.
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
    public static class FileSystems extends TeaModel {
        @NameInMap("Capacity")
        private String capacity;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Destription")
        private String destription;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("MountTargetList")
        private MountTargetList mountTargetList;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ZoneId")
        private String zoneId;

        private FileSystems(Builder builder) {
            this.capacity = builder.capacity;
            this.createTime = builder.createTime;
            this.destription = builder.destription;
            this.fileSystemId = builder.fileSystemId;
            this.mountTargetList = builder.mountTargetList;
            this.protocolType = builder.protocolType;
            this.regionId = builder.regionId;
            this.zoneId = builder.zoneId;
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
        public String getCapacity() {
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
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return mountTargetList
         */
        public MountTargetList getMountTargetList() {
            return this.mountTargetList;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String capacity; 
            private String createTime; 
            private String destription; 
            private String fileSystemId; 
            private MountTargetList mountTargetList; 
            private String protocolType; 
            private String regionId; 
            private String zoneId; 

            /**
             * The capacity of the file system. Unit: GiB.
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The time when the file system was created.
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
             * The ID of the file system.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
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
             * The protocol type that is applied to the mounted file system. Valid values:
             * <p>
             * 
             * *   NFS
             * *   SMB
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
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
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
