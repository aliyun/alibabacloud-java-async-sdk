// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListGatewayFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayFeaturesResponseBody</p>
 */
public class ListGatewayFeaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListGatewayFeaturesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayFeaturesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGatewayFeaturesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGatewayFeaturesResponseBody build() {
            return new ListGatewayFeaturesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayFeaturesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayFeaturesResponseBody</p>
     */
    public static class ValueOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        private ValueOptions(Builder builder) {
            this.key = builder.key;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueOptions create() {
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

        public static final class Builder {
            private String key; 
            private String label; 

            private Builder() {
            } 

            private Builder(ValueOptions model) {
                this.key = model.key;
                this.label = model.label;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public ValueOptions build() {
                return new ValueOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayFeaturesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayFeaturesResponseBody</p>
     */
    public static class Definition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("defaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("inputType")
        private String inputType;

        @com.aliyun.core.annotation.NameInMap("maxLength")
        private Integer maxLength;

        @com.aliyun.core.annotation.NameInMap("maxValue")
        private String maxValue;

        @com.aliyun.core.annotation.NameInMap("minLength")
        private Integer minLength;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private String minValue;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("readOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("regex")
        private String regex;

        @com.aliyun.core.annotation.NameInMap("valueOptions")
        private java.util.List<ValueOptions> valueOptions;

        @com.aliyun.core.annotation.NameInMap("valueType")
        private String valueType;

        @com.aliyun.core.annotation.NameInMap("valueUnit")
        private String valueUnit;

        private Definition(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.group = builder.group;
            this.inputType = builder.inputType;
            this.maxLength = builder.maxLength;
            this.maxValue = builder.maxValue;
            this.minLength = builder.minLength;
            this.minValue = builder.minValue;
            this.name = builder.name;
            this.readOnly = builder.readOnly;
            this.regex = builder.regex;
            this.valueOptions = builder.valueOptions;
            this.valueType = builder.valueType;
            this.valueUnit = builder.valueUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Definition create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return inputType
         */
        public String getInputType() {
            return this.inputType;
        }

        /**
         * @return maxLength
         */
        public Integer getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return maxValue
         */
        public String getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minLength
         */
        public Integer getMinLength() {
            return this.minLength;
        }

        /**
         * @return minValue
         */
        public String getMinValue() {
            return this.minValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return regex
         */
        public String getRegex() {
            return this.regex;
        }

        /**
         * @return valueOptions
         */
        public java.util.List<ValueOptions> getValueOptions() {
            return this.valueOptions;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        /**
         * @return valueUnit
         */
        public String getValueUnit() {
            return this.valueUnit;
        }

        public static final class Builder {
            private String defaultValue; 
            private String description; 
            private String displayName; 
            private String group; 
            private String inputType; 
            private Integer maxLength; 
            private String maxValue; 
            private Integer minLength; 
            private String minValue; 
            private String name; 
            private Boolean readOnly; 
            private String regex; 
            private java.util.List<ValueOptions> valueOptions; 
            private String valueType; 
            private String valueUnit; 

            private Builder() {
            } 

            private Builder(Definition model) {
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.displayName = model.displayName;
                this.group = model.group;
                this.inputType = model.inputType;
                this.maxLength = model.maxLength;
                this.maxValue = model.maxValue;
                this.minLength = model.minLength;
                this.minValue = model.minValue;
                this.name = model.name;
                this.readOnly = model.readOnly;
                this.regex = model.regex;
                this.valueOptions = model.valueOptions;
                this.valueType = model.valueType;
                this.valueUnit = model.valueUnit;
            } 

            /**
             * defaultValue.
             */
            public Builder defaultValue(String defaultValue) {
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
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * inputType.
             */
            public Builder inputType(String inputType) {
                this.inputType = inputType;
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
             * maxValue.
             */
            public Builder maxValue(String maxValue) {
                this.maxValue = maxValue;
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
             * minValue.
             */
            public Builder minValue(String minValue) {
                this.minValue = minValue;
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
             * readOnly.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * regex.
             */
            public Builder regex(String regex) {
                this.regex = regex;
                return this;
            }

            /**
             * valueOptions.
             */
            public Builder valueOptions(java.util.List<ValueOptions> valueOptions) {
                this.valueOptions = valueOptions;
                return this;
            }

            /**
             * valueType.
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            /**
             * valueUnit.
             */
            public Builder valueUnit(String valueUnit) {
                this.valueUnit = valueUnit;
                return this;
            }

            public Definition build() {
                return new Definition(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayFeaturesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayFeaturesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("definition")
        private Definition definition;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Items(Builder builder) {
            this.definition = builder.definition;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return definition
         */
        public Definition getDefinition() {
            return this.definition;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Definition definition; 
            private String value; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.definition = model.definition;
                this.value = model.value;
            } 

            /**
             * definition.
             */
            public Builder definition(Definition definition) {
                this.definition = definition;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayFeaturesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayFeaturesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        private Data(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
