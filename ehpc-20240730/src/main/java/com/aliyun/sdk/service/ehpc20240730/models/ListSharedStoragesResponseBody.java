// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSharedStoragesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSharedStoragesResponseBody</p>
 */
public class ListSharedStoragesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SharedStorages")
    private java.util.List < SharedStorages> sharedStorages;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private ListSharedStoragesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sharedStorages = builder.sharedStorages;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSharedStoragesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sharedStorages
     */
    public java.util.List < SharedStorages> getSharedStorages() {
        return this.sharedStorages;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SharedStorages> sharedStorages; 
        private String success; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the attached shared storage.
         */
        public Builder sharedStorages(java.util.List < SharedStorages> sharedStorages) {
            this.sharedStorages = sharedStorages;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ListSharedStoragesResponseBody build() {
            return new ListSharedStoragesResponseBody(this);
        } 

    } 

    public static class MountInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountDirectory")
        private String mountDirectory;

        @com.aliyun.core.annotation.NameInMap("MountOptions")
        private String mountOptions;

        @com.aliyun.core.annotation.NameInMap("MountTarget")
        private String mountTarget;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("StorageDirectory")
        private String storageDirectory;

        private MountInfo(Builder builder) {
            this.mountDirectory = builder.mountDirectory;
            this.mountOptions = builder.mountOptions;
            this.mountTarget = builder.mountTarget;
            this.protocolType = builder.protocolType;
            this.storageDirectory = builder.storageDirectory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountInfo create() {
            return builder().build();
        }

        /**
         * @return mountDirectory
         */
        public String getMountDirectory() {
            return this.mountDirectory;
        }

        /**
         * @return mountOptions
         */
        public String getMountOptions() {
            return this.mountOptions;
        }

        /**
         * @return mountTarget
         */
        public String getMountTarget() {
            return this.mountTarget;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return storageDirectory
         */
        public String getStorageDirectory() {
            return this.storageDirectory;
        }

        public static final class Builder {
            private String mountDirectory; 
            private String mountOptions; 
            private String mountTarget; 
            private String protocolType; 
            private String storageDirectory; 

            /**
             * The local mount directory of the attached file system.
             */
            public Builder mountDirectory(String mountDirectory) {
                this.mountDirectory = mountDirectory;
                return this;
            }

            /**
             * The mount options for the attached file system. Valid values:
             * <p>
             * 
             * *   \-t nfs -o vers=3,nolock,proto=tcp,noresvport
             * *   \-t nfs -o vers=4.0,noresvport
             */
            public Builder mountOptions(String mountOptions) {
                this.mountOptions = mountOptions;
                return this;
            }

            /**
             * The mount target of the attached file system.
             */
            public Builder mountTarget(String mountTarget) {
                this.mountTarget = mountTarget;
                return this;
            }

            /**
             * The protocol used by the mount target of the attached file system. Valid values:
             * <p>
             * 
             * *   nfs3
             * *   nfs4
             * *   cpfs
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The storage directory of the attached file system.
             */
            public Builder storageDirectory(String storageDirectory) {
                this.storageDirectory = storageDirectory;
                return this;
            }

            public MountInfo build() {
                return new MountInfo(this);
            } 

        } 

    }
    public static class SharedStorages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("FileSystemProtocol")
        private String fileSystemProtocol;

        @com.aliyun.core.annotation.NameInMap("FileSystemType")
        private String fileSystemType;

        @com.aliyun.core.annotation.NameInMap("MountInfo")
        private java.util.List < MountInfo> mountInfo;

        private SharedStorages(Builder builder) {
            this.fileSystemId = builder.fileSystemId;
            this.fileSystemProtocol = builder.fileSystemProtocol;
            this.fileSystemType = builder.fileSystemType;
            this.mountInfo = builder.mountInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SharedStorages create() {
            return builder().build();
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return fileSystemProtocol
         */
        public String getFileSystemProtocol() {
            return this.fileSystemProtocol;
        }

        /**
         * @return fileSystemType
         */
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        /**
         * @return mountInfo
         */
        public java.util.List < MountInfo> getMountInfo() {
            return this.mountInfo;
        }

        public static final class Builder {
            private String fileSystemId; 
            private String fileSystemProtocol; 
            private String fileSystemType; 
            private java.util.List < MountInfo> mountInfo; 

            /**
             * The ID of the attached file system.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * The protocol used by the attached file system. Valid values:
             * <p>
             * 
             * *   nfs3
             * *   nfs4
             * *   cpfs
             */
            public Builder fileSystemProtocol(String fileSystemProtocol) {
                this.fileSystemProtocol = fileSystemProtocol;
                return this;
            }

            /**
             * The type of the attached file system. Valid values:
             * <p>
             * 
             * *   nas
             * *   cpfs
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * The mount information.
             */
            public Builder mountInfo(java.util.List < MountInfo> mountInfo) {
                this.mountInfo = mountInfo;
                return this;
            }

            public SharedStorages build() {
                return new SharedStorages(this);
            } 

        } 

    }
}
