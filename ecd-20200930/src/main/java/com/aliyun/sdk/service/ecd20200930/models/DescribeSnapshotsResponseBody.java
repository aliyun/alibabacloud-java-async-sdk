// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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

        /**
         * <p>If the NextToken parameter is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51592A88-0F2C-55E6-AD2C-2AD9C10D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details of the queried snapshots.</p>
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

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DeletionTime")
        private String deletionTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DesktopStatus")
        private String desktopStatus;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

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

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionEnabled")
        private Boolean volumeEncryptionEnabled;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionKey")
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
            this.restorePointId = builder.restorePointId;
            this.restorePointName = builder.restorePointName;
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
            private String restorePointId; 
            private String restorePointName; 
            private String snapshotId; 
            private String snapshotName; 
            private String snapshotType; 
            private String sourceDiskSize; 
            private String sourceDiskType; 
            private String status; 
            private Boolean volumeEncryptionEnabled; 
            private String volumeEncryptionKey; 

            /**
             * <p>The point in time at which the snapshot was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-mm-ddthh:mm:ssz</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T14:52:28Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The user who creates the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>Administrator</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The time when the snapshot was deleted. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-mm-ddthh:mm:ssz</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T14:52:28Z</p>
             */
            public Builder deletionTime(String deletionTime) {
                this.deletionTime = deletionTime;
                return this;
            }

            /**
             * <p>The description of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the cloud computer to which the snapshot belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-g03l3tlm8djoj****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The name of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The status of the cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Stopped</li>
             * <li>Starting</li>
             * <li>Rebuilding</li>
             * <li>Running</li>
             * <li>Stopping</li>
             * <li>Expired</li>
             * <li>Deleted</li>
             * <li>Pending</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * <p>The progress of creating the snapshot. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>HDX: High-definition Experience (HDX) protocol</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>ASP: in-house Adaptive Streaming Protocol (ASP)</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The remaining time that is required to complete the snapshot creation. Unit: seconds.</p>
             * <blockquote>
             * <p> When the <code>Status</code> value is <code>PROGRESSING</code>, the <code>RemainTime</code> value is <code>-1</code>. A value of -1 indicates that the system is calculating the remaining time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
             * <p>The snapshot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s-2zeipxmnhej803x7****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The name of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>testSnapshotName</p>
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * <p>The type of the snapshot.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>AUTO: automatic snapshot</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>USER: manual snapshot</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder snapshotType(String snapshotType) {
                this.snapshotType = snapshotType;
                return this;
            }

            /**
             * <p>The capacity of the source disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder sourceDiskSize(String sourceDiskSize) {
                this.sourceDiskSize = sourceDiskSize;
                return this;
            }

            /**
             * <p>The type of the source disk.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>SYSTEM: system disk</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>DATA: data disk</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * <p>The status of the snapshot.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>PROGRESSING: The snapshot is being created.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>FAILED: The snapshot fails to be created.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>ACCOMPLISHED: The snapshot is created.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACCOMPLISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether disk encryption is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * <p>The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> operation to query the list of KMS keys.</p>
             * 
             * <strong>example:</strong>
             * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
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
