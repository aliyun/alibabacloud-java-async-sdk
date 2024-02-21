// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBlockingDetailListResponseBody} extends {@link TeaModel}
 *
 * <p>GetBlockingDetailListResponseBody</p>
 */
public class GetBlockingDetailListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request is successful, **Successful** is returned. Otherwise, an error message such as an error code is returned.
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetBlockingDetailListResponseBody build() {
            return new GetBlockingDetailListResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("BatchId")
        private Long batchId;

        @NameInMap("ClientAppName")
        private String clientAppName;

        @NameInMap("CurrentCollectionTime")
        private Long currentCollectionTime;

        @NameInMap("DataBase")
        private String dataBase;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("LoginId")
        private String loginId;

        @NameInMap("QueryHash")
        private String queryHash;

        @NameInMap("Spid")
        private String spid;

        @NameInMap("SqlText")
        private String sqlText;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("WaitTimeMs")
        private Long waitTimeMs;

        @NameInMap("WaitType")
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
             * The batch ID.
             */
            public Builder batchId(Long batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * The client name.
             */
            public Builder clientAppName(String clientAppName) {
                this.clientAppName = clientAppName;
                return this;
            }

            /**
             * The time when the blocking data was collected.
             */
            public Builder currentCollectionTime(Long currentCollectionTime) {
                this.currentCollectionTime = currentCollectionTime;
                return this;
            }

            /**
             * The database name.
             */
            public Builder dataBase(String dataBase) {
                this.dataBase = dataBase;
                return this;
            }

            /**
             * The client hostname.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The username that is used for the logon.
             */
            public Builder loginId(String loginId) {
                this.loginId = loginId;
                return this;
            }

            /**
             * The hash value of the SQL statement.
             */
            public Builder queryHash(String queryHash) {
                this.queryHash = queryHash;
                return this;
            }

            /**
             * The session ID.
             */
            public Builder spid(String spid) {
                this.spid = spid;
                return this;
            }

            /**
             * The SQL statement.
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * The time when the execution started.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The blocking duration. Unit: milliseconds.
             */
            public Builder waitTimeMs(Long waitTimeMs) {
                this.waitTimeMs = waitTimeMs;
                return this;
            }

            /**
             * The wait type.
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
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNo")
        private Long pageNo;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Total")
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
            private java.util.List < List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            /**
             * The details of the data returned.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * The page number of the page returned.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * The number of entries returned on each page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
