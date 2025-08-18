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
 * {@link CreateAdvancedQueryHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAdvancedQueryHistoryResponseBody</p>
 */
public class CreateAdvancedQueryHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QueryId")
    private String queryId;

    @com.aliyun.core.annotation.NameInMap("QuerySql")
    private String querySql;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SimpleQuery")
    private Boolean simpleQuery;

    private CreateAdvancedQueryHistoryResponseBody(Builder builder) {
        this.queryId = builder.queryId;
        this.querySql = builder.querySql;
        this.requestId = builder.requestId;
        this.simpleQuery = builder.simpleQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAdvancedQueryHistoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return querySql
     */
    public String getQuerySql() {
        return this.querySql;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return simpleQuery
     */
    public Boolean getSimpleQuery() {
        return this.simpleQuery;
    }

    public static final class Builder {
        private String queryId; 
        private String querySql; 
        private String requestId; 
        private Boolean simpleQuery; 

        private Builder() {
        } 

        private Builder(CreateAdvancedQueryHistoryResponseBody model) {
            this.queryId = model.queryId;
            this.querySql = model.querySql;
            this.requestId = model.requestId;
            this.simpleQuery = model.simpleQuery;
        } 

        /**
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * QuerySql.
         */
        public Builder querySql(String querySql) {
            this.querySql = querySql;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SimpleQuery.
         */
        public Builder simpleQuery(Boolean simpleQuery) {
            this.simpleQuery = simpleQuery;
            return this;
        }

        public CreateAdvancedQueryHistoryResponseBody build() {
            return new CreateAdvancedQueryHistoryResponseBody(this);
        } 

    } 

}
