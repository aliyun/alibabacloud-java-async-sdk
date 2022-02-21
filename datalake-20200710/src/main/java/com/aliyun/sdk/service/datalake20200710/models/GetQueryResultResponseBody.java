// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetQueryResultResponseBody</p>
 */
public class GetQueryResultResponseBody extends TeaModel {
    @NameInMap("Duration")
    private Long duration;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("Id")
    private String id;

    @NameInMap("JobCompleted")
    private Boolean jobCompleted;

    @NameInMap("Logs")
    private String logs;

    @NameInMap("Owner")
    private Long owner;

    @NameInMap("Progress")
    private Integer progress;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultTmpDb")
    private String resultTmpDb;

    @NameInMap("ResultTmpTable")
    private String resultTmpTable;

    @NameInMap("RowCount")
    private Integer rowCount;

    @NameInMap("RowCountOverLimit")
    private Boolean rowCountOverLimit;

    @NameInMap("Rows")
    private String rows;

    @NameInMap("Schema")
    private String schema;

    @NameInMap("Sql")
    private String sql;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
    private Boolean success;

    private GetQueryResultResponseBody(Builder builder) {
        this.duration = builder.duration;
        this.endTime = builder.endTime;
        this.errorMessage = builder.errorMessage;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.jobCompleted = builder.jobCompleted;
        this.logs = builder.logs;
        this.owner = builder.owner;
        this.progress = builder.progress;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resultTmpDb = builder.resultTmpDb;
        this.resultTmpTable = builder.resultTmpTable;
        this.rowCount = builder.rowCount;
        this.rowCountOverLimit = builder.rowCountOverLimit;
        this.rows = builder.rows;
        this.schema = builder.schema;
        this.sql = builder.sql;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
     * @return jobCompleted
     */
    public Boolean getJobCompleted() {
        return this.jobCompleted;
    }

    /**
     * @return logs
     */
    public String getLogs() {
        return this.logs;
    }

    /**
     * @return owner
     */
    public Long getOwner() {
        return this.owner;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultTmpDb
     */
    public String getResultTmpDb() {
        return this.resultTmpDb;
    }

    /**
     * @return resultTmpTable
     */
    public String getResultTmpTable() {
        return this.resultTmpTable;
    }

    /**
     * @return rowCount
     */
    public Integer getRowCount() {
        return this.rowCount;
    }

    /**
     * @return rowCountOverLimit
     */
    public Boolean getRowCountOverLimit() {
        return this.rowCountOverLimit;
    }

    /**
     * @return rows
     */
    public String getRows() {
        return this.rows;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long duration; 
        private String endTime; 
        private String errorMessage; 
        private String gmtCreate; 
        private String gmtModified; 
        private String id; 
        private Boolean jobCompleted; 
        private String logs; 
        private Long owner; 
        private Integer progress; 
        private String regionId; 
        private String requestId; 
        private String resultTmpDb; 
        private String resultTmpTable; 
        private Integer rowCount; 
        private Boolean rowCountOverLimit; 
        private String rows; 
        private String schema; 
        private String sql; 
        private String startTime; 
        private String status; 
        private Boolean success; 

        /**
         * Duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * JobCompleted.
         */
        public Builder jobCompleted(Boolean jobCompleted) {
            this.jobCompleted = jobCompleted;
            return this;
        }

        /**
         * Logs.
         */
        public Builder logs(String logs) {
            this.logs = logs;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(Long owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Progress.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * ResultTmpDb.
         */
        public Builder resultTmpDb(String resultTmpDb) {
            this.resultTmpDb = resultTmpDb;
            return this;
        }

        /**
         * ResultTmpTable.
         */
        public Builder resultTmpTable(String resultTmpTable) {
            this.resultTmpTable = resultTmpTable;
            return this;
        }

        /**
         * RowCount.
         */
        public Builder rowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        /**
         * RowCountOverLimit.
         */
        public Builder rowCountOverLimit(Boolean rowCountOverLimit) {
            this.rowCountOverLimit = rowCountOverLimit;
            return this;
        }

        /**
         * Rows.
         */
        public Builder rows(String rows) {
            this.rows = rows;
            return this;
        }

        /**
         * Schema.
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Sql.
         */
        public Builder sql(String sql) {
            this.sql = sql;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQueryResultResponseBody build() {
            return new GetQueryResultResponseBody(this);
        } 

    } 

}
