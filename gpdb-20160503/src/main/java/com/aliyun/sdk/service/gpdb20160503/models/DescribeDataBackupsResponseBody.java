// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataBackupsResponseBody</p>
 */
public class DescribeDataBackupsResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDataBackupsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
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
        private Integer totalCount; 

        /**
         * Details about the backup sets.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of backup sets on the page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries.
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
        @NameInMap("BackupEndTime")
        private String backupEndTime;

        @NameInMap("BackupEndTimeLocal")
        private String backupEndTimeLocal;

        @NameInMap("BackupMode")
        private String backupMode;

        @NameInMap("BackupSetId")
        private String backupSetId;

        @NameInMap("BackupSize")
        private Long backupSize;

        @NameInMap("BackupStartTime")
        private String backupStartTime;

        @NameInMap("BackupStartTimeLocal")
        private String backupStartTimeLocal;

        @NameInMap("BackupStatus")
        private String backupStatus;

        @NameInMap("BaksetName")
        private String baksetName;

        @NameInMap("ConsistentTime")
        private Long consistentTime;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DataType")
        private String dataType;

        private Items(Builder builder) {
            this.backupEndTime = builder.backupEndTime;
            this.backupEndTimeLocal = builder.backupEndTimeLocal;
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
