// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeadLockDetailListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeadLockDetailListResponseBody</p>
 */
public class GetDeadLockDetailListResponseBody extends TeaModel {
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

    private GetDeadLockDetailListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeadLockDetailListResponseBody create() {
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
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetDeadLockDetailListResponseBody build() {
            return new GetDeadLockDetailListResponseBody(this);
        } 

    } 

    public static class BlockProcessList extends TeaModel {
        @NameInMap("ClientApp")
        private String clientApp;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("LastTranStarted")
        private Long lastTranStarted;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("LogUsed")
        private Long logUsed;

        @NameInMap("LoginName")
        private String loginName;

        @NameInMap("ObjectOwned")
        private String objectOwned;

        @NameInMap("ObjectRequested")
        private String objectRequested;

        @NameInMap("OwnMode")
        private String ownMode;

        @NameInMap("Spid")
        private Long spid;

        @NameInMap("SqlText")
        private String sqlText;

        @NameInMap("Status")
        private String status;

        @NameInMap("Victim")
        private Long victim;

        @NameInMap("WaitMode")
        private String waitMode;

        @NameInMap("WaitResource")
        private String waitResource;

        @NameInMap("WaitResourceDescription")
        private String waitResourceDescription;

        private BlockProcessList(Builder builder) {
            this.clientApp = builder.clientApp;
            this.databaseName = builder.databaseName;
            this.hostName = builder.hostName;
            this.lastTranStarted = builder.lastTranStarted;
            this.lockMode = builder.lockMode;
            this.logUsed = builder.logUsed;
            this.loginName = builder.loginName;
            this.objectOwned = builder.objectOwned;
            this.objectRequested = builder.objectRequested;
            this.ownMode = builder.ownMode;
            this.spid = builder.spid;
            this.sqlText = builder.sqlText;
            this.status = builder.status;
            this.victim = builder.victim;
            this.waitMode = builder.waitMode;
            this.waitResource = builder.waitResource;
            this.waitResourceDescription = builder.waitResourceDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockProcessList create() {
            return builder().build();
        }

        /**
         * @return clientApp
         */
        public String getClientApp() {
            return this.clientApp;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return lastTranStarted
         */
        public Long getLastTranStarted() {
            return this.lastTranStarted;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return logUsed
         */
        public Long getLogUsed() {
            return this.logUsed;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return objectOwned
         */
        public String getObjectOwned() {
            return this.objectOwned;
        }

        /**
         * @return objectRequested
         */
        public String getObjectRequested() {
            return this.objectRequested;
        }

        /**
         * @return ownMode
         */
        public String getOwnMode() {
            return this.ownMode;
        }

        /**
         * @return spid
         */
        public Long getSpid() {
            return this.spid;
        }

        /**
         * @return sqlText
         */
        public String getSqlText() {
            return this.sqlText;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return victim
         */
        public Long getVictim() {
            return this.victim;
        }

        /**
         * @return waitMode
         */
        public String getWaitMode() {
            return this.waitMode;
        }

        /**
         * @return waitResource
         */
        public String getWaitResource() {
            return this.waitResource;
        }

        /**
         * @return waitResourceDescription
         */
        public String getWaitResourceDescription() {
            return this.waitResourceDescription;
        }

        public static final class Builder {
            private String clientApp; 
            private String databaseName; 
            private String hostName; 
            private Long lastTranStarted; 
            private String lockMode; 
            private Long logUsed; 
            private String loginName; 
            private String objectOwned; 
            private String objectRequested; 
            private String ownMode; 
            private Long spid; 
            private String sqlText; 
            private String status; 
            private Long victim; 
            private String waitMode; 
            private String waitResource; 
            private String waitResourceDescription; 

            /**
             * The client application.
             */
            public Builder clientApp(String clientApp) {
                this.clientApp = clientApp;
                return this;
            }

            /**
             * The database name.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The host name.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The time when the transaction started.
             */
            public Builder lastTranStarted(Long lastTranStarted) {
                this.lastTranStarted = lastTranStarted;
                return this;
            }

            /**
             * The lock mode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * The size of the logs generated by the session.
             */
            public Builder logUsed(Long logUsed) {
                this.logUsed = logUsed;
                return this;
            }

            /**
             * The username that is used for login.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * The locked object.
             */
            public Builder objectOwned(String objectOwned) {
                this.objectOwned = objectOwned;
                return this;
            }

            /**
             * The object that the current transaction requested to lock.
             */
            public Builder objectRequested(String objectRequested) {
                this.objectRequested = objectRequested;
                return this;
            }

            /**
             * The holding mode.
             */
            public Builder ownMode(String ownMode) {
                this.ownMode = ownMode;
                return this;
            }

            /**
             * The ID of the session that started the transaction.
             */
            public Builder spid(Long spid) {
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
             * The transaction status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The victim.
             */
            public Builder victim(Long victim) {
                this.victim = victim;
                return this;
            }

            /**
             * The wait mode.
             */
            public Builder waitMode(String waitMode) {
                this.waitMode = waitMode;
                return this;
            }

            /**
             * The pending resource.
             */
            public Builder waitResource(String waitResource) {
                this.waitResource = waitResource;
                return this;
            }

            /**
             * The description of the pending resource.
             */
            public Builder waitResourceDescription(String waitResourceDescription) {
                this.waitResourceDescription = waitResourceDescription;
                return this;
            }

            public BlockProcessList build() {
                return new BlockProcessList(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("BatchId")
        private Long batchId;

        @NameInMap("BlockProcessList")
        private java.util.List < BlockProcessList> blockProcessList;

        @NameInMap("ClientApp")
        private String clientApp;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("LastTranStarted")
        private Long lastTranStarted;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("LogUsed")
        private Long logUsed;

        @NameInMap("LoginName")
        private String loginName;

        @NameInMap("ObjectOwned")
        private String objectOwned;

        @NameInMap("ObjectRequested")
        private String objectRequested;

        @NameInMap("OwnMode")
        private String ownMode;

        @NameInMap("Spid")
        private Long spid;

        @NameInMap("SqlText")
        private String sqlText;

        @NameInMap("Status")
        private String status;

        @NameInMap("Victim")
        private Long victim;

        @NameInMap("WaitMode")
        private String waitMode;

        @NameInMap("WaitResource")
        private String waitResource;

        @NameInMap("WaitResourceDescription")
        private String waitResourceDescription;

        private List(Builder builder) {
            this.batchId = builder.batchId;
            this.blockProcessList = builder.blockProcessList;
            this.clientApp = builder.clientApp;
            this.databaseName = builder.databaseName;
            this.hostName = builder.hostName;
            this.lastTranStarted = builder.lastTranStarted;
            this.lockMode = builder.lockMode;
            this.logUsed = builder.logUsed;
            this.loginName = builder.loginName;
            this.objectOwned = builder.objectOwned;
            this.objectRequested = builder.objectRequested;
            this.ownMode = builder.ownMode;
            this.spid = builder.spid;
            this.sqlText = builder.sqlText;
            this.status = builder.status;
            this.victim = builder.victim;
            this.waitMode = builder.waitMode;
            this.waitResource = builder.waitResource;
            this.waitResourceDescription = builder.waitResourceDescription;
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
         * @return blockProcessList
         */
        public java.util.List < BlockProcessList> getBlockProcessList() {
            return this.blockProcessList;
        }

        /**
         * @return clientApp
         */
        public String getClientApp() {
            return this.clientApp;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return lastTranStarted
         */
        public Long getLastTranStarted() {
            return this.lastTranStarted;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return logUsed
         */
        public Long getLogUsed() {
            return this.logUsed;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return objectOwned
         */
        public String getObjectOwned() {
            return this.objectOwned;
        }

        /**
         * @return objectRequested
         */
        public String getObjectRequested() {
            return this.objectRequested;
        }

        /**
         * @return ownMode
         */
        public String getOwnMode() {
            return this.ownMode;
        }

        /**
         * @return spid
         */
        public Long getSpid() {
            return this.spid;
        }

        /**
         * @return sqlText
         */
        public String getSqlText() {
            return this.sqlText;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return victim
         */
        public Long getVictim() {
            return this.victim;
        }

        /**
         * @return waitMode
         */
        public String getWaitMode() {
            return this.waitMode;
        }

        /**
         * @return waitResource
         */
        public String getWaitResource() {
            return this.waitResource;
        }

        /**
         * @return waitResourceDescription
         */
        public String getWaitResourceDescription() {
            return this.waitResourceDescription;
        }

        public static final class Builder {
            private Long batchId; 
            private java.util.List < BlockProcessList> blockProcessList; 
            private String clientApp; 
            private String databaseName; 
            private String hostName; 
            private Long lastTranStarted; 
            private String lockMode; 
            private Long logUsed; 
            private String loginName; 
            private String objectOwned; 
            private String objectRequested; 
            private String ownMode; 
            private Long spid; 
            private String sqlText; 
            private String status; 
            private Long victim; 
            private String waitMode; 
            private String waitResource; 
            private String waitResourceDescription; 

            /**
             * The time when the data was collected.
             */
            public Builder batchId(Long batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * The blocking list.
             */
            public Builder blockProcessList(java.util.List < BlockProcessList> blockProcessList) {
                this.blockProcessList = blockProcessList;
                return this;
            }

            /**
             * The client application.
             */
            public Builder clientApp(String clientApp) {
                this.clientApp = clientApp;
                return this;
            }

            /**
             * The database name.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The host name.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The time when the transaction started.
             */
            public Builder lastTranStarted(Long lastTranStarted) {
                this.lastTranStarted = lastTranStarted;
                return this;
            }

            /**
             * The lock mode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * The size of the logs generated by the session.
             */
            public Builder logUsed(Long logUsed) {
                this.logUsed = logUsed;
                return this;
            }

            /**
             * The username that is used for login.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * The locked object.
             */
            public Builder objectOwned(String objectOwned) {
                this.objectOwned = objectOwned;
                return this;
            }

            /**
             * The object that the current transaction requested to lock.
             */
            public Builder objectRequested(String objectRequested) {
                this.objectRequested = objectRequested;
                return this;
            }

            /**
             * The holding mode.
             */
            public Builder ownMode(String ownMode) {
                this.ownMode = ownMode;
                return this;
            }

            /**
             * The ID of the session that started the transaction.
             */
            public Builder spid(Long spid) {
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
             * The transaction status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The victim.
             */
            public Builder victim(Long victim) {
                this.victim = victim;
                return this;
            }

            /**
             * The wait mode.
             */
            public Builder waitMode(String waitMode) {
                this.waitMode = waitMode;
                return this;
            }

            /**
             * The pending resource.
             */
            public Builder waitResource(String waitResource) {
                this.waitResource = waitResource;
                return this;
            }

            /**
             * The description of the pending resource.
             */
            public Builder waitResourceDescription(String waitResourceDescription) {
                this.waitResourceDescription = waitResourceDescription;
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
             * The page number of the returned page.
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
