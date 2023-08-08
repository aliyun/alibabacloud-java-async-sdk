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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * required.
         */
        public Builder required(String required) {
            this.required = required;
            return this;
        }

        /**
         * disabled.
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
