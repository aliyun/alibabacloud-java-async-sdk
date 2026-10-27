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
         * <p>The description of the component features.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether the component is required for the cluster. Valid values:</p>
         * <ul>
         * <li><p>true: The component is required and must be installed when the cluster is created.</p>
         * </li>
         * <li><p>false: The component is not required. You can install it in the Components module after the cluster is created.</p>
         * </li>
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
         * <p>Specifies whether to disable the default installation of the component. When a cluster is created, components required for the cluster are installed. In addition, some components related to logs or routing, such as Ingress, are installed by default. If you do not want to install these components by default, you can set this parameter to disable the default installation. Valid values:</p>
         * <ul>
         * <li>true: disables the default installation.</li>
         * <li>false: enables the default installation.</li>
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
