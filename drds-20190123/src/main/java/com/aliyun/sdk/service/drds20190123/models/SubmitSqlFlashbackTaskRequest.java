// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSqlFlashbackTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitSqlFlashbackTaskRequest</p>
 */
public class SubmitSqlFlashbackTaskRequest extends Request {
    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("RecallRestoreType")
    @Validation(required = true)
    private Integer recallRestoreType;

    @Query
    @NameInMap("RecallType")
    private Integer recallType;

    @Query
    @NameInMap("SqlPk")
    private String sqlPk;

    @Query
    @NameInMap("SqlType")
    private String sqlType;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("TableName")
    private String tableName;

    @Query
    @NameInMap("TraceId")
    private String traceId;

    private SubmitSqlFlashbackTaskRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.endTime = builder.endTime;
        this.recallRestoreType = builder.recallRestoreType;
        this.recallType = builder.recallType;
        this.sqlPk = builder.sqlPk;
        this.sqlType = builder.sqlType;
        this.startTime = builder.startTime;
        this.tableName = builder.tableName;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSqlFlashbackTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return recallRestoreType
     */
    public Integer getRecallRestoreType() {
        return this.recallRestoreType;
    }

    /**
     * @return recallType
     */
    public Integer getRecallType() {
        return this.recallType;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
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

    public static final class Builder extends Request.Builder<SubmitSqlFlashbackTaskRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String endTime; 
        private Integer recallRestoreType; 
        private Integer recallType; 
        private String sqlPk; 
        private String sqlType; 
        private String startTime; 
        private String tableName; 
        private String traceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSqlFlashbackTaskRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.endTime = request.endTime;
            this.recallRestoreType = request.recallRestoreType;
            this.recallType = request.recallType;
            this.sqlPk = request.sqlPk;
            this.sqlType = request.sqlType;
            this.startTime = request.startTime;
            this.tableName = request.tableName;
            this.traceId = request.traceId;
        } 

        /**
         * The name of the DRDS database.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * The ID of a DRDS instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The time when the SQL flashback task ends.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The restoration type. Valid values:
         * <p>
         * 
         * *   1: Image restoration
         * *   0: reverse recovery
         */
        public Builder recallRestoreType(Integer recallRestoreType) {
            this.putQueryParameter("RecallRestoreType", recallRestoreType);
            this.recallRestoreType = recallRestoreType;
            return this;
        }

        /**
         * Exact match or fuzzy match. Valid values:
         * <p>
         * 
         * *   0: the exact match.
         * *   1: the fuzzy match.
         */
        public Builder recallType(Integer recallType) {
            this.putQueryParameter("RecallType", recallType);
            this.recallType = recallType;
            return this;
        }

        /**
         * The primary key of flashback SQL.
         */
        public Builder sqlPk(String sqlPk) {
            this.putQueryParameter("SqlPk", sqlPk);
            this.sqlPk = sqlPk;
            return this;
        }

        /**
         * The type of the SQL statement. Valid values: INSERT, UPDATE, and DELETE. Separate multiple types with commas (,).
         */
        public Builder sqlType(String sqlType) {
            this.putQueryParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
         * The start time of the flashback SQL statement.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The name of the table where the flashback SQL operation was performed.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * The Trace ID of the flashback SQL.
         */
        public Builder traceId(String traceId) {
            this.putQueryParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        @Override
        public SubmitSqlFlashbackTaskRequest build() {
            return new SubmitSqlFlashbackTaskRequest(this);
        } 

    } 

}
