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
 * {@link DescribeSnapshotGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotGroupsResponseBody</p>
 */
public class DescribeSnapshotGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotGroups")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSnapshotGroupsResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.snapshotGroups = model.snapshotGroups;
        } 

        /**
         * <p>The pagination token for the next query.</p>
         * <blockquote>
         * <p>If this parameter is empty, no more results are available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3F9A4CC4-362F-469A-B9EF-B3204EF8AA3A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnapshotGroups.
         */
        public Builder snapshotGroups(SnapshotGroups snapshotGroups) {
            this.snapshotGroups = snapshotGroups;
            return this;
        }

        public DescribeSnapshotGroupsResponseBody build() {
            return new DescribeSnapshotGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnapshotGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotGroupsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    /**
     * 
     * {@link DescribeSnapshotGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotGroupsResponseBody</p>
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
     * {@link DescribeSnapshotGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotGroupsResponseBody</p>
     */
    public static class Snapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Available")
        private Boolean available;

        @com.aliyun.core.annotation.NameInMap("InstantAccess")
        private Boolean instantAccess;

        @com.aliyun.core.annotation.NameInMap("InstantAccessRetentionDays")
        private Integer instantAccessRetentionDays;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SourceDiskId")
        private String sourceDiskId;

        @com.aliyun.core.annotation.NameInMap("SourceDiskType")
        private String sourceDiskType;

        @com.aliyun.core.annotation.NameInMap("Tags")
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

            private Builder() {
            } 

            private Builder(Snapshot model) {
                this.available = model.available;
                this.instantAccess = model.instantAccess;
                this.instantAccessRetentionDays = model.instantAccessRetentionDays;
                this.progress = model.progress;
                this.snapshotId = model.snapshotId;
                this.sourceDiskId = model.sourceDiskId;
                this.sourceDiskType = model.sourceDiskType;
                this.tags = model.tags;
            } 

            /**
             * Available.
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * InstantAccess.
             */
            public Builder instantAccess(Boolean instantAccess) {
                this.instantAccess = instantAccess;
                return this;
            }

            /**
             * InstantAccessRetentionDays.
             */
            public Builder instantAccessRetentionDays(Integer instantAccessRetentionDays) {
                this.instantAccessRetentionDays = instantAccessRetentionDays;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * SnapshotId.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * SourceDiskId.
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * SourceDiskType.
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * Tags.
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
    /**
     * 
     * {@link DescribeSnapshotGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotGroupsResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Snapshot")
        private java.util.List<Snapshot> snapshot;

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
        public java.util.List<Snapshot> getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List<Snapshot> snapshot; 

            private Builder() {
            } 

            private Builder(Snapshots model) {
                this.snapshot = model.snapshot;
            } 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List<Snapshot> snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSnapshotGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotGroupsResponseBody</p>
     */
    public static class TagsTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(TagsTag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    /**
     * 
     * {@link DescribeSnapshotGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotGroupsResponseBody</p>
     */
    public static class SnapshotGroupTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<TagsTag> tag;

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
        public java.util.List<TagsTag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<TagsTag> tag; 

            private Builder() {
            } 

            private Builder(SnapshotGroupTags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<TagsTag> tag) {
                this.tag = tag;
                return this;
            }

            public SnapshotGroupTags build() {
                return new SnapshotGroupTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSnapshotGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotGroupsResponseBody</p>
     */
    public static class SnapshotGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProgressStatus")
        private String progressStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SnapshotGroupId")
        private String snapshotGroupId;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private Snapshots snapshots;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
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

            private Builder() {
            } 

            private Builder(SnapshotGroup model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.progressStatus = model.progressStatus;
                this.resourceGroupId = model.resourceGroupId;
                this.snapshotGroupId = model.snapshotGroupId;
                this.snapshots = model.snapshots;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProgressStatus.
             */
            public Builder progressStatus(String progressStatus) {
                this.progressStatus = progressStatus;
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
             * SnapshotGroupId.
             */
            public Builder snapshotGroupId(String snapshotGroupId) {
                this.snapshotGroupId = snapshotGroupId;
                return this;
            }

            /**
             * Snapshots.
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
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
            public Builder tags(SnapshotGroupTags tags) {
                this.tags = tags;
                return this;
            }

            public SnapshotGroup build() {
                return new SnapshotGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSnapshotGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotGroupsResponseBody</p>
     */
    public static class SnapshotGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SnapshotGroup")
        private java.util.List<SnapshotGroup> snapshotGroup;

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
        public java.util.List<SnapshotGroup> getSnapshotGroup() {
            return this.snapshotGroup;
        }

        public static final class Builder {
            private java.util.List<SnapshotGroup> snapshotGroup; 

            private Builder() {
            } 

            private Builder(SnapshotGroups model) {
                this.snapshotGroup = model.snapshotGroup;
            } 

            /**
             * SnapshotGroup.
             */
            public Builder snapshotGroup(java.util.List<SnapshotGroup> snapshotGroup) {
                this.snapshotGroup = snapshotGroup;
                return this;
            }

            public SnapshotGroups build() {
                return new SnapshotGroups(this);
            } 

        } 

    }
}
