// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregateResourcesByAdvancedSearchRequest} extends {@link RequestModel}
 *
 * <p>ListAggregateResourcesByAdvancedSearchRequest</p>
 */
public class ListAggregateResourcesByAdvancedSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sql;

    private ListAggregateResourcesByAdvancedSearchRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateResourcesByAdvancedSearchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder extends Request.Builder<ListAggregateResourcesByAdvancedSearchRequest, Builder> {
        private String aggregatorId; 
        private String sql; 

        private Builder() {
            super();
        } 

        private Builder(ListAggregateResourcesByAdvancedSearchRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.sql = request.sql;
        } 

        /**
         * The ID of the account group.
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The SQL query statement.
         */
        public Builder sql(String sql) {
            this.putQueryParameter("Sql", sql);
            this.sql = sql;
            return this;
        }

        @Override
        public ListAggregateResourcesByAdvancedSearchRequest build() {
            return new ListAggregateResourcesByAdvancedSearchRequest(this);
        } 

    } 

}
