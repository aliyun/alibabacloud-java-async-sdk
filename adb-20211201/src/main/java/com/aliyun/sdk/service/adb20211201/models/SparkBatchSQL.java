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
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * QueryEndTime.
         */
        public Builder queryEndTime(Long queryEndTime) {
            this.queryEndTime = queryEndTime;
            return this;
        }

        /**
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * QueryStartTime.
         */
        public Builder queryStartTime(Long queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }

        /**
         * QueryState.
         */
        public Builder queryState(String queryState) {
            this.queryState = queryState;
            return this;
        }

        /**
         * QuerySubmissionTime.
         */
        public Builder querySubmissionTime(Long querySubmissionTime) {
            this.querySubmissionTime = querySubmissionTime;
            return this;
        }

        /**
         * ResourceGroupName.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * Schema.
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Statements.
         */
        public Builder statements(java.util.List<SparkBatchSQLStatement> statements) {
            this.statements = statements;
            return this;
        }

        /**
         * Uid.
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
