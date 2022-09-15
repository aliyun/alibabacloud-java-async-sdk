// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupsResponseBody</p>
 */
public class DescribeBackupsResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageRecordCount")
    private String pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalEcsSnapshotSize")
    private Long totalEcsSnapshotSize;

    @NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribeBackupsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalEcsSnapshotSize = builder.totalEcsSnapshotSize;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalEcsSnapshotSize
     */
    public Long getTotalEcsSnapshotSize() {
        return this.totalEcsSnapshotSize;
    }

    /**
     * @return totalRecordCount
     */
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private String pageNumber; 
        private String pageRecordCount; 
        private String requestId; 
        private Long totalEcsSnapshotSize; 
        private String totalRecordCount; 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalEcsSnapshotSize.
         */
        public Builder totalEcsSnapshotSize(Long totalEcsSnapshotSize) {
            this.totalEcsSnapshotSize = totalEcsSnapshotSize;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeBackupsResponseBody build() {
            return new DescribeBackupsResponseBody(this);
        } 

    } 

    public static class BackupDownloadLinkByDB extends TeaModel {
        @NameInMap("DataBase")
        private String dataBase;

        @NameInMap("DownloadLink")
        private String downloadLink;

        @NameInMap("IntranetDownloadLink")
        private String intranetDownloadLink;

        private BackupDownloadLinkByDB(Builder builder) {
            this.dataBase = builder.dataBase;
            this.downloadLink = builder.downloadLink;
            this.intranetDownloadLink = builder.intranetDownloadLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupDownloadLinkByDB create() {
            return builder().build();
        }

        /**
         * @return dataBase
         */
        public String getDataBase() {
            return this.dataBase;
        }

        /**
         * @return downloadLink
         */
        public String getDownloadLink() {
            return this.downloadLink;
        }

        /**
         * @return intranetDownloadLink
         */
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        public static final class Builder {
            private String dataBase; 
            private String downloadLink; 
            private String intranetDownloadLink; 

            /**
             * DataBase.
             */
            public Builder dataBase(String dataBase) {
                this.dataBase = dataBase;
                return this;
            }

            /**
             * DownloadLink.
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * IntranetDownloadLink.
             */
            public Builder intranetDownloadLink(String intranetDownloadLink) {
                this.intranetDownloadLink = intranetDownloadLink;
                return this;
            }

            public BackupDownloadLinkByDB build() {
                return new BackupDownloadLinkByDB(this);
            } 

        } 

    }
    public static class BackupBackupDownloadLinkByDB extends TeaModel {
        @NameInMap("BackupDownloadLinkByDB")
        private java.util.List < BackupDownloadLinkByDB> backupDownloadLinkByDB;

        private BackupBackupDownloadLinkByDB(Builder builder) {
            this.backupDownloadLinkByDB = builder.backupDownloadLinkByDB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupBackupDownloadLinkByDB create() {
            return builder().build();
        }

        /**
         * @return backupDownloadLinkByDB
         */
        public java.util.List < BackupDownloadLinkByDB> getBackupDownloadLinkByDB() {
            return this.backupDownloadLinkByDB;
        }

        public static final class Builder {
            private java.util.List < BackupDownloadLinkByDB> backupDownloadLinkByDB; 

            /**
             * BackupDownloadLinkByDB.
             */
            public Builder backupDownloadLinkByDB(java.util.List < BackupDownloadLinkByDB> backupDownloadLinkByDB) {
                this.backupDownloadLinkByDB = backupDownloadLinkByDB;
                return this;
            }

            public BackupBackupDownloadLinkByDB build() {
                return new BackupBackupDownloadLinkByDB(this);
            } 

        } 

    }
    public static class Backup extends TeaModel {
        @NameInMap("BackupDownloadLinkByDB")
        private BackupBackupDownloadLinkByDB backupDownloadLinkByDB;

        @NameInMap("BackupDownloadURL")
        private String backupDownloadURL;

        @NameInMap("BackupEndTime")
        private String backupEndTime;

        @NameInMap("BackupId")
        private String backupId;

        @NameInMap("BackupInitiator")
        private String backupInitiator;

        @NameInMap("BackupIntranetDownloadURL")
        private String backupIntranetDownloadURL;

        @NameInMap("BackupMethod")
        private String backupMethod;

        @NameInMap("BackupMode")
        private String backupMode;

        @NameInMap("BackupSize")
        private Long backupSize;

        @NameInMap("BackupStartTime")
        private String backupStartTime;

        @NameInMap("BackupStatus")
        private String backupStatus;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("Checksum")
        private String checksum;

        @NameInMap("ConsistentTime")
        private Long consistentTime;

        @NameInMap("CopyOnlyBackup")
        private String copyOnlyBackup;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("Encryption")
        private String encryption;

        @NameInMap("HostInstanceID")
        private String hostInstanceID;

        @NameInMap("IsAvail")
        private Integer isAvail;

        @NameInMap("MetaStatus")
        private String metaStatus;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("StorageClass")
        private String storageClass;

        @NameInMap("StoreStatus")
        private String storeStatus;

        private Backup(Builder builder) {
            this.backupDownloadLinkByDB = builder.backupDownloadLinkByDB;
            this.backupDownloadURL = builder.backupDownloadURL;
            this.backupEndTime = builder.backupEndTime;
            this.backupId = builder.backupId;
            this.backupInitiator = builder.backupInitiator;
            this.backupIntranetDownloadURL = builder.backupIntranetDownloadURL;
            this.backupMethod = builder.backupMethod;
            this.backupMode = builder.backupMode;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.backupType = builder.backupType;
            this.checksum = builder.checksum;
            this.consistentTime = builder.consistentTime;
            this.copyOnlyBackup = builder.copyOnlyBackup;
            this.DBInstanceId = builder.DBInstanceId;
            this.encryption = builder.encryption;
            this.hostInstanceID = builder.hostInstanceID;
            this.isAvail = builder.isAvail;
            this.metaStatus = builder.metaStatus;
            this.resourceGroupId = builder.resourceGroupId;
            this.storageClass = builder.storageClass;
            this.storeStatus = builder.storeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backup create() {
            return builder().build();
        }

        /**
         * @return backupDownloadLinkByDB
         */
        public BackupBackupDownloadLinkByDB getBackupDownloadLinkByDB() {
            return this.backupDownloadLinkByDB;
        }

        /**
         * @return backupDownloadURL
         */
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        /**
         * @return backupEndTime
         */
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupInitiator
         */
        public String getBackupInitiator() {
            return this.backupInitiator;
        }

        /**
         * @return backupIntranetDownloadURL
         */
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        /**
         * @return backupMethod
         */
        public String getBackupMethod() {
            return this.backupMethod;
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return backupSize
         */
        public Long getBackupSize() {
            return this.backupSize;
        }

        /**
         * @return backupStartTime
         */
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return checksum
         */
        public String getChecksum() {
            return this.checksum;
        }

        /**
         * @return consistentTime
         */
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        /**
         * @return copyOnlyBackup
         */
        public String getCopyOnlyBackup() {
            return this.copyOnlyBackup;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return encryption
         */
        public String getEncryption() {
            return this.encryption;
        }

        /**
         * @return hostInstanceID
         */
        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        /**
         * @return isAvail
         */
        public Integer getIsAvail() {
            return this.isAvail;
        }

        /**
         * @return metaStatus
         */
        public String getMetaStatus() {
            return this.metaStatus;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        /**
         * @return storeStatus
         */
        public String getStoreStatus() {
            return this.storeStatus;
        }

        public static final class Builder {
            private BackupBackupDownloadLinkByDB backupDownloadLinkByDB; 
            private String backupDownloadURL; 
            private String backupEndTime; 
            private String backupId; 
            private String backupInitiator; 
            private String backupIntranetDownloadURL; 
            private String backupMethod; 
            private String backupMode; 
            private Long backupSize; 
            private String backupStartTime; 
            private String backupStatus; 
            private String backupType; 
            private String checksum; 
            private Long consistentTime; 
            private String copyOnlyBackup; 
            private String DBInstanceId; 
            private String encryption; 
            private String hostInstanceID; 
            private Integer isAvail; 
            private String metaStatus; 
            private String resourceGroupId; 
            private String storageClass; 
            private String storeStatus; 

            /**
             * BackupDownloadLinkByDB.
             */
            public Builder backupDownloadLinkByDB(BackupBackupDownloadLinkByDB backupDownloadLinkByDB) {
                this.backupDownloadLinkByDB = backupDownloadLinkByDB;
                return this;
            }

            /**
             * BackupDownloadURL.
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * BackupEndTime.
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * BackupId.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * BackupInitiator.
             */
            public Builder backupInitiator(String backupInitiator) {
                this.backupInitiator = backupInitiator;
                return this;
            }

            /**
             * BackupIntranetDownloadURL.
             */
            public Builder backupIntranetDownloadURL(String backupIntranetDownloadURL) {
                this.backupIntranetDownloadURL = backupIntranetDownloadURL;
                return this;
            }

            /**
             * BackupMethod.
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * BackupMode.
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * BackupSize.
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * BackupStartTime.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * BackupStatus.
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * BackupType.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * Checksum.
             */
            public Builder checksum(String checksum) {
                this.checksum = checksum;
                return this;
            }

            /**
             * ConsistentTime.
             */
            public Builder consistentTime(Long consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * CopyOnlyBackup.
             */
            public Builder copyOnlyBackup(String copyOnlyBackup) {
                this.copyOnlyBackup = copyOnlyBackup;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * Encryption.
             */
            public Builder encryption(String encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * HostInstanceID.
             */
            public Builder hostInstanceID(String hostInstanceID) {
                this.hostInstanceID = hostInstanceID;
                return this;
            }

            /**
             * IsAvail.
             */
            public Builder isAvail(Integer isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            /**
             * MetaStatus.
             */
            public Builder metaStatus(String metaStatus) {
                this.metaStatus = metaStatus;
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
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * StoreStatus.
             */
            public Builder storeStatus(String storeStatus) {
                this.storeStatus = storeStatus;
                return this;
            }

            public Backup build() {
                return new Backup(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Backup")
        private java.util.List < Backup> backup;

        private Items(Builder builder) {
            this.backup = builder.backup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return backup
         */
        public java.util.List < Backup> getBackup() {
            return this.backup;
        }

        public static final class Builder {
            private java.util.List < Backup> backup; 

            /**
             * Backup.
             */
            public Builder backup(java.util.List < Backup> backup) {
                this.backup = backup;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
