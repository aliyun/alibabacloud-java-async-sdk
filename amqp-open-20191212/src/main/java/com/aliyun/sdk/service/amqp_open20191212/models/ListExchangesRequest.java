// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExchangesRequest} extends {@link RequestModel}
 *
 * <p>ListExchangesRequest</p>
 */
public class ListExchangesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MaxResults")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("VirtualHost")
    @Validation(required = true)
    private String virtualHost;

    private ListExchangesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.virtualHost = builder.virtualHost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExchangesRequest create() {
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return virtualHost
     */
    public String getVirtualHost() {
        return this.virtualHost;
    }

    public static final class Builder extends Request.Builder<ListExchangesRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String virtualHost; 

        private Builder() {
            super();
        } 

        private Builder(ListExchangesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.virtualHost = request.virtualHost;
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
         * InstanceId.
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * VirtualHost.
         */
        public Builder virtualHost(String virtualHost) {
            this.putQueryParameter("VirtualHost", virtualHost);
            this.virtualHost = virtualHost;
            return this;
        }

        @Override
        public ListExchangesRequest build() {
            return new ListExchangesRequest(this);
        } 

    } 

}
