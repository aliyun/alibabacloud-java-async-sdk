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
 * {@link ListNodeGroupDriftedNodesRequest} extends {@link RequestModel}
 *
 * <p>ListNodeGroupDriftedNodesRequest</p>
 */
public class ListNodeGroupDriftedNodesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    private ListNodeGroupDriftedNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeIds = builder.nodeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeGroupDriftedNodesRequest create() {
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
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeIds
     */
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public static final class Builder extends Request.Builder<ListNodeGroupDriftedNodesRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 
        private String nextToken; 
        private String nodeGroupId; 
        private java.util.List<String> nodeIds; 

        private Builder() {
            super();
        } 

        private Builder(ListNodeGroupDriftedNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodeGroupId = request.nodeGroupId;
            this.nodeIds = request.nodeIds;
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
         * <p>The maximum number of entries per page in a paging query. Valid values: 1 to 500. Default value: 100.</p>
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
         * <p>The node group ID. Call ListClusters to obtain the ClusterId, pass the ClusterId to ListNodeGroups, and obtain the value from the NodeGroupId response parameter.</p>
         * <p>This parameter is required.</p>
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
         * <p>Limits the check scope. If not specified, all nodes in the node group are checked. <warning>If the model is a super node, pass the TrayNode ID.</warning></p>
         */
        public Builder nodeIds(java.util.List<String> nodeIds) {
            String nodeIdsShrink = shrink(nodeIds, "NodeIds", "json");
            this.putBodyParameter("NodeIds", nodeIdsShrink);
            this.nodeIds = nodeIds;
            return this;
        }

        @Override
        public ListNodeGroupDriftedNodesRequest build() {
            return new ListNodeGroupDriftedNodesRequest(this);
        } 

    } 

}
