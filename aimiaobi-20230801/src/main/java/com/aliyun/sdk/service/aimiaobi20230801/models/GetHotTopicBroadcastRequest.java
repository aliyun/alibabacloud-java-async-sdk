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
 * {@link GetHotTopicBroadcastRequest} extends {@link RequestModel}
 *
 * <p>GetHotTopicBroadcastRequest</p>
 */
public class GetHotTopicBroadcastRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CalcTotalToken")
    private Boolean calcTotalToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotTopicVersion")
    private String hotTopicVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LocationQuery")
    private String locationQuery;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Locations")
    private java.util.List<String> locations;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StepForCustomSummaryStyleConfig")
    private StepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StepForNewsBroadcastContentConfig")
    private StepForNewsBroadcastContentConfig stepForNewsBroadcastContentConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Topics")
    private java.util.List<String> topics;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetHotTopicBroadcastRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.calcTotalToken = builder.calcTotalToken;
        this.category = builder.category;
        this.current = builder.current;
        this.hotTopicVersion = builder.hotTopicVersion;
        this.locationQuery = builder.locationQuery;
        this.locations = builder.locations;
        this.query = builder.query;
        this.size = builder.size;
        this.stepForCustomSummaryStyleConfig = builder.stepForCustomSummaryStyleConfig;
        this.stepForNewsBroadcastContentConfig = builder.stepForNewsBroadcastContentConfig;
        this.topics = builder.topics;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotTopicBroadcastRequest create() {
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
     * @return calcTotalToken
     */
    public Boolean getCalcTotalToken() {
        return this.calcTotalToken;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return hotTopicVersion
     */
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    /**
     * @return locationQuery
     */
    public String getLocationQuery() {
        return this.locationQuery;
    }

    /**
     * @return locations
     */
    public java.util.List<String> getLocations() {
        return this.locations;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
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

    public static final class Builder extends Request.Builder<GetHotTopicBroadcastRequest, Builder> {
        private String regionId; 
        private Boolean calcTotalToken; 
        private String category; 
        private Integer current; 
        private String hotTopicVersion; 
        private String locationQuery; 
        private java.util.List<String> locations; 
        private String query; 
        private Integer size; 
        private StepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig; 
        private StepForNewsBroadcastContentConfig stepForNewsBroadcastContentConfig; 
        private java.util.List<String> topics; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetHotTopicBroadcastRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.calcTotalToken = request.calcTotalToken;
            this.category = request.category;
            this.current = request.current;
            this.hotTopicVersion = request.hotTopicVersion;
            this.locationQuery = request.locationQuery;
            this.locations = request.locations;
            this.query = request.query;
            this.size = request.size;
            this.stepForCustomSummaryStyleConfig = request.stepForCustomSummaryStyleConfig;
            this.stepForNewsBroadcastContentConfig = request.stepForNewsBroadcastContentConfig;
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
         * CalcTotalToken.
         */
        public Builder calcTotalToken(Boolean calcTotalToken) {
            this.putBodyParameter("CalcTotalToken", calcTotalToken);
            this.calcTotalToken = calcTotalToken;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putBodyParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
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
         * LocationQuery.
         */
        public Builder locationQuery(String locationQuery) {
            this.putBodyParameter("LocationQuery", locationQuery);
            this.locationQuery = locationQuery;
            return this;
        }

        /**
         * Locations.
         */
        public Builder locations(java.util.List<String> locations) {
            String locationsShrink = shrink(locations, "Locations", "json");
            this.putBodyParameter("Locations", locationsShrink);
            this.locations = locations;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * StepForCustomSummaryStyleConfig.
         */
        public Builder stepForCustomSummaryStyleConfig(StepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig) {
            String stepForCustomSummaryStyleConfigShrink = shrink(stepForCustomSummaryStyleConfig, "StepForCustomSummaryStyleConfig", "json");
            this.putBodyParameter("StepForCustomSummaryStyleConfig", stepForCustomSummaryStyleConfigShrink);
            this.stepForCustomSummaryStyleConfig = stepForCustomSummaryStyleConfig;
            return this;
        }

        /**
         * StepForNewsBroadcastContentConfig.
         */
        public Builder stepForNewsBroadcastContentConfig(StepForNewsBroadcastContentConfig stepForNewsBroadcastContentConfig) {
            String stepForNewsBroadcastContentConfigShrink = shrink(stepForNewsBroadcastContentConfig, "StepForNewsBroadcastContentConfig", "json");
            this.putBodyParameter("StepForNewsBroadcastContentConfig", stepForNewsBroadcastContentConfigShrink);
            this.stepForNewsBroadcastContentConfig = stepForNewsBroadcastContentConfig;
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
        public GetHotTopicBroadcastRequest build() {
            return new GetHotTopicBroadcastRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetHotTopicBroadcastRequest} extends {@link TeaModel}
     *
     * <p>GetHotTopicBroadcastRequest</p>
     */
    public static class StepForCustomSummaryStyleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SummaryImageCount")
        private Integer summaryImageCount;

        @com.aliyun.core.annotation.NameInMap("SummaryModel")
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

            private Builder() {
            } 

            private Builder(StepForCustomSummaryStyleConfig model) {
                this.summaryImageCount = model.summaryImageCount;
                this.summaryModel = model.summaryModel;
                this.summaryPrompt = model.summaryPrompt;
            } 

            /**
             * SummaryImageCount.
             */
            public Builder summaryImageCount(Integer summaryImageCount) {
                this.summaryImageCount = summaryImageCount;
                return this;
            }

            /**
             * SummaryModel.
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
     * {@link GetHotTopicBroadcastRequest} extends {@link TeaModel}
     *
     * <p>GetHotTopicBroadcastRequest</p>
     */
    public static class CustomHotValueWeights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private CustomHotValueWeights(Builder builder) {
            this.dimension = builder.dimension;
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
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String dimension; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(CustomHotValueWeights model) {
                this.dimension = model.dimension;
                this.weight = model.weight;
            } 

            /**
             * Dimension.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
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
     * {@link GetHotTopicBroadcastRequest} extends {@link TeaModel}
     *
     * <p>GetHotTopicBroadcastRequest</p>
     */
    public static class StepForNewsBroadcastContentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List<String> categories;

        @com.aliyun.core.annotation.NameInMap("CustomHotValueWeights")
        @Deprecated
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

            private Builder() {
            } 

            private Builder(StepForNewsBroadcastContentConfig model) {
                this.categories = model.categories;
                this.customHotValueWeights = model.customHotValueWeights;
                this.topicCount = model.topicCount;
            } 

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
}
