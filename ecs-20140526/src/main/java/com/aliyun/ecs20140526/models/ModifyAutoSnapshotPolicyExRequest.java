// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("EnableCrossRegionCopy")
    private Boolean enableCrossRegionCopy;

    @Query
    @NameInMap("TargetCopyRegions")
    private String targetCopyRegions;

    @Query
    @NameInMap("CopiedSnapshotsRetentionDays")
    private Integer copiedSnapshotsRetentionDays;

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
    @NameInMap("regionId")
    private String regionId;

    @Query
    @NameInMap("timePoints")
    private String timePoints;

    @Query
    @NameInMap("autoSnapshotPolicyName")
    private String autoSnapshotPolicyName;

    @Query
    @NameInMap("autoSnapshotPolicyId")
    private String autoSnapshotPolicyId;

    @Query
    @NameInMap("retentionDays")
    private Integer retentionDays;

    @Query
    @NameInMap("repeatWeekdays")
    private String repeatWeekdays;

    private ModifyAutoSnapshotPolicyExRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.enableCrossRegionCopy = builder.enableCrossRegionCopy;
        this.targetCopyRegions = builder.targetCopyRegions;
        this.copiedSnapshotsRetentionDays = builder.copiedSnapshotsRetentionDays;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.timePoints = builder.timePoints;
        this.autoSnapshotPolicyName = builder.autoSnapshotPolicyName;
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.retentionDays = builder.retentionDays;
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
     * @return enableCrossRegionCopy
     */
    public Boolean getEnableCrossRegionCopy() {
        return this.enableCrossRegionCopy;
    }

    /**
     * @return targetCopyRegions
     */
    public String getTargetCopyRegions() {
        return this.targetCopyRegions;
    }

    /**
     * @return copiedSnapshotsRetentionDays
     */
    public Integer getCopiedSnapshotsRetentionDays() {
        return this.copiedSnapshotsRetentionDays;
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
     * @return autoSnapshotPolicyName
     */
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    /**
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    /**
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return repeatWeekdays
     */
    public String getRepeatWeekdays() {
        return this.repeatWeekdays;
    }

    public static final class Builder extends Request.Builder<ModifyAutoSnapshotPolicyExRequest, Builder> {
        private String sourceRegionId; 
        private Boolean enableCrossRegionCopy; 
        private String targetCopyRegions; 
        private Integer copiedSnapshotsRetentionDays; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String timePoints; 
        private String autoSnapshotPolicyName; 
        private String autoSnapshotPolicyId; 
        private Integer retentionDays; 
        private String repeatWeekdays; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoSnapshotPolicyExRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.enableCrossRegionCopy = response.enableCrossRegionCopy;
            this.targetCopyRegions = response.targetCopyRegions;
            this.copiedSnapshotsRetentionDays = response.copiedSnapshotsRetentionDays;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.timePoints = response.timePoints;
            this.autoSnapshotPolicyName = response.autoSnapshotPolicyName;
            this.autoSnapshotPolicyId = response.autoSnapshotPolicyId;
            this.retentionDays = response.retentionDays;
            this.repeatWeekdays = response.repeatWeekdays;
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
         * EnableCrossRegionCopy.
         */
        public Builder enableCrossRegionCopy(Boolean enableCrossRegionCopy) {
            this.putQueryParameter("EnableCrossRegionCopy", enableCrossRegionCopy);
            this.enableCrossRegionCopy = enableCrossRegionCopy;
            return this;
        }

        /**
         * TargetCopyRegions.
         */
        public Builder targetCopyRegions(String targetCopyRegions) {
            this.putQueryParameter("TargetCopyRegions", targetCopyRegions);
            this.targetCopyRegions = targetCopyRegions;
            return this;
        }

        /**
         * CopiedSnapshotsRetentionDays.
         */
        public Builder copiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
            this.putQueryParameter("CopiedSnapshotsRetentionDays", copiedSnapshotsRetentionDays);
            this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
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
         * Automatic snapshot policy where the geographical ID. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The time when the automatic snapshot was created. Use the UTC +8 time in hours. Value range: 0~23, representative 00:00 to 23:00 we found 24 time points, such as 1 said 01:00. When in one day need to create multi-Times automatic snapshot, you can pass multiple point-in-time:
         * <p>
         * 
         * -Most incoming 24 a point in time.
         * -Multiple point-in-time for a format similar "" 0 ", "1 ",... "23" "JSON Array representation, time between separate them with commas (,).
         */
        public Builder timePoints(String timePoints) {
            this.putQueryParameter("timePoints", timePoints);
            this.timePoints = timePoints;
            return this;
        }

        /**
         * Automatic snapshot policy name. If the parameter is empty representative not modified.
         */
        public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
            this.putQueryParameter("autoSnapshotPolicyName", autoSnapshotPolicyName);
            this.autoSnapshotPolicyName = autoSnapshotPolicyName;
            return this;
        }

        /**
         * The ID of the target automatic snapshot policy. You can call the [DescribeAutoSnapshotPolicyEx](~~ 25530 ~~) see your available automatic snapshot policy.
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.putQueryParameter("autoSnapshotPolicyId", autoSnapshotPolicyId);
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * The retention period of the automatic snapshot. Unit: days. Valid values:
         * <p>
         * 
         * -1 (default): permanent save.
         * -1~65536: specify the save days.
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("retentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * Automatic snapshot the repeat date, in days, cycle for the week. Value range: 1~7, such as 1 said Monday. When in a week need to create multi-Times automatic snapshot, you can pass multiple point-in-time:
         * <p>
         * 
         * -Most incoming 7 a point in time.
         * -Multiple point-in-time for a format like ""1", "2",... "7" "JSON Array representation, time between separate them with commas (,).
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
