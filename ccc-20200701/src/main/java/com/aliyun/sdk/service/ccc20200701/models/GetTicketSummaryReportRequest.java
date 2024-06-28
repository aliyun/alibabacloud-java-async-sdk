// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTicketSummaryReportRequest} extends {@link RequestModel}
 *
 * <p>GetTicketSummaryReportRequest</p>
 */
public class GetTicketSummaryReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Assignee")
    private String assignee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssigneeType")
    private String assigneeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private String categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Participant")
    private String participant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private GetTicketSummaryReportRequest(Builder builder) {
        super(builder);
        this.assignee = builder.assignee;
        this.assigneeType = builder.assigneeType;
        this.categoryId = builder.categoryId;
        this.creator = builder.creator;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.participant = builder.participant;
        this.startTime = builder.startTime;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTicketSummaryReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assignee
     */
    public String getAssignee() {
        return this.assignee;
    }

    /**
     * @return assigneeType
     */
    public String getAssigneeType() {
        return this.assigneeType;
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
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
     * @return participant
     */
    public String getParticipant() {
        return this.participant;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<GetTicketSummaryReportRequest, Builder> {
        private String assignee; 
        private String assigneeType; 
        private String categoryId; 
        private String creator; 
        private Long endTime; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String participant; 
        private Long startTime; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(GetTicketSummaryReportRequest request) {
            super(request);
            this.assignee = request.assignee;
            this.assigneeType = request.assigneeType;
            this.categoryId = request.categoryId;
            this.creator = request.creator;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.participant = request.participant;
            this.startTime = request.startTime;
            this.state = request.state;
        } 

        /**
         * Assignee.
         */
        public Builder assignee(String assignee) {
            this.putQueryParameter("Assignee", assignee);
            this.assignee = assignee;
            return this;
        }

        /**
         * AssigneeType.
         */
        public Builder assigneeType(String assigneeType) {
            this.putQueryParameter("AssigneeType", assigneeType);
            this.assigneeType = assigneeType;
            return this;
        }

        /**
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
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
         * Participant.
         */
        public Builder participant(String participant) {
            this.putQueryParameter("Participant", participant);
            this.participant = participant;
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

        /**
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public GetTicketSummaryReportRequest build() {
            return new GetTicketSummaryReportRequest(this);
        } 

    } 

}
