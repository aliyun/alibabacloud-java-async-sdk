// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SharedStorageTemplate} extends {@link TeaModel}
 *
 * <p>SharedStorageTemplate</p>
 */
public class SharedStorageTemplate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.NameInMap("MountDirectory")
    private String mountDirectory;

    @com.aliyun.core.annotation.NameInMap("MountOptions")
    private String mountOptions;

    @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
    private String mountTargetDomain;

    @com.aliyun.core.annotation.NameInMap("NASDirectory")
    private String NASDirectory;

    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    private SharedStorageTemplate(Builder builder) {
        this.fileSystemId = builder.fileSystemId;
        this.mountDirectory = builder.mountDirectory;
        this.mountOptions = builder.mountOptions;
        this.mountTargetDomain = builder.mountTargetDomain;
        this.NASDirectory = builder.NASDirectory;
        this.protocolType = builder.protocolType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SharedStorageTemplate create() {
        return builder().build();
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
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
     * @return mountTargetDomain
     */
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    /**
     * @return NASDirectory
     */
    public String getNASDirectory() {
        return this.NASDirectory;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    public static final class Builder {
        private String fileSystemId; 
        private String mountDirectory; 
        private String mountOptions; 
        private String mountTargetDomain; 
        private String NASDirectory; 
        private String protocolType; 

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
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
         * MountTargetDomain.
         */
        public Builder mountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }

        /**
         * NASDirectory.
         */
        public Builder NASDirectory(String NASDirectory) {
            this.NASDirectory = NASDirectory;
            return this;
        }

        /**
         * ProtocolType.
         */
        public Builder protocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }

        public SharedStorageTemplate build() {
            return new SharedStorageTemplate(this);
        } 

    } 

}
