// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20250903.models;

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
 * {@link FieldInputConfig} extends {@link TeaModel}
 *
 * <p>FieldInputConfig</p>
 */
public class FieldInputConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arrayed")
    private Boolean arrayed;

    @com.aliyun.core.annotation.NameInMap("DefaultValue")
    private String defaultValue;

    @com.aliyun.core.annotation.NameInMap("FieldCheckRegex")
    private String fieldCheckRegex;

    @com.aliyun.core.annotation.NameInMap("FieldClass")
    private String fieldClass;

    @com.aliyun.core.annotation.NameInMap("FieldConfigs")
    private java.util.List<FieldInputConfig> fieldConfigs;

    @com.aliyun.core.annotation.NameInMap("FieldDescription")
    private String fieldDescription;

    @com.aliyun.core.annotation.NameInMap("FieldExample")
    private String fieldExample;

    @com.aliyun.core.annotation.NameInMap("FieldName")
    private String fieldName;

    @com.aliyun.core.annotation.NameInMap("FieldPath")
    private String fieldPath;

    @com.aliyun.core.annotation.NameInMap("FieldType")
    private String fieldType;

    @com.aliyun.core.annotation.NameInMap("Required")
    private Boolean required;

    private FieldInputConfig(Builder builder) {
        this.arrayed = builder.arrayed;
        this.defaultValue = builder.defaultValue;
        this.fieldCheckRegex = builder.fieldCheckRegex;
        this.fieldClass = builder.fieldClass;
        this.fieldConfigs = builder.fieldConfigs;
        this.fieldDescription = builder.fieldDescription;
        this.fieldExample = builder.fieldExample;
        this.fieldName = builder.fieldName;
        this.fieldPath = builder.fieldPath;
        this.fieldType = builder.fieldType;
        this.required = builder.required;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FieldInputConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arrayed
     */
    public Boolean getArrayed() {
        return this.arrayed;
    }

    /**
     * @return defaultValue
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @return fieldCheckRegex
     */
    public String getFieldCheckRegex() {
        return this.fieldCheckRegex;
    }

    /**
     * @return fieldClass
     */
    public String getFieldClass() {
        return this.fieldClass;
    }

    /**
     * @return fieldConfigs
     */
    public java.util.List<FieldInputConfig> getFieldConfigs() {
        return this.fieldConfigs;
    }

    /**
     * @return fieldDescription
     */
    public String getFieldDescription() {
        return this.fieldDescription;
    }

    /**
     * @return fieldExample
     */
    public String getFieldExample() {
        return this.fieldExample;
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return fieldPath
     */
    public String getFieldPath() {
        return this.fieldPath;
    }

    /**
     * @return fieldType
     */
    public String getFieldType() {
        return this.fieldType;
    }

    /**
     * @return required
     */
    public Boolean getRequired() {
        return this.required;
    }

    public static final class Builder {
        private Boolean arrayed; 
        private String defaultValue; 
        private String fieldCheckRegex; 
        private String fieldClass; 
        private java.util.List<FieldInputConfig> fieldConfigs; 
        private String fieldDescription; 
        private String fieldExample; 
        private String fieldName; 
        private String fieldPath; 
        private String fieldType; 
        private Boolean required; 

        private Builder() {
        } 

        private Builder(FieldInputConfig model) {
            this.arrayed = model.arrayed;
            this.defaultValue = model.defaultValue;
            this.fieldCheckRegex = model.fieldCheckRegex;
            this.fieldClass = model.fieldClass;
            this.fieldConfigs = model.fieldConfigs;
            this.fieldDescription = model.fieldDescription;
            this.fieldExample = model.fieldExample;
            this.fieldName = model.fieldName;
            this.fieldPath = model.fieldPath;
            this.fieldType = model.fieldType;
            this.required = model.required;
        } 

        /**
         * Arrayed.
         */
        public Builder arrayed(Boolean arrayed) {
            this.arrayed = arrayed;
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
         * FieldCheckRegex.
         */
        public Builder fieldCheckRegex(String fieldCheckRegex) {
            this.fieldCheckRegex = fieldCheckRegex;
            return this;
        }

        /**
         * FieldClass.
         */
        public Builder fieldClass(String fieldClass) {
            this.fieldClass = fieldClass;
            return this;
        }

        /**
         * FieldConfigs.
         */
        public Builder fieldConfigs(java.util.List<FieldInputConfig> fieldConfigs) {
            this.fieldConfigs = fieldConfigs;
            return this;
        }

        /**
         * FieldDescription.
         */
        public Builder fieldDescription(String fieldDescription) {
            this.fieldDescription = fieldDescription;
            return this;
        }

        /**
         * FieldExample.
         */
        public Builder fieldExample(String fieldExample) {
            this.fieldExample = fieldExample;
            return this;
        }

        /**
         * FieldName.
         */
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }

        /**
         * FieldPath.
         */
        public Builder fieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        /**
         * FieldType.
         */
        public Builder fieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        /**
         * Required.
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }

        public FieldInputConfig build() {
            return new FieldInputConfig(this);
        } 

    } 

}
