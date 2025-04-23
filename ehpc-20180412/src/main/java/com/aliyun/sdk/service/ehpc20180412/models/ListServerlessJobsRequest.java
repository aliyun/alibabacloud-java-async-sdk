// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListServerlessJobsRequest} extends {@link RequestModel}
 *
 * <p>ListServerlessJobsRequest</p>
 */
public class ListServerlessJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    private java.util.List<String> jobIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobNames")
    private java.util.List<String> jobNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartOrder")
    private String startOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubmitOrder")
    private String submitOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubmitTimeEnd")
    private String submitTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubmitTimeStart")
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
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

    /**
     * @return jobNames
     */
    public java.util.List<String> getJobNames() {
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
        private java.util.List<String> jobIds; 
        private java.util.List<String> jobNames; 
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
         * <p>The ID of the E-HPC cluster.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The list of serverless job IDs or subtask IDs (array jobs).</p>
         */
        public Builder jobIds(java.util.List<String> jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * <p>The names of the serverless jobs.</p>
         */
        public Builder jobNames(java.util.List<String> jobNames) {
            this.putQueryParameter("JobNames", jobNames);
            this.jobNames = jobNames;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Maximum value: 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/188593.html">ListRegions</a> operation to query the list of regions where E-HPC is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to sort the serverless jobs by the job start time. Valid values:</p>
         * <ul>
         * <li>Asc: ascending order.</li>
         * <li>Desc: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Asc</p>
         */
        public Builder startOrder(String startOrder) {
            this.putQueryParameter("StartOrder", startOrder);
            this.startOrder = startOrder;
            return this;
        }

        /**
         * <p>The status of the serverless job. Valid values:</p>
         * <ul>
         * <li>All</li>
         * <li>Pending</li>
         * <li>Running</li>
         * <li>Succeeded</li>
         * <li>Canceled</li>
         * <li>Failed</li>
         * </ul>
         * <p>Default value: All.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>Specifies whether to sort the serverless jobs by the job submission time. Valid values:</p>
         * <ul>
         * <li>Asc: ascending order.</li>
         * <li>Desc: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder submitOrder(String submitOrder) {
            this.putQueryParameter("SubmitOrder", submitOrder);
            this.submitOrder = submitOrder;
            return this;
        }

        /**
         * <p>The latest time at which the job is submitted.</p>
         * <blockquote>
         * <p> You can use this parameter to query the job list based on the job submission time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1659521430</p>
         */
        public Builder submitTimeEnd(String submitTimeEnd) {
            this.putQueryParameter("SubmitTimeEnd", submitTimeEnd);
            this.submitTimeEnd = submitTimeEnd;
            return this;
        }

        /**
         * <p>The earliest time at which the job is submitted.</p>
         * <blockquote>
         * <p> You can use this parameter to query the job list based on the job submission time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1647427667</p>
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
