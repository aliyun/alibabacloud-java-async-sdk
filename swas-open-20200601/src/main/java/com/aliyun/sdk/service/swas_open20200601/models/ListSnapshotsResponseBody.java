// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link ListSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSnapshotsResponseBody</p>
 */
public class ListSnapshotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Snapshots")
    private java.util.List<Snapshots> snapshots;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSnapshotsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.snapshots = builder.snapshots;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSnapshotsResponseBody create() {
        return builder().build();
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
     * @return snapshots
     */
    public java.util.List<Snapshots> getSnapshots() {
        return this.snapshots;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Snapshots> snapshots; 
        private Integer totalCount; 

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
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details about the snapshots.</p>
         */
        public Builder snapshots(java.util.List<Snapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSnapshotsResponseBody build() {
            return new ListSnapshotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSnapshotsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * <p>The tag key of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSnapshotsResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RollbackTime")
        private String rollbackTime;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SnapshotName")
        private String snapshotName;

        @com.aliyun.core.annotation.NameInMap("SourceDiskId")
        private String sourceDiskId;

        @com.aliyun.core.annotation.NameInMap("SourceDiskType")
        private String sourceDiskType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Snapshots(Builder builder) {
            this.creationTime = builder.creationTime;
            this.instanceId = builder.instanceId;
            this.progress = builder.progress;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
            this.resourceGroupId = builder.resourceGroupId;
            this.rollbackTime = builder.rollbackTime;
            this.snapshotId = builder.snapshotId;
            this.snapshotName = builder.snapshotName;
            this.sourceDiskId = builder.sourceDiskId;
            this.sourceDiskType = builder.sourceDiskType;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return rollbackTime
         */
        public String getRollbackTime() {
            return this.rollbackTime;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return snapshotName
         */
        public String getSnapshotName() {
            return this.snapshotName;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String creationTime; 
            private String instanceId; 
            private String progress; 
            private String regionId; 
            private String remark; 
            private String resourceGroupId; 
            private String rollbackTime; 
            private String snapshotId; 
            private String snapshotName; 
            private String sourceDiskId; 
            private String sourceDiskType; 
            private String status; 
            private java.util.List<Tags> tags; 

            /**
             * <p>The time when the snapshot was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-09T07:12:49Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the simple application server.</p>
             * <p>Note: This parameter has a value returned for only system disk snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>2ad1ae67295445f598017499dc****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The progress of snapshot creation.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The remarks of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>test-Remark</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the snapshot belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2bti7cf7****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The time when the last disk rollback was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-09T07:12:49Z</p>
             */
            public Builder rollbackTime(String rollbackTime) {
                this.rollbackTime = rollbackTime;
                return this;
            }

            /**
             * <p>The snapshot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp16oazlsold4dks****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The name of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>test-SnapshotName</p>
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * <p>The ID of the source disk. This parameter has a value even after the source disk is released.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp14wq0149cpp2xy****</p>
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * <p>The type of the source disk. Valid values:</p>
             * <ul>
             * <li>system: system disk.</li>
             * <li>data: data disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * <p>The status of the snapshot. Valid values:</p>
             * <ul>
             * <li>Progressing: The snapshot is being created.</li>
             * <li>Accomplished: The snapshot is created.</li>
             * <li>Failed: The snapshot failed to be created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Accomplished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the snapshot.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
}
