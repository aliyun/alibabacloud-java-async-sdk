// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerraformOutputValue} extends {@link TeaModel}
 *
 * <p>TerraformOutputValue</p>
 */
public class TerraformOutputValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("sensitive")
    private Boolean sensitive;

    private TerraformOutputValue(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.sensitive = builder.sensitive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TerraformOutputValue create() {
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
         * sensitive.
         */
        public Builder sensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        public TerraformOutputValue build() {
            return new TerraformOutputValue(this);
        } 

    } 

}
