// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link QueryModelUsageListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryModelUsageListResponseBody</p>
 */
public class QueryModelUsageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private QueryModelUsageListResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryModelUsageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(QueryModelUsageListResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The model usage details on the current page. If no models match or the page number exceeds the result range, an empty list is returned. For 24h or 1d queries without specified start and end dates, an empty list is also returned when no statistical results are available. For other windows or custom date ranges, no valid list data is provided when no statistical results are available. The absence of statistical results does not directly indicate that no actual calls were made.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;LlmCode&quot;:&quot;qwen3-max-2026-01-23&quot;,&quot;ModelName&quot;:&quot;Qwen3 Max&quot;,&quot;CallCount&quot;:12480,&quot;FailureCount&quot;:180,&quot;PointsConsumption&quot;:100,&quot;InputPointsRate&quot;:0.739,&quot;OutputPointsRate&quot;:0.261,&quot;SuccessRate&quot;:0.98557692,&quot;AvgTtftMs&quot;:620,&quot;CacheHitRate&quot;:0.86}]</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number for this query, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size used for this query. The actual number of returned entries may be less than this value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier for this request, used to locate and troubleshoot request issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of models used for pagination. When statistical results are available, this field returns the number of models that meet the model type and keyword conditions. This may include models with 0 calls within the selected date range, so it is not necessarily equal to ActiveModelCount.</p>
         * <p><strong>When no statistical results are available within the query range, this value returns 0. You cannot determine that the business has no models or no actual calls based solely on TotalCount=0.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryModelUsageListResponseBody build() {
            return new QueryModelUsageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryModelUsageListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryModelUsageListResponseBody</p>
     */
    public static class CreditMultiplier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private Float max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Float min;

        private CreditMultiplier(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreditMultiplier create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Float getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Float getMin() {
            return this.min;
        }

        public static final class Builder {
            private Float max; 
            private Float min; 

            private Builder() {
            } 

            private Builder(CreditMultiplier model) {
                this.max = model.max;
                this.min = model.min;
            } 

            /**
             * <p>The upper limit of the credit multiplier, in multiples. If it is empty, it indicates that the multiplier starts from Min and no maximum multiplier is specified.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder max(Float max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The lower limit of the credit multiplier, in multiples. If it is equal to Max, it indicates a fixed multiplier.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder min(Float min) {
                this.min = min;
                return this;
            }

            public CreditMultiplier build() {
                return new CreditMultiplier(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryModelUsageListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryModelUsageListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgTtftMs")
        private Long avgTtftMs;

        @com.aliyun.core.annotation.NameInMap("CacheHitRate")
        private Double cacheHitRate;

        @com.aliyun.core.annotation.NameInMap("CallCount")
        private Long callCount;

        @com.aliyun.core.annotation.NameInMap("ContextWindow")
        private Long contextWindow;

        @com.aliyun.core.annotation.NameInMap("CreditMultiplier")
        private CreditMultiplier creditMultiplier;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExplicitCacheCreationPointsRate")
        private Double explicitCacheCreationPointsRate;

        @com.aliyun.core.annotation.NameInMap("ExplicitCacheHitPointsRate")
        private Double explicitCacheHitPointsRate;

        @com.aliyun.core.annotation.NameInMap("FailureCount")
        private Long failureCount;

        @com.aliyun.core.annotation.NameInMap("FeatureList")
        private java.util.List<String> featureList;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("ImplicitCacheHitPointsRate")
        private Double implicitCacheHitPointsRate;

        @com.aliyun.core.annotation.NameInMap("InputPointsRate")
        private Double inputPointsRate;

        @com.aliyun.core.annotation.NameInMap("IsNew")
        private Boolean isNew;

        @com.aliyun.core.annotation.NameInMap("LlmCode")
        private String llmCode;

        @com.aliyun.core.annotation.NameInMap("MaxOutput")
        private Long maxOutput;

        @com.aliyun.core.annotation.NameInMap("ModelBrandName")
        private String modelBrandName;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("NormalInputPointsRate")
        private Double normalInputPointsRate;

        @com.aliyun.core.annotation.NameInMap("OutputPointsRate")
        private Double outputPointsRate;

        @com.aliyun.core.annotation.NameInMap("PointsConsumption")
        private Double pointsConsumption;

        @com.aliyun.core.annotation.NameInMap("SuccessRate")
        private Double successRate;

        @com.aliyun.core.annotation.NameInMap("ToolCallPointsRate")
        private Double toolCallPointsRate;

        @com.aliyun.core.annotation.NameInMap("TtftP95Ms")
        private Long ttftP95Ms;

        private Data(Builder builder) {
            this.avgTtftMs = builder.avgTtftMs;
            this.cacheHitRate = builder.cacheHitRate;
            this.callCount = builder.callCount;
            this.contextWindow = builder.contextWindow;
            this.creditMultiplier = builder.creditMultiplier;
            this.description = builder.description;
            this.explicitCacheCreationPointsRate = builder.explicitCacheCreationPointsRate;
            this.explicitCacheHitPointsRate = builder.explicitCacheHitPointsRate;
            this.failureCount = builder.failureCount;
            this.featureList = builder.featureList;
            this.iconUrl = builder.iconUrl;
            this.implicitCacheHitPointsRate = builder.implicitCacheHitPointsRate;
            this.inputPointsRate = builder.inputPointsRate;
            this.isNew = builder.isNew;
            this.llmCode = builder.llmCode;
            this.maxOutput = builder.maxOutput;
            this.modelBrandName = builder.modelBrandName;
            this.modelName = builder.modelName;
            this.normalInputPointsRate = builder.normalInputPointsRate;
            this.outputPointsRate = builder.outputPointsRate;
            this.pointsConsumption = builder.pointsConsumption;
            this.successRate = builder.successRate;
            this.toolCallPointsRate = builder.toolCallPointsRate;
            this.ttftP95Ms = builder.ttftP95Ms;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avgTtftMs
         */
        public Long getAvgTtftMs() {
            return this.avgTtftMs;
        }

        /**
         * @return cacheHitRate
         */
        public Double getCacheHitRate() {
            return this.cacheHitRate;
        }

        /**
         * @return callCount
         */
        public Long getCallCount() {
            return this.callCount;
        }

        /**
         * @return contextWindow
         */
        public Long getContextWindow() {
            return this.contextWindow;
        }

        /**
         * @return creditMultiplier
         */
        public CreditMultiplier getCreditMultiplier() {
            return this.creditMultiplier;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return explicitCacheCreationPointsRate
         */
        public Double getExplicitCacheCreationPointsRate() {
            return this.explicitCacheCreationPointsRate;
        }

        /**
         * @return explicitCacheHitPointsRate
         */
        public Double getExplicitCacheHitPointsRate() {
            return this.explicitCacheHitPointsRate;
        }

        /**
         * @return failureCount
         */
        public Long getFailureCount() {
            return this.failureCount;
        }

        /**
         * @return featureList
         */
        public java.util.List<String> getFeatureList() {
            return this.featureList;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return implicitCacheHitPointsRate
         */
        public Double getImplicitCacheHitPointsRate() {
            return this.implicitCacheHitPointsRate;
        }

        /**
         * @return inputPointsRate
         */
        public Double getInputPointsRate() {
            return this.inputPointsRate;
        }

        /**
         * @return isNew
         */
        public Boolean getIsNew() {
            return this.isNew;
        }

        /**
         * @return llmCode
         */
        public String getLlmCode() {
            return this.llmCode;
        }

        /**
         * @return maxOutput
         */
        public Long getMaxOutput() {
            return this.maxOutput;
        }

        /**
         * @return modelBrandName
         */
        public String getModelBrandName() {
            return this.modelBrandName;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return normalInputPointsRate
         */
        public Double getNormalInputPointsRate() {
            return this.normalInputPointsRate;
        }

        /**
         * @return outputPointsRate
         */
        public Double getOutputPointsRate() {
            return this.outputPointsRate;
        }

        /**
         * @return pointsConsumption
         */
        public Double getPointsConsumption() {
            return this.pointsConsumption;
        }

        /**
         * @return successRate
         */
        public Double getSuccessRate() {
            return this.successRate;
        }

        /**
         * @return toolCallPointsRate
         */
        public Double getToolCallPointsRate() {
            return this.toolCallPointsRate;
        }

        /**
         * @return ttftP95Ms
         */
        public Long getTtftP95Ms() {
            return this.ttftP95Ms;
        }

        public static final class Builder {
            private Long avgTtftMs; 
            private Double cacheHitRate; 
            private Long callCount; 
            private Long contextWindow; 
            private CreditMultiplier creditMultiplier; 
            private String description; 
            private Double explicitCacheCreationPointsRate; 
            private Double explicitCacheHitPointsRate; 
            private Long failureCount; 
            private java.util.List<String> featureList; 
            private String iconUrl; 
            private Double implicitCacheHitPointsRate; 
            private Double inputPointsRate; 
            private Boolean isNew; 
            private String llmCode; 
            private Long maxOutput; 
            private String modelBrandName; 
            private String modelName; 
            private Double normalInputPointsRate; 
            private Double outputPointsRate; 
            private Double pointsConsumption; 
            private Double successRate; 
            private Double toolCallPointsRate; 
            private Long ttftP95Ms; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.avgTtftMs = model.avgTtftMs;
                this.cacheHitRate = model.cacheHitRate;
                this.callCount = model.callCount;
                this.contextWindow = model.contextWindow;
                this.creditMultiplier = model.creditMultiplier;
                this.description = model.description;
                this.explicitCacheCreationPointsRate = model.explicitCacheCreationPointsRate;
                this.explicitCacheHitPointsRate = model.explicitCacheHitPointsRate;
                this.failureCount = model.failureCount;
                this.featureList = model.featureList;
                this.iconUrl = model.iconUrl;
                this.implicitCacheHitPointsRate = model.implicitCacheHitPointsRate;
                this.inputPointsRate = model.inputPointsRate;
                this.isNew = model.isNew;
                this.llmCode = model.llmCode;
                this.maxOutput = model.maxOutput;
                this.modelBrandName = model.modelBrandName;
                this.modelName = model.modelName;
                this.normalInputPointsRate = model.normalInputPointsRate;
                this.outputPointsRate = model.outputPointsRate;
                this.pointsConsumption = model.pointsConsumption;
                this.successRate = model.successRate;
                this.toolCallPointsRate = model.toolCallPointsRate;
                this.ttftP95Ms = model.ttftP95Ms;
            } 

            /**
             * <p>The average time to first token (TTFT) latency, which is the total duration of valid TTFT samples divided by the number of samples, in milliseconds, rounded to the nearest integer. This field is empty when no valid samples are available. It does not represent the total time taken for a complete response.</p>
             * 
             * <strong>example:</strong>
             * <p>620</p>
             */
            public Builder avgTtftMs(Long avgTtftMs) {
                this.avgTtftMs = avgTtftMs;
                return this;
            }

            /**
             * <p>The proportion of cached input usage to the total input usage, expressed as a decimal between 0 and 1. For example, 0.86 indicates 86%. It is not the proportion of requests that hit the cache. This field is empty when the base usage is incomplete or the total input usage is 0. The return value is rounded to a maximum of 8 decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>0.86</p>
             */
            public Builder cacheHitRate(Double cacheHitRate) {
                this.cacheHitRate = cacheHitRate;
                return this;
            }

            /**
             * <p>The total number of model calls within the query range, including both successful and failed calls.</p>
             * 
             * <strong>example:</strong>
             * <p>12480</p>
             */
            public Builder callCount(Long callCount) {
                this.callCount = callCount;
                return this;
            }

            /**
             * <p>The maximum context length of the model, in tokens. This field is empty when no model information is available.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder contextWindow(Long contextWindow) {
                this.contextWindow = contextWindow;
                return this;
            }

            /**
             * <p>The display range of the credit consumption multiplier, in multiples. It is used to display price hints and is not used to recalculate the PointsConsumption returned by this API operation.</p>
             * <ul>
             * <li>If Min and Max are equal: fixed multiplier.</li>
             * <li>If Max is greater than Min: multiplier range.</li>
             * <li>If Max is empty: starts from the Min multiplier.</li>
             * <li>If the entire object is empty: the model does not participate in credit billing, or no multiplier information is available. An empty value for this field alone cannot determine whether actual charges apply.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Min&quot;:1,&quot;Max&quot;:3}</p>
             */
            public Builder creditMultiplier(CreditMultiplier creditMultiplier) {
                this.creditMultiplier = creditMultiplier;
                return this;
            }

            /**
             * <p>The description of the model. The display language is affected by Language. This field is empty when no description is available.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen large language model</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The proportion of explicit cache creation credits to the total credits. This field is empty when it cannot be calculated.</p>
             * 
             * <strong>example:</strong>
             * <p>0.115</p>
             */
            public Builder explicitCacheCreationPointsRate(Double explicitCacheCreationPointsRate) {
                this.explicitCacheCreationPointsRate = explicitCacheCreationPointsRate;
                return this;
            }

            /**
             * <p>The proportion of explicit cache hit credits to the total credits. This field is empty when it cannot be calculated.</p>
             * 
             * <strong>example:</strong>
             * <p>0.043</p>
             */
            public Builder explicitCacheHitPointsRate(Double explicitCacheHitPointsRate) {
                this.explicitCacheHitPointsRate = explicitCacheHitPointsRate;
                return this;
            }

            /**
             * <p>The number of failed calls within the query range, including failed calls that are throttled.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder failureCount(Long failureCount) {
                this.failureCount = failureCount;
                return this;
            }

            /**
             * <p>The list of model capability tags. The display language is affected by Language. Capabilities without a configured display name retain their original codes. An empty list is returned when no capability information is available. Tags are extensible, not a fixed enumeration, and do not imply that all capabilities can be called through this API operation.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;Text generation&quot;,&quot;Tool calling&quot;]</p>
             */
            public Builder featureList(java.util.List<String> featureList) {
                this.featureList = featureList;
                return this;
            }

            /**
             * <p>The URL of the model brand icon. This field is empty when no brand icon is available. The example URL only illustrates the URL format and is not a fixed download address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/qwen.png">https://example.com/qwen.png</a></p>
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * <p>The proportion of implicit cache hit credits to the total credits. This field is empty when it cannot be calculated.</p>
             * 
             * <strong>example:</strong>
             * <p>0.171</p>
             */
            public Builder implicitCacheHitPointsRate(Double implicitCacheHitPointsRate) {
                this.implicitCacheHitPointsRate = implicitCacheHitPointsRate;
                return this;
            }

            /**
             * <p>The proportion of input credits to the total consumed credits, expressed as a decimal between 0 and 1. For example, 0.739 indicates 73.9%. This field is provided only when the input and output credit details are complete, the values are valid, and the total credits are greater than 0. Otherwise, it is empty.</p>
             * <p>The proportion is rounded to a maximum of 8 decimal places. The sum of input and output credits may be less than the total credits. Additionally, adding this value to OutputPointsRate may result in minor rounding errors. Do not calculate other credits or verify bills based solely on the sum of the proportions.</p>
             * 
             * <strong>example:</strong>
             * <p>0.739</p>
             */
            public Builder inputPointsRate(Double inputPointsRate) {
                this.inputPointsRate = inputPointsRate;
                return this;
            }

            /**
             * <p>The new model tag. The current version does not provide this tag. Ignore this field and do not use it to determine whether a model is newly released.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder isNew(Boolean isNew) {
                this.isNew = isNew;
                return this;
            }

            /**
             * <p>The identifier or code of the model, used to identify the model and associate usage and model information. The return value is an open string and should not be hardcoded as an enumeration on the client side.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-max-2026-01-23</p>
             */
            public Builder llmCode(String llmCode) {
                this.llmCode = llmCode;
                return this;
            }

            /**
             * <p>The maximum output length for a single generation of the model, in tokens. This field is empty when no model information is available.</p>
             * 
             * <strong>example:</strong>
             * <p>65536</p>
             */
            public Builder maxOutput(Long maxOutput) {
                this.maxOutput = maxOutput;
                return this;
            }

            /**
             * <p>The display name of the model brand. The display language is affected by Language. This field is empty when no brand information is available.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen</p>
             */
            public Builder modelBrandName(String modelBrandName) {
                this.modelBrandName = modelBrandName;
                return this;
            }

            /**
             * <p>The display name of the model. The display language is affected by Language. If no name is available, LlmCode is returned. The name may change, so the model code should be used when associating data.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen3 Max</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The proportion of normal input credits to the total credits. This field is empty when it cannot be calculated.</p>
             * 
             * <strong>example:</strong>
             * <p>0.329</p>
             */
            public Builder normalInputPointsRate(Double normalInputPointsRate) {
                this.normalInputPointsRate = normalInputPointsRate;
                return this;
            }

            /**
             * <p>The proportion of output credits to the total consumed credits, expressed as a decimal between 0 and 1. For example, 0.261 indicates 26.1%. This field is provided only when the input and output credit details are complete, the values are valid, and the total credits are greater than 0. Otherwise, it is empty. The proportion is rounded to a maximum of 8 decimal places, and adding this value to InputPointsRate may result in minor rounding errors.</p>
             * 
             * <strong>example:</strong>
             * <p>0.261</p>
             */
            public Builder outputPointsRate(Double outputPointsRate) {
                this.outputPointsRate = outputPointsRate;
                return this;
            }

            /**
             * <p>The actual credits consumed within the query range. The return value can be displayed directly without further conversion. CreditMultiplier is only used to display the multiplier and should not be multiplied by this value.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pointsConsumption(Double pointsConsumption) {
                this.pointsConsumption = pointsConsumption;
                return this;
            }

            /**
             * <p>The number of successful calls divided by the total number of calls, expressed as a decimal between 0 and 1, not a percentage. This field is empty when the number of calls is 0. Multiply this value by 100 to display it as a percentage. The return value is rounded to a maximum of 8 decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>0.98557692</p>
             */
            public Builder successRate(Double successRate) {
                this.successRate = successRate;
                return this;
            }

            /**
             * <p>The proportion of tool calling credits to the total credits. This field is empty when it cannot be calculated.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder toolCallPointsRate(Double toolCallPointsRate) {
                this.toolCallPointsRate = toolCallPointsRate;
                return this;
            }

            /**
             * <p>The 95th percentile value of the time to first token (TTFT) latency, in milliseconds. This field is provided only when corresponding data exists within a fixed statistical window. <strong>It is empty when custom start and end dates are passed, even if the start and end dates are the same.</strong> The value 700 in the field table is an example under a fixed statistical window and does not apply to custom date ranges.</p>
             * 
             * <strong>example:</strong>
             * <p>700</p>
             */
            public Builder ttftP95Ms(Long ttftP95Ms) {
                this.ttftP95Ms = ttftP95Ms;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
