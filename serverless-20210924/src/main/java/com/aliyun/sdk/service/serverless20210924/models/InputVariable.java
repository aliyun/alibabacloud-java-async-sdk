// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InputVariable} extends {@link TeaModel}
 *
 * <p>InputVariable</p>
 */
public class InputVariable extends TeaModel {
    @NameInMap("defaultJson")
    private String defaultJson;

    @NameInMap("description")
    private String description;

    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @NameInMap("nullable")
    private Boolean nullable;

    @NameInMap("sensitive")
    private Boolean sensitive;

    @NameInMap("type")
    private String type;

    private InputVariable(Builder builder) {
        this.defaultJson = builder.defaultJson;
        this.description = builder.description;
        this.name = builder.name;
        this.nullable = builder.nullable;
        this.sensitive = builder.sensitive;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InputVariable create() {
        return builder().build();
    }

    /**
     * @return defaultJson
     */
    public String getDefaultJson() {
        return this.defaultJson;
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
     * @return nullable
     */
    public Boolean getNullable() {
        return this.nullable;
    }

    /**
     * @return sensitive
     */
    public Boolean getSensitive() {
        return this.sensitive;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String defaultJson; 
        private String description; 
        private String name; 
        private Boolean nullable; 
        private Boolean sensitive; 
        private String type; 

        /**
         * A default value (as JSON string) which then makes the variable optional.
         */
        public Builder defaultJson(String defaultJson) {
            this.defaultJson = defaultJson;
            return this;
        }

        /**
         * This specifies the input variable"s documentation.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The identifier of an input variable. Identifiers can contain letters, digits, underscores (_), and hyphens (-). The first character of an identifier must not be a digit, to avoid ambiguity with literal numbers.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Specify if the variable can be null. True by default.
         */
        public Builder nullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * Specify if the variable contains sensitive material. False by default.
         */
        public Builder sensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        /**
         * This argument specifies what value types are accepted for the variable.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public InputVariable build() {
            return new InputVariable(this);
        } 

    } 

}
