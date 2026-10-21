// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListAgenticSqlExecutionHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgenticSqlExecutionHistoriesResponseBody</p>
 */
public class ListAgenticSqlExecutionHistoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAgenticSqlExecutionHistoriesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgenticSqlExecutionHistoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAgenticSqlExecutionHistoriesResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of SQL execution history.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. This parameter is empty when the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>INVALID_PARAMETER</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid endTime format, expected yyyy-MM-dd HH:mm:ss</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34E01EDD-6A16-4CF0-9541-C644D1BE01AA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAgenticSqlExecutionHistoriesResponseBody build() {
            return new ListAgenticSqlExecutionHistoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgenticSqlExecutionHistoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgenticSqlExecutionHistoriesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActorId")
        private String actorId;

        @com.aliyun.core.annotation.NameInMap("ActorName")
        private String actorName;

        @com.aliyun.core.annotation.NameInMap("ActorType")
        private String actorType;

        @com.aliyun.core.annotation.NameInMap("AffectedRows")
        private Long affectedRows;

        @com.aliyun.core.annotation.NameInMap("AgentOwnerId")
        private String agentOwnerId;

        @com.aliyun.core.annotation.NameInMap("CatalogUuid")
        private String catalogUuid;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("Cost")
        private Long cost;

        @com.aliyun.core.annotation.NameInMap("DatabaseSearchName")
        private String databaseSearchName;

        @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
        private String databaseUuid;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("ExecutedSql")
        private String executedSql;

        @com.aliyun.core.annotation.NameInMap("ExecutionStatus")
        private String executionStatus;

        @com.aliyun.core.annotation.NameInMap("OriginalSql")
        private String originalSql;

        @com.aliyun.core.annotation.NameInMap("QueryId")
        private String queryId;

        @com.aliyun.core.annotation.NameInMap("ReturnedRows")
        private Long returnedRows;

        @com.aliyun.core.annotation.NameInMap("Scenario")
        private String scenario;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private String workflowId;

        private Data(Builder builder) {
            this.actorId = builder.actorId;
            this.actorName = builder.actorName;
            this.actorType = builder.actorType;
            this.affectedRows = builder.affectedRows;
            this.agentOwnerId = builder.agentOwnerId;
            this.catalogUuid = builder.catalogUuid;
            this.clientIp = builder.clientIp;
            this.cost = builder.cost;
            this.databaseSearchName = builder.databaseSearchName;
            this.databaseUuid = builder.databaseUuid;
            this.error = builder.error;
            this.executedSql = builder.executedSql;
            this.executionStatus = builder.executionStatus;
            this.originalSql = builder.originalSql;
            this.queryId = builder.queryId;
            this.returnedRows = builder.returnedRows;
            this.scenario = builder.scenario;
            this.sqlType = builder.sqlType;
            this.startTime = builder.startTime;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actorId
         */
        public String getActorId() {
            return this.actorId;
        }

        /**
         * @return actorName
         */
        public String getActorName() {
            return this.actorName;
        }

        /**
         * @return actorType
         */
        public String getActorType() {
            return this.actorType;
        }

        /**
         * @return affectedRows
         */
        public Long getAffectedRows() {
            return this.affectedRows;
        }

        /**
         * @return agentOwnerId
         */
        public String getAgentOwnerId() {
            return this.agentOwnerId;
        }

        /**
         * @return catalogUuid
         */
        public String getCatalogUuid() {
            return this.catalogUuid;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return cost
         */
        public Long getCost() {
            return this.cost;
        }

        /**
         * @return databaseSearchName
         */
        public String getDatabaseSearchName() {
            return this.databaseSearchName;
        }

        /**
         * @return databaseUuid
         */
        public String getDatabaseUuid() {
            return this.databaseUuid;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return executedSql
         */
        public String getExecutedSql() {
            return this.executedSql;
        }

        /**
         * @return executionStatus
         */
        public String getExecutionStatus() {
            return this.executionStatus;
        }

        /**
         * @return originalSql
         */
        public String getOriginalSql() {
            return this.originalSql;
        }

        /**
         * @return queryId
         */
        public String getQueryId() {
            return this.queryId;
        }

        /**
         * @return returnedRows
         */
        public Long getReturnedRows() {
            return this.returnedRows;
        }

        /**
         * @return scenario
         */
        public String getScenario() {
            return this.scenario;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return workflowId
         */
        public String getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private String actorId; 
            private String actorName; 
            private String actorType; 
            private Long affectedRows; 
            private String agentOwnerId; 
            private String catalogUuid; 
            private String clientIp; 
            private Long cost; 
            private String databaseSearchName; 
            private String databaseUuid; 
            private String error; 
            private String executedSql; 
            private String executionStatus; 
            private String originalSql; 
            private String queryId; 
            private Long returnedRows; 
            private String scenario; 
            private String sqlType; 
            private String startTime; 
            private String workflowId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.actorId = model.actorId;
                this.actorName = model.actorName;
                this.actorType = model.actorType;
                this.affectedRows = model.affectedRows;
                this.agentOwnerId = model.agentOwnerId;
                this.catalogUuid = model.catalogUuid;
                this.clientIp = model.clientIp;
                this.cost = model.cost;
                this.databaseSearchName = model.databaseSearchName;
                this.databaseUuid = model.databaseUuid;
                this.error = model.error;
                this.executedSql = model.executedSql;
                this.executionStatus = model.executionStatus;
                this.originalSql = model.originalSql;
                this.queryId = model.queryId;
                this.returnedRows = model.returnedRows;
                this.scenario = model.scenario;
                this.sqlType = model.sqlType;
                this.startTime = model.startTime;
                this.workflowId = model.workflowId;
            } 

            /**
             * <p>The ID of the actor. User IDs start with usr_, and agent IDs start with agt_.</p>
             * 
             * <strong>example:</strong>
             * <p>usr_10001</p>
             */
            public Builder actorId(String actorId) {
                this.actorId = actorId;
                return this;
            }

            /**
             * <p>The name of the actor.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-user</p>
             */
            public Builder actorName(String actorName) {
                this.actorName = actorName;
                return this;
            }

            /**
             * <p>The type of the actor. HUMAN indicates a user, and AGENT indicates an agent.</p>
             * 
             * <strong>example:</strong>
             * <p>HUMAN</p>
             */
            public Builder actorType(String actorType) {
                this.actorType = actorType;
                return this;
            }

            /**
             * <p>The number of affected rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder affectedRows(Long affectedRows) {
                this.affectedRows = affectedRows;
                return this;
            }

            /**
             * <p>The ID of the user to which the agent belongs. The ID starts with usr_.</p>
             * 
             * <strong>example:</strong>
             * <p>usr_10001</p>
             */
            public Builder agentOwnerId(String agentOwnerId) {
                this.agentOwnerId = agentOwnerId;
                return this;
            }

            /**
             * <p>The catalog UUID to which the execution belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>mc-HZ-OfjcNc2z***</p>
             */
            public Builder catalogUuid(String catalogUuid) {
                this.catalogUuid = catalogUuid;
                return this;
            }

            /**
             * <p>The IP address of the client that initiated the execution, excluding the port. This parameter is empty in workflow scenarios or when the IP address is not recorded.</p>
             * 
             * <strong>example:</strong>
             * <p>203.0.113.10</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The execution duration of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder cost(Long cost) {
                this.cost = cost;
                return this;
            }

            /**
             * <p>The search name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_db</p>
             */
            public Builder databaseSearchName(String databaseSearchName) {
                this.databaseSearchName = databaseSearchName;
                return this;
            }

            /**
             * <p>The database UUID to which the execution belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>md-HZ-fp9K7r***</p>
             */
            public Builder databaseUuid(String databaseUuid) {
                this.databaseUuid = databaseUuid;
                return this;
            }

            /**
             * <p>The error message returned when the execution fails.</p>
             * 
             * <strong>example:</strong>
             * <p>syntax error</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The actual SQL statement that was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT 1</p>
             */
            public Builder executedSql(String executedSql) {
                this.executedSql = executedSql;
                return this;
            }

            /**
             * <p>The execution status. Valid values:</p>
             * <ul>
             * <li>SUCCESS: The execution succeeded.</li>
             * <li>FAILED: The execution failed.</li>
             * <li>BLOCKED: The execution was blocked or not actually executed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder executionStatus(String executionStatus) {
                this.executionStatus = executionStatus;
                return this;
            }

            /**
             * <p>The original SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT 1</p>
             */
            public Builder originalSql(String originalSql) {
                this.originalSql = originalSql;
                return this;
            }

            /**
             * <p>The query ID of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>trace-10001</p>
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            /**
             * <p>The number of returned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder returnedRows(Long returnedRows) {
                this.returnedRows = returnedRows;
                return this;
            }

            /**
             * <p>The execution scenario. Valid values:</p>
             * <ul>
             * <li>AGENT_QUERY: The agent directly executes the SQL statement.</li>
             * <li>WORKFLOW_QUERY: The SQL statement is asynchronously executed through a workflow.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AGENT_QUERY</p>
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            /**
             * <p>The SQL type.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The start time of the execution. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01 00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The workflow ID. This parameter may be empty in non-workflow scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>wf-10001</p>
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
