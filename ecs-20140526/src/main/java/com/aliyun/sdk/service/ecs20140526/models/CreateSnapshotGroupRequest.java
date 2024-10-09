// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSnapshotGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateSnapshotGroupRequest</p>
 */
public class CreateSnapshotGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private java.util.List < String > diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeDiskId")
    private java.util.List < String > excludeDiskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstantAccess")
    private Boolean instantAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstantAccessRetentionDays")
    private Integer instantAccessRetentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageLocationArn")
    private String storageLocationArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateSnapshotGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.diskId = builder.diskId;
        this.excludeDiskId = builder.excludeDiskId;
        this.instanceId = builder.instanceId;
        this.instantAccess = builder.instantAccess;
        this.instantAccessRetentionDays = builder.instantAccessRetentionDays;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.storageLocationArn = builder.storageLocationArn;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnapshotGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diskId
     */
    public java.util.List < String > getDiskId() {
        return this.diskId;
    }

    /**
     * @return excludeDiskId
     */
    public java.util.List < String > getExcludeDiskId() {
        return this.excludeDiskId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instantAccess
     */
    public Boolean getInstantAccess() {
        return this.instantAccess;
    }

    /**
     * @return instantAccessRetentionDays
     */
    public Integer getInstantAccessRetentionDays() {
        return this.instantAccessRetentionDays;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return storageLocationArn
     */
    public String getStorageLocationArn() {
        return this.storageLocationArn;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateSnapshotGroupRequest, Builder> {
        private String clientToken; 
        private String description; 
        private java.util.List < String > diskId; 
        private java.util.List < String > excludeDiskId; 
        private String instanceId; 
        private Boolean instantAccess; 
        private Integer instantAccessRetentionDays; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String storageLocationArn; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateSnapshotGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.diskId = request.diskId;
            this.excludeDiskId = request.excludeDiskId;
            this.instanceId = request.instanceId;
            this.instantAccess = request.instantAccess;
            this.instantAccessRetentionDays = request.instantAccessRetentionDays;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.storageLocationArn = request.storageLocationArn;
            this.tag = request.tag;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>The description of the snapshot-consistent group. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of cloud disk N for which you want to create snapshots. You can specify multiple cloud disk IDs across instances within the same zone. Valid values of N: 1 to 16. A single snapshot-consistent group can contain snapshots of up to 16 cloud disks whose total disk size does not exceed 32 TiB.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>You cannot specify both DiskId.N and <code>ExcludeDiskId.N</code> in the same request.</li>
         * <li>If <code>InstanceId</code> is set, you can use DiskId.N to specify only cloud disks attached to the instance specified by InstanceId, and you cannot use DiskId.N to specify cloud disks attached to multiple instances.</li>
         * </ul>
         */
        public Builder diskId(java.util.List < String > diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>The ID of cloud disk N for which you do not want to create snapshots. If this parameter is specified, the created snapshot-consistent group does not contain snapshots of the cloud disk. Valid values of N: 1 to 16.</p>
         * <p>This parameter is empty by default, which indicates that snapshots are created for all the disks of the instance.</p>
         * <blockquote>
         * <p>You cannot specify ExcludeDiskId.N and <code>DiskId.N</code> in the same request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d-j6cf7l0ewidb78lq****</p>
         */
        public Builder excludeDiskId(java.util.List < String > excludeDiskId) {
            this.putQueryParameter("ExcludeDiskId", excludeDiskId);
            this.excludeDiskId = excludeDiskId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-j6ca469urv8ei629****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the instant access feature. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p> This parameter is no longer used. By default, new normal snapshots of ESSDs are upgraded to instant access snapshots free of charge without the need for additional configurations. For more information, see <a href="https://help.aliyun.com/document_detail/193667.html">Use the instant access feature</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder instantAccess(Boolean instantAccess) {
            this.putQueryParameter("InstantAccess", instantAccess);
            this.instantAccess = instantAccess;
            return this;
        }

        /**
         * <p>The number of days for which the instant access feature is available. Unit: days. Valid values: 1 to 65535.</p>
         * <p>This parameter takes effect only when <code>InstantAccess</code> is set to true. The instant access feature is automatically disabled when the specified duration ends.</p>
         * <p>This parameter is left empty by default, which indicates that the instant access feature is automatically disabled for snapshots when the snapshots are released.</p>
         * <blockquote>
         * <p> This parameter is no longer used. By default, new normal snapshots of ESSDs are upgraded to instant access snapshots free of charge without the need for additional configurations. For more information, see <a href="https://help.aliyun.com/document_detail/193667.html">Use the instant access feature</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder instantAccessRetentionDays(Integer instantAccessRetentionDays) {
            this.putQueryParameter("InstantAccessRetentionDays", instantAccessRetentionDays);
            this.instantAccessRetentionDays = instantAccessRetentionDays;
            return this;
        }

        /**
         * <p>The name of the snapshot-consistent group. The name must be 2 to 128 characters in length. The name can contain letters, digits, periods (.), underscores (_), hyphens (-), and colons (:). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the snapshot-consistent group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <blockquote>
         * <p>This parameter is unavailable for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder storageLocationArn(String storageLocationArn) {
            this.putQueryParameter("StorageLocationArn", storageLocationArn);
            this.storageLocationArn = storageLocationArn;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateSnapshotGroupRequest build() {
            return new CreateSnapshotGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSnapshotGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateSnapshotGroupRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of tag N of the snapshot-consistent group. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N of the snapshot-consistent group. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
