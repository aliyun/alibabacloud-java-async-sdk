// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopySnapshotRequest} extends {@link RequestModel}
 *
 * <p>CopySnapshotRequest</p>
 */
public class CopySnapshotRequest extends Request {
    @Query
    @NameInMap("Arn")
    private java.util.List < Arn> arn;

    @Query
    @NameInMap("DestinationRegionId")
    @Validation(required = true)
    private String destinationRegionId;

    @Query
    @NameInMap("DestinationSnapshotDescription")
    @Validation(required = true)
    private String destinationSnapshotDescription;

    @Query
    @NameInMap("DestinationSnapshotName")
    @Validation(required = true)
    private String destinationSnapshotName;

    @Query
    @NameInMap("Encrypted")
    private Boolean encrypted;

    @Query
    @NameInMap("KMSKeyId")
    private String KMSKeyId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RetentionDays")
    private Integer retentionDays;

    @Query
    @NameInMap("SnapshotId")
    @Validation(required = true)
    private String snapshotId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CopySnapshotRequest(Builder builder) {
        super(builder);
        this.arn = builder.arn;
        this.destinationRegionId = builder.destinationRegionId;
        this.destinationSnapshotDescription = builder.destinationSnapshotDescription;
        this.destinationSnapshotName = builder.destinationSnapshotName;
        this.encrypted = builder.encrypted;
        this.KMSKeyId = builder.KMSKeyId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retentionDays = builder.retentionDays;
        this.snapshotId = builder.snapshotId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopySnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arn
     */
    public java.util.List < Arn> getArn() {
        return this.arn;
    }

    /**
     * @return destinationRegionId
     */
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    /**
     * @return destinationSnapshotDescription
     */
    public String getDestinationSnapshotDescription() {
        return this.destinationSnapshotDescription;
    }

    /**
     * @return destinationSnapshotName
     */
    public String getDestinationSnapshotName() {
        return this.destinationSnapshotName;
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
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CopySnapshotRequest, Builder> {
        private java.util.List < Arn> arn; 
        private String destinationRegionId; 
        private String destinationSnapshotDescription; 
        private String destinationSnapshotName; 
        private Boolean encrypted; 
        private String KMSKeyId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer retentionDays; 
        private String snapshotId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CopySnapshotRequest request) {
            super(request);
            this.arn = request.arn;
            this.destinationRegionId = request.destinationRegionId;
            this.destinationSnapshotDescription = request.destinationSnapshotDescription;
            this.destinationSnapshotName = request.destinationSnapshotName;
            this.encrypted = request.encrypted;
            this.KMSKeyId = request.KMSKeyId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.retentionDays = request.retentionDays;
            this.snapshotId = request.snapshotId;
            this.tag = request.tag;
        } 

        /**
         * > This parameter is currently in invitational preview and unavailable for public use.
         */
        public Builder arn(java.util.List < Arn> arn) {
            this.putQueryParameter("Arn", arn);
            this.arn = arn;
            return this;
        }

        /**
         * The region ID of the new snapshot.
         */
        public Builder destinationRegionId(String destinationRegionId) {
            this.putQueryParameter("DestinationRegionId", destinationRegionId);
            this.destinationRegionId = destinationRegionId;
            return this;
        }

        /**
         * The description of the new snapshot. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         * <p>
         * 
         * This parameter is empty by default.
         */
        public Builder destinationSnapshotDescription(String destinationSnapshotDescription) {
            this.putQueryParameter("DestinationSnapshotDescription", destinationSnapshotDescription);
            this.destinationSnapshotDescription = destinationSnapshotDescription;
            return this;
        }

        /**
         * The name of the new snapshot. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
         * <p>
         * 
         * This parameter is empty by default.
         */
        public Builder destinationSnapshotName(String destinationSnapshotName) {
            this.putQueryParameter("DestinationSnapshotName", destinationSnapshotName);
            this.destinationSnapshotName = destinationSnapshotName;
            return this;
        }

        /**
         * Specifies whether to encrypt the disk. Valid values:
         * <p>
         * 
         * *   true: encrypts the disk.
         * *   false: does not encrypt the disk.
         * 
         * Default value: false.
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * The customer master keys (CMK) managed by Key Management Service (KMS) in the destination region.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
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
         * The region ID of the source snapshot. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * This parameter is unavailable.
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
         * The retention period of the new snapshot. Unit: days. The new snapshot is automatically released when its retention period ends. Valid values: 1 to 65536.
         * <p>
         * 
         * This parameter is empty by default, which indicates that the snapshot is not automatically released.
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * The ID of the source snapshot.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The tag key and value of the new snapshot.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CopySnapshotRequest build() {
            return new CopySnapshotRequest(this);
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
             * > This parameter is unavailable.
             */
            public Builder assumeRoleFor(Long assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * > This parameter is unavailable.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * > This parameter is unavailable.
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
    public static class Tag extends TeaModel {
        @NameInMap("Key")
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
             * The key of tag N to add to the new snapshot. The tag key cannot be an empty string. The tag key must be 1 to 128 characters in length. The tag key cannot start with acs: or aliyun or contain http:// or https://.[](http://https://。)
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N to add to the new snapshot. The tag value can be an empty string. The tag key must be 1 to 128 characters in length. The tag key cannot start with `acs:` or `aliyun` or contain `http://` or `https://`.
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
