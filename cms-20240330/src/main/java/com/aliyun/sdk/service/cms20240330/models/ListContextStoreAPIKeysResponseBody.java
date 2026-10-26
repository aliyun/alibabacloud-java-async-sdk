// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
         * <p>The maximum number of results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>xCs4wJD41qEejNkappMSJ1OL2Ky2GeKLqmBLJrC61WrgUOj9F-31jHbo5Kgqzifv</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The results.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>454</p>
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
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("contextStoreName")
        private String contextStoreName;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Results(Builder builder) {
            this.apiKey = builder.apiKey;
            this.contextStoreName = builder.contextStoreName;
            this.createTime = builder.createTime;
            this.name = builder.name;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
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

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String apiKey; 
            private String contextStoreName; 
            private String createTime; 
            private String name; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.apiKey = model.apiKey;
                this.contextStoreName = model.contextStoreName;
                this.createTime = model.createTime;
                this.name = model.name;
                this.workspace = model.workspace;
            } 

            /**
             * <p>The full value of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-3ac8d45d741e4f31b81aa6ee984ce9fd</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The name of the context store.</p>
             * 
             * <strong>example:</strong>
             * <p>test-context-Store</p>
             */
            public Builder contextStoreName(String contextStoreName) {
                this.contextStoreName = contextStoreName;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>1778205145</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The display name of the API key, used to identify its purpose.</p>
             * 
             * <strong>example:</strong>
             * <p>Production Service Key</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>test-workspace</p>
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
