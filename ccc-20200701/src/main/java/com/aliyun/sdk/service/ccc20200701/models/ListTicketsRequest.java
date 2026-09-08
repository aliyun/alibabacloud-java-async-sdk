// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListTicketsRequest} extends {@link RequestModel}
 *
 * <p>ListTicketsRequest</p>
 */
public class ListTicketsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("CustomerId")
    private String customerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIdList")
    private String jobIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Participant")
    private String participant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketId")
    private String ticketId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private ListTicketsRequest(Builder builder) {
        super(builder);
        this.assignee = builder.assignee;
        this.assigneeType = builder.assigneeType;
        this.categoryId = builder.categoryId;
        this.creator = builder.creator;
        this.customerId = builder.customerId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.jobIdList = builder.jobIdList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.participant = builder.participant;
        this.startTime = builder.startTime;
        this.state = builder.state;
        this.ticketId = builder.ticketId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTicketsRequest create() {
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
     * @return customerId
     */
    public String getCustomerId() {
        return this.customerId;
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
     * @return jobIdList
     */
    public String getJobIdList() {
        return this.jobIdList;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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

    /**
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<ListTicketsRequest, Builder> {
        private String assignee; 
        private String assigneeType; 
        private String categoryId; 
        private String creator; 
        private String customerId; 
        private Long endTime; 
        private String instanceId; 
        private String jobIdList; 
        private Long pageNumber; 
        private Long pageSize; 
        private String participant; 
        private Long startTime; 
        private String state; 
        private String ticketId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(ListTicketsRequest request) {
            super(request);
            this.assignee = request.assignee;
            this.assigneeType = request.assigneeType;
            this.categoryId = request.categoryId;
            this.creator = request.creator;
            this.customerId = request.customerId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.jobIdList = request.jobIdList;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.participant = request.participant;
            this.startTime = request.startTime;
            this.state = request.state;
            this.ticketId = request.ticketId;
            this.title = request.title;
        } 

        /**
         * <p>Assignee ID.</p>
         * 
         * <strong>example:</strong>
         * <p>assignee@cccV2-kmz</p>
         */
        public Builder assignee(String assignee) {
            this.putQueryParameter("Assignee", assignee);
            this.assignee = assignee;
            return this;
        }

        /**
         * <p>Assignee type.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent</p>
         */
        public Builder assigneeType(String assigneeType) {
            this.putQueryParameter("AssigneeType", assigneeType);
            this.assigneeType = assigneeType;
            return this;
        }

        /**
         * <p>Ticket category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>43c2671b-****-4223-86d0-6bd187905cc8</p>
         */
        public Builder categoryId(String categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>Creator.</p>
         * 
         * <strong>example:</strong>
         * <p>creator@cccV2-kmz</p>
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * <p>Customer ID. The Cloud Contact Center customer profile ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51e155ce-3747-*****-b402-13c69597b920</p>
         */
        public Builder customerId(String customerId) {
            this.putQueryParameter("CustomerId", customerId);
            this.customerId = customerId;
            return this;
        }

        /**
         * <p>End time. Filter by ticket creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1646928000000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Instance ID.</p>
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
         * <p>A list of contact IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;job-12******&quot;,&quot;job-23****&quot;]</p>
         */
        public Builder jobIdList(String jobIdList) {
            this.putQueryParameter("JobIdList", jobIdList);
            this.jobIdList = jobIdList;
            return this;
        }

        /**
         * <p>Paging ordinal number. Range: 1-100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Paging size. Range: 1-100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Participant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>participant@cccV2-kmz</p>
         */
        public Builder participant(String participant) {
            this.putQueryParameter("Participant", participant);
            this.participant = participant;
            return this;
        }

        /**
         * <p>Start time. Filter by ticket creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1646841600000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Ticket state.</p>
         * 
         * <strong>example:</strong>
         * <p>Processing</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>Ticket ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5491d3b4-14ee-4341-b5f1-db2c78beddeb</p>
         */
        public Builder ticketId(String ticketId) {
            this.putQueryParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        /**
         * <p>Ticket title.</p>
         * 
         * <strong>example:</strong>
         * <p>标题</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public ListTicketsRequest build() {
            return new ListTicketsRequest(this);
        } 

    } 

}
