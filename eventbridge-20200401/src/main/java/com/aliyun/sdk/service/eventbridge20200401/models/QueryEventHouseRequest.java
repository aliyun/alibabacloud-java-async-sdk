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
 * {@link QueryEventHouseRequest} extends {@link RequestModel}
 *
 * <p>QueryEventHouseRequest</p>
 */
public class QueryEventHouseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    private QueryEventHouseRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEventHouseRequest create() {
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

    public static final class Builder extends Request.Builder<QueryEventHouseRequest, Builder> {
        private Integer limit; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(QueryEventHouseRequest request) {
            super(request);
            this.limit = request.limit;
            this.query = request.query;
        } 

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
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
        public QueryEventHouseRequest build() {
            return new QueryEventHouseRequest(this);
        } 

    } 

}
