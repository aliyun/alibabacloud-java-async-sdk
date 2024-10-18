// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F6757FA4-8FED-4602-B7F5-3550C084****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the attached shared storage.</p>
         */
        public Builder sharedStorages(java.util.List < SharedStorages> sharedStorages) {
            this.sharedStorages = sharedStorages;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ListSharedStoragesResponseBody build() {
            return new ListSharedStoragesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSharedStoragesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSharedStoragesResponseBody</p>
     */
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
             * <p>The local mount directory of the attached file system.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder mountDirectory(String mountDirectory) {
                this.mountDirectory = mountDirectory;
                return this;
            }

            /**
             * <p>The mount options for the attached file system. Valid values:</p>
             * <ul>
             * <li>-t nfs -o vers=3,nolock,proto=tcp,noresvport</li>
             * <li>-t nfs -o vers=4.0,noresvport</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-t nfs -o vers=4.0,noresvport</p>
             */
            public Builder mountOptions(String mountOptions) {
                this.mountOptions = mountOptions;
                return this;
            }

            /**
             * <p>The mount target of the attached file system.</p>
             * 
             * <strong>example:</strong>
             * <p>0bd504b***-ngq26.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder mountTarget(String mountTarget) {
                this.mountTarget = mountTarget;
                return this;
            }

            /**
             * <p>The protocol used by the mount target of the attached file system. Valid values:</p>
             * <ul>
             * <li>nfs3</li>
             * <li>nfs4</li>
             * <li>cpfs</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>nfs3</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The storage directory of the attached file system.</p>
             * 
             * <strong>example:</strong>
             * <p>/testehpc</p>
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
    /**
     * 
     * {@link ListSharedStoragesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSharedStoragesResponseBody</p>
     */
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
             * <p>The ID of the attached file system.</p>
             * 
             * <strong>example:</strong>
             * <p>08c7f4b***</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The protocol used by the attached file system. Valid values:</p>
             * <ul>
             * <li>nfs3</li>
             * <li>nfs4</li>
             * <li>cpfs</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>nfs4</p>
             */
            public Builder fileSystemProtocol(String fileSystemProtocol) {
                this.fileSystemProtocol = fileSystemProtocol;
                return this;
            }

            /**
             * <p>The type of the attached file system. Valid values:</p>
             * <ul>
             * <li>nas</li>
             * <li>cpfs</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>nas</p>
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * <p>The mount information.</p>
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
