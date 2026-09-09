// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListMcpToolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcpToolsResponseBody</p>
 */
public class ListMcpToolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListMcpToolsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcpToolsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListMcpToolsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The list data.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of results per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Request processed successfully</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>next-page-token</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMcpToolsResponseBody build() {
            return new ListMcpToolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMcpToolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpToolsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputSchema")
        private String inputSchema;

        @com.aliyun.core.annotation.NameInMap("outputSchema")
        private String outputSchema;

        @com.aliyun.core.annotation.NameInMap("toolDescription")
        private String toolDescription;

        @com.aliyun.core.annotation.NameInMap("toolName")
        private String toolName;

        private Items(Builder builder) {
            this.inputSchema = builder.inputSchema;
            this.outputSchema = builder.outputSchema;
            this.toolDescription = builder.toolDescription;
            this.toolName = builder.toolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return inputSchema
         */
        public String getInputSchema() {
            return this.inputSchema;
        }

        /**
         * @return outputSchema
         */
        public String getOutputSchema() {
            return this.outputSchema;
        }

        /**
         * @return toolDescription
         */
        public String getToolDescription() {
            return this.toolDescription;
        }

        /**
         * @return toolName
         */
        public String getToolName() {
            return this.toolName;
        }

        public static final class Builder {
            private String inputSchema; 
            private String outputSchema; 
            private String toolDescription; 
            private String toolName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.inputSchema = model.inputSchema;
                this.outputSchema = model.outputSchema;
                this.toolDescription = model.toolDescription;
                this.toolName = model.toolName;
            } 

            /**
             * <p>The input parameter schema of the tool.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;}</p>
             */
            public Builder inputSchema(String inputSchema) {
                this.inputSchema = inputSchema;
                return this;
            }

            /**
             * <p>The output parameter schema of the tool.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;}</p>
             */
            public Builder outputSchema(String outputSchema) {
                this.outputSchema = outputSchema;
                return this;
            }

            /**
             * <p>The MCP tool description.</p>
             * 
             * <strong>example:</strong>
             * <p>Get the current time</p>
             */
            public Builder toolDescription(String toolDescription) {
                this.toolDescription = toolDescription;
                return this;
            }

            /**
             * <p>The MCP tool name.</p>
             * 
             * <strong>example:</strong>
             * <p>get-current-time</p>
             */
            public Builder toolName(String toolName) {
                this.toolName = toolName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
