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
 * {@link ExecuteAITeacherSyncDialogueTranslateRequest} extends {@link RequestModel}
 *
 * <p>ExecuteAITeacherSyncDialogueTranslateRequest</p>
 */
public class ExecuteAITeacherSyncDialogueTranslateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dialogueTasks")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DialogueTasks> dialogueTasks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private ExecuteAITeacherSyncDialogueTranslateRequest(Builder builder) {
        super(builder);
        this.dialogueTasks = builder.dialogueTasks;
        this.records = builder.records;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteAITeacherSyncDialogueTranslateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ExecuteAITeacherSyncDialogueTranslateRequest, Builder> {
        private java.util.List<DialogueTasks> dialogueTasks; 
        private java.util.List<Records> records; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteAITeacherSyncDialogueTranslateRequest request) {
            super(request);
            this.dialogueTasks = request.dialogueTasks;
            this.records = request.records;
            this.userId = request.userId;
        } 

        /**
         * <p>An array of dialogue task objects.</p>
         * <p>This parameter is required.</p>
         */
        public Builder dialogueTasks(java.util.List<DialogueTasks> dialogueTasks) {
            this.putBodyParameter("dialogueTasks", dialogueTasks);
            this.dialogueTasks = dialogueTasks;
            return this;
        }

        /**
         * <p>An array of dialogue record objects.</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.putBodyParameter("records", records);
            this.records = records;
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
        public ExecuteAITeacherSyncDialogueTranslateRequest build() {
            return new ExecuteAITeacherSyncDialogueTranslateRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteAITeacherSyncDialogueTranslateRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAITeacherSyncDialogueTranslateRequest</p>
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
             * <p>The content of the assistant\&quot;s message.</p>
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
             * <p>The translated content of the assistant\&quot;s message.</p>
             * 
             * <strong>example:</strong>
             * <p>为什么有些人认为遛狗是份好差事?</p>
             */
            public Builder assistantTranslate(String assistantTranslate) {
                this.assistantTranslate = assistantTranslate;
                return this;
            }

            /**
             * <p>The sequence number of the task.</p>
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
             * <p>The content of the user\&quot;s message.</p>
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
     * {@link ExecuteAITeacherSyncDialogueTranslateRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAITeacherSyncDialogueTranslateRequest</p>
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
             * <p>The content of the message.</p>
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
             * <p>Indicates whether the message is off-topic. This parameter is used for flow control.</p>
             * 
             * <strong>example:</strong>
             * <p>跑题：true, 不跑题：false</p>
             */
            public Builder isOffTopicControl(Boolean isOffTopicControl) {
                this.isOffTopicControl = isOffTopicControl;
                return this;
            }

            /**
             * <p>Indicates whether the message is on-topic.</p>
             * 
             * <strong>example:</strong>
             * <p>扣题：true, 不扣题：false</p>
             */
            public Builder isOnTopic(Boolean isOnTopic) {
                this.isOnTopic = isOnTopic;
                return this;
            }

            /**
             * <p>The sequence number of the message.</p>
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
             * <p>The message author\&quot;s role.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AI：assistant；用户：user</p>
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
}
