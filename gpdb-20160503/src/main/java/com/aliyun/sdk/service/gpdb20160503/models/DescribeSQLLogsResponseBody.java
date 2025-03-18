// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeSQLLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLLogsResponseBody</p>
 */
public class DescribeSQLLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSQLLogsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSQLLogsResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried SQL execution logs.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A7941C94-B92F-46A0-BD3E-2D**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSQLLogsResponseBody build() {
            return new DescribeSQLLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSQLLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLLogsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("DBRole")
        private String DBRole;

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

        @com.aliyun.core.annotation.NameInMap("SQLPlan")
        private String SQLPlan;

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
            this.executeCost = builder.executeCost;
            this.executeState = builder.executeState;
            this.operationClass = builder.operationClass;
            this.operationExecuteTime = builder.operationExecuteTime;
            this.operationType = builder.operationType;
            this.returnRowCounts = builder.returnRowCounts;
            this.SQLPlan = builder.SQLPlan;
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
         * @return SQLPlan
         */
        public String getSQLPlan() {
            return this.SQLPlan;
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
            private Float executeCost; 
            private String executeState; 
            private String operationClass; 
            private String operationExecuteTime; 
            private String operationType; 
            private Long returnRowCounts; 
            private String SQLPlan; 
            private String SQLText; 
            private Long scanRowCounts; 
            private String sourceIP; 
            private Integer sourcePort; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.accountName = model.accountName;
                this.DBName = model.DBName;
                this.DBRole = model.DBRole;
                this.executeCost = model.executeCost;
                this.executeState = model.executeState;
                this.operationClass = model.operationClass;
                this.operationExecuteTime = model.operationExecuteTime;
                this.operationType = model.operationType;
                this.returnRowCounts = model.returnRowCounts;
                this.SQLPlan = model.SQLPlan;
                this.SQLText = model.SQLText;
                this.scanRowCounts = model.scanRowCounts;
                this.sourceIP = model.sourceIP;
                this.sourcePort = model.sourcePort;
            } 

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
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder returnRowCounts(Long returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
                return this;
            }

            /**
             * <p>The SQL execution plan.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder SQLPlan(String SQLPlan) {
                this.SQLPlan = SQLPlan;
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
