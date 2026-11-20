// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link ExecuteStatementRequest} extends {@link RequestModel}
 *
 * <p>ExecuteStatementRequest</p>
 */
public class ExecuteStatementRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dbName")
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxBytes")
    private Long maxBytes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxRows")
    private Long maxRows;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.List<?> parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("queryTimeout")
    private Long queryTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sql")
    private String sql;

    private ExecuteStatementRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dbName = builder.dbName;
        this.maxBytes = builder.maxBytes;
        this.maxRows = builder.maxRows;
        this.parameters = builder.parameters;
        this.queryTimeout = builder.queryTimeout;
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteStatementRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return maxBytes
     */
    public Long getMaxBytes() {
        return this.maxBytes;
    }

    /**
     * @return maxRows
     */
    public Long getMaxRows() {
        return this.maxRows;
    }

    /**
     * @return parameters
     */
    public java.util.List<?> getParameters() {
        return this.parameters;
    }

    /**
     * @return queryTimeout
     */
    public Long getQueryTimeout() {
        return this.queryTimeout;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder extends Request.Builder<ExecuteStatementRequest, Builder> {
        private String instanceId; 
        private String dbName; 
        private Long maxBytes; 
        private Long maxRows; 
        private java.util.List<?> parameters; 
        private Long queryTimeout; 
        private String sql; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteStatementRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dbName = request.dbName;
            this.maxBytes = request.maxBytes;
            this.maxRows = request.maxRows;
            this.parameters = request.parameters;
            this.queryTimeout = request.queryTimeout;
            this.sql = request.sql;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-i7m2ucpyu005</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("dbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The maximum amount of data to return in a single request, in bytes. Default value: 10485760 (10 MB). Excess data is truncated and indicated by setting truncated to true.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder maxBytes(Long maxBytes) {
            this.putBodyParameter("maxBytes", maxBytes);
            this.maxBytes = maxBytes;
            return this;
        }

        /**
         * <p>The maximum number of rows to return. Default value: 200. Maximum value: 1000. Excess rows are truncated and indicated by the Truncated field in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder maxRows(Long maxRows) {
            this.putBodyParameter("maxRows", maxRows);
            this.maxRows = maxRows;
            return this;
        }

        /**
         * <p>The list of parameters to attach to the SQL parameterized query, which correspond in sequence to placeholders such as $1 and $2 in the SQL statement. Supported value types include String, Long, Double, Boolean, and null, which represents NULL. Using a parameterized query effectively prevents SQL injection and improves the cache reuse rate of precompiled statements. The parameter list applies to each SQL statement in Statements.</p>
         */
        public Builder parameters(java.util.List<?> parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The timeout period for SQL execution, in seconds. Default value: 30. Maximum value: 30. Minimum value: 1. If a timeout occurs, the server actively cancels the query.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder queryTimeout(Long queryTimeout) {
            this.putBodyParameter("queryTimeout", queryTimeout);
            this.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * <p>The SQL statement to be executed. The maximum length is 16,384 characters. Multiple SQL statements separated by semicolons are supported. If multiple statements are specified, the result of the last statement is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from test_table limit 10;</p>
         */
        public Builder sql(String sql) {
            this.putBodyParameter("sql", sql);
            this.sql = sql;
            return this;
        }

        @Override
        public ExecuteStatementRequest build() {
            return new ExecuteStatementRequest(this);
        } 

    } 

}
