// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ResumeAgentTaskRequest} extends {@link RequestModel}
 *
 * <p>ResumeAgentTaskRequest</p>
 */
public class ResumeAgentTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalPrompt")
    private String additionalPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClarificationAnswers")
    private java.util.List<ClarificationAnswers> clarificationAnswers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> taskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToolCallId")
    private String toolCallId;

    private ResumeAgentTaskRequest(Builder builder) {
        super(builder);
        this.additionalPrompt = builder.additionalPrompt;
        this.clarificationAnswers = builder.clarificationAnswers;
        this.taskIds = builder.taskIds;
        this.toolCallId = builder.toolCallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeAgentTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalPrompt
     */
    public String getAdditionalPrompt() {
        return this.additionalPrompt;
    }

    /**
     * @return clarificationAnswers
     */
    public java.util.List<ClarificationAnswers> getClarificationAnswers() {
        return this.clarificationAnswers;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    /**
     * @return toolCallId
     */
    public String getToolCallId() {
        return this.toolCallId;
    }

    public static final class Builder extends Request.Builder<ResumeAgentTaskRequest, Builder> {
        private String additionalPrompt; 
        private java.util.List<ClarificationAnswers> clarificationAnswers; 
        private java.util.List<String> taskIds; 
        private String toolCallId; 

        private Builder() {
            super();
        } 

        private Builder(ResumeAgentTaskRequest request) {
            super(request);
            this.additionalPrompt = request.additionalPrompt;
            this.clarificationAnswers = request.clarificationAnswers;
            this.taskIds = request.taskIds;
            this.toolCallId = request.toolCallId;
        } 

        /**
         * AdditionalPrompt.
         */
        public Builder additionalPrompt(String additionalPrompt) {
            this.putQueryParameter("AdditionalPrompt", additionalPrompt);
            this.additionalPrompt = additionalPrompt;
            return this;
        }

        /**
         * ClarificationAnswers.
         */
        public Builder clarificationAnswers(java.util.List<ClarificationAnswers> clarificationAnswers) {
            this.putQueryParameter("ClarificationAnswers", clarificationAnswers);
            this.clarificationAnswers = clarificationAnswers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * ToolCallId.
         */
        public Builder toolCallId(String toolCallId) {
            this.putQueryParameter("ToolCallId", toolCallId);
            this.toolCallId = toolCallId;
            return this;
        }

        @Override
        public ResumeAgentTaskRequest build() {
            return new ResumeAgentTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link ResumeAgentTaskRequest} extends {@link TeaModel}
     *
     * <p>ResumeAgentTaskRequest</p>
     */
    public static class ClarificationAnswers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomValue")
        private String customValue;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("SelectedIds")
        private java.util.List<String> selectedIds;

        private ClarificationAnswers(Builder builder) {
            this.customValue = builder.customValue;
            this.id = builder.id;
            this.selectedIds = builder.selectedIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClarificationAnswers create() {
            return builder().build();
        }

        /**
         * @return customValue
         */
        public String getCustomValue() {
            return this.customValue;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return selectedIds
         */
        public java.util.List<String> getSelectedIds() {
            return this.selectedIds;
        }

        public static final class Builder {
            private String customValue; 
            private String id; 
            private java.util.List<String> selectedIds; 

            private Builder() {
            } 

            private Builder(ClarificationAnswers model) {
                this.customValue = model.customValue;
                this.id = model.id;
                this.selectedIds = model.selectedIds;
            } 

            /**
             * CustomValue.
             */
            public Builder customValue(String customValue) {
                this.customValue = customValue;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * SelectedIds.
             */
            public Builder selectedIds(java.util.List<String> selectedIds) {
                this.selectedIds = selectedIds;
                return this;
            }

            public ClarificationAnswers build() {
                return new ClarificationAnswers(this);
            } 

        } 

    }
}
