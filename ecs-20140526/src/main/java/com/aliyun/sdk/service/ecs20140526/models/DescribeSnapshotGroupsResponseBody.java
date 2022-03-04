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
         * The start flag of the next query.
         * <p>
         * 
         * > If the return value is null, no more data is returned.
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
         * An array of snapshot consistency groups.
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
             * The tag key of the snapshot consistency group.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the snapshot consistency group.
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
             * The tag key of each snapshot in the snapshot consistency group. The snapshot source information is provided in the default values of Key and Value.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of each snapshot in the snapshot consistency group. The snapshot source information is provided in the default values of Key and Value.
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
    public static class SnapshotTags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < TagsTag> tag;

        private SnapshotTags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotTags create() {
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

            public SnapshotTags build() {
                return new SnapshotTags(this);
            } 

        } 

    }
    public static class Snapshot extends TeaModel {
        @NameInMap("SourceDiskId")
        private String sourceDiskId;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("InstantAccessRetentionDays")
        private Integer instantAccessRetentionDays;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("InstantAccess")
        private Boolean instantAccess;

        @NameInMap("SourceDiskType")
        private String sourceDiskType;

        @NameInMap("Tags")
        private SnapshotTags tags;

        private Snapshot(Builder builder) {
            this.sourceDiskId = builder.sourceDiskId;
            this.progress = builder.progress;
            this.instantAccessRetentionDays = builder.instantAccessRetentionDays;
            this.snapshotId = builder.snapshotId;
            this.instantAccess = builder.instantAccess;
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
         * @return sourceDiskId
         */
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return instantAccessRetentionDays
         */
        public Integer getInstantAccessRetentionDays() {
            return this.instantAccessRetentionDays;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return instantAccess
         */
        public Boolean getInstantAccess() {
            return this.instantAccess;
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
        public SnapshotTags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String sourceDiskId; 
            private String progress; 
            private Integer instantAccessRetentionDays; 
            private String snapshotId; 
            private Boolean instantAccess; 
            private String sourceDiskType; 
            private SnapshotTags tags; 

            /**
             * The ID of the source disk. This field is retained if the source disk of the snapshot is released.
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * The progress of snapshot creation. Unit: percentage.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The retention period of the snapshot feature. The snapshot is automatically released when the retention period expires.
             */
            public Builder instantAccessRetentionDays(Integer instantAccessRetentionDays) {
                this.instantAccessRetentionDays = instantAccessRetentionDays;
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
             * Indicates whether the snapshot extreme availability feature is enabled. Possible values:
             * <p>
             * 
             * -true: enabled. Only ESSDS support this feature.
             * -false: disabled. That is, a snapshot is a normal snapshot that is not enabled.
             */
            public Builder instantAccess(Boolean instantAccess) {
                this.instantAccess = instantAccess;
                return this;
            }

            /**
             * The type of the source disk. Possible values:
             * <p>
             * 
             * -system: system disk
             * -data: data disk
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * The key-value pairs of each snapshot in the snapshot consistency group. By default, the snapshot source information is included.
             */
            public Builder tags(SnapshotTags tags) {
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
    public static class SnapshotGroup extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ProgressStatus")
        private String progressStatus;

        @NameInMap("SnapshotGroupId")
        private String snapshotGroupId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Snapshots")
        private Snapshots snapshots;

        private SnapshotGroup(Builder builder) {
            this.status = builder.status;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.progressStatus = builder.progressStatus;
            this.snapshotGroupId = builder.snapshotGroupId;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.snapshots = builder.snapshots;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotGroup create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
         * @return progressStatus
         */
        public String getProgressStatus() {
            return this.progressStatus;
        }

        /**
         * @return snapshotGroupId
         */
        public String getSnapshotGroupId() {
            return this.snapshotGroupId;
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

        /**
         * @return snapshots
         */
        public Snapshots getSnapshots() {
            return this.snapshots;
        }

        public static final class Builder {
            private String status; 
            private String creationTime; 
            private String description; 
            private String progressStatus; 
            private String snapshotGroupId; 
            private String instanceId; 
            private String name; 
            private String resourceGroupId; 
            private Tags tags; 
            private Snapshots snapshots; 

            /**
             * The status of the snapshot consistency group. Possible values:
             * <p>
             * 
             * -progressing: creating.
             * 
             * -accomplished: successfully created.
             * 
             * -failed: failed to be created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * > This parameter is not available.
             */
            public Builder progressStatus(String progressStatus) {
                this.progressStatus = progressStatus;
                return this;
            }

            /**
             * The ID of the snapshot consistency group.
             */
            public Builder snapshotGroupId(String snapshotGroupId) {
                this.snapshotGroupId = snapshotGroupId;
                return this;
            }

            /**
             * The ID of the instance to which the snapshot consistency group belongs. This parameter is returned only when all cloud disk snapshots in the snapshot consistency group belong to the same instance. If multiple cloud disk snapshots in the Snapshot consistency group belong to different ECS instances, you can use the "Snapshots.Snapshot.Tags.* "parameter in the response to view the ID of the instance to which a single Snapshot in the group belongs.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the snapshot consistency group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the resource group to which the snapshot consistency group belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The key-value pair of the snapshot consistency group.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * An array of snapshot information contained in a snapshot consistency group.
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
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
