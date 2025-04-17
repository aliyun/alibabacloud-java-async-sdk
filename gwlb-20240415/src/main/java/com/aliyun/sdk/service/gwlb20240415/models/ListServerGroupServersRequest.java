// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415.models;

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
    @com.aliyun.core.annotation.NameInMap("ServerGroupId")
    private String serverGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerIds")
    private java.util.List<String> serverIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerIps")
    private java.util.List<String> serverIps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Skip")
    private Integer skip;

    private ListServerGroupServersRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.serverGroupId = builder.serverGroupId;
        this.serverIds = builder.serverIds;
        this.serverIps = builder.serverIps;
        this.skip = builder.skip;
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

    /**
     * @return skip
     */
    public Integer getSkip() {
        return this.skip;
    }

    public static final class Builder extends Request.Builder<ListServerGroupServersRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String serverGroupId; 
        private java.util.List<String> serverIds; 
        private java.util.List<String> serverIps; 
        private Integer skip; 

        private Builder() {
            super();
        } 

        private Builder(ListServerGroupServersRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.serverGroupId = request.serverGroupId;
            this.serverIds = request.serverIds;
            this.serverIps = request.serverIps;
            this.skip = request.skip;
        } 

        /**
         * <p>The number of entries per page.</p>
         * <p>Valid values: 1 to 1000.</p>
         * <p>Default value: 20.</p>
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
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
         * <p>The server group ID.</p>
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
         * <p>The server IDs.</p>
         * <p>You can specify at most 200 servers in each call.</p>
         */
        public Builder serverIds(java.util.List<String> serverIds) {
            this.putBodyParameter("ServerIds", serverIds);
            this.serverIds = serverIds;
            return this;
        }

        /**
         * <p>The server IP addresses.</p>
         * <p>You can specify at most 200 servers in each call.</p>
         */
        public Builder serverIps(java.util.List<String> serverIps) {
            this.putBodyParameter("ServerIps", serverIps);
            this.serverIps = serverIps;
            return this;
        }

        /**
         * <p>The number of entries to be skipped in the call.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder skip(Integer skip) {
            this.putBodyParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        @Override
        public ListServerGroupServersRequest build() {
            return new ListServerGroupServersRequest(this);
        } 

    } 

}
