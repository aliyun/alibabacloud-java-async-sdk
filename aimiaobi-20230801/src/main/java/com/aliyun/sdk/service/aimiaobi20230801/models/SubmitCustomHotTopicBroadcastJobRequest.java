// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link SubmitCustomHotTopicBroadcastJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitCustomHotTopicBroadcastJobRequest</p>
 */
public class SubmitCustomHotTopicBroadcastJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotTopicBroadcastConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private HotTopicBroadcastConfig hotTopicBroadcastConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotTopicVersion")
    private String hotTopicVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Topics")
    private java.util.List<String> topics;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SubmitCustomHotTopicBroadcastJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.hotTopicBroadcastConfig = builder.hotTopicBroadcastConfig;
        this.hotTopicVersion = builder.hotTopicVersion;
        this.topics = builder.topics;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCustomHotTopicBroadcastJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return hotTopicBroadcastConfig
     */
    public HotTopicBroadcastConfig getHotTopicBroadcastConfig() {
        return this.hotTopicBroadcastConfig;
    }

    /**
     * @return hotTopicVersion
     */
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    /**
     * @return topics
     */
    public java.util.List<String> getTopics() {
        return this.topics;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SubmitCustomHotTopicBroadcastJobRequest, Builder> {
        private String regionId; 
        private HotTopicBroadcastConfig hotTopicBroadcastConfig; 
        private String hotTopicVersion; 
        private java.util.List<String> topics; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCustomHotTopicBroadcastJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.hotTopicBroadcastConfig = request.hotTopicBroadcastConfig;
            this.hotTopicVersion = request.hotTopicVersion;
            this.topics = request.topics;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hotTopicBroadcastConfig(HotTopicBroadcastConfig hotTopicBroadcastConfig) {
            String hotTopicBroadcastConfigShrink = shrink(hotTopicBroadcastConfig, "HotTopicBroadcastConfig", "json");
            this.putBodyParameter("HotTopicBroadcastConfig", hotTopicBroadcastConfigShrink);
            this.hotTopicBroadcastConfig = hotTopicBroadcastConfig;
            return this;
        }

        /**
         * HotTopicVersion.
         */
        public Builder hotTopicVersion(String hotTopicVersion) {
            this.putBodyParameter("HotTopicVersion", hotTopicVersion);
            this.hotTopicVersion = hotTopicVersion;
            return this;
        }

        /**
         * Topics.
         */
        public Builder topics(java.util.List<String> topics) {
            String topicsShrink = shrink(topics, "Topics", "json");
            this.putBodyParameter("Topics", topicsShrink);
            this.topics = topics;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SubmitCustomHotTopicBroadcastJobRequest build() {
            return new SubmitCustomHotTopicBroadcastJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitCustomHotTopicBroadcastJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitCustomHotTopicBroadcastJobRequest</p>
     */
    public static class StepForCustomSummaryStyleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SummaryImageCount")
        private Integer summaryImageCount;

        @com.aliyun.core.annotation.NameInMap("SummaryModel")
        @com.aliyun.core.annotation.Validation(required = true)
        private String summaryModel;

        @com.aliyun.core.annotation.NameInMap("SummaryPrompt")
        private String summaryPrompt;

        private StepForCustomSummaryStyleConfig(Builder builder) {
            this.summaryImageCount = builder.summaryImageCount;
            this.summaryModel = builder.summaryModel;
            this.summaryPrompt = builder.summaryPrompt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepForCustomSummaryStyleConfig create() {
            return builder().build();
        }

        /**
         * @return summaryImageCount
         */
        public Integer getSummaryImageCount() {
            return this.summaryImageCount;
        }

        /**
         * @return summaryModel
         */
        public String getSummaryModel() {
            return this.summaryModel;
        }

        /**
         * @return summaryPrompt
         */
        public String getSummaryPrompt() {
            return this.summaryPrompt;
        }

        public static final class Builder {
            private Integer summaryImageCount; 
            private String summaryModel; 
            private String summaryPrompt; 

            /**
             * SummaryImageCount.
             */
            public Builder summaryImageCount(Integer summaryImageCount) {
                this.summaryImageCount = summaryImageCount;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-max</p>
             */
            public Builder summaryModel(String summaryModel) {
                this.summaryModel = summaryModel;
                return this;
            }

            /**
             * SummaryPrompt.
             */
            public Builder summaryPrompt(String summaryPrompt) {
                this.summaryPrompt = summaryPrompt;
                return this;
            }

            public StepForCustomSummaryStyleConfig build() {
                return new StepForCustomSummaryStyleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitCustomHotTopicBroadcastJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitCustomHotTopicBroadcastJobRequest</p>
     */
    public static class CustomHotValueWeights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("DimensionName")
        private String dimensionName;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private CustomHotValueWeights(Builder builder) {
            this.dimension = builder.dimension;
            this.dimensionName = builder.dimensionName;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomHotValueWeights create() {
            return builder().build();
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        /**
         * @return dimensionName
         */
        public String getDimensionName() {
            return this.dimensionName;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String dimension; 
            private String dimensionName; 
            private Integer weight; 

            /**
             * Dimension.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * DimensionName.
             */
            public Builder dimensionName(String dimensionName) {
                this.dimensionName = dimensionName;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public CustomHotValueWeights build() {
                return new CustomHotValueWeights(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitCustomHotTopicBroadcastJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitCustomHotTopicBroadcastJobRequest</p>
     */
    public static class StepForNewsBroadcastContentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List<String> categories;

        @com.aliyun.core.annotation.NameInMap("CustomHotValueWeights")
        private java.util.List<CustomHotValueWeights> customHotValueWeights;

        @com.aliyun.core.annotation.NameInMap("TopicCount")
        private Integer topicCount;

        private StepForNewsBroadcastContentConfig(Builder builder) {
            this.categories = builder.categories;
            this.customHotValueWeights = builder.customHotValueWeights;
            this.topicCount = builder.topicCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepForNewsBroadcastContentConfig create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        /**
         * @return customHotValueWeights
         */
        public java.util.List<CustomHotValueWeights> getCustomHotValueWeights() {
            return this.customHotValueWeights;
        }

        /**
         * @return topicCount
         */
        public Integer getTopicCount() {
            return this.topicCount;
        }

        public static final class Builder {
            private java.util.List<String> categories; 
            private java.util.List<CustomHotValueWeights> customHotValueWeights; 
            private Integer topicCount; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List<String> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * CustomHotValueWeights.
             */
            public Builder customHotValueWeights(java.util.List<CustomHotValueWeights> customHotValueWeights) {
                this.customHotValueWeights = customHotValueWeights;
                return this;
            }

            /**
             * TopicCount.
             */
            public Builder topicCount(Integer topicCount) {
                this.topicCount = topicCount;
                return this;
            }

            public StepForNewsBroadcastContentConfig build() {
                return new StepForNewsBroadcastContentConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitCustomHotTopicBroadcastJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitCustomHotTopicBroadcastJobRequest</p>
     */
    public static class HotTopicBroadcastConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StepForCustomSummaryStyleConfig")
        @com.aliyun.core.annotation.Validation(required = true)
        private StepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig;

        @com.aliyun.core.annotation.NameInMap("StepForNewsBroadcastContentConfig")
        @com.aliyun.core.annotation.Validation(required = true)
        private StepForNewsBroadcastContentConfig stepForNewsBroadcastContentConfig;

        private HotTopicBroadcastConfig(Builder builder) {
            this.stepForCustomSummaryStyleConfig = builder.stepForCustomSummaryStyleConfig;
            this.stepForNewsBroadcastContentConfig = builder.stepForNewsBroadcastContentConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotTopicBroadcastConfig create() {
            return builder().build();
        }

        /**
         * @return stepForCustomSummaryStyleConfig
         */
        public StepForCustomSummaryStyleConfig getStepForCustomSummaryStyleConfig() {
            return this.stepForCustomSummaryStyleConfig;
        }

        /**
         * @return stepForNewsBroadcastContentConfig
         */
        public StepForNewsBroadcastContentConfig getStepForNewsBroadcastContentConfig() {
            return this.stepForNewsBroadcastContentConfig;
        }

        public static final class Builder {
            private StepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig; 
            private StepForNewsBroadcastContentConfig stepForNewsBroadcastContentConfig; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder stepForCustomSummaryStyleConfig(StepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig) {
                this.stepForCustomSummaryStyleConfig = stepForCustomSummaryStyleConfig;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder stepForNewsBroadcastContentConfig(StepForNewsBroadcastContentConfig stepForNewsBroadcastContentConfig) {
                this.stepForNewsBroadcastContentConfig = stepForNewsBroadcastContentConfig;
                return this;
            }

            public HotTopicBroadcastConfig build() {
                return new HotTopicBroadcastConfig(this);
            } 

        } 

    }
}
