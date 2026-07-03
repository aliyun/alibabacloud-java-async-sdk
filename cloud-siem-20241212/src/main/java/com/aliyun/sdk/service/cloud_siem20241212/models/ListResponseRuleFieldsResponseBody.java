// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListResponseRuleFieldsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResponseRuleFieldsResponseBody</p>
 */
public class ListResponseRuleFieldsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListResponseRuleFields")
    private java.util.List<ListResponseRuleFields> listResponseRuleFields;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListResponseRuleFieldsResponseBody(Builder builder) {
        this.listResponseRuleFields = builder.listResponseRuleFields;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResponseRuleFieldsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listResponseRuleFields
     */
    public java.util.List<ListResponseRuleFields> getListResponseRuleFields() {
        return this.listResponseRuleFields;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ListResponseRuleFields> listResponseRuleFields; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListResponseRuleFieldsResponseBody model) {
            this.listResponseRuleFields = model.listResponseRuleFields;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * ListResponseRuleFields.
         */
        public Builder listResponseRuleFields(java.util.List<ListResponseRuleFields> listResponseRuleFields) {
            this.listResponseRuleFields = listResponseRuleFields;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListResponseRuleFieldsResponseBody build() {
            return new ListResponseRuleFieldsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResponseRuleFieldsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResponseRuleFieldsResponseBody</p>
     */
    public static class RightValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueName")
        private String valueName;

        private RightValue(Builder builder) {
            this.value = builder.value;
            this.valueName = builder.valueName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RightValue create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueName
         */
        public String getValueName() {
            return this.valueName;
        }

        public static final class Builder {
            private String value; 
            private String valueName; 

            private Builder() {
            } 

            private Builder(RightValue model) {
                this.value = model.value;
                this.valueName = model.valueName;
            } 

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ValueName.
             */
            public Builder valueName(String valueName) {
                this.valueName = valueName;
                return this;
            }

            public RightValue build() {
                return new RightValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResponseRuleFieldsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResponseRuleFieldsResponseBody</p>
     */
    public static class SupportOperators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasRightValue")
        private String hasRightValue;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("SupportDataType")
        private String supportDataType;

        private SupportOperators(Builder builder) {
            this.hasRightValue = builder.hasRightValue;
            this.index = builder.index;
            this.operator = builder.operator;
            this.operatorName = builder.operatorName;
            this.supportDataType = builder.supportDataType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportOperators create() {
            return builder().build();
        }

        /**
         * @return hasRightValue
         */
        public String getHasRightValue() {
            return this.hasRightValue;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return supportDataType
         */
        public String getSupportDataType() {
            return this.supportDataType;
        }

        public static final class Builder {
            private String hasRightValue; 
            private Integer index; 
            private String operator; 
            private String operatorName; 
            private String supportDataType; 

            private Builder() {
            } 

            private Builder(SupportOperators model) {
                this.hasRightValue = model.hasRightValue;
                this.index = model.index;
                this.operator = model.operator;
                this.operatorName = model.operatorName;
                this.supportDataType = model.supportDataType;
            } 

            /**
             * HasRightValue.
             */
            public Builder hasRightValue(String hasRightValue) {
                this.hasRightValue = hasRightValue;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * SupportDataType.
             */
            public Builder supportDataType(String supportDataType) {
                this.supportDataType = supportDataType;
                return this;
            }

            public SupportOperators build() {
                return new SupportOperators(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResponseRuleFieldsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResponseRuleFieldsResponseBody</p>
     */
    public static class ListResponseRuleFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("FieldNormalization")
        private String fieldNormalization;

        @com.aliyun.core.annotation.NameInMap("RightValue")
        private java.util.List<RightValue> rightValue;

        @com.aliyun.core.annotation.NameInMap("SupportOperators")
        private java.util.List<SupportOperators> supportOperators;

        private ListResponseRuleFields(Builder builder) {
            this.dataType = builder.dataType;
            this.field = builder.field;
            this.fieldName = builder.fieldName;
            this.fieldNormalization = builder.fieldNormalization;
            this.rightValue = builder.rightValue;
            this.supportOperators = builder.supportOperators;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListResponseRuleFields create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldNormalization
         */
        public String getFieldNormalization() {
            return this.fieldNormalization;
        }

        /**
         * @return rightValue
         */
        public java.util.List<RightValue> getRightValue() {
            return this.rightValue;
        }

        /**
         * @return supportOperators
         */
        public java.util.List<SupportOperators> getSupportOperators() {
            return this.supportOperators;
        }

        public static final class Builder {
            private String dataType; 
            private String field; 
            private String fieldName; 
            private String fieldNormalization; 
            private java.util.List<RightValue> rightValue; 
            private java.util.List<SupportOperators> supportOperators; 

            private Builder() {
            } 

            private Builder(ListResponseRuleFields model) {
                this.dataType = model.dataType;
                this.field = model.field;
                this.fieldName = model.fieldName;
                this.fieldNormalization = model.fieldNormalization;
                this.rightValue = model.rightValue;
                this.supportOperators = model.supportOperators;
            } 

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * FieldNormalization.
             */
            public Builder fieldNormalization(String fieldNormalization) {
                this.fieldNormalization = fieldNormalization;
                return this;
            }

            /**
             * RightValue.
             */
            public Builder rightValue(java.util.List<RightValue> rightValue) {
                this.rightValue = rightValue;
                return this;
            }

            /**
             * SupportOperators.
             */
            public Builder supportOperators(java.util.List<SupportOperators> supportOperators) {
                this.supportOperators = supportOperators;
                return this;
            }

            public ListResponseRuleFields build() {
                return new ListResponseRuleFields(this);
            } 

        } 

    }
}
