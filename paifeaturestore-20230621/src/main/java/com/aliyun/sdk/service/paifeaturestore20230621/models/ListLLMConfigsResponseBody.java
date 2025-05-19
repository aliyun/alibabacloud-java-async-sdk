// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link ListLLMConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLLMConfigsResponseBody</p>
 */
public class ListLLMConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LLMConfigs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<LLMConfigs> LLMConfigs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListLLMConfigsResponseBody(Builder builder) {
        this.LLMConfigs = builder.LLMConfigs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLLMConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return LLMConfigs
     */
    public java.util.List<LLMConfigs> getLLMConfigs() {
        return this.LLMConfigs;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<LLMConfigs> LLMConfigs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListLLMConfigsResponseBody model) {
            this.LLMConfigs = model.LLMConfigs;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder LLMConfigs(java.util.List<LLMConfigs> LLMConfigs) {
            this.LLMConfigs = LLMConfigs;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>898DB17C-09E9-5C41-909D-269BA183EB92</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLLMConfigsResponseBody build() {
            return new ListLLMConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLLMConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLLMConfigsResponseBody</p>
     */
    public static class LLMConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("BaseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("BatchSize")
        private Integer batchSize;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("LLMConfigId")
        private String LLMConfigId;

        @com.aliyun.core.annotation.NameInMap("MaxTokens")
        private Integer maxTokens;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Rps")
        private Integer rps;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private LLMConfigs(Builder builder) {
            this.apiKey = builder.apiKey;
            this.baseUrl = builder.baseUrl;
            this.batchSize = builder.batchSize;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.LLMConfigId = builder.LLMConfigId;
            this.maxTokens = builder.maxTokens;
            this.model = builder.model;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.rps = builder.rps;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LLMConfigs create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return batchSize
         */
        public Integer getBatchSize() {
            return this.batchSize;
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
         * @return LLMConfigId
         */
        public String getLLMConfigId() {
            return this.LLMConfigId;
        }

        /**
         * @return maxTokens
         */
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return rps
         */
        public Integer getRps() {
            return this.rps;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String apiKey; 
            private String baseUrl; 
            private Integer batchSize; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String LLMConfigId; 
            private Integer maxTokens; 
            private String model; 
            private String name; 
            private String resourceGroupId; 
            private Integer rps; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(LLMConfigs model) {
                this.apiKey = model.apiKey;
                this.baseUrl = model.baseUrl;
                this.batchSize = model.batchSize;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.LLMConfigId = model.LLMConfigId;
                this.maxTokens = model.maxTokens;
                this.model = model.model;
                this.name = model.name;
                this.resourceGroupId = model.resourceGroupId;
                this.rps = model.rps;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * BaseUrl.
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * BatchSize.
             */
            public Builder batchSize(Integer batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * LLMConfigId.
             */
            public Builder LLMConfigId(String LLMConfigId) {
                this.LLMConfigId = LLMConfigId;
                return this;
            }

            /**
             * MaxTokens.
             */
            public Builder maxTokens(Integer maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Rps.
             */
            public Builder rps(Integer rps) {
                this.rps = rps;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public LLMConfigs build() {
                return new LLMConfigs(this);
            } 

        } 

    }
}
