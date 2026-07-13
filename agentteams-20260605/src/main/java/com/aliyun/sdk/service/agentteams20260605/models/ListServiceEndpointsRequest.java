// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link ListServiceEndpointsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceEndpointsRequest</p>
 */
public class ListServiceEndpointsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Component")
    private String component;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainType")
    private String domainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Skip")
    private String skip;

    private ListServiceEndpointsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.component = builder.component;
        this.domainType = builder.domainType;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.networkType = builder.networkType;
        this.nextToken = builder.nextToken;
        this.resourceName = builder.resourceName;
        this.skip = builder.skip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceEndpointsRequest create() {
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
     * @return component
     */
    public String getComponent() {
        return this.component;
    }

    /**
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return skip
     */
    public String getSkip() {
        return this.skip;
    }

    public static final class Builder extends Request.Builder<ListServiceEndpointsRequest, Builder> {
        private String regionId; 
        private String component; 
        private String domainType; 
        private String instanceId; 
        private Integer maxResults; 
        private String networkType; 
        private String nextToken; 
        private String resourceName; 
        private String skip; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceEndpointsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.component = request.component;
            this.domainType = request.domainType;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.networkType = request.networkType;
            this.nextToken = request.nextToken;
            this.resourceName = request.resourceName;
            this.skip = request.skip;
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
         * Component.
         */
        public Builder component(String component) {
            this.putQueryParameter("Component", component);
            this.component = component;
            return this;
        }

        /**
         * DomainType.
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agentteams-cn-xxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * Skip.
         */
        public Builder skip(String skip) {
            this.putQueryParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        @Override
        public ListServiceEndpointsRequest build() {
            return new ListServiceEndpointsRequest(this);
        } 

    } 

}
