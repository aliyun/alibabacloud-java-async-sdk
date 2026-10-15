// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link AttributeValueInfoDTO} extends {@link TeaModel}
 *
 * <p>AttributeValueInfoDTO</p>
 */
public class AttributeValueInfoDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BoundedValue")
    private BoundedValue boundedValue;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DefaultValue")
    private String defaultValue;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DescriptionAttributeValues")
    private java.util.List<AttributeValueInfoDTO> descriptionAttributeValues;

    @com.aliyun.core.annotation.NameInMap("IdentifyKey")
    private String identifyKey;

    @com.aliyun.core.annotation.NameInMap("Max")
    private String max;

    @com.aliyun.core.annotation.NameInMap("Min")
    private String min;

    @com.aliyun.core.annotation.NameInMap("OperationTags")
    private java.util.List<String> operationTags;

    @com.aliyun.core.annotation.NameInMap("Step")
    private String step;

    @com.aliyun.core.annotation.NameInMap("SubAttributeValues")
    private java.util.Map<String, java.util.List<AttributeValueInfoDTO>> subAttributeValues;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("ValueName")
    private String valueName;

    private AttributeValueInfoDTO(Builder builder) {
        this.boundedValue = builder.boundedValue;
        this.code = builder.code;
        this.defaultValue = builder.defaultValue;
        this.description = builder.description;
        this.descriptionAttributeValues = builder.descriptionAttributeValues;
        this.identifyKey = builder.identifyKey;
        this.max = builder.max;
        this.min = builder.min;
        this.operationTags = builder.operationTags;
        this.step = builder.step;
        this.subAttributeValues = builder.subAttributeValues;
        this.value = builder.value;
        this.valueName = builder.valueName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttributeValueInfoDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return boundedValue
     */
    public BoundedValue getBoundedValue() {
        return this.boundedValue;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return descriptionAttributeValues
     */
    public java.util.List<AttributeValueInfoDTO> getDescriptionAttributeValues() {
        return this.descriptionAttributeValues;
    }

    /**
     * @return identifyKey
     */
    public String getIdentifyKey() {
        return this.identifyKey;
    }

    /**
     * @return max
     */
    public String getMax() {
        return this.max;
    }

    /**
     * @return min
     */
    public String getMin() {
        return this.min;
    }

    /**
     * @return operationTags
     */
    public java.util.List<String> getOperationTags() {
        return this.operationTags;
    }

    /**
     * @return step
     */
    public String getStep() {
        return this.step;
    }

    /**
     * @return subAttributeValues
     */
    public java.util.Map<String, java.util.List<AttributeValueInfoDTO>> getSubAttributeValues() {
        return this.subAttributeValues;
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
        private BoundedValue boundedValue; 
        private String code; 
        private String defaultValue; 
        private String description; 
        private java.util.List<AttributeValueInfoDTO> descriptionAttributeValues; 
        private String identifyKey; 
        private String max; 
        private String min; 
        private java.util.List<String> operationTags; 
        private String step; 
        private java.util.Map<String, java.util.List<AttributeValueInfoDTO>> subAttributeValues; 
        private String value; 
        private String valueName; 

        private Builder() {
        } 

        private Builder(AttributeValueInfoDTO model) {
            this.boundedValue = model.boundedValue;
            this.code = model.code;
            this.defaultValue = model.defaultValue;
            this.description = model.description;
            this.descriptionAttributeValues = model.descriptionAttributeValues;
            this.identifyKey = model.identifyKey;
            this.max = model.max;
            this.min = model.min;
            this.operationTags = model.operationTags;
            this.step = model.step;
            this.subAttributeValues = model.subAttributeValues;
            this.value = model.value;
            this.valueName = model.valueName;
        } 

        /**
         * <p>The upper and lower bounds.</p>
         */
        public Builder boundedValue(BoundedValue boundedValue) {
            this.boundedValue = boundedValue;
            return this;
        }

        /**
         * <p>The property code.</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The default value.</p>
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * <p>The description (translated).</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The description property values.</p>
         */
        public Builder descriptionAttributeValues(java.util.List<AttributeValueInfoDTO> descriptionAttributeValues) {
            this.descriptionAttributeValues = descriptionAttributeValues;
            return this;
        }

        /**
         * <p>The unique identifier.</p>
         */
        public Builder identifyKey(String identifyKey) {
            this.identifyKey = identifyKey;
            return this;
        }

        /**
         * <p>The maximum value.</p>
         */
        public Builder max(String max) {
            this.max = max;
            return this;
        }

        /**
         * <p>The minimum value.</p>
         */
        public Builder min(String min) {
            this.min = min;
            return this;
        }

        /**
         * <p>The operation tags.</p>
         */
        public Builder operationTags(java.util.List<String> operationTags) {
            this.operationTags = operationTags;
            return this;
        }

        /**
         * <p>The step size.</p>
         */
        public Builder step(String step) {
            this.step = step;
            return this;
        }

        /**
         * <p>The sub-property values.</p>
         */
        public Builder subAttributeValues(java.util.Map<String, java.util.List<AttributeValueInfoDTO>> subAttributeValues) {
            this.subAttributeValues = subAttributeValues;
            return this;
        }

        /**
         * <p>The enum value.</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * <p>The value name (translated).</p>
         */
        public Builder valueName(String valueName) {
            this.valueName = valueName;
            return this;
        }

        public AttributeValueInfoDTO build() {
            return new AttributeValueInfoDTO(this);
        } 

    } 

    /**
     * 
     * {@link AttributeValueInfoDTO} extends {@link TeaModel}
     *
     * <p>AttributeValueInfoDTO</p>
     */
    public static class BoundedValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LowerBound")
        private java.util.List<AttributeValueInfoDTO> lowerBound;

        @com.aliyun.core.annotation.NameInMap("UpperBound")
        private java.util.List<AttributeValueInfoDTO> upperBound;

        private BoundedValue(Builder builder) {
            this.lowerBound = builder.lowerBound;
            this.upperBound = builder.upperBound;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BoundedValue create() {
            return builder().build();
        }

        /**
         * @return lowerBound
         */
        public java.util.List<AttributeValueInfoDTO> getLowerBound() {
            return this.lowerBound;
        }

        /**
         * @return upperBound
         */
        public java.util.List<AttributeValueInfoDTO> getUpperBound() {
            return this.upperBound;
        }

        public static final class Builder {
            private java.util.List<AttributeValueInfoDTO> lowerBound; 
            private java.util.List<AttributeValueInfoDTO> upperBound; 

            private Builder() {
            } 

            private Builder(BoundedValue model) {
                this.lowerBound = model.lowerBound;
                this.upperBound = model.upperBound;
            } 

            /**
             * <p>The lower bound list.</p>
             */
            public Builder lowerBound(java.util.List<AttributeValueInfoDTO> lowerBound) {
                this.lowerBound = lowerBound;
                return this;
            }

            /**
             * <p>The upper bound list.</p>
             */
            public Builder upperBound(java.util.List<AttributeValueInfoDTO> upperBound) {
                this.upperBound = upperBound;
                return this;
            }

            public BoundedValue build() {
                return new BoundedValue(this);
            } 

        } 

    }
}
