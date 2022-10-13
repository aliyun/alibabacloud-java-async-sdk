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
         * 文件系统信息集合。
         */
        public Builder fileSystems(java.util.List < FileSystems> fileSystems) {
            this.fileSystems = fileSystems;
            return this;
        }

        /**
         * 页码。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 单页行数。
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
         * 总数。
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
             * 挂载点路径。
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * 挂载点名称。
             */
            public Builder mountTargetName(String mountTargetName) {
                this.mountTargetName = mountTargetName;
                return this;
            }

            /**
             * 网络ID。
             */
            public Builder netWorkId(String netWorkId) {
                this.netWorkId = netWorkId;
                return this;
            }

            /**
             * 挂载点状态。
             * <p>
             * 包括：
             * active：可用
             * inactive：不可用
             * pending：任务处理中
             * deleting：删除中
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
             * 容量。
             * <p>
             * 单位：GIB。
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * 文件系统创建时间。
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * 地域ID。
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * 文件系统ID。
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * 文件系统名称。
             */
            public Builder fileSystemName(String fileSystemName) {
                this.fileSystemName = fileSystemName;
                return this;
            }

            /**
             * 文件系统的使用量。
             * <p>
             * 非实时使用量，为上一小时最大使用量，单位：Byte。
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * 挂载点信息集合
             */
            public Builder mountTargets(java.util.List < MountTargets> mountTargets) {
                this.mountTargets = mountTargets;
                return this;
            }

            /**
             * 付费类型
             * <p>
             * PostPaid：后付费
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * 文件系统协议类型。
             * <p>
             * 包括：
             * nfs：nfs文件协议
             * smb：smb文件协议
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * 文件系统状态
             * <p>
             * pending：当前文件系统正在处理任务中。
             * running：当前文件系统可用，当状态为running时才可以进行后续操作（例如：创建挂载点等）。
             * stopped：当前文件系统不可用。
             * extending：当前文件系统扩容中。
             * stopping：当前文件系统停机中。
             * deleting：当前文件系统删除中。
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 存储类型
             * <p>
             * capacity：容量型
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
