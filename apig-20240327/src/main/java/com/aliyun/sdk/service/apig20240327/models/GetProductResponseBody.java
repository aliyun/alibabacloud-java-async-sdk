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
 * {@link GetProductResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductResponseBody</p>
 */
public class GetProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetProductResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProductResponseBody build() {
            return new GetProductResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProductResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentConfig")
        private HiMarketAgentConfig agentConfig;

        @com.aliyun.core.annotation.NameInMap("autoApprove")
        private Boolean autoApprove;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("document")
        private String document;

        @com.aliyun.core.annotation.NameInMap("feature")
        private HiMarketProductFeature feature;

        @com.aliyun.core.annotation.NameInMap("icon")
        private HiMarketIcon icon;

        @com.aliyun.core.annotation.NameInMap("mcpConfig")
        private HiMarketMcpConfig mcpConfig;

        @com.aliyun.core.annotation.NameInMap("modelConfig")
        private HiMarketModelConfig modelConfig;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("productId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Data(Builder builder) {
            this.agentConfig = builder.agentConfig;
            this.autoApprove = builder.autoApprove;
            this.description = builder.description;
            this.document = builder.document;
            this.feature = builder.feature;
            this.icon = builder.icon;
            this.mcpConfig = builder.mcpConfig;
            this.modelConfig = builder.modelConfig;
            this.name = builder.name;
            this.productId = builder.productId;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentConfig
         */
        public HiMarketAgentConfig getAgentConfig() {
            return this.agentConfig;
        }

        /**
         * @return autoApprove
         */
        public Boolean getAutoApprove() {
            return this.autoApprove;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return document
         */
        public String getDocument() {
            return this.document;
        }

        /**
         * @return feature
         */
        public HiMarketProductFeature getFeature() {
            return this.feature;
        }

        /**
         * @return icon
         */
        public HiMarketIcon getIcon() {
            return this.icon;
        }

        /**
         * @return mcpConfig
         */
        public HiMarketMcpConfig getMcpConfig() {
            return this.mcpConfig;
        }

        /**
         * @return modelConfig
         */
        public HiMarketModelConfig getModelConfig() {
            return this.modelConfig;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private HiMarketAgentConfig agentConfig; 
            private Boolean autoApprove; 
            private String description; 
            private String document; 
            private HiMarketProductFeature feature; 
            private HiMarketIcon icon; 
            private HiMarketMcpConfig mcpConfig; 
            private HiMarketModelConfig modelConfig; 
            private String name; 
            private String productId; 
            private String regionId; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentConfig = model.agentConfig;
                this.autoApprove = model.autoApprove;
                this.description = model.description;
                this.document = model.document;
                this.feature = model.feature;
                this.icon = model.icon;
                this.mcpConfig = model.mcpConfig;
                this.modelConfig = model.modelConfig;
                this.name = model.name;
                this.productId = model.productId;
                this.regionId = model.regionId;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The Agent-related configurations of the API product. The agentAPIConfig member includes agentProtocols, which is a list of protocols supported by the agent, and routes, which is a list of routes.</p>
             */
            public Builder agentConfig(HiMarketAgentConfig agentConfig) {
                this.agentConfig = agentConfig;
                return this;
            }

            /**
             * <p>Indicates whether subscription requests for the product are automatically approved.</p>
             */
            public Builder autoApprove(Boolean autoApprove) {
                this.autoApprove = autoApprove;
                return this;
            }

            /**
             * <p>The description of the API product.</p>
             * 
             * <strong>example:</strong>
             * <p>An API product that provides weather query capabilities</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The documentation content of the API product.</p>
             * 
             * <strong>example:</strong>
             * <p>The invocation methods, parameters, and billing instructions for this product</p>
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * <p>The capability configurations of the API product. Currently, this includes only the modelFeature member for model capabilities, which contains model, maxTokens, temperature, streaming, webSearch, enableThinking, and enableMultiModal.</p>
             */
            public Builder feature(HiMarketProductFeature feature) {
                this.feature = feature;
                return this;
            }

            /**
             * <p>The icon configurations of the API product, which consist of two fields: type for the icon type and value for the icon information.</p>
             */
            public Builder icon(HiMarketIcon icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>The MCP-related configurations of the API product. The members include mcpServerName for the MCP server name, tools, mcpServerConfig for the path and domains, and meta for the protocol.</p>
             */
            public Builder mcpConfig(HiMarketMcpConfig mcpConfig) {
                this.mcpConfig = mcpConfig;
                return this;
            }

            /**
             * <p>The model API-related configurations of the API product. The modelAPIConfig member includes modelCategory for the AI model category, aiProtocols for the list of AI API protocols, and routes for the list of routes.</p>
             */
            public Builder modelConfig(HiMarketModelConfig modelConfig) {
                this.modelConfig = modelConfig;
                return this;
            }

            /**
             * <p>The name of the API product.</p>
             * 
             * <strong>example:</strong>
             * <p>weather-query-api</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the API product, which is the primary ID of the API product resource. You can use this ID to locate the product in operations such as GetProduct, UpdateProduct, DeleteProduct, PublishProduct, SetProductCategories, and GetProductRef.</p>
             * 
             * <strong>example:</strong>
             * <p>p-xxxxxxxx</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The ID of the region to which the API product belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the API product. Valid values: Pending, Ready, and Published.</p>
             * 
             * <strong>example:</strong>
             * <p>Published</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the API product. The set of valid values is not declared in the API definition. Refer to the types displayed in the console.</p>
             * 
             * <strong>example:</strong>
             * <p>API</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
