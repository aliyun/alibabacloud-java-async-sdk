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

        private Builder(GetQualityCheckTaskResultResponseBody model) {
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
         * <p>Processing time, in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * <p>Response data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Data type</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>67C7021A-D268-553D-8C15-A087B9604028</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the request succeeded</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
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
                this.id = model.id;
                this.role = model.role;
                this.type = model.type;
            } 

            /**
             * <p>Start time of this utterance, in milliseconds relative to the start of the conversation</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>Start time of this utterance</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-27 11:23:20</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>Dialogue content</p>
             * 
             * <strong>example:</strong>
             * <p>您好，我是2001，很高兴为您服务！</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Unique identifier for the dialogue role</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * <p>Agent ID</p>
             * 
             * <strong>example:</strong>
             * <p>李四</p>
             */
            public Builder customerServiceId(String customerServiceId) {
                this.customerServiceId = customerServiceId;
                return this;
            }

            /**
             * <p>Agent type</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder customerServiceType(String customerServiceType) {
                this.customerServiceType = customerServiceType;
                return this;
            }

            /**
             * <p>End time of this utterance, in milliseconds relative to the start of the conversation</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * <p>Unique identifier for this utterance. Assigned internally</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Role</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Content type</p>
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
             * <p>Customer ID</p>
             * 
             * <strong>example:</strong>
             * <p>234234</p>
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * <p>Customer name</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder customerName(String customerName) {
                this.customerName = customerName;
                return this;
            }

            /**
             * <p>Agent ID</p>
             * 
             * <strong>example:</strong>
             * <p>23984763826</p>
             */
            public Builder customerServiceId(String customerServiceId) {
                this.customerServiceId = customerServiceId;
                return this;
            }

            /**
             * <p>Agent name</p>
             * 
             * <strong>example:</strong>
             * <p>李四</p>
             */
            public Builder customerServiceName(String customerServiceName) {
                this.customerServiceName = customerServiceName;
                return this;
            }

            /**
             * <p>Dialogue details list</p>
             */
            public Builder dialogueList(java.util.List<DialogueList> dialogueList) {
                this.dialogueList = dialogueList;
                return this;
            }

            /**
             * <p>Conversation time</p>
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

            private Builder() {
            } 

            private Builder(OriginDialogue model) {
                this.begin = model.begin;
                this.beginTime = model.beginTime;
                this.content = model.content;
                this.customerId = model.customerId;
                this.customerServiceId = model.customerServiceId;
                this.customerServiceType = model.customerServiceType;
                this.end = model.end;
                this.id = model.id;
                this.role = model.role;
                this.type = model.type;
            } 

            /**
             * <p>Start time of this utterance, in milliseconds relative to the start of the conversation</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>Start time of this utterance</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-23 14:57:50</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>Dialogue content</p>
             * 
             * <strong>example:</strong>
             * <p>您好，我是2001，很高兴为您服务！</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Unique identifier for the dialogue role</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * <p>Agent ID</p>
             * 
             * <strong>example:</strong>
             * <p>23876432</p>
             */
            public Builder customerServiceId(String customerServiceId) {
                this.customerServiceId = customerServiceId;
                return this;
            }

            /**
             * <p>Agent type</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder customerServiceType(String customerServiceType) {
                this.customerServiceType = customerServiceType;
                return this;
            }

            /**
             * <p>End time of this utterance, in milliseconds relative to the start of the conversation</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * <p>Unique identifier for this utterance. Assigned internally</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Role</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Content type</p>
             * 
             * <strong>example:</strong>
             * <p>TEXT</p>
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
        @com.aliyun.core.annotation.NameInMap("bizType")
        private String bizType;

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
        private java.util.List<OriginDialogue> originDialogue;

        @com.aliyun.core.annotation.NameInMap("qualityGroupId")
        private String qualityGroupId;

        @com.aliyun.core.annotation.NameInMap("ruleDescription")
        private String ruleDescription;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("subNodeCol")
        private java.util.List<?> subNodeCol;

        private QualityCheckList(Builder builder) {
            this.bizType = builder.bizType;
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
            this.ruleType = builder.ruleType;
            this.subNodeCol = builder.subNodeCol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityCheckList create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
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
        public java.util.List<OriginDialogue> getOriginDialogue() {
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

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return subNodeCol
         */
        public java.util.List<?> getSubNodeCol() {
            return this.subNodeCol;
        }

        public static final class Builder {
            private String bizType; 
            private String checkExplanation; 
            private String checkPassed; 
            private String checkProcess; 
            private String checked; 
            private String gmtEnd; 
            private String gmtStart; 
            private String mode; 
            private java.util.List<OriginDialogue> originDialogue; 
            private String qualityGroupId; 
            private String ruleDescription; 
            private String ruleId; 
            private String ruleType; 
            private java.util.List<?> subNodeCol; 

            private Builder() {
            } 

            private Builder(QualityCheckList model) {
                this.bizType = model.bizType;
                this.checkExplanation = model.checkExplanation;
                this.checkPassed = model.checkPassed;
                this.checkProcess = model.checkProcess;
                this.checked = model.checked;
                this.gmtEnd = model.gmtEnd;
                this.gmtStart = model.gmtStart;
                this.mode = model.mode;
                this.originDialogue = model.originDialogue;
                this.qualityGroupId = model.qualityGroupId;
                this.ruleDescription = model.ruleDescription;
                this.ruleId = model.ruleId;
                this.ruleType = model.ruleType;
                this.subNodeCol = model.subNodeCol;
            } 

            /**
             * <p>Rule business type</p>
             * 
             * <strong>example:</strong>
             * <p>No</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>Reason for passing or failing the quality check</p>
             * 
             * <strong>example:</strong>
             * <p>暂无</p>
             */
            public Builder checkExplanation(String checkExplanation) {
                this.checkExplanation = checkExplanation;
                return this;
            }

            /**
             * <p>Whether the quality check passed</p>
             * 
             * <strong>example:</strong>
             * <p>PASSED</p>
             */
            public Builder checkPassed(String checkPassed) {
                this.checkPassed = checkPassed;
                return this;
            }

            /**
             * <p>Description of the quality check process</p>
             * 
             * <strong>example:</strong>
             * <p>暂无</p>
             */
            public Builder checkProcess(String checkProcess) {
                this.checkProcess = checkProcess;
                return this;
            }

            /**
             * <p>Whether the rule matched</p>
             * 
             * <strong>example:</strong>
             * <p>HIT</p>
             */
            public Builder checked(String checked) {
                this.checked = checked;
                return this;
            }

            /**
             * <p>Quality check completion time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-23 14:57:50</p>
             */
            public Builder gmtEnd(String gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * <p>Quality check start time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-23 14:57:50</p>
             */
            public Builder gmtStart(String gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * <p>Internal quality check mode</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>Original dialogue list</p>
             */
            public Builder originDialogue(java.util.List<OriginDialogue> originDialogue) {
                this.originDialogue = originDialogue;
                return this;
            }

            /**
             * <p>Quality check group ID</p>
             * 
             * <strong>example:</strong>
             * <p>warning_customers</p>
             */
            public Builder qualityGroupId(String qualityGroupId) {
                this.qualityGroupId = qualityGroupId;
                return this;
            }

            /**
             * <p>Quality check item description</p>
             * 
             * <strong>example:</strong>
             * <p>进入检测预警客户流程</p>
             */
            public Builder ruleDescription(String ruleDescription) {
                this.ruleDescription = ruleDescription;
                return this;
            }

            /**
             * <p>Quality check item ID</p>
             * 
             * <strong>example:</strong>
             * <p>wcm_start</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>Rule direction. 0: negative, 1: positive</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>Child node</p>
             */
            public Builder subNodeCol(java.util.List<?> subNodeCol) {
                this.subNodeCol = subNodeCol;
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
        private java.util.List<QualityCheckList> qualityCheckList;

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
        public java.util.List<QualityCheckList> getQualityCheckList() {
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
            private java.util.List<QualityCheckList> qualityCheckList; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.conversationList = model.conversationList;
                this.gmtCreate = model.gmtCreate;
                this.gmtEnd = model.gmtEnd;
                this.gmtStart = model.gmtStart;
                this.qualityCheckList = model.qualityCheckList;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>Original conversation content</p>
             */
            public Builder conversationList(ConversationList conversationList) {
                this.conversationList = conversationList;
                return this;
            }

            /**
             * <p>Task creation time. This is when the task was submitted</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-27 11:23:20</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>System execution end time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-27 11:23:20</p>
             */
            public Builder gmtEnd(String gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * <p>System execution start time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-27 11:23:20</p>
             */
            public Builder gmtStart(String gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * <p>Quality check result set</p>
             */
            public Builder qualityCheckList(java.util.List<QualityCheckList> qualityCheckList) {
                this.qualityCheckList = qualityCheckList;
                return this;
            }

            /**
             * <p>Task status</p>
             * 
             * <strong>example:</strong>
             * <p>INIT</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Task ID</p>
             * 
             * <strong>example:</strong>
             * <p>1703557101831</p>
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
