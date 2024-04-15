// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotsResponseBody</p>
 */
public class DescribeSnapshotsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Snapshots")
    private java.util.List < Snapshots> snapshots;

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
    public java.util.List < Snapshots> getSnapshots() {
        return this.snapshots;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < Snapshots> snapshots; 

        /**
         * If the NextToken parameter is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Details of the queried snapshots.
         */
        public Builder snapshots(java.util.List < Snapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        public DescribeSnapshotsResponseBody build() {
            return new DescribeSnapshotsResponseBody(this);
        } 

    } 

    public static class Snapshots extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("DeletionTime")
        private String deletionTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("DesktopStatus")
        private String desktopStatus;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("RemainTime")
        private Integer remainTime;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("SnapshotName")
        private String snapshotName;

        @NameInMap("SnapshotType")
        private String snapshotType;

        @NameInMap("SourceDiskSize")
        private String sourceDiskSize;

        @NameInMap("SourceDiskType")
        private String sourceDiskType;

        @NameInMap("Status")
        private String status;

        @NameInMap("VolumeEncryptionEnabled")
        private Boolean volumeEncryptionEnabled;

        @NameInMap("VolumeEncryptionKey")
        private String volumeEncryptionKey;

        private Snapshots(Builder builder) {
            this.creationTime = builder.creationTime;
            this.creator = builder.creator;
            this.deletionTime = builder.deletionTime;
            this.description = builder.description;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopStatus = builder.desktopStatus;
            this.progress = builder.progress;
            this.protocolType = builder.protocolType;
            this.remainTime = builder.remainTime;
            this.snapshotId = builder.snapshotId;
            this.snapshotName = builder.snapshotName;
            this.snapshotType = builder.snapshotType;
            this.sourceDiskSize = builder.sourceDiskSize;
            this.sourceDiskType = builder.sourceDiskType;
            this.status = builder.status;
            this.volumeEncryptionEnabled = builder.volumeEncryptionEnabled;
            this.volumeEncryptionKey = builder.volumeEncryptionKey;
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
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return deletionTime
         */
        public String getDeletionTime() {
            return this.deletionTime;
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
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return desktopStatus
         */
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return remainTime
         */
        public Integer getRemainTime() {
            return this.remainTime;
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

        /**
         * @return volumeEncryptionEnabled
         */
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        /**
         * @return volumeEncryptionKey
         */
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

        public static final class Builder {
            private String creationTime; 
            private String creator; 
            private String deletionTime; 
            private String description; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private String progress; 
            private String protocolType; 
            private Integer remainTime; 
            private String snapshotId; 
            private String snapshotName; 
            private String snapshotType; 
            private String sourceDiskSize; 
            private String sourceDiskType; 
            private String status; 
            private Boolean volumeEncryptionEnabled; 
            private String volumeEncryptionKey; 

            /**
             * The point in time at which the snapshot was created. The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-mm-ddthh:mm:ssz` format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The user who creates the snapshot.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The time when the snapshot was deleted. The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-mm-ddthh:mm:ssz` format. The time is displayed in UTC.
             */
            public Builder deletionTime(String deletionTime) {
                this.deletionTime = deletionTime;
                return this;
            }

            /**
             * The description of the snapshot.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the cloud computer to which the snapshot belongs.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The name of the cloud computer.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * The status of the cloud computer.
             * <p>
             * 
             * Valid values:
             * 
             * *   Stopped
             * *   Starting
             * *   Rebuilding
             * *   Running
             * *   Stopping
             * *   Expired
             * *   Deleted
             * *   Pending
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * The progress of creating the snapshot. Unit: %.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The protocol type.
             * <p>
             * 
             * Valid values:
             * 
             * *   HDX: High-definition Experience (HDX) protocol
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   ASP: in-house Adaptive Streaming Protocol (ASP)
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The remaining time that is required to complete the snapshot creation. Unit: seconds.
             * <p>
             * 
             * >  When the `Status` value is `PROGRESSING`, the `RemainTime` value is `-1`. A value of -1 indicates that the system is calculating the remaining time.
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * The snapshot ID.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The name of the snapshot.
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * The type of the snapshot.
             * <p>
             * 
             * Valid values:
             * 
             * *   AUTO: automatic snapshot
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   USER: manual snapshot
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder snapshotType(String snapshotType) {
                this.snapshotType = snapshotType;
                return this;
            }

            /**
             * The capacity of the source disk. Unit: GiB.
             */
            public Builder sourceDiskSize(String sourceDiskSize) {
                this.sourceDiskSize = sourceDiskSize;
                return this;
            }

            /**
             * The type of the source disk.
             * <p>
             * 
             * Valid values:
             * 
             * *   SYSTEM: system disk
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   DATA: data disk
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * The status of the snapshot.
             * <p>
             * 
             * Valid values:
             * 
             * *   PROGRESSING: The snapshot is being created.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   FAILED: The snapshot fails to be created.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   ACCOMPLISHED: The snapshot is created.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Indicates whether disk encryption is enabled.
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to query the list of KMS keys.
             */
            public Builder volumeEncryptionKey(String volumeEncryptionKey) {
                this.volumeEncryptionKey = volumeEncryptionKey;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
}
