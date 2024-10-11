// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAttemptsRequest} extends {@link RequestModel}
 *
 * <p>ListAttemptsRequest</p>
 */
public class ListAttemptsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttemptId")
    private String attemptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callee")
    private String callee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CampaignId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String campaignId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueId")
    private String queueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
        this.criteria = builder.criteria;
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
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
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
        private String criteria; 
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
            this.criteria = request.criteria;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6badb397-a8b5-40b6-21019d382a09</p>
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60ecb1a2-4480-4d01-bede-c5b7655bfadf</p>
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
         * Criteria.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
