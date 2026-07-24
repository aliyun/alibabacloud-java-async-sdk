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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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

        private Details(Builder builder) {
            this.apiKeyName = builder.apiKeyName;
            this.cachedTokens = builder.cachedTokens;
            this.changeTime = builder.changeTime;
            this.creditChange = builder.creditChange;
            this.description = builder.description;
            this.inputTokens = builder.inputTokens;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.modelId = builder.modelId;
            this.outputTokens = builder.outputTokens;
            this.packageId = builder.packageId;
            this.requestId = builder.requestId;
            this.taskId = builder.taskId;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
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

        public static final class Builder {
            private String apiKeyName; 
            private Long cachedTokens; 
            private String changeTime; 
            private String creditChange; 
            private String description; 
            private Long inputTokens; 
            private String instanceId; 
            private String instanceName; 
            private String modelId; 
            private Long outputTokens; 
            private String packageId; 
            private String requestId; 
            private String taskId; 
            private Long totalTokens; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.apiKeyName = model.apiKeyName;
                this.cachedTokens = model.cachedTokens;
                this.changeTime = model.changeTime;
                this.creditChange = model.creditChange;
                this.description = model.description;
                this.inputTokens = model.inputTokens;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.modelId = model.modelId;
                this.outputTokens = model.outputTokens;
                this.packageId = model.packageId;
                this.requestId = model.requestId;
                this.taskId = model.taskId;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * ApiKeyName.
             */
            public Builder apiKeyName(String apiKeyName) {
                this.apiKeyName = apiKeyName;
                return this;
            }

            /**
             * CachedTokens.
             */
            public Builder cachedTokens(Long cachedTokens) {
                this.cachedTokens = cachedTokens;
                return this;
            }

            /**
             * ChangeTime.
             */
            public Builder changeTime(String changeTime) {
                this.changeTime = changeTime;
                return this;
            }

            /**
             * CreditChange.
             */
            public Builder creditChange(String creditChange) {
                this.creditChange = creditChange;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * PackageId.
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TotalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
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
             * Details.
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
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
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalCreditChange.
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
