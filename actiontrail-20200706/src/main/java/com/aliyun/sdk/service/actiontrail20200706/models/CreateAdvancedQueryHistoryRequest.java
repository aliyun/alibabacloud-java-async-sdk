// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link CreateAdvancedQueryHistoryRequest} extends {@link RequestModel}
 *
 * <p>CreateAdvancedQueryHistoryRequest</p>
 */
public class CreateAdvancedQueryHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuerySql")
    private String querySql;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SimpleQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean simpleQuery;

    private CreateAdvancedQueryHistoryRequest(Builder builder) {
        super(builder);
        this.querySql = builder.querySql;
        this.simpleQuery = builder.simpleQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAdvancedQueryHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return querySql
     */
    public String getQuerySql() {
        return this.querySql;
    }

    /**
     * @return simpleQuery
     */
    public Boolean getSimpleQuery() {
        return this.simpleQuery;
    }

    public static final class Builder extends Request.Builder<CreateAdvancedQueryHistoryRequest, Builder> {
        private String querySql; 
        private Boolean simpleQuery; 

        private Builder() {
            super();
        } 

        private Builder(CreateAdvancedQueryHistoryRequest request) {
            super(request);
            this.querySql = request.querySql;
            this.simpleQuery = request.simpleQuery;
        } 

        /**
         * QuerySql.
         */
        public Builder querySql(String querySql) {
            this.putQueryParameter("QuerySql", querySql);
            this.querySql = querySql;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder simpleQuery(Boolean simpleQuery) {
            this.putQueryParameter("SimpleQuery", simpleQuery);
            this.simpleQuery = simpleQuery;
            return this;
        }

        @Override
        public CreateAdvancedQueryHistoryRequest build() {
            return new CreateAdvancedQueryHistoryRequest(this);
        } 

    } 

}
