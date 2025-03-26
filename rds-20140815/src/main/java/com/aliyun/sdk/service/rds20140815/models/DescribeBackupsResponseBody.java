// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeBackupsResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalEcsSnapshotSize = model.totalEcsSnapshotSize;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The returned backup sets.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of backup sets on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1A6D328C-84B8-40DC-BF49-6C73984D7494</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The size of the snapshot chain of the instance. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalEcsSnapshotSize(Long totalEcsSnapshotSize) {
            this.totalEcsSnapshotSize = totalEcsSnapshotSize;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeBackupsResponseBody build() {
            return new DescribeBackupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(BackupDownloadLinkByDB model) {
                this.dataBase = model.dataBase;
                this.downloadLink = model.downloadLink;
                this.intranetDownloadLink = model.intranetDownloadLink;
            } 

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>dbs</p>
             */
            public Builder dataBase(String dataBase) {
                this.dataBase = dataBase;
                return this;
            }

            /**
             * <p>The public URL from which you can download the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-hangzhou.bak.rds.aliyuncs.com/custins53664665/hins18676859_2021072909473127987849.zip?Expires=*****&dbList=tb1">https://cn-hangzhou.bak.rds.aliyuncs.com/custins53664665/hins18676859_2021072909473127987849.zip?Expires=*****&amp;dbList=tb1</a></p>
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * <p>The internal URL from which you can download the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-hangzhou-internal.bak.rds.aliyuncs.com/custins53664665/hins18676859_2021072909473127987849.zip?Expires=*****&dbList=tb1">https://cn-hangzhou-internal.bak.rds.aliyuncs.com/custins53664665/hins18676859_2021072909473127987849.zip?Expires=*****&amp;dbList=tb1</a></p>
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
    /**
     * 
     * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupsResponseBody</p>
     */
    public static class BackupBackupDownloadLinkByDB extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupDownloadLinkByDB")
        private java.util.List<BackupDownloadLinkByDB> backupDownloadLinkByDB;

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
        public java.util.List<BackupDownloadLinkByDB> getBackupDownloadLinkByDB() {
            return this.backupDownloadLinkByDB;
        }

        public static final class Builder {
            private java.util.List<BackupDownloadLinkByDB> backupDownloadLinkByDB; 

            private Builder() {
            } 

            private Builder(BackupBackupDownloadLinkByDB model) {
                this.backupDownloadLinkByDB = model.backupDownloadLinkByDB;
            } 

            /**
             * BackupDownloadLinkByDB.
             */
            public Builder backupDownloadLinkByDB(java.util.List<BackupDownloadLinkByDB> backupDownloadLinkByDB) {
                this.backupDownloadLinkByDB = backupDownloadLinkByDB;
                return this;
            }

            public BackupBackupDownloadLinkByDB build() {
                return new BackupBackupDownloadLinkByDB(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupsResponseBody</p>
     */
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
            private String storageClass; 
            private String storeStatus; 

            private Builder() {
            } 

            private Builder(Backup model) {
                this.backupDownloadLinkByDB = model.backupDownloadLinkByDB;
                this.backupDownloadURL = model.backupDownloadURL;
                this.backupEndTime = model.backupEndTime;
                this.backupId = model.backupId;
                this.backupInitiator = model.backupInitiator;
                this.backupIntranetDownloadURL = model.backupIntranetDownloadURL;
                this.backupMethod = model.backupMethod;
                this.backupMode = model.backupMode;
                this.backupSize = model.backupSize;
                this.backupStartTime = model.backupStartTime;
                this.backupStatus = model.backupStatus;
                this.backupType = model.backupType;
                this.checksum = model.checksum;
                this.consistentTime = model.consistentTime;
                this.copyOnlyBackup = model.copyOnlyBackup;
                this.DBInstanceId = model.DBInstanceId;
                this.encryption = model.encryption;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.hostInstanceID = model.hostInstanceID;
                this.isAvail = model.isAvail;
                this.metaStatus = model.metaStatus;
                this.storageClass = model.storageClass;
                this.storeStatus = model.storeStatus;
            } 

            /**
             * <p>An array consisting of URLs from which you can download backup sets of individual databases.</p>
             */
            public Builder backupDownloadLinkByDB(BackupBackupDownloadLinkByDB backupDownloadLinkByDB) {
                this.backupDownloadLinkByDB = backupDownloadLinkByDB;
                return this;
            }

            /**
             * <p>The URL that is used to download the backup set over the Internet. If the backup set cannot be downloaded, null is returned.</p>
             * <blockquote>
             * <p> For example, if BackupMethod of an ApsaraDB RDS for SQL Server instance is set to <strong>Snapshot</strong>, a null string is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://rdsbak-hz-v3.oss-cn-hangzhou.aliyuncs.com/xxxxx">http://rdsbak-hz-v3.oss-cn-hangzhou.aliyuncs.com/xxxxx</a></p>
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * <p>The end time of the backup task. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-13T12:20:00Z</p>
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * <p>The ID of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>321020562</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The initiator of the backup task. Valid values:</p>
             * <ul>
             * <li><strong>System</strong></li>
             * <li><strong>User</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder backupInitiator(String backupInitiator) {
                this.backupInitiator = backupInitiator;
                return this;
            }

            /**
             * <p>The URL that is used to download the backup set over an internal network. If the backup set cannot be downloaded, null is returned.</p>
             * <blockquote>
             * <p> For example, if BackupMethod of an ApsaraDB RDS for SQL Server instance is set to <strong>Snapshot</strong>, a null string is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://rdsbak-hz-v3.oss-cn-hangzhou-internal.aliyuncs.com/xxxxx">http://rdsbak-hz-v3.oss-cn-hangzhou-internal.aliyuncs.com/xxxxx</a></p>
             */
            public Builder backupIntranetDownloadURL(String backupIntranetDownloadURL) {
                this.backupIntranetDownloadURL = backupIntranetDownloadURL;
                return this;
            }

            /**
             * <p>The method that is used to generate the backup set. Valid values:</p>
             * <ul>
             * <li><strong>Logical</strong>: logical backup</li>
             * <li><strong>Physical</strong>: physical backup</li>
             * <li><strong>Snapshot</strong>: snapshot backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Physical</p>
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * <p>The backup mode of the backup set. Valid values:</p>
             * <ul>
             * <li><strong>Automated</strong></li>
             * <li><strong>Manual</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Automated</p>
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * <p>The size of the data backup file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2167808</p>
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * <p>The start time of the backup. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-03T12:20:00Z</p>
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The state of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * <p>The backup type of the backup set. Valid values:</p>
             * <ul>
             * <li><strong>FullBackup</strong></li>
             * <li><strong>IncrementalBackup</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FullBackup</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The checksum. The value of this parameter is calculated by using the CRC64 algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>1835830439**********</p>
             */
            public Builder checksum(String checksum) {
                this.checksum = checksum;
                return this;
            }

            /**
             * <p>The point in time at which the data in the backup set is consistent. The return value of this parameter is a timestamp.</p>
             * <blockquote>
             * <p> If the instance runs MySQL 5.6, a timestamp is returned. Otherwise, the value 0 is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1576506856</p>
             */
            public Builder consistentTime(Long consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * <p>The backup mode of the backup set. Valid values:</p>
             * <ul>
             * <li>0: the standard mode. This mode supports full backups and incremental backups.</li>
             * <li>1: the copy-only mode. This mode supports only full backups.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only when the instance runs SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder copyOnlyBackup(String copyOnlyBackup) {
                this.copyOnlyBackup = copyOnlyBackup;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxx</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The encryption information about the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder encryption(String encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * <p>The type of the database engine. Valid values:</p>
             * <ul>
             * <li>MySQL</li>
             * <li>SQLServer</li>
             * <li>PostgreSQL</li>
             * <li>MariaDB</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The version of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The ID of the instance that generates the backup set. This parameter is used to indicate whether the instance that generates the backup set is a primary instance or a secondary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5882781</p>
             */
            public Builder hostInstanceID(String hostInstanceID) {
                this.hostInstanceID = hostInstanceID;
                return this;
            }

            /**
             * <p>Indicates whether the backup set is available. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The backup set is unavailable.</li>
             * <li><strong>1</strong>: The backup set is available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isAvail(Integer isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            /**
             * <p>The status of the backup set that is used to restore individual databases or tables. Valid values:</p>
             * <ul>
             * <li><strong>OK</strong>: The data backup file is normal.</li>
             * <li><strong>LARGE</strong>: The data backup file contains an abnormally large number of tables. It cannot be used to restore individual databases or tables.</li>
             * <li><strong>EMPTY</strong>: The data backup file is generated from a failed backup task.</li>
             * </ul>
             * <blockquote>
             * <p> If an empty string is returned, the data backup file cannot be used to restore individual databases or tables.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder metaStatus(String metaStatus) {
                this.metaStatus = metaStatus;
                return this;
            }

            /**
             * <p>The storage class of the backup set. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: regular storage</li>
             * <li><strong>1</strong>: archive storage</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * <p>Indicates whether the backup set can be deleted. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: The backup set can be deleted.</li>
             * <li><strong>Disabled</strong>: The backup set cannot be deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
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
    /**
     * 
     * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Backup")
        private java.util.List<Backup> backup;

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
        public java.util.List<Backup> getBackup() {
            return this.backup;
        }

        public static final class Builder {
            private java.util.List<Backup> backup; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.backup = model.backup;
            } 

            /**
             * Backup.
             */
            public Builder backup(java.util.List<Backup> backup) {
                this.backup = backup;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
