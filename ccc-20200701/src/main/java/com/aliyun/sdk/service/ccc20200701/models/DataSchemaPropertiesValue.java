// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link DataSchemaPropertiesValue} extends {@link TeaModel}
 *
 * <p>DataSchemaPropertiesValue</p>
 */
public class DataSchemaPropertiesValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("Pattern")
    private String pattern;

    @com.aliyun.core.annotation.NameInMap("PatternErrorMessage")
    private String patternErrorMessage;

    @com.aliyun.core.annotation.NameInMap("MinLength")
    private Integer minLength;

    @com.aliyun.core.annotation.NameInMap("MaxLength")
    private Integer maxLength;

    @com.aliyun.core.annotation.NameInMap("Minimum")
    private Double minimum;

    @com.aliyun.core.annotation.NameInMap("Maximum")
    private Double maximum;

    @com.aliyun.core.annotation.NameInMap("Required")
    private Boolean required;

    @com.aliyun.core.annotation.NameInMap("System")
    private Boolean system;

    @com.aliyun.core.annotation.NameInMap("Disabled")
    private Boolean disabled;

    @com.aliyun.core.annotation.NameInMap("Array")
    private Boolean array;

    @com.aliyun.core.annotation.NameInMap("ReadOnly")
    private Boolean readOnly;

    @com.aliyun.core.annotation.NameInMap("EditorType")
    private String editorType;

    @com.aliyun.core.annotation.NameInMap("Attributes")
    private String attributes;

    @com.aliyun.core.annotation.NameInMap("DisplayOrder")
    private Integer displayOrder;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private Long createdTime;

    @com.aliyun.core.annotation.NameInMap("UpdatedTime")
    private Long updatedTime;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    private DataSchemaPropertiesValue(Builder builder) {
        this.displayName = builder.displayName;
        this.description = builder.description;
        this.name = builder.name;
        this.dataType = builder.dataType;
        this.pattern = builder.pattern;
        this.patternErrorMessage = builder.patternErrorMessage;
        this.minLength = builder.minLength;
        this.maxLength = builder.maxLength;
        this.minimum = builder.minimum;
        this.maximum = builder.maximum;
        this.required = builder.required;
        this.system = builder.system;
        this.disabled = builder.disabled;
        this.array = builder.array;
        this.readOnly = builder.readOnly;
        this.editorType = builder.editorType;
        this.attributes = builder.attributes;
        this.displayOrder = builder.displayOrder;
        this.createdTime = builder.createdTime;
        this.updatedTime = builder.updatedTime;
        this.creator = builder.creator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSchemaPropertiesValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return pattern
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * @return patternErrorMessage
     */
    public String getPatternErrorMessage() {
        return this.patternErrorMessage;
    }

    /**
     * @return minLength
     */
    public Integer getMinLength() {
        return this.minLength;
    }

    /**
     * @return maxLength
     */
    public Integer getMaxLength() {
        return this.maxLength;
    }

    /**
     * @return minimum
     */
    public Double getMinimum() {
        return this.minimum;
    }

    /**
     * @return maximum
     */
    public Double getMaximum() {
        return this.maximum;
    }

    /**
     * @return required
     */
    public Boolean getRequired() {
        return this.required;
    }

    /**
     * @return system
     */
    public Boolean getSystem() {
        return this.system;
    }

    /**
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * @return array
     */
    public Boolean getArray() {
        return this.array;
    }

    /**
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * @return editorType
     */
    public String getEditorType() {
        return this.editorType;
    }

    /**
     * @return attributes
     */
    public String getAttributes() {
        return this.attributes;
    }

    /**
     * @return displayOrder
     */
    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    /**
     * @return createdTime
     */
    public Long getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return updatedTime
     */
    public Long getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    public static final class Builder {
        private String displayName; 
        private String description; 
        private String name; 
        private String dataType; 
        private String pattern; 
        private String patternErrorMessage; 
        private Integer minLength; 
        private Integer maxLength; 
        private Double minimum; 
        private Double maximum; 
        private Boolean required; 
        private Boolean system; 
        private Boolean disabled; 
        private Boolean array; 
        private Boolean readOnly; 
        private String editorType; 
        private String attributes; 
        private Integer displayOrder; 
        private Long createdTime; 
        private Long updatedTime; 
        private String creator; 

        private Builder() {
        } 

        private Builder(DataSchemaPropertiesValue model) {
            this.displayName = model.displayName;
            this.description = model.description;
            this.name = model.name;
            this.dataType = model.dataType;
            this.pattern = model.pattern;
            this.patternErrorMessage = model.patternErrorMessage;
            this.minLength = model.minLength;
            this.maxLength = model.maxLength;
            this.minimum = model.minimum;
            this.maximum = model.maximum;
            this.required = model.required;
            this.system = model.system;
            this.disabled = model.disabled;
            this.array = model.array;
            this.readOnly = model.readOnly;
            this.editorType = model.editorType;
            this.attributes = model.attributes;
            this.displayOrder = model.displayOrder;
            this.createdTime = model.createdTime;
            this.updatedTime = model.updatedTime;
            this.creator = model.creator;
        } 

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
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
         * PatternErrorMessage.
         */
        public Builder patternErrorMessage(String patternErrorMessage) {
            this.patternErrorMessage = patternErrorMessage;
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
         * MaxLength.
         */
        public Builder maxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        /**
         * Minimum.
         */
        public Builder minimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }

        /**
         * Maximum.
         */
        public Builder maximum(Double maximum) {
            this.maximum = maximum;
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
         * System.
         */
        public Builder system(Boolean system) {
            this.system = system;
            return this;
        }

        /**
         * Disabled.
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * Array.
         */
        public Builder array(Boolean array) {
            this.array = array;
            return this;
        }

        /**
         * ReadOnly.
         */
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
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
         * Attributes.
         */
        public Builder attributes(String attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * DisplayOrder.
         */
        public Builder displayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }

        /**
         * CreatedTime.
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * UpdatedTime.
         */
        public Builder updatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public DataSchemaPropertiesValue build() {
            return new DataSchemaPropertiesValue(this);
        } 

    } 

}
