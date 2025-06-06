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
 * {@link MCPServerInstallationConfig} extends {@link TeaModel}
 *
 * <p>MCPServerInstallationConfig</p>
 */
public class MCPServerInstallationConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("args")
    private String args;

    @com.aliyun.core.annotation.NameInMap("command")
    private String command;

    @com.aliyun.core.annotation.NameInMap("env")
    private java.util.Map<String, String> env;

    @com.aliyun.core.annotation.NameInMap("transportType")
    private String transportType;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private MCPServerInstallationConfig(Builder builder) {
        this.args = builder.args;
        this.command = builder.command;
        this.env = builder.env;
        this.transportType = builder.transportType;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MCPServerInstallationConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public String getArgs() {
        return this.args;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return env
     */
    public java.util.Map<String, String> getEnv() {
        return this.env;
    }

    /**
     * @return transportType
     */
    public String getTransportType() {
        return this.transportType;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String args; 
        private String command; 
        private java.util.Map<String, String> env; 
        private String transportType; 
        private String url; 

        private Builder() {
        } 

        private Builder(MCPServerInstallationConfig model) {
            this.args = model.args;
            this.command = model.command;
            this.env = model.env;
            this.transportType = model.transportType;
            this.url = model.url;
        } 

        /**
         * args.
         */
        public Builder args(String args) {
            this.args = args;
            return this;
        }

        /**
         * command.
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * env.
         */
        public Builder env(java.util.Map<String, String> env) {
            this.env = env;
            return this;
        }

        /**
         * transportType.
         */
        public Builder transportType(String transportType) {
            this.transportType = transportType;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public MCPServerInstallationConfig build() {
            return new MCPServerInstallationConfig(this);
        } 

    } 

}
