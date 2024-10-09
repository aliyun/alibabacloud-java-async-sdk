// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReplaceSystemDiskRequest} extends {@link RequestModel}
 *
 * <p>ReplaceSystemDiskRequest</p>
 */
public class ReplaceSystemDiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Architecture")
    private String architecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Arn")
    private java.util.List < Arn> arn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptAlgorithm")
    private String encryptAlgorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KMSKeyId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String KMSKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordInherit")
    private Boolean passwordInherit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEnhancementStrategy")
    private String securityEnhancementStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseAdditionalService")
    private Boolean useAdditionalService;

    private ReplaceSystemDiskRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.architecture = builder.architecture;
        this.arn = builder.arn;
        this.clientToken = builder.clientToken;
        this.diskId = builder.diskId;
        this.encryptAlgorithm = builder.encryptAlgorithm;
        this.encrypted = builder.encrypted;
        this.imageId = builder.imageId;
        this.instanceId = builder.instanceId;
        this.KMSKeyId = builder.KMSKeyId;
        this.keyPairName = builder.keyPairName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.passwordInherit = builder.passwordInherit;
        this.platform = builder.platform;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
        this.useAdditionalService = builder.useAdditionalService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceSystemDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return arn
     */
    public java.util.List < Arn> getArn() {
        return this.arn;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return encryptAlgorithm
     */
    public String getEncryptAlgorithm() {
        return this.encryptAlgorithm;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return passwordInherit
     */
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityEnhancementStrategy
     */
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    /**
     * @return useAdditionalService
     */
    public Boolean getUseAdditionalService() {
        return this.useAdditionalService;
    }

    public static final class Builder extends Request.Builder<ReplaceSystemDiskRequest, Builder> {
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private String architecture; 
        private java.util.List < Arn> arn; 
        private String clientToken; 
        private String diskId; 
        private String encryptAlgorithm; 
        private Boolean encrypted; 
        private String imageId; 
        private String instanceId; 
        private String KMSKeyId; 
        private String keyPairName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String password; 
        private Boolean passwordInherit; 
        private String platform; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityEnhancementStrategy; 
        private Boolean useAdditionalService; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceSystemDiskRequest request) {
            super(request);
            this.systemDisk = request.systemDisk;
            this.sourceRegionId = request.sourceRegionId;
            this.architecture = request.architecture;
            this.arn = request.arn;
            this.clientToken = request.clientToken;
            this.diskId = request.diskId;
            this.encryptAlgorithm = request.encryptAlgorithm;
            this.encrypted = request.encrypted;
            this.imageId = request.imageId;
            this.instanceId = request.instanceId;
            this.KMSKeyId = request.KMSKeyId;
            this.keyPairName = request.keyPairName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.passwordInherit = request.passwordInherit;
            this.platform = request.platform;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityEnhancementStrategy = request.securityEnhancementStrategy;
            this.useAdditionalService = request.useAdditionalService;
        } 

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.putQueryParameter("SystemDisk", systemDisk);
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is deprecated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i386</p>
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * <p>This parameter is not available for public use.</p>
         */
        public Builder arn(java.util.List < Arn> arn) {
            this.putQueryParameter("Arn", arn);
            this.arn = arn;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but make sure that the token is unique across requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is deprecated. To improve compatibility, we recommend that you use <code>ImageId</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d-bp67acfmxazb4ph****</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not available for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        public Builder encryptAlgorithm(String encryptAlgorithm) {
            this.putQueryParameter("EncryptAlgorithm", encryptAlgorithm);
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }

        /**
         * <p>Specifies whether to encrypt the disk. Valid values:</p>
         * <ul>
         * <li>true: encrypts the disk.</li>
         * <li>false: does not encrypt the disk.</li>
         * </ul>
         * <p>Default value: false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * <p>The ID of the image to be used to replace the system disk.</p>
         * <p>If the <code>DiskId</code> parameter is not specified, this parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp67acfmxazb4ph****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4ph****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the KMS key to use for the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>e522b26d-abf6-4e0d-b5da-04b7******3c</p>
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * <p>The name of the key pair.</p>
         * <blockquote>
         * <p>This parameter is applicable only to Linux instances. You can bind an SSH key pair to the instance as a logon credential. After you bind the SSH key pair, the username and password logon method is disabled for the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testKeyPairName</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Specifies whether to reset the password for the instance. The password must be 8 to 30 characters in length and contain at least three of the following items: uppercase letters, lowercase letters, digits, and special characters. Special characters include:</p>
         * <pre><code>()`~!@#$%^&amp;*-_+=|{}[]:;\&quot;&lt;&gt;,.?/
         * </code></pre>
         * <p>The passwords of Windows instances cannot start with a forward slash (/).</p>
         * <p>This parameter is empty by default, which indicates that the current password remains unchanged.</p>
         * <blockquote>
         * <p>If you specify <code>Password</code>, we recommend that you send requests over HTTPS to prevent password leaks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>EcsV587!</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>Specifies whether to use the preset password of the image.</p>
         * <p>Default value: false</p>
         * <blockquote>
         * <p>If the PasswordInherit parameter is specified, you must leave the Password parameter empty. Before you use this parameter, make sure that a password is preset for the image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is deprecated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CentOS</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>Specifies whether to use Security Center Basic after the system disk is replaced. Valid values:</p>
         * <ul>
         * <li>Active: uses Security Center Basic after the system disk is re-initialized. This value is applicable only to public images.</li>
         * <li>Deactive: does not use Security Center Basic after the system disk is re-initialized. This value is applicable to all images.</li>
         * </ul>
         * <p>Default value: Deactive.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
            this.putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }

        /**
         * <p>Specifies whether to use the system configurations for virtual machines provided by Alibaba Cloud. System configurations for Windows: NTP and KMS. System configurations for Linux: NTP and YUM.</p>
         * <blockquote>
         * <p>This parameter takes effect only when you attach a system disk whose device name is /dev/xvda.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useAdditionalService(Boolean useAdditionalService) {
            this.putQueryParameter("UseAdditionalService", useAdditionalService);
            this.useAdditionalService = useAdditionalService;
            return this;
        }

        @Override
        public ReplaceSystemDiskRequest build() {
            return new ReplaceSystemDiskRequest(this);
        } 

    } 

    /**
     * 
     * {@link ReplaceSystemDiskRequest} extends {@link TeaModel}
     *
     * <p>ReplaceSystemDiskRequest</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private SystemDisk(Builder builder) {
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private Integer size; 

            /**
             * <p>The capacity of the new system disk. Unit: GiB. Valid values for different disk categories:</p>
             * <ul>
             * <li><p>Basic disk: Max{20, Size of the image specified by ImageId} to 500.</p>
             * </li>
             * <li><p>Enterprise SSD (ESSD):</p>
             * <ul>
             * <li>PL0: Max{1, Size of the image specified by ImageId} to 2048.</li>
             * <li>PL1: Max{20, Size of the image specified by ImageId} to 2048.</li>
             * <li>PL2: Max{461, Size of the image specified by ImageId} to 2048.</li>
             * <li>PL3: Max{1261, Size of the image specified by ImageId} to 2048.</li>
             * </ul>
             * </li>
             * <li><p>ESSD AutoPL disk: Max{1, Size of the image specified by ImageId} to 2048.</p>
             * </li>
             * <li><p>Other disk categories: Max{20, Size of the image specified by ImageId} to 2048.</p>
             * </li>
             * </ul>
             * <p>Default value: 40 or the size of the image specified by ImageId, whichever is greater.</p>
             * <blockquote>
             * <p> If the capacity of the new system disk exceeds <code>Max{20, Capacity of the original system disk}</code>, you are charged for the excess capacity.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReplaceSystemDiskRequest} extends {@link TeaModel}
     *
     * <p>ReplaceSystemDiskRequest</p>
     */
    public static class Arn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
        private Long assumeRoleFor;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        @com.aliyun.core.annotation.NameInMap("Rolearn")
        private String rolearn;

        private Arn(Builder builder) {
            this.assumeRoleFor = builder.assumeRoleFor;
            this.roleType = builder.roleType;
            this.rolearn = builder.rolearn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Arn create() {
            return builder().build();
        }

        /**
         * @return assumeRoleFor
         */
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        /**
         * @return rolearn
         */
        public String getRolearn() {
            return this.rolearn;
        }

        public static final class Builder {
            private Long assumeRoleFor; 
            private String roleType; 
            private String rolearn; 

            /**
             * <blockquote>
             * <p>This parameter is unavailable.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assumeRoleFor(Long assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not available for public use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not available for public use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder rolearn(String rolearn) {
                this.rolearn = rolearn;
                return this;
            }

            public Arn build() {
                return new Arn(this);
            } 

        } 

    }
}
