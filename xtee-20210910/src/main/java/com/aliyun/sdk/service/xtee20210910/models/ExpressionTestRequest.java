// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExpressionTestRequest} extends {@link RequestModel}
 *
 * <p>ExpressionTestRequest</p>
 */
public class ExpressionTestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expressionVariable")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expressionVariable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expressionVariableIds")
    private String expressionVariableIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scene;

    private ExpressionTestRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.expression = builder.expression;
        this.expressionVariable = builder.expressionVariable;
        this.expressionVariableIds = builder.expressionVariableIds;
        this.id = builder.id;
        this.regId = builder.regId;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpressionTestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return expressionVariable
     */
    public String getExpressionVariable() {
        return this.expressionVariable;
    }

    /**
     * @return expressionVariableIds
     */
    public String getExpressionVariableIds() {
        return this.expressionVariableIds;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<ExpressionTestRequest, Builder> {
        private String lang; 
        private String expression; 
        private String expressionVariable; 
        private String expressionVariableIds; 
        private Long id; 
        private String regId; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(ExpressionTestRequest request) {
            super(request);
            this.lang = request.lang;
            this.expression = request.expression;
            this.expressionVariable = request.expressionVariable;
            this.expressionVariableIds = request.expressionVariableIds;
            this.id = request.id;
            this.regId = request.regId;
            this.scene = request.scene;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * expression.
         */
        public Builder expression(String expression) {
            this.putQueryParameter("expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * expressionVariable.
         */
        public Builder expressionVariable(String expressionVariable) {
            this.putQueryParameter("expressionVariable", expressionVariable);
            this.expressionVariable = expressionVariable;
            return this;
        }

        /**
         * expressionVariableIds.
         */
        public Builder expressionVariableIds(String expressionVariableIds) {
            this.putQueryParameter("expressionVariableIds", expressionVariableIds);
            this.expressionVariableIds = expressionVariableIds;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public ExpressionTestRequest build() {
            return new ExpressionTestRequest(this);
        } 

    } 

}
