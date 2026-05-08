// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link CreateAICoachTaskReportRequest} extends {@link RequestModel}
 *
 * <p>CreateAICoachTaskReportRequest</p>
 */
public class CreateAICoachTaskReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dialogueList")
    private java.util.List<DialogueList> dialogueList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("idempotentId")
    private String idempotentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private CreateAICoachTaskReportRequest(Builder builder) {
        super(builder);
        this.dialogueList = builder.dialogueList;
        this.idempotentId = builder.idempotentId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAICoachTaskReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dialogueList
     */
    public java.util.List<DialogueList> getDialogueList() {
        return this.dialogueList;
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<CreateAICoachTaskReportRequest, Builder> {
        private java.util.List<DialogueList> dialogueList; 
        private String idempotentId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAICoachTaskReportRequest request) {
            super(request);
            this.dialogueList = request.dialogueList;
            this.idempotentId = request.idempotentId;
            this.taskId = request.taskId;
        } 

        /**
         * dialogueList.
         */
        public Builder dialogueList(java.util.List<DialogueList> dialogueList) {
            this.putBodyParameter("dialogueList", dialogueList);
            this.dialogueList = dialogueList;
            return this;
        }

        /**
         * idempotentId.
         */
        public Builder idempotentId(String idempotentId) {
            this.putBodyParameter("idempotentId", idempotentId);
            this.idempotentId = idempotentId;
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
        public CreateAICoachTaskReportRequest build() {
            return new CreateAICoachTaskReportRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAICoachTaskReportRequest} extends {@link TeaModel}
     *
     * <p>CreateAICoachTaskReportRequest</p>
     */
    public static class DialogueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private DialogueList(Builder builder) {
            this.message = builder.message;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogueList create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String message; 
            private String role; 

            private Builder() {
            } 

            private Builder(DialogueList model) {
                this.message = model.message;
                this.role = model.role;
            } 

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public DialogueList build() {
                return new DialogueList(this);
            } 

        } 

    }
}
