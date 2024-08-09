// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Property} extends {@link TeaModel}
 *
 * <p>Property</p>
 */
public class Property extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("defaultValue")
    private String defaultValue;

    @com.aliyun.core.annotation.NameInMap("definesFormat")
    private Boolean definesFormat;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("required")
    private Boolean required;

    @com.aliyun.core.annotation.NameInMap("sensitive")
    private Boolean sensitive;

    private Property(Builder builder) {
        this.defaultValue = builder.defaultValue;
        this.definesFormat = builder.definesFormat;
        this.description = builder.description;
        this.key = builder.key;
        this.required = builder.required;
        this.sensitive = builder.sensitive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Property create() {
        return builder().build();
    }

    /**
     * @return defaultValue
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @return definesFormat
     */
    public Boolean getDefinesFormat() {
        return this.definesFormat;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return required
     */
    public Boolean getRequired() {
        return this.required;
    }

    /**
     * @return sensitive
     */
    public Boolean getSensitive() {
        return this.sensitive;
    }

    public static final class Builder {
        private String defaultValue; 
        private Boolean definesFormat; 
        private String description; 
        private String key; 
        private Boolean required; 
        private Boolean sensitive; 

        /**
         * defaultValue.
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * definesFormat.
         */
        public Builder definesFormat(Boolean definesFormat) {
            this.definesFormat = definesFormat;
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
         * key.
         */
        public Builder key(String key) {
            this.key = key;
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
         * sensitive.
         */
        public Builder sensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        public Property build() {
            return new Property(this);
        } 

    } 

}
