// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Addon} extends {@link TeaModel}
 *
 * <p>Addon</p>
 */
public class Addon extends TeaModel {
    @NameInMap("name")
    private String name;

    @NameInMap("config")
    private String config;

    @NameInMap("disabled")
    private Boolean disabled;

    private Addon(Builder builder) {
        this.name = builder.name;
        this.config = builder.config;
        this.disabled = builder.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Addon create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
    }

    public static final class Builder {
        private String name; 
        private String config; 
        private Boolean disabled; 

        /**
         * The name of the plug-in.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The plug-in configuration parameters.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * Specifies whether to disable default installation. true | false.
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        public Addon build() {
            return new Addon(this);
        } 

    } 

}
