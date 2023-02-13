// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoSnapshotPolicyExResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoSnapshotPolicyExResponseBody</p>
 */
public class DescribeAutoSnapshotPolicyExResponseBody extends TeaModel {
    @NameInMap("AutoSnapshotPolicies")
    private AutoSnapshotPolicies autoSnapshotPolicies;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAutoSnapshotPolicyExResponseBody(Builder builder) {
        this.autoSnapshotPolicies = builder.autoSnapshotPolicies;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoSnapshotPolicyExResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoSnapshotPolicies
     */
    public AutoSnapshotPolicies getAutoSnapshotPolicies() {
        return this.autoSnapshotPolicies;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private AutoSnapshotPolicies autoSnapshotPolicies; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the automatic snapshot policies.
         */
        public Builder autoSnapshotPolicies(AutoSnapshotPolicies autoSnapshotPolicies) {
            this.autoSnapshotPolicies = autoSnapshotPolicies;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of automatic snapshot policies.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAutoSnapshotPolicyExResponseBody build() {
            return new DescribeAutoSnapshotPolicyExResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The tag key of the automatic snapshot policy.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value of the automatic snapshot policy.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class AutoSnapshotPolicy extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("AutoSnapshotPolicyName")
        private String autoSnapshotPolicyName;

        @NameInMap("CopiedSnapshotsRetentionDays")
        private Integer copiedSnapshotsRetentionDays;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DiskNums")
        private Integer diskNums;

        @NameInMap("EnableCrossRegionCopy")
        private Boolean enableCrossRegionCopy;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RepeatWeekdays")
        private String repeatWeekdays;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("RetentionDays")
        private Integer retentionDays;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("TargetCopyRegions")
        private String targetCopyRegions;

        @NameInMap("TimePoints")
        private String timePoints;

        @NameInMap("VolumeNums")
        private Integer volumeNums;

        private AutoSnapshotPolicy(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.autoSnapshotPolicyName = builder.autoSnapshotPolicyName;
            this.copiedSnapshotsRetentionDays = builder.copiedSnapshotsRetentionDays;
            this.creationTime = builder.creationTime;
            this.diskNums = builder.diskNums;
            this.enableCrossRegionCopy = builder.enableCrossRegionCopy;
            this.regionId = builder.regionId;
            this.repeatWeekdays = builder.repeatWeekdays;
            this.resourceGroupId = builder.resourceGroupId;
            this.retentionDays = builder.retentionDays;
            this.status = builder.status;
            this.tags = builder.tags;
            this.targetCopyRegions = builder.targetCopyRegions;
            this.timePoints = builder.timePoints;
            this.volumeNums = builder.volumeNums;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoSnapshotPolicy create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return autoSnapshotPolicyName
         */
        public String getAutoSnapshotPolicyName() {
            return this.autoSnapshotPolicyName;
        }

        /**
         * @return copiedSnapshotsRetentionDays
         */
        public Integer getCopiedSnapshotsRetentionDays() {
            return this.copiedSnapshotsRetentionDays;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return diskNums
         */
        public Integer getDiskNums() {
            return this.diskNums;
        }

        /**
         * @return enableCrossRegionCopy
         */
        public Boolean getEnableCrossRegionCopy() {
            return this.enableCrossRegionCopy;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repeatWeekdays
         */
        public String getRepeatWeekdays() {
            return this.repeatWeekdays;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return retentionDays
         */
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return targetCopyRegions
         */
        public String getTargetCopyRegions() {
            return this.targetCopyRegions;
        }

        /**
         * @return timePoints
         */
        public String getTimePoints() {
            return this.timePoints;
        }

        /**
         * @return volumeNums
         */
        public Integer getVolumeNums() {
            return this.volumeNums;
        }

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private String autoSnapshotPolicyName; 
            private Integer copiedSnapshotsRetentionDays; 
            private String creationTime; 
            private Integer diskNums; 
            private Boolean enableCrossRegionCopy; 
            private String regionId; 
            private String repeatWeekdays; 
            private String resourceGroupId; 
            private Integer retentionDays; 
            private String status; 
            private Tags tags; 
            private String targetCopyRegions; 
            private String timePoints; 
            private Integer volumeNums; 

            /**
             * The ID of the automatic snapshot policy.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * The name of the automatic snapshot policy.
             */
            public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
                this.autoSnapshotPolicyName = autoSnapshotPolicyName;
                return this;
            }

            /**
             * >  This parameter is in invitational preview and unavailable for general users.
             */
            public Builder copiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
                this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
                return this;
            }

            /**
             * The time when the automatic snapshot policy was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The number of disks to which the automatic snapshot policy is applied.
             */
            public Builder diskNums(Integer diskNums) {
                this.diskNums = diskNums;
                return this;
            }

            /**
             * >  This parameter is in invitational preview and unavailable for general users.
             */
            public Builder enableCrossRegionCopy(Boolean enableCrossRegionCopy) {
                this.enableCrossRegionCopy = enableCrossRegionCopy;
                return this;
            }

            /**
             * The region ID of the automatic snapshot policy.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The days of the week on which to create automatic snapshots. Valid values: 1 to 7, which correspond to the days of the week. 1 indicates Monday. One or more days can be specified.
             */
            public Builder repeatWeekdays(String repeatWeekdays) {
                this.repeatWeekdays = repeatWeekdays;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The retention period of the automatic snapshot. Unit: days. Valid values:
             * <p>
             * 
             * *   \-1: The automatic snapshot is retained until it is deleted.
             * *   1 to 65536: The automatic snapshot is retained for the specified number of days.
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * The state of the automatic snapshot policy. Valid values:
             * <p>
             * 
             * *   Normal: The automatic snapshot policy is normal.
             * *   Expire: The automatic snapshot policy cannot be used because your account has overdue payments.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags of the automatic snapshot policy.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * >  This parameter is in invitational preview and unavailable for general users.
             */
            public Builder targetCopyRegions(String targetCopyRegions) {
                this.targetCopyRegions = targetCopyRegions;
                return this;
            }

            /**
             * The points in time of the day at which to create automatic snapshots.
             * <p>
             * 
             * The time is displayed in UTC+8. Unit: hours. Valid values are 0 to 23, which correspond to the 24 points in time on the hour from 00:00:00 to 23:00:00. 1 indicates 01:00:00. Multiple points in time can be specified.
             * 
             * The parameter value is a JSON array that contains up to 24 points in time separated by commas (,). Example: `["0", "1", ... "23"]`.
             */
            public Builder timePoints(String timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            /**
             * The number of extended volumes to which the automatic snapshot policy is applied.
             */
            public Builder volumeNums(Integer volumeNums) {
                this.volumeNums = volumeNums;
                return this;
            }

            public AutoSnapshotPolicy build() {
                return new AutoSnapshotPolicy(this);
            } 

        } 

    }
    public static class AutoSnapshotPolicies extends TeaModel {
        @NameInMap("AutoSnapshotPolicy")
        private java.util.List < AutoSnapshotPolicy> autoSnapshotPolicy;

        private AutoSnapshotPolicies(Builder builder) {
            this.autoSnapshotPolicy = builder.autoSnapshotPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoSnapshotPolicies create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicy
         */
        public java.util.List < AutoSnapshotPolicy> getAutoSnapshotPolicy() {
            return this.autoSnapshotPolicy;
        }

        public static final class Builder {
            private java.util.List < AutoSnapshotPolicy> autoSnapshotPolicy; 

            /**
             * AutoSnapshotPolicy.
             */
            public Builder autoSnapshotPolicy(java.util.List < AutoSnapshotPolicy> autoSnapshotPolicy) {
                this.autoSnapshotPolicy = autoSnapshotPolicy;
                return this;
            }

            public AutoSnapshotPolicies build() {
                return new AutoSnapshotPolicies(this);
            } 

        } 

    }
}
