// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link GetAITeacherExpansionDialogueSuggestionRequest} extends {@link RequestModel}
 *
 * <p>GetAITeacherExpansionDialogueSuggestionRequest</p>
 */
public class GetAITeacherExpansionDialogueSuggestionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("background")
    @com.aliyun.core.annotation.Validation(required = true)
    private String background;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dialogueTasks")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DialogueTasks> dialogueTasks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("languageCode")
    private String languageCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("records")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roleInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private RoleInfo roleInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startSentence")
    private String startSentence;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private GetAITeacherExpansionDialogueSuggestionRequest(Builder builder) {
        super(builder);
        this.background = builder.background;
        this.dialogueTasks = builder.dialogueTasks;
        this.languageCode = builder.languageCode;
        this.records = builder.records;
        this.roleInfo = builder.roleInfo;
        this.startSentence = builder.startSentence;
        this.topic = builder.topic;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAITeacherExpansionDialogueSuggestionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return background
     */
    public String getBackground() {
        return this.background;
    }

    /**
     * @return dialogueTasks
     */
    public java.util.List<DialogueTasks> getDialogueTasks() {
        return this.dialogueTasks;
    }

    /**
     * @return languageCode
     */
    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    /**
     * @return roleInfo
     */
    public RoleInfo getRoleInfo() {
        return this.roleInfo;
    }

    /**
     * @return startSentence
     */
    public String getStartSentence() {
        return this.startSentence;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetAITeacherExpansionDialogueSuggestionRequest, Builder> {
        private String background; 
        private java.util.List<DialogueTasks> dialogueTasks; 
        private String languageCode; 
        private java.util.List<Records> records; 
        private RoleInfo roleInfo; 
        private String startSentence; 
        private String topic; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetAITeacherExpansionDialogueSuggestionRequest request) {
            super(request);
            this.background = request.background;
            this.dialogueTasks = request.dialogueTasks;
            this.languageCode = request.languageCode;
            this.records = request.records;
            this.roleInfo = request.roleInfo;
            this.startSentence = request.startSentence;
            this.topic = request.topic;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>In a career counseling session, we are going to discuss our dream jobs and the responsibilities associated with them. Alex, who dreams of becoming a professional travel blogger, will share the tasks and skills required for this role, while Jamie, aspiring to be a wildlife photographer, will outline the responsibilities and challenges of capturing nature&quot;s moments. Both will explore how their interests align with the practical aspects of their chosen careers, discussing the potential for travel, creativity, and the impact of their work on society and the environment.</p>
         */
        public Builder background(String background) {
            this.putBodyParameter("background", background);
            this.background = background;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dialogueTasks(java.util.List<DialogueTasks> dialogueTasks) {
            this.putBodyParameter("dialogueTasks", dialogueTasks);
            this.dialogueTasks = dialogueTasks;
            return this;
        }

        /**
         * languageCode.
         */
        public Builder languageCode(String languageCode) {
            this.putBodyParameter("languageCode", languageCode);
            this.languageCode = languageCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.putBodyParameter("records", records);
            this.records = records;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder roleInfo(RoleInfo roleInfo) {
            this.putBodyParameter("roleInfo", roleInfo);
            this.roleInfo = roleInfo;
            return this;
        }

        /**
         * startSentence.
         */
        public Builder startSentence(String startSentence) {
            this.putBodyParameter("startSentence", startSentence);
            this.startSentence = startSentence;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Let&quot;s talk about traffic rules.</p>
         */
        public Builder topic(String topic) {
            this.putBodyParameter("topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>886eba3702xxxxxxxxx4ba52a87a525</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetAITeacherExpansionDialogueSuggestionRequest build() {
            return new GetAITeacherExpansionDialogueSuggestionRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetAITeacherExpansionDialogueSuggestionRequest} extends {@link TeaModel}
     *
     * <p>GetAITeacherExpansionDialogueSuggestionRequest</p>
     */
    public static class DialogueTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assistant")
        @com.aliyun.core.annotation.Validation(required = true)
        private String assistant;

        @com.aliyun.core.annotation.NameInMap("assistantTranslate")
        private String assistantTranslate;

        @com.aliyun.core.annotation.NameInMap("order")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("user")
        @com.aliyun.core.annotation.Validation(required = true)
        private String user;

        private DialogueTasks(Builder builder) {
            this.assistant = builder.assistant;
            this.assistantTranslate = builder.assistantTranslate;
            this.order = builder.order;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogueTasks create() {
            return builder().build();
        }

        /**
         * @return assistant
         */
        public String getAssistant() {
            return this.assistant;
        }

        /**
         * @return assistantTranslate
         */
        public String getAssistantTranslate() {
            return this.assistantTranslate;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String assistant; 
            private String assistantTranslate; 
            private Integer order; 
            private String user; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Why might some people think dog walking is a great job?</p>
             */
            public Builder assistant(String assistant) {
                this.assistant = assistant;
                return this;
            }

            /**
             * assistantTranslate.
             */
            public Builder assistantTranslate(String assistantTranslate) {
                this.assistantTranslate = assistantTranslate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>They think it&quot;s great because they won&quot;t be stuck in an office.</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public DialogueTasks build() {
                return new DialogueTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAITeacherExpansionDialogueSuggestionRequest} extends {@link TeaModel}
     *
     * <p>GetAITeacherExpansionDialogueSuggestionRequest</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("isOffTopicControl")
        private Boolean isOffTopicControl;

        @com.aliyun.core.annotation.NameInMap("isOnTopic")
        private Boolean isOnTopic;

        @com.aliyun.core.annotation.NameInMap("order")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        private Records(Builder builder) {
            this.content = builder.content;
            this.isOffTopicControl = builder.isOffTopicControl;
            this.isOnTopic = builder.isOnTopic;
            this.order = builder.order;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return isOffTopicControl
         */
        public Boolean getIsOffTopicControl() {
            return this.isOffTopicControl;
        }

        /**
         * @return isOnTopic
         */
        public Boolean getIsOnTopic() {
            return this.isOnTopic;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private Boolean isOffTopicControl; 
            private Boolean isOnTopic; 
            private Integer order; 
            private String role; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Ask Mark if he has thought about what his dream job might be.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * isOffTopicControl.
             */
            public Builder isOffTopicControl(Boolean isOffTopicControl) {
                this.isOffTopicControl = isOffTopicControl;
                return this;
            }

            /**
             * isOnTopic.
             */
            public Builder isOnTopic(Boolean isOnTopic) {
                this.isOnTopic = isOnTopic;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>老师：assistant；学生：user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAITeacherExpansionDialogueSuggestionRequest} extends {@link TeaModel}
     *
     * <p>GetAITeacherExpansionDialogueSuggestionRequest</p>
     */
    public static class RoleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assistant")
        @com.aliyun.core.annotation.Validation(required = true)
        private String assistant;

        @com.aliyun.core.annotation.NameInMap("user")
        @com.aliyun.core.annotation.Validation(required = true)
        private String user;

        private RoleInfo(Builder builder) {
            this.assistant = builder.assistant;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleInfo create() {
            return builder().build();
        }

        /**
         * @return assistant
         */
        public String getAssistant() {
            return this.assistant;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String assistant; 
            private String user; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Alex</p>
             */
            public Builder assistant(String assistant) {
                this.assistant = assistant;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Jamie</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public RoleInfo build() {
                return new RoleInfo(this);
            } 

        } 

    }
}
