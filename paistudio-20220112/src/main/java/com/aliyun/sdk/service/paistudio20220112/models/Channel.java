// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link Channel} extends {@link TeaModel}
 *
 * <p>Channel</p>
 */
public class Channel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.Map<String, ?> properties;

    @com.aliyun.core.annotation.NameInMap("Required")
    private Boolean required;

    @com.aliyun.core.annotation.NameInMap("SupportedChannelTypes")
    private java.util.List<String> supportedChannelTypes;

    private Channel(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.properties = builder.properties;
        this.required = builder.required;
        this.supportedChannelTypes = builder.supportedChannelTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Channel create() {
        return builder().build();
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
     * @return properties
     */
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    /**
     * @return required
     */
    public Boolean getRequired() {
        return this.required;
    }

    /**
     * @return supportedChannelTypes
     */
    public java.util.List<String> getSupportedChannelTypes() {
        return this.supportedChannelTypes;
    }

    public static final class Builder {
        private String description; 
        private String name; 
        private java.util.Map<String, ?> properties; 
        private Boolean required; 
        private java.util.List<String> supportedChannelTypes; 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Required.
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }

        /**
         * SupportedChannelTypes.
         */
        public Builder supportedChannelTypes(java.util.List<String> supportedChannelTypes) {
            this.supportedChannelTypes = supportedChannelTypes;
            return this;
        }

        public Channel build() {
            return new Channel(this);
        } 

    } 

}
