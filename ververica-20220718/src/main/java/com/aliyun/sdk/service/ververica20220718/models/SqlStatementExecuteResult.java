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
 * {@link SqlStatementExecuteResult} extends {@link TeaModel}
 *
 * <p>SqlStatementExecuteResult</p>
 */
public class SqlStatementExecuteResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorDetails")
    private ErrorDetails errorDetails;

    @com.aliyun.core.annotation.NameInMap("executeSuccess")
    private Boolean executeSuccess;

    @com.aliyun.core.annotation.NameInMap("statement")
    private String statement;

    private SqlStatementExecuteResult(Builder builder) {
        this.errorDetails = builder.errorDetails;
        this.executeSuccess = builder.executeSuccess;
        this.statement = builder.statement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SqlStatementExecuteResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorDetails
     */
    public ErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * @return executeSuccess
     */
    public Boolean getExecuteSuccess() {
        return this.executeSuccess;
    }

    /**
     * @return statement
     */
    public String getStatement() {
        return this.statement;
    }

    public static final class Builder {
        private ErrorDetails errorDetails; 
        private Boolean executeSuccess; 
        private String statement; 

        private Builder() {
        } 

        private Builder(SqlStatementExecuteResult model) {
            this.errorDetails = model.errorDetails;
            this.executeSuccess = model.executeSuccess;
            this.statement = model.statement;
        } 

        /**
         * errorDetails.
         */
        public Builder errorDetails(ErrorDetails errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }

        /**
         * executeSuccess.
         */
        public Builder executeSuccess(Boolean executeSuccess) {
            this.executeSuccess = executeSuccess;
            return this;
        }

        /**
         * statement.
         */
        public Builder statement(String statement) {
            this.statement = statement;
            return this;
        }

        public SqlStatementExecuteResult build() {
            return new SqlStatementExecuteResult(this);
        } 

    } 

}
