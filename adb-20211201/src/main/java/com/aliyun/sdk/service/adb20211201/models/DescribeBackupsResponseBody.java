// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
    @com.aliyun.core.annotation.NameInMap("FreeBackupSize")
    private Long freeBackupSize;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalBackupSize")
    private Long totalBackupSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeBackupsResponseBody(Builder builder) {
        this.freeBackupSize = builder.freeBackupSize;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalBackupSize = builder.totalBackupSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return freeBackupSize
     */
    public Long getFreeBackupSize() {
        return this.freeBackupSize;
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
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalBackupSize
     */
    public Long getTotalBackupSize() {
        return this.totalBackupSize;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long freeBackupSize; 
        private Items items; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private Long totalBackupSize; 
        private String totalCount; 

        /**
         * FreeBackupSize.
         */
        public Builder freeBackupSize(Long freeBackupSize) {
            this.freeBackupSize = freeBackupSize;
            return this;
        }

        /**
         * <p>The queried backup sets.</p>
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CE17270B-F8F8-5A31-9DB4-DADDFDAD7940</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalBackupSize.
         */
        public Builder totalBackupSize(Long totalBackupSize) {
            this.totalBackupSize = totalBackupSize;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
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

        @com.aliyun.core.annotation.NameInMap("BackupExpiredTime")
        private String backupExpiredTime;

        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupSize")
        private Integer backupSize;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        private Backup(Builder builder) {
            this.backupEndTime = builder.backupEndTime;
            this.backupExpiredTime = builder.backupExpiredTime;
            this.backupId = builder.backupId;
            this.backupMethod = builder.backupMethod;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupType = builder.backupType;
            this.DBClusterId = builder.DBClusterId;
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
         * @return backupExpiredTime
         */
        public String getBackupExpiredTime() {
            return this.backupExpiredTime;
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
         * @return backupSize
         */
        public Integer getBackupSize() {
            return this.backupSize;
        }

        /**
         * @return backupStartTime
         */
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public static final class Builder {
            private String backupEndTime; 
            private String backupExpiredTime; 
            private String backupId; 
            private String backupMethod; 
            private Integer backupSize; 
            private String backupStartTime; 
            private String backupType; 
            private String DBClusterId; 

            /**
             * <p>The end time of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-06-02T16:00Z</p>
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * BackupExpiredTime.
             */
            public Builder backupExpiredTime(String backupExpiredTime) {
                this.backupExpiredTime = backupExpiredTime;
                return this;
            }

            /**
             * <p>The backup set ID.</p>
             * 
             * <strong>example:</strong>
             * <p>32732****</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The backup method. Snapshot is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Snapshot</p>
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * <p>The size of the backup set. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2167808</p>
             */
            public Builder backupSize(Integer backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * <p>The start time of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-06-01T16:00Z</p>
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The backup type. Valid values:</p>
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
             * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>am-bp11q28kvl688****</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
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
