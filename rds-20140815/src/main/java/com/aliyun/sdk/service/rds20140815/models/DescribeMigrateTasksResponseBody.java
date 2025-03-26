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
 * {@link DescribeMigrateTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrateTasksResponseBody</p>
 */
public class DescribeMigrateTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeMigrateTasksResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrateTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeMigrateTasksResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
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
         * <p>The details of the migration task.</p>
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
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4E356DDF-6B83-45DB-99D5-4B1E8A0D286B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeMigrateTasksResponseBody build() {
            return new DescribeMigrateTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMigrateTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrateTasksResponseBody</p>
     */
    public static class MigrateTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("IsDBReplaced")
        private String isDBReplaced;

        @com.aliyun.core.annotation.NameInMap("MigrateTaskId")
        private String migrateTaskId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private MigrateTask(Builder builder) {
            this.backupMode = builder.backupMode;
            this.createTime = builder.createTime;
            this.DBName = builder.DBName;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.isDBReplaced = builder.isDBReplaced;
            this.migrateTaskId = builder.migrateTaskId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrateTask create() {
            return builder().build();
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return isDBReplaced
         */
        public String getIsDBReplaced() {
            return this.isDBReplaced;
        }

        /**
         * @return migrateTaskId
         */
        public String getMigrateTaskId() {
            return this.migrateTaskId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String backupMode; 
            private String createTime; 
            private String DBName; 
            private String description; 
            private String endTime; 
            private String isDBReplaced; 
            private String migrateTaskId; 
            private String status; 

            private Builder() {
            } 

            private Builder(MigrateTask model) {
                this.backupMode = model.backupMode;
                this.createTime = model.createTime;
                this.DBName = model.DBName;
                this.description = model.description;
                this.endTime = model.endTime;
                this.isDBReplaced = model.isDBReplaced;
                this.migrateTaskId = model.migrateTaskId;
                this.status = model.status;
            } 

            /**
             * <p>The migration task type. Valid values:</p>
             * <ul>
             * <li><strong>FULL</strong>: The migration task migrates full backup files that can be used to restore the full data of the instance.</li>
             * <li><strong>UPDF</strong>: The migration task migrates incremental or log backup files that can be used to restore the incremental data of the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FULL</p>
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * <p>The time when the migration task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-05-30T12:11:04Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>testDB</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The description of the migration task.</p>
             * 
             * <strong>example:</strong>
             * <p>Api description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the migration task was completed. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-05-30T13:11:04Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether the imported data overwrites the existing data.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isDBReplaced(String isDBReplaced) {
                this.isDBReplaced = isDBReplaced;
                return this;
            }

            /**
             * <p>The migration task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>564522545</p>
             */
            public Builder migrateTaskId(String migrateTaskId) {
                this.migrateTaskId = migrateTaskId;
                return this;
            }

            /**
             * <p>The status of the migration task. Valid values:</p>
             * <ul>
             * <li><strong>NoStart</strong>: The task is not started.</li>
             * <li><strong>Running</strong>:The task is in progress.</li>
             * <li><strong>Success</strong>: The task is successful.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Waiting</strong>: The task is waiting for an incremental backup file to be imported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public MigrateTask build() {
                return new MigrateTask(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrateTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrateTasksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MigrateTask")
        private java.util.List<MigrateTask> migrateTask;

        private Items(Builder builder) {
            this.migrateTask = builder.migrateTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return migrateTask
         */
        public java.util.List<MigrateTask> getMigrateTask() {
            return this.migrateTask;
        }

        public static final class Builder {
            private java.util.List<MigrateTask> migrateTask; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.migrateTask = model.migrateTask;
            } 

            /**
             * MigrateTask.
             */
            public Builder migrateTask(java.util.List<MigrateTask> migrateTask) {
                this.migrateTask = migrateTask;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
