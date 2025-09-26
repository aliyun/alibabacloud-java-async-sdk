// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link AttachPolicyConfig} extends {@link TeaModel}
 *
 * <p>AttachPolicyConfig</p>
 */
public class AttachPolicyConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("className")
    private String className;

    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private AttachPolicyConfig(Builder builder) {
        this.className = builder.className;
        this.config = builder.config;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachPolicyConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String className; 
        private String config; 
        private String name; 

        private Builder() {
        } 

        private Builder(AttachPolicyConfig model) {
            this.className = model.className;
            this.config = model.config;
            this.name = model.name;
        } 

        /**
         * className.
         */
        public Builder className(String className) {
            this.className = className;
            return this;
        }

        /**
         * config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public AttachPolicyConfig build() {
            return new AttachPolicyConfig(this);
        } 

    } 

}
