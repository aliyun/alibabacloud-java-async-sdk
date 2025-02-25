// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CustomRuntimeConfig} extends {@link TeaModel}
 *
 * <p>CustomRuntimeConfig</p>
 */
public class CustomRuntimeConfig extends TeaModel {
    @NameInMap("args")
    private java.util.List < String > args;

    @NameInMap("command")
    private java.util.List < String > command;

    private CustomRuntimeConfig(Builder builder) {
        this.args = builder.args;
        this.command = builder.command;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomRuntimeConfig create() {
        return builder().build();
    }

    /**
     * @return args
     */
    public java.util.List < String > getArgs() {
        return this.args;
    }

    /**
     * @return command
     */
    public java.util.List < String > getCommand() {
        return this.command;
    }

    public static final class Builder {
        private java.util.List < String > args; 
        private java.util.List < String > command; 

        /**
         * args.
         */
        public Builder args(java.util.List < String > args) {
            this.args = args;
            return this;
        }

        /**
         * command.
         */
        public Builder command(java.util.List < String > command) {
            this.command = command;
            return this;
        }

        public CustomRuntimeConfig build() {
            return new CustomRuntimeConfig(this);
        } 

    } 

}
