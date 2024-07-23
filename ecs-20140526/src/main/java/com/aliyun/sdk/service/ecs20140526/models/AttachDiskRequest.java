// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDiskRequest} extends {@link RequestModel}
 *
 * <p>AttachDiskRequest</p>
 */
public class AttachDiskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bootable")
    private Boolean bootable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
    private Boolean deleteWithInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Device")
    private String device;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private AttachDiskRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.bootable = builder.bootable;
        this.deleteWithInstance = builder.deleteWithInstance;
        this.device = builder.device;
        this.diskId = builder.diskId;
        this.force = builder.force;
        this.instanceId = builder.instanceId;
        this.keyPairName = builder.keyPairName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return bootable
     */
    public Boolean getBootable() {
        return this.bootable;
    }

    /**
     * @return deleteWithInstance
     */
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    /**
     * @return device
     */
    public String getDevice() {
        return this.device;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<AttachDiskRequest, Builder> {
        private String sourceRegionId; 
        private Boolean bootable; 
        private Boolean deleteWithInstance; 
        private String device; 
        private String diskId; 
        private Boolean force; 
        private String instanceId; 
        private String keyPairName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String password; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AttachDiskRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.bootable = request.bootable;
            this.deleteWithInstance = request.deleteWithInstance;
            this.device = request.device;
            this.diskId = request.diskId;
            this.force = request.force;
            this.instanceId = request.instanceId;
            this.keyPairName = request.keyPairName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * Specifies whether to attach the disk as a system disk.
         * <p>
         * 
         * Default value: false.
         * 
         * >  You can set `Bootable` to true only if the instance does not have a system disk.
         */
        public Builder bootable(Boolean bootable) {
            this.putQueryParameter("Bootable", bootable);
            this.bootable = bootable;
            return this;
        }

        /**
         * Specifies whether to release the disk when the instance is released.
         * <p>
         * 
         * *   true: releases the disk when the instance is released.
         * *   false: does not release the disk when the instance is released. The disk is retained as a pay-as-you-go data disk.
         * 
         * Default value: false.
         * 
         * When you specify this parameter, take note of the following items:
         * 
         * *   If `OperationLocks` in the DescribeInstances response contains `"LockReason" : "security"` for the instance to which the disk is attached, the instance is locked for security reasons. Regardless of whether you set `DeleteWithInstance` to `false`, the DeleteWithInstance setting is ignored, and the disk is released when the instance is released.
         * *   If you want to attach an `elastic ephemeral disk`, you must set `DeleteWithInstance` to `true`.
         * *   This parameter is unavailable for disks for which the multi-attach feature is enabled.
         */
        public Builder deleteWithInstance(Boolean deleteWithInstance) {
            this.putQueryParameter("DeleteWithInstance", deleteWithInstance);
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }

        /**
         * The device name of the disk.
         * <p>
         * 
         * >  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
         */
        public Builder device(String device) {
            this.putQueryParameter("Device", device);
            this.device = device;
            return this;
        }

        /**
         * The ID of the disk. The disk specified by `DiskId` and the instance specified by `InstanceId` must reside in the same zone.
         * <p>
         * 
         * >  For more information about the limits on attaching a data disk and a system disk, see the "Usage notes" section of this topic.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * Specifies whether to forcefully attach the disk to the instance.
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * The ID of the instance to which you want to attach the disk.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the SSH key pair that you bind to the Linux instance when you attach the system disk.
         * <p>
         * 
         * *   Windows instances do not support logons based on SSH key pairs. The `Password` parameter takes effect even if the KeyPairName parameter is specified.
         * *   For Linux instances, the username and password-based logon method is disabled by default.
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
         * The password that is set when you attach the system disk. The password is applicable only to the administrator and root users. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:
         * <p>
         * 
         *     ()`~!@#$%^&*-_+=|{}[]:;\"<>,.?/
         * 
         * For Windows instances, passwords cannot start with a forward slash (/).
         * 
         * > If `Password` is configured, we recommend that you send requests over HTTPS to prevent password leaks.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
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

        @Override
        public AttachDiskRequest build() {
            return new AttachDiskRequest(this);
        } 

    } 

}
