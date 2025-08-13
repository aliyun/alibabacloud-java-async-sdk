// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeQueryVariableDetailResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeQueryVariableDetailResponseBody build() {
            return new DescribeQueryVariableDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeQueryVariableDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQueryVariableDetailResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.dataSourceCode = model.dataSourceCode;
                this.dataSourceName = model.dataSourceName;
                this.description = model.description;
                this.eventCode = model.eventCode;
                this.expression = model.expression;
                this.expressionTitle = model.expressionTitle;
                this.expressionVariable = model.expressionVariable;
                this.id = model.id;
                this.outlier = model.outlier;
                this.outputs = model.outputs;
                this.title = model.title;
            } 

            /**
             * <p>Data source code.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_vcaoii1697</p>
             */
            public Builder dataSourceCode(Long dataSourceCode) {
                this.dataSourceCode = dataSourceCode;
                return this;
            }

            /**
             * <p>Data source name</p>
             * 
             * <strong>example:</strong>
             * <p>名称数据源</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>Description.</p>
             * 
             * <strong>example:</strong>
             * <p>变量描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Event code</p>
             * 
             * <strong>example:</strong>
             * <p>de_aszbjb7236</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>Expression.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT  AVG( $source )\nFROM ds_vcaoii1697 \nWHERE  $age &gt; 0</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>Expression title.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT  AVG( $source )\nFROM testCase\nWHERE  $age &gt; 0</p>
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * <p>Expression variable.</p>
             * 
             * <strong>example:</strong>
             * <p>[96426]</p>
             */
            public Builder expressionVariable(String expressionVariable) {
                this.expressionVariable = expressionVariable;
                return this;
            }

            /**
             * <p>Variable ID</p>
             * 
             * <strong>example:</strong>
             * <p>355</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Outlier</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * <p>Output results.</p>
             * 
             * <strong>example:</strong>
             * <p>DOUBLE</p>
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>Title.</p>
             * 
             * <strong>example:</strong>
             * <p>自定义查询变量标题</p>
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
