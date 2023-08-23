// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAttemptsRequest} extends {@link RequestModel}
 *
 * <p>ListAttemptsRequest</p>
 */
public class ListAttemptsRequest extends Request {
    @Query
    @NameInMap("AgentId")
    private String agentId;

    @Query
    @NameInMap("AttemptId")
    private String attemptId;

    @Query
    @NameInMap("Callee")
    private String callee;

    @Query
    @NameInMap("Caller")
    private String caller;

    @Query
    @NameInMap("CampaignId")
    private String campaignId;

    @Query
    @NameInMap("CaseId")
    private String caseId;

    @Query
    @NameInMap("ContactId")
    private String contactId;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("QueueId")
    private String queueId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private ListAttemptsRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.attemptId = builder.attemptId;
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.campaignId = builder.campaignId;
        this.caseId = builder.caseId;
        this.contactId = builder.contactId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queueId = builder.queueId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAttemptsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return queueId
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListAttemptsRequest, Builder> {
        private String agentId; 
        private String attemptId; 
        private String callee; 
        private String caller; 
        private String campaignId; 
        private String caseId; 
        private String contactId; 
        private Long endTime; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queueId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAttemptsRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.attemptId = request.attemptId;
            this.callee = request.callee;
            this.caller = request.caller;
            this.campaignId = request.campaignId;
            this.caseId = request.caseId;
            this.contactId = request.contactId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queueId = request.queueId;
            this.startTime = request.startTime;
        } 

        /**
         * AgentId.
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * AttemptId.
         */
        public Builder attemptId(String attemptId) {
            this.putQueryParameter("AttemptId", attemptId);
            this.attemptId = attemptId;
            return this;
        }

        /**
         * Callee.
         */
        public Builder callee(String callee) {
            this.putQueryParameter("Callee", callee);
            this.callee = callee;
            return this;
        }

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * CampaignId.
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * CaseId.
         */
        public Builder caseId(String caseId) {
            this.putQueryParameter("CaseId", caseId);
            this.caseId = caseId;
            return this;
        }

        /**
         * ContactId.
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueueId.
         */
        public Builder queueId(String queueId) {
            this.putQueryParameter("QueueId", queueId);
            this.queueId = queueId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListAttemptsRequest build() {
            return new ListAttemptsRequest(this);
        } 

    } 

}
