// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupsResponseBody</p>
 */
public class DescribeBackupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalEcsSnapshotSize")
    private Long totalEcsSnapshotSize;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
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
         * The returned backup sets.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of backup sets on the current page.
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The size of the snapshot chain of the instance. Unit: bytes.
         */
        public Builder totalEcsSnapshotSize(Long totalEcsSnapshotSize) {
            this.totalEcsSnapshotSize = totalEcsSnapshotSize;
            return this;
        }

        /**
         * The total number of entries returned.
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
        @com.aliyun.core.annotation.NameInMap("DataBase")
        private String dataBase;

        @com.aliyun.core.annotation.NameInMap("DownloadLink")
        private String downloadLink;

        @com.aliyun.core.annotation.NameInMap("IntranetDownloadLink")
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
             * The name of the database.
             */
            public Builder dataBase(String dataBase) {
                this.dataBase = dataBase;
                return this;
            }

            /**
             * The public URL from which you can download the backup set.
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * The internal URL from which you can download the backup set.
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
        @com.aliyun.core.annotation.NameInMap("BackupDownloadLinkByDB")
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
        @com.aliyun.core.annotation.NameInMap("BackupDownloadLinkByDB")
        private BackupBackupDownloadLinkByDB backupDownloadLinkByDB;

        @com.aliyun.core.annotation.NameInMap("BackupDownloadURL")
        private String backupDownloadURL;

        @com.aliyun.core.annotation.NameInMap("BackupEndTime")
        private String backupEndTime;

        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("BackupInitiator")
        private String backupInitiator;

        @com.aliyun.core.annotation.NameInMap("BackupIntranetDownloadURL")
        private String backupIntranetDownloadURL;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("BackupSize")
        private Long backupSize;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("Checksum")
        private String checksum;

        @com.aliyun.core.annotation.NameInMap("ConsistentTime")
        private Long consistentTime;

        @com.aliyun.core.annotation.NameInMap("CopyOnlyBackup")
        private String copyOnlyBackup;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("Encryption")
        private String encryption;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("HostInstanceID")
        private String hostInstanceID;

        @com.aliyun.core.annotation.NameInMap("IsAvail")
        private Integer isAvail;

        @com.aliyun.core.annotation.NameInMap("MetaStatus")
        private String metaStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("StoreStatus")
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
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
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
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
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
            private String engine; 
            private String engineVersion; 
            private String hostInstanceID; 
            private Integer isAvail; 
            private String metaStatus; 
            private String resourceGroupId; 
            private String storageClass; 
            private String storeStatus; 

            /**
             * An array consisting of URLs from which you can download backup sets of individual databases.
             */
            public Builder backupDownloadLinkByDB(BackupBackupDownloadLinkByDB backupDownloadLinkByDB) {
                this.backupDownloadLinkByDB = backupDownloadLinkByDB;
                return this;
            }

            /**
             * The URL that is used to download the backup set over the Internet. If the backup set cannot be downloaded, null is returned.
             * <p>
             * 
             * >  For example, if BackupMethod of an ApsaraDB RDS for SQL Server instance is set to **Snapshot**, a null string is returned.
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * The end time of the backup task. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * The ID of the backup set.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * The initiator of the backup task. Valid values:
             * <p>
             * 
             * *   **System**
             * *   **User**
             */
            public Builder backupInitiator(String backupInitiator) {
                this.backupInitiator = backupInitiator;
                return this;
            }

            /**
             * The URL that is used to download the backup set over an internal network. If the backup set cannot be downloaded, null is returned.
             * <p>
             * 
             * >  For example, if BackupMethod of an ApsaraDB RDS for SQL Server instance is set to **Snapshot**, a null string is returned.
             */
            public Builder backupIntranetDownloadURL(String backupIntranetDownloadURL) {
                this.backupIntranetDownloadURL = backupIntranetDownloadURL;
                return this;
            }

            /**
             * The method that is used to generate the backup set. Valid values:
             * <p>
             * 
             * *   **Logical**: logical backup
             * *   **Physical**: physical backup
             * *   **Snapshot**: snapshot backup
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * The backup mode of the backup set. Valid values:
             * <p>
             * 
             * *   **Automated**
             * *   **Manual**
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * The size of the data backup file. Unit: bytes.
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * The start time of the backup. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * The state of the backup set.
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * The backup type of the backup set. Valid values:
             * <p>
             * 
             * *   **FullBackup**
             * *   **IncrementalBackup**
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * The checksum. The value of this parameter is calculated by using the CRC64 algorithm.
             */
            public Builder checksum(String checksum) {
                this.checksum = checksum;
                return this;
            }

            /**
             * The point in time at which the data in the backup set is consistent. The return value of this parameter is a timestamp.
             * <p>
             * 
             * >  If the instance runs MySQL 5.6, a timestamp is returned. Otherwise, the value 0 is returned.
             */
            public Builder consistentTime(Long consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * The backup mode of the backup set. Valid values:
             * <p>
             * 
             * *   0: the standard mode. This mode supports full backups and incremental backups.
             * *   1: the copy-only mode. This mode supports only full backups.
             * 
             * >  This parameter is returned only when the instance runs SQL Server.
             */
            public Builder copyOnlyBackup(String copyOnlyBackup) {
                this.copyOnlyBackup = copyOnlyBackup;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The encryption information about the backup set.
             */
            public Builder encryption(String encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * The type of the database engine. Valid values:
             * <p>
             * 
             * *   MySQL
             * *   SQLServer
             * *   PostgreSQL
             * *   MariaDB
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The version of the database engine.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The ID of the instance that generates the backup set. This parameter is used to indicate whether the instance that generates the backup set is a primary instance or a secondary instance.
             */
            public Builder hostInstanceID(String hostInstanceID) {
                this.hostInstanceID = hostInstanceID;
                return this;
            }

            /**
             * Indicates whether the backup set is available. Valid values:
             * <p>
             * 
             * *   **0**: The backup set is unavailable.
             * *   **1**: The backup set is available.
             */
            public Builder isAvail(Integer isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            /**
             * The status of the backup set that is used to restore individual databases or tables. Valid values:
             * <p>
             * 
             * *   **OK**: The data backup file is normal.
             * *   **LARGE**: The data backup file contains an abnormally large number of tables. It cannot be used to restore individual databases or tables.
             * *   **EMPTY**: The data backup file is generated from a failed backup task.
             * 
             * >  If an empty string is returned, the data backup file cannot be used to restore individual databases or tables.
             */
            public Builder metaStatus(String metaStatus) {
                this.metaStatus = metaStatus;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The storage class of the backup set. Valid values:
             * <p>
             * 
             * *   **0**: regular storage
             * *   **1**: archive storage
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * Indicates whether the backup set can be deleted. Valid values:
             * <p>
             * 
             * *   **Enabled**: The backup set can be deleted.
             * *   **Disabled**: The backup set cannot be deleted.
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
        @com.aliyun.core.annotation.NameInMap("Backup")
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
