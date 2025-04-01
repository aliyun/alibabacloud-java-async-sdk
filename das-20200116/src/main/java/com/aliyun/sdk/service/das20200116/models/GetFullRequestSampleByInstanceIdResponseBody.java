// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetFullRequestSampleByInstanceIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetFullRequestSampleByInstanceIdResponseBody</p>
 */
public class GetFullRequestSampleByInstanceIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetFullRequestSampleByInstanceIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message that contains information such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A74B755-98B7-59DB-8724-1321B394****</p>
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

        public GetFullRequestSampleByInstanceIdResponseBody build() {
            return new GetFullRequestSampleByInstanceIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFullRequestSampleByInstanceIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetFullRequestSampleByInstanceIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Frows")
        private Long frows;

        @com.aliyun.core.annotation.NameInMap("LockWaitTime")
        private Double lockWaitTime;

        @com.aliyun.core.annotation.NameInMap("LogicalRead")
        private Double logicalRead;

        @com.aliyun.core.annotation.NameInMap("OriginHost")
        private String originHost;

        @com.aliyun.core.annotation.NameInMap("PhysicalAsyncRead")
        private Double physicalAsyncRead;

        @com.aliyun.core.annotation.NameInMap("PhysicalSyncRead")
        private Double physicalSyncRead;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private Long rows;

        @com.aliyun.core.annotation.NameInMap("RowsExamined")
        private Long rowsExamined;

        @com.aliyun.core.annotation.NameInMap("RowsReturned")
        private Long rowsReturned;

        @com.aliyun.core.annotation.NameInMap("Rt")
        private Double rt;

        @com.aliyun.core.annotation.NameInMap("ScanRows")
        private Long scanRows;

        @com.aliyun.core.annotation.NameInMap("Scnt")
        private Long scnt;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("UpdateRows")
        private Long updateRows;

        @com.aliyun.core.annotation.NameInMap("User")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.database = model.database;
                this.frows = model.frows;
                this.lockWaitTime = model.lockWaitTime;
                this.logicalRead = model.logicalRead;
                this.originHost = model.originHost;
                this.physicalAsyncRead = model.physicalAsyncRead;
                this.physicalSyncRead = model.physicalSyncRead;
                this.rows = model.rows;
                this.rowsExamined = model.rowsExamined;
                this.rowsReturned = model.rowsReturned;
                this.rt = model.rt;
                this.scanRows = model.scanRows;
                this.scnt = model.scnt;
                this.sql = model.sql;
                this.sqlId = model.sqlId;
                this.sqlType = model.sqlType;
                this.timestamp = model.timestamp;
                this.updateRows = model.updateRows;
                this.user = model.user;
            } 

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>dbtest</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The number of rows fetched by PolarDB-X 2.0 compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder frows(Long frows) {
                this.frows = frows;
                return this;
            }

            /**
             * <p>The lock wait duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0137</p>
             */
            public Builder lockWaitTime(Double lockWaitTime) {
                this.lockWaitTime = lockWaitTime;
                return this;
            }

            /**
             * <p>The number of logical reads.</p>
             * 
             * <strong>example:</strong>
             * <p>165848</p>
             */
            public Builder logicalRead(Double logicalRead) {
                this.logicalRead = logicalRead;
                return this;
            }

            /**
             * <p>The source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.17.XX.XX</p>
             */
            public Builder originHost(String originHost) {
                this.originHost = originHost;
                return this;
            }

            /**
             * <p>The number of physical asynchronous reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicalAsyncRead(Double physicalAsyncRead) {
                this.physicalAsyncRead = physicalAsyncRead;
                return this;
            }

            /**
             * <p>The number of physical synchronous reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicalSyncRead(Double physicalSyncRead) {
                this.physicalSyncRead = physicalSyncRead;
                return this;
            }

            /**
             * <p>The number of rows updated or returned on PolarDB-X 2.0 compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rows(Long rows) {
                this.rows = rows;
                return this;
            }

            /**
             * <p>The total number of scanned rows.</p>
             * <blockquote>
             * <p>This parameter is returned only for ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and PolarDB for MySQL databases.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2048576</p>
             */
            public Builder rowsExamined(Long rowsExamined) {
                this.rowsExamined = rowsExamined;
                return this;
            }

            /**
             * <p>The number of rows returned by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder rowsReturned(Long rowsReturned) {
                this.rowsReturned = rowsReturned;
                return this;
            }

            /**
             * <p>The amount of time consumed to execute the SQL statement. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0.409789</p>
             */
            public Builder rt(Double rt) {
                this.rt = rt;
                return this;
            }

            /**
             * <p>The number of scanned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * <p>The number of requests sent from PolarDB-X 2.0 compute nodes to data nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scnt(Long scnt) {
                this.scnt = scnt;
                return this;
            }

            /**
             * <p>The sample SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>select * from testdb01 where ****</p>
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * <p>The SQL statement ID.</p>
             * 
             * <strong>example:</strong>
             * <p>651b56fe9418d48edb8fdf0980ec****</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The type of the SQL statement. Valid values: <strong>SELECT</strong>, <strong>INSERT</strong>, <strong>UPDATE</strong>, <strong>DELETE</strong>, <strong>LOGIN</strong>, <strong>LOGOUT</strong>, <strong>MERGE</strong>, <strong>ALTER</strong>, <strong>CREATEINDEX</strong>, <strong>DROPINDEX</strong>, <strong>CREATE</strong>, <strong>DROP</strong>, <strong>SET</strong>, <strong>DESC</strong>, <strong>REPLACE</strong>, <strong>CALL</strong>, <strong>BEGIN</strong>, <strong>DESCRIBE</strong>, <strong>ROLLBACK</strong>, <strong>FLUSH</strong>, <strong>USE</strong>, <strong>SHOW</strong>, <strong>START</strong>, <strong>COMMIT</strong>, and <strong>RENAME</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The time when the SQL statement was executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1660100753556</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The number of updated rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder updateRows(Long updateRows) {
                this.updateRows = updateRows;
                return this;
            }

            /**
             * <p>The name of the user who executes the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>testuser</p>
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
