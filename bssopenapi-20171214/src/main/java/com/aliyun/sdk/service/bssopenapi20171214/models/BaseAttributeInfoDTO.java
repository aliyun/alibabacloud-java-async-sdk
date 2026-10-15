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
 * {@link BaseAttributeInfoDTO} extends {@link TeaModel}
 *
 * <p>BaseAttributeInfoDTO</p>
 */
public class BaseAttributeInfoDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttributeCategories")
    private java.util.List<String> attributeCategories;

    @com.aliyun.core.annotation.NameInMap("AttributeSource")
    private String attributeSource;

    @com.aliyun.core.annotation.NameInMap("AttributeType")
    private String attributeType;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OperationalAttributeType")
    private String operationalAttributeType;

    @com.aliyun.core.annotation.NameInMap("Unit")
    private String unit;

    @com.aliyun.core.annotation.NameInMap("ValueType")
    private String valueType;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List<AttributeValueInfoDTO> values;

    private BaseAttributeInfoDTO(Builder builder) {
        this.attributeCategories = builder.attributeCategories;
        this.attributeSource = builder.attributeSource;
        this.attributeType = builder.attributeType;
        this.code = builder.code;
        this.description = builder.description;
        this.name = builder.name;
        this.operationalAttributeType = builder.operationalAttributeType;
        this.unit = builder.unit;
        this.valueType = builder.valueType;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BaseAttributeInfoDTO create() {
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
     * @return operationalAttributeType
     */
    public String getOperationalAttributeType() {
        return this.operationalAttributeType;
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
        private String description; 
        private String name; 
        private String operationalAttributeType; 
        private String unit; 
        private String valueType; 
        private java.util.List<AttributeValueInfoDTO> values; 

        private Builder() {
        } 

        private Builder(BaseAttributeInfoDTO model) {
            this.attributeCategories = model.attributeCategories;
            this.attributeSource = model.attributeSource;
            this.attributeType = model.attributeType;
            this.code = model.code;
            this.description = model.description;
            this.name = model.name;
            this.operationalAttributeType = model.operationalAttributeType;
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
         * <p>The property description (translated).</p>
         */
        public Builder description(String description) {
            this.description = description;
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
         * <p>The O&amp;M property type.</p>
         */
        public Builder operationalAttributeType(String operationalAttributeType) {
            this.operationalAttributeType = operationalAttributeType;
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

        public BaseAttributeInfoDTO build() {
            return new BaseAttributeInfoDTO(this);
        } 

    } 

}
