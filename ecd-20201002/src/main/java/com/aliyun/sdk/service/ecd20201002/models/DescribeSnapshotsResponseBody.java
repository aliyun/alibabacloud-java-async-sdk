// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link DescribeSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotsResponseBody</p>
 */
public class DescribeSnapshotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Snapshots")
    private java.util.List<Snapshots> snapshots;

    private DescribeSnapshotsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.snapshots = builder.snapshots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotsResponseBody create() {
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
     * @return snapshots
     */
    public java.util.List<Snapshots> getSnapshots() {
        return this.snapshots;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<Snapshots> snapshots; 

        private Builder() {
        } 

        private Builder(DescribeSnapshotsResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.snapshots = model.snapshots;
        } 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Snapshots.
         */
        public Builder snapshots(java.util.List<Snapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        public DescribeSnapshotsResponseBody build() {
            return new DescribeSnapshotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotsResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RemainTime")
        private Integer remainTime;

        @com.aliyun.core.annotation.NameInMap("RestorePointId")
        private String restorePointId;

        @com.aliyun.core.annotation.NameInMap("RestorePointName")
        private String restorePointName;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SnapshotName")
        private String snapshotName;

        @com.aliyun.core.annotation.NameInMap("SnapshotType")
        private String snapshotType;

        @com.aliyun.core.annotation.NameInMap("SourceDiskSize")
        private String sourceDiskSize;

        @com.aliyun.core.annotation.NameInMap("SourceDiskType")
        private String sourceDiskType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Snapshots(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.desktopId = builder.desktopId;
            this.progress = builder.progress;
            this.remainTime = builder.remainTime;
            this.restorePointId = builder.restorePointId;
            this.restorePointName = builder.restorePointName;
            this.snapshotId = builder.snapshotId;
            this.snapshotName = builder.snapshotName;
            this.snapshotType = builder.snapshotType;
            this.sourceDiskSize = builder.sourceDiskSize;
            this.sourceDiskType = builder.sourceDiskType;
            this.status = builder.status;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return remainTime
         */
        public Integer getRemainTime() {
            return this.remainTime;
        }

        /**
         * @return restorePointId
         */
        public String getRestorePointId() {
            return this.restorePointId;
        }

        /**
         * @return restorePointName
         */
        public String getRestorePointName() {
            return this.restorePointName;
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
         * @return snapshotType
         */
        public String getSnapshotType() {
            return this.snapshotType;
        }

        /**
         * @return sourceDiskSize
         */
        public String getSourceDiskSize() {
            return this.sourceDiskSize;
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

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String desktopId; 
            private String progress; 
            private Integer remainTime; 
            private String restorePointId; 
            private String restorePointName; 
            private String snapshotId; 
            private String snapshotName; 
            private String snapshotType; 
            private String sourceDiskSize; 
            private String sourceDiskType; 
            private String status; 

            private Builder() {
            } 

            private Builder(Snapshots model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.desktopId = model.desktopId;
                this.progress = model.progress;
                this.remainTime = model.remainTime;
                this.restorePointId = model.restorePointId;
                this.restorePointName = model.restorePointName;
                this.snapshotId = model.snapshotId;
                this.snapshotName = model.snapshotName;
                this.snapshotType = model.snapshotType;
                this.sourceDiskSize = model.sourceDiskSize;
                this.sourceDiskType = model.sourceDiskType;
                this.status = model.status;
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
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
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
             * RemainTime.
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * RestorePointId.
             */
            public Builder restorePointId(String restorePointId) {
                this.restorePointId = restorePointId;
                return this;
            }

            /**
             * RestorePointName.
             */
            public Builder restorePointName(String restorePointName) {
                this.restorePointName = restorePointName;
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
             * SnapshotName.
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * SnapshotType.
             */
            public Builder snapshotType(String snapshotType) {
                this.snapshotType = snapshotType;
                return this;
            }

            /**
             * SourceDiskSize.
             */
            public Builder sourceDiskSize(String sourceDiskSize) {
                this.sourceDiskSize = sourceDiskSize;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
}
