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
 * {@link RealtimeDialogAssistRequest} extends {@link RequestModel}
 *
 * <p>RealtimeDialogAssistRequest</p>
 */
public class RealtimeDialogAssistRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("analysis")
    private Boolean analysis;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conversationModel")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ConversationModel> conversationModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dialogMemoryTurns")
    private Integer dialogMemoryTurns;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hangUpDialog")
    private Boolean hangUpDialog;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metaData")
    private java.util.Map<String, ?> metaData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private RealtimeDialogAssistRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.analysis = builder.analysis;
        this.bizType = builder.bizType;
        this.conversationModel = builder.conversationModel;
        this.dialogMemoryTurns = builder.dialogMemoryTurns;
        this.hangUpDialog = builder.hangUpDialog;
        this.metaData = builder.metaData;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RealtimeDialogAssistRequest create() {
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
     * @return analysis
     */
    public Boolean getAnalysis() {
        return this.analysis;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return conversationModel
     */
    public java.util.List<ConversationModel> getConversationModel() {
        return this.conversationModel;
    }

    /**
     * @return dialogMemoryTurns
     */
    public Integer getDialogMemoryTurns() {
        return this.dialogMemoryTurns;
    }

    /**
     * @return hangUpDialog
     */
    public Boolean getHangUpDialog() {
        return this.hangUpDialog;
    }

    /**
     * @return metaData
     */
    public java.util.Map<String, ?> getMetaData() {
        return this.metaData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<RealtimeDialogAssistRequest, Builder> {
        private String workspaceId; 
        private Boolean analysis; 
        private String bizType; 
        private java.util.List<ConversationModel> conversationModel; 
        private Integer dialogMemoryTurns; 
        private Boolean hangUpDialog; 
        private java.util.Map<String, ?> metaData; 
        private String requestId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(RealtimeDialogAssistRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.analysis = request.analysis;
            this.bizType = request.bizType;
            this.conversationModel = request.conversationModel;
            this.dialogMemoryTurns = request.dialogMemoryTurns;
            this.hangUpDialog = request.hangUpDialog;
            this.metaData = request.metaData;
            this.requestId = request.requestId;
            this.sessionId = request.sessionId;
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
         * analysis.
         */
        public Builder analysis(Boolean analysis) {
            this.putBodyParameter("analysis", analysis);
            this.analysis = analysis;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dialogAssist</p>
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("bizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder conversationModel(java.util.List<ConversationModel> conversationModel) {
            this.putBodyParameter("conversationModel", conversationModel);
            this.conversationModel = conversationModel;
            return this;
        }

        /**
         * dialogMemoryTurns.
         */
        public Builder dialogMemoryTurns(Integer dialogMemoryTurns) {
            this.putBodyParameter("dialogMemoryTurns", dialogMemoryTurns);
            this.dialogMemoryTurns = dialogMemoryTurns;
            return this;
        }

        /**
         * hangUpDialog.
         */
        public Builder hangUpDialog(Boolean hangUpDialog) {
            this.putBodyParameter("hangUpDialog", hangUpDialog);
            this.hangUpDialog = hangUpDialog;
            return this;
        }

        /**
         * <p>metaData</p>
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
         * <p>0FC6636E-380A-5369-AE01-D1C15BB9B254</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1915593248420413441</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public RealtimeDialogAssistRequest build() {
            return new RealtimeDialogAssistRequest(this);
        } 

    } 

    /**
     * 
     * {@link RealtimeDialogAssistRequest} extends {@link TeaModel}
     *
     * <p>RealtimeDialogAssistRequest</p>
     */
    public static class ConversationModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("customerServiceId")
        private String customerServiceId;

        @com.aliyun.core.annotation.NameInMap("customerServiceType")
        private String customerServiceType;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer role;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ConversationModel(Builder builder) {
            this.content = builder.content;
            this.customerId = builder.customerId;
            this.customerServiceId = builder.customerServiceId;
            this.customerServiceType = builder.customerServiceType;
            this.role = builder.role;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversationModel create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return customerServiceId
         */
        public String getCustomerServiceId() {
            return this.customerServiceId;
        }

        /**
         * @return customerServiceType
         */
        public String getCustomerServiceType() {
            return this.customerServiceType;
        }

        /**
         * @return role
         */
        public Integer getRole() {
            return this.role;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private String customerId; 
            private String customerServiceId; 
            private String customerServiceType; 
            private Integer role; 
            private String type; 

            private Builder() {
            } 

            private Builder(ConversationModel model) {
                this.content = model.content;
                this.customerId = model.customerId;
                this.customerServiceId = model.customerServiceId;
                this.customerServiceType = model.customerServiceType;
                this.role = model.role;
                this.type = model.type;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * customerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * customerServiceId.
             */
            public Builder customerServiceId(String customerServiceId) {
                this.customerServiceId = customerServiceId;
                return this;
            }

            /**
             * customerServiceType.
             */
            public Builder customerServiceType(String customerServiceType) {
                this.customerServiceType = customerServiceType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder role(Integer role) {
                this.role = role;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ConversationModel build() {
                return new ConversationModel(this);
            } 

        } 

    }
}
