// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigOptionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigOptionsResponseBody</p>
 */
public class DescribeConfigOptionsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackConfigOption")
    private StackConfigOption stackConfigOption;

    private DescribeConfigOptionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.stackConfigOption = builder.stackConfigOption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigOptionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return stackConfigOption
     */
    public StackConfigOption getStackConfigOption() {
        return this.stackConfigOption;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private StackConfigOption stackConfigOption; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StackConfigOption.
         */
        public Builder stackConfigOption(StackConfigOption stackConfigOption) {
            this.stackConfigOption = stackConfigOption;
            return this;
        }

        public DescribeConfigOptionsResponseBody build() {
            return new DescribeConfigOptionsResponseBody(this);
        } 

    } 

    public static class ConfigOption extends TeaModel {
        @NameInMap("ChangeSeverity")
        private String changeSeverity;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("EditorType")
        private String editorType;

        @NameInMap("HiddenOption")
        private Boolean hiddenOption;

        @NameInMap("MaxLength")
        private Integer maxLength;

        @NameInMap("MaxValue")
        private Long maxValue;

        @NameInMap("MinLength")
        private Integer minLength;

        @NameInMap("MinValue")
        private Long minValue;

        @NameInMap("OptionDescription")
        private String optionDescription;

        @NameInMap("OptionLabel")
        private String optionLabel;

        @NameInMap("OptionName")
        private String optionName;

        @NameInMap("PathName")
        private String pathName;

        @NameInMap("ReadonlyOption")
        private Boolean readonlyOption;

        @NameInMap("RegexDesc")
        private String regexDesc;

        @NameInMap("RegexPattern")
        private String regexPattern;

        @NameInMap("ValueOptions")
        private String valueOptions;

        @NameInMap("ValueType")
        private String valueType;

        private ConfigOption(Builder builder) {
            this.changeSeverity = builder.changeSeverity;
            this.defaultValue = builder.defaultValue;
            this.editorType = builder.editorType;
            this.hiddenOption = builder.hiddenOption;
            this.maxLength = builder.maxLength;
            this.maxValue = builder.maxValue;
            this.minLength = builder.minLength;
            this.minValue = builder.minValue;
            this.optionDescription = builder.optionDescription;
            this.optionLabel = builder.optionLabel;
            this.optionName = builder.optionName;
            this.pathName = builder.pathName;
            this.readonlyOption = builder.readonlyOption;
            this.regexDesc = builder.regexDesc;
            this.regexPattern = builder.regexPattern;
            this.valueOptions = builder.valueOptions;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigOption create() {
            return builder().build();
        }

        /**
         * @return changeSeverity
         */
        public String getChangeSeverity() {
            return this.changeSeverity;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return editorType
         */
        public String getEditorType() {
            return this.editorType;
        }

        /**
         * @return hiddenOption
         */
        public Boolean getHiddenOption() {
            return this.hiddenOption;
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
        public Long getMaxValue() {
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
        public Long getMinValue() {
            return this.minValue;
        }

        /**
         * @return optionDescription
         */
        public String getOptionDescription() {
            return this.optionDescription;
        }

        /**
         * @return optionLabel
         */
        public String getOptionLabel() {
            return this.optionLabel;
        }

        /**
         * @return optionName
         */
        public String getOptionName() {
            return this.optionName;
        }

        /**
         * @return pathName
         */
        public String getPathName() {
            return this.pathName;
        }

        /**
         * @return readonlyOption
         */
        public Boolean getReadonlyOption() {
            return this.readonlyOption;
        }

        /**
         * @return regexDesc
         */
        public String getRegexDesc() {
            return this.regexDesc;
        }

        /**
         * @return regexPattern
         */
        public String getRegexPattern() {
            return this.regexPattern;
        }

        /**
         * @return valueOptions
         */
        public String getValueOptions() {
            return this.valueOptions;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String changeSeverity; 
            private String defaultValue; 
            private String editorType; 
            private Boolean hiddenOption; 
            private Integer maxLength; 
            private Long maxValue; 
            private Integer minLength; 
            private Long minValue; 
            private String optionDescription; 
            private String optionLabel; 
            private String optionName; 
            private String pathName; 
            private Boolean readonlyOption; 
            private String regexDesc; 
            private String regexPattern; 
            private String valueOptions; 
            private String valueType; 

            /**
             * ChangeSeverity.
             */
            public Builder changeSeverity(String changeSeverity) {
                this.changeSeverity = changeSeverity;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * EditorType.
             */
            public Builder editorType(String editorType) {
                this.editorType = editorType;
                return this;
            }

            /**
             * HiddenOption.
             */
            public Builder hiddenOption(Boolean hiddenOption) {
                this.hiddenOption = hiddenOption;
                return this;
            }

            /**
             * MaxLength.
             */
            public Builder maxLength(Integer maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * MaxValue.
             */
            public Builder maxValue(Long maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * MinLength.
             */
            public Builder minLength(Integer minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * MinValue.
             */
            public Builder minValue(Long minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * OptionDescription.
             */
            public Builder optionDescription(String optionDescription) {
                this.optionDescription = optionDescription;
                return this;
            }

            /**
             * OptionLabel.
             */
            public Builder optionLabel(String optionLabel) {
                this.optionLabel = optionLabel;
                return this;
            }

            /**
             * OptionName.
             */
            public Builder optionName(String optionName) {
                this.optionName = optionName;
                return this;
            }

            /**
             * PathName.
             */
            public Builder pathName(String pathName) {
                this.pathName = pathName;
                return this;
            }

            /**
             * ReadonlyOption.
             */
            public Builder readonlyOption(Boolean readonlyOption) {
                this.readonlyOption = readonlyOption;
                return this;
            }

            /**
             * RegexDesc.
             */
            public Builder regexDesc(String regexDesc) {
                this.regexDesc = regexDesc;
                return this;
            }

            /**
             * RegexPattern.
             */
            public Builder regexPattern(String regexPattern) {
                this.regexPattern = regexPattern;
                return this;
            }

            /**
             * ValueOptions.
             */
            public Builder valueOptions(String valueOptions) {
                this.valueOptions = valueOptions;
                return this;
            }

            /**
             * ValueType.
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public ConfigOption build() {
                return new ConfigOption(this);
            } 

        } 

    }
    public static class ConfigOptions extends TeaModel {
        @NameInMap("ConfigOption")
        private java.util.List < ConfigOption> configOption;

        private ConfigOptions(Builder builder) {
            this.configOption = builder.configOption;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigOptions create() {
            return builder().build();
        }

        /**
         * @return configOption
         */
        public java.util.List < ConfigOption> getConfigOption() {
            return this.configOption;
        }

        public static final class Builder {
            private java.util.List < ConfigOption> configOption; 

            /**
             * ConfigOption.
             */
            public Builder configOption(java.util.List < ConfigOption> configOption) {
                this.configOption = configOption;
                return this;
            }

            public ConfigOptions build() {
                return new ConfigOptions(this);
            } 

        } 

    }
    public static class StackConfigOption extends TeaModel {
        @NameInMap("ConfigOptions")
        private ConfigOptions configOptions;

        @NameInMap("StackId")
        private String stackId;

        @NameInMap("StackName")
        private String stackName;

        private StackConfigOption(Builder builder) {
            this.configOptions = builder.configOptions;
            this.stackId = builder.stackId;
            this.stackName = builder.stackName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackConfigOption create() {
            return builder().build();
        }

        /**
         * @return configOptions
         */
        public ConfigOptions getConfigOptions() {
            return this.configOptions;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
        }

        /**
         * @return stackName
         */
        public String getStackName() {
            return this.stackName;
        }

        public static final class Builder {
            private ConfigOptions configOptions; 
            private String stackId; 
            private String stackName; 

            /**
             * ConfigOptions.
             */
            public Builder configOptions(ConfigOptions configOptions) {
                this.configOptions = configOptions;
                return this;
            }

            /**
             * StackId.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * StackName.
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            public StackConfigOption build() {
                return new StackConfigOption(this);
            } 

        } 

    }
}
