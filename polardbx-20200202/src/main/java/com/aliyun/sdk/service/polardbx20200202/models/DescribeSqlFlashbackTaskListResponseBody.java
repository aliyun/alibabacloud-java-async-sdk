// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeSqlFlashbackTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlFlashbackTaskListResponseBody</p>
 */
public class DescribeSqlFlashbackTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSqlFlashbackTaskListResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlFlashbackTaskListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeSqlFlashbackTaskListResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data returned by the request.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the request result.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSqlFlashbackTaskListResponseBody build() {
            return new DescribeSqlFlashbackTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlFlashbackTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlFlashbackTaskListResponseBody</p>
     */
    public static class SqlFlashbackTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstId")
        private String instId;

        @com.aliyun.core.annotation.NameInMap("RecallProgress")
        private String recallProgress;

        @com.aliyun.core.annotation.NameInMap("RecallRestoreType")
        private String recallRestoreType;

        @com.aliyun.core.annotation.NameInMap("RecallStatus")
        private String recallStatus;

        @com.aliyun.core.annotation.NameInMap("RecallType")
        private String recallType;

        @com.aliyun.core.annotation.NameInMap("SearchEndTime")
        private String searchEndTime;

        @com.aliyun.core.annotation.NameInMap("SearchStartTime")
        private String searchStartTime;

        @com.aliyun.core.annotation.NameInMap("SqlCounter")
        private String sqlCounter;

        @com.aliyun.core.annotation.NameInMap("SqlPk")
        private String sqlPk;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private SqlFlashbackTasks(Builder builder) {
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

        public static SqlFlashbackTasks create() {
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
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
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
        public String getRecallProgress() {
            return this.recallProgress;
        }

        /**
         * @return recallRestoreType
         */
        public String getRecallRestoreType() {
            return this.recallRestoreType;
        }

        /**
         * @return recallStatus
         */
        public String getRecallStatus() {
            return this.recallStatus;
        }

        /**
         * @return recallType
         */
        public String getRecallType() {
            return this.recallType;
        }

        /**
         * @return searchEndTime
         */
        public String getSearchEndTime() {
            return this.searchEndTime;
        }

        /**
         * @return searchStartTime
         */
        public String getSearchStartTime() {
            return this.searchStartTime;
        }

        /**
         * @return sqlCounter
         */
        public String getSqlCounter() {
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
            private String expireTime; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private String instId; 
            private String recallProgress; 
            private String recallRestoreType; 
            private String recallStatus; 
            private String recallType; 
            private String searchEndTime; 
            private String searchStartTime; 
            private String sqlCounter; 
            private String sqlPk; 
            private String sqlType; 
            private String tableName; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(SqlFlashbackTasks model) {
                this.dbName = model.dbName;
                this.downloadUrl = model.downloadUrl;
                this.expireTime = model.expireTime;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.instId = model.instId;
                this.recallProgress = model.recallProgress;
                this.recallRestoreType = model.recallRestoreType;
                this.recallStatus = model.recallStatus;
                this.recallType = model.recallType;
                this.searchEndTime = model.searchEndTime;
                this.searchStartTime = model.searchStartTime;
                this.sqlCounter = model.sqlCounter;
                this.sqlPk = model.sqlPk;
                this.sqlType = model.sqlType;
                this.tableName = model.tableName;
                this.traceId = model.traceId;
            } 

            /**
             * <p>The name of the database on which the flashback task was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The download URL of the result file.</p>
             * 
             * <strong>example:</strong>
             * <p>http://...</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The expiration time of the download URL. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1569216270000</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The creation time of the flashback task in the database. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1568611408000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time of the flashback task in the database. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1568611469000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance ID of the PolarDB-X instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-********</p>
             */
            public Builder instId(String instId) {
                this.instId = instId;
                return this;
            }

            /**
             * <p>The execution progress of the flashback task. Value range: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recallProgress(String recallProgress) {
                this.recallProgress = recallProgress;
                return this;
            }

            /**
             * <p>The SQL flashback restoration type. Valid values: </p>
             * <ul>
             * <li><strong>1</strong>: Image-based restoration.</li>
             * <li><strong>2</strong>: Reverse restoration.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder recallRestoreType(String recallRestoreType) {
                this.recallRestoreType = recallRestoreType;
                return this;
            }

            /**
             * <p>The status of the data recall task. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: In progress.</li>
             * <li><strong>2</strong>: Completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recallStatus(String recallStatus) {
                this.recallStatus = recallStatus;
                return this;
            }

            /**
             * <p>The recall type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Exact match.</li>
             * <li><strong>1</strong>: Fuzzy match.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder recallType(String recallType) {
                this.recallType = recallType;
                return this;
            }

            /**
             * <p>The end time specified when the SQL flashback task was submitted. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1568609597000</p>
             */
            public Builder searchEndTime(String searchEndTime) {
                this.searchEndTime = searchEndTime;
                return this;
            }

            /**
             * <p>The start time specified when the SQL flashback task was submitted. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1568609597000</p>
             */
            public Builder searchStartTime(String searchStartTime) {
                this.searchStartTime = searchStartTime;
                return this;
            }

            /**
             * <p>The number of recovered data rows.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder sqlCounter(String sqlCounter) {
                this.sqlCounter = sqlCounter;
                return this;
            }

            /**
             * <p>The primary key value involved in the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder sqlPk(String sqlPk) {
                this.sqlPk = sqlPk;
                return this;
            }

            /**
             * <p>The type of the SQL statement. Valid values: INSERT, UPDATE, and DELETE. Multiple types are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>INSERT,UPDATE</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The name of the table to which the data belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The trace_id of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>13ed05705f801000</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public SqlFlashbackTasks build() {
                return new SqlFlashbackTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSqlFlashbackTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlFlashbackTaskListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SqlFlashbackTasks")
        private java.util.List<SqlFlashbackTasks> sqlFlashbackTasks;

        private Data(Builder builder) {
            this.sqlFlashbackTasks = builder.sqlFlashbackTasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return sqlFlashbackTasks
         */
        public java.util.List<SqlFlashbackTasks> getSqlFlashbackTasks() {
            return this.sqlFlashbackTasks;
        }

        public static final class Builder {
            private java.util.List<SqlFlashbackTasks> sqlFlashbackTasks; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.sqlFlashbackTasks = model.sqlFlashbackTasks;
            } 

            /**
             * <p>The flashback task objects.</p>
             */
            public Builder sqlFlashbackTasks(java.util.List<SqlFlashbackTasks> sqlFlashbackTasks) {
                this.sqlFlashbackTasks = sqlFlashbackTasks;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
