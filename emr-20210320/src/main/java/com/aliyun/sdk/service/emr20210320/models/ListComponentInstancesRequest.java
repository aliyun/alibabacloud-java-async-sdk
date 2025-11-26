// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ListComponentInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListComponentInstancesRequest</p>
 */
public class ListComponentInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationNames")
    private java.util.List<String> applicationNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentNames")
    private java.util.List<String> componentNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentStates")
    private java.util.List<String> componentStates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeNames")
    private java.util.List<String> nodeNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

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
        this.zoneId = builder.zoneId;
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
    public java.util.List<String> getApplicationNames() {
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
    public java.util.List<String> getComponentNames() {
        return this.componentNames;
    }

    /**
     * @return componentStates
     */
    public java.util.List<String> getComponentStates() {
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
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return nodeNames
     */
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ListComponentInstancesRequest, Builder> {
        private java.util.List<String> applicationNames; 
        private String clusterId; 
        private java.util.List<String> componentNames; 
        private java.util.List<String> componentStates; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<String> nodeIds; 
        private java.util.List<String> nodeNames; 
        private String regionId; 
        private String zoneId; 

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
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The list of component names.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder applicationNames(java.util.List<String> applicationNames) {
            this.putQueryParameter("ApplicationNames", applicationNames);
            this.applicationNames = applicationNames;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C-8CFEBCCFFEF5****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The list of component names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;HDFS&quot;]</p>
         */
        public Builder componentNames(java.util.List<String> componentNames) {
            this.putQueryParameter("ComponentNames", componentNames);
            this.componentNames = componentNames;
            return this;
        }

        /**
         * <p>The list of component status.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder componentStates(java.util.List<String> componentStates) {
            this.putQueryParameter("ComponentStates", componentStates);
            this.componentStates = componentStates;
            return this;
        }

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If you leave this parameter empty, the query starts from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of instance IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nodeIds(java.util.List<String> nodeIds) {
            this.putQueryParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * <p>The instance IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder nodeNames(java.util.List<String> nodeNames) {
            this.putQueryParameter("NodeNames", nodeNames);
            this.nodeNames = nodeNames;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="url">ListRegions</a> view.</p>
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
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListComponentInstancesRequest build() {
            return new ListComponentInstancesRequest(this);
        } 

    } 

}
