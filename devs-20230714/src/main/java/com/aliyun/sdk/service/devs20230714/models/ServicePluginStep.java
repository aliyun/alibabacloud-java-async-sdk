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
 * {@link ServicePluginStep} extends {@link TeaModel}
 *
 * <p>ServicePluginStep</p>
 */
public class ServicePluginStep extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("args")
    private java.util.Map<String, ?> args;

    @com.aliyun.core.annotation.NameInMap("plugin")
    private String plugin;

    private ServicePluginStep(Builder builder) {
        this.args = builder.args;
        this.plugin = builder.plugin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServicePluginStep create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    /**
     * @return plugin
     */
    public String getPlugin() {
        return this.plugin;
    }

    public static final class Builder {
        private java.util.Map<String, ?> args; 
        private String plugin; 

        private Builder() {
        } 

        private Builder(ServicePluginStep model) {
            this.args = model.args;
            this.plugin = model.plugin;
        } 

        /**
         * args.
         */
        public Builder args(java.util.Map<String, ?> args) {
            this.args = args;
            return this;
        }

        /**
         * plugin.
         */
        public Builder plugin(String plugin) {
            this.plugin = plugin;
            return this;
        }

        public ServicePluginStep build() {
            return new ServicePluginStep(this);
        } 

    } 

}
