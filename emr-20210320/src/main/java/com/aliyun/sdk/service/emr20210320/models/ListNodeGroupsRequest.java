// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodeGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListNodeGroupsRequest</p>
 */
public class ListNodeGroupsRequest extends Request {
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
    @NameInMap("NodeGroupNames")
    private java.util.List < String > nodeGroupNames;

    @Query
    @NameInMap("NodeGroupStates")
    private java.util.List < String > nodeGroupStates;

    @Query
    @NameInMap("NodeGroupTypes")
    private java.util.List < String > nodeGroupTypes;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListNodeGroupsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeGroupIds = builder.nodeGroupIds;
        this.nodeGroupNames = builder.nodeGroupNames;
        this.nodeGroupStates = builder.nodeGroupStates;
        this.nodeGroupTypes = builder.nodeGroupTypes;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeGroupsRequest create() {
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
     * @return nodeGroupNames
     */
    public java.util.List < String > getNodeGroupNames() {
        return this.nodeGroupNames;
    }

    /**
     * @return nodeGroupStates
     */
    public java.util.List < String > getNodeGroupStates() {
        return this.nodeGroupStates;
    }

    /**
     * @return nodeGroupTypes
     */
    public java.util.List < String > getNodeGroupTypes() {
        return this.nodeGroupTypes;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListNodeGroupsRequest, Builder> {
        private String clusterId; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > nodeGroupIds; 
        private java.util.List < String > nodeGroupNames; 
        private java.util.List < String > nodeGroupStates; 
        private java.util.List < String > nodeGroupTypes; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListNodeGroupsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodeGroupIds = request.nodeGroupIds;
            this.nodeGroupNames = request.nodeGroupNames;
            this.nodeGroupStates = request.nodeGroupStates;
            this.nodeGroupTypes = request.nodeGroupTypes;
            this.regionId = request.regionId;
        } 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 一次获取的最大记录数。取值范围：1~100。
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 标记当前开始读取的位置，置空表示从头开始。
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 节点组ID列表。
         */
        public Builder nodeGroupIds(java.util.List < String > nodeGroupIds) {
            this.putQueryParameter("NodeGroupIds", nodeGroupIds);
            this.nodeGroupIds = nodeGroupIds;
            return this;
        }

        /**
         * 节点组名称列表。
         */
        public Builder nodeGroupNames(java.util.List < String > nodeGroupNames) {
            this.putQueryParameter("NodeGroupNames", nodeGroupNames);
            this.nodeGroupNames = nodeGroupNames;
            return this;
        }

        /**
         * 节点组状态。
         */
        public Builder nodeGroupStates(java.util.List < String > nodeGroupStates) {
            this.putQueryParameter("NodeGroupStates", nodeGroupStates);
            this.nodeGroupStates = nodeGroupStates;
            return this;
        }

        /**
         * 节点组类型列表。
         */
        public Builder nodeGroupTypes(java.util.List < String > nodeGroupTypes) {
            this.putQueryParameter("NodeGroupTypes", nodeGroupTypes);
            this.nodeGroupTypes = nodeGroupTypes;
            return this;
        }

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListNodeGroupsRequest build() {
            return new ListNodeGroupsRequest(this);
        } 

    } 

}
