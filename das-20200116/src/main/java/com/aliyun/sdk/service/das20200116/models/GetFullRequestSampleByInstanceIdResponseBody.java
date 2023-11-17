// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFullRequestSampleByInstanceIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetFullRequestSampleByInstanceIdResponseBody</p>
 */
public class GetFullRequestSampleByInstanceIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetFullRequestSampleByInstanceIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFullRequestSampleByInstanceIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private Long code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message that contains information such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetFullRequestSampleByInstanceIdResponseBody build() {
            return new GetFullRequestSampleByInstanceIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Database")
        private String database;

        @NameInMap("Frows")
        private Long frows;

        @NameInMap("LockWaitTime")
        private Double lockWaitTime;

        @NameInMap("LogicalRead")
        private Double logicalRead;

        @NameInMap("OriginHost")
        private String originHost;

        @NameInMap("PhysicalAsyncRead")
        private Double physicalAsyncRead;

        @NameInMap("PhysicalSyncRead")
        private Double physicalSyncRead;

        @NameInMap("Rows")
        private Long rows;

        @NameInMap("RowsExamined")
        private Long rowsExamined;

        @NameInMap("RowsReturned")
        private Long rowsReturned;

        @NameInMap("Rt")
        private Double rt;

        @NameInMap("ScanRows")
        private Long scanRows;

        @NameInMap("Scnt")
        private Long scnt;

        @NameInMap("Sql")
        private String sql;

        @NameInMap("SqlId")
        private String sqlId;

        @NameInMap("SqlType")
        private String sqlType;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("UpdateRows")
        private Long updateRows;

        @NameInMap("User")
        private String user;

        private Data(Builder builder) {
            this.database = builder.database;
            this.frows = builder.frows;
            this.lockWaitTime = builder.lockWaitTime;
            this.logicalRead = builder.logicalRead;
            this.originHost = builder.originHost;
            this.physicalAsyncRead = builder.physicalAsyncRead;
            this.physicalSyncRead = builder.physicalSyncRead;
            this.rows = builder.rows;
            this.rowsExamined = builder.rowsExamined;
            this.rowsReturned = builder.rowsReturned;
            this.rt = builder.rt;
            this.scanRows = builder.scanRows;
            this.scnt = builder.scnt;
            this.sql = builder.sql;
            this.sqlId = builder.sqlId;
            this.sqlType = builder.sqlType;
            this.timestamp = builder.timestamp;
            this.updateRows = builder.updateRows;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return frows
         */
        public Long getFrows() {
            return this.frows;
        }

        /**
         * @return lockWaitTime
         */
        public Double getLockWaitTime() {
            return this.lockWaitTime;
        }

        /**
         * @return logicalRead
         */
        public Double getLogicalRead() {
            return this.logicalRead;
        }

        /**
         * @return originHost
         */
        public String getOriginHost() {
            return this.originHost;
        }

        /**
         * @return physicalAsyncRead
         */
        public Double getPhysicalAsyncRead() {
            return this.physicalAsyncRead;
        }

        /**
         * @return physicalSyncRead
         */
        public Double getPhysicalSyncRead() {
            return this.physicalSyncRead;
        }

        /**
         * @return rows
         */
        public Long getRows() {
            return this.rows;
        }

        /**
         * @return rowsExamined
         */
        public Long getRowsExamined() {
            return this.rowsExamined;
        }

        /**
         * @return rowsReturned
         */
        public Long getRowsReturned() {
            return this.rowsReturned;
        }

        /**
         * @return rt
         */
        public Double getRt() {
            return this.rt;
        }

        /**
         * @return scanRows
         */
        public Long getScanRows() {
            return this.scanRows;
        }

        /**
         * @return scnt
         */
        public Long getScnt() {
            return this.scnt;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return updateRows
         */
        public Long getUpdateRows() {
            return this.updateRows;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String database; 
            private Long frows; 
            private Double lockWaitTime; 
            private Double logicalRead; 
            private String originHost; 
            private Double physicalAsyncRead; 
            private Double physicalSyncRead; 
            private Long rows; 
            private Long rowsExamined; 
            private Long rowsReturned; 
            private Double rt; 
            private Long scanRows; 
            private Long scnt; 
            private String sql; 
            private String sqlId; 
            private String sqlType; 
            private Long timestamp; 
            private Long updateRows; 
            private String user; 

            /**
             * The name of the database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The number of rows fetched by PolarDB-X 2.0 compute nodes.
             */
            public Builder frows(Long frows) {
                this.frows = frows;
                return this;
            }

            /**
             * The lock wait duration. Unit: seconds.
             */
            public Builder lockWaitTime(Double lockWaitTime) {
                this.lockWaitTime = lockWaitTime;
                return this;
            }

            /**
             * The number of logical reads.
             */
            public Builder logicalRead(Double logicalRead) {
                this.logicalRead = logicalRead;
                return this;
            }

            /**
             * The source IP address.
             */
            public Builder originHost(String originHost) {
                this.originHost = originHost;
                return this;
            }

            /**
             * The number of physical asynchronous reads.
             */
            public Builder physicalAsyncRead(Double physicalAsyncRead) {
                this.physicalAsyncRead = physicalAsyncRead;
                return this;
            }

            /**
             * The number of physical synchronous reads.
             */
            public Builder physicalSyncRead(Double physicalSyncRead) {
                this.physicalSyncRead = physicalSyncRead;
                return this;
            }

            /**
             * The number of rows updated or returned on PolarDB-X 2.0 compute nodes.
             */
            public Builder rows(Long rows) {
                this.rows = rows;
                return this;
            }

            /**
             * The total number of scanned rows.
             * <p>
             * 
             * > This parameter is returned only for ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and PolarDB for MySQL databases.
             */
            public Builder rowsExamined(Long rowsExamined) {
                this.rowsExamined = rowsExamined;
                return this;
            }

            /**
             * The number of rows returned by the SQL statement.
             */
            public Builder rowsReturned(Long rowsReturned) {
                this.rowsReturned = rowsReturned;
                return this;
            }

            /**
             * The amount of time consumed to execute the SQL statement. Unit: seconds.
             */
            public Builder rt(Double rt) {
                this.rt = rt;
                return this;
            }

            /**
             * The number of scanned rows.
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * The number of requests sent from PolarDB-X 2.0 compute nodes to data nodes.
             */
            public Builder scnt(Long scnt) {
                this.scnt = scnt;
                return this;
            }

            /**
             * The sample SQL statement.
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * The SQL statement ID.
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * The type of the SQL statement. Valid values: **SELECT**, **INSERT**, **UPDATE**, **DELETE**, **LOGIN**, **LOGOUT**, **MERGE**, **ALTER**, **CREATEINDEX**, **DROPINDEX**, **CREATE**, **DROP**, **SET**, **DESC**, **REPLACE**, **CALL**, **BEGIN**, **DESCRIBE**, **ROLLBACK**, **FLUSH**, **USE**, **SHOW**, **START**, **COMMIT**, and **RENAME**.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * The time when the SQL statement was executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The number of updated rows.
             */
            public Builder updateRows(Long updateRows) {
                this.updateRows = updateRows;
                return this;
            }

            /**
             * The name of the user who executes the SQL statement.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
