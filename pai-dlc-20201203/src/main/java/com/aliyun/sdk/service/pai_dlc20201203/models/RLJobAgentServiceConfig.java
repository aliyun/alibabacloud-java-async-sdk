// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLJobAgentServiceConfig} extends {@link TeaModel}
 *
 * <p>RLJobAgentServiceConfig</p>
 */
public class RLJobAgentServiceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("Env")
    private java.util.List<RLJobAgentServiceEnvVar> env;

    private RLJobAgentServiceConfig(Builder builder) {
        this.enable = builder.enable;
        this.env = builder.env;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLJobAgentServiceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return env
     */
    public java.util.List<RLJobAgentServiceEnvVar> getEnv() {
        return this.env;
    }

    public static final class Builder {
        private Boolean enable; 
        private java.util.List<RLJobAgentServiceEnvVar> env; 

        private Builder() {
        } 

        private Builder(RLJobAgentServiceConfig model) {
            this.enable = model.enable;
            this.env = model.env;
        } 

        /**
         * <p>Specifies whether to enable the companion AgentService for the job. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The list of name-value environment variables for AgentService. You cannot overwrite platform-reserved variables. The GetRLJob operation returns an asterisk (*) for the values of E2B_API_KEY and platform-specified credentials, and keeps other values unchanged. Automatic masking is not guaranteed for all custom sensitive values.</p>
         */
        public Builder env(java.util.List<RLJobAgentServiceEnvVar> env) {
            this.env = env;
            return this;
        }

        public RLJobAgentServiceConfig build() {
            return new RLJobAgentServiceConfig(this);
        } 

    } 

}
