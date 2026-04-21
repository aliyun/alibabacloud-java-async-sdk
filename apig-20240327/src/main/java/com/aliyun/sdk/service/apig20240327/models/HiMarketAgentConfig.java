// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HiMarketAgentConfig} extends {@link TeaModel}
 *
 * <p>HiMarketAgentConfig</p>
 */
public class HiMarketAgentConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentAPIConfig")
    private AgentAPIConfig agentAPIConfig;

    private HiMarketAgentConfig(Builder builder) {
        this.agentAPIConfig = builder.agentAPIConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketAgentConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentAPIConfig
     */
    public AgentAPIConfig getAgentAPIConfig() {
        return this.agentAPIConfig;
    }

    public static final class Builder {
        private AgentAPIConfig agentAPIConfig; 

        private Builder() {
        } 

        private Builder(HiMarketAgentConfig model) {
            this.agentAPIConfig = model.agentAPIConfig;
        } 

        /**
         * agentAPIConfig.
         */
        public Builder agentAPIConfig(AgentAPIConfig agentAPIConfig) {
            this.agentAPIConfig = agentAPIConfig;
            return this;
        }

        public HiMarketAgentConfig build() {
            return new HiMarketAgentConfig(this);
        } 

    } 

    /**
     * 
     * {@link HiMarketAgentConfig} extends {@link TeaModel}
     *
     * <p>HiMarketAgentConfig</p>
     */
    public static class AgentAPIConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentProtocols")
        private java.util.List<String> agentProtocols;

        @com.aliyun.core.annotation.NameInMap("routes")
        private java.util.List<HiMarketHttpRoute> routes;

        private AgentAPIConfig(Builder builder) {
            this.agentProtocols = builder.agentProtocols;
            this.routes = builder.routes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentAPIConfig create() {
            return builder().build();
        }

        /**
         * @return agentProtocols
         */
        public java.util.List<String> getAgentProtocols() {
            return this.agentProtocols;
        }

        /**
         * @return routes
         */
        public java.util.List<HiMarketHttpRoute> getRoutes() {
            return this.routes;
        }

        public static final class Builder {
            private java.util.List<String> agentProtocols; 
            private java.util.List<HiMarketHttpRoute> routes; 

            private Builder() {
            } 

            private Builder(AgentAPIConfig model) {
                this.agentProtocols = model.agentProtocols;
                this.routes = model.routes;
            } 

            /**
             * agentProtocols.
             */
            public Builder agentProtocols(java.util.List<String> agentProtocols) {
                this.agentProtocols = agentProtocols;
                return this;
            }

            /**
             * routes.
             */
            public Builder routes(java.util.List<HiMarketHttpRoute> routes) {
                this.routes = routes;
                return this;
            }

            public AgentAPIConfig build() {
                return new AgentAPIConfig(this);
            } 

        } 

    }
}
