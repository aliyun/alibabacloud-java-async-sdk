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
         * <p>The list of response rule fields.</p>
         */
        public Builder listResponseRuleFields(java.util.List<ListResponseRuleFields> listResponseRuleFields) {
            this.listResponseRuleFields = listResponseRuleFields;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next query. You do not need to specify this parameter for the first query or if no more results exist. If a next query exists, set this parameter to the NextToken value returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
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
             * <p>The right-side value.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_selectdb_cluster</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The display name of the enumeration value.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
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
             * <p>Indicates whether a right-side value is required. Valid values:</p>
             * <ul>
             * <li>true: Required.</li>
             * <li>false: Not required.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasRightValue(String hasRightValue) {
                this.hasRightValue = hasRightValue;
                return this;
            }

            /**
             * <p>The position of the operator in the operator list.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The aggregation method for the dispatch rule condition. Valid values:</p>
             * <ul>
             * <li><code>=</code>: Equal to.</li>
             * <li><code>&lt;&gt;</code>: Not equal to.</li>
             * <li><code>in</code>: Contains.</li>
             * <li><code>not in</code>: Does not contain.</li>
             * <li><code>REGEXP</code>: Matches the regular expression.</li>
             * <li><code>NOT REGEXP</code>: Does not match the regular expression.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BETWEEN</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The display name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>autotest-operator</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The data types supported by the current operator, separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
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
             * <p>The data type of the automated response rule condition field.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The whitelisted field.</p>
             * 
             * <strong>example:</strong>
             * <p>appname</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The name of the rule field.</p>
             * 
             * <strong>example:</strong>
             * <p>OriginIP,ConsoleLog,CPUTime,Duration,ErrorCode,ErrorMessage,ResponseSize,ResponseStatus,RoutineName,ClientRequestID,LogTimestamp,FetchStatus,SubRequestID</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>The normalized object type to which the field belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>alert</p>
             */
            public Builder fieldNormalization(String fieldNormalization) {
                this.fieldNormalization = fieldNormalization;
                return this;
            }

            /**
             * <p>The list of optional enumeration values for the field. This parameter is not returned if no enumeration values exist.</p>
             */
            public Builder rightValue(java.util.List<RightValue> rightValue) {
                this.rightValue = rightValue;
                return this;
            }

            /**
             * <p>The English descriptions of the operators.</p>
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
