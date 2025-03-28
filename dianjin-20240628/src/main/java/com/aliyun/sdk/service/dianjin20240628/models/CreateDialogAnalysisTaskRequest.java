// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link CreateDialogAnalysisTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDialogAnalysisTaskRequest</p>
 */
public class CreateDialogAnalysisTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("analysisNodes")
    private java.util.List<String> analysisNodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conversationList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ConversationList> conversationList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metaData")
    private java.util.Map<String, ?> metaData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("playCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    private CreateDialogAnalysisTaskRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.analysisNodes = builder.analysisNodes;
        this.conversationList = builder.conversationList;
        this.metaData = builder.metaData;
        this.playCode = builder.playCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDialogAnalysisTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return analysisNodes
     */
    public java.util.List<String> getAnalysisNodes() {
        return this.analysisNodes;
    }

    /**
     * @return conversationList
     */
    public java.util.List<ConversationList> getConversationList() {
        return this.conversationList;
    }

    /**
     * @return metaData
     */
    public java.util.Map<String, ?> getMetaData() {
        return this.metaData;
    }

    /**
     * @return playCode
     */
    public String getPlayCode() {
        return this.playCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<CreateDialogAnalysisTaskRequest, Builder> {
        private String workspaceId; 
        private java.util.List<String> analysisNodes; 
        private java.util.List<ConversationList> conversationList; 
        private java.util.Map<String, ?> metaData; 
        private String playCode; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDialogAnalysisTaskRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.analysisNodes = request.analysisNodes;
            this.conversationList = request.conversationList;
            this.metaData = request.metaData;
            this.playCode = request.playCode;
            this.requestId = request.requestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * analysisNodes.
         */
        public Builder analysisNodes(java.util.List<String> analysisNodes) {
            this.putBodyParameter("analysisNodes", analysisNodes);
            this.analysisNodes = analysisNodes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder conversationList(java.util.List<ConversationList> conversationList) {
            this.putBodyParameter("conversationList", conversationList);
            this.conversationList = conversationList;
            return this;
        }

        /**
         * metaData.
         */
        public Builder metaData(java.util.Map<String, ?> metaData) {
            this.putBodyParameter("metaData", metaData);
            this.metaData = metaData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        public Builder playCode(String playCode) {
            this.putBodyParameter("playCode", playCode);
            this.playCode = playCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0FC6636E-380A-5369-AE01-D1C15BB9B254</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public CreateDialogAnalysisTaskRequest build() {
            return new CreateDialogAnalysisTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDialogAnalysisTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDialogAnalysisTaskRequest</p>
     */
    public static class DialogueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        private DialogueList(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogueList create() {
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

            private Builder(DialogueList model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link CreateDialogAnalysisTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDialogAnalysisTaskRequest</p>
     */
    public static class ConversationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dialogueList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<DialogueList> dialogueList;

        private ConversationList(Builder builder) {
            this.dialogueList = builder.dialogueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversationList create() {
            return builder().build();
        }

        /**
         * @return dialogueList
         */
        public java.util.List<DialogueList> getDialogueList() {
            return this.dialogueList;
        }

        public static final class Builder {
            private java.util.List<DialogueList> dialogueList; 

            private Builder() {
            } 

            private Builder(ConversationList model) {
                this.dialogueList = model.dialogueList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder dialogueList(java.util.List<DialogueList> dialogueList) {
                this.dialogueList = dialogueList;
                return this;
            }

            public ConversationList build() {
                return new ConversationList(this);
            } 

        } 

    }
}
