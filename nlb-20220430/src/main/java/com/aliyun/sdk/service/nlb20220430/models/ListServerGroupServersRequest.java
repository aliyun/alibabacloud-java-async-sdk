// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
    private java.util.List<String> serverIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerIps")
    private java.util.List<String> serverIps;

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
    public java.util.List<String> getServerIds() {
        return this.serverIds;
    }

    /**
     * @return serverIps
     */
    public java.util.List<String> getServerIps() {
        return this.serverIps;
    }

    public static final class Builder extends Request.Builder<ListServerGroupServersRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String serverGroupId; 
        private java.util.List<String> serverIds; 
        private java.util.List<String> serverIps; 

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
         * <p>The number of entries to return in each call. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token used to specify a particular page of results. Valid values:</p>
         * <ul>
         * <li>Left this parameter empty if this is the first query or the only query.</li>
         * <li>Set this parameter to the value of NextToken obtained from the previous query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID of the NLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-atstuj3rtoptyui****</p>
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putBodyParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * <p>The IDs of the backend servers. You can specify up to 40 backend servers in each call.</p>
         */
        public Builder serverIds(java.util.List<String> serverIds) {
            this.putBodyParameter("ServerIds", serverIds);
            this.serverIds = serverIds;
            return this;
        }

        /**
         * <p>The IP addresses of the backend servers. You can specify up to 40 backend servers in each call.</p>
         */
        public Builder serverIps(java.util.List<String> serverIps) {
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
