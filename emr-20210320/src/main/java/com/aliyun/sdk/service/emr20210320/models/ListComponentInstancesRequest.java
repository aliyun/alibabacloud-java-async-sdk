// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListComponentInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListComponentInstancesRequest</p>
 */
public class ListComponentInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationNames")
    private java.util.List < String > applicationNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentNames")
    private java.util.List < String > componentNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentStates")
    private java.util.List < String > componentStates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List < String > nodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeNames")
    private java.util.List < String > nodeNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListComponentInstancesRequest(Builder builder) {
        super(builder);
        this.applicationNames = builder.applicationNames;
        this.clusterId = builder.clusterId;
        this.componentNames = builder.componentNames;
        this.componentStates = builder.componentStates;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeIds = builder.nodeIds;
        this.nodeNames = builder.nodeNames;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationNames
     */
    public java.util.List < String > getApplicationNames() {
        return this.applicationNames;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return componentNames
     */
    public java.util.List < String > getComponentNames() {
        return this.componentNames;
    }

    /**
     * @return componentStates
     */
    public java.util.List < String > getComponentStates() {
        return this.componentStates;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListComponentInstancesRequest, Builder> {
        private java.util.List < String > applicationNames; 
        private String clusterId; 
        private java.util.List < String > componentNames; 
        private java.util.List < String > componentStates; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > nodeIds; 
        private java.util.List < String > nodeNames; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListComponentInstancesRequest request) {
            super(request);
            this.applicationNames = request.applicationNames;
            this.clusterId = request.clusterId;
            this.componentNames = request.componentNames;
            this.componentStates = request.componentStates;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodeIds = request.nodeIds;
            this.nodeNames = request.nodeNames;
            this.regionId = request.regionId;
        } 

        /**
         * 应用名称列表。
         */
        public Builder applicationNames(java.util.List < String > applicationNames) {
            this.putQueryParameter("ApplicationNames", applicationNames);
            this.applicationNames = applicationNames;
            return this;
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
         * 组件名称列表。
         */
        public Builder componentNames(java.util.List < String > componentNames) {
            this.putQueryParameter("ComponentNames", componentNames);
            this.componentNames = componentNames;
            return this;
        }

        /**
         * ComponentStates.
         */
        public Builder componentStates(java.util.List < String > componentStates) {
            this.putQueryParameter("ComponentStates", componentStates);
            this.componentStates = componentStates;
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
         * 节点ID列表。
         */
        public Builder nodeIds(java.util.List < String > nodeIds) {
            this.putQueryParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * 节点名称列表。
         */
        public Builder nodeNames(java.util.List < String > nodeNames) {
            this.putQueryParameter("NodeNames", nodeNames);
            this.nodeNames = nodeNames;
            return this;
        }

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListComponentInstancesRequest build() {
            return new ListComponentInstancesRequest(this);
        } 

    } 

}
