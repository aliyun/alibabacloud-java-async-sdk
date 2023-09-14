// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesRequest} extends {@link RequestModel}
 *
 * <p>ListNodesRequest</p>
 */
public class ListNodesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("NodeGroupIds")
    private java.util.List < String > nodeGroupIds;

    @Query
    @NameInMap("NodeIds")
    private java.util.List < String > nodeIds;

    @Query
    @NameInMap("NodeNames")
    private java.util.List < String > nodeNames;

    @Query
    @NameInMap("NodeStates")
    private java.util.List < String > nodeStates;

    @Query
    @NameInMap("PrivateIps")
    private java.util.List < String > privateIps;

    @Query
    @NameInMap("PublicIps")
    private java.util.List < String > publicIps;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Tags")
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
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The number of maximum number of records to obtain at a time. Valid values: 1 to 100.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Marks the current position where reading starts. If you set this value to null, you can start from the beginning.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The IDs of node groups.
         */
        public Builder nodeGroupIds(java.util.List < String > nodeGroupIds) {
            this.putQueryParameter("NodeGroupIds", nodeGroupIds);
            this.nodeGroupIds = nodeGroupIds;
            return this;
        }

        /**
         * An array that consists of information about the ID of the node.
         */
        public Builder nodeIds(java.util.List < String > nodeIds) {
            this.putQueryParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * The names of the nodes.
         */
        public Builder nodeNames(java.util.List < String > nodeNames) {
            this.putQueryParameter("NodeNames", nodeNames);
            this.nodeNames = nodeNames;
            return this;
        }

        /**
         * The status of the node.
         */
        public Builder nodeStates(java.util.List < String > nodeStates) {
            this.putQueryParameter("NodeStates", nodeStates);
            this.nodeStates = nodeStates;
            return this;
        }

        /**
         * The private IP address.
         */
        public Builder privateIps(java.util.List < String > privateIps) {
            this.putQueryParameter("PrivateIps", privateIps);
            this.privateIps = privateIps;
            return this;
        }

        /**
         * The public IP address.
         */
        public Builder publicIps(java.util.List < String > publicIps) {
            this.putQueryParameter("PublicIps", publicIps);
            this.publicIps = publicIps;
            return this;
        }

        /**
         * The ID of the region in which you want to create the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The list of tags to be bound.
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
