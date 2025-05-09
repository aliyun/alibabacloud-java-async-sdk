// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link LifecycleHook} extends {@link TeaModel}
 *
 * <p>LifecycleHook</p>
 */
public class LifecycleHook extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("command")
    private java.util.List<String> command;

    @com.aliyun.core.annotation.NameInMap("handler")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String handler;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    private LifecycleHook(Builder builder) {
        this.command = builder.command;
        this.handler = builder.handler;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LifecycleHook create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return command
     */
    public java.util.List<String> getCommand() {
        return this.command;
    }

    /**
     * @return handler
     */
    public String getHandler() {
        return this.handler;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder {
        private java.util.List<String> command; 
        private String handler; 
        private Integer timeout; 

        private Builder() {
        } 

        private Builder(LifecycleHook model) {
            this.command = model.command;
            this.handler = model.handler;
            this.timeout = model.timeout;
        } 

        /**
         * command.
         */
        public Builder command(java.util.List<String> command) {
            this.command = command;
            return this;
        }

        /**
         * handler.
         */
        public Builder handler(String handler) {
            this.handler = handler;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public LifecycleHook build() {
            return new LifecycleHook(this);
        } 

    } 

}
