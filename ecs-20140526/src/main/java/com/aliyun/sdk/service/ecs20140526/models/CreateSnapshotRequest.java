// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSnapshotRequest} extends {@link RequestModel}
 *
 * <p>CreateSnapshotRequest</p>
 */
public class CreateSnapshotRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

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
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("InstantAccessRetentionDays")
    private Integer instantAccessRetentionDays;

    @Query
    @NameInMap("RetentionDays")
    private Integer retentionDays;

    @Query
    @NameInMap("SnapshotName")
    private String snapshotName;

    @Query
    @NameInMap("InstantAccess")
    private Boolean instantAccess;

    private CreateSnapshotRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.tag = builder.tag;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.diskId = builder.diskId;
        this.description = builder.description;
        this.clientToken = builder.clientToken;
        this.category = builder.category;
        this.resourceGroupId = builder.resourceGroupId;
        this.instantAccessRetentionDays = builder.instantAccessRetentionDays;
        this.retentionDays = builder.retentionDays;
        this.snapshotName = builder.snapshotName;
        this.instantAccess = builder.instantAccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnapshotRequest create() {
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return instantAccessRetentionDays
     */
    public Integer getInstantAccessRetentionDays() {
        return this.instantAccessRetentionDays;
    }

    /**
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * @return instantAccess
     */
    public Boolean getInstantAccess() {
        return this.instantAccess;
    }

    public static final class Builder extends Request.Builder<CreateSnapshotRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private java.util.List < Tag> tag; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String diskId; 
        private String description; 
        private String clientToken; 
        private String category; 
        private String resourceGroupId; 
        private Integer instantAccessRetentionDays; 
        private Integer retentionDays; 
        private String snapshotName; 
        private Boolean instantAccess; 

        private Builder() {
            super();
        } 

        private Builder(CreateSnapshotRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.tag = request.tag;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.diskId = request.diskId;
            this.description = request.description;
            this.clientToken = request.clientToken;
            this.category = request.category;
            this.resourceGroupId = request.resourceGroupId;
            this.instantAccessRetentionDays = request.instantAccessRetentionDays;
            this.retentionDays = request.retentionDays;
            this.snapshotName = request.snapshotName;
            this.instantAccess = request.instantAccess;
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
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
         * The ID of the disk.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The description of the snapshot. The description must be 2 to 256 characters in length and cannot start with http:// or https.
         * <p>
         * 
         * Default value: Null.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The type of the snapshot. Valid values:
         * <p>
         * -Standard: normal snapshot
         * -Flash: local snapshot
         * 
         * > This parameter will be deprecated soon. We recommend that you use the "InstantAccess" parameter to improve compatibility ". This parameter and the "InstantAccess" parameter cannot be passed at the same time. For more information, see API description.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The ID of the resource group to which the snapshot belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Set the retention period of the snapshot extreme availability feature. After the retention period expires, the snapshot is automatically released. This parameter takes effect when "InstantAccess = true. Unit: days. Valid values: 1 to 65535. The default value is the same as the value of the "RetentionDays" parameter.
         */
        public Builder instantAccessRetentionDays(Integer instantAccessRetentionDays) {
            this.putQueryParameter("InstantAccessRetentionDays", instantAccessRetentionDays);
            this.instantAccessRetentionDays = instantAccessRetentionDays;
            return this;
        }

        /**
         * The retention period of the snapshot. Unit: days. Snapshots are automatically released after the retention period expires. Valid values: 1 to 65536.
         * <p>
         * 
         * Default value: null, indicating that snapshots are not automatically released.
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * The name of the snapshot. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         * <p>
         * 
         * To prevent conflicts with the name of an automatic snapshot, it cannot start with auto.
         */
        public Builder snapshotName(String snapshotName) {
            this.putQueryParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * Specifies whether to enable quick snapshot availability. Valid values:
         * <p>
         * -true: enabled. Only ESSDS support this feature.
         * -false: disabled. Create a normal snapshot.
         * 
         * Default value: false
         * 
         * > This parameter and the "categore" parameter cannot be passed at the same time. For more information, see API description.
         */
        public Builder instantAccess(Boolean instantAccess) {
            this.putQueryParameter("InstantAccess", instantAccess);
            this.instantAccess = instantAccess;
            return this;
        }

        @Override
        public CreateSnapshotRequest build() {
            return new CreateSnapshotRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("Value")
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
             * 快照的标签键。
             * <p>
             * 
             * >  为提高兼容性，建议您尽量使用Tag.N.Key参数。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 快照的标签值。N的取值范围：1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以acs:开头，不能包含http://或者https://。
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
