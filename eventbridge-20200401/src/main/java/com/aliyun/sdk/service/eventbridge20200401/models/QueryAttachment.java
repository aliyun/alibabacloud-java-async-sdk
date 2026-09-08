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
 * {@link QueryAttachment} extends {@link TeaModel}
 *
 * <p>QueryAttachment</p>
 */
public class QueryAttachment extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("QueryId")
    private String queryId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private ExecutionResult result;

    private QueryAttachment(Builder builder) {
        this.query = builder.query;
        this.queryId = builder.queryId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAttachment create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return result
     */
    public ExecutionResult getResult() {
        return this.result;
    }

    public static final class Builder {
        private String query; 
        private String queryId; 
        private ExecutionResult result; 

        private Builder() {
        } 

        private Builder(QueryAttachment model) {
            this.query = model.query;
            this.queryId = model.queryId;
            this.result = model.result;
        } 

        /**
         * <p>The query statement.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;SELECT city, COUNT(*) AS cnt FROM events GROUP BY city&quot;</p>
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * <p>The stable identifier for the actual SQL tool execution, used for result tracking and interpretation.</p>
         * 
         * <strong>example:</strong>
         * <p>sqlx-0-a1b2c3d4</p>
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * <p>The query execution result.</p>
         */
        public Builder result(ExecutionResult result) {
            this.result = result;
            return this;
        }

        public QueryAttachment build() {
            return new QueryAttachment(this);
        } 

    } 

}
