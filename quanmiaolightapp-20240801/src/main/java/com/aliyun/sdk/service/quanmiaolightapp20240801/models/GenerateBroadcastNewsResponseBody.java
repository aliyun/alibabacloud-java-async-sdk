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
 * {@link GenerateBroadcastNewsResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateBroadcastNewsResponseBody</p>
 */
public class GenerateBroadcastNewsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GenerateBroadcastNewsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateBroadcastNewsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GenerateBroadcastNewsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GenerateBroadcastNewsResponseBody build() {
            return new GenerateBroadcastNewsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateBroadcastNewsResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateBroadcastNewsResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Images(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.url = model.url;
            } 

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenerateBroadcastNewsResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateBroadcastNewsResponseBody</p>
     */
    public static class HotTopicSummaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("hotTopic")
        private String hotTopic;

        @com.aliyun.core.annotation.NameInMap("hotTopicVersion")
        private String hotTopicVersion;

        @com.aliyun.core.annotation.NameInMap("hotValue")
        private Double hotValue;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("images")
        private java.util.List<Images> images;

        @com.aliyun.core.annotation.NameInMap("textSummary")
        private String textSummary;

        private HotTopicSummaries(Builder builder) {
            this.category = builder.category;
            this.hotTopic = builder.hotTopic;
            this.hotTopicVersion = builder.hotTopicVersion;
            this.hotValue = builder.hotValue;
            this.id = builder.id;
            this.images = builder.images;
            this.textSummary = builder.textSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotTopicSummaries create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return hotTopic
         */
        public String getHotTopic() {
            return this.hotTopic;
        }

        /**
         * @return hotTopicVersion
         */
        public String getHotTopicVersion() {
            return this.hotTopicVersion;
        }

        /**
         * @return hotValue
         */
        public Double getHotValue() {
            return this.hotValue;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return images
         */
        public java.util.List<Images> getImages() {
            return this.images;
        }

        /**
         * @return textSummary
         */
        public String getTextSummary() {
            return this.textSummary;
        }

        public static final class Builder {
            private String category; 
            private String hotTopic; 
            private String hotTopicVersion; 
            private Double hotValue; 
            private String id; 
            private java.util.List<Images> images; 
            private String textSummary; 

            private Builder() {
            } 

            private Builder(HotTopicSummaries model) {
                this.category = model.category;
                this.hotTopic = model.hotTopic;
                this.hotTopicVersion = model.hotTopicVersion;
                this.hotValue = model.hotValue;
                this.id = model.id;
                this.images = model.images;
                this.textSummary = model.textSummary;
            } 

            /**
             * category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * hotTopic.
             */
            public Builder hotTopic(String hotTopic) {
                this.hotTopic = hotTopic;
                return this;
            }

            /**
             * hotTopicVersion.
             */
            public Builder hotTopicVersion(String hotTopicVersion) {
                this.hotTopicVersion = hotTopicVersion;
                return this;
            }

            /**
             * hotValue.
             */
            public Builder hotValue(Double hotValue) {
                this.hotValue = hotValue;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * images.
             */
            public Builder images(java.util.List<Images> images) {
                this.images = images;
                return this;
            }

            /**
             * textSummary.
             */
            public Builder textSummary(String textSummary) {
                this.textSummary = textSummary;
                return this;
            }

            public HotTopicSummaries build() {
                return new HotTopicSummaries(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenerateBroadcastNewsResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateBroadcastNewsResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("totalTokens")
        private Long totalTokens;

        private Usage(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Long inputTokens; 
            private Long outputTokens; 
            private Long totalTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * inputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * totalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenerateBroadcastNewsResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateBroadcastNewsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hotTopicSummaries")
        private java.util.List<HotTopicSummaries> hotTopicSummaries;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Usage usage;

        private Data(Builder builder) {
            this.hotTopicSummaries = builder.hotTopicSummaries;
            this.sessionId = builder.sessionId;
            this.taskId = builder.taskId;
            this.text = builder.text;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hotTopicSummaries
         */
        public java.util.List<HotTopicSummaries> getHotTopicSummaries() {
            return this.hotTopicSummaries;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private java.util.List<HotTopicSummaries> hotTopicSummaries; 
            private String sessionId; 
            private String taskId; 
            private String text; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.hotTopicSummaries = model.hotTopicSummaries;
                this.sessionId = model.sessionId;
                this.taskId = model.taskId;
                this.text = model.text;
                this.usage = model.usage;
            } 

            /**
             * hotTopicSummaries.
             */
            public Builder hotTopicSummaries(java.util.List<HotTopicSummaries> hotTopicSummaries) {
                this.hotTopicSummaries = hotTopicSummaries;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * usage.
             */
            public Builder usage(Usage usage) {
                this.usage = usage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
