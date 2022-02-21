// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSqlFlashbakTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlFlashbakTaskResponseBody</p>
 */
public class DescribeSqlFlashbakTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SqlFlashbackTasks")
    private SqlFlashbackTasks sqlFlashbackTasks;

    @NameInMap("Success")
    private Boolean success;

    private DescribeSqlFlashbakTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sqlFlashbackTasks = builder.sqlFlashbackTasks;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlFlashbakTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sqlFlashbackTasks
     */
    public SqlFlashbackTasks getSqlFlashbackTasks() {
        return this.sqlFlashbackTasks;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private SqlFlashbackTasks sqlFlashbackTasks; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SqlFlashbackTasks.
         */
        public Builder sqlFlashbackTasks(SqlFlashbackTasks sqlFlashbackTasks) {
            this.sqlFlashbackTasks = sqlFlashbackTasks;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSqlFlashbakTaskResponseBody build() {
            return new DescribeSqlFlashbakTaskResponseBody(this);
        } 

    } 

    public static class SqlFlashbackTask extends TeaModel {
        @NameInMap("DbName")
        private String dbName;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstId")
        private String instId;

        @NameInMap("RecallProgress")
        private Integer recallProgress;

        @NameInMap("RecallRestoreType")
        private Integer recallRestoreType;

        @NameInMap("RecallStatus")
        private Integer recallStatus;

        @NameInMap("RecallType")
        private Integer recallType;

        @NameInMap("SearchEndTime")
        private Long searchEndTime;

        @NameInMap("SearchStartTime")
        private Long searchStartTime;

        @NameInMap("SqlCounter")
        private Long sqlCounter;

        @NameInMap("SqlPk")
        private String sqlPk;

        @NameInMap("SqlType")
        private String sqlType;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TraceId")
        private String traceId;

        private SqlFlashbackTask(Builder builder) {
            this.dbName = builder.dbName;
            this.downloadUrl = builder.downloadUrl;
            this.expireTime = builder.expireTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.instId = builder.instId;
            this.recallProgress = builder.recallProgress;
            this.recallRestoreType = builder.recallRestoreType;
            this.recallStatus = builder.recallStatus;
            this.recallType = builder.recallType;
            this.searchEndTime = builder.searchEndTime;
            this.searchStartTime = builder.searchStartTime;
            this.sqlCounter = builder.sqlCounter;
            this.sqlPk = builder.sqlPk;
            this.sqlType = builder.sqlType;
            this.tableName = builder.tableName;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlFlashbackTask create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instId
         */
        public String getInstId() {
            return this.instId;
        }

        /**
         * @return recallProgress
         */
        public Integer getRecallProgress() {
            return this.recallProgress;
        }

        /**
         * @return recallRestoreType
         */
        public Integer getRecallRestoreType() {
            return this.recallRestoreType;
        }

        /**
         * @return recallStatus
         */
        public Integer getRecallStatus() {
            return this.recallStatus;
        }

        /**
         * @return recallType
         */
        public Integer getRecallType() {
            return this.recallType;
        }

        /**
         * @return searchEndTime
         */
        public Long getSearchEndTime() {
            return this.searchEndTime;
        }

        /**
         * @return searchStartTime
         */
        public Long getSearchStartTime() {
            return this.searchStartTime;
        }

        /**
         * @return sqlCounter
         */
        public Long getSqlCounter() {
            return this.sqlCounter;
        }

        /**
         * @return sqlPk
         */
        public String getSqlPk() {
            return this.sqlPk;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String dbName; 
            private String downloadUrl; 
            private Long expireTime; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String instId; 
            private Integer recallProgress; 
            private Integer recallRestoreType; 
            private Integer recallStatus; 
            private Integer recallType; 
            private Long searchEndTime; 
            private Long searchStartTime; 
            private Long sqlCounter; 
            private String sqlPk; 
            private String sqlType; 
            private String tableName; 
            private String traceId; 

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InstId.
             */
            public Builder instId(String instId) {
                this.instId = instId;
                return this;
            }

            /**
             * RecallProgress.
             */
            public Builder recallProgress(Integer recallProgress) {
                this.recallProgress = recallProgress;
                return this;
            }

            /**
             * RecallRestoreType.
             */
            public Builder recallRestoreType(Integer recallRestoreType) {
                this.recallRestoreType = recallRestoreType;
                return this;
            }

            /**
             * RecallStatus.
             */
            public Builder recallStatus(Integer recallStatus) {
                this.recallStatus = recallStatus;
                return this;
            }

            /**
             * RecallType.
             */
            public Builder recallType(Integer recallType) {
                this.recallType = recallType;
                return this;
            }

            /**
             * SearchEndTime.
             */
            public Builder searchEndTime(Long searchEndTime) {
                this.searchEndTime = searchEndTime;
                return this;
            }

            /**
             * SearchStartTime.
             */
            public Builder searchStartTime(Long searchStartTime) {
                this.searchStartTime = searchStartTime;
                return this;
            }

            /**
             * SqlCounter.
             */
            public Builder sqlCounter(Long sqlCounter) {
                this.sqlCounter = sqlCounter;
                return this;
            }

            /**
             * SqlPk.
             */
            public Builder sqlPk(String sqlPk) {
                this.sqlPk = sqlPk;
                return this;
            }

            /**
             * SqlType.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public SqlFlashbackTask build() {
                return new SqlFlashbackTask(this);
            } 

        } 

    }
    public static class SqlFlashbackTasks extends TeaModel {
        @NameInMap("SqlFlashbackTask")
        private java.util.List < SqlFlashbackTask> sqlFlashbackTask;

        private SqlFlashbackTasks(Builder builder) {
            this.sqlFlashbackTask = builder.sqlFlashbackTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlFlashbackTasks create() {
            return builder().build();
        }

        /**
         * @return sqlFlashbackTask
         */
        public java.util.List < SqlFlashbackTask> getSqlFlashbackTask() {
            return this.sqlFlashbackTask;
        }

        public static final class Builder {
            private java.util.List < SqlFlashbackTask> sqlFlashbackTask; 

            /**
             * SqlFlashbackTask.
             */
            public Builder sqlFlashbackTask(java.util.List < SqlFlashbackTask> sqlFlashbackTask) {
                this.sqlFlashbackTask = sqlFlashbackTask;
                return this;
            }

            public SqlFlashbackTasks build() {
                return new SqlFlashbackTasks(this);
            } 

        } 

    }
}
