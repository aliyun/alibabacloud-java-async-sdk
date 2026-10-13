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
 * {@link ListNodeGroupRefreshTasksRequest} extends {@link RequestModel}
 *
 * <p>ListNodeGroupRefreshTasksRequest</p>
 */
public class ListNodeGroupRefreshTasksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List<String> statuses;

    private ListNodeGroupRefreshTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeGroupId = builder.nodeGroupId;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeGroupRefreshTasksRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static final class Builder extends Request.Builder<ListNodeGroupRefreshTasksRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private Integer maxResults; 
        private String nextToken; 
        private String nodeGroupId; 
        private java.util.List<String> statuses; 

        private Builder() {
            super();
        } 

        private Builder(ListNodeGroupRefreshTasksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodeGroupId = request.nodeGroupId;
            this.statuses = request.statuses;
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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i118191731740041623425</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The maximum number of entries per page for paging. Valid values: 1 to 500. Default value: 100.</p>
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
         * <p>The pagination token. Set this parameter to the NextToken value returned in the previous call. You do not need to set this parameter for the first request.</p>
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
         * <p>The node group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-3525</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putBodyParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>The list of task statuses. Valid values:</p>
         * <ul>
         * <li>Pending: The refresh task is created and waiting to be executed.</li>
         * <li>InProgress: The refresh task is being processed.</li>
         * <li>Success: The refresh task is executed.</li>
         * <li>Failed: The refresh task failed.</li>
         * </ul>
         */
        public Builder statuses(java.util.List<String> statuses) {
            String statusesShrink = shrink(statuses, "Statuses", "json");
            this.putBodyParameter("Statuses", statusesShrink);
            this.statuses = statuses;
            return this;
        }

        @Override
        public ListNodeGroupRefreshTasksRequest build() {
            return new ListNodeGroupRefreshTasksRequest(this);
        } 

    } 

}
