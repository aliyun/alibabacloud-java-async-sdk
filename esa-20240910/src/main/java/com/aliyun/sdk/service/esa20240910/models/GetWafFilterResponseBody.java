// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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

        /**
         * Filter.
         */
        public Builder filter(Filter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * <p>Id of the request</p>
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

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * Length.
             */
            public Builder length(WafQuotaInteger length) {
                this.length = length;
                return this;
            }

            /**
             * Pattern.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * Range.
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

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

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
            this.kind = builder.kind;
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
         * @return kind
         */
        public String getKind() {
            return this.kind;
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
            private String kind; 
            private Boolean negative; 
            private String operator; 
            private String symbol; 
            private String tip; 
            private String type; 
            private Validator validator; 

            /**
             * Attributes.
             */
            public Builder attributes(Integer attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * Kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * Negative.
             */
            public Builder negative(Boolean negative) {
                this.negative = negative;
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
             * Symbol.
             */
            public Builder symbol(String symbol) {
                this.symbol = symbol;
                return this;
            }

            /**
             * Tip.
             */
            public Builder tip(String tip) {
                this.tip = tip;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Validator.
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

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Value.
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
        private java.util.List < Data> data;

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
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        public static final class Builder {
            private java.util.List < Data> data; 
            private String kind; 

            /**
             * Data.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * Kind.
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
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Logics")
        private java.util.List < Logics> logics;

        @com.aliyun.core.annotation.NameInMap("Selector")
        private Selector selector;

        @com.aliyun.core.annotation.NameInMap("Sub")
        private Boolean sub;

        @com.aliyun.core.annotation.NameInMap("SubTip")
        private String subTip;

        private Fields(Builder builder) {
            this.key = builder.key;
            this.label = builder.label;
            this.logics = builder.logics;
            this.selector = builder.selector;
            this.sub = builder.sub;
            this.subTip = builder.subTip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
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
        public java.util.List < Logics> getLogics() {
            return this.logics;
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

        public static final class Builder {
            private String key; 
            private String label; 
            private java.util.List < Logics> logics; 
            private Selector selector; 
            private Boolean sub; 
            private String subTip; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Logics.
             */
            public Builder logics(java.util.List < Logics> logics) {
                this.logics = logics;
                return this;
            }

            /**
             * Selector.
             */
            public Builder selector(Selector selector) {
                this.selector = selector;
                return this;
            }

            /**
             * Sub.
             */
            public Builder sub(Boolean sub) {
                this.sub = sub;
                return this;
            }

            /**
             * SubTip.
             */
            public Builder subTip(String subTip) {
                this.subTip = subTip;
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
        private java.util.List < Fields> fields;

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
        public java.util.List < Fields> getFields() {
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
            private java.util.List < Fields> fields; 
            private String phase; 
            private String target; 
            private String type; 

            /**
             * Fields.
             */
            public Builder fields(java.util.List < Fields> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * Phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * Type.
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
