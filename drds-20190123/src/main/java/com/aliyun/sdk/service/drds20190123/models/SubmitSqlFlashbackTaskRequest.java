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
 * {@link SubmitSqlFlashbackTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitSqlFlashbackTaskRequest</p>
 */
public class SubmitSqlFlashbackTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallRestoreType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer recallRestoreType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallType")
    private Integer recallType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlPk")
    private String sqlPk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlType")
    private String sqlType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceId")
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
         * <p>The name of the DRDS database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The ID of a DRDS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds*********</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The time when the SQL flashback task ends.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-10 23:23:23</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The restoration type. Valid values:</p>
         * <ul>
         * <li>1: Image restoration</li>
         * <li>0: reverse recovery</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder recallRestoreType(Integer recallRestoreType) {
            this.putQueryParameter("RecallRestoreType", recallRestoreType);
            this.recallRestoreType = recallRestoreType;
            return this;
        }

        /**
         * <p>Exact match or fuzzy match. Valid values:</p>
         * <ul>
         * <li>0: the exact match.</li>
         * <li>1: the fuzzy match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder recallType(Integer recallType) {
            this.putQueryParameter("RecallType", recallType);
            this.recallType = recallType;
            return this;
        }

        /**
         * <p>The primary key of flashback SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        public Builder sqlPk(String sqlPk) {
            this.putQueryParameter("SqlPk", sqlPk);
            this.sqlPk = sqlPk;
            return this;
        }

        /**
         * <p>The type of the SQL statement. Valid values: INSERT, UPDATE, and DELETE. Separate multiple types with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>INSERT,UPDATE</p>
         */
        public Builder sqlType(String sqlType) {
            this.putQueryParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
         * <p>The start time of the flashback SQL statement.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-10 20:23:23</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The name of the table where the flashback SQL operation was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The Trace ID of the flashback SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>ase*****</p>
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
