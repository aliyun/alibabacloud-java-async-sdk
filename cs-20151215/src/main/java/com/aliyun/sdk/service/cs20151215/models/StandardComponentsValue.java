// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link StandardComponentsValue} extends {@link TeaModel}
 *
 * <p>StandardComponentsValue</p>
 */
public class StandardComponentsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("required")
    private String required;

    @com.aliyun.core.annotation.NameInMap("disabled")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(StandardComponentsValue model) {
            this.name = model.name;
            this.version = model.version;
            this.description = model.description;
            this.required = model.required;
            this.disabled = model.disabled;
        } 

        /**
         * <p>The name of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>ack-arena</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The version of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The description of the component.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the component is a required component. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The component is required and must be installed when a cluster is created.</li>
         * <li><code>false</code>: The component is optional. After a cluster is created, you can go to the <code>Add-ons</code> page to install the component.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder required(String required) {
            this.required = required;
            return this;
        }

        /**
         * <p>Indicates whether the automatic installation of the component is disabled. By default, some optional components, such as components for logging and Ingresses, are installed when a cluster is created. You can set this parameter to disable automatic component installation. Valid values:</p>
         * <ul>
         * <li><code>true</code>: disables automatic component installation.</li>
         * <li><code>false</code>: enables automatic component installation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
