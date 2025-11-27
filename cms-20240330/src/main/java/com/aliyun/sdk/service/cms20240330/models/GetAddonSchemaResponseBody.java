// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetAddonSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>GetAddonSchemaResponseBody</p>
 */
public class GetAddonSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fields")
    private java.util.List<Fields> fields;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private GetAddonSchemaResponseBody(Builder builder) {
        this.fields = builder.fields;
        this.requestId = builder.requestId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAddonSchemaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fields
     */
    public java.util.List<Fields> getFields() {
        return this.fields;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<Fields> fields; 
        private String requestId; 
        private String type; 

        private Builder() {
        } 

        private Builder(GetAddonSchemaResponseBody model) {
            this.fields = model.fields;
            this.requestId = model.requestId;
            this.type = model.type;
        } 

        /**
         * fields.
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetAddonSchemaResponseBody build() {
            return new GetAddonSchemaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAddonSchemaResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonSchemaResponseBody</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        private Conditions(Builder builder) {
            this.action = builder.action;
            this.field = builder.field;
            this.op = builder.op;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String action; 
            private String field; 
            private String op; 
            private Object value; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.action = model.action;
                this.field = model.field;
                this.op = model.op;
                this.value = model.value;
            } 

            /**
             * action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAddonSchemaResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonSchemaResponseBody</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private DataSource(Builder builder) {
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
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

            private Builder(DataSource model) {
                this.label = model.label;
                this.value = model.value;
            } 

            /**
             * label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAddonSchemaResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonSchemaResponseBody</p>
     */
    public static class Props extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataSource")
        private java.util.List<DataSource> dataSource;

        @com.aliyun.core.annotation.NameInMap("related")
        private java.util.List<String> related;

        @com.aliyun.core.annotation.NameInMap("selectMode")
        private String selectMode;

        private Props(Builder builder) {
            this.dataSource = builder.dataSource;
            this.related = builder.related;
            this.selectMode = builder.selectMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Props create() {
            return builder().build();
        }

        /**
         * @return dataSource
         */
        public java.util.List<DataSource> getDataSource() {
            return this.dataSource;
        }

        /**
         * @return related
         */
        public java.util.List<String> getRelated() {
            return this.related;
        }

        /**
         * @return selectMode
         */
        public String getSelectMode() {
            return this.selectMode;
        }

        public static final class Builder {
            private java.util.List<DataSource> dataSource; 
            private java.util.List<String> related; 
            private String selectMode; 

            private Builder() {
            } 

            private Builder(Props model) {
                this.dataSource = model.dataSource;
                this.related = model.related;
                this.selectMode = model.selectMode;
            } 

            /**
             * <p>AK</p>
             */
            public Builder dataSource(java.util.List<DataSource> dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * related.
             */
            public Builder related(java.util.List<String> related) {
                this.related = related;
                return this;
            }

            /**
             * selectMode.
             */
            public Builder selectMode(String selectMode) {
                this.selectMode = selectMode;
                return this;
            }

            public Props build() {
                return new Props(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAddonSchemaResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonSchemaResponseBody</p>
     */
    public static class Validation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("maxLength")
        private Integer maxLength;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("min")
        private Integer min;

        @com.aliyun.core.annotation.NameInMap("minLength")
        private Integer minLength;

        @com.aliyun.core.annotation.NameInMap("regular")
        private String regular;

        @com.aliyun.core.annotation.NameInMap("required")
        private Boolean required;

        private Validation(Builder builder) {
            this.max = builder.max;
            this.maxLength = builder.maxLength;
            this.message = builder.message;
            this.min = builder.min;
            this.minLength = builder.minLength;
            this.regular = builder.regular;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Validation create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return maxLength
         */
        public Integer getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return minLength
         */
        public Integer getMinLength() {
            return this.minLength;
        }

        /**
         * @return regular
         */
        public String getRegular() {
            return this.regular;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        public static final class Builder {
            private Integer max; 
            private Integer maxLength; 
            private String message; 
            private Integer min; 
            private Integer minLength; 
            private String regular; 
            private Boolean required; 

            private Builder() {
            } 

            private Builder(Validation model) {
                this.max = model.max;
                this.maxLength = model.maxLength;
                this.message = model.message;
                this.min = model.min;
                this.minLength = model.minLength;
                this.regular = model.regular;
                this.required = model.required;
            } 

            /**
             * max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * maxLength.
             */
            public Builder maxLength(Integer maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * minLength.
             */
            public Builder minLength(Integer minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * regular.
             */
            public Builder regular(String regular) {
                this.regular = regular;
                return this;
            }

            /**
             * required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            public Validation build() {
                return new Validation(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAddonSchemaResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonSchemaResponseBody</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("defaultValue")
        private Object defaultValue;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("element")
        private String element;

        @com.aliyun.core.annotation.NameInMap("fieldPath")
        private String fieldPath;

        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("placeholder")
        private String placeholder;

        @com.aliyun.core.annotation.NameInMap("props")
        private Props props;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("validation")
        private Validation validation;

        private Fields(Builder builder) {
            this.conditions = builder.conditions;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.disabled = builder.disabled;
            this.element = builder.element;
            this.fieldPath = builder.fieldPath;
            this.label = builder.label;
            this.name = builder.name;
            this.placeholder = builder.placeholder;
            this.props = builder.props;
            this.type = builder.type;
            this.validation = builder.validation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return defaultValue
         */
        public Object getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return element
         */
        public String getElement() {
            return this.element;
        }

        /**
         * @return fieldPath
         */
        public String getFieldPath() {
            return this.fieldPath;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return placeholder
         */
        public String getPlaceholder() {
            return this.placeholder;
        }

        /**
         * @return props
         */
        public Props getProps() {
            return this.props;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return validation
         */
        public Validation getValidation() {
            return this.validation;
        }

        public static final class Builder {
            private java.util.List<Conditions> conditions; 
            private Object defaultValue; 
            private String description; 
            private Boolean disabled; 
            private String element; 
            private String fieldPath; 
            private String label; 
            private String name; 
            private String placeholder; 
            private Props props; 
            private String type; 
            private Validation validation; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.conditions = model.conditions;
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.disabled = model.disabled;
                this.element = model.element;
                this.fieldPath = model.fieldPath;
                this.label = model.label;
                this.name = model.name;
                this.placeholder = model.placeholder;
                this.props = model.props;
                this.type = model.type;
                this.validation = model.validation;
            } 

            /**
             * conditions.
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * defaultValue.
             */
            public Builder defaultValue(Object defaultValue) {
                this.defaultValue = defaultValue;
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
             * disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * element.
             */
            public Builder element(String element) {
                this.element = element;
                return this;
            }

            /**
             * fieldPath.
             */
            public Builder fieldPath(String fieldPath) {
                this.fieldPath = fieldPath;
                return this;
            }

            /**
             * label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * placeholder.
             */
            public Builder placeholder(String placeholder) {
                this.placeholder = placeholder;
                return this;
            }

            /**
             * props.
             */
            public Builder props(Props props) {
                this.props = props;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * validation.
             */
            public Builder validation(Validation validation) {
                this.validation = validation;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
