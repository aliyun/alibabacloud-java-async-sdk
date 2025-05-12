// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link WritingStyleTemplateField} extends {@link TeaModel}
 *
 * <p>WritingStyleTemplateField</p>
 */
public class WritingStyleTemplateField extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuildIn")
    private Boolean buildIn;

    @com.aliyun.core.annotation.NameInMap("CascadingFields")
    private java.util.List<WritingStyleTemplateField> cascadingFields;

    @com.aliyun.core.annotation.NameInMap("Enums")
    private java.util.List<Enums> enums;

    @com.aliyun.core.annotation.NameInMap("InitialValue")
    private String initialValue;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Max")
    private Double max;

    @com.aliyun.core.annotation.NameInMap("MaxItem")
    private Integer maxItem;

    @com.aliyun.core.annotation.NameInMap("MaxItemLength")
    private Integer maxItemLength;

    @com.aliyun.core.annotation.NameInMap("MaxLength")
    private Integer maxLength;

    @com.aliyun.core.annotation.NameInMap("Min")
    private Double min;

    @com.aliyun.core.annotation.NameInMap("MinItemLength")
    private Integer minItemLength;

    @com.aliyun.core.annotation.NameInMap("MinLength")
    private Integer minLength;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Required")
    private Boolean required;

    @com.aliyun.core.annotation.NameInMap("Style")
    private Style style;

    private WritingStyleTemplateField(Builder builder) {
        this.buildIn = builder.buildIn;
        this.cascadingFields = builder.cascadingFields;
        this.enums = builder.enums;
        this.initialValue = builder.initialValue;
        this.key = builder.key;
        this.max = builder.max;
        this.maxItem = builder.maxItem;
        this.maxItemLength = builder.maxItemLength;
        this.maxLength = builder.maxLength;
        this.min = builder.min;
        this.minItemLength = builder.minItemLength;
        this.minLength = builder.minLength;
        this.name = builder.name;
        this.required = builder.required;
        this.style = builder.style;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WritingStyleTemplateField create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildIn
     */
    public Boolean getBuildIn() {
        return this.buildIn;
    }

    /**
     * @return cascadingFields
     */
    public java.util.List<WritingStyleTemplateField> getCascadingFields() {
        return this.cascadingFields;
    }

    /**
     * @return enums
     */
    public java.util.List<Enums> getEnums() {
        return this.enums;
    }

    /**
     * @return initialValue
     */
    public String getInitialValue() {
        return this.initialValue;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return max
     */
    public Double getMax() {
        return this.max;
    }

    /**
     * @return maxItem
     */
    public Integer getMaxItem() {
        return this.maxItem;
    }

    /**
     * @return maxItemLength
     */
    public Integer getMaxItemLength() {
        return this.maxItemLength;
    }

    /**
     * @return maxLength
     */
    public Integer getMaxLength() {
        return this.maxLength;
    }

    /**
     * @return min
     */
    public Double getMin() {
        return this.min;
    }

    /**
     * @return minItemLength
     */
    public Integer getMinItemLength() {
        return this.minItemLength;
    }

    /**
     * @return minLength
     */
    public Integer getMinLength() {
        return this.minLength;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return required
     */
    public Boolean getRequired() {
        return this.required;
    }

    /**
     * @return style
     */
    public Style getStyle() {
        return this.style;
    }

    public static final class Builder {
        private Boolean buildIn; 
        private java.util.List<WritingStyleTemplateField> cascadingFields; 
        private java.util.List<Enums> enums; 
        private String initialValue; 
        private String key; 
        private Double max; 
        private Integer maxItem; 
        private Integer maxItemLength; 
        private Integer maxLength; 
        private Double min; 
        private Integer minItemLength; 
        private Integer minLength; 
        private String name; 
        private Boolean required; 
        private Style style; 

        private Builder() {
        } 

        private Builder(WritingStyleTemplateField model) {
            this.buildIn = model.buildIn;
            this.cascadingFields = model.cascadingFields;
            this.enums = model.enums;
            this.initialValue = model.initialValue;
            this.key = model.key;
            this.max = model.max;
            this.maxItem = model.maxItem;
            this.maxItemLength = model.maxItemLength;
            this.maxLength = model.maxLength;
            this.min = model.min;
            this.minItemLength = model.minItemLength;
            this.minLength = model.minLength;
            this.name = model.name;
            this.required = model.required;
            this.style = model.style;
        } 

        /**
         * BuildIn.
         */
        public Builder buildIn(Boolean buildIn) {
            this.buildIn = buildIn;
            return this;
        }

        /**
         * CascadingFields.
         */
        public Builder cascadingFields(java.util.List<WritingStyleTemplateField> cascadingFields) {
            this.cascadingFields = cascadingFields;
            return this;
        }

        /**
         * Enums.
         */
        public Builder enums(java.util.List<Enums> enums) {
            this.enums = enums;
            return this;
        }

        /**
         * InitialValue.
         */
        public Builder initialValue(String initialValue) {
            this.initialValue = initialValue;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Max.
         */
        public Builder max(Double max) {
            this.max = max;
            return this;
        }

        /**
         * MaxItem.
         */
        public Builder maxItem(Integer maxItem) {
            this.maxItem = maxItem;
            return this;
        }

        /**
         * MaxItemLength.
         */
        public Builder maxItemLength(Integer maxItemLength) {
            this.maxItemLength = maxItemLength;
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
         * Min.
         */
        public Builder min(Double min) {
            this.min = min;
            return this;
        }

        /**
         * MinItemLength.
         */
        public Builder minItemLength(Integer minItemLength) {
            this.minItemLength = minItemLength;
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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Required.
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }

        /**
         * Style.
         */
        public Builder style(Style style) {
            this.style = style;
            return this;
        }

        public WritingStyleTemplateField build() {
            return new WritingStyleTemplateField(this);
        } 

    } 

    /**
     * 
     * {@link WritingStyleTemplateField} extends {@link TeaModel}
     *
     * <p>WritingStyleTemplateField</p>
     */
    public static class Enums extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CascadingFields")
        private java.util.List<String> cascadingFields;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Enums(Builder builder) {
            this.cascadingFields = builder.cascadingFields;
            this.key = builder.key;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Enums create() {
            return builder().build();
        }

        /**
         * @return cascadingFields
         */
        public java.util.List<String> getCascadingFields() {
            return this.cascadingFields;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> cascadingFields; 
            private String key; 
            private String name; 

            private Builder() {
            } 

            private Builder(Enums model) {
                this.cascadingFields = model.cascadingFields;
                this.key = model.key;
                this.name = model.name;
            } 

            /**
             * CascadingFields.
             */
            public Builder cascadingFields(java.util.List<String> cascadingFields) {
                this.cascadingFields = cascadingFields;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Enums build() {
                return new Enums(this);
            } 

        } 

    }
    /**
     * 
     * {@link WritingStyleTemplateField} extends {@link TeaModel}
     *
     * <p>WritingStyleTemplateField</p>
     */
    public static class Style extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Placeholder")
        private String placeholder;

        @com.aliyun.core.annotation.NameInMap("ShowTime")
        private Boolean showTime;

        @com.aliyun.core.annotation.NameInMap("Suffix")
        private String suffix;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Style(Builder builder) {
            this.description = builder.description;
            this.format = builder.format;
            this.placeholder = builder.placeholder;
            this.showTime = builder.showTime;
            this.suffix = builder.suffix;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Style create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return placeholder
         */
        public String getPlaceholder() {
            return this.placeholder;
        }

        /**
         * @return showTime
         */
        public Boolean getShowTime() {
            return this.showTime;
        }

        /**
         * @return suffix
         */
        public String getSuffix() {
            return this.suffix;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String format; 
            private String placeholder; 
            private Boolean showTime; 
            private String suffix; 
            private String type; 

            private Builder() {
            } 

            private Builder(Style model) {
                this.description = model.description;
                this.format = model.format;
                this.placeholder = model.placeholder;
                this.showTime = model.showTime;
                this.suffix = model.suffix;
                this.type = model.type;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Placeholder.
             */
            public Builder placeholder(String placeholder) {
                this.placeholder = placeholder;
                return this;
            }

            /**
             * ShowTime.
             */
            public Builder showTime(Boolean showTime) {
                this.showTime = showTime;
                return this;
            }

            /**
             * Suffix.
             */
            public Builder suffix(String suffix) {
                this.suffix = suffix;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Style build() {
                return new Style(this);
            } 

        } 

    }
}
