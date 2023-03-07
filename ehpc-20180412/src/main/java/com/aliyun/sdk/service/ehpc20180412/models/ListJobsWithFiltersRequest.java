// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsWithFiltersRequest} extends {@link RequestModel}
 *
 * <p>ListJobsWithFiltersRequest</p>
 */
public class ListJobsWithFiltersRequest extends Request {
    @Query
    @NameInMap("Async")
    private Boolean async;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @Query
    @NameInMap("CreateTimeStart")
    private String createTimeStart;

    @Query
    @NameInMap("ExecuteOrder")
    private String executeOrder;

    @Query
    @NameInMap("JobName")
    private String jobName;

    @Query
    @NameInMap("JobStatus")
    private String jobStatus;

    @Query
    @NameInMap("Nodes")
    private java.util.List < String > nodes;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("PendOrder")
    private String pendOrder;

    @Query
    @NameInMap("Queues")
    private java.util.List < String > queues;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SubmitOrder")
    private String submitOrder;

    @Query
    @NameInMap("Users")
    private java.util.List < String > users;

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
    public java.util.List < String > getNodes() {
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
    public java.util.List < String > getQueues() {
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
    public java.util.List < String > getUsers() {
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
        private java.util.List < String > nodes; 
        private Long pageNumber; 
        private Long pageSize; 
        private String pendOrder; 
        private java.util.List < String > queues; 
        private String regionId; 
        private String submitOrder; 
        private java.util.List < String > users; 

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
         * Specifies whether to enable asynchronous query.
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * The ID of the cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The latest time when a job is submitted. The value is a UNIX timestamp, which represents the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * The earliest time when a job is submitted. The value is a UNIX timestamp, which represents the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * The order in which jobs are sorted based on the execution time. Valid values:
         * <p>
         * 
         * *   asc: ascending order
         * *   desc: descending order
         */
        public Builder executeOrder(String executeOrder) {
            this.putQueryParameter("ExecuteOrder", executeOrder);
            this.executeOrder = executeOrder;
            return this;
        }

        /**
         * The name of the job. Fuzzy match is supported.
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * The status of the job. Valid values:
         * <p>
         * 
         * *   all
         * *   finished
         * *   notfinish
         * 
         * Default value: all
         */
        public Builder jobStatus(String jobStatus) {
            this.putQueryParameter("JobStatus", jobStatus);
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * Nodes.
         */
        public Builder nodes(java.util.List < String > nodes) {
            this.putQueryParameter("Nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1.
         * 
         * Default value: 1
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 50.
         * <p>
         * 
         * Default value: 10
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The order in which jobs are sorted based on the time when they queue. Valid values:
         * <p>
         * 
         * *   asc: ascending order
         * *   desc: descending order
         */
        public Builder pendOrder(String pendOrder) {
            this.putQueryParameter("PendOrder", pendOrder);
            this.pendOrder = pendOrder;
            return this;
        }

        /**
         * Queues.
         */
        public Builder queues(java.util.List < String > queues) {
            this.putQueryParameter("Queues", queues);
            this.queues = queues;
            return this;
        }

        /**
         * The ID of the region.
         * <p>
         * 
         * You can call the [ListRegions](~~188593~~) operation to query the list of regions where E-HPC is supported.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The order in which jobs are sorted based on the time when they are submitted. Valid values:
         * <p>
         * 
         * *   asc: ascending order
         * *   desc: descending order
         */
        public Builder submitOrder(String submitOrder) {
            this.putQueryParameter("SubmitOrder", submitOrder);
            this.submitOrder = submitOrder;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(java.util.List < String > users) {
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
