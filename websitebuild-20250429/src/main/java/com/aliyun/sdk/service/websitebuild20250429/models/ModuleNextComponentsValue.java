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
 * {@link ModuleNextComponentsValue} extends {@link TeaModel}
 *
 * <p>ModuleNextComponentsValue</p>
 */
public class ModuleNextComponentsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("InstanceProperty")
    private java.util.List<InstanceProperty> instanceProperty;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.Map<String, ModuleNextComponentsValuePropertiesValue> properties;

    @com.aliyun.core.annotation.NameInMap("ModuleAttrStatus")
    private Integer moduleAttrStatus;

    private ModuleNextComponentsValue(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.instanceProperty = builder.instanceProperty;
        this.properties = builder.properties;
        this.moduleAttrStatus = builder.moduleAttrStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleNextComponentsValue create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
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
    public java.util.Map<String, ModuleNextComponentsValuePropertiesValue> getProperties() {
        return this.properties;
    }

    /**
     * @return moduleAttrStatus
     */
    public Integer getModuleAttrStatus() {
        return this.moduleAttrStatus;
    }

    public static final class Builder {
        private String code; 
        private String name; 
        private java.util.List<InstanceProperty> instanceProperty; 
        private java.util.Map<String, ModuleNextComponentsValuePropertiesValue> properties; 
        private Integer moduleAttrStatus; 

        private Builder() {
        } 

        private Builder(ModuleNextComponentsValue model) {
            this.code = model.code;
            this.name = model.name;
            this.instanceProperty = model.instanceProperty;
            this.properties = model.properties;
            this.moduleAttrStatus = model.moduleAttrStatus;
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
         * InstanceProperty.
         */
        public Builder instanceProperty(java.util.List<InstanceProperty> instanceProperty) {
            this.instanceProperty = instanceProperty;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(java.util.Map<String, ModuleNextComponentsValuePropertiesValue> properties) {
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

        public ModuleNextComponentsValue build() {
            return new ModuleNextComponentsValue(this);
        } 

    } 

    /**
     * 
     * {@link ModuleNextComponentsValue} extends {@link TeaModel}
     *
     * <p>ModuleNextComponentsValue</p>
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
     * {@link ModuleNextComponentsValue} extends {@link TeaModel}
     *
     * <p>ModuleNextComponentsValue</p>
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
