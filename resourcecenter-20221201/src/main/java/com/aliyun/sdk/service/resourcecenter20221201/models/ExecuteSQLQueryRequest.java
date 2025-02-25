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
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    private ExecuteSQLQueryRequest(Builder builder) {
        super(builder);
        this.expression = builder.expression;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<ExecuteSQLQueryRequest, Builder> {
        private String expression; 
        private Integer maxResults; 
        private String nextToken; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteSQLQueryRequest request) {
            super(request);
            this.expression = request.expression;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.scope = request.scope;
        } 

        /**
         * <p>The SQL statement to be executed.</p>
         * <p>The number of characters in the SQL statement must be less than 2,000.</p>
         * <p>For more information about the SQL syntax, see <a href="https://help.aliyun.com/document_detail/2539395.html">Basic SQL syntax</a>.</p>
         * <p>This parameter is required.</p>
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The search scope.</p>
         * <p>Set this parameter to the ID of a resource group.</p>
         * <p>For information about how to obtain the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a>.</p>
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
