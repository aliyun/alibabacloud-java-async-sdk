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
 * {@link ParseExpressionParametersRequest} extends {@link RequestModel}
 *
 * <p>ParseExpressionParametersRequest</p>
 */
public class ParseExpressionParametersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expression")
    private String expression;

    private ParseExpressionParametersRequest(Builder builder) {
        super(builder);
        this.expression = builder.expression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ParseExpressionParametersRequest create() {
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

    public static final class Builder extends Request.Builder<ParseExpressionParametersRequest, Builder> {
        private String expression; 

        private Builder() {
            super();
        } 

        private Builder(ParseExpressionParametersRequest request) {
            super(request);
            this.expression = request.expression;
        } 

        /**
         * Expression.
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        @Override
        public ParseExpressionParametersRequest build() {
            return new ParseExpressionParametersRequest(this);
        } 

    } 

}
