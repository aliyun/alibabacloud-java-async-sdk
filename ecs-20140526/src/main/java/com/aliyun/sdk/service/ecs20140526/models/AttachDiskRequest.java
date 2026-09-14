// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
         * <p>Specifies whether to attach the disk as a system disk. Valid values:</p>
         * <ul>
         * <li><p>true: Attach as a system disk.</p>
         * </li>
         * <li><p>false: Do not attach as a system disk.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>If <code>Bootable</code> is set to <code>true</code>, the target ECS instance must have no system disk attached.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder bootable(Boolean bootable) {
            this.putQueryParameter("Bootable", bootable);
            this.bootable = bootable;
            return this;
        }

        /**
         * <p>Specifies whether to release the disk when the instance is released. Valid values:</p>
         * <ul>
         * <li>true: The disk is released with the instance.</li>
         * <li>false: The disk is not released with the instance. The disk is retained as a pay-as-you-go data disk.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <p>Note the following when setting this parameter:</p>
         * <ul>
         * <li><p>If <code>DeleteWithInstance</code> is set to <code>false</code> and the ECS instance is under security control (that is, <code>OperationLocks</code> contains <code>&quot;LockReason&quot; : &quot;security&quot;</code>), this attribute is ignored when the ECS instance is released, and the disk is released along with the instance.</p>
         * </li>
         * <li><p>If the disk to attach is an elastic ephemeral disk, you must set <code>DeleteWithInstance</code> to <code>true</code>.</p>
         * </li>
         * <li><p>This parameter is not supported for disks with the multi-attach feature enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteWithInstance(Boolean deleteWithInstance) {
            this.putQueryParameter("DeleteWithInstance", deleteWithInstance);
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }

        /**
         * <p>The device name of the disk.</p>
         * <blockquote>
         * <p>This parameter is being deprecated. To improve compatibility, use other parameters to identify the disk.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testDeviceName</p>
         */
        public Builder device(String device) {
            this.putQueryParameter("Device", device);
            this.device = device;
            return this;
        }

        /**
         * <p>The ID of the disk to attach. The disk (<code>DiskId</code>) and the instance (<code>InstanceId</code>) must be in the same zone.</p>
         * <blockquote>
         * <p>Both data disks and system disks are supported. For the relevant constraints, see the operation description above.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1j4l5axzdy6ftk****</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>Specifies whether the request is a forced attach request. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>Currently, only the ESSD regional disk type (cloud_regional_disk_auto) supports setting this field to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The ID of the ECS instance to which you want to attach the disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1dq5lozx5f4pmd****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the SSH key pair to bind to a Linux ECS instance when attaching a system disk.</p>
         * <ul>
         * <li><p>Windows Server instances: SSH key pairs are not supported. Even if this parameter is specified, only the <code>Password</code> configuration takes effect.</p>
         * </li>
         * <li><p>Linux instances: Password-based logon is disabled after the key pair is bound.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KeyPairTestName</p>
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
         * <p>The password for the instance when attaching a system disk. This parameter applies only to the administrator and root usernames. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
         * <pre><code>()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/
         * </code></pre>
         * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
         * <blockquote>
         * <p>If you specify the <code>Password</code> parameter, use HTTPS to send the request to prevent password leakage.</p>
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
