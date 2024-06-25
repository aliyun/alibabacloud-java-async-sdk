// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerGroupServersRequest} extends {@link RequestModel}
 *
 * <p>ListServerGroupServersRequest</p>
 */
public class ListServerGroupServersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerGroupId")
    private String serverGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerIds")
    private java.util.List < String > serverIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerIps")
    private java.util.List < String > serverIps;

    private ListServerGroupServersRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.serverGroupId = builder.serverGroupId;
        this.serverIds = builder.serverIds;
        this.serverIps = builder.serverIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerGroupServersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    /**
     * @return serverIds
     */
    public java.util.List < String > getServerIds() {
        return this.serverIds;
    }

    /**
     * @return serverIps
     */
    public java.util.List < String > getServerIps() {
        return this.serverIps;
    }

    public static final class Builder extends Request.Builder<ListServerGroupServersRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String serverGroupId; 
        private java.util.List < String > serverIds; 
        private java.util.List < String > serverIps; 

        private Builder() {
            super();
        } 

        private Builder(ListServerGroupServersRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.serverGroupId = request.serverGroupId;
            this.serverIds = request.serverIds;
            this.serverIps = request.serverIps;
        } 

        /**
         * The number of entries to return on each page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If this is your first query or no next query is to be sent, ignore this parameter.
         * *   If a next query is to be sent, set the parameter to the value of NextToken that is returned from the last call.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID of the NLB instance.
         * <p>
         * 
         * You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the server group.
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putBodyParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * The IDs of the servers.
         */
        public Builder serverIds(java.util.List < String > serverIds) {
            this.putBodyParameter("ServerIds", serverIds);
            this.serverIds = serverIds;
            return this;
        }

        /**
         * The IP addresses of the servers.
         */
        public Builder serverIps(java.util.List < String > serverIps) {
            this.putBodyParameter("ServerIps", serverIps);
            this.serverIps = serverIps;
            return this;
        }

        @Override
        public ListServerGroupServersRequest build() {
            return new ListServerGroupServersRequest(this);
        } 

    } 

}
