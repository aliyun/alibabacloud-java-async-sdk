// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link UpdateNodeGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateNodeGroupRequest</p>
 */
public class UpdateNodeGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileSystemMountEnabled")
    private Boolean fileSystemMountEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginPassword")
    private String loginPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewNodeGroupName")
    private String newNodeGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RamRoleName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String ramRoleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private UpdateNodeGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileSystemMountEnabled = builder.fileSystemMountEnabled;
        this.imageId = builder.imageId;
        this.keyPairName = builder.keyPairName;
        this.loginPassword = builder.loginPassword;
        this.newNodeGroupName = builder.newNodeGroupName;
        this.nodeGroupId = builder.nodeGroupId;
        this.ramRoleName = builder.ramRoleName;
        this.systemDisk = builder.systemDisk;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNodeGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return fileSystemMountEnabled
     */
    public Boolean getFileSystemMountEnabled() {
        return this.fileSystemMountEnabled;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return loginPassword
     */
    public String getLoginPassword() {
        return this.loginPassword;
    }

    /**
     * @return newNodeGroupName
     */
    public String getNewNodeGroupName() {
        return this.newNodeGroupName;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<UpdateNodeGroupRequest, Builder> {
        private String regionId; 
        private Boolean fileSystemMountEnabled; 
        private String imageId; 
        private String keyPairName; 
        private String loginPassword; 
        private String newNodeGroupName; 
        private String nodeGroupId; 
        private String ramRoleName; 
        private SystemDisk systemDisk; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNodeGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileSystemMountEnabled = request.fileSystemMountEnabled;
            this.imageId = request.imageId;
            this.keyPairName = request.keyPairName;
            this.loginPassword = request.loginPassword;
            this.newNodeGroupName = request.newNodeGroupName;
            this.nodeGroupId = request.nodeGroupId;
            this.ramRoleName = request.ramRoleName;
            this.systemDisk = request.systemDisk;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether file storage mounting is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder fileSystemMountEnabled(Boolean fileSystemMountEnabled) {
            this.putBodyParameter("FileSystemMountEnabled", fileSystemMountEnabled);
            this.fileSystemMountEnabled = fileSystemMountEnabled;
            return this;
        }

        /**
         * <p>The ID of the default image for the node group. If you do not specify this parameter, the image remains unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>i1232142432432</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The name of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putBodyParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The logon password for the machines in the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>Password</p>
         */
        public Builder loginPassword(String loginPassword) {
            this.putBodyParameter("LoginPassword", loginPassword);
            this.loginPassword = loginPassword;
            return this;
        }

        /**
         * <p>The name of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>test-update</p>
         */
        public Builder newNodeGroupName(String newNodeGroupName) {
            this.putBodyParameter("NewNodeGroupName", newNodeGroupName);
            this.newNodeGroupName = newNodeGroupName;
            return this;
        }

        /**
         * <p>The ID of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>i120021051733814190732</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putBodyParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>The name of the RAM role for the node. You can call the ListRoles operation of Resource Access Management (RAM) to query the RAM roles that you have created. The trusted entity of the specified role must be Lingjun AI Computing Service.
         * <warning>Submitting an empty string &quot;&quot; clears the RAM role of the node group.</warning></p>
         * 
         * <strong>example:</strong>
         * <p>xianwen-test-ram-role</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putBodyParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>The configuration of the system cloud disk.</p>
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            String systemDiskShrink = shrink(systemDisk, "SystemDisk", "json");
            this.putBodyParameter("SystemDisk", systemDiskShrink);
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * <p>The custom executable shell script. The script must be Base64-encoded. The maximum size of the raw data is 16 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        public Builder userData(String userData) {
            this.putBodyParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public UpdateNodeGroupRequest build() {
            return new UpdateNodeGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateNodeGroupRequest} extends {@link TeaModel}
     *
     * <p>UpdateNodeGroupRequest</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
            this.encrypted = builder.encrypted;
            this.KMSKeyId = builder.KMSKeyId;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private Boolean encrypted; 
            private String KMSKeyId; 
            private String performanceLevel; 
            private Long size; 

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.category = model.category;
                this.encrypted = model.encrypted;
                this.KMSKeyId = model.KMSKeyId;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
            } 

            /**
             * <p>The type of the system cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Specifies whether the system cloud disk is encrypted. Valid values:</p>
             * <ul>
             * <li>true: Encrypted.</li>
             * <li>false: Not encrypted.</li>
             * </ul>
             * <p>Default value: false.</p>
             * <blockquote>
             * <p>Notice: When you use a shared encrypted image to create a cloud disk based on an encrypted snapshot, you must set the Encrypted request parameter to true for the cloud disk to ensure that the created cloud disk uses the recipient&quot;s own key.</p>
             * </blockquote>
             * <blockquote>
             * <p>Encrypting the system cloud disk during instance creation is not supported in Hong Kong (China) Zone D or Singapore Zone A.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The KMS key ID for the system cloud disk.</p>
             * <p>If the Encrypted Settings is true and KMSKeyId is not specified, the default key is used for encryption, and the KMSKeyId value is returned after the instance is created.</p>
             * <ul>
             * <li>If the cloud disk is created from an unshared encrypted snapshot, the encryption key used for the snapshot is used by default.</li>
             * <li>If the cloud disk is created from a shared encrypted snapshot, the service key is used by default.</li>
             * <li>If the cloud disk is created in a region where account-level default encryption for Elastic Block Storage (EBS) is enabled, the specified account-level key is used by default.</li>
             * <li>In other cases, the service key is used by default.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>de1a73c4-9590-45da-8859-d39b5ec4751e</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>The performance level of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The size of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
}
