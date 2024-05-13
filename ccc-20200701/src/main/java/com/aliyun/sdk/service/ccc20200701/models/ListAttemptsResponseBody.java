// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAttemptsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAttemptsResponseBody</p>
 */
public class ListAttemptsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAttemptsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAttemptsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAttemptsResponseBody build() {
            return new ListAttemptsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentEstablishedTime")
        private Long agentEstablishedTime;

        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentRingDuration")
        private Long agentRingDuration;

        @com.aliyun.core.annotation.NameInMap("AssignAgentTime")
        private Long assignAgentTime;

        @com.aliyun.core.annotation.NameInMap("AttemptId")
        private String attemptId;

        @com.aliyun.core.annotation.NameInMap("Callee")
        private String callee;

        @com.aliyun.core.annotation.NameInMap("Caller")
        private String caller;

        @com.aliyun.core.annotation.NameInMap("CampaignId")
        private String campaignId;

        @com.aliyun.core.annotation.NameInMap("CaseId")
        private String caseId;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("CustomerEstablishedTime")
        private Long customerEstablishedTime;

        @com.aliyun.core.annotation.NameInMap("CustomerReleasedTime")
        private Long customerReleasedTime;

        @com.aliyun.core.annotation.NameInMap("DialDuration")
        private Long dialDuration;

        @com.aliyun.core.annotation.NameInMap("DialTime")
        private Long dialTime;

        @com.aliyun.core.annotation.NameInMap("EnqueueTime")
        private Long enqueueTime;

        @com.aliyun.core.annotation.NameInMap("EnterIvrTime")
        private Long enterIvrTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IvrDuration")
        private Long ivrDuration;

        @com.aliyun.core.annotation.NameInMap("QueueDuration")
        private Long queueDuration;

        @com.aliyun.core.annotation.NameInMap("QueueId")
        private String queueId;

        private List(Builder builder) {
            this.agentEstablishedTime = builder.agentEstablishedTime;
            this.agentId = builder.agentId;
            this.agentRingDuration = builder.agentRingDuration;
            this.assignAgentTime = builder.assignAgentTime;
            this.attemptId = builder.attemptId;
            this.callee = builder.callee;
            this.caller = builder.caller;
            this.campaignId = builder.campaignId;
            this.caseId = builder.caseId;
            this.contactId = builder.contactId;
            this.customerEstablishedTime = builder.customerEstablishedTime;
            this.customerReleasedTime = builder.customerReleasedTime;
            this.dialDuration = builder.dialDuration;
            this.dialTime = builder.dialTime;
            this.enqueueTime = builder.enqueueTime;
            this.enterIvrTime = builder.enterIvrTime;
            this.instanceId = builder.instanceId;
            this.ivrDuration = builder.ivrDuration;
            this.queueDuration = builder.queueDuration;
            this.queueId = builder.queueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return agentEstablishedTime
         */
        public Long getAgentEstablishedTime() {
            return this.agentEstablishedTime;
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentRingDuration
         */
        public Long getAgentRingDuration() {
            return this.agentRingDuration;
        }

        /**
         * @return assignAgentTime
         */
        public Long getAssignAgentTime() {
            return this.assignAgentTime;
        }

        /**
         * @return attemptId
         */
        public String getAttemptId() {
            return this.attemptId;
        }

        /**
         * @return callee
         */
        public String getCallee() {
            return this.callee;
        }

        /**
         * @return caller
         */
        public String getCaller() {
            return this.caller;
        }

        /**
         * @return campaignId
         */
        public String getCampaignId() {
            return this.campaignId;
        }

        /**
         * @return caseId
         */
        public String getCaseId() {
            return this.caseId;
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return customerEstablishedTime
         */
        public Long getCustomerEstablishedTime() {
            return this.customerEstablishedTime;
        }

        /**
         * @return customerReleasedTime
         */
        public Long getCustomerReleasedTime() {
            return this.customerReleasedTime;
        }

        /**
         * @return dialDuration
         */
        public Long getDialDuration() {
            return this.dialDuration;
        }

        /**
         * @return dialTime
         */
        public Long getDialTime() {
            return this.dialTime;
        }

        /**
         * @return enqueueTime
         */
        public Long getEnqueueTime() {
            return this.enqueueTime;
        }

        /**
         * @return enterIvrTime
         */
        public Long getEnterIvrTime() {
            return this.enterIvrTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ivrDuration
         */
        public Long getIvrDuration() {
            return this.ivrDuration;
        }

        /**
         * @return queueDuration
         */
        public Long getQueueDuration() {
            return this.queueDuration;
        }

        /**
         * @return queueId
         */
        public String getQueueId() {
            return this.queueId;
        }

        public static final class Builder {
            private Long agentEstablishedTime; 
            private String agentId; 
            private Long agentRingDuration; 
            private Long assignAgentTime; 
            private String attemptId; 
            private String callee; 
            private String caller; 
            private String campaignId; 
            private String caseId; 
            private String contactId; 
            private Long customerEstablishedTime; 
            private Long customerReleasedTime; 
            private Long dialDuration; 
            private Long dialTime; 
            private Long enqueueTime; 
            private Long enterIvrTime; 
            private String instanceId; 
            private Long ivrDuration; 
            private Long queueDuration; 
            private String queueId; 

            /**
             * AgentEstablishedTime.
             */
            public Builder agentEstablishedTime(Long agentEstablishedTime) {
                this.agentEstablishedTime = agentEstablishedTime;
                return this;
            }

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentRingDuration.
             */
            public Builder agentRingDuration(Long agentRingDuration) {
                this.agentRingDuration = agentRingDuration;
                return this;
            }

            /**
             * AssignAgentTime.
             */
            public Builder assignAgentTime(Long assignAgentTime) {
                this.assignAgentTime = assignAgentTime;
                return this;
            }

            /**
             * AttemptId.
             */
            public Builder attemptId(String attemptId) {
                this.attemptId = attemptId;
                return this;
            }

            /**
             * Callee.
             */
            public Builder callee(String callee) {
                this.callee = callee;
                return this;
            }

            /**
             * Caller.
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * CampaignId.
             */
            public Builder campaignId(String campaignId) {
                this.campaignId = campaignId;
                return this;
            }

            /**
             * CaseId.
             */
            public Builder caseId(String caseId) {
                this.caseId = caseId;
                return this;
            }

            /**
             * ContactId.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * CustomerEstablishedTime.
             */
            public Builder customerEstablishedTime(Long customerEstablishedTime) {
                this.customerEstablishedTime = customerEstablishedTime;
                return this;
            }

            /**
             * CustomerReleasedTime.
             */
            public Builder customerReleasedTime(Long customerReleasedTime) {
                this.customerReleasedTime = customerReleasedTime;
                return this;
            }

            /**
             * DialDuration.
             */
            public Builder dialDuration(Long dialDuration) {
                this.dialDuration = dialDuration;
                return this;
            }

            /**
             * DialTime.
             */
            public Builder dialTime(Long dialTime) {
                this.dialTime = dialTime;
                return this;
            }

            /**
             * EnqueueTime.
             */
            public Builder enqueueTime(Long enqueueTime) {
                this.enqueueTime = enqueueTime;
                return this;
            }

            /**
             * EnterIvrTime.
             */
            public Builder enterIvrTime(Long enterIvrTime) {
                this.enterIvrTime = enterIvrTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IvrDuration.
             */
            public Builder ivrDuration(Long ivrDuration) {
                this.ivrDuration = ivrDuration;
                return this;
            }

            /**
             * QueueDuration.
             */
            public Builder queueDuration(Long queueDuration) {
                this.queueDuration = queueDuration;
                return this;
            }

            /**
             * QueueId.
             */
            public Builder queueId(String queueId) {
                this.queueId = queueId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
