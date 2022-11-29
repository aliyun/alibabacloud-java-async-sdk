// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OutputValue} extends {@link TeaModel}
 *
 * <p>OutputValue</p>
 */
public class OutputValue extends TeaModel {
    @NameInMap("description")
    private String description;

    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @NameInMap("sensitive")
    private Boolean sensitive;

    private OutputValue(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.sensitive = builder.sensitive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OutputValue create() {
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
     * @return sensitive
     */
    public Boolean getSensitive() {
        return this.sensitive;
    }

    public static final class Builder {
        private String description; 
        private String name; 
        private Boolean sensitive; 

        /**
         * The description should concisely explain the purpose of the output and what kind of value is expected.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The identifier of an output value. Identifiers can contain letters, digits, underscores (_), and hyphens (-). The first character of an identifier must not be a digit, to avoid ambiguity with literal numbers.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Specify if the output value contains sensitive material. False by default.
         */
        public Builder sensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        public OutputValue build() {
            return new OutputValue(this);
        } 

    } 

}
