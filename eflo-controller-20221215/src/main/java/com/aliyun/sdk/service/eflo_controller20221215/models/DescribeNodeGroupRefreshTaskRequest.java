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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
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
         * NodeStatuses.
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
