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
         * <p>Details about the automatic snapshot policies.</p>
         */
        public Builder autoSnapshotPolicies(AutoSnapshotPolicies autoSnapshotPolicies) {
            this.autoSnapshotPolicies = autoSnapshotPolicies;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>The total number of automatic snapshot policies</p>
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

            /**
             * <p>Whether to enable encryption for cross-region snapshot replication. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The ID of the Key Management Service (KMS) key used to encrypt snapshots in cross-region snapshot replication.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
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

            /**
             * <p>The tag key of the automatic snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the automatic snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    public static class AutoSnapshotPolicy extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("TimePoints")
        private String timePoints;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VolumeNums")
        private Integer volumeNums;

        private AutoSnapshotPolicy(Builder builder) {
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
            private String timePoints; 
            private String type; 
            private Integer volumeNums; 

            /**
             * <p>The ID of the automatic snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-bp67acfmxazb4ph****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>The name of the automatic snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>testAutoSnapshotPolicyName</p>
             */
            public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
                this.autoSnapshotPolicyName = autoSnapshotPolicyName;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder copiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
                this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
                return this;
            }

            /**
             * <p>Encryption configurations for cross-region snapshot replication.</p>
             */
            public Builder copyEncryptionConfiguration(CopyEncryptionConfiguration copyEncryptionConfiguration) {
                this.copyEncryptionConfiguration = copyEncryptionConfiguration;
                return this;
            }

            /**
             * <p>The time when the automatic snapshot policy was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-10T16:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The number of disks to which the automatic snapshot policy is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder diskNums(Integer diskNums) {
                this.diskNums = diskNums;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableCrossRegionCopy(Boolean enableCrossRegionCopy) {
                this.enableCrossRegionCopy = enableCrossRegionCopy;
                return this;
            }

            /**
             * <p>The region ID of the automatic snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The days of the week on which to create automatic snapshots. Valid values: 1 to 7, which correspond to the days of the week. For example, 1 indicates Monday. One or more days can be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;6&quot;]</p>
             */
            public Builder repeatWeekdays(String repeatWeekdays) {
                this.repeatWeekdays = repeatWeekdays;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2kkmhmhs****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The retention period of the automatic snapshots. Unit: days. Valid values:</p>
             * <ul>
             * <li>-1: Automatic snapshots are retained until they are deleted.</li>
             * <li>1 to 65536: Auto snapshots are retained for the specified number of days. After the retention period of auto snapshots expires, the auto snapshots are automatically deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * <p>The status of the automatic snapshot policy. Valid values:</p>
             * <ul>
             * <li>Normal: The automatic snapshot policy is normal.</li>
             * <li>Expire: The automatic snapshot policy cannot be used because your account has overdue payments.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the automatic snapshot policy.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder targetCopyRegions(String targetCopyRegions) {
                this.targetCopyRegions = targetCopyRegions;
                return this;
            }

            /**
             * <p>The points in time of the day at which to create automatic snapshots.</p>
             * <p>The time is displayed in UTC+8. Unit: hours. Valid values: 0 to 23, which correspond to the 24 points in time on the hour from 00:00:00 to 23:00:00. For example, 1 indicates 01:00:00. Multiple points in time can be specified.</p>
             * <p>The parameter value is a JSON array that contains up to 24 points in time separated by commas (,). Example: <code>[&quot;0&quot;, &quot;1&quot;, ... &quot;23&quot;]</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;1&quot;]</p>
             */
            public Builder timePoints(String timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            /**
             * <p>The type of the automatic snapshot policy. Valid values:</p>
             * <ul>
             * <li>Custom: user-defined snapshot policy.</li>
             * <li>System: system-defined snapshot policy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The number of extended volumes to which the automatic snapshot policy is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
