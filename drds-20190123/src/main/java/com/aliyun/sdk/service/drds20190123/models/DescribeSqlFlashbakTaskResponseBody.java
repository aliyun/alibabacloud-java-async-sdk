// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeSqlFlashbakTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlFlashbakTaskResponseBody</p>
 */
public class DescribeSqlFlashbakTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SqlFlashbackTasks")
    private SqlFlashbackTasks sqlFlashbackTasks;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>Indicates the ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5D64DE59-44A1-E541-E0CB-B7E5C4305162</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates the information about flashback tasks.</p>
         */
        public Builder sqlFlashbackTasks(SqlFlashbackTasks sqlFlashbackTasks) {
            this.sqlFlashbackTasks = sqlFlashbackTasks;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSqlFlashbakTaskResponseBody build() {
            return new DescribeSqlFlashbakTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlFlashbakTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlFlashbakTaskResponseBody</p>
     */
    public static class SqlFlashbackTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstId")
        private String instId;

        @com.aliyun.core.annotation.NameInMap("RecallProgress")
        private Integer recallProgress;

        @com.aliyun.core.annotation.NameInMap("RecallRestoreType")
        private Integer recallRestoreType;

        @com.aliyun.core.annotation.NameInMap("RecallStatus")
        private Integer recallStatus;

        @com.aliyun.core.annotation.NameInMap("RecallType")
        private Integer recallType;

        @com.aliyun.core.annotation.NameInMap("SearchEndTime")
        private Long searchEndTime;

        @com.aliyun.core.annotation.NameInMap("SearchStartTime")
        private Long searchStartTime;

        @com.aliyun.core.annotation.NameInMap("SqlCounter")
        private Long sqlCounter;

        @com.aliyun.core.annotation.NameInMap("SqlPk")
        private String sqlPk;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TraceId")
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
             * <p>Indicates the name of the database on which a flashback task is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>drds_flashback</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>Indicates the download URL.</p>
             * 
             * <strong>example:</strong>
             * <p>http://...</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>Indicates the time when the download URL expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1569216270000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates the point in time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1568611408000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Indicates the point in time when the flashback task is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>1568611469000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates the ID of the primary key that corresponds to a table used in the flashback task.</p>
             * 
             * <strong>example:</strong>
             * <p>238</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates the ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>drdshbga76p6****</p>
             */
            public Builder instId(String instId) {
                this.instId = instId;
                return this;
            }

            /**
             * <p>Indicates the progress of the reverse call.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recallProgress(Integer recallProgress) {
                this.recallProgress = recallProgress;
                return this;
            }

            /**
             * <p>Indicates the type of the flashback task. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: image restoration</li>
             * <li><strong>2</strong>: reverse restoration</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recallRestoreType(Integer recallRestoreType) {
                this.recallRestoreType = recallRestoreType;
                return this;
            }

            /**
             * <p>Indicates the status of the data recall task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recallStatus(Integer recallStatus) {
                this.recallStatus = recallStatus;
                return this;
            }

            /**
             * <p>Indicates the type of the reverse call. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: exact search</li>
             * <li><strong>1</strong>: fuzzy search</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recallType(Integer recallType) {
                this.recallType = recallType;
                return this;
            }

            /**
             * <p>Indicates the start time of the reverse call.</p>
             * 
             * <strong>example:</strong>
             * <p>1568509597000</p>
             */
            public Builder searchEndTime(Long searchEndTime) {
                this.searchEndTime = searchEndTime;
                return this;
            }

            /**
             * <p>Indicates the end time of the reverse call.</p>
             * 
             * <strong>example:</strong>
             * <p>1568609597000</p>
             */
            public Builder searchStartTime(Long searchStartTime) {
                this.searchStartTime = searchStartTime;
                return this;
            }

            /**
             * <p>Indicates the number of data rows that are flashed back.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sqlCounter(Long sqlCounter) {
                this.sqlCounter = sqlCounter;
                return this;
            }

            /**
             * <p>Indicates the primary key specified in the SQL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder sqlPk(String sqlPk) {
                this.sqlPk = sqlPk;
                return this;
            }

            /**
             * <p>Indicates the types of the SQL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>Insert,Update,Delete</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>Indicates the name of the table that contains the data that are flashed back.</p>
             * 
             * <strong>example:</strong>
             * <p>drds_params</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>Indicates the ID of the trace of the SQL query.</p>
             * 
             * <strong>example:</strong>
             * <p>trace</p>
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
    /**
     * 
     * {@link DescribeSqlFlashbakTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlFlashbakTaskResponseBody</p>
     */
    public static class SqlFlashbackTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SqlFlashbackTask")
        private java.util.List<SqlFlashbackTask> sqlFlashbackTask;

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
        public java.util.List<SqlFlashbackTask> getSqlFlashbackTask() {
            return this.sqlFlashbackTask;
        }

        public static final class Builder {
            private java.util.List<SqlFlashbackTask> sqlFlashbackTask; 

            /**
             * SqlFlashbackTask.
             */
            public Builder sqlFlashbackTask(java.util.List<SqlFlashbackTask> sqlFlashbackTask) {
                this.sqlFlashbackTask = sqlFlashbackTask;
                return this;
            }

            public SqlFlashbackTasks build() {
                return new SqlFlashbackTasks(this);
            } 

        } 

    }
}
