// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDiskRequest} extends {@link RequestModel}
 *
 * <p>AttachDiskRequest</p>
 */
public class AttachDiskRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

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
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("DiskId")
    @Validation(required = true)
    private String diskId;

    @Query
    @NameInMap("Device")
    private String device;

    @Query
    @NameInMap("Bootable")
    private Boolean bootable;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("DeleteWithInstance")
    private Boolean deleteWithInstance;

    private AttachDiskRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.instanceId = builder.instanceId;
        this.diskId = builder.diskId;
        this.device = builder.device;
        this.bootable = builder.bootable;
        this.password = builder.password;
        this.keyPairName = builder.keyPairName;
        this.deleteWithInstance = builder.deleteWithInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDiskRequest create() {
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return device
     */
    public String getDevice() {
        return this.device;
    }

    /**
     * @return bootable
     */
    public Boolean getBootable() {
        return this.bootable;
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
     * @return deleteWithInstance
     */
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public static final class Builder extends Request.Builder<AttachDiskRequest, Builder> {
        private String sourceRegionId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String instanceId; 
        private String diskId; 
        private String device; 
        private Boolean bootable; 
        private String password; 
        private String keyPairName; 
        private Boolean deleteWithInstance; 

        private Builder() {
            super();
        } 

        private Builder(AttachDiskRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ownerAccount = request.ownerAccount;
            this.instanceId = request.instanceId;
            this.diskId = request.diskId;
            this.device = request.device;
            this.bootable = request.bootable;
            this.password = request.password;
            this.keyPairName = request.keyPairName;
            this.deleteWithInstance = request.deleteWithInstance;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The ID of the target ECS instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the disk to be mounted. The disk ("DiskId") and the instance ("InstanceId") must be in the same zone.
         * <p>
         * 
         * > supports mounting data disks and system disks. For more information, see the preceding section.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The name of the cloud disk device.
         * <p>
         * 
         * > This parameter will be deprecated soon. We recommend that you use other parameters to improve compatibility.
         */
        public Builder device(String device) {
            this.putQueryParameter("Device", device);
            this.device = device;
            return this;
        }

        /**
         * Specifies whether to mount a system disk.
         * <p>
         * 
         * Default value: false
         * 
         * > If you set the value to "Bootable = true", the target ECS instance must be in the no system disk state.
         */
        public Builder bootable(Boolean bootable) {
            this.putQueryParameter("Bootable", bootable);
            this.bootable = bootable;
            return this;
        }

        /**
         * When you mount a system disk, set the username and password of the instance. This parameter takes effect only for the administrator and root user names. Other user names do not take effect. The description must be 8 to 30 characters in length and must contain letters, digits, and special characters. Special symbols can be:
         * <p>
         * 
         * """
         * ()"~! @%& *-_+ =} [],.?/
         * """
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
         * The name of the SSH key pair bound to the Linux ECS instance when the system disk is mounted.
         * <p>
         * 
         * -Windows Server: SSH key pairs are not supported. Even if this parameter is specified, only the "Password" configuration is executed.
         * 
         * -Linux: password logon is disabled.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * Whether the cloud disk is released along with the instance when the instance is released.
         * <p>
         * 
         * -true: release.
         * -false: not released. Cloud disks are converted to pay-as-you-go data disks and retained.
         * 
         * Default value: false
         * 
         * When you set this parameter, note that:
         * 
         * -After "DeleteWithInstance" is set to "false", once the ECS instance is under security control, that is, "OperationLocks" is marked with ""LockReason" : "security"", this attribute of the cloud disk is ignored when the ECS instance is released.
         * 
         * -This parameter is not supported for disks with multiple mount features enabled.
         */
        public Builder deleteWithInstance(Boolean deleteWithInstance) {
            this.putQueryParameter("DeleteWithInstance", deleteWithInstance);
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }

        @Override
        public AttachDiskRequest build() {
            return new AttachDiskRequest(this);
        } 

    } 

}
