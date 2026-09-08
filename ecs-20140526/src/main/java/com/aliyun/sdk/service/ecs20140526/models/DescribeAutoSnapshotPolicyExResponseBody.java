// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAutoSnapshotPolicyExResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoSnapshotPolicyExResponseBody</p>
 */
public class DescribeAutoSnapshotPolicyExResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicies")
    private AutoSnapshotPolicies autoSnapshotPolicies;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAutoSnapshotPolicyExResponseBody model) {
            this.autoSnapshotPolicies = model.autoSnapshotPolicies;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AutoSnapshotPolicies.
         */
        public Builder autoSnapshotPolicies(AutoSnapshotPolicies autoSnapshotPolicies) {
            this.autoSnapshotPolicies = autoSnapshotPolicies;
            return this;
        }

        /**
         * <p>The page number of the automatic snapshot policy list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page when the automatic snapshot policies are displayed by page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of automatic snapshot policies.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAutoSnapshotPolicyExResponseBody build() {
            return new DescribeAutoSnapshotPolicyExResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAutoSnapshotPolicyExResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoSnapshotPolicyExResponseBody</p>
     */
    public static class CopyEncryptionConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        private CopyEncryptionConfiguration(Builder builder) {
            this.encrypted = builder.encrypted;
            this.KMSKeyId = builder.KMSKeyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CopyEncryptionConfiguration create() {
            return builder().build();
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

        public static final class Builder {
            private Boolean encrypted; 
            private String KMSKeyId; 

            private Builder() {
            } 

            private Builder(CopyEncryptionConfiguration model) {
                this.encrypted = model.encrypted;
                this.KMSKeyId = model.KMSKeyId;
            } 

            /**
             * Encrypted.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * KMSKeyId.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            public CopyEncryptionConfiguration build() {
                return new CopyEncryptionConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAutoSnapshotPolicyExResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoSnapshotPolicyExResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
    /**
     * 
     * {@link DescribeAutoSnapshotPolicyExResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoSnapshotPolicyExResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAutoSnapshotPolicyExResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoSnapshotPolicyExResponseBody</p>
     */
    public static class TargetTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private TargetTag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetTag create() {
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

            private Builder() {
            } 

            private Builder(TargetTag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TargetTag build() {
                return new TargetTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAutoSnapshotPolicyExResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoSnapshotPolicyExResponseBody</p>
     */
    public static class TargetTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetTag")
        private java.util.List<TargetTag> targetTag;

        private TargetTags(Builder builder) {
            this.targetTag = builder.targetTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetTags create() {
            return builder().build();
        }

        /**
         * @return targetTag
         */
        public java.util.List<TargetTag> getTargetTag() {
            return this.targetTag;
        }

        public static final class Builder {
            private java.util.List<TargetTag> targetTag; 

            private Builder() {
            } 

            private Builder(TargetTags model) {
                this.targetTag = model.targetTag;
            } 

            /**
             * TargetTag.
             */
            public Builder targetTag(java.util.List<TargetTag> targetTag) {
                this.targetTag = targetTag;
                return this;
            }

            public TargetTags build() {
                return new TargetTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAutoSnapshotPolicyExResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoSnapshotPolicyExResponseBody</p>
     */
    public static class AutoSnapshotPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociationType")
        private String associationType;

        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyName")
        private String autoSnapshotPolicyName;

        @com.aliyun.core.annotation.NameInMap("CopiedSnapshotsRetentionDays")
        private Integer copiedSnapshotsRetentionDays;

        @com.aliyun.core.annotation.NameInMap("CopyEncryptionConfiguration")
        private CopyEncryptionConfiguration copyEncryptionConfiguration;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DiskNums")
        private Integer diskNums;

        @com.aliyun.core.annotation.NameInMap("EnableCrossRegionCopy")
        private Boolean enableCrossRegionCopy;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepeatWeekdays")
        private String repeatWeekdays;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RetentionDays")
        private Integer retentionDays;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TargetCopyRegions")
        private String targetCopyRegions;

        @com.aliyun.core.annotation.NameInMap("TargetTags")
        private TargetTags targetTags;

        @com.aliyun.core.annotation.NameInMap("TimePoints")
        private String timePoints;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VolumeNums")
        private Integer volumeNums;

        private AutoSnapshotPolicy(Builder builder) {
            this.associationType = builder.associationType;
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.autoSnapshotPolicyName = builder.autoSnapshotPolicyName;
            this.copiedSnapshotsRetentionDays = builder.copiedSnapshotsRetentionDays;
            this.copyEncryptionConfiguration = builder.copyEncryptionConfiguration;
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
            this.targetTags = builder.targetTags;
            this.timePoints = builder.timePoints;
            this.type = builder.type;
            this.volumeNums = builder.volumeNums;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoSnapshotPolicy create() {
            return builder().build();
        }

        /**
         * @return associationType
         */
        public String getAssociationType() {
            return this.associationType;
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
         * @return copyEncryptionConfiguration
         */
        public CopyEncryptionConfiguration getCopyEncryptionConfiguration() {
            return this.copyEncryptionConfiguration;
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
         * @return targetTags
         */
        public TargetTags getTargetTags() {
            return this.targetTags;
        }

        /**
         * @return timePoints
         */
        public String getTimePoints() {
            return this.timePoints;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return volumeNums
         */
        public Integer getVolumeNums() {
            return this.volumeNums;
        }

        public static final class Builder {
            private String associationType; 
            private String autoSnapshotPolicyId; 
            private String autoSnapshotPolicyName; 
            private Integer copiedSnapshotsRetentionDays; 
            private CopyEncryptionConfiguration copyEncryptionConfiguration; 
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
            private TargetTags targetTags; 
            private String timePoints; 
            private String type; 
            private Integer volumeNums; 

            private Builder() {
            } 

            private Builder(AutoSnapshotPolicy model) {
                this.associationType = model.associationType;
                this.autoSnapshotPolicyId = model.autoSnapshotPolicyId;
                this.autoSnapshotPolicyName = model.autoSnapshotPolicyName;
                this.copiedSnapshotsRetentionDays = model.copiedSnapshotsRetentionDays;
                this.copyEncryptionConfiguration = model.copyEncryptionConfiguration;
                this.creationTime = model.creationTime;
                this.diskNums = model.diskNums;
                this.enableCrossRegionCopy = model.enableCrossRegionCopy;
                this.regionId = model.regionId;
                this.repeatWeekdays = model.repeatWeekdays;
                this.resourceGroupId = model.resourceGroupId;
                this.retentionDays = model.retentionDays;
                this.status = model.status;
                this.tags = model.tags;
                this.targetCopyRegions = model.targetCopyRegions;
                this.targetTags = model.targetTags;
                this.timePoints = model.timePoints;
                this.type = model.type;
                this.volumeNums = model.volumeNums;
            } 

            /**
             * AssociationType.
             */
            public Builder associationType(String associationType) {
                this.associationType = associationType;
                return this;
            }

            /**
             * AutoSnapshotPolicyId.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * AutoSnapshotPolicyName.
             */
            public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
                this.autoSnapshotPolicyName = autoSnapshotPolicyName;
                return this;
            }

            /**
             * CopiedSnapshotsRetentionDays.
             */
            public Builder copiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
                this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
                return this;
            }

            /**
             * CopyEncryptionConfiguration.
             */
            public Builder copyEncryptionConfiguration(CopyEncryptionConfiguration copyEncryptionConfiguration) {
                this.copyEncryptionConfiguration = copyEncryptionConfiguration;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DiskNums.
             */
            public Builder diskNums(Integer diskNums) {
                this.diskNums = diskNums;
                return this;
            }

            /**
             * EnableCrossRegionCopy.
             */
            public Builder enableCrossRegionCopy(Boolean enableCrossRegionCopy) {
                this.enableCrossRegionCopy = enableCrossRegionCopy;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RepeatWeekdays.
             */
            public Builder repeatWeekdays(String repeatWeekdays) {
                this.repeatWeekdays = repeatWeekdays;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * RetentionDays.
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TargetCopyRegions.
             */
            public Builder targetCopyRegions(String targetCopyRegions) {
                this.targetCopyRegions = targetCopyRegions;
                return this;
            }

            /**
             * TargetTags.
             */
            public Builder targetTags(TargetTags targetTags) {
                this.targetTags = targetTags;
                return this;
            }

            /**
             * TimePoints.
             */
            public Builder timePoints(String timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VolumeNums.
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
    /**
     * 
     * {@link DescribeAutoSnapshotPolicyExResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoSnapshotPolicyExResponseBody</p>
     */
    public static class AutoSnapshotPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicy")
        private java.util.List<AutoSnapshotPolicy> autoSnapshotPolicy;

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
        public java.util.List<AutoSnapshotPolicy> getAutoSnapshotPolicy() {
            return this.autoSnapshotPolicy;
        }

        public static final class Builder {
            private java.util.List<AutoSnapshotPolicy> autoSnapshotPolicy; 

            private Builder() {
            } 

            private Builder(AutoSnapshotPolicies model) {
                this.autoSnapshotPolicy = model.autoSnapshotPolicy;
            } 

            /**
             * AutoSnapshotPolicy.
             */
            public Builder autoSnapshotPolicy(java.util.List<AutoSnapshotPolicy> autoSnapshotPolicy) {
                this.autoSnapshotPolicy = autoSnapshotPolicy;
                return this;
            }

            public AutoSnapshotPolicies build() {
                return new AutoSnapshotPolicies(this);
            } 

        } 

    }
}
