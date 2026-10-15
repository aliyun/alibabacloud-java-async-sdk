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
 * {@link AttributeInfoDTO} extends {@link TeaModel}
 *
 * <p>AttributeInfoDTO</p>
 */
public class AttributeInfoDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttributeCategories")
    private java.util.List<String> attributeCategories;

    @com.aliyun.core.annotation.NameInMap("AttributeSource")
    private String attributeSource;

    @com.aliyun.core.annotation.NameInMap("AttributeType")
    private String attributeType;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CompositeAttributes")
    private java.util.List<BaseAttributeInfoDTO> compositeAttributes;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DescriptionAttributes")
    private java.util.List<BaseAttributeInfoDTO> descriptionAttributes;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OperationalAttributeConfig")
    private String operationalAttributeConfig;

    @com.aliyun.core.annotation.NameInMap("OperationalAttributeType")
    private String operationalAttributeType;

    @com.aliyun.core.annotation.NameInMap("SubAttributes")
    private java.util.List<AttributeInfoDTO> subAttributes;

    @com.aliyun.core.annotation.NameInMap("Unit")
    private String unit;

    @com.aliyun.core.annotation.NameInMap("ValueType")
    private String valueType;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List<AttributeValueInfoDTO> values;

    private AttributeInfoDTO(Builder builder) {
        this.attributeCategories = builder.attributeCategories;
        this.attributeSource = builder.attributeSource;
        this.attributeType = builder.attributeType;
        this.code = builder.code;
        this.compositeAttributes = builder.compositeAttributes;
        this.description = builder.description;
        this.descriptionAttributes = builder.descriptionAttributes;
        this.name = builder.name;
        this.operationalAttributeConfig = builder.operationalAttributeConfig;
        this.operationalAttributeType = builder.operationalAttributeType;
        this.subAttributes = builder.subAttributes;
        this.unit = builder.unit;
        this.valueType = builder.valueType;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttributeInfoDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributeCategories
     */
    public java.util.List<String> getAttributeCategories() {
        return this.attributeCategories;
    }

    /**
     * @return attributeSource
     */
    public String getAttributeSource() {
        return this.attributeSource;
    }

    /**
     * @return attributeType
     */
    public String getAttributeType() {
        return this.attributeType;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return compositeAttributes
     */
    public java.util.List<BaseAttributeInfoDTO> getCompositeAttributes() {
        return this.compositeAttributes;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return descriptionAttributes
     */
    public java.util.List<BaseAttributeInfoDTO> getDescriptionAttributes() {
        return this.descriptionAttributes;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operationalAttributeConfig
     */
    public String getOperationalAttributeConfig() {
        return this.operationalAttributeConfig;
    }

    /**
     * @return operationalAttributeType
     */
    public String getOperationalAttributeType() {
        return this.operationalAttributeType;
    }

    /**
     * @return subAttributes
     */
    public java.util.List<AttributeInfoDTO> getSubAttributes() {
        return this.subAttributes;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * @return valueType
     */
    public String getValueType() {
        return this.valueType;
    }

    /**
     * @return values
     */
    public java.util.List<AttributeValueInfoDTO> getValues() {
        return this.values;
    }

    public static final class Builder {
        private java.util.List<String> attributeCategories; 
        private String attributeSource; 
        private String attributeType; 
        private String code; 
        private java.util.List<BaseAttributeInfoDTO> compositeAttributes; 
        private String description; 
        private java.util.List<BaseAttributeInfoDTO> descriptionAttributes; 
        private String name; 
        private String operationalAttributeConfig; 
        private String operationalAttributeType; 
        private java.util.List<AttributeInfoDTO> subAttributes; 
        private String unit; 
        private String valueType; 
        private java.util.List<AttributeValueInfoDTO> values; 

        private Builder() {
        } 

        private Builder(AttributeInfoDTO model) {
            this.attributeCategories = model.attributeCategories;
            this.attributeSource = model.attributeSource;
            this.attributeType = model.attributeType;
            this.code = model.code;
            this.compositeAttributes = model.compositeAttributes;
            this.description = model.description;
            this.descriptionAttributes = model.descriptionAttributes;
            this.name = model.name;
            this.operationalAttributeConfig = model.operationalAttributeConfig;
            this.operationalAttributeType = model.operationalAttributeType;
            this.subAttributes = model.subAttributes;
            this.unit = model.unit;
            this.valueType = model.valueType;
            this.values = model.values;
        } 

        /**
         * <p>The property categories.</p>
         */
        public Builder attributeCategories(java.util.List<String> attributeCategories) {
            this.attributeCategories = attributeCategories;
            return this;
        }

        /**
         * <p>The property source.</p>
         */
        public Builder attributeSource(String attributeSource) {
            this.attributeSource = attributeSource;
            return this;
        }

        /**
         * <p>The property type.</p>
         */
        public Builder attributeType(String attributeType) {
            this.attributeType = attributeType;
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
         * <p>The composite properties (basic information).</p>
         */
        public Builder compositeAttributes(java.util.List<BaseAttributeInfoDTO> compositeAttributes) {
            this.compositeAttributes = compositeAttributes;
            return this;
        }

        /**
         * <p>The property description (translated).</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The description properties (basic information).</p>
         */
        public Builder descriptionAttributes(java.util.List<BaseAttributeInfoDTO> descriptionAttributes) {
            this.descriptionAttributes = descriptionAttributes;
            return this;
        }

        /**
         * <p>The property name (translated).</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The O&amp;M property configuration.</p>
         */
        public Builder operationalAttributeConfig(String operationalAttributeConfig) {
            this.operationalAttributeConfig = operationalAttributeConfig;
            return this;
        }

        /**
         * <p>The O&amp;M property type.</p>
         */
        public Builder operationalAttributeType(String operationalAttributeType) {
            this.operationalAttributeType = operationalAttributeType;
            return this;
        }

        /**
         * <p>The sub-properties (complete information).</p>
         */
        public Builder subAttributes(java.util.List<AttributeInfoDTO> subAttributes) {
            this.subAttributes = subAttributes;
            return this;
        }

        /**
         * <p>The unit.</p>
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        /**
         * <p>The value type.</p>
         */
        public Builder valueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        /**
         * <p>The property value list.</p>
         */
        public Builder values(java.util.List<AttributeValueInfoDTO> values) {
            this.values = values;
            return this;
        }

        public AttributeInfoDTO build() {
            return new AttributeInfoDTO(this);
        } 

    } 

}
