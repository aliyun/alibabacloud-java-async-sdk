// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edututor20250707.models;

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
 * {@link AnswerSSERequest} extends {@link RequestModel}
 *
 * <p>AnswerSSERequest</p>
 */
public class AnswerSSERequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messages")
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    private Parameters parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private AnswerSSERequest(Builder builder) {
        super(builder);
        this.messages = builder.messages;
        this.parameters = builder.parameters;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnswerSSERequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return parameters
     */
    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<AnswerSSERequest, Builder> {
        private java.util.List<Messages> messages; 
        private Parameters parameters; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(AnswerSSERequest request) {
            super(request);
            this.messages = request.messages;
            this.parameters = request.parameters;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * messages.
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(Parameters parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-1ijrzuv3v0ivvls7</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public AnswerSSERequest build() {
            return new AnswerSSERequest(this);
        } 

    } 

    /**
     * 
     * {@link AnswerSSERequest} extends {@link TeaModel}
     *
     * <p>AnswerSSERequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private java.util.List<java.util.Map<String, String>> content;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
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
        public java.util.List<java.util.Map<String, String>> getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, String>> content; 
            private String role; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * content.
             */
            public Builder content(java.util.List<java.util.Map<String, String>> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
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
     * {@link AnswerSSERequest} extends {@link TeaModel}
     *
     * <p>AnswerSSERequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("grade")
        private Integer grade;

        @com.aliyun.core.annotation.NameInMap("stage")
        private String stage;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        private Parameters(Builder builder) {
            this.grade = builder.grade;
            this.stage = builder.stage;
            this.subject = builder.subject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return grade
         */
        public Integer getGrade() {
            return this.grade;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private Integer grade; 
            private String stage; 
            private String subject; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.grade = model.grade;
                this.stage = model.stage;
                this.subject = model.subject;
            } 

            /**
             * grade.
             */
            public Builder grade(Integer grade) {
                this.grade = grade;
                return this;
            }

            /**
             * stage.
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            /**
             * subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
