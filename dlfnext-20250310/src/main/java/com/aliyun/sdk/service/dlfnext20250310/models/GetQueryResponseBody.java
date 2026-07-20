// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link GetQueryResponseBody} extends {@link TeaModel}
 *
 * <p>GetQueryResponseBody</p>
 */
public class GetQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("completedAt")
    private Long completedAt;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("queryId")
    private String queryId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<StatementResult> results;

    @com.aliyun.core.annotation.NameInMap("sql")
    private String sql;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("tier")
    private String tier;

    private GetQueryResponseBody(Builder builder) {
        this.completedAt = builder.completedAt;
        this.createdAt = builder.createdAt;
        this.queryId = builder.queryId;
        this.results = builder.results;
        this.sql = builder.sql;
        this.status = builder.status;
        this.tier = builder.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return completedAt
     */
    public Long getCompletedAt() {
        return this.completedAt;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return results
     */
    public java.util.List<StatementResult> getResults() {
        return this.results;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tier
     */
    public String getTier() {
        return this.tier;
    }

    public static final class Builder {
        private Long completedAt; 
        private Long createdAt; 
        private String queryId; 
        private java.util.List<StatementResult> results; 
        private String sql; 
        private String status; 
        private String tier; 

        private Builder() {
        } 

        private Builder(GetQueryResponseBody model) {
            this.completedAt = model.completedAt;
            this.createdAt = model.createdAt;
            this.queryId = model.queryId;
            this.results = model.results;
            this.sql = model.sql;
            this.status = model.status;
            this.tier = model.tier;
        } 

        /**
         * completedAt.
         */
        public Builder completedAt(Long completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * queryId.
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * results.
         */
        public Builder results(java.util.List<StatementResult> results) {
            this.results = results;
            return this;
        }

        /**
         * sql.
         */
        public Builder sql(String sql) {
            this.sql = sql;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * tier.
         */
        public Builder tier(String tier) {
            this.tier = tier;
            return this;
        }

        public GetQueryResponseBody build() {
            return new GetQueryResponseBody(this);
        } 

    } 

}
