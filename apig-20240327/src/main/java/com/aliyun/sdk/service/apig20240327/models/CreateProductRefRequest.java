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
 * {@link CreateProductRefRequest} extends {@link RequestModel}
 *
 * <p>CreateProductRefRequest</p>
 */
public class CreateProductRefRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apigRefConfig")
    private ApigRefConfig apigRefConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    private CreateProductRefRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
        this.apigRefConfig = builder.apigRefConfig;
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductRefRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
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

    public static final class Builder extends Request.Builder<CreateProductRefRequest, Builder> {
        private String productId; 
        private ApigRefConfig apigRefConfig; 
        private String gatewayId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductRefRequest request) {
            super(request);
            this.productId = request.productId;
            this.apigRefConfig = request.apigRefConfig;
            this.gatewayId = request.gatewayId;
        } 

        /**
         * <p>The ID of the API product. This parameter specifies the API product with which you want to associate the API configuration. You can obtain the ID from the productId field of a list item returned by ListProducts or from the productId field in the response of CreateProduct. This parameter uses the same /himarket/v1/products/{productId}/ref path as CreateProductRef, GetProductRef, and DeleteProductRef.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        public Builder productId(String productId) {
            this.putPathParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The API configuration associated with the API product.</p>
         */
        public Builder apigRefConfig(ApigRefConfig apigRefConfig) {
            this.putBodyParameter("apigRefConfig", apigRefConfig);
            this.apigRefConfig = apigRefConfig;
            return this;
        }

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-123456</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        @Override
        public CreateProductRefRequest build() {
            return new CreateProductRefRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProductRefRequest} extends {@link TeaModel}
     *
     * <p>CreateProductRefRequest</p>
     */
    public static class ApigRefConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentApiId")
        private String agentApiId;

        @com.aliyun.core.annotation.NameInMap("agentApiName")
        private String agentApiName;

        @com.aliyun.core.annotation.NameInMap("apiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("apiName")
        private String apiName;

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
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
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
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
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
            private String apiId; 
            private String apiName; 
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
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.mcpRouteId = model.mcpRouteId;
                this.mcpServerId = model.mcpServerId;
                this.mcpServerName = model.mcpServerName;
                this.modelApiId = model.modelApiId;
                this.modelApiName = model.modelApiName;
            } 

            /**
             * <p>The ID of the associated agent API.</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxxxxxxx</p>
             */
            public Builder agentApiId(String agentApiId) {
                this.agentApiId = agentApiId;
                return this;
            }

            /**
             * <p>The name of the associated agent API.</p>
             * 
             * <strong>example:</strong>
             * <p>petstore</p>
             */
            public Builder agentApiName(String agentApiName) {
                this.agentApiName = agentApiName;
                return this;
            }

            /**
             * <p>The ID of the associated API.</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxx</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The name of the associated API.</p>
             * 
             * <strong>example:</strong>
             * <p>petstore</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The ID of the associated MCP route.</p>
             * 
             * <strong>example:</strong>
             * <p>hr-xxxxxxxx</p>
             */
            public Builder mcpRouteId(String mcpRouteId) {
                this.mcpRouteId = mcpRouteId;
                return this;
            }

            /**
             * <p>The ID of the associated MCP server.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-adfefz24afg</p>
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            /**
             * <p>The name of the associated MCP server.</p>
             * 
             * <strong>example:</strong>
             * <p>test-mcp</p>
             */
            public Builder mcpServerName(String mcpServerName) {
                this.mcpServerName = mcpServerName;
                return this;
            }

            /**
             * <p>The ID of the associated model API.</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxxxxxxx</p>
             */
            public Builder modelApiId(String modelApiId) {
                this.modelApiId = modelApiId;
                return this;
            }

            /**
             * <p>The name of the associated model API.</p>
             * 
             * <strong>example:</strong>
             * <p>petstore</p>
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
