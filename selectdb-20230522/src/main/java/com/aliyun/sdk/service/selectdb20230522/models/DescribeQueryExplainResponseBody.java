// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link DescribeQueryExplainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQueryExplainResponseBody</p>
 */
public class DescribeQueryExplainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExplainResult")
    private String explainResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sql")
    private String sql;

    private DescribeQueryExplainResponseBody(Builder builder) {
        this.explainResult = builder.explainResult;
        this.requestId = builder.requestId;
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQueryExplainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return explainResult
     */
    public String getExplainResult() {
        return this.explainResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder {
        private String explainResult; 
        private String requestId; 
        private String sql; 

        private Builder() {
        } 

        private Builder(DescribeQueryExplainResponseBody model) {
            this.explainResult = model.explainResult;
            this.requestId = model.requestId;
            this.sql = model.sql;
        } 

        /**
         * ExplainResult.
         */
        public Builder explainResult(String explainResult) {
            this.explainResult = explainResult;
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
         * Sql.
         */
        public Builder sql(String sql) {
            this.sql = sql;
            return this;
        }

        public DescribeQueryExplainResponseBody build() {
            return new DescribeQueryExplainResponseBody(this);
        } 

    } 

}
