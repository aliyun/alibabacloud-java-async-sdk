// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link JudgeNodeMetaDesc} extends {@link TeaModel}
 *
 * <p>JudgeNodeMetaDesc</p>
 */
public class JudgeNodeMetaDesc extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActualValue")
    private String actualValue;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private Integer dataType;

    @com.aliyun.core.annotation.NameInMap("ExpressionMetaDesc")
    private ExpressionMetaDesc expressionMetaDesc;

    @com.aliyun.core.annotation.NameInMap("Field")
    private String field;

    @com.aliyun.core.annotation.NameInMap("FieldType")
    private Integer fieldType;

    @com.aliyun.core.annotation.NameInMap("Symbol")
    private Integer symbol;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private JudgeNodeMetaDesc(Builder builder) {
        this.actualValue = builder.actualValue;
        this.dataType = builder.dataType;
        this.expressionMetaDesc = builder.expressionMetaDesc;
        this.field = builder.field;
        this.fieldType = builder.fieldType;
        this.symbol = builder.symbol;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JudgeNodeMetaDesc create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actualValue
     */
    public String getActualValue() {
        return this.actualValue;
    }

    /**
     * @return dataType
     */
    public Integer getDataType() {
        return this.dataType;
    }

    /**
     * @return expressionMetaDesc
     */
    public ExpressionMetaDesc getExpressionMetaDesc() {
        return this.expressionMetaDesc;
    }

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return fieldType
     */
    public Integer getFieldType() {
        return this.fieldType;
    }

    /**
     * @return symbol
     */
    public Integer getSymbol() {
        return this.symbol;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String actualValue; 
        private Integer dataType; 
        private ExpressionMetaDesc expressionMetaDesc; 
        private String field; 
        private Integer fieldType; 
        private Integer symbol; 
        private String value; 

        private Builder() {
        } 

        private Builder(JudgeNodeMetaDesc model) {
            this.actualValue = model.actualValue;
            this.dataType = model.dataType;
            this.expressionMetaDesc = model.expressionMetaDesc;
            this.field = model.field;
            this.fieldType = model.fieldType;
            this.symbol = model.symbol;
            this.value = model.value;
        } 

        /**
         * <p>The actual value. <strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p><strong>[Deprecated]</strong></p>
         */
        public Builder actualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }

        /**
         * <p>The data type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong></p>
         */
        public Builder expressionMetaDesc(ExpressionMetaDesc expressionMetaDesc) {
            this.expressionMetaDesc = expressionMetaDesc;
            return this;
        }

        /**
         * <p>The system field.</p>
         * 
         * <strong>example:</strong>
         * <p>remark1</p>
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * <p>The field data source type. 1: System predefined field. 2: Parameter-passed quality inspection field.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder fieldType(Integer fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        /**
         * <p>The logical expression.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder symbol(Integer symbol) {
            this.symbol = symbol;
            return this;
        }

        /**
         * <p>The preset value. <strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p><strong>[Deprecated]</strong></p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public JudgeNodeMetaDesc build() {
            return new JudgeNodeMetaDesc(this);
        } 

    } 

    /**
     * 
     * {@link JudgeNodeMetaDesc} extends {@link TeaModel}
     *
     * <p>JudgeNodeMetaDesc</p>
     */
    public static class ExpressionMetaDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LeftFieldType")
        private Integer leftFieldType;

        @com.aliyun.core.annotation.NameInMap("LeftOperand")
        private String leftOperand;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("RightFieldType")
        private Integer rightFieldType;

        @com.aliyun.core.annotation.NameInMap("RightOperand")
        private String rightOperand;

        @com.aliyun.core.annotation.NameInMap("RoundingMode")
        private String roundingMode;

        private ExpressionMetaDesc(Builder builder) {
            this.leftFieldType = builder.leftFieldType;
            this.leftOperand = builder.leftOperand;
            this.operator = builder.operator;
            this.rightFieldType = builder.rightFieldType;
            this.rightOperand = builder.rightOperand;
            this.roundingMode = builder.roundingMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpressionMetaDesc create() {
            return builder().build();
        }

        /**
         * @return leftFieldType
         */
        public Integer getLeftFieldType() {
            return this.leftFieldType;
        }

        /**
         * @return leftOperand
         */
        public String getLeftOperand() {
            return this.leftOperand;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return rightFieldType
         */
        public Integer getRightFieldType() {
            return this.rightFieldType;
        }

        /**
         * @return rightOperand
         */
        public String getRightOperand() {
            return this.rightOperand;
        }

        /**
         * @return roundingMode
         */
        public String getRoundingMode() {
            return this.roundingMode;
        }

        public static final class Builder {
            private Integer leftFieldType; 
            private String leftOperand; 
            private String operator; 
            private Integer rightFieldType; 
            private String rightOperand; 
            private String roundingMode; 

            private Builder() {
            } 

            private Builder(ExpressionMetaDesc model) {
                this.leftFieldType = model.leftFieldType;
                this.leftOperand = model.leftOperand;
                this.operator = model.operator;
                this.rightFieldType = model.rightFieldType;
                this.rightOperand = model.rightOperand;
                this.roundingMode = model.roundingMode;
            } 

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p><strong>[Deprecated]</strong></p>
             */
            public Builder leftFieldType(Integer leftFieldType) {
                this.leftFieldType = leftFieldType;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p><strong>[Deprecated]</strong></p>
             */
            public Builder leftOperand(String leftOperand) {
                this.leftOperand = leftOperand;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p><strong>[Deprecated]</strong></p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p><strong>[Deprecated]</strong></p>
             */
            public Builder rightFieldType(Integer rightFieldType) {
                this.rightFieldType = rightFieldType;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p><strong>[Deprecated]</strong></p>
             */
            public Builder rightOperand(String rightOperand) {
                this.rightOperand = rightOperand;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p><strong>[Deprecated]</strong></p>
             */
            public Builder roundingMode(String roundingMode) {
                this.roundingMode = roundingMode;
                return this;
            }

            public ExpressionMetaDesc build() {
                return new ExpressionMetaDesc(this);
            } 

        } 

    }
}
