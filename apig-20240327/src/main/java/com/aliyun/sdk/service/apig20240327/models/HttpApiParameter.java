// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HttpApiParameter} extends {@link TeaModel}
 *
 * <p>HttpApiParameter</p>
 */
public class HttpApiParameter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("defaultValue")
    private String defaultValue;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("exampleValue")
    private String exampleValue;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("required")
    private Boolean required;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private HttpApiParameter(Builder builder) {
        this.defaultValue = builder.defaultValue;
        this.description = builder.description;
        this.exampleValue = builder.exampleValue;
        this.name = builder.name;
        this.required = builder.required;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiParameter create() {
        return builder().build();
    }

    /**
     * @return defaultValue
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return exampleValue
     */
    public String getExampleValue() {
        return this.exampleValue;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return required
     */
    public Boolean getRequired() {
        return this.required;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String defaultValue; 
        private String description; 
        private String exampleValue; 
        private String name; 
        private Boolean required; 
        private String type; 

        /**
         * defaultValue.
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
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
         * exampleValue.
         */
        public Builder exampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * required.
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public HttpApiParameter build() {
            return new HttpApiParameter(this);
        } 

    } 

}
