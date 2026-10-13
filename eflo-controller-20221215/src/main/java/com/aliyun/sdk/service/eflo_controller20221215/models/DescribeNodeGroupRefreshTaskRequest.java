// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link DescribeNodeGroupRefreshTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeNodeGroupRefreshTaskRequest</p>
 */
public class DescribeNodeGroupRefreshTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeGroupRefreshTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupRefreshTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeStatuses")
    private java.util.List<String> nodeStatuses;

    private DescribeNodeGroupRefreshTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeGroupRefreshTaskId = builder.nodeGroupRefreshTaskId;
        this.nodeStatuses = builder.nodeStatuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeGroupRefreshTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nodeGroupRefreshTaskId
     */
    public String getNodeGroupRefreshTaskId() {
        return this.nodeGroupRefreshTaskId;
    }

    /**
     * @return nodeStatuses
     */
    public java.util.List<String> getNodeStatuses() {
        return this.nodeStatuses;
    }

    public static final class Builder extends Request.Builder<DescribeNodeGroupRefreshTaskRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 
        private String nextToken; 
        private String nodeGroupRefreshTaskId; 
        private java.util.List<String> nodeStatuses; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNodeGroupRefreshTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodeGroupRefreshTaskId = request.nodeGroupRefreshTaskId;
            this.nodeStatuses = request.nodeStatuses;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The maximum number of entries per page for a paged query. Valid values: 1 to 500. Default value: 100. For more information about paging, see the NextToken parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to the NextToken value returned in the previous call. You do not need to set this parameter for the first request. This parameter is used to paginate through the node list in the current refresh task.</p>
         * 
         * <strong>example:</strong>
         * <p>563d42ae0b17572449ec8c97f7f66069</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the node group configuration refresh task. After you call RefreshNodeGroupNodes to trigger a node group configuration refresh, obtain this value from the NodeGroupRefreshTaskId response parameter. Before you call this operation, the node group must contain nodes with configuration drift.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-159136551662516768776</p>
         */
        public Builder nodeGroupRefreshTaskId(String nodeGroupRefreshTaskId) {
            this.putBodyParameter("NodeGroupRefreshTaskId", nodeGroupRefreshTaskId);
            this.nodeGroupRefreshTaskId = nodeGroupRefreshTaskId;
            return this;
        }

        /**
         * <p>The node refresh statuses to filter by:</p>
         * <ul>
         * <li>Pending: the node is waiting to be refreshed.</li>
         * <li>InProgress: the node is being refreshed.</li>
         * <li>Success: the node is refreshed.</li>
         * <li>Failed: the node failed to be refreshed.</li>
         * <li>Skipped: all properties to be refreshed on the node exceeded the MaxDisruptiveAction constraint and were skipped.</li>
         * </ul>
         */
        public Builder nodeStatuses(java.util.List<String> nodeStatuses) {
            String nodeStatusesShrink = shrink(nodeStatuses, "NodeStatuses", "json");
            this.putBodyParameter("NodeStatuses", nodeStatusesShrink);
            this.nodeStatuses = nodeStatuses;
            return this;
        }

        @Override
        public DescribeNodeGroupRefreshTaskRequest build() {
            return new DescribeNodeGroupRefreshTaskRequest(this);
        } 

    } 

}
