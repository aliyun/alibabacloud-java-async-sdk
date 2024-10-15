// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterNodesRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterNodesRequest</p>
 */
public class DescribeClusterNodesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nodepool_id")
    private String nodepoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("state")
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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The IDs of the nodes that you want to query. Separate multiple node IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;i-bp11xjhwkj8k966u****,i-bp1dmhc2bu5igkyq****&quot;</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("instanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The node pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>np****</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putQueryParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The node state that you want to use to filter nodes. Valid values:</p>
         * <ul>
         * <li><code>all</code>: query nodes in the following four states.</li>
         * <li><code>running</code>: query nodes in the running state.</li>
         * <li><code>removing</code>: query nodes that are being removed.</li>
         * <li><code>initial</code>: query nodes that are being initialized.</li>
         * <li><code>failed</code>: query nodes that fail to be created.</li>
         * </ul>
         * <p>Default value: <code>all</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
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
