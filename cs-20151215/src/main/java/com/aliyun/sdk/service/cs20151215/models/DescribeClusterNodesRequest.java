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
    @NameInMap("instanceIds")
    private String instanceIds;

    @Query
    @NameInMap("nodepool_id")
    private String nodepoolId;

    @Query
    @NameInMap("pageNumber")
    private String pageNumber;

    @Query
    @NameInMap("pageSize")
    private String pageSize;

    @Query
    @NameInMap("state")
    private String state;

    private DescribeClusterNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instanceIds = builder.instanceIds;
        this.nodepoolId = builder.nodepoolId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.state = builder.state;
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
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
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
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<DescribeClusterNodesRequest, Builder> {
        private String clusterId; 
        private String instanceIds; 
        private String nodepoolId; 
        private String pageNumber; 
        private String pageSize; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instanceIds = request.instanceIds;
            this.nodepoolId = request.nodepoolId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.state = request.state;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The IDs of the nodes that you want to query. Separate multiple node IDs with commas (,).
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("instanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The node pool ID.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putQueryParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
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
         * The number of entries per page. Valid values: 1 to 100.
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
         * The node state that you want to use to filter nodes. Valid values:
         * <p>
         * 
         * *   `all`: query nodes in the following four states.
         * *   `running`: query nodes in the running state.
         * *   `removing`: query nodes that are being removed.
         * *   `initial`: query nodes that are being initialized.
         * *   `failed`: query nodes that fail to be created.
         * 
         * Default value: `all`.
         */
        public Builder state(String state) {
            this.putQueryParameter("state", state);
            this.state = state;
            return this;
        }

        @Override
        public DescribeClusterNodesRequest build() {
            return new DescribeClusterNodesRequest(this);
        } 

    } 

}
