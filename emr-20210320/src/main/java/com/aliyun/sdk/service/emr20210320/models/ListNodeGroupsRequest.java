// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListNodeGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListNodeGroupsRequest</p>
 */
public class ListNodeGroupsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("NodeGroupNames")
    private java.util.List < String > nodeGroupNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupStates")
    private java.util.List < String > nodeGroupStates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupTypes")
    private java.util.List < String > nodeGroupTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The cluster ID.</p>
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
         * <p>The IDs of node groups. Valid values of the number of array elements N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder nodeGroupIds(java.util.List < String > nodeGroupIds) {
            this.putQueryParameter("NodeGroupIds", nodeGroupIds);
            this.nodeGroupIds = nodeGroupIds;
            return this;
        }

        /**
         * <p>The list of node group names. Valid values of the number of array elements N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nodeGroupNames(java.util.List < String > nodeGroupNames) {
            this.putQueryParameter("NodeGroupNames", nodeGroupNames);
            this.nodeGroupNames = nodeGroupNames;
            return this;
        }

        /**
         * <p>The status of the node group. Valid values of the number of array elements N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;CORE&quot;]</p>
         */
        public Builder nodeGroupStates(java.util.List < String > nodeGroupStates) {
            this.putQueryParameter("NodeGroupStates", nodeGroupStates);
            this.nodeGroupStates = nodeGroupStates;
            return this;
        }

        /**
         * <p>The list of node group types. Valid values of the number of array elements N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder nodeGroupTypes(java.util.List < String > nodeGroupTypes) {
            this.putQueryParameter("NodeGroupTypes", nodeGroupTypes);
            this.nodeGroupTypes = nodeGroupTypes;
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

        @Override
        public ListNodeGroupsRequest build() {
            return new ListNodeGroupsRequest(this);
        } 

    } 

}
