// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

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
 * {@link DescribeExpressConnectRouterRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeExpressConnectRouterRouteEntriesRequest</p>
 */
public class DescribeExpressConnectRouterRouteEntriesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AsPath")
    private String asPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Community")
    private String community;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ecrId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NexthopInstanceId")
    private String nexthopInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryRegionId")
    private String queryRegionId;

    private DescribeExpressConnectRouterRouteEntriesRequest(Builder builder) {
        super(builder);
        this.asPath = builder.asPath;
        this.clientToken = builder.clientToken;
        this.community = builder.community;
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nexthopInstanceId = builder.nexthopInstanceId;
        this.queryRegionId = builder.queryRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressConnectRouterRouteEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asPath
     */
    public String getAsPath() {
        return this.asPath;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return community
     */
    public String getCommunity() {
        return this.community;
    }

    /**
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ecrId
     */
    public String getEcrId() {
        return this.ecrId;
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
     * @return nexthopInstanceId
     */
    public String getNexthopInstanceId() {
        return this.nexthopInstanceId;
    }

    /**
     * @return queryRegionId
     */
    public String getQueryRegionId() {
        return this.queryRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeExpressConnectRouterRouteEntriesRequest, Builder> {
        private String asPath; 
        private String clientToken; 
        private String community; 
        private String destinationCidrBlock; 
        private Boolean dryRun; 
        private String ecrId; 
        private Integer maxResults; 
        private String nextToken; 
        private String nexthopInstanceId; 
        private String queryRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExpressConnectRouterRouteEntriesRequest request) {
            super(request);
            this.asPath = request.asPath;
            this.clientToken = request.clientToken;
            this.community = request.community;
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nexthopInstanceId = request.nexthopInstanceId;
            this.queryRegionId = request.queryRegionId;
        } 

        /**
         * <p>The Autonomous System (AS) path of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>[64993,64512]</p>
         */
        public Builder asPath(String asPath) {
            this.putBodyParameter("AsPath", asPath);
            this.asPath = asPath;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-00****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The community value that is carried in the Border Gateway Protocol (BGP) route.</p>
         * 
         * <strong>example:</strong>
         * <p>9001:9263</p>
         */
        public Builder community(String community) {
            this.putBodyParameter("Community", community);
            this.community = community;
            return this;
        }

        /**
         * <p>The destination CIDR block of the route that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.47.0/24</p>
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putBodyParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ECR ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-mezk2idmsd0vx2****</p>
         */
        public Builder ecrId(String ecrId) {
            this.putBodyParameter("EcrId", ecrId);
            this.ecrId = ecrId;
            return this;
        }

        /**
         * <p>The maximum number of entries to read. Valid values: 1 to 2147483647. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>You do not need to specify this parameter for the first request.</li>
         * <li>You must specify the token that is obtained from the previous query as the value of NextToken.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FF9nMec/RZ6H9oqFn1pvyir/SLRlxCCyHJonbGzqL01hiM6Jb3wJowdHvjCfog7ww1b9rSHMRFJnrUBfVba68TJg==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the next-hop instance.</p>
         * 
         * <strong>example:</strong>
         * <p>br-hp3u4u5f03tfuljis****</p>
         */
        public Builder nexthopInstanceId(String nexthopInstanceId) {
            this.putBodyParameter("NexthopInstanceId", nexthopInstanceId);
            this.nexthopInstanceId = nexthopInstanceId;
            return this;
        }

        /**
         * <p>The region ID of the ECR.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder queryRegionId(String queryRegionId) {
            this.putBodyParameter("QueryRegionId", queryRegionId);
            this.queryRegionId = queryRegionId;
            return this;
        }

        @Override
        public DescribeExpressConnectRouterRouteEntriesRequest build() {
            return new DescribeExpressConnectRouterRouteEntriesRequest(this);
        } 

    } 

}
