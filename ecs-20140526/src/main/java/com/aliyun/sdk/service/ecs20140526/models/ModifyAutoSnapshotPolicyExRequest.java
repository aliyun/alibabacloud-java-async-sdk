// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAutoSnapshotPolicyExRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoSnapshotPolicyExRequest</p>
 */
public class ModifyAutoSnapshotPolicyExRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("autoSnapshotPolicyName")
    private String autoSnapshotPolicyName;

    @Query
    @NameInMap("retentionDays")
    private Integer retentionDays;

    @Query
    @NameInMap("TargetCopyRegions")
    private String targetCopyRegions;

    @Query
    @NameInMap("regionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("autoSnapshotPolicyId")
    @Validation(required = true)
    private String autoSnapshotPolicyId;

    @Query
    @NameInMap("EnableCrossRegionCopy")
    private Boolean enableCrossRegionCopy;

    @Query
    @NameInMap("timePoints")
    private String timePoints;

    @Query
    @NameInMap("CopiedSnapshotsRetentionDays")
    private Integer copiedSnapshotsRetentionDays;

    @Query
    @NameInMap("repeatWeekdays")
    private String repeatWeekdays;

    private ModifyAutoSnapshotPolicyExRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.autoSnapshotPolicyName = builder.autoSnapshotPolicyName;
        this.retentionDays = builder.retentionDays;
        this.targetCopyRegions = builder.targetCopyRegions;
        this.regionId = builder.regionId;
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.enableCrossRegionCopy = builder.enableCrossRegionCopy;
        this.timePoints = builder.timePoints;
        this.copiedSnapshotsRetentionDays = builder.copiedSnapshotsRetentionDays;
        this.repeatWeekdays = builder.repeatWeekdays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoSnapshotPolicyExRequest create() {
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
     * @return autoSnapshotPolicyName
     */
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    /**
     * @return enableCrossRegionCopy
     */
    public Boolean getEnableCrossRegionCopy() {
        return this.enableCrossRegionCopy;
    }

    /**
     * @return timePoints
     */
    public String getTimePoints() {
        return this.timePoints;
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

    public static final class Builder extends Request.Builder<ModifyAutoSnapshotPolicyExRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String autoSnapshotPolicyName; 
        private Integer retentionDays; 
        private String targetCopyRegions; 
        private String regionId; 
        private String autoSnapshotPolicyId; 
        private Boolean enableCrossRegionCopy; 
        private String timePoints; 
        private Integer copiedSnapshotsRetentionDays; 
        private String repeatWeekdays; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoSnapshotPolicyExRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.autoSnapshotPolicyName = request.autoSnapshotPolicyName;
            this.retentionDays = request.retentionDays;
            this.targetCopyRegions = request.targetCopyRegions;
            this.regionId = request.regionId;
            this.autoSnapshotPolicyId = request.autoSnapshotPolicyId;
            this.enableCrossRegionCopy = request.enableCrossRegionCopy;
            this.timePoints = request.timePoints;
            this.copiedSnapshotsRetentionDays = request.copiedSnapshotsRetentionDays;
            this.repeatWeekdays = request.repeatWeekdays;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The name of the automatic snapshot policy. If the parameter is empty, the parameter is not modified.
         */
        public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
            this.putQueryParameter("autoSnapshotPolicyName", autoSnapshotPolicyName);
            this.autoSnapshotPolicyName = autoSnapshotPolicyName;
            return this;
        }

        /**
         * The retention period of the automatic snapshot. Unit: days. Valid values:
         * <p>
         * 
         * -- 1: permanently saved.
         * -1 to 65536: specify the retention period.
         * 
         * Default value: -1.
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
         * The region ID of the automatic snapshot policy. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the target automatic snapshot policy. You can call [DescribeAutoSnapshotPolicyEx](~~ 25530 ~~) to view the available automatic snapshot policies.
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.putQueryParameter("autoSnapshotPolicyId", autoSnapshotPolicyId);
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * Indicates whether automatic cross-region replication is allowed.
         * <p>
         * 
         * -true: yes.
         * -false: this parameter is not allowed.
         */
        public Builder enableCrossRegionCopy(Boolean enableCrossRegionCopy) {
            this.putQueryParameter("EnableCrossRegionCopy", enableCrossRegionCopy);
            this.enableCrossRegionCopy = enableCrossRegionCopy;
            return this;
        }

        /**
         * The time when the automatic snapshot was created. Use UTC +8. Unit: Hour. Valid values: 0 to 23. Valid values: 00:00 to 23:00. For example, 1 indicates 01:00.
         * <p>
         * 
         * When you need to create multiple automatic snapshots in a day, you can specify multiple time points:
         * 
         * -A maximum of 24 time points can be entered.
         * -Use a format similar to ""0", "1",... A JSON array of "23" ". Separate time points with commas (,).
         */
        public Builder timePoints(String timePoints) {
            this.putQueryParameter("timePoints", timePoints);
            this.timePoints = timePoints;
            return this;
        }

        /**
         * The retention period of a cross-region snapshot. Unit: days. Valid values:
         * <p>
         * 
         * -- 1: permanently saved.
         * -1 to 65535: specify the retention period.
         * 
         * Default value: -1.
         */
        public Builder copiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
            this.putQueryParameter("CopiedSnapshotsRetentionDays", copiedSnapshotsRetentionDays);
            this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
            return this;
        }

        /**
         * The duplicate date of the automatic snapshot. Unit: Day. Cycle: week. Valid values: 1 to 7. For example, 1 indicates Monday.
         * <p>
         * 
         * When you need to create multiple automatic snapshots in a week, you can specify multiple time points:
         * 
         * -A maximum of seven time points can be entered.
         * -Use a format similar to ""1", "2",... A JSON array of "7". Separate time points with commas (,).
         */
        public Builder repeatWeekdays(String repeatWeekdays) {
            this.putQueryParameter("repeatWeekdays", repeatWeekdays);
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }

        @Override
        public ModifyAutoSnapshotPolicyExRequest build() {
            return new ModifyAutoSnapshotPolicyExRequest(this);
        } 

    } 

}
