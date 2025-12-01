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
 * {@link DescribeExpressionVariableVersionDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressionVariableVersionDetailResponseBody</p>
 */
public class DescribeExpressionVariableVersionDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeExpressionVariableVersionDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressionVariableVersionDetailResponseBody create() {
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

        private Builder(DescribeExpressionVariableVersionDetailResponseBody model) {
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
         * <p>Returned object.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeExpressionVariableVersionDetailResponseBody build() {
            return new DescribeExpressionVariableVersionDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExpressionVariableVersionDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpressionVariableVersionDetailResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createType")
        private String createType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("expressionVariable")
        private String expressionVariable;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("invokeKey")
        private String invokeKey;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("refObjId")
        private String refObjId;

        @com.aliyun.core.annotation.NameInMap("refObjType")
        private String refObjType;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        private ResultObject(Builder builder) {
            this.createType = builder.createType;
            this.description = builder.description;
            this.expression = builder.expression;
            this.expressionTitle = builder.expressionTitle;
            this.expressionVariable = builder.expressionVariable;
            this.fieldRank = builder.fieldRank;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.invokeKey = builder.invokeKey;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputs = builder.outputs;
            this.refObjId = builder.refObjId;
            this.refObjType = builder.refObjType;
            this.region = builder.region;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.title = builder.title;
            this.type = builder.type;
            this.userId = builder.userId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return createType
         */
        public String getCreateType() {
            return this.createType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return invokeKey
         */
        public String getInvokeKey() {
            return this.invokeKey;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return refObjId
         */
        public String getRefObjId() {
            return this.refObjId;
        }

        /**
         * @return refObjType
         */
        public String getRefObjType() {
            return this.refObjType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createType; 
            private String description; 
            private String expression; 
            private String expressionTitle; 
            private String expressionVariable; 
            private Integer fieldRank; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String invokeKey; 
            private String name; 
            private String outlier; 
            private String outputs; 
            private String refObjId; 
            private String refObjType; 
            private String region; 
            private String sourceType; 
            private String status; 
            private String title; 
            private String type; 
            private Long userId; 
            private Long version; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.createType = model.createType;
                this.description = model.description;
                this.expression = model.expression;
                this.expressionTitle = model.expressionTitle;
                this.expressionVariable = model.expressionVariable;
                this.fieldRank = model.fieldRank;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.invokeKey = model.invokeKey;
                this.name = model.name;
                this.outlier = model.outlier;
                this.outputs = model.outputs;
                this.refObjId = model.refObjId;
                this.refObjType = model.refObjType;
                this.region = model.region;
                this.sourceType = model.sourceType;
                this.status = model.status;
                this.title = model.title;
                this.type = model.type;
                this.userId = model.userId;
                this.version = model.version;
            } 

            /**
             * <p>Creation type.</p>
             * 
             * <strong>example:</strong>
             * <p>MORMAL</p>
             */
            public Builder createType(String createType) {
                this.createType = createType;
                return this;
            }

            /**
             * <p>Description information.</p>
             * 
             * <strong>example:</strong>
             * <p>变量描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Expression.</p>
             * 
             * <strong>example:</strong>
             * <p>@ex_GX9rrlTq4b67 + 1001</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>Expression title.</p>
             * 
             * <strong>example:</strong>
             * <p>@selfvariable_02 + 1001</p>
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * <p>Expression variable.</p>
             * 
             * <strong>example:</strong>
             * <p>ex_GX9rrlTq4b67</p>
             */
            public Builder expressionVariable(String expressionVariable) {
                this.expressionVariable = expressionVariable;
                return this;
            }

            /**
             * <p>Field ranking.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1762409015000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1762409026000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Custom variable primary key.</p>
             * 
             * <strong>example:</strong>
             * <p>397625</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Invoke key.</p>
             * 
             * <strong>example:</strong>
             * <p>deInvokeSelfVariable_v1</p>
             */
            public Builder invokeKey(String invokeKey) {
                this.invokeKey = invokeKey;
                return this;
            }

            /**
             * <p>Variable name, a uniquely generated identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>ex_0kWIfZ27c525</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Outlier.</p>
             * 
             * <strong>example:</strong>
             * <p>SYS_ERROR</p>
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * <p>Variable return type.</p>
             * 
             * <strong>example:</strong>
             * <p>EXPRESSION</p>
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>Variable associated event.</p>
             * 
             * <strong>example:</strong>
             * <p>de_awkhwh0314</p>
             */
            public Builder refObjId(String refObjId) {
                this.refObjId = refObjId;
                return this;
            }

            /**
             * <p>Variable association type.</p>
             * 
             * <strong>example:</strong>
             * <p>EVENT_BY_EXPRESSION</p>
             */
            public Builder refObjType(String refObjType) {
                this.refObjType = refObjType;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Source type.</p>
             * 
             * <strong>example:</strong>
             * <p>SAF</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>Status.</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Variable title.</p>
             * 
             * <strong>example:</strong>
             * <p>年龄</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Variable type.</p>
             * 
             * <strong>example:</strong>
             * <p>EXPRESSION</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>User UID.</p>
             * 
             * <strong>example:</strong>
             * <p>151222xxxxxxxxxx</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Variable version.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
