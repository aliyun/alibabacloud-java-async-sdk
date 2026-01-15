// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link TestProcessExpressionRequest} extends {@link RequestModel}
 *
 * <p>TestProcessExpressionRequest</p>
 */
public class TestProcessExpressionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expression")
    private String expression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    private TestProcessExpressionRequest(Builder builder) {
        super(builder);
        this.expression = builder.expression;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestProcessExpressionRequest create() {
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
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<TestProcessExpressionRequest, Builder> {
        private String expression; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(TestProcessExpressionRequest request) {
            super(request);
            this.expression = request.expression;
            this.params = request.params;
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
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        @Override
        public TestProcessExpressionRequest build() {
            return new TestProcessExpressionRequest(this);
        } 

    } 

}
