// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link BatchGetExpressionFieldsRequest} extends {@link RequestModel}
 *
 * <p>BatchGetExpressionFieldsRequest</p>
 */
public class BatchGetExpressionFieldsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Expressions")
    private java.util.List<Expressions> expressions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private BatchGetExpressionFieldsRequest(Builder builder) {
        super(builder);
        this.expressions = builder.expressions;
        this.phase = builder.phase;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetExpressionFieldsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expressions
     */
    public java.util.List<Expressions> getExpressions() {
        return this.expressions;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<BatchGetExpressionFieldsRequest, Builder> {
        private java.util.List<Expressions> expressions; 
        private String phase; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetExpressionFieldsRequest request) {
            super(request);
            this.expressions = request.expressions;
            this.phase = request.phase;
            this.siteId = request.siteId;
        } 

        /**
         * <p>List of expressions.</p>
         * 
         * <strong>example:</strong>
         * <p>http_bot</p>
         */
        public Builder expressions(java.util.List<Expressions> expressions) {
            String expressionsShrink = shrink(expressions, "Expressions", "json");
            this.putBodyParameter("Expressions", expressionsShrink);
            this.expressions = expressions;
            return this;
        }

        /**
         * <p>WAF Phase</p>
         * 
         * <strong>example:</strong>
         * <p>http_bot</p>
         */
        public Builder phase(String phase) {
            this.putBodyParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * <p>Site ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public BatchGetExpressionFieldsRequest build() {
            return new BatchGetExpressionFieldsRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetExpressionFieldsRequest} extends {@link TeaModel}
     *
     * <p>BatchGetExpressionFieldsRequest</p>
     */
    public static class Expressions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private Expressions(Builder builder) {
            this.expression = builder.expression;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Expressions create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String expression; 
            private Long id; 

            private Builder() {
            } 

            private Builder(Expressions model) {
                this.expression = model.expression;
                this.id = model.id;
            } 

            /**
             * <p>Content of the expression.</p>
             * 
             * <strong>example:</strong>
             * <p>ip.src eq 1.1.1.1</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The sequence number of the expression.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public Expressions build() {
                return new Expressions(this);
            } 

        } 

    }
}
