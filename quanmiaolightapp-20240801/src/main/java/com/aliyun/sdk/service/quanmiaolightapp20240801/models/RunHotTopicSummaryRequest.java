// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link RunHotTopicSummaryRequest} extends {@link RequestModel}
 *
 * <p>RunHotTopicSummaryRequest</p>
 */
public class RunHotTopicSummaryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hotTopicVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotTopicVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stepForCustomSummaryStyleConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private StepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topicIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> topicIds;

    private RunHotTopicSummaryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.hotTopicVersion = builder.hotTopicVersion;
        this.stepForCustomSummaryStyleConfig = builder.stepForCustomSummaryStyleConfig;
        this.topicIds = builder.topicIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunHotTopicSummaryRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return hotTopicVersion
     */
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    /**
     * @return stepForCustomSummaryStyleConfig
     */
    public StepForCustomSummaryStyleConfig getStepForCustomSummaryStyleConfig() {
        return this.stepForCustomSummaryStyleConfig;
    }

    /**
     * @return topicIds
     */
    public java.util.List<String> getTopicIds() {
        return this.topicIds;
    }

    public static final class Builder extends Request.Builder<RunHotTopicSummaryRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String hotTopicVersion; 
        private StepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig; 
        private java.util.List<String> topicIds; 

        private Builder() {
            super();
        } 

        private Builder(RunHotTopicSummaryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.hotTopicVersion = request.hotTopicVersion;
            this.stepForCustomSummaryStyleConfig = request.stepForCustomSummaryStyleConfig;
            this.topicIds = request.topicIds;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16_8</p>
         */
        public Builder hotTopicVersion(String hotTopicVersion) {
            this.putBodyParameter("hotTopicVersion", hotTopicVersion);
            this.hotTopicVersion = hotTopicVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder stepForCustomSummaryStyleConfig(StepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig) {
            String stepForCustomSummaryStyleConfigShrink = shrink(stepForCustomSummaryStyleConfig, "stepForCustomSummaryStyleConfig", "json");
            this.putBodyParameter("stepForCustomSummaryStyleConfig", stepForCustomSummaryStyleConfigShrink);
            this.stepForCustomSummaryStyleConfig = stepForCustomSummaryStyleConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        public Builder topicIds(java.util.List<String> topicIds) {
            String topicIdsShrink = shrink(topicIds, "topicIds", "json");
            this.putBodyParameter("topicIds", topicIdsShrink);
            this.topicIds = topicIds;
            return this;
        }

        @Override
        public RunHotTopicSummaryRequest build() {
            return new RunHotTopicSummaryRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunHotTopicSummaryRequest} extends {@link TeaModel}
     *
     * <p>RunHotTopicSummaryRequest</p>
     */
    public static class StepForCustomSummaryStyleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("summaryImageCount")
        private Integer summaryImageCount;

        @com.aliyun.core.annotation.NameInMap("summaryModel")
        private String summaryModel;

        @com.aliyun.core.annotation.NameInMap("summaryPrompt")
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
             * summaryImageCount.
             */
            public Builder summaryImageCount(Integer summaryImageCount) {
                this.summaryImageCount = summaryImageCount;
                return this;
            }

            /**
             * summaryModel.
             */
            public Builder summaryModel(String summaryModel) {
                this.summaryModel = summaryModel;
                return this;
            }

            /**
             * summaryPrompt.
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
}
