// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TransformMatchToExpressionResponseBody} extends {@link TeaModel}
 *
 * <p>TransformMatchToExpressionResponseBody</p>
 */
public class TransformMatchToExpressionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Expression")
    private String expression;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TransformMatchToExpressionResponseBody(Builder builder) {
        this.expression = builder.expression;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformMatchToExpressionResponseBody create() {
        return builder().build();
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String expression; 
        private String requestId; 

        /**
         * Expression.
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TransformMatchToExpressionResponseBody build() {
            return new TransformMatchToExpressionResponseBody(this);
        } 

    } 

}
