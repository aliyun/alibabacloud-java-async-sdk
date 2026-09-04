// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateCopilotChatRequest} extends {@link RequestModel}
 *
 * <p>CreateCopilotChatRequest</p>
 */
public class CreateCopilotChatRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientConversationId")
    private String clientConversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientMessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientMessageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateConversation")
    private CreateConversation createConversation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Messages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlanMode")
    private String planMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReplaceTurnId")
    private String replaceTurnId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RouteTarget")
    private String routeTarget;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThinkingMode")
    private String thinkingMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private CreateCopilotChatRequest(Builder builder) {
        super(builder);
        this.clientConversationId = builder.clientConversationId;
        this.clientMessageId = builder.clientMessageId;
        this.conversationId = builder.conversationId;
        this.createConversation = builder.createConversation;
        this.lang = builder.lang;
        this.messages = builder.messages;
        this.model = builder.model;
        this.planMode = builder.planMode;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.replaceTurnId = builder.replaceTurnId;
        this.routeTarget = builder.routeTarget;
        this.source = builder.source;
        this.stream = builder.stream;
        this.thinkingMode = builder.thinkingMode;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCopilotChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientConversationId
     */
    public String getClientConversationId() {
        return this.clientConversationId;
    }

    /**
     * @return clientMessageId
     */
    public String getClientMessageId() {
        return this.clientMessageId;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return createConversation
     */
    public CreateConversation getCreateConversation() {
        return this.createConversation;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return planMode
     */
    public String getPlanMode() {
        return this.planMode;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replaceTurnId
     */
    public String getReplaceTurnId() {
        return this.replaceTurnId;
    }

    /**
     * @return routeTarget
     */
    public String getRouteTarget() {
        return this.routeTarget;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return thinkingMode
     */
    public String getThinkingMode() {
        return this.thinkingMode;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder extends Request.Builder<CreateCopilotChatRequest, Builder> {
        private String clientConversationId; 
        private String clientMessageId; 
        private String conversationId; 
        private CreateConversation createConversation; 
        private String lang; 
        private java.util.List<Messages> messages; 
        private String model; 
        private String planMode; 
        private String projectId; 
        private String regionId; 
        private String replaceTurnId; 
        private String routeTarget; 
        private String source; 
        private Boolean stream; 
        private String thinkingMode; 
        private String traceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCopilotChatRequest request) {
            super(request);
            this.clientConversationId = request.clientConversationId;
            this.clientMessageId = request.clientMessageId;
            this.conversationId = request.conversationId;
            this.createConversation = request.createConversation;
            this.lang = request.lang;
            this.messages = request.messages;
            this.model = request.model;
            this.planMode = request.planMode;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.replaceTurnId = request.replaceTurnId;
            this.routeTarget = request.routeTarget;
            this.source = request.source;
            this.stream = request.stream;
            this.thinkingMode = request.thinkingMode;
            this.traceId = request.traceId;
        } 

        /**
         * ClientConversationId.
         */
        public Builder clientConversationId(String clientConversationId) {
            this.putBodyParameter("ClientConversationId", clientConversationId);
            this.clientConversationId = clientConversationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>366932fb-9a83-4a2d-94dd-c925b35fcc0c</p>
         */
        public Builder clientMessageId(String clientMessageId) {
            this.putBodyParameter("ClientMessageId", clientMessageId);
            this.clientMessageId = clientMessageId;
            return this;
        }

        /**
         * ConversationId.
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * CreateConversation.
         */
        public Builder createConversation(CreateConversation createConversation) {
            String createConversationShrink = shrink(createConversation, "CreateConversation", "json");
            this.putBodyParameter("CreateConversation", createConversationShrink);
            this.createConversation = createConversation;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            String messagesShrink = shrink(messages, "Messages", "json");
            this.putBodyParameter("Messages", messagesShrink);
            this.messages = messages;
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
         * PlanMode.
         */
        public Builder planMode(String planMode) {
            this.putBodyParameter("PlanMode", planMode);
            this.planMode = planMode;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ReplaceTurnId.
         */
        public Builder replaceTurnId(String replaceTurnId) {
            this.putBodyParameter("ReplaceTurnId", replaceTurnId);
            this.replaceTurnId = replaceTurnId;
            return this;
        }

        /**
         * RouteTarget.
         */
        public Builder routeTarget(String routeTarget) {
            this.putBodyParameter("RouteTarget", routeTarget);
            this.routeTarget = routeTarget;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * ThinkingMode.
         */
        public Builder thinkingMode(String thinkingMode) {
            this.putBodyParameter("ThinkingMode", thinkingMode);
            this.thinkingMode = thinkingMode;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.putBodyParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        @Override
        public CreateCopilotChatRequest build() {
            return new CreateCopilotChatRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCopilotChatRequest} extends {@link TeaModel}
     *
     * <p>CreateCopilotChatRequest</p>
     */
    public static class CreateConversation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("PlanMode")
        private String planMode;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ThinkingMode")
        private String thinkingMode;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private CreateConversation(Builder builder) {
            this.model = builder.model;
            this.planMode = builder.planMode;
            this.projectId = builder.projectId;
            this.thinkingMode = builder.thinkingMode;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateConversation create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return planMode
         */
        public String getPlanMode() {
            return this.planMode;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return thinkingMode
         */
        public String getThinkingMode() {
            return this.thinkingMode;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String model; 
            private String planMode; 
            private String projectId; 
            private String thinkingMode; 
            private String title; 

            private Builder() {
            } 

            private Builder(CreateConversation model) {
                this.model = model.model;
                this.planMode = model.planMode;
                this.projectId = model.projectId;
                this.thinkingMode = model.thinkingMode;
                this.title = model.title;
            } 

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * PlanMode.
             */
            public Builder planMode(String planMode) {
                this.planMode = planMode;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ThinkingMode.
             */
            public Builder thinkingMode(String thinkingMode) {
                this.thinkingMode = thinkingMode;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public CreateConversation build() {
                return new CreateConversation(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCopilotChatRequest} extends {@link TeaModel}
     *
     * <p>CreateCopilotChatRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
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
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
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

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
