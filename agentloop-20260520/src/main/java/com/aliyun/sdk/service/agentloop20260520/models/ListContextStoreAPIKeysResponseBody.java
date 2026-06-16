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
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * total.
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
             * agentSpace.
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * apiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * contextStoreName.
             */
            public Builder contextStoreName(String contextStoreName) {
                this.contextStoreName = contextStoreName;
                return this;
            }

            /**
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
             * name.
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
