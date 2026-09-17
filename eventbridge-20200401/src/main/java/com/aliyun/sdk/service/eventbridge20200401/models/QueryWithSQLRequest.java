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
 * {@link QueryWithSQLRequest} extends {@link RequestModel}
 *
 * <p>QueryWithSQLRequest</p>
 */
public class QueryWithSQLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    private QueryWithSQLRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWithSQLRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<QueryWithSQLRequest, Builder> {
        private Integer limit; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(QueryWithSQLRequest request) {
            super(request);
            this.limit = request.limit;
            this.query = request.query;
        } 

        /**
         * <p>The maximum number of rows to return. Default value: 20. Maximum value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The query statement. Typically uses a three-part table name in the format of catalog.namespace.table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM &quot;test-es&quot;.&quot;default&quot;.&quot;product_info&quot;</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        @Override
        public QueryWithSQLRequest build() {
            return new QueryWithSQLRequest(this);
        } 

    } 

}
