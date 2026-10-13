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
         * <p>Specifies whether to asynchronously obtain the query results.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder asyncQuery(Boolean asyncQuery) {
            this.putQueryParameter("AsyncQuery", asyncQuery);
            this.asyncQuery = asyncQuery;
            return this;
        }

        /**
         * <p>The end time to filter job groups by creation time. Use a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579965079000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
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
         * <p>The filter condition. Filters by job status. You can specify multiple statuses separated by commas. The logical OR operator is used. Valid values:</p>
         * <ul>
         * <li><strong>Draft</strong>: Draft.</li>
         * <li><strong>Scheduling</strong>: Scheduling.</li>
         * <li><strong>Executing</strong>: Executing.</li>
         * <li><strong>Completed</strong>: Completed.</li>
         * <li><strong>Paused</strong>: Paused.</li>
         * <li><strong>Failed</strong>: Failed.</li>
         * <li><strong>Cancelled</strong>: Cancelled.</li>
         * <li><strong>Initializing</strong>: Initializing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Draft</p>
         */
        public Builder jobGroupStatusFilter(String jobGroupStatusFilter) {
            this.putQueryParameter("JobGroupStatusFilter", jobGroupStatusFilter);
            this.jobGroupStatusFilter = jobGroupStatusFilter;
            return this;
        }

        /**
         * <p>Specifies whether to query tasks with a valid minimum concurrency guarantee.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder onlyMinConcurrencyEnabled(Boolean onlyMinConcurrencyEnabled) {
            this.putQueryParameter("OnlyMinConcurrencyEnabled", onlyMinConcurrencyEnabled);
            this.onlyMinConcurrencyEnabled = onlyMinConcurrencyEnabled;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The number of entries per page.</p>
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
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>Interview</p>
         */
        public Builder searchText(String searchText) {
            this.putQueryParameter("SearchText", searchText);
            this.searchText = searchText;
            return this;
        }

        /**
         * <p>The start time to filter job groups by creation time. Use a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1578965079000</p>
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
