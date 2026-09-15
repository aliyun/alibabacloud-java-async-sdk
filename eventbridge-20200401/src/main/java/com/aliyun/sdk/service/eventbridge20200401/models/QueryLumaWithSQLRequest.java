// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link QueryLumaWithSQLRequest} extends {@link RequestModel}
 *
 * <p>QueryLumaWithSQLRequest</p>
 */
public class QueryLumaWithSQLRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxRows")
    private Integer maxRows;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sql;

    private QueryLumaWithSQLRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.maxRows = builder.maxRows;
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLumaWithSQLRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return maxRows
     */
    public Integer getMaxRows() {
        return this.maxRows;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder extends Request.Builder<QueryLumaWithSQLRequest, Builder> {
        private String agentName; 
        private Integer maxRows; 
        private String sql; 

        private Builder() {
            super();
        } 

        private Builder(QueryLumaWithSQLRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.maxRows = request.maxRows;
            this.sql = request.sql;
        } 

        /**
         * <p>The name of the Agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_agent</p>
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * <p>Rows exceeding this limit are truncated. The IsTruncated field in the response indicates whether truncation occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxRows(Integer maxRows) {
            this.putBodyParameter("MaxRows", maxRows);
            this.maxRows = maxRows;
            return this;
        }

        /**
         * <p>Only query statements are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM my_table LIMIT 10</p>
         */
        public Builder sql(String sql) {
            this.putBodyParameter("Sql", sql);
            this.sql = sql;
            return this;
        }

        @Override
        public QueryLumaWithSQLRequest build() {
            return new QueryLumaWithSQLRequest(this);
        } 

    } 

}
