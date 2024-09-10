// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupSnapshotRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupSnapshotRequest</p>
 */
public class DeleteBackupSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRegionIdList")
    private java.util.List < String > backupRegionIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSnapshotList")
    private java.util.List < BackupSnapshotList> backupSnapshotList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetainLatestSnapshot")
    private Boolean retainLatestSnapshot;

    private DeleteBackupSnapshotRequest(Builder builder) {
        super(builder);
        this.backupRegionIdList = builder.backupRegionIdList;
        this.backupSnapshotList = builder.backupSnapshotList;
        this.retainLatestSnapshot = builder.retainLatestSnapshot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupSnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupRegionIdList
     */
    public java.util.List < String > getBackupRegionIdList() {
        return this.backupRegionIdList;
    }

    /**
     * @return backupSnapshotList
     */
    public java.util.List < BackupSnapshotList> getBackupSnapshotList() {
        return this.backupSnapshotList;
    }

    /**
     * @return retainLatestSnapshot
     */
    public Boolean getRetainLatestSnapshot() {
        return this.retainLatestSnapshot;
    }

    public static final class Builder extends Request.Builder<DeleteBackupSnapshotRequest, Builder> {
        private java.util.List < String > backupRegionIdList; 
        private java.util.List < BackupSnapshotList> backupSnapshotList; 
        private Boolean retainLatestSnapshot; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackupSnapshotRequest request) {
            super(request);
            this.backupRegionIdList = request.backupRegionIdList;
            this.backupSnapshotList = request.backupSnapshotList;
            this.retainLatestSnapshot = request.retainLatestSnapshot;
        } 

        /**
         * The regions for backup.
         */
        public Builder backupRegionIdList(java.util.List < String > backupRegionIdList) {
            this.putQueryParameter("BackupRegionIdList", backupRegionIdList);
            this.backupRegionIdList = backupRegionIdList;
            return this;
        }

        /**
         * The backup snapshots.
         */
        public Builder backupSnapshotList(java.util.List < BackupSnapshotList> backupSnapshotList) {
            this.putQueryParameter("BackupSnapshotList", backupSnapshotList);
            this.backupSnapshotList = backupSnapshotList;
            return this;
        }

        /**
         * Specifies whether to retain the latest snapshot. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder retainLatestSnapshot(Boolean retainLatestSnapshot) {
            this.putQueryParameter("RetainLatestSnapshot", retainLatestSnapshot);
            this.retainLatestSnapshot = retainLatestSnapshot;
            return this;
        }

        @Override
        public DeleteBackupSnapshotRequest build() {
            return new DeleteBackupSnapshotRequest(this);
        } 

    } 

    public static class BackupSnapshotList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("VaultId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vaultId;

        private BackupSnapshotList(Builder builder) {
            this.clientId = builder.clientId;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.snapshotId = builder.snapshotId;
            this.sourceType = builder.sourceType;
            this.vaultId = builder.vaultId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupSnapshotList create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return vaultId
         */
        public String getVaultId() {
            return this.vaultId;
        }

        public static final class Builder {
            private String clientId; 
            private String instanceId; 
            private String regionId; 
            private String snapshotId; 
            private String sourceType; 
            private String vaultId; 

            /**
             * The ID of the Cloud Backup client.
             * <p>
             * 
             * >  You can call the [DescribeSnapshots](~~DescribeSnapshots~~) operation to query the ID.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The region in which Security Center is deployed. Valid values:
             * <p>
             * 
             * *   **cn-hangzhou**: China (Hangzhou).
             * *   **ap-southeast-1**: Singapore.
             * *   **cn-beijing**: China (Beijing).
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the snapshot that you want to delete.
             * <p>
             * 
             * >  You can call the [DescribeSnapshots](~~DescribeSnapshots~~) operation to query the ID.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The type of the data source. Valid values:
             * <p>
             * 
             * *   **ECS_FILE**: Elastic Compute Service (ECS) files.
             * *   **OSS**: Object Storage Service (OSS) buckets.
             * *   **NAS**: Apsara File Storage NAS (NAS) file systems.
             * *   **OTS_TABLE**: Tablestore instances.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The ID of the backup vault that is used in the restoration task.
             * <p>
             * 
             * >  You can call the [DescribeSnapshots](~~DescribeSnapshots~~) operation to query the ID.
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            public BackupSnapshotList build() {
                return new BackupSnapshotList(this);
            } 

        } 

    }
}
