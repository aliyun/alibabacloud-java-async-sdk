// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetQualityCheckTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityCheckTaskResultResponseBody</p>
 */
public class GetQualityCheckTaskResultResponseBody extends TeaModel {
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

    private GetQualityCheckTaskResultResponseBody(Builder builder) {
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

    public static GetQualityCheckTaskResultResponseBody create() {
        return builder().build();
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

        public GetQualityCheckTaskResultResponseBody build() {
            return new GetQualityCheckTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityCheckTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityCheckTaskResultResponseBody</p>
     */
    public static class DialogueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("begin")
        private Integer begin;

        @com.aliyun.core.annotation.NameInMap("beginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("customerServiceId")
        private String customerServiceId;

        @com.aliyun.core.annotation.NameInMap("customerServiceType")
        private String customerServiceType;

        @com.aliyun.core.annotation.NameInMap("end")
        private Integer end;

        @com.aliyun.core.annotation.NameInMap("id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private DialogueList(Builder builder) {
            this.begin = builder.begin;
            this.beginTime = builder.beginTime;
            this.content = builder.content;
            this.customerId = builder.customerId;
            this.customerServiceId = builder.customerServiceId;
            this.customerServiceType = builder.customerServiceType;
            this.end = builder.end;
            this.id = builder.id;
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
         * @return id
         */
        public Integer getId() {
            return this.id;
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
            private Integer id; 
            private String role; 
            private String type; 

            /**
             * begin.
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * beginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
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
             * end.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Integer id) {
                this.id = id;
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

            public DialogueList build() {
                return new DialogueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityCheckTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityCheckTaskResultResponseBody</p>
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
        private java.util.List < DialogueList> dialogueList;

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
        public java.util.List < DialogueList> getDialogueList() {
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
            private java.util.List < DialogueList> dialogueList; 
            private String gmtService; 

            /**
             * callType.
             */
            public Builder callType(String callType) {
                this.callType = callType;
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
             * customerName.
             */
            public Builder customerName(String customerName) {
                this.customerName = customerName;
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
             * customerServiceName.
             */
            public Builder customerServiceName(String customerServiceName) {
                this.customerServiceName = customerServiceName;
                return this;
            }

            /**
             * dialogueList.
             */
            public Builder dialogueList(java.util.List < DialogueList> dialogueList) {
                this.dialogueList = dialogueList;
                return this;
            }

            /**
             * gmtService.
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
    /**
     * 
     * {@link GetQualityCheckTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityCheckTaskResultResponseBody</p>
     */
    public static class OriginDialogue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("begin")
        private Integer begin;

        @com.aliyun.core.annotation.NameInMap("beginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("customerServiceId")
        private String customerServiceId;

        @com.aliyun.core.annotation.NameInMap("customerServiceType")
        private String customerServiceType;

        @com.aliyun.core.annotation.NameInMap("end")
        private Integer end;

        @com.aliyun.core.annotation.NameInMap("id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private OriginDialogue(Builder builder) {
            this.begin = builder.begin;
            this.beginTime = builder.beginTime;
            this.content = builder.content;
            this.customerId = builder.customerId;
            this.customerServiceId = builder.customerServiceId;
            this.customerServiceType = builder.customerServiceType;
            this.end = builder.end;
            this.id = builder.id;
            this.role = builder.role;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginDialogue create() {
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
         * @return id
         */
        public Integer getId() {
            return this.id;
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
            private Integer id; 
            private String role; 
            private String type; 

            /**
             * begin.
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * beginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
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
             * end.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Integer id) {
                this.id = id;
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

            public OriginDialogue build() {
                return new OriginDialogue(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityCheckTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityCheckTaskResultResponseBody</p>
     */
    public static class QualityCheckList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkExplanation")
        private String checkExplanation;

        @com.aliyun.core.annotation.NameInMap("checkPassed")
        private String checkPassed;

        @com.aliyun.core.annotation.NameInMap("checkProcess")
        private String checkProcess;

        @com.aliyun.core.annotation.NameInMap("checked")
        private String checked;

        @com.aliyun.core.annotation.NameInMap("gmtEnd")
        private String gmtEnd;

        @com.aliyun.core.annotation.NameInMap("gmtStart")
        private String gmtStart;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("originDialogue")
        private java.util.List < OriginDialogue> originDialogue;

        @com.aliyun.core.annotation.NameInMap("qualityGroupId")
        private String qualityGroupId;

        @com.aliyun.core.annotation.NameInMap("ruleDescription")
        private String ruleDescription;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        private QualityCheckList(Builder builder) {
            this.checkExplanation = builder.checkExplanation;
            this.checkPassed = builder.checkPassed;
            this.checkProcess = builder.checkProcess;
            this.checked = builder.checked;
            this.gmtEnd = builder.gmtEnd;
            this.gmtStart = builder.gmtStart;
            this.mode = builder.mode;
            this.originDialogue = builder.originDialogue;
            this.qualityGroupId = builder.qualityGroupId;
            this.ruleDescription = builder.ruleDescription;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityCheckList create() {
            return builder().build();
        }

        /**
         * @return checkExplanation
         */
        public String getCheckExplanation() {
            return this.checkExplanation;
        }

        /**
         * @return checkPassed
         */
        public String getCheckPassed() {
            return this.checkPassed;
        }

        /**
         * @return checkProcess
         */
        public String getCheckProcess() {
            return this.checkProcess;
        }

        /**
         * @return checked
         */
        public String getChecked() {
            return this.checked;
        }

        /**
         * @return gmtEnd
         */
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        /**
         * @return gmtStart
         */
        public String getGmtStart() {
            return this.gmtStart;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return originDialogue
         */
        public java.util.List < OriginDialogue> getOriginDialogue() {
            return this.originDialogue;
        }

        /**
         * @return qualityGroupId
         */
        public String getQualityGroupId() {
            return this.qualityGroupId;
        }

        /**
         * @return ruleDescription
         */
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private String checkExplanation; 
            private String checkPassed; 
            private String checkProcess; 
            private String checked; 
            private String gmtEnd; 
            private String gmtStart; 
            private String mode; 
            private java.util.List < OriginDialogue> originDialogue; 
            private String qualityGroupId; 
            private String ruleDescription; 
            private String ruleId; 

            /**
             * checkExplanation.
             */
            public Builder checkExplanation(String checkExplanation) {
                this.checkExplanation = checkExplanation;
                return this;
            }

            /**
             * checkPassed.
             */
            public Builder checkPassed(String checkPassed) {
                this.checkPassed = checkPassed;
                return this;
            }

            /**
             * checkProcess.
             */
            public Builder checkProcess(String checkProcess) {
                this.checkProcess = checkProcess;
                return this;
            }

            /**
             * checked.
             */
            public Builder checked(String checked) {
                this.checked = checked;
                return this;
            }

            /**
             * gmtEnd.
             */
            public Builder gmtEnd(String gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * gmtStart.
             */
            public Builder gmtStart(String gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * originDialogue.
             */
            public Builder originDialogue(java.util.List < OriginDialogue> originDialogue) {
                this.originDialogue = originDialogue;
                return this;
            }

            /**
             * qualityGroupId.
             */
            public Builder qualityGroupId(String qualityGroupId) {
                this.qualityGroupId = qualityGroupId;
                return this;
            }

            /**
             * ruleDescription.
             */
            public Builder ruleDescription(String ruleDescription) {
                this.ruleDescription = ruleDescription;
                return this;
            }

            /**
             * ruleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public QualityCheckList build() {
                return new QualityCheckList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityCheckTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityCheckTaskResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conversationList")
        private ConversationList conversationList;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtEnd")
        private String gmtEnd;

        @com.aliyun.core.annotation.NameInMap("gmtStart")
        private String gmtStart;

        @com.aliyun.core.annotation.NameInMap("qualityCheckList")
        private java.util.List < QualityCheckList> qualityCheckList;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        private Data(Builder builder) {
            this.conversationList = builder.conversationList;
            this.gmtCreate = builder.gmtCreate;
            this.gmtEnd = builder.gmtEnd;
            this.gmtStart = builder.gmtStart;
            this.qualityCheckList = builder.qualityCheckList;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return conversationList
         */
        public ConversationList getConversationList() {
            return this.conversationList;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtEnd
         */
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        /**
         * @return gmtStart
         */
        public String getGmtStart() {
            return this.gmtStart;
        }

        /**
         * @return qualityCheckList
         */
        public java.util.List < QualityCheckList> getQualityCheckList() {
            return this.qualityCheckList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private ConversationList conversationList; 
            private String gmtCreate; 
            private String gmtEnd; 
            private String gmtStart; 
            private java.util.List < QualityCheckList> qualityCheckList; 
            private String status; 
            private String taskId; 

            /**
             * conversationList.
             */
            public Builder conversationList(ConversationList conversationList) {
                this.conversationList = conversationList;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtEnd.
             */
            public Builder gmtEnd(String gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * gmtStart.
             */
            public Builder gmtStart(String gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * qualityCheckList.
             */
            public Builder qualityCheckList(java.util.List < QualityCheckList> qualityCheckList) {
                this.qualityCheckList = qualityCheckList;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
