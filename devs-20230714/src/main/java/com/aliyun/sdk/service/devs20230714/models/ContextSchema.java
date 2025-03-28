// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ContextSchema} extends {@link TeaModel}
 *
 * <p>ContextSchema</p>
 */
public class ContextSchema extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("hint")
    private String hint;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("required")
    private Boolean required;

    @com.aliyun.core.annotation.NameInMap("type")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ContextSchema model) {
            this.description = model.description;
            this.hint = model.hint;
            this.name = model.name;
            this.required = model.required;
            this.type = model.type;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * hint.
         */
        public Builder hint(String hint) {
            this.hint = hint;
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

        public ContextSchema build() {
            return new ContextSchema(this);
        } 

    } 

}
