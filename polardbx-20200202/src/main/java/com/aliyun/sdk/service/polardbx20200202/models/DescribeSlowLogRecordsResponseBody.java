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

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
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
         * TotalCount.
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
            private String tooLong; 
            private String traceId; 
            private String transactionPolicy; 
            private String trxId; 
            private String wt; 

            /**
             * CNname.
             */
            public Builder cNname(String cNname) {
                this.cNname = cNname;
                return this;
            }

            /**
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * Fail.
             */
            public Builder fail(String fail) {
                this.fail = fail;
                return this;
            }

            /**
             * Frows.
             */
            public Builder frows(String frows) {
                this.frows = frows;
                return this;
            }

            /**
             * HostAddress.
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * InsName.
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * IsBind.
             */
            public Builder isBind(String isBind) {
                this.isBind = isBind;
                return this;
            }

            /**
             * LockTimeMS.
             */
            public Builder lockTimeMS(String lockTimeMS) {
                this.lockTimeMS = lockTimeMS;
                return this;
            }

            /**
             * Params.
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * ParseRowCounts.
             */
            public Builder parseRowCounts(String parseRowCounts) {
                this.parseRowCounts = parseRowCounts;
                return this;
            }

            /**
             * QueryStartTime.
             */
            public Builder queryStartTime(String queryStartTime) {
                this.queryStartTime = queryStartTime;
                return this;
            }

            /**
             * QueryTime.
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * QueryTimeMS.
             */
            public Builder queryTimeMS(String queryTimeMS) {
                this.queryTimeMS = queryTimeMS;
                return this;
            }

            /**
             * ReturnRowCounts.
             */
            public Builder returnRowCounts(String returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
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
             * SCNT.
             */
            public Builder SCNT(String SCNT) {
                this.SCNT = SCNT;
                return this;
            }

            /**
             * SQLHash.
             */
            public Builder SQLHash(String SQLHash) {
                this.SQLHash = SQLHash;
                return this;
            }

            /**
             * SQLText.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
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
             * TooLong.
             */
            public Builder tooLong(String tooLong) {
                this.tooLong = tooLong;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * TransactionPolicy.
             */
            public Builder transactionPolicy(String transactionPolicy) {
                this.transactionPolicy = transactionPolicy;
                return this;
            }

            /**
             * TrxId.
             */
            public Builder trxId(String trxId) {
                this.trxId = trxId;
                return this;
            }

            /**
             * WT.
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
