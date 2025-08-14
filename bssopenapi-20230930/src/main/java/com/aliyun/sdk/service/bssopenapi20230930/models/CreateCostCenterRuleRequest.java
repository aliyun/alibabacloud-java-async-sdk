// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link CreateCostCenterRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateCostCenterRuleRequest</p>
 */
public class CreateCostCenterRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CostCenterId")
    private Long costCenterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterExpression")
    private FilterExpression filterExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    private CreateCostCenterRuleRequest(Builder builder) {
        super(builder);
        this.costCenterId = builder.costCenterId;
        this.filterExpression = builder.filterExpression;
        this.nbid = builder.nbid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCostCenterRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return costCenterId
     */
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    /**
     * @return filterExpression
     */
    public FilterExpression getFilterExpression() {
        return this.filterExpression;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    public static final class Builder extends Request.Builder<CreateCostCenterRuleRequest, Builder> {
        private Long costCenterId; 
        private FilterExpression filterExpression; 
        private String nbid; 

        private Builder() {
            super();
        } 

        private Builder(CreateCostCenterRuleRequest request) {
            super(request);
            this.costCenterId = request.costCenterId;
            this.filterExpression = request.filterExpression;
            this.nbid = request.nbid;
        } 

        /**
         * CostCenterId.
         */
        public Builder costCenterId(Long costCenterId) {
            this.putBodyParameter("CostCenterId", costCenterId);
            this.costCenterId = costCenterId;
            return this;
        }

        /**
         * FilterExpression.
         */
        public Builder filterExpression(FilterExpression filterExpression) {
            String filterExpressionShrink = shrink(filterExpression, "FilterExpression", "json");
            this.putQueryParameter("FilterExpression", filterExpressionShrink);
            this.filterExpression = filterExpression;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        @Override
        public CreateCostCenterRuleRequest build() {
            return new CreateCostCenterRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCostCenterRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateCostCenterRuleRequest</p>
     */
    public static class FilterValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CodeName")
        private String codeName;

        @com.aliyun.core.annotation.NameInMap("SelectType")
        private String selectType;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private FilterValues(Builder builder) {
            this.code = builder.code;
            this.codeName = builder.codeName;
            this.selectType = builder.selectType;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterValues create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return codeName
         */
        public String getCodeName() {
            return this.codeName;
        }

        /**
         * @return selectType
         */
        public String getSelectType() {
            return this.selectType;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String code; 
            private String codeName; 
            private String selectType; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(FilterValues model) {
                this.code = model.code;
                this.codeName = model.codeName;
                this.selectType = model.selectType;
                this.values = model.values;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CodeName.
             */
            public Builder codeName(String codeName) {
                this.codeName = codeName;
                return this;
            }

            /**
             * SelectType.
             */
            public Builder selectType(String selectType) {
                this.selectType = selectType;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public FilterValues build() {
                return new FilterValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCostCenterRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateCostCenterRuleRequest</p>
     */
    public static class FilterExpression extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpressionType")
        private String expressionType;

        @com.aliyun.core.annotation.NameInMap("FilterValues")
        private FilterValues filterValues;

        @com.aliyun.core.annotation.NameInMap("Operand")
        private Object operand;

        @com.aliyun.core.annotation.NameInMap("Operands")
        private java.util.List<?> operands;

        @com.aliyun.core.annotation.NameInMap("OperatorType")
        private String operatorType;

        private FilterExpression(Builder builder) {
            this.expressionType = builder.expressionType;
            this.filterValues = builder.filterValues;
            this.operand = builder.operand;
            this.operands = builder.operands;
            this.operatorType = builder.operatorType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterExpression create() {
            return builder().build();
        }

        /**
         * @return expressionType
         */
        public String getExpressionType() {
            return this.expressionType;
        }

        /**
         * @return filterValues
         */
        public FilterValues getFilterValues() {
            return this.filterValues;
        }

        /**
         * @return operand
         */
        public Object getOperand() {
            return this.operand;
        }

        /**
         * @return operands
         */
        public java.util.List<?> getOperands() {
            return this.operands;
        }

        /**
         * @return operatorType
         */
        public String getOperatorType() {
            return this.operatorType;
        }

        public static final class Builder {
            private String expressionType; 
            private FilterValues filterValues; 
            private Object operand; 
            private java.util.List<?> operands; 
            private String operatorType; 

            private Builder() {
            } 

            private Builder(FilterExpression model) {
                this.expressionType = model.expressionType;
                this.filterValues = model.filterValues;
                this.operand = model.operand;
                this.operands = model.operands;
                this.operatorType = model.operatorType;
            } 

            /**
             * ExpressionType.
             */
            public Builder expressionType(String expressionType) {
                this.expressionType = expressionType;
                return this;
            }

            /**
             * FilterValues.
             */
            public Builder filterValues(FilterValues filterValues) {
                this.filterValues = filterValues;
                return this;
            }

            /**
             * Operand.
             */
            public Builder operand(Object operand) {
                this.operand = operand;
                return this;
            }

            /**
             * Operands.
             */
            public Builder operands(java.util.List<?> operands) {
                this.operands = operands;
                return this;
            }

            /**
             * OperatorType.
             */
            public Builder operatorType(String operatorType) {
                this.operatorType = operatorType;
                return this;
            }

            public FilterExpression build() {
                return new FilterExpression(this);
            } 

        } 

    }
}
