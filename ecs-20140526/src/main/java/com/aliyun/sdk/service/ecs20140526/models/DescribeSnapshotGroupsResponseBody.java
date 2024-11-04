// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
         * <p>The token used to start the next query.</p>
         * <blockquote>
         * <p>If the return value is empty, no more data exists.</p>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3F9A4CC4-362F-469A-B9EF-B3204EF8AA3A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the snapshot-consistent groups.</p>
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

            /**
             * <p>The tag key of the snapshot. The default values of Key and Value contain snapshot source information.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ecs:createFrom</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the snapshot. The default values of Key and Value contain snapshot source information.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp11qm0o3dk4iuc****</p>
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

            /**
             * <p>Indicates whether the snapshot can be shared and be used to create or roll back a disk. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * <p>Indicates whether the instant access feature is enabled. Valid values:</p>
             * <ul>
             * <li>true: The instant access feature is enabled. By default, the instant access feature is enabled for ESSDs.</li>
             * <li>false: The instant access feature is disabled. The snapshot is a standard snapshot for which the instant access feature is disabled.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is no longer used. By default, standard snapshots of ESSDs are upgraded to instant access snapshots free of charge without the need for additional configurations. For more information, see <a href="https://help.aliyun.com/document_detail/193667.html">Use the instant access feature</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder instantAccess(Boolean instantAccess) {
                this.instantAccess = instantAccess;
                return this;
            }

            /**
             * <p>The validity period of the instant access feature. When the validity period ends, the instant access snapshot is automatically released.</p>
             * <blockquote>
             * <p> This parameter is no longer used. By default, standard snapshots of ESSDs are upgraded to instant access snapshots free of charge without the need for additional configurations. For more information, see <a href="https://help.aliyun.com/document_detail/193667.html">Use the instant access feature</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder instantAccessRetentionDays(Integer instantAccessRetentionDays) {
                this.instantAccessRetentionDays = instantAccessRetentionDays;
                return this;
            }

            /**
             * <p>The progress of the snapshot creation task. Unit: percent (%).</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The ID of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>s-j6cbzmrlbf09w72q****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The ID of the source disk. This parameter is retained even after the source disk of the snapshot is released.</p>
             * 
             * <strong>example:</strong>
             * <p>d-j6c3ogynmvpi6wy7****</p>
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * <p>The type of the source disk. Valid values:</p>
             * <ul>
             * <li>system: system disk</li>
             * <li>data: data disk</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * <p>The tags of the snapshot. The default values contain snapshot source information.</p>
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

            /**
             * <p>The tag key of the snapshot-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the snapshot-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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

            /**
             * <p>The time when the snapshot-consistent group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-23T10:58:48Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the snapshot-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the instance to which the snapshot-consistent group belongs. This parameter has a value only when all disk snapshots in the snapshot-consistent group belong to the same instance. If disk snapshots in the snapshot-consistent group belong to different instances, you can check the response parameters that start with <code>Snapshots.Snapshot.Tags.</code> to determine the ID of the instance to which each snapshot in the snapshot-consistent group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>i-j6ca469urv8ei629****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the snapshot-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder progressStatus(String progressStatus) {
                this.progressStatus = progressStatus;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the snapshot-consistent group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the snapshot-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>ssg-j6ciyh3k52qp7ovm****</p>
             */
            public Builder snapshotGroupId(String snapshotGroupId) {
                this.snapshotGroupId = snapshotGroupId;
                return this;
            }

            /**
             * <p>The information about the snapshots in the snapshot-consistent group.</p>
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The state of the snapshot-consistent group. Valid values:</p>
             * <ul>
             * <li>progressing: The snapshot-consistent group was being created.</li>
             * <li>accomplished: The snapshot-consistent group was created.</li>
             * <li>failed: The snapshot-consistent group failed to be created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accomplished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the snapshot-consistent group.</p>
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
