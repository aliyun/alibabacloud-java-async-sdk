// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExecuteSQLQueryRequest} extends {@link RequestModel}
 *
 * <p>ExecuteSQLQueryRequest</p>
 */
public class ExecuteSQLQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
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
         * <p>The SQL statement to be executed.</p>
         * <p>The number of characters in the SQL statement must be less than 2,000.</p>
         * <p>For more information about the SQL syntax, see <a href="~~2539395~~">Basic SQL syntax</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM resources LIMIT 100;</p>
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * <p>The search scope.</p>
         * <p>Set this parameter to the ID of a resource group.</p>
         * <p>For information about how to obtain the ID of a resource group, see <a href="~~158855~~">ListResourceGroups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
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
