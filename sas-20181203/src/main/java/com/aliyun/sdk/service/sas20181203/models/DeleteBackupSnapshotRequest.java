// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteBackupSnapshotRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupSnapshotRequest</p>
 */
public class DeleteBackupSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRegionIdList")
    private java.util.List<String> backupRegionIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSnapshotList")
    private java.util.List<BackupSnapshotList> backupSnapshotList;

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
    public java.util.List<String> getBackupRegionIdList() {
        return this.backupRegionIdList;
    }

    /**
     * @return backupSnapshotList
     */
    public java.util.List<BackupSnapshotList> getBackupSnapshotList() {
        return this.backupSnapshotList;
    }

    /**
     * @return retainLatestSnapshot
     */
    public Boolean getRetainLatestSnapshot() {
        return this.retainLatestSnapshot;
    }

    public static final class Builder extends Request.Builder<DeleteBackupSnapshotRequest, Builder> {
        private java.util.List<String> backupRegionIdList; 
        private java.util.List<BackupSnapshotList> backupSnapshotList; 
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
         * <p>The backup regions.</p>
         */
        public Builder backupRegionIdList(java.util.List<String> backupRegionIdList) {
            this.putQueryParameter("BackupRegionIdList", backupRegionIdList);
            this.backupRegionIdList = backupRegionIdList;
            return this;
        }

        /**
         * <p>The backup snapshots.</p>
         */
        public Builder backupSnapshotList(java.util.List<BackupSnapshotList> backupSnapshotList) {
            this.putQueryParameter("BackupSnapshotList", backupSnapshotList);
            this.backupSnapshotList = backupSnapshotList;
            return this;
        }

        /**
         * <p>Specifies whether to retain the latest snapshot. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: retains the latest snapshot.</li>
         * <li><strong>false</strong>: does not retain the latest snapshot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

    /**
     * 
     * {@link DeleteBackupSnapshotRequest} extends {@link TeaModel}
     *
     * <p>DeleteBackupSnapshotRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(BackupSnapshotList model) {
                this.clientId = model.clientId;
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
                this.snapshotId = model.snapshotId;
                this.sourceType = model.sourceType;
                this.vaultId = model.vaultId;
            } 

            /**
             * <p>The ID of the backup client.</p>
             * <blockquote>
             * <p>You can call the <a href="~~DescribeSnapshots~~">DescribeSnapshots</a> operation to obtain this parameter.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>c-000a4h33w14ka8xa****</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The ID of the server instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-j6cj8vyajp1fo4at****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region of the Security Center instance. Valid values:</p>
             * <ul>
             * <li><strong>cn-hangzhou</strong>: China (Hangzhou).</li>
             * <li><strong>ap-southeast-1</strong>: Singapore.</li>
             * <li><strong>cn-beijing</strong>: China (Beijing).</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the snapshot to delete.</p>
             * <blockquote>
             * <p>You can call the <a href="~~DescribeSnapshots~~">DescribeSnapshots</a> operation to obtain this parameter.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>s-000f9p6r5trm6u4d****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li><strong>ECS_FILE</strong>: backup snapshot of ECS files.</li>
             * <li><strong>OSS</strong>: backup snapshot of Alibaba Cloud OSS.</li>
             * <li><strong>NAS</strong>: backup snapshot of Alibaba Cloud NAS.</li>
             * <li><strong>OTS_TABLE</strong>: backup snapshot of Alibaba Cloud Tablestore.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_FILE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The ID of the backup vault for the restoration task.</p>
             * <blockquote>
             * <p>You can call the <a href="~~DescribeSnapshots~~">DescribeSnapshots</a> operation to obtain this parameter.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v-0004vhwcs2pmacfz****</p>
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
