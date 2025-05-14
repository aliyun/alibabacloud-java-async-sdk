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
 * {@link RealtimeDialogAssistResponseBody} extends {@link TeaModel}
 *
 * <p>RealtimeDialogAssistResponseBody</p>
 */
public class RealtimeDialogAssistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private RealtimeDialogAssistResponseBody(Builder builder) {
        this.cost = builder.cost;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RealtimeDialogAssistResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private Long cost; 
        private Data data; 
        private String dataType; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String time; 

        private Builder() {
        } 

        private Builder(RealtimeDialogAssistResponseBody model) {
            this.cost = model.cost;
            this.data = model.data;
            this.dataType = model.dataType;
            this.errCode = model.errCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.time = model.time;
        } 

        /**
         * cost.
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public RealtimeDialogAssistResponseBody build() {
            return new RealtimeDialogAssistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RealtimeDialogAssistResponseBody} extends {@link TeaModel}
     *
     * <p>RealtimeDialogAssistResponseBody</p>
     */
    public static class AssistScripts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assistScript")
        private String assistScript;

        @com.aliyun.core.annotation.NameInMap("intentCode")
        private String intentCode;

        @com.aliyun.core.annotation.NameInMap("intentLabels")
        private String intentLabels;

        @com.aliyun.core.annotation.NameInMap("intentName")
        private String intentName;

        @com.aliyun.core.annotation.NameInMap("isDefault")
        private Boolean isDefault;

        private AssistScripts(Builder builder) {
            this.assistScript = builder.assistScript;
            this.intentCode = builder.intentCode;
            this.intentLabels = builder.intentLabels;
            this.intentName = builder.intentName;
            this.isDefault = builder.isDefault;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssistScripts create() {
            return builder().build();
        }

        /**
         * @return assistScript
         */
        public String getAssistScript() {
            return this.assistScript;
        }

        /**
         * @return intentCode
         */
        public String getIntentCode() {
            return this.intentCode;
        }

        /**
         * @return intentLabels
         */
        public String getIntentLabels() {
            return this.intentLabels;
        }

        /**
         * @return intentName
         */
        public String getIntentName() {
            return this.intentName;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public static final class Builder {
            private String assistScript; 
            private String intentCode; 
            private String intentLabels; 
            private String intentName; 
            private Boolean isDefault; 

            private Builder() {
            } 

            private Builder(AssistScripts model) {
                this.assistScript = model.assistScript;
                this.intentCode = model.intentCode;
                this.intentLabels = model.intentLabels;
                this.intentName = model.intentName;
                this.isDefault = model.isDefault;
            } 

            /**
             * assistScript.
             */
            public Builder assistScript(String assistScript) {
                this.assistScript = assistScript;
                return this;
            }

            /**
             * intentCode.
             */
            public Builder intentCode(String intentCode) {
                this.intentCode = intentCode;
                return this;
            }

            /**
             * intentLabels.
             */
            public Builder intentLabels(String intentLabels) {
                this.intentLabels = intentLabels;
                return this;
            }

            /**
             * intentName.
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * isDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            public AssistScripts build() {
                return new AssistScripts(this);
            } 

        } 

    }
    /**
     * 
     * {@link RealtimeDialogAssistResponseBody} extends {@link TeaModel}
     *
     * <p>RealtimeDialogAssistResponseBody</p>
     */
    public static class AssistSop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assistSop")
        private String assistSop;

        @com.aliyun.core.annotation.NameInMap("intentCode")
        private String intentCode;

        @com.aliyun.core.annotation.NameInMap("intentName")
        private String intentName;

        @com.aliyun.core.annotation.NameInMap("isDefault")
        private Boolean isDefault;

        private AssistSop(Builder builder) {
            this.assistSop = builder.assistSop;
            this.intentCode = builder.intentCode;
            this.intentName = builder.intentName;
            this.isDefault = builder.isDefault;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssistSop create() {
            return builder().build();
        }

        /**
         * @return assistSop
         */
        public String getAssistSop() {
            return this.assistSop;
        }

        /**
         * @return intentCode
         */
        public String getIntentCode() {
            return this.intentCode;
        }

        /**
         * @return intentName
         */
        public String getIntentName() {
            return this.intentName;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public static final class Builder {
            private String assistSop; 
            private String intentCode; 
            private String intentName; 
            private Boolean isDefault; 

            private Builder() {
            } 

            private Builder(AssistSop model) {
                this.assistSop = model.assistSop;
                this.intentCode = model.intentCode;
                this.intentName = model.intentName;
                this.isDefault = model.isDefault;
            } 

            /**
             * assistSop.
             */
            public Builder assistSop(String assistSop) {
                this.assistSop = assistSop;
                return this;
            }

            /**
             * intentCode.
             */
            public Builder intentCode(String intentCode) {
                this.intentCode = intentCode;
                return this;
            }

            /**
             * intentName.
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * isDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            public AssistSop build() {
                return new AssistSop(this);
            } 

        } 

    }
    /**
     * 
     * {@link RealtimeDialogAssistResponseBody} extends {@link TeaModel}
     *
     * <p>RealtimeDialogAssistResponseBody</p>
     */
    public static class ConversationModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("customerServiceId")
        private String customerServiceId;

        @com.aliyun.core.annotation.NameInMap("customerServiceType")
        private String customerServiceType;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

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
        public String getRole() {
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
            private String role; 
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
             * content.
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
             * role.
             */
            public Builder role(String role) {
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
    /**
     * 
     * {@link RealtimeDialogAssistResponseBody} extends {@link TeaModel}
     *
     * <p>RealtimeDialogAssistResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysisProcess")
        private String analysisProcess;

        @com.aliyun.core.annotation.NameInMap("assistScripts")
        private java.util.List<AssistScripts> assistScripts;

        @com.aliyun.core.annotation.NameInMap("assistSop")
        private java.util.List<AssistSop> assistSop;

        @com.aliyun.core.annotation.NameInMap("conversationModel")
        private java.util.List<ConversationModel> conversationModel;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        private Data(Builder builder) {
            this.analysisProcess = builder.analysisProcess;
            this.assistScripts = builder.assistScripts;
            this.assistSop = builder.assistSop;
            this.conversationModel = builder.conversationModel;
            this.requestId = builder.requestId;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return analysisProcess
         */
        public String getAnalysisProcess() {
            return this.analysisProcess;
        }

        /**
         * @return assistScripts
         */
        public java.util.List<AssistScripts> getAssistScripts() {
            return this.assistScripts;
        }

        /**
         * @return assistSop
         */
        public java.util.List<AssistSop> getAssistSop() {
            return this.assistSop;
        }

        /**
         * @return conversationModel
         */
        public java.util.List<ConversationModel> getConversationModel() {
            return this.conversationModel;
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

        public static final class Builder {
            private String analysisProcess; 
            private java.util.List<AssistScripts> assistScripts; 
            private java.util.List<AssistSop> assistSop; 
            private java.util.List<ConversationModel> conversationModel; 
            private String requestId; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.analysisProcess = model.analysisProcess;
                this.assistScripts = model.assistScripts;
                this.assistSop = model.assistSop;
                this.conversationModel = model.conversationModel;
                this.requestId = model.requestId;
                this.sessionId = model.sessionId;
            } 

            /**
             * analysisProcess.
             */
            public Builder analysisProcess(String analysisProcess) {
                this.analysisProcess = analysisProcess;
                return this;
            }

            /**
             * assistScripts.
             */
            public Builder assistScripts(java.util.List<AssistScripts> assistScripts) {
                this.assistScripts = assistScripts;
                return this;
            }

            /**
             * assistSop.
             */
            public Builder assistSop(java.util.List<AssistSop> assistSop) {
                this.assistSop = assistSop;
                return this;
            }

            /**
             * conversationModel.
             */
            public Builder conversationModel(java.util.List<ConversationModel> conversationModel) {
                this.conversationModel = conversationModel;
                return this;
            }

            /**
             * requestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
