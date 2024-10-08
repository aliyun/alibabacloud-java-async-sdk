// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TransformExpressionToMatchRequest} extends {@link RequestModel}
 *
 * <p>TransformExpressionToMatchRequest</p>
 */
public class TransformExpressionToMatchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Expression")
    private String expression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private TransformExpressionToMatchRequest(Builder builder) {
        super(builder);
        this.expression = builder.expression;
        this.phase = builder.phase;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformExpressionToMatchRequest create() {
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

    public static final class Builder extends Request.Builder<TransformExpressionToMatchRequest, Builder> {
        private String expression; 
        private String phase; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(TransformExpressionToMatchRequest request) {
            super(request);
            this.expression = request.expression;
            this.phase = request.phase;
            this.siteId = request.siteId;
        } 

        /**
         * Expression.
         */
        public Builder expression(String expression) {
            this.putBodyParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * Phase.
         */
        public Builder phase(String phase) {
            this.putBodyParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public TransformExpressionToMatchRequest build() {
            return new TransformExpressionToMatchRequest(this);
        } 

    } 

}
