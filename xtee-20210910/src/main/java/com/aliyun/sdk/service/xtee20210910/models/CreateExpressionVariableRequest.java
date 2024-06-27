// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExpressionVariableRequest} extends {@link RequestModel}
 *
 * <p>CreateExpressionVariableRequest</p>
 */
public class CreateExpressionVariableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expressionTitle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expressionTitle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expressionVariable")
    private String expressionVariable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("outlier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outlier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("outputs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private CreateExpressionVariableRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.description = builder.description;
        this.eventCode = builder.eventCode;
        this.expression = builder.expression;
        this.expressionTitle = builder.expressionTitle;
        this.expressionVariable = builder.expressionVariable;
        this.outlier = builder.outlier;
        this.outputs = builder.outputs;
        this.regId = builder.regId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExpressionVariableRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return expressionTitle
     */
    public String getExpressionTitle() {
        return this.expressionTitle;
    }

    /**
     * @return expressionVariable
     */
    public String getExpressionVariable() {
        return this.expressionVariable;
    }

    /**
     * @return outlier
     */
    public String getOutlier() {
        return this.outlier;
    }

    /**
     * @return outputs
     */
    public String getOutputs() {
        return this.outputs;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateExpressionVariableRequest, Builder> {
        private String lang; 
        private String description; 
        private String eventCode; 
        private String expression; 
        private String expressionTitle; 
        private String expressionVariable; 
        private String outlier; 
        private String outputs; 
        private String regId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateExpressionVariableRequest request) {
            super(request);
            this.lang = request.lang;
            this.description = request.description;
            this.eventCode = request.eventCode;
            this.expression = request.expression;
            this.expressionTitle = request.expressionTitle;
            this.expressionVariable = request.expressionVariable;
            this.outlier = request.outlier;
            this.outputs = request.outputs;
            this.regId = request.regId;
            this.title = request.title;
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
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
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
         * expressionTitle.
         */
        public Builder expressionTitle(String expressionTitle) {
            this.putQueryParameter("expressionTitle", expressionTitle);
            this.expressionTitle = expressionTitle;
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
         * outlier.
         */
        public Builder outlier(String outlier) {
            this.putQueryParameter("outlier", outlier);
            this.outlier = outlier;
            return this;
        }

        /**
         * outputs.
         */
        public Builder outputs(String outputs) {
            this.putQueryParameter("outputs", outputs);
            this.outputs = outputs;
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
         * title.
         */
        public Builder title(String title) {
            this.putQueryParameter("title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateExpressionVariableRequest build() {
            return new CreateExpressionVariableRequest(this);
        } 

    } 

}
