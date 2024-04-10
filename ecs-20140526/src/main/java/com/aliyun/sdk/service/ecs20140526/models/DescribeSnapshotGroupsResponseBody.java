// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotGroupsResponseBody</p>
 */
public class DescribeSnapshotGroupsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnapshotGroups")
    private SnapshotGroups snapshotGroups;

    private DescribeSnapshotGroupsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.snapshotGroups = builder.snapshotGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotGroups
     */
    public SnapshotGroups getSnapshotGroups() {
        return this.snapshotGroups;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private SnapshotGroups snapshotGroups; 

        /**
         * The token used to start the next query.
         * <p>
         * 
         * > If the return value is empty, no more data exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Details of the snapshot-consistent groups.
         */
        public Builder snapshotGroups(SnapshotGroups snapshotGroups) {
            this.snapshotGroups = snapshotGroups;
            return this;
        }

        public DescribeSnapshotGroupsResponseBody build() {
            return new DescribeSnapshotGroupsResponseBody(this);
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
             * The tag key of the snapshot. The default values of Key and Value contain snapshot source information.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the snapshot. The default values of Key and Value contain snapshot source information.
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
    public static class Snapshot extends TeaModel {
        @NameInMap("Available")
        private Boolean available;

        @NameInMap("InstantAccess")
        private Boolean instantAccess;

        @NameInMap("InstantAccessRetentionDays")
        private Integer instantAccessRetentionDays;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("SourceDiskId")
        private String sourceDiskId;

        @NameInMap("SourceDiskType")
        private String sourceDiskType;

        @NameInMap("Tags")
        private Tags tags;

        private Snapshot(Builder builder) {
            this.available = builder.available;
            this.instantAccess = builder.instantAccess;
            this.instantAccessRetentionDays = builder.instantAccessRetentionDays;
            this.progress = builder.progress;
            this.snapshotId = builder.snapshotId;
            this.sourceDiskId = builder.sourceDiskId;
            this.sourceDiskType = builder.sourceDiskType;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshot create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public Boolean getAvailable() {
            return this.available;
        }

        /**
         * @return instantAccess
         */
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        /**
         * @return instantAccessRetentionDays
         */
        public Integer getInstantAccessRetentionDays() {
            return this.instantAccessRetentionDays;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return sourceDiskId
         */
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        /**
         * @return sourceDiskType
         */
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Boolean available; 
            private Boolean instantAccess; 
            private Integer instantAccessRetentionDays; 
            private String progress; 
            private String snapshotId; 
            private String sourceDiskId; 
            private String sourceDiskType; 
            private Tags tags; 

            /**
             * Indicates whether the snapshot can be used to create or roll back disks. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * Indicates whether the instant access feature is enabled. Valid values:
             * <p>
             * 
             * *   true: The instant access feature is enabled. By default, the instant access feature is enabled for ESSDs.
             * *   false: The instant access feature is disabled. The snapshot is a normal snapshot for which the instant access feature is disabled.
             */
            public Builder instantAccess(Boolean instantAccess) {
                this.instantAccess = instantAccess;
                return this;
            }

            /**
             * The retention period of the instant access feature. After the retention period ends, the snapshot is automatically released.
             * <p>
             * 
             * >  This parameter is deprecated. The normal snapshots of enhanced SSDs (ESSDs) are upgraded to support the instant access feature by default. No additional configurations are required to enable the feature and you are not charged for the feature. For more information, see [Use the instant access feature](~~193667~~).
             */
            public Builder instantAccessRetentionDays(Integer instantAccessRetentionDays) {
                this.instantAccessRetentionDays = instantAccessRetentionDays;
                return this;
            }

            /**
             * The progress of the snapshot creation task. Unit: percent (%).
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the snapshot.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The ID of the source disk. This parameter is retained even after the source disk of the snapshot is released.
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * The type of the source disk. Valid values:
             * <p>
             * 
             * *   system: system disk
             * *   data: data disk
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * The tags of the snapshot. The default values contain snapshot source information.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public Snapshot build() {
                return new Snapshot(this);
            } 

        } 

    }
    public static class Snapshots extends TeaModel {
        @NameInMap("Snapshot")
        private java.util.List < Snapshot> snapshot;

        private Snapshots(Builder builder) {
            this.snapshot = builder.snapshot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return snapshot
         */
        public java.util.List < Snapshot> getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List < Snapshot> snapshot; 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List < Snapshot> snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
    public static class TagsTag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private TagsTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagsTag create() {
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
             * The tag key of the snapshot-consistent group.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the snapshot-consistent group.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagsTag build() {
                return new TagsTag(this);
            } 

        } 

    }
    public static class SnapshotGroupTags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < TagsTag> tag;

        private SnapshotGroupTags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotGroupTags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < TagsTag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < TagsTag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < TagsTag> tag) {
                this.tag = tag;
                return this;
            }

            public SnapshotGroupTags build() {
                return new SnapshotGroupTags(this);
            } 

        } 

    }
    public static class SnapshotGroup extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProgressStatus")
        private String progressStatus;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SnapshotGroupId")
        private String snapshotGroupId;

        @NameInMap("Snapshots")
        private Snapshots snapshots;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private SnapshotGroupTags tags;

        private SnapshotGroup(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.progressStatus = builder.progressStatus;
            this.resourceGroupId = builder.resourceGroupId;
            this.snapshotGroupId = builder.snapshotGroupId;
            this.snapshots = builder.snapshots;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotGroup create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return progressStatus
         */
        public String getProgressStatus() {
            return this.progressStatus;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return snapshotGroupId
         */
        public String getSnapshotGroupId() {
            return this.snapshotGroupId;
        }

        /**
         * @return snapshots
         */
        public Snapshots getSnapshots() {
            return this.snapshots;
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
        public SnapshotGroupTags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String instanceId; 
            private String name; 
            private String progressStatus; 
            private String resourceGroupId; 
            private String snapshotGroupId; 
            private Snapshots snapshots; 
            private String status; 
            private SnapshotGroupTags tags; 

            /**
             * The time when the snapshot-consistent group was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the snapshot-consistent group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the instance to which the snapshot-consistent group belongs. This parameter has a value only when all disk snapshots in the snapshot-consistent group belong to the same instance. If disk snapshots in the snapshot-consistent group belong to different instances, you can check the response parameters that start with `Snapshots.Snapshot.Tags.` to determine the ID of the instance to which each snapshot in the snapshot-consistent group belongs.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the snapshot-consistent group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * >  This parameter is not publicly available.
             */
            public Builder progressStatus(String progressStatus) {
                this.progressStatus = progressStatus;
                return this;
            }

            /**
             * The ID of the resource group to which the snapshot-consistent group belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the snapshot-consistent group.
             */
            public Builder snapshotGroupId(String snapshotGroupId) {
                this.snapshotGroupId = snapshotGroupId;
                return this;
            }

            /**
             * Details of the snapshots in the snapshot-consistent group.
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * The state of the snapshot-consistent group. Valid values:
             * <p>
             * 
             * *   progressing: The snapshot-consistent group was being created.
             * *   accomplished: The snapshot-consistent group was created.
             * *   failed: The snapshot-consistent group failed to be created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags of the snapshot-consistent group.
             */
            public Builder tags(SnapshotGroupTags tags) {
                this.tags = tags;
                return this;
            }

            public SnapshotGroup build() {
                return new SnapshotGroup(this);
            } 

        } 

    }
    public static class SnapshotGroups extends TeaModel {
        @NameInMap("SnapshotGroup")
        private java.util.List < SnapshotGroup> snapshotGroup;

        private SnapshotGroups(Builder builder) {
            this.snapshotGroup = builder.snapshotGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotGroups create() {
            return builder().build();
        }

        /**
         * @return snapshotGroup
         */
        public java.util.List < SnapshotGroup> getSnapshotGroup() {
            return this.snapshotGroup;
        }

        public static final class Builder {
            private java.util.List < SnapshotGroup> snapshotGroup; 

            /**
             * SnapshotGroup.
             */
            public Builder snapshotGroup(java.util.List < SnapshotGroup> snapshotGroup) {
                this.snapshotGroup = snapshotGroup;
                return this;
            }

            public SnapshotGroups build() {
                return new SnapshotGroups(this);
            } 

        } 

    }
}
