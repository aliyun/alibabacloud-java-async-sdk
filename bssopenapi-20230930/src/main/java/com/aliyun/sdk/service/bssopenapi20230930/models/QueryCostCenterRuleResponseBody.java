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
 * {@link QueryCostCenterRuleResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCostCenterRuleResponseBody</p>
 */
public class QueryCostCenterRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CostCenterId")
    private Long costCenterId;

    @com.aliyun.core.annotation.NameInMap("FilterExpression")
    private FilterExpression filterExpression;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("IsDeleted")
    private Integer isDeleted;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
    private Long ownerAccountId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootCostCenterId")
    private Long rootCostCenterId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private QueryCostCenterRuleResponseBody(Builder builder) {
        this.costCenterId = builder.costCenterId;
        this.filterExpression = builder.filterExpression;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.isDeleted = builder.isDeleted;
        this.metadata = builder.metadata;
        this.ownerAccountId = builder.ownerAccountId;
        this.requestId = builder.requestId;
        this.rootCostCenterId = builder.rootCostCenterId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCostCenterRuleResponseBody create() {
        return builder().build();
    }

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
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return isDeleted
     */
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return ownerAccountId
     */
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootCostCenterId
     */
    public Long getRootCostCenterId() {
        return this.rootCostCenterId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long costCenterId; 
        private FilterExpression filterExpression; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private Integer isDeleted; 
        private Object metadata; 
        private Long ownerAccountId; 
        private String requestId; 
        private Long rootCostCenterId; 
        private String status; 

        private Builder() {
        } 

        private Builder(QueryCostCenterRuleResponseBody model) {
            this.costCenterId = model.costCenterId;
            this.filterExpression = model.filterExpression;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.isDeleted = model.isDeleted;
            this.metadata = model.metadata;
            this.ownerAccountId = model.ownerAccountId;
            this.requestId = model.requestId;
            this.rootCostCenterId = model.rootCostCenterId;
            this.status = model.status;
        } 

        /**
         * CostCenterId.
         */
        public Builder costCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }

        /**
         * FilterExpression.
         */
        public Builder filterExpression(FilterExpression filterExpression) {
            this.filterExpression = filterExpression;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * IsDeleted.
         */
        public Builder isDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * OwnerAccountId.
         */
        public Builder ownerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>UUID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RootCostCenterId.
         */
        public Builder rootCostCenterId(Long rootCostCenterId) {
            this.rootCostCenterId = rootCostCenterId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public QueryCostCenterRuleResponseBody build() {
            return new QueryCostCenterRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCostCenterRuleResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCostCenterRuleResponseBody</p>
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
     * {@link QueryCostCenterRuleResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCostCenterRuleResponseBody</p>
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
