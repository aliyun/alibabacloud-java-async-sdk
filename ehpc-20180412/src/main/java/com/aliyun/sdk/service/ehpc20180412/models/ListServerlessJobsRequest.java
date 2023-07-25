// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerlessJobsRequest} extends {@link RequestModel}
 *
 * <p>ListServerlessJobsRequest</p>
 */
public class ListServerlessJobsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("JobIds")
    private java.util.List < String > jobIds;

    @Query
    @NameInMap("JobNames")
    private java.util.List < String > jobNames;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartOrder")
    private String startOrder;

    @Query
    @NameInMap("State")
    private String state;

    @Query
    @NameInMap("SubmitOrder")
    private String submitOrder;

    @Query
    @NameInMap("SubmitTimeEnd")
    private String submitTimeEnd;

    @Query
    @NameInMap("SubmitTimeStart")
    private String submitTimeStart;

    private ListServerlessJobsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.jobIds = builder.jobIds;
        this.jobNames = builder.jobNames;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.startOrder = builder.startOrder;
        this.state = builder.state;
        this.submitOrder = builder.submitOrder;
        this.submitTimeEnd = builder.submitTimeEnd;
        this.submitTimeStart = builder.submitTimeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerlessJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return jobIds
     */
    public java.util.List < String > getJobIds() {
        return this.jobIds;
    }

    /**
     * @return jobNames
     */
    public java.util.List < String > getJobNames() {
        return this.jobNames;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startOrder
     */
    public String getStartOrder() {
        return this.startOrder;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return submitOrder
     */
    public String getSubmitOrder() {
        return this.submitOrder;
    }

    /**
     * @return submitTimeEnd
     */
    public String getSubmitTimeEnd() {
        return this.submitTimeEnd;
    }

    /**
     * @return submitTimeStart
     */
    public String getSubmitTimeStart() {
        return this.submitTimeStart;
    }

    public static final class Builder extends Request.Builder<ListServerlessJobsRequest, Builder> {
        private String clusterId; 
        private java.util.List < String > jobIds; 
        private java.util.List < String > jobNames; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String startOrder; 
        private String state; 
        private String submitOrder; 
        private String submitTimeEnd; 
        private String submitTimeStart; 

        private Builder() {
            super();
        } 

        private Builder(ListServerlessJobsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.jobIds = request.jobIds;
            this.jobNames = request.jobNames;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.startOrder = request.startOrder;
            this.state = request.state;
            this.submitOrder = request.submitOrder;
            this.submitTimeEnd = request.submitTimeEnd;
            this.submitTimeStart = request.submitTimeStart;
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
         * JobIds.
         */
        public Builder jobIds(java.util.List < String > jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * JobNames.
         */
        public Builder jobNames(java.util.List < String > jobNames) {
            this.putQueryParameter("JobNames", jobNames);
            this.jobNames = jobNames;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StartOrder.
         */
        public Builder startOrder(String startOrder) {
            this.putQueryParameter("StartOrder", startOrder);
            this.startOrder = startOrder;
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
         * SubmitOrder.
         */
        public Builder submitOrder(String submitOrder) {
            this.putQueryParameter("SubmitOrder", submitOrder);
            this.submitOrder = submitOrder;
            return this;
        }

        /**
         * SubmitTimeEnd.
         */
        public Builder submitTimeEnd(String submitTimeEnd) {
            this.putQueryParameter("SubmitTimeEnd", submitTimeEnd);
            this.submitTimeEnd = submitTimeEnd;
            return this;
        }

        /**
         * SubmitTimeStart.
         */
        public Builder submitTimeStart(String submitTimeStart) {
            this.putQueryParameter("SubmitTimeStart", submitTimeStart);
            this.submitTimeStart = submitTimeStart;
            return this;
        }

        @Override
        public ListServerlessJobsRequest build() {
            return new ListServerlessJobsRequest(this);
        } 

    } 

}
