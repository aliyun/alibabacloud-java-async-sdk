// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContextSchema} extends {@link TeaModel}
 *
 * <p>ContextSchema</p>
 */
public class ContextSchema extends TeaModel {
    @NameInMap("description")
    private String description;

    @NameInMap("hint")
    private String hint;

    @NameInMap("name")
    private String name;

    @NameInMap("required")
    private Boolean required;

    @NameInMap("type")
    private String type;

    private ContextSchema(Builder builder) {
        this.description = builder.description;
        this.hint = builder.hint;
        this.name = builder.name;
        this.required = builder.required;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContextSchema create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hint
     */
    public String getHint() {
        return this.hint;
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
        private String description; 
        private String hint; 
        private String name; 
        private Boolean required; 
        private String type; 

        /**
         * Field description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Field example.
         */
        public Builder hint(String hint) {
            this.hint = hint;
            return this;
        }

        /**
         * Field name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Field is required or not.
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }

        /**
         * Field type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ContextSchema build() {
            return new ContextSchema(this);
        } 

    } 

}
