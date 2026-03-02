// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link SqlExecutionFetchResult} extends {@link TeaModel}
 *
 * <p>SqlExecutionFetchResult</p>
 */
public class SqlExecutionFetchResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dqlResult")
    private DqlResult dqlResult;

    @com.aliyun.core.annotation.NameInMap("sqlExecution")
    private SqlExecution sqlExecution;

    private SqlExecutionFetchResult(Builder builder) {
        this.dqlResult = builder.dqlResult;
        this.sqlExecution = builder.sqlExecution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SqlExecutionFetchResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dqlResult
     */
    public DqlResult getDqlResult() {
        return this.dqlResult;
    }

    /**
     * @return sqlExecution
     */
    public SqlExecution getSqlExecution() {
        return this.sqlExecution;
    }

    public static final class Builder {
        private DqlResult dqlResult; 
        private SqlExecution sqlExecution; 

        private Builder() {
        } 

        private Builder(SqlExecutionFetchResult model) {
            this.dqlResult = model.dqlResult;
            this.sqlExecution = model.sqlExecution;
        } 

        /**
         * dqlResult.
         */
        public Builder dqlResult(DqlResult dqlResult) {
            this.dqlResult = dqlResult;
            return this;
        }

        /**
         * sqlExecution.
         */
        public Builder sqlExecution(SqlExecution sqlExecution) {
            this.sqlExecution = sqlExecution;
            return this;
        }

        public SqlExecutionFetchResult build() {
            return new SqlExecutionFetchResult(this);
        } 

    } 

}
