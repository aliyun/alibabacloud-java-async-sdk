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
 * {@link AttributeDetailDTO} extends {@link TeaModel}
 *
 * <p>AttributeDetailDTO</p>
 */
public class AttributeDetailDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DefaultValue")
    private String defaultValue;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List<Values> values;

    private AttributeDetailDTO(Builder builder) {
        this.code = builder.code;
        this.defaultValue = builder.defaultValue;
        this.status = builder.status;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttributeDetailDTO create() {
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
     * @return defaultValue
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return values
     */
    public java.util.List<Values> getValues() {
        return this.values;
    }

    public static final class Builder {
        private String code; 
        private String defaultValue; 
        private String status; 
        private java.util.List<Values> values; 

        private Builder() {
        } 

        private Builder(AttributeDetailDTO model) {
            this.code = model.code;
            this.defaultValue = model.defaultValue;
            this.status = model.status;
            this.values = model.values;
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
         * <p>The property status.</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The list of valid values for the property.</p>
         */
        public Builder values(java.util.List<Values> values) {
            this.values = values;
            return this;
        }

        public AttributeDetailDTO build() {
            return new AttributeDetailDTO(this);
        } 

    } 

    /**
     * 
     * {@link AttributeDetailDTO} extends {@link TeaModel}
     *
     * <p>AttributeDetailDTO</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CascadingAttributeValues")
        private java.util.List<AttributeDetailDTO> cascadingAttributeValues;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Values(Builder builder) {
            this.cascadingAttributeValues = builder.cascadingAttributeValues;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return cascadingAttributeValues
         */
        public java.util.List<AttributeDetailDTO> getCascadingAttributeValues() {
            return this.cascadingAttributeValues;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List<AttributeDetailDTO> cascadingAttributeValues; 
            private String value; 

            private Builder() {
            } 

            private Builder(Values model) {
                this.cascadingAttributeValues = model.cascadingAttributeValues;
                this.value = model.value;
            } 

            /**
             * <p>The list of cascading property values (recursive structure).</p>
             */
            public Builder cascadingAttributeValues(java.util.List<AttributeDetailDTO> cascadingAttributeValues) {
                this.cascadingAttributeValues = cascadingAttributeValues;
                return this;
            }

            /**
             * <p>The property value, which corresponds to the identifyKey in the property value definition.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
}
