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
 * {@link RunHotTopicChatRequest} extends {@link RequestModel}
 *
 * <p>RunHotTopicChatRequest</p>
 */
public class RunHotTopicChatRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("generateOptions")
    private java.util.List<String> generateOptions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hotTopicVersion")
    private String hotTopicVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hotTopics")
    private java.util.List<String> hotTopics;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageCount")
    private Integer imageCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messages")
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelCustomPromptTemplate")
    private String modelCustomPromptTemplate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("originalSessionId")
    private String originalSessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stepForBroadcastContentConfig")
    private StepForBroadcastContentConfig stepForBroadcastContentConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private RunHotTopicChatRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.category = builder.category;
        this.generateOptions = builder.generateOptions;
        this.hotTopicVersion = builder.hotTopicVersion;
        this.hotTopics = builder.hotTopics;
        this.imageCount = builder.imageCount;
        this.messages = builder.messages;
        this.modelCustomPromptTemplate = builder.modelCustomPromptTemplate;
        this.modelId = builder.modelId;
        this.originalSessionId = builder.originalSessionId;
        this.prompt = builder.prompt;
        this.stepForBroadcastContentConfig = builder.stepForBroadcastContentConfig;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunHotTopicChatRequest create() {
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
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return generateOptions
     */
    public java.util.List<String> getGenerateOptions() {
        return this.generateOptions;
    }

    /**
     * @return hotTopicVersion
     */
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    /**
     * @return hotTopics
     */
    public java.util.List<String> getHotTopics() {
        return this.hotTopics;
    }

    /**
     * @return imageCount
     */
    public Integer getImageCount() {
        return this.imageCount;
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return modelCustomPromptTemplate
     */
    public String getModelCustomPromptTemplate() {
        return this.modelCustomPromptTemplate;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return originalSessionId
     */
    public String getOriginalSessionId() {
        return this.originalSessionId;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return stepForBroadcastContentConfig
     */
    public StepForBroadcastContentConfig getStepForBroadcastContentConfig() {
        return this.stepForBroadcastContentConfig;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<RunHotTopicChatRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String category; 
        private java.util.List<String> generateOptions; 
        private String hotTopicVersion; 
        private java.util.List<String> hotTopics; 
        private Integer imageCount; 
        private java.util.List<Messages> messages; 
        private String modelCustomPromptTemplate; 
        private String modelId; 
        private String originalSessionId; 
        private String prompt; 
        private StepForBroadcastContentConfig stepForBroadcastContentConfig; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(RunHotTopicChatRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.category = request.category;
            this.generateOptions = request.generateOptions;
            this.hotTopicVersion = request.hotTopicVersion;
            this.hotTopics = request.hotTopics;
            this.imageCount = request.imageCount;
            this.messages = request.messages;
            this.modelCustomPromptTemplate = request.modelCustomPromptTemplate;
            this.modelId = request.modelId;
            this.originalSessionId = request.originalSessionId;
            this.prompt = request.prompt;
            this.stepForBroadcastContentConfig = request.stepForBroadcastContentConfig;
            this.taskId = request.taskId;
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
         * <p>llm-xx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.putBodyParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * generateOptions.
         */
        public Builder generateOptions(java.util.List<String> generateOptions) {
            String generateOptionsShrink = shrink(generateOptions, "generateOptions", "json");
            this.putBodyParameter("generateOptions", generateOptionsShrink);
            this.generateOptions = generateOptions;
            return this;
        }

        /**
         * hotTopicVersion.
         */
        public Builder hotTopicVersion(String hotTopicVersion) {
            this.putBodyParameter("hotTopicVersion", hotTopicVersion);
            this.hotTopicVersion = hotTopicVersion;
            return this;
        }

        /**
         * hotTopics.
         */
        public Builder hotTopics(java.util.List<String> hotTopics) {
            String hotTopicsShrink = shrink(hotTopics, "hotTopics", "json");
            this.putBodyParameter("hotTopics", hotTopicsShrink);
            this.hotTopics = hotTopics;
            return this;
        }

        /**
         * imageCount.
         */
        public Builder imageCount(Integer imageCount) {
            this.putBodyParameter("imageCount", imageCount);
            this.imageCount = imageCount;
            return this;
        }

        /**
         * messages.
         */
        public Builder messages(java.util.List<Messages> messages) {
            String messagesShrink = shrink(messages, "messages", "json");
            this.putBodyParameter("messages", messagesShrink);
            this.messages = messages;
            return this;
        }

        /**
         * modelCustomPromptTemplate.
         */
        public Builder modelCustomPromptTemplate(String modelCustomPromptTemplate) {
            this.putBodyParameter("modelCustomPromptTemplate", modelCustomPromptTemplate);
            this.modelCustomPromptTemplate = modelCustomPromptTemplate;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * originalSessionId.
         */
        public Builder originalSessionId(String originalSessionId) {
            this.putBodyParameter("originalSessionId", originalSessionId);
            this.originalSessionId = originalSessionId;
            return this;
        }

        /**
         * prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * stepForBroadcastContentConfig.
         */
        public Builder stepForBroadcastContentConfig(StepForBroadcastContentConfig stepForBroadcastContentConfig) {
            String stepForBroadcastContentConfigShrink = shrink(stepForBroadcastContentConfig, "stepForBroadcastContentConfig", "json");
            this.putBodyParameter("stepForBroadcastContentConfig", stepForBroadcastContentConfigShrink);
            this.stepForBroadcastContentConfig = stepForBroadcastContentConfig;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public RunHotTopicChatRequest build() {
            return new RunHotTopicChatRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunHotTopicChatRequest} extends {@link TeaModel}
     *
     * <p>RunHotTopicChatRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private String role; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunHotTopicChatRequest} extends {@link TeaModel}
     *
     * <p>RunHotTopicChatRequest</p>
     */
    public static class CustomHotValueWeights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("weight")
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

            /**
             * dimension.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * weight.
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
     * {@link RunHotTopicChatRequest} extends {@link TeaModel}
     *
     * <p>RunHotTopicChatRequest</p>
     */
    public static class StepForBroadcastContentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("categories")
        private java.util.List<String> categories;

        @com.aliyun.core.annotation.NameInMap("customHotValueWeights")
        private java.util.List<CustomHotValueWeights> customHotValueWeights;

        @com.aliyun.core.annotation.NameInMap("topicCount")
        private Integer topicCount;

        private StepForBroadcastContentConfig(Builder builder) {
            this.categories = builder.categories;
            this.customHotValueWeights = builder.customHotValueWeights;
            this.topicCount = builder.topicCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepForBroadcastContentConfig create() {
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
             * categories.
             */
            public Builder categories(java.util.List<String> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * customHotValueWeights.
             */
            public Builder customHotValueWeights(java.util.List<CustomHotValueWeights> customHotValueWeights) {
                this.customHotValueWeights = customHotValueWeights;
                return this;
            }

            /**
             * topicCount.
             */
            public Builder topicCount(Integer topicCount) {
                this.topicCount = topicCount;
                return this;
            }

            public StepForBroadcastContentConfig build() {
                return new StepForBroadcastContentConfig(this);
            } 

        } 

    }
}
