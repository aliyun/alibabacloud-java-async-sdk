// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link CreateTodoRequest} extends {@link RequestModel}
 *
 * <p>CreateTodoRequest</p>
 */
public class CreateTodoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assigneeUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> assigneeUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("priority")
    private String priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("questions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Questions> questions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceContext")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> sourceContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private CreateTodoRequest(Builder builder) {
        super(builder);
        this.assigneeUserIds = builder.assigneeUserIds;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.priority = builder.priority;
        this.questions = builder.questions;
        this.sourceContext = builder.sourceContext;
        this.sourceType = builder.sourceType;
        this.tenantId = builder.tenantId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTodoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assigneeUserIds
     */
    public java.util.List<String> getAssigneeUserIds() {
        return this.assigneeUserIds;
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return questions
     */
    public java.util.List<Questions> getQuestions() {
        return this.questions;
    }

    /**
     * @return sourceContext
     */
    public java.util.Map<String, ?> getSourceContext() {
        return this.sourceContext;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateTodoRequest, Builder> {
        private java.util.List<String> assigneeUserIds; 
        private String collaborationGroupId; 
        private String priority; 
        private java.util.List<Questions> questions; 
        private java.util.Map<String, ?> sourceContext; 
        private String sourceType; 
        private String tenantId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateTodoRequest request) {
            super(request);
            this.assigneeUserIds = request.assigneeUserIds;
            this.collaborationGroupId = request.collaborationGroupId;
            this.priority = request.priority;
            this.questions = request.questions;
            this.sourceContext = request.sourceContext;
            this.sourceType = request.sourceType;
            this.tenantId = request.tenantId;
            this.title = request.title;
        } 

        /**
         * <p>The list of platform user IDs of the assignees. You can specify 1 to 100 IDs. Duplicate IDs are automatically removed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        public Builder assigneeUserIds(java.util.List<String> assigneeUserIds) {
            String assigneeUserIdsShrink = shrink(assigneeUserIds, "assigneeUserIds", "json");
            this.putBodyParameter("assigneeUserIds", assigneeUserIdsShrink);
            this.assigneeUserIds = assigneeUserIds;
            return this;
        }

        /**
         * <p>The ID of the collaboration workspace. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_123</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        public Builder priority(String priority) {
            this.putBodyParameter("priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The list of questions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder questions(java.util.List<Questions> questions) {
            String questionsShrink = shrink(questions, "questions", "json");
            this.putBodyParameter("questions", questionsShrink);
            this.questions = questions;
            return this;
        }

        /**
         * <p>The source context. The value is passed through and stored in the database as-is without validation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder sourceContext(java.util.Map<String, ?> sourceContext) {
            String sourceContextShrink = shrink(sourceContext, "sourceContext", "json");
            this.putBodyParameter("sourceContext", sourceContextShrink);
            this.sourceContext = sourceContext;
            return this;
        }

        /**
         * <p>The source of the to-do item. Only OPEN_API is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_API</p>
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The title of the to-do item. The maximum length is 200 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Governance approval</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateTodoRequest build() {
            return new CreateTodoRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTodoRequest} extends {@link TeaModel}
     *
     * <p>CreateTodoRequest</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("label")
        @com.aliyun.core.annotation.Validation(required = true)
        private String label;

        @com.aliyun.core.annotation.NameInMap("recommended")
        private Boolean recommended;

        private Options(Builder builder) {
            this.description = builder.description;
            this.label = builder.label;
            this.recommended = builder.recommended;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return recommended
         */
        public Boolean getRecommended() {
            return this.recommended;
        }

        public static final class Builder {
            private String description; 
            private String label; 
            private Boolean recommended; 

            private Builder() {
            } 

            private Builder(Options model) {
                this.description = model.description;
                this.label = model.label;
                this.recommended = model.recommended;
            } 

            /**
             * <p>The supplementary description of the option.</p>
             * 
             * <strong>example:</strong>
             * <p>Supplementary description of the option</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The option text. This is a reference key.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Approve</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>Specifies whether the option is recommended.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder recommended(Boolean recommended) {
                this.recommended = recommended;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTodoRequest} extends {@link TeaModel}
     *
     * <p>CreateTodoRequest</p>
     */
    public static class Questions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowCustom")
        private Boolean allowCustom;

        @com.aliyun.core.annotation.NameInMap("customLabel")
        private String customLabel;

        @com.aliyun.core.annotation.NameInMap("customMaxLength")
        private Long customMaxLength;

        @com.aliyun.core.annotation.NameInMap("customPlaceholder")
        private String customPlaceholder;

        @com.aliyun.core.annotation.NameInMap("maxLength")
        private Long maxLength;

        @com.aliyun.core.annotation.NameInMap("mode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mode;

        @com.aliyun.core.annotation.NameInMap("options")
        private java.util.List<Options> options;

        @com.aliyun.core.annotation.NameInMap("placeholder")
        private String placeholder;

        @com.aliyun.core.annotation.NameInMap("question")
        @com.aliyun.core.annotation.Validation(required = true)
        private String question;

        @com.aliyun.core.annotation.NameInMap("required")
        private Boolean required;

        private Questions(Builder builder) {
            this.allowCustom = builder.allowCustom;
            this.customLabel = builder.customLabel;
            this.customMaxLength = builder.customMaxLength;
            this.customPlaceholder = builder.customPlaceholder;
            this.maxLength = builder.maxLength;
            this.mode = builder.mode;
            this.options = builder.options;
            this.placeholder = builder.placeholder;
            this.question = builder.question;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Questions create() {
            return builder().build();
        }

        /**
         * @return allowCustom
         */
        public Boolean getAllowCustom() {
            return this.allowCustom;
        }

        /**
         * @return customLabel
         */
        public String getCustomLabel() {
            return this.customLabel;
        }

        /**
         * @return customMaxLength
         */
        public Long getCustomMaxLength() {
            return this.customMaxLength;
        }

        /**
         * @return customPlaceholder
         */
        public String getCustomPlaceholder() {
            return this.customPlaceholder;
        }

        /**
         * @return maxLength
         */
        public Long getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return options
         */
        public java.util.List<Options> getOptions() {
            return this.options;
        }

        /**
         * @return placeholder
         */
        public String getPlaceholder() {
            return this.placeholder;
        }

        /**
         * @return question
         */
        public String getQuestion() {
            return this.question;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        public static final class Builder {
            private Boolean allowCustom; 
            private String customLabel; 
            private Long customMaxLength; 
            private String customPlaceholder; 
            private Long maxLength; 
            private String mode; 
            private java.util.List<Options> options; 
            private String placeholder; 
            private String question; 
            private Boolean required; 

            private Builder() {
            } 

            private Builder(Questions model) {
                this.allowCustom = model.allowCustom;
                this.customLabel = model.customLabel;
                this.customMaxLength = model.customMaxLength;
                this.customPlaceholder = model.customPlaceholder;
                this.maxLength = model.maxLength;
                this.mode = model.mode;
                this.options = model.options;
                this.placeholder = model.placeholder;
                this.question = model.question;
                this.required = model.required;
            } 

            /**
             * <p>Specifies whether custom input is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowCustom(Boolean allowCustom) {
                this.allowCustom = allowCustom;
                return this;
            }

            /**
             * <p>The text for the custom input item.</p>
             * 
             * <strong>example:</strong>
             * <p>Other</p>
             */
            public Builder customLabel(String customLabel) {
                this.customLabel = customLabel;
                return this;
            }

            /**
             * <p>The maximum length of the custom input.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder customMaxLength(Long customMaxLength) {
                this.customMaxLength = customMaxLength;
                return this;
            }

            /**
             * <p>The placeholder for the custom input.</p>
             * 
             * <strong>example:</strong>
             * <p>Please specify</p>
             */
            public Builder customPlaceholder(String customPlaceholder) {
                this.customPlaceholder = customPlaceholder;
                return this;
            }

            /**
             * <p>The maximum length for text questions.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder maxLength(Long maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * <p>The response mode. Valid values: SINGLE_CHOICE, MULTI_CHOICE, and TEXT.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SINGLE_CHOICE</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The list of options for the question. This parameter is required for choice questions. Each option includes the option text (label), supplementary description (description), and whether it is recommended (recommended).</p>
             */
            public Builder options(java.util.List<Options> options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The placeholder for text questions.</p>
             * 
             * <strong>example:</strong>
             * <p>Please enter</p>
             */
            public Builder placeholder(String placeholder) {
                this.placeholder = placeholder;
                return this;
            }

            /**
             * <p>The question text. This is a reference key and must be unique within the list.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Whether to approve the request</p>
             */
            public Builder question(String question) {
                this.question = question;
                return this;
            }

            /**
             * <p>Specifies whether the question is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            public Questions build() {
                return new Questions(this);
            } 

        } 

    }
}
