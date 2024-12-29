// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ListApsLifecycleStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>ListApsLifecycleStrategyResponseBody</p>
 */
public class ListApsLifecycleStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListApsLifecycleStrategyResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApsLifecycleStrategyResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApsLifecycleStrategyResponseBody build() {
            return new ListApsLifecycleStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApsLifecycleStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>ListApsLifecycleStrategyResponseBody</p>
     */
    public static class OperationTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("ProcessAll")
        private String processAll;

        @com.aliyun.core.annotation.NameInMap("TableNames")
        private java.util.List<String> tableNames;

        private OperationTables(Builder builder) {
            this.databaseName = builder.databaseName;
            this.processAll = builder.processAll;
            this.tableNames = builder.tableNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationTables create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return processAll
         */
        public String getProcessAll() {
            return this.processAll;
        }

        /**
         * @return tableNames
         */
        public java.util.List<String> getTableNames() {
            return this.tableNames;
        }

        public static final class Builder {
            private String databaseName; 
            private String processAll; 
            private java.util.List<String> tableNames; 

            /**
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * ProcessAll.
             */
            public Builder processAll(String processAll) {
                this.processAll = processAll;
                return this;
            }

            /**
             * TableNames.
             */
            public Builder tableNames(java.util.List<String> tableNames) {
                this.tableNames = tableNames;
                return this;
            }

            public OperationTables build() {
                return new OperationTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApsLifecycleStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>ListApsLifecycleStrategyResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApsJobId")
        private String apsJobId;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OperationTables")
        private java.util.List<OperationTables> operationTables;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyDatabases")
        private Long strategyDatabases;

        @com.aliyun.core.annotation.NameInMap("StrategyDesc")
        private String strategyDesc;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        @com.aliyun.core.annotation.NameInMap("StrategyTables")
        private Long strategyTables;

        @com.aliyun.core.annotation.NameInMap("StrategyType")
        private String strategyType;

        @com.aliyun.core.annotation.NameInMap("StrategyValue")
        private String strategyValue;

        private Items(Builder builder) {
            this.apsJobId = builder.apsJobId;
            this.createdTime = builder.createdTime;
            this.DBClusterId = builder.DBClusterId;
            this.modifiedTime = builder.modifiedTime;
            this.operationTables = builder.operationTables;
            this.status = builder.status;
            this.strategyDatabases = builder.strategyDatabases;
            this.strategyDesc = builder.strategyDesc;
            this.strategyName = builder.strategyName;
            this.strategyTables = builder.strategyTables;
            this.strategyType = builder.strategyType;
            this.strategyValue = builder.strategyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return apsJobId
         */
        public String getApsJobId() {
            return this.apsJobId;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return operationTables
         */
        public java.util.List<OperationTables> getOperationTables() {
            return this.operationTables;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyDatabases
         */
        public Long getStrategyDatabases() {
            return this.strategyDatabases;
        }

        /**
         * @return strategyDesc
         */
        public String getStrategyDesc() {
            return this.strategyDesc;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
        }

        /**
         * @return strategyTables
         */
        public Long getStrategyTables() {
            return this.strategyTables;
        }

        /**
         * @return strategyType
         */
        public String getStrategyType() {
            return this.strategyType;
        }

        /**
         * @return strategyValue
         */
        public String getStrategyValue() {
            return this.strategyValue;
        }

        public static final class Builder {
            private String apsJobId; 
            private String createdTime; 
            private String DBClusterId; 
            private String modifiedTime; 
            private java.util.List<OperationTables> operationTables; 
            private String status; 
            private Long strategyDatabases; 
            private String strategyDesc; 
            private String strategyName; 
            private Long strategyTables; 
            private String strategyType; 
            private String strategyValue; 

            /**
             * ApsJobId.
             */
            public Builder apsJobId(String apsJobId) {
                this.apsJobId = apsJobId;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder operationTables(java.util.List<OperationTables> operationTables) {
                this.operationTables = operationTables;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StrategyDatabases.
             */
            public Builder strategyDatabases(Long strategyDatabases) {
                this.strategyDatabases = strategyDatabases;
                return this;
            }

            /**
             * StrategyDesc.
             */
            public Builder strategyDesc(String strategyDesc) {
                this.strategyDesc = strategyDesc;
                return this;
            }

            /**
             * StrategyName.
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * StrategyTables.
             */
            public Builder strategyTables(Long strategyTables) {
                this.strategyTables = strategyTables;
                return this;
            }

            /**
             * StrategyType.
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * StrategyValue.
             */
            public Builder strategyValue(String strategyValue) {
                this.strategyValue = strategyValue;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
