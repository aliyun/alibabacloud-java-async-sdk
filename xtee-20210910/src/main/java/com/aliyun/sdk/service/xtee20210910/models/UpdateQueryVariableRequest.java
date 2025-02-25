// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQueryVariableRequest} extends {@link RequestModel}
 *
 * <p>UpdateQueryVariableRequest</p>
 */
public class UpdateQueryVariableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceCode;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String expressionVariable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

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

    private UpdateQueryVariableRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.dataSourceCode = builder.dataSourceCode;
        this.description = builder.description;
        this.eventCode = builder.eventCode;
        this.expression = builder.expression;
        this.expressionTitle = builder.expressionTitle;
        this.expressionVariable = builder.expressionVariable;
        this.id = builder.id;
        this.outlier = builder.outlier;
        this.outputs = builder.outputs;
        this.regId = builder.regId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQueryVariableRequest create() {
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
     * @return dataSourceCode
     */
    public String getDataSourceCode() {
        return this.dataSourceCode;
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
     * @return id
     */
    public Long getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<UpdateQueryVariableRequest, Builder> {
        private String lang; 
        private String dataSourceCode; 
        private String description; 
        private String eventCode; 
        private String expression; 
        private String expressionTitle; 
        private String expressionVariable; 
        private Long id; 
        private String outlier; 
        private String outputs; 
        private String regId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQueryVariableRequest request) {
            super(request);
            this.lang = request.lang;
            this.dataSourceCode = request.dataSourceCode;
            this.description = request.description;
            this.eventCode = request.eventCode;
            this.expression = request.expression;
            this.expressionTitle = request.expressionTitle;
            this.expressionVariable = request.expressionVariable;
            this.id = request.id;
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
         * dataSourceCode.
         */
        public Builder dataSourceCode(String dataSourceCode) {
            this.putQueryParameter("dataSourceCode", dataSourceCode);
            this.dataSourceCode = dataSourceCode;
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
         * id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
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
        public UpdateQueryVariableRequest build() {
            return new UpdateQueryVariableRequest(this);
        } 

    } 

}
