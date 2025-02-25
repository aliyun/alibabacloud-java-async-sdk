// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GrafanaWorkspaceIniProperty} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceIniProperty</p>
 */
public class GrafanaWorkspaceIniProperty extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("defaultValue")
    private String defaultValue;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("example")
    private String example;

    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("secret")
    private Boolean secret;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private GrafanaWorkspaceIniProperty(Builder builder) {
        this.defaultValue = builder.defaultValue;
        this.description = builder.description;
        this.example = builder.example;
        this.key = builder.key;
        this.secret = builder.secret;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceIniProperty create() {
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
     * @return example
     */
    public String getExample() {
        return this.example;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return secret
     */
    public Boolean getSecret() {
        return this.secret;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String defaultValue; 
        private String description; 
        private String example; 
        private String key; 
        private Boolean secret; 
        private String value; 

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
         * example.
         */
        public Builder example(String example) {
            this.example = example;
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
         * secret.
         */
        public Builder secret(Boolean secret) {
            this.secret = secret;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public GrafanaWorkspaceIniProperty build() {
            return new GrafanaWorkspaceIniProperty(this);
        } 

    } 

}
