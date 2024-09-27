// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The instance ID.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3E387971-33A5-5019-AD7F-DC**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total backup set size. Unit: Byte.</p>
         * 
         * <strong>example:</strong>
         * <p>1111111111</p>
         */
        public Builder totalBackupSize(Long totalBackupSize) {
            this.totalBackupSize = totalBackupSize;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataBackupsResponseBody build() {
            return new DescribeDataBackupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataBackupsResponseBody</p>
     */
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
             * <p>The UTC time when the backup ended. The time is in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-22T12:01:43Z</p>
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * <p>The local time when the backup ended. The time is in the yyyy-MM-dd HH:mm:ss format. The time is your local time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-22 20:00:25</p>
             */
            public Builder backupEndTimeLocal(String backupEndTimeLocal) {
                this.backupEndTimeLocal = backupEndTimeLocal;
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
             * <p>The backup mode.</p>
             * <p>Valid values for full backup:</p>
             * <ul>
             * <li>Automated: automatic backup</li>
             * <li>Manual: manual backup</li>
             * </ul>
             * <p>Valid values for point-in-time backup:</p>
             * <ul>
             * <li>Automated: point-in-time backup after full backup</li>
             * <li>Manual: manual point-in-time backup</li>
             * <li>Period: point-in-time backup that is triggered by a backup policy</li>
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
             * <p>The ID of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>1111111111</p>
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * <p>The size of the backup file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2167808</p>
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * <p>The UTC time when the backup started. The time is in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-22T12:00:25Z</p>
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The local time when the backup started. The time is in the yyyy-MM-dd HH:mm:ss format. The time is your local time.</p>
             * 
             * <strong>example:</strong>
             * <p>2011-05-30 03:29:00</p>
             */
            public Builder backupStartTimeLocal(String backupStartTimeLocal) {
                this.backupStartTimeLocal = backupStartTimeLocal;
                return this;
            }

            /**
             * <p>The status of the backup set. Valid values:</p>
             * <ul>
             * <li>Success</li>
             * <li>Failure</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * <p>The name of a point-in-time backup set or the full backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>adbpgbackup_555*****_20211222200019</p>
             */
            public Builder baksetName(String baksetName) {
                this.baksetName = baksetName;
                return this;
            }

            /**
             * <ul>
             * <li>For full backup, this parameter indicates the point in time at which the data in the data backup file is consistent.</li>
             * <li>For point-in-time backup, this parameter indicates that the returned point in time is a timestamp.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1576506856</p>
             */
            public Builder consistentTime(Long consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gp-bp**************-master</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The type of the backup. Valid values:</p>
             * <ul>
             * <li>DATA: full backup</li>
             * <li>RESTOREPOI: point-in-time backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATA</p>
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
