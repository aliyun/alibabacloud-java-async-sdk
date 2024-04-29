// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataBackupsResponseBody</p>
 */
public class DescribeDataBackupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalBackupSize")
    private Long totalBackupSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDataBackupsResponseBody(Builder builder) {
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

    public static DescribeDataBackupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalBackupSize; 
        private Integer totalCount; 

        /**
         * The instance ID.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total backup set size. Unit: Byte.
         */
        public Builder totalBackupSize(Long totalBackupSize) {
            this.totalBackupSize = totalBackupSize;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataBackupsResponseBody build() {
            return new DescribeDataBackupsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupEndTime")
        private String backupEndTime;

        @com.aliyun.core.annotation.NameInMap("BackupEndTimeLocal")
        private String backupEndTimeLocal;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("BackupSetId")
        private String backupSetId;

        @com.aliyun.core.annotation.NameInMap("BackupSize")
        private Long backupSize;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupStartTimeLocal")
        private String backupStartTimeLocal;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("BaksetName")
        private String baksetName;

        @com.aliyun.core.annotation.NameInMap("ConsistentTime")
        private Long consistentTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        private Items(Builder builder) {
            this.backupEndTime = builder.backupEndTime;
            this.backupEndTimeLocal = builder.backupEndTimeLocal;
            this.backupMethod = builder.backupMethod;
            this.backupMode = builder.backupMode;
            this.backupSetId = builder.backupSetId;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStartTimeLocal = builder.backupStartTimeLocal;
            this.backupStatus = builder.backupStatus;
            this.baksetName = builder.baksetName;
            this.consistentTime = builder.consistentTime;
            this.DBInstanceId = builder.DBInstanceId;
            this.dataType = builder.dataType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return backupEndTime
         */
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        /**
         * @return backupEndTimeLocal
         */
        public String getBackupEndTimeLocal() {
            return this.backupEndTimeLocal;
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
         * @return backupSetId
         */
        public String getBackupSetId() {
            return this.backupSetId;
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
         * @return backupStartTimeLocal
         */
        public String getBackupStartTimeLocal() {
            return this.backupStartTimeLocal;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return baksetName
         */
        public String getBaksetName() {
            return this.baksetName;
        }

        /**
         * @return consistentTime
         */
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        public static final class Builder {
            private String backupEndTime; 
            private String backupEndTimeLocal; 
            private String backupMethod; 
            private String backupMode; 
            private String backupSetId; 
            private Long backupSize; 
            private String backupStartTime; 
            private String backupStartTimeLocal; 
            private String backupStatus; 
            private String baksetName; 
            private Long consistentTime; 
            private String DBInstanceId; 
            private String dataType; 

            /**
             * The UTC time when the backup ended. The time is in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC.
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * The local time when the backup ended. The time is in the yyyy-MM-dd HH:mm:ss format. The time is your local time.
             */
            public Builder backupEndTimeLocal(String backupEndTimeLocal) {
                this.backupEndTimeLocal = backupEndTimeLocal;
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
             * The backup mode.
             * <p>
             * 
             * Valid values for full backup:
             * 
             * *   Automated: automatic backup
             * *   Manual: manual backup
             * 
             * Valid values for point-in-time backup:
             * 
             * *   Automated: point-in-time backup after full backup
             * *   Manual: manual point-in-time backup
             * *   Period: point-in-time backup that is triggered by a backup policy
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * The ID of the backup set.
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * The size of the backup file. Unit: bytes.
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * The UTC time when the backup started. The time is in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * The local time when the backup started. The time is in the yyyy-MM-dd HH:mm:ss format. The time is your local time.
             */
            public Builder backupStartTimeLocal(String backupStartTimeLocal) {
                this.backupStartTimeLocal = backupStartTimeLocal;
                return this;
            }

            /**
             * The status of the backup set. Valid values:
             * <p>
             * 
             * *   Success
             * *   Failure
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * The name of a point-in-time backup set or the full backup set.
             */
            public Builder baksetName(String baksetName) {
                this.baksetName = baksetName;
                return this;
            }

            /**
             * *   For full backup, this parameter indicates the point in time at which the data in the data backup file is consistent.
             * <p>
             * *   For point-in-time backup, this parameter indicates that the returned point in time is a timestamp.
             */
            public Builder consistentTime(Long consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The type of the backup. Valid values:
             * <p>
             * 
             * *   DATA: full backup
             * *   RESTOREPOI: point-in-time backup
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
