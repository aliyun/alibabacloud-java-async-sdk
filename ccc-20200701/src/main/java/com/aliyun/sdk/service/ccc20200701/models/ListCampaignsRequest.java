// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCampaignsRequest} extends {@link RequestModel}
 *
 * <p>ListCampaignsRequest</p>
 */
public class ListCampaignsRequest extends Request {
    @Query
    @NameInMap("ActualStartTimeFrom")
    private String actualStartTimeFrom;

    @Query
    @NameInMap("ActualStartTimeTo")
    private String actualStartTimeTo;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Query
    @NameInMap("PlanedStartTimeFrom")
    private String planedStartTimeFrom;

    @Query
    @NameInMap("PlanedStartTimeTo")
    private String planedStartTimeTo;

    @Query
    @NameInMap("QueueId")
    private String queueId;

    @Query
    @NameInMap("State")
    private String state;

    private ListCampaignsRequest(Builder builder) {
        super(builder);
        this.actualStartTimeFrom = builder.actualStartTimeFrom;
        this.actualStartTimeTo = builder.actualStartTimeTo;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.planedStartTimeFrom = builder.planedStartTimeFrom;
        this.planedStartTimeTo = builder.planedStartTimeTo;
        this.queueId = builder.queueId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCampaignsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actualStartTimeFrom
     */
    public String getActualStartTimeFrom() {
        return this.actualStartTimeFrom;
    }

    /**
     * @return actualStartTimeTo
     */
    public String getActualStartTimeTo() {
        return this.actualStartTimeTo;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return planedStartTimeFrom
     */
    public String getPlanedStartTimeFrom() {
        return this.planedStartTimeFrom;
    }

    /**
     * @return planedStartTimeTo
     */
    public String getPlanedStartTimeTo() {
        return this.planedStartTimeTo;
    }

    /**
     * @return queueId
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListCampaignsRequest, Builder> {
        private String actualStartTimeFrom; 
        private String actualStartTimeTo; 
        private String instanceId; 
        private String name; 
        private Long pageNumber; 
        private Long pageSize; 
        private String planedStartTimeFrom; 
        private String planedStartTimeTo; 
        private String queueId; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(ListCampaignsRequest request) {
            super(request);
            this.actualStartTimeFrom = request.actualStartTimeFrom;
            this.actualStartTimeTo = request.actualStartTimeTo;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.planedStartTimeFrom = request.planedStartTimeFrom;
            this.planedStartTimeTo = request.planedStartTimeTo;
            this.queueId = request.queueId;
            this.state = request.state;
        } 

        /**
         * ActualStartTimeFrom.
         */
        public Builder actualStartTimeFrom(String actualStartTimeFrom) {
            this.putQueryParameter("ActualStartTimeFrom", actualStartTimeFrom);
            this.actualStartTimeFrom = actualStartTimeFrom;
            return this;
        }

        /**
         * ActualStartTimeTo.
         */
        public Builder actualStartTimeTo(String actualStartTimeTo) {
            this.putQueryParameter("ActualStartTimeTo", actualStartTimeTo);
            this.actualStartTimeTo = actualStartTimeTo;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PlanedStartTimeFrom.
         */
        public Builder planedStartTimeFrom(String planedStartTimeFrom) {
            this.putQueryParameter("PlanedStartTimeFrom", planedStartTimeFrom);
            this.planedStartTimeFrom = planedStartTimeFrom;
            return this;
        }

        /**
         * PlanedStartTimeTo.
         */
        public Builder planedStartTimeTo(String planedStartTimeTo) {
            this.putQueryParameter("PlanedStartTimeTo", planedStartTimeTo);
            this.planedStartTimeTo = planedStartTimeTo;
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
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public ListCampaignsRequest build() {
            return new ListCampaignsRequest(this);
        } 

    } 

}
