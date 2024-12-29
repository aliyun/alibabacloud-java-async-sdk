// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ListResultExportJobHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListResultExportJobHistoryResponseBody</p>
 */
public class ListResultExportJobHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListResultExportJobHistoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResultExportJobHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidInput</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The queried execution records.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The returned message. Valid values:</p>
         * <ul>
         * <li>If the request was successful, an <strong>OK</strong> message is returned.</li>
         * <li>If the request failed, an error message is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>174</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResultExportJobHistoryResponseBody build() {
            return new ListResultExportJobHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResultExportJobHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListResultExportJobHistoryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DatabaseUser")
        private String databaseUser;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("ExportJobId")
        private String exportJobId;

        @com.aliyun.core.annotation.NameInMap("ExportPath")
        private String exportPath;

        @com.aliyun.core.annotation.NameInMap("ExportRows")
        private String exportRows;

        @com.aliyun.core.annotation.NameInMap("ExportType")
        private String exportType;

        @com.aliyun.core.annotation.NameInMap("IsExpired")
        private Boolean isExpired;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimeCost")
        private Long timeCost;

        private Items(Builder builder) {
            this.aliUid = builder.aliUid;
            this.createTime = builder.createTime;
            this.DBClusterId = builder.DBClusterId;
            this.databaseUser = builder.databaseUser;
            this.endTime = builder.endTime;
            this.engine = builder.engine;
            this.exportJobId = builder.exportJobId;
            this.exportPath = builder.exportPath;
            this.exportRows = builder.exportRows;
            this.exportType = builder.exportType;
            this.isExpired = builder.isExpired;
            this.message = builder.message;
            this.processId = builder.processId;
            this.progress = builder.progress;
            this.resourceGroup = builder.resourceGroup;
            this.schema = builder.schema;
            this.sql = builder.sql;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.timeCost = builder.timeCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return databaseUser
         */
        public String getDatabaseUser() {
            return this.databaseUser;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return exportJobId
         */
        public String getExportJobId() {
            return this.exportJobId;
        }

        /**
         * @return exportPath
         */
        public String getExportPath() {
            return this.exportPath;
        }

        /**
         * @return exportRows
         */
        public String getExportRows() {
            return this.exportRows;
        }

        /**
         * @return exportType
         */
        public String getExportType() {
            return this.exportType;
        }

        /**
         * @return isExpired
         */
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
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
         * @return timeCost
         */
        public Long getTimeCost() {
            return this.timeCost;
        }

        public static final class Builder {
            private String aliUid; 
            private String createTime; 
            private String DBClusterId; 
            private String databaseUser; 
            private String endTime; 
            private String engine; 
            private String exportJobId; 
            private String exportPath; 
            private String exportRows; 
            private String exportType; 
            private Boolean isExpired; 
            private String message; 
            private String processId; 
            private String progress; 
            private String resourceGroup; 
            private String schema; 
            private String sql; 
            private String startTime; 
            private String status; 
            private Long timeCost; 

            /**
             * <p>The RAM user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>120010511678****</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The time when the result set export job was created. The time follows the ISO 8601 standard in the <em>yyyy-mm-ddThh:mm:ssZ</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-01T09:50:18Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-7xv5ty5m9o4v****</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The name of the database account that is associated with the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>ram_user</p>
             */
            public Builder databaseUser(String databaseUser) {
                this.databaseUser = databaseUser;
                return this;
            }

            /**
             * <p>The end time of the result set export job. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> The end time must be later than the start time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2023-06-15T02:13:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The engine that is used to execute the result set export job. Only XIHE is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>XIHE</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The unique identifier of the result set export job.</p>
             * 
             * <strong>example:</strong>
             * <p>export_2024051319271219802100800401300****</p>
             */
            public Builder exportJobId(String exportJobId) {
                this.exportJobId = exportJobId;
                return this;
            }

            /**
             * <p>The complete URL of the path to store the exported result set.</p>
             */
            public Builder exportPath(String exportPath) {
                this.exportPath = exportPath;
                return this;
            }

            /**
             * <p>The number of exported rows. This parameter is returned only when the request was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder exportRows(String exportRows) {
                this.exportRows = exportRows;
                return this;
            }

            /**
             * ExportType.
             */
            public Builder exportType(String exportType) {
                this.exportType = exportType;
                return this;
            }

            /**
             * IsExpired.
             */
            public Builder isExpired(Boolean isExpired) {
                this.isExpired = isExpired;
                return this;
            }

            /**
             * <p>The returned message. This parameter is returned only when the request failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Failed to execute SQL</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The query ID that can be used for diagnostics.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/612495.html">DescribeDiagnosisSQLInfo</a> operation to query the execution information about a query.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>202306121421111720161451770345339****</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The progress of the result set export job. Unit: %. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The name of the resource group that runs the result set export job.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>lake_db</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The SQL statement that is used in the result set export job.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM <code>ADB_SampleData_TPCH</code>.<code>supplier</code> LIMIT 20</p>
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * <p>The start time of the result set export job. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-03T04:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The execution status of the result set export job. Valid values:</p>
             * <ol>
             * <li><strong>SUBMITTED</strong></li>
             * <li><strong>RUNNING</strong></li>
             * <li><strong>SUCCEEDED</strong></li>
             * <li><strong>FAILED</strong></li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The amount of time consumed to export execution records. Unit: milliseconds.</p>
             * <blockquote>
             * <p> The value is the duration between the time when the result set export job starts and the time when the result set export job ends.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>560</p>
             */
            public Builder timeCost(Long timeCost) {
                this.timeCost = timeCost;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
