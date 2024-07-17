// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryResultRequest} extends {@link RequestModel}
 *
 * <p>ListQueryResultRequest</p>
 */
public class ListQueryResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sql")
    private String sql;

    private ListQueryResultRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.query = builder.query;
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryResultRequest create() {
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
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder extends Request.Builder<ListQueryResultRequest, Builder> {
        private String instanceId; 
        private String query; 
        private String sql; 

        private Builder() {
            super();
        } 

        private Builder(ListQueryResultRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.query = request.query;
            this.sql = request.sql;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The query statement
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * The SQL statement that is executed in the query
         */
        public Builder sql(String sql) {
            this.putQueryParameter("sql", sql);
            this.sql = sql;
            return this;
        }

        @Override
        public ListQueryResultRequest build() {
            return new ListQueryResultRequest(this);
        } 

    } 

}
