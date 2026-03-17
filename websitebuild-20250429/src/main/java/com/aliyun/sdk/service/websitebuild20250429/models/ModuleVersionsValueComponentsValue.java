// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ModuleVersionsValueComponentsValue} extends {@link TeaModel}
 *
 * <p>ModuleVersionsValueComponentsValue</p>
 */
public class ModuleVersionsValueComponentsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComponentCode")
    private String componentCode;

    @com.aliyun.core.annotation.NameInMap("ComponentName")
    private String componentName;

    @com.aliyun.core.annotation.NameInMap("InstanceProperty")
    private java.util.List<InstanceProperty> instanceProperty;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.Map<String, ModuleVersionsValueComponentsValuePropertiesValue> properties;

    @com.aliyun.core.annotation.NameInMap("ModuleAttrStatus")
    private Integer moduleAttrStatus;

    private ModuleVersionsValueComponentsValue(Builder builder) {
        this.componentCode = builder.componentCode;
        this.componentName = builder.componentName;
        this.instanceProperty = builder.instanceProperty;
        this.properties = builder.properties;
        this.moduleAttrStatus = builder.moduleAttrStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleVersionsValueComponentsValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentCode
     */
    public String getComponentCode() {
        return this.componentCode;
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return instanceProperty
     */
    public java.util.List<InstanceProperty> getInstanceProperty() {
        return this.instanceProperty;
    }

    /**
     * @return properties
     */
    public java.util.Map<String, ModuleVersionsValueComponentsValuePropertiesValue> getProperties() {
        return this.properties;
    }

    /**
     * @return moduleAttrStatus
     */
    public Integer getModuleAttrStatus() {
        return this.moduleAttrStatus;
    }

    public static final class Builder {
        private String componentCode; 
        private String componentName; 
        private java.util.List<InstanceProperty> instanceProperty; 
        private java.util.Map<String, ModuleVersionsValueComponentsValuePropertiesValue> properties; 
        private Integer moduleAttrStatus; 

        private Builder() {
        } 

        private Builder(ModuleVersionsValueComponentsValue model) {
            this.componentCode = model.componentCode;
            this.componentName = model.componentName;
            this.instanceProperty = model.instanceProperty;
            this.properties = model.properties;
            this.moduleAttrStatus = model.moduleAttrStatus;
        } 

        /**
         * ComponentCode.
         */
        public Builder componentCode(String componentCode) {
            this.componentCode = componentCode;
            return this;
        }

        /**
         * ComponentName.
         */
        public Builder componentName(String componentName) {
            this.componentName = componentName;
            return this;
        }

        /**
         * InstanceProperty.
         */
        public Builder instanceProperty(java.util.List<InstanceProperty> instanceProperty) {
            this.instanceProperty = instanceProperty;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(java.util.Map<String, ModuleVersionsValueComponentsValuePropertiesValue> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * ModuleAttrStatus.
         */
        public Builder moduleAttrStatus(Integer moduleAttrStatus) {
            this.moduleAttrStatus = moduleAttrStatus;
            return this;
        }

        public ModuleVersionsValueComponentsValue build() {
            return new ModuleVersionsValueComponentsValue(this);
        } 

    } 

    /**
     * 
     * {@link ModuleVersionsValueComponentsValue} extends {@link TeaModel}
     *
     * <p>ModuleVersionsValueComponentsValue</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Values(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String value; 
            private String name; 

            private Builder() {
            } 

            private Builder(Values model) {
                this.code = model.code;
                this.value = model.value;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModuleVersionsValueComponentsValue} extends {@link TeaModel}
     *
     * <p>ModuleVersionsValueComponentsValue</p>
     */
    public static class InstanceProperty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<Values> values;

        private InstanceProperty(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.value = builder.value;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceProperty create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return values
         */
        public java.util.List<Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private String value; 
            private java.util.List<Values> values; 

            private Builder() {
            } 

            private Builder(InstanceProperty model) {
                this.code = model.code;
                this.name = model.name;
                this.value = model.value;
                this.values = model.values;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<Values> values) {
                this.values = values;
                return this;
            }

            public InstanceProperty build() {
                return new InstanceProperty(this);
            } 

        } 

    }
}
