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
 * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogRecordsResponseBody</p>
 */
public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeSlowLogRecordsResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private java.util.List<Items> items; 
        private String pageNumber; 
        private String pageRecordCount; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSlowLogRecordsResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-********</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The list of slow log details.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSlowLogRecordsResponseBody build() {
            return new DescribeSlowLogRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogRecordsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CNname")
        private String cNname;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("Fail")
        private String fail;

        @com.aliyun.core.annotation.NameInMap("Frows")
        private String frows;

        @com.aliyun.core.annotation.NameInMap("HostAddress")
        private String hostAddress;

        @com.aliyun.core.annotation.NameInMap("InsName")
        private String insName;

        @com.aliyun.core.annotation.NameInMap("IsBind")
        private String isBind;

        @com.aliyun.core.annotation.NameInMap("LockTimeMS")
        private String lockTimeMS;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("ParseRowCounts")
        private String parseRowCounts;

        @com.aliyun.core.annotation.NameInMap("QueryStartTime")
        private String queryStartTime;

        @com.aliyun.core.annotation.NameInMap("QueryTime")
        private String queryTime;

        @com.aliyun.core.annotation.NameInMap("QueryTimeMS")
        private String queryTimeMS;

        @com.aliyun.core.annotation.NameInMap("ReturnRowCounts")
        private String returnRowCounts;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private String rows;

        @com.aliyun.core.annotation.NameInMap("SCNT")
        private String SCNT;

        @com.aliyun.core.annotation.NameInMap("SQLHash")
        private String SQLHash;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TooLong")
        private String tooLong;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("TransactionPolicy")
        private String transactionPolicy;

        @com.aliyun.core.annotation.NameInMap("TrxId")
        private String trxId;

        @com.aliyun.core.annotation.NameInMap("WT")
        private String wt;

        private Items(Builder builder) {
            this.cNname = builder.cNname;
            this.DBName = builder.DBName;
            this.extension = builder.extension;
            this.fail = builder.fail;
            this.frows = builder.frows;
            this.hostAddress = builder.hostAddress;
            this.insName = builder.insName;
            this.isBind = builder.isBind;
            this.lockTimeMS = builder.lockTimeMS;
            this.params = builder.params;
            this.parseRowCounts = builder.parseRowCounts;
            this.queryStartTime = builder.queryStartTime;
            this.queryTime = builder.queryTime;
            this.queryTimeMS = builder.queryTimeMS;
            this.returnRowCounts = builder.returnRowCounts;
            this.rows = builder.rows;
            this.SCNT = builder.SCNT;
            this.SQLHash = builder.SQLHash;
            this.SQLText = builder.SQLText;
            this.sqlType = builder.sqlType;
            this.templateId = builder.templateId;
            this.tooLong = builder.tooLong;
            this.traceId = builder.traceId;
            this.transactionPolicy = builder.transactionPolicy;
            this.trxId = builder.trxId;
            this.wt = builder.wt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return cNname
         */
        public String getCNname() {
            return this.cNname;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return fail
         */
        public String getFail() {
            return this.fail;
        }

        /**
         * @return frows
         */
        public String getFrows() {
            return this.frows;
        }

        /**
         * @return hostAddress
         */
        public String getHostAddress() {
            return this.hostAddress;
        }

        /**
         * @return insName
         */
        public String getInsName() {
            return this.insName;
        }

        /**
         * @return isBind
         */
        public String getIsBind() {
            return this.isBind;
        }

        /**
         * @return lockTimeMS
         */
        public String getLockTimeMS() {
            return this.lockTimeMS;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return parseRowCounts
         */
        public String getParseRowCounts() {
            return this.parseRowCounts;
        }

        /**
         * @return queryStartTime
         */
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        /**
         * @return queryTime
         */
        public String getQueryTime() {
            return this.queryTime;
        }

        /**
         * @return queryTimeMS
         */
        public String getQueryTimeMS() {
            return this.queryTimeMS;
        }

        /**
         * @return returnRowCounts
         */
        public String getReturnRowCounts() {
            return this.returnRowCounts;
        }

        /**
         * @return rows
         */
        public String getRows() {
            return this.rows;
        }

        /**
         * @return SCNT
         */
        public String getSCNT() {
            return this.SCNT;
        }

        /**
         * @return SQLHash
         */
        public String getSQLHash() {
            return this.SQLHash;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return tooLong
         */
        public String getTooLong() {
            return this.tooLong;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return transactionPolicy
         */
        public String getTransactionPolicy() {
            return this.transactionPolicy;
        }

        /**
         * @return trxId
         */
        public String getTrxId() {
            return this.trxId;
        }

        /**
         * @return wt
         */
        public String getWt() {
            return this.wt;
        }

        public static final class Builder {
            private String cNname; 
            private String DBName; 
            private String extension; 
            private String fail; 
            private String frows; 
            private String hostAddress; 
            private String insName; 
            private String isBind; 
            private String lockTimeMS; 
            private String params; 
            private String parseRowCounts; 
            private String queryStartTime; 
            private String queryTime; 
            private String queryTimeMS; 
            private String returnRowCounts; 
            private String rows; 
            private String SCNT; 
            private String SQLHash; 
            private String SQLText; 
            private String sqlType; 
            private String templateId; 
            private String tooLong; 
            private String traceId; 
            private String transactionPolicy; 
            private String trxId; 
            private String wt; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.cNname = model.cNname;
                this.DBName = model.DBName;
                this.extension = model.extension;
                this.fail = model.fail;
                this.frows = model.frows;
                this.hostAddress = model.hostAddress;
                this.insName = model.insName;
                this.isBind = model.isBind;
                this.lockTimeMS = model.lockTimeMS;
                this.params = model.params;
                this.parseRowCounts = model.parseRowCounts;
                this.queryStartTime = model.queryStartTime;
                this.queryTime = model.queryTime;
                this.queryTimeMS = model.queryTimeMS;
                this.returnRowCounts = model.returnRowCounts;
                this.rows = model.rows;
                this.SCNT = model.SCNT;
                this.SQLHash = model.SQLHash;
                this.SQLText = model.SQLText;
                this.sqlType = model.sqlType;
                this.templateId = model.templateId;
                this.tooLong = model.tooLong;
                this.traceId = model.traceId;
                this.transactionPolicy = model.transactionPolicy;
                this.trxId = model.trxId;
                this.wt = model.wt;
            } 

            /**
             * <p>The compute node name. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-i-xxxx</p>
             */
            public Builder cNname(String cNname) {
                this.cNname = cNname;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>dcdev</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The extension field. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>tddl:5.4.19-20240927</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>Indicates whether the execution failed. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fail(String fail) {
                this.fail = fail;
                return this;
            }

            /**
             * <p>The number of rows fetched. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder frows(String frows) {
                this.frows = frows;
                return this;
            }

            /**
             * <p>The client name and address that connects to the database.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>[</strong></strong>] @ [1XX.XX.XX.XX]</p>
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * <p>The instance name. This field is available only for DN.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-xdb-s-xxxx</p>
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * <p>Indicates whether the Prepare mode is used. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isBind(String isBind) {
                this.isBind = isBind;
                return this;
            }

            /**
             * <p>The lock duration. Unit: milliseconds (ms). This field is available only for DN.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lockTimeMS(String lockTimeMS) {
                this.lockTimeMS = lockTimeMS;
                return this;
            }

            /**
             * <p>The parameters in Prepare mode. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;1&quot;]</p>
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The number of rows scanned. This field is available only for DN.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder parseRowCounts(String parseRowCounts) {
                this.parseRowCounts = parseRowCounts;
                return this;
            }

            /**
             * <p>The timestamp. Format: YYYY-MM-ddTHH:mm.ss.SSSZ (UTC).</p>
             * <ul>
             * <li>In CN slow logs, this field indicates the execution start time.</li>
             * <li>In DN slow logs, this field indicates the execution end time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2024-11-22T02:22:22.444Z</p>
             */
            public Builder queryStartTime(String queryStartTime) {
                this.queryStartTime = queryStartTime;
                return this;
            }

            /**
             * <p>The execution duration of the SQL statement. Unit: seconds (s).</p>
             * 
             * <strong>example:</strong>
             * <p>3.000</p>
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * <p>The execution duration of the SQL statement. Unit: milliseconds (ms).</p>
             * 
             * <strong>example:</strong>
             * <p>3000.000</p>
             */
            public Builder queryTimeMS(String queryTimeMS) {
                this.queryTimeMS = queryTimeMS;
                return this;
            }

            /**
             * <p>The number of rows returned. This field is available only for DN.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder returnRowCounts(String returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
                return this;
            }

            /**
             * <p>The number of rows affected or returned. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rows(String rows) {
                this.rows = rows;
                return this;
            }

            /**
             * <p>The number of physical SQL statements. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder SCNT(String SCNT) {
                this.SCNT = SCNT;
                return this;
            }

            /**
             * <p>The unique identity of the SQL statement in slow query log statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>c8df07e5d45cd68da8b4771c2016e20b</p>
             */
            public Builder SQLHash(String SQLHash) {
                this.SQLHash = SQLHash;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>select * from test</p>
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * <p>The SQL type. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>select</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The kernel template ID. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>af33ffee</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>Indicates whether the SQL statement is too long. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tooLong(String tooLong) {
                this.tooLong = tooLong;
                return this;
            }

            /**
             * <p>The trace ID. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>17a5c5c840006000</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * <p>The transaction policy. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>XA</p>
             */
            public Builder transactionPolicy(String transactionPolicy) {
                this.transactionPolicy = transactionPolicy;
                return this;
            }

            /**
             * <p>The transaction ID. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>17a5c5c840006000</p>
             */
            public Builder trxId(String trxId) {
                this.trxId = trxId;
                return this;
            }

            /**
             * <p>The workload type. This field is available only for CN.</p>
             * 
             * <strong>example:</strong>
             * <p>TP</p>
             */
            public Builder wt(String wt) {
                this.wt = wt;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
