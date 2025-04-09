// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListJobGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListJobGroupsRequest</p>
 */
public class ListJobGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsyncQuery")
    private Boolean asyncQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupStatusFilter")
    private String jobGroupStatusFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyMinConcurrencyEnabled")
    private Boolean onlyMinConcurrencyEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchText")
    private String searchText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private ListJobGroupsRequest(Builder builder) {
        super(builder);
        this.asyncQuery = builder.asyncQuery;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.jobGroupStatusFilter = builder.jobGroupStatusFilter;
        this.onlyMinConcurrencyEnabled = builder.onlyMinConcurrencyEnabled;
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
     * @return onlyMinConcurrencyEnabled
     */
    public Boolean getOnlyMinConcurrencyEnabled() {
        return this.onlyMinConcurrencyEnabled;
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
        private Boolean onlyMinConcurrencyEnabled; 
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
            this.onlyMinConcurrencyEnabled = request.onlyMinConcurrencyEnabled;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
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
         * OnlyMinConcurrencyEnabled.
         */
        public Builder onlyMinConcurrencyEnabled(Boolean onlyMinConcurrencyEnabled) {
            this.putQueryParameter("OnlyMinConcurrencyEnabled", onlyMinConcurrencyEnabled);
            this.onlyMinConcurrencyEnabled = onlyMinConcurrencyEnabled;
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
         * <p>10</p>
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
