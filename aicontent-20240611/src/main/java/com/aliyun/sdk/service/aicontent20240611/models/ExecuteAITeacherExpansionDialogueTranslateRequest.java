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
 * {@link ExecuteAITeacherExpansionDialogueTranslateRequest} extends {@link RequestModel}
 *
 * <p>ExecuteAITeacherExpansionDialogueTranslateRequest</p>
 */
public class ExecuteAITeacherExpansionDialogueTranslateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("background")
    @com.aliyun.core.annotation.Validation(required = true)
    private String background;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dialogueTasks")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DialogueTasks> dialogueTasks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("records")
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

    private ExecuteAITeacherExpansionDialogueTranslateRequest(Builder builder) {
        super(builder);
        this.background = builder.background;
        this.dialogueTasks = builder.dialogueTasks;
        this.records = builder.records;
        this.roleInfo = builder.roleInfo;
        this.startSentence = builder.startSentence;
        this.topic = builder.topic;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteAITeacherExpansionDialogueTranslateRequest create() {
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

    public static final class Builder extends Request.Builder<ExecuteAITeacherExpansionDialogueTranslateRequest, Builder> {
        private String background; 
        private java.util.List<DialogueTasks> dialogueTasks; 
        private java.util.List<Records> records; 
        private RoleInfo roleInfo; 
        private String startSentence; 
        private String topic; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteAITeacherExpansionDialogueTranslateRequest request) {
            super(request);
            this.background = request.background;
            this.dialogueTasks = request.dialogueTasks;
            this.records = request.records;
            this.roleInfo = request.roleInfo;
            this.startSentence = request.startSentence;
            this.topic = request.topic;
            this.userId = request.userId;
        } 

        /**
         * <p>The conversation background description.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>In this dialogue, you will be playing the role of Lily, a young girl. I will be Jane, Lily\&quot;s mother. We are in the kitchen, where I am preparing dinner. I am asking you about your food preferences, specifically if you like meat, fish, and milk. You like meat and milk, but you don\&quot;t like fish because of its smell. I explain to you the nutritional benefits of these foods and suggest alternatives for the ones you don\&quot;t like. Finally, I invite you to start eating.</p>
         */
        public Builder background(String background) {
            this.putBodyParameter("background", background);
            this.background = background;
            return this;
        }

        /**
         * <p>The collection of conversation task content.</p>
         * <p>This parameter is required.</p>
         */
        public Builder dialogueTasks(java.util.List<DialogueTasks> dialogueTasks) {
            this.putBodyParameter("dialogueTasks", dialogueTasks);
            this.dialogueTasks = dialogueTasks;
            return this;
        }

        /**
         * <p>The collection of conversation records.</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.putBodyParameter("records", records);
            this.records = records;
            return this;
        }

        /**
         * <p>The role settings.</p>
         * <p>This parameter is required.</p>
         */
        public Builder roleInfo(RoleInfo roleInfo) {
            this.putBodyParameter("roleInfo", roleInfo);
            this.roleInfo = roleInfo;
            return this;
        }

        /**
         * <p>The opening remark.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello Lily, could you please come to the kitchen for a moment?</p>
         */
        public Builder startSentence(String startSentence) {
            this.putBodyParameter("startSentence", startSentence);
            this.startSentence = startSentence;
            return this;
        }

        /**
         * <p>The topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>talk about food.</p>
         */
        public Builder topic(String topic) {
            this.putBodyParameter("topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * <p>The user ID.</p>
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
        public ExecuteAITeacherExpansionDialogueTranslateRequest build() {
            return new ExecuteAITeacherExpansionDialogueTranslateRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteAITeacherExpansionDialogueTranslateRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAITeacherExpansionDialogueTranslateRequest</p>
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

            private Builder() {
            } 

            private Builder(DialogueTasks model) {
                this.assistant = model.assistant;
                this.assistantTranslate = model.assistantTranslate;
                this.order = model.order;
                this.user = model.user;
            } 

            /**
             * <p>The AI conversation content.</p>
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
             * <p>The translation of the AI conversation content.</p>
             * 
             * <strong>example:</strong>
             * <p>Why do some people think walking dogs is a good job?</p>
             */
            public Builder assistantTranslate(String assistantTranslate) {
                this.assistantTranslate = assistantTranslate;
                return this;
            }

            /**
             * <p>The sequence number.</p>
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
             * <p>The user conversation content.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>They think it\&quot;s great because they won\&quot;t be stuck in an office.</p>
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
     * {@link ExecuteAITeacherExpansionDialogueTranslateRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAITeacherExpansionDialogueTranslateRequest</p>
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

            private Builder() {
            } 

            private Builder(Records model) {
                this.content = model.content;
                this.isOffTopicControl = model.isOffTopicControl;
                this.isOnTopic = model.isOnTopic;
                this.order = model.order;
                this.role = model.role;
            } 

            /**
             * <p>The conversation content.</p>
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
             * <p>Specifies whether the content is off-topic and includes flow control. This parameter reflects whether the student\&quot;s response meets the settings of the conversation task. The value of this parameter is derived from the return results of previous conversation turns. In addition, this parameter serves the purpose of flow control. If the content is off-topic more than twice, the value is forcibly set to true to force a task switch. Valid values:</p>
             * <ul>
             * <li>true: Off-topic.</li>
             * <li>false: On-topic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isOffTopicControl(Boolean isOffTopicControl) {
                this.isOffTopicControl = isOffTopicControl;
                return this;
            }

            /**
             * <p>Specifies whether the content is on-topic. Valid values:</p>
             * <ul>
             * <li>true: On-topic.</li>
             * <li>false: Off-topic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isOnTopic(Boolean isOnTopic) {
                this.isOnTopic = isOnTopic;
                return this;
            }

            /**
             * <p>The sequence number.</p>
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
             * <p>The role.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AI: assistant; User: user</p>
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
     * {@link ExecuteAITeacherExpansionDialogueTranslateRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAITeacherExpansionDialogueTranslateRequest</p>
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

            private Builder() {
            } 

            private Builder(RoleInfo model) {
                this.assistant = model.assistant;
                this.user = model.user;
            } 

            /**
             * <p>The name of the AI.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Jane, a caring mother</p>
             */
            public Builder assistant(String assistant) {
                this.assistant = assistant;
                return this;
            }

            /**
             * <p>The name of the user.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Lily, a friendly student</p>
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
