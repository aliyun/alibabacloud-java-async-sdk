// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQueryVariableDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQueryVariableDetailResponseBody</p>
 */
public class DescribeQueryVariableDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeQueryVariableDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQueryVariableDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeQueryVariableDetailResponseBody build() {
            return new DescribeQueryVariableDetailResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataSourceCode")
        private Long dataSourceCode;

        @com.aliyun.core.annotation.NameInMap("dataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("expressionVariable")
        private String expressionVariable;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private ResultObject(Builder builder) {
            this.dataSourceCode = builder.dataSourceCode;
            this.dataSourceName = builder.dataSourceName;
            this.description = builder.description;
            this.eventCode = builder.eventCode;
            this.expression = builder.expression;
            this.expressionTitle = builder.expressionTitle;
            this.expressionVariable = builder.expressionVariable;
            this.id = builder.id;
            this.outlier = builder.outlier;
            this.outputs = builder.outputs;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return dataSourceCode
         */
        public Long getDataSourceCode() {
            return this.dataSourceCode;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
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
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long dataSourceCode; 
            private String dataSourceName; 
            private String description; 
            private String eventCode; 
            private String expression; 
            private String expressionTitle; 
            private String expressionVariable; 
            private Long id; 
            private String outlier; 
            private String outputs; 
            private String title; 

            /**
             * dataSourceCode.
             */
            public Builder dataSourceCode(Long dataSourceCode) {
                this.dataSourceCode = dataSourceCode;
                return this;
            }

            /**
             * dataSourceName.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * eventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * expressionVariable.
             */
            public Builder expressionVariable(String expressionVariable) {
                this.expressionVariable = expressionVariable;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputs.
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
