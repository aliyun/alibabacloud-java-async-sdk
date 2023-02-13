// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceSystemDiskRequest} extends {@link RequestModel}
 *
 * <p>ReplaceSystemDiskRequest</p>
 */
public class ReplaceSystemDiskRequest extends Request {
    @Query
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("Architecture")
    private String architecture;

    @Query
    @NameInMap("Arn")
    private java.util.List < Arn> arn;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DiskId")
    private String diskId;

    @Query
    @NameInMap("EncryptAlgorithm")
    private String encryptAlgorithm;

    @Query
    @NameInMap("Encrypted")
    private Boolean encrypted;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("KMSKeyId")
    private String KMSKeyId;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("PasswordInherit")
    private Boolean passwordInherit;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityEnhancementStrategy")
    private String securityEnhancementStrategy;

    @Query
    @NameInMap("UseAdditionalService")
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
         * Architecture.
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * Arn.
         */
        public Builder arn(java.util.List < Arn> arn) {
            this.putQueryParameter("Arn", arn);
            this.arn = arn;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DiskId.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * EncryptAlgorithm.
         */
        public Builder encryptAlgorithm(String encryptAlgorithm) {
            this.putQueryParameter("EncryptAlgorithm", encryptAlgorithm);
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }

        /**
         * Encrypted.
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * KMSKeyId.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * KeyPairName.
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
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * PasswordInherit.
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
            return this;
        }

        /**
         * Platform.
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
         * SecurityEnhancementStrategy.
         */
        public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
            this.putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }

        /**
         * UseAdditionalService.
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

    public static class SystemDisk extends TeaModel {
        @NameInMap("Size")
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
             * Size.
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
    public static class Arn extends TeaModel {
        @NameInMap("AssumeRoleFor")
        private Long assumeRoleFor;

        @NameInMap("RoleType")
        private String roleType;

        @NameInMap("Rolearn")
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
             * AssumeRoleFor.
             */
            public Builder assumeRoleFor(Long assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * RoleType.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * Rolearn.
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
