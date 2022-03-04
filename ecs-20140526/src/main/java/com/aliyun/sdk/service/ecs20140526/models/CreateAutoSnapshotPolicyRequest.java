// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoSnapshotPolicyRequest</p>
 */
public class CreateAutoSnapshotPolicyRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("regionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("timePoints")
    @Validation(required = true)
    private String timePoints;

    @Query
    @NameInMap("retentionDays")
    @Validation(required = true)
    private Integer retentionDays;

    @Query
    @NameInMap("TargetCopyRegions")
    private String targetCopyRegions;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("EnableCrossRegionCopy")
    private Boolean enableCrossRegionCopy;

    @Query
    @NameInMap("CopiedSnapshotsRetentionDays")
    private Integer copiedSnapshotsRetentionDays;

    @Query
    @NameInMap("repeatWeekdays")
    @Validation(required = true)
    private String repeatWeekdays;

    @Query
    @NameInMap("autoSnapshotPolicyName")
    private String autoSnapshotPolicyName;

    private CreateAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.timePoints = builder.timePoints;
        this.retentionDays = builder.retentionDays;
        this.targetCopyRegions = builder.targetCopyRegions;
        this.tag = builder.tag;
        this.resourceGroupId = builder.resourceGroupId;
        this.enableCrossRegionCopy = builder.enableCrossRegionCopy;
        this.copiedSnapshotsRetentionDays = builder.copiedSnapshotsRetentionDays;
        this.repeatWeekdays = builder.repeatWeekdays;
        this.autoSnapshotPolicyName = builder.autoSnapshotPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoSnapshotPolicyRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return timePoints
     */
    public String getTimePoints() {
        return this.timePoints;
    }

    /**
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return targetCopyRegions
     */
    public String getTargetCopyRegions() {
        return this.targetCopyRegions;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return enableCrossRegionCopy
     */
    public Boolean getEnableCrossRegionCopy() {
        return this.enableCrossRegionCopy;
    }

    /**
     * @return copiedSnapshotsRetentionDays
     */
    public Integer getCopiedSnapshotsRetentionDays() {
        return this.copiedSnapshotsRetentionDays;
    }

    /**
     * @return repeatWeekdays
     */
    public String getRepeatWeekdays() {
        return this.repeatWeekdays;
    }

    /**
     * @return autoSnapshotPolicyName
     */
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    public static final class Builder extends Request.Builder<CreateAutoSnapshotPolicyRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String timePoints; 
        private Integer retentionDays; 
        private String targetCopyRegions; 
        private java.util.List < Tag> tag; 
        private String resourceGroupId; 
        private Boolean enableCrossRegionCopy; 
        private Integer copiedSnapshotsRetentionDays; 
        private String repeatWeekdays; 
        private String autoSnapshotPolicyName; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutoSnapshotPolicyRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.timePoints = request.timePoints;
            this.retentionDays = request.retentionDays;
            this.targetCopyRegions = request.targetCopyRegions;
            this.tag = request.tag;
            this.resourceGroupId = request.resourceGroupId;
            this.enableCrossRegionCopy = request.enableCrossRegionCopy;
            this.copiedSnapshotsRetentionDays = request.copiedSnapshotsRetentionDays;
            this.repeatWeekdays = request.repeatWeekdays;
            this.autoSnapshotPolicyName = request.autoSnapshotPolicyName;
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
         * The ID of the Alibaba Cloud account (primary account).
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The region to which the automatic snapshot policy belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The time when the automatic snapshot was created. Use UTC +8. Unit: Hour. Valid values: 0 to 23. Valid values: 00:00 to 23:00. For example, 1 indicates 01:00. Format Description:
         * <p>
         * 
         * -The input parameters must remain in the JSON Array format. For example,["1"] indicates that automatic snapshots are created at 01:00.
         * -If you need to create multiple automatic snapshots in a day, you can specify multiple time points. Separate the time points with commas (,). You can specify a maximum of 24 time points. For example,["1","3", and "5"] indicate that automatic snapshots are created at 01:00, 03:00, and 05:00.
         */
        public Builder timePoints(String timePoints) {
            this.putQueryParameter("timePoints", timePoints);
            this.timePoints = timePoints;
            return this;
        }

        /**
         * The retention period of the automatic snapshot. Unit: days. Valid values:
         * <p>
         * 
         * -- 1: Permanently save
         * -1 to 65535: specify the retention period.
         * 
         * Default value:-1
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("retentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * Copy the destination region of the snapshot across regions. You can specify a region.
         */
        public Builder targetCopyRegions(String targetCopyRegions) {
            this.putQueryParameter("TargetCopyRegions", targetCopyRegions);
            this.targetCopyRegions = targetCopyRegions;
            return this;
        }

        /**
         * Tag list
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Indicates whether automatic cross-region replication is allowed.
         * <p>
         * -true: Yes
         * -false: not allowed
         */
        public Builder enableCrossRegionCopy(Boolean enableCrossRegionCopy) {
            this.putQueryParameter("EnableCrossRegionCopy", enableCrossRegionCopy);
            this.enableCrossRegionCopy = enableCrossRegionCopy;
            return this;
        }

        /**
         * The retention period of a cross-region snapshot. Unit: days. Valid values:
         * <p>
         * 
         * -- 1: Permanently save
         * -1 to 65535: specify the retention period.
         * 
         * Default value:-1
         */
        public Builder copiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
            this.putQueryParameter("CopiedSnapshotsRetentionDays", copiedSnapshotsRetentionDays);
            this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
            return this;
        }

        /**
         * The duplicate date of the automatic snapshot. Unit: Day. Cycle: week. Valid values: 1 to 7. For example, 1 indicates Monday. Format Description:
         * <p>
         * 
         * -The input parameters must remain in the JSON Array format. For example,["1"] indicates that automatic snapshots are created every Monday.
         * -If you need to create multiple automatic snapshots in a week, you can specify multiple time points. Separate the time points with commas (,). A maximum of seven time points can be entered. For example,["1","3","5"] indicates that automatic snapshots are created repeatedly every Monday, Wednesday, and Friday.
         */
        public Builder repeatWeekdays(String repeatWeekdays) {
            this.putQueryParameter("repeatWeekdays", repeatWeekdays);
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }

        /**
         * The name of the automatic snapshot policy. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         * <p>
         * 
         * Default value: Null.
         */
        public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
            this.putQueryParameter("autoSnapshotPolicyName", autoSnapshotPolicyName);
            this.autoSnapshotPolicyName = autoSnapshotPolicyName;
            return this;
        }

        @Override
        public CreateAutoSnapshotPolicyRequest build() {
            return new CreateAutoSnapshotPolicyRequest(this);
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
             * 快照的标签键。N的取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以aliyun或acs:开头，不能包含http://或https://。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 快照的标签值。N的取值范围：1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以acs:开头，不能包含http://或https://。
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
