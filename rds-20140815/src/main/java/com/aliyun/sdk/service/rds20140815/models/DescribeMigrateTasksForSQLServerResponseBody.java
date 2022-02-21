// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrateTasksForSQLServerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrateTasksForSQLServerResponseBody</p>
 */
public class DescribeMigrateTasksForSQLServerResponseBody extends TeaModel {
    @NameInMap("DBInstanceID")
    private String DBInstanceID;

    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeMigrateTasksForSQLServerResponseBody(Builder builder) {
        this.DBInstanceID = builder.DBInstanceID;
        this.DBInstanceName = builder.DBInstanceName;
        this.endTime = builder.endTime;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrateTasksForSQLServerResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceID
     */
    public String getDBInstanceID() {
        return this.DBInstanceID;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String DBInstanceID; 
        private String DBInstanceName; 
        private String endTime; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private String startTime; 
        private Integer totalRecordCount; 

        /**
         * DBInstanceID.
         */
        public Builder DBInstanceID(String DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

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
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeMigrateTasksForSQLServerResponseBody build() {
            return new DescribeMigrateTasksForSQLServerResponseBody(this);
        } 

    } 

    public static class MigrateTask extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBName")
        private String DBName;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("IsDBReplaced")
        private String isDBReplaced;

        @NameInMap("MigrateIaskId")
        private String migrateIaskId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskType")
        private String taskType;

        private MigrateTask(Builder builder) {
            this.createTime = builder.createTime;
            this.DBName = builder.DBName;
            this.desc = builder.desc;
            this.endTime = builder.endTime;
            this.isDBReplaced = builder.isDBReplaced;
            this.migrateIaskId = builder.migrateIaskId;
            this.status = builder.status;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrateTask create() {
            return builder().build();
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
         * @return desc
         */
        public String getDesc() {
            return this.desc;
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
         * @return migrateIaskId
         */
        public String getMigrateIaskId() {
            return this.migrateIaskId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String createTime; 
            private String DBName; 
            private String desc; 
            private String endTime; 
            private String isDBReplaced; 
            private String migrateIaskId; 
            private String status; 
            private String taskType; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * IsDBReplaced.
             */
            public Builder isDBReplaced(String isDBReplaced) {
                this.isDBReplaced = isDBReplaced;
                return this;
            }

            /**
             * MigrateIaskId.
             */
            public Builder migrateIaskId(String migrateIaskId) {
                this.migrateIaskId = migrateIaskId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public MigrateTask build() {
                return new MigrateTask(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("MigrateTask")
        private java.util.List < MigrateTask> migrateTask;

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
        public java.util.List < MigrateTask> getMigrateTask() {
            return this.migrateTask;
        }

        public static final class Builder {
            private java.util.List < MigrateTask> migrateTask; 

            /**
             * MigrateTask.
             */
            public Builder migrateTask(java.util.List < MigrateTask> migrateTask) {
                this.migrateTask = migrateTask;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
