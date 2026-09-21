// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetWafFilterResponseBody} extends {@link TeaModel}
 *
 * <p>GetWafFilterResponseBody</p>
 */
public class GetWafFilterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Filter")
    private Filter filter;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetWafFilterResponseBody(Builder builder) {
        this.filter = builder.filter;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWafFilterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Filter filter; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetWafFilterResponseBody model) {
            this.filter = model.filter;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The matching engine configuration information returned.</p>
         */
        public Builder filter(Filter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetWafFilterResponseBody build() {
            return new GetWafFilterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWafFilterResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafFilterResponseBody</p>
     */
    public static class Validator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("Length")
        private WafQuotaInteger length;

        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        @com.aliyun.core.annotation.NameInMap("Range")
        private WafQuotaInteger range;

        private Validator(Builder builder) {
            this.errMsg = builder.errMsg;
            this.length = builder.length;
            this.pattern = builder.pattern;
            this.range = builder.range;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Validator create() {
            return builder().build();
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return length
         */
        public WafQuotaInteger getLength() {
            return this.length;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        /**
         * @return range
         */
        public WafQuotaInteger getRange() {
            return this.range;
        }

        public static final class Builder {
            private String errMsg; 
            private WafQuotaInteger length; 
            private String pattern; 
            private WafQuotaInteger range; 

            private Builder() {
            } 

            private Builder(Validator model) {
                this.errMsg = model.errMsg;
                this.length = model.length;
                this.pattern = model.pattern;
                this.range = model.range;
            } 

            /**
             * <p>The error message returned when validation fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Enter a valid expression</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The length limit of the value.</p>
             */
            public Builder length(WafQuotaInteger length) {
                this.length = length;
                return this;
            }

            /**
             * <p>The regular expression pattern for the value, used for string validation.</p>
             * 
             * <strong>example:</strong>
             * <p>^example$</p>
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * <p>The numeric range of the value, used for number validation.</p>
             */
            public Builder range(WafQuotaInteger range) {
                this.range = range;
                return this;
            }

            public Validator build() {
                return new Validator(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWafFilterResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafFilterResponseBody</p>
     */
    public static class Logics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private Integer attributes;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("MinPlan")
        private String minPlan;

        @com.aliyun.core.annotation.NameInMap("Negative")
        private Boolean negative;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Symbol")
        private String symbol;

        @com.aliyun.core.annotation.NameInMap("Tip")
        private String tip;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Validator")
        private Validator validator;

        private Logics(Builder builder) {
            this.attributes = builder.attributes;
            this.enable = builder.enable;
            this.kind = builder.kind;
            this.minPlan = builder.minPlan;
            this.negative = builder.negative;
            this.operator = builder.operator;
            this.symbol = builder.symbol;
            this.tip = builder.tip;
            this.type = builder.type;
            this.validator = builder.validator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logics create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public Integer getAttributes() {
            return this.attributes;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return minPlan
         */
        public String getMinPlan() {
            return this.minPlan;
        }

        /**
         * @return negative
         */
        public Boolean getNegative() {
            return this.negative;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return symbol
         */
        public String getSymbol() {
            return this.symbol;
        }

        /**
         * @return tip
         */
        public String getTip() {
            return this.tip;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return validator
         */
        public Validator getValidator() {
            return this.validator;
        }

        public static final class Builder {
            private Integer attributes; 
            private Boolean enable; 
            private String kind; 
            private String minPlan; 
            private Boolean negative; 
            private String operator; 
            private String symbol; 
            private String tip; 
            private String type; 
            private Validator validator; 

            private Builder() {
            } 

            private Builder(Logics model) {
                this.attributes = model.attributes;
                this.enable = model.enable;
                this.kind = model.kind;
                this.minPlan = model.minPlan;
                this.negative = model.negative;
                this.operator = model.operator;
                this.symbol = model.symbol;
                this.tip = model.tip;
                this.type = model.type;
                this.validator = model.validator;
            } 

            /**
             * <p>The configurable attributes, such as whether the match is case-sensitive.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder attributes(Integer attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>Indicates whether the current plan supports this match operator.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The type of the value input field. Valid values:</p>
             * <ul>
             * <li>select:single: single-select input field</li>
             * <li>select:multi: multi-select input field</li>
             * <li>input:single: single input field</li>
             * <li>input:multi: multi input field</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>input:single</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The minimum plan that supports this match operator, displayed when the current plan does not support it.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder minPlan(String minPlan) {
                this.minPlan = minPlan;
                return this;
            }

            /**
             * <p>Indicates whether the match result is negated.</p>
             */
            public Builder negative(Boolean negative) {
                this.negative = negative;
                return this;
            }

            /**
             * <p>The display label of the match operator.</p>
             * 
             * <strong>example:</strong>
             * <p>Does not equal</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The parameter of the match operator used internally by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>eq</p>
             */
            public Builder symbol(String symbol) {
                this.symbol = symbol;
                return this;
            }

            /**
             * <p>The input hint that helps users provide valid values required by the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>e.g. image/jpeg</p>
             */
            public Builder tip(String tip) {
                this.tip = tip;
                return this;
            }

            /**
             * <p>The type of the value. Valid values:</p>
             * <ul>
             * <li>integer: integer</li>
             * <li>integer_slice: integer array</li>
             * <li>string: string</li>
             * <li>string_slice: string array</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The validator object that defines the validation rules for values.</p>
             */
            public Builder validator(Validator validator) {
                this.validator = validator;
                return this;
            }

            public Logics build() {
                return new Logics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWafFilterResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafFilterResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Data(Builder builder) {
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String value; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.label = model.label;
                this.value = model.value;
            } 

            /**
             * <p>The display label of the available data.</p>
             * 
             * <strong>example:</strong>
             * <p>China</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The parameter value of the available data.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWafFilterResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafFilterResponseBody</p>
     */
    public static class Selector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        private Selector(Builder builder) {
            this.data = builder.data;
            this.kind = builder.kind;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Selector create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private String kind; 

            private Builder() {
            } 

            private Builder(Selector model) {
                this.data = model.data;
                this.kind = model.kind;
            } 

            /**
             * <p>The list of available data when the selector kind is data.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The kind of the selector, such as whether it is used for selecting data items or other purposes.</p>
             * 
             * <strong>example:</strong>
             * <p>data</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            public Selector build() {
                return new Selector(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWafFilterResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafFilterResponseBody</p>
     */
    public static class LogicsValidator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("Length")
        private WafQuotaInteger length;

        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        @com.aliyun.core.annotation.NameInMap("Range")
        private WafQuotaInteger range;

        private LogicsValidator(Builder builder) {
            this.errMsg = builder.errMsg;
            this.length = builder.length;
            this.pattern = builder.pattern;
            this.range = builder.range;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogicsValidator create() {
            return builder().build();
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return length
         */
        public WafQuotaInteger getLength() {
            return this.length;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        /**
         * @return range
         */
        public WafQuotaInteger getRange() {
            return this.range;
        }

        public static final class Builder {
            private String errMsg; 
            private WafQuotaInteger length; 
            private String pattern; 
            private WafQuotaInteger range; 

            private Builder() {
            } 

            private Builder(LogicsValidator model) {
                this.errMsg = model.errMsg;
                this.length = model.length;
                this.pattern = model.pattern;
                this.range = model.range;
            } 

            /**
             * <p>The error message returned when validation fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Enter a valid expression</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The length limit of the value.</p>
             */
            public Builder length(WafQuotaInteger length) {
                this.length = length;
                return this;
            }

            /**
             * <p>The regular expression pattern for the value, used for string validation.</p>
             * 
             * <strong>example:</strong>
             * <p>^example$</p>
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * <p>The numeric range of the value, used for number validation.</p>
             */
            public Builder range(WafQuotaInteger range) {
                this.range = range;
                return this;
            }

            public LogicsValidator build() {
                return new LogicsValidator(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWafFilterResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafFilterResponseBody</p>
     */
    public static class SubsLogics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private Integer attributes;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("MinPlan")
        private String minPlan;

        @com.aliyun.core.annotation.NameInMap("Negative")
        private Boolean negative;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Symbol")
        private String symbol;

        @com.aliyun.core.annotation.NameInMap("Tip")
        private String tip;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Validator")
        private LogicsValidator validator;

        private SubsLogics(Builder builder) {
            this.attributes = builder.attributes;
            this.enable = builder.enable;
            this.kind = builder.kind;
            this.minPlan = builder.minPlan;
            this.negative = builder.negative;
            this.operator = builder.operator;
            this.symbol = builder.symbol;
            this.tip = builder.tip;
            this.type = builder.type;
            this.validator = builder.validator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubsLogics create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public Integer getAttributes() {
            return this.attributes;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return minPlan
         */
        public String getMinPlan() {
            return this.minPlan;
        }

        /**
         * @return negative
         */
        public Boolean getNegative() {
            return this.negative;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return symbol
         */
        public String getSymbol() {
            return this.symbol;
        }

        /**
         * @return tip
         */
        public String getTip() {
            return this.tip;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return validator
         */
        public LogicsValidator getValidator() {
            return this.validator;
        }

        public static final class Builder {
            private Integer attributes; 
            private Boolean enable; 
            private String kind; 
            private String minPlan; 
            private Boolean negative; 
            private String operator; 
            private String symbol; 
            private String tip; 
            private String type; 
            private LogicsValidator validator; 

            private Builder() {
            } 

            private Builder(SubsLogics model) {
                this.attributes = model.attributes;
                this.enable = model.enable;
                this.kind = model.kind;
                this.minPlan = model.minPlan;
                this.negative = model.negative;
                this.operator = model.operator;
                this.symbol = model.symbol;
                this.tip = model.tip;
                this.type = model.type;
                this.validator = model.validator;
            } 

            /**
             * <p>The field attributes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder attributes(Integer attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>Indicates whether the current plan supports this match operator.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The type of the value input field. Valid values:</p>
             * <ul>
             * <li>select:single: single-select input field</li>
             * <li>select:multi: multi-select input field</li>
             * <li>input:single: single input field</li>
             * <li>input:multi: multi input field</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>select:single</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The minimum plan that supports this match operator, displayed when the current plan does not support it.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder minPlan(String minPlan) {
                this.minPlan = minPlan;
                return this;
            }

            /**
             * <p>Indicates whether the match result is negated.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder negative(Boolean negative) {
                this.negative = negative;
                return this;
            }

            /**
             * <p>The display label of the match operator.</p>
             * 
             * <strong>example:</strong>
             * <p>Equal</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The parameter of the match operator used internally by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>eq</p>
             */
            public Builder symbol(String symbol) {
                this.symbol = symbol;
                return this;
            }

            /**
             * <p>The input hint that helps users provide valid values required by the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>e.g. image/jpeg</p>
             */
            public Builder tip(String tip) {
                this.tip = tip;
                return this;
            }

            /**
             * <p>The type of the value. Valid values:</p>
             * <ul>
             * <li>integer: integer</li>
             * <li>integer_slice: integer array</li>
             * <li>string: string</li>
             * <li>string_slice: string array</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The validator object that defines the validation rules for values.</p>
             */
            public Builder validator(LogicsValidator validator) {
                this.validator = validator;
                return this;
            }

            public SubsLogics build() {
                return new SubsLogics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWafFilterResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafFilterResponseBody</p>
     */
    public static class Subs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Logics")
        private java.util.List<SubsLogics> logics;

        @com.aliyun.core.annotation.NameInMap("MinPlan")
        private String minPlan;

        private Subs(Builder builder) {
            this.enable = builder.enable;
            this.key = builder.key;
            this.label = builder.label;
            this.logics = builder.logics;
            this.minPlan = builder.minPlan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subs create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return logics
         */
        public java.util.List<SubsLogics> getLogics() {
            return this.logics;
        }

        /**
         * @return minPlan
         */
        public String getMinPlan() {
            return this.minPlan;
        }

        public static final class Builder {
            private Boolean enable; 
            private String key; 
            private String label; 
            private java.util.List<SubsLogics> logics; 
            private String minPlan; 

            private Builder() {
            } 

            private Builder(Subs model) {
                this.enable = model.enable;
                this.key = model.key;
                this.label = model.label;
                this.logics = model.logics;
                this.minPlan = model.minPlan;
            } 

            /**
             * <p>Indicates whether the current plan supports this match object.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The parameter of the sub-item match object.</p>
             * 
             * <strong>example:</strong>
             * <p>ali.websdk.umid</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The display label of the sub-item match object.</p>
             * 
             * <strong>example:</strong>
             * <p>Web UMID</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The list of logical operator properties applicable to the sub-item (same structure as the parent Logics).</p>
             */
            public Builder logics(java.util.List<SubsLogics> logics) {
                this.logics = logics;
                return this;
            }

            /**
             * <p>The minimum plan that supports this match object, displayed when the current plan does not support it.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder minPlan(String minPlan) {
                this.minPlan = minPlan;
                return this;
            }

            public Subs build() {
                return new Subs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWafFilterResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafFilterResponseBody</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Logics")
        private java.util.List<Logics> logics;

        @com.aliyun.core.annotation.NameInMap("MinPlan")
        private String minPlan;

        @com.aliyun.core.annotation.NameInMap("Selector")
        private Selector selector;

        @com.aliyun.core.annotation.NameInMap("Sub")
        private Boolean sub;

        @com.aliyun.core.annotation.NameInMap("SubTip")
        private String subTip;

        @com.aliyun.core.annotation.NameInMap("Subs")
        private java.util.List<Subs> subs;

        private Fields(Builder builder) {
            this.enable = builder.enable;
            this.key = builder.key;
            this.label = builder.label;
            this.logics = builder.logics;
            this.minPlan = builder.minPlan;
            this.selector = builder.selector;
            this.sub = builder.sub;
            this.subTip = builder.subTip;
            this.subs = builder.subs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return logics
         */
        public java.util.List<Logics> getLogics() {
            return this.logics;
        }

        /**
         * @return minPlan
         */
        public String getMinPlan() {
            return this.minPlan;
        }

        /**
         * @return selector
         */
        public Selector getSelector() {
            return this.selector;
        }

        /**
         * @return sub
         */
        public Boolean getSub() {
            return this.sub;
        }

        /**
         * @return subTip
         */
        public String getSubTip() {
            return this.subTip;
        }

        /**
         * @return subs
         */
        public java.util.List<Subs> getSubs() {
            return this.subs;
        }

        public static final class Builder {
            private Boolean enable; 
            private String key; 
            private String label; 
            private java.util.List<Logics> logics; 
            private String minPlan; 
            private Selector selector; 
            private Boolean sub; 
            private String subTip; 
            private java.util.List<Subs> subs; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.enable = model.enable;
                this.key = model.key;
                this.label = model.label;
                this.logics = model.logics;
                this.minPlan = model.minPlan;
                this.selector = model.selector;
                this.sub = model.sub;
                this.subTip = model.subTip;
                this.subs = model.subs;
            } 

            /**
             * <p>Indicates whether the current plan supports this match object.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The parameter of the match object used internally by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>http.request.headers</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The display label of the match object.</p>
             * 
             * <strong>example:</strong>
             * <p>Header</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The list of logical operator properties that define the logical conditions used for matching.</p>
             */
            public Builder logics(java.util.List<Logics> logics) {
                this.logics = logics;
                return this;
            }

            /**
             * <p>The minimum plan that supports this match object, displayed when the current plan does not support it.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder minPlan(String minPlan) {
                this.minPlan = minPlan;
                return this;
            }

            /**
             * <p>The selector object that defines how to select the match object.</p>
             */
            public Builder selector(Selector selector) {
                this.selector = selector;
                return this;
            }

            /**
             * <p>Indicates whether the match object contains subfields.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sub(Boolean sub) {
                this.sub = sub;
                return this;
            }

            /**
             * <p>The hint provided to users about how to enter subfields.</p>
             * 
             * <strong>example:</strong>
             * <p>e.g. Content-Type</p>
             */
            public Builder subTip(String subTip) {
                this.subTip = subTip;
                return this;
            }

            /**
             * <p>The enumerated sub-item list (dropdown subfields for grouped fields such as ali.websdk). Top-level match objects populate this list. Sub-items that are flat fields can be used directly as the left-hand side of an expression.</p>
             */
            public Builder subs(java.util.List<Subs> subs) {
                this.subs = subs;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWafFilterResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafFilterResponseBody</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fields")
        private java.util.List<Fields> fields;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Filter(Builder builder) {
            this.fields = builder.fields;
            this.phase = builder.phase;
            this.target = builder.target;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.List<Fields> getFields() {
            return this.fields;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Fields> fields; 
            private String phase; 
            private String target; 
            private String type; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.fields = model.fields;
                this.phase = model.phase;
                this.target = model.target;
                this.type = model.type;
            } 

            /**
             * <p>The list that describes match objects and their properties.</p>
             */
            public Builder fields(java.util.List<Fields> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * <p>The phase in which WAF processes the request.</p>
             * 
             * <strong>example:</strong>
             * <p>http_bot</p>
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * <p>The target value of the matching engine.</p>
             * 
             * <strong>example:</strong>
             * <p>characteristics</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>http_custom_cc</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
