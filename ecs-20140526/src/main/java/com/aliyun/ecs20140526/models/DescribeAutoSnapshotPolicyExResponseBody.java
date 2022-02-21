// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("AutoSnapshotPolicies")
    private AutoSnapshotPolicies autoSnapshotPolicies;

    private DescribeAutoSnapshotPolicyExResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.autoSnapshotPolicies = builder.autoSnapshotPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoSnapshotPolicyExResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return autoSnapshotPolicies
     */
    public AutoSnapshotPolicies getAutoSnapshotPolicies() {
        return this.autoSnapshotPolicies;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private AutoSnapshotPolicies autoSnapshotPolicies; 

        /**
         * The number of rows per page for the returned automatic snapshot policy.
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
         * The page number of the automatic snapshot policy list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of automatic snapshot policies.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Automatic snapshot policy details AutoSnapshotPolicy collection.
         */
        public Builder autoSnapshotPolicies(AutoSnapshotPolicies autoSnapshotPolicies) {
            this.autoSnapshotPolicies = autoSnapshotPolicies;
            return this;
        }

        public DescribeAutoSnapshotPolicyExResponseBody build() {
            return new DescribeAutoSnapshotPolicyExResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagKey")
        private String tagKey;

        private Tag(Builder builder) {
            this.tagValue = builder.tagValue;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private String tagValue; 
            private String tagKey; 

            /**
             * The tag value of the automatic snapshot policy.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The tag key of the automatic snapshot policy.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
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
        @NameInMap("TimePoints")
        private String timePoints;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("AutoSnapshotPolicyName")
        private String autoSnapshotPolicyName;

        @NameInMap("TargetCopyRegions")
        private String targetCopyRegions;

        @NameInMap("CopiedSnapshotsRetentionDays")
        private Integer copiedSnapshotsRetentionDays;

        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("RetentionDays")
        private Integer retentionDays;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("DiskNums")
        private Integer diskNums;

        @NameInMap("EnableCrossRegionCopy")
        private Boolean enableCrossRegionCopy;

        @NameInMap("RepeatWeekdays")
        private String repeatWeekdays;

        @NameInMap("VolumeNums")
        private Integer volumeNums;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tags")
        private Tags tags;

        private AutoSnapshotPolicy(Builder builder) {
            this.timePoints = builder.timePoints;
            this.creationTime = builder.creationTime;
            this.status = builder.status;
            this.autoSnapshotPolicyName = builder.autoSnapshotPolicyName;
            this.targetCopyRegions = builder.targetCopyRegions;
            this.copiedSnapshotsRetentionDays = builder.copiedSnapshotsRetentionDays;
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.retentionDays = builder.retentionDays;
            this.regionId = builder.regionId;
            this.diskNums = builder.diskNums;
            this.enableCrossRegionCopy = builder.enableCrossRegionCopy;
            this.repeatWeekdays = builder.repeatWeekdays;
            this.volumeNums = builder.volumeNums;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoSnapshotPolicy create() {
            return builder().build();
        }

        /**
         * @return timePoints
         */
        public String getTimePoints() {
            return this.timePoints;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return autoSnapshotPolicyName
         */
        public String getAutoSnapshotPolicyName() {
            return this.autoSnapshotPolicyName;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return repeatWeekdays
         */
        public String getRepeatWeekdays() {
            return this.repeatWeekdays;
        }

        /**
         * @return volumeNums
         */
        public Integer getVolumeNums() {
            return this.volumeNums;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String timePoints; 
            private String creationTime; 
            private String status; 
            private String autoSnapshotPolicyName; 
            private String targetCopyRegions; 
            private Integer copiedSnapshotsRetentionDays; 
            private String autoSnapshotPolicyId; 
            private Integer retentionDays; 
            private String regionId; 
            private Integer diskNums; 
            private Boolean enableCrossRegionCopy; 
            private String repeatWeekdays; 
            private Integer volumeNums; 
            private String resourceGroupId; 
            private Tags tags; 

            /**
             * The time when the automatic snapshot was created.
             * <p>
             * 
             * Use UTC +8. Unit: Hour. From 00:00~23:00 we found 24 time points optional, parameter is 0~23 Digital, such as: 1 dai table in 01:00 point in time. You can select multiple time points.
             * 
             * The passed parameters are in the JSON Array format: "["0", "1", "23"]", with a maximum of 24 time points, separated by commas (,).
             */
            public Builder timePoints(String timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            /**
             * The creation time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The status of the automatic snapshot policy. Possible values:
             * <p>
             * 
             * -Normal: Normal.
             * -Expire: the policy cannot be used due to overdue payments.
             */
            public Builder status(String status) {
                this.status = status;
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
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder targetCopyRegions(String targetCopyRegions) {
                this.targetCopyRegions = targetCopyRegions;
                return this;
            }

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder copiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
                this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
                return this;
            }

            /**
             * The ID of the automatic snapshot policy.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * The retention period of automatic snapshots. Unit: days. Possible values:
             * <p>
             * 
             * -- 1: Permanently save
             * -1 to 65536: specify the retention period.
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * The ID of the region to which the automatic snapshot policy belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of disks that have the policy enabled.
             */
            public Builder diskNums(Integer diskNums) {
                this.diskNums = diskNums;
                return this;
            }

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder enableCrossRegionCopy(Boolean enableCrossRegionCopy) {
                this.enableCrossRegionCopy = enableCrossRegionCopy;
                return this;
            }

            /**
             * Specifies the repetition date of the automatic snapshot. Select the date on which you want to create a snapshot from Monday to Sunday. The value ranges from 1 to 7. For example, 1 indicates Monday. You can select multiple dates.
             */
            public Builder repeatWeekdays(String repeatWeekdays) {
                this.repeatWeekdays = repeatWeekdays;
                return this;
            }

            /**
             * The number of extended volumes that have enabled the policy.
             */
            public Builder volumeNums(Integer volumeNums) {
                this.volumeNums = volumeNums;
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
             * The key-value set of the automatic snapshot policy.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
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
