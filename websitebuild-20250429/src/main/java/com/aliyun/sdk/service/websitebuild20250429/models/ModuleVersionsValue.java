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
 * {@link ModuleVersionsValue} extends {@link TeaModel}
 *
 * <p>ModuleVersionsValue</p>
 */
public class ModuleVersionsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Components")
    private java.util.Map<String, ModuleVersionsValueComponentsValue> components;

    private ModuleVersionsValue(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.components = builder.components;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleVersionsValue create() {
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
     * @return components
     */
    public java.util.Map<String, ModuleVersionsValueComponentsValue> getComponents() {
        return this.components;
    }

    public static final class Builder {
        private String code; 
        private String name; 
        private java.util.Map<String, ModuleVersionsValueComponentsValue> components; 

        private Builder() {
        } 

        private Builder(ModuleVersionsValue model) {
            this.code = model.code;
            this.name = model.name;
            this.components = model.components;
        } 

        /**
         * <p>code</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>name</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>components</p>
         */
        public Builder components(java.util.Map<String, ModuleVersionsValueComponentsValue> components) {
            this.components = components;
            return this;
        }

        public ModuleVersionsValue build() {
            return new ModuleVersionsValue(this);
        } 

    } 

}
