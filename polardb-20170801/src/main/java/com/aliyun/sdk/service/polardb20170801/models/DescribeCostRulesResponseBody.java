// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeCostRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCostRulesResponseBody</p>
 */
public class DescribeCostRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeCostRulesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCostRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeCostRulesResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of cost rules.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 30, 50, and 100. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeCostRulesResponseBody build() {
            return new DescribeCostRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCostRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCostRulesResponseBody</p>
     */
    public static class InputTokenTiers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputCostPointsPerMillion")
        private String inputCostPointsPerMillion;

        @com.aliyun.core.annotation.NameInMap("Tier")
        private String tier;

        private InputTokenTiers(Builder builder) {
            this.inputCostPointsPerMillion = builder.inputCostPointsPerMillion;
            this.tier = builder.tier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputTokenTiers create() {
            return builder().build();
        }

        /**
         * @return inputCostPointsPerMillion
         */
        public String getInputCostPointsPerMillion() {
            return this.inputCostPointsPerMillion;
        }

        /**
         * @return tier
         */
        public String getTier() {
            return this.tier;
        }

        public static final class Builder {
            private String inputCostPointsPerMillion; 
            private String tier; 

            private Builder() {
            } 

            private Builder(InputTokenTiers model) {
                this.inputCostPointsPerMillion = model.inputCostPointsPerMillion;
                this.tier = model.tier;
            } 

            /**
             * <p>The input cost points per million tokens for the tier.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder inputCostPointsPerMillion(String inputCostPointsPerMillion) {
                this.inputCostPointsPerMillion = inputCostPointsPerMillion;
                return this;
            }

            /**
             * <p>The token tier. Valid values: &quot;&quot; (default tier), 0-32K, 32K-64K, 64K-128K, 128K-256K, 256K-512K, 512K-1M, and 1M+.</p>
             * 
             * <strong>example:</strong>
             * <p>0-32K</p>
             */
            public Builder tier(String tier) {
                this.tier = tier;
                return this;
            }

            public InputTokenTiers build() {
                return new InputTokenTiers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCostRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCostRulesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheCostPointsPerMillion")
        private String cacheCostPointsPerMillion;

        @com.aliyun.core.annotation.NameInMap("CacheCreationCostPointsPerMillion")
        private String cacheCreationCostPointsPerMillion;

        @com.aliyun.core.annotation.NameInMap("CostRuleId")
        private String costRuleId;

        @com.aliyun.core.annotation.NameInMap("EffectiveEndTime")
        private String effectiveEndTime;

        @com.aliyun.core.annotation.NameInMap("EffectiveStartTime")
        private String effectiveStartTime;

        @com.aliyun.core.annotation.NameInMap("EffectiveTargetType")
        private String effectiveTargetType;

        @com.aliyun.core.annotation.NameInMap("EffectiveTargetValue")
        private String effectiveTargetValue;

        @com.aliyun.core.annotation.NameInMap("ExplicitCacheCostPointsPerMillion")
        private String explicitCacheCostPointsPerMillion;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GwClusterId")
        private String gwClusterId;

        @com.aliyun.core.annotation.NameInMap("ImageCostPointsPerCount")
        private String imageCostPointsPerCount;

        @com.aliyun.core.annotation.NameInMap("InputCostPointsPerMillion")
        private String inputCostPointsPerMillion;

        @com.aliyun.core.annotation.NameInMap("InputTokenTier")
        private String inputTokenTier;

        @com.aliyun.core.annotation.NameInMap("InputTokenTiers")
        private java.util.List<InputTokenTiers> inputTokenTiers;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("ModelServiceId")
        private String modelServiceId;

        @com.aliyun.core.annotation.NameInMap("ModelServiceName")
        private String modelServiceName;

        @com.aliyun.core.annotation.NameInMap("OutputCostPointsPerMillion")
        private String outputCostPointsPerMillion;

        @com.aliyun.core.annotation.NameInMap("VideoCostPointsPerSecond")
        private String videoCostPointsPerSecond;

        private Items(Builder builder) {
            this.cacheCostPointsPerMillion = builder.cacheCostPointsPerMillion;
            this.cacheCreationCostPointsPerMillion = builder.cacheCreationCostPointsPerMillion;
            this.costRuleId = builder.costRuleId;
            this.effectiveEndTime = builder.effectiveEndTime;
            this.effectiveStartTime = builder.effectiveStartTime;
            this.effectiveTargetType = builder.effectiveTargetType;
            this.effectiveTargetValue = builder.effectiveTargetValue;
            this.explicitCacheCostPointsPerMillion = builder.explicitCacheCostPointsPerMillion;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.gwClusterId = builder.gwClusterId;
            this.imageCostPointsPerCount = builder.imageCostPointsPerCount;
            this.inputCostPointsPerMillion = builder.inputCostPointsPerMillion;
            this.inputTokenTier = builder.inputTokenTier;
            this.inputTokenTiers = builder.inputTokenTiers;
            this.model = builder.model;
            this.modelServiceId = builder.modelServiceId;
            this.modelServiceName = builder.modelServiceName;
            this.outputCostPointsPerMillion = builder.outputCostPointsPerMillion;
            this.videoCostPointsPerSecond = builder.videoCostPointsPerSecond;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return cacheCostPointsPerMillion
         */
        public String getCacheCostPointsPerMillion() {
            return this.cacheCostPointsPerMillion;
        }

        /**
         * @return cacheCreationCostPointsPerMillion
         */
        public String getCacheCreationCostPointsPerMillion() {
            return this.cacheCreationCostPointsPerMillion;
        }

        /**
         * @return costRuleId
         */
        public String getCostRuleId() {
            return this.costRuleId;
        }

        /**
         * @return effectiveEndTime
         */
        public String getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        /**
         * @return effectiveStartTime
         */
        public String getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        /**
         * @return effectiveTargetType
         */
        public String getEffectiveTargetType() {
            return this.effectiveTargetType;
        }

        /**
         * @return effectiveTargetValue
         */
        public String getEffectiveTargetValue() {
            return this.effectiveTargetValue;
        }

        /**
         * @return explicitCacheCostPointsPerMillion
         */
        public String getExplicitCacheCostPointsPerMillion() {
            return this.explicitCacheCostPointsPerMillion;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gwClusterId
         */
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        /**
         * @return imageCostPointsPerCount
         */
        public String getImageCostPointsPerCount() {
            return this.imageCostPointsPerCount;
        }

        /**
         * @return inputCostPointsPerMillion
         */
        public String getInputCostPointsPerMillion() {
            return this.inputCostPointsPerMillion;
        }

        /**
         * @return inputTokenTier
         */
        public String getInputTokenTier() {
            return this.inputTokenTier;
        }

        /**
         * @return inputTokenTiers
         */
        public java.util.List<InputTokenTiers> getInputTokenTiers() {
            return this.inputTokenTiers;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return modelServiceId
         */
        public String getModelServiceId() {
            return this.modelServiceId;
        }

        /**
         * @return modelServiceName
         */
        public String getModelServiceName() {
            return this.modelServiceName;
        }

        /**
         * @return outputCostPointsPerMillion
         */
        public String getOutputCostPointsPerMillion() {
            return this.outputCostPointsPerMillion;
        }

        /**
         * @return videoCostPointsPerSecond
         */
        public String getVideoCostPointsPerSecond() {
            return this.videoCostPointsPerSecond;
        }

        public static final class Builder {
            private String cacheCostPointsPerMillion; 
            private String cacheCreationCostPointsPerMillion; 
            private String costRuleId; 
            private String effectiveEndTime; 
            private String effectiveStartTime; 
            private String effectiveTargetType; 
            private String effectiveTargetValue; 
            private String explicitCacheCostPointsPerMillion; 
            private String gmtCreated; 
            private String gmtModified; 
            private String gwClusterId; 
            private String imageCostPointsPerCount; 
            private String inputCostPointsPerMillion; 
            private String inputTokenTier; 
            private java.util.List<InputTokenTiers> inputTokenTiers; 
            private String model; 
            private String modelServiceId; 
            private String modelServiceName; 
            private String outputCostPointsPerMillion; 
            private String videoCostPointsPerSecond; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.cacheCostPointsPerMillion = model.cacheCostPointsPerMillion;
                this.cacheCreationCostPointsPerMillion = model.cacheCreationCostPointsPerMillion;
                this.costRuleId = model.costRuleId;
                this.effectiveEndTime = model.effectiveEndTime;
                this.effectiveStartTime = model.effectiveStartTime;
                this.effectiveTargetType = model.effectiveTargetType;
                this.effectiveTargetValue = model.effectiveTargetValue;
                this.explicitCacheCostPointsPerMillion = model.explicitCacheCostPointsPerMillion;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.gwClusterId = model.gwClusterId;
                this.imageCostPointsPerCount = model.imageCostPointsPerCount;
                this.inputCostPointsPerMillion = model.inputCostPointsPerMillion;
                this.inputTokenTier = model.inputTokenTier;
                this.inputTokenTiers = model.inputTokenTiers;
                this.model = model.model;
                this.modelServiceId = model.modelServiceId;
                this.modelServiceName = model.modelServiceName;
                this.outputCostPointsPerMillion = model.outputCostPointsPerMillion;
                this.videoCostPointsPerSecond = model.videoCostPointsPerSecond;
            } 

            /**
             * <p>The cache read cost points per million tokens. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cacheCostPointsPerMillion(String cacheCostPointsPerMillion) {
                this.cacheCostPointsPerMillion = cacheCostPointsPerMillion;
                return this;
            }

            /**
             * <p>The cache creation cost points per million tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder cacheCreationCostPointsPerMillion(String cacheCreationCostPointsPerMillion) {
                this.cacheCreationCostPointsPerMillion = cacheCreationCostPointsPerMillion;
                return this;
            }

            /**
             * <p>The ID of the cost rule.</p>
             * 
             * <strong>example:</strong>
             * <p>924d450014e64e88ac6e8486f8e990**</p>
             */
            public Builder costRuleId(String costRuleId) {
                this.costRuleId = costRuleId;
                return this;
            }

            /**
             * <p>The end time of the effective period. The time is displayed in UTC in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-01T00:00:00Z</p>
             */
            public Builder effectiveEndTime(String effectiveEndTime) {
                this.effectiveEndTime = effectiveEndTime;
                return this;
            }

            /**
             * <p>The start time of the effective period. The time is displayed in UTC in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01T00:00:00Z</p>
             */
            public Builder effectiveStartTime(String effectiveStartTime) {
                this.effectiveStartTime = effectiveStartTime;
                return this;
            }

            /**
             * <p>The type of the effective target.</p>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder effectiveTargetType(String effectiveTargetType) {
                this.effectiveTargetType = effectiveTargetType;
                return this;
            }

            /**
             * <p>The value of the effective target.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder effectiveTargetValue(String effectiveTargetValue) {
                this.effectiveTargetValue = effectiveTargetValue;
                return this;
            }

            /**
             * <p>The explicit cache read cost points per million tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder explicitCacheCostPointsPerMillion(String explicitCacheCostPointsPerMillion) {
                this.explicitCacheCostPointsPerMillion = explicitCacheCostPointsPerMillion;
                return this;
            }

            /**
             * <p>The time when the cost rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-04T16:09:29+08:00</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the cost rule was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-16 16:46:20</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The gateway instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-xxxxxxxxxx</p>
             */
            public Builder gwClusterId(String gwClusterId) {
                this.gwClusterId = gwClusterId;
                return this;
            }

            /**
             * <p>The image input cost points per image.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder imageCostPointsPerCount(String imageCostPointsPerCount) {
                this.imageCostPointsPerCount = imageCostPointsPerCount;
                return this;
            }

            /**
             * <p>The input cost points per million tokens. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder inputCostPointsPerMillion(String inputCostPointsPerMillion) {
                this.inputCostPointsPerMillion = inputCostPointsPerMillion;
                return this;
            }

            /**
             * <p>The input token tier. An empty value indicates a legacy or default rule.</p>
             * 
             * <strong>example:</strong>
             * <p>0-32K</p>
             */
            public Builder inputTokenTier(String inputTokenTier) {
                this.inputTokenTier = inputTokenTier;
                return this;
            }

            /**
             * <p>The non-cumulative tiered pricing for input tokens. Each element contains Tier and InputCostPointsPerMillion.</p>
             */
            public Builder inputTokenTiers(java.util.List<InputTokenTiers> inputTokenTiers) {
                this.inputTokenTiers = inputTokenTiers;
                return this;
            }

            /**
             * <p>The name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>gpt-4</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The ID of the model service.</p>
             * 
             * <strong>example:</strong>
             * <p>ms-xxxxxxxxx</p>
             */
            public Builder modelServiceId(String modelServiceId) {
                this.modelServiceId = modelServiceId;
                return this;
            }

            /**
             * <p>The model service name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-service</p>
             */
            public Builder modelServiceName(String modelServiceName) {
                this.modelServiceName = modelServiceName;
                return this;
            }

            /**
             * <p>The output cost points per million tokens. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder outputCostPointsPerMillion(String outputCostPointsPerMillion) {
                this.outputCostPointsPerMillion = outputCostPointsPerMillion;
                return this;
            }

            /**
             * <p>The video input cost points per second.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder videoCostPointsPerSecond(String videoCostPointsPerSecond) {
                this.videoCostPointsPerSecond = videoCostPointsPerSecond;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
