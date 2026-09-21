// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeCreditDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCreditDetailResponseBody</p>
 */
public class DescribeCreditDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCreditDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCreditDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCreditDetailResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response object.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCreditDetailResponseBody build() {
            return new DescribeCreditDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCreditDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCreditDetailResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentType")
        private String agentType;

        @com.aliyun.core.annotation.NameInMap("ApiKeyName")
        private String apiKeyName;

        @com.aliyun.core.annotation.NameInMap("CachedTokens")
        private Long cachedTokens;

        @com.aliyun.core.annotation.NameInMap("ChangeTime")
        private String changeTime;

        @com.aliyun.core.annotation.NameInMap("CreditChange")
        private String creditChange;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DurationMs")
        private Long durationMs;

        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("PackageId")
        private String packageId;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Long totalTokens;

        @com.aliyun.core.annotation.NameInMap("TtftMs")
        private Long ttftMs;

        private Details(Builder builder) {
            this.agentType = builder.agentType;
            this.apiKeyName = builder.apiKeyName;
            this.cachedTokens = builder.cachedTokens;
            this.changeTime = builder.changeTime;
            this.creditChange = builder.creditChange;
            this.description = builder.description;
            this.durationMs = builder.durationMs;
            this.inputTokens = builder.inputTokens;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.modelId = builder.modelId;
            this.outputTokens = builder.outputTokens;
            this.packageId = builder.packageId;
            this.requestId = builder.requestId;
            this.taskId = builder.taskId;
            this.totalTokens = builder.totalTokens;
            this.ttftMs = builder.ttftMs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return agentType
         */
        public String getAgentType() {
            return this.agentType;
        }

        /**
         * @return apiKeyName
         */
        public String getApiKeyName() {
            return this.apiKeyName;
        }

        /**
         * @return cachedTokens
         */
        public Long getCachedTokens() {
            return this.cachedTokens;
        }

        /**
         * @return changeTime
         */
        public String getChangeTime() {
            return this.changeTime;
        }

        /**
         * @return creditChange
         */
        public String getCreditChange() {
            return this.creditChange;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return durationMs
         */
        public Long getDurationMs() {
            return this.durationMs;
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return packageId
         */
        public String getPackageId() {
            return this.packageId;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        /**
         * @return ttftMs
         */
        public Long getTtftMs() {
            return this.ttftMs;
        }

        public static final class Builder {
            private String agentType; 
            private String apiKeyName; 
            private Long cachedTokens; 
            private String changeTime; 
            private String creditChange; 
            private String description; 
            private Long durationMs; 
            private Long inputTokens; 
            private String instanceId; 
            private String instanceName; 
            private String modelId; 
            private Long outputTokens; 
            private String packageId; 
            private String requestId; 
            private String taskId; 
            private Long totalTokens; 
            private Long ttftMs; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.agentType = model.agentType;
                this.apiKeyName = model.apiKeyName;
                this.cachedTokens = model.cachedTokens;
                this.changeTime = model.changeTime;
                this.creditChange = model.creditChange;
                this.description = model.description;
                this.durationMs = model.durationMs;
                this.inputTokens = model.inputTokens;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.modelId = model.modelId;
                this.outputTokens = model.outputTokens;
                this.packageId = model.packageId;
                this.requestId = model.requestId;
                this.taskId = model.taskId;
                this.totalTokens = model.totalTokens;
                this.ttftMs = model.ttftMs;
            } 

            /**
             * <p>The agent type. This field is populated only when querying by a single agent type.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudphone_enterprise</p>
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>The API key name.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder apiKeyName(String apiKeyName) {
                this.apiKeyName = apiKeyName;
                return this;
            }

            /**
             * <p>The number of cached tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder cachedTokens(Long cachedTokens) {
                this.cachedTokens = cachedTokens;
                return this;
            }

            /**
             * <p>The time when the change occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-30T08:14:02Z</p>
             */
            public Builder changeTime(String changeTime) {
                this.changeTime = changeTime;
                return this;
            }

            /**
             * <p>The credit change amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7637</p>
             */
            public Builder creditChange(String creditChange) {
                this.creditChange = creditChange;
                return this;
            }

            /**
             * <p>The task description.</p>
             * 
             * <strong>example:</strong>
             * <p>Open Xiaohongshu</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The model inference duration, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder durationMs(Long durationMs) {
                this.durationMs = durationMs;
                return this;
            }

            /**
             * <p>The number of input tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-12oe0l75vl7o5****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>my-instance</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The model ID.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-max</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The number of output tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>The credit or package ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cmag-0c1g77wjljl9h****</p>
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1A923337-44D9-5CAD-B2A5-4B9E6628B1C8</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The globally unique task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-1fr0k51pozyr5****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The total number of tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>350</p>
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            /**
             * <p>The response time of the first token, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder ttftMs(Long ttftMs) {
                this.ttftMs = ttftMs;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCreditDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCreditDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalCreditChange")
        private String totalCreditChange;

        private Data(Builder builder) {
            this.details = builder.details;
            this.nextToken = builder.nextToken;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalCreditChange = builder.totalCreditChange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List<Details> getDetails() {
            return this.details;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
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

        /**
         * @return totalCreditChange
         */
        public String getTotalCreditChange() {
            return this.totalCreditChange;
        }

        public static final class Builder {
            private java.util.List<Details> details; 
            private String nextToken; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalCount; 
            private String totalCreditChange; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.details = model.details;
                this.nextToken = model.nextToken;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.totalCreditChange = model.totalCreditChange;
            } 

            /**
             * <p>The credit change details.</p>
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The token for the next query.</p>
             * 
             * <strong>example:</strong>
             * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The page number for pagination. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of detail records.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The total credit change.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCreditChange(String totalCreditChange) {
                this.totalCreditChange = totalCreditChange;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
