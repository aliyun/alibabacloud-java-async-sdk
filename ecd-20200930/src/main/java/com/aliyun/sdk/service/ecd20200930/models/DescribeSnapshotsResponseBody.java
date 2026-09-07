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
         * <p>The pagination token. If the NextToken parameter is empty, no next page exists.</p>
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
         * <p>The snapshot information.</p>
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

        @com.aliyun.core.annotation.NameInMap("DiskStatus")
        private String diskStatus;

        @com.aliyun.core.annotation.NameInMap("EnvId")
        private String envId;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("JvsId")
        private String jvsId;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

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
            this.diskStatus = builder.diskStatus;
            this.envId = builder.envId;
            this.envType = builder.envType;
            this.jvsId = builder.jvsId;
            this.osType = builder.osType;
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
         * @return diskStatus
         */
        public String getDiskStatus() {
            return this.diskStatus;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return jvsId
         */
        public String getJvsId() {
            return this.jvsId;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
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
            private String diskStatus; 
            private String envId; 
            private String envType; 
            private String jvsId; 
            private String osType; 
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

            private Builder() {
            } 

            private Builder(Snapshots model) {
                this.creationTime = model.creationTime;
                this.creator = model.creator;
                this.deletionTime = model.deletionTime;
                this.description = model.description;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.desktopStatus = model.desktopStatus;
                this.diskStatus = model.diskStatus;
                this.envId = model.envId;
                this.envType = model.envType;
                this.jvsId = model.jvsId;
                this.osType = model.osType;
                this.progress = model.progress;
                this.protocolType = model.protocolType;
                this.remainTime = model.remainTime;
                this.restorePointId = model.restorePointId;
                this.restorePointName = model.restorePointName;
                this.snapshotId = model.snapshotId;
                this.snapshotName = model.snapshotName;
                this.snapshotType = model.snapshotType;
                this.sourceDiskSize = model.sourceDiskSize;
                this.sourceDiskType = model.sourceDiskType;
                this.status = model.status;
                this.volumeEncryptionEnabled = model.volumeEncryptionEnabled;
                this.volumeEncryptionKey = model.volumeEncryptionKey;
            } 

            /**
             * <p>The time when the snapshot was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-mm-ddthh:mm:ssz</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T14:52:28Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>Administrator</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The time when the snapshot was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-mm-ddthh:mm:ssz</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T14:52:28Z</p>
             */
            public Builder deletionTime(String deletionTime) {
                this.deletionTime = deletionTime;
                return this;
            }

            /**
             * <p>The snapshot description.</p>
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
             * <p>The cloud computer name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The cloud computer status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * <p>The status of the cloud disk to which the snapshot belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder diskStatus(String diskStatus) {
                this.diskStatus = diskStatus;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * JvsId.
             */
            public Builder jvsId(String jvsId) {
                this.jvsId = jvsId;
                return this;
            }

            /**
             * <p>The operating system type.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The snapshot creation progress, in percentage.</p>
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
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The remaining time required to create the snapshot. Unit: seconds.</p>
             * <blockquote>
             * <p>When <code>Status</code> is <code>PROGRESSING</code>, a <code>RemainTime</code> value of <code>-1</code> indicates that the remaining time is being calculated.</p>
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
             * <p>The restore point ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rp-btgmaa20wkcju****</p>
             */
            public Builder restorePointId(String restorePointId) {
                this.restorePointId = restorePointId;
                return this;
            }

            /**
             * <p>The restore point name.</p>
             * 
             * <strong>example:</strong>
             * <p>DataDiskBackup</p>
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
             * <p>The snapshot name.</p>
             * 
             * <strong>example:</strong>
             * <p>testSnapshotName</p>
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * <p>The snapshot creation type.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder snapshotType(String snapshotType) {
                this.snapshotType = snapshotType;
                return this;
            }

            /**
             * <p>The capacity of the source cloud disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder sourceDiskSize(String sourceDiskSize) {
                this.sourceDiskSize = sourceDiskSize;
                return this;
            }

            /**
             * <p>The type of the source cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * <p>The snapshot status.</p>
             * 
             * <strong>example:</strong>
             * <p>ACCOMPLISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether cloud disk encryption is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * <p>The ID of the Key Management Service (KMS) key used for cloud disk encryption. You can call <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> to obtain the key ID.</p>
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
