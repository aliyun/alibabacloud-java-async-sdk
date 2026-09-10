// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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

    @com.aliyun.core.annotation.NameInMap("TotalLevel2BackupSize")
    private String totalLevel2BackupSize;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribeBackupsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalLevel2BackupSize = builder.totalLevel2BackupSize;
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
     * @return totalLevel2BackupSize
     */
    public String getTotalLevel2BackupSize() {
        return this.totalLevel2BackupSize;
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
        private String totalLevel2BackupSize; 
        private String totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeBackupsResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalLevel2BackupSize = model.totalLevel2BackupSize;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total size of level-2 backups in the specified region. Unit: bytes.</p>
         * <blockquote>
         * <ul>
         * <li>Only PSL4 and PSL5 storage types are supported.</li>
         * <li>Only clusters with the level-2 backup feature enabled are supported.</li>
         * <li>If this parameter is not returned, the level-2 backup size is 0.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4639948800</p>
         */
        public Builder totalLevel2BackupSize(String totalLevel2BackupSize) {
            this.totalLevel2BackupSize = totalLevel2BackupSize;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
    public static class Backup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupEndTime")
        private String backupEndTime;

        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("BackupSetSize")
        private String backupSetSize;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("BackupsLevel")
        private String backupsLevel;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("ConsistentTime")
        private String consistentTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("ExpectExpireTime")
        private String expectExpireTime;

        @com.aliyun.core.annotation.NameInMap("ExpectExpireType")
        private String expectExpireType;

        @com.aliyun.core.annotation.NameInMap("IsAvail")
        private String isAvail;

        @com.aliyun.core.annotation.NameInMap("TableRestoreMetaStatus")
        private String tableRestoreMetaStatus;

        private Backup(Builder builder) {
            this.backupEndTime = builder.backupEndTime;
            this.backupId = builder.backupId;
            this.backupMethod = builder.backupMethod;
            this.backupMode = builder.backupMode;
            this.backupSetSize = builder.backupSetSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.backupType = builder.backupType;
            this.backupsLevel = builder.backupsLevel;
            this.comment = builder.comment;
            this.consistentTime = builder.consistentTime;
            this.DBClusterId = builder.DBClusterId;
            this.expectExpireTime = builder.expectExpireTime;
            this.expectExpireType = builder.expectExpireType;
            this.isAvail = builder.isAvail;
            this.tableRestoreMetaStatus = builder.tableRestoreMetaStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backup create() {
            return builder().build();
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
         * @return backupSetSize
         */
        public String getBackupSetSize() {
            return this.backupSetSize;
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
         * @return backupsLevel
         */
        public String getBackupsLevel() {
            return this.backupsLevel;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return consistentTime
         */
        public String getConsistentTime() {
            return this.consistentTime;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return expectExpireTime
         */
        public String getExpectExpireTime() {
            return this.expectExpireTime;
        }

        /**
         * @return expectExpireType
         */
        public String getExpectExpireType() {
            return this.expectExpireType;
        }

        /**
         * @return isAvail
         */
        public String getIsAvail() {
            return this.isAvail;
        }

        /**
         * @return tableRestoreMetaStatus
         */
        public String getTableRestoreMetaStatus() {
            return this.tableRestoreMetaStatus;
        }

        public static final class Builder {
            private String backupEndTime; 
            private String backupId; 
            private String backupMethod; 
            private String backupMode; 
            private String backupSetSize; 
            private String backupStartTime; 
            private String backupStatus; 
            private String backupType; 
            private String backupsLevel; 
            private String comment; 
            private String consistentTime; 
            private String DBClusterId; 
            private String expectExpireTime; 
            private String expectExpireType; 
            private String isAvail; 
            private String tableRestoreMetaStatus; 

            private Builder() {
            } 

            private Builder(Backup model) {
                this.backupEndTime = model.backupEndTime;
                this.backupId = model.backupId;
                this.backupMethod = model.backupMethod;
                this.backupMode = model.backupMode;
                this.backupSetSize = model.backupSetSize;
                this.backupStartTime = model.backupStartTime;
                this.backupStatus = model.backupStatus;
                this.backupType = model.backupType;
                this.backupsLevel = model.backupsLevel;
                this.comment = model.comment;
                this.consistentTime = model.consistentTime;
                this.DBClusterId = model.DBClusterId;
                this.expectExpireTime = model.expectExpireTime;
                this.expectExpireType = model.expectExpireType;
                this.isAvail = model.isAvail;
                this.tableRestoreMetaStatus = model.tableRestoreMetaStatus;
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
             * BackupSetSize.
             */
            public Builder backupSetSize(String backupSetSize) {
                this.backupSetSize = backupSetSize;
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
             * BackupsLevel.
             */
            public Builder backupsLevel(String backupsLevel) {
                this.backupsLevel = backupsLevel;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * ConsistentTime.
             */
            public Builder consistentTime(String consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * ExpectExpireTime.
             */
            public Builder expectExpireTime(String expectExpireTime) {
                this.expectExpireTime = expectExpireTime;
                return this;
            }

            /**
             * ExpectExpireType.
             */
            public Builder expectExpireType(String expectExpireType) {
                this.expectExpireType = expectExpireType;
                return this;
            }

            /**
             * IsAvail.
             */
            public Builder isAvail(String isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            /**
             * TableRestoreMetaStatus.
             */
            public Builder tableRestoreMetaStatus(String tableRestoreMetaStatus) {
                this.tableRestoreMetaStatus = tableRestoreMetaStatus;
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
