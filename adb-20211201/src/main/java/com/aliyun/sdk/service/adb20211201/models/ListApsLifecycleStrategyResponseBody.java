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
         * <p>The HTTP status code or the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The queried lifecycle management policies.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The returned message. Valid values:</p>
         * <ul>
         * <li>If the request was successful, a success message is returned.****</li>
         * <li>If the request failed, an error message is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>-3EEC-</strong></strong></strong>-9F06-******</p>
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>Indicates whether all tables in the database are selected.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder processAll(String processAll) {
                this.processAll = processAll;
                return this;
            }

            /**
             * <p>The names of the tables.</p>
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
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>aps-******</p>
             */
            public Builder apsJobId(String apsJobId) {
                this.apsJobId = apsJobId;
                return this;
            }

            /**
             * <p>The time when the policy was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-30T02:44:27Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-*******</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The time when the policy was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-03T06:33:00Z</p>
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
             * <p>The status of the lifecycle management policy. Valid values:</p>
             * <ol>
             * <li>on: enables the current policy.</li>
             * <li>off: disables the current policy.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of databases that are managed during the lifecycle management.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder strategyDatabases(Long strategyDatabases) {
                this.strategyDatabases = strategyDatabases;
                return this;
            }

            /**
             * <p>The description of the lifecycle management policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder strategyDesc(String strategyDesc) {
                this.strategyDesc = strategyDesc;
                return this;
            }

            /**
             * <p>The name of the lifecycle management policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * <p>The number of tables that are managed during the lifecycle management.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder strategyTables(Long strategyTables) {
                this.strategyTables = strategyTables;
                return this;
            }

            /**
             * <p>The type of the lifecycle management policy.</p>
             * 
             * <strong>example:</strong>
             * <p>KEEP_BY_TIME</p>
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * <p>The value of the lifecycle management policy.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
