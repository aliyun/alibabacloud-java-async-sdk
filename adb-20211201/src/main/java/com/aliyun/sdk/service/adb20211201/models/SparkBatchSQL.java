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
 * {@link SparkBatchSQL} extends {@link TeaModel}
 *
 * <p>SparkBatchSQL</p>
 */
public class SparkBatchSQL extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("QueryEndTime")
    private Long queryEndTime;

    @com.aliyun.core.annotation.NameInMap("QueryId")
    private String queryId;

    @com.aliyun.core.annotation.NameInMap("QueryStartTime")
    private Long queryStartTime;

    @com.aliyun.core.annotation.NameInMap("QueryState")
    private String queryState;

    @com.aliyun.core.annotation.NameInMap("QuerySubmissionTime")
    private Long querySubmissionTime;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.NameInMap("Statements")
    private java.util.List<SparkBatchSQLStatement> statements;

    @com.aliyun.core.annotation.NameInMap("Uid")
    private Long uid;

    private SparkBatchSQL(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.errMessage = builder.errMessage;
        this.query = builder.query;
        this.queryEndTime = builder.queryEndTime;
        this.queryId = builder.queryId;
        this.queryStartTime = builder.queryStartTime;
        this.queryState = builder.queryState;
        this.querySubmissionTime = builder.querySubmissionTime;
        this.resourceGroupName = builder.resourceGroupName;
        this.schema = builder.schema;
        this.statements = builder.statements;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SparkBatchSQL create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return queryEndTime
     */
    public Long getQueryEndTime() {
        return this.queryEndTime;
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return queryStartTime
     */
    public Long getQueryStartTime() {
        return this.queryStartTime;
    }

    /**
     * @return queryState
     */
    public String getQueryState() {
        return this.queryState;
    }

    /**
     * @return querySubmissionTime
     */
    public Long getQuerySubmissionTime() {
        return this.querySubmissionTime;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return statements
     */
    public java.util.List<SparkBatchSQLStatement> getStatements() {
        return this.statements;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String errMessage; 
        private String query; 
        private Long queryEndTime; 
        private String queryId; 
        private Long queryStartTime; 
        private String queryState; 
        private Long querySubmissionTime; 
        private String resourceGroupName; 
        private String schema; 
        private java.util.List<SparkBatchSQLStatement> statements; 
        private Long uid; 

        private Builder() {
        } 

        private Builder(SparkBatchSQL model) {
            this.DBClusterId = model.DBClusterId;
            this.errMessage = model.errMessage;
            this.query = model.query;
            this.queryEndTime = model.queryEndTime;
            this.queryId = model.queryId;
            this.queryStartTime = model.queryStartTime;
            this.queryState = model.queryState;
            this.querySubmissionTime = model.querySubmissionTime;
            this.resourceGroupName = model.resourceGroupName;
            this.schema = model.schema;
            this.statements = model.statements;
            this.uid = model.uid;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp17s73f016****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The error message for the query execution.</p>
         * 
         * <strong>example:</strong>
         * <p>schema is not found</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The text of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM db.tb</p>
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * <p>The execution end timestamp of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1723521767000</p>
         */
        public Builder queryEndTime(Long queryEndTime) {
            this.queryEndTime = queryEndTime;
            return this;
        }

        /**
         * <p>The query ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sq172352176****</p>
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * <p>The execution start timestamp of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1723521767000</p>
         */
        public Builder queryStartTime(Long queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }

        /**
         * <p>The execution status of the query. Valid values:</p>
         * <ul>
         * <li>FAILED</li>
         * <li>RUNNING</li>
         * <li>CANCELED</li>
         * <li>PENDING</li>
         * <li>SUBMITTED</li>
         * <li>FINISHED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder queryState(String queryState) {
            this.queryState = queryState;
            return this;
        }

        /**
         * <p>The submission timestamp of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1723521767000</p>
         */
        public Builder querySubmissionTime(Long querySubmissionTime) {
            this.querySubmissionTime = querySubmissionTime;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>spark_rg</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * <p>The name of the database for the query execution.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * <p>The execution results of the SQL statements.</p>
         */
        public Builder statements(java.util.List<SparkBatchSQLStatement> statements) {
            this.statements = statements;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2198002412336****</p>
         */
        public Builder uid(Long uid) {
            this.uid = uid;
            return this;
        }

        public SparkBatchSQL build() {
            return new SparkBatchSQL(this);
        } 

    } 

}
