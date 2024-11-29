// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDasSQLLogHotDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetDasSQLLogHotDataResponseBody</p>
 */
public class GetDasSQLLogHotDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetDasSQLLogHotDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDasSQLLogHotDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p>If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetDasSQLLogHotDataResponseBody build() {
            return new GetDasSQLLogHotDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDasSQLLogHotDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetDasSQLLogHotDataResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private String executeTime;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("HostAddress")
        private String hostAddress;

        @com.aliyun.core.annotation.NameInMap("Latancy")
        private Long latancy;

        @com.aliyun.core.annotation.NameInMap("LockTime")
        private Long lockTime;

        @com.aliyun.core.annotation.NameInMap("LogicRead")
        private Long logicRead;

        @com.aliyun.core.annotation.NameInMap("OriginTime")
        private String originTime;

        @com.aliyun.core.annotation.NameInMap("PhysicAsyncRead")
        private Long physicAsyncRead;

        @com.aliyun.core.annotation.NameInMap("PhysicSyncRead")
        private Long physicSyncRead;

        @com.aliyun.core.annotation.NameInMap("ReturnRows")
        private Long returnRows;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("ScanRows")
        private Long scanRows;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("ThreadID")
        private Long threadID;

        @com.aliyun.core.annotation.NameInMap("TransactionId")
        private String transactionId;

        @com.aliyun.core.annotation.NameInMap("UpdateRows")
        private Long updateRows;

        private List(Builder builder) {
            this.accountName = builder.accountName;
            this.DBName = builder.DBName;
            this.executeTime = builder.executeTime;
            this.ext = builder.ext;
            this.hostAddress = builder.hostAddress;
            this.latancy = builder.latancy;
            this.lockTime = builder.lockTime;
            this.logicRead = builder.logicRead;
            this.originTime = builder.originTime;
            this.physicAsyncRead = builder.physicAsyncRead;
            this.physicSyncRead = builder.physicSyncRead;
            this.returnRows = builder.returnRows;
            this.SQLText = builder.SQLText;
            this.scanRows = builder.scanRows;
            this.sqlType = builder.sqlType;
            this.state = builder.state;
            this.threadID = builder.threadID;
            this.transactionId = builder.transactionId;
            this.updateRows = builder.updateRows;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return executeTime
         */
        public String getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return hostAddress
         */
        public String getHostAddress() {
            return this.hostAddress;
        }

        /**
         * @return latancy
         */
        public Long getLatancy() {
            return this.latancy;
        }

        /**
         * @return lockTime
         */
        public Long getLockTime() {
            return this.lockTime;
        }

        /**
         * @return logicRead
         */
        public Long getLogicRead() {
            return this.logicRead;
        }

        /**
         * @return originTime
         */
        public String getOriginTime() {
            return this.originTime;
        }

        /**
         * @return physicAsyncRead
         */
        public Long getPhysicAsyncRead() {
            return this.physicAsyncRead;
        }

        /**
         * @return physicSyncRead
         */
        public Long getPhysicSyncRead() {
            return this.physicSyncRead;
        }

        /**
         * @return returnRows
         */
        public Long getReturnRows() {
            return this.returnRows;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return scanRows
         */
        public Long getScanRows() {
            return this.scanRows;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return threadID
         */
        public Long getThreadID() {
            return this.threadID;
        }

        /**
         * @return transactionId
         */
        public String getTransactionId() {
            return this.transactionId;
        }

        /**
         * @return updateRows
         */
        public Long getUpdateRows() {
            return this.updateRows;
        }

        public static final class Builder {
            private String accountName; 
            private String DBName; 
            private String executeTime; 
            private String ext; 
            private String hostAddress; 
            private Long latancy; 
            private Long lockTime; 
            private Long logicRead; 
            private String originTime; 
            private Long physicAsyncRead; 
            private Long physicSyncRead; 
            private Long returnRows; 
            private String SQLText; 
            private Long scanRows; 
            private String sqlType; 
            private String state; 
            private Long threadID; 
            private String transactionId; 
            private Long updateRows; 

            /**
             * <p>The account of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>testuser</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>testDB</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The execution time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-23 T12:11:20Z</p>
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>The extended information. This parameter is a reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX</p>
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * <p>The execution duration. Unit: microseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder latancy(Long latancy) {
                this.latancy = latancy;
                return this;
            }

            /**
             * <p>The lock wait duration. Unit: microseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lockTime(Long lockTime) {
                this.lockTime = lockTime;
                return this;
            }

            /**
             * <p>The number of logical reads.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder logicRead(Long logicRead) {
                this.logicRead = logicRead;
                return this;
            }

            /**
             * <p>The execution time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-23 T12:11:20.999Z</p>
             */
            public Builder originTime(String originTime) {
                this.originTime = originTime;
                return this;
            }

            /**
             * <p>The number of physical asynchronous reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicAsyncRead(Long physicAsyncRead) {
                this.physicAsyncRead = physicAsyncRead;
                return this;
            }

            /**
             * <p>The number of physical synchronous reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicSyncRead(Long physicSyncRead) {
                this.physicSyncRead = physicSyncRead;
                return this;
            }

            /**
             * <p>The number of rows returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder returnRows(Long returnRows) {
                this.returnRows = returnRows;
                return this;
            }

            /**
             * <p>The content of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>select 1</p>
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * <p>The number of rows scanned by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * <p>The type of the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>SELECT</strong></li>
             * <li><strong>UPDATE</strong></li>
             * <li><strong>DELETE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SELECT</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The execution result. If a <strong>0</strong> is returned, the SQL statement was successfully executed. If an error code is returned, the SQL statement failed to be executed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The thread ID.</p>
             * 
             * <strong>example:</strong>
             * <p>657</p>
             */
            public Builder threadID(Long threadID) {
                this.threadID = threadID;
                return this;
            }

            /**
             * <p>The transaction ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder transactionId(String transactionId) {
                this.transactionId = transactionId;
                return this;
            }

            /**
             * <p>The number of updated rows.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder updateRows(Long updateRows) {
                this.updateRows = updateRows;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDasSQLLogHotDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetDasSQLLogHotDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extra")
        private Object extra;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.extra = builder.extra;
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return extra
         */
        public Object getExtra() {
            return this.extra;
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Object extra; 
            private java.util.List < List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            /**
             * <p>The reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder extra(Object extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The details of the data returned.</p>
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
