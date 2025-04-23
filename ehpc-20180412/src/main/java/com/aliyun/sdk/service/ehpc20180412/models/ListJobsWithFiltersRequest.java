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
 * {@link ListJobsWithFiltersRequest} extends {@link RequestModel}
 *
 * <p>ListJobsWithFiltersRequest</p>
 */
public class ListJobsWithFiltersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Async")
    private Boolean async;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeStart")
    private String createTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteOrder")
    private String executeOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobStatus")
    private String jobStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<String> nodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PendOrder")
    private String pendOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Queues")
    private java.util.List<String> queues;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubmitOrder")
    private String submitOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<String> users;

    private ListJobsWithFiltersRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.clusterId = builder.clusterId;
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.executeOrder = builder.executeOrder;
        this.jobName = builder.jobName;
        this.jobStatus = builder.jobStatus;
        this.nodes = builder.nodes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pendOrder = builder.pendOrder;
        this.queues = builder.queues;
        this.regionId = builder.regionId;
        this.submitOrder = builder.submitOrder;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsWithFiltersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    /**
     * @return executeOrder
     */
    public String getExecuteOrder() {
        return this.executeOrder;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @return nodes
     */
    public java.util.List<String> getNodes() {
        return this.nodes;
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
     * @return pendOrder
     */
    public String getPendOrder() {
        return this.pendOrder;
    }

    /**
     * @return queues
     */
    public java.util.List<String> getQueues() {
        return this.queues;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return submitOrder
     */
    public String getSubmitOrder() {
        return this.submitOrder;
    }

    /**
     * @return users
     */
    public java.util.List<String> getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<ListJobsWithFiltersRequest, Builder> {
        private Boolean async; 
        private String clusterId; 
        private String createTimeEnd; 
        private String createTimeStart; 
        private String executeOrder; 
        private String jobName; 
        private String jobStatus; 
        private java.util.List<String> nodes; 
        private Long pageNumber; 
        private Long pageSize; 
        private String pendOrder; 
        private java.util.List<String> queues; 
        private String regionId; 
        private String submitOrder; 
        private java.util.List<String> users; 

        private Builder() {
            super();
        } 

        private Builder(ListJobsWithFiltersRequest request) {
            super(request);
            this.async = request.async;
            this.clusterId = request.clusterId;
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.executeOrder = request.executeOrder;
            this.jobName = request.jobName;
            this.jobStatus = request.jobStatus;
            this.nodes = request.nodes;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pendOrder = request.pendOrder;
            this.queues = request.queues;
            this.regionId = request.regionId;
            this.submitOrder = request.submitOrder;
            this.users = request.users;
        } 

        /**
         * <p>Specifies whether to enable asynchronous query.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
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
         * <p>The latest time when a job is submitted. The value is a UNIX timestamp, which represents the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1647428667</p>
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * <p>The earliest time when a job is submitted. The value is a UNIX timestamp, which represents the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1647427667</p>
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * <p>The order in which jobs are sorted based on the execution time. Valid values:</p>
         * <ul>
         * <li>asc: ascending order</li>
         * <li>desc: descending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder executeOrder(String executeOrder) {
            this.putQueryParameter("ExecuteOrder", executeOrder);
            this.executeOrder = executeOrder;
            return this;
        }

        /**
         * <p>The name of the job. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>job1</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li>all</li>
         * <li>finished</li>
         * <li>notfinish</li>
         * </ul>
         * <p>Default value: all.</p>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
         */
        public Builder jobStatus(String jobStatus) {
            this.putQueryParameter("JobStatus", jobStatus);
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * <p>The information about the computing nodes that are used to run the job.</p>
         */
        public Builder nodes(java.util.List<String> nodes) {
            this.putQueryParameter("Nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The page number to return.</p>
         * <p>Pages start from 1.</p>
         * <p>Default value: 1.</p>
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
         * <p>The number of entries per page. Maximum value: 50.</p>
         * <p>Default value: 10.</p>
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
         * <p>The order in which jobs are sorted based on the time when they queue. Valid values:</p>
         * <ul>
         * <li>asc: ascending order</li>
         * <li>desc: descending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder pendOrder(String pendOrder) {
            this.putQueryParameter("PendOrder", pendOrder);
            this.pendOrder = pendOrder;
            return this;
        }

        /**
         * <p>The information about the queues in which the job is run.</p>
         */
        public Builder queues(java.util.List<String> queues) {
            this.putQueryParameter("Queues", queues);
            this.queues = queues;
            return this;
        }

        /**
         * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/188593.html">ListRegions</a> operation to query the list of regions where E-HPC is supported.</p>
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
         * <p>The order in which jobs are sorted based on the time when they are submitted. Valid values:</p>
         * <ul>
         * <li>asc: ascending order</li>
         * <li>desc: descending order</li>
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
         * <p>The users that run the job.</p>
         */
        public Builder users(java.util.List<String> users) {
            this.putQueryParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public ListJobsWithFiltersRequest build() {
            return new ListJobsWithFiltersRequest(this);
        } 

    } 

}
