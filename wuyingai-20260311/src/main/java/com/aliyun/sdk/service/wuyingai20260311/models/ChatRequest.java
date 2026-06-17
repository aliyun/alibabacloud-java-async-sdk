// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuyingai20260311.models;

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
 * {@link ChatRequest} extends {@link RequestModel}
 *
 * <p>ChatRequest</p>
 */
public class ChatRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Authorization")
    private String authorization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalUserId")
    private String externalUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Input")
    private java.util.List<Input> input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Resume")
    private Boolean resume;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoutingKey")
    private String routingKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Settings")
    private Settings settings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StreamOptions")
    private StreamOptions streamOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private ChatRequest(Builder builder) {
        super(builder);
        this.authorization = builder.authorization;
        this.externalUserId = builder.externalUserId;
        this.input = builder.input;
        this.model = builder.model;
        this.resume = builder.resume;
        this.routingKey = builder.routingKey;
        this.sessionId = builder.sessionId;
        this.settings = builder.settings;
        this.streamOptions = builder.streamOptions;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return input
     */
    public java.util.List<Input> getInput() {
        return this.input;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return resume
     */
    public Boolean getResume() {
        return this.resume;
    }

    /**
     * @return routingKey
     */
    public String getRoutingKey() {
        return this.routingKey;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return settings
     */
    public Settings getSettings() {
        return this.settings;
    }

    /**
     * @return streamOptions
     */
    public StreamOptions getStreamOptions() {
        return this.streamOptions;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ChatRequest, Builder> {
        private String authorization; 
        private String externalUserId; 
        private java.util.List<Input> input; 
        private String model; 
        private Boolean resume; 
        private String routingKey; 
        private String sessionId; 
        private Settings settings; 
        private StreamOptions streamOptions; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(ChatRequest request) {
            super(request);
            this.authorization = request.authorization;
            this.externalUserId = request.externalUserId;
            this.input = request.input;
            this.model = request.model;
            this.resume = request.resume;
            this.routingKey = request.routingKey;
            this.sessionId = request.sessionId;
            this.settings = request.settings;
            this.streamOptions = request.streamOptions;
            this.templateId = request.templateId;
        } 

        /**
         * Authorization.
         */
        public Builder authorization(String authorization) {
            this.putQueryParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * ExternalUserId.
         */
        public Builder externalUserId(String externalUserId) {
            this.putBodyParameter("ExternalUserId", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(java.util.List<Input> input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putBodyParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * Resume.
         */
        public Builder resume(Boolean resume) {
            this.putBodyParameter("Resume", resume);
            this.resume = resume;
            return this;
        }

        /**
         * RoutingKey.
         */
        public Builder routingKey(String routingKey) {
            this.putBodyParameter("RoutingKey", routingKey);
            this.routingKey = routingKey;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Settings.
         */
        public Builder settings(Settings settings) {
            String settingsShrink = shrink(settings, "Settings", "json");
            this.putBodyParameter("Settings", settingsShrink);
            this.settings = settings;
            return this;
        }

        /**
         * StreamOptions.
         */
        public Builder streamOptions(StreamOptions streamOptions) {
            String streamOptionsShrink = shrink(streamOptions, "StreamOptions", "json");
            this.putBodyParameter("StreamOptions", streamOptionsShrink);
            this.streamOptions = streamOptions;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ChatRequest build() {
            return new ChatRequest(this);
        } 

    } 

    /**
     * 
     * {@link ChatRequest} extends {@link TeaModel}
     *
     * <p>ChatRequest</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Content(Builder builder) {
            this.fileName = builder.fileName;
            this.fileUrl = builder.fileUrl;
            this.imageUrl = builder.imageUrl;
            this.text = builder.text;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String fileName; 
            private String fileUrl; 
            private String imageUrl; 
            private String text; 
            private String type; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.fileName = model.fileName;
                this.fileUrl = model.fileUrl;
                this.imageUrl = model.imageUrl;
                this.text = model.text;
                this.type = model.type;
            } 

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatRequest} extends {@link TeaModel}
     *
     * <p>ChatRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private Input(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private String role; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * Content.
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatRequest} extends {@link TeaModel}
     *
     * <p>ChatRequest</p>
     */
    public static class Settings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutputFileMode")
        private String outputFileMode;

        private Settings(Builder builder) {
            this.outputFileMode = builder.outputFileMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Settings create() {
            return builder().build();
        }

        /**
         * @return outputFileMode
         */
        public String getOutputFileMode() {
            return this.outputFileMode;
        }

        public static final class Builder {
            private String outputFileMode; 

            private Builder() {
            } 

            private Builder(Settings model) {
                this.outputFileMode = model.outputFileMode;
            } 

            /**
             * OutputFileMode.
             */
            public Builder outputFileMode(String outputFileMode) {
                this.outputFileMode = outputFileMode;
                return this;
            }

            public Settings build() {
                return new Settings(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatRequest} extends {@link TeaModel}
     *
     * <p>ChatRequest</p>
     */
    public static class StreamOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncludeReasoning")
        private Boolean includeReasoning;

        @com.aliyun.core.annotation.NameInMap("IncludeToolCalls")
        private Boolean includeToolCalls;

        private StreamOptions(Builder builder) {
            this.includeReasoning = builder.includeReasoning;
            this.includeToolCalls = builder.includeToolCalls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamOptions create() {
            return builder().build();
        }

        /**
         * @return includeReasoning
         */
        public Boolean getIncludeReasoning() {
            return this.includeReasoning;
        }

        /**
         * @return includeToolCalls
         */
        public Boolean getIncludeToolCalls() {
            return this.includeToolCalls;
        }

        public static final class Builder {
            private Boolean includeReasoning; 
            private Boolean includeToolCalls; 

            private Builder() {
            } 

            private Builder(StreamOptions model) {
                this.includeReasoning = model.includeReasoning;
                this.includeToolCalls = model.includeToolCalls;
            } 

            /**
             * IncludeReasoning.
             */
            public Builder includeReasoning(Boolean includeReasoning) {
                this.includeReasoning = includeReasoning;
                return this;
            }

            /**
             * IncludeToolCalls.
             */
            public Builder includeToolCalls(Boolean includeToolCalls) {
                this.includeToolCalls = includeToolCalls;
                return this;
            }

            public StreamOptions build() {
                return new StreamOptions(this);
            } 

        } 

    }
}
