// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerraformInputVariable} extends {@link TeaModel}
 *
 * <p>TerraformInputVariable</p>
 */
public class TerraformInputVariable extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("defaultJson")
    private String defaultJson;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("nullable")
    private Boolean nullable;

    @com.aliyun.core.annotation.NameInMap("sensitive")
    private Boolean sensitive;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private TerraformInputVariable(Builder builder) {
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

    public static TerraformInputVariable create() {
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
         * defaultJson.
         */
        public Builder defaultJson(String defaultJson) {
            this.defaultJson = defaultJson;
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * nullable.
         */
        public Builder nullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * sensitive.
         */
        public Builder sensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public TerraformInputVariable build() {
            return new TerraformInputVariable(this);
        } 

    } 

}
