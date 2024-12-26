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
 * {@link GetDeadLockDetailListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeadLockDetailListResponseBody</p>
 */
public class GetDeadLockDetailListResponseBody extends TeaModel {
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
         * <p>840F51F7-9C01-538D-94F6-AE712905****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
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

        public GetDeadLockDetailListResponseBody build() {
            return new GetDeadLockDetailListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeadLockDetailListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeadLockDetailListResponseBody</p>
     */
    public static class BlockProcessList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientApp")
        private String clientApp;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("LastTranStarted")
        private Long lastTranStarted;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LogUsed")
        private Long logUsed;

        @com.aliyun.core.annotation.NameInMap("LoginName")
        private String loginName;

        @com.aliyun.core.annotation.NameInMap("ObjectOwned")
        private String objectOwned;

        @com.aliyun.core.annotation.NameInMap("ObjectRequested")
        private String objectRequested;

        @com.aliyun.core.annotation.NameInMap("OwnMode")
        private String ownMode;

        @com.aliyun.core.annotation.NameInMap("Spid")
        private Long spid;

        @com.aliyun.core.annotation.NameInMap("SqlText")
        private String sqlText;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Victim")
        private Long victim;

        @com.aliyun.core.annotation.NameInMap("WaitMode")
        private String waitMode;

        @com.aliyun.core.annotation.NameInMap("WaitResource")
        private String waitResource;

        @com.aliyun.core.annotation.NameInMap("WaitResourceDescription")
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
             * <p>The name of the client that initiates the transaction in the session.</p>
             * 
             * <strong>example:</strong>
             * <p>Microsoft SQL Server Management Studio - Query</p>
             */
            public Builder clientApp(String clientApp) {
                this.clientApp = clientApp;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>school</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>sd74020124</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The time when the transaction was started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1702301152000</p>
             */
            public Builder lastTranStarted(Long lastTranStarted) {
                this.lastTranStarted = lastTranStarted;
                return this;
            }

            /**
             * <p>The mode of the lock. For more information, see <a href="https://help.aliyun.com/document_detail/2362804.html">Lock modes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>U</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The size of the logs generated in the session. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>352</p>
             */
            public Builder logUsed(Long logUsed) {
                this.logUsed = logUsed;
                return this;
            }

            /**
             * <p>The logon name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>sd74020124\Administrator</p>
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * <p>The locked object.</p>
             * 
             * <strong>example:</strong>
             * <p>school.dbo.test2</p>
             */
            public Builder objectOwned(String objectOwned) {
                this.objectOwned = objectOwned;
                return this;
            }

            /**
             * <p>The object that the transaction requested to lock.</p>
             * 
             * <strong>example:</strong>
             * <p>school.dbo.test1</p>
             */
            public Builder objectRequested(String objectRequested) {
                this.objectRequested = objectRequested;
                return this;
            }

            /**
             * <p>The lock mode held by the session. For more information, see <a href="https://help.aliyun.com/document_detail/2362804.html">Lock modes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>X</p>
             */
            public Builder ownMode(String ownMode) {
                this.ownMode = ownMode;
                return this;
            }

            /**
             * <p>The ID of the session in which the transaction is started.</p>
             * 
             * <strong>example:</strong>
             * <p>61</p>
             */
            public Builder spid(Long spid) {
                this.spid = spid;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>update test1 set col1 =9</p>
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * <p>The status of the transaction.</p>
             * 
             * <strong>example:</strong>
             * <p>suspended</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether the session is the victim of the deadlock. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no.</li>
             * <li><strong>1</strong>: yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder victim(Long victim) {
                this.victim = victim;
                return this;
            }

            /**
             * <p>The lock mode requested by the session. For more information, see <a href="https://help.aliyun.com/document_detail/2362804.html">Lock modes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>U</p>
             */
            public Builder waitMode(String waitMode) {
                this.waitMode = waitMode;
                return this;
            }

            /**
             * <p>The resources requested by the transaction.</p>
             * 
             * <strong>example:</strong>
             * <p>RID: 5:1:312:0</p>
             */
            public Builder waitResource(String waitResource) {
                this.waitResource = waitResource;
                return this;
            }

            /**
             * <p>The details of the resources requested by the transaction.</p>
             * 
             * <strong>example:</strong>
             * <p>RID:school:school.mdf:312:0</p>
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
    /**
     * 
     * {@link GetDeadLockDetailListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeadLockDetailListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchId")
        private Long batchId;

        @com.aliyun.core.annotation.NameInMap("BlockProcessList")
        private java.util.List<BlockProcessList> blockProcessList;

        @com.aliyun.core.annotation.NameInMap("ClientApp")
        private String clientApp;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("LastTranStarted")
        private Long lastTranStarted;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LogUsed")
        private Long logUsed;

        @com.aliyun.core.annotation.NameInMap("LoginName")
        private String loginName;

        @com.aliyun.core.annotation.NameInMap("ObjectOwned")
        private String objectOwned;

        @com.aliyun.core.annotation.NameInMap("ObjectRequested")
        private String objectRequested;

        @com.aliyun.core.annotation.NameInMap("OwnMode")
        private String ownMode;

        @com.aliyun.core.annotation.NameInMap("Spid")
        private Long spid;

        @com.aliyun.core.annotation.NameInMap("SqlText")
        private String sqlText;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Victim")
        private Long victim;

        @com.aliyun.core.annotation.NameInMap("WaitMode")
        private String waitMode;

        @com.aliyun.core.annotation.NameInMap("WaitResource")
        private String waitResource;

        @com.aliyun.core.annotation.NameInMap("WaitResourceDescription")
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
        public java.util.List<BlockProcessList> getBlockProcessList() {
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
            private java.util.List<BlockProcessList> blockProcessList; 
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
             * <p>The time when the data was collected. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1702301170701</p>
             */
            public Builder batchId(Long batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>The blocking details of the instance. The details are information about the session that caused the lock.</p>
             */
            public Builder blockProcessList(java.util.List<BlockProcessList> blockProcessList) {
                this.blockProcessList = blockProcessList;
                return this;
            }

            /**
             * <p>The name of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>Microsoft SQL Server Management Studio - Query</p>
             */
            public Builder clientApp(String clientApp) {
                this.clientApp = clientApp;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>school</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>sd74020124</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The time when the transaction was started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1702301141000</p>
             */
            public Builder lastTranStarted(Long lastTranStarted) {
                this.lastTranStarted = lastTranStarted;
                return this;
            }

            /**
             * <p>The mode of the lock. For more information, see <a href="https://help.aliyun.com/document_detail/2362804.html">Lock modes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>U</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The size of the logs generated in the session. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>352</p>
             */
            public Builder logUsed(Long logUsed) {
                this.logUsed = logUsed;
                return this;
            }

            /**
             * <p>The logon name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>sd74020124\Administrator</p>
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * <p>The locked object.</p>
             * 
             * <strong>example:</strong>
             * <p>school.dbo.test1</p>
             */
            public Builder objectOwned(String objectOwned) {
                this.objectOwned = objectOwned;
                return this;
            }

            /**
             * <p>The object that the transaction requested to lock.</p>
             * 
             * <strong>example:</strong>
             * <p>school.dbo.test2</p>
             */
            public Builder objectRequested(String objectRequested) {
                this.objectRequested = objectRequested;
                return this;
            }

            /**
             * <p>The lock mode held by the session. For more information, see <a href="https://help.aliyun.com/document_detail/2362804.html">Lock modes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>X</p>
             */
            public Builder ownMode(String ownMode) {
                this.ownMode = ownMode;
                return this;
            }

            /**
             * <p>The ID of the session in which the transaction is started.</p>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder spid(Long spid) {
                this.spid = spid;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>update test2 set col1 =88</p>
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * <p>The status of the transaction.</p>
             * 
             * <strong>example:</strong>
             * <p>suspended</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether the session is the victim of the deadlock. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no.</li>
             * <li><strong>1</strong>: yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder victim(Long victim) {
                this.victim = victim;
                return this;
            }

            /**
             * <p>The lock mode requested by the session. For more information, see <a href="https://help.aliyun.com/document_detail/2362804.html">Lock modes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>U</p>
             */
            public Builder waitMode(String waitMode) {
                this.waitMode = waitMode;
                return this;
            }

            /**
             * <p>The resources requested by the transaction.</p>
             * 
             * <strong>example:</strong>
             * <p>RID: 5:1:376:0</p>
             */
            public Builder waitResource(String waitResource) {
                this.waitResource = waitResource;
                return this;
            }

            /**
             * <p>The details of the resources requested by the transaction.</p>
             * 
             * <strong>example:</strong>
             * <p>RID:school:school.mdf:376:0</p>
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
    /**
     * 
     * {@link GetDeadLockDetailListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeadLockDetailListResponseBody</p>
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
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>2</p>
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
