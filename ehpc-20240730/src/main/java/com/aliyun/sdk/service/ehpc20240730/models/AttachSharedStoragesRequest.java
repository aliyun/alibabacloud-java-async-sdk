// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachSharedStoragesRequest} extends {@link RequestModel}
 *
 * <p>AttachSharedStoragesRequest</p>
 */
public class AttachSharedStoragesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SharedStorages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < SharedStorages> sharedStorages;

    private AttachSharedStoragesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.sharedStorages = builder.sharedStorages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachSharedStoragesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return sharedStorages
     */
    public java.util.List < SharedStorages> getSharedStorages() {
        return this.sharedStorages;
    }

    public static final class Builder extends Request.Builder<AttachSharedStoragesRequest, Builder> {
        private String clusterId; 
        private java.util.List < SharedStorages> sharedStorages; 

        private Builder() {
            super();
        } 

        private Builder(AttachSharedStoragesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.sharedStorages = request.sharedStorages;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * SharedStorages.
         */
        public Builder sharedStorages(java.util.List < SharedStorages> sharedStorages) {
            String sharedStoragesShrink = shrink(sharedStorages, "SharedStorages", "json");
            this.putQueryParameter("SharedStorages", sharedStoragesShrink);
            this.sharedStorages = sharedStorages;
            return this;
        }

        @Override
        public AttachSharedStoragesRequest build() {
            return new AttachSharedStoragesRequest(this);
        } 

    } 

    public static class SharedStorages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("MountDirectory")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mountDirectory;

        @com.aliyun.core.annotation.NameInMap("MountOptions")
        private String mountOptions;

        @com.aliyun.core.annotation.NameInMap("MountTarget")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mountTarget;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("StorageDirectory")
        @com.aliyun.core.annotation.Validation(required = true)
        private String storageDirectory;

        @com.aliyun.core.annotation.NameInMap("VolumeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String volumeType;

        private SharedStorages(Builder builder) {
            this.fileSystemId = builder.fileSystemId;
            this.location = builder.location;
            this.mountDirectory = builder.mountDirectory;
            this.mountOptions = builder.mountOptions;
            this.mountTarget = builder.mountTarget;
            this.protocolType = builder.protocolType;
            this.storageDirectory = builder.storageDirectory;
            this.volumeType = builder.volumeType;
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
         * @return location
         */
        public String getLocation() {
            return this.location;
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

        /**
         * @return volumeType
         */
        public String getVolumeType() {
            return this.volumeType;
        }

        public static final class Builder {
            private String fileSystemId; 
            private String location; 
            private String mountDirectory; 
            private String mountOptions; 
            private String mountTarget; 
            private String protocolType; 
            private String storageDirectory; 
            private String volumeType; 

            /**
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * MountDirectory.
             */
            public Builder mountDirectory(String mountDirectory) {
                this.mountDirectory = mountDirectory;
                return this;
            }

            /**
             * MountOptions.
             */
            public Builder mountOptions(String mountOptions) {
                this.mountOptions = mountOptions;
                return this;
            }

            /**
             * MountTarget.
             */
            public Builder mountTarget(String mountTarget) {
                this.mountTarget = mountTarget;
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
             * StorageDirectory.
             */
            public Builder storageDirectory(String storageDirectory) {
                this.storageDirectory = storageDirectory;
                return this;
            }

            /**
             * VolumeType.
             */
            public Builder volumeType(String volumeType) {
                this.volumeType = volumeType;
                return this;
            }

            public SharedStorages build() {
                return new SharedStorages(this);
            } 

        } 

    }
}
