// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApmApplicationRequest} extends {@link RequestModel}
 *
 * <p>ListApmApplicationRequest</p>
 */
public class ListApmApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("DiagnoseResult")
    private String diagnoseResult;

    @Query
    @NameInMap("EndTimeFrom")
    private Long endTimeFrom;

    @Query
    @NameInMap("EndTimeTo")
    private Long endTimeTo;

    @Query
    @NameInMap("FinalStatus")
    private String finalStatus;

    @Query
    @NameInMap("JobType")
    private String jobType;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Queue")
    private String queue;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("StartTimeFrom")
    @Validation(required = true)
    private Long startTimeFrom;

    @Query
    @NameInMap("StartTimeTo")
    @Validation(required = true)
    private Long startTimeTo;

    @Query
    @NameInMap("State")
    private String state;

    @Query
    @NameInMap("User")
    private String user;

    private ListApmApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clusterId = builder.clusterId;
        this.diagnoseResult = builder.diagnoseResult;
        this.endTimeFrom = builder.endTimeFrom;
        this.endTimeTo = builder.endTimeTo;
        this.finalStatus = builder.finalStatus;
        this.jobType = builder.jobType;
        this.name = builder.name;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queue = builder.queue;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTimeFrom = builder.startTimeFrom;
        this.startTimeTo = builder.startTimeTo;
        this.state = builder.state;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApmApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return diagnoseResult
     */
    public String getDiagnoseResult() {
        return this.diagnoseResult;
    }

    /**
     * @return endTimeFrom
     */
    public Long getEndTimeFrom() {
        return this.endTimeFrom;
    }

    /**
     * @return endTimeTo
     */
    public Long getEndTimeTo() {
        return this.endTimeTo;
    }

    /**
     * @return finalStatus
     */
    public String getFinalStatus() {
        return this.finalStatus;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
     * @return queue
     */
    public String getQueue() {
        return this.queue;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return startTimeFrom
     */
    public Long getStartTimeFrom() {
        return this.startTimeFrom;
    }

    /**
     * @return startTimeTo
     */
    public Long getStartTimeTo() {
        return this.startTimeTo;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<ListApmApplicationRequest, Builder> {
        private String appId; 
        private String clusterId; 
        private String diagnoseResult; 
        private Long endTimeFrom; 
        private Long endTimeTo; 
        private String finalStatus; 
        private String jobType; 
        private String name; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queue; 
        private String regionId; 
        private Long resourceOwnerId; 
        private Long startTimeFrom; 
        private Long startTimeTo; 
        private String state; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(ListApmApplicationRequest response) {
            super(response);
            this.appId = response.appId;
            this.clusterId = response.clusterId;
            this.diagnoseResult = response.diagnoseResult;
            this.endTimeFrom = response.endTimeFrom;
            this.endTimeTo = response.endTimeTo;
            this.finalStatus = response.finalStatus;
            this.jobType = response.jobType;
            this.name = response.name;
            this.orderBy = response.orderBy;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.queue = response.queue;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.startTimeFrom = response.startTimeFrom;
            this.startTimeTo = response.startTimeTo;
            this.state = response.state;
            this.user = response.user;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DiagnoseResult.
         */
        public Builder diagnoseResult(String diagnoseResult) {
            this.putQueryParameter("DiagnoseResult", diagnoseResult);
            this.diagnoseResult = diagnoseResult;
            return this;
        }

        /**
         * EndTimeFrom.
         */
        public Builder endTimeFrom(Long endTimeFrom) {
            this.putQueryParameter("EndTimeFrom", endTimeFrom);
            this.endTimeFrom = endTimeFrom;
            return this;
        }

        /**
         * EndTimeTo.
         */
        public Builder endTimeTo(Long endTimeTo) {
            this.putQueryParameter("EndTimeTo", endTimeTo);
            this.endTimeTo = endTimeTo;
            return this;
        }

        /**
         * FinalStatus.
         */
        public Builder finalStatus(String finalStatus) {
            this.putQueryParameter("FinalStatus", finalStatus);
            this.finalStatus = finalStatus;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
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
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
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
         * Queue.
         */
        public Builder queue(String queue) {
            this.putQueryParameter("Queue", queue);
            this.queue = queue;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * StartTimeFrom.
         */
        public Builder startTimeFrom(Long startTimeFrom) {
            this.putQueryParameter("StartTimeFrom", startTimeFrom);
            this.startTimeFrom = startTimeFrom;
            return this;
        }

        /**
         * StartTimeTo.
         */
        public Builder startTimeTo(Long startTimeTo) {
            this.putQueryParameter("StartTimeTo", startTimeTo);
            this.startTimeTo = startTimeTo;
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

        /**
         * User.
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public ListApmApplicationRequest build() {
            return new ListApmApplicationRequest(this);
        } 

    } 

}
