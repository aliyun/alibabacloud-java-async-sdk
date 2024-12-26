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
 * {@link GetBlockingDetailListResponseBody} extends {@link TeaModel}
 *
 * <p>GetBlockingDetailListResponseBody</p>
 */
public class GetBlockingDetailListResponseBody extends TeaModel {
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

    private GetBlockingDetailListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBlockingDetailListResponseBody create() {
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request is successful, <strong>Successful</strong> is returned. Otherwise, an error message such as an error code is returned.</p>
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
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
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

        public GetBlockingDetailListResponseBody build() {
            return new GetBlockingDetailListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBlockingDetailListResponseBody} extends {@link TeaModel}
     *
     * <p>GetBlockingDetailListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchId")
        private Long batchId;

        @com.aliyun.core.annotation.NameInMap("ClientAppName")
        private String clientAppName;

        @com.aliyun.core.annotation.NameInMap("CurrentCollectionTime")
        private Long currentCollectionTime;

        @com.aliyun.core.annotation.NameInMap("DataBase")
        private String dataBase;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("LoginId")
        private String loginId;

        @com.aliyun.core.annotation.NameInMap("QueryHash")
        private String queryHash;

        @com.aliyun.core.annotation.NameInMap("Spid")
        private String spid;

        @com.aliyun.core.annotation.NameInMap("SqlText")
        private String sqlText;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("WaitTimeMs")
        private Long waitTimeMs;

        @com.aliyun.core.annotation.NameInMap("WaitType")
        private String waitType;

        private List(Builder builder) {
            this.batchId = builder.batchId;
            this.clientAppName = builder.clientAppName;
            this.currentCollectionTime = builder.currentCollectionTime;
            this.dataBase = builder.dataBase;
            this.hostName = builder.hostName;
            this.loginId = builder.loginId;
            this.queryHash = builder.queryHash;
            this.spid = builder.spid;
            this.sqlText = builder.sqlText;
            this.startTime = builder.startTime;
            this.waitTimeMs = builder.waitTimeMs;
            this.waitType = builder.waitType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public Long getBatchId() {
            return this.batchId;
        }

        /**
         * @return clientAppName
         */
        public String getClientAppName() {
            return this.clientAppName;
        }

        /**
         * @return currentCollectionTime
         */
        public Long getCurrentCollectionTime() {
            return this.currentCollectionTime;
        }

        /**
         * @return dataBase
         */
        public String getDataBase() {
            return this.dataBase;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return loginId
         */
        public String getLoginId() {
            return this.loginId;
        }

        /**
         * @return queryHash
         */
        public String getQueryHash() {
            return this.queryHash;
        }

        /**
         * @return spid
         */
        public String getSpid() {
            return this.spid;
        }

        /**
         * @return sqlText
         */
        public String getSqlText() {
            return this.sqlText;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return waitTimeMs
         */
        public Long getWaitTimeMs() {
            return this.waitTimeMs;
        }

        /**
         * @return waitType
         */
        public String getWaitType() {
            return this.waitType;
        }

        public static final class Builder {
            private Long batchId; 
            private String clientAppName; 
            private Long currentCollectionTime; 
            private String dataBase; 
            private String hostName; 
            private String loginId; 
            private String queryHash; 
            private String spid; 
            private String sqlText; 
            private String startTime; 
            private Long waitTimeMs; 
            private String waitType; 

            /**
             * <p>The batch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1683530096156</p>
             */
            public Builder batchId(Long batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>The client name.</p>
             * 
             * <strong>example:</strong>
             * <p>.Net SqlClient Data Provider</p>
             */
            public Builder clientAppName(String clientAppName) {
                this.clientAppName = clientAppName;
                return this;
            }

            /**
             * <p>The time when the blocking data was collected. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1700065800000</p>
             */
            public Builder currentCollectionTime(Long currentCollectionTime) {
                this.currentCollectionTime = currentCollectionTime;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>school</p>
             */
            public Builder dataBase(String dataBase) {
                this.dataBase = dataBase;
                return this;
            }

            /**
             * <p>The client hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>ALLBNMGTAPPRD01</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The username that is used for the logon.</p>
             * 
             * <strong>example:</strong>
             * <p>Cheney603</p>
             */
            public Builder loginId(String loginId) {
                this.loginId = loginId;
                return this;
            }

            /**
             * <p>The hash value of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>6977DD06CD9CAFF2</p>
             */
            public Builder queryHash(String queryHash) {
                this.queryHash = queryHash;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1717</p>
             */
            public Builder spid(String spid) {
                this.spid = spid;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>select * from test1</p>
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * <p>The time when the execution started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1608888296000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The duration of the blocking. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30000</p>
             */
            public Builder waitTimeMs(Long waitTimeMs) {
                this.waitTimeMs = waitTimeMs;
                return this;
            }

            /**
             * <p>The wait type. For more information about wait types, see <a href="https://learn.microsoft.com/en-us/sql/relational-databases/system-dynamic-management-views/sys-dm-os-wait-stats-transact-sql?view=sql-server-ver15">sys.dm_os_wait_stats (Transact-SQL)</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>MISCELLANEOUS</p>
             */
            public Builder waitType(String waitType) {
                this.waitType = waitType;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBlockingDetailListResponseBody} extends {@link TeaModel}
     *
     * <p>GetBlockingDetailListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
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
         * @return list
         */
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            /**
             * <p>The details of the data returned.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number of the page returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries returned on each page.</p>
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
             * <p>19</p>
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
