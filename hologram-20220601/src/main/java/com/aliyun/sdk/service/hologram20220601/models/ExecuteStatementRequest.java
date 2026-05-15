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
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * dbName.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("dbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * maxBytes.
         */
        public Builder maxBytes(Long maxBytes) {
            this.putBodyParameter("maxBytes", maxBytes);
            this.maxBytes = maxBytes;
            return this;
        }

        /**
         * maxRows.
         */
        public Builder maxRows(Long maxRows) {
            this.putBodyParameter("maxRows", maxRows);
            this.maxRows = maxRows;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(java.util.List<?> parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * queryTimeout.
         */
        public Builder queryTimeout(Long queryTimeout) {
            this.putBodyParameter("queryTimeout", queryTimeout);
            this.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * sql.
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
