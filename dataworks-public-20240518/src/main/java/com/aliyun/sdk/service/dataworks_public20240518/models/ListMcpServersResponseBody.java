// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListMcpServersResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcpServersResponseBody</p>
 */
public class ListMcpServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMcpServersResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcpServersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMcpServersResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The paging information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMcpServersResponseBody build() {
            return new ListMcpServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMcpServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpServersResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomHeaders")
        private java.util.Map<String, ?> customHeaders;

        @com.aliyun.core.annotation.NameInMap("Transport")
        private String transport;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Config(Builder builder) {
            this.customHeaders = builder.customHeaders;
            this.transport = builder.transport;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return customHeaders
         */
        public java.util.Map<String, ?> getCustomHeaders() {
            return this.customHeaders;
        }

        /**
         * @return transport
         */
        public String getTransport() {
            return this.transport;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.Map<String, ?> customHeaders; 
            private String transport; 
            private String url; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.customHeaders = model.customHeaders;
                this.transport = model.transport;
                this.url = model.url;
            } 

            /**
             * <p>The custom headers.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder customHeaders(java.util.Map<String, ?> customHeaders) {
                this.customHeaders = customHeaders;
                return this;
            }

            /**
             * <p>The transport protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>SSE</p>
             */
            public Builder transport(String transport) {
                this.transport = transport;
                return this;
            }

            /**
             * <p>The service address of the MCP Server.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/mcp/sse">https://example.com/mcp/sse</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMcpServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpServersResponseBody</p>
     */
    public static class McpServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("ModifierId")
        private String modifierId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Visibility")
        private String visibility;

        private McpServers(Builder builder) {
            this.config = builder.config;
            this.creatorId = builder.creatorId;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.modifierId = builder.modifierId;
            this.name = builder.name;
            this.visibility = builder.visibility;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpServers create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return modifierId
         */
        public String getModifierId() {
            return this.modifierId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        public static final class Builder {
            private Config config; 
            private String creatorId; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String modifierId; 
            private String name; 
            private String visibility; 

            private Builder() {
            } 

            private Builder(McpServers model) {
                this.config = model.config;
                this.creatorId = model.creatorId;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.modifierId = model.modifierId;
                this.name = model.name;
                this.visibility = model.visibility;
            } 

            /**
             * <p>The connection configuration of the MCP Server.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The creator ID.</p>
             * 
             * <strong>example:</strong>
             * <p>805298765622151</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The creation time, as a millisecond timestamp.****</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The last modified time, as a millisecond timestamp.****</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The ID of the user who last modified the server.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder modifierId(String modifierId) {
                this.modifierId = modifierId;
                return this;
            }

            /**
             * <p>The name of the MCP Server.</p>
             * 
             * <strong>example:</strong>
             * <p>my-mcp-server</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The visibility level.****</p>
             * 
             * <strong>example:</strong>
             * <p>TENANT</p>
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            public McpServers build() {
                return new McpServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMcpServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpServersResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("McpServers")
        private java.util.List<McpServers> mcpServers;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.maxResults = builder.maxResults;
            this.mcpServers = builder.mcpServers;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return mcpServers
         */
        public java.util.List<McpServers> getMcpServers() {
            return this.mcpServers;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer maxResults; 
            private java.util.List<McpServers> mcpServers; 
            private String nextToken; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.maxResults = model.maxResults;
                this.mcpServers = model.mcpServers;
                this.nextToken = model.nextToken;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The maximum number of results returned on the current page.****</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>A list of MCP Server objects.</p>
             */
            public Builder mcpServers(java.util.List<McpServers> mcpServers) {
                this.mcpServers = mcpServers;
                return this;
            }

            /**
             * <p>The token for the next page of results. A null value indicates that all results have been returned.****</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total count of entries that match the filter criteria.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
