// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StandardComponentsValue} extends {@link TeaModel}
 *
 * <p>StandardComponentsValue</p>
 */
public class StandardComponentsValue extends TeaModel {
    @NameInMap("name")
    private String name;

    @NameInMap("version")
    private String version;

    @NameInMap("description")
    private String description;

    @NameInMap("required")
    private String required;

    @NameInMap("disabled")
    private Boolean disabled;

    private StandardComponentsValue(Builder builder) {
        this.name = builder.name;
        this.version = builder.version;
        this.description = builder.description;
        this.required = builder.required;
        this.disabled = builder.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StandardComponentsValue create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return required
     */
    public String getRequired() {
        return this.required;
    }

    /**
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
    }

    public static final class Builder {
        private String name; 
        private String version; 
        private String description; 
        private String required; 
        private Boolean disabled; 

        /**
         * The name of the component.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The version of the component.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * The description of the component.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Indicates whether the component is a required component. Valid values:
         * <p>
         * 
         * *   `true`: The component is required and must be installed when a cluster is created.
         * *   `false`: The component is optional. After a cluster is created, you can go to the `Add-ons` page to install the component.
         */
        public Builder required(String required) {
            this.required = required;
            return this;
        }

        /**
         * Indicates whether the automatic installation of the component is disabled. By default, some optional components, such as components for logging and Ingresses, are installed when a cluster is created. You can set this parameter to disable automatic component installation. Valid values:
         * <p>
         * 
         * *   `true`: disables automatic component installation.
         * *   `false`: enables automatic component installation.
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        public StandardComponentsValue build() {
            return new StandardComponentsValue(this);
        } 

    } 

}
