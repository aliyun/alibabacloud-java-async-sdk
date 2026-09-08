// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(HttpApiParameter model) {
            this.defaultValue = model.defaultValue;
            this.description = model.description;
            this.exampleValue = model.exampleValue;
            this.name = model.name;
            this.required = model.required;
            this.type = model.type;
        } 

        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>The example description.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The sample value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder exampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }

        /**
         * <p>The parameter name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>userId</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies whether the parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }

        /**
         * <p>The parameter type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Integer</li>
         * <li>Number</li>
         * <li>String</li>
         * <li>Boolean</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
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
