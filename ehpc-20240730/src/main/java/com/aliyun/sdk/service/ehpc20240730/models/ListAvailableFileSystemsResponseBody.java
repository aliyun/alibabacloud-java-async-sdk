// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAvailableFileSystemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableFileSystemsResponseBody</p>
 */
public class ListAvailableFileSystemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileSystemList")
    private java.util.List < FileSystemList> fileSystemList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAvailableFileSystemsResponseBody(Builder builder) {
        this.fileSystemList = builder.fileSystemList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableFileSystemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileSystemList
     */
    public java.util.List < FileSystemList> getFileSystemList() {
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
        private java.util.List < FileSystemList> fileSystemList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The file systems.</p>
         */
        public Builder fileSystemList(java.util.List < FileSystemList> fileSystemList) {
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
         * <p>The number of entries per page.</p>
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
         * <p>BF4E8AB1-02A3-5ECF-87CC-3AB7BE98**</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>65</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAvailableFileSystemsResponseBody build() {
            return new ListAvailableFileSystemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAvailableFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvailableFileSystemsResponseBody</p>
     */
    public static class MountTargetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
        private String mountTargetDomain;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private MountTargetList(Builder builder) {
            this.mountTargetDomain = builder.mountTargetDomain;
            this.networkType = builder.networkType;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountTargetList create() {
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
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String mountTargetDomain; 
            private String networkType; 
            private String status; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * <p>The address of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>c0967****.cn-hangzhou.cpfs.nas.aliyuncs.com</p>
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * <p>The network type. Valid values: Valid values:</p>
             * <ul>
             * <li>vpc</li>
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
             * <p>The state of the mount target. Valid values:</p>
             * <ul>
             * <li>Active: The mount target is available.</li>
             * <li>Inactive: The mount target is unavailable.</li>
             * <li>Pending: The mount target is being mounted.</li>
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
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2ze0c41hwu7lc29ris***</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbvb34rtyh6xb3zrehs1****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public MountTargetList build() {
                return new MountTargetList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAvailableFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvailableFileSystemsResponseBody</p>
     */
    public static class FileSystemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("FileSystemType")
        private String fileSystemType;

        @com.aliyun.core.annotation.NameInMap("MountTargetList")
        private java.util.List < MountTargetList> mountTargetList;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private FileSystemList(Builder builder) {
            this.createTime = builder.createTime;
            this.fileSystemId = builder.fileSystemId;
            this.fileSystemType = builder.fileSystemType;
            this.mountTargetList = builder.mountTargetList;
            this.protocolType = builder.protocolType;
            this.status = builder.status;
            this.storageType = builder.storageType;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystemList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return mountTargetList
         */
        public java.util.List < MountTargetList> getMountTargetList() {
            return this.mountTargetList;
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

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String createTime; 
            private String fileSystemId; 
            private String fileSystemType; 
            private java.util.List < MountTargetList> mountTargetList; 
            private String protocolType; 
            private String status; 
            private String storageType; 
            private String vpcId; 

            /**
             * <p>The time when the file system was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-7-29 15:43:53</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>2fa0248***</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The type of the file system. Valid values:</p>
             * <ul>
             * <li>standard: general-purpose network-attached storage (NAS) file system</li>
             * <li>extreme: extreme NAS file system</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cpfs</p>
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * <p>The mount targets of the file system.</p>
             */
            public Builder mountTargetList(java.util.List < MountTargetList> mountTargetList) {
                this.mountTargetList = mountTargetList;
                return this;
            }

            /**
             * <p>The protocol type of the file system. Valid values:</p>
             * <ul>
             * <li>nfs</li>
             * <li>smb</li>
             * <li>cpfs</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cpfs</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The state of the file system. Valid values:</p>
             * <ul>
             * <li>Pending: The file system is processing a task.</li>
             * <li>Running: The file system is available. You can perform subsequent operations, such as creating a mount target, only when the file system is in the Running state.</li>
             * <li>Stopped: The file system is unavailable.</li>
             * <li>Extending: The file system is being scaled out.</li>
             * <li>Stopping: The file system is being stopped.</li>
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
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp132kgui8n0targb****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public FileSystemList build() {
                return new FileSystemList(this);
            } 

        } 

    }
}
