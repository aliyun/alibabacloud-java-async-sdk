// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSQLLogsV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLLogsV2ResponseBody</p>
 */
public class DescribeSQLLogsV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSQLLogsV2ResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLLogsV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Details of the SQL logs.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A7941C94-B92F-46A0-BD3E-2D**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSQLLogsV2ResponseBody build() {
            return new DescribeSQLLogsV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSQLLogsV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLLogsV2ResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("DBRole")
        private String DBRole;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("ExecuteCost")
        private Float executeCost;

        @com.aliyun.core.annotation.NameInMap("ExecuteState")
        private String executeState;

        @com.aliyun.core.annotation.NameInMap("OperationClass")
        private String operationClass;

        @com.aliyun.core.annotation.NameInMap("OperationExecuteTime")
        private String operationExecuteTime;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("ReturnRowCounts")
        private Long returnRowCounts;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("ScanRowCounts")
        private Long scanRowCounts;

        @com.aliyun.core.annotation.NameInMap("SourceIP")
        private String sourceIP;

        @com.aliyun.core.annotation.NameInMap("SourcePort")
        private Integer sourcePort;

        private Items(Builder builder) {
            this.accountName = builder.accountName;
            this.DBName = builder.DBName;
            this.DBRole = builder.DBRole;
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.executeCost = builder.executeCost;
            this.executeState = builder.executeState;
            this.operationClass = builder.operationClass;
            this.operationExecuteTime = builder.operationExecuteTime;
            this.operationType = builder.operationType;
            this.returnRowCounts = builder.returnRowCounts;
            this.SQLText = builder.SQLText;
            this.scanRowCounts = builder.scanRowCounts;
            this.sourceIP = builder.sourceIP;
            this.sourcePort = builder.sourcePort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
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
         * @return DBRole
         */
        public String getDBRole() {
            return this.DBRole;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return executeCost
         */
        public Float getExecuteCost() {
            return this.executeCost;
        }

        /**
         * @return executeState
         */
        public String getExecuteState() {
            return this.executeState;
        }

        /**
         * @return operationClass
         */
        public String getOperationClass() {
            return this.operationClass;
        }

        /**
         * @return operationExecuteTime
         */
        public String getOperationExecuteTime() {
            return this.operationExecuteTime;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return returnRowCounts
         */
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return scanRowCounts
         */
        public Long getScanRowCounts() {
            return this.scanRowCounts;
        }

        /**
         * @return sourceIP
         */
        public String getSourceIP() {
            return this.sourceIP;
        }

        /**
         * @return sourcePort
         */
        public Integer getSourcePort() {
            return this.sourcePort;
        }

        public static final class Builder {
            private String accountName; 
            private String DBName; 
            private String DBRole; 
            private String errorCode; 
            private String errorMsg; 
            private Float executeCost; 
            private String executeState; 
            private String operationClass; 
            private String operationExecuteTime; 
            private String operationType; 
            private Long returnRowCounts; 
            private String SQLText; 
            private Long scanRowCounts; 
            private String sourceIP; 
            private Integer sourcePort; 

            /**
             * <p>The database account that executes the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>testadmin</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>adbpgadmin</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The role of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder DBRole(String DBRole) {
                this.DBRole = DBRole;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The execution duration of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder executeCost(Float executeCost) {
                this.executeCost = executeCost;
                return this;
            }

            /**
             * <p>The execution status of the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>success</strong></li>
             * <li><strong>fail</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder executeState(String executeState) {
                this.executeState = executeState;
                return this;
            }

            /**
             * <p>The type of the query language.</p>
             * 
             * <strong>example:</strong>
             * <p>DQL</p>
             */
            public Builder operationClass(String operationClass) {
                this.operationClass = operationClass;
                return this;
            }

            /**
             * <p>The time when the SQL statement was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-15T17:02:32Z</p>
             */
            public Builder operationExecuteTime(String operationExecuteTime) {
                this.operationExecuteTime = operationExecuteTime;
                return this;
            }

            /**
             * <p>The type of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder returnRowCounts(Long returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>select 1</p>
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * <p>The number of entries scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scanRowCounts(Long scanRowCounts) {
                this.scanRowCounts = scanRowCounts;
                return this;
            }

            /**
             * <p>The source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>100.<strong>.</strong>.90</p>
             */
            public Builder sourceIP(String sourceIP) {
                this.sourceIP = sourceIP;
                return this;
            }

            /**
             * <p>The number of the source port.</p>
             * 
             * <strong>example:</strong>
             * <p>50514</p>
             */
            public Builder sourcePort(Integer sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
