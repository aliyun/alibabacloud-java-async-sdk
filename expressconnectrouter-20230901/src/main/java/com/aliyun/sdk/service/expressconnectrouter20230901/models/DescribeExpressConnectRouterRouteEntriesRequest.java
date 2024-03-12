// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressConnectRouterRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeExpressConnectRouterRouteEntriesRequest</p>
 */
public class DescribeExpressConnectRouterRouteEntriesRequest extends Request {
    @Body
    @NameInMap("AsPath")
    private String asPath;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("Community")
    private String community;

    @Body
    @NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("EcrId")
    @Validation(required = true)
    private String ecrId;

    @Body
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Body
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("NexthopInstanceId")
    private String nexthopInstanceId;

    @Body
    @NameInMap("QueryRegionId")
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
         * AsPath.
         */
        public Builder asPath(String asPath) {
            this.putBodyParameter("AsPath", asPath);
            this.asPath = asPath;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Community.
         */
        public Builder community(String community) {
            this.putBodyParameter("Community", community);
            this.community = community;
            return this;
        }

        /**
         * DestinationCidrBlock.
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putBodyParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EcrId.
         */
        public Builder ecrId(String ecrId) {
            this.putBodyParameter("EcrId", ecrId);
            this.ecrId = ecrId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * NexthopInstanceId.
         */
        public Builder nexthopInstanceId(String nexthopInstanceId) {
            this.putBodyParameter("NexthopInstanceId", nexthopInstanceId);
            this.nexthopInstanceId = nexthopInstanceId;
            return this;
        }

        /**
         * QueryRegionId.
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
