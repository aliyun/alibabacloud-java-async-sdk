// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteMultiAccountSQLQueryRequest} extends {@link RequestModel}
 *
 * <p>ExecuteMultiAccountSQLQueryRequest</p>
 */
public class ExecuteMultiAccountSQLQueryRequest extends Request {
    @Query
    @NameInMap("Expression")
    @Validation(required = true)
    private String expression;

    @Query
    @NameInMap("Scope")
    @Validation(required = true)
    private String scope;

    private ExecuteMultiAccountSQLQueryRequest(Builder builder) {
        super(builder);
        this.expression = builder.expression;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteMultiAccountSQLQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<ExecuteMultiAccountSQLQueryRequest, Builder> {
        private String expression; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteMultiAccountSQLQueryRequest request) {
            super(request);
            this.expression = request.expression;
            this.scope = request.scope;
        } 

        /**
         * Expression.
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public ExecuteMultiAccountSQLQueryRequest build() {
            return new ExecuteMultiAccountSQLQueryRequest(this);
        } 

    } 

}
