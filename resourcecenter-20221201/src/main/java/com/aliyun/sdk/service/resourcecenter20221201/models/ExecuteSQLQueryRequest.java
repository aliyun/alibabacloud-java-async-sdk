// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteSQLQueryRequest} extends {@link RequestModel}
 *
 * <p>ExecuteSQLQueryRequest</p>
 */
public class ExecuteSQLQueryRequest extends Request {
    @Query
    @NameInMap("Expression")
    @Validation(required = true)
    private String expression;

    @Query
    @NameInMap("Scope")
    private String scope;

    private ExecuteSQLQueryRequest(Builder builder) {
        super(builder);
        this.expression = builder.expression;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteSQLQueryRequest create() {
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

    public static final class Builder extends Request.Builder<ExecuteSQLQueryRequest, Builder> {
        private String expression; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteSQLQueryRequest request) {
            super(request);
            this.expression = request.expression;
            this.scope = request.scope;
        } 

        /**
         * The SQL statement to be executed.
         * <p>
         * 
         * The number of characters in the SQL statement must be less than 2,000.
         * 
         * For more information about the SQL syntax, see [Basic SQL syntax](~~2539395~~).
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * The search scope.
         * <p>
         * 
         * Set this parameter to the ID of a resource group.
         * 
         * For information about how to obtain the ID of a resource group, see [ListResourceGroups](~~158855~~).
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public ExecuteSQLQueryRequest build() {
            return new ExecuteSQLQueryRequest(this);
        } 

    } 

}
