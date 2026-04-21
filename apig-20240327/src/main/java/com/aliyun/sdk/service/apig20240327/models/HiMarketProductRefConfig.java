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
 * {@link HiMarketProductRefConfig} extends {@link TeaModel}
 *
 * <p>HiMarketProductRefConfig</p>
 */
public class HiMarketProductRefConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apigRefConfig")
    private ApigRefConfig apigRefConfig;

    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    private HiMarketProductRefConfig(Builder builder) {
        this.apigRefConfig = builder.apigRefConfig;
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketProductRefConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apigRefConfig
     */
    public ApigRefConfig getApigRefConfig() {
        return this.apigRefConfig;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    public static final class Builder {
        private ApigRefConfig apigRefConfig; 
        private String gatewayId; 

        private Builder() {
        } 

        private Builder(HiMarketProductRefConfig model) {
            this.apigRefConfig = model.apigRefConfig;
            this.gatewayId = model.gatewayId;
        } 

        /**
         * apigRefConfig.
         */
        public Builder apigRefConfig(ApigRefConfig apigRefConfig) {
            this.apigRefConfig = apigRefConfig;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        public HiMarketProductRefConfig build() {
            return new HiMarketProductRefConfig(this);
        } 

    } 

    /**
     * 
     * {@link HiMarketProductRefConfig} extends {@link TeaModel}
     *
     * <p>HiMarketProductRefConfig</p>
     */
    public static class ApigRefConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentApiId")
        private String agentApiId;

        @com.aliyun.core.annotation.NameInMap("agentApiName")
        private String agentApiName;

        @com.aliyun.core.annotation.NameInMap("mcpRouteId")
        private String mcpRouteId;

        @com.aliyun.core.annotation.NameInMap("mcpServerId")
        private String mcpServerId;

        @com.aliyun.core.annotation.NameInMap("mcpServerName")
        private String mcpServerName;

        @com.aliyun.core.annotation.NameInMap("modelApiId")
        private String modelApiId;

        @com.aliyun.core.annotation.NameInMap("modelApiName")
        private String modelApiName;

        private ApigRefConfig(Builder builder) {
            this.agentApiId = builder.agentApiId;
            this.agentApiName = builder.agentApiName;
            this.mcpRouteId = builder.mcpRouteId;
            this.mcpServerId = builder.mcpServerId;
            this.mcpServerName = builder.mcpServerName;
            this.modelApiId = builder.modelApiId;
            this.modelApiName = builder.modelApiName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApigRefConfig create() {
            return builder().build();
        }

        /**
         * @return agentApiId
         */
        public String getAgentApiId() {
            return this.agentApiId;
        }

        /**
         * @return agentApiName
         */
        public String getAgentApiName() {
            return this.agentApiName;
        }

        /**
         * @return mcpRouteId
         */
        public String getMcpRouteId() {
            return this.mcpRouteId;
        }

        /**
         * @return mcpServerId
         */
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        /**
         * @return mcpServerName
         */
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        /**
         * @return modelApiId
         */
        public String getModelApiId() {
            return this.modelApiId;
        }

        /**
         * @return modelApiName
         */
        public String getModelApiName() {
            return this.modelApiName;
        }

        public static final class Builder {
            private String agentApiId; 
            private String agentApiName; 
            private String mcpRouteId; 
            private String mcpServerId; 
            private String mcpServerName; 
            private String modelApiId; 
            private String modelApiName; 

            private Builder() {
            } 

            private Builder(ApigRefConfig model) {
                this.agentApiId = model.agentApiId;
                this.agentApiName = model.agentApiName;
                this.mcpRouteId = model.mcpRouteId;
                this.mcpServerId = model.mcpServerId;
                this.mcpServerName = model.mcpServerName;
                this.modelApiId = model.modelApiId;
                this.modelApiName = model.modelApiName;
            } 

            /**
             * agentApiId.
             */
            public Builder agentApiId(String agentApiId) {
                this.agentApiId = agentApiId;
                return this;
            }

            /**
             * agentApiName.
             */
            public Builder agentApiName(String agentApiName) {
                this.agentApiName = agentApiName;
                return this;
            }

            /**
             * mcpRouteId.
             */
            public Builder mcpRouteId(String mcpRouteId) {
                this.mcpRouteId = mcpRouteId;
                return this;
            }

            /**
             * mcpServerId.
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            /**
             * mcpServerName.
             */
            public Builder mcpServerName(String mcpServerName) {
                this.mcpServerName = mcpServerName;
                return this;
            }

            /**
             * modelApiId.
             */
            public Builder modelApiId(String modelApiId) {
                this.modelApiId = modelApiId;
                return this;
            }

            /**
             * modelApiName.
             */
            public Builder modelApiName(String modelApiName) {
                this.modelApiName = modelApiName;
                return this;
            }

            public ApigRefConfig build() {
                return new ApigRefConfig(this);
            } 

        } 

    }
}
