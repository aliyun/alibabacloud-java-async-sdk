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
 * {@link ListClusterNodesRequest} extends {@link RequestModel}
 *
 * <p>ListClusterNodesRequest</p>
 */
public class ListClusterNodesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    private ListClusterNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeGroupId = builder.nodeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterNodesRequest create() {
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
    public Long getMaxResults() {
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

    public static final class Builder extends Request.Builder<ListClusterNodesRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private Long maxResults; 
        private String nextToken; 
        private String nodeGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodeGroupId = request.nodeGroupId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i15b480fbd2fcdbc2869cd80</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * NodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putBodyParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        @Override
        public ListClusterNodesRequest build() {
            return new ListClusterNodesRequest(this);
        } 

    } 

}
