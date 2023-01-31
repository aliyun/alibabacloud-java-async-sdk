// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListJobGroupsRequest</p>
 */
public class ListJobGroupsRequest extends Request {
    @Query
    @NameInMap("AsyncQuery")
    private Boolean asyncQuery;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobGroupStatusFilter")
    private String jobGroupStatusFilter;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 1000)
    private Integer pageSize;

    @Query
    @NameInMap("SearchText")
    private String searchText;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private ListJobGroupsRequest(Builder builder) {
        super(builder);
        this.asyncQuery = builder.asyncQuery;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.jobGroupStatusFilter = builder.jobGroupStatusFilter;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchText = builder.searchText;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncQuery
     */
    public Boolean getAsyncQuery() {
        return this.asyncQuery;
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
     * @return jobGroupStatusFilter
     */
    public String getJobGroupStatusFilter() {
        return this.jobGroupStatusFilter;
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
     * @return searchText
     */
    public String getSearchText() {
        return this.searchText;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListJobGroupsRequest, Builder> {
        private Boolean asyncQuery; 
        private Long endTime; 
        private String instanceId; 
        private String jobGroupStatusFilter; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchText; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListJobGroupsRequest request) {
            super(request);
            this.asyncQuery = request.asyncQuery;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.jobGroupStatusFilter = request.jobGroupStatusFilter;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchText = request.searchText;
            this.startTime = request.startTime;
        } 

        /**
         * AsyncQuery.
         */
        public Builder asyncQuery(Boolean asyncQuery) {
            this.putQueryParameter("AsyncQuery", asyncQuery);
            this.asyncQuery = asyncQuery;
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
         * JobGroupStatusFilter.
         */
        public Builder jobGroupStatusFilter(String jobGroupStatusFilter) {
            this.putQueryParameter("JobGroupStatusFilter", jobGroupStatusFilter);
            this.jobGroupStatusFilter = jobGroupStatusFilter;
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
         * SearchText.
         */
        public Builder searchText(String searchText) {
            this.putQueryParameter("SearchText", searchText);
            this.searchText = searchText;
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
        public ListJobGroupsRequest build() {
            return new ListJobGroupsRequest(this);
        } 

    } 

}
