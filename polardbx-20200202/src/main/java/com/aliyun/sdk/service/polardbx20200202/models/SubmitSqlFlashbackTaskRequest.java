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
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolardbxInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polardbxInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallRestoreType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recallRestoreType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallType")
    private String recallType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

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
        this.endTime = builder.endTime;
        this.polardbxInstanceId = builder.polardbxInstanceId;
        this.recallRestoreType = builder.recallRestoreType;
        this.recallType = builder.recallType;
        this.regionId = builder.regionId;
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return polardbxInstanceId
     */
    public String getPolardbxInstanceId() {
        return this.polardbxInstanceId;
    }

    /**
     * @return recallRestoreType
     */
    public String getRecallRestoreType() {
        return this.recallRestoreType;
    }

    /**
     * @return recallType
     */
    public String getRecallType() {
        return this.recallType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String endTime; 
        private String polardbxInstanceId; 
        private String recallRestoreType; 
        private String recallType; 
        private String regionId; 
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
            this.endTime = request.endTime;
            this.polardbxInstanceId = request.polardbxInstanceId;
            this.recallRestoreType = request.recallRestoreType;
            this.recallType = request.recallType;
            this.regionId = request.regionId;
            this.sqlPk = request.sqlPk;
            this.sqlType = request.sqlType;
            this.startTime = request.startTime;
            this.tableName = request.tableName;
            this.traceId = request.traceId;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-*********</p>
         */
        public Builder polardbxInstanceId(String polardbxInstanceId) {
            this.putQueryParameter("PolardbxInstanceId", polardbxInstanceId);
            this.polardbxInstanceId = polardbxInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder recallRestoreType(String recallRestoreType) {
            this.putQueryParameter("RecallRestoreType", recallRestoreType);
            this.recallRestoreType = recallRestoreType;
            return this;
        }

        /**
         * RecallType.
         */
        public Builder recallType(String recallType) {
            this.putQueryParameter("RecallType", recallType);
            this.recallType = recallType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SqlPk.
         */
        public Builder sqlPk(String sqlPk) {
            this.putQueryParameter("SqlPk", sqlPk);
            this.sqlPk = sqlPk;
            return this;
        }

        /**
         * SqlType.
         */
        public Builder sqlType(String sqlType) {
            this.putQueryParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
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
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * TraceId.
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
