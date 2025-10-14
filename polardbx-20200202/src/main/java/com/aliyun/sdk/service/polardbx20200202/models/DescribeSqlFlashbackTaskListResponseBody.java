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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
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
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
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
            public Builder recallProgress(String recallProgress) {
                this.recallProgress = recallProgress;
                return this;
            }

            /**
             * RecallRestoreType.
             */
            public Builder recallRestoreType(String recallRestoreType) {
                this.recallRestoreType = recallRestoreType;
                return this;
            }

            /**
             * RecallStatus.
             */
            public Builder recallStatus(String recallStatus) {
                this.recallStatus = recallStatus;
                return this;
            }

            /**
             * RecallType.
             */
            public Builder recallType(String recallType) {
                this.recallType = recallType;
                return this;
            }

            /**
             * SearchEndTime.
             */
            public Builder searchEndTime(String searchEndTime) {
                this.searchEndTime = searchEndTime;
                return this;
            }

            /**
             * SearchStartTime.
             */
            public Builder searchStartTime(String searchStartTime) {
                this.searchStartTime = searchStartTime;
                return this;
            }

            /**
             * SqlCounter.
             */
            public Builder sqlCounter(String sqlCounter) {
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
             * SqlFlashbackTasks.
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
