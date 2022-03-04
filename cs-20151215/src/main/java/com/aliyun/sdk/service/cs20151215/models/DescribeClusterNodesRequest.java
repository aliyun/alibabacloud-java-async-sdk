// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterNodesRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterNodesRequest</p>
 */
public class DescribeClusterNodesRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("pageNumber")
    private String pageNumber;

    @Query
    @NameInMap("pageSize")
    private String pageSize;

    @Query
    @NameInMap("nodepool_id")
    private String nodepoolId;

    @Query
    @NameInMap("state")
    private String state;

    @Query
    @NameInMap("instanceIds")
    private String instanceIds;

    private DescribeClusterNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.nodepoolId = builder.nodepoolId;
        this.state = builder.state;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterNodesRequest create() {
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
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<DescribeClusterNodesRequest, Builder> {
        private String clusterId; 
        private String pageNumber; 
        private String pageSize; 
        private String nodepoolId; 
        private String state; 
        private String instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.nodepoolId = request.nodepoolId;
            this.state = request.state;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of records displayed on each page. Valid values: 1 to 100.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the node pool.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putQueryParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * The status of the cluster node. Valid values:
         * <p>
         * 
         * -"all": cluster nodes in the following four states.
         * -"running": the running cluster node.
         * -"removing": the cluster node that is being deleted.
         * -"initial": the cluster node that is being initialized.
         * -"failed": the cluster node fails to be created.
         * 
         * Default value: "all ".
         */
        public Builder state(String state) {
            this.putQueryParameter("state", state);
            this.state = state;
            return this;
        }

        /**
         * The list of node instance ids. Separate multiple node ids with commas (,).
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("instanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public DescribeClusterNodesRequest build() {
            return new DescribeClusterNodesRequest(this);
        } 

    } 

}
