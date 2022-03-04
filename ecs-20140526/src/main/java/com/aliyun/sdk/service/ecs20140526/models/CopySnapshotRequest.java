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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("DestinationRegionId")
    @Validation(required = true)
    private String destinationRegionId;

    @Query
    @NameInMap("SnapshotId")
    @Validation(required = true)
    private String snapshotId;

    @Query
    @NameInMap("DestinationSnapshotDescription")
    @Validation(required = true)
    private String destinationSnapshotDescription;

    @Query
    @NameInMap("RetentionDays")
    private Integer retentionDays;

    @Query
    @NameInMap("DestinationSnapshotName")
    @Validation(required = true)
    private String destinationSnapshotName;

    private CopySnapshotRequest(Builder builder) {
        super(builder);
        this.tag = builder.tag;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.regionId = builder.regionId;
        this.destinationRegionId = builder.destinationRegionId;
        this.snapshotId = builder.snapshotId;
        this.destinationSnapshotDescription = builder.destinationSnapshotDescription;
        this.retentionDays = builder.retentionDays;
        this.destinationSnapshotName = builder.destinationSnapshotName;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return destinationRegionId
     */
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return destinationSnapshotDescription
     */
    public String getDestinationSnapshotDescription() {
        return this.destinationSnapshotDescription;
    }

    /**
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return destinationSnapshotName
     */
    public String getDestinationSnapshotName() {
        return this.destinationSnapshotName;
    }

    public static final class Builder extends Request.Builder<CopySnapshotRequest, Builder> {
        private java.util.List < Tag> tag; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceGroupId; 
        private String regionId; 
        private String destinationRegionId; 
        private String snapshotId; 
        private String destinationSnapshotDescription; 
        private Integer retentionDays; 
        private String destinationSnapshotName; 

        private Builder() {
            super();
        } 

        private Builder(CopySnapshotRequest request) {
            super(request);
            this.tag = request.tag;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceGroupId = request.resourceGroupId;
            this.regionId = request.regionId;
            this.destinationRegionId = request.destinationRegionId;
            this.snapshotId = request.snapshotId;
            this.destinationSnapshotDescription = request.destinationSnapshotDescription;
            this.retentionDays = request.retentionDays;
            this.destinationSnapshotName = request.destinationSnapshotName;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The region of the source snapshot. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The ID of the source snapshot.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The description of the new snapshot. The description must be 2 to 256 characters in length and cannot start with http:// or https.
         * <p>
         * 
         * Default value: Null.
         */
        public Builder destinationSnapshotDescription(String destinationSnapshotDescription) {
            this.putQueryParameter("DestinationSnapshotDescription", destinationSnapshotDescription);
            this.destinationSnapshotDescription = destinationSnapshotDescription;
            return this;
        }

        /**
         * The retention period of a new snapshot. Unit: Days. Snapshots are automatically released after expiration. Valid values: 1 to 65536.
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
         * The name of the new snapshot. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         * <p>
         * 
         * Default value: Null.
         */
        public Builder destinationSnapshotName(String destinationSnapshotName) {
            this.putQueryParameter("DestinationSnapshotName", destinationSnapshotName);
            this.destinationSnapshotName = destinationSnapshotName;
            return this;
        }

        @Override
        public CopySnapshotRequest build() {
            return new CopySnapshotRequest(this);
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
             * 新快照的标签键。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以aliyun和acs:开头，不能包含http://或者https://。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 新快照的标签值。一旦传入该值，允许为空字符串。最多支持128个字符，不能以aliyun和acs:开头，不能包含http://或者https://。
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
