// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListNodesRequest} extends {@link RequestModel}
 *
 * <p>ListNodesRequest</p>
 */
public class ListNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupIds")
    private java.util.List < String > nodeGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List < String > nodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeNames")
    private java.util.List < String > nodeNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeStates")
    private java.util.List < String > nodeStates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIps")
    private java.util.List < String > privateIps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIps")
    private java.util.List < String > publicIps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tag > tags;

    private ListNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeGroupIds = builder.nodeGroupIds;
        this.nodeIds = builder.nodeIds;
        this.nodeNames = builder.nodeNames;
        this.nodeStates = builder.nodeStates;
        this.privateIps = builder.privateIps;
        this.publicIps = builder.publicIps;
        this.regionId = builder.regionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesRequest create() {
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
     * @return nodeGroupIds
     */
    public java.util.List < String > getNodeGroupIds() {
        return this.nodeGroupIds;
    }

    /**
     * @return nodeIds
     */
    public java.util.List < String > getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return nodeNames
     */
    public java.util.List < String > getNodeNames() {
        return this.nodeNames;
    }

    /**
     * @return nodeStates
     */
    public java.util.List < String > getNodeStates() {
        return this.nodeStates;
    }

    /**
     * @return privateIps
     */
    public java.util.List < String > getPrivateIps() {
        return this.privateIps;
    }

    /**
     * @return publicIps
     */
    public java.util.List < String > getPublicIps() {
        return this.publicIps;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tag > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListNodesRequest, Builder> {
        private String clusterId; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > nodeGroupIds; 
        private java.util.List < String > nodeIds; 
        private java.util.List < String > nodeNames; 
        private java.util.List < String > nodeStates; 
        private java.util.List < String > privateIps; 
        private java.util.List < String > publicIps; 
        private String regionId; 
        private java.util.List < Tag > tags; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodeGroupIds = request.nodeGroupIds;
            this.nodeIds = request.nodeIds;
            this.nodeNames = request.nodeNames;
            this.nodeStates = request.nodeStates;
            this.privateIps = request.privateIps;
            this.publicIps = request.publicIps;
            this.regionId = request.regionId;
            this.tags = request.tags;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The number of maximum number of records to obtain at a time. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Marks the current position where reading starts. If you set this value to null, you can start from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The IDs of node groups.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nodeGroupIds(java.util.List < String > nodeGroupIds) {
            this.putQueryParameter("NodeGroupIds", nodeGroupIds);
            this.nodeGroupIds = nodeGroupIds;
            return this;
        }

        /**
         * <p>An array that consists of information about the ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder nodeIds(java.util.List < String > nodeIds) {
            this.putQueryParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * <p>The names of the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder nodeNames(java.util.List < String > nodeNames) {
            this.putQueryParameter("NodeNames", nodeNames);
            this.nodeNames = nodeNames;
            return this;
        }

        /**
         * <p>The status of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;CREATED&quot;]</p>
         */
        public Builder nodeStates(java.util.List < String > nodeStates) {
            this.putQueryParameter("NodeStates", nodeStates);
            this.nodeStates = nodeStates;
            return this;
        }

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;172.12.0.91&quot;]</p>
         */
        public Builder privateIps(java.util.List < String > privateIps) {
            this.putQueryParameter("PrivateIps", privateIps);
            this.privateIps = privateIps;
            return this;
        }

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;120.13.14.38&quot;]</p>
         */
        public Builder publicIps(java.util.List < String > publicIps) {
            this.putQueryParameter("PublicIps", publicIps);
            this.publicIps = publicIps;
            return this;
        }

        /**
         * <p>The ID of the region in which you want to create the instance.</p>
         * <p>This parameter is required.</p>
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
         * <p>The list of tags to be bound.</p>
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListNodesRequest build() {
            return new ListNodesRequest(this);
        } 

    } 

}
