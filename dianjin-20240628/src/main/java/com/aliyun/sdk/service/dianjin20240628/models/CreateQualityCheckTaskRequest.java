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
 * {@link CreateQualityCheckTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateQualityCheckTaskRequest</p>
 */
public class CreateQualityCheckTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conversationList")
    @com.aliyun.core.annotation.Validation(required = true)
    private ConversationList conversationList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gmtService")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtService;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metaData")
    private java.util.Map<String, String> metaData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("qualityGroup")
    private java.util.List<String> qualityGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sceneCode")
    private String sceneCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateQualityCheckTaskRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.conversationList = builder.conversationList;
        this.gmtService = builder.gmtService;
        this.metaData = builder.metaData;
        this.qualityGroup = builder.qualityGroup;
        this.requestId = builder.requestId;
        this.sceneCode = builder.sceneCode;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQualityCheckTaskRequest create() {
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
     * @return conversationList
     */
    public ConversationList getConversationList() {
        return this.conversationList;
    }

    /**
     * @return gmtService
     */
    public String getGmtService() {
        return this.gmtService;
    }

    /**
     * @return metaData
     */
    public java.util.Map<String, String> getMetaData() {
        return this.metaData;
    }

    /**
     * @return qualityGroup
     */
    public java.util.List<String> getQualityGroup() {
        return this.qualityGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateQualityCheckTaskRequest, Builder> {
        private String workspaceId; 
        private ConversationList conversationList; 
        private String gmtService; 
        private java.util.Map<String, String> metaData; 
        private java.util.List<String> qualityGroup; 
        private String requestId; 
        private String sceneCode; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateQualityCheckTaskRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.conversationList = request.conversationList;
            this.gmtService = request.gmtService;
            this.metaData = request.metaData;
            this.qualityGroup = request.qualityGroup;
            this.requestId = request.requestId;
            this.sceneCode = request.sceneCode;
            this.type = request.type;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The conversation content. If associated with a quality check scenario, pass multiple conversations. Otherwise, pass only one.</p>
         * <p>This parameter is required.</p>
         */
        public Builder conversationList(ConversationList conversationList) {
            this.putBodyParameter("conversationList", conversationList);
            this.conversationList = conversationList;
            return this;
        }

        /**
         * <p>The business occurrence time. The system uses this to record submission time, make task scheduling priority decisions, and so on.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-27 11:23:20</p>
         */
        public Builder gmtService(String gmtService) {
            this.putBodyParameter("gmtService", gmtService);
            this.gmtService = gmtService;
            return this;
        }

        /**
         * <p>The metadata. These are properties related to business that rules consume during execution. The business system passes these in real-time when initiating a quality check.</p>
         */
        public Builder metaData(java.util.Map<String, String> metaData) {
            this.putBodyParameter("metaData", metaData);
            this.metaData = metaData;
            return this;
        }

        /**
         * <p>The quality check rule group.</p>
         */
        public Builder qualityGroup(java.util.List<String> qualityGroup) {
            this.putBodyParameter("qualityGroup", qualityGroup);
            this.qualityGroup = qualityGroup;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
         * <p>The scenario code.</p>
         * 
         * <strong>example:</strong>
         * <p>o9c8u8</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putBodyParameter("sceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * <p>Quality check type:</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateQualityCheckTaskRequest build() {
            return new CreateQualityCheckTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateQualityCheckTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateQualityCheckTaskRequest</p>
     */
    public static class DialogueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("begin")
        private Integer begin;

        @com.aliyun.core.annotation.NameInMap("beginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("customerServiceId")
        private String customerServiceId;

        @com.aliyun.core.annotation.NameInMap("customerServiceType")
        private String customerServiceType;

        @com.aliyun.core.annotation.NameInMap("end")
        private Integer end;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private DialogueList(Builder builder) {
            this.begin = builder.begin;
            this.beginTime = builder.beginTime;
            this.content = builder.content;
            this.customerId = builder.customerId;
            this.customerServiceId = builder.customerServiceId;
            this.customerServiceType = builder.customerServiceType;
            this.end = builder.end;
            this.role = builder.role;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogueList create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Integer getBegin() {
            return this.begin;
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
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
         * @return end
         */
        public Integer getEnd() {
            return this.end;
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
            private Integer begin; 
            private String beginTime; 
            private String content; 
            private String customerId; 
            private String customerServiceId; 
            private String customerServiceType; 
            private Integer end; 
            private String role; 
            private String type; 

            private Builder() {
            } 

            private Builder(DialogueList model) {
                this.begin = model.begin;
                this.beginTime = model.beginTime;
                this.content = model.content;
                this.customerId = model.customerId;
                this.customerServiceId = model.customerServiceId;
                this.customerServiceType = model.customerServiceType;
                this.end = model.end;
                this.role = model.role;
                this.type = model.type;
            } 

            /**
             * <p>The start time of this sentence. This is the offset time in milliseconds from the start of the conversation.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>The start time of this sentence.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-23 14:57:50</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The specific content of the dialogue.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>您好，我是2001，很高兴为您服务！</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The unique identifier of the dialogue role.</p>
             * 
             * <strong>example:</strong>
             * <p>2348234</p>
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * <p>The customer service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>23874627346</p>
             */
            public Builder customerServiceId(String customerServiceId) {
                this.customerServiceId = customerServiceId;
                return this;
            }

            /**
             * <p>Agent type:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder customerServiceType(String customerServiceType) {
                this.customerServiceType = customerServiceType;
                return this;
            }

            /**
             * <p>The end time of this sentence. This is the offset time in milliseconds from the start of the conversation.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * <p>Role:</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Dialogue content type:</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TEXT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DialogueList build() {
                return new DialogueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateQualityCheckTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateQualityCheckTaskRequest</p>
     */
    public static class ConversationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("callType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("customerName")
        private String customerName;

        @com.aliyun.core.annotation.NameInMap("customerServiceId")
        private String customerServiceId;

        @com.aliyun.core.annotation.NameInMap("customerServiceName")
        private String customerServiceName;

        @com.aliyun.core.annotation.NameInMap("dialogueList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<DialogueList> dialogueList;

        @com.aliyun.core.annotation.NameInMap("gmtService")
        private String gmtService;

        private ConversationList(Builder builder) {
            this.callType = builder.callType;
            this.customerId = builder.customerId;
            this.customerName = builder.customerName;
            this.customerServiceId = builder.customerServiceId;
            this.customerServiceName = builder.customerServiceName;
            this.dialogueList = builder.dialogueList;
            this.gmtService = builder.gmtService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversationList create() {
            return builder().build();
        }

        /**
         * @return callType
         */
        public String getCallType() {
            return this.callType;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return customerName
         */
        public String getCustomerName() {
            return this.customerName;
        }

        /**
         * @return customerServiceId
         */
        public String getCustomerServiceId() {
            return this.customerServiceId;
        }

        /**
         * @return customerServiceName
         */
        public String getCustomerServiceName() {
            return this.customerServiceName;
        }

        /**
         * @return dialogueList
         */
        public java.util.List<DialogueList> getDialogueList() {
            return this.dialogueList;
        }

        /**
         * @return gmtService
         */
        public String getGmtService() {
            return this.gmtService;
        }

        public static final class Builder {
            private String callType; 
            private String customerId; 
            private String customerName; 
            private String customerServiceId; 
            private String customerServiceName; 
            private java.util.List<DialogueList> dialogueList; 
            private String gmtService; 

            private Builder() {
            } 

            private Builder(ConversationList model) {
                this.callType = model.callType;
                this.customerId = model.customerId;
                this.customerName = model.customerName;
                this.customerServiceId = model.customerServiceId;
                this.customerServiceName = model.customerServiceName;
                this.dialogueList = model.dialogueList;
                this.gmtService = model.gmtService;
            } 

            /**
             * <p>Call type:</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>The Customer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * <p>The customer name.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder customerName(String customerName) {
                this.customerName = customerName;
                return this;
            }

            /**
             * <p>The customer service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder customerServiceId(String customerServiceId) {
                this.customerServiceId = customerServiceId;
                return this;
            }

            /**
             * <p>The customer service name.</p>
             * 
             * <strong>example:</strong>
             * <p>李四</p>
             */
            public Builder customerServiceName(String customerServiceName) {
                this.customerServiceName = customerServiceName;
                return this;
            }

            /**
             * <p>The list of dialogue details.</p>
             * <p>This parameter is required.</p>
             */
            public Builder dialogueList(java.util.List<DialogueList> dialogueList) {
                this.dialogueList = dialogueList;
                return this;
            }

            /**
             * <p>The conversation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-27 11:23:20</p>
             */
            public Builder gmtService(String gmtService) {
                this.gmtService = gmtService;
                return this;
            }

            public ConversationList build() {
                return new ConversationList(this);
            } 

        } 

    }
}
