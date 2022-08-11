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
    @NameInMap("config")
    private String config;

    @NameInMap("disabled")
    private Boolean disabled;

    @NameInMap("name")
    private String name;

    private Addon(Builder builder) {
        this.config = builder.config;
        this.disabled = builder.disabled;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Addon create() {
        return builder().build();
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

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String config; 
        private Boolean disabled; 
        private String name; 

        /**
         * 插件配置参数。
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * 是否禁止默认安装。true | false。
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * 插件名称。
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Addon build() {
            return new Addon(this);
        } 

    } 

}
