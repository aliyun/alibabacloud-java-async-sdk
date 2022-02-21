// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSnapshotGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateSnapshotGroupRequest</p>
 */
public class CreateSnapshotGroupRequest extends Request {
    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstantAccess")
    private Boolean instantAccess;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("DiskId")
    private java.util.List < String > diskId;

    @Query
    @NameInMap("InstantAccessRetentionDays")
    private Integer instantAccessRetentionDays;

    @Query
    @NameInMap("ExcludeDiskId")
    private java.util.List < String > excludeDiskId;

    private CreateSnapshotGroupRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.description = builder.description;
        this.instantAccess = builder.instantAccess;
        this.resourceGroupId = builder.resourceGroupId;
        this.name = builder.name;
        this.diskId = builder.diskId;
        this.instantAccessRetentionDays = builder.instantAccessRetentionDays;
        this.excludeDiskId = builder.excludeDiskId;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instantAccess
     */
    public Boolean getInstantAccess() {
        return this.instantAccess;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return diskId
     */
    public java.util.List < String > getDiskId() {
        return this.diskId;
    }

    /**
     * @return instantAccessRetentionDays
     */
    public Integer getInstantAccessRetentionDays() {
        return this.instantAccessRetentionDays;
    }

    /**
     * @return excludeDiskId
     */
    public java.util.List < String > getExcludeDiskId() {
        return this.excludeDiskId;
    }

    public static final class Builder extends Request.Builder<CreateSnapshotGroupRequest, Builder> {
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private String regionId; 
        private String instanceId; 
        private String description; 
        private Boolean instantAccess; 
        private String resourceGroupId; 
        private String name; 
        private java.util.List < String > diskId; 
        private Integer instantAccessRetentionDays; 
        private java.util.List < String > excludeDiskId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSnapshotGroupRequest response) {
            super(response);
            this.resourceOwnerId = response.resourceOwnerId;
            this.tag = response.tag;
            this.regionId = response.regionId;
            this.instanceId = response.instanceId;
            this.description = response.description;
            this.instantAccess = response.instantAccess;
            this.resourceGroupId = response.resourceGroupId;
            this.name = response.name;
            this.diskId = response.diskId;
            this.instantAccessRetentionDays = response.instantAccessRetentionDays;
            this.excludeDiskId = response.excludeDiskId;
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
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The description. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to enable quick snapshot availability. Valid values:
         * <p>
         * 
         * -true: enabled.
         * -false: disabled.
         * 
         * Default value: false.
         */
        public Builder instantAccess(Boolean instantAccess) {
            this.putQueryParameter("InstantAccess", instantAccess);
            this.instantAccess = instantAccess;
            return this;
        }

        /**
         * The ID of the resource group to which the snapshot consistency group belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The name of the snapshot consistency group. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https://". It can contain numbers, periods (.), underscores (_), hyphens (-), or colons (:).
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the disk to which the snapshot consistency group is created. You can set multiple disk IDs across instances in the same zone. Valid values of N: 1 to 16. You can set a maximum of 16 disks with a total size of 32 TiB in a snapshot consistency group.
         * <p>
         * 
         * Note:
         * 
         * -This parameter cannot be set at the same time as "ExcludeDiskId.
         * -If "InstanceId" is set, this parameter can only be set to the disks attached to the specified instance. You can no longer set the IDs of disks across instances.
         */
        public Builder diskId(java.util.List < String > diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * Set the maximum available time of a snapshot. Unit: Days. Valid values: 1 to 65535.
         * <p>
         * 
         * This parameter takes effect only when "InstantAccess = true. The quick snapshot feature is automatically disabled upon expiration.
         * 
         * Default value: null, indicating that the snapshot release time is the same as that of the snapshot.
         */
        public Builder instantAccessRetentionDays(Integer instantAccessRetentionDays) {
            this.putQueryParameter("InstantAccessRetentionDays", instantAccessRetentionDays);
            this.instantAccessRetentionDays = instantAccessRetentionDays;
            return this;
        }

        /**
         * The ID of the disk to which you do not need to create snapshots. If the disk ID is specified, the created snapshot consistency group does not contain the corresponding snapshot of the disk. Valid values of N: 1 to 16.
         * <p>
         * 
         * Default value: null, indicating that snapshots are created for all cloud disks in the instance.
         * 
         * > This parameter cannot be set at the same time as "DiskId. 1.
         */
        public Builder excludeDiskId(java.util.List < String > excludeDiskId) {
            this.putQueryParameter("ExcludeDiskId", excludeDiskId);
            this.excludeDiskId = excludeDiskId;
            return this;
        }

        @Override
        public CreateSnapshotGroupRequest build() {
            return new CreateSnapshotGroupRequest(this);
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
             * 快照一致性组的标签键。N的取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以`aliyun`或`acs:`开头，不能包含`http://`或`https://`。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 快照一致性组的标签值。N的取值范围：1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以`acs:`开头，不能包含`http://`或`https://`。
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
