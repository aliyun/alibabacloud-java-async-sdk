// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReInitDiskRequest} extends {@link RequestModel}
 *
 * <p>ReInitDiskRequest</p>
 */
public class ReInitDiskRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("DiskId")
    @Validation(required = true)
    private String diskId;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("AutoStartInstance")
    private Boolean autoStartInstance;

    @Query
    @NameInMap("SecurityEnhancementStrategy")
    private String securityEnhancementStrategy;

    private ReInitDiskRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.diskId = builder.diskId;
        this.password = builder.password;
        this.keyPairName = builder.keyPairName;
        this.autoStartInstance = builder.autoStartInstance;
        this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReInitDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
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
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return autoStartInstance
     */
    public Boolean getAutoStartInstance() {
        return this.autoStartInstance;
    }

    /**
     * @return securityEnhancementStrategy
     */
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public static final class Builder extends Request.Builder<ReInitDiskRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String diskId; 
        private String password; 
        private String keyPairName; 
        private Boolean autoStartInstance; 
        private String securityEnhancementStrategy; 

        private Builder() {
            super();
        } 

        private Builder(ReInitDiskRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.diskId = request.diskId;
            this.password = request.password;
            this.keyPairName = request.keyPairName;
            this.autoStartInstance = request.autoStartInstance;
            this.securityEnhancementStrategy = request.securityEnhancementStrategy;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the cloud disk.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * Specifies whether to reset the username and password of the ECS instance when the system disk is reinitialized. The description must be 8 to 30 characters in length and must contain letters, digits, and special characters. Special symbols can be:
         * <p>
         * 
         * """
         * ()"~! @%& *-_+ =} [],.?/
         * """
         * 
         * The Windows instance cannot start with a slash (/).
         * 
         * > If the "Password" parameter is specified, we recommend that you send requests over HTTPS to avoid password leakage.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The name of the key pair.
         * <p>
         * 
         * > This parameter applies only to Linux instances. When you reinitialize the system disk, you can bind an SSH key pair to the ECS instance as the logon credential. After an SSH key pair is used, the logon credential for the username and password is disabled.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * Indicates whether the instance is automatically started after the disk is reinitialized.
         * <p>
         * 
         * Default value: false
         */
        public Builder autoStartInstance(Boolean autoStartInstance) {
            this.putQueryParameter("AutoStartInstance", autoStartInstance);
            this.autoStartInstance = autoStartInstance;
            return this;
        }

        /**
         * If the specified cloud disk is a system disk, whether to use security center for free after the cloud disk is reinitialized. Valid values:
         * <p>
         * 
         * -Active: used. This value only supports public images.
         * 
         * -Deactive: not used. This value supports all images.
         * 
         * Default value: Deactive
         */
        public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
            this.putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }

        @Override
        public ReInitDiskRequest build() {
            return new ReInitDiskRequest(this);
        } 

    } 

}
