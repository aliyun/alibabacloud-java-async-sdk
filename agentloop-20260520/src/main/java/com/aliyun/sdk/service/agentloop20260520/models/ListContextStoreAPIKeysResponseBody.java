// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link ListContextStoreAPIKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListContextStoreAPIKeysResponseBody</p>
 */
public class ListContextStoreAPIKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListContextStoreAPIKeysResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContextStoreAPIKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Results> results; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListContextStoreAPIKeysResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.results = model.results;
            this.total = model.total;
        } 

        /**
         * <p>The maximum number of entries per page that was specified in the request. This value is echoed back.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page. An empty string indicates that the current page is the last page.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg5MA==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of API keys.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The total number of API keys that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListContextStoreAPIKeysResponseBody build() {
            return new ListContextStoreAPIKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContextStoreAPIKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextStoreAPIKeysResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("contextStoreName")
        private String contextStoreName;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Results(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.apiKey = builder.apiKey;
            this.contextStoreName = builder.contextStoreName;
            this.createTime = builder.createTime;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return agentSpace
         */
        public String getAgentSpace() {
            return this.agentSpace;
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return contextStoreName
         */
        public String getContextStoreName() {
            return this.contextStoreName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String agentSpace; 
            private String apiKey; 
            private String contextStoreName; 
            private String createTime; 
            private String name; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.agentSpace = model.agentSpace;
                this.apiKey = model.apiKey;
                this.contextStoreName = model.contextStoreName;
                this.createTime = model.createTime;
                this.name = model.name;
            } 

            /**
             * <p>The name of the AgentSpace to which the API key belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * <p>The full value of the API key. The plaintext value is returned only when the API key is created. In list scenarios, the value is masked based on business rules.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The name of the context store to which the API key belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>my-context-store</p>
             */
            public Builder contextStoreName(String contextStoreName) {
                this.contextStoreName = contextStoreName;
                return this;
            }

            /**
             * <p>The time when the API key was created, in ISO 8601 UTC format.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The display name of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>my-api-key</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
