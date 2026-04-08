// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AiToolSelectionConfig} extends {@link TeaModel}
 *
 * <p>AiToolSelectionConfig</p>
 */
public class AiToolSelectionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enableConditions")
    private EnableConditions enableConditions;

    @com.aliyun.core.annotation.NameInMap("pluginStatus")
    private AiPluginStatus pluginStatus;

    @com.aliyun.core.annotation.NameInMap("queryRewriting")
    private QueryRewriting queryRewriting;

    @com.aliyun.core.annotation.NameInMap("toolReranking")
    private ToolReranking toolReranking;

    private AiToolSelectionConfig(Builder builder) {
        this.enableConditions = builder.enableConditions;
        this.pluginStatus = builder.pluginStatus;
        this.queryRewriting = builder.queryRewriting;
        this.toolReranking = builder.toolReranking;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiToolSelectionConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableConditions
     */
    public EnableConditions getEnableConditions() {
        return this.enableConditions;
    }

    /**
     * @return pluginStatus
     */
    public AiPluginStatus getPluginStatus() {
        return this.pluginStatus;
    }

    /**
     * @return queryRewriting
     */
    public QueryRewriting getQueryRewriting() {
        return this.queryRewriting;
    }

    /**
     * @return toolReranking
     */
    public ToolReranking getToolReranking() {
        return this.toolReranking;
    }

    public static final class Builder {
        private EnableConditions enableConditions; 
        private AiPluginStatus pluginStatus; 
        private QueryRewriting queryRewriting; 
        private ToolReranking toolReranking; 

        private Builder() {
        } 

        private Builder(AiToolSelectionConfig model) {
            this.enableConditions = model.enableConditions;
            this.pluginStatus = model.pluginStatus;
            this.queryRewriting = model.queryRewriting;
            this.toolReranking = model.toolReranking;
        } 

        /**
         * enableConditions.
         */
        public Builder enableConditions(EnableConditions enableConditions) {
            this.enableConditions = enableConditions;
            return this;
        }

        /**
         * pluginStatus.
         */
        public Builder pluginStatus(AiPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }

        /**
         * queryRewriting.
         */
        public Builder queryRewriting(QueryRewriting queryRewriting) {
            this.queryRewriting = queryRewriting;
            return this;
        }

        /**
         * toolReranking.
         */
        public Builder toolReranking(ToolReranking toolReranking) {
            this.toolReranking = toolReranking;
            return this;
        }

        public AiToolSelectionConfig build() {
            return new AiToolSelectionConfig(this);
        } 

    } 

    /**
     * 
     * {@link AiToolSelectionConfig} extends {@link TeaModel}
     *
     * <p>AiToolSelectionConfig</p>
     */
    public static class EnableConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("toolCountThreshold")
        private Integer toolCountThreshold;

        private EnableConditions(Builder builder) {
            this.toolCountThreshold = builder.toolCountThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnableConditions create() {
            return builder().build();
        }

        /**
         * @return toolCountThreshold
         */
        public Integer getToolCountThreshold() {
            return this.toolCountThreshold;
        }

        public static final class Builder {
            private Integer toolCountThreshold; 

            private Builder() {
            } 

            private Builder(EnableConditions model) {
                this.toolCountThreshold = model.toolCountThreshold;
            } 

            /**
             * toolCountThreshold.
             */
            public Builder toolCountThreshold(Integer toolCountThreshold) {
                this.toolCountThreshold = toolCountThreshold;
                return this;
            }

            public EnableConditions build() {
                return new EnableConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiToolSelectionConfig} extends {@link TeaModel}
     *
     * <p>AiToolSelectionConfig</p>
     */
    public static class ContextSelection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private Integer value;

        private ContextSelection(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContextSelection create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(ContextSelection model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public ContextSelection build() {
                return new ContextSelection(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiToolSelectionConfig} extends {@link TeaModel}
     *
     * <p>AiToolSelectionConfig</p>
     */
    public static class ModelService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("timeoutMillisecond")
        private Integer timeoutMillisecond;

        private ModelService(Builder builder) {
            this.modelName = builder.modelName;
            this.serviceId = builder.serviceId;
            this.timeoutMillisecond = builder.timeoutMillisecond;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelService create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return timeoutMillisecond
         */
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        public static final class Builder {
            private String modelName; 
            private String serviceId; 
            private Integer timeoutMillisecond; 

            private Builder() {
            } 

            private Builder(ModelService model) {
                this.modelName = model.modelName;
                this.serviceId = model.serviceId;
                this.timeoutMillisecond = model.timeoutMillisecond;
            } 

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * timeoutMillisecond.
             */
            public Builder timeoutMillisecond(Integer timeoutMillisecond) {
                this.timeoutMillisecond = timeoutMillisecond;
                return this;
            }

            public ModelService build() {
                return new ModelService(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiToolSelectionConfig} extends {@link TeaModel}
     *
     * <p>AiToolSelectionConfig</p>
     */
    public static class PromptConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customPrompt")
        private String customPrompt;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private PromptConfig(Builder builder) {
            this.customPrompt = builder.customPrompt;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromptConfig create() {
            return builder().build();
        }

        /**
         * @return customPrompt
         */
        public String getCustomPrompt() {
            return this.customPrompt;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String customPrompt; 
            private String type; 

            private Builder() {
            } 

            private Builder(PromptConfig model) {
                this.customPrompt = model.customPrompt;
                this.type = model.type;
            } 

            /**
             * customPrompt.
             */
            public Builder customPrompt(String customPrompt) {
                this.customPrompt = customPrompt;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PromptConfig build() {
                return new PromptConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiToolSelectionConfig} extends {@link TeaModel}
     *
     * <p>AiToolSelectionConfig</p>
     */
    public static class TriggerConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("messageCountThreshold")
        private Integer messageCountThreshold;

        private TriggerConditions(Builder builder) {
            this.messageCountThreshold = builder.messageCountThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggerConditions create() {
            return builder().build();
        }

        /**
         * @return messageCountThreshold
         */
        public Integer getMessageCountThreshold() {
            return this.messageCountThreshold;
        }

        public static final class Builder {
            private Integer messageCountThreshold; 

            private Builder() {
            } 

            private Builder(TriggerConditions model) {
                this.messageCountThreshold = model.messageCountThreshold;
            } 

            /**
             * messageCountThreshold.
             */
            public Builder messageCountThreshold(Integer messageCountThreshold) {
                this.messageCountThreshold = messageCountThreshold;
                return this;
            }

            public TriggerConditions build() {
                return new TriggerConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiToolSelectionConfig} extends {@link TeaModel}
     *
     * <p>AiToolSelectionConfig</p>
     */
    public static class QueryRewriting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contextSelection")
        private ContextSelection contextSelection;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("fallbackStrategy")
        private String fallbackStrategy;

        @com.aliyun.core.annotation.NameInMap("maxOutputTokens")
        private Integer maxOutputTokens;

        @com.aliyun.core.annotation.NameInMap("modelService")
        private ModelService modelService;

        @com.aliyun.core.annotation.NameInMap("promptConfig")
        private PromptConfig promptConfig;

        @com.aliyun.core.annotation.NameInMap("triggerConditions")
        private TriggerConditions triggerConditions;

        private QueryRewriting(Builder builder) {
            this.contextSelection = builder.contextSelection;
            this.enabled = builder.enabled;
            this.fallbackStrategy = builder.fallbackStrategy;
            this.maxOutputTokens = builder.maxOutputTokens;
            this.modelService = builder.modelService;
            this.promptConfig = builder.promptConfig;
            this.triggerConditions = builder.triggerConditions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryRewriting create() {
            return builder().build();
        }

        /**
         * @return contextSelection
         */
        public ContextSelection getContextSelection() {
            return this.contextSelection;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return fallbackStrategy
         */
        public String getFallbackStrategy() {
            return this.fallbackStrategy;
        }

        /**
         * @return maxOutputTokens
         */
        public Integer getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        /**
         * @return modelService
         */
        public ModelService getModelService() {
            return this.modelService;
        }

        /**
         * @return promptConfig
         */
        public PromptConfig getPromptConfig() {
            return this.promptConfig;
        }

        /**
         * @return triggerConditions
         */
        public TriggerConditions getTriggerConditions() {
            return this.triggerConditions;
        }

        public static final class Builder {
            private ContextSelection contextSelection; 
            private Boolean enabled; 
            private String fallbackStrategy; 
            private Integer maxOutputTokens; 
            private ModelService modelService; 
            private PromptConfig promptConfig; 
            private TriggerConditions triggerConditions; 

            private Builder() {
            } 

            private Builder(QueryRewriting model) {
                this.contextSelection = model.contextSelection;
                this.enabled = model.enabled;
                this.fallbackStrategy = model.fallbackStrategy;
                this.maxOutputTokens = model.maxOutputTokens;
                this.modelService = model.modelService;
                this.promptConfig = model.promptConfig;
                this.triggerConditions = model.triggerConditions;
            } 

            /**
             * contextSelection.
             */
            public Builder contextSelection(ContextSelection contextSelection) {
                this.contextSelection = contextSelection;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * fallbackStrategy.
             */
            public Builder fallbackStrategy(String fallbackStrategy) {
                this.fallbackStrategy = fallbackStrategy;
                return this;
            }

            /**
             * maxOutputTokens.
             */
            public Builder maxOutputTokens(Integer maxOutputTokens) {
                this.maxOutputTokens = maxOutputTokens;
                return this;
            }

            /**
             * modelService.
             */
            public Builder modelService(ModelService modelService) {
                this.modelService = modelService;
                return this;
            }

            /**
             * promptConfig.
             */
            public Builder promptConfig(PromptConfig promptConfig) {
                this.promptConfig = promptConfig;
                return this;
            }

            /**
             * triggerConditions.
             */
            public Builder triggerConditions(TriggerConditions triggerConditions) {
                this.triggerConditions = triggerConditions;
                return this;
            }

            public QueryRewriting build() {
                return new QueryRewriting(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiToolSelectionConfig} extends {@link TeaModel}
     *
     * <p>AiToolSelectionConfig</p>
     */
    public static class ToolRerankingModelService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("timeoutMillisecond")
        private Integer timeoutMillisecond;

        private ToolRerankingModelService(Builder builder) {
            this.modelName = builder.modelName;
            this.serviceId = builder.serviceId;
            this.timeoutMillisecond = builder.timeoutMillisecond;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolRerankingModelService create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return timeoutMillisecond
         */
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        public static final class Builder {
            private String modelName; 
            private String serviceId; 
            private Integer timeoutMillisecond; 

            private Builder() {
            } 

            private Builder(ToolRerankingModelService model) {
                this.modelName = model.modelName;
                this.serviceId = model.serviceId;
                this.timeoutMillisecond = model.timeoutMillisecond;
            } 

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * timeoutMillisecond.
             */
            public Builder timeoutMillisecond(Integer timeoutMillisecond) {
                this.timeoutMillisecond = timeoutMillisecond;
                return this;
            }

            public ToolRerankingModelService build() {
                return new ToolRerankingModelService(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiToolSelectionConfig} extends {@link TeaModel}
     *
     * <p>AiToolSelectionConfig</p>
     */
    public static class ToolReranking extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fallbackStrategy")
        private String fallbackStrategy;

        @com.aliyun.core.annotation.NameInMap("filteringMethod")
        private String filteringMethod;

        @com.aliyun.core.annotation.NameInMap("modelService")
        private ToolRerankingModelService modelService;

        @com.aliyun.core.annotation.NameInMap("scoreThreshold")
        private Float scoreThreshold;

        @com.aliyun.core.annotation.NameInMap("topKPercent")
        private Integer topKPercent;

        @com.aliyun.core.annotation.NameInMap("topNCount")
        private Integer topNCount;

        private ToolReranking(Builder builder) {
            this.fallbackStrategy = builder.fallbackStrategy;
            this.filteringMethod = builder.filteringMethod;
            this.modelService = builder.modelService;
            this.scoreThreshold = builder.scoreThreshold;
            this.topKPercent = builder.topKPercent;
            this.topNCount = builder.topNCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolReranking create() {
            return builder().build();
        }

        /**
         * @return fallbackStrategy
         */
        public String getFallbackStrategy() {
            return this.fallbackStrategy;
        }

        /**
         * @return filteringMethod
         */
        public String getFilteringMethod() {
            return this.filteringMethod;
        }

        /**
         * @return modelService
         */
        public ToolRerankingModelService getModelService() {
            return this.modelService;
        }

        /**
         * @return scoreThreshold
         */
        public Float getScoreThreshold() {
            return this.scoreThreshold;
        }

        /**
         * @return topKPercent
         */
        public Integer getTopKPercent() {
            return this.topKPercent;
        }

        /**
         * @return topNCount
         */
        public Integer getTopNCount() {
            return this.topNCount;
        }

        public static final class Builder {
            private String fallbackStrategy; 
            private String filteringMethod; 
            private ToolRerankingModelService modelService; 
            private Float scoreThreshold; 
            private Integer topKPercent; 
            private Integer topNCount; 

            private Builder() {
            } 

            private Builder(ToolReranking model) {
                this.fallbackStrategy = model.fallbackStrategy;
                this.filteringMethod = model.filteringMethod;
                this.modelService = model.modelService;
                this.scoreThreshold = model.scoreThreshold;
                this.topKPercent = model.topKPercent;
                this.topNCount = model.topNCount;
            } 

            /**
             * fallbackStrategy.
             */
            public Builder fallbackStrategy(String fallbackStrategy) {
                this.fallbackStrategy = fallbackStrategy;
                return this;
            }

            /**
             * filteringMethod.
             */
            public Builder filteringMethod(String filteringMethod) {
                this.filteringMethod = filteringMethod;
                return this;
            }

            /**
             * modelService.
             */
            public Builder modelService(ToolRerankingModelService modelService) {
                this.modelService = modelService;
                return this;
            }

            /**
             * scoreThreshold.
             */
            public Builder scoreThreshold(Float scoreThreshold) {
                this.scoreThreshold = scoreThreshold;
                return this;
            }

            /**
             * topKPercent.
             */
            public Builder topKPercent(Integer topKPercent) {
                this.topKPercent = topKPercent;
                return this;
            }

            /**
             * topNCount.
             */
            public Builder topNCount(Integer topNCount) {
                this.topNCount = topNCount;
                return this;
            }

            public ToolReranking build() {
                return new ToolReranking(this);
            } 

        } 

    }
}
