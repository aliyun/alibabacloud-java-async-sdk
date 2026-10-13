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
 * {@link ListProductsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductsResponseBody</p>
 */
public class ListProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListProductsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsResponseBody create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListProductsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
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
         * <p>The maximum number of entries returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * <p>The cursor token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>next-token-xxxxxxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public ListProductsResponseBody build() {
            return new ListProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentConfig")
        private HiMarketAgentConfig agentConfig;

        @com.aliyun.core.annotation.NameInMap("autoApprove")
        private Boolean autoApprove;

        @com.aliyun.core.annotation.NameInMap("categories")
        private java.util.List<HiMarketProductCategory> categories;

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

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Content(Builder builder) {
            this.agentConfig = builder.agentConfig;
            this.autoApprove = builder.autoApprove;
            this.categories = builder.categories;
            this.description = builder.description;
            this.document = builder.document;
            this.feature = builder.feature;
            this.icon = builder.icon;
            this.mcpConfig = builder.mcpConfig;
            this.modelConfig = builder.modelConfig;
            this.name = builder.name;
            this.productId = builder.productId;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
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
         * @return categories
         */
        public java.util.List<HiMarketProductCategory> getCategories() {
            return this.categories;
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
            private java.util.List<HiMarketProductCategory> categories; 
            private String description; 
            private String document; 
            private HiMarketProductFeature feature; 
            private HiMarketIcon icon; 
            private HiMarketMcpConfig mcpConfig; 
            private HiMarketModelConfig modelConfig; 
            private String name; 
            private String productId; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.agentConfig = model.agentConfig;
                this.autoApprove = model.autoApprove;
                this.categories = model.categories;
                this.description = model.description;
                this.document = model.document;
                this.feature = model.feature;
                this.icon = model.icon;
                this.mcpConfig = model.mcpConfig;
                this.modelConfig = model.modelConfig;
                this.name = model.name;
                this.productId = model.productId;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The agent-related configurations of the API product. The agentAPIConfig member includes agentProtocols (the list of protocols supported by the agent) and routes (the list of routes).</p>
             */
            public Builder agentConfig(HiMarketAgentConfig agentConfig) {
                this.agentConfig = agentConfig;
                return this;
            }

            /**
             * <p>Specifies whether subscription requests for the API product are automatically approved. This is the AutoApprove property of the API product resource.</p>
             */
            public Builder autoApprove(Boolean autoApprove) {
                this.autoApprove = autoApprove;
                return this;
            }

            /**
             * <p>The list of product categories to which the API product belongs. The list element is named category.</p>
             */
            public Builder categories(java.util.List<HiMarketProductCategory> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The description of the API product, which is the Description property of the API product resource.</p>
             * 
             * <strong>example:</strong>
             * <p>An API product that provides weather query capabilities</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The documentation of the API product, which is the Document property of the API product resource.</p>
             * 
             * <strong>example:</strong>
             * <p>The invocation methods, parameters, and billing instructions for this product</p>
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * <p>The capability configurations of the API product. Currently, it includes only the modelFeature (model capabilities) member, which contains model, maxTokens, temperature, streaming, webSearch, enableThinking, and enableMultiModal.</p>
             */
            public Builder feature(HiMarketProductFeature feature) {
                this.feature = feature;
                return this;
            }

            /**
             * <p>The icon of the API product, which is the Icon property of the API product resource. It consists of two fields: type (the icon type) and value (the icon information).</p>
             */
            public Builder icon(HiMarketIcon icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>The MCP-related configurations of the API product. The members include mcpServerName (the MCP server name), tools, mcpServerConfig (path and domains), and meta (protocol).</p>
             */
            public Builder mcpConfig(HiMarketMcpConfig mcpConfig) {
                this.mcpConfig = mcpConfig;
                return this;
            }

            /**
             * <p>The model API-related configurations of the API product. The modelAPIConfig member includes modelCategory (the AI model category), aiProtocols (the list of AI API protocols), and routes (the list of routes).</p>
             */
            public Builder modelConfig(HiMarketModelConfig modelConfig) {
                this.modelConfig = modelConfig;
                return this;
            }

            /**
             * <p>The name of the API product, which is the Name property of the API product resource.</p>
             * 
             * <strong>example:</strong>
             * <p>weather-query-api</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the API product, which is the primary ID of the API product resource. You can use it to locate the product in operations such as GetProduct, UpdateProduct, DeleteProduct, PublishProduct, SetProductCategories, and ListProductPublications.</p>
             * 
             * <strong>example:</strong>
             * <p>product-xxxxxxxx</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The status of the API product, which is the Status property of the API product resource. Valid values: Pending, Ready, and Published.</p>
             * 
             * <strong>example:</strong>
             * <p>Published</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the API product, which is the Type property of the API product resource. The valid values are not declared in the API definition. Refer to the types displayed in the console.</p>
             * 
             * <strong>example:</strong>
             * <p>API</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.content = builder.content;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of API products. The list element is named productInfo, and each element contains the information of an API product.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
